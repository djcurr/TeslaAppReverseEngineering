package ti;

import android.util.SparseArray;
import ci.i;
import java.util.ArrayList;
import java.util.List;
import ti.i0;

/* loaded from: classes3.dex */
public final class j implements i0.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f52100a;

    /* renamed from: b  reason: collision with root package name */
    private final List<ci.i> f52101b;

    public j(int i11) {
        this(i11, com.google.common.collect.r.r());
    }

    private d0 c(i0.b bVar) {
        return new d0(e(bVar));
    }

    private k0 d(i0.b bVar) {
        return new k0(e(bVar));
    }

    private List<ci.i> e(i0.b bVar) {
        String str;
        int i11;
        if (f(32)) {
            return this.f52101b;
        }
        ak.v vVar = new ak.v(bVar.f52094d);
        List<ci.i> list = this.f52101b;
        while (vVar.a() > 0) {
            int C = vVar.C();
            int e11 = vVar.e() + vVar.C();
            if (C == 134) {
                list = new ArrayList<>();
                int C2 = vVar.C() & 31;
                for (int i12 = 0; i12 < C2; i12++) {
                    String z11 = vVar.z(3);
                    int C3 = vVar.C();
                    boolean z12 = (C3 & 128) != 0;
                    if (z12) {
                        i11 = C3 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i11 = 1;
                    }
                    byte C4 = (byte) vVar.C();
                    vVar.P(1);
                    List<byte[]> list2 = null;
                    if (z12) {
                        list2 = ak.c.b((C4 & 64) != 0);
                    }
                    list.add(new i.b().e0(str).V(z11).F(i11).T(list2).E());
                }
            }
            vVar.O(e11);
        }
        return list;
    }

    private boolean f(int i11) {
        return (i11 & this.f52100a) != 0;
    }

    @Override // ti.i0.c
    public i0 a(int i11, i0.b bVar) {
        if (i11 != 2) {
            if (i11 == 3 || i11 == 4) {
                return new w(new t(bVar.f52092b));
            }
            if (i11 != 21) {
                if (i11 == 27) {
                    if (f(4)) {
                        return null;
                    }
                    return new w(new p(c(bVar), f(1), f(8)));
                } else if (i11 != 36) {
                    if (i11 != 89) {
                        if (i11 != 138) {
                            if (i11 != 172) {
                                if (i11 != 257) {
                                    if (i11 != 129) {
                                        if (i11 != 130) {
                                            if (i11 == 134) {
                                                if (f(16)) {
                                                    return null;
                                                }
                                                return new c0(new v("application/x-scte35"));
                                            } else if (i11 != 135) {
                                                switch (i11) {
                                                    case 15:
                                                        if (f(2)) {
                                                            return null;
                                                        }
                                                        return new w(new i(false, bVar.f52092b));
                                                    case 16:
                                                        return new w(new o(d(bVar)));
                                                    case 17:
                                                        if (f(2)) {
                                                            return null;
                                                        }
                                                        return new w(new s(bVar.f52092b));
                                                    default:
                                                        return null;
                                                }
                                            }
                                        } else if (!f(64)) {
                                            return null;
                                        }
                                    }
                                    return new w(new c(bVar.f52092b));
                                }
                                return new c0(new v("application/vnd.dvb.ait"));
                            }
                            return new w(new f(bVar.f52092b));
                        }
                        return new w(new k(bVar.f52092b));
                    }
                    return new w(new l(bVar.f52093c));
                } else {
                    return new w(new q(c(bVar)));
                }
            }
            return new w(new r());
        }
        return new w(new n(d(bVar)));
    }

    @Override // ti.i0.c
    public SparseArray<i0> b() {
        return new SparseArray<>();
    }

    public j(int i11, List<ci.i> list) {
        this.f52100a = i11;
        this.f52101b = list;
    }
}