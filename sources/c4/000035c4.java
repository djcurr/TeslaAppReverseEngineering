package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.f;
import androidx.core.view.a0;
import com.facebook.react.modules.appstate.AppStateModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.chip.a;
import com.google.android.material.internal.l;
import fk.i;
import fk.j;
import fk.k;
import gk.h;
import java.util.List;
import tk.d;
import w3.c;
import wk.n;

/* loaded from: classes3.dex */
public class Chip extends f implements a.InterfaceC0272a, n {

    /* renamed from: d  reason: collision with root package name */
    private com.google.android.material.chip.a f15095d;

    /* renamed from: e  reason: collision with root package name */
    private InsetDrawable f15096e;

    /* renamed from: f  reason: collision with root package name */
    private RippleDrawable f15097f;

    /* renamed from: g  reason: collision with root package name */
    private View.OnClickListener f15098g;

    /* renamed from: h  reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f15099h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15100i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15101j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f15102k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f15103l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f15104m;

    /* renamed from: n  reason: collision with root package name */
    private int f15105n;

    /* renamed from: o  reason: collision with root package name */
    private int f15106o;

    /* renamed from: p  reason: collision with root package name */
    private final c f15107p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f15108q;

    /* renamed from: t  reason: collision with root package name */
    private final Rect f15109t;

    /* renamed from: w  reason: collision with root package name */
    private final RectF f15110w;

    /* renamed from: x  reason: collision with root package name */
    private final tk.f f15111x;

    /* renamed from: y  reason: collision with root package name */
    private static final int f15093y = j.f26508l;

    /* renamed from: z  reason: collision with root package name */
    private static final Rect f15094z = new Rect();
    private static final int[] A = {16842913};
    private static final int[] B = {16842911};

    /* loaded from: classes3.dex */
    class a extends tk.f {
        a() {
        }

        @Override // tk.f
        public void a(int i11) {
        }

