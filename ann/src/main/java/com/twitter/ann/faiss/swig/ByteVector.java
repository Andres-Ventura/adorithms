/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.twitter.ann.faiss;

public class ByteVector {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ByteVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ByteVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        swigfaissJNI.delete_ByteVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ByteVector() {
    this(swigfaissJNI.new_ByteVector(), true);
  }

  public void push_back(short arg0) {
    swigfaissJNI.ByteVector_push_back(swigCPtr, this, arg0);
  }

  public void clear() {
    swigfaissJNI.ByteVector_clear(swigCPtr, this);
  }

  public SWIGTYPE_p_unsigned_char data() {
    long cPtr = swigfaissJNI.ByteVector_data(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_char(cPtr, false);
  }

  public long size() {
    return swigfaissJNI.ByteVector_size(swigCPtr, this);
  }

  public short at(long n) {
    return swigfaissJNI.ByteVector_at(swigCPtr, this, n);
  }

  public void resize(long n) {
    swigfaissJNI.ByteVector_resize(swigCPtr, this, n);
  }

  public void reserve(long n) {
    swigfaissJNI.ByteVector_reserve(swigCPtr, this, n);
  }

  public void swap(ByteVector other) {
    swigfaissJNI.ByteVector_swap(swigCPtr, this, ByteVector.getCPtr(other), other);
  }

}
