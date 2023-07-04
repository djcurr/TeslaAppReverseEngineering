package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import androidx.fragment.app.e0;
import androidx.fragment.app.h;
import androidx.lifecycle.s0;
import com.stripe.android.paymentsheet.PaymentOptionsActivity;
import com.stripe.android.paymentsheet.PaymentOptionsViewModel;
import com.stripe.android.paymentsheet.PaymentSheetActivity;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class USBankAccountFormFragment$sheetViewModel$2 extends u implements h00.a<BaseSheetViewModel<? extends Object>> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$sheetViewModel$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements h00.a<s0.b> {
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(USBankAccountFormFragment uSBankAccountFormFragment) {
            super(0);
            this.this$0 = uSBankAccountFormFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        /* renamed from: invoke */
        public final s0.b mo11invoke() {
            s0.b paymentOptionsViewModelFactory;
            paymentOptionsViewModelFactory = this.this$0.getPaymentOptionsViewModelFactory();
            return paymentOptionsViewModelFactory;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$sheetViewModel$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends u implements h00.a<s0.b> {
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(USBankAccountFormFragment uSBankAccountFormFragment) {
            super(0);
            this.this$0 = uSBankAccountFormFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        /* renamed from: invoke */
        public final s0.b mo11invoke() {
            s0.b paymentSheetViewModelFactory;
            paymentSheetViewModelFactory = this.this$0.getPaymentSheetViewModelFactory();
            return paymentSheetViewModelFactory;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$sheetViewModel$2(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    /* renamed from: invoke */
    public final BaseSheetViewModel<? extends Object> mo11invoke() {
        h requireActivity = this.this$0.requireActivity();
        if (requireActivity instanceof PaymentOptionsActivity) {
            USBankAccountFormFragment uSBankAccountFormFragment = this.this$0;
            return (BaseSheetViewModel) e0.a(uSBankAccountFormFragment, m0.b(PaymentOptionsViewModel.class), new USBankAccountFormFragment$sheetViewModel$2$invoke$$inlined$activityViewModels$1(uSBankAccountFormFragment), new AnonymousClass1(uSBankAccountFormFragment)).mo16getValue();
        } else if (requireActivity instanceof PaymentSheetActivity) {
            USBankAccountFormFragment uSBankAccountFormFragment2 = this.this$0;
            return (BaseSheetViewModel) e0.a(uSBankAccountFormFragment2, m0.b(PaymentSheetViewModel.class), new USBankAccountFormFragment$sheetViewModel$2$invoke$$inlined$activityViewModels$3(uSBankAccountFormFragment2), new AnonymousClass2(uSBankAccountFormFragment2)).mo16getValue();
        } else {
            return null;
        }
    }
}