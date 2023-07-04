package nr;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes2.dex */
public final class u<OutputT> {

    /* renamed from: a  reason: collision with root package name */
    private final OutputT f41847a;

    public u(OutputT outputt) {
        this.f41847a = outputt;
    }

    public final OutputT a() {
        return this.f41847a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return kotlin.jvm.internal.s.c(this.f41847a, ((u) obj).f41847a);
        }
        return false;
    }

    public int hashCode() {
        OutputT outputt = this.f41847a;
        if (outputt != null) {
            return outputt.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "WorkflowOutput(" + this.f41847a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}