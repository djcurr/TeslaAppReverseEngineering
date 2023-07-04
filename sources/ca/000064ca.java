package d2;

import android.os.Build;
import android.view.PointerIcon;
import ch.qos.logback.core.CoreConstants;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: a  reason: collision with root package name */
    private final PointerIcon f23294a;

    public final PointerIcon a() {
        return this.f23294a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (kotlin.jvm.internal.s.c(a.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
            a aVar = (a) obj;
            return !(Build.VERSION.SDK_INT < 24 ? this.f23294a != aVar.f23294a : !kotlin.jvm.internal.s.c(this.f23294a, aVar.f23294a));
        }
        return false;
    }

    public int hashCode() {
        return this.f23294a.hashCode();
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.f23294a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}