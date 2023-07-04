package com.stripe.android.view;

import android.app.Application;
import androidx.lifecycle.s0;
import com.stripe.android.view.FpxViewModel;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class AddPaymentMethodFpxView$viewModel$2 extends kotlin.jvm.internal.u implements h00.a<FpxViewModel> {
    final /* synthetic */ androidx.fragment.app.h $activity;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodFpxView$viewModel$2(androidx.fragment.app.h hVar) {
        super(0);
        this.$activity = hVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final FpxViewModel invoke() {
        androidx.fragment.app.h hVar = this.$activity;
        Application application = hVar.getApplication();
        kotlin.jvm.internal.s.f(application, "activity.application");
        return (FpxViewModel) new s0(hVar, new FpxViewModel.Factory(application)).a(FpxViewModel.class);
    }
}