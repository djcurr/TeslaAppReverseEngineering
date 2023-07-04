package mq;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    final g f38685a;

    /* renamed from: b  reason: collision with root package name */
    private final e f38686b;

    /* renamed from: c  reason: collision with root package name */
    private int f38687c;

    /* renamed from: d  reason: collision with root package name */
    private String f38688d;

    /* renamed from: e  reason: collision with root package name */
    private int f38689e;

    /* renamed from: f  reason: collision with root package name */
    private a[] f38690f;

    /* renamed from: g  reason: collision with root package name */
    private int f38691g;

    /* renamed from: h  reason: collision with root package name */
    private d f38692h;

    /* renamed from: i  reason: collision with root package name */
    private int f38693i;

    /* renamed from: j  reason: collision with root package name */
    private d f38694j;

    /* renamed from: k  reason: collision with root package name */
    private int f38695k;

    /* renamed from: l  reason: collision with root package name */
    private a[] f38696l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(g gVar) {
        this.f38685a = gVar;
        this.f38686b = null;
        this.f38690f = new a[256];
        this.f38691g = 1;
        this.f38692h = new d();
    }

    private void A(int i11, String str, String str2) {
        a(new a(i11, 12, str, str2, Y(12, str, str2)));
    }

    private void E(int i11, String str) {
        a(new a(i11, 1, str, W(1, str)));
    }

    private z F(int i11, String str) {
        int W = W(i11, str);
        for (a N = N(W); N != null; N = N.f38698i) {
            if (N.f38896b == i11 && N.f38697h == W && N.f38899e.equals(str)) {
                return N;
            }
        }
        this.f38692h.e(i11, D(str));
        int i12 = this.f38691g;
        this.f38691g = i12 + 1;
        return c0(new a(i12, i11, str, W));
    }

    private void G(int i11, int i12, String str) {
        a(new a(i11, i12, str, W(i12, str)));
    }

    private int J(a aVar) {
        if (this.f38696l == null) {
            this.f38696l = new a[16];
        }
        int i11 = this.f38695k;
        a[] aVarArr = this.f38696l;
        if (i11 == aVarArr.length) {
            a[] aVarArr2 = new a[aVarArr.length * 2];
            System.arraycopy(aVarArr, 0, aVarArr2, 0, aVarArr.length);
            this.f38696l = aVarArr2;
        }
        a[] aVarArr3 = this.f38696l;
        int i12 = this.f38695k;
        this.f38695k = i12 + 1;
        aVarArr3[i12] = aVar;
        return c0(aVar).f38895a;
    }

    private void M(e eVar, char[] cArr) {
        byte[] bArr = eVar.f38729b;
        int e11 = eVar.e();
        int I = eVar.I(e11 - 2);
        while (true) {
            if (I <= 0) {
                break;
            } else if ("BootstrapMethods".equals(eVar.H(e11, cArr))) {
                this.f38693i = eVar.I(e11 + 6);
                break;
            } else {
                e11 += eVar.t(e11 + 2) + 6;
                I--;
            }
        }
        if (this.f38693i > 0) {
            int i11 = e11 + 8;
            int t11 = eVar.t(e11 + 2) - 2;
            d dVar = new d(t11);
            this.f38694j = dVar;
            dVar.h(bArr, i11, t11);
            int i12 = i11;
            for (int i13 = 0; i13 < this.f38693i; i13++) {
                int i14 = i12 - i11;
                int I2 = eVar.I(i12);
                int i15 = i12 + 2;
                int I3 = eVar.I(i15);
                i12 = i15 + 2;
                int hashCode = eVar.o(I2, cArr).hashCode();
                while (true) {
                    int i16 = I3 - 1;
                    if (I3 > 0) {
                        int I4 = eVar.I(i12);
                        i12 += 2;
                        hashCode ^= eVar.o(I4, cArr).hashCode();
                        I3 = i16;
                    }
                }
                a(new a(i13, 64, i14, hashCode & Integer.MAX_VALUE));
            }
        }
    }

    private a N(int i11) {
        a[] aVarArr = this.f38690f;
        return aVarArr[i11 % aVarArr.length];
    }

    private static int U(int i11, int i12) {
        return (i11 + i12) & Integer.MAX_VALUE;
    }

    private static int V(int i11, long j11) {
        return (i11 + ((int) j11) + ((int) (j11 >>> 32))) & Integer.MAX_VALUE;
    }

    private static int W(int i11, String str) {
        return (i11 + str.hashCode()) & Integer.MAX_VALUE;
    }

    private static int X(int i11, String str, int i12) {
        return (i11 + str.hashCode() + i12) & Integer.MAX_VALUE;
    }

    private static int Y(int i11, String str, String str2) {
        return (i11 + (str.hashCode() * str2.hashCode())) & Integer.MAX_VALUE;
    }

    private static int Z(int i11, String str, String str2, int i12) {
        return (i11 + (str.hashCode() * str2.hashCode() * (i12 + 1))) & Integer.MAX_VALUE;
    }

    private void a(a aVar) {
        this.f38689e++;
        int i11 = aVar.f38697h;
        a[] aVarArr = this.f38690f;
        int length = i11 % aVarArr.length;
        aVar.f38698i = aVarArr[length];
        aVarArr[length] = aVar;
    }

    private static int a0(int i11, String str, String str2, String str3) {
        return (i11 + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
    }

    private z b(int i11, int i12, int i13) {
        byte[] bArr = this.f38694j.f38726a;
        for (a N = N(i13); N != null; N = N.f38698i) {
            if (N.f38896b == 64 && N.f38697h == i13) {
                int i14 = (int) N.f38900f;
                boolean z11 = false;
                int i15 = 0;
                while (true) {
                    if (i15 >= i12) {
                        z11 = true;
                        break;
                    } else if (bArr[i11 + i15] != bArr[i14 + i15]) {
                        break;
                    } else {
                        i15++;
                    }
                }
                if (z11) {
                    this.f38694j.f38727b = i11;
                    return N;
                }
            }
        }
        int i16 = this.f38693i;
        this.f38693i = i16 + 1;
        return c0(new a(i16, 64, i11, i13));
    }

    private static int b0(int i11, String str, String str2, String str3, int i12) {
        return (i11 + (str.hashCode() * str2.hashCode() * str3.hashCode() * i12)) & Integer.MAX_VALUE;
    }

    private a c0(a aVar) {
        int i11 = this.f38689e;
        a[] aVarArr = this.f38690f;
        if (i11 > (aVarArr.length * 3) / 4) {
            int length = aVarArr.length;
            int i12 = (length * 2) + 1;
            a[] aVarArr2 = new a[i12];
            for (int i13 = length - 1; i13 >= 0; i13--) {
                a aVar2 = this.f38690f[i13];
                while (aVar2 != null) {
                    int i14 = aVar2.f38697h % i12;
                    a aVar3 = aVar2.f38698i;
                    aVar2.f38698i = aVarArr2[i14];
                    aVarArr2[i14] = aVar2;
                    aVar2 = aVar3;
                }
            }
            this.f38690f = aVarArr2;
        }
        this.f38689e++;
        int i15 = aVar.f38697h;
        a[] aVarArr3 = this.f38690f;
        int length2 = i15 % aVarArr3.length;
        aVar.f38698i = aVarArr3[length2];
        aVarArr3[length2] = aVar;
        return aVar;
    }

    private z h(int i11, String str, String str2, int i12) {
        int Z = Z(i11, str, str2, i12);
        for (a N = N(Z); N != null; N = N.f38698i) {
            if (N.f38896b == i11 && N.f38697h == Z && N.f38900f == i12 && N.f38898d.equals(str) && N.f38899e.equals(str2)) {
                return N;
            }
        }
        this.f38692h.f(i11, i12, z(str, str2));
        int i13 = this.f38691g;
        this.f38691g = i13 + 1;
        return c0(new a(i13, i11, null, str, str2, i12, Z));
    }

    private void i(int i11, int i12, String str, String str2, int i13) {
        a(new a(i12, i11, null, str, str2, i13, Z(i11, str, str2, i13)));
    }

    private z m(int i11, int i12) {
        int U = U(i11, i12);
        for (a N = N(U); N != null; N = N.f38698i) {
            if (N.f38896b == i11 && N.f38697h == U && N.f38900f == i12) {
                return N;
            }
        }
        this.f38692h.g(i11).i(i12);
        int i13 = this.f38691g;
        this.f38691g = i13 + 1;
        return c0(new a(i13, i11, i12, U));
    }

    private void n(int i11, int i12, int i13) {
        a(new a(i11, i12, i13, U(i12, i13)));
    }

    private z q(int i11, long j11) {
        int V = V(i11, j11);
        for (a N = N(V); N != null; N = N.f38698i) {
            if (N.f38896b == i11 && N.f38697h == V && N.f38900f == j11) {
                return N;
            }
        }
        int i12 = this.f38691g;
        this.f38692h.g(i11).j(j11);
        this.f38691g += 2;
        return c0(new a(i12, i11, j11, V));
    }

    private void r(int i11, int i12, long j11) {
        a(new a(i11, i12, j11, V(i12, j11)));
    }

    private a s(int i11, String str, String str2, String str3) {
        int a02 = a0(i11, str, str2, str3);
        for (a N = N(a02); N != null; N = N.f38698i) {
            if (N.f38896b == i11 && N.f38697h == a02 && N.f38897c.equals(str) && N.f38898d.equals(str2) && N.f38899e.equals(str3)) {
                return N;
            }
        }
        this.f38692h.f(i11, e(str).f38895a, z(str2, str3));
        int i12 = this.f38691g;
        this.f38691g = i12 + 1;
        return c0(new a(i12, i11, str, str2, str3, 0L, a02));
    }

    private void t(int i11, int i12, String str, String str2, String str3) {
        a(new a(i11, i12, str, str2, str3, 0L, a0(i12, str, str2, str3)));
    }

    private void v(int i11, int i12, String str, String str2, String str3) {
        a(new a(i11, 15, str, str2, str3, i12, b0(15, str, str2, str3, i12)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z B(String str) {
        return F(20, str);
    }

    z C(String str) {
        return F(8, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int D(String str) {
        int W = W(1, str);
        for (a N = N(W); N != null; N = N.f38698i) {
            if (N.f38896b == 1 && N.f38697h == W && N.f38899e.equals(str)) {
                return N.f38895a;
            }
        }
        this.f38692h.g(1).l(str);
        int i11 = this.f38691g;
        this.f38691g = i11 + 1;
        return c0(new a(i11, 1, str, W)).f38895a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int H(int i11, int i12) {
        long j11;
        long j12;
        if (i11 < i12) {
            j11 = i11;
            j12 = i12;
        } else {
            j11 = i12;
            j12 = i11;
        }
        long j13 = j11 | (j12 << 32);
        int U = U(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, i11 + i12);
        for (a N = N(U); N != null; N = N.f38698i) {
            if (N.f38896b == 130 && N.f38697h == U && N.f38900f == j13) {
                return N.f38901g;
            }
        }
        a[] aVarArr = this.f38696l;
        int I = I(this.f38685a.r(aVarArr[i11].f38899e, aVarArr[i12].f38899e));
        c0(new a(this.f38695k, (int) com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, j13, U)).f38901g = I;
        return I;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int I(String str) {
        int W = W(128, str);
        for (a N = N(W); N != null; N = N.f38698i) {
            if (N.f38896b == 128 && N.f38697h == W && N.f38899e.equals(str)) {
                return N.f38895a;
            }
        }
        return J(new a(this.f38695k, 128, str, W));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int K(String str, int i11) {
        int X = X(com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, str, i11);
        for (a N = N(X); N != null; N = N.f38698i) {
            if (N.f38896b == 129 && N.f38697h == X && N.f38900f == i11 && N.f38899e.equals(str)) {
                return N.f38895a;
            }
        }
        return J(new a(this.f38695k, (int) com.plaid.internal.d.SDK_ASSET_ILLUSTRATION_FORM_VALUE, str, i11, X));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int L() {
        if (this.f38694j != null) {
            D("BootstrapMethods");
            return this.f38694j.f38727b + 8;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String O() {
        return this.f38688d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int P() {
        return this.f38691g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int Q() {
        return this.f38692h.f38727b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int R() {
        return this.f38687c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e S() {
        return this.f38686b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z T(int i11) {
        return this.f38696l[i11];
    }

    z c(p pVar, Object... objArr) {
        d dVar = this.f38694j;
        if (dVar == null) {
            dVar = new d();
            this.f38694j = dVar;
        }
        int length = objArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = d(objArr[i11]).f38895a;
        }
        int i12 = dVar.f38727b;
        dVar.k(u(pVar.d(), pVar.c(), pVar.b(), pVar.a(), pVar.e()).f38895a);
        dVar.k(length);
        for (int i13 = 0; i13 < length; i13++) {
            dVar.k(iArr[i13]);
        }
        int i14 = dVar.f38727b - i12;
        int hashCode = pVar.hashCode();
        for (Object obj : objArr) {
            hashCode ^= obj.hashCode();
        }
        return b(i12, i14, hashCode & Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z d(Object obj) {
        if (obj instanceof Integer) {
            return l(((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return l(((Byte) obj).intValue());
        }
        if (obj instanceof Character) {
            return l(((Character) obj).charValue());
        }
        if (obj instanceof Short) {
            return l(((Short) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return l(((Boolean) obj).booleanValue() ? 1 : 0);
        }
        if (obj instanceof Float) {
            return k(((Float) obj).floatValue());
        }
        if (obj instanceof Long) {
            return p(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return f(((Double) obj).doubleValue());
        }
        if (obj instanceof String) {
            return C((String) obj);
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            int l11 = b0Var.l();
            if (l11 == 10) {
                return e(b0Var.f());
            }
            if (l11 == 11) {
                return w(b0Var.d());
            }
            return e(b0Var.d());
        } else if (obj instanceof p) {
            p pVar = (p) obj;
            return u(pVar.d(), pVar.c(), pVar.b(), pVar.a(), pVar.e());
        } else if (obj instanceof h) {
            h hVar = (h) obj;
            return g(hVar.d(), hVar.c(), hVar.a(), hVar.b());
        } else {
            throw new IllegalArgumentException("value " + obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d0(d dVar) {
        if (this.f38694j != null) {
            d k11 = dVar.k(D("BootstrapMethods")).i(this.f38694j.f38727b + 2).k(this.f38693i);
            d dVar2 = this.f38694j;
            k11.h(dVar2.f38726a, 0, dVar2.f38727b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z e(String str) {
        return F(7, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e0(d dVar) {
        d k11 = dVar.k(this.f38691g);
        d dVar2 = this.f38692h;
        k11.h(dVar2.f38726a, 0, dVar2.f38727b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z f(double d11) {
        return q(6, Double.doubleToRawLongBits(d11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f0(int i11, String str) {
        this.f38687c = i11;
        this.f38688d = str;
        return e(str).f38895a;
    }

    z g(String str, String str2, p pVar, Object... objArr) {
        return h(17, str, str2, c(pVar, objArr).f38895a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z j(String str, String str2, String str3) {
        return s(9, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z k(float f11) {
        return m(4, Float.floatToRawIntBits(f11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z l(int i11) {
        return m(3, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z o(String str, String str2, p pVar, Object... objArr) {
        return h(18, str, str2, c(pVar, objArr).f38895a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z p(long j11) {
        return q(5, j11);
    }

    z u(int i11, String str, String str2, String str3, boolean z11) {
        int b02 = b0(15, str, str2, str3, i11);
        for (a N = N(b02); N != null; N = N.f38698i) {
            if (N.f38896b == 15 && N.f38697h == b02 && N.f38900f == i11 && N.f38897c.equals(str) && N.f38898d.equals(str2) && N.f38899e.equals(str3)) {
                return N;
            }
        }
        if (i11 <= 4) {
            this.f38692h.d(15, i11, j(str, str2, str3).f38895a);
        } else {
            this.f38692h.d(15, i11, x(str, str2, str3, z11).f38895a);
        }
        int i12 = this.f38691g;
        this.f38691g = i12 + 1;
        return c0(new a(i12, 15, str, str2, str3, i11, b02));
    }

    z w(String str) {
        return F(16, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z x(String str, String str2, String str3, boolean z11) {
        return s(z11 ? 11 : 10, str, str2, str3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z y(String str) {
        return F(19, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int z(String str, String str2) {
        int Y = Y(12, str, str2);
        for (a N = N(Y); N != null; N = N.f38698i) {
            if (N.f38896b == 12 && N.f38697h == Y && N.f38898d.equals(str) && N.f38899e.equals(str2)) {
                return N.f38895a;
            }
        }
        this.f38692h.f(12, D(str), D(str2));
        int i11 = this.f38691g;
        this.f38691g = i11 + 1;
        return c0(new a(i11, 12, str, str2, Y)).f38895a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class a extends z {

        /* renamed from: h  reason: collision with root package name */
        final int f38697h;

        /* renamed from: i  reason: collision with root package name */
        a f38698i;

        a(int i11, int i12, String str, String str2, String str3, long j11, int i13) {
            super(i11, i12, str, str2, str3, j11);
            this.f38697h = i13;
        }

        a(int i11, int i12, String str, int i13) {
            super(i11, i12, null, null, str, 0L);
            this.f38697h = i13;
        }

        a(int i11, int i12, String str, long j11, int i13) {
            super(i11, i12, null, null, str, j11);
            this.f38697h = i13;
        }

        a(int i11, int i12, String str, String str2, int i13) {
            super(i11, i12, null, str, str2, 0L);
            this.f38697h = i13;
        }

        a(int i11, int i12, long j11, int i13) {
            super(i11, i12, null, null, null, j11);
            this.f38697h = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(g gVar, e eVar) {
        this.f38685a = gVar;
        this.f38686b = eVar;
        byte[] bArr = eVar.f38729b;
        int f11 = eVar.f(1) - 1;
        int i11 = eVar.f38728a - f11;
        this.f38691g = eVar.g();
        d dVar = new d(i11);
        this.f38692h = dVar;
        dVar.h(bArr, f11, i11);
        this.f38690f = new a[this.f38691g * 2];
        char[] cArr = new char[eVar.h()];
        boolean z11 = false;
        int i12 = 1;
        while (i12 < this.f38691g) {
            int f12 = eVar.f(i12);
            byte b11 = bArr[f12 - 1];
            switch (b11) {
                case 1:
                    E(i12, eVar.K(i12, cArr));
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    throw new IllegalArgumentException();
                case 3:
                case 4:
                    n(i12, b11, eVar.t(f12));
                    break;
                case 5:
                case 6:
                    r(i12, b11, eVar.v(f12));
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    G(i12, b11, eVar.H(f12, cArr));
                    break;
                case 9:
                case 10:
                case 11:
                    int f13 = eVar.f(eVar.I(f12 + 2));
                    t(i12, b11, eVar.m(f12, cArr), eVar.H(f13, cArr), eVar.H(f13 + 2, cArr));
                    break;
                case 12:
                    A(i12, eVar.H(f12, cArr), eVar.H(f12 + 2, cArr));
                    break;
                case 15:
                    int f14 = eVar.f(eVar.I(f12 + 1));
                    int f15 = eVar.f(eVar.I(f14 + 2));
                    v(i12, eVar.l(f12), eVar.m(f14, cArr), eVar.H(f15, cArr), eVar.H(f15 + 2, cArr));
                    break;
                case 17:
                case 18:
                    int f16 = eVar.f(eVar.I(f12 + 2));
                    i(b11, i12, eVar.H(f16, cArr), eVar.H(f16 + 2, cArr), eVar.I(f12));
                    z11 = true;
                    break;
            }
            i12 += (b11 == 5 || b11 == 6) ? 2 : 1;
        }
        if (z11) {
            M(eVar, cArr);
        }
    }
}