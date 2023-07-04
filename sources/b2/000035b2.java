package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.e;
import androidx.core.view.a0;
import androidx.core.widget.m;
import fk.j;
import java.util.Iterator;
import java.util.LinkedHashSet;
import wk.h;
import wk.k;
import wk.n;

/* loaded from: classes3.dex */
public class MaterialButton extends e implements Checkable, n {
    private static final int[] CHECKABLE_STATE_SET = {16842911};
    private static final int[] CHECKED_STATE_SET = {16842912};
    private static final int DEF_STYLE_RES = j.f26505i;
    public static final int ICON_GRAVITY_END = 3;
    public static final int ICON_GRAVITY_START = 1;
    public static final int ICON_GRAVITY_TEXT_END = 4;
    public static final int ICON_GRAVITY_TEXT_START = 2;
    public static final int ICON_GRAVITY_TEXT_TOP = 32;
    public static final int ICON_GRAVITY_TOP = 16;
    private static final String LOG_TAG = "MaterialButton";
    private boolean broadcasting;
    private boolean checked;
    private Drawable icon;
    private int iconGravity;
    private int iconLeft;
    private int iconPadding;
    private int iconSize;
    private ColorStateList iconTint;
    private PorterDuff.Mode iconTintMode;
    private int iconTop;
    private final com.google.android.material.button.a materialButtonHelper;
    private final LinkedHashSet<a> onCheckedChangeListeners;
    private b onPressedChangeListenerInternal;

