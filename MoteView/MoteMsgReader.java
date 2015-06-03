import java.util.*;
import java.text.*;

import java.awt.*;
import javax.swing.*;

import net.tinyos.message.*;
import net.tinyos.packet.*;
import net.tinyos.util.*;


public class MoteMsgReader implements net.tinyos.message.MessageListener {

	private MoteIF moteIF;
	private static JLabel Data1;
	private static JLabel Data2;
	private static JLabel Data3;
	private static JLabel Data4;
	private static JLabel Data5;
	private static JLabel Data6;
  
  	public MoteMsgReader(String source) throws Exception {
    		if (source != null) {
      			moteIF = new MoteIF(BuildSource.makePhoenix(source, PrintStreamMessenger.err));
    		}
    		else {
      			moteIF = new MoteIF(BuildSource.makePhoenix(PrintStreamMessenger.err));
    		}
  	}

	public void start() {}

	public void messageReceived(int to, Message message) {
		MoteViewMsg msg = new MoteViewMsg(message,0);

		DecimalFormat form = new DecimalFormat("#.00");

		double temp = 0.0098*msg.get_temp() - 38.4; //temp in C
		double light0 = (msg.get_light()/4096.0 * 1.5)/100000.0; //voltage of light
		double light = 0.625 * 1000000 * 1000 * light0;	//light intensity in lx
		double humidity = 0.0405*msg.get_humid() - 4 + (-2.8 * Math.pow(10,-6))*(Math.pow(msg.get_humid(),2)); //humidy
		double humidity_percentage = (temp - 25) * (0.01 + 0.00008*msg.get_humid()) + humidity; //humidity percentage
		double volt = msg.get_volt()/4096.0 * 1.5 * 2; //voltage in Vcc

		Data1.setText("" + msg.get_nodeid());
		Data2.setText("" + msg.get_counter());
		Data3.setText("" + form.format(temp) + "\u00b0C");
		Data4.setText("" + form.format(light) + " lx");
		Data5.setText("" + form.format(humidity_percentage) + "%");
		Data6.setText("" + form.format(volt) + " Vcc");
	}

  
  	private static void usage() {
    		System.err.println("usage: MoteMsgReader [-comm <source>] message-class [message-class ...]");
  	}

  	private void addMsgType(Message msg) {
    		moteIF.registerListener(msg, this);
  	}

	public static void main(String[] args) throws Exception {
		GUI app = new GUI();
		app.setVisible(true);

	    	String source = null;
	    	Vector v = new Vector();
	    if (args.length > 0) {
	      for (int i = 0; i < args.length; i++) {
		if (args[i].equals("-comm")) {
		  source = args[++i];
		}
		else {
		  String className = args[i];
		  try {
		    Class c = Class.forName(className);
		    Object packet = c.newInstance();
		    Message msg = (Message)packet;
		    if (msg.amType() < 0) {
			System.err.println(className + " does not have an AM type - ignored");
		    }
		    else {
			v.addElement(msg);
		    }
		  }
		  catch (Exception e) {
		    System.err.println(e);
		  }
		}
	      }
	    }
	    else if (args.length != 0) {
	      usage();
	      System.exit(1);
	    }

	    MoteMsgReader mr = new MoteMsgReader(source);
	    Enumeration msgs = v.elements();
	    while (msgs.hasMoreElements()) {
	      Message m = (Message)msgs.nextElement();
	      mr.addMsgType(m);
	    }
	    mr.start();
	}

	public static class GUI extends JFrame {
		public GUI() {
			super("Message Reader");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(new Dimension(300, 300));
			setResizable(false);
			setLayout(new GridLayout (6, 2));

			JLabel title1 = new JLabel("Node ID: ");
			JLabel title2 = new JLabel("Packet Number: ");
			JLabel title4 = new JLabel("Light Intensity: ");
			JLabel title3 = new JLabel("Temperature: ");
			JLabel title5 = new JLabel("Humidity: ");
			JLabel title6 = new JLabel("Internal Voltage: ");

			Data1 = new JLabel("00000000");
			Data2 = new JLabel("00000000");
			Data3 = new JLabel("00000000");
			Data4 = new JLabel("00000000");
			Data5 = new JLabel("00000000");
			Data6 = new JLabel("00000000");

			add(title1);
			add(Data1);
			add(title2);
			add(Data2);
			add(title3);
			add(Data3);
			add(title4);
			add(Data4);
			add(title5);
			add(Data5);
			add(title6);
			add(Data6);



		}		
	}

}
