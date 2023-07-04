package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class v extends a0.e.f {

    /* renamed from: a  reason: collision with root package name */
    private final String f886a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f887a;

        @Override // am.a0.e.f.a
        public a0.e.f a() {
            String str = "";
            if (this.f887a == null) {
                str = " identifier";
            }
            if (str.isEmpty()) {
                return new v(this.f887a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.f.a
        public a0.e.f.a b(String str) {
            Objects.requireNonNull(str, "Null identifier");
            this.f887a = str;
            return this;
        }
    }

    @Override // am.a0.e.f
    public String b() {
        return this.f886a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.f) {
            return this.f886a.equals(((a0.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f886a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f886a + "}";
    }

    private v(String str) {
        this.f886a = str;
    }
}