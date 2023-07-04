package oh;

import oh.k;

/* loaded from: classes3.dex */
final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    private final k.b f42428a;

    /* renamed from: b  reason: collision with root package name */
    private final oh.a f42429b;

    /* loaded from: classes3.dex */
    static final class b extends k.a {

        /* renamed from: a  reason: collision with root package name */
        private k.b f42430a;

        /* renamed from: b  reason: collision with root package name */
        private oh.a f42431b;

        @Override // oh.k.a
        public k a() {
            return new e(this.f42430a, this.f42431b);
        }

        @Override // oh.k.a
        public k.a b(oh.a aVar) {
            this.f42431b = aVar;
            return this;
        }

        @Override // oh.k.a
        public k.a c(k.b bVar) {
            this.f42430a = bVar;
            return this;
        }
    }

    @Override // oh.k
    public oh.a b() {
        return this.f42429b;
    }

    @Override // oh.k
    public k.b c() {
        return this.f42428a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            k.b bVar = this.f42428a;
            if (bVar != null ? bVar.equals(kVar.c()) : kVar.c() == null) {
                oh.a aVar = this.f42429b;
                if (aVar == null) {
                    if (kVar.b() == null) {
                        return true;
                    }
                } else if (aVar.equals(kVar.b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        k.b bVar = this.f42428a;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        oh.a aVar = this.f42429b;
        return hashCode ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f42428a + ", androidClientInfo=" + this.f42429b + "}";
    }

    private e(k.b bVar, oh.a aVar) {
        this.f42428a = bVar;
        this.f42429b = aVar;
    }
}