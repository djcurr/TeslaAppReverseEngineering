package ti;

import ci.i;
import ei.a;
import java.util.Arrays;
import java.util.Collections;
import ti.i0;

/* loaded from: classes3.dex */
public final class i implements m {

    /* renamed from: v  reason: collision with root package name */
    private static final byte[] f52067v = {73, 68, 51};

    /* renamed from: a  reason: collision with root package name */
    private final boolean f52068a;

    /* renamed from: b  reason: collision with root package name */
    private final ak.u f52069b;

    /* renamed from: c  reason: collision with root package name */
    private final ak.v f52070c;

    /* renamed from: d  reason: collision with root package name */
    private final String f52071d;

    /* renamed from: e  reason: collision with root package name */
    private String f52072e;

    /* renamed from: f  reason: collision with root package name */
    private ji.x f52073f;

    /* renamed from: g  reason: collision with root package name */
    private ji.x f52074g;

    /* renamed from: h  reason: collision with root package name */
    private int f52075h;

    /* renamed from: i  reason: collision with root package name */
    private int f52076i;

    /* renamed from: j  reason: collision with root package name */
    private int f52077j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f52078k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f52079l;

    /* renamed from: m  reason: collision with root package name */
    private int f52080m;

    /* renamed from: n  reason: collision with root package name */
    private int f52081n;

    /* renamed from: o  reason: collision with root package name */
    private int f52082o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f52083p;

    /* renamed from: q  reason: collision with root package name */
    private long f52084q;

    /* renamed from: r  reason: collision with root package name */
    private int f52085r;

    /* renamed from: s  reason: collision with root package name */
    private long f52086s;

    /* renamed from: t  reason: collision with root package name */
    private ji.x f52087t;

    /* renamed from: u  reason: collision with root package name */
    private long f52088u;

    public i(boolean z11) {
        this(z11, null);
    }

    private void b() {
        ak.a.e(this.f52073f);
        ak.k0.j(this.f52087t);
        ak.k0.j(this.f52074g);
    }

    private void g(ak.v vVar) {
        if (vVar.a() == 0) {
            return;
        }
        this.f52069b.f539a[0] = vVar.d()[vVar.e()];
        this.f52069b.p(2);
        int h11 = this.f52069b.h(4);
        int i11 = this.f52081n;
        if (i11 != -1 && h11 != i11) {
            q();
            return;
        }
        if (!this.f52079l) {
            this.f52079l = true;
            this.f52080m = this.f52082o;
            this.f52081n = h11;
        }
        t();
    }

