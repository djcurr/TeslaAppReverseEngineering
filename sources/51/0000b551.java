package ti;

import ci.i;
import java.util.Collections;
import ti.i0;

/* loaded from: classes3.dex */
public final class q implements m {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f52218a;

    /* renamed from: b  reason: collision with root package name */
    private String f52219b;

    /* renamed from: c  reason: collision with root package name */
    private ji.x f52220c;

    /* renamed from: d  reason: collision with root package name */
    private a f52221d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f52222e;

    /* renamed from: l  reason: collision with root package name */
    private long f52229l;

    /* renamed from: m  reason: collision with root package name */
    private long f52230m;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f52223f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    private final u f52224g = new u(32, 128);

    /* renamed from: h  reason: collision with root package name */
    private final u f52225h = new u(33, 128);

    /* renamed from: i  reason: collision with root package name */
    private final u f52226i = new u(34, 128);

    /* renamed from: j  reason: collision with root package name */
    private final u f52227j = new u(39, 128);

    /* renamed from: k  reason: collision with root package name */
    private final u f52228k = new u(40, 128);

    /* renamed from: n  reason: collision with root package name */
    private final ak.v f52231n = new ak.v();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final ji.x f52232a;

        /* renamed from: b  reason: collision with root package name */
        private long f52233b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f52234c;

        /* renamed from: d  reason: collision with root package name */
        private int f52235d;

        /* renamed from: e  reason: collision with root package name */
        private long f52236e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f52237f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f52238g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f52239h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f52240i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f52241j;

        /* renamed from: k  reason: collision with root package name */
        private long f52242k;

        /* renamed from: l  reason: collision with root package name */
        private long f52243l;

        /* renamed from: m  reason: collision with root package name */
        private boolean f52244m;

        public a(ji.x xVar) {
            this.f52232a = xVar;
        }

        private static boolean b(int i11) {
            return (32 <= i11 && i11 <= 35) || i11 == 39;
        }

        private static boolean c(int i11) {
            return i11 < 32 || i11 == 40;
        }

        private void d(int i11) {
            boolean z11 = this.f52244m;
            this.f52232a.f(this.f52243l, z11 ? 1 : 0, (int) (this.f52233b - this.f52242k), i11, null);
        }

        public void a(long j11, int i11, boolean z11) {
            if (this.f52241j && this.f52238g) {
                this.f52244m = this.f52234c;
                this.f52241j = false;
            } else if (this.f52239h || this.f52238g) {
                if (z11 && this.f52240i) {
                    d(i11 + ((int) (j11 - this.f52233b)));
                }
                this.f52242k = this.f52233b;
                this.f52243l = this.f52236e;
                this.f52244m = this.f52234c;
                this.f52240i = true;
            }
        }

        public void e(byte[] bArr, int i11, int i12) {
            if (this.f52237f) {
                int i13 = this.f52235d;
                int i14 = (i11 + 2) - i13;
                if (i14 < i12) {
                    this.f52238g = (bArr[i14] & 128) != 0;
                    this.f52237f = false;
                    return;
                }
                this.f52235d = i13 + (i12 - i11);
            }
        }

        public void f() {
            this.f52237f = false;
            this.f52238g = false;
            this.f52239h = false;
            this.f52240i = false;
            this.f52241j = false;
        }

