package mu;

import io.sentry.g3;
import io.sentry.t1;
import kotlin.jvm.internal.s;
import tt.l;

/* loaded from: classes6.dex */
public final class d implements g3.e {
    @Override // io.sentry.g3.e
    public Double a(t1 samplingContext) {
        s.g(samplingContext, "samplingContext");
        String m11 = samplingContext.a().m();
        if (s.c(m11, l.ANDROID_APPLICATION_ON_CREATE.name()) ? true : s.c(m11, l.JS_STARTUP.name()) ? true : s.c(m11, l.APP_LAUNCH_GATE.name()) ? true : s.c(m11, l.ANDROID_INITIALIZER.name()) ? true : s.c(m11, l.ANDROID_TIME_TO_INTERACTIVE.name()) ? true : s.c(m11, l.GODOT_INITIALIZATION.name()) ? true : s.c(m11, l.FIRST_PRODUCT_ON_SCREEN.name())) {
            return Double.valueOf(1.0d);
        }
        return Double.valueOf(0.05d);
    }
}