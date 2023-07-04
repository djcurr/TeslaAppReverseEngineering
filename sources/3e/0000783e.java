package io.realm.internal;

/* loaded from: classes5.dex */
public class OsMap implements h {

    /* renamed from: c  reason: collision with root package name */
    private static final long f31842c = nativeGetFinalizerPtr();

    /* renamed from: a  reason: collision with root package name */
    private final long f31843a;

    /* renamed from: b  reason: collision with root package name */
    private final g f31844b;

    public OsMap(UncheckedRow uncheckedRow, long j11) {
        OsSharedRealm p11 = uncheckedRow.getTable().p();
        long[] nativeCreate = nativeCreate(p11.getNativePtr(), uncheckedRow.getNativePtr(), j11);
        this.f31843a = nativeCreate[0];
        if (nativeCreate[1] != -1) {
            new Table(p11, nativeCreate[1]);
        }
        g gVar = p11.context;
        this.f31844b = gVar;
        gVar.a(this);
    }

    private static native void nativeClear(long j11);

    private static native boolean nativeContainsBinary(long j11, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j11, boolean z11);

    private static native boolean nativeContainsDate(long j11, long j12);

    private static native boolean nativeContainsDecimal128(long j11, long j12, long j13);

    private static native boolean nativeContainsFloat(long j11, float f11);

    private static native boolean nativeContainsKey(long j11, String str);

    private static native boolean nativeContainsLong(long j11, long j12);

    private static native boolean nativeContainsNull(long j11);

    private static native boolean nativeContainsObjectId(long j11, String str);

    private static native boolean nativeContainsRealmAny(long j11, long j12);

    private static native boolean nativeContainsRealmModel(long j11, long j12, long j13);

    private static native boolean nativeContainsString(long j11, String str);

    private static native boolean nativeContainsUUID(long j11, String str);

    private static native long[] nativeCreate(long j11, long j12, long j13);

    private static native long nativeCreateAndPutEmbeddedObject(long j11, String str);

    private static native long nativeFreeze(long j11, long j12);

    private static native Object[] nativeGetEntryForModel(long j11, int i11);

    private static native Object[] nativeGetEntryForPrimitive(long j11, int i11);

    private static native Object[] nativeGetEntryForRealmAny(long j11, int i11);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRealmAnyPtr(long j11, String str);

    private static native long nativeGetRow(long j11, String str);

    private static native Object nativeGetValue(long j11, String str);

    private static native boolean nativeIsValid(long j11);

    private static native long nativeKeys(long j11);

    private static native void nativePutBinary(long j11, String str, byte[] bArr);

    private static native void nativePutBoolean(long j11, String str, boolean z11);

    private static native void nativePutDate(long j11, String str, long j12);

    private static native void nativePutDecimal128(long j11, String str, long j12, long j13);

    private static native void nativePutDouble(long j11, String str, double d11);

    private static native void nativePutFloat(long j11, String str, float f11);

    private static native void nativePutLong(long j11, String str, long j12);

    private static native void nativePutNull(long j11, String str);

    private static native void nativePutObjectId(long j11, String str, String str2);

    private static native void nativePutRealmAny(long j11, String str, long j12);

    private static native void nativePutRow(long j11, String str, long j12);

    private static native void nativePutString(long j11, String str, String str2);

    private static native void nativePutUUID(long j11, String str, String str2);

    private static native void nativeRemove(long j11, String str);

    private static native long nativeSize(long j11);

    private static native void nativeStartListening(long j11, ObservableMap observableMap);

    private static native void nativeStopListening(long j11);

    private static native long nativeValues(long j11);

    public long a() {
        return nativeSize(this.f31843a);
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f31842c;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f31843a;
    }
}