/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: E:\\GitHub\\OsmOnTheGo\\src\\de\\blau\\android\\services\\IOpenStreetMapTileProviderService.aidl
 */
package de.blau.android.services;
public interface IOpenStreetMapTileProviderService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements de.blau.android.services.IOpenStreetMapTileProviderService
{
private static final java.lang.String DESCRIPTOR = "de.blau.android.services.IOpenStreetMapTileProviderService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an de.blau.android.services.IOpenStreetMapTileProviderService interface,
 * generating a proxy if needed.
 */
public static de.blau.android.services.IOpenStreetMapTileProviderService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof de.blau.android.services.IOpenStreetMapTileProviderService))) {
return ((de.blau.android.services.IOpenStreetMapTileProviderService)iin);
}
return new de.blau.android.services.IOpenStreetMapTileProviderService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_getTileProviders:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String[] _result = this.getTileProviders();
reply.writeNoException();
reply.writeStringArray(_result);
return true;
}
case TRANSACTION_getMapTile:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
int _arg3;
_arg3 = data.readInt();
de.blau.android.services.IOpenStreetMapTileProviderCallback _arg4;
_arg4 = de.blau.android.services.IOpenStreetMapTileProviderCallback.Stub.asInterface(data.readStrongBinder());
this.getMapTile(_arg0, _arg1, _arg2, _arg3, _arg4);
reply.writeNoException();
return true;
}
case TRANSACTION_flushCache:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.flushCache(_arg0);
reply.writeNoException();
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements de.blau.android.services.IOpenStreetMapTileProviderService
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
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public java.lang.String[] getTileProviders() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String[] _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getTileProviders, _data, _reply, 0);
_reply.readException();
_result = _reply.createStringArray();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void getMapTile(java.lang.String rendererID, int zoomLevel, int tileX, int tileY, de.blau.android.services.IOpenStreetMapTileProviderCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(rendererID);
_data.writeInt(zoomLevel);
_data.writeInt(tileX);
_data.writeInt(tileY);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_getMapTile, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void flushCache(java.lang.String rendererID) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(rendererID);
mRemote.transact(Stub.TRANSACTION_flushCache, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_getTileProviders = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getMapTile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_flushCache = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public java.lang.String[] getTileProviders() throws android.os.RemoteException;
public void getMapTile(java.lang.String rendererID, int zoomLevel, int tileX, int tileY, de.blau.android.services.IOpenStreetMapTileProviderCallback callback) throws android.os.RemoteException;
public void flushCache(java.lang.String rendererID) throws android.os.RemoteException;
}
