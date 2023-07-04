package com.stripe.android.paymentsheet.paymentdatacollection.ach;

import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.p;
import androidx.lifecycle.v;
import com.stripe.android.paymentsheet.PaymentSheetViewModel;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormScreenState;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import h00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.h0;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$4", f = "USBankAccountFormFragment.kt", l = {204}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class USBankAccountFormFragment$onCreateView$1$4 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ ComposeView $this_apply;
    int label;
    final /* synthetic */ USBankAccountFormFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$4$1", f = "USBankAccountFormFragment.kt", l = {205}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment$onCreateView$1$4$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        final /* synthetic */ ComposeView $this_apply;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ USBankAccountFormFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(USBankAccountFormFragment uSBankAccountFormFragment, ComposeView composeView, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = uSBankAccountFormFragment;
            this.$this_apply = composeView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
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
                final o0 o0Var = (o0) this.L$0;
                viewModel = this.this$0.getViewModel();
                h0<USBankAccountFormScreenState> currentScreenState = viewModel.getCurrentScreenState();
                final USBankAccountFormFragment uSBankAccountFormFragment = this.this$0;
                final ComposeView composeView = this.$this_apply;
                kotlinx.coroutines.flow.f<USBankAccountFormScreenState> fVar = new kotlinx.coroutines.flow.f<USBankAccountFormScreenState>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ach.USBankAccountFormFragment.onCreateView.1.4.1.1
                    @Override // kotlinx.coroutines.flow.f
                    public /* bridge */ /* synthetic */ Object emit(USBankAccountFormScreenState uSBankAccountFormScreenState, d dVar) {
                        return emit2(uSBankAccountFormScreenState, (d<? super b0>) dVar);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(USBankAccountFormScreenState uSBankAccountFormScreenState, d<? super b0> dVar) {
                        BaseSheetViewModel sheetViewModel;
                        BaseSheetViewModel sheetViewModel2;
                        BaseSheetViewModel sheetViewModel3;
                        BaseSheetViewModel sheetViewModel4;
                        Object d12;
                        USBankAccountFormViewModel viewModel2;
                        BaseSheetViewModel sheetViewModel5;
                        Object d13;
                        Object renderNameAndEmailCollectionScreen;
                        Object d14;
                        sheetViewModel = USBankAccountFormFragment.this.getSheetViewModel();
                        if (sheetViewModel != null) {
                            sheetViewModel.onError(uSBankAccountFormScreenState.getError());
                        }
                        if (uSBankAccountFormScreenState instanceof USBankAccountFormScreenState.NameAndEmailCollection) {
                            renderNameAndEmailCollectionScreen = USBankAccountFormFragment.this.renderNameAndEmailCollectionScreen(composeView, (USBankAccountFormScreenState.NameAndEmailCollection) uSBankAccountFormScreenState, o0Var, dVar);
                            d14 = a00.d.d();
                            return renderNameAndEmailCollectionScreen == d14 ? renderNameAndEmailCollectionScreen : b0.f54756a;
                        }
                        if (uSBankAccountFormScreenState instanceof USBankAccountFormScreenState.MandateCollection) {
                            USBankAccountFormFragment.this.renderMandateCollectionScreen(composeView, (USBankAccountFormScreenState.MandateCollection) uSBankAccountFormScreenState);
                        } else if (uSBankAccountFormScreenState instanceof USBankAccountFormScreenState.VerifyWithMicrodeposits) {
                            USBankAccountFormFragment.this.renderVerifyWithMicrodepositsScreen(composeView, (USBankAccountFormScreenState.VerifyWithMicrodeposits) uSBankAccountFormScreenState);
                        } else if (uSBankAccountFormScreenState instanceof USBankAccountFormScreenState.SavedAccount) {
                            USBankAccountFormFragment.this.renderSavedAccountScreen(composeView, (USBankAccountFormScreenState.SavedAccount) uSBankAccountFormScreenState);
                        } else {
                            b0 b0Var = null;
                            if (uSBankAccountFormScreenState instanceof USBankAccountFormScreenState.ConfirmIntent) {
                                sheetViewModel5 = USBankAccountFormFragment.this.getSheetViewModel();
                                PaymentSheetViewModel paymentSheetViewModel = sheetViewModel5 instanceof PaymentSheetViewModel ? (PaymentSheetViewModel) sheetViewModel5 : null;
                                if (paymentSheetViewModel != null) {
                                    paymentSheetViewModel.confirmStripeIntent(((USBankAccountFormScreenState.ConfirmIntent) uSBankAccountFormScreenState).getConfirmIntentParams());
                                    b0Var = b0.f54756a;
                                }
                                d13 = a00.d.d();
                                if (b0Var == d13) {
                                    return b0Var;
                                }
                            } else if (uSBankAccountFormScreenState instanceof USBankAccountFormScreenState.Finished) {
                                sheetViewModel2 = USBankAccountFormFragment.this.getSheetViewModel();
                                if (sheetViewModel2 != null) {
                                    sheetViewModel2.updateSelection(((USBankAccountFormScreenState.Finished) uSBankAccountFormScreenState).getPaymentSelection());
                                }
                                sheetViewModel3 = USBankAccountFormFragment.this.getSheetViewModel();
                                if (sheetViewModel3 != null) {
                                    viewModel2 = USBankAccountFormFragment.this.getViewModel();
                                    sheetViewModel3.setUsBankAccountSavedScreenState(viewModel2.generateSavedState(uSBankAccountFormScreenState));
                                }
                                sheetViewModel4 = USBankAccountFormFragment.this.getSheetViewModel();
                                if (sheetViewModel4 != null) {
                                    sheetViewModel4.onFinish();
                                    b0Var = b0.f54756a;
                                }
                                d12 = a00.d.d();
                                if (b0Var == d12) {
                                    return b0Var;
                                }
                            }
                        }
                        return b0.f54756a;
                    }
                };
                this.label = 1;
                if (currentScreenState.collect(fVar, this) == d11) {
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
    public USBankAccountFormFragment$onCreateView$1$4(USBankAccountFormFragment uSBankAccountFormFragment, ComposeView composeView, d<? super USBankAccountFormFragment$onCreateView$1$4> dVar) {
        super(2, dVar);
        this.this$0 = uSBankAccountFormFragment;
        this.$this_apply = composeView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new USBankAccountFormFragment$onCreateView$1$4(this.this$0, this.$this_apply, dVar);
    }

    @Override // h00.p
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo160invoke(o0 o0Var, d<? super b0> dVar) {
        return ((USBankAccountFormFragment$onCreateView$1$4) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$this_apply, null);
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