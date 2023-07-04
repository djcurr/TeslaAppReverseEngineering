package io.realm.internal;

import io.realm.internal.ObservableCollection;

/* loaded from: classes5.dex */
public class OsList implements h, ObservableCollection {

    /* renamed from: d  reason: collision with root package name */
    private static final long f31838d = nativeGetFinalizerPtr();

    /* renamed from: a  reason: collision with root package name */
    private final long f31839a;

    /* renamed from: b  reason: collision with root package name */
    private final g f31840b;

    /* renamed from: c  reason: collision with root package name */
    private final j<ObservableCollection.b> f31841c = new j<>();

    public OsList(UncheckedRow uncheckedRow, long j11) {
        OsSharedRealm p11 = uncheckedRow.getTable().p();
        long[] nativeCreate = nativeCreate(p11.getNativePtr(), uncheckedRow.getNativePtr(), j11);
        this.f31839a = nativeCreate[0];
        g gVar = p11.context;
        this.f31840b = gVar;
        gVar.a(this);
        if (nativeCreate[1] != 0) {
            new Table(p11, nativeCreate[1]);
        }
    }

    private static native void nativeAddBinary(long j11, byte[] bArr);

    private static native void nativeAddBoolean(long j11, boolean z11);

    private static native void nativeAddDate(long j11, long j12);

    private static native void nativeAddDecimal128(long j11, long j12, long j13);

    private static native void nativeAddDouble(long j11, double d11);

    private static native void nativeAddFloat(long j11, float f11);

    private static native void nativeAddLong(long j11, long j12);

    private static native void nativeAddNull(long j11);

    private static native void nativeAddObjectId(long j11, String str);

    private static native void nativeAddRealmAny(long j11, long j12);

    private static native void nativeAddRow(long j11, long j12);

    private static native void nativeAddString(long j11, String str);

    private static native void nativeAddUUID(long j11, String str);

    private static native long[] nativeCreate(long j11, long j12, long j13);

    private static native long nativeCreateAndAddEmbeddedObject(long j11, long j12);

    private static native long nativeCreateAndSetEmbeddedObject(long j11, long j12);

    private static native void nativeDelete(long j11, long j12);

    private static native void nativeDeleteAll(long j11);

    private static native long nativeFreeze(long j11, long j12);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long j11);

    private static native long nativeGetRow(long j11, long j12);

    private static native Object nativeGetValue(long j11, long j12);

    private static native void nativeInsertBinary(long j11, long j12, byte[] bArr);

    private static native void nativeInsertBoolean(long j11, long j12, boolean z11);

    private static native void nativeInsertDate(long j11, long j12, long j13);

    private static native void nativeInsertDecimal128(long j11, long j12, long j13, long j14);

    private static native void nativeInsertDouble(long j11, long j12, double d11);

    private static native void nativeInsertFloat(long j11, long j12, float f11);

    private static native void nativeInsertLong(long j11, long j12, long j13);

    private static native void nativeInsertNull(long j11, long j12);

    private static native void nativeInsertObjectId(long j11, long j12, String str);

    private static native void nativeInsertRealmAny(long j11, long j12, long j13);

    private static native void nativeInsertRow(long j11, long j12, long j13);

    private static native void nativeInsertString(long j11, long j12, String str);

    private static native void nativeInsertUUID(long j11, long j12, String str);

    private static native boolean nativeIsValid(long j11);

    private static native void nativeMove(long j11, long j12, long j13);

    private static native void nativeRemove(long j11, long j12);

    private static native void nativeRemoveAll(long j11);

    private static native void nativeSetBinary(long j11, long j12, byte[] bArr);

    private static native void nativeSetBoolean(long j11, long j12, boolean z11);

    private static native void nativeSetDate(long j11, long j12, long j13);

    private static native void nativeSetDecimal128(long j11, long j12, long j13, long j14);

    private static native void nativeSetDouble(long j11, long j12, double d11);

    private static native void nativeSetFloat(long j11, long j12, float f11);

    private static native void nativeSetLong(long j11, long j12, long j13);

    private static native void nativeSetNull(long j11, long j12);

    private static native void nativeSetObjectId(long j11, long j12, String str);

    private static native void nativeSetRealmAny(long j11, long j12, long j13);

    private static native void nativeSetRow(long j11, long j12, long j13);

    private static native void nativeSetString(long j11, long j12, String str);

    private static native void nativeSetUUID(long j11, long j12, String str);

    private static native long nativeSize(long j11);

    private native void nativeStartListening(long j11);

    private native void nativeStopListening(long j11);

    public long a() {
        return nativeSize(this.f31839a);
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f31838d;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f31839a;
    }

    @Override // io.realm.internal.ObservableCollection
    public void notifyChangeListeners(long j11) {
        OsCollectionChangeSet osCollectionChangeSet = new OsCollectionChangeSet(j11, false);
        if (osCollectionChangeSet.e()) {
            return;
        }
        this.f31841c.c(new ObservableCollection.a(osCollectionChangeSet));
    }
}