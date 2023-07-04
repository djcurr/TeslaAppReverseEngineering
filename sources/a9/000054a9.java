package com.stripe.android.paymentsheet;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.p;
import com.stripe.android.link.ui.inline.UserInput;
import com.stripe.android.paymentsheet.databinding.FragmentPaymentsheetAddPaymentMethodBinding;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.ui.PrimaryButton;
import h00.r;
import v20.o0;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment$onViewCreated$3", f = "BaseAddPaymentMethodFragment.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BaseAddPaymentMethodFragment$onViewCreated$3 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {
    int label;
    final /* synthetic */ BaseAddPaymentMethodFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment$onViewCreated$3$1", f = "BaseAddPaymentMethodFragment.kt", l = {117}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment$onViewCreated$3$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {
        int label;
        final /* synthetic */ BaseAddPaymentMethodFragment this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment$onViewCreated$3$1$1", f = "BaseAddPaymentMethodFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment$onViewCreated$3$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C03761 extends kotlin.coroutines.jvm.internal.l implements r<Boolean, UserInput, PaymentSelection, zz.d<? super PrimaryButton.UIState>, Object> {
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ BaseAddPaymentMethodFragment this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment$onViewCreated$3$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C03771 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
                final /* synthetic */ UserInput $userInput;
                final /* synthetic */ BaseAddPaymentMethodFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C03771(BaseAddPaymentMethodFragment baseAddPaymentMethodFragment, UserInput userInput) {
                    super(0);
                    this.this$0 = baseAddPaymentMethodFragment;
                    this.$userInput = userInput;
                }

                @Override // h00.a
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
                    invoke2();
                    return vz.b0.f54756a;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.getSheetViewModel().payWithLink(this.$userInput);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03761(BaseAddPaymentMethodFragment baseAddPaymentMethodFragment, zz.d<? super C03761> dVar) {
                super(4, dVar);
                this.this$0 = baseAddPaymentMethodFragment;
            }

            @Override // h00.r
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, UserInput userInput, PaymentSelection paymentSelection, zz.d<? super PrimaryButton.UIState> dVar) {
                return invoke(bool.booleanValue(), userInput, paymentSelection, dVar);
            }

            public final Object invoke(boolean z11, UserInput userInput, PaymentSelection paymentSelection, zz.d<? super PrimaryButton.UIState> dVar) {
                C03761 c03761 = new C03761(this.this$0, dVar);
                c03761.Z$0 = z11;
                c03761.L$0 = userInput;
                c03761.L$1 = paymentSelection;
                return c03761.invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.label == 0) {
                    vz.r.b(obj);
                    boolean z11 = this.Z$0;
                    UserInput userInput = (UserInput) this.L$0;
                    PaymentSelection paymentSelection = (PaymentSelection) this.L$1;
                    if (z11) {
                        if (userInput != null && paymentSelection != null) {
                            return new PrimaryButton.UIState(null, new C03771(this.this$0, userInput), true, true);
                        }
                        return new PrimaryButton.UIState(null, null, false, true);
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BaseAddPaymentMethodFragment baseAddPaymentMethodFragment, zz.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = baseAddPaymentMethodFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // h00.p
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            FragmentPaymentsheetAddPaymentMethodBinding fragmentPaymentsheetAddPaymentMethodBinding;
            FragmentPaymentsheetAddPaymentMethodBinding fragmentPaymentsheetAddPaymentMethodBinding2;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                vz.r.b(obj);
                fragmentPaymentsheetAddPaymentMethodBinding = this.this$0.viewBinding;
                if (fragmentPaymentsheetAddPaymentMethodBinding == null) {
                    kotlin.jvm.internal.s.x("viewBinding");
                    fragmentPaymentsheetAddPaymentMethodBinding = null;
                }
                kotlinx.coroutines.flow.u<Boolean> isSelected = fragmentPaymentsheetAddPaymentMethodBinding.linkInlineSignup.isSelected();
                fragmentPaymentsheetAddPaymentMethodBinding2 = this.this$0.viewBinding;
                if (fragmentPaymentsheetAddPaymentMethodBinding2 == null) {
                    kotlin.jvm.internal.s.x("viewBinding");
                    fragmentPaymentsheetAddPaymentMethodBinding2 = null;
                }
                kotlinx.coroutines.flow.e i12 = kotlinx.coroutines.flow.g.i(isSelected, fragmentPaymentsheetAddPaymentMethodBinding2.linkInlineSignup.getUserInput(), androidx.lifecycle.l.a(this.this$0.getSheetViewModel().getSelection$paymentsheet_release()), new C03761(this.this$0, null));
                final BaseAddPaymentMethodFragment baseAddPaymentMethodFragment = this.this$0;
                kotlinx.coroutines.flow.f<PrimaryButton.UIState> fVar = new kotlinx.coroutines.flow.f<PrimaryButton.UIState>() { // from class: com.stripe.android.paymentsheet.BaseAddPaymentMethodFragment.onViewCreated.3.1.2
                    @Override // kotlinx.coroutines.flow.f
                    public /* bridge */ /* synthetic */ Object emit(PrimaryButton.UIState uIState, zz.d dVar) {
                        return emit2(uIState, (zz.d<? super vz.b0>) dVar);
                    }

                    /* renamed from: emit  reason: avoid collision after fix types in other method */
                    public final Object emit2(PrimaryButton.UIState uIState, zz.d<? super vz.b0> dVar) {
                        boolean z11;
                        z11 = BaseAddPaymentMethodFragment.this.showLinkInlineSignup;
                        if (z11) {
                            BaseAddPaymentMethodFragment.this.getSheetViewModel().updatePrimaryButtonUIState(uIState);
                        }
                        return vz.b0.f54756a;
                    }
                };
                this.label = 1;
                if (i12.collect(fVar, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAddPaymentMethodFragment$onViewCreated$3(BaseAddPaymentMethodFragment baseAddPaymentMethodFragment, zz.d<? super BaseAddPaymentMethodFragment$onViewCreated$3> dVar) {
        super(2, dVar);
        this.this$0 = baseAddPaymentMethodFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new BaseAddPaymentMethodFragment$onViewCreated$3(this.this$0, dVar);
    }

    @Override // h00.p
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo160invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
        return ((BaseAddPaymentMethodFragment$onViewCreated$3) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            vz.r.b(obj);
            androidx.lifecycle.v viewLifecycleOwner = this.this$0.getViewLifecycleOwner();
            kotlin.jvm.internal.s.f(viewLifecycleOwner, "viewLifecycleOwner");
            p.c cVar = p.c.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.b(viewLifecycleOwner, cVar, anonymousClass1, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            vz.r.b(obj);
        }
        return vz.b0.f54756a;
    }
}