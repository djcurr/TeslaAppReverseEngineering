package wm;

import wm.d;

/* loaded from: classes2.dex */
final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private final String f56107a;

    /* renamed from: b  reason: collision with root package name */
    private final String f56108b;

    /* renamed from: c  reason: collision with root package name */
    private final String f56109c;

    /* renamed from: d  reason: collision with root package name */
    private final f f56110d;

    /* renamed from: e  reason: collision with root package name */
    private final d.b f56111e;

    /* loaded from: classes2.dex */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f56112a;

        /* renamed from: b  reason: collision with root package name */
        private String f56113b;

        /* renamed from: c  reason: collision with root package name */
        private String f56114c;

        /* renamed from: d  reason: collision with root package name */
        private f f56115d;

        /* renamed from: e  reason: collision with root package name */
        private d.b f56116e;

        @Override // wm.d.a
        public d a() {
            return new a(this.f56112a, this.f56113b, this.f56114c, this.f56115d, this.f56116e);
        }

        @Override // wm.d.a
        public d.a b(f fVar) {
            this.f56115d = fVar;
            return this;
        }

        @Override // wm.d.a
        public d.a c(String str) {
            this.f56113b = str;
            return this;
        }

        @Override // wm.d.a
        public d.a d(String str) {
            this.f56114c = str;
            return this;
        }

        @Override // wm.d.a
        public d.a e(d.b bVar) {
            this.f56116e = bVar;
            return this;
        }

        @Override // wm.d.a
        public d.a f(String str) {
            this.f56112a = str;
            return this;
        }
    }

    @Override // wm.d
    public f b() {
        return this.f56110d;
    }

    @Override // wm.d
    public String c() {
        return this.f56108b;
    }

    @Override // wm.d
    public String d() {
        return this.f56109c;
    }

    @Override // wm.d
    public d.b e() {
        return this.f56111e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f56107a;
            if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
                String str2 = this.f56108b;
                if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                    String str3 = this.f56109c;
                    if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                        f fVar = this.f56110d;
                        if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                            d.b bVar = this.f56111e;
                            if (bVar == null) {
                                if (dVar.e() == null) {
                                    return true;
                                }
                            } else if (bVar.equals(dVar.e())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // wm.d
    public String f() {
        return this.f56107a;
    }

    public int hashCode() {
        String str = this.f56107a;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f56108b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f56109c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f56110d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        d.b bVar = this.f56111e;
        return hashCode4 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f56107a + ", fid=" + this.f56108b + ", refreshToken=" + this.f56109c + ", authToken=" + this.f56110d + ", responseCode=" + this.f56111e + "}";
    }

    private a(String str, String str2, String str3, f fVar, d.b bVar) {
        this.f56107a = str;
        this.f56108b = str2;
        this.f56109c = str3;
        this.f56110d = fVar;
        this.f56111e = bVar;
    }
}