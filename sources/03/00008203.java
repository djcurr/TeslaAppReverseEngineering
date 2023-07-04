package l2;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f36389a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.a<Boolean> f36390b;

    public final h00.a<Boolean> a() {
        return this.f36390b;
    }

    public final String b() {
        return this.f36389a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return kotlin.jvm.internal.s.c(this.f36389a, dVar.f36389a) && kotlin.jvm.internal.s.c(this.f36390b, dVar.f36390b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f36389a.hashCode() * 31) + this.f36390b.hashCode();
    }

    public String toString() {
        return "CustomAccessibilityAction(label=" + this.f36389a + ", action=" + this.f36390b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}