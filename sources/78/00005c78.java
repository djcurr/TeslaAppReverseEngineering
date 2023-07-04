package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public final class CardNumberTextInputLayout extends TextInputLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardNumberTextInputLayout.class, "isLoading", "isLoading$payments_core_release()Z", 0))};
    public static final int $stable = 8;
    private final kotlin.properties.c isLoading$delegate;
    private final CardWidgetProgressView progressView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? R.attr.textInputStyle : i11);
    }

    public static final /* synthetic */ void access$attachProgressView(CardNumberTextInputLayout cardNumberTextInputLayout) {
        cardNumberTextInputLayout.attachProgressView();
    }

    public static final /* synthetic */ CardWidgetProgressView access$getProgressView$p(CardNumberTextInputLayout cardNumberTextInputLayout) {
        return cardNumberTextInputLayout.progressView;
    }

    public final void attachProgressView() {
        ViewParent parent = this.progressView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.progressView);
        }
        FrameLayout frameLayout = (FrameLayout) u20.k.t(androidx.core.view.e0.a(this));
        frameLayout.addView(this.progressView);
        CardWidgetProgressView cardWidgetProgressView = this.progressView;
        ViewGroup.LayoutParams layoutParams = cardWidgetProgressView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.setMarginStart(frameLayout.getWidth() - getResources().getDimensionPixelSize(R.dimen.stripe_card_number_text_input_layout_progress_end_margin));
        layoutParams2.topMargin = getResources().getDimensionPixelSize(R.dimen.stripe_card_number_text_input_layout_progress_top_margin);
        cardWidgetProgressView.setLayoutParams(layoutParams2);
    }

    public final boolean isLoading$payments_core_release() {
        return ((Boolean) this.isLoading$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setLoading$payments_core_release(boolean z11) {
        this.isLoading$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z11));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.s.g(context, "context");
        this.progressView = new CardWidgetProgressView(context, attributeSet, i11);
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        this.isLoading$delegate = new kotlin.properties.b<Boolean>(Boolean.FALSE) { // from class: com.stripe.android.view.CardNumberTextInputLayout$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, Boolean bool, Boolean bool2) {
                kotlin.jvm.internal.s.g(property, "property");
                boolean booleanValue = bool2.booleanValue();
                if (bool.booleanValue() != booleanValue) {
                    if (booleanValue) {
                        CardNumberTextInputLayout.access$getProgressView$p(this).show();
                    } else {
                        CardNumberTextInputLayout.access$getProgressView$p(this).hide();
                    }
                }
            }
        };
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.stripe.android.view.CardNumberTextInputLayout$special$$inlined$doOnNextLayout$1
            {
                CardNumberTextInputLayout.this = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                kotlin.jvm.internal.s.g(view, "view");
                view.removeOnLayoutChangeListener(this);
                CardNumberTextInputLayout.access$attachProgressView(CardNumberTextInputLayout.this);
            }
        });
        setPlaceholderText(getResources().getString(R.string.card_number_hint));
    }
}