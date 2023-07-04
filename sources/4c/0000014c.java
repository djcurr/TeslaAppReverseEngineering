package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class m extends a0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final b0<a0.e.d.a.b.AbstractC0023e> f814a;

    /* renamed from: b  reason: collision with root package name */
    private final a0.e.d.a.b.c f815b;

    /* renamed from: c  reason: collision with root package name */
    private final a0.a f816c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.e.d.a.b.AbstractC0021d f817d;

    /* renamed from: e  reason: collision with root package name */
    private final b0<a0.e.d.a.b.AbstractC0017a> f818e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0019b {

        /* renamed from: a  reason: collision with root package name */
        private b0<a0.e.d.a.b.AbstractC0023e> f819a;

        /* renamed from: b  reason: collision with root package name */
        private a0.e.d.a.b.c f820b;

        /* renamed from: c  reason: collision with root package name */
        private a0.a f821c;

        /* renamed from: d  reason: collision with root package name */
        private a0.e.d.a.b.AbstractC0021d f822d;

        /* renamed from: e  reason: collision with root package name */
        private b0<a0.e.d.a.b.AbstractC0017a> f823e;

        @Override // am.a0.e.d.a.b.AbstractC0019b
        public a0.e.d.a.b a() {
            String str = "";
            if (this.f822d == null) {
                str = " signal";
            }
            if (this.f823e == null) {
                str = str + " binaries";
            }
            if (str.isEmpty()) {
                return new m(this.f819a, this.f820b, this.f821c, this.f822d, this.f823e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.d.a.b.AbstractC0019b
        public a0.e.d.a.b.AbstractC0019b b(a0.a aVar) {
            this.f821c = aVar;
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0019b
        public a0.e.d.a.b.AbstractC0019b c(b0<a0.e.d.a.b.AbstractC0017a> b0Var) {
            Objects.requireNonNull(b0Var, "Null binaries");
            this.f823e = b0Var;
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0019b
        public a0.e.d.a.b.AbstractC0019b d(a0.e.d.a.b.c cVar) {
            this.f820b = cVar;
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0019b
        public a0.e.d.a.b.AbstractC0019b e(a0.e.d.a.b.AbstractC0021d abstractC0021d) {
            Objects.requireNonNull(abstractC0021d, "Null signal");
            this.f822d = abstractC0021d;
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0019b
        public a0.e.d.a.b.AbstractC0019b f(b0<a0.e.d.a.b.AbstractC0023e> b0Var) {
            this.f819a = b0Var;
            return this;
        }
    }

    @Override // am.a0.e.d.a.b
    public a0.a b() {
        return this.f816c;
    }

    @Override // am.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0017a> c() {
        return this.f818e;
    }

    @Override // am.a0.e.d.a.b
    public a0.e.d.a.b.c d() {
        return this.f815b;
    }

    @Override // am.a0.e.d.a.b
    public a0.e.d.a.b.AbstractC0021d e() {
        return this.f817d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b) {
            a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
            b0<a0.e.d.a.b.AbstractC0023e> b0Var = this.f814a;
            if (b0Var != null ? b0Var.equals(bVar.f()) : bVar.f() == null) {
                a0.e.d.a.b.c cVar = this.f815b;
                if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                    a0.a aVar = this.f816c;
                    if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                        if (this.f817d.equals(bVar.e()) && this.f818e.equals(bVar.c())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // am.a0.e.d.a.b
    public b0<a0.e.d.a.b.AbstractC0023e> f() {
        return this.f814a;
    }

    public int hashCode() {
        b0<a0.e.d.a.b.AbstractC0023e> b0Var = this.f814a;
        int hashCode = ((b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003) * 1000003;
        a0.e.d.a.b.c cVar = this.f815b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        a0.a aVar = this.f816c;
        return ((((hashCode2 ^ (aVar != null ? aVar.hashCode() : 0)) * 1000003) ^ this.f817d.hashCode()) * 1000003) ^ this.f818e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f814a + ", exception=" + this.f815b + ", appExitInfo=" + this.f816c + ", signal=" + this.f817d + ", binaries=" + this.f818e + "}";
    }

    private m(b0<a0.e.d.a.b.AbstractC0023e> b0Var, a0.e.d.a.b.c cVar, a0.a aVar, a0.e.d.a.b.AbstractC0021d abstractC0021d, b0<a0.e.d.a.b.AbstractC0017a> b0Var2) {
        this.f814a = b0Var;
        this.f815b = cVar;
        this.f816c = aVar;
        this.f817d = abstractC0021d;
        this.f818e = b0Var2;
    }
}