/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/
package org.zeromq.czmq;

public class Zuuid implements AutoCloseable {
    static {
        try {
            System.loadLibrary ("czmqjni");
        }
        catch (Exception e) {
            System.exit (-1);
        }
    }
    long self;

    /*
    Create a new UUID object.
    */
    native static long __init ();
    public Zuuid () {
        /*  TODO: if __init fails, self is null...  */
        self = __init ();
    }
    /*
    Destroy a specified UUID object.
    */
    native static void __destroy (long self);
    @Override
    public void close() {
        __destroy (self);
        self = 0;
    }
    /*
    Create UUID object from supplied ZUUID_LEN-octet value.
    */
    native static Zuuid __new_from (byte [] source);
    public Zuuid new_from (byte [] source) {
        return Zuuid.__new_from (source);
    }
    /*
    Set UUID to new supplied ZUUID_LEN-octet value.
    */
    native static void __set (long self, byte [] source);
    public void set (long self, byte [] source) {
        return Zuuid.__set (self, source);
    }
    /*
    Set UUID to new supplied string value skipping '-' and '{' '}'
    optional delimiters. Return 0 if OK, else returns -1.         
    */
    native static int __set_str (long self, String source);
    public int set_str (long self, String source) {
        return Zuuid.__set_str (self, source);
    }
    /*
    Return UUID binary data.
    */
    native static byte [] __data (long self);
    public byte [] data (long self) {
        return Zuuid.__data (self);
    }
    /*
    Return UUID binary size
    */
    native static long __size (long self);
    public long size (long self) {
        return Zuuid.__size (self);
    }
    /*
    Returns UUID as string
    */
    native static String __str (long self);
    public String str (long self) {
        return Zuuid.__str (self);
    }
    /*
    Return UUID in the canonical string format: 8-4-4-4-12, in lower
    case. Caller does not modify or free returned value. See        
    http://en.wikipedia.org/wiki/Universally_unique_identifier      
    */
    native static String __str_canonical (long self);
    public String str_canonical (long self) {
        return Zuuid.__str_canonical (self);
    }
    /*
    Store UUID blob in target array
    */
    native static void __export (long self, byte [] target);
    public void export (long self, byte [] target) {
        return Zuuid.__export (self, target);
    }
    /*
    Check if UUID is same as supplied value
    */
    native static boolean __eq (long self, byte [] compare);
    public boolean eq (long self, byte [] compare) {
        return Zuuid.__eq (self, compare);
    }
    /*
    Check if UUID is different from supplied value
    */
    native static boolean __neq (long self, byte [] compare);
    public boolean neq (long self, byte [] compare) {
        return Zuuid.__neq (self, compare);
    }
    /*
    Make copy of UUID object; if uuid is null, or memory was exhausted,
    returns null.                                                      
    */
    native static Zuuid __dup (long self);
    public Zuuid dup (long self) {
        return Zuuid.__dup (self);
    }
    /*
    Self test of this class.
    */
    native static void __test (boolean verbose);
    public void test (boolean verbose) {
        return Zuuid.__test (verbose);
    }
}
