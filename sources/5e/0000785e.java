package io.realm.internal;

import io.realm.b0;
import io.realm.c0;
import io.realm.internal.core.NativeRealmAny;
import io.realm.internal.objectstore.OsKeyPathMapping;

/* loaded from: classes5.dex */
public class TableQuery implements h {

    /* renamed from: e  reason: collision with root package name */
    private static final long f31900e = nativeGetFinalizerPtr();

    /* renamed from: a  reason: collision with root package name */
    private final Table f31901a;

    /* renamed from: b  reason: collision with root package name */
    private final long f31902b;

    /* renamed from: c  reason: collision with root package name */
    private final c0 f31903c = new c0();

    /* renamed from: d  reason: collision with root package name */
    private boolean f31904d = true;

    public TableQuery(g gVar, Table table, long j11) {
        this.f31901a = table;
        this.f31902b = j11;
        gVar.a(this);
    }

    private static String h(String str) {
        if (str == null) {
            return null;
        }
        return str.replace(" ", "\\ ");
    }

    private native long[] nativeAverageDecimal128(long j11, long j12);

    private native double nativeAverageDouble(long j11, long j12);

    private native double nativeAverageFloat(long j11, long j12);

    private native double nativeAverageInt(long j11, long j12);

    private native long[] nativeAverageRealmAny(long j11, long j12);

    private native void nativeBeginGroup(long j11);

    private native long nativeCount(long j11);

    private native void nativeEndGroup(long j11);

    private native long nativeFind(long j11);

    private static native long nativeGetFinalizerPtr();

    private native long[] nativeMaximumDecimal128(long j11, long j12);

    private native Double nativeMaximumDouble(long j11, long j12);

    private native Float nativeMaximumFloat(long j11, long j12);

    private native Long nativeMaximumInt(long j11, long j12);

    private native NativeRealmAny nativeMaximumRealmAny(long j11, long j12);

    private native Long nativeMaximumTimestamp(long j11, long j12);

    private native long[] nativeMinimumDecimal128(long j11, long j12);

    private native Double nativeMinimumDouble(long j11, long j12);

    private native Float nativeMinimumFloat(long j11, long j12);

    private native Long nativeMinimumInt(long j11, long j12);

    private native NativeRealmAny nativeMinimumRealmAny(long j11, long j12);

    private native Long nativeMinimumTimestamp(long j11, long j12);

    private native void nativeNot(long j11);

    private native void nativeOr(long j11);

    private native void nativeRawDescriptor(long j11, String str, long j12);

    private native void nativeRawPredicate(long j11, String str, long[] jArr, long j12);

    private native long nativeRemove(long j11);

    private native long[] nativeSumDecimal128(long j11, long j12);

    private native double nativeSumDouble(long j11, long j12);

    private native double nativeSumFloat(long j11, long j12);

    private native long nativeSumInt(long j11, long j12);

    private native long[] nativeSumRealmAny(long j11, long j12);

    private native String nativeValidateQuery(long j11);

    public TableQuery a() {
        o(null, "FALSEPREDICATE", new long[0]);
        this.f31904d = false;
        return this;
    }

    public TableQuery b() {
        nativeBeginGroup(this.f31902b);
        this.f31904d = false;
        return this;
    }

    public TableQuery c(OsKeyPathMapping osKeyPathMapping, String str, b0 b0Var) {
        c0 c0Var = this.f31903c;
        c0Var.a(this, osKeyPathMapping, h(str) + " BEGINSWITH $0", b0Var);
        this.f31904d = false;
        return this;
    }

    public TableQuery d(OsKeyPathMapping osKeyPathMapping, String str, b0 b0Var) {
        c0 c0Var = this.f31903c;
        c0Var.a(this, osKeyPathMapping, h(str) + " BEGINSWITH[c] $0", b0Var);
        this.f31904d = false;
        return this;
    }

    public TableQuery e() {
        nativeEndGroup(this.f31902b);
        this.f31904d = false;
        return this;
    }

    public TableQuery f(OsKeyPathMapping osKeyPathMapping, String str, b0 b0Var) {
        c0 c0Var = this.f31903c;
        c0Var.a(this, osKeyPathMapping, h(str) + " = $0", b0Var);
        this.f31904d = false;
        return this;
    }

    public TableQuery g(OsKeyPathMapping osKeyPathMapping, String str, b0 b0Var) {
        c0 c0Var = this.f31903c;
        c0Var.a(this, osKeyPathMapping, h(str) + " =[c] $0", b0Var);
        this.f31904d = false;
        return this;
    }

    @Override // io.realm.internal.h
    public long getNativeFinalizerPtr() {
        return f31900e;
    }

    @Override // io.realm.internal.h
    public long getNativePtr() {
        return this.f31902b;
    }

    public Table i() {
        return this.f31901a;
    }

    public TableQuery j(OsKeyPathMapping osKeyPathMapping, String str, b0[] b0VarArr) {
        String h11 = h(str);
        b();
        int length = b0VarArr.length;
        boolean z11 = true;
        int i11 = 0;
        while (i11 < length) {
            b0 b0Var = b0VarArr[i11];
            if (!z11) {
                n();
            }
            if (b0Var == null) {
                l(osKeyPathMapping, h11);
            } else {
                f(osKeyPathMapping, h11, b0Var);
            }
            i11++;
            z11 = false;
        }
        e();
        this.f31904d = false;
        return this;
    }

    public TableQuery k(OsKeyPathMapping osKeyPathMapping, String str, b0[] b0VarArr) {
        String h11 = h(str);
        b();
        int length = b0VarArr.length;
        boolean z11 = true;
        int i11 = 0;
        while (i11 < length) {
            b0 b0Var = b0VarArr[i11];
            if (!z11) {
                n();
            }
            if (b0Var == null) {
                l(osKeyPathMapping, h11);
            } else {
                g(osKeyPathMapping, h11, b0Var);
            }
            i11++;
            z11 = false;
        }
        e();
        this.f31904d = false;
        return this;
    }

    public TableQuery l(OsKeyPathMapping osKeyPathMapping, String str) {
        o(osKeyPathMapping, h(str) + " = NULL", new long[0]);
        this.f31904d = false;
        return this;
    }

    public TableQuery m() {
        nativeNot(this.f31902b);
        this.f31904d = false;
        return this;
    }

    public TableQuery n() {
        nativeOr(this.f31902b);
        this.f31904d = false;
        return this;
    }

    public void o(OsKeyPathMapping osKeyPathMapping, String str, long... jArr) {
        nativeRawPredicate(this.f31902b, str, jArr, osKeyPathMapping != null ? osKeyPathMapping.getNativePtr() : 0L);
    }

    public void p() {
        if (this.f31904d) {
            return;
        }
        String nativeValidateQuery = nativeValidateQuery(this.f31902b);
        if ("".equals(nativeValidateQuery)) {
            this.f31904d = true;
            return;
        }
        throw new UnsupportedOperationException(nativeValidateQuery);
    }
}