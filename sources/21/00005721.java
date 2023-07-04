package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import android.content.Context;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import com.stripe.android.paymentsheet.R;
import h00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.h0;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$3", f = "USBankAccountFormFragment.kt", l = {188}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class USBankAccountFormFragment$onCreateView$1$3 extends l implements p<o0, d<? super b0>, Object> {
    int label;
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$3$1", f = "USBankAccountFormFragment.kt", l = {CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$3$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        int label;
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(USBankAccountFormFragment uSBankAccountFormFragment, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = uSBankAccountFormFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object mo160invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            USBankAccountFormViewModel viewModel;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                r.b(obj);
                viewModel = this.this$0.getViewModel();
                h0<Boolean> saveForFutureUse = viewModel.getSaveForFutureUse();
                final USBankAccountFormFragment uSBankAccountFormFragment = this.this$0;
                kotlinx.coroutines.flow.f<Boolean> fVar = new kotlinx.coroutines.flow.f<Boolean>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.onCreateView.1.3.1.1
                    @Override // kotlinx.coroutines.flow.f
                    public /* bridge */ /* synthetic */ Object emit(Boolean bool, d dVar) {
                        return emit(bool.booleanValue(), dVar);
                    }

                    public final Object emit(boolean z11, d<? super b0> dVar) {
                        String continueMandateText;
                        USBankAccountFormViewModel viewModel2;
                        USBankAccountFormFragment uSBankAccountFormFragment2 = USBankAccountFormFragment.this;
                        if (z11) {
                            int i12 = R.string.stripe_paymentsheet_ach_save_mandate;
                            viewModel2 = uSBankAccountFormFragment2.getViewModel();
                            continueMandateText = uSBankAccountFormFragment2.getString(i12, viewModel2.formattedMerchantName());
                        } else {
                            ACHText aCHText = ACHText.INSTANCE;
                            Context requireContext = uSBankAccountFormFragment2.requireContext();
                            s.f(requireContext, "requireContext()");
                            continueMandateText = aCHText.getContinueMandateText(requireContext);
                        }
                        uSBankAccountFormFragment2.updateMandateText(continueMandateText);
                        return b0.f54756a;
                    }
                };
                this.label = 1;
                if (saveForFutureUse.collect(fVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                r.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public USBankAccountFormFragment$onCreateView$1$3(USBankAccountFormFragment uSBankAccountFormFragment, d<? super USBankAccountFormFragment$onCreateView$1$3> dVar) {
        super(2, dVar);
        this.this$0 = uSBankAccountFormFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new USBankAccountFormFragment$onCreateView$1$3(this.this$0, dVar);
    }

    @Override // h00.p
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo160invoke(o0 o0Var, d<? super b0> dVar) {
        return ((USBankAccountFormFragment$onCreateView$1$3) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
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