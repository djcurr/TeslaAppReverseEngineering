package pr;

import java.util.Objects;
import kotlin.jvm.internal.m0;

/* loaded from: classes2.dex */
public abstract class t<T> {

    /* renamed from: a */
    private final n00.d<T> f46896a;

    public t(n00.d<T> type) {
        kotlin.jvm.internal.s.g(type, "type");
        this.f46896a = type;
    }

    public abstract T a();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kotlin.jvm.internal.s.c(m0.b(getClass()), m0.b(obj.getClass()))) {
            n00.d<T> dVar = this.f46896a;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.squareup.workflow1.ui.ViewEnvironmentKey<*>");
            return kotlin.jvm.internal.s.c(dVar, ((t) obj).f46896a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46896a.hashCode();
    }

    public String toString() {
        return "ViewEnvironmentKey(" + this.f46896a + ")-" + super.toString();
    }
}