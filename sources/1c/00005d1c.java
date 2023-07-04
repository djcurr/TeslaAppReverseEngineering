package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.stripe.android.R;
import com.stripe.android.databinding.ShippingMethodViewBinding;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.view.StripeColorUtils;
import java.util.Currency;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class ShippingMethodView extends RelativeLayout {
    private final StripeColorUtils colorUtils;
    private final int selectedColorInt;
    private final int unselectedTextColorPrimaryInt;
    private final int unselectedTextColorSecondaryInt;
    private final ShippingMethodViewBinding viewBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingMethodView(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingMethodView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ ShippingMethodView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @Override // android.view.View
    public void setSelected(boolean z11) {
        if (z11) {
            this.viewBinding.name.setTextColor(this.selectedColorInt);
            this.viewBinding.description.setTextColor(this.selectedColorInt);
            this.viewBinding.price.setTextColor(this.selectedColorInt);
            this.viewBinding.selectedIcon.setVisibility(0);
            return;
        }
        this.viewBinding.name.setTextColor(this.unselectedTextColorPrimaryInt);
        this.viewBinding.description.setTextColor(this.unselectedTextColorSecondaryInt);
        this.viewBinding.price.setTextColor(this.unselectedTextColorPrimaryInt);
        this.viewBinding.selectedIcon.setVisibility(4);
    }

    public final void setShippingMethod(ShippingMethod shippingMethod) {
        kotlin.jvm.internal.s.g(shippingMethod, "shippingMethod");
        this.viewBinding.name.setText(shippingMethod.getLabel());
        this.viewBinding.description.setText(shippingMethod.getDetail());
        TextView textView = this.viewBinding.price;
        long amount = shippingMethod.getAmount();
        Currency currency = shippingMethod.getCurrency();
        String string = getContext().getString(R.string.price_free);
        kotlin.jvm.internal.s.f(string, "context.getString(R.string.price_free)");
        textView.setText(PaymentUtils.formatPriceStringUsingFree(amount, currency, string));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShippingMethodView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        StripeColorUtils stripeColorUtils = new StripeColorUtils(context);
        this.colorUtils = stripeColorUtils;
        ShippingMethodViewBinding inflate = ShippingMethodViewBinding.inflate(LayoutInflater.from(context), this);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        int colorAccent = stripeColorUtils.getColorAccent();
        int textColorPrimary = stripeColorUtils.getTextColorPrimary();
        int textColorSecondary = stripeColorUtils.getTextColorSecondary();
        StripeColorUtils.Companion companion = StripeColorUtils.Companion;
        this.selectedColorInt = companion.isColorTransparent(colorAccent) ? androidx.core.content.b.getColor(context, R.color.stripe_accent_color_default) : colorAccent;
        this.unselectedTextColorPrimaryInt = companion.isColorTransparent(textColorPrimary) ? androidx.core.content.b.getColor(context, R.color.stripe_color_text_unselected_primary_default) : textColorPrimary;
        this.unselectedTextColorSecondaryInt = companion.isColorTransparent(textColorSecondary) ? androidx.core.content.b.getColor(context, R.color.stripe_color_text_unselected_secondary_default) : textColorSecondary;
    }
}