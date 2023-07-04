package a3;

import a3.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f3.d;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public class d {

    /* renamed from: r  reason: collision with root package name */
    public static boolean f164r = false;

    /* renamed from: s  reason: collision with root package name */
    public static boolean f165s = true;

    /* renamed from: t  reason: collision with root package name */
    public static boolean f166t = true;

    /* renamed from: u  reason: collision with root package name */
    public static boolean f167u = true;

    /* renamed from: v  reason: collision with root package name */
    public static boolean f168v = false;

    /* renamed from: w  reason: collision with root package name */
    private static int f169w = 1000;

    /* renamed from: x  reason: collision with root package name */
    public static e f170x;

    /* renamed from: y  reason: collision with root package name */
    public static long f171y;

    /* renamed from: z  reason: collision with root package name */
    public static long f172z;

    /* renamed from: d  reason: collision with root package name */
    private a f176d;

    /* renamed from: g  reason: collision with root package name */
    a3.b[] f179g;

    /* renamed from: n  reason: collision with root package name */
    final c f186n;

    /* renamed from: q  reason: collision with root package name */
    private a f189q;

    /* renamed from: a  reason: collision with root package name */
    public boolean f173a = false;

    /* renamed from: b  reason: collision with root package name */
    int f174b = 0;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<String, i> f175c = null;

    /* renamed from: e  reason: collision with root package name */
    private int f177e = 32;

    /* renamed from: f  reason: collision with root package name */
    private int f178f = 32;

    /* renamed from: h  reason: collision with root package name */
    public boolean f180h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f181i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean[] f182j = new boolean[32];

    /* renamed from: k  reason: collision with root package name */
    int f183k = 1;

    /* renamed from: l  reason: collision with root package name */
    int f184l = 0;

    /* renamed from: m  reason: collision with root package name */
    private int f185m = 32;

    /* renamed from: o  reason: collision with root package name */
    private i[] f187o = new i[f169w];

    /* renamed from: p  reason: collision with root package name */
    private int f188p = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface a {
        void a(i iVar);

        void b(a aVar);

        i c(d dVar, boolean[] zArr);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends a3.b {
        public b(d dVar, c cVar) {
            this.f158e = new j(this, cVar);
        }
    }

    public d() {
        this.f179g = null;
        this.f179g = new a3.b[32];
        D();
        c cVar = new c();
        this.f186n = cVar;
        this.f176d = new h(cVar);
        if (f168v) {
            this.f189q = new b(this, cVar);
        } else {
            this.f189q = new a3.b(cVar);
        }
    }

    private final int C(a aVar, boolean z11) {
        for (int i11 = 0; i11 < this.f183k; i11++) {
            this.f182j[i11] = false;
        }
        boolean z12 = false;
        int i12 = 0;
        while (!z12) {
            i12++;
            if (i12 >= this.f183k * 2) {
                return i12;
            }
            if (aVar.getKey() != null) {
                this.f182j[aVar.getKey().f202c] = true;
            }
            i c11 = aVar.c(this, this.f182j);
            if (c11 != null) {
                boolean[] zArr = this.f182j;
                int i13 = c11.f202c;
                if (zArr[i13]) {
                    return i12;
                }
                zArr[i13] = true;
            }
            if (c11 != null) {
                float f11 = Float.MAX_VALUE;
                int i14 = -1;
                for (int i15 = 0; i15 < this.f184l; i15++) {
                    a3.b bVar = this.f179g[i15];
                    if (bVar.f154a.f209j != i.a.UNRESTRICTED && !bVar.f159f && bVar.t(c11)) {
                        float a11 = bVar.f158e.a(c11);
                        if (a11 < BitmapDescriptorFactory.HUE_RED) {
                            float f12 = (-bVar.f155b) / a11;
                            if (f12 < f11) {
                                i14 = i15;
                                f11 = f12;
                            }
                        }
                    }
                }
                if (i14 > -1) {
                    a3.b bVar2 = this.f179g[i14];
                    bVar2.f154a.f203d = -1;
                    bVar2.x(c11);
                    i iVar = bVar2.f154a;
                    iVar.f203d = i14;
                    iVar.h(this, bVar2);
                }
            } else {
                z12 = true;
            }
        }
        return i12;
    }

    private void D() {
        int i11 = 0;
        if (f168v) {
            while (i11 < this.f184l) {
                a3.b bVar = this.f179g[i11];
                if (bVar != null) {
                    this.f186n.f160a.a(bVar);
                }
                this.f179g[i11] = null;
                i11++;
            }
            return;
        }
        while (i11 < this.f184l) {
            a3.b bVar2 = this.f179g[i11];
            if (bVar2 != null) {
                this.f186n.f161b.a(bVar2);
            }
            this.f179g[i11] = null;
            i11++;
        }
    }

    private i a(i.a aVar, String str) {
        i b11 = this.f186n.f162c.b();
        if (b11 == null) {
            b11 = new i(aVar, str);
            b11.g(aVar, str);
        } else {
            b11.e();
            b11.g(aVar, str);
        }
        int i11 = this.f188p;
        int i12 = f169w;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            f169w = i13;
            this.f187o = (i[]) Arrays.copyOf(this.f187o, i13);
        }
        i[] iVarArr = this.f187o;
        int i14 = this.f188p;
        this.f188p = i14 + 1;
        iVarArr[i14] = b11;
        return b11;
    }

    private final void l(a3.b bVar) {
        int i11;
        if (f166t && bVar.f159f) {
            bVar.f154a.f(this, bVar.f155b);
        } else {
            a3.b[] bVarArr = this.f179g;
            int i12 = this.f184l;
            bVarArr[i12] = bVar;
            i iVar = bVar.f154a;
            iVar.f203d = i12;
            this.f184l = i12 + 1;
            iVar.h(this, bVar);
        }
        if (f166t && this.f173a) {
            int i13 = 0;
            while (i13 < this.f184l) {
                if (this.f179g[i13] == null) {
                    System.out.println("WTF");
                }
                a3.b[] bVarArr2 = this.f179g;
                if (bVarArr2[i13] != null && bVarArr2[i13].f159f) {
                    a3.b bVar2 = bVarArr2[i13];
                    bVar2.f154a.f(this, bVar2.f155b);
                    if (f168v) {
                        this.f186n.f160a.a(bVar2);
                    } else {
                        this.f186n.f161b.a(bVar2);
                    }
                    this.f179g[i13] = null;
                    int i14 = i13 + 1;
                    int i15 = i14;
                    while (true) {
                        i11 = this.f184l;
                        if (i14 >= i11) {
                            break;
                        }
                        a3.b[] bVarArr3 = this.f179g;
                        int i16 = i14 - 1;
                        bVarArr3[i16] = bVarArr3[i14];
                        if (bVarArr3[i16].f154a.f203d == i14) {
                            bVarArr3[i16].f154a.f203d = i16;
                        }
                        i15 = i14;
                        i14++;
                    }
                    if (i15 < i11) {
                        this.f179g[i15] = null;
                    }
                    this.f184l = i11 - 1;
                    i13--;
                }
                i13++;
            }
            this.f173a = false;
        }
    }

    private void n() {
        for (int i11 = 0; i11 < this.f184l; i11++) {
            a3.b bVar = this.f179g[i11];
            bVar.f154a.f205f = bVar.f155b;
        }
    }

    public static a3.b s(d dVar, i iVar, i iVar2, float f11) {
        return dVar.r().j(iVar, iVar2, f11);
    }

    private int u(a aVar) {
        boolean z11;
        int i11 = 0;
        while (true) {
            if (i11 >= this.f184l) {
                z11 = false;
                break;
            }
            a3.b[] bVarArr = this.f179g;
            if (bVarArr[i11].f154a.f209j != i.a.UNRESTRICTED && bVarArr[i11].f155b < BitmapDescriptorFactory.HUE_RED) {
                z11 = true;
                break;
            }
            i11++;
        }
        if (z11) {
            boolean z12 = false;
            int i12 = 0;
            while (!z12) {
                i12++;
                float f11 = Float.MAX_VALUE;
                int i13 = -1;
                int i14 = -1;
                int i15 = 0;
                for (int i16 = 0; i16 < this.f184l; i16++) {
                    a3.b bVar = this.f179g[i16];
                    if (bVar.f154a.f209j != i.a.UNRESTRICTED && !bVar.f159f && bVar.f155b < BitmapDescriptorFactory.HUE_RED) {
                        int i17 = 9;
                        if (f167u) {
                            int f12 = bVar.f158e.f();
                            int i18 = 0;
                            while (i18 < f12) {
                                i b11 = bVar.f158e.b(i18);
                                float a11 = bVar.f158e.a(b11);
                                if (a11 > BitmapDescriptorFactory.HUE_RED) {
                                    int i19 = 0;
                                    while (i19 < i17) {
                                        float f13 = b11.f207h[i19] / a11;
                                        if ((f13 < f11 && i19 == i15) || i19 > i15) {
                                            i14 = b11.f202c;
                                            i15 = i19;
                                            i13 = i16;
                                            f11 = f13;
                                        }
                                        i19++;
                                        i17 = 9;
                                    }
                                }
                                i18++;
                                i17 = 9;
                            }
                        } else {
                            for (int i21 = 1; i21 < this.f183k; i21++) {
                                i iVar = this.f186n.f163d[i21];
                                float a12 = bVar.f158e.a(iVar);
                                if (a12 > BitmapDescriptorFactory.HUE_RED) {
                                    for (int i22 = 0; i22 < 9; i22++) {
                                        float f14 = iVar.f207h[i22] / a12;
                                        if ((f14 < f11 && i22 == i15) || i22 > i15) {
                                            i14 = i21;
                                            i13 = i16;
                                            i15 = i22;
                                            f11 = f14;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (i13 != -1) {
                    a3.b bVar2 = this.f179g[i13];
                    bVar2.f154a.f203d = -1;
                    bVar2.x(this.f186n.f163d[i14]);
                    i iVar2 = bVar2.f154a;
                    iVar2.f203d = i13;
                    iVar2.h(this, bVar2);
                } else {
                    z12 = true;
                }
                if (i12 > this.f183k / 2) {
                    z12 = true;
                }
            }
            return i12;
        }
        return 0;
    }

    public static e x() {
        return f170x;
    }

    private void z() {
        int i11 = this.f177e * 2;
        this.f177e = i11;
        this.f179g = (a3.b[]) Arrays.copyOf(this.f179g, i11);
        c cVar = this.f186n;
        cVar.f163d = (i[]) Arrays.copyOf(cVar.f163d, this.f177e);
        int i12 = this.f177e;
        this.f182j = new boolean[i12];
        this.f178f = i12;
        this.f185m = i12;
    }

    public void A() {
        if (this.f176d.isEmpty()) {
            n();
        } else if (!this.f180h && !this.f181i) {
            B(this.f176d);
        } else {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= this.f184l) {
                    z11 = true;
                    break;
                } else if (!this.f179g[i11].f159f) {
                    break;
                } else {
                    i11++;
                }
            }
            if (!z11) {
                B(this.f176d);
            } else {
                n();
            }
        }
    }

    void B(a aVar) {
        u(aVar);
        C(aVar, false);
        n();
    }

    public void E() {
        c cVar;
        int i11 = 0;
        while (true) {
            cVar = this.f186n;
            i[] iVarArr = cVar.f163d;
            if (i11 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i11];
            if (iVar != null) {
                iVar.e();
            }
            i11++;
        }
        cVar.f162c.c(this.f187o, this.f188p);
        this.f188p = 0;
        Arrays.fill(this.f186n.f163d, (Object) null);
        HashMap<String, i> hashMap = this.f175c;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f174b = 0;
        this.f176d.clear();
        this.f183k = 1;
        for (int i12 = 0; i12 < this.f184l; i12++) {
            a3.b[] bVarArr = this.f179g;
            if (bVarArr[i12] != null) {
                bVarArr[i12].f156c = false;
            }
        }
        D();
        this.f184l = 0;
        if (f168v) {
            this.f189q = new b(this, this.f186n);
        } else {
            this.f189q = new a3.b(this.f186n);
        }
    }

    public void b(f3.e eVar, f3.e eVar2, float f11, int i11) {
        d.b bVar = d.b.LEFT;
        i q11 = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q12 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q13 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q14 = q(eVar.m(bVar4));
        i q15 = q(eVar2.m(bVar));
        i q16 = q(eVar2.m(bVar2));
        i q17 = q(eVar2.m(bVar3));
        i q18 = q(eVar2.m(bVar4));
        a3.b r11 = r();
        double d11 = f11;
        double d12 = i11;
        r11.q(q12, q14, q16, q18, (float) (Math.sin(d11) * d12));
        d(r11);
        a3.b r12 = r();
        r12.q(q11, q13, q15, q17, (float) (Math.cos(d11) * d12));
        d(r12);
    }

    public void c(i iVar, i iVar2, int i11, float f11, i iVar3, i iVar4, int i12, int i13) {
        a3.b r11 = r();
        r11.h(iVar, iVar2, i11, f11, iVar3, iVar4, i12);
        if (i13 != 8) {
            r11.d(this, i13);
        }
        d(r11);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(a3.b r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            int r0 = r5.f184l
            r1 = 1
            int r0 = r0 + r1
            int r2 = r5.f185m
            if (r0 >= r2) goto L12
            int r0 = r5.f183k
            int r0 = r0 + r1
            int r2 = r5.f178f
            if (r0 < r2) goto L15
        L12:
            r5.z()
        L15:
            r0 = 0
            boolean r2 = r6.f159f
            if (r2 != 0) goto L84
            r6.D(r5)
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L24
            return
        L24:
            r6.r()
            boolean r2 = r6.f(r5)
            if (r2 == 0) goto L7b
            a3.i r2 = r5.p()
            r6.f154a = r2
            int r3 = r5.f184l
            r5.l(r6)
            int r4 = r5.f184l
            int r3 = r3 + r1
            if (r4 != r3) goto L7b
            a3.d$a r0 = r5.f189q
            r0.b(r6)
            a3.d$a r0 = r5.f189q
            r5.C(r0, r1)
            int r0 = r2.f203d
            r3 = -1
            if (r0 != r3) goto L7c
            a3.i r0 = r6.f154a
            if (r0 != r2) goto L59
            a3.i r0 = r6.v(r2)
            if (r0 == 0) goto L59
            r6.x(r0)
        L59:
            boolean r0 = r6.f159f
            if (r0 != 0) goto L62
            a3.i r0 = r6.f154a
            r0.h(r5, r6)
        L62:
            boolean r0 = a3.d.f168v
            if (r0 == 0) goto L6e
            a3.c r0 = r5.f186n
            a3.f<a3.b> r0 = r0.f160a
            r0.a(r6)
            goto L75
        L6e:
            a3.c r0 = r5.f186n
            a3.f<a3.b> r0 = r0.f161b
            r0.a(r6)
        L75:
            int r0 = r5.f184l
            int r0 = r0 - r1
            r5.f184l = r0
            goto L7c
        L7b:
            r1 = r0
        L7c:
            boolean r0 = r6.s()
            if (r0 != 0) goto L83
            return
        L83:
            r0 = r1
        L84:
            if (r0 != 0) goto L89
            r5.l(r6)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.d.d(a3.b):void");
    }

    public a3.b e(i iVar, i iVar2, int i11, int i12) {
        if (f165s && i12 == 8 && iVar2.f206g && iVar.f203d == -1) {
            iVar.f(this, iVar2.f205f + i11);
            return null;
        }
        a3.b r11 = r();
        r11.n(iVar, iVar2, i11);
        if (i12 != 8) {
            r11.d(this, i12);
        }
        d(r11);
        return r11;
    }

    public void f(i iVar, int i11) {
        if (f165s && iVar.f203d == -1) {
            float f11 = i11;
            iVar.f(this, f11);
            for (int i12 = 0; i12 < this.f174b + 1; i12++) {
                i iVar2 = this.f186n.f163d[i12];
                if (iVar2 != null && iVar2.f213n && iVar2.f214o == iVar.f202c) {
                    iVar2.f(this, iVar2.f215p + f11);
                }
            }
            return;
        }
        int i13 = iVar.f203d;
        if (i13 != -1) {
            a3.b bVar = this.f179g[i13];
            if (bVar.f159f) {
                bVar.f155b = i11;
                return;
            } else if (bVar.f158e.f() == 0) {
                bVar.f159f = true;
                bVar.f155b = i11;
                return;
            } else {
                a3.b r11 = r();
                r11.m(iVar, i11);
                d(r11);
                return;
            }
        }
        a3.b r12 = r();
        r12.i(iVar, i11);
        d(r12);
    }

    public void g(i iVar, i iVar2, int i11, boolean z11) {
        a3.b r11 = r();
        i t11 = t();
        t11.f204e = 0;
        r11.o(iVar, iVar2, t11, i11);
        d(r11);
    }

    public void h(i iVar, i iVar2, int i11, int i12) {
        a3.b r11 = r();
        i t11 = t();
        t11.f204e = 0;
        r11.o(iVar, iVar2, t11, i11);
        if (i12 != 8) {
            m(r11, (int) (r11.f158e.a(t11) * (-1.0f)), i12);
        }
        d(r11);
    }

    public void i(i iVar, i iVar2, int i11, boolean z11) {
        a3.b r11 = r();
        i t11 = t();
        t11.f204e = 0;
        r11.p(iVar, iVar2, t11, i11);
        d(r11);
    }

    public void j(i iVar, i iVar2, int i11, int i12) {
        a3.b r11 = r();
        i t11 = t();
        t11.f204e = 0;
        r11.p(iVar, iVar2, t11, i11);
        if (i12 != 8) {
            m(r11, (int) (r11.f158e.a(t11) * (-1.0f)), i12);
        }
        d(r11);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f11, int i11) {
        a3.b r11 = r();
        r11.k(iVar, iVar2, iVar3, iVar4, f11);
        if (i11 != 8) {
            r11.d(this, i11);
        }
        d(r11);
    }

    void m(a3.b bVar, int i11, int i12) {
        bVar.e(o(i12, null), i11);
    }

    public i o(int i11, String str) {
        if (this.f183k + 1 >= this.f178f) {
            z();
        }
        i a11 = a(i.a.ERROR, str);
        int i12 = this.f174b + 1;
        this.f174b = i12;
        this.f183k++;
        a11.f202c = i12;
        a11.f204e = i11;
        this.f186n.f163d[i12] = a11;
        this.f176d.a(a11);
        return a11;
    }

    public i p() {
        if (this.f183k + 1 >= this.f178f) {
            z();
        }
        i a11 = a(i.a.SLACK, null);
        int i11 = this.f174b + 1;
        this.f174b = i11;
        this.f183k++;
        a11.f202c = i11;
        this.f186n.f163d[i11] = a11;
        return a11;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f183k + 1 >= this.f178f) {
            z();
        }
        if (obj instanceof f3.d) {
            f3.d dVar = (f3.d) obj;
            iVar = dVar.h();
            if (iVar == null) {
                dVar.r(this.f186n);
                iVar = dVar.h();
            }
            int i11 = iVar.f202c;
            if (i11 == -1 || i11 > this.f174b || this.f186n.f163d[i11] == null) {
                if (i11 != -1) {
                    iVar.e();
                }
                int i12 = this.f174b + 1;
                this.f174b = i12;
                this.f183k++;
                iVar.f202c = i12;
                iVar.f209j = i.a.UNRESTRICTED;
                this.f186n.f163d[i12] = iVar;
            }
        }
        return iVar;
    }

    public a3.b r() {
        a3.b b11;
        if (f168v) {
            b11 = this.f186n.f160a.b();
            if (b11 == null) {
                b11 = new b(this, this.f186n);
                f172z++;
            } else {
                b11.y();
            }
        } else {
            b11 = this.f186n.f161b.b();
            if (b11 == null) {
                b11 = new a3.b(this.f186n);
                f171y++;
            } else {
                b11.y();
            }
        }
        i.c();
        return b11;
    }

    public i t() {
        if (this.f183k + 1 >= this.f178f) {
            z();
        }
        i a11 = a(i.a.SLACK, null);
        int i11 = this.f174b + 1;
        this.f174b = i11;
        this.f183k++;
        a11.f202c = i11;
        this.f186n.f163d[i11] = a11;
        return a11;
    }

    public void v(e eVar) {
    }

    public c w() {
        return this.f186n;
    }

    public int y(Object obj) {
        i h11 = ((f3.d) obj).h();
        if (h11 != null) {
            return (int) (h11.f205f + 0.5f);
        }
        return 0;
    }
}