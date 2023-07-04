package g3;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f3.d;
import f3.e;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<f3.e> f27484a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private a f27485b = new a();

    /* renamed from: c  reason: collision with root package name */
    private f3.f f27486c;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static int f27487k = 0;

        /* renamed from: l  reason: collision with root package name */
        public static int f27488l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static int f27489m = 2;

        /* renamed from: a  reason: collision with root package name */
        public e.b f27490a;

        /* renamed from: b  reason: collision with root package name */
        public e.b f27491b;

        /* renamed from: c  reason: collision with root package name */
        public int f27492c;

        /* renamed from: d  reason: collision with root package name */
        public int f27493d;

        /* renamed from: e  reason: collision with root package name */
        public int f27494e;

        /* renamed from: f  reason: collision with root package name */
        public int f27495f;

        /* renamed from: g  reason: collision with root package name */
        public int f27496g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f27497h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f27498i;

        /* renamed from: j  reason: collision with root package name */
        public int f27499j;
    }

    /* renamed from: g3.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0524b {
        void a();

        void b(f3.e eVar, a aVar);
    }

    public b(f3.f fVar) {
        this.f27486c = fVar;
    }

    private boolean a(InterfaceC0524b interfaceC0524b, f3.e eVar, int i11) {
        this.f27485b.f27490a = eVar.y();
        this.f27485b.f27491b = eVar.T();
        this.f27485b.f27492c = eVar.W();
        this.f27485b.f27493d = eVar.v();
        a aVar = this.f27485b;
        aVar.f27498i = false;
        aVar.f27499j = i11;
        e.b bVar = aVar.f27490a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z11 = bVar == bVar2;
        boolean z12 = aVar.f27491b == bVar2;
        boolean z13 = z11 && eVar.f25705b0 > BitmapDescriptorFactory.HUE_RED;
        boolean z14 = z12 && eVar.f25705b0 > BitmapDescriptorFactory.HUE_RED;
        if (z13 && eVar.f25746w[0] == 4) {
            aVar.f27490a = e.b.FIXED;
        }
        if (z14 && eVar.f25746w[1] == 4) {
            aVar.f27491b = e.b.FIXED;
        }
        interfaceC0524b.b(eVar, aVar);
        eVar.j1(this.f27485b.f27494e);
        eVar.K0(this.f27485b.f27495f);
        eVar.J0(this.f27485b.f27497h);
        eVar.z0(this.f27485b.f27496g);
        a aVar2 = this.f27485b;
        aVar2.f27499j = a.f27487k;
        return aVar2.f27498i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x008d, code lost:
        if (r8 != r9) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0094, code lost:
        if (r5.f25705b0 <= com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void b(f3.f r13) {
        /*
            r12 = this;
            java.util.ArrayList<f3.e> r0 = r13.f25762x0
            int r0 = r0.size()
            r1 = 64
            boolean r1 = r13.S1(r1)
            g3.b$b r2 = r13.I1()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto La4
            java.util.ArrayList<f3.e> r5 = r13.f25762x0
            java.lang.Object r5 = r5.get(r4)
            f3.e r5 = (f3.e) r5
            boolean r6 = r5 instanceof f3.g
            if (r6 == 0) goto L22
            goto La0
        L22:
            boolean r6 = r5 instanceof f3.a
            if (r6 == 0) goto L28
            goto La0
        L28:
            boolean r6 = r5.l0()
            if (r6 == 0) goto L30
            goto La0
        L30:
            if (r1 == 0) goto L47
            g3.l r6 = r5.f25708d
            if (r6 == 0) goto L47
            g3.n r7 = r5.f25710e
            if (r7 == 0) goto L47
            g3.g r6 = r6.f27544e
            boolean r6 = r6.f27519j
            if (r6 == 0) goto L47
            g3.g r6 = r7.f27544e
            boolean r6 = r6.f27519j
            if (r6 == 0) goto L47
            goto La0
        L47:
            f3.e$b r6 = r5.s(r3)
            r7 = 1
            f3.e$b r8 = r5.s(r7)
            f3.e$b r9 = f3.e.b.MATCH_CONSTRAINT
            if (r6 != r9) goto L60
            int r10 = r5.f25742u
            if (r10 == r7) goto L60
            if (r8 != r9) goto L60
            int r10 = r5.f25744v
            if (r10 == r7) goto L60
            r10 = r7
            goto L61
        L60:
            r10 = r3
        L61:
            if (r10 != 0) goto L97
            boolean r11 = r13.S1(r7)
            if (r11 == 0) goto L97
            boolean r11 = r5 instanceof f3.k
            if (r11 != 0) goto L97
            if (r6 != r9) goto L7c
            int r11 = r5.f25742u
            if (r11 != 0) goto L7c
            if (r8 == r9) goto L7c
            boolean r11 = r5.i0()
            if (r11 != 0) goto L7c
            r10 = r7
        L7c:
            if (r8 != r9) goto L8b
            int r11 = r5.f25744v
            if (r11 != 0) goto L8b
            if (r6 == r9) goto L8b
            boolean r11 = r5.i0()
            if (r11 != 0) goto L8b
            r10 = r7
        L8b:
            if (r6 == r9) goto L8f
            if (r8 != r9) goto L97
        L8f:
            float r6 = r5.f25705b0
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L97
            goto L98
        L97:
            r7 = r10
        L98:
            if (r7 == 0) goto L9b
            goto La0
        L9b:
            int r6 = g3.b.a.f27487k
            r12.a(r2, r5, r6)
        La0:
            int r4 = r4 + 1
            goto L12
        La4:
            r2.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.b.b(f3.f):void");
    }

    private void c(f3.f fVar, String str, int i11, int i12, int i13) {
        int H = fVar.H();
        int G = fVar.G();
        fVar.Z0(0);
        fVar.Y0(0);
        fVar.j1(i12);
        fVar.K0(i13);
        fVar.Z0(H);
        fVar.Y0(G);
        this.f27486c.W1(i11);
        this.f27486c.r1();
    }

    public long d(f3.f fVar, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        boolean z11;
        int i21;
        f3.f fVar2;
        int i22;
        boolean z12;
        int i23;
        int i24;
        boolean z13;
        b bVar = this;
        InterfaceC0524b I1 = fVar.I1();
        int size = fVar.f25762x0.size();
        int W = fVar.W();
        int v11 = fVar.v();
        boolean b11 = f3.j.b(i11, 128);
        boolean z14 = b11 || f3.j.b(i11, 64);
        if (z14) {
            for (int i25 = 0; i25 < size; i25++) {
                f3.e eVar = fVar.f25762x0.get(i25);
                e.b y11 = eVar.y();
                e.b bVar2 = e.b.MATCH_CONSTRAINT;
                boolean z15 = (y11 == bVar2) && (eVar.T() == bVar2) && eVar.t() > BitmapDescriptorFactory.HUE_RED;
                if ((eVar.i0() && z15) || ((eVar.k0() && z15) || (eVar instanceof f3.k) || eVar.i0() || eVar.k0())) {
                    z14 = false;
                    break;
                }
            }
        }
        if (z14) {
            a3.e eVar2 = a3.d.f170x;
        }
        boolean z16 = z14 & ((i14 == 1073741824 && i16 == 1073741824) || b11);
        int i26 = 2;
        if (z16) {
            int min = Math.min(fVar.F(), i15);
            int min2 = Math.min(fVar.E(), i17);
            if (i14 == 1073741824 && fVar.W() != min) {
                fVar.j1(min);
                fVar.L1();
            }
            if (i16 == 1073741824 && fVar.v() != min2) {
                fVar.K0(min2);
                fVar.L1();
            }
            if (i14 == 1073741824 && i16 == 1073741824) {
                z11 = fVar.E1(b11);
                i21 = 2;
            } else {
                boolean F1 = fVar.F1(b11);
                if (i14 == 1073741824) {
                    F1 &= fVar.G1(b11, 0);
                    i21 = 1;
                } else {
                    i21 = 0;
                }
                if (i16 == 1073741824) {
                    z11 = fVar.G1(b11, 1) & F1;
                    i21++;
                } else {
                    z11 = F1;
                }
            }
            if (z11) {
                fVar.o1(i14 == 1073741824, i16 == 1073741824);
            }
        } else {
            z11 = false;
            i21 = 0;
        }
        if (z11 && i21 == 2) {
            return 0L;
        }
        int J1 = fVar.J1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f27484a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, W, v11);
        }
        if (size2 > 0) {
            e.b y12 = fVar.y();
            e.b bVar3 = e.b.WRAP_CONTENT;
            boolean z17 = y12 == bVar3;
            boolean z18 = fVar.T() == bVar3;
            int max = Math.max(fVar.W(), bVar.f27486c.H());
            int max2 = Math.max(fVar.v(), bVar.f27486c.G());
            int i27 = 0;
            boolean z19 = false;
            while (i27 < size2) {
                f3.e eVar3 = bVar.f27484a.get(i27);
                if (eVar3 instanceof f3.k) {
                    int W2 = eVar3.W();
                    int v12 = eVar3.v();
                    i24 = J1;
                    boolean a11 = bVar.a(I1, eVar3, a.f27488l) | z19;
                    int W3 = eVar3.W();
                    int v13 = eVar3.v();
                    if (W3 != W2) {
                        eVar3.j1(W3);
                        if (z17 && eVar3.L() > max) {
                            max = Math.max(max, eVar3.L() + eVar3.m(d.b.RIGHT).e());
                        }
                        z13 = true;
                    } else {
                        z13 = a11;
                    }
                    if (v13 != v12) {
                        eVar3.K0(v13);
                        if (z18 && eVar3.p() > max2) {
                            max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).e());
                        }
                        z13 = true;
                    }
                    z19 = z13 | ((f3.k) eVar3).u1();
                } else {
                    i24 = J1;
                }
                i27++;
                J1 = i24;
                i26 = 2;
            }
            int i28 = J1;
            int i29 = i26;
            int i31 = 0;
            while (i31 < i29) {
                int i32 = 0;
                while (i32 < size2) {
                    f3.e eVar4 = bVar.f27484a.get(i32);
                    if (((eVar4 instanceof f3.h) && !(eVar4 instanceof f3.k)) || (eVar4 instanceof f3.g) || eVar4.V() == 8 || ((z16 && eVar4.f25708d.f27544e.f27519j && eVar4.f25710e.f27544e.f27519j) || (eVar4 instanceof f3.k))) {
                        z12 = z16;
                        i23 = size2;
                    } else {
                        int W4 = eVar4.W();
                        int v14 = eVar4.v();
                        z12 = z16;
                        int n11 = eVar4.n();
                        int i33 = a.f27488l;
                        i23 = size2;
                        if (i31 == 1) {
                            i33 = a.f27489m;
                        }
                        boolean a12 = bVar.a(I1, eVar4, i33) | z19;
                        int W5 = eVar4.W();
                        int v15 = eVar4.v();
                        if (W5 != W4) {
                            eVar4.j1(W5);
                            if (z17 && eVar4.L() > max) {
                                max = Math.max(max, eVar4.L() + eVar4.m(d.b.RIGHT).e());
                            }
                            a12 = true;
                        }
                        if (v15 != v14) {
                            eVar4.K0(v15);
                            if (z18 && eVar4.p() > max2) {
                                max2 = Math.max(max2, eVar4.p() + eVar4.m(d.b.BOTTOM).e());
                            }
                            a12 = true;
                        }
                        z19 = (!eVar4.Z() || n11 == eVar4.n()) ? a12 : true;
                    }
                    i32++;
                    bVar = this;
                    z16 = z12;
                    size2 = i23;
                }
                boolean z21 = z16;
                int i34 = size2;
                if (!z19) {
                    break;
                }
                i31++;
                c(fVar, "intermediate pass", i31, W, v11);
                bVar = this;
                z16 = z21;
                size2 = i34;
                i29 = 2;
                z19 = false;
            }
            fVar2 = fVar;
            i22 = i28;
        } else {
            fVar2 = fVar;
            i22 = J1;
        }
        fVar2.V1(i22);
        return 0L;
    }

    public void e(f3.f fVar) {
        this.f27484a.clear();
        int size = fVar.f25762x0.size();
        for (int i11 = 0; i11 < size; i11++) {
            f3.e eVar = fVar.f25762x0.get(i11);
            e.b y11 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y11 == bVar || eVar.T() == bVar) {
                this.f27484a.add(eVar);
            }
        }
        fVar.L1();
    }
}