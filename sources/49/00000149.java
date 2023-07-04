package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class l extends a0.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    private final a0.e.d.a.b f804a;

    /* renamed from: b  reason: collision with root package name */
    private final b0<a0.c> f805b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<a0.c> f806c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f807d;

    /* renamed from: e  reason: collision with root package name */
    private final int f808e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.AbstractC0016a {

        /* renamed from: a  reason: collision with root package name */
        private a0.e.d.a.b f809a;

        /* renamed from: b  reason: collision with root package name */
        private b0<a0.c> f810b;

        /* renamed from: c  reason: collision with root package name */
        private b0<a0.c> f811c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f812d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f813e;

        @Override // am.a0.e.d.a.AbstractC0016a
        public a0.e.d.a a() {
            String str = "";
            if (this.f809a == null) {
                str = " execution";
            }
            if (this.f813e == null) {
                str = str + " uiOrientation";
            }
            if (str.isEmpty()) {
                return new l(this.f809a, this.f810b, this.f811c, this.f812d, this.f813e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.d.a.AbstractC0016a
        public a0.e.d.a.AbstractC0016a b(Boolean bool) {
            this.f812d = bool;
            return this;
        }

        @Override // am.a0.e.d.a.AbstractC0016a
        public a0.e.d.a.AbstractC0016a c(b0<a0.c> b0Var) {
            this.f810b = b0Var;
            return this;
        }

        @Override // am.a0.e.d.a.AbstractC0016a
        public a0.e.d.a.AbstractC0016a d(a0.e.d.a.b bVar) {
            Objects.requireNonNull(bVar, "Null execution");
            this.f809a = bVar;
            return this;
        }

        @Override // am.a0.e.d.a.AbstractC0016a
        public a0.e.d.a.AbstractC0016a e(b0<a0.c> b0Var) {
            this.f811c = b0Var;
            return this;
        }

        @Override // am.a0.e.d.a.AbstractC0016a
        public a0.e.d.a.AbstractC0016a f(int i11) {
            this.f813e = Integer.valueOf(i11);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public b() {
        }

        private b(a0.e.d.a aVar) {
            this.f809a = aVar.d();
            this.f810b = aVar.c();
            this.f811c = aVar.e();
            this.f812d = aVar.b();
            this.f813e = Integer.valueOf(aVar.f());
        }
    }

    @Override // am.a0.e.d.a
    public Boolean b() {
        return this.f807d;
    }

    @Override // am.a0.e.d.a
    public b0<a0.c> c() {
        return this.f805b;
    }

    @Override // am.a0.e.d.a
    public a0.e.d.a.b d() {
        return this.f804a;
    }

    @Override // am.a0.e.d.a
    public b0<a0.c> e() {
        return this.f806c;
    }

    public boolean equals(Object obj) {
        b0<a0.c> b0Var;
        b0<a0.c> b0Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a) {
            a0.e.d.a aVar = (a0.e.d.a) obj;
            return this.f804a.equals(aVar.d()) && ((b0Var = this.f805b) != null ? b0Var.equals(aVar.c()) : aVar.c() == null) && ((b0Var2 = this.f806c) != null ? b0Var2.equals(aVar.e()) : aVar.e() == null) && ((bool = this.f807d) != null ? bool.equals(aVar.b()) : aVar.b() == null) && this.f808e == aVar.f();
        }
        return false;
    }

    @Override // am.a0.e.d.a
    public int f() {
        return this.f808e;
    }

    @Override // am.a0.e.d.a
    public a0.e.d.a.AbstractC0016a g() {
        return new b(this);
    }

    public int hashCode() {
        int hashCode = (this.f804a.hashCode() ^ 1000003) * 1000003;
        b0<a0.c> b0Var = this.f805b;
        int hashCode2 = (hashCode ^ (b0Var == null ? 0 : b0Var.hashCode())) * 1000003;
        b0<a0.c> b0Var2 = this.f806c;
        int hashCode3 = (hashCode2 ^ (b0Var2 == null ? 0 : b0Var2.hashCode())) * 1000003;
        Boolean bool = this.f807d;
        return ((hashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.f808e;
    }

    public String toString() {
        return "Application{execution=" + this.f804a + ", customAttributes=" + this.f805b + ", internalKeys=" + this.f806c + ", background=" + this.f807d + ", uiOrientation=" + this.f808e + "}";
    }

    private l(a0.e.d.a.b bVar, b0<a0.c> b0Var, b0<a0.c> b0Var2, Boolean bool, int i11) {
        this.f804a = bVar;
        this.f805b = b0Var;
        this.f806c = b0Var2;
        this.f807d = bool;
        this.f808e = i11;
    }
}