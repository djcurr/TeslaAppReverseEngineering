package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.c0;
import androidx.core.view.a0;
import androidx.core.widget.m;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.CheckableImageButton;
import fk.j;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import wk.k;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEF_STYLE_RES = j.f26504h;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final long PLACEHOLDER_FADE_DURATION = 87;
    private static final long PLACEHOLDER_START_DELAY = 67;
    private ValueAnimator animator;
    private wk.g boxBackground;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private wk.g boxUnderline;
    final com.google.android.material.internal.a collapsingTextHelper;
    boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    EditText editText;
    private final LinkedHashSet<f> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final LinkedHashSet<g> endIconChangedListeners;
    private final SparseArray<com.google.android.material.textfield.e> endIconDelegates;
    private final FrameLayout endIconFrame;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;
    private final CheckableImageButton endIconView;
    private final LinearLayout endLayout;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private final CheckableImageButton errorIconView;
    private boolean expandedHintEnabled;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private boolean hasEndIconTintList;
    private boolean hasEndIconTintMode;
    private boolean hasStartIconTintList;
    private boolean hasStartIconTintMode;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final com.google.android.material.textfield.f indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private int maxWidth;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    private CharSequence originalHint;
    private boolean placeholderEnabled;
    private androidx.transition.f placeholderFadeIn;
    private androidx.transition.f placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private boolean restoringSavedState;
    private k shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private View.OnLongClickListener startIconOnLongClickListener;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final LinearLayout startLayout;
    private ColorStateList strokeErrorColor;
    private CharSequence suffixText;
    private final TextView suffixTextView;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.updateLabelState(!textInputLayout.restoringSavedState);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.counterEnabled) {
                textInputLayout2.updateCounter(editable.length());
            }
            if (TextInputLayout.this.placeholderEnabled) {
                TextInputLayout.this.updatePlaceholderText(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }

    /* loaded from: classes3.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.endIconView.performClick();
            TextInputLayout.this.endIconView.jumpDrawablesToCurrentState();
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.editText.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.collapsingTextHelper.Z(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* loaded from: classes3.dex */
    public static class e extends androidx.core.view.a {

        /* renamed from: a  reason: collision with root package name */
        private final TextInputLayout f15651a;

        public e(TextInputLayout textInputLayout) {
            this.f15651a = textInputLayout;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, w3.c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            EditText editText = this.f15651a.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f15651a.getHint();
            CharSequence error = this.f15651a.getError();
            CharSequence placeholderText = this.f15651a.getPlaceholderText();
            int counterMaxLength = this.f15651a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f15651a.getCounterOverflowDescription();
            boolean z11 = !TextUtils.isEmpty(text);
            boolean z12 = !TextUtils.isEmpty(hint);
            boolean z13 = !this.f15651a.isHintExpanded();
            boolean z14 = !TextUtils.isEmpty(error);
            boolean z15 = z14 || !TextUtils.isEmpty(counterOverflowDescription);
            String charSequence = z12 ? hint.toString() : "";
            if (z11) {
                cVar.J0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                cVar.J0(charSequence);
                if (z13 && placeholderText != null) {
                    cVar.J0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                cVar.J0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.p0(charSequence);
                } else {
                    if (z11) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    cVar.J0(charSequence);
                }
                cVar.F0(!z11);
            }
            cVar.t0((text == null || text.length() != counterMaxLength) ? -1 : -1);
            if (z15) {
                if (!z14) {
                    error = counterOverflowDescription;
                }
                cVar.l0(error);
            }
            if (Build.VERSION.SDK_INT < 17 || editText == null) {
                return;
            }
            editText.setLabelFor(fk.f.O);
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    /* loaded from: classes3.dex */
    public interface g {
        void a(TextInputLayout textInputLayout, int i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class h extends a4.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        CharSequence f15652c;

        /* renamed from: d  reason: collision with root package name */
        boolean f15653d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f15654e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f15655f;

        /* renamed from: g  reason: collision with root package name */
        CharSequence f15656g;

        /* loaded from: classes3.dex */
        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public h[] newArray(int i11) {
                return new h[i11];
            }
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f15652c) + " hint=" + ((Object) this.f15654e) + " helperText=" + ((Object) this.f15655f) + " placeholderText=" + ((Object) this.f15656g) + "}";
        }

        @Override // a4.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            TextUtils.writeToParcel(this.f15652c, parcel, i11);
            parcel.writeInt(this.f15653d ? 1 : 0);
            TextUtils.writeToParcel(this.f15654e, parcel, i11);
            TextUtils.writeToParcel(this.f15655f, parcel, i11);
            TextUtils.writeToParcel(this.f15656g, parcel, i11);
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f15652c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f15653d = parcel.readInt() == 1;
            this.f15654e = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f15655f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f15656g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        if (this.editText == null || this.boxBackgroundMode != 1) {
            return;
        }
        if (tk.c.h(getContext())) {
            EditText editText = this.editText;
            a0.K0(editText, a0.K(editText), getResources().getDimensionPixelSize(fk.d.f26412p), a0.J(this.editText), getResources().getDimensionPixelSize(fk.d.f26411o));
        } else if (tk.c.g(getContext())) {
            EditText editText2 = this.editText;
            a0.K0(editText2, a0.K(editText2), getResources().getDimensionPixelSize(fk.d.f26410n), a0.J(this.editText), getResources().getDimensionPixelSize(fk.d.f26409m));
        }
    }

    private void applyBoxAttributes() {
        wk.g gVar = this.boxBackground;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.shapeAppearanceModel);
        if (canDrawOutlineStroke()) {
            this.boxBackground.f0(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int calculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = calculateBoxBackgroundColor;
        this.boxBackground.Y(ColorStateList.valueOf(calculateBoxBackgroundColor));
        if (this.endIconMode == 3) {
            this.editText.getBackground().invalidateSelf();
        }
        applyBoxUnderlineAttributes();
        invalidate();
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderline == null) {
            return;
        }
        if (canDrawStroke()) {
            this.boxUnderline.Y(ColorStateList.valueOf(this.boxStrokeColor));
        }
        invalidate();
    }

    private void applyCutoutPadding(RectF rectF) {
        float f11 = rectF.left;
        int i11 = this.boxLabelCutoutPaddingPx;
        rectF.left = f11 - i11;
        rectF.right += i11;
    }

    private void applyEndIconTint() {
        applyIconTint(this.endIconView, this.hasEndIconTintList, this.endIconTintList, this.hasEndIconTintMode, this.endIconTintMode);
    }

    private void applyIconTint(CheckableImageButton checkableImageButton, boolean z11, ColorStateList colorStateList, boolean z12, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z11 || z12)) {
            drawable = n3.a.r(drawable).mutate();
            if (z11) {
                n3.a.o(drawable, colorStateList);
            }
            if (z12) {
                n3.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void applyStartIconTint() {
        applyIconTint(this.startIconView, this.hasStartIconTintList, this.startIconTintList, this.hasStartIconTintMode, this.startIconTintMode);
    }

    private void assignBoxBackgroundByMode() {
        int i11 = this.boxBackgroundMode;
        if (i11 == 0) {
            this.boxBackground = null;
            this.boxUnderline = null;
        } else if (i11 == 1) {
            this.boxBackground = new wk.g(this.shapeAppearanceModel);
            this.boxUnderline = new wk.g();
        } else if (i11 == 2) {
            if (this.hintEnabled && !(this.boxBackground instanceof com.google.android.material.textfield.c)) {
                this.boxBackground = new com.google.android.material.textfield.c(this.shapeAppearanceModel);
            } else {
                this.boxBackground = new wk.g(this.shapeAppearanceModel);
            }
            this.boxUnderline = null;
        } else {
            throw new IllegalArgumentException(this.boxBackgroundMode + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
    }

    private int calculateBoxBackgroundColor() {
        return this.boxBackgroundMode == 1 ? kk.a.g(kk.a.e(this, fk.b.f26378n, 0), this.boxBackgroundColor) : this.boxBackgroundColor;
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
        if (this.editText != null) {
            Rect rect2 = this.tmpBoundsRect;
            boolean z11 = a0.F(this) == 1;
            rect2.bottom = rect.bottom;
            int i11 = this.boxBackgroundMode;
            if (i11 == 1) {
                rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, z11);
                rect2.top = rect.top + this.boxCollapsedPaddingTopPx;
                rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, z11);
                return rect2;
            } else if (i11 != 2) {
                rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, z11);
                rect2.top = getPaddingTop();
                rect2.right = getLabelRightBoundAlignedWithSuffix(rect.right, z11);
                return rect2;
            } else {
                rect2.left = rect.left + this.editText.getPaddingLeft();
                rect2.top = rect.top - calculateLabelMarginTop();
                rect2.right = rect.right - this.editText.getPaddingRight();
                return rect2;
            }
        }
        throw new IllegalStateException();
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f11) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect2.top + f11);
        }
        return rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(Rect rect, float f11) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect.centerY() - (f11 / 2.0f));
        }
        return rect.top + this.editText.getCompoundPaddingTop();
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
        if (this.editText != null) {
            Rect rect2 = this.tmpBoundsRect;
            float w11 = this.collapsingTextHelper.w();
            rect2.left = rect.left + this.editText.getCompoundPaddingLeft();
            rect2.top = calculateExpandedLabelTop(rect, w11);
            rect2.right = rect.right - this.editText.getCompoundPaddingRight();
            rect2.bottom = calculateExpandedLabelBottom(rect, rect2, w11);
            return rect2;
        }
        throw new IllegalStateException();
    }

    private int calculateLabelMarginTop() {
        float q11;
        if (this.hintEnabled) {
            int i11 = this.boxBackgroundMode;
            if (i11 == 0 || i11 == 1) {
                q11 = this.collapsingTextHelper.q();
            } else if (i11 != 2) {
                return 0;
            } else {
                q11 = this.collapsingTextHelper.q() / 2.0f;
            }
            return (int) q11;
        }
        return 0;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((com.google.android.material.textfield.c) this.boxBackground).p0();
        }
    }

    private void collapseHint(boolean z11) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z11 && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.Z(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        updatePrefixTextVisibility();
        updateSuffixTextVisibility();
    }

    private androidx.transition.f createPlaceholderFadeTransition() {
        androidx.transition.f fVar = new androidx.transition.f();
        fVar.setDuration(PLACEHOLDER_FADE_DURATION);
        fVar.setInterpolator(gk.a.f27993a);
        return fVar;
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof com.google.android.material.textfield.c);
    }

    private void dispatchOnEditTextAttached() {
        Iterator<f> it2 = this.editTextAttachedListeners.iterator();
        while (it2.hasNext()) {
            it2.next().a(this);
        }
    }

    private void dispatchOnEndIconChanged(int i11) {
        Iterator<g> it2 = this.endIconChangedListeners.iterator();
        while (it2.hasNext()) {
            it2.next().a(this, i11);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        wk.g gVar = this.boxUnderline;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.boxStrokeWidthPx;
            this.boxUnderline.draw(canvas);
        }
    }

    private void drawHint(Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.l(canvas);
        }
    }

    private void expandHint(boolean z11) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z11 && this.hintAnimationEnabled) {
            animateToExpansionFraction(BitmapDescriptorFactory.HUE_RED);
        } else {
            this.collapsingTextHelper.Z(BitmapDescriptorFactory.HUE_RED);
        }
        if (cutoutEnabled() && ((com.google.android.material.textfield.c) this.boxBackground).m0()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        updatePrefixTextVisibility();
        updateSuffixTextVisibility();
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = this.endIconDelegates.get(this.endIconMode);
        return eVar != null ? eVar : this.endIconDelegates.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.errorIconView.getVisibility() == 0) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    private int getLabelLeftBoundAlightWithPrefix(int i11, boolean z11) {
        int compoundPaddingLeft = i11 + this.editText.getCompoundPaddingLeft();
        return (this.prefixText == null || z11) ? compoundPaddingLeft : (compoundPaddingLeft - this.prefixTextView.getMeasuredWidth()) + this.prefixTextView.getPaddingLeft();
    }

    private int getLabelRightBoundAlignedWithSuffix(int i11, boolean z11) {
        int compoundPaddingRight = i11 - this.editText.getCompoundPaddingRight();
        return (this.prefixText == null || !z11) ? compoundPaddingRight : compoundPaddingRight + (this.prefixTextView.getMeasuredWidth() - this.prefixTextView.getPaddingRight());
    }

    private boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        textView.setText((CharSequence) null);
        androidx.transition.a0.a(this.inputFrame, this.placeholderFadeOut);
        this.placeholderTextView.setVisibility(4);
    }

    private boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && (Build.VERSION.SDK_INT < 16 || this.editText.getMinLines() <= 1);
    }

    private int[] mergeIconState(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        return copyOf;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        setEditTextBoxBackground();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
    }

    private void openCutout() {
        if (cutoutEnabled()) {
            RectF rectF = this.tmpRectF;
            this.collapsingTextHelper.o(rectF, this.editText.getWidth(), this.editText.getGravity());
            applyCutoutPadding(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.boxStrokeWidthPx);
            ((com.google.android.material.textfield.c) this.boxBackground).s0(rectF);
        }
    }

    private void recalculateCutout() {
        if (!cutoutEnabled() || this.hintExpanded) {
            return;
        }
        closeCutout();
        openCutout();
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z11) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            childAt.setEnabled(z11);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z11);
            }
        }
    }

    private void refreshIconDrawableState(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(mergeIconState(checkableImageButton), colorStateList.getDefaultColor());
        Drawable mutate = n3.a.r(drawable).mutate();
        n3.a.o(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setEditText(EditText editText) {
        if (this.editText == null) {
            if (this.endIconMode != 3 && !(editText instanceof TextInputEditText)) {
                Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.editText = editText;
            setMinWidth(this.minWidth);
            setMaxWidth(this.maxWidth);
            onApplyBoxBackgroundMode();
            setTextInputAccessibilityDelegate(new e(this));
            this.collapsingTextHelper.f0(this.editText.getTypeface());
            this.collapsingTextHelper.X(this.editText.getTextSize());
            int gravity = this.editText.getGravity();
            this.collapsingTextHelper.P((gravity & (-113)) | 48);
            this.collapsingTextHelper.W(gravity);
            this.editText.addTextChangedListener(new a());
            if (this.defaultHintTextColor == null) {
                this.defaultHintTextColor = this.editText.getHintTextColors();
            }
            if (this.hintEnabled) {
                if (TextUtils.isEmpty(this.hint)) {
                    CharSequence hint = this.editText.getHint();
                    this.originalHint = hint;
                    setHint(hint);
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.counterView != null) {
                updateCounter(this.editText.getText().length());
            }
            updateEditTextBackground();
            this.indicatorViewController.e();
            this.startLayout.bringToFront();
            this.endLayout.bringToFront();
            this.endIconFrame.bringToFront();
            this.errorIconView.bringToFront();
            dispatchOnEditTextAttached();
            updatePrefixTextViewPadding();
            updateSuffixTextViewPadding();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            updateLabelState(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setEditTextBoxBackground() {
        if (shouldUseEditTextBackgroundForBoxBackground()) {
            a0.z0(this.editText, this.boxBackground);
        }
    }

    private void setErrorIconVisible(boolean z11) {
        this.errorIconView.setVisibility(z11 ? 0 : 8);
        this.endIconFrame.setVisibility(z11 ? 8 : 0);
        updateSuffixTextViewPadding();
        if (hasEndIcon()) {
            return;
        }
        updateDummyDrawables();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.hint)) {
            return;
        }
        this.hint = charSequence;
        this.collapsingTextHelper.d0(charSequence);
        if (this.hintExpanded) {
            return;
        }
        openCutout();
    }

    private static void setIconClickable(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean U = a0.U(checkableImageButton);
        boolean z11 = false;
        boolean z12 = onLongClickListener != null;
        if (U || z12) {
            z11 = true;
        }
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(U);
        checkableImageButton.setPressable(U);
        checkableImageButton.setLongClickable(z12);
        a0.G0(checkableImageButton, z11 ? 1 : 2);
    }

    private static void setIconOnClickListener(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private static void setIconOnLongClickListener(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private void setPlaceholderTextEnabled(boolean z11) {
        if (this.placeholderEnabled == z11) {
            return;
        }
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.placeholderTextView = appCompatTextView;
            appCompatTextView.setId(fk.f.P);
            androidx.transition.f createPlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = createPlaceholderFadeTransition;
            createPlaceholderFadeTransition.setStartDelay(PLACEHOLDER_START_DELAY);
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            a0.y0(this.placeholderTextView, 1);
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
            addPlaceholderTextView();
        } else {
            removePlaceholderTextView();
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = z11;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.errorIconView.getVisibility() == 0 || ((hasEndIcon() && isEndIconVisible()) || this.suffixText != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return !(getStartIconDrawable() == null && this.prefixText == null) && this.startLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUseEditTextBackgroundForBoxBackground() {
        EditText editText = this.editText;
        return (editText == null || this.boxBackground == null || editText.getBackground() != null || this.boxBackgroundMode == 0) ? false : true;
    }

    private void showPlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        textView.setText(this.placeholderText);
        androidx.transition.a0.a(this.inputFrame, this.placeholderFadeIn);
        this.placeholderTextView.setVisibility(0);
        this.placeholderTextView.bringToFront();
    }

    private void tintEndIconOnError(boolean z11) {
        if (z11 && getEndIconDrawable() != null) {
            Drawable mutate = n3.a.r(getEndIconDrawable()).mutate();
            n3.a.n(mutate, this.indicatorViewController.o());
            this.endIconView.setImageDrawable(mutate);
            return;
        }
        applyEndIconTint();
    }

    private void updateBoxCollapsedPaddingTop() {
        if (this.boxBackgroundMode == 1) {
            if (tk.c.h(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(fk.d.f26414r);
            } else if (tk.c.g(getContext())) {
                this.boxCollapsedPaddingTopPx = getResources().getDimensionPixelSize(fk.d.f26413q);
            }
        }
    }

    private void updateBoxUnderlineBounds(Rect rect) {
        wk.g gVar = this.boxUnderline;
        if (gVar != null) {
            int i11 = rect.bottom;
            gVar.setBounds(rect.left, i11 - this.boxStrokeWidthFocusedPx, rect.right, i11);
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText = this.editText;
            updateCounter(editText == null ? 0 : editText.getText().length());
        }
    }

    private static void updateCounterContentDescription(Context context, TextView textView, int i11, int i12, boolean z11) {
        textView.setContentDescription(context.getString(z11 ? fk.i.f26483c : fk.i.f26482b, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    private boolean updateDummyDrawables() {
        boolean z11;
        if (this.editText == null) {
            return false;
        }
        boolean z12 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int measuredWidth = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a11 = m.a(this.editText);
            Drawable drawable = a11[0];
            Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                m.i(this.editText, drawable2, a11[1], a11[2], a11[3]);
                z11 = true;
            }
            z11 = false;
        } else {
            if (this.startDummyDrawable != null) {
                Drawable[] a12 = m.a(this.editText);
                m.i(this.editText, null, a12[1], a12[2], a12[3]);
                this.startDummyDrawable = null;
                z11 = true;
            }
            z11 = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth2 = this.suffixTextView.getMeasuredWidth() - this.editText.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + androidx.core.view.h.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] a13 = m.a(this.editText);
            Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 != null && this.endDummyDrawableWidth != measuredWidth2) {
                this.endDummyDrawableWidth = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                m.i(this.editText, a13[0], a13[1], this.endDummyDrawable, a13[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.endDummyDrawable = colorDrawable2;
                    this.endDummyDrawableWidth = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = a13[2];
                Drawable drawable5 = this.endDummyDrawable;
                if (drawable4 != drawable5) {
                    this.originalEditTextEndDrawable = a13[2];
                    m.i(this.editText, a13[0], a13[1], drawable5, a13[3]);
                } else {
                    z12 = z11;
                }
            }
        } else if (this.endDummyDrawable == null) {
            return z11;
        } else {
            Drawable[] a14 = m.a(this.editText);
            if (a14[2] == this.endDummyDrawable) {
                m.i(this.editText, a14[0], a14[1], this.originalEditTextEndDrawable, a14[3]);
            } else {
                z12 = z11;
            }
            this.endDummyDrawable = null;
        }
        return z12;
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int max;
        if (this.editText != null && this.editText.getMeasuredHeight() < (max = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            this.editText.setMinimumHeight(max);
            return true;
        }
        return false;
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int calculateLabelMarginTop = calculateLabelMarginTop();
            if (calculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = calculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText;
        if (this.placeholderTextView == null || (editText = this.editText) == null) {
            return;
        }
        this.placeholderTextView.setGravity(editText.getGravity());
        this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
    }

    private void updatePlaceholderText() {
        EditText editText = this.editText;
        updatePlaceholderText(editText == null ? 0 : editText.getText().length());
    }

    private void updatePrefixTextViewPadding() {
        if (this.editText == null) {
            return;
        }
        a0.K0(this.prefixTextView, isStartIconVisible() ? 0 : a0.K(this.editText), this.editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(fk.d.f26418v), this.editText.getCompoundPaddingBottom());
    }

    private void updatePrefixTextVisibility() {
        this.prefixTextView.setVisibility((this.prefixText == null || isHintExpanded()) ? 8 : 0);
        updateDummyDrawables();
    }

    private void updateStrokeErrorColor(boolean z11, boolean z12) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z11) {
            this.boxStrokeColor = colorForState2;
        } else if (z12) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    private void updateSuffixTextViewPadding() {
        if (this.editText == null) {
            return;
        }
        a0.K0(this.suffixTextView, getContext().getResources().getDimensionPixelSize(fk.d.f26418v), this.editText.getPaddingTop(), (isEndIconVisible() || isErrorIconVisible()) ? 0 : a0.J(this.editText), this.editText.getPaddingBottom());
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        boolean z11 = (this.suffixText == null || isHintExpanded()) ? false : true;
        this.suffixTextView.setVisibility(z11 ? 0 : 8);
        if (visibility != this.suffixTextView.getVisibility()) {
            getEndIconDelegate().c(z11);
        }
        updateDummyDrawables();
    }

    public void addOnEditTextAttachedListener(f fVar) {
        this.editTextAttachedListeners.add(fVar);
        if (this.editText != null) {
            fVar.a(this);
        }
    }

    public void addOnEndIconChangedListener(g gVar) {
        this.endIconChangedListeners.add(gVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.inputFrame.addView(view, layoutParams2);
            this.inputFrame.setLayoutParams(layoutParams);
            updateInputLayoutMargins();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i11, layoutParams);
    }

    void animateToExpansionFraction(float f11) {
        if (this.collapsingTextHelper.x() == f11) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(gk.a.f27994b);
            this.animator.setDuration(167L);
            this.animator.addUpdateListener(new d());
        }
        this.animator.setFloatValues(this.collapsingTextHelper.x(), f11);
        this.animator.start();
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    boolean cutoutIsOpen() {
        return cutoutEnabled() && ((com.google.android.material.textfield.c) this.boxBackground).m0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i11) {
        EditText editText = this.editText;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i11);
            return;
        }
        if (this.originalHint != null) {
            boolean z11 = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint = editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i11);
                return;
            } finally {
                this.editText.setHint(hint);
                this.isProvidingHint = z11;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i11);
        onProvideAutofillVirtualStructure(viewStructure, i11);
        viewStructure.setChildCount(this.inputFrame.getChildCount());
        for (int i12 = 0; i12 < this.inputFrame.getChildCount(); i12++) {
            View childAt = this.inputFrame.getChildAt(i12);
            ViewStructure newChild = viewStructure.newChild(i12);
            childAt.dispatchProvideAutofillStructure(newChild, i11);
            if (childAt == this.editText) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.inDrawableStateChanged) {
            return;
        }
        boolean z11 = true;
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.collapsingTextHelper;
        boolean c02 = aVar != null ? aVar.c0(drawableState) | false : false;
        if (this.editText != null) {
            if (!a0.a0(this) || !isEnabled()) {
                z11 = false;
            }
            updateLabelState(z11);
        }
        updateEditTextBackground();
        updateTextInputBoxState();
        if (c02) {
            invalidate();
        }
        this.inDrawableStateChanged = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.editText;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + calculateLabelMarginTop();
        }
        return super.getBaseline();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public wk.g getBoxBackground() {
        int i11 = this.boxBackgroundMode;
        if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException();
        }
        return this.boxBackground;
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.boxBackground.s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.boxBackground.t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.boxBackground.I();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.boxBackground.H();
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public CharSequence getError() {
        if (this.indicatorViewController.z()) {
            return this.indicatorViewController.n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.m();
    }

    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.o();
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.indicatorViewController.o();
    }

    public CharSequence getHelperText() {
        if (this.indicatorViewController.A()) {
            return this.indicatorViewController.q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.r();
    }

    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.t();
    }

    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.a();
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.z();
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.t();
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.A();
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.a();
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            com.google.android.material.internal.b.a(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.X(this.editText.getTextSize());
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.P((gravity & (-113)) | 48);
                this.collapsingTextHelper.W(gravity);
                this.collapsingTextHelper.L(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.T(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.H();
                if (!cutoutEnabled() || this.hintExpanded) {
                    return;
                }
                openCutout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        boolean updateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean updateDummyDrawables = updateDummyDrawables();
        if (updateEditTextHeightBasedOnIcon || updateDummyDrawables) {
            this.editText.post(new c());
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        updatePrefixTextViewPadding();
        updateSuffixTextViewPadding();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        setError(hVar.f15652c);
        if (hVar.f15653d) {
            this.endIconView.post(new b());
        }
        setHint(hVar.f15654e);
        setHelperText(hVar.f15655f);
        setPlaceholderText(hVar.f15656g);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.indicatorViewController.k()) {
            hVar.f15652c = getError();
        }
        hVar.f15653d = hasEndIcon() && this.endIconView.isChecked();
        hVar.f15654e = getHint();
        hVar.f15655f = getHelperText();
        hVar.f15656g = getPlaceholderText();
        return hVar;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z11) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z11) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void refreshEndIconDrawableState() {
        refreshIconDrawableState(this.endIconView, this.endIconTintList);
    }

    public void refreshErrorIconDrawableState() {
        refreshIconDrawableState(this.errorIconView, this.errorIconTintList);
    }

    public void refreshStartIconDrawableState() {
        refreshIconDrawableState(this.startIconView, this.startIconTintList);
    }

    public void removeOnEditTextAttachedListener(f fVar) {
        this.editTextAttachedListeners.remove(fVar);
    }

    public void removeOnEndIconChangedListener(g gVar) {
        this.endIconChangedListeners.remove(gVar);
    }

    public void setBoxBackgroundColor(int i11) {
        if (this.boxBackgroundColor != i11) {
            this.boxBackgroundColor = i11;
            this.defaultFilledBackgroundColor = i11;
            this.focusedFilledBackgroundColor = i11;
            this.hoveredFilledBackgroundColor = i11;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(int i11) {
        setBoxBackgroundColor(androidx.core.content.b.getColor(getContext(), i11));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i11) {
        if (i11 == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i11;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCollapsedPaddingTop(int i11) {
        this.boxCollapsedPaddingTopPx = i11;
    }

    public void setBoxCornerRadii(float f11, float f12, float f13, float f14) {
        wk.g gVar = this.boxBackground;
        if (gVar != null && gVar.H() == f11 && this.boxBackground.I() == f12 && this.boxBackground.t() == f14 && this.boxBackground.s() == f13) {
            return;
        }
        this.shapeAppearanceModel = this.shapeAppearanceModel.v().C(f11).G(f12).y(f14).u(f13).m();
        applyBoxAttributes();
    }

    public void setBoxCornerRadiiResources(int i11, int i12, int i13, int i14) {
        setBoxCornerRadii(getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i12), getContext().getResources().getDimension(i14), getContext().getResources().getDimension(i13));
    }

    public void setBoxStrokeColor(int i11) {
        if (this.focusedStrokeColor != i11) {
            this.focusedStrokeColor = i11;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.focusedStrokeColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
            this.focusedStrokeColor = colorStateList.getDefaultColor();
        }
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i11) {
        this.boxStrokeWidthDefaultPx = i11;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i11) {
        this.boxStrokeWidthFocusedPx = i11;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(int i11) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i11));
    }

    public void setBoxStrokeWidthResource(int i11) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i11));
    }

    public void setCounterEnabled(boolean z11) {
        if (this.counterEnabled != z11) {
            if (z11) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(fk.f.M);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.d(this.counterView, 2);
                androidx.core.view.h.d((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams(), getResources().getDimensionPixelOffset(fk.d.W));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.B(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z11;
        }
    }

    public void setCounterMaxLength(int i11) {
        if (this.counterMaxLength != i11) {
            if (i11 > 0) {
                this.counterMaxLength = i11;
            } else {
                this.counterMaxLength = -1;
            }
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i11) {
        if (this.counterOverflowTextAppearance != i11) {
            this.counterOverflowTextAppearance = i11;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i11) {
        if (this.counterTextAppearance != i11) {
            this.counterTextAppearance = i11;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        recursiveSetEnabled(this, z11);
        super.setEnabled(z11);
    }

    public void setEndIconActivated(boolean z11) {
        this.endIconView.setActivated(z11);
    }

    public void setEndIconCheckable(boolean z11) {
        this.endIconView.setCheckable(z11);
    }

    public void setEndIconContentDescription(int i11) {
        setEndIconContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setEndIconDrawable(int i11) {
        setEndIconDrawable(i11 != 0 ? h.a.d(getContext(), i11) : null);
    }

    public void setEndIconMode(int i11) {
        int i12 = this.endIconMode;
        this.endIconMode = i11;
        dispatchOnEndIconChanged(i12);
        setEndIconVisible(i11 != 0);
        if (getEndIconDelegate().b(this.boxBackgroundMode)) {
            getEndIconDelegate().a();
            applyEndIconTint();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.boxBackgroundMode + " is not supported by the end icon mode " + i11);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            this.hasEndIconTintList = true;
            applyEndIconTint();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            this.hasEndIconTintMode = true;
            applyEndIconTint();
        }
    }

    public void setEndIconVisible(boolean z11) {
        if (isEndIconVisible() != z11) {
            this.endIconView.setVisibility(z11 ? 0 : 8);
            updateSuffixTextViewPadding();
            updateDummyDrawables();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.indicatorViewController.z()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.O(charSequence);
        } else {
            this.indicatorViewController.u();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.indicatorViewController.D(charSequence);
    }

    public void setErrorEnabled(boolean z11) {
        this.indicatorViewController.E(z11);
    }

    public void setErrorIconDrawable(int i11) {
        setErrorIconDrawable(i11 != 0 ? h.a.d(getContext(), i11) : null);
        refreshErrorIconDrawableState();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.errorIconTintList = colorStateList;
        Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = n3.a.r(drawable).mutate();
            n3.a.o(drawable, colorStateList);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.errorIconView.getDrawable();
        if (drawable != null) {
            drawable = n3.a.r(drawable).mutate();
            n3.a.p(drawable, mode);
        }
        if (this.errorIconView.getDrawable() != drawable) {
            this.errorIconView.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i11) {
        this.indicatorViewController.F(i11);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z11) {
        if (this.expandedHintEnabled != z11) {
            this.expandedHintEnabled = z11;
            updateLabelState(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!isHelperTextEnabled()) {
            setHelperTextEnabled(true);
        }
        this.indicatorViewController.P(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z11) {
        this.indicatorViewController.I(z11);
    }

    public void setHelperTextTextAppearance(int i11) {
        this.indicatorViewController.H(i11);
    }

    public void setHint(CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z11) {
        this.hintAnimationEnabled = z11;
    }

    public void setHintEnabled(boolean z11) {
        if (z11 != this.hintEnabled) {
            this.hintEnabled = z11;
            if (!z11) {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(int i11) {
        this.collapsingTextHelper.M(i11);
        this.focusedTextColor = this.collapsingTextHelper.p();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.O(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public void setMaxWidth(int i11) {
        this.maxWidth = i11;
        EditText editText = this.editText;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMaxWidth(i11);
    }

    public void setMaxWidthResource(int i11) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    public void setMinWidth(int i11) {
        this.minWidth = i11;
        EditText editText = this.editText;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMinWidth(i11);
    }

    public void setMinWidthResource(int i11) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i11) {
        setPasswordVisibilityToggleContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i11) {
        setPasswordVisibilityToggleDrawable(i11 != 0 ? h.a.d(getContext(), i11) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z11) {
        if (z11 && this.endIconMode != 1) {
            setEndIconMode(1);
        } else if (z11) {
        } else {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        this.hasEndIconTintList = true;
        applyEndIconTint();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        this.hasEndIconTintMode = true;
        applyEndIconTint();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.placeholderEnabled && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(int i11) {
        this.placeholderTextAppearance = i11;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            m.n(textView, i11);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updatePrefixTextVisibility();
    }

    public void setPrefixTextAppearance(int i11) {
        m.n(this.prefixTextView, i11);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z11) {
        this.startIconView.setCheckable(z11);
    }

    public void setStartIconContentDescription(int i11) {
        setStartIconContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setStartIconDrawable(int i11) {
        setStartIconDrawable(i11 != 0 ? h.a.d(getContext(), i11) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            this.hasStartIconTintList = true;
            applyStartIconTint();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            this.hasStartIconTintMode = true;
            applyStartIconTint();
        }
    }

    public void setStartIconVisible(boolean z11) {
        if (isStartIconVisible() != z11) {
            this.startIconView.setVisibility(z11 ? 0 : 8);
            updatePrefixTextViewPadding();
            updateDummyDrawables();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(int i11) {
        m.n(this.suffixTextView, i11);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTextAppearanceCompatWithErrorFallback(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            androidx.core.widget.m.n(r3, r4)     // Catch: java.lang.Exception -> L1a
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1a
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1a
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1a
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1a
        L18:
            r4 = 0
            r0 = r4
        L1a:
            if (r0 == 0) goto L2e
            int r4 = fk.j.f26498b
            androidx.core.widget.m.n(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = fk.c.f26391a
            int r4 = androidx.core.content.b.getColor(r4, r0)
            r3.setTextColor(r4)
        L2e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.setTextAppearanceCompatWithErrorFallback(android.widget.TextView, int):void");
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.editText;
        if (editText != null) {
            a0.w0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            this.collapsingTextHelper.f0(typeface);
            this.indicatorViewController.L(typeface);
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (c0.a(background)) {
            background = background.mutate();
        }
        if (this.indicatorViewController.k()) {
            background.setColorFilter(androidx.appcompat.widget.i.e(this.indicatorViewController.o(), PorterDuff.Mode.SRC_IN));
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            background.setColorFilter(androidx.appcompat.widget.i.e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            n3.a.c(background);
            this.editText.refreshDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateLabelState(boolean z11) {
        updateLabelState(z11, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateTextInputBoxState() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z11 = false;
        boolean z12 = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        boolean z13 = isHovered() || ((editText = this.editText) != null && editText.isHovered());
        if (!isEnabled()) {
            this.boxStrokeColor = this.disabledColor;
        } else if (this.indicatorViewController.k()) {
            if (this.strokeErrorColor != null) {
                updateStrokeErrorColor(z12, z13);
            } else {
                this.boxStrokeColor = this.indicatorViewController.o();
            }
        } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
            if (z12) {
                this.boxStrokeColor = this.focusedStrokeColor;
            } else if (z13) {
                this.boxStrokeColor = this.hoveredStrokeColor;
            } else {
                this.boxStrokeColor = this.defaultStrokeColor;
            }
        } else if (this.strokeErrorColor != null) {
            updateStrokeErrorColor(z12, z13);
        } else {
            this.boxStrokeColor = textView.getCurrentTextColor();
        }
        if (getErrorIconDrawable() != null && this.indicatorViewController.z() && this.indicatorViewController.k()) {
            z11 = true;
        }
        setErrorIconVisible(z11);
        refreshErrorIconDrawableState();
        refreshStartIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().d()) {
            tintEndIconOnError(this.indicatorViewController.k());
        }
        int i11 = this.boxStrokeWidthPx;
        if (z12 && isEnabled()) {
            this.boxStrokeWidthPx = this.boxStrokeWidthFocusedPx;
        } else {
            this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        }
        if (this.boxStrokeWidthPx != i11 && this.boxBackgroundMode == 2) {
            recalculateCutout();
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                this.boxBackgroundColor = this.disabledFilledBackgroundColor;
            } else if (z13 && !z12) {
                this.boxBackgroundColor = this.hoveredFilledBackgroundColor;
            } else if (z12) {
                this.boxBackgroundColor = this.focusedFilledBackgroundColor;
            } else {
                this.boxBackgroundColor = this.defaultFilledBackgroundColor;
            }
        }
        applyBoxAttributes();
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.O);
    }

    private void updateLabelState(boolean z11, boolean z12) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z13 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        boolean z14 = editText2 != null && editText2.hasFocus();
        boolean k11 = this.indicatorViewController.k();
        ColorStateList colorStateList2 = this.defaultHintTextColor;
        if (colorStateList2 != null) {
            this.collapsingTextHelper.O(colorStateList2);
            this.collapsingTextHelper.V(this.defaultHintTextColor);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.defaultHintTextColor;
            int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.disabledColor) : this.disabledColor;
            this.collapsingTextHelper.O(ColorStateList.valueOf(colorForState));
            this.collapsingTextHelper.V(ColorStateList.valueOf(colorForState));
        } else if (k11) {
            this.collapsingTextHelper.O(this.indicatorViewController.p());
        } else if (this.counterOverflowed && (textView = this.counterView) != null) {
            this.collapsingTextHelper.O(textView.getTextColors());
        } else if (z14 && (colorStateList = this.focusedTextColor) != null) {
            this.collapsingTextHelper.O(colorStateList);
        }
        if (!z13 && this.expandedHintEnabled && (!isEnabled() || !z14)) {
            if (z12 || !this.hintExpanded) {
                expandHint(z11);
            }
        } else if (z12 || this.hintExpanded) {
            collapseHint(z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaceholderText(int i11) {
        if (i11 == 0 && !this.hintExpanded) {
            showPlaceholderText();
        } else {
            hidePlaceholderText();
        }
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            applyEndIconTint();
            refreshEndIconDrawableState();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            applyStartIconTint();
            setStartIconVisible(true);
            refreshStartIconDrawableState();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        setStartIconContentDescription((CharSequence) null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v146 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.indicatorViewController.z());
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    void updateCounter(int i11) {
        boolean z11 = this.counterOverflowed;
        int i12 = this.counterMaxLength;
        if (i12 == -1) {
            this.counterView.setText(String.valueOf(i11));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = i11 > i12;
            updateCounterContentDescription(getContext(), this.counterView, i11, this.counterMaxLength, this.counterOverflowed);
            if (z11 != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            this.counterView.setText(t3.a.c().j(getContext().getString(fk.i.f26484d, Integer.valueOf(i11), Integer.valueOf(this.counterMaxLength))));
        }
        if (this.editText == null || z11 == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    public void setHint(int i11) {
        setHint(i11 != 0 ? getResources().getText(i11) : null);
    }
}