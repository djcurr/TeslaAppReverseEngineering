package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$payWithLink$1$2", f = "BaseSheetViewModel.kt", l = {484}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BaseSheetViewModel$payWithLink$1$2 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ UserInput $userInput;
    int label;
    final /* synthetic */ BaseSheetViewModel<TransitionTargetType> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel$payWithLink$1$2(BaseSheetViewModel<TransitionTargetType> baseSheetViewModel, UserInput userInput, d<? super BaseSheetViewModel$payWithLink$1$2> dVar) {
        super(2, dVar);
        this.this$0 = baseSheetViewModel;
        this.$userInput = userInput;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new BaseSheetViewModel$payWithLink$1$2(this.this$0, this.$userInput, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((BaseSheetViewModel$payWithLink$1$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object m156signInWithUserInputgIAlus;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            LinkPaymentLauncher linkLauncher = this.this$0.getLinkLauncher();
            UserInput userInput = this.$userInput;
            this.label = 1;
            m156signInWithUserInputgIAlus = linkLauncher.m156signInWithUserInputgIAlus(userInput, this);
            if (m156signInWithUserInputgIAlus == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
            m156signInWithUserInputgIAlus = ((q) obj).j();
        }
        BaseSheetViewModel<TransitionTargetType> baseSheetViewModel = this.this$0;
        UserInput userInput2 = this.$userInput;
        Throwable e11 = q.e(m156signInWithUserInputgIAlus);
        if (e11 == null) {
            ((Boolean) m156signInWithUserInputgIAlus).booleanValue();
            baseSheetViewModel.payWithLink(userInput2);
        } else {
            baseSheetViewModel.onError(e11.getLocalizedMessage());
            baseSheetViewModel.getSavedStateHandle().h(BaseSheetViewModel.SAVE_PROCESSING, kotlin.coroutines.jvm.internal.b.a(false));
            baseSheetViewModel.updatePrimaryButtonState(PrimaryButton.State.Ready.INSTANCE);
        }
        return b0.f54756a;
    }
}