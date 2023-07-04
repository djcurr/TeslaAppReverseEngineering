package g20;

/* loaded from: classes5.dex */
public interface k {

    /* loaded from: classes5.dex */
    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public static final a f27416a = new a();

        private a() {
        }

        @Override // g20.k
        public boolean a() {
            return b.b(this);
        }

        @Override // g20.k
        public boolean b() {
            return b.f(this);
        }

        @Override // g20.k
        public boolean c() {
            return b.g(this);
        }

        @Override // g20.k
        public boolean d() {
            return b.a(this);
        }

        @Override // g20.k
        public boolean e() {
            return b.e(this);
        }

        @Override // g20.k
        public boolean f() {
            return b.d(this);
        }

        @Override // g20.k
        public boolean g() {
            return b.c(this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        public static boolean a(k kVar) {
            kotlin.jvm.internal.s.g(kVar, "this");
            return false;
        }

        public static boolean b(k kVar) {
            kotlin.jvm.internal.s.g(kVar, "this");
            return false;
        }

        public static boolean c(k kVar) {
            kotlin.jvm.internal.s.g(kVar, "this");
            return false;
        }

        public static boolean d(k kVar) {
            kotlin.jvm.internal.s.g(kVar, "this");
            return false;
        }

        public static boolean e(k kVar) {
            kotlin.jvm.internal.s.g(kVar, "this");
            return false;
        }

        public static boolean f(k kVar) {
            kotlin.jvm.internal.s.g(kVar, "this");
            return false;
        }

        public static boolean g(k kVar) {
            kotlin.jvm.internal.s.g(kVar, "this");
            return true;
        }
    }

    boolean a();

    boolean b();

    boolean c();

    boolean d();

    boolean e();

    boolean f();

    boolean g();
}