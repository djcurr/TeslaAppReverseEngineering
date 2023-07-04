package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import fk.k;
import gk.h;
import java.util.List;

/* loaded from: classes3.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {

    /* renamed from: a  reason: collision with root package name */
    private int f15279a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.c f15280b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.c f15281c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.c f15282d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.material.floatingactionbutton.c f15283e;

    /* renamed from: f  reason: collision with root package name */
    private final int f15284f;

    /* renamed from: g  reason: collision with root package name */
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> f15285g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f15286h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f15287i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f15288j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f15294a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.google.android.material.floatingactionbutton.c f15295b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f15296c;

        a(ExtendedFloatingActionButton extendedFloatingActionButton, com.google.android.material.floatingactionbutton.c cVar, f fVar) {
            this.f15295b = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f15294a = true;
            this.f15295b.f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f15295b.a();
            if (this.f15294a) {
                return;
            }
            this.f15295b.i(this.f15296c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f15295b.onAnimationStart(animator);
            this.f15294a = false;
        }
    }

    /* loaded from: classes3.dex */
    static class b extends Property<View, Float> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f11) {
            view.getLayoutParams().width = f11.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    static class c extends Property<View, Float> {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f11) {
            view.getLayoutParams().height = f11.intValue();
            view.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    static class d extends Property<View, Float> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(a0.K(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f11) {
            a0.K0(view, f11.intValue(), view.getPaddingTop(), a0.J(view), view.getPaddingBottom());
        }
    }

    /* loaded from: classes3.dex */
    static class e extends Property<View, Float> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf(a0.J(view));
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(View view, Float f11) {
            a0.K0(view, a0.K(view), view.getPaddingTop(), f11.intValue(), view.getPaddingBottom());
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class f {
    }

    static {
        new b(Float.class, Snapshot.WIDTH);
        new c(Float.class, Snapshot.HEIGHT);
        new d(Float.class, "paddingStart");
        new e(Float.class, "paddingEnd");
    }

    private boolean f() {
        return getVisibility() != 0 ? this.f15279a == 2 : this.f15279a != 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(com.google.android.material.floatingactionbutton.c cVar, f fVar) {
        if (cVar.e()) {
            return;
        }
        if (!i()) {
            cVar.c();
            cVar.i(fVar);
            return;
        }
        measure(0, 0);
        AnimatorSet g11 = cVar.g();
        g11.addListener(new a(this, cVar, fVar));
        for (Animator.AnimatorListener animatorListener : cVar.h()) {
            g11.addListener(animatorListener);
        }
        g11.start();
    }

    private void h() {
        getTextColors();
    }

    private boolean i() {
        return (a0.a0(this) || (!f() && this.f15288j)) && !isInEditMode();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.f15285g;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    int getCollapsedSize() {
        int i11 = this.f15284f;
        return i11 < 0 ? (Math.min(a0.K(this), a0.J(this)) * 2) + getIconSize() : i11;
    }

    public h getExtendMotionSpec() {
        return this.f15281c.d();
    }

    public h getHideMotionSpec() {
        return this.f15283e.d();
    }

    public h getShowMotionSpec() {
        return this.f15282d.d();
    }

    public h getShrinkMotionSpec() {
        return this.f15280b.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15286h && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f15286h = false;
            this.f15280b.c();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z11) {
        this.f15288j = z11;
    }

    public void setExtendMotionSpec(h hVar) {
        this.f15281c.b(hVar);
    }

    public void setExtendMotionSpecResource(int i11) {
        setExtendMotionSpec(h.c(getContext(), i11));
    }

    public void setExtended(boolean z11) {
        if (this.f15286h == z11) {
            return;
        }
        com.google.android.material.floatingactionbutton.c cVar = z11 ? this.f15281c : this.f15280b;
        if (cVar.e()) {
            return;
        }
        cVar.c();
    }

    public void setHideMotionSpec(h hVar) {
        this.f15283e.b(hVar);
    }

    public void setHideMotionSpecResource(int i11) {
        setHideMotionSpec(h.c(getContext(), i11));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        super.setPadding(i11, i12, i13, i14);
        if (!this.f15286h || this.f15287i) {
            return;
        }
        a0.K(this);
        a0.J(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i11, int i12, int i13, int i14) {
        super.setPaddingRelative(i11, i12, i13, i14);
    }

    public void setShowMotionSpec(h hVar) {
        this.f15282d.b(hVar);
    }

    public void setShowMotionSpecResource(int i11) {
        setShowMotionSpec(h.c(getContext(), i11));
    }

    public void setShrinkMotionSpec(h hVar) {
        this.f15280b.b(hVar);
    }

    public void setShrinkMotionSpecResource(int i11) {
        setShrinkMotionSpec(h.c(getContext(), i11));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i11) {
        super.setTextColor(i11);
        h();
    }

    /* loaded from: classes3.dex */
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {

        /* renamed from: a  reason: collision with root package name */
        private Rect f15289a;

        /* renamed from: b  reason: collision with root package name */
        private f f15290b;

        /* renamed from: c  reason: collision with root package name */
        private f f15291c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f15292d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f15293e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f15292d = false;
            this.f15293e = true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f15292d || this.f15293e) && ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).e() == view.getId();
        }

        private boolean L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(appBarLayout, extendedFloatingActionButton)) {
                if (this.f15289a == null) {
                    this.f15289a = new Rect();
                }
                Rect rect = this.f15289a;
                com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
                if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                    K(extendedFloatingActionButton);
                    return true;
                }
                E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        private boolean M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (J(view, extendedFloatingActionButton)) {
                if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                    K(extendedFloatingActionButton);
                    return true;
                }
                E(extendedFloatingActionButton);
                return true;
            }
            return false;
        }

        protected void E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z11 = this.f15293e;
            extendedFloatingActionButton.g(z11 ? extendedFloatingActionButton.f15281c : extendedFloatingActionButton.f15282d, z11 ? this.f15291c : this.f15290b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: F */
        public boolean b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: H */
        public boolean h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (G(view)) {
                M(view, extendedFloatingActionButton);
                return false;
            } else {
                return false;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: I */
        public boolean l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i11) {
            List<View> r11 = coordinatorLayout.r(extendedFloatingActionButton);
            int size = r11.size();
            for (int i12 = 0; i12 < size; i12++) {
                View view = r11.get(i12);
                if (view instanceof AppBarLayout) {
                    if (L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (G(view) && M(view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.I(extendedFloatingActionButton, i11);
            return true;
        }

        protected void K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z11 = this.f15293e;
            extendedFloatingActionButton.g(z11 ? extendedFloatingActionButton.f15280b : extendedFloatingActionButton.f15283e, z11 ? this.f15291c : this.f15290b);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f4238h == 0) {
                fVar.f4238h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.f26520a1);
            this.f15292d = obtainStyledAttributes.getBoolean(k.f26526b1, false);
            this.f15293e = obtainStyledAttributes.getBoolean(k.f26532c1, true);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        h();
    }
}