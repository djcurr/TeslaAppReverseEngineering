package com.stripe.android.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.stripe.android.R;
import com.stripe.android.databinding.MaskedCardViewBinding;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class MaskedCardView extends LinearLayout {
    private CardBrand cardBrand;
    private final CardDisplayTextFactory cardDisplayFactory;
    private String last4;
    private final ThemeConfig themeConfig;
    private final MaskedCardViewBinding viewBinding;

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardBrand.values().length];
            iArr[CardBrand.AmericanExpress.ordinal()] = 1;
            iArr[CardBrand.Discover.ordinal()] = 2;
            iArr[CardBrand.JCB.ordinal()] = 3;
            iArr[CardBrand.DinersClub.ordinal()] = 4;
            iArr[CardBrand.Visa.ordinal()] = 5;
            iArr[CardBrand.MasterCard.ordinal()] = 6;
            iArr[CardBrand.UnionPay.ordinal()] = 7;
            iArr[CardBrand.Unknown.ordinal()] = 8;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ MaskedCardView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void applyTint(ImageView imageView) {
        androidx.core.widget.i.c(imageView, ColorStateList.valueOf(this.themeConfig.getTintColor$payments_core_release(true)));
    }

    private final void updateBrandIcon() {
        int i11;
        AppCompatImageView appCompatImageView = this.viewBinding.brandIcon;
        Context context = getContext();
        switch (WhenMappings.$EnumSwitchMapping$0[this.cardBrand.ordinal()]) {
            case 1:
                i11 = R.drawable.stripe_ic_amex_template_32;
                break;
            case 2:
                i11 = R.drawable.stripe_ic_discover_template_32;
                break;
            case 3:
                i11 = R.drawable.stripe_ic_jcb_template_32;
                break;
            case 4:
                i11 = R.drawable.stripe_ic_diners_template_32;
                break;
            case 5:
                i11 = R.drawable.stripe_ic_visa_template_32;
                break;
            case 6:
                i11 = R.drawable.stripe_ic_mastercard_template_32;
                break;
            case 7:
                i11 = R.drawable.stripe_ic_unionpay_template_32;
                break;
            case 8:
                i11 = R.drawable.stripe_ic_unknown;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageDrawable(androidx.core.content.b.getDrawable(context, i11));
    }

    private final void updateCheckMark() {
        this.viewBinding.checkIcon.setVisibility(isSelected() ? 0 : 4);
    }

    private final void updateUi() {
        updateBrandIcon();
        this.viewBinding.details.setText(this.cardDisplayFactory.createStyled$payments_core_release(this.cardBrand, this.last4, isSelected()));
    }

    public final CardBrand getCardBrand() {
        return this.cardBrand;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final MaskedCardViewBinding getViewBinding$payments_core_release() {
        return this.viewBinding;
    }

    public final void setPaymentMethod(PaymentMethod paymentMethod) {
        kotlin.jvm.internal.s.g(paymentMethod, "paymentMethod");
        PaymentMethod.Card card = paymentMethod.card;
        CardBrand cardBrand = card == null ? null : card.brand;
        if (cardBrand == null) {
            cardBrand = CardBrand.Unknown;
        }
        this.cardBrand = cardBrand;
        this.last4 = card != null ? card.last4 : null;
        updateUi();
    }

    @Override // android.view.View
    public void setSelected(boolean z11) {
        super.setSelected(z11);
        updateCheckMark();
        updateUi();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaskedCardView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        this.cardBrand = CardBrand.Unknown;
        MaskedCardViewBinding inflate = MaskedCardViewBinding.inflate(LayoutInflater.from(context), this);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        ThemeConfig themeConfig = new ThemeConfig(context);
        this.themeConfig = themeConfig;
        Resources resources = getResources();
        kotlin.jvm.internal.s.f(resources, "resources");
        this.cardDisplayFactory = new CardDisplayTextFactory(resources, themeConfig);
        AppCompatImageView appCompatImageView = inflate.brandIcon;
        kotlin.jvm.internal.s.f(appCompatImageView, "viewBinding.brandIcon");
        applyTint(appCompatImageView);
        AppCompatImageView appCompatImageView2 = inflate.checkIcon;
        kotlin.jvm.internal.s.f(appCompatImageView2, "viewBinding.checkIcon");
        applyTint(appCompatImageView2);
    }
}