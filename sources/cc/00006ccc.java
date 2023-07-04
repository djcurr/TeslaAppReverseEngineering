package f2;

/* loaded from: classes.dex */
public interface d {

    /* renamed from: a  reason: collision with root package name */
    public static final a f25565a = a.f25566a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f25566a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final d f25567b;

        /* renamed from: c  reason: collision with root package name */
        private static final d f25568c;

        /* renamed from: f2.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0502a implements d {
            C0502a() {
            }

            @Override // f2.d
            public long a(long j11, long j12) {
                float f11;
                f11 = f2.e.f(j11, j12);
                return s0.a(f11, f11);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements d {
            b() {
            }

            @Override // f2.d
            public long a(long j11, long j12) {
                float h11;
                float e11;
                h11 = f2.e.h(j11, j12);
                e11 = f2.e.e(j11, j12);
                return s0.a(h11, e11);
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements d {
            c() {
            }

            @Override // f2.d
            public long a(long j11, long j12) {
                float e11;
                e11 = f2.e.e(j11, j12);
                return s0.a(e11, e11);
            }
        }

        /* renamed from: f2.d$a$d  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0503d implements d {
            C0503d() {
            }

            @Override // f2.d
            public long a(long j11, long j12) {
                float h11;
                h11 = f2.e.h(j11, j12);
                return s0.a(h11, h11);
            }
        }

        /* loaded from: classes.dex */
        public static final class e implements d {
            e() {
            }

            @Override // f2.d
            public long a(long j11, long j12) {
                float g11;
                g11 = f2.e.g(j11, j12);
                return s0.a(g11, g11);
            }
        }

        /* loaded from: classes.dex */
        public static final class f implements d {
            f() {
            }

            @Override // f2.d
            public long a(long j11, long j12) {
                float g11;
                if (s1.l.i(j11) > s1.l.i(j12) || s1.l.g(j11) > s1.l.g(j12)) {
                    g11 = f2.e.g(j11, j12);
                    return s0.a(g11, g11);
                }
                return s0.a(1.0f, 1.0f);
            }
        }

        static {
            new C0502a();
            f25567b = new e();
            new c();
            new C0503d();
            f25568c = new f();
            new g(1.0f);
            new b();
        }

        private a() {
        }

        public final d a() {
            return f25567b;
        }

        public final d b() {
            return f25568c;
        }
    }

    long a(long j11, long j12);
}