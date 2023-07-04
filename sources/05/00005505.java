package com.stripe.android.paymentsheet;

import android.content.res.Resources;
import com.stripe.android.paymentsheet.PaymentOptionsAdapter;
import com.stripe.android.ui.core.PaymentsThemeKt;

/* loaded from: classes6.dex */
final class PaymentOptionsAdapter$GooglePayViewHolder$bind$1 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ int $position;
    final /* synthetic */ PaymentOptionsAdapter.GooglePayViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsAdapter$GooglePayViewHolder$bind$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
        final /* synthetic */ boolean $isEnabled;
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ int $position;
        final /* synthetic */ PaymentOptionsAdapter.GooglePayViewHolder this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsAdapter$GooglePayViewHolder$bind$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C03791 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
            final /* synthetic */ int $position;
            final /* synthetic */ PaymentOptionsAdapter.GooglePayViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03791(PaymentOptionsAdapter.GooglePayViewHolder googlePayViewHolder, int i11) {
                super(0);
                this.this$0 = googlePayViewHolder;
                this.$position = i11;
            }

            @Override // h00.a
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
                invoke2();
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                h00.p pVar;
                pVar = this.this$0.onItemSelectedListener;
                pVar.mo160invoke(Integer.valueOf(this.$position), Boolean.TRUE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PaymentOptionsAdapter.GooglePayViewHolder googlePayViewHolder, boolean z11, boolean z12, int i11) {
            super(2);
            this.this$0 = googlePayViewHolder;
            this.$isSelected = z11;
            this.$isEnabled = z12;
            this.$position = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            float f11;
            if (((i11 & 11) ^ 2) != 0 || !iVar.i()) {
                f11 = this.this$0.width;
                int i12 = R.drawable.stripe_google_pay_mark;
                Resources resources = this.this$0.itemView.getResources();
                int i13 = R.string.google_pay;
                String string = resources.getString(i13);
                String string2 = this.this$0.itemView.getResources().getString(i13);
                boolean z11 = this.$isSelected;
                boolean z12 = this.$isEnabled;
                kotlin.jvm.internal.s.f(string, "getString(R.string.google_pay)");
                kotlin.jvm.internal.s.f(string2, "getString(R.string.google_pay)");
                PaymentOptionsAdapterKt.m310PaymentOptionUiWtlUe4I(f11, z11, false, z12, i12, null, string, null, string2, null, null, new C03791(this.this$0, this.$position), iVar, 384, 0, 1696);
                return;
            }
            iVar.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAdapter$GooglePayViewHolder$bind$1(PaymentOptionsAdapter.GooglePayViewHolder googlePayViewHolder, boolean z11, boolean z12, int i11) {
        super(2);
        this.this$0 = googlePayViewHolder;
        this.$isSelected = z11;
        this.$isEnabled = z12;
        this.$position = i11;
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
            PaymentsThemeKt.PaymentsTheme(null, null, null, j1.c.b(iVar, -819910692, true, new AnonymousClass1(this.this$0, this.$isSelected, this.$isEnabled, this.$position)), iVar, 3072, 7);
        }
    }
}