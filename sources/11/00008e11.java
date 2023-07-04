package oh;

import oh.o;

/* loaded from: classes3.dex */
final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    private final o.c f42461a;

    /* renamed from: b  reason: collision with root package name */
    private final o.b f42462b;

    /* loaded from: classes3.dex */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private o.c f42463a;

        /* renamed from: b  reason: collision with root package name */
        private o.b f42464b;

        @Override // oh.o.a
        public o a() {
            return new i(this.f42463a, this.f42464b);
        }

        @Override // oh.o.a
        public o.a b(o.b bVar) {
            this.f42464b = bVar;
            return this;
        }

        @Override // oh.o.a
        public o.a c(o.c cVar) {
            this.f42463a = cVar;
            return this;
        }
    }

    @Override // oh.o
    public o.b b() {
        return this.f42462b;
    }

    @Override // oh.o
    public o.c c() {
        return this.f42461a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            o.c cVar = this.f42461a;
            if (cVar != null ? cVar.equals(oVar.c()) : oVar.c() == null) {
                o.b bVar = this.f42462b;
                if (bVar == null) {
                    if (oVar.b() == null) {
                        return true;
                    }
                } else if (bVar.equals(oVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        o.c cVar = this.f42461a;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        o.b bVar = this.f42462b;
        return hashCode ^ (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f42461a + ", mobileSubtype=" + this.f42462b + "}";
    }

    private i(o.c cVar, o.b bVar) {
        this.f42461a = cVar;
        this.f42462b = bVar;
    }
}