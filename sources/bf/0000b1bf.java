package s2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final n2.a f50105a;

    /* renamed from: b  reason: collision with root package name */
    private final t f50106b;

    public i0(n2.a text, t offsetMapping) {
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(offsetMapping, "offsetMapping");
        this.f50105a = text;
        this.f50106b = offsetMapping;
    }

    public final t a() {
        return this.f50106b;
    }

    public final n2.a b() {
        return this.f50105a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return kotlin.jvm.internal.s.c(this.f50105a, i0Var.f50105a) && kotlin.jvm.internal.s.c(this.f50106b, i0Var.f50106b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f50105a.hashCode() * 31) + this.f50106b.hashCode();
    }

    public String toString() {
        return "TransformedText(text=" + ((Object) this.f50105a) + ", offsetMapping=" + this.f50106b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}