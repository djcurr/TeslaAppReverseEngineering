package com.stripe.android.paymentsheet;

import android.app.Application;
import android.os.Parcelable;
import androidx.lifecycle.s0;
import com.stripe.android.paymentsheet.PaymentSheetContract;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;

/* loaded from: classes6.dex */
final class PaymentSheetListFragment$activityViewModel$2 extends kotlin.jvm.internal.u implements h00.a<s0.b> {
    final /* synthetic */ PaymentSheetListFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetListFragment$activityViewModel$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.u implements h00.a<Application> {
        final /* synthetic */ PaymentSheetListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaymentSheetListFragment paymentSheetListFragment) {
            super(0);
            this.this$0 = paymentSheetListFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        /* renamed from: invoke */
        public final Application mo11invoke() {
            Application application = this.this$0.requireActivity().getApplication();
            kotlin.jvm.internal.s.f(application, "requireActivity().application");
            return application;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.PaymentSheetListFragment$activityViewModel$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends kotlin.jvm.internal.u implements h00.a<PaymentSheetContract.Args> {
        final /* synthetic */ PaymentSheetListFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PaymentSheetListFragment paymentSheetListFragment) {
            super(0);
            this.this$0 = paymentSheetListFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        /* renamed from: invoke */
        public final PaymentSheetContract.Args mo11invoke() {
            Parcelable parcelable = this.this$0.requireArguments().getParcelable("com.stripe.android.paymentsheet.extra_starter_args");
            if (parcelable != null) {
                return (PaymentSheetContract.Args) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentSheetListFragment$activityViewModel$2(PaymentSheetListFragment paymentSheetListFragment) {
        super(0);
        this.this$0 = paymentSheetListFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    /* renamed from: invoke */
    public final s0.b mo11invoke() {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
        androidx.fragment.app.h activity = this.this$0.getActivity();
        androidx.savedstate.c cVar = activity instanceof androidx.appcompat.app.d ? (androidx.appcompat.app.d) activity : null;
        if (cVar == null) {
            cVar = this.this$0;
        }
        return new PaymentSheetViewModel.Factory(anonymousClass1, anonymousClass2, cVar, null, 8, null);
    }
}