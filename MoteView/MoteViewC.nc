#include <Timer.h>
#include "MoteView.h"

module MoteViewC {
	uses{
		interface Boot;
		interface SplitControl as AMControl;
		interface Timer<TMilli> as Timer;
		interface Packet;
		interface AMPacket;
		interface AMSend;
		interface Read<uint16_t> as LightRead;
		interface Read<uint16_t> as TempRead;
		interface Read<uint16_t> as HumidRead;
		interface Read<uint16_t> as VoltRead;
	}
}

implementation {
	bool busy = FALSE;
	message_t pkt;
	uint16_t counter = 0;
	uint16_t light = 0;
	uint16_t temp = 0;
	uint16_t humid = 0;
	uint16_t volt = 0;

	event void Boot.booted() {
		call AMControl.start();	
	}

	event void AMControl.startDone(error_t result) {
		if(result == SUCCESS) {
			call Timer.startPeriodic(FREQUENCY);		
		}
		else {
			call AMControl.start();
		}
	}

	event void AMControl.stopDone(error_t result) {}

	
	event void Timer.fired() {
		counter++;
		call LightRead.read();	
	}

	event void LightRead.readDone(error_t result, uint16_t data) {
		light = data;
		call TempRead.read();
	}

	event void TempRead.readDone(error_t result, uint16_t data) {
		temp = data;
		call HumidRead.read();
	}

	event void HumidRead.readDone(error_t result, uint16_t data) {
		humid = data;
		call VoltRead.read();
	}

	event void VoltRead.readDone(error_t result, uint16_t data) {
		volt = data;

		if (!busy) {
			MoteViewMsg* mv_pkt = (MoteViewMsg*) (call Packet.getPayload(&pkt, sizeof(MoteViewMsg)));
			mv_pkt->nodeid = TOS_NODE_ID;
			mv_pkt->counter = counter;
			mv_pkt->light = light;
			mv_pkt->temp = temp;
			mv_pkt->humid = humid;
			mv_pkt->volt = volt;

			if (call AMSend.send(AM_BROADCAST_ADDR, &pkt,
		   	   sizeof(MoteViewMsg)) == SUCCESS) {
				busy = TRUE;
			}
		}
	}

	event void AMSend.sendDone(message_t* msg, error_t result) {
		if(&pkt == msg)
			busy = FALSE;
	}
}
