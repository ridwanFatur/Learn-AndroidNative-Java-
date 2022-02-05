/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.ridwanproduction.learnandroidjava;
public interface TweetCollectorListener extends android.os.IInterface
{
  /** Default implementation for TweetCollectorListener. */
  public static class Default implements TweetCollectorListener
  {
    @Override public void handleTweetsUpdated() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements TweetCollectorListener
  {
    private static final String DESCRIPTOR = "com.ridwanproduction.learnandroidjava.TweetCollectorListener";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.ridwanproduction.learnandroidjava.TweetCollectorListener interface,
     * generating a proxy if needed.
     */
    public static TweetCollectorListener asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof TweetCollectorListener))) {
        return ((TweetCollectorListener)iin);
      }
      return new Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_handleTweetsUpdated:
        {
          data.enforceInterface(descriptor);
          this.handleTweetsUpdated();
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements TweetCollectorListener
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void handleTweetsUpdated() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleTweetsUpdated, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().handleTweetsUpdated();
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static TweetCollectorListener sDefaultImpl;
    }
    static final int TRANSACTION_handleTweetsUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(TweetCollectorListener impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static TweetCollectorListener getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }
  }
  public void handleTweetsUpdated() throws android.os.RemoteException;
}
