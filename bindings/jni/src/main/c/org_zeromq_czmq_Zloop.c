/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/
#include <stdio.h>
#include <stdlib.h>
#include <jni.h>
#include "czmq.h"
#include "../../native/include/org_zeromq_czmq_Zloop.h"

JNIEXPORT jlong JNICALL
Java_zloop__1_1new (JNIEnv *env, jclass c)
{
    jlong new_ = (jlong) zloop_new ();
    return new_;
}

JNIEXPORT void JNICALL
Java_zloop__1_1destroy (JNIEnv *env, jclass c, jlong self_p)
{
    zloop_destroy ((zloop_t **) &self_p);
}

JNIEXPORT void JNICALL
Java_zloop__1_1reader_end (JNIEnv *env, jclass c, jlong self, jlong sock)
{
    zloop_reader_end ((zloop_t *) self, (zsock_t *) sock);
}

JNIEXPORT void JNICALL
Java_zloop__1_1reader_set_tolerant (JNIEnv *env, jclass c, jlong self, jlong sock)
{
    zloop_reader_set_tolerant ((zloop_t *) self, (zsock_t *) sock);
}

JNIEXPORT jint JNICALL
Java_zloop__1_1timer_end (JNIEnv *env, jclass c, jlong self, jint timer_id)
{
    jint timer_end_ = (jint) zloop_timer_end ((zloop_t *) self, (int) timer_id);
    return timer_end_;
}

JNIEXPORT void JNICALL
Java_zloop__1_1ticket_reset (JNIEnv *env, jclass c, jlong self, jlong handle)
{
    zloop_ticket_reset ((zloop_t *) self, (void *) handle);
}

JNIEXPORT void JNICALL
Java_zloop__1_1ticket_delete (JNIEnv *env, jclass c, jlong self, jlong handle)
{
    zloop_ticket_delete ((zloop_t *) self, (void *) handle);
}

JNIEXPORT void JNICALL
Java_zloop__1_1set_ticket_delay (JNIEnv *env, jclass c, jlong self, jlong ticket_delay)
{
    zloop_set_ticket_delay ((zloop_t *) self, (size_t) ticket_delay);
}

JNIEXPORT void JNICALL
Java_zloop__1_1set_max_timers (JNIEnv *env, jclass c, jlong self, jlong max_timers)
{
    zloop_set_max_timers ((zloop_t *) self, (size_t) max_timers);
}

JNIEXPORT void JNICALL
Java_zloop__1_1set_verbose (JNIEnv *env, jclass c, jlong self, jboolean verbose)
{
    zloop_set_verbose ((zloop_t *) self, (bool) verbose);
}

JNIEXPORT jint JNICALL
Java_zloop__1_1start (JNIEnv *env, jclass c, jlong self)
{
    jint start_ = (jint) zloop_start ((zloop_t *) self);
    return start_;
}

JNIEXPORT void JNICALL
Java_zloop__1_1ignore_interrupts (JNIEnv *env, jclass c, jlong self)
{
    zloop_ignore_interrupts ((zloop_t *) self);
}

JNIEXPORT void JNICALL
Java_zloop__1_1test (JNIEnv *env, jclass c, jboolean verbose)
{
    zloop_test ((bool) verbose);
}