        @Override // tk.f
        public void b(Typeface typeface, boolean z11) {
            Chip chip = Chip.this;
            chip.setText(chip.f15095d.N2() ? Chip.this.f15095d.j1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends ViewOutlineProvider {
        b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f15095d != null) {
                Chip.this.f15095d.getOutline(outline);
            } else {
                outline.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c extends b4.a {
        c(Chip chip) {
            super(chip);
        }

        @Override // b4.a
        protected void A(int i11, w3.c cVar) {
            if (i11 == 1) {
                CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
                if (closeIconContentDescription != null) {
                    cVar.g0(closeIconContentDescription);
                } else {
                    CharSequence text = Chip.this.getText();
                    Context context = Chip.this.getContext();
                    int i12 = i.f26488h;
                    Object[] objArr = new Object[1];
                    objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                    cVar.g0(context.getString(i12, objArr).trim());
                }
                cVar.Y(Chip.this.getCloseIconTouchBoundsInt());
                cVar.b(c.a.f55453g);
                cVar.k0(Chip.this.isEnabled());
                return;
            }
            cVar.g0("");
            cVar.Y(Chip.f15094z);
        }

        @Override // b4.a
        protected void B(int i11, boolean z11) {
            if (i11 == 1) {
                Chip.this.f15103l = z11;
                Chip.this.refreshDrawableState();
            }
        }

        @Override // b4.a
        protected int o(float f11, float f12) {
            return (Chip.this.m() && Chip.this.getCloseIconTouchBounds().contains(f11, f12)) ? 1 : 0;
        }

        @Override // b4.a
        protected void p(List<Integer> list) {
            list.add(0);
            if (Chip.this.m() && Chip.this.r() && Chip.this.f15098g != null) {
                list.add(1);
            }
        }

        @Override // b4.a
        protected boolean w(int i11, int i12, Bundle bundle) {
            if (i12 == 16) {
                if (i11 == 0) {
                    return Chip.this.performClick();
                }
                if (i11 == 1) {
                    return Chip.this.s();
                }
                return false;
            }
            return false;
        }

        @Override // b4.a
        protected void z(w3.c cVar) {
            cVar.a0(Chip.this.q());
            cVar.d0(Chip.this.isClickable());
            cVar.c0(Chip.this.getAccessibilityClassName());
            CharSequence text = Chip.this.getText();
            if (Build.VERSION.SDK_INT >= 23) {
                cVar.J0(text);
            } else {
                cVar.g0(text);
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fk.b.f26371g);
    }

    private void A() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f15111x);
        }
    }

    private void B(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", AppStateModule.APP_STATE_BACKGROUND) != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") == null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") == null) {
                    if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") == null) {
                        if (attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) == 1 && attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) == 1) {
                            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                                Log.w("Chip", "Chip text must be vertically center and start aligned");
                                return;
                            }
                            return;
                        }
                        throw new UnsupportedOperationException("Chip does not support multi-line text");
                    }
                    throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
                }
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f15110w.setEmpty();
        if (m() && this.f15098g != null) {
            this.f15095d.a1(this.f15110w);
        }
        return this.f15110w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f15109t.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f15109t;
    }

    private d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.k1();
        }
        return null;
    }

    private void i(com.google.android.material.chip.a aVar) {
        aVar.r2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] j() {
        ?? isEnabled = isEnabled();
        int i11 = isEnabled;
        if (this.f15103l) {
            i11 = isEnabled + 1;
        }
        int i12 = i11;
        if (this.f15102k) {
            i12 = i11 + 1;
        }
        int i13 = i12;
        if (this.f15101j) {
            i13 = i12 + 1;
        }
        int i14 = i13;
        if (isChecked()) {
            i14 = i13 + 1;
        }
        int[] iArr = new int[i14];
        int i15 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i15 = 1;
        }
        if (this.f15103l) {
            iArr[i15] = 16842908;
            i15++;
        }
        if (this.f15102k) {
            iArr[i15] = 16843623;
            i15++;
        }
        if (this.f15101j) {
            iArr[i15] = 16842919;
            i15++;
        }
        if (isChecked()) {
            iArr[i15] = 16842913;
        }
        return iArr;
    }

    private void l() {
        if (getBackgroundDrawable() == this.f15096e && this.f15095d.getCallback() == null) {
            this.f15095d.setCallback(this.f15096e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return (aVar == null || aVar.T0() == null) ? false : true;
    }

    private void n(Context context, AttributeSet attributeSet, int i11) {
        TypedArray h11 = com.google.android.material.internal.j.h(context, attributeSet, k.R, i11, f15093y, new int[0]);
        this.f15104m = h11.getBoolean(k.f26663y0, false);
        this.f15106o = (int) Math.ceil(h11.getDimension(k.f26591m0, (float) Math.ceil(l.b(getContext(), 48))));
        h11.recycle();
    }

    private void o() {
        if (Build.VERSION.SDK_INT >= 21) {
            setOutlineProvider(new b());
        }
    }

    private void p(int i11, int i12, int i13, int i14) {
        this.f15096e = new InsetDrawable((Drawable) this.f15095d, i11, i12, i13, i14);
    }

    private void setCloseIconHovered(boolean z11) {
        if (this.f15102k != z11) {
            this.f15102k = z11;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z11) {
        if (this.f15101j != z11) {
            this.f15101j = z11;
            refreshDrawableState();
        }
    }

    private void t() {
        if (this.f15096e != null) {
            this.f15096e = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            x();
        }
    }

    private void v(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.r2(null);
        }
    }

    private void w() {
        if (m() && r() && this.f15098g != null) {
            a0.w0(this, this.f15107p);
            this.f15108q = true;
            return;
        }
        a0.w0(this, null);
        this.f15108q = false;
    }

    private void x() {
        if (uk.b.f53537a) {
            y();
            return;
        }
        this.f15095d.M2(true);
        a0.z0(this, getBackgroundDrawable());
        z();
        l();
    }

    private void y() {
        this.f15097f = new RippleDrawable(uk.b.a(this.f15095d.h1()), getBackgroundDrawable(), null);
        this.f15095d.M2(false);
        a0.z0(this, this.f15097f);
        z();
    }

    private void z() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f15095d) == null) {
            return;
        }
        int L0 = (int) (aVar.L0() + this.f15095d.l1() + this.f15095d.s0());
        int Q0 = (int) (this.f15095d.Q0() + this.f15095d.m1() + this.f15095d.o0());
        if (this.f15096e != null) {
            Rect rect = new Rect();
            this.f15096e.getPadding(rect);
            Q0 += rect.left;
            L0 += rect.right;
        }
        a0.K0(this, Q0, getPaddingTop(), L0, getPaddingBottom());
    }

    @Override // com.google.android.material.chip.a.InterfaceC0272a
    public void a() {
        k(this.f15106o);
        requestLayout();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f15108q) {
            return this.f15107p.i(motionEvent) || super.dispatchHoverEvent(motionEvent);
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f15108q) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f15107p.j(keyEvent) || this.f15107p.n() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f15095d;
        if ((aVar == null || !aVar.r1()) ? false : this.f15095d.n2(j())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!q()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof ChipGroup) && ((ChipGroup) parent).p()) ? "android.widget.RadioButton" : "android.widget.CompoundButton";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f15096e;
        return insetDrawable == null ? this.f15095d : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.H0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.I0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? Math.max((float) BitmapDescriptorFactory.HUE_RED, aVar.K0()) : BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getChipDrawable() {
        return this.f15095d;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? aVar.L0() : BitmapDescriptorFactory.HUE_RED;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? aVar.N0() : BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.O0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? aVar.P0() : BitmapDescriptorFactory.HUE_RED;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? aVar.Q0() : BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? aVar.S0() : BitmapDescriptorFactory.HUE_RED;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.T0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.U0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? aVar.V0() : BitmapDescriptorFactory.HUE_RED;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? aVar.W0() : BitmapDescriptorFactory.HUE_RED;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? aVar.X0() : BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.d1();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f15108q && (this.f15107p.n() == 1 || this.f15107p.k() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public h getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.e1();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? aVar.f1() : BitmapDescriptorFactory.HUE_RED;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? aVar.g1() : BitmapDescriptorFactory.HUE_RED;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.h1();
        }
        return null;
    }

    public wk.k getShapeAppearanceModel() {
        return this.f15095d.E();
    }

    public h getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            return aVar.i1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? aVar.l1() : BitmapDescriptorFactory.HUE_RED;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null ? aVar.m1() : BitmapDescriptorFactory.HUE_RED;
    }

    public boolean k(int i11) {
        this.f15106o = i11;
        if (!u()) {
            if (this.f15096e != null) {
                t();
            } else {
                x();
            }
            return false;
        }
        int max = Math.max(0, i11 - this.f15095d.getIntrinsicHeight());
        int max2 = Math.max(0, i11 - this.f15095d.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f15096e != null) {
                t();
            } else {
                x();
            }
            return false;
        }
        int i12 = max2 > 0 ? max2 / 2 : 0;
        int i13 = max > 0 ? max / 2 : 0;
        if (this.f15096e != null) {
            Rect rect = new Rect();
            this.f15096e.getPadding(rect);
            if (rect.top == i13 && rect.bottom == i13 && rect.left == i12 && rect.right == i12) {
                x();
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 16) {
            if (getMinHeight() != i11) {
                setMinHeight(i11);
            }
            if (getMinWidth() != i11) {
                setMinWidth(i11);
            }
        } else {
            setMinHeight(i11);
            setMinWidth(i11);
        }
        p(i12, i13, i12, i13);
        x();
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        wk.h.f(this, this.f15095d);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, A);
        }
        if (q()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, B);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z11, int i11, Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (this.f15108q) {
            this.f15107p.v(z11, i11, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(q());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            w3.c.P0(accessibilityNodeInfo).f0(c.C1263c.b(chipGroup.b(this), 1, chipGroup.c() ? chipGroup.o(this) : -1, 1, false, isChecked()));
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i11) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        if (this.f15105n != i11) {
            this.f15105n = i11;
            z();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r0 != 3) goto L17;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L39
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L34
            goto L40
        L21:
            boolean r0 = r5.f15101j
            if (r0 == 0) goto L40
            if (r1 != 0) goto L3e
            r5.setCloseIconPressed(r2)
            goto L3e
        L2b:
            boolean r0 = r5.f15101j
            if (r0 == 0) goto L34
            r5.s()
            r0 = r3
            goto L35
        L34:
            r0 = r2
        L35:
            r5.setCloseIconPressed(r2)
            goto L41
        L39:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r3)
        L3e:
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            if (r0 != 0) goto L49
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
        L49:
            r2 = r3
        L4a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean q() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null && aVar.q1();
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f15095d;
        return aVar != null && aVar.s1();
    }

    public boolean s() {
        boolean z11 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f15098g;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z11 = true;
        }
        if (this.f15108q) {
            this.f15107p.H(1, 1);
        }
        return z11;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f15097f) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f15097f) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i11) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.z1(z11);
        }
    }

    public void setCheckableResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.A1(i11);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar == null) {
            this.f15100i = z11;
        } else if (aVar.q1()) {
            boolean isChecked = isChecked();
            super.setChecked(z11);
            if (isChecked == z11 || (onCheckedChangeListener = this.f15099h) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z11);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.B1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z11) {
        setCheckedIconVisible(z11);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i11) {
        setCheckedIconVisible(i11);
    }

    public void setCheckedIconResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.C1(i11);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.D1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.E1(i11);
        }
    }

    public void setCheckedIconVisible(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.F1(i11);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.H1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.I1(i11);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.J1(f11);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.K1(i11);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f15095d;
        if (aVar2 != aVar) {
            v(aVar2);
            this.f15095d = aVar;
            aVar.C2(false);
            i(this.f15095d);
            k(this.f15106o);
        }
    }

    public void setChipEndPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.L1(f11);
        }
    }

    public void setChipEndPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.M1(i11);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.N1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z11) {
        setChipIconVisible(z11);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i11) {
        setChipIconVisible(i11);
    }

    public void setChipIconResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.O1(i11);
        }
    }

    public void setChipIconSize(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.P1(f11);
        }
    }

    public void setChipIconSizeResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.Q1(i11);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.R1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.S1(i11);
        }
    }

    public void setChipIconVisible(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.T1(i11);
        }
    }

    public void setChipMinHeight(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.V1(f11);
        }
    }

    public void setChipMinHeightResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.W1(i11);
        }
    }

    public void setChipStartPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.X1(f11);
        }
    }

    public void setChipStartPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.Y1(i11);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.Z1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.a2(i11);
        }
    }

    public void setChipStrokeWidth(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.b2(f11);
        }
    }

    public void setChipStrokeWidthResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.c2(i11);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i11) {
        setText(getResources().getString(i11));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.e2(drawable);
        }
        w();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.f2(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z11) {
        setCloseIconVisible(z11);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i11) {
        setCloseIconVisible(i11);
    }

    public void setCloseIconEndPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.g2(f11);
        }
    }

    public void setCloseIconEndPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.h2(i11);
        }
    }

    public void setCloseIconResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.i2(i11);
        }
        w();
    }

    public void setCloseIconSize(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.j2(f11);
        }
    }

    public void setCloseIconSizeResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.k2(i11);
        }
    }

    public void setCloseIconStartPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.l2(f11);
        }
    }

    public void setCloseIconStartPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.m2(i11);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.o2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.p2(i11);
        }
    }

    public void setCloseIconVisible(int i11) {
        setCloseIconVisible(getResources().getBoolean(i11));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i13 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i11, i12, i13, i14);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i11, int i12, int i13, int i14) {
        if (i11 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i13 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i11, i12, i13, i14);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.X(f11);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f15095d == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            com.google.android.material.chip.a aVar = this.f15095d;
            if (aVar != null) {
                aVar.s2(truncateAt);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        this.f15104m = z11;
        k(this.f15106o);
    }

    @Override // android.widget.TextView
    public void setGravity(int i11) {
        if (i11 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i11);
        }
    }

    public void setHideMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.t2(hVar);
        }
    }

    public void setHideMotionSpecResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.u2(i11);
        }
    }

    public void setIconEndPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.v2(f11);
        }
    }

    public void setIconEndPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.w2(i11);
        }
    }

    public void setIconStartPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.x2(f11);
        }
    }

    public void setIconStartPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.y2(i11);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i11) {
        if (this.f15095d != null && Build.VERSION.SDK_INT >= 17) {
            super.setLayoutDirection(i11);
        }
    }

    @Override // android.widget.TextView
    public void setLines(int i11) {
        if (i11 <= 1) {
            super.setLines(i11);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i11) {
        if (i11 <= 1) {
            super.setMaxLines(i11);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i11) {
        super.setMaxWidth(i11);
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.z2(i11);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i11) {
        if (i11 <= 1) {
            super.setMinLines(i11);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f15099h = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f15098g = onClickListener;
        w();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.A2(colorStateList);
        }
        if (this.f15095d.o1()) {
            return;
        }
        y();
    }

    public void setRippleColorResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.B2(i11);
            if (this.f15095d.o1()) {
                return;
            }
            y();
        }
    }

    @Override // wk.n
    public void setShapeAppearanceModel(wk.k kVar) {
        this.f15095d.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.D2(hVar);
        }
    }

    public void setShowMotionSpecResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.E2(i11);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z11) {
        if (z11) {
            super.setSingleLine(z11);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.N2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f15095d;
        if (aVar2 != null) {
            aVar2.F2(charSequence);
        }
    }

    public void setTextAppearance(d dVar) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.G2(dVar);
        }
        A();
    }

    public void setTextAppearanceResource(int i11) {
        setTextAppearance(getContext(), i11);
    }

    public void setTextEndPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.I2(f11);
        }
    }

    public void setTextEndPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.J2(i11);
        }
    }

    public void setTextStartPadding(float f11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.K2(f11);
        }
    }

    public void setTextStartPaddingResource(int i11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.L2(i11);
        }
    }

    public boolean u() {
        return this.f15104m;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.Chip.f15093y
            android.content.Context r8 = yk.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.f15109t = r8
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r7.f15110w = r8
            com.google.android.material.chip.Chip$a r8 = new com.google.android.material.chip.Chip$a
            r8.<init>()
            r7.f15111x = r8
            android.content.Context r8 = r7.getContext()
            r7.B(r9)
            com.google.android.material.chip.a r6 = com.google.android.material.chip.a.x0(r8, r9, r10, r4)
            r7.n(r8, r9, r10)
            r7.setChipDrawable(r6)
            float r0 = androidx.core.view.a0.z(r7)
            r6.X(r0)
            int[] r2 = fk.k.R
            r0 = 0
            int[] r5 = new int[r0]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.j.h(r0, r1, r2, r3, r4, r5)
            int r10 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r10 >= r0) goto L51
            int r10 = fk.k.U
            android.content.res.ColorStateList r8 = tk.c.a(r8, r9, r10)
            r7.setTextColor(r8)
        L51:
            int r8 = fk.k.D0
            boolean r8 = r9.hasValue(r8)
            r9.recycle()
            com.google.android.material.chip.Chip$c r9 = new com.google.android.material.chip.Chip$c
            r9.<init>(r7)
            r7.f15107p = r9
            r7.w()
            if (r8 != 0) goto L69
            r7.o()
        L69:
            boolean r8 = r7.f15100i
            r7.setChecked(r8)
            java.lang.CharSequence r8 = r6.j1()
            r7.setText(r8)
            android.text.TextUtils$TruncateAt r8 = r6.d1()
            r7.setEllipsize(r8)
            r7.A()
            com.google.android.material.chip.a r8 = r7.f15095d
            boolean r8 = r8.N2()
            if (r8 != 0) goto L8e
            r8 = 1
            r7.setLines(r8)
            r7.setHorizontallyScrolling(r8)
        L8e:
            r8 = 8388627(0x800013, float:1.175497E-38)
            r7.setGravity(r8)
            r7.z()
            boolean r8 = r7.u()
            if (r8 == 0) goto La2
            int r8 = r7.f15106o
            r7.setMinHeight(r8)
        La2:
            int r8 = androidx.core.view.a0.F(r7)
            r7.f15105n = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.q2(z11);
        }
        w();
    }

    public void setCheckedIconVisible(boolean z11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.G1(z11);
        }
    }

    public void setChipIconVisible(boolean z11) {
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.U1(z11);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i11) {
        super.setTextAppearance(context, i11);
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.H2(i11);
        }
        A();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i11) {
        super.setTextAppearance(i11);
        com.google.android.material.chip.a aVar = this.f15095d;
        if (aVar != null) {
            aVar.H2(i11);
        }
        A();
    }
}