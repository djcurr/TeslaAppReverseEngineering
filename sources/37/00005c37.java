package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import com.stripe.android.cards.CardNumber;
import com.stripe.android.cards.Cvc;
import com.stripe.android.databinding.CardInputWidgetBinding;
import com.stripe.android.model.Address;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardParams;
import com.stripe.android.model.ExpirationDate;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.view.CardInputListener;
import com.stripe.android.view.PostalCodeEditText;
import com.stripe.android.view.StripeEditText;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.KProperty;
import okhttp3.internal.http2.Settings;
import wz.x0;
import wz.y0;

/* loaded from: classes6.dex */
public final class CardInputWidget extends LinearLayout implements CardWidget {
    private static final String CVC_PLACEHOLDER_AMEX = "2345";
    private static final String CVC_PLACEHOLDER_COMMON = "CVC";
    private static final String FULL_SIZING_CARD_TEXT = "4242 4242 4242 4242 424";
    private static final String FULL_SIZING_DATE_TEXT = "MM/MM";
    private static final String FULL_SIZING_POSTAL_CODE_TEXT = "1234567890";
    public static final String LOGGING_TOKEN = "CardInputView";
    private static final String STATE_CARD_VIEWED = "state_card_viewed";
    private static final String STATE_POSTAL_CODE_ENABLED = "state_postal_code_enabled";
    private static final String STATE_SUPER_STATE = "state_super_state";
    private final Set<StripeEditText> allFields;
    private final /* synthetic */ CardBrandView cardBrandView;
    private CardInputListener cardInputListener;
    private final /* synthetic */ CardNumberEditText cardNumberEditText;
    private final TextInputLayout cardNumberTextInputLayout;
    private CardValidCallback cardValidCallback;
    private final CardInputWidget$cardValidTextWatcher$1 cardValidTextWatcher;
    private final FrameLayout containerLayout;
    private String customCvcLabel;
    private final /* synthetic */ CvcEditText cvcEditText;
    private final TextInputLayout cvcNumberTextInputLayout;
    private final /* synthetic */ ExpiryDateEditText expiryDateEditText;
    private final TextInputLayout expiryDateTextInputLayout;
    private /* synthetic */ h00.a<Integer> frameWidthSupplier;
    private String hiddenCardText;
    private /* synthetic */ boolean isShowingFullCard;
    private boolean isViewInitialized;
    private /* synthetic */ LayoutWidthCalculator layoutWidthCalculator;
    private final CardInputWidgetPlacement placement;
    private final /* synthetic */ PostalCodeEditText postalCodeEditText;
    private final kotlin.properties.c postalCodeEnabled$delegate;
    private final kotlin.properties.c postalCodeRequired$delegate;
    private final TextInputLayout postalCodeTextInputLayout;
    private final /* synthetic */ Set<StripeEditText> requiredFields;
    private boolean shouldShowErrorIcon;
    private final kotlin.properties.c usZipCodeRequired$delegate;
    private final CardInputWidgetBinding viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardInputWidget.class, "postalCodeEnabled", "getPostalCodeEnabled()Z", 0)), kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardInputWidget.class, "postalCodeRequired", "getPostalCodeRequired()Z", 0)), kotlin.jvm.internal.m0.f(new kotlin.jvm.internal.z(CardInputWidget.class, "usZipCodeRequired", "getUsZipCodeRequired()Z", 0))};
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int DEFAULT_READER_ID = R.id.stripe_default_reader_id;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.CardInputWidget$1 */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.jvm.internal.u implements h00.a<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1() {
            super(0);
            CardInputWidget.this = r1;
        }

        @Override // h00.a
        public final Integer invoke() {
            return Integer.valueOf(CardInputWidget.this.containerLayout.getWidth());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static abstract class AnimationEndListener implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            kotlin.jvm.internal.s.g(animation, "animation");
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            kotlin.jvm.internal.s.g(animation, "animation");
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class CardFieldAnimation extends Animation {
        @Deprecated
        private static final long ANIMATION_LENGTH = 150;
        private static final Companion Companion = new Companion(null);

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public CardFieldAnimation() {
            setDuration(ANIMATION_LENGTH);
        }
    }

    /* loaded from: classes6.dex */
    public static final class CardNumberSlideEndAnimation extends CardFieldAnimation {
        private final View focusOnEndView;
        private final int hiddenCardWidth;
        private final View view;

        public CardNumberSlideEndAnimation(View view, int i11, View focusOnEndView) {
            kotlin.jvm.internal.s.g(view, "view");
            kotlin.jvm.internal.s.g(focusOnEndView, "focusOnEndView");
            this.view = view;
            this.hiddenCardWidth = i11;
            this.focusOnEndView = focusOnEndView;
            setAnimationListener(new AnimationEndListener() { // from class: com.stripe.android.view.CardInputWidget.CardNumberSlideEndAnimation.1
                {
                    CardNumberSlideEndAnimation.this = this;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    kotlin.jvm.internal.s.g(animation, "animation");
                    CardNumberSlideEndAnimation.this.focusOnEndView.requestFocus();
                }
            });
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f11, Transformation t11) {
            kotlin.jvm.internal.s.g(t11, "t");
            super.applyTransformation(f11, t11);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) (this.hiddenCardWidth * (-1.0f) * f11));
            view.setLayoutParams(layoutParams2);
        }
    }

    /* loaded from: classes6.dex */
    public static final class CardNumberSlideStartAnimation extends CardFieldAnimation {
        private final View view;

        public CardNumberSlideStartAnimation(View view) {
            kotlin.jvm.internal.s.g(view, "view");
            this.view = view;
            setAnimationListener(new AnimationEndListener() { // from class: com.stripe.android.view.CardInputWidget.CardNumberSlideStartAnimation.1
                {
                    CardNumberSlideStartAnimation.this = this;
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    kotlin.jvm.internal.s.g(animation, "animation");
                    CardNumberSlideStartAnimation.this.view.requestFocus();
                }
            });
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f11, Transformation t11) {
            kotlin.jvm.internal.s.g(t11, "t");
            super.applyTransformation(f11, t11);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) (layoutParams2.getMarginStart() * (1 - f11)));
            view.setLayoutParams(layoutParams2);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean shouldIconShowBrand$payments_core_release(CardBrand brand, boolean z11, String str) {
            kotlin.jvm.internal.s.g(brand, "brand");
            return !z11 || brand.isMaxCvc(str);
        }
    }

    /* loaded from: classes6.dex */
    public static final class CvcSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startMargin;
        private final View view;

        public CvcSlideEndAnimation(View view, int i11, int i12, int i13) {
            kotlin.jvm.internal.s.g(view, "view");
            this.view = view;
            this.startMargin = i11;
            this.destination = i12;
            this.newWidth = i13;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f11, Transformation t11) {
            kotlin.jvm.internal.s.g(t11, "t");
            super.applyTransformation(f11, t11);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((this.destination * f11) + ((1 - f11) * this.startMargin)));
            layoutParams2.setMarginEnd(0);
            layoutParams2.width = this.newWidth;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* loaded from: classes6.dex */
    public static final class CvcSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startPosition;
        private final View view;

        public CvcSlideStartAnimation(View view, int i11, int i12, int i13) {
            kotlin.jvm.internal.s.g(view, "view");
            this.view = view;
            this.startPosition = i11;
            this.destination = i12;
            this.newWidth = i13;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f11, Transformation t11) {
            kotlin.jvm.internal.s.g(t11, "t");
            super.applyTransformation(f11, t11);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((this.destination * f11) + ((1 - f11) * this.startPosition)));
            layoutParams2.setMarginEnd(0);
            layoutParams2.width = this.newWidth;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* loaded from: classes6.dex */
    public static final class DefaultLayoutWidthCalculator implements LayoutWidthCalculator {
        @Override // com.stripe.android.view.CardInputWidget.LayoutWidthCalculator
        public int calculate(String text, TextPaint paint) {
            kotlin.jvm.internal.s.g(text, "text");
            kotlin.jvm.internal.s.g(paint, "paint");
            return (int) Layout.getDesiredWidth(text, paint);
        }
    }

    /* loaded from: classes6.dex */
    public static final class ExpiryDateSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int startMargin;
        private final View view;

        public ExpiryDateSlideEndAnimation(View view, int i11, int i12) {
            kotlin.jvm.internal.s.g(view, "view");
            this.view = view;
            this.startMargin = i11;
            this.destination = i12;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f11, Transformation t11) {
            kotlin.jvm.internal.s.g(t11, "t");
            super.applyTransformation(f11, t11);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((this.destination * f11) + ((1 - f11) * this.startMargin)));
            view.setLayoutParams(layoutParams2);
        }
    }

    /* loaded from: classes6.dex */
    public static final class ExpiryDateSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int startPosition;
        private final View view;

        public ExpiryDateSlideStartAnimation(View view, int i11, int i12) {
            kotlin.jvm.internal.s.g(view, "view");
            this.view = view;
            this.startPosition = i11;
            this.destination = i12;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f11, Transformation t11) {
            kotlin.jvm.internal.s.g(t11, "t");
            super.applyTransformation(f11, t11);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((this.destination * f11) + ((1 - f11) * this.startPosition)));
            view.setLayoutParams(layoutParams2);
        }
    }

    /* loaded from: classes6.dex */
    public enum Field {
        Number,
        Expiry,
        Cvc,
        PostalCode
    }

    /* loaded from: classes6.dex */
    public interface LayoutWidthCalculator {
        int calculate(String str, TextPaint textPaint);
    }

    /* loaded from: classes6.dex */
    public static final class PostalCodeSlideEndAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startMargin;
        private final View view;

        public PostalCodeSlideEndAnimation(View view, int i11, int i12, int i13) {
            kotlin.jvm.internal.s.g(view, "view");
            this.view = view;
            this.startMargin = i11;
            this.destination = i12;
            this.newWidth = i13;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f11, Transformation t11) {
            kotlin.jvm.internal.s.g(t11, "t");
            super.applyTransformation(f11, t11);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((this.destination * f11) + ((1 - f11) * this.startMargin)));
            layoutParams2.setMarginEnd(0);
            layoutParams2.width = this.newWidth;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* loaded from: classes6.dex */
    public static final class PostalCodeSlideStartAnimation extends CardFieldAnimation {
        private final int destination;
        private final int newWidth;
        private final int startPosition;
        private final View view;

        public PostalCodeSlideStartAnimation(View view, int i11, int i12, int i13) {
            kotlin.jvm.internal.s.g(view, "view");
            this.view = view;
            this.startPosition = i11;
            this.destination = i12;
            this.newWidth = i13;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f11, Transformation transformation) {
            super.applyTransformation(f11, transformation);
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart((int) ((this.destination * f11) + ((1 - f11) * this.startPosition)));
            layoutParams2.setMarginEnd(0);
            layoutParams2.width = this.newWidth;
            view.setLayoutParams(layoutParams2);
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Field.values().length];
            iArr[Field.Number.ordinal()] = 1;
            iArr[Field.Expiry.ordinal()] = 2;
            iArr[Field.Cvc.ordinal()] = 3;
            iArr[Field.PostalCode.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardInputWidget(Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CardInputWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ CardInputWidget(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static /* synthetic */ void a(CardInputWidget cardInputWidget, View view, boolean z11) {
        m513initView$lambda28(cardInputWidget, view, z11);
    }

    public static final /* synthetic */ CardBrand access$getBrand(CardInputWidget cardInputWidget) {
        return cardInputWidget.getBrand();
    }

    public static final /* synthetic */ CardInputListener access$getCardInputListener$p(CardInputWidget cardInputWidget) {
        return cardInputWidget.cardInputListener;
    }

    public static final /* synthetic */ CardValidCallback access$getCardValidCallback$p(CardInputWidget cardInputWidget) {
        return cardInputWidget.cardValidCallback;
    }

    public static final /* synthetic */ Set access$getInvalidFields(CardInputWidget cardInputWidget) {
        return cardInputWidget.getInvalidFields();
    }

    public static final /* synthetic */ void access$setShouldShowErrorIcon(CardInputWidget cardInputWidget, boolean z11) {
        cardInputWidget.setShouldShowErrorIcon(z11);
    }

    public static final /* synthetic */ void access$updatePostalRequired(CardInputWidget cardInputWidget) {
        cardInputWidget.updatePostalRequired();
    }

    private final void applyCardElementAttributes(AttributeSet attributeSet) {
        Context context = getContext();
        kotlin.jvm.internal.s.f(context, "context");
        int[] CardElement = R.styleable.CardElement;
        kotlin.jvm.internal.s.f(CardElement, "CardElement");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CardElement, 0, 0);
        kotlin.jvm.internal.s.f(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        setPostalCodeEnabled(obtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldShowPostalCode, getPostalCodeEnabled()));
        setPostalCodeRequired(obtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldRequirePostalCode, getPostalCodeRequired()));
        setUsZipCodeRequired(obtainStyledAttributes.getBoolean(R.styleable.CardElement_shouldRequireUsZipCode, getUsZipCodeRequired()));
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void b(CardInputWidget cardInputWidget, View view, boolean z11) {
        m511initView$lambda26(cardInputWidget, view, z11);
    }

    public static /* synthetic */ void c(CardInputWidget cardInputWidget, View view, boolean z11) {
        m512initView$lambda27(cardInputWidget, view, z11);
    }

    public static /* synthetic */ void d(CardInputWidget cardInputWidget, View view, boolean z11) {
        m514initView$lambda29(cardInputWidget, view, z11);
    }

    private final PaymentMethod.BillingDetails getBillingDetails() {
        String postalCodeValue = getPostalCodeValue();
        if (postalCodeValue == null) {
            return null;
        }
        return new PaymentMethod.BillingDetails(new Address(null, null, null, null, postalCodeValue, null, 47, null), null, null, null, 14, null);
    }

    public final CardBrand getBrand() {
        return this.cardNumberEditText.getCardBrand();
    }

    public static /* synthetic */ void getCurrentFields$payments_core_release$annotations() {
    }

    private final Cvc.Validated getCvc() {
        return this.cvcEditText.getCvc$payments_core_release();
    }

    private final String getCvcPlaceHolder() {
        return CardBrand.AmericanExpress == getBrand() ? CVC_PLACEHOLDER_AMEX : CVC_PLACEHOLDER_COMMON;
    }

    private final int getDesiredWidthInPixels(String str, StripeEditText stripeEditText) {
        LayoutWidthCalculator layoutWidthCalculator = this.layoutWidthCalculator;
        TextPaint paint = stripeEditText.getPaint();
        kotlin.jvm.internal.s.f(paint, "editText.paint");
        return layoutWidthCalculator.calculate(str, paint);
    }

    private final Field getFocusField(int i11, int i12) {
        return this.placement.getFocusField$payments_core_release(i11, i12, this.isShowingFullCard, getPostalCodeEnabled());
    }

    private final int getFrameStart() {
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 0) {
            return this.containerLayout.getLeft();
        }
        return this.containerLayout.getRight();
    }

    private final int getFrameWidth() {
        return this.frameWidthSupplier.invoke().intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x005f, code lost:
        if (r6 == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Set<com.stripe.android.view.CardValidCallback.Fields> getInvalidFields() {
        /*
            r7 = this;
            r0 = 4
            com.stripe.android.view.CardValidCallback$Fields[] r0 = new com.stripe.android.view.CardValidCallback.Fields[r0]
            com.stripe.android.view.CardValidCallback$Fields r1 = com.stripe.android.view.CardValidCallback.Fields.Number
            com.stripe.android.view.CardNumberEditText r2 = r7.getCardNumberEditText$payments_core_release()
            com.stripe.android.cards.CardNumber$Validated r2 = r2.getValidatedCardNumber$payments_core_release()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L13
            r2 = r3
            goto L14
        L13:
            r2 = r4
        L14:
            r5 = 0
            if (r2 == 0) goto L18
            goto L19
        L18:
            r1 = r5
        L19:
            r0[r4] = r1
            com.stripe.android.view.CardValidCallback$Fields r1 = com.stripe.android.view.CardValidCallback.Fields.Expiry
            com.stripe.android.view.ExpiryDateEditText r2 = r7.getExpiryDateEditText$payments_core_release()
            com.stripe.android.model.ExpirationDate$Validated r2 = r2.getValidatedDate()
            if (r2 != 0) goto L29
            r2 = r3
            goto L2a
        L29:
            r2 = r4
        L2a:
            if (r2 == 0) goto L2d
            goto L2e
        L2d:
            r1 = r5
        L2e:
            r0[r3] = r1
            r1 = 2
            com.stripe.android.view.CardValidCallback$Fields r2 = com.stripe.android.view.CardValidCallback.Fields.Cvc
            com.stripe.android.cards.Cvc$Validated r6 = r7.getCvc()
            if (r6 != 0) goto L3b
            r6 = r3
            goto L3c
        L3b:
            r6 = r4
        L3c:
            if (r6 == 0) goto L3f
            goto L40
        L3f:
            r2 = r5
        L40:
            r0[r1] = r2
            r1 = 3
            com.stripe.android.view.CardValidCallback$Fields r2 = com.stripe.android.view.CardValidCallback.Fields.Postal
            boolean r6 = r7.isPostalRequired()
            if (r6 == 0) goto L62
            com.stripe.android.view.PostalCodeEditText r6 = r7.getPostalCodeEditText$payments_core_release()
            java.lang.String r6 = r6.getPostalCode$payments_core_release()
            if (r6 == 0) goto L5e
            boolean r6 = kotlin.text.m.w(r6)
            if (r6 == 0) goto L5c
            goto L5e
        L5c:
            r6 = r4
            goto L5f
        L5e:
            r6 = r3
        L5f:
            if (r6 == 0) goto L62
            goto L63
        L62:
            r3 = r4
        L63:
            if (r3 == 0) goto L66
            r5 = r2
        L66:
            r0[r1] = r5
            java.util.List r0 = wz.u.n(r0)
            java.util.Set r0 = wz.u.S0(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardInputWidget.getInvalidFields():java.util.Set");
    }

    private final String getPeekCardText() {
        String z11;
        int panLength$payments_core_release = this.cardNumberEditText.getPanLength$payments_core_release();
        z11 = kotlin.text.v.z("0", panLength$payments_core_release != 14 ? panLength$payments_core_release != 15 ? panLength$payments_core_release != 19 ? 4 : 3 : 5 : 2);
        return z11;
    }

    private final String getPostalCodeValue() {
        if (getPostalCodeEnabled()) {
            return this.postalCodeEditText.getPostalCode$payments_core_release();
        }
        return null;
    }

    public static /* synthetic */ void getRequiredFields$payments_core_release$annotations() {
    }

    public static /* synthetic */ void getShouldShowErrorIcon$payments_core_release$annotations() {
    }

    private final void initView(AttributeSet attributeSet) {
        applyCardElementAttributes(attributeSet);
        androidx.core.view.a0.w0(this.cardNumberEditText, new androidx.core.view.a() { // from class: com.stripe.android.view.CardInputWidget$initView$1
            @Override // androidx.core.view.a
            public void onInitializeAccessibilityNodeInfo(View host, w3.c info) {
                kotlin.jvm.internal.s.g(host, "host");
                kotlin.jvm.internal.s.g(info, "info");
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.p0(null);
            }
        });
        this.isShowingFullCard = true;
        int defaultErrorColorInt = this.cardNumberEditText.getDefaultErrorColorInt();
        this.cardBrandView.setTintColorInt$payments_core_release(this.cardNumberEditText.getHintTextColors().getDefaultColor());
        Context context = getContext();
        kotlin.jvm.internal.s.f(context, "context");
        int[] CardInputView = R.styleable.CardInputView;
        kotlin.jvm.internal.s.f(CardInputView, "CardInputView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CardInputView, 0, 0);
        kotlin.jvm.internal.s.f(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        getCardBrandView$payments_core_release().setTintColorInt$payments_core_release(obtainStyledAttributes.getColor(R.styleable.CardInputView_cardTint, getCardBrandView$payments_core_release().getTintColorInt$payments_core_release()));
        int color = obtainStyledAttributes.getColor(R.styleable.CardInputView_cardTextErrorColor, defaultErrorColorInt);
        String string = obtainStyledAttributes.getString(R.styleable.CardInputView_cardHintText);
        boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.CardInputView_android_focusedByDefault, true);
        obtainStyledAttributes.recycle();
        if (string != null) {
            getCardNumberEditText$payments_core_release().setHint(string);
        }
        for (StripeEditText stripeEditText : getCurrentFields$payments_core_release()) {
            stripeEditText.setErrorColor(color);
        }
        this.cardNumberEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.h
            {
                CardInputWidget.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z12) {
                CardInputWidget.b(CardInputWidget.this, view, z12);
            }
        });
        this.expiryDateEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.i
            {
                CardInputWidget.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z12) {
                CardInputWidget.c(CardInputWidget.this, view, z12);
            }
        });
        this.postalCodeEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.g
            {
                CardInputWidget.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z12) {
                CardInputWidget.a(CardInputWidget.this, view, z12);
            }
        });
        this.expiryDateEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cardNumberEditText));
        this.cvcEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.expiryDateEditText));
        this.postalCodeEditText.setDeleteEmptyListener(new BackUpFieldDeleteListener(this.cvcEditText));
        this.cvcEditText.getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.j
            {
                CardInputWidget.this = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z12) {
                CardInputWidget.d(CardInputWidget.this, view, z12);
            }
        });
        this.cvcEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardInputWidget$initView$9
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String text) {
                CardInputListener access$getCardInputListener$p;
                kotlin.jvm.internal.s.g(text, "text");
                if (!CardInputWidget.access$getBrand(CardInputWidget.this).isMaxCvc(text) || (access$getCardInputListener$p = CardInputWidget.access$getCardInputListener$p(CardInputWidget.this)) == null) {
                    return;
                }
                access$getCardInputListener$p.onCvcComplete();
            }
        });
        this.postalCodeEditText.setAfterTextChangedListener(new StripeEditText.AfterTextChangedListener() { // from class: com.stripe.android.view.CardInputWidget$initView$10
            @Override // com.stripe.android.view.StripeEditText.AfterTextChangedListener
            public final void onTextChanged(String it2) {
                CardInputListener access$getCardInputListener$p;
                kotlin.jvm.internal.s.g(it2, "it");
                if (CardInputWidget.this.getPostalCodeEditText$payments_core_release().isEnabled() && CardInputWidget.this.getPostalCodeEditText$payments_core_release().hasValidPostal$payments_core_release() && (access$getCardInputListener$p = CardInputWidget.access$getCardInputListener$p(CardInputWidget.this)) != null) {
                    access$getCardInputListener$p.onPostalCodeComplete();
                }
            }
        });
        this.cardNumberEditText.setCompletionCallback$payments_core_release(new CardInputWidget$initView$11(this));
        this.cardNumberEditText.setBrandChangeCallback$payments_core_release(new CardInputWidget$initView$12(this));
        this.expiryDateEditText.setCompletionCallback$payments_core_release(new CardInputWidget$initView$13(this));
        this.cvcEditText.setCompletionCallback$payments_core_release(new CardInputWidget$initView$14(this));
        for (StripeEditText stripeEditText2 : this.allFields) {
            stripeEditText2.addTextChangedListener(new TextWatcher() { // from class: com.stripe.android.view.CardInputWidget$initView$lambda-31$$inlined$doAfterTextChanged$1
                {
                    CardInputWidget.this = this;
                }

                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable editable) {
                    CardInputWidget.access$setShouldShowErrorIcon(CardInputWidget.this, false);
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                }
            });
        }
        if (z11) {
            this.cardNumberEditText.requestFocus();
        }
        this.cardNumberEditText.setLoadingCallback$payments_core_release(new CardInputWidget$initView$16(this));
    }

    /* renamed from: initView$lambda-26 */
    public static final void m511initView$lambda26(CardInputWidget this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (z11) {
            this$0.scrollStart();
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener == null) {
                return;
            }
            cardInputListener.onFocusChange(CardInputListener.FocusField.CardNumber);
        }
    }

    /* renamed from: initView$lambda-27 */
    public static final void m512initView$lambda27(CardInputWidget this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (z11) {
            this$0.scrollEnd();
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener == null) {
                return;
            }
            cardInputListener.onFocusChange(CardInputListener.FocusField.ExpiryDate);
        }
    }

    /* renamed from: initView$lambda-28 */
    public static final void m513initView$lambda28(CardInputWidget this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        if (z11) {
            this$0.scrollEnd();
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener == null) {
                return;
            }
            cardInputListener.onFocusChange(CardInputListener.FocusField.PostalCode);
        }
    }

    /* renamed from: initView$lambda-29 */
    public static final void m514initView$lambda29(CardInputWidget this$0, View view, boolean z11) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.cardBrandView.setShouldShowCvc(z11);
        if (z11) {
            this$0.scrollEnd();
            CardInputListener cardInputListener = this$0.cardInputListener;
            if (cardInputListener == null) {
                return;
            }
            cardInputListener.onFocusChange(CardInputListener.FocusField.Cvc);
        }
    }

    private final boolean isPostalRequired() {
        return (getPostalCodeRequired() || getUsZipCodeRequired()) && getPostalCodeEnabled();
    }

    public final void scrollEnd() {
        List<? extends Animation> n11;
        if (this.isShowingFullCard && this.isViewInitialized) {
            int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(true);
            updateSpaceSizes$payments_core_release$default(this, false, 0, 0, 6, null);
            CardNumberSlideEndAnimation cardNumberSlideEndAnimation = new CardNumberSlideEndAnimation(this.cardNumberTextInputLayout, this.placement.getHiddenCardWidth$payments_core_release(), this.expiryDateEditText);
            int dateStartMargin$payments_core_release2 = this.placement.getDateStartMargin$payments_core_release(false);
            ExpiryDateSlideEndAnimation expiryDateSlideEndAnimation = new ExpiryDateSlideEndAnimation(this.expiryDateTextInputLayout, dateStartMargin$payments_core_release, dateStartMargin$payments_core_release2);
            int cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(false);
            int i11 = (dateStartMargin$payments_core_release - dateStartMargin$payments_core_release2) + cvcStartMargin$payments_core_release;
            CvcSlideEndAnimation cvcSlideEndAnimation = new CvcSlideEndAnimation(this.cvcNumberTextInputLayout, i11, cvcStartMargin$payments_core_release, this.placement.getCvcWidth$payments_core_release());
            int postalCodeStartMargin$payments_core_release = this.placement.getPostalCodeStartMargin$payments_core_release(false);
            n11 = wz.w.n(cardNumberSlideEndAnimation, expiryDateSlideEndAnimation, cvcSlideEndAnimation, getPostalCodeEnabled() ? new PostalCodeSlideEndAnimation(this.postalCodeTextInputLayout, (i11 - cvcStartMargin$payments_core_release) + postalCodeStartMargin$payments_core_release, postalCodeStartMargin$payments_core_release, this.placement.getPostalCodeWidth$payments_core_release()) : null);
            startSlideAnimation(n11);
            this.isShowingFullCard = false;
        }
    }

    private final void scrollStart() {
        List<? extends Animation> n11;
        if (this.isShowingFullCard || !this.isViewInitialized) {
            return;
        }
        int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(false);
        int cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(false);
        int postalCodeStartMargin$payments_core_release = this.placement.getPostalCodeStartMargin$payments_core_release(false);
        updateSpaceSizes$payments_core_release$default(this, true, 0, 0, 6, null);
        CardNumberSlideStartAnimation cardNumberSlideStartAnimation = new CardNumberSlideStartAnimation(this.cardNumberTextInputLayout);
        int dateStartMargin$payments_core_release2 = this.placement.getDateStartMargin$payments_core_release(true);
        ExpiryDateSlideStartAnimation expiryDateSlideStartAnimation = new ExpiryDateSlideStartAnimation(this.expiryDateTextInputLayout, dateStartMargin$payments_core_release, dateStartMargin$payments_core_release2);
        int i11 = (dateStartMargin$payments_core_release2 - dateStartMargin$payments_core_release) + cvcStartMargin$payments_core_release;
        n11 = wz.w.n(cardNumberSlideStartAnimation, expiryDateSlideStartAnimation, new CvcSlideStartAnimation(this.cvcNumberTextInputLayout, cvcStartMargin$payments_core_release, i11, this.placement.getCvcWidth$payments_core_release()), getPostalCodeEnabled() ? new PostalCodeSlideStartAnimation(this.postalCodeTextInputLayout, postalCodeStartMargin$payments_core_release, (i11 - cvcStartMargin$payments_core_release) + postalCodeStartMargin$payments_core_release, this.placement.getPostalCodeWidth$payments_core_release()) : null);
        startSlideAnimation(n11);
        this.isShowingFullCard = true;
    }

    public final void setShouldShowErrorIcon(boolean z11) {
        this.cardBrandView.setShouldShowErrorIcon(z11);
        this.shouldShowErrorIcon = z11;
    }

    private final void startSlideAnimation(List<? extends Animation> list) {
        AnimationSet animationSet = new AnimationSet(true);
        for (Animation animation : list) {
            animationSet.addAnimation(animation);
        }
        this.containerLayout.startAnimation(animationSet);
    }

    public final void updateCvc() {
        CvcEditText.updateBrand$payments_core_release$default(this.cvcEditText, this.cardBrandView.getBrand(), this.customCvcLabel, null, null, 12, null);
    }

    private final void updateFieldLayout(View view, int i11, int i12) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.width = i11;
        layoutParams2.setMarginStart(i12);
        view.setLayoutParams(layoutParams2);
    }

    public final void updatePostalRequired() {
        if (isPostalRequired()) {
            this.requiredFields.add(this.postalCodeEditText);
        } else {
            this.requiredFields.remove(this.postalCodeEditText);
        }
    }

    public static /* synthetic */ void updateSpaceSizes$payments_core_release$default(CardInputWidget cardInputWidget, boolean z11, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i11 = cardInputWidget.getFrameWidth();
        }
        if ((i13 & 4) != 0) {
            i12 = cardInputWidget.getFrameStart();
        }
        cardInputWidget.updateSpaceSizes$payments_core_release(z11, i11, i12);
    }

    @Override // com.stripe.android.view.CardWidget
    public void clear() {
        List currentFields$payments_core_release = getCurrentFields$payments_core_release();
        boolean z11 = false;
        if (!(currentFields$payments_core_release instanceof Collection) || !currentFields$payments_core_release.isEmpty()) {
            Iterator it2 = currentFields$payments_core_release.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((StripeEditText) it2.next()).hasFocus()) {
                        z11 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z11 || hasFocus()) {
            this.cardNumberEditText.requestFocus();
        }
        for (StripeEditText stripeEditText : getCurrentFields$payments_core_release()) {
            stripeEditText.setText("");
        }
    }

    public final String createHiddenCardText$payments_core_release(int i11) {
        String z11;
        int d02;
        String i12;
        z11 = kotlin.text.v.z("0", i11);
        String formatted = new CardNumber.Unvalidated(z11).getFormatted(i11);
        d02 = kotlin.text.w.d0(formatted, ' ', 0, false, 6, null);
        i12 = kotlin.text.y.i1(formatted, d02 + 1);
        return i12;
    }

    public final CardBrandView getCardBrandView$payments_core_release() {
        return this.cardBrandView;
    }

    public final CardNumberEditText getCardNumberEditText$payments_core_release() {
        return this.cardNumberEditText;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0054  */
    @Override // com.stripe.android.view.CardWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.stripe.android.model.CardParams getCardParams() {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.CardInputWidget.getCardParams():com.stripe.android.model.CardParams");
    }

    public final /* synthetic */ List getCurrentFields$payments_core_release() {
        Set n11;
        List Y;
        Set<StripeEditText> set = this.requiredFields;
        PostalCodeEditText postalCodeEditText = this.postalCodeEditText;
        if (!getPostalCodeEnabled()) {
            postalCodeEditText = null;
        }
        n11 = y0.n(set, postalCodeEditText);
        Y = wz.e0.Y(n11);
        return Y;
    }

    public final CvcEditText getCvcEditText$payments_core_release() {
        return this.cvcEditText;
    }

    public final ExpiryDateEditText getExpiryDateEditText$payments_core_release() {
        return this.expiryDateEditText;
    }

    public final h00.a<Integer> getFrameWidthSupplier$payments_core_release() {
        return this.frameWidthSupplier;
    }

    public final LayoutWidthCalculator getLayoutWidthCalculator$payments_core_release() {
        return this.layoutWidthCalculator;
    }

    @Override // com.stripe.android.view.CardWidget
    public PaymentMethodCreateParams.Card getPaymentMethodCard() {
        CardParams cardParams = getCardParams();
        if (cardParams == null) {
            return null;
        }
        String number$payments_core_release = cardParams.getNumber$payments_core_release();
        String cvc$payments_core_release = cardParams.getCvc$payments_core_release();
        int expMonth$payments_core_release = cardParams.getExpMonth$payments_core_release();
        int expYear$payments_core_release = cardParams.getExpYear$payments_core_release();
        return new PaymentMethodCreateParams.Card(number$payments_core_release, Integer.valueOf(expMonth$payments_core_release), Integer.valueOf(expYear$payments_core_release), cvc$payments_core_release, null, cardParams.getAttribution(), 16, null);
    }

    @Override // com.stripe.android.view.CardWidget
    public PaymentMethodCreateParams getPaymentMethodCreateParams() {
        PaymentMethodCreateParams.Card paymentMethodCard = getPaymentMethodCard();
        if (paymentMethodCard == null) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.create$default(PaymentMethodCreateParams.Companion, paymentMethodCard, getBillingDetails(), (Map) null, 4, (Object) null);
    }

    public final CardInputWidgetPlacement getPlacement$payments_core_release() {
        return this.placement;
    }

    public final PostalCodeEditText getPostalCodeEditText$payments_core_release() {
        return this.postalCodeEditText;
    }

    public final boolean getPostalCodeEnabled() {
        return ((Boolean) this.postalCodeEnabled$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final boolean getPostalCodeRequired() {
        return ((Boolean) this.postalCodeRequired$delegate.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    public final TextInputLayout getPostalCodeTextInputLayout$payments_core_release() {
        return this.postalCodeTextInputLayout;
    }

    public final Set<StripeEditText> getRequiredFields$payments_core_release() {
        return this.requiredFields;
    }

    public final boolean getShouldShowErrorIcon$payments_core_release() {
        return this.shouldShowErrorIcon;
    }

    public final boolean getUsZipCodeRequired() {
        return ((Boolean) this.usZipCodeRequired$delegate.getValue(this, $$delegatedProperties[2])).booleanValue();
    }

    @Override // android.view.View
    public boolean isEnabled() {
        Set<StripeEditText> set = this.requiredFields;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        for (StripeEditText stripeEditText : set) {
            if (!stripeEditText.isEnabled()) {
                return false;
            }
        }
        return true;
    }

    public final boolean isShowingFullCard$payments_core_release() {
        return this.isShowingFullCard;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.postalCodeEditText.setConfig$payments_core_release(PostalCodeEditText.Config.Global);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        EditText cardNumberEditText$payments_core_release;
        Boolean bool;
        kotlin.jvm.internal.s.g(ev2, "ev");
        if (ev2.getAction() != 0) {
            return super.onInterceptTouchEvent(ev2);
        }
        Field focusField = getFocusField((int) ev2.getX(), getFrameStart());
        if (focusField == null) {
            bool = null;
        } else {
            int i11 = WhenMappings.$EnumSwitchMapping$0[focusField.ordinal()];
            if (i11 == 1) {
                cardNumberEditText$payments_core_release = getCardNumberEditText$payments_core_release();
            } else if (i11 == 2) {
                cardNumberEditText$payments_core_release = getExpiryDateEditText$payments_core_release();
            } else if (i11 == 3) {
                cardNumberEditText$payments_core_release = getCvcEditText$payments_core_release();
            } else if (i11 != 4) {
                throw new NoWhenBranchMatchedException();
            } else {
                cardNumberEditText$payments_core_release = getPostalCodeEditText$payments_core_release();
            }
            cardNumberEditText$payments_core_release.requestFocus();
            bool = Boolean.TRUE;
        }
        if (bool == null) {
            return super.onInterceptTouchEvent(ev2);
        }
        return bool.booleanValue();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (this.isViewInitialized || getWidth() == 0) {
            return;
        }
        this.isViewInitialized = true;
        this.placement.setTotalLengthInPixels$payments_core_release(getFrameWidth());
        updateSpaceSizes$payments_core_release$default(this, this.isShowingFullCard, 0, 0, 6, null);
        updateFieldLayout(this.cardNumberTextInputLayout, this.placement.getCardWidth$payments_core_release(), this.isShowingFullCard ? 0 : this.placement.getHiddenCardWidth$payments_core_release() * (-1));
        updateFieldLayout(this.expiryDateTextInputLayout, this.placement.getDateWidth$payments_core_release(), this.placement.getDateStartMargin$payments_core_release(this.isShowingFullCard));
        updateFieldLayout(this.cvcNumberTextInputLayout, this.placement.getCvcWidth$payments_core_release(), this.placement.getCvcStartMargin$payments_core_release(this.isShowingFullCard));
        updateFieldLayout(this.postalCodeTextInputLayout, this.placement.getPostalCodeWidth$payments_core_release(), this.placement.getPostalCodeStartMargin$payments_core_release(this.isShowingFullCard));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        int cvcStartMargin$payments_core_release;
        int totalLengthInPixels$payments_core_release;
        int i11;
        int i12;
        kotlin.jvm.internal.s.g(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            setPostalCodeEnabled(bundle.getBoolean(STATE_POSTAL_CODE_ENABLED, true));
            boolean z11 = bundle.getBoolean(STATE_CARD_VIEWED, true);
            this.isShowingFullCard = z11;
            updateSpaceSizes$payments_core_release$default(this, z11, 0, 0, 6, null);
            this.placement.setTotalLengthInPixels$payments_core_release(getFrameWidth());
            int i13 = 0;
            if (this.isShowingFullCard) {
                i11 = this.placement.getDateStartMargin$payments_core_release(true);
                cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(true);
                i12 = this.placement.getPostalCodeStartMargin$payments_core_release(true);
            } else {
                int hiddenCardWidth$payments_core_release = this.placement.getHiddenCardWidth$payments_core_release() * (-1);
                int dateStartMargin$payments_core_release = this.placement.getDateStartMargin$payments_core_release(false);
                cvcStartMargin$payments_core_release = this.placement.getCvcStartMargin$payments_core_release(false);
                if (getPostalCodeEnabled()) {
                    totalLengthInPixels$payments_core_release = this.placement.getPostalCodeStartMargin$payments_core_release(false);
                } else {
                    totalLengthInPixels$payments_core_release = this.placement.getTotalLengthInPixels$payments_core_release();
                }
                int i14 = totalLengthInPixels$payments_core_release;
                i13 = hiddenCardWidth$payments_core_release;
                i11 = dateStartMargin$payments_core_release;
                i12 = i14;
            }
            updateFieldLayout(this.cardNumberTextInputLayout, this.placement.getCardWidth$payments_core_release(), i13);
            updateFieldLayout(this.expiryDateTextInputLayout, this.placement.getDateWidth$payments_core_release(), i11);
            updateFieldLayout(this.cvcNumberTextInputLayout, this.placement.getCvcWidth$payments_core_release(), cvcStartMargin$payments_core_release);
            updateFieldLayout(this.postalCodeTextInputLayout, this.placement.getPostalCodeWidth$payments_core_release(), i12);
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER_STATE));
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return r3.b.a(vz.v.a(STATE_SUPER_STATE, super.onSaveInstanceState()), vz.v.a(STATE_CARD_VIEWED, Boolean.valueOf(this.isShowingFullCard)), vz.v.a(STATE_POSTAL_CODE_ENABLED, Boolean.valueOf(getPostalCodeEnabled())));
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardHint(String cardHint) {
        kotlin.jvm.internal.s.g(cardHint, "cardHint");
        this.cardNumberEditText.setHint(cardHint);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardInputListener(CardInputListener cardInputListener) {
        this.cardInputListener = cardInputListener;
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardNumber(String str) {
        this.cardNumberEditText.setText(str);
        this.isShowingFullCard = !this.cardNumberEditText.isCardNumberValid();
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardNumberTextWatcher(TextWatcher textWatcher) {
        this.cardNumberEditText.addTextChangedListener(textWatcher);
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCardValidCallback(CardValidCallback cardValidCallback) {
        this.cardValidCallback = cardValidCallback;
        for (StripeEditText stripeEditText : this.requiredFields) {
            stripeEditText.removeTextChangedListener(this.cardValidTextWatcher);
        }
        if (cardValidCallback != null) {
            for (StripeEditText stripeEditText2 : this.requiredFields) {
                stripeEditText2.addTextChangedListener(this.cardValidTextWatcher);
            }
        }
        CardValidCallback cardValidCallback2 = this.cardValidCallback;
        if (cardValidCallback2 == null) {
            return;
        }
        cardValidCallback2.onInputChanged(getInvalidFields().isEmpty(), getInvalidFields());
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCvcCode(String str) {
        this.cvcEditText.setText(str);
    }

    public final void setCvcLabel(String str) {
        this.customCvcLabel = str;
        updateCvc();
    }

    @Override // com.stripe.android.view.CardWidget
    public void setCvcNumberTextWatcher(TextWatcher textWatcher) {
        this.cvcEditText.addTextChangedListener(textWatcher);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        for (StripeEditText stripeEditText : getCurrentFields$payments_core_release()) {
            stripeEditText.setEnabled(z11);
        }
    }

    @Override // com.stripe.android.view.CardWidget
    public void setExpiryDate(int i11, int i12) {
        this.expiryDateEditText.setText(new ExpirationDate.Unvalidated(i11, i12).getDisplayString());
    }

    @Override // com.stripe.android.view.CardWidget
    public void setExpiryDateTextWatcher(TextWatcher textWatcher) {
        this.expiryDateEditText.addTextChangedListener(textWatcher);
    }

    public final void setFrameWidthSupplier$payments_core_release(h00.a<Integer> aVar) {
        kotlin.jvm.internal.s.g(aVar, "<set-?>");
        this.frameWidthSupplier = aVar;
    }

    public final void setLayoutWidthCalculator$payments_core_release(LayoutWidthCalculator layoutWidthCalculator) {
        kotlin.jvm.internal.s.g(layoutWidthCalculator, "<set-?>");
        this.layoutWidthCalculator = layoutWidthCalculator;
    }

    public final /* synthetic */ void setPostalCode$payments_core_release(String str) {
        this.postalCodeEditText.setText(str);
    }

    public final void setPostalCodeEnabled(boolean z11) {
        this.postalCodeEnabled$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z11));
    }

    public final void setPostalCodeRequired(boolean z11) {
        this.postalCodeRequired$delegate.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z11));
    }

    @Override // com.stripe.android.view.CardWidget
    public void setPostalCodeTextWatcher(TextWatcher textWatcher) {
        this.postalCodeEditText.addTextChangedListener(textWatcher);
    }

    public final void setShowingFullCard$payments_core_release(boolean z11) {
        this.isShowingFullCard = z11;
    }

    public final void setUsZipCodeRequired(boolean z11) {
        this.usZipCodeRequired$delegate.setValue(this, $$delegatedProperties[2], Boolean.valueOf(z11));
    }

    public final void updateSpaceSizes$payments_core_release(boolean z11, int i11, int i12) {
        if (i11 == 0) {
            return;
        }
        this.placement.setCardWidth$payments_core_release(getDesiredWidthInPixels(FULL_SIZING_CARD_TEXT, this.cardNumberEditText));
        this.placement.setDateWidth$payments_core_release(getDesiredWidthInPixels(FULL_SIZING_DATE_TEXT, this.expiryDateEditText));
        this.placement.setHiddenCardWidth$payments_core_release(getDesiredWidthInPixels(this.hiddenCardText, this.cardNumberEditText));
        this.placement.setCvcWidth$payments_core_release(getDesiredWidthInPixels(getCvcPlaceHolder(), this.cvcEditText));
        this.placement.setPostalCodeWidth$payments_core_release(getDesiredWidthInPixels(FULL_SIZING_POSTAL_CODE_TEXT, this.postalCodeEditText));
        this.placement.setPeekCardWidth$payments_core_release(getDesiredWidthInPixels(getPeekCardText(), this.cardNumberEditText));
        this.placement.updateSpacing$payments_core_release(z11, getPostalCodeEnabled(), i12, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.stripe.android.view.CardInputWidget$cardValidTextWatcher$1] */
    public CardInputWidget(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Set<StripeEditText> g11;
        Set<StripeEditText> n11;
        kotlin.jvm.internal.s.g(context, "context");
        CardInputWidgetBinding inflate = CardInputWidgetBinding.inflate(LayoutInflater.from(context), this);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        FrameLayout frameLayout = inflate.container;
        kotlin.jvm.internal.s.f(frameLayout, "viewBinding.container");
        this.containerLayout = frameLayout;
        CardBrandView cardBrandView = inflate.cardBrandView;
        kotlin.jvm.internal.s.f(cardBrandView, "viewBinding.cardBrandView");
        this.cardBrandView = cardBrandView;
        TextInputLayout textInputLayout = inflate.cardNumberTextInputLayout;
        kotlin.jvm.internal.s.f(textInputLayout, "viewBinding.cardNumberTextInputLayout");
        this.cardNumberTextInputLayout = textInputLayout;
        TextInputLayout textInputLayout2 = inflate.expiryDateTextInputLayout;
        kotlin.jvm.internal.s.f(textInputLayout2, "viewBinding.expiryDateTextInputLayout");
        this.expiryDateTextInputLayout = textInputLayout2;
        TextInputLayout textInputLayout3 = inflate.cvcTextInputLayout;
        kotlin.jvm.internal.s.f(textInputLayout3, "viewBinding.cvcTextInputLayout");
        this.cvcNumberTextInputLayout = textInputLayout3;
        TextInputLayout textInputLayout4 = inflate.postalCodeTextInputLayout;
        kotlin.jvm.internal.s.f(textInputLayout4, "viewBinding.postalCodeTextInputLayout");
        this.postalCodeTextInputLayout = textInputLayout4;
        CardNumberEditText cardNumberEditText = inflate.cardNumberEditText;
        kotlin.jvm.internal.s.f(cardNumberEditText, "viewBinding.cardNumberEditText");
        this.cardNumberEditText = cardNumberEditText;
        ExpiryDateEditText expiryDateEditText = inflate.expiryDateEditText;
        kotlin.jvm.internal.s.f(expiryDateEditText, "viewBinding.expiryDateEditText");
        this.expiryDateEditText = expiryDateEditText;
        CvcEditText cvcEditText = inflate.cvcEditText;
        kotlin.jvm.internal.s.f(cvcEditText, "viewBinding.cvcEditText");
        this.cvcEditText = cvcEditText;
        PostalCodeEditText postalCodeEditText = inflate.postalCodeEditText;
        kotlin.jvm.internal.s.f(postalCodeEditText, "viewBinding.postalCodeEditText");
        this.postalCodeEditText = postalCodeEditText;
        this.cardValidTextWatcher = new StripeTextWatcher() { // from class: com.stripe.android.view.CardInputWidget$cardValidTextWatcher$1
            {
                CardInputWidget.this = this;
            }

            @Override // com.stripe.android.view.StripeTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                super.afterTextChanged(editable);
                CardValidCallback access$getCardValidCallback$p = CardInputWidget.access$getCardValidCallback$p(CardInputWidget.this);
                if (access$getCardValidCallback$p == null) {
                    return;
                }
                access$getCardValidCallback$p.onInputChanged(CardInputWidget.access$getInvalidFields(CardInputWidget.this).isEmpty(), CardInputWidget.access$getInvalidFields(CardInputWidget.this));
            }
        };
        this.isShowingFullCard = true;
        this.layoutWidthCalculator = new DefaultLayoutWidthCalculator();
        this.placement = new CardInputWidgetPlacement(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, Settings.DEFAULT_INITIAL_WINDOW_SIZE, null);
        kotlin.properties.a aVar = kotlin.properties.a.f34932a;
        this.postalCodeEnabled$delegate = new kotlin.properties.b<Boolean>(Boolean.TRUE) { // from class: com.stripe.android.view.CardInputWidget$special$$inlined$observable$1
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, Boolean bool, Boolean bool2) {
                CardInputWidget$cardValidTextWatcher$1 cardInputWidget$cardValidTextWatcher$1;
                CardInputWidget$cardValidTextWatcher$1 cardInputWidget$cardValidTextWatcher$12;
                CardInputWidget$cardValidTextWatcher$1 cardInputWidget$cardValidTextWatcher$13;
                kotlin.jvm.internal.s.g(property, "property");
                boolean booleanValue = bool2.booleanValue();
                bool.booleanValue();
                if (booleanValue) {
                    this.getPostalCodeEditText$payments_core_release().setEnabled(true);
                    this.getPostalCodeTextInputLayout$payments_core_release().setVisibility(0);
                    this.getCvcEditText$payments_core_release().setImeOptions(5);
                    PostalCodeEditText postalCodeEditText$payments_core_release = this.getPostalCodeEditText$payments_core_release();
                    cardInputWidget$cardValidTextWatcher$12 = this.cardValidTextWatcher;
                    postalCodeEditText$payments_core_release.removeTextChangedListener(cardInputWidget$cardValidTextWatcher$12);
                    PostalCodeEditText postalCodeEditText$payments_core_release2 = this.getPostalCodeEditText$payments_core_release();
                    cardInputWidget$cardValidTextWatcher$13 = this.cardValidTextWatcher;
                    postalCodeEditText$payments_core_release2.addTextChangedListener(cardInputWidget$cardValidTextWatcher$13);
                } else {
                    this.getPostalCodeEditText$payments_core_release().setEnabled(false);
                    this.getPostalCodeTextInputLayout$payments_core_release().setVisibility(8);
                    this.getCvcEditText$payments_core_release().setImeOptions(6);
                    PostalCodeEditText postalCodeEditText$payments_core_release3 = this.getPostalCodeEditText$payments_core_release();
                    cardInputWidget$cardValidTextWatcher$1 = this.cardValidTextWatcher;
                    postalCodeEditText$payments_core_release3.removeTextChangedListener(cardInputWidget$cardValidTextWatcher$1);
                }
                this.updatePostalRequired();
            }
        };
        Boolean bool = Boolean.FALSE;
        this.postalCodeRequired$delegate = new kotlin.properties.b<Boolean>(bool) { // from class: com.stripe.android.view.CardInputWidget$special$$inlined$observable$2
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, Boolean bool2, Boolean bool3) {
                kotlin.jvm.internal.s.g(property, "property");
                bool3.booleanValue();
                bool2.booleanValue();
                CardInputWidget.access$updatePostalRequired(this);
            }
        };
        this.usZipCodeRequired$delegate = new kotlin.properties.b<Boolean>(bool) { // from class: com.stripe.android.view.CardInputWidget$special$$inlined$observable$3
            @Override // kotlin.properties.b
            protected void afterChange(n00.m<?> property, Boolean bool2, Boolean bool3) {
                kotlin.jvm.internal.s.g(property, "property");
                boolean booleanValue = bool3.booleanValue();
                bool2.booleanValue();
                if (booleanValue) {
                    this.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.Config.US);
                } else {
                    this.getPostalCodeEditText$payments_core_release().setConfig$payments_core_release(PostalCodeEditText.Config.Global);
                }
                CardInputWidget.access$updatePostalRequired(this);
            }
        };
        if (getId() == -1) {
            setId(DEFAULT_READER_ID);
        }
        setOrientation(0);
        setMinimumWidth(getResources().getDimensionPixelSize(R.dimen.stripe_card_widget_min_width));
        this.frameWidthSupplier = new AnonymousClass1();
        g11 = x0.g(cardNumberEditText, cvcEditText, expiryDateEditText);
        this.requiredFields = g11;
        n11 = y0.n(g11, postalCodeEditText);
        this.allFields = n11;
        initView(attributeSet);
        this.hiddenCardText = createHiddenCardText$payments_core_release(cardNumberEditText.getPanLength$payments_core_release());
    }
}