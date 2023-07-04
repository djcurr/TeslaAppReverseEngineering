package io.realm.internal;

import java.util.Collection;

/* loaded from: classes5.dex */
public class OsSchemaInfo implements h {

    /* renamed from: b  reason: collision with root package name */
    private static final long f31880b = nativeGetFinalizerPtr();

    /* renamed from: a  reason: collision with root package name */
    private long f31881a;

    public OsSchemaInfo(Collection<OsObjectSchemaInfo> collection) {
        this.f31881a = nativeCreateFromList(a(collection));
        g.f31933c.a(this);
    }

    private static long[] a(Collection<OsObjectSchemaInfo> collection) {
        long[] jArr = new long[collection.size()];
        int i11 = 0;
        for (OsObjectSchemaInfo osObjectSchemaInfo : collection) {
            jArr[i11] = osObjectSchemaInfo.getNativePtr();
            i11++;
        }
        return jArr;
    }

    private static native long nativeCreateFromList(long[] jArr);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetObjectSchemaInfo(long j11, String str);

    public OsObjectSchemaInfo b(String str) {
        return new OsObjectSchemaInfo(nativeGetObjectSchemaInfo(this.f31881a, str));
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f31880b;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f31881a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OsSchemaInfo(long j11, OsSharedRealm osSharedRealm) {
        this.f31881a = j11;
    }
}