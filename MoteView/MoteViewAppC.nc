#include <Timer.h>
#include "MoteView.h"

configuration MoteViewAppC {
}

implementation {
	components MainC, 
		MoteViewC as App,
		new TimerMilliC() as Timer,
		ActiveMessageC,
		new AMSenderC(AM_MOTEVIEWMSG),
		new HamamatsuS10871TsrC() as LightSensor,
		new SensirionSht11C() as TempHumSensor,
		new VoltageC() as VoltageSensor;

	App.Boot -> MainC;
	App.Timer -> Timer;
	App.Packet -> AMSenderC;
	App.AMPacket -> AMSenderC;
	App.AMSend -> AMSenderC;
	App.AMControl -> ActiveMessageC;
	App.LightRead -> LightSensor;
	App.TempRead -> TempHumSensor.Temperature;
	App.HumidRead -> TempHumSensor.Humidity;
	App.VoltRead -> VoltageSensor;
}
