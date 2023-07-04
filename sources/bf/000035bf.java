package com.google.android.material.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import fk.b;
import fk.j;
import wk.h;
import wk.k;
import wk.n;

/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, n {

    /* renamed from: f */
    private static final int[] f15060f = {16842911};

    /* renamed from: g */
    private static final int[] f15061g = {16842912};

    /* renamed from: h */
    private static final int[] f15062h = {b.K};

    /* renamed from: i */
    private static final int f15063i = j.f26506j;

    /* renamed from: a */
    private final com.google.android.material.card.a f15064a;

    /* renamed from: b */
    private boolean f15065b;

    /* renamed from: c */
    private boolean f15066c;

    /* renamed from: d */
    private boolean f15067d;

    /* renamed from: e */
    private a f15068e;

    /* loaded from: classes3.dex */
    public interface a {
        void a(MaterialCardView materialCardView, boolean z11);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f26389y);
    }

    private void d() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f15064a.i();
        }
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f15064a.j().getBounds());
        return rectF;
    }

    public boolean e() {
        com.google.android.material.card.a aVar = this.f15064a;
        return aVar != null && aVar.C();
    }

    public boolean f() {
        return this.f15067d;
    }

    public void g(int i11, int i12, int i13, int i14) {
        super.setContentPadding(i11, i12, i13, i14);
    }

    @Override // androidx.cardview.widget.CardView
    public ColorStateList getCardBackgroundColor() {
        return this.f15064a.k();
    }

    public ColorStateList getCardForegroundColor() {
        return this.f15064a.l();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f15064a.m();
    }

    public int getCheckedIconMargin() {
        return this.f15064a.n();
    }

    public int getCheckedIconSize() {
        return this.f15064a.o();
    }

    public ColorStateList getCheckedIconTint() {
        return this.f15064a.p();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f15064a.z().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f15064a.z().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f15064a.z().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f15064a.z().top;
    }

    public float getProgress() {
        return this.f15064a.t();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f15064a.r();
    }

    public ColorStateList getRippleColor() {
        return this.f15064a.u();
    }

    public k getShapeAppearanceModel() {
        return this.f15064a.v();
    }

    @Deprecated
    public int getStrokeColor() {
        return this.f15064a.w();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f15064a.x();
    }

    public int getStrokeWidth() {
        return this.f15064a.y();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f15066c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.f(this, this.f15064a.j());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 3);
        if (e()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f15060f);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f15061g);
        }
        if (f()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, f15062h);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f15064a.E(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f15065b) {
            if (!this.f15064a.B()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.f15064a.F(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i11) {
        this.f15064a.G(ColorStateList.valueOf(i11));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f11) {
        super.setCardElevation(f11);
        this.f15064a.Z();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.f15064a.H(colorStateList);
    }

    public void setCheckable(boolean z11) {
        this.f15064a.I(z11);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (this.f15066c != z11) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f15064a.K(drawable);
    }

    public void setCheckedIconMargin(int i11) {
        this.f15064a.L(i11);
    }

    public void setCheckedIconMarginResource(int i11) {
        if (i11 != -1) {
            this.f15064a.L(getResources().getDimensionPixelSize(i11));
        }
    }

    public void setCheckedIconResource(int i11) {
        this.f15064a.K(h.a.d(getContext(), i11));
    }

    public void setCheckedIconSize(int i11) {
        this.f15064a.M(i11);
    }

    public void setCheckedIconSizeResource(int i11) {
        if (i11 != 0) {
            this.f15064a.M(getResources().getDimensionPixelSize(i11));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f15064a.N(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z11) {
        super.setClickable(z11);
        com.google.android.material.card.a aVar = this.f15064a;
        if (aVar != null) {
            aVar.X();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i11, int i12, int i13, int i14) {
        this.f15064a.U(i11, i12, i13, i14);
    }

    public void setDragged(boolean z11) {
        if (this.f15067d != z11) {
            this.f15067d = z11;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f11) {
        super.setMaxCardElevation(f11);
        this.f15064a.b0();
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.f15068e = aVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z11) {
        super.setPreventCornerOverlap(z11);
        this.f15064a.b0();
        this.f15064a.Y();
    }

    public void setProgress(float f11) {
        this.f15064a.P(f11);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f11) {
        super.setRadius(f11);
        this.f15064a.O(f11);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f15064a.Q(colorStateList);
    }

    public void setRippleColorResource(int i11) {
        this.f15064a.Q(h.a.c(getContext(), i11));
    }

    @Override // wk.n
    public void setShapeAppearanceModel(k kVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(kVar.u(getBoundsAsRectF()));
        }
        this.f15064a.R(kVar);
    }

    public void setStrokeColor(int i11) {
        setStrokeColor(ColorStateList.valueOf(i11));
    }

    public void setStrokeWidth(int i11) {
        this.f15064a.T(i11);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z11) {
        super.setUseCompatPadding(z11);
        this.f15064a.b0();
        this.f15064a.Y();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (e() && isEnabled()) {
            this.f15066c = !this.f15066c;
            refreshDrawableState();
            d();
            this.f15064a.J(this.f15066c);
            a aVar = this.f15068e;
            if (aVar != null) {
                aVar.a(this, this.f15066c);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.f15063i
            android.content.Context r8 = yk.a.c(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.f15066c = r8
            r7.f15067d = r8
            r0 = 1
            r7.f15065b = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = fk.k.f26575j2
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.j.h(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.a r0 = new com.google.android.material.card.a
            r0.<init>(r7, r9, r10, r6)
            r7.f15064a = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.G(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.U(r9, r10, r1, r2)
            r0.D(r8)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f15064a.G(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f15064a.S(colorStateList);
        invalidate();
    }
}