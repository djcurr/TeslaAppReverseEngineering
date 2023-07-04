package g20;

import ch.qos.logback.core.CoreConstants;
import w00.n0;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final r10.c f27382a;

    /* renamed from: b  reason: collision with root package name */
    private final p10.c f27383b;

    /* renamed from: c  reason: collision with root package name */
    private final r10.a f27384c;

    /* renamed from: d  reason: collision with root package name */
    private final n0 f27385d;

    public f(r10.c nameResolver, p10.c classProto, r10.a metadataVersion, n0 sourceElement) {
        kotlin.jvm.internal.s.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.s.g(classProto, "classProto");
        kotlin.jvm.internal.s.g(metadataVersion, "metadataVersion");
        kotlin.jvm.internal.s.g(sourceElement, "sourceElement");
        this.f27382a = nameResolver;
        this.f27383b = classProto;
        this.f27384c = metadataVersion;
        this.f27385d = sourceElement;
    }

    public final r10.c a() {
        return this.f27382a;
    }

    public final p10.c b() {
        return this.f27383b;
    }

    public final r10.a c() {
        return this.f27384c;
    }

    public final n0 d() {
        return this.f27385d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return kotlin.jvm.internal.s.c(this.f27382a, fVar.f27382a) && kotlin.jvm.internal.s.c(this.f27383b, fVar.f27383b) && kotlin.jvm.internal.s.c(this.f27384c, fVar.f27384c) && kotlin.jvm.internal.s.c(this.f27385d, fVar.f27385d);
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f27382a.hashCode() * 31) + this.f27383b.hashCode()) * 31) + this.f27384c.hashCode()) * 31) + this.f27385d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f27382a + ", classProto=" + this.f27383b + ", metadataVersion=" + this.f27384c + ", sourceElement=" + this.f27385d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}