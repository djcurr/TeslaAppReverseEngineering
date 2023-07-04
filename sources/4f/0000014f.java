package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class n extends a0.e.d.a.b.AbstractC0017a {

    /* renamed from: a  reason: collision with root package name */
    private final long f824a;

    /* renamed from: b  reason: collision with root package name */
    private final long f825b;

    /* renamed from: c  reason: collision with root package name */
    private final String f826c;

    /* renamed from: d  reason: collision with root package name */
    private final String f827d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0017a.AbstractC0018a {

        /* renamed from: a  reason: collision with root package name */
        private Long f828a;

        /* renamed from: b  reason: collision with root package name */
        private Long f829b;

        /* renamed from: c  reason: collision with root package name */
        private String f830c;

        /* renamed from: d  reason: collision with root package name */
        private String f831d;

        @Override // am.a0.e.d.a.b.AbstractC0017a.AbstractC0018a
        public a0.e.d.a.b.AbstractC0017a a() {
            String str = "";
            if (this.f828a == null) {
                str = " baseAddress";
            }
            if (this.f829b == null) {
                str = str + " size";
            }
            if (this.f830c == null) {
                str = str + " name";
            }
            if (str.isEmpty()) {
                return new n(this.f828a.longValue(), this.f829b.longValue(), this.f830c, this.f831d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.d.a.b.AbstractC0017a.AbstractC0018a
        public a0.e.d.a.b.AbstractC0017a.AbstractC0018a b(long j11) {
            this.f828a = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0017a.AbstractC0018a
        public a0.e.d.a.b.AbstractC0017a.AbstractC0018a c(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f830c = str;
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0017a.AbstractC0018a
        public a0.e.d.a.b.AbstractC0017a.AbstractC0018a d(long j11) {
            this.f829b = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0017a.AbstractC0018a
        public a0.e.d.a.b.AbstractC0017a.AbstractC0018a e(String str) {
            this.f831d = str;
            return this;
        }
    }

    @Override // am.a0.e.d.a.b.AbstractC0017a
    public long b() {
        return this.f824a;
    }

    @Override // am.a0.e.d.a.b.AbstractC0017a
    public String c() {
        return this.f826c;
    }

    @Override // am.a0.e.d.a.b.AbstractC0017a
    public long d() {
        return this.f825b;
    }

    @Override // am.a0.e.d.a.b.AbstractC0017a
    public String e() {
        return this.f827d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0017a) {
            a0.e.d.a.b.AbstractC0017a abstractC0017a = (a0.e.d.a.b.AbstractC0017a) obj;
            if (this.f824a == abstractC0017a.b() && this.f825b == abstractC0017a.d() && this.f826c.equals(abstractC0017a.c())) {
                String str = this.f827d;
                if (str == null) {
                    if (abstractC0017a.e() == null) {
                        return true;
                    }
                } else if (str.equals(abstractC0017a.e())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f824a;
        long j12 = this.f825b;
        int hashCode = (((((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003) ^ this.f826c.hashCode()) * 1000003;
        String str = this.f827d;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BinaryImage{baseAddress=" + this.f824a + ", size=" + this.f825b + ", name=" + this.f826c + ", uuid=" + this.f827d + "}";
    }

    private n(long j11, long j12, String str, String str2) {
        this.f824a = j11;
        this.f825b = j12;
        this.f826c = str;
        this.f827d = str2;
    }
}