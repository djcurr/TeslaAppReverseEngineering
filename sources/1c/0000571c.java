package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g0;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$1;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$1", f = "USBankAccountFormFragment.kt", l = {CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class USBankAccountFormFragment$onCreateView$1$1 extends l implements p<o0, d<? super b0>, Object> {
    int label;
    final /* synthetic */ USBankAccountFormFragment this$0;

    @f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$1$1", f = "USBankAccountFormFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$1$1 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        int label;
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(USBankAccountFormFragment uSBankAccountFormFragment, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = uSBankAccountFormFragment;
        }

        public static /* synthetic */ void e(USBankAccountFormFragment uSBankAccountFormFragment, PrimaryButton.State state) {
            m329invokeSuspend$lambda0(uSBankAccountFormFragment, state);
        }

        /* renamed from: invokeSuspend$lambda-0 */
        public static final void m329invokeSuspend$lambda0(USBankAccountFormFragment uSBankAccountFormFragment, PrimaryButton.State state) {
            USBankAccountFormViewModel viewModel;
            viewModel = uSBankAccountFormFragment.getViewModel();
            viewModel.setProcessing((state instanceof PrimaryButton.State.StartProcessing) || (state instanceof PrimaryButton.State.FinishProcessing));
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke */
        public final Object mo160invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            BaseSheetViewModel sheetViewModel;
            LiveData<PrimaryButton.State> primaryButtonState;
            a00.d.d();
            if (this.label == 0) {
                r.b(obj);
                sheetViewModel = this.this$0.getSheetViewModel();
                if (sheetViewModel != null && (primaryButtonState = sheetViewModel.getPrimaryButtonState()) != null) {
                    v viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
                    final USBankAccountFormFragment uSBankAccountFormFragment = this.this$0;
                    primaryButtonState.observe(viewLifecycleOwner, new g0() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.a
                        @Override // androidx.lifecycle.g0
                        public final void onChanged(Object obj2) {
                            USBankAccountFormFragment$onCreateView$1$1.AnonymousClass1.e(USBankAccountFormFragment.this, (PrimaryButton.State) obj2);
                        }
                    });
                }
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$onCreateView$1$1(USBankAccountFormFragment uSBankAccountFormFragment, d<? super USBankAccountFormFragment$onCreateView$1$1> dVar) {
        super(2, dVar);
        this.this$0 = uSBankAccountFormFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new USBankAccountFormFragment$onCreateView$1$1(this.this$0, dVar);
    }

    @Override // h00.p
    /* renamed from: invoke */
    public final Object mo160invoke(o0 o0Var, d<? super b0> dVar) {
        return ((USBankAccountFormFragment$onCreateView$1$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            v viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            s.f(viewLifecycleOwner, "viewLifecycleOwner");
            p.c cVar = p.c.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.b(viewLifecycleOwner, cVar, anonymousClass1, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return b0.f54756a;
    }
}