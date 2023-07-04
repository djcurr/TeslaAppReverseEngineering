package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class r extends a0.e.d.a.b.AbstractC0023e.AbstractC0025b {

    /* renamed from: a  reason: collision with root package name */
    private final long f854a;

    /* renamed from: b  reason: collision with root package name */
    private final String f855b;

    /* renamed from: c  reason: collision with root package name */
    private final String f856c;

    /* renamed from: d  reason: collision with root package name */
    private final long f857d;

    /* renamed from: e  reason: collision with root package name */
    private final int f858e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a {

        /* renamed from: a  reason: collision with root package name */
        private Long f859a;

        /* renamed from: b  reason: collision with root package name */
        private String f860b;

        /* renamed from: c  reason: collision with root package name */
        private String f861c;

        /* renamed from: d  reason: collision with root package name */
        private Long f862d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f863e;

        @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a
        public a0.e.d.a.b.AbstractC0023e.AbstractC0025b a() {
            String str = "";
            if (this.f859a == null) {
                str = " pc";
            }
            if (this.f860b == null) {
                str = str + " symbol";
            }
            if (this.f862d == null) {
                str = str + " offset";
            }
            if (this.f863e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new r(this.f859a.longValue(), this.f860b, this.f861c, this.f862d.longValue(), this.f863e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a
        public a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a b(String str) {
            this.f861c = str;
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a
        public a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a c(int i11) {
            this.f863e = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a
        public a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a d(long j11) {
            this.f862d = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a
        public a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a e(long j11) {
            this.f859a = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a
        public a0.e.d.a.b.AbstractC0023e.AbstractC0025b.AbstractC0026a f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f860b = str;
            return this;
        }
    }

    @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0025b
    public String b() {
        return this.f856c;
    }

    @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0025b
    public int c() {
        return this.f858e;
    }

    @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0025b
    public long d() {
        return this.f857d;
    }

    @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0025b
    public long e() {
        return this.f854a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0023e.AbstractC0025b) {
            a0.e.d.a.b.AbstractC0023e.AbstractC0025b abstractC0025b = (a0.e.d.a.b.AbstractC0023e.AbstractC0025b) obj;
            return this.f854a == abstractC0025b.e() && this.f855b.equals(abstractC0025b.f()) && ((str = this.f856c) != null ? str.equals(abstractC0025b.b()) : abstractC0025b.b() == null) && this.f857d == abstractC0025b.d() && this.f858e == abstractC0025b.c();
        }
        return false;
    }

    @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0025b
    public String f() {
        return this.f855b;
    }

    public int hashCode() {
        long j11 = this.f854a;
        int hashCode = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ this.f855b.hashCode()) * 1000003;
        String str = this.f856c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j12 = this.f857d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f858e;
    }

    public String toString() {
        return "Frame{pc=" + this.f854a + ", symbol=" + this.f855b + ", file=" + this.f856c + ", offset=" + this.f857d + ", importance=" + this.f858e + "}";
    }

    private r(long j11, String str, String str2, long j12, int i11) {
        this.f854a = j11;
        this.f855b = str;
        this.f856c = str2;
        this.f857d = j12;
        this.f858e = i11;
    }
}