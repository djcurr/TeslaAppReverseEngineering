package am;

import am.a0;

/* loaded from: classes3.dex */
final class s extends a0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    private final Double f864a;

    /* renamed from: b  reason: collision with root package name */
    private final int f865b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f866c;

    /* renamed from: d  reason: collision with root package name */
    private final int f867d;

    /* renamed from: e  reason: collision with root package name */
    private final long f868e;

    /* renamed from: f  reason: collision with root package name */
    private final long f869f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        private Double f870a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f871b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f872c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f873d;

        /* renamed from: e  reason: collision with root package name */
        private Long f874e;

        /* renamed from: f  reason: collision with root package name */
        private Long f875f;

        @Override // am.a0.e.d.c.a
        public a0.e.d.c a() {
            String str = "";
            if (this.f871b == null) {
                str = " batteryVelocity";
            }
            if (this.f872c == null) {
                str = str + " proximityOn";
            }
            if (this.f873d == null) {
                str = str + " orientation";
            }
            if (this.f874e == null) {
                str = str + " ramUsed";
            }
            if (this.f875f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new s(this.f870a, this.f871b.intValue(), this.f872c.booleanValue(), this.f873d.intValue(), this.f874e.longValue(), this.f875f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.d.c.a
        public a0.e.d.c.a b(Double d11) {
            this.f870a = d11;
            return this;
        }

        @Override // am.a0.e.d.c.a
        public a0.e.d.c.a c(int i11) {
            this.f871b = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.e.d.c.a
        public a0.e.d.c.a d(long j11) {
            this.f875f = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.e.d.c.a
        public a0.e.d.c.a e(int i11) {
            this.f873d = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.e.d.c.a
        public a0.e.d.c.a f(boolean z11) {
            this.f872c = Boolean.valueOf(z11);
            return this;
        }

        @Override // am.a0.e.d.c.a
        public a0.e.d.c.a g(long j11) {
            this.f874e = Long.valueOf(j11);
            return this;
        }
    }

    @Override // am.a0.e.d.c
    public Double b() {
        return this.f864a;
    }

    @Override // am.a0.e.d.c
    public int c() {
        return this.f865b;
    }

    @Override // am.a0.e.d.c
    public long d() {
        return this.f869f;
    }

    @Override // am.a0.e.d.c
    public int e() {
        return this.f867d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.c) {
            a0.e.d.c cVar = (a0.e.d.c) obj;
            Double d11 = this.f864a;
            if (d11 != null ? d11.equals(cVar.b()) : cVar.b() == null) {
                if (this.f865b == cVar.c() && this.f866c == cVar.g() && this.f867d == cVar.e() && this.f868e == cVar.f() && this.f869f == cVar.d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // am.a0.e.d.c
    public long f() {
        return this.f868e;
    }

    @Override // am.a0.e.d.c
    public boolean g() {
        return this.f866c;
    }

    public int hashCode() {
        Double d11 = this.f864a;
        int hashCode = ((((d11 == null ? 0 : d11.hashCode()) ^ 1000003) * 1000003) ^ this.f865b) * 1000003;
        int i11 = this.f866c ? 1231 : 1237;
        long j11 = this.f868e;
        long j12 = this.f869f;
        return ((((((hashCode ^ i11) * 1000003) ^ this.f867d) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f864a + ", batteryVelocity=" + this.f865b + ", proximityOn=" + this.f866c + ", orientation=" + this.f867d + ", ramUsed=" + this.f868e + ", diskUsed=" + this.f869f + "}";
    }

    private s(Double d11, int i11, boolean z11, int i12, long j11, long j12) {
        this.f864a = d11;
        this.f865b = i11;
        this.f866c = z11;
        this.f867d = i12;
        this.f868e = j11;
        this.f869f = j12;
    }
}