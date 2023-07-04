package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import androidx.lifecycle.s0;
import androidx.lifecycle.u0;
import com.stripe.android.core.injection.IOContext;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowControllerInitializer;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerInitializer;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerViewModel;
import com.stripe.android.paymentsheet.model.ClientSecret;
import h00.l;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.w0;
import zz.g;

/* loaded from: classes6.dex */
public abstract class FlowControllerModule {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientSecret provideClientSecret(FlowControllerViewModel viewModel) {
            s.g(viewModel, "viewModel");
            return viewModel.getInitData().getClientSecret();
        }

        public final EventReporter.Mode provideEventReporterMode() {
            return EventReporter.Mode.Custom;
        }

        public final l<PaymentSheet.CustomerConfiguration, PrefsRepository> providePrefsRepositoryFactory(Context appContext, @IOContext g workContext) {
            s.g(appContext, "appContext");
            s.g(workContext, "workContext");
            return new FlowControllerModule$Companion$providePrefsRepositoryFactory$1(appContext, workContext);
        }

        public final Set<String> provideProductUsageTokens() {
            Set<String> c11;
            c11 = w0.c("PaymentSheet.FlowController");
            return c11;
        }

        public final FlowControllerViewModel provideViewModel(u0 viewModelStoreOwner) {
            s.g(viewModelStoreOwner, "viewModelStoreOwner");
            return (FlowControllerViewModel) new s0(viewModelStoreOwner).a(FlowControllerViewModel.class);
        }
    }

    public abstract FlowControllerInitializer bindsFlowControllerInitializer(DefaultFlowControllerInitializer defaultFlowControllerInitializer);
}