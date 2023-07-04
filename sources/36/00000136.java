package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class e extends a0.d {

    /* renamed from: a  reason: collision with root package name */
    private final b0<a0.d.b> f731a;

    /* renamed from: b  reason: collision with root package name */
    private final String f732b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.d.a {

        /* renamed from: a  reason: collision with root package name */
        private b0<a0.d.b> f733a;

        /* renamed from: b  reason: collision with root package name */
        private String f734b;

        @Override // am.a0.d.a
        public a0.d a() {
            String str = "";
            if (this.f733a == null) {
                str = " files";
            }
            if (str.isEmpty()) {
                return new e(this.f733a, this.f734b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.d.a
        public a0.d.a b(b0<a0.d.b> b0Var) {
            Objects.requireNonNull(b0Var, "Null files");
            this.f733a = b0Var;
            return this;
        }

        @Override // am.a0.d.a
        public a0.d.a c(String str) {
            this.f734b = str;
            return this;
        }
    }

    @Override // am.a0.d
    public b0<a0.d.b> b() {
        return this.f731a;
    }

    @Override // am.a0.d
    public String c() {
        return this.f732b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.d) {
            a0.d dVar = (a0.d) obj;
            if (this.f731a.equals(dVar.b())) {
                String str = this.f732b;
                if (str == null) {
                    if (dVar.c() == null) {
                        return true;
                    }
                } else if (str.equals(dVar.c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f731a.hashCode() ^ 1000003) * 1000003;
        String str = this.f732b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f731a + ", orgId=" + this.f732b + "}";
    }

    private e(b0<a0.d.b> b0Var, String str) {
        this.f731a = b0Var;
        this.f732b = str;
    }
}