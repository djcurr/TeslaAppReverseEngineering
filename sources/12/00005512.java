package com.stripe.android.paymentsheet;

import android.content.res.Resources;
import com.stripe.android.paymentsheet.PaymentOptionsAdapter;
import com.stripe.android.paymentsheet.ui.PaymentMethodsUiExtensionKt;
import com.stripe.android.ui.core.PaymentsThemeKt;

/* loaded from: classes6.dex */
final class PaymentOptionsAdapter$SavedPaymentMethodViewHolder$bind$1 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
    final /* synthetic */ boolean $isEditing;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ PaymentOptionsAdapter.Item $item;
    final /* synthetic */ Integer $labelIcon;
    final /* synthetic */ String $labelText;
    final /* synthetic */ int $position;
    final /* synthetic */ String $removeTitle;
    final /* synthetic */ PaymentOptionsAdapter.Item.SavedPaymentMethod $savedPaymentMethod;
    final /* synthetic */ PaymentOptionsAdapter.SavedPaymentMethodViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsAdapter$SavedPaymentMethodViewHolder$bind$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
        final /* synthetic */ boolean $isEditing;
        final /* synthetic */ boolean $isEnabled;
        final /* synthetic */ boolean $isSelected;
        final /* synthetic */ PaymentOptionsAdapter.Item $item;
        final /* synthetic */ Integer $labelIcon;
        final /* synthetic */ String $labelText;
        final /* synthetic */ int $position;
        final /* synthetic */ String $removeTitle;
        final /* synthetic */ PaymentOptionsAdapter.Item.SavedPaymentMethod $savedPaymentMethod;
        final /* synthetic */ PaymentOptionsAdapter.SavedPaymentMethodViewHolder this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsAdapter$SavedPaymentMethodViewHolder$bind$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C03801 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
            final /* synthetic */ int $position;
            final /* synthetic */ PaymentOptionsAdapter.SavedPaymentMethodViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03801(PaymentOptionsAdapter.SavedPaymentMethodViewHolder savedPaymentMethodViewHolder, int i11) {
                super(0);
                this.this$0 = savedPaymentMethodViewHolder;
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
                h00.l lVar;
                lVar = this.this$0.onRemoveListener;
                lVar.mo12invoke(Integer.valueOf(this.$position));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.paymentsheet.PaymentOptionsAdapter$SavedPaymentMethodViewHolder$bind$1$1$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass2 extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
            final /* synthetic */ int $position;
            final /* synthetic */ PaymentOptionsAdapter.SavedPaymentMethodViewHolder this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PaymentOptionsAdapter.SavedPaymentMethodViewHolder savedPaymentMethodViewHolder, int i11) {
                super(0);
                this.this$0 = savedPaymentMethodViewHolder;
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
        AnonymousClass1(PaymentOptionsAdapter.SavedPaymentMethodViewHolder savedPaymentMethodViewHolder, PaymentOptionsAdapter.Item.SavedPaymentMethod savedPaymentMethod, PaymentOptionsAdapter.Item item, boolean z11, boolean z12, boolean z13, Integer num, String str, String str2, int i11) {
            super(2);
            this.this$0 = savedPaymentMethodViewHolder;
            this.$savedPaymentMethod = savedPaymentMethod;
            this.$item = item;
            this.$isSelected = z11;
            this.$isEditing = z12;
            this.$isEnabled = z13;
            this.$labelIcon = num;
            this.$labelText = str;
            this.$removeTitle = str2;
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
                Integer savedPaymentMethodIcon = PaymentMethodsUiExtensionKt.getSavedPaymentMethodIcon(this.$savedPaymentMethod.getPaymentMethod());
                int intValue = savedPaymentMethodIcon == null ? 0 : savedPaymentMethodIcon.intValue();
                Resources resources = this.this$0.itemView.getResources();
                kotlin.jvm.internal.s.f(resources, "itemView.resources");
                String description = ((PaymentOptionsAdapter.Item.SavedPaymentMethod) this.$item).getDescription(resources);
                PaymentOptionsAdapter.Item.SavedPaymentMethod savedPaymentMethod = this.$savedPaymentMethod;
                Resources resources2 = this.this$0.itemView.getResources();
                kotlin.jvm.internal.s.f(resources2, "itemView.resources");
                PaymentOptionsAdapterKt.m310PaymentOptionUiWtlUe4I(f11, this.$isSelected, this.$isEditing, this.$isEnabled, intValue, this.$labelIcon, this.$labelText, this.$removeTitle, description, new C03801(this.this$0, this.$position), savedPaymentMethod.getRemoveDescription(resources2), new AnonymousClass2(this.this$0, this.$position), iVar, 0, 0, 0);
                return;
            }
            iVar.G();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAdapter$SavedPaymentMethodViewHolder$bind$1(PaymentOptionsAdapter.SavedPaymentMethodViewHolder savedPaymentMethodViewHolder, PaymentOptionsAdapter.Item.SavedPaymentMethod savedPaymentMethod, PaymentOptionsAdapter.Item item, boolean z11, boolean z12, boolean z13, Integer num, String str, String str2, int i11) {
        super(2);
        this.this$0 = savedPaymentMethodViewHolder;
        this.$savedPaymentMethod = savedPaymentMethod;
        this.$item = item;
        this.$isSelected = z11;
        this.$isEditing = z12;
        this.$isEnabled = z13;
        this.$labelIcon = num;
        this.$labelText = str;
        this.$removeTitle = str2;
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
            PaymentsThemeKt.PaymentsTheme(null, null, null, j1.c.b(iVar, -819898943, true, new AnonymousClass1(this.this$0, this.$savedPaymentMethod, this.$item, this.$isSelected, this.$isEditing, this.$isEnabled, this.$labelIcon, this.$labelText, this.$removeTitle, this.$position)), iVar, 3072, 7);
        }
    }
}