    private boolean h(ak.v vVar, int i11) {
        vVar.O(i11 + 1);
        if (w(vVar, this.f52069b.f539a, 1)) {
            this.f52069b.p(4);
            int h11 = this.f52069b.h(1);
            int i12 = this.f52080m;
            if (i12 == -1 || h11 == i12) {
                if (this.f52081n != -1) {
                    if (!w(vVar, this.f52069b.f539a, 1)) {
                        return true;
                    }
                    this.f52069b.p(2);
                    if (this.f52069b.h(4) != this.f52081n) {
                        return false;
                    }
                    vVar.O(i11 + 2);
                }
                if (w(vVar, this.f52069b.f539a, 4)) {
                    this.f52069b.p(14);
                    int h12 = this.f52069b.h(13);
                    if (h12 < 7) {
                        return false;
                    }
                    byte[] d11 = vVar.d();
                    int f11 = vVar.f();
                    int i13 = i11 + h12;
                    if (i13 >= f11) {
                        return true;
                    }
                    if (d11[i13] == -1) {
                        int i14 = i13 + 1;
                        if (i14 == f11) {
                            return true;
                        }
                        return l((byte) -1, d11[i14]) && ((d11[i14] & 8) >> 3) == h11;
                    } else if (d11[i13] != 73) {
                        return false;
                    } else {
                        int i15 = i13 + 1;
                        if (i15 == f11) {
                            return true;
                        }
                        if (d11[i15] != 68) {
                            return false;
                        }
                        int i16 = i13 + 2;
                        return i16 == f11 || d11[i16] == 51;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    private boolean i(ak.v vVar, byte[] bArr, int i11) {
        int min = Math.min(vVar.a(), i11 - this.f52076i);
        vVar.j(bArr, this.f52076i, min);
        int i12 = this.f52076i + min;
        this.f52076i = i12;
        return i12 == i11;
    }

    private void j(ak.v vVar) {
        byte[] d11 = vVar.d();
        int e11 = vVar.e();
        int f11 = vVar.f();
        while (e11 < f11) {
            int i11 = e11 + 1;
            int i12 = d11[e11] & 255;
            if (this.f52077j == 512 && l((byte) -1, (byte) i12) && (this.f52079l || h(vVar, i11 - 2))) {
                this.f52082o = (i12 & 8) >> 3;
                this.f52078k = (i12 & 1) == 0;
                if (!this.f52079l) {
                    r();
                } else {
                    t();
                }
                vVar.O(i11);
                return;
            }
            int i13 = this.f52077j;
            int i14 = i12 | i13;
            if (i14 == 329) {
                this.f52077j = 768;
            } else if (i14 == 511) {
                this.f52077j = 512;
            } else if (i14 == 836) {
                this.f52077j = 1024;
            } else if (i14 == 1075) {
                u();
                vVar.O(i11);
                return;
            } else if (i13 != 256) {
                this.f52077j = 256;
                i11--;
            }
            e11 = i11;
        }
        vVar.O(e11);
    }

    private boolean l(byte b11, byte b12) {
        return m(((b11 & 255) << 8) | (b12 & 255));
    }

    public static boolean m(int i11) {
        return (i11 & 65526) == 65520;
    }

    private void n() {
        this.f52069b.p(0);
        if (!this.f52083p) {
            int h11 = this.f52069b.h(2) + 1;
            if (h11 != 2) {
                StringBuilder sb2 = new StringBuilder(61);
                sb2.append("Detected audio object type: ");
                sb2.append(h11);
                sb2.append(", but assuming AAC LC.");
                ak.o.h("AdtsReader", sb2.toString());
                h11 = 2;
            }
            this.f52069b.r(5);
            byte[] b11 = ei.a.b(h11, this.f52081n, this.f52069b.h(3));
            a.b g11 = ei.a.g(b11);
            ci.i E = new i.b().S(this.f52072e).e0("audio/mp4a-latm").I(g11.f25111c).H(g11.f25110b).f0(g11.f25109a).T(Collections.singletonList(b11)).V(this.f52071d).E();
            this.f52084q = 1024000000 / E.E;
            this.f52073f.d(E);
            this.f52083p = true;
        } else {
            this.f52069b.r(10);
        }
        this.f52069b.r(4);
        int h12 = (this.f52069b.h(13) - 2) - 5;
        if (this.f52078k) {
            h12 -= 2;
        }
        v(this.f52073f, this.f52084q, 0, h12);
    }

    private void o() {
        this.f52074g.e(this.f52070c, 10);
        this.f52070c.O(6);
        v(this.f52074g, 0L, 10, this.f52070c.B() + 10);
    }

    private void p(ak.v vVar) {
        int min = Math.min(vVar.a(), this.f52085r - this.f52076i);
        this.f52087t.e(vVar, min);
        int i11 = this.f52076i + min;
        this.f52076i = i11;
        int i12 = this.f52085r;
        if (i11 == i12) {
            this.f52087t.f(this.f52086s, 1, i12, 0, null);
            this.f52086s += this.f52088u;
            s();
        }
    }

    private void q() {
        this.f52079l = false;
        s();
    }

    private void r() {
        this.f52075h = 1;
        this.f52076i = 0;
    }

    private void s() {
        this.f52075h = 0;
        this.f52076i = 0;
        this.f52077j = 256;
    }

    private void t() {
        this.f52075h = 3;
        this.f52076i = 0;
    }

    private void u() {
        this.f52075h = 2;
        this.f52076i = f52067v.length;
        this.f52085r = 0;
        this.f52070c.O(0);
    }

    private void v(ji.x xVar, long j11, int i11, int i12) {
        this.f52075h = 4;
        this.f52076i = i11;
        this.f52087t = xVar;
        this.f52088u = j11;
        this.f52085r = i12;
    }

    private boolean w(ak.v vVar, byte[] bArr, int i11) {
        if (vVar.a() < i11) {
            return false;
        }
        vVar.j(bArr, 0, i11);
        return true;
    }

    @Override // ti.m
    public void a() {
        q();
    }

    @Override // ti.m
    public void c(ak.v vVar) {
        b();
        while (vVar.a() > 0) {
            int i11 = this.f52075h;
            if (i11 == 0) {
                j(vVar);
            } else if (i11 == 1) {
                g(vVar);
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (i(vVar, this.f52069b.f539a, this.f52078k ? 7 : 5)) {
                        n();
                    }
                } else if (i11 == 4) {
                    p(vVar);
                } else {
                    throw new IllegalStateException();
                }
            } else if (i(vVar, this.f52070c.d(), 10)) {
                o();
            }
        }
    }

    @Override // ti.m
    public void d() {
    }

    @Override // ti.m
    public void e(ji.j jVar, i0.d dVar) {
        dVar.a();
        this.f52072e = dVar.b();
        ji.x f11 = jVar.f(dVar.c(), 1);
        this.f52073f = f11;
        this.f52087t = f11;
        if (this.f52068a) {
            dVar.a();
            ji.x f12 = jVar.f(dVar.c(), 5);
            this.f52074g = f12;
            f12.d(new i.b().S(dVar.b()).e0("application/id3").E());
            return;
        }
        this.f52074g = new ji.g();
    }

    @Override // ti.m
    public void f(long j11, int i11) {
        this.f52086s = j11;
    }

    public long k() {
        return this.f52084q;
    }

    public i(boolean z11, String str) {
        this.f52069b = new ak.u(new byte[7]);
        this.f52070c = new ak.v(Arrays.copyOf(f52067v, 10));
        s();
        this.f52080m = -1;
        this.f52081n = -1;
        this.f52084q = -9223372036854775807L;
        this.f52068a = z11;
        this.f52071d = str;
    }
}