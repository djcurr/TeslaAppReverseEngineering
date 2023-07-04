package am;

import am.a0;
import java.util.Objects;

/* loaded from: classes3.dex */
final class d extends a0.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f727a;

    /* renamed from: b  reason: collision with root package name */
    private final String f728b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends a0.c.a {

        /* renamed from: a  reason: collision with root package name */
        private String f729a;

        /* renamed from: b  reason: collision with root package name */
        private String f730b;

        @Override // am.a0.c.a
        public a0.c a() {
            String str = "";
            if (this.f729a == null) {
                str = " key";
            }
            if (this.f730b == null) {
                str = str + " value";
            }
            if (str.isEmpty()) {
                return new d(this.f729a, this.f730b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // am.a0.c.a
        public a0.c.a b(String str) {
            Objects.requireNonNull(str, "Null key");
            this.f729a = str;
            return this;
        }

        @Override // am.a0.c.a
        public a0.c.a c(String str) {
            Objects.requireNonNull(str, "Null value");
            this.f730b = str;
            return this;
        }
    }

    @Override // am.a0.c
    public String b() {
        return this.f727a;
    }

    @Override // am.a0.c
    public String c() {
        return this.f728b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.c) {
            a0.c cVar = (a0.c) obj;
            return this.f727a.equals(cVar.b()) && this.f728b.equals(cVar.c());
        }
        return false;
    }

    public int hashCode() {
        return ((this.f727a.hashCode() ^ 1000003) * 1000003) ^ this.f728b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f727a + ", value=" + this.f728b + "}";
    }

    private d(String str, String str2) {
        this.f727a = str;
        this.f728b = str2;
    }
}