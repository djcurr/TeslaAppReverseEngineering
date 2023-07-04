package kotlin.text;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f35200a;

    /* renamed from: b  reason: collision with root package name */
    private final m00.i f35201b;

    public f(String value, m00.i range) {
        kotlin.jvm.internal.s.g(value, "value");
        kotlin.jvm.internal.s.g(range, "range");
        this.f35200a = value;
        this.f35201b = range;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return kotlin.jvm.internal.s.c(this.f35200a, fVar.f35200a) && kotlin.jvm.internal.s.c(this.f35201b, fVar.f35201b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f35200a.hashCode() * 31) + this.f35201b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f35200a + ", range=" + this.f35201b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}