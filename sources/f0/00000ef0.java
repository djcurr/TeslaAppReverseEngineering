package c1;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f8473a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f8474b;

    public h0(Object obj, Object obj2) {
        this.f8473a = obj;
        this.f8474b = obj2;
    }

    private final int a(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h0) {
            h0 h0Var = (h0) obj;
            return kotlin.jvm.internal.s.c(this.f8473a, h0Var.f8473a) && kotlin.jvm.internal.s.c(this.f8474b, h0Var.f8474b);
        }
        return false;
    }

    public int hashCode() {
        return (a(this.f8473a) * 31) + a(this.f8474b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f8473a + ", right=" + this.f8474b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}