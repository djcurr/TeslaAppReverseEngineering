package io.grpc;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final String f30533a;

    /* renamed from: b  reason: collision with root package name */
    public final b f30534b;

    /* renamed from: c  reason: collision with root package name */
    public final long f30535c;

    /* renamed from: d  reason: collision with root package name */
    public final k0 f30536d;

    /* renamed from: e  reason: collision with root package name */
    public final k0 f30537e;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f30538a;

        /* renamed from: b  reason: collision with root package name */
        private b f30539b;

        /* renamed from: c  reason: collision with root package name */
        private Long f30540c;

        /* renamed from: d  reason: collision with root package name */
        private k0 f30541d;

        /* renamed from: e  reason: collision with root package name */
        private k0 f30542e;

        public c0 a() {
            com.google.common.base.u.p(this.f30538a, "description");
            com.google.common.base.u.p(this.f30539b, "severity");
            com.google.common.base.u.p(this.f30540c, "timestampNanos");
            com.google.common.base.u.v(this.f30541d == null || this.f30542e == null, "at least one of channelRef and subchannelRef must be null");
            return new c0(this.f30538a, this.f30539b, this.f30540c.longValue(), this.f30541d, this.f30542e);
        }

        public a b(String str) {
            this.f30538a = str;
            return this;
        }

        public a c(b bVar) {
            this.f30539b = bVar;
            return this;
        }

        public a d(k0 k0Var) {
            this.f30542e = k0Var;
            return this;
        }

        public a e(long j11) {
            this.f30540c = Long.valueOf(j11);
            return this;
        }
    }

    /* loaded from: classes5.dex */
    public enum b {
        CT_UNKNOWN,
        CT_INFO,
        CT_WARNING,
        CT_ERROR
    }

    public boolean equals(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return com.google.common.base.q.a(this.f30533a, c0Var.f30533a) && com.google.common.base.q.a(this.f30534b, c0Var.f30534b) && this.f30535c == c0Var.f30535c && com.google.common.base.q.a(this.f30536d, c0Var.f30536d) && com.google.common.base.q.a(this.f30537e, c0Var.f30537e);
        }
        return false;
    }

    public int hashCode() {
        return com.google.common.base.q.b(this.f30533a, this.f30534b, Long.valueOf(this.f30535c), this.f30536d, this.f30537e);
    }

    public String toString() {
        return com.google.common.base.o.c(this).d("description", this.f30533a).d("severity", this.f30534b).c("timestampNanos", this.f30535c).d("channelRef", this.f30536d).d("subchannelRef", this.f30537e).toString();
    }

    private c0(String str, b bVar, long j11, k0 k0Var, k0 k0Var2) {
        this.f30533a = str;
        this.f30534b = (b) com.google.common.base.u.p(bVar, "severity");
        this.f30535c = j11;
        this.f30536d = k0Var;
        this.f30537e = k0Var2;
    }
}