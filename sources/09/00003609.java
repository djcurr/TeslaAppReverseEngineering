package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.i;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import androidx.core.view.y;
import androidx.core.widget.q;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.internal.m;
import gk.h;
import gk.k;
import java.util.List;
import wk.n;

/* loaded from: classes3.dex */
public class FloatingActionButton extends m implements y, q, ok.a, n, CoordinatorLayout.b {

    /* renamed from: b  reason: collision with root package name */
    private ColorStateList f15297b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuff.Mode f15298c;

    /* renamed from: d  reason: collision with root package name */
    private ColorStateList f15299d;

    /* renamed from: e  reason: collision with root package name */
    private PorterDuff.Mode f15300e;

    /* renamed from: f  reason: collision with root package name */
    private ColorStateList f15301f;

    /* renamed from: g  reason: collision with root package name */
    private int f15302g;

    /* renamed from: h  reason: collision with root package name */
    private int f15303h;

    /* renamed from: i  reason: collision with root package name */
    private int f15304i;

    /* renamed from: j  reason: collision with root package name */
    private int f15305j;

    /* renamed from: k  reason: collision with root package name */
    boolean f15306k;

    /* renamed from: l  reason: collision with root package name */
    final Rect f15307l;

    /* renamed from: m  reason: collision with root package name */
    private final Rect f15308m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.appcompat.widget.m f15309n;

    /* renamed from: o  reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.a f15310o;

    /* loaded from: classes3.dex */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements a.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f15314a;

