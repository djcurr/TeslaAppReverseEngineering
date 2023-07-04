package c1;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f8653a;

    public q0(String key) {
        kotlin.jvm.internal.s.g(key, "key");
        this.f8653a = key;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && kotlin.jvm.internal.s.c(this.f8653a, ((q0) obj).f8653a);
    }

    public int hashCode() {
        return this.f8653a.hashCode();
    }

    public String toString() {
        return "OpaqueKey(key=" + this.f8653a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}