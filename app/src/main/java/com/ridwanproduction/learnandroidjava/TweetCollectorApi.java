/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.ridwanproduction.learnandroidjava;
public interface TweetCollectorApi extends android.os.IInterface
{
  /** Default implementation for TweetCollectorApi. */
  public static class Default implements TweetCollectorApi
  {
    @Override public com.ridwanproduction.learnandroidjava.TweetSearchResult getLatestSearchResult() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void addListener(TweetCollectorListener listener) throws android.os.RemoteException
    {
    }
    @Override public void removeListener(TweetCollectorListener listener) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements TweetCollectorApi
  {
    private static final String DESCRIPTOR = "com.ridwanproduction.learnandroidjava.TweetCollectorApi";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.ridwanproduction.learnandroidjava.TweetCollectorApi interface,
     * generating a proxy if needed.
     */
    public static TweetCollectorApi asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof TweetCollectorApi))) {
        return ((TweetCollectorApi)iin);
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
        case TRANSACTION_getLatestSearchResult:
        {
          data.enforceInterface(descriptor);
          com.ridwanproduction.learnandroidjava.TweetSearchResult _result = this.getLatestSearchResult();
          reply.writeNoException();
          if ((_result!=null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          }
          else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_addListener:
        {
          data.enforceInterface(descriptor);
          TweetCollectorListener _arg0;
          _arg0 = TweetCollectorListener.Stub.asInterface(data.readStrongBinder());
          this.addListener(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_removeListener:
        {
          data.enforceInterface(descriptor);
          TweetCollectorListener _arg0;
          _arg0 = TweetCollectorListener.Stub.asInterface(data.readStrongBinder());
          this.removeListener(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements TweetCollectorApi
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
      @Override public com.ridwanproduction.learnandroidjava.TweetSearchResult getLatestSearchResult() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.ridwanproduction.learnandroidjava.TweetSearchResult _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getLatestSearchResult, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getLatestSearchResult();
          }
          _reply.readException();
          if ((0!=_reply.readInt())) {
            _result = com.ridwanproduction.learnandroidjava.TweetSearchResult.CREATOR.createFromParcel(_reply);
          }
          else {
            _result = null;
          }
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void addListener(TweetCollectorListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_addListener, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().addListener(listener);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void removeListener(TweetCollectorListener listener) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((listener!=null))?(listener.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeListener, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().removeListener(listener);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static TweetCollectorApi sDefaultImpl;
    }
    static final int TRANSACTION_getLatestSearchResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_addListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_removeListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(TweetCollectorApi impl) {
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
    public static TweetCollectorApi getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }
  }
  public com.ridwanproduction.learnandroidjava.TweetSearchResult getLatestSearchResult() throws android.os.RemoteException;
  public void addListener(TweetCollectorListener listener) throws android.os.RemoteException;
  public void removeListener(TweetCollectorListener listener) throws android.os.RemoteException;
}
