package ph;

import java.util.Objects;
import ph.n;

/* loaded from: classes3.dex */
final class c extends n {

    /* renamed from: a */
    private final o f46483a;

    /* renamed from: b */
    private final String f46484b;

    /* renamed from: c */
    private final nh.c<?> f46485c;

    /* renamed from: d */
    private final nh.e<?, byte[]> f46486d;

    /* renamed from: e */
    private final nh.b f46487e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends n.a {

        /* renamed from: a */
        private o f46488a;

        /* renamed from: b */
        private String f46489b;

        /* renamed from: c */
        private nh.c<?> f46490c;

        /* renamed from: d */
        private nh.e<?, byte[]> f46491d;

        /* renamed from: e */
        private nh.b f46492e;

        @Override // ph.n.a
        public n a() {
            String str = "";
            if (this.f46488a == null) {
                str = " transportContext";
            }
            if (this.f46489b == null) {
                str = str + " transportName";
            }
            if (this.f46490c == null) {
                str = str + " event";
            }
            if (this.f46491d == null) {
                str = str + " transformer";
            }
            if (this.f46492e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f46488a, this.f46489b, this.f46490c, this.f46491d, this.f46492e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ph.n.a
        public n.a b(nh.b bVar) {
            Objects.requireNonNull(bVar, "Null encoding");
            this.f46492e = bVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ph.n.a
        public n.a c(nh.c<?> cVar) {
            Objects.requireNonNull(cVar, "Null event");
            this.f46490c = cVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // ph.n.a
        public n.a d(nh.e<?, byte[]> eVar) {
            Objects.requireNonNull(eVar, "Null transformer");
            this.f46491d = eVar;
            return this;
        }

        @Override // ph.n.a
        public n.a e(o oVar) {
            Objects.requireNonNull(oVar, "Null transportContext");
            this.f46488a = oVar;
            return this;
        }

        @Override // ph.n.a
        public n.a f(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f46489b = str;
            return this;
        }
    }

    @Override // ph.n
    public nh.b b() {
        return this.f46487e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ph.n
    public nh.c<?> c() {
        return this.f46485c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // ph.n
    public nh.e<?, byte[]> e() {
        return this.f46486d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            return this.f46483a.equals(nVar.f()) && this.f46484b.equals(nVar.g()) && this.f46485c.equals(nVar.c()) && this.f46486d.equals(nVar.e()) && this.f46487e.equals(nVar.b());
        }
        return false;
    }

    @Override // ph.n
    public o f() {
        return this.f46483a;
    }

    @Override // ph.n
    public String g() {
        return this.f46484b;
    }

    public int hashCode() {
        return ((((((((this.f46483a.hashCode() ^ 1000003) * 1000003) ^ this.f46484b.hashCode()) * 1000003) ^ this.f46485c.hashCode()) * 1000003) ^ this.f46486d.hashCode()) * 1000003) ^ this.f46487e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f46483a + ", transportName=" + this.f46484b + ", event=" + this.f46485c + ", transformer=" + this.f46486d + ", encoding=" + this.f46487e + "}";
    }

    private c(o oVar, String str, nh.c<?> cVar, nh.e<?, byte[]> eVar, nh.b bVar) {
        this.f46483a = oVar;
        this.f46484b = str;
        this.f46485c = cVar;
        this.f46486d = eVar;
        this.f46487e = bVar;
    }
}