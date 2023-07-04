package wm;

import wm.f;

/* loaded from: classes2.dex */
final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f56117a;

    /* renamed from: b  reason: collision with root package name */
    private final long f56118b;

    /* renamed from: c  reason: collision with root package name */
    private final f.b f56119c;

    /* renamed from: wm.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C1272b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f56120a;

        /* renamed from: b  reason: collision with root package name */
        private Long f56121b;

        /* renamed from: c  reason: collision with root package name */
        private f.b f56122c;

        @Override // wm.f.a
        public f a() {
            String str = "";
            if (this.f56121b == null) {
                str = " tokenExpirationTimestamp";
            }
            if (str.isEmpty()) {
                return new b(this.f56120a, this.f56121b.longValue(), this.f56122c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // wm.f.a
        public f.a b(f.b bVar) {
            this.f56122c = bVar;
            return this;
        }

        @Override // wm.f.a
        public f.a c(String str) {
            this.f56120a = str;
            return this;
        }

        @Override // wm.f.a
        public f.a d(long j11) {
            this.f56121b = Long.valueOf(j11);
            return this;
        }
    }

    @Override // wm.f
    public f.b b() {
        return this.f56119c;
    }

    @Override // wm.f
    public String c() {
        return this.f56117a;
    }

    @Override // wm.f
    public long d() {
        return this.f56118b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            String str = this.f56117a;
            if (str != null ? str.equals(fVar.c()) : fVar.c() == null) {
                if (this.f56118b == fVar.d()) {
                    f.b bVar = this.f56119c;
                    if (bVar == null) {
                        if (fVar.b() == null) {
                            return true;
                        }
                    } else if (bVar.equals(fVar.b())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f56117a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j11 = this.f56118b;
        int i11 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        f.b bVar = this.f56119c;
        return i11 ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "TokenResult{token=" + this.f56117a + ", tokenExpirationTimestamp=" + this.f56118b + ", responseCode=" + this.f56119c + "}";
    }

    private b(String str, long j11, f.b bVar) {
        this.f56117a = str;
        this.f56118b = j11;
        this.f56119c = bVar;
    }
}