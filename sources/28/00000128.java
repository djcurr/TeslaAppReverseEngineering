package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class b extends a0 {

    /* renamed from: b  reason: collision with root package name */
    private final String f694b;

    /* renamed from: c  reason: collision with root package name */
    private final String f695c;

    /* renamed from: d  reason: collision with root package name */
    private final int f696d;

    /* renamed from: e  reason: collision with root package name */
    private final String f697e;

    /* renamed from: f  reason: collision with root package name */
    private final String f698f;

    /* renamed from: g  reason: collision with root package name */
    private final String f699g;

    /* renamed from: h  reason: collision with root package name */
    private final a0.e f700h;

    /* renamed from: i  reason: collision with root package name */
    private final a0.d f701i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: am.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0029b extends a0.b {

        /* renamed from: a  reason: collision with root package name */
        private String f702a;

        /* renamed from: b  reason: collision with root package name */
        private String f703b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f704c;

        /* renamed from: d  reason: collision with root package name */
        private String f705d;

        /* renamed from: e  reason: collision with root package name */
        private String f706e;

        /* renamed from: f  reason: collision with root package name */
        private String f707f;

        /* renamed from: g  reason: collision with root package name */
        private a0.e f708g;

        /* renamed from: h  reason: collision with root package name */
        private a0.d f709h;

        @Override // am.a0.b
        public a0 a() {
            String str = "";
            if (this.f702a == null) {
                str = " sdkVersion";
            }
            if (this.f703b == null) {
                str = str + " gmpAppId";
            }
            if (this.f704c == null) {
                str = str + " platform";
            }
            if (this.f705d == null) {
                str = str + " installationUuid";
            }
            if (this.f706e == null) {
                str = str + " buildVersion";
            }
            if (this.f707f == null) {
                str = str + " displayVersion";
            }
            if (str.isEmpty()) {
                return new b(this.f702a, this.f703b, this.f704c.intValue(), this.f705d, this.f706e, this.f707f, this.f708g, this.f709h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.b
        public a0.b b(String str) {
            Objects.requireNonNull(str, "Null buildVersion");
            this.f706e = str;
            return this;
        }

        @Override // am.a0.b
        public a0.b c(String str) {
            Objects.requireNonNull(str, "Null displayVersion");
            this.f707f = str;
            return this;
        }

        @Override // am.a0.b
        public a0.b d(String str) {
            Objects.requireNonNull(str, "Null gmpAppId");
            this.f703b = str;
            return this;
        }

        @Override // am.a0.b
        public a0.b e(String str) {
            Objects.requireNonNull(str, "Null installationUuid");
            this.f705d = str;
            return this;
        }

        @Override // am.a0.b
        public a0.b f(a0.d dVar) {
            this.f709h = dVar;
            return this;
        }

        @Override // am.a0.b
        public a0.b g(int i11) {
            this.f704c = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.b
        public a0.b h(String str) {
            Objects.requireNonNull(str, "Null sdkVersion");
            this.f702a = str;
            return this;
        }

        @Override // am.a0.b
        public a0.b i(a0.e eVar) {
            this.f708g = eVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C0029b() {
        }

        private C0029b(a0 a0Var) {
            this.f702a = a0Var.i();
            this.f703b = a0Var.e();
            this.f704c = Integer.valueOf(a0Var.h());
            this.f705d = a0Var.f();
            this.f706e = a0Var.c();
            this.f707f = a0Var.d();
            this.f708g = a0Var.j();
            this.f709h = a0Var.g();
        }
    }

    @Override // am.a0
    public String c() {
        return this.f698f;
    }

    @Override // am.a0
    public String d() {
        return this.f699g;
    }

    @Override // am.a0
    public String e() {
        return this.f695c;
    }

    public boolean equals(Object obj) {
        a0.e eVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f694b.equals(a0Var.i()) && this.f695c.equals(a0Var.e()) && this.f696d == a0Var.h() && this.f697e.equals(a0Var.f()) && this.f698f.equals(a0Var.c()) && this.f699g.equals(a0Var.d()) && ((eVar = this.f700h) != null ? eVar.equals(a0Var.j()) : a0Var.j() == null)) {
                a0.d dVar = this.f701i;
                if (dVar == null) {
                    if (a0Var.g() == null) {
                        return true;
                    }
                } else if (dVar.equals(a0Var.g())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // am.a0
    public String f() {
        return this.f697e;
    }

    @Override // am.a0
    public a0.d g() {
        return this.f701i;
    }

    @Override // am.a0
    public int h() {
        return this.f696d;
    }

    public int hashCode() {
        int hashCode = (((((((((((this.f694b.hashCode() ^ 1000003) * 1000003) ^ this.f695c.hashCode()) * 1000003) ^ this.f696d) * 1000003) ^ this.f697e.hashCode()) * 1000003) ^ this.f698f.hashCode()) * 1000003) ^ this.f699g.hashCode()) * 1000003;
        a0.e eVar = this.f700h;
        int hashCode2 = (hashCode ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        a0.d dVar = this.f701i;
        return hashCode2 ^ (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // am.a0
    public String i() {
        return this.f694b;
    }

    @Override // am.a0
    public a0.e j() {
        return this.f700h;
    }

    @Override // am.a0
    protected a0.b k() {
        return new C0029b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f694b + ", gmpAppId=" + this.f695c + ", platform=" + this.f696d + ", installationUuid=" + this.f697e + ", buildVersion=" + this.f698f + ", displayVersion=" + this.f699g + ", session=" + this.f700h + ", ndkPayload=" + this.f701i + "}";
    }

    private b(String str, String str2, int i11, String str3, String str4, String str5, a0.e eVar, a0.d dVar) {
        this.f694b = str;
        this.f695c = str2;
        this.f696d = i11;
        this.f697e = str3;
        this.f698f = str4;
        this.f699g = str5;
        this.f700h = eVar;
        this.f701i = dVar;
    }
}