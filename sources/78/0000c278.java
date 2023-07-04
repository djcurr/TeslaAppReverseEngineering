package yh;

import yh.e;

/* loaded from: classes3.dex */
final class a extends e {

    /* renamed from: b  reason: collision with root package name */
    private final long f59497b;

    /* renamed from: c  reason: collision with root package name */
    private final int f59498c;

    /* renamed from: d  reason: collision with root package name */
    private final int f59499d;

    /* renamed from: e  reason: collision with root package name */
    private final long f59500e;

    /* renamed from: f  reason: collision with root package name */
    private final int f59501f;

    /* loaded from: classes3.dex */
    static final class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f59502a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f59503b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f59504c;

        /* renamed from: d  reason: collision with root package name */
        private Long f59505d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f59506e;

        @Override // yh.e.a
        e a() {
            String str = "";
            if (this.f59502a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f59503b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f59504c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f59505d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f59506e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new a(this.f59502a.longValue(), this.f59503b.intValue(), this.f59504c.intValue(), this.f59505d.longValue(), this.f59506e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // yh.e.a
        e.a b(int i11) {
            this.f59504c = Integer.valueOf(i11);
            return this;
        }

        @Override // yh.e.a
        e.a c(long j11) {
            this.f59505d = Long.valueOf(j11);
            return this;
        }

        @Override // yh.e.a
        e.a d(int i11) {
            this.f59503b = Integer.valueOf(i11);
            return this;
        }

        @Override // yh.e.a
        e.a e(int i11) {
            this.f59506e = Integer.valueOf(i11);
            return this;
        }

        @Override // yh.e.a
        e.a f(long j11) {
            this.f59502a = Long.valueOf(j11);
            return this;
        }
    }

    @Override // yh.e
    int b() {
        return this.f59499d;
    }

    @Override // yh.e
    long c() {
        return this.f59500e;
    }

    @Override // yh.e
    int d() {
        return this.f59498c;
    }

    @Override // yh.e
    int e() {
        return this.f59501f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return this.f59497b == eVar.f() && this.f59498c == eVar.d() && this.f59499d == eVar.b() && this.f59500e == eVar.c() && this.f59501f == eVar.e();
        }
        return false;
    }

    @Override // yh.e
    long f() {
        return this.f59497b;
    }

    public int hashCode() {
        long j11 = this.f59497b;
        long j12 = this.f59500e;
        return ((((((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f59498c) * 1000003) ^ this.f59499d) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f59501f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f59497b + ", loadBatchSize=" + this.f59498c + ", criticalSectionEnterTimeoutMs=" + this.f59499d + ", eventCleanUpAge=" + this.f59500e + ", maxBlobByteSizePerRow=" + this.f59501f + "}";
    }

    private a(long j11, int i11, int i12, long j12, int i13) {
        this.f59497b = j11;
        this.f59498c = i11;
        this.f59499d = i12;
        this.f59500e = j12;
        this.f59501f = i13;
    }
}