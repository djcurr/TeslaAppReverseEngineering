package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class g extends a0.e {

    /* renamed from: a  reason: collision with root package name */
    private final String f739a;

    /* renamed from: b  reason: collision with root package name */
    private final String f740b;

    /* renamed from: c  reason: collision with root package name */
    private final long f741c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f742d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f743e;

    /* renamed from: f  reason: collision with root package name */
    private final a0.e.a f744f;

    /* renamed from: g  reason: collision with root package name */
    private final a0.e.f f745g;

    /* renamed from: h  reason: collision with root package name */
    private final a0.e.AbstractC0028e f746h;

    /* renamed from: i  reason: collision with root package name */
    private final a0.e.c f747i;

    /* renamed from: j  reason: collision with root package name */
    private final b0<a0.e.d> f748j;

    /* renamed from: k  reason: collision with root package name */
    private final int f749k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.b {

        /* renamed from: a  reason: collision with root package name */
        private String f750a;

        /* renamed from: b  reason: collision with root package name */
        private String f751b;

        /* renamed from: c  reason: collision with root package name */
        private Long f752c;

        /* renamed from: d  reason: collision with root package name */
        private Long f753d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f754e;

        /* renamed from: f  reason: collision with root package name */
        private a0.e.a f755f;

        /* renamed from: g  reason: collision with root package name */
        private a0.e.f f756g;

        /* renamed from: h  reason: collision with root package name */
        private a0.e.AbstractC0028e f757h;

        /* renamed from: i  reason: collision with root package name */
        private a0.e.c f758i;

        /* renamed from: j  reason: collision with root package name */
        private b0<a0.e.d> f759j;

        /* renamed from: k  reason: collision with root package name */
        private Integer f760k;

        @Override // am.a0.e.b
        public a0.e a() {
            String str = "";
            if (this.f750a == null) {
                str = " generator";
            }
            if (this.f751b == null) {
                str = str + " identifier";
            }
            if (this.f752c == null) {
                str = str + " startedAt";
            }
            if (this.f754e == null) {
                str = str + " crashed";
            }
            if (this.f755f == null) {
                str = str + " app";
            }
            if (this.f760k == null) {
                str = str + " generatorType";
            }
            if (str.isEmpty()) {
                return new g(this.f750a, this.f751b, this.f752c.longValue(), this.f753d, this.f754e.booleanValue(), this.f755f, this.f756g, this.f757h, this.f758i, this.f759j, this.f760k.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.b
        public a0.e.b b(a0.e.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f755f = aVar;
            return this;
        }

        @Override // am.a0.e.b
        public a0.e.b c(boolean z11) {
            this.f754e = Boolean.valueOf(z11);
            return this;
        }

        @Override // am.a0.e.b
        public a0.e.b d(a0.e.c cVar) {
            this.f758i = cVar;
            return this;
        }

        @Override // am.a0.e.b
        public a0.e.b e(Long l11) {
            this.f753d = l11;
            return this;
        }

        @Override // am.a0.e.b
        public a0.e.b f(b0<a0.e.d> b0Var) {
            this.f759j = b0Var;
            return this;
        }

        @Override // am.a0.e.b
        public a0.e.b g(String str) {
            Objects.requireNonNull(str, "Null generator");
            this.f750a = str;
            return this;
        }

        @Override // am.a0.e.b
        public a0.e.b h(int i11) {
            this.f760k = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.e.b
        public a0.e.b i(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f751b = str;
            return this;
        }

        @Override // am.a0.e.b
        public a0.e.b k(a0.e.AbstractC0028e abstractC0028e) {
            this.f757h = abstractC0028e;
            return this;
        }

        @Override // am.a0.e.b
        public a0.e.b l(long j11) {
            this.f752c = Long.valueOf(j11);
            return this;
        }

        @Override // am.a0.e.b
        public a0.e.b m(a0.e.f fVar) {
            this.f756g = fVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(a0.e eVar) {
            this.f750a = eVar.f();
            this.f751b = eVar.h();
            this.f752c = Long.valueOf(eVar.k());
            this.f753d = eVar.d();
            this.f754e = Boolean.valueOf(eVar.m());
            this.f755f = eVar.b();
            this.f756g = eVar.l();
            this.f757h = eVar.j();
            this.f758i = eVar.c();
            this.f759j = eVar.e();
            this.f760k = Integer.valueOf(eVar.g());
        }
    }

    @Override // am.a0.e
    public a0.e.a b() {
        return this.f744f;
    }

    @Override // am.a0.e
    public a0.e.c c() {
        return this.f747i;
    }

    @Override // am.a0.e
    public Long d() {
        return this.f742d;
    }

    @Override // am.a0.e
    public b0<a0.e.d> e() {
        return this.f748j;
    }

    public boolean equals(Object obj) {
        Long l11;
        a0.e.f fVar;
        a0.e.AbstractC0028e abstractC0028e;
        a0.e.c cVar;
        b0<a0.e.d> b0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e) {
            a0.e eVar = (a0.e) obj;
            return this.f739a.equals(eVar.f()) && this.f740b.equals(eVar.h()) && this.f741c == eVar.k() && ((l11 = this.f742d) != null ? l11.equals(eVar.d()) : eVar.d() == null) && this.f743e == eVar.m() && this.f744f.equals(eVar.b()) && ((fVar = this.f745g) != null ? fVar.equals(eVar.l()) : eVar.l() == null) && ((abstractC0028e = this.f746h) != null ? abstractC0028e.equals(eVar.j()) : eVar.j() == null) && ((cVar = this.f747i) != null ? cVar.equals(eVar.c()) : eVar.c() == null) && ((b0Var = this.f748j) != null ? b0Var.equals(eVar.e()) : eVar.e() == null) && this.f749k == eVar.g();
        }
        return false;
    }

    @Override // am.a0.e
    public String f() {
        return this.f739a;
    }

    @Override // am.a0.e
    public int g() {
        return this.f749k;
    }

    @Override // am.a0.e
    public String h() {
        return this.f740b;
    }

    public int hashCode() {
        long j11 = this.f741c;
        int hashCode = (((((this.f739a.hashCode() ^ 1000003) * 1000003) ^ this.f740b.hashCode()) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        Long l11 = this.f742d;
        int hashCode2 = (((((hashCode ^ (l11 == null ? 0 : l11.hashCode())) * 1000003) ^ (this.f743e ? 1231 : 1237)) * 1000003) ^ this.f744f.hashCode()) * 1000003;
        a0.e.f fVar = this.f745g;
        int hashCode3 = (hashCode2 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        a0.e.AbstractC0028e abstractC0028e = this.f746h;
        int hashCode4 = (hashCode3 ^ (abstractC0028e == null ? 0 : abstractC0028e.hashCode())) * 1000003;
        a0.e.c cVar = this.f747i;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        b0<a0.e.d> b0Var = this.f748j;
        return ((hashCode5 ^ (b0Var != null ? b0Var.hashCode() : 0)) * 1000003) ^ this.f749k;
    }

    @Override // am.a0.e
    public a0.e.AbstractC0028e j() {
        return this.f746h;
    }

    @Override // am.a0.e
    public long k() {
        return this.f741c;
    }

    @Override // am.a0.e
    public a0.e.f l() {
        return this.f745g;
    }

    @Override // am.a0.e
    public boolean m() {
        return this.f743e;
    }

    @Override // am.a0.e
    public a0.e.b n() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f739a + ", identifier=" + this.f740b + ", startedAt=" + this.f741c + ", endedAt=" + this.f742d + ", crashed=" + this.f743e + ", app=" + this.f744f + ", user=" + this.f745g + ", os=" + this.f746h + ", device=" + this.f747i + ", events=" + this.f748j + ", generatorType=" + this.f749k + "}";
    }

    private g(String str, String str2, long j11, Long l11, boolean z11, a0.e.a aVar, a0.e.f fVar, a0.e.AbstractC0028e abstractC0028e, a0.e.c cVar, b0<a0.e.d> b0Var, int i11) {
        this.f739a = str;
        this.f740b = str2;
        this.f741c = j11;
        this.f742d = l11;
        this.f743e = z11;
        this.f744f = aVar;
        this.f745g = fVar;
        this.f746h = abstractC0028e;
        this.f747i = cVar;
        this.f748j = b0Var;
        this.f749k = i11;
    }
}