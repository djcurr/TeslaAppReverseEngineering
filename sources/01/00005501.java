package com.stripe.android.paymentsheet;

import com.stripe.android.paymentsheet.PaymentOptionsAdapter;
import com.stripe.android.ui.core.PaymentsThemeKt;
import y0.h0;

/* loaded from: classes6.dex */
final class PaymentOptionsAdapter$AddNewPaymentMethodViewHolder$bind$1 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ PaymentOptionsAdapter.AddNewPaymentMethodViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsAdapter$AddNewPaymentMethodViewHolder$bind$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
        final /* synthetic */ boolean $isEnabled;
        final /* synthetic */ PaymentOptionsAdapter.AddNewPaymentMethodViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaymentOptionsAdapter.AddNewPaymentMethodViewHolder addNewPaymentMethodViewHolder, boolean z11) {
            super(2);
            this.this$0 = addNewPaymentMethodViewHolder;
            this.$isEnabled = z11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            int i12;
            float f11;
            h00.a aVar;
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            if (PaymentsThemeKt.m396shouldUseDarkDynamicColor8_81llA(PaymentsThemeKt.getPaymentsColors(h0.f58131a, iVar, 8).m381getComponent0d7_KjU())) {
                i12 = R.drawable.stripe_ic_paymentsheet_add_dark;
            } else {
                i12 = R.drawable.stripe_ic_paymentsheet_add_light;
            }
            f11 = this.this$0.width;
            String string = this.this$0.itemView.getResources().getString(R.string.stripe_paymentsheet_add_payment_method_button_label);
            aVar = this.this$0.onItemSelectedListener;
            String string2 = this.this$0.itemView.getResources().getString(R.string.add_new_payment_method);
            boolean z11 = this.$isEnabled;
            kotlin.jvm.internal.s.f(string, "getString(\n             …                        )");
            kotlin.jvm.internal.s.f(string2, "getString(R.string.add_new_payment_method)");
            PaymentOptionsAdapterKt.m310PaymentOptionUiWtlUe4I(f11, false, false, z11, i12, null, string, null, string2, null, null, aVar, iVar, 432, 0, 1696);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAdapter$AddNewPaymentMethodViewHolder$bind$1(PaymentOptionsAdapter.AddNewPaymentMethodViewHolder addNewPaymentMethodViewHolder, boolean z11) {
        super(2);
        this.this$0 = addNewPaymentMethodViewHolder;
        this.$isEnabled = z11;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
        } else {
            PaymentsThemeKt.PaymentsTheme(null, null, null, j1.c.b(iVar, -819896460, true, new AnonymousClass1(this.this$0, this.$isEnabled)), iVar, 3072, 7);
        }
    }
}