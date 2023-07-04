package c1;

import c1.i;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a */
    private final i1 f8589a;

    /* renamed from: b */
    private int[] f8590b;

    /* renamed from: c */
    private Object[] f8591c;

    /* renamed from: d */
    private ArrayList<d> f8592d;

    /* renamed from: e */
    private int f8593e;

    /* renamed from: f */
    private int f8594f;

    /* renamed from: g */
    private int f8595g;

    /* renamed from: h */
    private int f8596h;

    /* renamed from: i */
    private int f8597i;

    /* renamed from: j */
    private int f8598j;

    /* renamed from: k */
    private int f8599k;

    /* renamed from: l */
    private int f8600l;

    /* renamed from: m */
    private int f8601m;

    /* renamed from: n */
    private int f8602n;

    /* renamed from: o */
    private final e0 f8603o;

    /* renamed from: p */
    private final e0 f8604p;

    /* renamed from: q */
    private final e0 f8605q;

    /* renamed from: r */
    private int f8606r;

    /* renamed from: s */
    private int f8607s;

    /* renamed from: t */
    private boolean f8608t;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<Object>, i00.a {

        /* renamed from: a */
        private int f8609a;

        /* renamed from: b */
        final /* synthetic */ int f8610b;

        /* renamed from: c */
        final /* synthetic */ int f8611c;

        /* renamed from: d */
        final /* synthetic */ k1 f8612d;

        a(int i11, int i12, k1 k1Var) {
            this.f8610b = i11;
            this.f8611c = i12;
            this.f8612d = k1Var;
            this.f8609a = i11;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8609a < this.f8611c;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (hasNext()) {
                Object[] objArr = this.f8612d.f8591c;
                k1 k1Var = this.f8612d;
                int i11 = this.f8609a;
                this.f8609a = i11 + 1;
                return objArr[k1Var.l(i11)];
            }
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public k1(i1 table) {
        kotlin.jvm.internal.s.g(table, "table");
        this.f8589a = table;
        this.f8590b = table.h();
        this.f8591c = table.j();
        this.f8592d = table.f();
        this.f8593e = table.i();
        this.f8594f = (this.f8590b.length / 5) - table.i();
        this.f8595g = table.i();
        this.f8598j = table.k();
        this.f8599k = this.f8591c.length - table.k();
        this.f8600l = table.i();
        this.f8603o = new e0();
        this.f8604p = new e0();
        this.f8605q = new e0();
        this.f8607s = -1;
    }

    private final void E(int i11) {
        if (i11 > 0) {
            int i12 = this.f8606r;
            J(i12);
            int i13 = this.f8593e;
            int i14 = this.f8594f;
            int[] iArr = this.f8590b;
            int length = iArr.length / 5;
            int i15 = length - i14;
            if (i14 < i11) {
                int max = Math.max(Math.max(length * 2, i15 + i11), 32);
                int[] iArr2 = new int[max * 5];
                int i16 = max - i15;
                wz.o.i(iArr, iArr2, 0, 0, i13 * 5);
                wz.o.i(iArr, iArr2, (i13 + i16) * 5, (i14 + i13) * 5, length * 5);
                this.f8590b = iArr2;
                i14 = i16;
            }
            int i17 = this.f8595g;
            if (i17 >= i13) {
                this.f8595g = i17 + i11;
            }
            int i18 = i13 + i11;
            this.f8593e = i18;
            this.f8594f = i14 - i11;
            int m11 = m(i15 > 0 ? j(i12 + i11) : 0, this.f8600l >= i13 ? this.f8598j : 0, this.f8599k, this.f8591c.length);
            for (int i19 = i13; i19 < i18; i19++) {
                j1.M(this.f8590b, i19, m11);
            }
            int i21 = this.f8600l;
            if (i21 >= i13) {
                this.f8600l = i21 + i11;
            }
        }
    }

    private final void F(int i11, int i12) {
        if (i11 > 0) {
            K(this.f8596h, i12);
            int i13 = this.f8598j;
            int i14 = this.f8599k;
            if (i14 < i11) {
                Object[] objArr = this.f8591c;
                int length = objArr.length;
                int i15 = length - i14;
                int max = Math.max(Math.max(length * 2, i15 + i11), 32);
                Object[] objArr2 = new Object[max];
                for (int i16 = 0; i16 < max; i16++) {
                    objArr2[i16] = null;
                }
                int i17 = max - i15;
                wz.l.k(objArr, objArr2, 0, 0, i13);
                wz.l.k(objArr, objArr2, i13 + i17, i14 + i13, length);
                this.f8591c = objArr2;
                i14 = i17;
            }
            int i18 = this.f8597i;
            if (i18 >= i13) {
                this.f8597i = i18 + i11;
            }
            this.f8598j = i13 + i11;
            this.f8599k = i14 - i11;
        }
    }

    private final void G(int i11, int i12, int i13) {
        int F;
        int F2;
        int i14 = i13 + i11;
        int w11 = w();
        F = j1.F(this.f8592d, i11, w11);
        ArrayList arrayList = new ArrayList();
        if (F >= 0) {
            while (F < this.f8592d.size()) {
                d dVar = this.f8592d.get(F);
                kotlin.jvm.internal.s.f(dVar, "anchors[index]");
                d dVar2 = dVar;
                int e11 = e(dVar2);
                if (e11 < i11 || e11 >= i14) {
                    break;
                }
                arrayList.add(dVar2);
                this.f8592d.remove(F);
            }
        }
        int i15 = i12 - i11;
        int i16 = 0;
        int size = arrayList.size();
        while (i16 < size) {
            int i17 = i16 + 1;
            d dVar3 = (d) arrayList.get(i16);
            int e12 = e(dVar3) + i15;
            if (e12 >= this.f8593e) {
                dVar3.c(-(w11 - e12));
            } else {
                dVar3.c(e12);
            }
            F2 = j1.F(this.f8592d, e12, w11);
            this.f8592d.add(F2, dVar3);
            i16 = i17;
        }
    }

    private final void J(int i11) {
        int J;
        int i12 = this.f8594f;
        int i13 = this.f8593e;
        if (i13 != i11) {
            if (!this.f8592d.isEmpty()) {
                k0(i13, i11);
            }
            if (i12 > 0) {
                int[] iArr = this.f8590b;
                int i14 = i11 * 5;
                int i15 = i12 * 5;
                int i16 = i13 * 5;
                if (i11 < i13) {
                    wz.o.i(iArr, iArr, i15 + i14, i14, i16);
                } else {
                    wz.o.i(iArr, iArr, i16, i16 + i15, i14 + i15);
                }
            }
            if (i11 < i13) {
                i13 = i11 + i12;
            }
            int s11 = s();
            k.Q(i13 < s11);
            while (i13 < s11) {
                J = j1.J(this.f8590b, i13);
                int R = R(Q(J), i11);
                if (R != J) {
                    j1.P(this.f8590b, i13, R);
                }
                i13++;
                if (i13 == i11) {
                    i13 += i12;
                }
            }
        }
        this.f8593e = i11;
    }

    private final void K(int i11, int i12) {
        int x11;
        int x12;
        int i13 = this.f8599k;
        int i14 = this.f8598j;
        int i15 = this.f8600l;
        if (i14 != i11) {
            Object[] objArr = this.f8591c;
            if (i11 < i14) {
                wz.l.k(objArr, objArr, i11 + i13, i11, i14);
            } else {
                wz.l.k(objArr, objArr, i14, i14 + i13, i11 + i13);
            }
            wz.o.t(objArr, null, i11, i11 + i13);
        }
        int min = Math.min(i12 + 1, w());
        if (i15 != min) {
            int length = this.f8591c.length - i13;
            if (min < i15) {
                int z11 = z(min);
                int z12 = z(i15);
                int i16 = this.f8593e;
                while (z11 < z12) {
                    x12 = j1.x(this.f8590b, z11);
                    if (x12 >= 0) {
                        j1.M(this.f8590b, z11, -((length - x12) + 1));
                        z11++;
                        if (z11 == i16) {
                            z11 += this.f8594f;
                        }
                    } else {
                        k.r("Unexpected anchor value, expected a positive anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            } else {
                int z13 = z(i15);
                int z14 = z(min);
                while (z13 < z14) {
                    x11 = j1.x(this.f8590b, z13);
                    if (x11 < 0) {
                        j1.M(this.f8590b, z13, x11 + length + 1);
                        z13++;
                        if (z13 == this.f8593e) {
                            z13 += this.f8594f;
                        }
                    } else {
                        k.r("Unexpected anchor value, expected a negative anchor".toString());
                        throw new KotlinNothingValueException();
                    }
                }
            }
            this.f8600l = min;
        }
        this.f8598j = i11;
    }

    private final int N(int[] iArr, int i11) {
        return k(iArr, i11);
    }

    private final int P(int[] iArr, int i11) {
        int J;
        J = j1.J(iArr, z(i11));
        return Q(J);
    }

    private final int Q(int i11) {
        return i11 > -2 ? i11 : w() + i11 + 2;
    }

    private final int R(int i11, int i12) {
        return i11 < i12 ? i11 : -((w() - i11) + 2);
    }

    private final boolean S(int i11, int i12) {
        int F;
        int i13 = i12 + i11;
        F = j1.F(this.f8592d, i13, s() - this.f8594f);
        if (F >= this.f8592d.size()) {
            F--;
        }
        int i14 = F + 1;
        int i15 = 0;
        while (F >= 0) {
            d dVar = this.f8592d.get(F);
            kotlin.jvm.internal.s.f(dVar, "anchors[index]");
            d dVar2 = dVar;
            int e11 = e(dVar2);
            if (e11 < i11) {
                break;
            }
            if (e11 < i13) {
                dVar2.c(Integer.MIN_VALUE);
                if (i15 == 0) {
                    i15 = F + 1;
                }
                i14 = F;
            }
            F--;
        }
        boolean z11 = i14 < i15;
        if (z11) {
            this.f8592d.subList(i14, i15).clear();
        }
        return z11;
    }

    private final boolean U(int i11, int i12) {
        if (i12 > 0) {
            ArrayList<d> arrayList = this.f8592d;
            J(i11);
            r0 = arrayList.isEmpty() ^ true ? S(i11, i12) : false;
            this.f8593e = i11;
            this.f8594f += i12;
            int i13 = this.f8600l;
            if (i13 > i11) {
                this.f8600l = i13 - i12;
            }
            int i14 = this.f8595g;
            if (i14 >= i11) {
                this.f8595g = i14 - i12;
            }
        }
        return r0;
    }

    private final void V(int i11, int i12, int i13) {
        if (i12 > 0) {
            int i14 = this.f8599k;
            int i15 = i11 + i12;
            K(i15, i13);
            this.f8598j = i11;
            this.f8599k = i14 + i12;
            wz.o.t(this.f8591c, null, i11, i15);
            int i16 = this.f8597i;
            if (i16 >= i11) {
                this.f8597i = i16 - i12;
            }
        }
    }

    private final int W() {
        int s11 = (s() - this.f8594f) - this.f8604p.f();
        this.f8595g = s11;
        return s11;
    }

    private final void X() {
        this.f8604p.g((s() - this.f8594f) - this.f8595g);
    }

    private final int d0(int[] iArr, int i11) {
        int L;
        if (i11 >= s()) {
            return this.f8591c.length - this.f8599k;
        }
        L = j1.L(iArr, i11);
        return i(L, this.f8599k, this.f8591c.length);
    }

    private final int f(int[] iArr, int i11) {
        int y11;
        int w11;
        int k11 = k(iArr, i11);
        y11 = j1.y(iArr, i11);
        w11 = j1.w(y11 >> 29);
        return k11 + w11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void h0(int i11, Object obj, boolean z11, Object obj2) {
        int G;
        int z12;
        int i12;
        byte b11 = this.f8601m > 0 ? (byte) 1 : (byte) 0;
        this.f8605q.g(this.f8602n);
        if (b11 != 0) {
            E(1);
            int i13 = this.f8606r;
            int z13 = z(i13);
            i.a aVar = i.f8486a;
            int i14 = obj != aVar.a() ? 1 : 0;
            int i15 = (z11 || obj2 == aVar.a()) ? 0 : 1;
            j1.C(this.f8590b, z13, i11, z11, i14, i15, this.f8607s, this.f8596h);
            this.f8597i = this.f8596h;
            int i16 = (z11 ? 1 : 0) + i14 + i15;
            if (i16 > 0) {
                F(i16, i13);
                Object[] objArr = this.f8591c;
                int i17 = this.f8596h;
                if (z11) {
                    objArr[i17] = obj2;
                    i17++;
                }
                if (i14 != 0) {
                    objArr[i17] = obj;
                    i17++;
                }
                if (i15 != 0) {
                    objArr[i17] = obj2;
                    i17++;
                }
                this.f8596h = i17;
            }
            this.f8602n = 0;
            i12 = i13 + 1;
            this.f8607s = i13;
            this.f8606r = i12;
        } else {
            this.f8603o.g(this.f8607s);
            X();
            int i18 = this.f8606r;
            int z14 = z(i18);
            if (!kotlin.jvm.internal.s.c(obj2, i.f8486a.a())) {
                if (z11) {
                    o0(obj2);
                } else {
                    l0(obj2);
                }
            }
            this.f8596h = d0(this.f8590b, z14);
            this.f8597i = k(this.f8590b, z(this.f8606r + 1));
            G = j1.G(this.f8590b, z14);
            this.f8602n = G;
            this.f8607s = i18;
            this.f8606r = i18 + 1;
            z12 = j1.z(this.f8590b, z14);
            i12 = i18 + z12;
        }
        this.f8595g = i12;
    }

    private final int i(int i11, int i12, int i13) {
        return i11 < 0 ? (i13 - i12) + i11 + 1 : i11;
    }

    private final int j(int i11) {
        return k(this.f8590b, z(i11));
    }

    private final int k(int[] iArr, int i11) {
        int x11;
        if (i11 >= s()) {
            return this.f8591c.length - this.f8599k;
        }
        x11 = j1.x(iArr, i11);
        return i(x11, this.f8599k, this.f8591c.length);
    }

    private final void k0(int i11, int i12) {
        int F;
        int F2;
        int i13;
        int s11 = s() - this.f8594f;
        if (i11 < i12) {
            for (F2 = j1.F(this.f8592d, i11, s11); F2 < this.f8592d.size(); F2++) {
                d dVar = this.f8592d.get(F2);
                kotlin.jvm.internal.s.f(dVar, "anchors[index]");
                d dVar2 = dVar;
                int a11 = dVar2.a();
                if (a11 >= 0 || (i13 = a11 + s11) >= i12) {
                    return;
                }
                dVar2.c(i13);
            }
            return;
        }
        for (F = j1.F(this.f8592d, i12, s11); F < this.f8592d.size(); F++) {
            d dVar3 = this.f8592d.get(F);
            kotlin.jvm.internal.s.f(dVar3, "anchors[index]");
            d dVar4 = dVar3;
            int a12 = dVar4.a();
            if (a12 < 0) {
                return;
            }
            dVar4.c(-(s11 - a12));
        }
    }

    public final int l(int i11) {
        return i11 < this.f8598j ? i11 : i11 + this.f8599k;
    }

    private final int m(int i11, int i12, int i13, int i14) {
        return i11 > i12 ? -(((i14 - i13) - i11) + 1) : i11;
    }

    private final void m0(int[] iArr, int i11, int i12) {
        j1.M(iArr, i11, m(i12, this.f8598j, this.f8599k, this.f8591c.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void p0(int r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.z(r4)
            int[] r1 = r3.f8590b
            int r2 = r1.length
            if (r0 >= r2) goto L11
            boolean r1 = c1.j1.i(r1, r0)
            if (r1 == 0) goto L11
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 == 0) goto L23
            java.lang.Object[] r4 = r3.f8591c
            int[] r1 = r3.f8590b
            int r0 = r3.N(r1, r0)
            int r0 = r3.l(r0)
            r4[r0] = r5
            return
        L23:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Updating the node of a group at "
            r5.append(r0)
            r5.append(r4)
            java.lang.String r4 = " that was not created with as a node group"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = r4.toString()
            c1.k.r(r4)
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.k1.p0(int, java.lang.Object):void");
    }

    private final void r(int i11, int i12, int i13) {
        int z11;
        int R = R(i11, this.f8593e);
        while (i13 < i12) {
            j1.P(this.f8590b, z(i13), R);
            z11 = j1.z(this.f8590b, z(i13));
            int i14 = z11 + i13;
            r(i13, i14, i13 + 1);
            i13 = i14;
        }
    }

    private final int s() {
        return this.f8590b.length / 5;
    }

    private final int z(int i11) {
        return i11 < this.f8593e ? i11 : i11 + this.f8594f;
    }

    public final int A(int i11) {
        int E;
        E = j1.E(this.f8590b, z(i11));
        return E;
    }

    public final Object B(int i11) {
        boolean B;
        int I;
        int z11 = z(i11);
        B = j1.B(this.f8590b, z11);
        if (B) {
            Object[] objArr = this.f8591c;
            I = j1.I(this.f8590b, z11);
            return objArr[I];
        }
        return null;
    }

    public final int C(int i11) {
        int z11;
        z11 = j1.z(this.f8590b, z(i11));
        return z11;
    }

    public final Iterator<Object> D() {
        int k11 = k(this.f8590b, z(this.f8606r));
        int[] iArr = this.f8590b;
        int i11 = this.f8606r;
        return new a(k11, k(iArr, z(i11 + C(i11))), this);
    }

    public final List<d> H(i1 table, int i11) {
        int F;
        int F2;
        List<d> i12;
        ArrayList arrayList;
        boolean D;
        int F3;
        int i13;
        int i14;
        int J;
        kotlin.jvm.internal.s.g(table, "table");
        if (this.f8601m > 0) {
            if (i11 == 0 && this.f8606r == 0 && this.f8589a.i() == 0) {
                int[] iArr = this.f8590b;
                Object[] objArr = this.f8591c;
                ArrayList<d> arrayList2 = this.f8592d;
                int[] h11 = table.h();
                int i15 = table.i();
                Object[] j11 = table.j();
                int k11 = table.k();
                this.f8590b = h11;
                this.f8591c = j11;
                this.f8592d = table.f();
                this.f8593e = i15;
                this.f8594f = (h11.length / 5) - i15;
                this.f8598j = k11;
                this.f8599k = j11.length - k11;
                this.f8600l = i15;
                table.r(iArr, 0, objArr, 0, arrayList2);
                return this.f8592d;
            }
            k1 p11 = table.p();
            try {
                int C = p11.C(i11);
                int i16 = i11 + C;
                int j12 = p11.j(i11);
                int j13 = p11.j(i16);
                int i17 = j13 - j12;
                E(C);
                F(i17, u());
                int[] iArr2 = this.f8590b;
                int u11 = u();
                wz.o.i(p11.f8590b, iArr2, u11 * 5, i11 * 5, i16 * 5);
                Object[] objArr2 = this.f8591c;
                int i18 = this.f8596h;
                wz.l.k(p11.f8591c, objArr2, i18, j12, j13);
                j1.P(iArr2, u11, v());
                int i19 = u11 - i11;
                int i21 = C + u11;
                int k12 = i18 - k(iArr2, u11);
                int i22 = this.f8600l;
                int i23 = this.f8599k;
                int length = objArr2.length;
                int i24 = u11;
                while (i24 < i21) {
                    int i25 = i24 + 1;
                    if (i24 != u11) {
                        J = j1.J(iArr2, i24);
                        j1.P(iArr2, i24, J + i19);
                    }
                    int k13 = k(iArr2, i24) + k12;
                    if (i22 < i24) {
                        i13 = k12;
                        i14 = 0;
                    } else {
                        i13 = k12;
                        i14 = this.f8598j;
                    }
                    j1.M(iArr2, i24, m(k13, i14, i23, length));
                    if (i24 == i22) {
                        i22++;
                    }
                    i24 = i25;
                    k12 = i13;
                }
                this.f8600l = i22;
                F = j1.F(table.f(), i11, table.i());
                F2 = j1.F(table.f(), i16, table.i());
                if (F < F2) {
                    ArrayList<d> f11 = table.f();
                    ArrayList arrayList3 = new ArrayList(F2 - F);
                    int i26 = F;
                    while (i26 < F2) {
                        int i27 = i26 + 1;
                        d dVar = f11.get(i26);
                        kotlin.jvm.internal.s.f(dVar, "sourceAnchors[anchorIndex]");
                        d dVar2 = dVar;
                        dVar2.c(dVar2.a() + i19);
                        arrayList3.add(dVar2);
                        i26 = i27;
                    }
                    F3 = j1.F(this.f8592d, u(), w());
                    x().f().addAll(F3, arrayList3);
                    f11.subList(F, F2).clear();
                    arrayList = arrayList3;
                } else {
                    i12 = wz.w.i();
                    arrayList = i12;
                }
                int O = p11.O(i11);
                if (O >= 0) {
                    p11.f0();
                    p11.c(O - p11.u());
                    p11.f0();
                }
                p11.c(i11 - p11.u());
                boolean T = p11.T();
                if (O >= 0) {
                    p11.c0();
                    p11.n();
                    p11.c0();
                    p11.n();
                }
                if (!T) {
                    int i28 = this.f8602n;
                    D = j1.D(iArr2, u11);
                    this.f8602n = i28 + (D ? 1 : j1.G(iArr2, u11));
                    this.f8606r = i21;
                    this.f8596h = i18 + i17;
                    return arrayList;
                }
                k.r("Unexpectedly removed anchors".toString());
                throw new KotlinNothingValueException();
            } finally {
                p11.h();
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final void I(int i11) {
        int z11;
        int z12;
        if (!(this.f8601m == 0)) {
            throw new IllegalArgumentException("Cannot move a group while inserting".toString());
        }
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
        }
        if (i11 == 0) {
            return;
        }
        int i12 = this.f8606r;
        int i13 = this.f8607s;
        int i14 = this.f8595g;
        int i15 = i12;
        for (int i16 = i11; i16 > 0; i16--) {
            z12 = j1.z(this.f8590b, z(i15));
            i15 += z12;
            if (!(i15 <= i14)) {
                throw new IllegalArgumentException("Parameter offset is out of bounds".toString());
            }
        }
        z11 = j1.z(this.f8590b, z(i15));
        int i17 = this.f8596h;
        int k11 = k(this.f8590b, z(i15));
        int i18 = i15 + z11;
        int k12 = k(this.f8590b, z(i18));
        int i19 = k12 - k11;
        F(i19, Math.max(this.f8606r - 1, 0));
        E(z11);
        int[] iArr = this.f8590b;
        int z13 = z(i18) * 5;
        wz.o.i(iArr, iArr, z(i12) * 5, z13, (z11 * 5) + z13);
        if (i19 > 0) {
            Object[] objArr = this.f8591c;
            wz.l.k(objArr, objArr, i17, l(k11 + i19), l(k12 + i19));
        }
        int i21 = k11 + i19;
        int i22 = i21 - i17;
        int i23 = this.f8598j;
        int i24 = this.f8599k;
        int length = this.f8591c.length;
        int i25 = this.f8600l;
        int i26 = i12 + z11;
        int i27 = i12;
        while (i27 < i26) {
            int i28 = i27 + 1;
            int z14 = z(i27);
            int i29 = i22;
            m0(iArr, z14, m(k(iArr, z14) - i22, i25 < z14 ? 0 : i23, i24, length));
            i22 = i29;
            i27 = i28;
        }
        G(i18, i12, z11);
        if (!U(i18, z11)) {
            r(i13, this.f8595g, i12);
            if (i19 > 0) {
                V(i21, i19, i18 - 1);
                return;
            }
            return;
        }
        k.r("Unexpectedly removed anchors".toString());
        throw new KotlinNothingValueException();
    }

    public final Object L(int i11) {
        boolean D;
        int z11 = z(i11);
        D = j1.D(this.f8590b, z11);
        if (D) {
            return this.f8591c[l(N(this.f8590b, z11))];
        }
        return null;
    }

    public final Object M(d anchor) {
        kotlin.jvm.internal.s.g(anchor, "anchor");
        return L(anchor.e(this));
    }

    public final int O(int i11) {
        return P(this.f8590b, i11);
    }

    public final boolean T() {
        if (this.f8601m == 0) {
            int i11 = this.f8606r;
            int i12 = this.f8596h;
            int b02 = b0();
            boolean U = U(i11, this.f8606r - i11);
            V(i12, this.f8596h - i12, i11 - 1);
            this.f8606r = i11;
            this.f8596h = i12;
            this.f8602n -= b02;
            return U;
        }
        throw new IllegalArgumentException("Cannot remove group while inserting".toString());
    }

    public final Object Y(int i11, Object obj) {
        int d02 = d0(this.f8590b, z(this.f8606r));
        boolean z11 = true;
        int i12 = d02 + i11;
        if ((i12 < d02 || i12 >= k(this.f8590b, z(this.f8606r + 1))) ? false : false) {
            int l11 = l(i12);
            Object[] objArr = this.f8591c;
            Object obj2 = objArr[l11];
            objArr[l11] = obj;
            return obj2;
        }
        k.r(("Write to an invalid slot index " + i11 + " for group " + u()).toString());
        throw new KotlinNothingValueException();
    }

    public final void Z(Object obj) {
        int i11 = this.f8596h;
        if (i11 <= this.f8597i) {
            this.f8591c[l(i11 - 1)] = obj;
        } else {
            k.r("Writing to an invalid slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final Object a0() {
        if (this.f8601m > 0) {
            F(1, this.f8607s);
        }
        Object[] objArr = this.f8591c;
        int i11 = this.f8596h;
        this.f8596h = i11 + 1;
        return objArr[l(i11)];
    }

    public final int b0() {
        int z11;
        boolean D;
        int G;
        int z12 = z(this.f8606r);
        int i11 = this.f8606r;
        z11 = j1.z(this.f8590b, z12);
        int i12 = i11 + z11;
        this.f8606r = i12;
        this.f8596h = k(this.f8590b, z(i12));
        D = j1.D(this.f8590b, z12);
        if (D) {
            return 1;
        }
        G = j1.G(this.f8590b, z12);
        return G;
    }

    public final void c(int i11) {
        boolean z11 = true;
        if (i11 >= 0) {
            if (this.f8601m <= 0) {
                int i12 = this.f8606r + i11;
                if (i12 < this.f8607s || i12 > this.f8595g) {
                    z11 = false;
                }
                if (z11) {
                    this.f8606r = i12;
                    int k11 = k(this.f8590b, z(i12));
                    this.f8596h = k11;
                    this.f8597i = k11;
                    return;
                }
                k.r(("Cannot seek outside the current group (" + v() + CoreConstants.DASH_CHAR + this.f8595g + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
                throw new KotlinNothingValueException();
            }
            throw new IllegalStateException("Cannot call seek() while inserting".toString());
        }
        throw new IllegalArgumentException("Cannot seek backwards".toString());
    }

    public final void c0() {
        int i11 = this.f8595g;
        this.f8606r = i11;
        this.f8596h = k(this.f8590b, z(i11));
    }

    public final d d(int i11) {
        int K;
        ArrayList<d> arrayList = this.f8592d;
        K = j1.K(arrayList, i11, w());
        if (K < 0) {
            if (i11 > this.f8593e) {
                i11 = -(w() - i11);
            }
            d dVar = new d(i11);
            arrayList.add(-(K + 1), dVar);
            return dVar;
        }
        d dVar2 = arrayList.get(K);
        kotlin.jvm.internal.s.f(dVar2, "get(location)");
        return dVar2;
    }

    public final int e(d anchor) {
        kotlin.jvm.internal.s.g(anchor, "anchor");
        int a11 = anchor.a();
        return a11 < 0 ? a11 + w() : a11;
    }

    public final void e0(int i11, Object obj, Object obj2) {
        h0(i11, obj, false, obj2);
    }

    public final void f0() {
        if (this.f8601m == 0) {
            i.a aVar = i.f8486a;
            h0(0, aVar.a(), false, aVar.a());
            return;
        }
        throw new IllegalArgumentException("Key must be supplied when inserting".toString());
    }

    public final void g() {
        int i11 = this.f8601m;
        this.f8601m = i11 + 1;
        if (i11 == 0) {
            X();
        }
    }

    public final void g0(int i11, Object obj) {
        h0(i11, obj, false, i.f8486a.a());
    }

    public final void h() {
        this.f8608t = true;
        J(w());
        K(this.f8591c.length - this.f8599k, this.f8593e);
        this.f8589a.e(this, this.f8590b, this.f8593e, this.f8591c, this.f8598j, this.f8592d);
    }

    public final void i0(Object obj) {
        h0(125, obj, true, i.f8486a.a());
    }

    public final Object j0(Object obj) {
        Object a02 = a0();
        Z(obj);
        return a02;
    }

    public final void l0(Object obj) {
        boolean A;
        int z11 = z(this.f8606r);
        A = j1.A(this.f8590b, z11);
        if (A) {
            this.f8591c[l(f(this.f8590b, z11))] = obj;
        } else {
            k.r("Updating the data of a group that was not created with a data slot".toString());
            throw new KotlinNothingValueException();
        }
    }

    public final int n() {
        boolean D;
        int z11;
        int G;
        boolean D2;
        int G2;
        int z12;
        boolean z13 = this.f8601m > 0;
        int i11 = this.f8606r;
        int i12 = this.f8595g;
        int i13 = this.f8607s;
        int z14 = z(i13);
        int i14 = this.f8602n;
        int i15 = i11 - i13;
        D = j1.D(this.f8590b, z14);
        if (z13) {
            j1.N(this.f8590b, z14, i15);
            j1.O(this.f8590b, z14, i14);
            this.f8602n = this.f8605q.f() + (D ? 1 : i14);
            this.f8607s = P(this.f8590b, i13);
        } else {
            if ((i11 != i12 ? 0 : 1) != 0) {
                z11 = j1.z(this.f8590b, z14);
                G = j1.G(this.f8590b, z14);
                j1.N(this.f8590b, z14, i15);
                j1.O(this.f8590b, z14, i14);
                int f11 = this.f8603o.f();
                W();
                this.f8607s = f11;
                int P = P(this.f8590b, i13);
                int f12 = this.f8605q.f();
                this.f8602n = f12;
                if (P == f11) {
                    this.f8602n = f12 + (D ? 0 : i14 - G);
                } else {
                    int i16 = i15 - z11;
                    int i17 = D ? 0 : i14 - G;
                    if (i16 != 0 || i17 != 0) {
                        while (P != 0 && P != f11 && (i17 != 0 || i16 != 0)) {
                            int z15 = z(P);
                            if (i16 != 0) {
                                z12 = j1.z(this.f8590b, z15);
                                j1.N(this.f8590b, z15, z12 + i16);
                            }
                            if (i17 != 0) {
                                int[] iArr = this.f8590b;
                                G2 = j1.G(iArr, z15);
                                j1.O(iArr, z15, G2 + i17);
                            }
                            D2 = j1.D(this.f8590b, z15);
                            if (D2) {
                                i17 = 0;
                            }
                            P = P(this.f8590b, P);
                        }
                    }
                    this.f8602n += i17;
                }
            } else {
                throw new IllegalArgumentException("Expected to be at the end of a group".toString());
            }
        }
        return i14;
    }

    public final void n0(d anchor, Object obj) {
        kotlin.jvm.internal.s.g(anchor, "anchor");
        p0(anchor.e(this), obj);
    }

    public final void o() {
        int i11 = this.f8601m;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f8601m = i12;
            if (i12 == 0) {
                if (this.f8605q.b() == this.f8603o.b()) {
                    W();
                    return;
                } else {
                    k.r("startGroup/endGroup mismatch while inserting".toString());
                    throw new KotlinNothingValueException();
                }
            }
            return;
        }
        throw new IllegalStateException("Unbalanced begin/end insert".toString());
    }

    public final void o0(Object obj) {
        p0(this.f8606r, obj);
    }

    public final void p(int i11) {
        boolean z11 = true;
        if (this.f8601m <= 0) {
            int i12 = this.f8607s;
            if (i12 != i11) {
                if (i11 < i12 || i11 >= this.f8595g) {
                    z11 = false;
                }
                if (z11) {
                    int i13 = this.f8606r;
                    int i14 = this.f8596h;
                    int i15 = this.f8597i;
                    this.f8606r = i11;
                    f0();
                    this.f8606r = i13;
                    this.f8596h = i14;
                    this.f8597i = i15;
                    return;
                }
                throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Started group must be a subgroup of the group at ", Integer.valueOf(i12)).toString());
            }
            return;
        }
        throw new IllegalArgumentException("Cannot call ensureStarted() while inserting".toString());
    }

    public final void q(d anchor) {
        kotlin.jvm.internal.s.g(anchor, "anchor");
        p(anchor.e(this));
    }

    public final boolean t() {
        return this.f8608t;
    }

    public String toString() {
        return "SlotWriter(current = " + this.f8606r + " end=" + this.f8595g + " size = " + w() + " gap=" + this.f8593e + CoreConstants.DASH_CHAR + (this.f8593e + this.f8594f) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final int u() {
        return this.f8606r;
    }

    public final int v() {
        return this.f8607s;
    }

    public final int w() {
        return s() - this.f8594f;
    }

    public final i1 x() {
        return this.f8589a;
    }

    public final Object y(int i11) {
        boolean A;
        int z11 = z(i11);
        A = j1.A(this.f8590b, z11);
        return A ? this.f8591c[f(this.f8590b, z11)] : i.f8486a.a();
    }
}