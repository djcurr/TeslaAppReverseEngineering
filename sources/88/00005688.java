package com.stripe.android.paymentsheet.injection;

import android.content.Context;
import androidx.activity.result.c;
import androidx.lifecycle.u0;
import androidx.lifecycle.v;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.paymentsheet.PaymentOptionCallback;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentSheetResultCallback;
import com.stripe.android.paymentsheet.flowcontroller.DefaultFlowController;
import com.stripe.android.paymentsheet.forms.FormViewModel;
import com.stripe.android.paymentsheet.model.PaymentOptionFactory;
import h00.a;
import v20.o0;

/* loaded from: classes6.dex */
public interface FlowControllerComponent {

    /* loaded from: classes6.dex */
    public interface Builder {
        Builder activityResultCaller(c cVar);

        Builder appContext(Context context);

        FlowControllerComponent build();

        Builder injectorKey(@InjectorKey String str);

        Builder lifeCycleOwner(v vVar);

        Builder lifecycleScope(o0 o0Var);

        Builder paymentOptionCallback(PaymentOptionCallback paymentOptionCallback);

        Builder paymentOptionFactory(PaymentOptionFactory paymentOptionFactory);

        Builder paymentResultCallback(PaymentSheetResultCallback paymentSheetResultCallback);

        Builder statusBarColor(a<Integer> aVar);

        Builder viewModelStoreOwner(u0 u0Var);
    }

    DefaultFlowController getFlowController();

    void inject(PaymentOptionsViewModel.Factory factory);

    void inject(FormViewModel.Factory factory);
}