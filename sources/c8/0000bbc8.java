package w00;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Map;

/* loaded from: classes5.dex */
public final class y0 {

    /* renamed from: a */
    public static final y0 f55331a = new y0();

    /* renamed from: b */
    private static final Map<z0, Integer> f55332b;

    /* loaded from: classes5.dex */
    public static final class a extends z0 {

        /* renamed from: c */
        public static final a f55333c = new a();

        private a() {
            super("inherited", false);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends z0 {

        /* renamed from: c */
        public static final b f55334c = new b();

        private b() {
            super("internal", false);
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends z0 {

        /* renamed from: c */
        public static final c f55335c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends z0 {

        /* renamed from: c */
        public static final d f55336c = new d();

        private d() {
            super(ImagesContract.LOCAL, false);
        }
    }

    /* loaded from: classes5.dex */
    public static final class e extends z0 {

        /* renamed from: c */
        public static final e f55337c = new e();

        private e() {
            super("private", false);
        }
    }

    /* loaded from: classes5.dex */
    public static final class f extends z0 {

        /* renamed from: c */
        public static final f f55338c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // w00.z0
        public String b() {
            return "private/*private to this*/";
        }
    }

    /* loaded from: classes5.dex */
    public static final class g extends z0 {

        /* renamed from: c */
        public static final g f55339c = new g();

        private g() {
            super("protected", true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class h extends z0 {

        /* renamed from: c */
        public static final h f55340c = new h();

        private h() {
            super("public", true);
        }
    }

    /* loaded from: classes5.dex */
    public static final class i extends z0 {

        /* renamed from: c */
        public static final i f55341c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map c11;
        Map<z0, Integer> b11;
        c11 = wz.r0.c();
        c11.put(f.f55338c, 0);
        c11.put(e.f55337c, 0);
        c11.put(b.f55334c, 1);
        c11.put(g.f55339c, 1);
        c11.put(h.f55340c, 2);
        b11 = wz.r0.b(c11);
        f55332b = b11;
    }

    private y0() {
    }

    public final Integer a(z0 first, z0 second) {
        kotlin.jvm.internal.s.g(first, "first");
        kotlin.jvm.internal.s.g(second, "second");
        if (first == second) {
            return 0;
        }
        Map<z0, Integer> map = f55332b;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num == null || num2 == null || kotlin.jvm.internal.s.c(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(z0 visibility) {
        kotlin.jvm.internal.s.g(visibility, "visibility");
        return visibility == e.f55337c || visibility == f.f55338c;
    }
}