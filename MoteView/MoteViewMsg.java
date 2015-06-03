/**
 * This class is automatically generated by mig. DO NOT EDIT THIS FILE.
 * This class implements a Java interface to the 'MoteViewMsg'
 * message type.
 */

public class MoteViewMsg extends net.tinyos.message.Message {

    /** The default size of this message type in bytes. */
    public static final int DEFAULT_MESSAGE_SIZE = 12;

    /** The Active Message type associated with this message. */
    public static final int AM_TYPE = 6;

    /** Create a new MoteViewMsg of size 12. */
    public MoteViewMsg() {
        super(DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /** Create a new MoteViewMsg of the given data_length. */
    public MoteViewMsg(int data_length) {
        super(data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MoteViewMsg with the given data_length
     * and base offset.
     */
    public MoteViewMsg(int data_length, int base_offset) {
        super(data_length, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MoteViewMsg using the given byte array
     * as backing store.
     */
    public MoteViewMsg(byte[] data) {
        super(data);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MoteViewMsg using the given byte array
     * as backing store, with the given base offset.
     */
    public MoteViewMsg(byte[] data, int base_offset) {
        super(data, base_offset);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MoteViewMsg using the given byte array
     * as backing store, with the given base offset and data length.
     */
    public MoteViewMsg(byte[] data, int base_offset, int data_length) {
        super(data, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MoteViewMsg embedded in the given message
     * at the given base offset.
     */
    public MoteViewMsg(net.tinyos.message.Message msg, int base_offset) {
        super(msg, base_offset, DEFAULT_MESSAGE_SIZE);
        amTypeSet(AM_TYPE);
    }

    /**
     * Create a new MoteViewMsg embedded in the given message
     * at the given base offset and length.
     */
    public MoteViewMsg(net.tinyos.message.Message msg, int base_offset, int data_length) {
        super(msg, base_offset, data_length);
        amTypeSet(AM_TYPE);
    }

    /**
    /* Return a String representation of this message. Includes the
     * message type name and the non-indexed field values.
     */
    public String toString() {
      String s = "Message <MoteViewMsg> \n";
      try {
        s += "  [nodeid=0x"+Long.toHexString(get_nodeid())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [counter=0x"+Long.toHexString(get_counter())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [light=0x"+Long.toHexString(get_light())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [temp=0x"+Long.toHexString(get_temp())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [humid=0x"+Long.toHexString(get_humid())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      try {
        s += "  [volt=0x"+Long.toHexString(get_volt())+"]\n";
      } catch (ArrayIndexOutOfBoundsException aioobe) { /* Skip field */ }
      return s;
    }

    // Message-type-specific access methods appear below.

    /////////////////////////////////////////////////////////
    // Accessor methods for field: nodeid
    //   Field type: int, unsigned
    //   Offset (bits): 0
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'nodeid' is signed (false).
     */
    public static boolean isSigned_nodeid() {
        return false;
    }

    /**
     * Return whether the field 'nodeid' is an array (false).
     */
    public static boolean isArray_nodeid() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'nodeid'
     */
    public static int offset_nodeid() {
        return (0 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'nodeid'
     */
    public static int offsetBits_nodeid() {
        return 0;
    }

    /**
     * Return the value (as a int) of the field 'nodeid'
     */
    public int get_nodeid() {
        return (int)getUIntBEElement(offsetBits_nodeid(), 16);
    }

    /**
     * Set the value of the field 'nodeid'
     */
    public void set_nodeid(int value) {
        setUIntBEElement(offsetBits_nodeid(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'nodeid'
     */
    public static int size_nodeid() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'nodeid'
     */
    public static int sizeBits_nodeid() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: counter
    //   Field type: int, unsigned
    //   Offset (bits): 16
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'counter' is signed (false).
     */
    public static boolean isSigned_counter() {
        return false;
    }

    /**
     * Return whether the field 'counter' is an array (false).
     */
    public static boolean isArray_counter() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'counter'
     */
    public static int offset_counter() {
        return (16 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'counter'
     */
    public static int offsetBits_counter() {
        return 16;
    }

    /**
     * Return the value (as a int) of the field 'counter'
     */
    public int get_counter() {
        return (int)getUIntBEElement(offsetBits_counter(), 16);
    }

    /**
     * Set the value of the field 'counter'
     */
    public void set_counter(int value) {
        setUIntBEElement(offsetBits_counter(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'counter'
     */
    public static int size_counter() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'counter'
     */
    public static int sizeBits_counter() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: light
    //   Field type: int, unsigned
    //   Offset (bits): 32
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'light' is signed (false).
     */
    public static boolean isSigned_light() {
        return false;
    }

    /**
     * Return whether the field 'light' is an array (false).
     */
    public static boolean isArray_light() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'light'
     */
    public static int offset_light() {
        return (32 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'light'
     */
    public static int offsetBits_light() {
        return 32;
    }

    /**
     * Return the value (as a int) of the field 'light'
     */
    public int get_light() {
        return (int)getUIntBEElement(offsetBits_light(), 16);
    }

    /**
     * Set the value of the field 'light'
     */
    public void set_light(int value) {
        setUIntBEElement(offsetBits_light(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'light'
     */
    public static int size_light() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'light'
     */
    public static int sizeBits_light() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: temp
    //   Field type: int, unsigned
    //   Offset (bits): 48
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'temp' is signed (false).
     */
    public static boolean isSigned_temp() {
        return false;
    }

    /**
     * Return whether the field 'temp' is an array (false).
     */
    public static boolean isArray_temp() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'temp'
     */
    public static int offset_temp() {
        return (48 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'temp'
     */
    public static int offsetBits_temp() {
        return 48;
    }

    /**
     * Return the value (as a int) of the field 'temp'
     */
    public int get_temp() {
        return (int)getUIntBEElement(offsetBits_temp(), 16);
    }

    /**
     * Set the value of the field 'temp'
     */
    public void set_temp(int value) {
        setUIntBEElement(offsetBits_temp(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'temp'
     */
    public static int size_temp() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'temp'
     */
    public static int sizeBits_temp() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: humid
    //   Field type: int, unsigned
    //   Offset (bits): 64
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'humid' is signed (false).
     */
    public static boolean isSigned_humid() {
        return false;
    }

    /**
     * Return whether the field 'humid' is an array (false).
     */
    public static boolean isArray_humid() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'humid'
     */
    public static int offset_humid() {
        return (64 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'humid'
     */
    public static int offsetBits_humid() {
        return 64;
    }

    /**
     * Return the value (as a int) of the field 'humid'
     */
    public int get_humid() {
        return (int)getUIntBEElement(offsetBits_humid(), 16);
    }

    /**
     * Set the value of the field 'humid'
     */
    public void set_humid(int value) {
        setUIntBEElement(offsetBits_humid(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'humid'
     */
    public static int size_humid() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'humid'
     */
    public static int sizeBits_humid() {
        return 16;
    }

    /////////////////////////////////////////////////////////
    // Accessor methods for field: volt
    //   Field type: int, unsigned
    //   Offset (bits): 80
    //   Size (bits): 16
    /////////////////////////////////////////////////////////

    /**
     * Return whether the field 'volt' is signed (false).
     */
    public static boolean isSigned_volt() {
        return false;
    }

    /**
     * Return whether the field 'volt' is an array (false).
     */
    public static boolean isArray_volt() {
        return false;
    }

    /**
     * Return the offset (in bytes) of the field 'volt'
     */
    public static int offset_volt() {
        return (80 / 8);
    }

    /**
     * Return the offset (in bits) of the field 'volt'
     */
    public static int offsetBits_volt() {
        return 80;
    }

    /**
     * Return the value (as a int) of the field 'volt'
     */
    public int get_volt() {
        return (int)getUIntBEElement(offsetBits_volt(), 16);
    }

    /**
     * Set the value of the field 'volt'
     */
    public void set_volt(int value) {
        setUIntBEElement(offsetBits_volt(), 16, value);
    }

    /**
     * Return the size, in bytes, of the field 'volt'
     */
    public static int size_volt() {
        return (16 / 8);
    }

    /**
     * Return the size, in bits, of the field 'volt'
     */
    public static int sizeBits_volt() {
        return 16;
    }

}