        a(b bVar) {
            this.f15314a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.a.k
        public void a() {
            this.f15314a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.a.k
        public void b() {
            this.f15314a.a(FloatingActionButton.this);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c implements vk.b {
        c() {
        }

        @Override // vk.b
        public void a(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // vk.b
        public void b(int i11, int i12, int i13, int i14) {
            FloatingActionButton.this.f15307l.set(i11, i12, i13, i14);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i11 + floatingActionButton.f15304i, i12 + FloatingActionButton.this.f15304i, i13 + FloatingActionButton.this.f15304i, i14 + FloatingActionButton.this.f15304i);
        }

        @Override // vk.b
        public boolean c() {
            return FloatingActionButton.this.f15306k;
        }
    }

    /* loaded from: classes3.dex */
    class d<T extends FloatingActionButton> implements a.j {

        /* renamed from: a  reason: collision with root package name */
        private final k<T> f15317a;

        d(k<T> kVar) {
            this.f15317a = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.a.j
        public void a() {
            this.f15317a.b(FloatingActionButton.this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.floatingactionbutton.a.j
        public void b() {
            this.f15317a.a(FloatingActionButton.this);
        }

        public boolean equals(Object obj) {
            return (obj instanceof d) && ((d) obj).f15317a.equals(this.f15317a);
        }

        public int hashCode() {
            return this.f15317a.hashCode();
        }
    }

    private com.google.android.material.floatingactionbutton.a getImpl() {
        if (this.f15310o == null) {
            this.f15310o = h();
        }
        return this.f15310o;
    }

    private com.google.android.material.floatingactionbutton.a h() {
        if (Build.VERSION.SDK_INT >= 21) {
            return new com.google.android.material.floatingactionbutton.b(this, new c());
        }
        return new com.google.android.material.floatingactionbutton.a(this, new c());
    }

    private int k(int i11) {
        int i12 = this.f15303h;
        if (i12 != 0) {
            return i12;
        }
        Resources resources = getResources();
        if (i11 != -1) {
            if (i11 != 1) {
                return resources.getDimensionPixelSize(fk.d.f26400d);
            }
            return resources.getDimensionPixelSize(fk.d.f26399c);
        } else if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return k(1);
        } else {
            return k(0);
        }
    }

    private void p(Rect rect) {
        int i11 = rect.left;
        Rect rect2 = this.f15307l;
        rect.left = i11 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void q() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f15299d;
        if (colorStateList == null) {
            n3.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f15300e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(i.e(colorForState, mode));
    }

    private static int r(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return size;
                }
                throw new IllegalArgumentException();
            }
            return i11;
        }
        return Math.min(i11, size);
    }

    private a.k u(b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    @Override // ok.a
    public boolean a() {
        throw null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().C(getDrawableState());
    }

    public void e(Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void f(Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    public void g(k<? extends FloatingActionButton> kVar) {
        getImpl().g(new d(kVar));
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f15297b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f15298c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().s();
    }

    public Drawable getContentBackground() {
        return getImpl().l();
    }

    public int getCustomSize() {
        return this.f15303h;
    }

    public int getExpandedComponentIdHint() {
        throw null;
    }

    public h getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f15301f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f15301f;
    }

    public wk.k getShapeAppearanceModel() {
        return (wk.k) v3.h.f(getImpl().t());
    }

    public h getShowMotionSpec() {
        return getImpl().u();
    }

    public int getSize() {
        return this.f15302g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSizeDimension() {
        return k(this.f15302g);
    }

    @Override // androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.q
    public ColorStateList getSupportImageTintList() {
        return this.f15299d;
    }

    @Override // androidx.core.widget.q
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f15300e;
    }

    public boolean getUseCompatPadding() {
        return this.f15306k;
    }

    @Deprecated
    public boolean i(Rect rect) {
        if (a0.a0(this)) {
            rect.set(0, 0, getWidth(), getHeight());
            p(rect);
            return true;
        }
        return false;
    }

    public void j(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        p(rect);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().y();
    }

    public void l(b bVar) {
        m(bVar, true);
    }

    void m(b bVar, boolean z11) {
        getImpl().v(u(bVar), z11);
    }

    public boolean n() {
        return getImpl().w();
    }

    public boolean o() {
        return getImpl().x();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().z();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().B();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i11, int i12) {
        int sizeDimension = getSizeDimension();
        this.f15304i = (sizeDimension - this.f15305j) / 2;
        getImpl().c0();
        int min = Math.min(r(sizeDimension, i11), r(sizeDimension, i12));
        Rect rect = this.f15307l;
        setMeasuredDimension(rect.left + min + rect.right, min + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof xk.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        xk.a aVar = (xk.a) parcelable;
        super.onRestoreInstanceState(aVar.a());
        Bundle bundle = (Bundle) v3.h.f(aVar.f57592c.get("expandableWidgetHelper"));
        throw null;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            onSaveInstanceState = new Bundle();
        }
        new xk.a(onSaveInstanceState);
        throw null;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 && i(this.f15308m) && !this.f15308m.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void s(b bVar) {
        t(bVar, true);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f15297b != colorStateList) {
            this.f15297b = colorStateList;
            getImpl().J(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f15298c != mode) {
            this.f15298c = mode;
            getImpl().K(mode);
        }
    }

    public void setCompatElevation(float f11) {
        getImpl().L(f11);
    }

    public void setCompatElevationResource(int i11) {
        setCompatElevation(getResources().getDimension(i11));
    }

    public void setCompatHoveredFocusedTranslationZ(float f11) {
        getImpl().O(f11);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i11) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i11));
    }

    public void setCompatPressedTranslationZ(float f11) {
        getImpl().R(f11);
    }

    public void setCompatPressedTranslationZResource(int i11) {
        setCompatPressedTranslationZ(getResources().getDimension(i11));
    }

    public void setCustomSize(int i11) {
        if (i11 >= 0) {
            if (i11 != this.f15303h) {
                this.f15303h = i11;
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        super.setElevation(f11);
        getImpl().d0(f11);
    }

    public void setEnsureMinTouchTargetSize(boolean z11) {
        if (z11 != getImpl().n()) {
            getImpl().M(z11);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i11) {
        throw null;
    }

    public void setHideMotionSpec(h hVar) {
        getImpl().N(hVar);
    }

    public void setHideMotionSpecResource(int i11) {
        setHideMotionSpec(h.c(getContext(), i11));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().b0();
            if (this.f15299d != null) {
                q();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i11) {
        this.f15309n.g(i11);
        q();
    }

    public void setMaxImageSize(int i11) {
        this.f15305j = i11;
        getImpl().Q(i11);
    }

    public void setRippleColor(int i11) {
        setRippleColor(ColorStateList.valueOf(i11));
    }

    @Override // android.view.View
    public void setScaleX(float f11) {
        super.setScaleX(f11);
        getImpl().G();
    }

    @Override // android.view.View
    public void setScaleY(float f11) {
        super.setScaleY(f11);
        getImpl().G();
    }

    public void setShadowPaddingEnabled(boolean z11) {
        getImpl().T(z11);
    }

    @Override // wk.n
    public void setShapeAppearanceModel(wk.k kVar) {
        getImpl().U(kVar);
    }

    public void setShowMotionSpec(h hVar) {
        getImpl().V(hVar);
    }

    public void setShowMotionSpecResource(int i11) {
        setShowMotionSpec(h.c(getContext(), i11));
    }

    public void setSize(int i11) {
        this.f15303h = 0;
        if (i11 != this.f15302g) {
            this.f15302g = i11;
            requestLayout();
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.q
    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f15299d != colorStateList) {
            this.f15299d = colorStateList;
            q();
        }
    }

    @Override // androidx.core.widget.q
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f15300e != mode) {
            this.f15300e = mode;
            q();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f11) {
        super.setTranslationX(f11);
        getImpl().H();
    }

    @Override // android.view.View
    public void setTranslationY(float f11) {
        super.setTranslationY(f11);
        getImpl().H();
    }

    @Override // android.view.View
    public void setTranslationZ(float f11) {
        super.setTranslationZ(f11);
        getImpl().H();
    }

    public void setUseCompatPadding(boolean z11) {
        if (this.f15306k != z11) {
            this.f15306k = z11;
            getImpl().A();
        }
    }

    @Override // com.google.android.material.internal.m, android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        super.setVisibility(i11);
    }

    void t(b bVar, boolean z11) {
        getImpl().Z(u(bVar), z11);
    }

    /* loaded from: classes3.dex */
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f15311a;

        /* renamed from: b  reason: collision with root package name */
        private b f15312b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f15313c;

        public BaseBehavior() {
            this.f15313c = true;
        }

        private static boolean F(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void G(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i11;
            Rect rect = floatingActionButton.f15307l;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i12 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) {
                i11 = rect.right;
            } else {
                i11 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i12 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i12 = -rect.top;
            }
            if (i12 != 0) {
                a0.h0(floatingActionButton, i12);
            }
            if (i11 != 0) {
                a0.g0(floatingActionButton, i11);
            }
        }

        private boolean J(View view, FloatingActionButton floatingActionButton) {
            return this.f15313c && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (J(appBarLayout, floatingActionButton)) {
                if (this.f15311a == null) {
                    this.f15311a = new Rect();
                }
                Rect rect = this.f15311a;
                com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    floatingActionButton.m(this.f15312b, false);
                    return true;
                }
                floatingActionButton.t(this.f15312b, false);
                return true;
            }
            return false;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (J(view, floatingActionButton)) {
                if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                    floatingActionButton.m(this.f15312b, false);
                    return true;
                }
                floatingActionButton.t(this.f15312b, false);
                return true;
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: E */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f15307l;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            } else if (F(view)) {
                L(view, floatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i11) {
            List<View> r11 = coordinatorLayout.r(floatingActionButton);
            int size = r11.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = r11.get(i12);
                if (view instanceof AppBarLayout) {
                    if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (F(view) && L(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(floatingActionButton, i11);
            G(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f4238h == 0) {
                fVar.f4238h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fk.k.f26538d1);
            this.f15313c = obtainStyledAttributes.getBoolean(fk.k.f26544e1, true);
            obtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f15301f != colorStateList) {
            this.f15301f = colorStateList;
            getImpl().S(this.f15301f);
        }
    }
}