#ifndef MOTEVIEW_H
#define MOTEVIEW_H
enum {
	AM_MOTEVIEWMSG = 6,
	FREQUENCY = 1000
};

typedef nx_struct MoteViewMsg {
	nx_uint16_t nodeid;
	nx_uint16_t counter;
	nx_uint16_t light;
	nx_uint16_t temp;
	nx_uint16_t humid;
	nx_uint16_t volt;
} MoteViewMsg;
#endif
