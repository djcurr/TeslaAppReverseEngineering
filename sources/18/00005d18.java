package com.stripe.android.view;

import android.content.Context;
import android.view.LayoutInflater;
import com.stripe.android.databinding.AddressWidgetBinding;

/* loaded from: classes6.dex */
final class ShippingInfoWidget$viewBinding$2 extends kotlin.jvm.internal.u implements h00.a<AddressWidgetBinding> {
    final /* synthetic */ Context $context;
    final /* synthetic */ ShippingInfoWidget this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingInfoWidget$viewBinding$2(Context context, ShippingInfoWidget shippingInfoWidget) {
        super(0);
        this.$context = context;
        this.this$0 = shippingInfoWidget;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final AddressWidgetBinding invoke() {
        AddressWidgetBinding inflate = AddressWidgetBinding.inflate(LayoutInflater.from(this.$context), this.this$0);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n            Lay…           this\n        )");
        return inflate;
    }
}