package th;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final long f51946a;

    /* renamed from: b  reason: collision with root package name */
    private final long f51947b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f51948a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f51949b = 0;

        a() {
        }

        public e a() {
            return new e(this.f51948a, this.f51949b);
        }

        public a b(long j11) {
            this.f51948a = j11;
            return this;
        }

        public a c(long j11) {
            this.f51949b = j11;
            return this;
        }
    }

    static {
        new a().a();
    }

    e(long j11, long j12) {
        this.f51946a = j11;
        this.f51947b = j12;
    }

    public static a c() {
        return new a();
    }

    @om.d(tag = 1)
    public long a() {
        return this.f51946a;
    }

    @om.d(tag = 2)
    public long b() {
        return this.f51947b;
    }
}