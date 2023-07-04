package e10;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class u {

    /* renamed from: d  reason: collision with root package name */
    public static final a f24491d = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final u f24492e = new u(e0.STRICT, null, null, 6, null);

    /* renamed from: a  reason: collision with root package name */
    private final e0 f24493a;

    /* renamed from: b  reason: collision with root package name */
    private final vz.i f24494b;

    /* renamed from: c  reason: collision with root package name */
    private final e0 f24495c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final u a() {
            return u.f24492e;
        }
    }

    public u(e0 reportLevelBefore, vz.i iVar, e0 reportLevelAfter) {
        kotlin.jvm.internal.s.g(reportLevelBefore, "reportLevelBefore");
        kotlin.jvm.internal.s.g(reportLevelAfter, "reportLevelAfter");
        this.f24493a = reportLevelBefore;
        this.f24494b = iVar;
        this.f24495c = reportLevelAfter;
    }

    public final e0 b() {
        return this.f24495c;
    }

    public final e0 c() {
        return this.f24493a;
    }

    public final vz.i d() {
        return this.f24494b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            u uVar = (u) obj;
            return this.f24493a == uVar.f24493a && kotlin.jvm.internal.s.c(this.f24494b, uVar.f24494b) && this.f24495c == uVar.f24495c;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f24493a.hashCode() * 31;
        vz.i iVar = this.f24494b;
        return ((hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31) + this.f24495c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f24493a + ", sinceVersion=" + this.f24494b + ", reportLevelAfter=" + this.f24495c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ u(e0 e0Var, vz.i iVar, e0 e0Var2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(e0Var, (i11 & 2) != 0 ? new vz.i(1, 0) : iVar, (i11 & 4) != 0 ? e0Var : e0Var2);
    }
}