package th;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final long f51950a;

    /* renamed from: b  reason: collision with root package name */
    private final long f51951b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f51952a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f51953b = 0;

        a() {
        }

        public f a() {
            return new f(this.f51952a, this.f51953b);
        }

        public a b(long j11) {
            this.f51953b = j11;
            return this;
        }

        public a c(long j11) {
            this.f51952a = j11;
            return this;
        }
    }

    static {
        new a().a();
    }

    f(long j11, long j12) {
        this.f51950a = j11;
        this.f51951b = j12;
    }

    public static a c() {
        return new a();
    }

    @om.d(tag = 2)
    public long a() {
        return this.f51951b;
    }

    @om.d(tag = 1)
    public long b() {
        return this.f51950a;
    }
}