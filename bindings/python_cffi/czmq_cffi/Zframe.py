################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Read the zproject/README.md for information about making permanent changes. #
################################################################################
from . import utils
from . import destructors
libczmq_destructors = destructors.lib

class Zframe(object):
    """
    working with single message frames
    """

    def __init__(self, data, size):
        """
        Create a new frame. If size is not null, allocates the frame data
        to the specified size. If additionally, data is not null, copies
        size octets from the specified data into the frame body.
        """
        p = utils.lib.zframe_new(data, size)
        if p == utils.ffi.NULL:
            raise MemoryError("Could not allocate person")

        # ffi.gc returns a copy of the cdata object which will have the
        # destructor called when the Python object is GC'd:
        # https://cffi.readthedocs.org/en/latest/using.html#ffi-interface
        self._p = utils.ffi.gc(p, libczmq_destructors.zframe_destroy_py)

    @staticmethod
    def new_empty():
        """
        Create an empty (zero-sized) frame
        """
        return utils.lib.zframe_new_empty()

    @staticmethod
    def from_py(string):
        """
        Create a frame with a specified string content.
        """
        return utils.lib.zframe_from(utils.to_bytes(string))

    @staticmethod
    def frommem(data, size, destructor, hint):
        """
        Create a new frame from memory. Take ownership of the memory and calling the destructor
        on destroy.
        """
        return utils.lib.zframe_frommem(data, size, destructor, hint._p)

    @staticmethod
    def recv(source):
        """
        Receive frame from socket, returns zframe_t object or NULL if the recv
        was interrupted. Does a blocking recv, if you want to not block then use
        zpoller or zloop.
        """
        return utils.lib.zframe_recv(source._p)

    @staticmethod
    def send(self_p, dest, flags):
        """
        Send a frame to a socket, destroy frame after sending.
        Return -1 on error, 0 on success.
        """
        return utils.lib.zframe_send(utils.ffi.new("zframe_t **", self_p._p), dest._p, flags)

    def size(self):
        """
        Return number of bytes in frame data
        """
        return utils.lib.zframe_size(self._p)

    def data(self):
        """
        Return address of frame data
        """
        return utils.lib.zframe_data(self._p)

    def meta(self, property):
        """
        Return meta data property for frame
        The caller shall not modify or free the returned value, which shall be
        owned by the message.
        """
        return utils.lib.zframe_meta(self._p, utils.to_bytes(property))

    def dup(self):
        """
        Create a new frame that duplicates an existing frame. If frame is null,
        or memory was exhausted, returns null.
        """
        return utils.lib.zframe_dup(self._p)

    def strhex(self):
        """
        Return frame data encoded as printable hex string, useful for 0MQ UUIDs.
        Caller must free string when finished with it.
        """
        return utils.lib.zframe_strhex(self._p)

    def strdup(self):
        """
        Return frame data copied into freshly allocated string
        Caller must free string when finished with it.
        """
        return utils.lib.zframe_strdup(self._p)

    def streq(self, string):
        """
        Return TRUE if frame body is equal to string, excluding terminator
        """
        return utils.lib.zframe_streq(self._p, utils.to_bytes(string))

    def more(self):
        """
        Return frame MORE indicator (1 or 0), set when reading frame from socket
        or by the zframe_set_more() method
        """
        return utils.lib.zframe_more(self._p)

    def set_more(self, more):
        """
        Set frame MORE indicator (1 or 0). Note this is NOT used when sending
        frame to socket, you have to specify flag explicitly.
        """
        utils.lib.zframe_set_more(self._p, more)

    def routing_id(self):
        """
        Return frame routing ID, if the frame came from a ZMQ_SERVER socket.
        Else returns zero.
        """
        return utils.lib.zframe_routing_id(self._p)

    def set_routing_id(self, routing_id):
        """
        Set routing ID on frame. This is used if/when the frame is sent to a
        ZMQ_SERVER socket.
        """
        utils.lib.zframe_set_routing_id(self._p, routing_id)

    def group(self):
        """
        Return frame group of radio-dish pattern.
        """
        return utils.lib.zframe_group(self._p)

    def set_group(self, group):
        """
        Set group on frame. This is used if/when the frame is sent to a
        ZMQ_RADIO socket.
        Return -1 on error, 0 on success.
        """
        return utils.lib.zframe_set_group(self._p, utils.to_bytes(group))

    def eq(self, other):
        """
        Return TRUE if two frames have identical size and data
        If either frame is NULL, equality is always false.
        """
        return utils.lib.zframe_eq(self._p, other._p)

    def reset(self, data, size):
        """
        Set new contents for frame
        """
        utils.lib.zframe_reset(self._p, data, size)

    def print_py(self, prefix):
        """
        Send message to zsys log sink (may be stdout, or system facility as
        configured by zsys_set_logstream). Prefix shows before frame, if not null.
        """
        utils.lib.zframe_print(self._p, utils.to_bytes(prefix))

    @staticmethod
    def is_py(self):
        """
        Probe the supplied object, and report if it looks like a zframe_t.
        """
        return utils.lib.zframe_is(self._p)

    @staticmethod
    def test(verbose):
        """
        Self test of this class.
        """
        utils.lib.zframe_test(verbose)

################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Read the zproject/README.md for information about making permanent changes. #
################################################################################
