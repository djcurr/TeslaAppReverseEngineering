package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.model.PaymentMethod;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.a2;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$removePaymentMethod$1", f = "BaseSheetViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BaseSheetViewModel$removePaymentMethod$1 extends l implements p<o0, d<? super a2>, Object> {
    final /* synthetic */ PaymentMethod $paymentMethod;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BaseSheetViewModel<TransitionTargetType> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$removePaymentMethod$1$1", f = "BaseSheetViewModel.kt", l = {408}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$removePaymentMethod$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        final /* synthetic */ PaymentMethod $paymentMethod;
        Object L$0;
        int label;
        final /* synthetic */ BaseSheetViewModel<TransitionTargetType> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaymentMethod paymentMethod, BaseSheetViewModel<TransitionTargetType> baseSheetViewModel, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$paymentMethod = paymentMethod;
            this.this$0 = baseSheetViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.$paymentMethod, this.this$0, dVar);
        }

        @Override // h00.p
        public final Object mo160invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
            if (r11 == true) goto L9;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b4  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = a00.b.d()
                int r1 = r10.label
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 != r3) goto L14
                java.lang.Object r0 = r10.L$0
                com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel r0 = (com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel) r0
                vz.r.b(r11)
                goto L7a
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1c:
                vz.r.b(r11)
                com.stripe.android.model.PaymentMethod r11 = r10.$paymentMethod
                java.lang.String r11 = r11.f20932id
                if (r11 != 0) goto L27
                goto Ld3
            L27:
                com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel<TransitionTargetType> r1 = r10.this$0
                androidx.lifecycle.l0 r4 = r1.getSavedStateHandle()
                androidx.lifecycle.f0 r5 = r1.get_paymentMethods$paymentsheet_release()
                java.lang.Object r5 = r5.getValue()
                java.util.List r5 = (java.util.List) r5
                if (r5 != 0) goto L3b
                r6 = r2
                goto L5e
            L3b:
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.Iterator r5 = r5.iterator()
            L44:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L5e
                java.lang.Object r7 = r5.next()
                r8 = r7
                com.stripe.android.model.PaymentMethod r8 = (com.stripe.android.model.PaymentMethod) r8
                java.lang.String r8 = r8.f20932id
                boolean r8 = kotlin.jvm.internal.s.c(r8, r11)
                r8 = r8 ^ r3
                if (r8 == 0) goto L44
                r6.add(r7)
                goto L44
            L5e:
                java.lang.String r5 = "customer_payment_methods"
                r4.h(r5, r6)
                com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration r4 = r1.getCustomerConfig$paymentsheet_release()
                if (r4 != 0) goto L6a
                goto L7d
            L6a:
                com.stripe.android.paymentsheet.repositories.CustomerRepository r5 = r1.getCustomerRepository()
                r10.L$0 = r1
                r10.label = r3
                java.lang.Object r11 = r5.detachPaymentMethod(r4, r11, r10)
                if (r11 != r0) goto L79
                return r0
            L79:
                r0 = r1
            L7a:
                com.stripe.android.model.PaymentMethod r11 = (com.stripe.android.model.PaymentMethod) r11
                r1 = r0
            L7d:
                androidx.lifecycle.f0 r11 = r1.get_paymentMethods$paymentsheet_release()
                java.lang.Object r11 = r11.getValue()
                java.util.List r11 = (java.util.List) r11
                r0 = 0
                if (r11 != 0) goto L8c
            L8a:
                r3 = r0
                goto Lb2
            L8c:
                boolean r4 = r11.isEmpty()
                if (r4 == 0) goto L94
            L92:
                r11 = r3
                goto Lb0
            L94:
                java.util.Iterator r11 = r11.iterator()
            L98:
                boolean r4 = r11.hasNext()
                if (r4 == 0) goto L92
                java.lang.Object r4 = r11.next()
                com.stripe.android.model.PaymentMethod r4 = (com.stripe.android.model.PaymentMethod) r4
                com.stripe.android.model.PaymentMethod$Type r4 = r4.type
                com.stripe.android.model.PaymentMethod$Type r5 = com.stripe.android.model.PaymentMethod.Type.USBankAccount
                if (r4 == r5) goto Lac
                r4 = r3
                goto Lad
            Lac:
                r4 = r0
            Lad:
                if (r4 != 0) goto L98
                r11 = r0
            Lb0:
                if (r11 != r3) goto L8a
            Lb2:
                if (r3 == 0) goto Ld3
                androidx.lifecycle.LiveData r11 = r1.getPrimaryButtonUIState()
                java.lang.Object r11 = r11.getValue()
                r3 = r11
                com.stripe.android.paymentsheet.ui.PrimaryButton$UIState r3 = (com.stripe.android.paymentsheet.ui.PrimaryButton.UIState) r3
                if (r3 != 0) goto Lc3
                r11 = r2
                goto Lcd
            Lc3:
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 7
                r9 = 0
                com.stripe.android.paymentsheet.ui.PrimaryButton$UIState r11 = com.stripe.android.paymentsheet.ui.PrimaryButton.UIState.copy$default(r3, r4, r5, r6, r7, r8, r9)
            Lcd:
                r1.updatePrimaryButtonUIState(r11)
                r1.updateBelowButtonText(r2)
            Ld3:
                vz.b0 r11 = vz.b0.f54756a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$removePaymentMethod$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel$removePaymentMethod$1(PaymentMethod paymentMethod, BaseSheetViewModel<TransitionTargetType> baseSheetViewModel, d<? super BaseSheetViewModel$removePaymentMethod$1> dVar) {
        super(2, dVar);
        this.$paymentMethod = paymentMethod;
        this.this$0 = baseSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        BaseSheetViewModel$removePaymentMethod$1 baseSheetViewModel$removePaymentMethod$1 = new BaseSheetViewModel$removePaymentMethod$1(this.$paymentMethod, this.this$0, dVar);
        baseSheetViewModel$removePaymentMethod$1.L$0 = obj;
        return baseSheetViewModel$removePaymentMethod$1;
    }

    @Override // h00.p
    public final Object mo160invoke(o0 o0Var, d<? super a2> dVar) {
        return ((BaseSheetViewModel$removePaymentMethod$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a2 d11;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            d11 = k.d((o0) this.L$0, null, null, new AnonymousClass1(this.$paymentMethod, this.this$0, null), 3, null);
            return d11;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}