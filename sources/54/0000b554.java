package ti;

import ci.i;
import com.google.android.exoplayer2.ParserException;
import ei.a;
import java.util.Collections;
import ti.i0;

/* loaded from: classes3.dex */
public final class s implements m {

    /* renamed from: a  reason: collision with root package name */
    private final String f52251a;

    /* renamed from: b  reason: collision with root package name */
    private final ak.v f52252b;

    /* renamed from: c  reason: collision with root package name */
    private final ak.u f52253c;

    /* renamed from: d  reason: collision with root package name */
    private ji.x f52254d;

    /* renamed from: e  reason: collision with root package name */
    private String f52255e;

    /* renamed from: f  reason: collision with root package name */
    private ci.i f52256f;

    /* renamed from: g  reason: collision with root package name */
    private int f52257g;

    /* renamed from: h  reason: collision with root package name */
    private int f52258h;

    /* renamed from: i  reason: collision with root package name */
    private int f52259i;

    /* renamed from: j  reason: collision with root package name */
    private int f52260j;

    /* renamed from: k  reason: collision with root package name */
    private long f52261k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f52262l;

    /* renamed from: m  reason: collision with root package name */
    private int f52263m;

    /* renamed from: n  reason: collision with root package name */
    private int f52264n;

    /* renamed from: o  reason: collision with root package name */
    private int f52265o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f52266p;

    /* renamed from: q  reason: collision with root package name */
    private long f52267q;

    /* renamed from: r  reason: collision with root package name */
    private int f52268r;

    /* renamed from: s  reason: collision with root package name */
    private long f52269s;

    /* renamed from: t  reason: collision with root package name */
    private int f52270t;

    /* renamed from: u  reason: collision with root package name */
    private String f52271u;

    public s(String str) {
        this.f52251a = str;
        ak.v vVar = new ak.v(1024);
        this.f52252b = vVar;
        this.f52253c = new ak.u(vVar.d());
    }

    private static long b(ak.u uVar) {
        return uVar.h((uVar.h(2) + 1) * 8);
    }

    private void g(ak.u uVar) {
        if (!uVar.g()) {
            this.f52262l = true;
            l(uVar);
        } else if (!this.f52262l) {
            return;
        }
        if (this.f52263m == 0) {
            if (this.f52264n == 0) {
                k(uVar, j(uVar));
                if (this.f52266p) {
                    uVar.r((int) this.f52267q);
                    return;
                }
                return;
            }
            throw new ParserException();
        }
        throw new ParserException();
    }

    private int h(ak.u uVar) {
        int b11 = uVar.b();
        a.b f11 = ei.a.f(uVar, true);
        this.f52271u = f11.f25111c;
        this.f52268r = f11.f25109a;
        this.f52270t = f11.f25110b;
        return b11 - uVar.b();
    }

    private void i(ak.u uVar) {
        int h11 = uVar.h(3);
        this.f52265o = h11;
        if (h11 == 0) {
            uVar.r(8);
        } else if (h11 == 1) {
            uVar.r(9);
        } else if (h11 == 3 || h11 == 4 || h11 == 5) {
            uVar.r(6);
        } else if (h11 != 6 && h11 != 7) {
            throw new IllegalStateException();
        } else {
            uVar.r(1);
        }
    }

    private int j(ak.u uVar) {
        int h11;
        if (this.f52265o == 0) {
            int i11 = 0;
            do {
                h11 = uVar.h(8);
                i11 += h11;
            } while (h11 == 255);
            return i11;
        }
        throw new ParserException();
    }

    private void k(ak.u uVar, int i11) {
        int e11 = uVar.e();
        if ((e11 & 7) == 0) {
            this.f52252b.O(e11 >> 3);
        } else {
            uVar.i(this.f52252b.d(), 0, i11 * 8);
            this.f52252b.O(0);
        }
        this.f52254d.e(this.f52252b, i11);
        this.f52254d.f(this.f52261k, 1, i11, 0, null);
        this.f52261k += this.f52269s;
    }

