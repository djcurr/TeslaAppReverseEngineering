package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.app.Application;
import androidx.lifecycle.s0;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.model.ClientSecret;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.paymentdatacollection.FormFragmentArguments;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormViewModel;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class USBankAccountFormFragment$viewModel$2 extends u implements h00.a<s0.b> {
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$viewModel$2$1  reason: invalid class name */
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
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$viewModel$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends u implements h00.a<USBankAccountFormViewModel.Args> {
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(USBankAccountFormFragment uSBankAccountFormFragment) {
            super(0);
            this.this$0 = uSBankAccountFormFragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        /* renamed from: invoke */
        public final USBankAccountFormViewModel.Args mo11invoke() {
            FormFragmentArguments formArgs;
            BaseSheetViewModel sheetViewModel;
            ClientSecret clientSecret;
            BaseSheetViewModel sheetViewModel2;
            BaseSheetViewModel sheetViewModel3;
            formArgs = this.this$0.getFormArgs();
            s.f(formArgs, "formArgs");
            sheetViewModel = this.this$0.getSheetViewModel();
            boolean z11 = sheetViewModel instanceof PaymentSheetViewModel;
            clientSecret = this.this$0.getClientSecret();
            sheetViewModel2 = this.this$0.getSheetViewModel();
            USBankAccountFormScreenState usBankAccountSavedScreenState = sheetViewModel2 == null ? null : sheetViewModel2.getUsBankAccountSavedScreenState();
            sheetViewModel3 = this.this$0.getSheetViewModel();
            PaymentSelection.New newLpm = sheetViewModel3 == null ? null : sheetViewModel3.getNewLpm();
            return new USBankAccountFormViewModel.Args(formArgs, z11, clientSecret, usBankAccountSavedScreenState, newLpm instanceof PaymentSelection.New.USBankAccount ? (PaymentSelection.New.USBankAccount) newLpm : null, null, 32, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$viewModel$2(USBankAccountFormFragment uSBankAccountFormFragment) {
        super(0);
        this.this$0 = uSBankAccountFormFragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    /* renamed from: invoke */
    public final s0.b mo11invoke() {
        return new USBankAccountFormViewModel.Factory(new AnonymousClass1(this.this$0), new AnonymousClass2(this.this$0), this.this$0, null, 8, null);
    }
}