package com.stripe.android.paymentsheet;

import android.app.Application;
import android.os.Parcelable;
import androidx.lifecycle.s0;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;

/* loaded from: classes6.dex */
final class PaymentOptionsListFragment$activityViewModel$2 extends kotlin.jvm.internal.u implements h00.a<s0.b> {
    final /* synthetic */ PaymentOptionsListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsListFragment$activityViewModel$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.u implements h00.a<Application> {
        final /* synthetic */ PaymentOptionsListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaymentOptionsListFragment paymentOptionsListFragment) {
            super(0);
            this.this$0 = paymentOptionsListFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Application invoke() {
            Application application = this.this$0.requireActivity().getApplication();
            kotlin.jvm.internal.s.f(application, "requireActivity().application");
            return application;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsListFragment$activityViewModel$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.u implements h00.a<PaymentOptionContract.Args> {
        final /* synthetic */ PaymentOptionsListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaymentOptionsListFragment paymentOptionsListFragment) {
            super(0);
            this.this$0 = paymentOptionsListFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final PaymentOptionContract.Args invoke() {
            Parcelable parcelable = this.this$0.requireArguments().getParcelable("com.stripe.android.paymentsheet.extra_starter_args");
            if (parcelable != null) {
                return (PaymentOptionContract.Args) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsListFragment$activityViewModel$2(PaymentOptionsListFragment paymentOptionsListFragment) {
        super(0);
        this.this$0 = paymentOptionsListFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final s0.b invoke() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
        androidx.fragment.app.h activity = this.this$0.getActivity();
        androidx.savedstate.c cVar = activity instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) activity : null;
        if (cVar == null) {
            cVar = this.this$0;
        }
        return new PaymentOptionsViewModel.Factory(anonymousClass1, anonymousClass2, cVar, null, 8, null);
    }
}