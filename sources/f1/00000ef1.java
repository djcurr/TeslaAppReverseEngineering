package c1;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class h1 {

    /* renamed from: a  reason: collision with root package name */
    private final i1 f8475a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f8476b;

    /* renamed from: c  reason: collision with root package name */
    private final int f8477c;

    /* renamed from: d  reason: collision with root package name */
    private final Object[] f8478d;

    /* renamed from: e  reason: collision with root package name */
    private final int f8479e;

    /* renamed from: f  reason: collision with root package name */
    private int f8480f;

    /* renamed from: g  reason: collision with root package name */
    private int f8481g;

    /* renamed from: h  reason: collision with root package name */
    private int f8482h;

    /* renamed from: i  reason: collision with root package name */
    private int f8483i;

    /* renamed from: j  reason: collision with root package name */
    private int f8484j;

    /* renamed from: k  reason: collision with root package name */
    private int f8485k;

    public h1(i1 table) {
        kotlin.jvm.internal.s.g(table, "table");
        this.f8475a = table;
        this.f8476b = table.h();
        int i11 = table.i();
        this.f8477c = i11;
        this.f8478d = table.j();
        this.f8479e = table.k();
        this.f8481g = i11;
        this.f8482h = -1;
    }

    private final Object E(int[] iArr, int i11) {
        boolean D;
        int H;
        D = j1.D(iArr, i11);
        if (D) {
            Object[] objArr = this.f8478d;
            H = j1.H(iArr, i11);
            return objArr[H];
        }
        return i.f8486a.a();
    }

    private final Object G(int[] iArr, int i11) {
        boolean B;
        int I;
        B = j1.B(iArr, i11);
        if (B) {
            Object[] objArr = this.f8478d;
            I = j1.I(iArr, i11);
            return objArr[I];
        }
        return null;
    }

    private final Object b(int[] iArr, int i11) {
        boolean A;
        int v11;
        A = j1.A(iArr, i11);
        if (A) {
            Object[] objArr = this.f8478d;
            v11 = j1.v(iArr, i11);
            return objArr[v11];
        }
        return i.f8486a.a();
    }

    public final boolean A() {
        boolean D;
        D = j1.D(this.f8476b, this.f8480f);
        return D;
    }

    public final boolean B(int i11) {
        boolean D;
        D = j1.D(this.f8476b, i11);
        return D;
    }

    public final Object C() {
        int i11;
        if (this.f8483i <= 0 && (i11 = this.f8484j) < this.f8485k) {
            Object[] objArr = this.f8478d;
            this.f8484j = i11 + 1;
            return objArr[i11];
        }
        return i.f8486a.a();
    }

    public final Object D(int i11) {
        boolean D;
        D = j1.D(this.f8476b, i11);
        if (D) {
            return E(this.f8476b, i11);
        }
        return null;
    }

    public final int F(int i11) {
        int G;
        G = j1.G(this.f8476b, i11);
        return G;
    }

    public final int H(int i11) {
        int J;
        J = j1.J(this.f8476b, i11);
        return J;
    }

    public final void I(int i11) {
        int z11;
        if (this.f8483i == 0) {
            this.f8480f = i11;
            int J = i11 < this.f8477c ? j1.J(this.f8476b, i11) : -1;
            this.f8482h = J;
            if (J >= 0) {
                z11 = j1.z(this.f8476b, J);
                this.f8481g = J + z11;
            } else {
                this.f8481g = this.f8477c;
            }
            this.f8484j = 0;
            this.f8485k = 0;
            return;
        }
        throw new IllegalArgumentException("Cannot reposition while in an empty region".toString());
    }

    public final void J(int i11) {
        int z11;
        z11 = j1.z(this.f8476b, i11);
        int i12 = z11 + i11;
        int i13 = this.f8480f;
        if (i13 >= i11 && i13 <= i12) {
            this.f8482h = i11;
            this.f8481g = i12;
            this.f8484j = 0;
            this.f8485k = 0;
            return;
        }
        throw new IllegalArgumentException(("Index " + i11 + " is not a parent of " + i13).toString());
    }

    public final int K() {
        boolean D;
        int z11;
        if (this.f8483i == 0) {
            D = j1.D(this.f8476b, this.f8480f);
            int G = D ? 1 : j1.G(this.f8476b, this.f8480f);
            int i11 = this.f8480f;
            z11 = j1.z(this.f8476b, i11);
            this.f8480f = i11 + z11;
            return G;
        }
        throw new IllegalArgumentException("Cannot skip while in an empty region".toString());
    }

    public final void L() {
        if (this.f8483i == 0) {
            this.f8480f = this.f8481g;
            return;
        }
        throw new IllegalArgumentException("Cannot skip the enclosing group while in an empty region".toString());
    }

    public final void M() {
        int J;
        int z11;
        int L;
        int x11;
        if (this.f8483i <= 0) {
            J = j1.J(this.f8476b, this.f8480f);
            if (J == this.f8482h) {
                int i11 = this.f8480f;
                this.f8482h = i11;
                z11 = j1.z(this.f8476b, i11);
                this.f8481g = i11 + z11;
                int i12 = this.f8480f;
                int i13 = i12 + 1;
                this.f8480f = i13;
                L = j1.L(this.f8476b, i12);
                this.f8484j = L;
                if (i12 < this.f8477c - 1) {
                    x11 = j1.x(this.f8476b, i13);
                } else {
                    x11 = this.f8479e;
                }
                this.f8485k = x11;
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final void N() {
        boolean D;
        if (this.f8483i <= 0) {
            D = j1.D(this.f8476b, this.f8480f);
            if (D) {
                M();
                return;
            }
            throw new IllegalArgumentException("Expected a node group".toString());
        }
    }

    public final d a(int i11) {
        int K;
        ArrayList<d> f11 = this.f8475a.f();
        K = j1.K(f11, i11, this.f8477c);
        if (K < 0) {
            d dVar = new d(i11);
            f11.add(-(K + 1), dVar);
            return dVar;
        }
        d dVar2 = f11.get(K);
        kotlin.jvm.internal.s.f(dVar2, "get(location)");
        return dVar2;
    }

    public final void c() {
        this.f8483i++;
    }

    public final void d() {
        this.f8475a.c(this);
    }

    public final void e() {
        int i11 = this.f8483i;
        if (i11 > 0) {
            this.f8483i = i11 - 1;
            return;
        }
        throw new IllegalArgumentException("Unbalanced begin/end empty".toString());
    }

    public final void f() {
        int J;
        int z11;
        int i11;
        if (this.f8483i == 0) {
            if (this.f8480f == this.f8481g) {
                J = j1.J(this.f8476b, this.f8482h);
                this.f8482h = J;
                if (J >= 0) {
                    z11 = j1.z(this.f8476b, J);
                    i11 = J + z11;
                } else {
                    i11 = this.f8477c;
                }
                this.f8481g = i11;
                return;
            }
            throw new IllegalArgumentException("endGroup() not called at the end of a group".toString());
        }
    }

    public final List<i0> g() {
        int E;
        boolean D;
        int z11;
        ArrayList arrayList = new ArrayList();
        if (this.f8483i > 0) {
            return arrayList;
        }
        int i11 = this.f8480f;
        int i12 = 0;
        while (i11 < this.f8481g) {
            E = j1.E(this.f8476b, i11);
            Object G = G(this.f8476b, i11);
            D = j1.D(this.f8476b, i11);
            arrayList.add(new i0(E, G, i11, D ? 1 : j1.G(this.f8476b, i11), i12));
            z11 = j1.z(this.f8476b, i11);
            i11 += z11;
            i12++;
        }
        return arrayList;
    }

    public final int h() {
        return this.f8480f;
    }

    public final Object i() {
        int i11 = this.f8480f;
        if (i11 < this.f8481g) {
            return b(this.f8476b, i11);
        }
        return 0;
    }

    public final int j() {
        return this.f8481g;
    }

    public final int k() {
        int E;
        int i11 = this.f8480f;
        if (i11 < this.f8481g) {
            E = j1.E(this.f8476b, i11);
            return E;
        }
        return 0;
    }

    public final Object l() {
        int i11 = this.f8480f;
        if (i11 < this.f8481g) {
            return G(this.f8476b, i11);
        }
        return null;
    }

    public final int m() {
        int z11;
        z11 = j1.z(this.f8476b, this.f8480f);
        return z11;
    }

    public final int n() {
        int L;
        int i11 = this.f8484j;
        L = j1.L(this.f8476b, this.f8482h);
        return i11 - L;
    }

    public final boolean o() {
        return this.f8483i > 0;
    }

    public final int p() {
        return this.f8482h;
    }

    public final int q() {
        int G;
        int i11 = this.f8482h;
        if (i11 >= 0) {
            G = j1.G(this.f8476b, i11);
            return G;
        }
        return 0;
    }

    public final int r() {
        return this.f8477c;
    }

    public final i1 s() {
        return this.f8475a;
    }

    public final Object t(int i11) {
        return b(this.f8476b, i11);
    }

    public final Object u(int i11) {
        int L;
        int i12 = this.f8480f;
        L = j1.L(this.f8476b, i12);
        int i13 = i12 + 1;
        int i14 = L + i11;
        return i14 < (i13 < this.f8477c ? j1.x(this.f8476b, i13) : this.f8479e) ? this.f8478d[i14] : i.f8486a.a();
    }

    public final int v(int i11) {
        int E;
        E = j1.E(this.f8476b, i11);
        return E;
    }

    public final Object w(int i11) {
        return G(this.f8476b, i11);
    }

    public final int x(int i11) {
        int z11;
        z11 = j1.z(this.f8476b, i11);
        return z11;
    }

    public final boolean y(int i11) {
        boolean B;
        B = j1.B(this.f8476b, i11);
        return B;
    }

    public final boolean z() {
        return o() || this.f8480f == this.f8481g;
    }
}