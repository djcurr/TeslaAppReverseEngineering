package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class k extends a0.e.d {

    /* renamed from: a  reason: collision with root package name */
    private final long f794a;

    /* renamed from: b  reason: collision with root package name */
    private final String f795b;

    /* renamed from: c  reason: collision with root package name */
    private final a0.e.d.a f796c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.e.d.c f797d;

    /* renamed from: e  reason: collision with root package name */
    private final a0.e.d.AbstractC0027d f798e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        private Long f799a;

        /* renamed from: b  reason: collision with root package name */
        private String f800b;

        /* renamed from: c  reason: collision with root package name */
        private a0.e.d.a f801c;

        /* renamed from: d  reason: collision with root package name */
        private a0.e.d.c f802d;

        /* renamed from: e  reason: collision with root package name */
        private a0.e.d.AbstractC0027d f803e;

        @Override // am.a0.e.d.b
        public a0.e.d a() {
            String str = "";
            if (this.f799a == null) {
                str = " timestamp";
            }
            if (this.f800b == null) {
                str = str + " type";
            }
            if (this.f801c == null) {
                str = str + " app";
            }
            if (this.f802d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new k(this.f799a.longValue(), this.f800b, this.f801c, this.f802d, this.f803e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.d.b
        public a0.e.d.b b(a0.e.d.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f801c = aVar;
            return this;
        }

        @Override // am.a0.e.d.b
        public a0.e.d.b c(a0.e.d.c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.f802d = cVar;
            return this;
        }

        @Override // am.a0.e.d.b
        public a0.e.d.b d(a0.e.d.AbstractC0027d abstractC0027d) {
            this.f803e = abstractC0027d;
            return this;
        }

        @Override // am.a0.e.d.b
        public a0.e.d.b e(long j11) {
            this.f799a = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.e.d.b
        public a0.e.d.b f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f800b = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(a0.e.d dVar) {
            this.f799a = Long.valueOf(dVar.e());
            this.f800b = dVar.f();
            this.f801c = dVar.b();
            this.f802d = dVar.c();
            this.f803e = dVar.d();
        }
    }

    @Override // am.a0.e.d
    public a0.e.d.a b() {
        return this.f796c;
    }

    @Override // am.a0.e.d
    public a0.e.d.c c() {
        return this.f797d;
    }

    @Override // am.a0.e.d
    public a0.e.d.AbstractC0027d d() {
        return this.f798e;
    }

    @Override // am.a0.e.d
    public long e() {
        return this.f794a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d) {
            a0.e.d dVar = (a0.e.d) obj;
            if (this.f794a == dVar.e() && this.f795b.equals(dVar.f()) && this.f796c.equals(dVar.b()) && this.f797d.equals(dVar.c())) {
                a0.e.d.AbstractC0027d abstractC0027d = this.f798e;
                if (abstractC0027d == null) {
                    if (dVar.d() == null) {
                        return true;
                    }
                } else if (abstractC0027d.equals(dVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // am.a0.e.d
    public String f() {
        return this.f795b;
    }

    @Override // am.a0.e.d
    public a0.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j11 = this.f794a;
        int hashCode = (((((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f795b.hashCode()) * 1000003) ^ this.f796c.hashCode()) * 1000003) ^ this.f797d.hashCode()) * 1000003;
        a0.e.d.AbstractC0027d abstractC0027d = this.f798e;
        return hashCode ^ (abstractC0027d == null ? 0 : abstractC0027d.hashCode());
    }

    public String toString() {
        return "Event{timestamp=" + this.f794a + ", type=" + this.f795b + ", app=" + this.f796c + ", device=" + this.f797d + ", log=" + this.f798e + "}";
    }

    private k(long j11, String str, a0.e.d.a aVar, a0.e.d.c cVar, a0.e.d.AbstractC0027d abstractC0027d) {
        this.f794a = j11;
        this.f795b = str;
        this.f796c = aVar;
        this.f797d = cVar;
        this.f798e = abstractC0027d;
    }
}