package d2;

import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: a  reason: collision with root package name */
    private final int f23296a;

    public b(int i11) {
        this.f23296a = i11;
    }

    public final int a() {
        return this.f23296a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (kotlin.jvm.internal.s.c(b.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
            return this.f23296a == ((b) obj).f23296a;
        }
        return false;
    }

    public int hashCode() {
        return this.f23296a;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.f23296a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}