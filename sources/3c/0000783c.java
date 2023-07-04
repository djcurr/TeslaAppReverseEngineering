package io.realm.internal;

import io.realm.v;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class OsCollectionChangeSet implements v, h {

    /* renamed from: c  reason: collision with root package name */
    private static long f31835c = nativeGetFinalizerPtr();

    /* renamed from: a  reason: collision with root package name */
    private final long f31836a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f31837b;

    public OsCollectionChangeSet(long j11, boolean z11) {
        this.f31836a = j11;
        this.f31837b = z11;
        g.f31933c.a(this);
    }

    private v.a[] g(int[] iArr) {
        if (iArr == null) {
            return new v.a[0];
        }
        int length = iArr.length / 2;
        v.a[] aVarArr = new v.a[length];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = i11 * 2;
            aVarArr[i11] = new v.a(iArr[i12], iArr[i12 + 1]);
        }
        return aVarArr;
    }

    private static native long nativeGetFinalizerPtr();

    private static native int[] nativeGetIndices(long j11, int i11);

    private static native int[] nativeGetRanges(long j11, int i11);

    public v.a[] a() {
        return g(nativeGetRanges(this.f31836a, 2));
    }

    public v.a[] b() {
        return g(nativeGetRanges(this.f31836a, 0));
    }

    public Throwable c() {
        return null;
    }

    public v.a[] d() {
        return g(nativeGetRanges(this.f31836a, 1));
    }

    public boolean e() {
        return this.f31836a == 0;
    }

    public boolean f() {
        return this.f31837b;
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f31835c;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f31836a;
    }

    public String toString() {
        if (this.f31836a == 0) {
            return "Change set is empty.";
        }
        return "Deletion Ranges: " + Arrays.toString(b()) + "\nInsertion Ranges: " + Arrays.toString(d()) + "\nChange Ranges: " + Arrays.toString(a());
    }
}