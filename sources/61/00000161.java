package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class t extends a0.e.d.AbstractC0027d {

    /* renamed from: a  reason: collision with root package name */
    private final String f876a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.e.d.AbstractC0027d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f877a;

        @Override // am.a0.e.d.AbstractC0027d.a
        public a0.e.d.AbstractC0027d a() {
            String str = "";
            if (this.f877a == null) {
                str = " content";
            }
            if (str.isEmpty()) {
                return new t(this.f877a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.e.d.AbstractC0027d.a
        public a0.e.d.AbstractC0027d.a b(String str) {
            Objects.requireNonNull(str, "Null content");
            this.f877a = str;
            return this;
        }
    }

    @Override // am.a0.e.d.AbstractC0027d
    public String b() {
        return this.f876a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.AbstractC0027d) {
            return this.f876a.equals(((a0.e.d.AbstractC0027d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f876a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f876a + "}";
    }

    private t(String str) {
        this.f876a = str;
    }
}