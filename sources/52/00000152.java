package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class o extends a0.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f832a;

    /* renamed from: b  reason: collision with root package name */
    private final String f833b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<a0.e.d.a.b.AbstractC0023e.AbstractC0025b> f834c;

    /* renamed from: d  reason: collision with root package name */
    private final a0.e.d.a.b.c f835d;

    /* renamed from: e  reason: collision with root package name */
    private final int f836e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.b.c.AbstractC0020a {

        /* renamed from: a  reason: collision with root package name */
        private String f837a;

        /* renamed from: b  reason: collision with root package name */
        private String f838b;

        /* renamed from: c  reason: collision with root package name */
        private b0<a0.e.d.a.b.AbstractC0023e.AbstractC0025b> f839c;

        /* renamed from: d  reason: collision with root package name */
        private a0.e.d.a.b.c f840d;

        /* renamed from: e  reason: collision with root package name */
        private Integer f841e;

        @Override // am.a0.e.d.a.b.c.AbstractC0020a
        public a0.e.d.a.b.c a() {
            String str = "";
            if (this.f837a == null) {
                str = " type";
            }
            if (this.f839c == null) {
                str = str + " frames";
            }
            if (this.f841e == null) {
                str = str + " overflowCount";
            }
            if (str.isEmpty()) {
                return new o(this.f837a, this.f838b, this.f839c, this.f840d, this.f841e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.d.a.b.c.AbstractC0020a
        public a0.e.d.a.b.c.AbstractC0020a b(a0.e.d.a.b.c cVar) {
            this.f840d = cVar;
            return this;
        }

        @Override // am.a0.e.d.a.b.c.AbstractC0020a
        public a0.e.d.a.b.c.AbstractC0020a c(b0<a0.e.d.a.b.AbstractC0023e.AbstractC0025b> b0Var) {
            Objects.requireNonNull(b0Var, "Null frames");
            this.f839c = b0Var;
            return this;
        }

        @Override // am.a0.e.d.a.b.c.AbstractC0020a
        public a0.e.d.a.b.c.AbstractC0020a d(int i11) {
            this.f841e = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.e.d.a.b.c.AbstractC0020a
        public a0.e.d.a.b.c.AbstractC0020a e(String str) {
            this.f838b = str;
            return this;
        }

        @Override // am.a0.e.d.a.b.c.AbstractC0020a
        public a0.e.d.a.b.c.AbstractC0020a f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f837a = str;
            return this;
        }
    }

    @Override // am.a0.e.d.a.b.c
    public a0.e.d.a.b.c b() {
        return this.f835d;
    }

    @Override // am.a0.e.d.a.b.c
    public b0<a0.e.d.a.b.AbstractC0023e.AbstractC0025b> c() {
        return this.f834c;
    }

    @Override // am.a0.e.d.a.b.c
    public int d() {
        return this.f836e;
    }

    @Override // am.a0.e.d.a.b.c
    public String e() {
        return this.f833b;
    }

    public boolean equals(Object obj) {
        String str;
        a0.e.d.a.b.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.c) {
            a0.e.d.a.b.c cVar2 = (a0.e.d.a.b.c) obj;
            return this.f832a.equals(cVar2.f()) && ((str = this.f833b) != null ? str.equals(cVar2.e()) : cVar2.e() == null) && this.f834c.equals(cVar2.c()) && ((cVar = this.f835d) != null ? cVar.equals(cVar2.b()) : cVar2.b() == null) && this.f836e == cVar2.d();
        }
        return false;
    }

    @Override // am.a0.e.d.a.b.c
    public String f() {
        return this.f832a;
    }

    public int hashCode() {
        int hashCode = (this.f832a.hashCode() ^ 1000003) * 1000003;
        String str = this.f833b;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f834c.hashCode()) * 1000003;
        a0.e.d.a.b.c cVar = this.f835d;
        return ((hashCode2 ^ (cVar != null ? cVar.hashCode() : 0)) * 1000003) ^ this.f836e;
    }

    public String toString() {
        return "Exception{type=" + this.f832a + ", reason=" + this.f833b + ", frames=" + this.f834c + ", causedBy=" + this.f835d + ", overflowCount=" + this.f836e + "}";
    }

    private o(String str, String str2, b0<a0.e.d.a.b.AbstractC0023e.AbstractC0025b> b0Var, a0.e.d.a.b.c cVar, int i11) {
        this.f832a = str;
        this.f833b = str2;
        this.f834c = b0Var;
        this.f835d = cVar;
        this.f836e = i11;
    }
}