package c1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: a  reason: collision with root package name */
    private final List<i0> f8685a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8686b;

    /* renamed from: c  reason: collision with root package name */
    private int f8687c;

    /* renamed from: d  reason: collision with root package name */
    private final List<i0> f8688d;

    /* renamed from: e  reason: collision with root package name */
    private final HashMap<Integer, c0> f8689e;

    /* renamed from: f  reason: collision with root package name */
    private final vz.k f8690f;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<HashMap<Object, LinkedHashSet<i0>>> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final HashMap<Object, LinkedHashSet<i0>> invoke() {
            HashMap<Object, LinkedHashSet<i0>> I;
            Object z11;
            I = k.I();
            t0 t0Var = t0.this;
            int size = t0Var.b().size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                i0 i0Var = t0Var.b().get(i11);
                z11 = k.z(i0Var);
                k.L(I, z11, i0Var);
                i11 = i12;
            }
            return I;
        }
    }

    public t0(List<i0> keyInfos, int i11) {
        vz.k a11;
        kotlin.jvm.internal.s.g(keyInfos, "keyInfos");
        this.f8685a = keyInfos;
        this.f8686b = i11;
        if (i11 >= 0) {
            this.f8688d = new ArrayList();
            HashMap<Integer, c0> hashMap = new HashMap<>();
            int size = b().size();
            int i12 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                i0 i0Var = b().get(i13);
                hashMap.put(Integer.valueOf(i0Var.b()), new c0(i13, i12, i0Var.c()));
                i12 += i0Var.c();
            }
            this.f8689e = hashMap;
            a11 = vz.m.a(new a());
            this.f8690f = a11;
            return;
        }
        throw new IllegalArgumentException("Invalid start index".toString());
    }

    public final int a() {
        return this.f8687c;
    }

    public final List<i0> b() {
        return this.f8685a;
    }

    public final HashMap<Object, LinkedHashSet<i0>> c() {
        return (HashMap) this.f8690f.getValue();
    }

    public final i0 d(int i11, Object obj) {
        Object K;
        K = k.K(c(), obj != null ? new h0(Integer.valueOf(i11), obj) : Integer.valueOf(i11));
        return (i0) K;
    }

    public final int e() {
        return this.f8686b;
    }

    public final List<i0> f() {
        return this.f8688d;
    }

    public final int g(i0 keyInfo) {
        kotlin.jvm.internal.s.g(keyInfo, "keyInfo");
        c0 c0Var = this.f8689e.get(Integer.valueOf(keyInfo.b()));
        if (c0Var == null) {
            return -1;
        }
        return c0Var.b();
    }

    public final boolean h(i0 keyInfo) {
        kotlin.jvm.internal.s.g(keyInfo, "keyInfo");
        return this.f8688d.add(keyInfo);
    }

    public final void i(i0 keyInfo, int i11) {
        kotlin.jvm.internal.s.g(keyInfo, "keyInfo");
        this.f8689e.put(Integer.valueOf(keyInfo.b()), new c0(-1, i11, 0));
    }

    public final void j(int i11, int i12, int i13) {
        if (i11 > i12) {
            Collection<c0> values = this.f8689e.values();
            kotlin.jvm.internal.s.f(values, "groupInfos.values");
            for (c0 c0Var : values) {
                int b11 = c0Var.b();
                if (i11 <= b11 && b11 < i11 + i13) {
                    c0Var.e((b11 - i11) + i12);
                } else if (i12 <= b11 && b11 < i11) {
                    c0Var.e(b11 + i13);
                }
            }
        } else if (i12 > i11) {
            Collection<c0> values2 = this.f8689e.values();
            kotlin.jvm.internal.s.f(values2, "groupInfos.values");
            for (c0 c0Var2 : values2) {
                int b12 = c0Var2.b();
                if (i11 <= b12 && b12 < i11 + i13) {
                    c0Var2.e((b12 - i11) + i12);
                } else if (i11 + 1 <= b12 && b12 < i12) {
                    c0Var2.e(b12 - i13);
                }
            }
        }
    }

    public final void k(int i11, int i12) {
        if (i11 > i12) {
            Collection<c0> values = this.f8689e.values();
            kotlin.jvm.internal.s.f(values, "groupInfos.values");
            for (c0 c0Var : values) {
                int c11 = c0Var.c();
                if (c11 == i11) {
                    c0Var.f(i12);
                } else if (i12 <= c11 && c11 < i11) {
                    c0Var.f(c11 + 1);
                }
            }
        } else if (i12 > i11) {
            Collection<c0> values2 = this.f8689e.values();
            kotlin.jvm.internal.s.f(values2, "groupInfos.values");
            for (c0 c0Var2 : values2) {
                int c12 = c0Var2.c();
                if (c12 == i11) {
                    c0Var2.f(i12);
                } else if (i11 + 1 <= c12 && c12 < i12) {
                    c0Var2.f(c12 - 1);
                }
            }
        }
    }

    public final void l(int i11) {
        this.f8687c = i11;
    }

    public final int m(i0 keyInfo) {
        kotlin.jvm.internal.s.g(keyInfo, "keyInfo");
        c0 c0Var = this.f8689e.get(Integer.valueOf(keyInfo.b()));
        if (c0Var == null) {
            return -1;
        }
        return c0Var.c();
    }

    public final boolean n(int i11, int i12) {
        c0 c0Var = this.f8689e.get(Integer.valueOf(i11));
        if (c0Var != null) {
            int b11 = c0Var.b();
            int a11 = i12 - c0Var.a();
            c0Var.d(i12);
            if (a11 != 0) {
                Collection<c0> values = this.f8689e.values();
                kotlin.jvm.internal.s.f(values, "groupInfos.values");
                for (c0 c0Var2 : values) {
                    if (c0Var2.b() >= b11 && !kotlin.jvm.internal.s.c(c0Var2, c0Var)) {
                        c0Var2.e(c0Var2.b() + a11);
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public final int o(i0 keyInfo) {
        kotlin.jvm.internal.s.g(keyInfo, "keyInfo");
        c0 c0Var = this.f8689e.get(Integer.valueOf(keyInfo.b()));
        Integer valueOf = c0Var == null ? null : Integer.valueOf(c0Var.a());
        return valueOf == null ? keyInfo.c() : valueOf.intValue();
    }
}