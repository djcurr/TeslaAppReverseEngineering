package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.v1;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.databinding.PrimaryButtonBinding;
import com.stripe.android.ui.core.PaymentsThemeDefaults;
import com.stripe.android.ui.core.PaymentsThemeKt;
import com.stripe.android.ui.core.PrimaryButtonStyle;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import wz.e0;
import wz.v;
import wz.w;

/* loaded from: classes6.dex */
public final class PrimaryButton extends FrameLayout {
    private final PrimaryButtonAnimator animator;
    private int borderStrokeColor;
    private float borderStrokeWidth;
    private final ImageView confirmedIcon;
    private float cornerRadius;
    private ColorStateList defaultTintList;
    private String externalLabel;
    private boolean lockVisible;
    private String originalLabel;
    private State state;
    private final PrimaryButtonBinding viewBinding;

    /* loaded from: classes6.dex */
    public static abstract class State {

        /* loaded from: classes6.dex */
        public static final class FinishProcessing extends State {
            public static final int $stable = 0;
            private final h00.a<b0> onComplete;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public FinishProcessing(h00.a<b0> onComplete) {
                super(null);
                s.g(onComplete, "onComplete");
                this.onComplete = onComplete;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ FinishProcessing copy$default(FinishProcessing finishProcessing, h00.a aVar, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    aVar = finishProcessing.onComplete;
                }
                return finishProcessing.copy(aVar);
            }

            public final h00.a<b0> component1() {
                return this.onComplete;
            }

            public final FinishProcessing copy(h00.a<b0> onComplete) {
                s.g(onComplete, "onComplete");
                return new FinishProcessing(onComplete);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinishProcessing) && s.c(this.onComplete, ((FinishProcessing) obj).onComplete);
            }

            public final h00.a<b0> getOnComplete() {
                return this.onComplete;
            }

            public int hashCode() {
                return this.onComplete.hashCode();
            }

