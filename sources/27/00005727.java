package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.d;
import androidx.fragment.app.h;
import androidx.savedstate.c;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class USBankAccountFormFragment$paymentOptionsViewModelFactory$2 extends u implements h00.a<PaymentOptionsViewModel.Factory> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$paymentOptionsViewModelFactory$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements h00.a<Application> {
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(USBankAccountFormFragment uSBankAccountFormFragment) {
            super(0);
            this.this$0 = uSBankAccountFormFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        /* renamed from: invoke */
        public final Application mo11invoke() {
            Application application = this.this$0.requireActivity().getApplication();
            s.f(application, "requireActivity().application");
            return application;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$paymentOptionsViewModelFactory$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends u implements h00.a<PaymentOptionContract.Args> {
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(USBankAccountFormFragment uSBankAccountFormFragment) {
            super(0);
            this.this$0 = uSBankAccountFormFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        /* renamed from: invoke */
        public final PaymentOptionContract.Args mo11invoke() {
            Parcelable parcelable = this.this$0.requireArguments().getParcelable("com.stripe.android.paymentsheet.extra_starter_args");
            if (parcelable != null) {
                return (PaymentOptionContract.Args) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$paymentOptionsViewModelFactory$2(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    /* renamed from: invoke */
    public final PaymentOptionsViewModel.Factory mo11invoke() {
        Intent intent;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0);
        h activity = this.this$0.getActivity();
        Bundle bundle = null;
        c cVar = activity instanceof d ? (d) activity : null;
        if (cVar == null) {
            cVar = this.this$0;
        }
        h activity2 = this.this$0.getActivity();
        d dVar = activity2 instanceof d ? (d) activity2 : null;
        if (dVar != null && (intent = dVar.getIntent()) != null) {
            bundle = intent.getExtras();
        }
        return new PaymentOptionsViewModel.Factory(anonymousClass1, anonymousClass2, cVar, bundle);
    }
}