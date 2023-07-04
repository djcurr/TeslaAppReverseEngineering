package th;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final long f51938a;

    /* renamed from: b  reason: collision with root package name */
    private final b f51939b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f51940a = 0;

        /* renamed from: b  reason: collision with root package name */
        private b f51941b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f51940a, this.f51941b);
        }

        public a b(long j11) {
            this.f51940a = j11;
            return this;
        }

        public a c(b bVar) {
            this.f51941b = bVar;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public enum b implements om.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        private final int number_;

        b(int i11) {
            this.number_ = i11;
        }

        @Override // om.c
        public int getNumber() {
            return this.number_;
        }
    }

    static {
        new a().a();
    }

    c(long j11, b bVar) {
        this.f51938a = j11;
        this.f51939b = bVar;
    }

    public static a c() {
        return new a();
    }

    @om.d(tag = 1)
    public long a() {
        return this.f51938a;
    }

    @om.d(tag = 3)
    public b b() {
        return this.f51939b;
    }
}