package u10;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;

/* loaded from: classes5.dex */
public final class a {
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    private static final f f52978e;

    /* renamed from: a  reason: collision with root package name */
    private final c f52979a;

    /* renamed from: b  reason: collision with root package name */
    private final c f52980b;

    /* renamed from: c  reason: collision with root package name */
    private final f f52981c;

    /* renamed from: d  reason: collision with root package name */
    private final c f52982d;

    /* renamed from: u10.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    private static final class C1192a {
        private C1192a() {
        }

        public /* synthetic */ C1192a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1192a(null);
        f i11 = f.i("<local>");
        s.f(i11, "special(\"<local>\")");
        f52978e = i11;
        s.f(c.k(i11), "topLevel(LOCAL_NAME)");
    }

    public a(c packageName, c cVar, f callableName, c cVar2) {
        s.g(packageName, "packageName");
        s.g(callableName, "callableName");
        this.f52979a = packageName;
        this.f52980b = cVar;
        this.f52981c = callableName;
        this.f52982d = cVar2;
    }

    public final f a() {
        return this.f52981c;
    }

    public final c b() {
        return this.f52980b;
    }

    public final c c() {
        return this.f52979a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(this.f52979a, aVar.f52979a) && s.c(this.f52980b, aVar.f52980b) && s.c(this.f52981c, aVar.f52981c) && s.c(this.f52982d, aVar.f52982d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f52979a.hashCode() * 31;
        c cVar = this.f52980b;
        int hashCode2 = (((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f52981c.hashCode()) * 31;
        c cVar2 = this.f52982d;
        return hashCode2 + (cVar2 != null ? cVar2.hashCode() : 0);
    }

    public String toString() {
        String C;
        StringBuilder sb2 = new StringBuilder();
        String b11 = c().b();
        s.f(b11, "packageName.asString()");
        C = v.C(b11, CoreConstants.DOT, '/', false, 4, null);
        sb2.append(C);
        sb2.append("/");
        if (b() != null) {
            sb2.append(b());
            sb2.append(".");
        }
        sb2.append(a());
        String sb3 = sb2.toString();
        s.f(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public /* synthetic */ a(c cVar, c cVar2, f fVar, c cVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, fVar, (i11 & 8) != 0 ? null : cVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(c packageName, f callableName) {
        this(packageName, null, callableName, null, 8, null);
        s.g(packageName, "packageName");
        s.g(callableName, "callableName");
    }
}