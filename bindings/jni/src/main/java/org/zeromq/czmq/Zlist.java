/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/
package org.zeromq.czmq;

public class Zlist implements AutoCloseable {
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
    Create a new list container
    */
    native static long __init ();
    public Zlist () {
        /*  TODO: if __init fails, self is null...  */
        self = __init ();
    }
    /*
    Destroy a list container
    */
    native static void __destroy (long self);
    @Override
    public void close() {
        __destroy (self);
        self = 0;
    }
    /*
    Return the item at the head of list. If the list is empty, returns NULL.
    Leaves cursor pointing at the head item, or NULL if the list is empty.  
    */
    native static void * __first (long self);
    public void * first (long self) {
        return Zlist.__first (self);
    }
    /*
    Return the next item. If the list is empty, returns NULL. To move to
    the start of the list call zlist_first (). Advances the cursor.     
    */
    native static void * __next (long self);
    public void * next (long self) {
        return Zlist.__next (self);
    }
    /*
    Return the item at the tail of list. If the list is empty, returns NULL.
    Leaves cursor pointing at the tail item, or NULL if the list is empty.  
    */
    native static void * __last (long self);
    public void * last (long self) {
        return Zlist.__last (self);
    }
    /*
    Return first item in the list, or null, leaves the cursor
    */
    native static void * __head (long self);
    public void * head (long self) {
        return Zlist.__head (self);
    }
    /*
    Return last item in the list, or null, leaves the cursor
    */
    native static void * __tail (long self);
    public void * tail (long self) {
        return Zlist.__tail (self);
    }
    /*
    Return the current item of list. If the list is empty, returns NULL.     
    Leaves cursor pointing at the current item, or NULL if the list is empty.
    */
    native static void * __item (long self);
    public void * item (long self) {
        return Zlist.__item (self);
    }
    /*
    Append an item to the end of the list, return 0 if OK or -1 if this  
    failed for some reason (out of memory). Note that if a duplicator has
    been set, this method will also duplicate the item.                  
    */
    native static int __append (long self, void * item);
    public int append (long self, void * item) {
        return Zlist.__append (self, item);
    }
    /*
    Push an item to the start of the list, return 0 if OK or -1 if this  
    failed for some reason (out of memory). Note that if a duplicator has
    been set, this method will also duplicate the item.                  
    */
    native static int __push (long self, void * item);
    public int push (long self, void * item) {
        return Zlist.__push (self, item);
    }
    /*
    Pop the item off the start of the list, if any
    */
    native static void * __pop (long self);
    public void * pop (long self) {
        return Zlist.__pop (self);
    }
    /*
    Checks if an item already is present. Uses compare method to determine if 
    items are equal. If the compare method is NULL the check will only compare
    pointers. Returns true if item is present else false.                     
    */
    native static boolean __exists (long self, void * item);
    public boolean exists (long self, void * item) {
        return Zlist.__exists (self, item);
    }
    /*
    Remove the specified item from the list if present
    */
    native static void __remove (long self, void * item);
    public void remove (long self, void * item) {
        return Zlist.__remove (self, item);
    }
    /*
    Make a copy of list. If the list has autofree set, the copied list will  
    duplicate all items, which must be strings. Otherwise, the list will hold
    pointers back to the items in the original list. If list is null, returns
    NULL.                                                                    
    */
    native static Zlist __dup (long self);
    public Zlist dup (long self) {
        return Zlist.__dup (self);
    }
    /*
    Purge all items from list
    */
    native static void __purge (long self);
    public void purge (long self) {
        return Zlist.__purge (self);
    }
    /*
    Return number of items in the list
    */
    native static long __size (long self);
    public long size (long self) {
        return Zlist.__size (self);
    }
    /*
    Set list for automatic item destruction; item values MUST be strings. 
    By default a list item refers to a value held elsewhere. When you set 
    this, each time you append or push a list item, zlist will take a copy
    of the string value. Then, when you destroy the list, it will free all
    item values automatically. If you use any other technique to allocate 
    list values, you must free them explicitly before destroying the list.
    The usual technique is to pop list items and destroy them, until the  
    list is empty.                                                        
    */
    native static void __autofree (long self);
    public void autofree (long self) {
        return Zlist.__autofree (self);
    }
    /*
    Self test of this class.
    */
    native static void __test (boolean verbose);
    public void test (boolean verbose) {
        return Zlist.__test (verbose);
    }
}
