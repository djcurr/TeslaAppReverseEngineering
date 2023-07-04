package io.sentry;

import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a */
    private final ArrayList<c> f32599a = new ArrayList<>();

    /* loaded from: classes5.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32600a;

        static {
            int[] iArr = new int[io.sentry.vendor.gson.stream.b.values().length];
            f32600a = iArr;
            try {
                iArr[io.sentry.vendor.gson.stream.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32600a[io.sentry.vendor.gson.stream.b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32600a[io.sentry.vendor.gson.stream.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32600a[io.sentry.vendor.gson.stream.b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32600a[io.sentry.vendor.gson.stream.b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32600a[io.sentry.vendor.gson.stream.b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32600a[io.sentry.vendor.gson.stream.b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32600a[io.sentry.vendor.gson.stream.b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32600a[io.sentry.vendor.gson.stream.b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32600a[io.sentry.vendor.gson.stream.b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* loaded from: classes5.dex */
    public interface b {
        Object a();
    }

    /* loaded from: classes5.dex */
    public interface c {
        Object getValue();
    }

    /* loaded from: classes5.dex */
    public static final class f implements c {

        /* renamed from: a */
        final String f32603a;

        f(String str) {
            this.f32603a = str;
        }

        @Override // io.sentry.s0.c
        public Object getValue() {
            return this.f32603a;
        }
    }

    /* loaded from: classes5.dex */
    public static final class g implements c {

        /* renamed from: a */
        final Object f32604a;

        g(Object obj) {
            this.f32604a = obj;
        }

        @Override // io.sentry.s0.c
        public Object getValue() {
            return this.f32604a;
        }
    }

    public static /* synthetic */ Object b() {
        return i();
    }

    private c d() {
        if (this.f32599a.isEmpty()) {
            return null;
        }
        ArrayList<c> arrayList = this.f32599a;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean e() {
        if (g()) {
            return true;
        }
        c d11 = d();
        l();
        if (d() instanceof f) {
            f fVar = (f) d();
            l();
            e eVar = (e) d();
            if (fVar == null || d11 == null || eVar == null) {
                return false;
            }
            eVar.f32602a.put(fVar.f32603a, d11.getValue());
            return false;
        } else if (d() instanceof d) {
            d dVar = (d) d();
            if (d11 == null || dVar == null) {
                return false;
            }
            dVar.f32601a.add(d11.getValue());
            return false;
        } else {
            return false;
        }
    }

    private boolean f(b bVar) {
        Object a11 = bVar.a();
        if (d() == null && a11 != null) {
            m(new g(a11));
            return true;
        } else if (d() instanceof f) {
            l();
            ((e) d()).f32602a.put(((f) d()).f32603a, a11);
            return false;
        } else if (d() instanceof d) {
            ((d) d()).f32601a.add(a11);
            return false;
        } else {
            return false;
        }
    }

    private boolean g() {
        return this.f32599a.size() == 1;
    }

    public static /* synthetic */ Object i() {
        return null;
    }

    /* renamed from: j */
    public Object h(t0 t0Var) {
        try {
            try {
                return Integer.valueOf(t0Var.e0());
            } catch (Exception unused) {
                return Long.valueOf(t0Var.n0());
            }
        } catch (Exception unused2) {
            return Double.valueOf(t0Var.a0());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void k(final t0 t0Var) {
        boolean z11;
        switch (a.f32600a[t0Var.G0().ordinal()]) {
            case 1:
                t0Var.a();
                m(new d(null));
                z11 = false;
                break;
            case 2:
                t0Var.p();
                z11 = e();
                break;
            case 3:
                t0Var.g();
                m(new e(null));
                z11 = false;
                break;
            case 4:
                t0Var.C();
                z11 = e();
                break;
            case 5:
                m(new f(t0Var.p0()));
                z11 = false;
                break;
            case 6:
                z11 = f(new b() { // from class: io.sentry.q0
                    @Override // io.sentry.s0.b
                    public final Object a() {
                        return t0.this.D0();
                    }
                });
                break;
            case 7:
                z11 = f(new b() { // from class: io.sentry.o0
                    @Override // io.sentry.s0.b
                    public final Object a() {
                        Object h11;
                        h11 = s0.this.h(t0Var);
                        return h11;
                    }
                });
                break;
            case 8:
                z11 = f(new b() { // from class: io.sentry.p0
                    @Override // io.sentry.s0.b
                    public final Object a() {
                        return Boolean.valueOf(t0.this.R());
                    }
                });
                break;
            case 9:
                t0Var.u0();
                z11 = f(new b() { // from class: io.sentry.r0
                    @Override // io.sentry.s0.b
                    public final Object a() {
                        return s0.b();
                    }
                });
                break;
            case 10:
                z11 = true;
                break;
            default:
                z11 = false;
                break;
        }
        if (z11) {
            return;
        }
        k(t0Var);
    }

    private void l() {
        if (this.f32599a.isEmpty()) {
            return;
        }
        ArrayList<c> arrayList = this.f32599a;
        arrayList.remove(arrayList.size() - 1);
    }

    private void m(c cVar) {
        this.f32599a.add(cVar);
    }

    public Object c(t0 t0Var) {
        k(t0Var);
        c d11 = d();
        if (d11 != null) {
            return d11.getValue();
        }
        return null;
    }

    /* loaded from: classes5.dex */
    public static final class d implements c {

        /* renamed from: a */
        final ArrayList<Object> f32601a;

        private d() {
            this.f32601a = new ArrayList<>();
        }

        @Override // io.sentry.s0.c
        public Object getValue() {
            return this.f32601a;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class e implements c {

        /* renamed from: a */
        final HashMap<String, Object> f32602a;

        private e() {
            this.f32602a = new HashMap<>();
        }

        @Override // io.sentry.s0.c
        public Object getValue() {
            return this.f32602a;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}