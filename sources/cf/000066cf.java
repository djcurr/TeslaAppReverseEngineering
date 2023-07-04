package e10;

import ch.qos.logback.core.CoreConstants;
import java.util.Collection;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final m10.i f24478a;

    /* renamed from: b  reason: collision with root package name */
    private final Collection<a> f24479b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f24480c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f24481d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(m10.i nullabilityQualifier, Collection<? extends a> qualifierApplicabilityTypes, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(nullabilityQualifier, "nullabilityQualifier");
        kotlin.jvm.internal.s.g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f24478a = nullabilityQualifier;
        this.f24479b = qualifierApplicabilityTypes;
        this.f24480c = z11;
        this.f24481d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q b(q qVar, m10.i iVar, Collection collection, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            iVar = qVar.f24478a;
        }
        if ((i11 & 2) != 0) {
            collection = qVar.f24479b;
        }
        if ((i11 & 4) != 0) {
            z11 = qVar.f24480c;
        }
        if ((i11 & 8) != 0) {
            z12 = qVar.f24481d;
        }
        return qVar.a(iVar, collection, z11, z12);
    }

    public final q a(m10.i nullabilityQualifier, Collection<? extends a> qualifierApplicabilityTypes, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(nullabilityQualifier, "nullabilityQualifier");
        kotlin.jvm.internal.s.g(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new q(nullabilityQualifier, qualifierApplicabilityTypes, z11, z12);
    }

    public final boolean c() {
        return this.f24481d;
    }

    public final boolean d() {
        return this.f24480c;
    }

    public final boolean e() {
        return this.f24478a.c() == m10.h.NOT_NULL && this.f24480c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            return kotlin.jvm.internal.s.c(this.f24478a, qVar.f24478a) && kotlin.jvm.internal.s.c(this.f24479b, qVar.f24479b) && this.f24480c == qVar.f24480c && this.f24481d == qVar.f24481d;
        }
        return false;
    }

    public final m10.i f() {
        return this.f24478a;
    }

    public final Collection<a> g() {
        return this.f24479b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f24478a.hashCode() * 31) + this.f24479b.hashCode()) * 31;
        boolean z11 = this.f24480c;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z12 = this.f24481d;
        return i12 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f24478a + ", qualifierApplicabilityTypes=" + this.f24479b + ", affectsTypeParameterBasedTypes=" + this.f24480c + ", affectsStarProjection=" + this.f24481d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ q(m10.i r1, java.util.Collection r2, boolean r3, boolean r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 4
            if (r6 == 0) goto Lf
            m10.h r3 = r1.c()
            m10.h r6 = m10.h.NOT_NULL
            if (r3 != r6) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            r5 = r5 & 8
            if (r5 == 0) goto L14
            r4 = r3
        L14:
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e10.q.<init>(m10.i, java.util.Collection, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}