package com.facebook.react.uimanager;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class d0 implements c0<d0> {

    /* renamed from: x  reason: collision with root package name */
    private static final com.facebook.yoga.c f12220x = f0.a();

    /* renamed from: a  reason: collision with root package name */
    private int f12221a;

    /* renamed from: b  reason: collision with root package name */
    private String f12222b;

    /* renamed from: c  reason: collision with root package name */
    private int f12223c;

    /* renamed from: d  reason: collision with root package name */
    private n0 f12224d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12225e;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<d0> f12227g;

    /* renamed from: h  reason: collision with root package name */
    private d0 f12228h;

    /* renamed from: i  reason: collision with root package name */
    private d0 f12229i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f12230j;

    /* renamed from: l  reason: collision with root package name */
    private d0 f12232l;

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<d0> f12233m;

    /* renamed from: n  reason: collision with root package name */
    private int f12234n;

    /* renamed from: o  reason: collision with root package name */
    private int f12235o;

    /* renamed from: p  reason: collision with root package name */
    private int f12236p;

    /* renamed from: q  reason: collision with root package name */
    private int f12237q;

    /* renamed from: s  reason: collision with root package name */
    private final float[] f12239s;

    /* renamed from: u  reason: collision with root package name */
    private com.facebook.yoga.p f12241u;

    /* renamed from: v  reason: collision with root package name */
    private Integer f12242v;

    /* renamed from: w  reason: collision with root package name */
    private Integer f12243w;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12226f = true;

    /* renamed from: k  reason: collision with root package name */
    private int f12231k = 0;

    /* renamed from: t  reason: collision with root package name */
    private final boolean[] f12240t = new boolean[9];

    /* renamed from: r  reason: collision with root package name */
    private final l0 f12238r = new l0(BitmapDescriptorFactory.HUE_RED);

    public d0() {
        float[] fArr = new float[9];
        this.f12239s = fArr;
        if (!O()) {
            com.facebook.yoga.p b11 = h1.a().b();
            b11 = b11 == null ? com.facebook.yoga.q.a(f12220x) : b11;
            this.f12241u = b11;
            b11.x(this);
            Arrays.fill(fArr, Float.NaN);
            return;
        }
        this.f12241u = null;
    }

    private int l0() {
        l S = S();
        if (S == l.NONE) {
            return this.f12231k;
        }
        if (S == l.LEAF) {
            return 1 + this.f12231k;
        }
        return 1;
    }

    private void m1(int i11) {
        if (S() != l.PARENT) {
            for (d0 parent = getParent(); parent != null; parent = parent.getParent()) {
                parent.f12231k += i11;
                if (parent.S() == l.PARENT) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void n1() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 8
            if (r0 > r1) goto Lb6
            if (r0 == 0) goto L62
            r2 = 2
            if (r0 == r2) goto L62
            r2 = 4
            if (r0 == r2) goto L62
            r2 = 5
            if (r0 != r2) goto L11
            goto L62
        L11:
            r2 = 1
            if (r0 == r2) goto L33
            r2 = 3
            if (r0 != r2) goto L18
            goto L33
        L18:
            float[] r1 = r4.f12239s
            r1 = r1[r0]
            boolean r1 = com.facebook.yoga.g.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.p r1 = r4.f12241u
            com.facebook.yoga.j r2 = com.facebook.yoga.j.fromInt(r0)
            com.facebook.react.uimanager.l0 r3 = r4.f12238r
            float r3 = r3.b(r0)
            r1.Z(r2, r3)
            goto Lb2
        L33:
            float[] r2 = r4.f12239s
            r2 = r2[r0]
            boolean r2 = com.facebook.yoga.g.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.f12239s
            r3 = 7
            r2 = r2[r3]
            boolean r2 = com.facebook.yoga.g.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.f12239s
            r1 = r2[r1]
            boolean r1 = com.facebook.yoga.g.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.p r1 = r4.f12241u
            com.facebook.yoga.j r2 = com.facebook.yoga.j.fromInt(r0)
            com.facebook.react.uimanager.l0 r3 = r4.f12238r
            float r3 = r3.b(r0)
            r1.Z(r2, r3)
            goto Lb2
        L62:
            float[] r2 = r4.f12239s
            r2 = r2[r0]
            boolean r2 = com.facebook.yoga.g.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.f12239s
            r3 = 6
            r2 = r2[r3]
            boolean r2 = com.facebook.yoga.g.a(r2)
            if (r2 == 0) goto L91
            float[] r2 = r4.f12239s
            r1 = r2[r1]
            boolean r1 = com.facebook.yoga.g.a(r1)
            if (r1 == 0) goto L91
            com.facebook.yoga.p r1 = r4.f12241u
            com.facebook.yoga.j r2 = com.facebook.yoga.j.fromInt(r0)
            com.facebook.react.uimanager.l0 r3 = r4.f12238r
            float r3 = r3.b(r0)
            r1.Z(r2, r3)
            goto Lb2
        L91:
            boolean[] r1 = r4.f12240t
            boolean r1 = r1[r0]
            if (r1 == 0) goto La5
            com.facebook.yoga.p r1 = r4.f12241u
            com.facebook.yoga.j r2 = com.facebook.yoga.j.fromInt(r0)
            float[] r3 = r4.f12239s
            r3 = r3[r0]
            r1.b0(r2, r3)
            goto Lb2
        La5:
            com.facebook.yoga.p r1 = r4.f12241u
            com.facebook.yoga.j r2 = com.facebook.yoga.j.fromInt(r0)
            float[] r3 = r4.f12239s
            r3 = r3[r0]
            r1.Z(r2, r3)
        Lb2:
            int r0 = r0 + 1
            goto L1
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.d0.n1():void");
    }

    @Override // com.facebook.react.uimanager.c0
    public final float A() {
        return this.f12241u.i();
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: A0 */
    public final d0 z(int i11) {
        wf.a.c(this.f12233m);
        d0 remove = this.f12233m.remove(i11);
        remove.f12232l = null;
        return remove;
    }

    public void B0(com.facebook.yoga.a aVar) {
        this.f12241u.r(aVar);
    }

    public void C0(com.facebook.yoga.a aVar) {
        this.f12241u.s(aVar);
    }

    @Override // com.facebook.react.uimanager.c0
    public final void D(boolean z11) {
        wf.a.b(getParent() == null, "Must remove from no opt parent first");
        wf.a.b(this.f12232l == null, "Must remove from native parent first");
        wf.a.b(l() == 0, "Must remove all native children first");
        this.f12230j = z11;
    }

    public void D0(com.facebook.yoga.a aVar) {
        this.f12241u.t(aVar);
    }

    @Override // com.facebook.react.uimanager.c0
    public final void E(e0 e0Var) {
        c1.f(this, e0Var);
        x0();
    }

    public void E0(com.facebook.yoga.b bVar) {
        this.f12241u.v(bVar);
    }

    @Override // com.facebook.react.uimanager.c0
    public int F() {
        return this.f12237q;
    }

    public void F0(int i11, float f11) {
        this.f12241u.w(com.facebook.yoga.j.fromInt(i11), f11);
    }

    public void G0(int i11, float f11) {
        this.f12238r.d(i11, f11);
        n1();
    }

    @Override // com.facebook.react.uimanager.c0
    public void H() {
        if (!O()) {
            this.f12241u.c();
        } else if (getParent() != null) {
            getParent().H();
        }
    }

    public void H0(com.facebook.yoga.i iVar) {
        this.f12241u.z(iVar);
    }

    @Override // com.facebook.react.uimanager.c0
    public final void I(String str) {
        this.f12222b = str;
    }

    public void I0(float f11) {
        this.f12241u.B(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public final com.facebook.yoga.v J() {
        return this.f12241u.d();
    }

    public void J0() {
        this.f12241u.C();
    }

    @Override // com.facebook.react.uimanager.c0
    public Iterable<? extends c0> K() {
        if (t0()) {
            return null;
        }
        return this.f12227g;
    }

    public void K0(float f11) {
        this.f12241u.E(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public final int L() {
        return this.f12221a;
    }

    public void L0(com.facebook.yoga.k kVar) {
        this.f12241u.F(kVar);
    }

    @Override // com.facebook.react.uimanager.c0
    public final void M() {
        ArrayList<d0> arrayList = this.f12233m;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                this.f12233m.get(size).f12232l = null;
            }
            this.f12233m.clear();
        }
    }

    public void M0(com.facebook.yoga.w wVar) {
        this.f12241u.j0(wVar);
    }

    @Override // com.facebook.react.uimanager.c0
    public void N() {
        W(Float.NaN, Float.NaN);
    }

    public void N0(com.facebook.yoga.l lVar) {
        this.f12241u.L(lVar);
    }

    @Override // com.facebook.react.uimanager.c0
    public boolean O() {
        return false;
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: O0 */
    public final void v(d0 d0Var) {
        this.f12229i = d0Var;
    }

    @Override // com.facebook.react.uimanager.c0
    public void P(float f11) {
        this.f12241u.g0(f11);
    }

    public void P0(int i11, float f11) {
        this.f12241u.M(com.facebook.yoga.j.fromInt(i11), f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public int Q() {
        return this.f12236p;
    }

    public void Q0(int i11) {
        this.f12241u.N(com.facebook.yoga.j.fromInt(i11));
    }

    @Override // com.facebook.react.uimanager.c0
    public final n0 R() {
        return (n0) wf.a.c(this.f12224d);
    }

    public void R0(int i11, float f11) {
        this.f12241u.O(com.facebook.yoga.j.fromInt(i11), f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public l S() {
        if (O() || a0()) {
            return l.NONE;
        }
        return n0() ? l.LEAF : l.PARENT;
    }

    public void S0(com.facebook.yoga.m mVar) {
        this.f12241u.T(mVar);
    }

    @Override // com.facebook.react.uimanager.c0
    public final int T() {
        wf.a.a(this.f12223c != 0);
        return this.f12223c;
    }

    public void T0(com.facebook.yoga.s sVar) {
        this.f12241u.Y(sVar);
    }

    @Override // com.facebook.react.uimanager.c0
    public final boolean U() {
        return this.f12225e;
    }

    public void U0(int i11, float f11) {
        this.f12239s[i11] = f11;
        this.f12240t[i11] = false;
        n1();
    }

    public void V0(int i11, float f11) {
        this.f12239s[i11] = f11;
        this.f12240t[i11] = !com.facebook.yoga.g.a(f11);
        n1();
    }

    @Override // com.facebook.react.uimanager.c0
    public void W(float f11, float f12) {
        this.f12241u.b(f11, f12);
    }

    public void W0(int i11, float f11) {
        this.f12241u.c0(com.facebook.yoga.j.fromInt(i11), f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public void X(n nVar) {
    }

    public void X0(int i11, float f11) {
        this.f12241u.d0(com.facebook.yoga.j.fromInt(i11), f11);
    }

    public void Y0(com.facebook.yoga.t tVar) {
        this.f12241u.f0(tVar);
    }

    public void Z0(float f11) {
        this.f12241u.u(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public final boolean a0() {
        return this.f12230j;
    }

    public void a1() {
        this.f12241u.J();
    }

    @Override // com.facebook.react.uimanager.c0
    public final int b() {
        ArrayList<d0> arrayList = this.f12227g;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // com.facebook.react.uimanager.c0
    public final float b0() {
        return this.f12241u.h();
    }

    public void b1(float f11) {
        this.f12241u.K(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public final void c() {
        this.f12226f = false;
        if (m0()) {
            v0();
        }
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: c0 */
    public void t(d0 d0Var, int i11) {
        if (this.f12227g == null) {
            this.f12227g = new ArrayList<>(4);
        }
        this.f12227g.add(i11, d0Var);
        d0Var.f12228h = this;
        if (this.f12241u != null && !u0()) {
            com.facebook.yoga.p pVar = d0Var.f12241u;
            if (pVar != null) {
                this.f12241u.a(pVar, i11);
            } else {
                throw new RuntimeException("Cannot add a child that doesn't have a YogaNode to a parent without a measure function! (Trying to add a '" + d0Var.toString() + "' to a '" + toString() + "')");
            }
        }
        w0();
        int l02 = d0Var.l0();
        this.f12231k += l02;
        m1(l02);
    }

    public void c1(float f11) {
        this.f12241u.P(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public void d(float f11) {
        this.f12241u.I(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: d0 */
    public final void n(d0 d0Var, int i11) {
        wf.a.a(S() == l.PARENT);
        wf.a.a(d0Var.S() != l.NONE);
        if (this.f12233m == null) {
            this.f12233m = new ArrayList<>(4);
        }
        this.f12233m.add(i11, d0Var);
        d0Var.f12232l = this;
    }

    public void d1(float f11) {
        this.f12241u.Q(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public void dispose() {
        com.facebook.yoga.p pVar = this.f12241u;
        if (pVar != null) {
            pVar.q();
            h1.a().a(this.f12241u);
        }
    }

    @Override // com.facebook.react.uimanager.c0
    public void e(int i11, int i12) {
        this.f12242v = Integer.valueOf(i11);
        this.f12243w = Integer.valueOf(i12);
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: e0 */
    public final d0 a(int i11) {
        ArrayList<d0> arrayList = this.f12227g;
        if (arrayList != null) {
            return arrayList.get(i11);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i11 + " out of bounds: node has no children");
    }

    public void e1(float f11) {
        this.f12241u.R(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public void f(com.facebook.yoga.h hVar) {
        this.f12241u.y(hVar);
    }

    public final com.facebook.yoga.h f0() {
        return this.f12241u.e();
    }

    public void f1(float f11) {
        this.f12241u.S(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public final float g() {
        return this.f12241u.f();
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: g0 */
    public final d0 Y() {
        d0 d0Var = this.f12229i;
        return d0Var != null ? d0Var : Z();
    }

    public void g1(float f11) {
        this.f12241u.U(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public Integer getHeightMeasureSpec() {
        return this.f12243w;
    }

    @Override // com.facebook.react.uimanager.c0
    public Integer getWidthMeasureSpec() {
        return this.f12242v;
    }

    @Override // com.facebook.react.uimanager.c0
    public final boolean h() {
        return this.f12226f || m0() || r0();
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: h0 */
    public final int k(d0 d0Var) {
        boolean z11 = false;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= b()) {
                break;
            }
            d0 a11 = a(i11);
            if (d0Var == a11) {
                z11 = true;
                break;
            }
            i12 += a11.l0();
            i11++;
        }
        if (z11) {
            return i12;
        }
        throw new RuntimeException("Child " + d0Var.L() + " was not a child of " + this.f12221a);
    }

    public void h1(float f11) {
        this.f12241u.V(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public boolean i(float f11, float f12, y0 y0Var, n nVar) {
        if (this.f12226f) {
            y0(y0Var);
        }
        boolean z11 = false;
        if (m0()) {
            float A = A();
            float x11 = x();
            float f13 = f11 + A;
            int round = Math.round(f13);
            float f14 = f12 + x11;
            int round2 = Math.round(f14);
            int round3 = Math.round(f13 + b0());
            int round4 = Math.round(f14 + g());
            int round5 = Math.round(A);
            int round6 = Math.round(x11);
            int i11 = round3 - round;
            int i12 = round4 - round2;
            z11 = (round5 == this.f12234n && round6 == this.f12235o && i11 == this.f12236p && i12 == this.f12237q) ? true : true;
            this.f12234n = round5;
            this.f12235o = round6;
            this.f12236p = i11;
            this.f12237q = i12;
            if (z11) {
                if (nVar != null) {
                    nVar.l(this);
                } else {
                    y0Var.R(getParent().L(), L(), y(), r(), Q(), F());
                }
            }
        }
        return z11;
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: i0 */
    public final d0 Z() {
        return this.f12232l;
    }

    public void i1(float f11) {
        this.f12241u.W(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    public void j() {
        if (b() == 0) {
            return;
        }
        int i11 = 0;
        for (int b11 = b() - 1; b11 >= 0; b11--) {
            if (this.f12241u != null && !u0()) {
                this.f12241u.p(b11);
            }
            d0 a11 = a(b11);
            a11.f12228h = null;
            i11 += a11.l0();
            a11.dispose();
        }
        ((ArrayList) wf.a.c(this.f12227g)).clear();
        w0();
        this.f12231k -= i11;
        m1(-i11);
    }

    public final float j0(int i11) {
        return this.f12241u.g(com.facebook.yoga.j.fromInt(i11));
    }

    public void j1(float f11) {
        this.f12241u.X(f11);
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: k0 */
    public final d0 getParent() {
        return this.f12228h;
    }

    public void k1() {
        this.f12241u.h0();
    }

    @Override // com.facebook.react.uimanager.c0
    public final int l() {
        ArrayList<d0> arrayList = this.f12233m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public void l1(float f11) {
        this.f12241u.i0(f11);
    }

    public final boolean m0() {
        com.facebook.yoga.p pVar = this.f12241u;
        return pVar != null && pVar.l();
    }

    public boolean n0() {
        return false;
    }

    @Override // com.facebook.react.uimanager.c0
    public final void o(int i11) {
        this.f12223c = i11;
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: o0 */
    public final int V(d0 d0Var) {
        ArrayList<d0> arrayList = this.f12227g;
        if (arrayList == null) {
            return -1;
        }
        return arrayList.indexOf(d0Var);
    }

    @Override // com.facebook.react.uimanager.c0
    public void p(n0 n0Var) {
        this.f12224d = n0Var;
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: p0 */
    public final int m(d0 d0Var) {
        wf.a.c(this.f12233m);
        return this.f12233m.indexOf(d0Var);
    }

    @Override // com.facebook.react.uimanager.c0
    public final com.facebook.yoga.v q() {
        return this.f12241u.k();
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: q0 */
    public boolean C(d0 d0Var) {
        for (d0 parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent == d0Var) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.react.uimanager.c0
    public int r() {
        return this.f12235o;
    }

    public final boolean r0() {
        com.facebook.yoga.p pVar = this.f12241u;
        return pVar != null && pVar.m();
    }

    @Override // com.facebook.react.uimanager.c0
    public void s(Object obj) {
    }

    public boolean s0() {
        return this.f12241u.n();
    }

    public void setFlex(float f11) {
        this.f12241u.A(f11);
    }

    public void setFlexGrow(float f11) {
        this.f12241u.G(f11);
    }

    public void setFlexShrink(float f11) {
        this.f12241u.H(f11);
    }

    public void setShouldNotifyOnLayout(boolean z11) {
        this.f12225e = z11;
    }

    public boolean t0() {
        return false;
    }

    public String toString() {
        return "[" + this.f12222b + " " + L() + "]";
    }

    @Override // com.facebook.react.uimanager.c0
    public final String u() {
        return (String) wf.a.c(this.f12222b);
    }

    public boolean u0() {
        return s0();
    }

    public final void v0() {
        com.facebook.yoga.p pVar = this.f12241u;
        if (pVar != null) {
            pVar.o();
        }
    }

    @Override // com.facebook.react.uimanager.c0
    public void w(int i11) {
        this.f12221a = i11;
    }

    public void w0() {
        if (this.f12226f) {
            return;
        }
        this.f12226f = true;
        d0 parent = getParent();
        if (parent != null) {
            parent.w0();
        }
    }

    @Override // com.facebook.react.uimanager.c0
    public final float x() {
        return this.f12241u.j();
    }

    public void x0() {
    }

    @Override // com.facebook.react.uimanager.c0
    public int y() {
        return this.f12234n;
    }

    public void y0(y0 y0Var) {
    }

    @Override // com.facebook.react.uimanager.c0
    /* renamed from: z0 */
    public d0 G(int i11) {
        ArrayList<d0> arrayList = this.f12227g;
        if (arrayList != null) {
            d0 remove = arrayList.remove(i11);
            remove.f12228h = null;
            if (this.f12241u != null && !u0()) {
                this.f12241u.p(i11);
            }
            w0();
            int l02 = remove.l0();
            this.f12231k -= l02;
            m1(-l02);
            return remove;
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i11 + " out of bounds: node has no children");
    }
}