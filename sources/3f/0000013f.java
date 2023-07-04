package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class h extends a0.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f761a;

    /* renamed from: b  reason: collision with root package name */
    private final String f762b;

    /* renamed from: c  reason: collision with root package name */
    private final String f763c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.e.a.b f764d;

    /* renamed from: e  reason: collision with root package name */
    private final String f765e;

    /* renamed from: f  reason: collision with root package name */
    private final String f766f;

    /* renamed from: g  reason: collision with root package name */
    private final String f767g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.a.AbstractC0015a {

        /* renamed from: a  reason: collision with root package name */
        private String f768a;

        /* renamed from: b  reason: collision with root package name */
        private String f769b;

        /* renamed from: c  reason: collision with root package name */
        private String f770c;

        /* renamed from: d  reason: collision with root package name */
        private a0.e.a.b f771d;

        /* renamed from: e  reason: collision with root package name */
        private String f772e;

        /* renamed from: f  reason: collision with root package name */
        private String f773f;

        /* renamed from: g  reason: collision with root package name */
        private String f774g;

        @Override // am.a0.e.a.AbstractC0015a
        public a0.e.a a() {
            String str = "";
            if (this.f768a == null) {
                str = " identifier";
            }
            if (this.f769b == null) {
                str = str + " version";
            }
            if (str.isEmpty()) {
                return new h(this.f768a, this.f769b, this.f770c, this.f771d, this.f772e, this.f773f, this.f774g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.a.AbstractC0015a
        public a0.e.a.AbstractC0015a b(String str) {
            this.f773f = str;
            return this;
        }

        @Override // am.a0.e.a.AbstractC0015a
        public a0.e.a.AbstractC0015a c(String str) {
            this.f774g = str;
            return this;
        }

        @Override // am.a0.e.a.AbstractC0015a
        public a0.e.a.AbstractC0015a d(String str) {
            this.f770c = str;
            return this;
        }

        @Override // am.a0.e.a.AbstractC0015a
        public a0.e.a.AbstractC0015a e(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f768a = str;
            return this;
        }

        @Override // am.a0.e.a.AbstractC0015a
        public a0.e.a.AbstractC0015a f(String str) {
            this.f772e = str;
            return this;
        }

        @Override // am.a0.e.a.AbstractC0015a
        public a0.e.a.AbstractC0015a g(String str) {
            Objects.requireNonNull(str, "Null version");
            this.f769b = str;
            return this;
        }
    }

    @Override // am.a0.e.a
    public String b() {
        return this.f766f;
    }

    @Override // am.a0.e.a
    public String c() {
        return this.f767g;
    }

    @Override // am.a0.e.a
    public String d() {
        return this.f763c;
    }

    @Override // am.a0.e.a
    public String e() {
        return this.f761a;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.a) {
            a0.e.a aVar = (a0.e.a) obj;
            if (this.f761a.equals(aVar.e()) && this.f762b.equals(aVar.h()) && ((str = this.f763c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f764d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f765e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f766f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
                String str4 = this.f767g;
                if (str4 == null) {
                    if (aVar.c() == null) {
                        return true;
                    }
                } else if (str4.equals(aVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // am.a0.e.a
    public String f() {
        return this.f765e;
    }

    @Override // am.a0.e.a
    public a0.e.a.b g() {
        return this.f764d;
    }

    @Override // am.a0.e.a
    public String h() {
        return this.f762b;
    }

    public int hashCode() {
        int hashCode = (((this.f761a.hashCode() ^ 1000003) * 1000003) ^ this.f762b.hashCode()) * 1000003;
        String str = this.f763c;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        a0.e.a.b bVar = this.f764d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f765e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f766f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f767g;
        return hashCode5 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "Application{identifier=" + this.f761a + ", version=" + this.f762b + ", displayVersion=" + this.f763c + ", organization=" + this.f764d + ", installationUuid=" + this.f765e + ", developmentPlatform=" + this.f766f + ", developmentPlatformVersion=" + this.f767g + "}";
    }

    private h(String str, String str2, String str3, a0.e.a.b bVar, String str4, String str5, String str6) {
        this.f761a = str;
        this.f762b = str2;
        this.f763c = str3;
        this.f764d = bVar;
        this.f765e = str4;
        this.f766f = str5;
        this.f767g = str6;
    }
}