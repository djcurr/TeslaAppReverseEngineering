package io.realm.internal.core;

import io.realm.b0;
import io.realm.internal.Keep;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.Table;
import io.realm.internal.g;
import io.realm.internal.h;
import io.realm.internal.m;
import io.realm.internal.n;
import io.realm.internal.o;
import io.realm.l0;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

@Keep
/* loaded from: classes5.dex */
public class NativeRealmAny implements h {
    private static final long nativeFinalizerPtr = nativeGetFinalizerPtr();
    private final long nativePtr;

    public NativeRealmAny(long j11) {
        this.nativePtr = j11;
        g.f31933c.a(this);
    }

    private static long createRealmAnyLink(m mVar) {
        o d11 = mVar.d().d();
        return nativeCreateLink(d11.getTable().getNativePtr(), d11.getObjectKey());
    }

    private static native byte[] nativeAsBinary(long j11);

    private static native boolean nativeAsBoolean(long j11);

    private static native long nativeAsDate(long j11);

    private static native long[] nativeAsDecimal128(long j11);

    private static native double nativeAsDouble(long j11);

    private static native float nativeAsFloat(long j11);

    private static native long nativeAsLong(long j11);

    private static native String nativeAsObjectId(long j11);

    private static native String nativeAsString(long j11);

    private static native String nativeAsUUID(long j11);

    private static native long nativeCreateBinary(byte[] bArr);

    private static native long nativeCreateBoolean(boolean z11);

    private static native long nativeCreateDate(long j11);

    private static native long nativeCreateDecimal128(long j11, long j12);

    private static native long nativeCreateDouble(double d11);

    private static native long nativeCreateFloat(float f11);

    private static native long nativeCreateLink(long j11, long j12);

    private static native long nativeCreateLong(long j11);

    private static native long nativeCreateNull();

    private static native long nativeCreateObjectId(String str);

    private static native long nativeCreateString(String str);

    private static native long nativeCreateUUID(String str);

    private static native boolean nativeEquals(long j11, long j12);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetRealmModelRowKey(long j11);

    private static native String nativeGetRealmModelTableName(long j11, long j12);

    private static native int nativeGetType(long j11);

    public byte[] asBinary() {
        return nativeAsBinary(this.nativePtr);
    }

    public boolean asBoolean() {
        return nativeAsBoolean(this.nativePtr);
    }

    public Date asDate() {
        return new Date(nativeAsDate(this.nativePtr));
    }

    public Decimal128 asDecimal128() {
        long[] nativeAsDecimal128 = nativeAsDecimal128(this.nativePtr);
        return Decimal128.fromIEEE754BIDEncoding(nativeAsDecimal128[1], nativeAsDecimal128[0]);
    }

    public double asDouble() {
        return nativeAsDouble(this.nativePtr);
    }

    public float asFloat() {
        return nativeAsFloat(this.nativePtr);
    }

    public long asLong() {
        return nativeAsLong(this.nativePtr);
    }

    public ObjectId asObjectId() {
        return new ObjectId(nativeAsObjectId(this.nativePtr));
    }

    public String asString() {
        return nativeAsString(this.nativePtr);
    }

    public UUID asUUID() {
        return UUID.fromString(nativeAsUUID(this.nativePtr));
    }

    public boolean coercedEquals(NativeRealmAny nativeRealmAny) {
        return nativeEquals(this.nativePtr, nativeRealmAny.nativePtr);
    }

    public <T extends l0> Class<T> getModelClass(OsSharedRealm osSharedRealm, n nVar) {
        return nVar.f(Table.h(nativeGetRealmModelTableName(this.nativePtr, osSharedRealm.getNativePtr())));
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return nativeFinalizerPtr;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.nativePtr;
    }

    public long getRealmModelRowKey() {
        return nativeGetRealmModelRowKey(this.nativePtr);
    }

    public String getRealmModelTableName(OsSharedRealm osSharedRealm) {
        return nativeGetRealmModelTableName(this.nativePtr, osSharedRealm.getNativePtr());
    }

    public b0.a getType() {
        return b0.a.fromNativeValue(nativeGetType(this.nativePtr));
    }

    public NativeRealmAny(Boolean bool) {
        this(nativeCreateBoolean(bool.booleanValue()));
    }

    public NativeRealmAny(Number number) {
        this(nativeCreateLong(number.longValue()));
    }

    public NativeRealmAny(Float f11) {
        this(nativeCreateFloat(f11.floatValue()));
    }

    public NativeRealmAny(Double d11) {
        this(nativeCreateDouble(d11.doubleValue()));
    }

    public NativeRealmAny(String str) {
        this(nativeCreateString(str));
    }

    public NativeRealmAny(byte[] bArr) {
        this(nativeCreateBinary(bArr));
    }

    public NativeRealmAny(Date date) {
        this(nativeCreateDate(date.getTime()));
    }

    public NativeRealmAny(ObjectId objectId) {
        this(nativeCreateObjectId(objectId.toString()));
    }

    public NativeRealmAny(Decimal128 decimal128) {
        this(nativeCreateDecimal128(decimal128.f(), decimal128.e()));
    }

    public NativeRealmAny(UUID uuid) {
        this(nativeCreateUUID(uuid.toString()));
    }

    public NativeRealmAny(m mVar) {
        this(createRealmAnyLink(mVar));
    }

    public NativeRealmAny() {
        this(nativeCreateNull());
    }
}