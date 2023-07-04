package uj;

import android.text.Layout;

/* loaded from: classes3.dex */
final class f {

    /* renamed from: a  reason: collision with root package name */
    private String f53513a;

    /* renamed from: b  reason: collision with root package name */
    private int f53514b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f53515c;

    /* renamed from: d  reason: collision with root package name */
    private int f53516d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f53517e;

    /* renamed from: k  reason: collision with root package name */
    private float f53523k;

    /* renamed from: l  reason: collision with root package name */
    private String f53524l;

    /* renamed from: o  reason: collision with root package name */
    private Layout.Alignment f53527o;

    /* renamed from: f  reason: collision with root package name */
    private int f53518f = -1;

    /* renamed from: g  reason: collision with root package name */
    private int f53519g = -1;

    /* renamed from: h  reason: collision with root package name */
    private int f53520h = -1;

    /* renamed from: i  reason: collision with root package name */
    private int f53521i = -1;

    /* renamed from: j  reason: collision with root package name */
    private int f53522j = -1;

    /* renamed from: m  reason: collision with root package name */
    private int f53525m = -1;

    /* renamed from: n  reason: collision with root package name */
    private int f53526n = -1;

    /* renamed from: p  reason: collision with root package name */
    private int f53528p = -1;

    private f o(f fVar, boolean z11) {
        int i11;
        Layout.Alignment alignment;
        String str;
        if (fVar != null) {
            if (!this.f53515c && fVar.f53515c) {
                t(fVar.f53514b);
            }
            if (this.f53520h == -1) {
                this.f53520h = fVar.f53520h;
            }
            if (this.f53521i == -1) {
                this.f53521i = fVar.f53521i;
            }
            if (this.f53513a == null && (str = fVar.f53513a) != null) {
                this.f53513a = str;
            }
            if (this.f53518f == -1) {
                this.f53518f = fVar.f53518f;
            }
            if (this.f53519g == -1) {
                this.f53519g = fVar.f53519g;
            }
            if (this.f53526n == -1) {
                this.f53526n = fVar.f53526n;
            }
            if (this.f53527o == null && (alignment = fVar.f53527o) != null) {
                this.f53527o = alignment;
            }
            if (this.f53528p == -1) {
                this.f53528p = fVar.f53528p;
            }
            if (this.f53522j == -1) {
                this.f53522j = fVar.f53522j;
                this.f53523k = fVar.f53523k;
            }
            if (z11 && !this.f53517e && fVar.f53517e) {
                r(fVar.f53516d);
            }
            if (z11 && this.f53525m == -1 && (i11 = fVar.f53525m) != -1) {
                this.f53525m = i11;
            }
        }
        return this;
    }

    public f A(int i11) {
        this.f53526n = i11;
        return this;
    }

    public f B(int i11) {
        this.f53525m = i11;
        return this;
    }

    public f C(Layout.Alignment alignment) {
        this.f53527o = alignment;
        return this;
    }

    public f D(boolean z11) {
        this.f53528p = z11 ? 1 : 0;
        return this;
    }

    public f E(boolean z11) {
        this.f53519g = z11 ? 1 : 0;
        return this;
    }

    public f a(f fVar) {
        return o(fVar, true);
    }

    public int b() {
        if (this.f53517e) {
            return this.f53516d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public int c() {
        if (this.f53515c) {
            return this.f53514b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String d() {
        return this.f53513a;
    }

    public float e() {
        return this.f53523k;
    }

    public int f() {
        return this.f53522j;
    }

    public String g() {
        return this.f53524l;
    }

    public int h() {
        return this.f53526n;
    }

    public int i() {
        return this.f53525m;
    }

    public int j() {
        int i11 = this.f53520h;
        if (i11 == -1 && this.f53521i == -1) {
            return -1;
        }
        return (i11 == 1 ? 1 : 0) | (this.f53521i == 1 ? 2 : 0);
    }

    public Layout.Alignment k() {
        return this.f53527o;
    }

    public boolean l() {
        return this.f53528p == 1;
    }

    public boolean m() {
        return this.f53517e;
    }

    public boolean n() {
        return this.f53515c;
    }

    public boolean p() {
        return this.f53518f == 1;
    }

    public boolean q() {
        return this.f53519g == 1;
    }

    public f r(int i11) {
        this.f53516d = i11;
        this.f53517e = true;
        return this;
    }

    public f s(boolean z11) {
        this.f53520h = z11 ? 1 : 0;
        return this;
    }

    public f t(int i11) {
        this.f53514b = i11;
        this.f53515c = true;
        return this;
    }

    public f u(String str) {
        this.f53513a = str;
        return this;
    }

    public f v(float f11) {
        this.f53523k = f11;
        return this;
    }

    public f w(int i11) {
        this.f53522j = i11;
        return this;
    }

    public f x(String str) {
        this.f53524l = str;
        return this;
    }

    public f y(boolean z11) {
        this.f53521i = z11 ? 1 : 0;
        return this;
    }

    public f z(boolean z11) {
        this.f53518f = z11 ? 1 : 0;
        return this;
    }
}