package com.stripe.android.paymentsheet.injection;

import android.app.Application;
import android.content.Context;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.w0;

/* loaded from: classes6.dex */
public abstract class PaymentSheetLauncherModule {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EventReporter.Mode provideEventReporterMode() {
            return EventReporter.Mode.Complete;
        }

        public final Set<String> provideProductUsageTokens() {
            Set<String> c11;
            c11 = w0.c("PaymentSheet");
            return c11;
        }
    }

    public abstract Context bindsApplicationForContext(Application application);
}