    /* loaded from: classes3.dex */
    public interface a {
        void a(MaterialButton materialButton, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface b {
        void a(MaterialButton materialButton, boolean z11);
    }

    /* loaded from: classes3.dex */
    public static class c extends a4.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: c */
        boolean f15017c;

        /* loaded from: classes3.dex */
        static class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public c[] newArray(int i11) {
                return new c[i11];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f15017c = parcel.readInt() == 1;
        }

        @Override // a4.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f15017c ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    private String getA11yClassName() {
        return (isCheckable() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        return Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
    }

    private boolean isIconEnd() {
        int i11 = this.iconGravity;
        return i11 == 3 || i11 == 4;
    }

    private boolean isIconStart() {
        int i11 = this.iconGravity;
        return i11 == 1 || i11 == 2;
    }

    private boolean isIconTop() {
        int i11 = this.iconGravity;
        return i11 == 16 || i11 == 32;
    }

    private boolean isLayoutRTL() {
        return a0.F(this) == 1;
    }

    private boolean isUsingOriginalBackground() {
        com.google.android.material.button.a aVar = this.materialButtonHelper;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private void resetIconDrawable() {
        if (isIconStart()) {
            m.i(this, this.icon, null, null, null);
        } else if (isIconEnd()) {
            m.i(this, null, null, this.icon, null);
        } else if (isIconTop()) {
            m.i(this, null, this.icon, null, null);
        }
    }

    private void updateIcon(boolean z11) {
        Drawable drawable = this.icon;
        boolean z12 = true;
        if (drawable != null) {
            Drawable mutate = n3.a.r(drawable).mutate();
            this.icon = mutate;
            n3.a.o(mutate, this.iconTint);
            PorterDuff.Mode mode = this.iconTintMode;
            if (mode != null) {
                n3.a.p(this.icon, mode);
            }
            int i11 = this.iconSize;
            if (i11 == 0) {
                i11 = this.icon.getIntrinsicWidth();
            }
            int i12 = this.iconSize;
            if (i12 == 0) {
                i12 = this.icon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.icon;
            int i13 = this.iconLeft;
            int i14 = this.iconTop;
            drawable2.setBounds(i13, i14, i11 + i13, i12 + i14);
            this.icon.setVisible(true, z11);
        }
        if (z11) {
            resetIconDrawable();
            return;
        }
        Drawable[] a11 = m.a(this);
        Drawable drawable3 = a11[0];
        Drawable drawable4 = a11[1];
        Drawable drawable5 = a11[2];
        if ((!isIconStart() || drawable3 == this.icon) && ((!isIconEnd() || drawable5 == this.icon) && (!isIconTop() || drawable4 == this.icon))) {
            z12 = false;
        }
        if (z12) {
            resetIconDrawable();
        }
    }

    private void updateIconPosition(int i11, int i12) {
        if (this.icon == null || getLayout() == null) {
            return;
        }
        if (!isIconStart() && !isIconEnd()) {
            if (isIconTop()) {
                this.iconLeft = 0;
                if (this.iconGravity == 16) {
                    this.iconTop = 0;
                    updateIcon(false);
                    return;
                }
                int i13 = this.iconSize;
                if (i13 == 0) {
                    i13 = this.icon.getIntrinsicHeight();
                }
                int textHeight = (((((i12 - getTextHeight()) - getPaddingTop()) - i13) - this.iconPadding) - getPaddingBottom()) / 2;
                if (this.iconTop != textHeight) {
                    this.iconTop = textHeight;
                    updateIcon(false);
                    return;
                }
                return;
            }
            return;
        }
        this.iconTop = 0;
        int i14 = this.iconGravity;
        if (i14 != 1 && i14 != 3) {
            int i15 = this.iconSize;
            if (i15 == 0) {
                i15 = this.icon.getIntrinsicWidth();
            }
            int textWidth = (((((i11 - getTextWidth()) - a0.J(this)) - i15) - this.iconPadding) - a0.K(this)) / 2;
            if (isLayoutRTL() != (this.iconGravity == 4)) {
                textWidth = -textWidth;
            }
            if (this.iconLeft != textWidth) {
                this.iconLeft = textWidth;
                updateIcon(false);
                return;
            }
            return;
        }
        this.iconLeft = 0;
        updateIcon(false);
    }

    public void addOnCheckedChangeListener(a aVar) {
        this.onCheckedChangeListeners.add(aVar);
    }

    public void clearOnCheckedChangeListeners() {
        this.onCheckedChangeListeners.clear();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.icon;
    }

    public int getIconGravity() {
        return this.iconGravity;
    }

    public int getIconPadding() {
        return this.iconPadding;
    }

    public int getIconSize() {
        return this.iconSize;
    }

    public ColorStateList getIconTint() {
        return this.iconTint;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.iconTintMode;
    }

    public int getInsetBottom() {
        return this.materialButtonHelper.c();
    }

    public int getInsetTop() {
        return this.materialButtonHelper.d();
    }

    public ColorStateList getRippleColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.e, androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.l();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.e, androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.m();
        }
        return super.getSupportBackgroundTintMode();
    }

    public boolean isCheckable() {
        com.google.android.material.button.a aVar = this.materialButtonHelper;
        return aVar != null && aVar.p();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.checked;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isUsingOriginalBackground()) {
            h.f(this, this.materialButtonHelper.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (isCheckable()) {
            Button.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.e, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.e, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.e, android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        com.google.android.material.button.a aVar;
        super.onLayout(z11, i11, i12, i13, i14);
        if (Build.VERSION.SDK_INT != 21 || (aVar = this.materialButtonHelper) == null) {
            return;
        }
        aVar.H(i14 - i12, i13 - i11);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.a());
        setChecked(cVar.f15017c);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f15017c = this.checked;
        return cVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        updateIconPosition(i11, i12);
    }

    @Override // androidx.appcompat.widget.e, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.icon != null) {
            if (this.icon.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void removeOnCheckedChangeListener(a aVar) {
        this.onCheckedChangeListeners.remove(aVar);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.r(i11);
        } else {
            super.setBackgroundColor(i11);
        }
    }

    @Override // androidx.appcompat.widget.e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (isUsingOriginalBackground()) {
            if (drawable != getBackground()) {
                Log.w(LOG_TAG, "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.materialButtonHelper.s();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.e, android.view.View
    public void setBackgroundResource(int i11) {
        setBackgroundDrawable(i11 != 0 ? h.a.d(getContext(), i11) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z11) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.t(z11);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (isCheckable() && isEnabled() && this.checked != z11) {
            this.checked = z11;
            refreshDrawableState();
            if (this.broadcasting) {
                return;
            }
            this.broadcasting = true;
            Iterator<a> it2 = this.onCheckedChangeListeners.iterator();
            while (it2.hasNext()) {
                it2.next().a(this, this.checked);
            }
            this.broadcasting = false;
        }
    }

    public void setCornerRadius(int i11) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.u(i11);
        }
    }

    public void setCornerRadiusResource(int i11) {
        if (isUsingOriginalBackground()) {
            setCornerRadius(getResources().getDimensionPixelSize(i11));
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.f().X(f11);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.icon != drawable) {
            this.icon = drawable;
            updateIcon(true);
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i11) {
        if (this.iconGravity != i11) {
            this.iconGravity = i11;
            updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i11) {
        if (this.iconPadding != i11) {
            this.iconPadding = i11;
            setCompoundDrawablePadding(i11);
        }
    }

    public void setIconResource(int i11) {
        setIcon(i11 != 0 ? h.a.d(getContext(), i11) : null);
    }

    public void setIconSize(int i11) {
        if (i11 >= 0) {
            if (this.iconSize != i11) {
                this.iconSize = i11;
                updateIcon(true);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("iconSize cannot be less than 0");
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.iconTint != colorStateList) {
            this.iconTint = colorStateList;
            updateIcon(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.iconTintMode != mode) {
            this.iconTintMode = mode;
            updateIcon(false);
        }
    }

    public void setIconTintResource(int i11) {
        setIconTint(h.a.c(getContext(), i11));
    }

    public void setInsetBottom(int i11) {
        this.materialButtonHelper.v(i11);
    }

    public void setInsetTop(int i11) {
        this.materialButtonHelper.w(i11);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.onPressedChangeListenerInternal = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z11) {
        b bVar = this.onPressedChangeListenerInternal;
        if (bVar != null) {
            bVar.a(this, z11);
        }
        super.setPressed(z11);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i11) {
        if (isUsingOriginalBackground()) {
            setRippleColor(h.a.c(getContext(), i11));
        }
    }

    @Override // wk.n
    public void setShapeAppearanceModel(k kVar) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.y(kVar);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public void setShouldDrawSurfaceColorStroke(boolean z11) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.z(z11);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i11) {
        if (isUsingOriginalBackground()) {
            setStrokeColor(h.a.c(getContext(), i11));
        }
    }

    public void setStrokeWidth(int i11) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.B(i11);
        }
    }

    public void setStrokeWidthResource(int i11) {
        if (isUsingOriginalBackground()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i11));
        }
    }

    @Override // androidx.appcompat.widget.e, androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.e, androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.checked);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.f26386v);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r6 = com.google.android.material.button.MaterialButton.DEF_STYLE_RES
            android.content.Context r9 = yk.a.c(r9, r10, r11, r6)
            r8.<init>(r9, r10, r11)
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r8.onCheckedChangeListeners = r9
            r9 = 0
            r8.checked = r9
            r8.broadcasting = r9
            android.content.Context r7 = r8.getContext()
            int[] r2 = fk.k.f26622r1
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r10
            r3 = r11
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.j.h(r0, r1, r2, r3, r4, r5)
            int r1 = fk.k.E1
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.iconPadding = r1
            int r1 = fk.k.H1
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.l.e(r1, r2)
            r8.iconTintMode = r1
            android.content.Context r1 = r8.getContext()
            int r2 = fk.k.G1
            android.content.res.ColorStateList r1 = tk.c.a(r1, r0, r2)
            r8.iconTint = r1
            android.content.Context r1 = r8.getContext()
            int r2 = fk.k.C1
            android.graphics.drawable.Drawable r1 = tk.c.d(r1, r0, r2)
            r8.icon = r1
            int r1 = fk.k.D1
            r2 = 1
            int r1 = r0.getInteger(r1, r2)
            r8.iconGravity = r1
            int r1 = fk.k.F1
            int r1 = r0.getDimensionPixelSize(r1, r9)
            r8.iconSize = r1
            wk.k$b r10 = wk.k.e(r7, r10, r11, r6)
            wk.k r10 = r10.m()
            com.google.android.material.button.a r11 = new com.google.android.material.button.a
            r11.<init>(r8, r10)
            r8.materialButtonHelper = r11
            r11.q(r0)
            r0.recycle()
            int r10 = r8.iconPadding
            r8.setCompoundDrawablePadding(r10)
            android.graphics.drawable.Drawable r10 = r8.icon
            if (r10 == 0) goto L84
            r9 = r2
        L84:
            r8.updateIcon(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}