        public void g(long j11, int i11, int i12, long j12, boolean z11) {
            boolean z12 = false;
            this.f52238g = false;
            this.f52239h = false;
            this.f52236e = j12;
            this.f52235d = 0;
            this.f52233b = j11;
            if (!c(i12)) {
                if (this.f52240i && !this.f52241j) {
                    if (z11) {
                        d(i11);
                    }
                    this.f52240i = false;
                }
                if (b(i12)) {
                    this.f52239h = !this.f52241j;
                    this.f52241j = true;
                }
            }
            boolean z13 = i12 >= 16 && i12 <= 21;
            this.f52234c = z13;
            if (z13 || i12 <= 9) {
                z12 = true;
            }
            this.f52237f = z12;
        }
    }

    public q(d0 d0Var) {
        this.f52218a = d0Var;
    }

    private void b() {
        ak.a.h(this.f52220c);
        ak.k0.j(this.f52221d);
    }

    private void g(long j11, int i11, int i12, long j12) {
        this.f52221d.a(j11, i11, this.f52222e);
        if (!this.f52222e) {
            this.f52224g.b(i12);
            this.f52225h.b(i12);
            this.f52226i.b(i12);
            if (this.f52224g.c() && this.f52225h.c() && this.f52226i.c()) {
                this.f52220c.d(i(this.f52219b, this.f52224g, this.f52225h, this.f52226i));
                this.f52222e = true;
            }
        }
        if (this.f52227j.b(i12)) {
            u uVar = this.f52227j;
            this.f52231n.M(this.f52227j.f52287d, ak.t.k(uVar.f52287d, uVar.f52288e));
            this.f52231n.P(5);
            this.f52218a.a(j12, this.f52231n);
        }
        if (this.f52228k.b(i12)) {
            u uVar2 = this.f52228k;
            this.f52231n.M(this.f52228k.f52287d, ak.t.k(uVar2.f52287d, uVar2.f52288e));
            this.f52231n.P(5);
            this.f52218a.a(j12, this.f52231n);
        }
    }

    private void h(byte[] bArr, int i11, int i12) {
        this.f52221d.e(bArr, i11, i12);
        if (!this.f52222e) {
            this.f52224g.a(bArr, i11, i12);
            this.f52225h.a(bArr, i11, i12);
            this.f52226i.a(bArr, i11, i12);
        }
        this.f52227j.a(bArr, i11, i12);
        this.f52228k.a(bArr, i11, i12);
    }

    private static ci.i i(String str, u uVar, u uVar2, u uVar3) {
        int i11 = uVar.f52288e;
        byte[] bArr = new byte[uVar2.f52288e + i11 + uVar3.f52288e];
        System.arraycopy(uVar.f52287d, 0, bArr, 0, i11);
        System.arraycopy(uVar2.f52287d, 0, bArr, uVar.f52288e, uVar2.f52288e);
        System.arraycopy(uVar3.f52287d, 0, bArr, uVar.f52288e + uVar2.f52288e, uVar3.f52288e);
        ak.w wVar = new ak.w(uVar2.f52287d, 0, uVar2.f52288e);
        wVar.l(44);
        int e11 = wVar.e(3);
        wVar.k();
        wVar.l(88);
        wVar.l(8);
        int i12 = 0;
        for (int i13 = 0; i13 < e11; i13++) {
            if (wVar.d()) {
                i12 += 89;
            }
            if (wVar.d()) {
                i12 += 8;
            }
        }
        wVar.l(i12);
        if (e11 > 0) {
            wVar.l((8 - e11) * 2);
        }
        wVar.h();
        int h11 = wVar.h();
        if (h11 == 3) {
            wVar.k();
        }
        int h12 = wVar.h();
        int h13 = wVar.h();
        if (wVar.d()) {
            int h14 = wVar.h();
            int h15 = wVar.h();
            int h16 = wVar.h();
            int h17 = wVar.h();
            h12 -= ((h11 == 1 || h11 == 2) ? 2 : 1) * (h14 + h15);
            h13 -= (h11 == 1 ? 2 : 1) * (h16 + h17);
        }
        wVar.h();
        wVar.h();
        int h18 = wVar.h();
        for (int i14 = wVar.d() ? 0 : e11; i14 <= e11; i14++) {
            wVar.h();
            wVar.h();
            wVar.h();
        }
        wVar.h();
        wVar.h();
        wVar.h();
        wVar.h();
        wVar.h();
        wVar.h();
        if (wVar.d() && wVar.d()) {
            j(wVar);
        }
        wVar.l(2);
        if (wVar.d()) {
            wVar.l(8);
            wVar.h();
            wVar.h();
            wVar.k();
        }
        k(wVar);
        if (wVar.d()) {
            for (int i15 = 0; i15 < wVar.h(); i15++) {
                wVar.l(h18 + 4 + 1);
            }
        }
        wVar.l(2);
        float f11 = 1.0f;
        if (wVar.d()) {
            if (wVar.d()) {
                int e12 = wVar.e(8);
                if (e12 == 255) {
                    int e13 = wVar.e(16);
                    int e14 = wVar.e(16);
                    if (e13 != 0 && e14 != 0) {
                        f11 = e13 / e14;
                    }
                } else {
                    float[] fArr = ak.t.f520b;
                    if (e12 < fArr.length) {
                        f11 = fArr[e12];
                    } else {
                        StringBuilder sb2 = new StringBuilder(46);
                        sb2.append("Unexpected aspect_ratio_idc value: ");
                        sb2.append(e12);
                        ak.o.h("H265Reader", sb2.toString());
                    }
                }
            }
            if (wVar.d()) {
                wVar.k();
            }
            if (wVar.d()) {
                wVar.l(4);
                if (wVar.d()) {
                    wVar.l(24);
                }
            }
            if (wVar.d()) {
                wVar.h();
                wVar.h();
            }
            wVar.k();
            if (wVar.d()) {
                h13 *= 2;
            }
        }
        wVar.i(uVar2.f52287d, 0, uVar2.f52288e);
        wVar.l(24);
        return new i.b().S(str).e0("video/hevc").I(ak.c.c(wVar)).j0(h12).Q(h13).a0(f11).T(Collections.singletonList(bArr)).E();
    }

    private static void j(ak.w wVar) {
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = 0;
            while (i12 < 6) {
                int i13 = 1;
                if (!wVar.d()) {
                    wVar.h();
                } else {
                    int min = Math.min(64, 1 << ((i11 << 1) + 4));
                    if (i11 > 1) {
                        wVar.g();
                    }
                    for (int i14 = 0; i14 < min; i14++) {
                        wVar.g();
                    }
                }
                if (i11 == 3) {
                    i13 = 3;
                }
                i12 += i13;
            }
        }
    }

    private static void k(ak.w wVar) {
        int h11 = wVar.h();
        boolean z11 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < h11; i12++) {
            if (i12 != 0) {
                z11 = wVar.d();
            }
            if (z11) {
                wVar.k();
                wVar.h();
                for (int i13 = 0; i13 <= i11; i13++) {
                    if (wVar.d()) {
                        wVar.k();
                    }
                }
            } else {
                int h12 = wVar.h();
                int h13 = wVar.h();
                int i14 = h12 + h13;
                for (int i15 = 0; i15 < h12; i15++) {
                    wVar.h();
                    wVar.k();
                }
                for (int i16 = 0; i16 < h13; i16++) {
                    wVar.h();
                    wVar.k();
                }
                i11 = i14;
            }
        }
    }

    private void l(long j11, int i11, int i12, long j12) {
        this.f52221d.g(j11, i11, i12, j12, this.f52222e);
        if (!this.f52222e) {
            this.f52224g.e(i12);
            this.f52225h.e(i12);
            this.f52226i.e(i12);
        }
        this.f52227j.e(i12);
        this.f52228k.e(i12);
    }

    @Override // ti.m
    public void a() {
        this.f52229l = 0L;
        ak.t.a(this.f52223f);
        this.f52224g.d();
        this.f52225h.d();
        this.f52226i.d();
        this.f52227j.d();
        this.f52228k.d();
        a aVar = this.f52221d;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // ti.m
    public void c(ak.v vVar) {
        b();
        while (vVar.a() > 0) {
            int e11 = vVar.e();
            int f11 = vVar.f();
            byte[] d11 = vVar.d();
            this.f52229l += vVar.a();
            this.f52220c.e(vVar, vVar.a());
            while (e11 < f11) {
                int c11 = ak.t.c(d11, e11, f11, this.f52223f);
                if (c11 == f11) {
                    h(d11, e11, f11);
                    return;
                }
                int e12 = ak.t.e(d11, c11);
                int i11 = c11 - e11;
                if (i11 > 0) {
                    h(d11, e11, c11);
                }
                int i12 = f11 - c11;
                long j11 = this.f52229l - i12;
                g(j11, i12, i11 < 0 ? -i11 : 0, this.f52230m);
                l(j11, i12, e12, this.f52230m);
                e11 = c11 + 3;
            }
        }
    }

    @Override // ti.m
    public void d() {
    }

    @Override // ti.m
    public void e(ji.j jVar, i0.d dVar) {
        dVar.a();
        this.f52219b = dVar.b();
        ji.x f11 = jVar.f(dVar.c(), 2);
        this.f52220c = f11;
        this.f52221d = new a(f11);
        this.f52218a.b(jVar, dVar);
    }

    @Override // ti.m
    public void f(long j11, int i11) {
        this.f52230m = j11;
    }
}