    private void l(ak.u uVar) {
        boolean g11;
        int h11 = uVar.h(1);
        int h12 = h11 == 1 ? uVar.h(1) : 0;
        this.f52263m = h12;
        if (h12 == 0) {
            if (h11 == 1) {
                b(uVar);
            }
            if (uVar.g()) {
                this.f52264n = uVar.h(6);
                int h13 = uVar.h(4);
                int h14 = uVar.h(3);
                if (h13 == 0 && h14 == 0) {
                    if (h11 == 0) {
                        int e11 = uVar.e();
                        int h15 = h(uVar);
                        uVar.p(e11);
                        byte[] bArr = new byte[(h15 + 7) / 8];
                        uVar.i(bArr, 0, h15);
                        ci.i E = new i.b().S(this.f52255e).e0("audio/mp4a-latm").I(this.f52271u).H(this.f52270t).f0(this.f52268r).T(Collections.singletonList(bArr)).V(this.f52251a).E();
                        if (!E.equals(this.f52256f)) {
                            this.f52256f = E;
                            this.f52269s = 1024000000 / E.E;
                            this.f52254d.d(E);
                        }
                    } else {
                        uVar.r(((int) b(uVar)) - h(uVar));
                    }
                    i(uVar);
                    boolean g12 = uVar.g();
                    this.f52266p = g12;
                    this.f52267q = 0L;
                    if (g12) {
                        if (h11 == 1) {
                            this.f52267q = b(uVar);
                        } else {
                            do {
                                g11 = uVar.g();
                                this.f52267q = (this.f52267q << 8) + uVar.h(8);
                            } while (g11);
                        }
                    }
                    if (uVar.g()) {
                        uVar.r(8);
                        return;
                    }
                    return;
                }
                throw new ParserException();
            }
            throw new ParserException();
        }
        throw new ParserException();
    }

    private void m(int i11) {
        this.f52252b.K(i11);
        this.f52253c.n(this.f52252b.d());
    }

    @Override // ti.m
    public void a() {
        this.f52257g = 0;
        this.f52262l = false;
    }

    @Override // ti.m
    public void c(ak.v vVar) {
        ak.a.h(this.f52254d);
        while (vVar.a() > 0) {
            int i11 = this.f52257g;
            if (i11 != 0) {
                if (i11 == 1) {
                    int C = vVar.C();
                    if ((C & 224) == 224) {
                        this.f52260j = C;
                        this.f52257g = 2;
                    } else if (C != 86) {
                        this.f52257g = 0;
                    }
                } else if (i11 == 2) {
                    int C2 = ((this.f52260j & (-225)) << 8) | vVar.C();
                    this.f52259i = C2;
                    if (C2 > this.f52252b.d().length) {
                        m(this.f52259i);
                    }
                    this.f52258h = 0;
                    this.f52257g = 3;
                } else if (i11 == 3) {
                    int min = Math.min(vVar.a(), this.f52259i - this.f52258h);
                    vVar.j(this.f52253c.f539a, this.f52258h, min);
                    int i12 = this.f52258h + min;
                    this.f52258h = i12;
                    if (i12 == this.f52259i) {
                        this.f52253c.p(0);
                        g(this.f52253c);
                        this.f52257g = 0;
                    }
                } else {
                    throw new IllegalStateException();
                }
            } else if (vVar.C() == 86) {
                this.f52257g = 1;
            }
        }
    }

    @Override // ti.m
    public void d() {
    }

    @Override // ti.m
    public void e(ji.j jVar, i0.d dVar) {
        dVar.a();
        this.f52254d = jVar.f(dVar.c(), 1);
        this.f52255e = dVar.b();
    }

    @Override // ti.m
    public void f(long j11, int i11) {
        this.f52261k = j11;
    }
}