package or;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nr.p;
import nr.r;
import nr.v;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: c  reason: collision with root package name */
    public static final a f42991c = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final r f42992a;

    /* renamed from: b  reason: collision with root package name */
    private final String f42993b;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(okio.i bytes) {
            s.g(bytes, "bytes");
            okio.f fVar = new okio.f();
            fVar.w1(bytes);
            return new k(r.f41832f.a(nr.j.a(fVar)), nr.j.b(fVar));
        }
    }

    public k(r identifier, String name) {
        s.g(identifier, "identifier");
        s.g(name, "name");
        this.f42992a = identifier;
        this.f42993b = name;
    }

    public final r a() {
        return this.f42992a;
    }

    public final String b() {
        return this.f42993b;
    }

    public final boolean c(p<?, ?, ?> otherWorkflow, String otherName) {
        s.g(otherWorkflow, "otherWorkflow");
        s.g(otherName, "otherName");
        return s.c(this.f42992a, v.g(otherWorkflow)) && s.c(this.f42993b, otherName);
    }

    public final okio.i d() {
        okio.i e11 = this.f42992a.e();
        if (e11 == null) {
            return null;
        }
        okio.f fVar = new okio.f();
        nr.j.c(fVar, e11);
        nr.j.d(fVar, b());
        return fVar.j1();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            return s.c(this.f42992a, kVar.f42992a) && s.c(this.f42993b, kVar.f42993b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f42992a.hashCode() * 31) + this.f42993b.hashCode();
    }

    public String toString() {
        return "WorkflowNodeId(identifier=" + this.f42992a + ", name=" + this.f42993b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(p<?, ?, ?> workflow, String name) {
        this(v.g(workflow), name);
        s.g(workflow, "workflow");
        s.g(name, "name");
    }
}