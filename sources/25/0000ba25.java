package vm;

import java.util.Objects;
import vm.c;
import vm.d;

/* loaded from: classes2.dex */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f54527a;

    /* renamed from: b  reason: collision with root package name */
    private final c.a f54528b;

    /* renamed from: c  reason: collision with root package name */
    private final String f54529c;

    /* renamed from: d  reason: collision with root package name */
    private final String f54530d;

    /* renamed from: e  reason: collision with root package name */
    private final long f54531e;

    /* renamed from: f  reason: collision with root package name */
    private final long f54532f;

    /* renamed from: g  reason: collision with root package name */
    private final String f54533g;

    /* loaded from: classes2.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f54534a;

        /* renamed from: b  reason: collision with root package name */
        private c.a f54535b;

        /* renamed from: c  reason: collision with root package name */
        private String f54536c;

        /* renamed from: d  reason: collision with root package name */
        private String f54537d;

        /* renamed from: e  reason: collision with root package name */
        private Long f54538e;

        /* renamed from: f  reason: collision with root package name */
        private Long f54539f;

        /* renamed from: g  reason: collision with root package name */
        private String f54540g;

        @Override // vm.d.a
        public d a() {
            String str = "";
            if (this.f54535b == null) {
                str = " registrationStatus";
            }
            if (this.f54538e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f54539f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f54534a, this.f54535b, this.f54536c, this.f54537d, this.f54538e.longValue(), this.f54539f.longValue(), this.f54540g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // vm.d.a
        public d.a b(String str) {
            this.f54536c = str;
            return this;
        }

        @Override // vm.d.a
        public d.a c(long j11) {
            this.f54538e = Long.valueOf(j11);
            return this;
        }

        @Override // vm.d.a
        public d.a d(String str) {
            this.f54534a = str;
            return this;
        }

        @Override // vm.d.a
        public d.a e(String str) {
            this.f54540g = str;
            return this;
        }

        @Override // vm.d.a
        public d.a f(String str) {
            this.f54537d = str;
            return this;
        }

        @Override // vm.d.a
        public d.a g(c.a aVar) {
            Objects.requireNonNull(aVar, "Null registrationStatus");
            this.f54535b = aVar;
            return this;
        }

        @Override // vm.d.a
        public d.a h(long j11) {
            this.f54539f = Long.valueOf(j11);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(d dVar) {
            this.f54534a = dVar.d();
            this.f54535b = dVar.g();
            this.f54536c = dVar.b();
            this.f54537d = dVar.f();
            this.f54538e = Long.valueOf(dVar.c());
            this.f54539f = Long.valueOf(dVar.h());
            this.f54540g = dVar.e();
        }
    }

    @Override // vm.d
    public String b() {
        return this.f54529c;
    }

    @Override // vm.d
    public long c() {
        return this.f54531e;
    }

    @Override // vm.d
    public String d() {
        return this.f54527a;
    }

    @Override // vm.d
    public String e() {
        return this.f54533g;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str3 = this.f54527a;
            if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                if (this.f54528b.equals(dVar.g()) && ((str = this.f54529c) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f54530d) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f54531e == dVar.c() && this.f54532f == dVar.h()) {
                    String str4 = this.f54533g;
                    if (str4 == null) {
                        if (dVar.e() == null) {
                            return true;
                        }
                    } else if (str4.equals(dVar.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // vm.d
    public String f() {
        return this.f54530d;
    }

    @Override // vm.d
    public c.a g() {
        return this.f54528b;
    }

    @Override // vm.d
    public long h() {
        return this.f54532f;
    }

    public int hashCode() {
        String str = this.f54527a;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f54528b.hashCode()) * 1000003;
        String str2 = this.f54529c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f54530d;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j11 = this.f54531e;
        long j12 = this.f54532f;
        int i11 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str4 = this.f54533g;
        return i11 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // vm.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f54527a + ", registrationStatus=" + this.f54528b + ", authToken=" + this.f54529c + ", refreshToken=" + this.f54530d + ", expiresInSecs=" + this.f54531e + ", tokenCreationEpochInSecs=" + this.f54532f + ", fisError=" + this.f54533g + "}";
    }

    private a(String str, c.a aVar, String str2, String str3, long j11, long j12, String str4) {
        this.f54527a = str;
        this.f54528b = aVar;
        this.f54529c = str2;
        this.f54530d = str3;
        this.f54531e = j11;
        this.f54532f = j12;
        this.f54533g = str4;
    }
}