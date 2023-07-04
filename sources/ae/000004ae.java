package androidx.compose.ui.platform;

import android.os.Parcel;
import android.util.Base64;
import java.util.List;
import w2.e;

/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: a  reason: collision with root package name */
    private final Parcel f3041a;

    public m0(String string) {
        kotlin.jvm.internal.s.g(string, "string");
        Parcel obtain = Parcel.obtain();
        kotlin.jvm.internal.s.f(obtain, "obtain()");
        this.f3041a = obtain;
        byte[] decode = Base64.decode(string, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    private final int a() {
        return this.f3041a.dataAvail();
    }

    private final float b() {
        return w2.a.c(e());
    }

    private final byte c() {
        return this.f3041a.readByte();
    }

    private final float e() {
        return this.f3041a.readFloat();
    }

    private final int i() {
        return this.f3041a.readInt();
    }

    private final t1.a1 j() {
        return new t1.a1(d(), s1.g.a(e(), e()), e(), null);
    }

    private final String l() {
        return this.f3041a.readString();
    }

    private final w2.e m() {
        List<w2.e> l11;
        int i11 = i();
        e.a aVar = w2.e.f55408b;
        boolean z11 = (aVar.b().e() & i11) != 0;
        boolean z12 = (i11 & aVar.d().e()) != 0;
        if (z11 && z12) {
            l11 = wz.w.l(aVar.b(), aVar.d());
            return aVar.a(l11);
        } else if (z11) {
            return aVar.b();
        } else {
            if (z12) {
                return aVar.d();
            }
            return aVar.c();
        }
    }

    private final w2.g n() {
        return new w2.g(e(), e());
    }

    private final long p() {
        return vz.y.b(this.f3041a.readLong());
    }

    public final long d() {
        return t1.a0.i(p());
    }

    public final int f() {
        byte c11 = c();
        if (c11 == 0) {
            return r2.j.f49081b.b();
        }
        if (c11 == 1) {
            return r2.j.f49081b.a();
        }
        return r2.j.f49081b.b();
    }

    public final int g() {
        byte c11 = c();
        if (c11 == 0) {
            return r2.k.f49085b.b();
        }
        if (c11 == 1) {
            return r2.k.f49085b.a();
        }
        if (c11 == 3) {
            return r2.k.f49085b.c();
        }
        if (c11 == 2) {
            return r2.k.f49085b.d();
        }
        return r2.k.f49085b.b();
    }

    public final r2.l h() {
        return new r2.l(i());
    }

    public final n2.s k() {
        e1 e1Var;
        e1 e1Var2 = r15;
        e1 e1Var3 = new e1(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f3041a.dataAvail() > 1) {
            byte c11 = c();
            if (c11 != 1) {
                e1Var = e1Var2;
                if (c11 == 2) {
                    if (a() < 5) {
                        break;
                    }
                    e1Var.l(o());
                    e1Var2 = e1Var;
                } else if (c11 == 3) {
                    if (a() < 4) {
                        break;
                    }
                    e1Var.o(h());
                    e1Var2 = e1Var;
                } else if (c11 == 4) {
                    if (a() < 1) {
                        break;
                    }
                    e1Var.m(r2.j.c(f()));
                    e1Var2 = e1Var;
                } else if (c11 != 5) {
                    if (c11 != 6) {
                        if (c11 != 7) {
                            if (c11 != 8) {
                                if (c11 != 9) {
                                    if (c11 != 10) {
                                        if (c11 != 11) {
                                            if (c11 == 12) {
                                                if (a() < 20) {
                                                    break;
                                                }
                                                e1Var.q(j());
                                            }
                                        } else if (a() < 4) {
                                            break;
                                        } else {
                                            e1Var.r(m());
                                        }
                                    } else if (a() < 8) {
                                        break;
                                    } else {
                                        e1Var.h(d());
                                    }
                                } else if (a() < 8) {
                                    break;
                                } else {
                                    e1Var.s(n());
                                }
                            } else if (a() < 4) {
                                break;
                            } else {
                                e1Var.i(w2.a.b(b()));
                            }
                        } else if (a() < 5) {
                            break;
                        } else {
                            e1Var.p(o());
                        }
                    } else {
                        e1Var.k(l());
                    }
                    e1Var2 = e1Var;
                } else if (a() < 1) {
                    break;
                } else {
                    e1Var.n(r2.k.e(g()));
                    e1Var2 = e1Var;
                }
            } else if (a() < 8) {
                break;
            } else {
                e1Var2.j(d());
            }
        }
        e1Var = e1Var2;
        return e1Var.t();
    }

    public final long o() {
        long c11;
        byte c12 = c();
        if (c12 == 1) {
            c11 = x2.t.f56961b.b();
        } else if (c12 == 2) {
            c11 = x2.t.f56961b.a();
        } else {
            c11 = x2.t.f56961b.c();
        }
        if (x2.t.g(c11, x2.t.f56961b.c())) {
            return x2.r.f56957b.a();
        }
        return x2.s.a(e(), c11);
    }
}