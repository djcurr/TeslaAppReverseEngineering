package androidx.compose.ui.platform;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class t1 {

    /* renamed from: a  reason: collision with root package name */
    private final String f3109a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f3110b;

    public t1(String name, Object obj) {
        kotlin.jvm.internal.s.g(name, "name");
        this.f3109a = name;
        this.f3110b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t1) {
            t1 t1Var = (t1) obj;
            return kotlin.jvm.internal.s.c(this.f3109a, t1Var.f3109a) && kotlin.jvm.internal.s.c(this.f3110b, t1Var.f3110b);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f3109a.hashCode() * 31;
        Object obj = this.f3110b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.f3109a + ", value=" + this.f3110b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}