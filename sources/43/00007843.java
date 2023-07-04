package io.realm.internal;

import io.realm.RealmFieldType;

/* loaded from: classes5.dex */
public class OsObjectSchemaInfo implements h {

    /* renamed from: b  reason: collision with root package name */
    private static final long f31846b = nativeGetFinalizerPtr();

    /* renamed from: a  reason: collision with root package name */
    private long f31847a;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f31848a;

        /* renamed from: b  reason: collision with root package name */
        private final String f31849b;

        /* renamed from: c  reason: collision with root package name */
        private final long[] f31850c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f31851d;

        /* renamed from: f  reason: collision with root package name */
        private final long[] f31853f;

        /* renamed from: e  reason: collision with root package name */
        private int f31852e = 0;

        /* renamed from: g  reason: collision with root package name */
        private int f31854g = 0;

        public b(String str, String str2, boolean z11, int i11, int i12) {
            this.f31849b = str;
            this.f31848a = str2;
            this.f31851d = z11;
            this.f31850c = new long[i11];
            this.f31853f = new long[i12];
        }

        public b a(String str, String str2, RealmFieldType realmFieldType, boolean z11, boolean z12, boolean z13) {
            long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(str2, str, Property.a(realmFieldType, z13), z11, z12);
            long[] jArr = this.f31850c;
            int i11 = this.f31852e;
            jArr[i11] = nativeCreatePersistedProperty;
            this.f31852e = i11 + 1;
            return this;
        }

        public OsObjectSchemaInfo b() {
            if (this.f31852e != -1 && this.f31854g != -1) {
                OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(this.f31849b, this.f31848a, this.f31851d);
                OsObjectSchemaInfo.nativeAddProperties(osObjectSchemaInfo.f31847a, this.f31850c, this.f31853f);
                this.f31852e = -1;
                this.f31854g = -1;
                return osObjectSchemaInfo;
            }
            throw new IllegalStateException("'OsObjectSchemaInfo.build()' has been called before on this object.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeAddProperties(long j11, long[] jArr, long[] jArr2);

    private static native long nativeCreateRealmObjectSchema(String str, String str2, boolean z11);

    private static native String nativeGetClassName(long j11);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetPrimaryKeyProperty(long j11);

    private static native long nativeGetProperty(long j11, String str);

    private static native boolean nativeIsEmbedded(long j11);

    public Property c(String str) {
        return new Property(nativeGetProperty(this.f31847a, str));
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f31846b;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f31847a;
    }

    private OsObjectSchemaInfo(String str, String str2, boolean z11) {
        this(nativeCreateRealmObjectSchema(str, str2, z11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsObjectSchemaInfo(long j11) {
        this.f31847a = j11;
        g.f31933c.a(this);
    }
}