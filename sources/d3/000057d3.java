package com.stripe.android.paymentsheet.viewmodels;

import androidx.lifecycle.f0;
import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.model.StripeIntent;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.u;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$setupLink$1", f = "BaseSheetViewModel.kt", l = {437}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class BaseSheetViewModel$setupLink$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ boolean $completePayment;
    final /* synthetic */ StripeIntent $stripeIntent;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseSheetViewModel<TransitionTargetType> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$setupLink$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements h00.l<Boolean, b0> {
        final /* synthetic */ BaseSheetViewModel<TransitionTargetType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BaseSheetViewModel<TransitionTargetType> baseSheetViewModel) {
            super(1);
            this.this$0 = baseSheetViewModel;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return b0.f54756a;
        }

        public final void invoke(boolean z11) {
            f0 f0Var;
            this.this$0.setLinkVerificationCallback(null);
            f0Var = ((BaseSheetViewModel) this.this$0)._showLinkVerificationDialog;
            f0Var.setValue(Boolean.FALSE);
            if (z11) {
                this.this$0.launchLink();
            }
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountStatus.values().length];
            iArr[AccountStatus.Verified.ordinal()] = 1;
            iArr[AccountStatus.VerificationStarted.ordinal()] = 2;
            iArr[AccountStatus.NeedsVerification.ordinal()] = 3;
            iArr[AccountStatus.SignedOut.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BaseSheetViewModel$setupLink$1(BaseSheetViewModel<TransitionTargetType> baseSheetViewModel, StripeIntent stripeIntent, boolean z11, d<? super BaseSheetViewModel$setupLink$1> dVar) {
        super(2, dVar);
        this.this$0 = baseSheetViewModel;
        this.$stripeIntent = stripeIntent;
        this.$completePayment = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        BaseSheetViewModel$setupLink$1 baseSheetViewModel$setupLink$1 = new BaseSheetViewModel$setupLink$1(this.this$0, this.$stripeIntent, this.$completePayment, dVar);
        baseSheetViewModel$setupLink$1.L$0 = obj;
        return baseSheetViewModel$setupLink$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((BaseSheetViewModel$setupLink$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        f0 f0Var;
        f0 f0Var2;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            LinkPaymentLauncher linkLauncher = this.this$0.getLinkLauncher();
            StripeIntent stripeIntent = this.$stripeIntent;
            boolean z11 = this.$completePayment;
            this.label = 1;
            obj = linkLauncher.setup(stripeIntent, z11, (o0) this.L$0, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[((AccountStatus) obj).ordinal()];
        if (i12 == 1) {
            this.this$0.launchLink();
        } else if (i12 == 2 || i12 == 3) {
            BaseSheetViewModel<TransitionTargetType> baseSheetViewModel = this.this$0;
            baseSheetViewModel.setLinkVerificationCallback(new AnonymousClass1(baseSheetViewModel));
            f0Var2 = ((BaseSheetViewModel) this.this$0)._showLinkVerificationDialog;
            f0Var2.setValue(kotlin.coroutines.jvm.internal.b.a(true));
        }
        f0Var = ((BaseSheetViewModel) this.this$0)._isLinkEnabled;
        f0Var.setValue(kotlin.coroutines.jvm.internal.b.a(true));
        return b0.f54756a;
    }
}