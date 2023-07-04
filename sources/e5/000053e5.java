package com.stripe.android.payments.core;

import androidx.activity.result.b;
import androidx.activity.result.c;
import com.stripe.android.payments.PaymentFlowResult;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public interface ActivityResultLauncherHost {

    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static void onLauncherInvalidated(ActivityResultLauncherHost activityResultLauncherHost) {
            s.g(activityResultLauncherHost, "this");
        }

        public static void onNewActivityResultCaller(ActivityResultLauncherHost activityResultLauncherHost, c activityResultCaller, b<PaymentFlowResult.Unvalidated> activityResultCallback) {
            s.g(activityResultLauncherHost, "this");
            s.g(activityResultCaller, "activityResultCaller");
            s.g(activityResultCallback, "activityResultCallback");
        }
    }

    void onLauncherInvalidated();

    void onNewActivityResultCaller(c cVar, b<PaymentFlowResult.Unvalidated> bVar);
}