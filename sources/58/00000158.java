package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class q extends a0.e.d.a.b.AbstractC0023e {

    /* renamed from: a  reason: collision with root package name */
    private final String f848a;

    /* renamed from: b  reason: collision with root package name */
    private final int f849b;

    /* renamed from: c  reason: collision with root package name */
    private final b0<a0.e.d.a.b.AbstractC0023e.AbstractC0025b> f850c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0023e.AbstractC0024a {

        /* renamed from: a  reason: collision with root package name */
        private String f851a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f852b;

        /* renamed from: c  reason: collision with root package name */
        private b0<a0.e.d.a.b.AbstractC0023e.AbstractC0025b> f853c;

        @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0024a
        public a0.e.d.a.b.AbstractC0023e a() {
            String str = "";
            if (this.f851a == null) {
                str = " name";
            }
            if (this.f852b == null) {
                str = str + " importance";
            }
            if (this.f853c == null) {
                str = str + " frames";
            }
            if (str.isEmpty()) {
                return new q(this.f851a, this.f852b.intValue(), this.f853c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0024a
        public a0.e.d.a.b.AbstractC0023e.AbstractC0024a b(b0<a0.e.d.a.b.AbstractC0023e.AbstractC0025b> b0Var) {
            Objects.requireNonNull(b0Var, "Null frames");
            this.f853c = b0Var;
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0024a
        public a0.e.d.a.b.AbstractC0023e.AbstractC0024a c(int i11) {
            this.f852b = Integer.valueOf(i11);
            return this;
        }

        @Override // am.a0.e.d.a.b.AbstractC0023e.AbstractC0024a
        public a0.e.d.a.b.AbstractC0023e.AbstractC0024a d(String str) {
            Objects.requireNonNull(str, "Null name");
            this.f851a = str;
            return this;
        }
    }

    @Override // am.a0.e.d.a.b.AbstractC0023e
    public b0<a0.e.d.a.b.AbstractC0023e.AbstractC0025b> b() {
        return this.f850c;
    }

    @Override // am.a0.e.d.a.b.AbstractC0023e
    public int c() {
        return this.f849b;
    }

    @Override // am.a0.e.d.a.b.AbstractC0023e
    public String d() {
        return this.f848a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0023e) {
            a0.e.d.a.b.AbstractC0023e abstractC0023e = (a0.e.d.a.b.AbstractC0023e) obj;
            return this.f848a.equals(abstractC0023e.d()) && this.f849b == abstractC0023e.c() && this.f850c.equals(abstractC0023e.b());
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f848a.hashCode() ^ 1000003) * 1000003) ^ this.f849b) * 1000003) ^ this.f850c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f848a + ", importance=" + this.f849b + ", frames=" + this.f850c + "}";
    }

    private q(String str, int i11, b0<a0.e.d.a.b.AbstractC0023e.AbstractC0025b> b0Var) {
        this.f848a = str;
        this.f849b = i11;
        this.f850c = b0Var;
    }
}