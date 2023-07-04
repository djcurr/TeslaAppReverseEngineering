package com.stripe.android.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.stripe.android.databinding.CardBrandViewBinding;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class CardBrandView extends FrameLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardBrandView.class, "isLoading", "isLoading()Z", 0)), kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardBrandView.class, AccountRangeJsonParser.FIELD_BRAND, "getBrand()Lcom/stripe/android/model/CardBrand;", 0)), kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardBrandView.class, "shouldShowCvc", "getShouldShowCvc()Z", 0)), kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardBrandView.class, "shouldShowErrorIcon", "getShouldShowErrorIcon()Z", 0))};
    private final kotlin.properties.c brand$delegate;
    private final ImageView iconView;
    private final kotlin.properties.c isLoading$delegate;
    private final CardWidgetProgressView progressView;
    private final kotlin.properties.c shouldShowCvc$delegate;
    private final kotlin.properties.c shouldShowErrorIcon$delegate;
    private int tintColorInt;
    private final CardBrandViewBinding viewBinding;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ CardBrandView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static final /* synthetic */ CardWidgetProgressView access$getProgressView$p(CardBrandView cardBrandView) {
        return cardBrandView.progressView;
    }

    public static final /* synthetic */ void access$updateIcon(CardBrandView cardBrandView) {
        cardBrandView.updateIcon();
    }

    private final void applyTint() {
        ImageView imageView = this.iconView;
        Drawable r11 = n3.a.r(imageView.getDrawable());
        n3.a.n(r11.mutate(), getTintColorInt$payments_core_release());
        imageView.setImageDrawable(n3.a.q(r11));
    }

    private final void renderBrandIcon() {
        this.iconView.setImageResource(getBrand().getIcon());
        if (getBrand() == CardBrand.Unknown) {
            applyTint();
        }
    }

    public final void updateIcon() {
        if (isLoading()) {
            renderBrandIcon();
        } else if (getShouldShowErrorIcon()) {
            this.iconView.setImageResource(getBrand().getErrorIcon());
        } else if (getShouldShowCvc()) {
            this.iconView.setImageResource(getBrand().getCvcIcon());
            applyTint();
        } else {
            renderBrandIcon();
        }
    }

    public final CardBrand getBrand() {
        return (CardBrand) this.brand$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final boolean getShouldShowCvc() {
        return ((Boolean) this.shouldShowCvc$delegate.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    public final boolean getShouldShowErrorIcon() {
        return ((Boolean) this.shouldShowErrorIcon$delegate.getValue(this, $$delegatedProperties[3])).booleanValue();
    }

    public final int getTintColorInt$payments_core_release() {
        return this.tintColorInt;
    }

    public final boolean isLoading() {
        return ((Boolean) this.isLoading$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setBrand(CardBrand cardBrand) {
        kotlin.jvm.internal.s.g(cardBrand, "<set-?>");
        this.brand$delegate.setValue(this, $$delegatedProperties[1], cardBrand);
    }

    public final void setLoading(boolean z11) {
        this.isLoading$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z11));
    }

    public final void setShouldShowCvc(boolean z11) {
        this.shouldShowCvc$delegate.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z11));
    }

    public final void setShouldShowErrorIcon(boolean z11) {
        this.shouldShowErrorIcon$delegate.setValue(this, $$delegatedProperties[3], Boolean.valueOf(z11));
    }

    public final void setTintColorInt$payments_core_release(int i11) {
        this.tintColorInt = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBrandView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        CardBrandViewBinding inflate = CardBrandViewBinding.inflate(LayoutInflater.from(context), this);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        ImageView imageView = inflate.icon;
        kotlin.jvm.internal.s.f(imageView, "viewBinding.icon");
        this.iconView = imageView;
        CardWidgetProgressView cardWidgetProgressView = inflate.progress;
        kotlin.jvm.internal.s.f(cardWidgetProgressView, "viewBinding.progress");
        this.progressView = cardWidgetProgressView;
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        Boolean bool = Boolean.FALSE;
        this.isLoading$delegate = new kotlin.properties.b<Boolean>(bool) { // from class: com.stripe.android.view.CardBrandView$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, Boolean bool2, Boolean bool3) {
                kotlin.jvm.internal.s.g(property, "property");
                boolean booleanValue = bool3.booleanValue();
                if (bool2.booleanValue() != booleanValue) {
                    CardBrandView.access$updateIcon(this);
                    if (booleanValue) {
                        CardBrandView.access$getProgressView$p(this).show();
                    } else {
                        CardBrandView.access$getProgressView$p(this).hide();
                    }
                }
            }
        };
        this.brand$delegate = new kotlin.properties.b<CardBrand>(CardBrand.Unknown) { // from class: com.stripe.android.view.CardBrandView$special$$inlined$observable$2
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, CardBrand cardBrand, CardBrand cardBrand2) {
                kotlin.jvm.internal.s.g(property, "property");
                if (cardBrand != cardBrand2) {
                    CardBrandView.access$updateIcon(this);
                }
            }
        };
        this.shouldShowCvc$delegate = new kotlin.properties.b<Boolean>(bool) { // from class: com.stripe.android.view.CardBrandView$special$$inlined$observable$3
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, Boolean bool2, Boolean bool3) {
                kotlin.jvm.internal.s.g(property, "property");
                if (bool2.booleanValue() != bool3.booleanValue()) {
                    CardBrandView.access$updateIcon(this);
                }
            }
        };
        this.shouldShowErrorIcon$delegate = new kotlin.properties.b<Boolean>(bool) { // from class: com.stripe.android.view.CardBrandView$special$$inlined$observable$4
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, Boolean bool2, Boolean bool3) {
                kotlin.jvm.internal.s.g(property, "property");
                if (bool2.booleanValue() != bool3.booleanValue()) {
                    CardBrandView.access$updateIcon(this);
                }
            }
        };
        setClickable(false);
        setFocusable(false);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.CardBrandView$special$$inlined$doOnNextLayout$1
            {
                CardBrandView.this = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                kotlin.jvm.internal.s.g(view, "view");
                view.removeOnLayoutChangeListener(this);
                CardBrandView.access$updateIcon(CardBrandView.this);
            }
        });
    }
}