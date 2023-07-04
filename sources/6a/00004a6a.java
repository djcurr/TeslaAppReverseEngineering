package com.squareup.moshi;

import java.io.Closeable;
import java.io.Flushable;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class m implements Closeable, Flushable {

    /* renamed from: e  reason: collision with root package name */
    String f20541e;

    /* renamed from: f  reason: collision with root package name */
    boolean f20542f;

    /* renamed from: g  reason: collision with root package name */
    boolean f20543g;

    /* renamed from: h  reason: collision with root package name */
    boolean f20544h;

    /* renamed from: a  reason: collision with root package name */
    int f20537a = 0;

    /* renamed from: b  reason: collision with root package name */
    int[] f20538b = new int[32];

    /* renamed from: c  reason: collision with root package name */
    String[] f20539c = new String[32];

    /* renamed from: d  reason: collision with root package name */
    int[] f20540d = new int[32];

    /* renamed from: i  reason: collision with root package name */
    int f20545i = -1;

    public static m a0(okio.g gVar) {
        return new k(gVar);
    }

    public abstract m C();

    public final void C0(boolean z11) {
        this.f20543g = z11;
    }

    public final boolean D() {
        return this.f20543g;
    }

    public abstract m D0(double d11);

    public abstract m F0(long j11);

    public abstract m G0(Number number);

    public abstract m I0(String str);

    public final boolean J() {
        return this.f20542f;
    }

    public abstract m J0(boolean z11);

    public abstract m L(String str);

    public abstract m R();

    public abstract m a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e0() {
        int i11 = this.f20537a;
        if (i11 != 0) {
            return this.f20538b[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final int g() {
        int e02 = e0();
        if (e02 != 5 && e02 != 3 && e02 != 2 && e02 != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i11 = this.f20545i;
        this.f20545i = this.f20537a;
        return i11;
    }

    public final String getPath() {
        return i.a(this.f20537a, this.f20538b, this.f20539c, this.f20540d);
    }

    public abstract m j();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean l() {
        int i11 = this.f20537a;
        int[] iArr = this.f20538b;
        if (i11 != iArr.length) {
            return false;
        }
        if (i11 != 256) {
            this.f20538b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f20539c;
            this.f20539c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f20540d;
            this.f20540d = Arrays.copyOf(iArr2, iArr2.length * 2);
            if (this instanceof l) {
                l lVar = (l) this;
                Object[] objArr = lVar.f20535j;
                lVar.f20535j = Arrays.copyOf(objArr, objArr.length * 2);
                return true;
            }
            return true;
        }
        throw new JsonDataException("Nesting too deep at " + getPath() + ": circular reference?");
    }

    public abstract m m();

    public final void n0() {
        int e02 = e0();
        if (e02 != 5 && e02 != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f20544h = true;
    }

    public final void p(int i11) {
        this.f20545i = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p0(int i11) {
        int[] iArr = this.f20538b;
        int i12 = this.f20537a;
        this.f20537a = i12 + 1;
        iArr[i12] = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t0(int i11) {
        this.f20538b[this.f20537a - 1] = i11;
    }

    public final void u0(boolean z11) {
        this.f20542f = z11;
    }
}