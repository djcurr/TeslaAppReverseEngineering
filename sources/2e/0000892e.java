package n10;

import ch.qos.logback.core.CoreConstants;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s10.a;
import t10.d;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    public static final a f40225b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final String f40226a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r a(String name, String desc) {
            kotlin.jvm.internal.s.g(name, "name");
            kotlin.jvm.internal.s.g(desc, "desc");
            return new r(name + '#' + desc, null);
        }

        public final r b(t10.d signature) {
            kotlin.jvm.internal.s.g(signature, "signature");
            if (signature instanceof d.b) {
                return d(signature.c(), signature.b());
            }
            if (signature instanceof d.a) {
                return a(signature.c(), signature.b());
            }
            throw new NoWhenBranchMatchedException();
        }

        public final r c(r10.c nameResolver, a.c signature) {
            kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
            kotlin.jvm.internal.s.g(signature, "signature");
            return d(nameResolver.getString(signature.r()), nameResolver.getString(signature.q()));
        }

        public final r d(String name, String desc) {
            kotlin.jvm.internal.s.g(name, "name");
            kotlin.jvm.internal.s.g(desc, "desc");
            return new r(kotlin.jvm.internal.s.p(name, desc), null);
        }

        public final r e(r signature, int i11) {
            kotlin.jvm.internal.s.g(signature, "signature");
            return new r(signature.a() + '@' + i11, null);
        }
    }

    private r(String str) {
        this.f40226a = str;
    }

    public /* synthetic */ r(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f40226a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && kotlin.jvm.internal.s.c(this.f40226a, ((r) obj).f40226a);
    }

    public int hashCode() {
        return this.f40226a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f40226a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}