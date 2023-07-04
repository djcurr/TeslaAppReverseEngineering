package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class p extends a0.e.d.a.b.AbstractC0021d {

    /* renamed from: a  reason: collision with root package name */
    private final String f842a;

    /* renamed from: b  reason: collision with root package name */
    private final String f843b;

    /* renamed from: c  reason: collision with root package name */
    private final long f844c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0021d.AbstractC0022a {

        /* renamed from: a  reason: collision with root package name */
        private String f845a;

        /* renamed from: b  reason: collision with root package name */
        private String f846b;

        /* renamed from: c  reason: collision with root package name */
        private Long f847c;

        @Override // am.a0.e.d.a.b.AbstractC0021d.AbstractC0022a
        public a0.e.d.a.b.AbstractC0021d a() {
            String str = "";
            if (this.f845a == null) {
                str = " name";
            }
            if (this.f846b == null) {
                str = str + " code";
            }
            if (this.f847c == null) {
                str = str + " address";
            }
            if (str.isEmpty()) {
                return new p(this.f845a, this.f846b, this.f847c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.d.a.b.AbstractC0021d.AbstractC0022a
        public a0.e.d.a.b.AbstractC0021d.AbstractC0022a b(long j11) {
            this.f847c = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0021d.AbstractC0022a
        public a0.e.d.a.b.AbstractC0021d.AbstractC0022a c(String str) {
            Objects.requireNonNull(str, "Null code");
            this.f846b = str;
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0021d.AbstractC0022a
        public a0.e.d.a.b.AbstractC0021d.AbstractC0022a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f845a = str;
            return this;
        }
    }

    @Override // am.a0.e.d.a.b.AbstractC0021d
    public long b() {
        return this.f844c;
    }

    @Override // am.a0.e.d.a.b.AbstractC0021d
    public String c() {
        return this.f843b;
    }

    @Override // am.a0.e.d.a.b.AbstractC0021d
    public String d() {
        return this.f842a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0021d) {
            a0.e.d.a.b.AbstractC0021d abstractC0021d = (a0.e.d.a.b.AbstractC0021d) obj;
            return this.f842a.equals(abstractC0021d.d()) && this.f843b.equals(abstractC0021d.c()) && this.f844c == abstractC0021d.b();
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f844c;
        return ((((this.f842a.hashCode() ^ 1000003) * 1000003) ^ this.f843b.hashCode()) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Signal{name=" + this.f842a + ", code=" + this.f843b + ", address=" + this.f844c + "}";
    }

    private p(String str, String str2, long j11) {
        this.f842a = str;
        this.f843b = str2;
        this.f844c = j11;
    }
}