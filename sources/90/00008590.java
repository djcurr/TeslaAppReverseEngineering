package m00;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class k {
    public static final void a(boolean z11, Number step) {
        s.g(step, "step");
        if (z11) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + step + CoreConstants.DOT);
    }

    public static e<Float> b(float f11, float f12) {
        return new d(f11, f12);
    }
}