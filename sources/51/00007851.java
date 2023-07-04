package io.realm.internal;

/* loaded from: classes5.dex */
public class OsSet implements h {

    /* renamed from: d  reason: collision with root package name */
    private static final long f31882d = nativeGetFinalizerPtr();

    /* renamed from: a  reason: collision with root package name */
    private final long f31883a;

    /* renamed from: b  reason: collision with root package name */
    private final g f31884b;

    /* renamed from: c  reason: collision with root package name */
    private final OsSharedRealm f31885c;

    public OsSet(UncheckedRow uncheckedRow, long j11) {
        OsSharedRealm p11 = uncheckedRow.getTable().p();
        this.f31885c = p11;
        long[] nativeCreate = nativeCreate(p11.getNativePtr(), uncheckedRow.getNativePtr(), j11);
        this.f31883a = nativeCreate[0];
        g gVar = p11.context;
        this.f31884b = gVar;
        gVar.a(this);
        if (nativeCreate[1] != 0) {
            new Table(p11, nativeCreate[1]);
        }
    }

    private static native boolean nativeAddAllRealmAnyCollection(long j11, long j12);

    private static native long[] nativeAddBinary(long j11, byte[] bArr);

    private static native long[] nativeAddBoolean(long j11, boolean z11);

    private static native long[] nativeAddDate(long j11, long j12);

    private static native long[] nativeAddDecimal128(long j11, long j12, long j13);

    private static native long[] nativeAddDouble(long j11, double d11);

    private static native long[] nativeAddFloat(long j11, float f11);

    private static native long[] nativeAddLong(long j11, long j12);

    private static native long[] nativeAddNull(long j11);

    private static native long[] nativeAddObjectId(long j11, String str);

    private static native long[] nativeAddRealmAny(long j11, long j12);

    private static native long[] nativeAddRow(long j11, long j12);

    private static native long[] nativeAddString(long j11, String str);

    private static native long[] nativeAddUUID(long j11, String str);

    private static native boolean nativeAsymmetricDifference(long j11, long j12);

    private static native void nativeClear(long j11);

    private static native boolean nativeContainsAll(long j11, long j12);

    private static native boolean nativeContainsAllRealmAnyCollection(long j11, long j12);

    private static native boolean nativeContainsBinary(long j11, byte[] bArr);

    private static native boolean nativeContainsBoolean(long j11, boolean z11);

    private static native boolean nativeContainsDate(long j11, long j12);

    private static native boolean nativeContainsDecimal128(long j11, long j12, long j13);

    private static native boolean nativeContainsDouble(long j11, double d11);

    private static native boolean nativeContainsFloat(long j11, float f11);

    private static native boolean nativeContainsLong(long j11, long j12);

    private static native boolean nativeContainsNull(long j11);

    private static native boolean nativeContainsObjectId(long j11, String str);

    private static native boolean nativeContainsRealmAny(long j11, long j12);

    private static native boolean nativeContainsRow(long j11, long j12);

    private static native boolean nativeContainsString(long j11, String str);

    private static native boolean nativeContainsUUID(long j11, String str);

    private static native long[] nativeCreate(long j11, long j12, long j13);

    private static native void nativeDeleteAll(long j11);

    private static native long nativeFreeze(long j11, long j12);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetQuery(long j11);

    private static native long nativeGetRealmAny(long j11, int i11);

    private static native long nativeGetRow(long j11, int i11);

    private static native Object nativeGetValueAtIndex(long j11, int i11);

    private static native boolean nativeIntersect(long j11, long j12);

    private static native boolean nativeIsValid(long j11);

    private static native boolean nativeRemoveAllRealmAnyCollection(long j11, long j12);

    private static native long[] nativeRemoveBinary(long j11, byte[] bArr);

    private static native long[] nativeRemoveBoolean(long j11, boolean z11);

    private static native long[] nativeRemoveDate(long j11, long j12);

    private static native long[] nativeRemoveDecimal128(long j11, long j12, long j13);

    private static native long[] nativeRemoveDouble(long j11, double d11);

    private static native long[] nativeRemoveFloat(long j11, float f11);

    private static native long[] nativeRemoveLong(long j11, long j12);

    private static native long[] nativeRemoveNull(long j11);

    private static native long[] nativeRemoveObjectId(long j11, String str);

    private static native long[] nativeRemoveRealmAny(long j11, long j12);

    private static native long[] nativeRemoveRow(long j11, long j12);

    private static native long[] nativeRemoveString(long j11, String str);

    private static native long[] nativeRemoveUUID(long j11, String str);

    private static native boolean nativeRetainAllRealmAnyCollection(long j11, long j12);

    private static native long nativeSize(long j11);

    private static native void nativeStartListening(long j11, ObservableSet observableSet);

    private static native void nativeStopListening(long j11);

    private static native boolean nativeUnion(long j11, long j12);

    public long a() {
        return nativeSize(this.f31883a);
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f31882d;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f31883a;
    }
}