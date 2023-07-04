package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class u extends a0.e.AbstractC0028e {

    /* renamed from: a  reason: collision with root package name */
    private final int f878a;

    /* renamed from: b  reason: collision with root package name */
    private final String f879b;

    /* renamed from: c  reason: collision with root package name */
    private final String f880c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f881d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.AbstractC0028e.a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f882a;

        /* renamed from: b  reason: collision with root package name */
        private String f883b;

        /* renamed from: c  reason: collision with root package name */
        private String f884c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f885d;

        @Override // am.a0.e.AbstractC0028e.a
        public a0.e.AbstractC0028e a() {
            String str = "";
            if (this.f882a == null) {
                str = " platform";
            }
            if (this.f883b == null) {
                str = str + " version";
            }
            if (this.f884c == null) {
                str = str + " buildVersion";
            }
            if (this.f885d == null) {
                str = str + " jailbroken";
            }
            if (str.isEmpty()) {
                return new u(this.f882a.intValue(), this.f883b, this.f884c, this.f885d.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.AbstractC0028e.a
        public a0.e.AbstractC0028e.a b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f884c = str;
            return this;
        }

        @Override // am.a0.e.AbstractC0028e.a
        public a0.e.AbstractC0028e.a c(boolean z11) {
            this.f885d = Boolean.valueOf(z11);
            return this;
        }

        @Override // am.a0.e.AbstractC0028e.a
        public a0.e.AbstractC0028e.a d(int i11) {
            this.f882a = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.e.AbstractC0028e.a
        public a0.e.AbstractC0028e.a e(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f883b = str;
            return this;
        }
    }

    @Override // am.a0.e.AbstractC0028e
    public String b() {
        return this.f880c;
    }

    @Override // am.a0.e.AbstractC0028e
    public int c() {
        return this.f878a;
    }

    @Override // am.a0.e.AbstractC0028e
    public String d() {
        return this.f879b;
    }

    @Override // am.a0.e.AbstractC0028e
    public boolean e() {
        return this.f881d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.AbstractC0028e) {
            a0.e.AbstractC0028e abstractC0028e = (a0.e.AbstractC0028e) obj;
            return this.f878a == abstractC0028e.c() && this.f879b.equals(abstractC0028e.d()) && this.f880c.equals(abstractC0028e.b()) && this.f881d == abstractC0028e.e();
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f878a ^ 1000003) * 1000003) ^ this.f879b.hashCode()) * 1000003) ^ this.f880c.hashCode()) * 1000003) ^ (this.f881d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f878a + ", version=" + this.f879b + ", buildVersion=" + this.f880c + ", jailbroken=" + this.f881d + "}";
    }

    private u(int i11, String str, String str2, boolean z11) {
        this.f878a = i11;
        this.f879b = str;
        this.f880c = str2;
        this.f881d = z11;
    }
}