            public String toString() {
                return "FinishProcessing(onComplete=" + this.onComplete + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Ready extends State {
            public static final int $stable = 0;
            public static final Ready INSTANCE = new Ready();

            private Ready() {
                super(null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class StartProcessing extends State {
            public static final int $stable = 0;
            public static final StartProcessing INSTANCE = new StartProcessing();

            private StartProcessing() {
                super(null);
            }
        }

        private State() {
        }

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class UIState {
        private final boolean enabled;
        private final String label;
        private final h00.a<b0> onClick;
        private final boolean visible;

        public UIState(String str, h00.a<b0> aVar, boolean z11, boolean z12) {
            this.label = str;
            this.onClick = aVar;
            this.enabled = z11;
            this.visible = z12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ UIState copy$default(UIState uIState, String str, h00.a aVar, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = uIState.label;
            }
            if ((i11 & 2) != 0) {
                aVar = uIState.onClick;
            }
            if ((i11 & 4) != 0) {
                z11 = uIState.enabled;
            }
            if ((i11 & 8) != 0) {
                z12 = uIState.visible;
            }
            return uIState.copy(str, aVar, z11, z12);
        }

        public final String component1() {
            return this.label;
        }

        public final h00.a<b0> component2() {
            return this.onClick;
        }

        public final boolean component3() {
            return this.enabled;
        }

        public final boolean component4() {
            return this.visible;
        }

        public final UIState copy(String str, h00.a<b0> aVar, boolean z11, boolean z12) {
            return new UIState(str, aVar, z11, z12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof UIState) {
                UIState uIState = (UIState) obj;
                return s.c(this.label, uIState.label) && s.c(this.onClick, uIState.onClick) && this.enabled == uIState.enabled && this.visible == uIState.visible;
            }
            return false;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final String getLabel() {
            return this.label;
        }

        public final h00.a<b0> getOnClick() {
            return this.onClick;
        }

        public final boolean getVisible() {
            return this.visible;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.label;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            h00.a<b0> aVar = this.onClick;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            boolean z11 = this.enabled;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode2 + i11) * 31;
            boolean z12 = this.visible;
            return i12 + (z12 ? 1 : z12 ? 1 : 0);
        }

        public String toString() {
            return "UIState(label=" + ((Object) this.label) + ", onClick=" + this.onClick + ", enabled=" + this.enabled + ", visible=" + this.visible + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ PrimaryButton(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static /* synthetic */ void getExternalLabel$paymentsheet_release$annotations() {
    }

    private final CharSequence getTextAttributeValue(AttributeSet attributeSet) {
        List d11;
        int[] N0;
        Context context = getContext();
        s.f(context, "context");
        d11 = v.d(16843087);
        N0 = e0.N0(d11);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N0, 0, 0);
        s.f(obtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        CharSequence text = obtainStyledAttributes.getText(0);
        obtainStyledAttributes.recycle();
        return text;
    }

    public static /* synthetic */ void getViewBinding$paymentsheet_release$annotations() {
    }

    private final void onFinishProcessing(h00.a<b0> aVar) {
        setClickable(false);
        setBackgroundTintList(ColorStateList.valueOf(getResources().getColor(R.color.stripe_paymentsheet_primary_button_success_background)));
        PrimaryButtonAnimator primaryButtonAnimator = this.animator;
        ComposeView composeView = this.viewBinding.label;
        s.f(composeView, "viewBinding.label");
        primaryButtonAnimator.fadeOut$paymentsheet_release(composeView);
        PrimaryButtonAnimator primaryButtonAnimator2 = this.animator;
        CircularProgressIndicator circularProgressIndicator = this.viewBinding.confirmingIcon;
        s.f(circularProgressIndicator, "viewBinding.confirmingIcon");
        primaryButtonAnimator2.fadeOut$paymentsheet_release(circularProgressIndicator);
        this.animator.fadeIn$paymentsheet_release(this.confirmedIcon, getWidth(), new PrimaryButton$onFinishProcessing$1(aVar));
    }

    private final void onReadyState() {
        setClickable(true);
        String str = this.originalLabel;
        if (str != null) {
            setLabel(str);
        }
        ColorStateList colorStateList = this.defaultTintList;
        if (colorStateList != null) {
            setBackgroundTintList(colorStateList);
        }
        ImageView imageView = this.viewBinding.lockIcon;
        s.f(imageView, "viewBinding.lockIcon");
        imageView.setVisibility(this.lockVisible ? 0 : 8);
        CircularProgressIndicator circularProgressIndicator = this.viewBinding.confirmingIcon;
        s.f(circularProgressIndicator, "viewBinding.confirmingIcon");
        circularProgressIndicator.setVisibility(8);
    }

    private final void onStartProcessing() {
        ImageView imageView = this.viewBinding.lockIcon;
        s.f(imageView, "viewBinding.lockIcon");
        imageView.setVisibility(8);
        CircularProgressIndicator circularProgressIndicator = this.viewBinding.confirmingIcon;
        s.f(circularProgressIndicator, "viewBinding.confirmingIcon");
        circularProgressIndicator.setVisibility(0);
        setClickable(false);
        setLabel(getResources().getString(R.string.stripe_paymentsheet_primary_button_processing));
    }

    private final void updateAlpha() {
        List<View> l11;
        ComposeView composeView = this.viewBinding.label;
        s.f(composeView, "viewBinding.label");
        ImageView imageView = this.viewBinding.lockIcon;
        s.f(imageView, "viewBinding.lockIcon");
        l11 = w.l(composeView, imageView);
        for (View view : l11) {
            State state = this.state;
            view.setAlpha(((state == null || (state instanceof State.Ready)) && !isEnabled()) ? 0.5f : 1.0f);
        }
    }

    public final String getExternalLabel$paymentsheet_release() {
        return this.externalLabel;
    }

    public final boolean getLockVisible$paymentsheet_release() {
        return this.lockVisible;
    }

    public final PrimaryButtonBinding getViewBinding$paymentsheet_release() {
        return this.viewBinding;
    }

    public final void setAppearanceConfiguration(PrimaryButtonStyle primaryButtonStyle, ColorStateList colorStateList) {
        s.g(primaryButtonStyle, "primaryButtonStyle");
        Context context = getContext();
        s.f(context, "context");
        this.cornerRadius = PaymentsThemeKt.m394convertDpToPx3ABfNKs(context, x2.g.f(primaryButtonStyle.getShape().getCornerRadius()));
        Context context2 = getContext();
        s.f(context2, "context");
        this.borderStrokeWidth = PaymentsThemeKt.m394convertDpToPx3ABfNKs(context2, x2.g.f(primaryButtonStyle.getShape().getBorderStrokeWidth()));
        Context context3 = getContext();
        s.f(context3, "context");
        this.borderStrokeColor = PaymentsThemeKt.getBorderStrokeColor(primaryButtonStyle, context3);
        ImageView imageView = this.viewBinding.lockIcon;
        Context context4 = getContext();
        s.f(context4, "context");
        imageView.setImageTintList(ColorStateList.valueOf(PaymentsThemeKt.getOnBackgroundColor(primaryButtonStyle, context4)));
        setBackgroundTintList(colorStateList);
        this.defaultTintList = colorStateList;
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(this.cornerRadius);
        gradientDrawable.setColor(colorStateList);
        gradientDrawable.setStroke((int) this.borderStrokeWidth, this.borderStrokeColor);
        setBackground(gradientDrawable);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.stripe_paymentsheet_primary_button_padding);
        setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        updateAlpha();
    }

    public final void setExternalLabel$paymentsheet_release(String str) {
        this.externalLabel = str;
    }

    public final void setLabel(String str) {
        this.externalLabel = str;
        if (str == null) {
            return;
        }
        if (!(this.state instanceof State.StartProcessing)) {
            this.originalLabel = str;
        }
        getViewBinding$paymentsheet_release().label.setContent(j1.c.c(-985538415, true, new PrimaryButton$setLabel$1$1(str)));
    }

    public final void setLockVisible$paymentsheet_release(boolean z11) {
        this.lockVisible = z11;
    }

    public final void updateState(State state) {
        this.state = state;
        updateAlpha();
        if (state instanceof State.Ready) {
            onReadyState();
        } else if (s.c(state, State.StartProcessing.INSTANCE)) {
            onStartProcessing();
        } else if (state instanceof State.FinishProcessing) {
            onFinishProcessing(((State.FinishProcessing) state).getOnComplete());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        this.animator = new PrimaryButtonAnimator(context);
        PrimaryButtonBinding inflate = PrimaryButtonBinding.inflate(LayoutInflater.from(context), this);
        s.f(inflate, "inflate(\n        LayoutI…text),\n        this\n    )");
        this.viewBinding = inflate;
        this.lockVisible = true;
        ImageView imageView = inflate.confirmedIcon;
        s.f(imageView, "viewBinding.confirmedIcon");
        this.confirmedIcon = imageView;
        PaymentsThemeDefaults paymentsThemeDefaults = PaymentsThemeDefaults.INSTANCE;
        this.cornerRadius = PaymentsThemeKt.m394convertDpToPx3ABfNKs(context, x2.g.f(paymentsThemeDefaults.getPrimaryButtonStyle().getShape().getCornerRadius()));
        this.borderStrokeWidth = PaymentsThemeKt.m394convertDpToPx3ABfNKs(context, x2.g.f(paymentsThemeDefaults.getPrimaryButtonStyle().getShape().getBorderStrokeWidth()));
        this.borderStrokeColor = PaymentsThemeKt.getBorderStrokeColor(paymentsThemeDefaults.getPrimaryButtonStyle(), context);
        inflate.label.setViewCompositionStrategy(v1.b.f3127a);
        CharSequence textAttributeValue = getTextAttributeValue(attributeSet);
        if (textAttributeValue != null) {
            setLabel(textAttributeValue.toString());
        }
        setClickable(true);
        setEnabled(false);
    }
}