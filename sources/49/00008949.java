package n2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class d0 extends c0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f40297a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(String verbatim) {
        super(null);
        kotlin.jvm.internal.s.g(verbatim, "verbatim");
        this.f40297a = verbatim;
    }

    public final String a() {
        return this.f40297a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && kotlin.jvm.internal.s.c(this.f40297a, ((d0) obj).f40297a);
    }

    public int hashCode() {
        return this.f40297a.hashCode();
    }

    public String toString() {
        return "VerbatimTtsAnnotation(verbatim=" + this.f40297a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}