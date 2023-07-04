package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.l;
import gk.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.b {
    private Integer Q1;
    private boolean Q2;
    private final int V1;

    /* renamed from: b2  reason: collision with root package name */
    private final wk.g f14909b2;

    /* renamed from: g2  reason: collision with root package name */
    private Animator f14910g2;

    /* renamed from: i3  reason: collision with root package name */
    private int f14911i3;

    /* renamed from: j3  reason: collision with root package name */
    private ArrayList<g> f14912j3;

    /* renamed from: k3  reason: collision with root package name */
    private int f14913k3;

    /* renamed from: l3  reason: collision with root package name */
    private boolean f14914l3;

    /* renamed from: m3  reason: collision with root package name */
    private boolean f14915m3;

    /* renamed from: n3  reason: collision with root package name */
    private Behavior f14916n3;

    /* renamed from: o3  reason: collision with root package name */
    private int f14917o3;

    /* renamed from: p2  reason: collision with root package name */
    private Animator f14918p2;

    /* renamed from: p3  reason: collision with root package name */
    private int f14919p3;

    /* renamed from: q3  reason: collision with root package name */
    private int f14920q3;

    /* renamed from: r3  reason: collision with root package name */
    AnimatorListenerAdapter f14921r3;

    /* renamed from: s3  reason: collision with root package name */
    k<FloatingActionButton> f14922s3;

    /* renamed from: x2  reason: collision with root package name */
    private int f14923x2;

    /* renamed from: y2  reason: collision with root package name */
    private int f14924y2;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.l0();
            BottomAppBar.this.f14910g2 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends FloatingActionButton.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f14931a;

        /* loaded from: classes3.dex */
        class a extends FloatingActionButton.b {
            a() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
            public void b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.l0();
            }
        }

        b(int i11) {
            this.f14931a = i11;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.b
        public void a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.q0(this.f14931a));
            floatingActionButton.s(new a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.l0();
            BottomAppBar.this.f14914l3 = false;
            BottomAppBar.this.f14918p2 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public boolean f14935a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f14936b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f14937c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f14938d;

        d(ActionMenuView actionMenuView, int i11, boolean z11) {
            this.f14936b = actionMenuView;
            this.f14937c = i11;
            this.f14938d = z11;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f14935a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f14935a) {
                return;
            }
            boolean z11 = BottomAppBar.this.f14913k3 != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.v0(bottomAppBar.f14913k3);
            BottomAppBar.this.B0(this.f14936b, this.f14937c, this.f14938d, z11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ActionMenuView f14940a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f14941b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f14942c;

        e(ActionMenuView actionMenuView, int i11, boolean z11) {
            this.f14940a = actionMenuView;
            this.f14941b = i11;
            this.f14942c = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionMenuView actionMenuView = this.f14940a;
            actionMenuView.setTranslationX(BottomAppBar.this.p0(actionMenuView, this.f14941b, this.f14942c));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f14921r3.onAnimationStart(animator);
            FloatingActionButton n02 = BottomAppBar.this.n0();
            if (n02 != null) {
                n02.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public interface g {
        void a(BottomAppBar bottomAppBar);

        void b(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class h extends a4.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        int f14945c;

        /* renamed from: d  reason: collision with root package name */
        boolean f14946d;

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

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a4.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f14945c);
            parcel.writeInt(this.f14946d ? 1 : 0);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14945c = parcel.readInt();
            this.f14946d = parcel.readInt() != 0;
        }
    }

    private void A0(ActionMenuView actionMenuView, int i11, boolean z11) {
        B0(actionMenuView, i11, z11, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0(ActionMenuView actionMenuView, int i11, boolean z11, boolean z12) {
        e eVar = new e(actionMenuView, i11, z11);
        if (z12) {
            actionMenuView.post(eVar);
        } else {
            eVar.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(FloatingActionButton floatingActionButton) {
        floatingActionButton.e(this.f14921r3);
        floatingActionButton.f(new f());
        floatingActionButton.g(this.f14922s3);
    }

    private ActionMenuView getActionMenuView() {
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.f14917o3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return q0(this.f14923x2);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.f14920q3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.f14919p3;
    }

    private com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a) this.f14909b2.E().p();
    }

    private void h0() {
        Animator animator = this.f14918p2;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f14910g2;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    private void j0(int i11, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(n0(), "translationX", q0(i11));
        ofFloat.setDuration(300L);
        list.add(ofFloat);
    }

    private void k0(int i11, boolean z11, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - p0(actionMenuView, i11, z11)) > 1.0f) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", BitmapDescriptorFactory.HUE_RED);
            ofFloat2.addListener(new d(actionMenuView, i11, z11));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(ofFloat2, ofFloat);
            list.add(animatorSet);
        } else if (actionMenuView.getAlpha() < 1.0f) {
            list.add(ofFloat);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0() {
        ArrayList<g> arrayList;
        int i11 = this.f14911i3 - 1;
        this.f14911i3 = i11;
        if (i11 != 0 || (arrayList = this.f14912j3) == null) {
            return;
        }
        Iterator<g> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        ArrayList<g> arrayList;
        int i11 = this.f14911i3;
        this.f14911i3 = i11 + 1;
        if (i11 != 0 || (arrayList = this.f14912j3) == null) {
            return;
        }
        Iterator<g> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public FloatingActionButton n0() {
        View o02 = o0();
        if (o02 instanceof FloatingActionButton) {
            return (FloatingActionButton) o02;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View o0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.s(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.o0():android.view.View");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float q0(int i11) {
        boolean d11 = l.d(this);
        if (i11 == 1) {
            return ((getMeasuredWidth() / 2) - (this.V1 + (d11 ? this.f14920q3 : this.f14919p3))) * (d11 ? -1 : 1);
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    private boolean r0() {
        FloatingActionButton n02 = n0();
        return n02 != null && n02.o();
    }

    private void s0(int i11, boolean z11) {
        if (!a0.a0(this)) {
            v0(this.f14913k3);
            return;
        }
        Animator animator = this.f14918p2;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!r0()) {
            i11 = 0;
            z11 = false;
        }
        k0(i11, z11, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f14918p2 = animatorSet;
        animatorSet.addListener(new c());
        this.f14918p2.start();
    }

    private void t0(int i11) {
        if (this.f14923x2 == i11 || !a0.a0(this)) {
            return;
        }
        Animator animator = this.f14910g2;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.f14924y2 == 1) {
            j0(i11, arrayList);
        } else {
            i0(i11, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f14910g2 = animatorSet;
        animatorSet.addListener(new a());
        this.f14910g2.start();
    }

    private Drawable u0(Drawable drawable) {
        if (drawable == null || this.Q1 == null) {
            return drawable;
        }
        Drawable r11 = n3.a.r(drawable.mutate());
        n3.a.n(r11, this.Q1.intValue());
        return r11;
    }

    private void w0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.f14918p2 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (!r0()) {
            A0(actionMenuView, 0, false);
        } else {
            A0(actionMenuView, this.f14923x2, this.f14915m3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        getTopEdgeTreatment().m(getFabTranslationX());
        View o02 = o0();
        this.f14909b2.Z((this.f14915m3 && r0()) ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        if (o02 != null) {
            o02.setTranslationY(getFabTranslationY());
            o02.setTranslationX(getFabTranslationX());
        }
    }

    public ColorStateList getBackgroundTint() {
        return this.f14909b2.G();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().c();
    }

    public int getFabAlignmentMode() {
        return this.f14923x2;
    }

    public int getFabAnimationMode() {
        return this.f14924y2;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().e();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().f();
    }

    public boolean getHideOnScroll() {
        return this.Q2;
    }

    protected void i0(int i11, List<Animator> list) {
        FloatingActionButton n02 = n0();
        if (n02 == null || n02.n()) {
            return;
        }
        m0();
        n02.l(new b(i11));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        wk.h.f(this, this.f14909b2);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (z11) {
            h0();
            x0();
        }
        w0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        this.f14923x2 = hVar.f14945c;
        this.f14915m3 = hVar.f14946d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        hVar.f14945c = this.f14923x2;
        hVar.f14946d = this.f14915m3;
        return hVar;
    }

    protected int p0(ActionMenuView actionMenuView, int i11, boolean z11) {
        if (i11 == 1 && z11) {
            boolean d11 = l.d(this);
            int measuredWidth = d11 ? getMeasuredWidth() : 0;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if ((childAt.getLayoutParams() instanceof Toolbar.e) && (((Toolbar.e) childAt.getLayoutParams()).f1141a & 8388615) == 8388611) {
                    if (d11) {
                        measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                    } else {
                        measuredWidth = Math.max(measuredWidth, childAt.getRight());
                    }
                }
            }
            return measuredWidth - ((d11 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (d11 ? this.f14919p3 : -this.f14920q3));
        }
        return 0;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        n3.a.o(this.f14909b2, colorStateList);
    }

    public void setCradleVerticalOffset(float f11) {
        if (f11 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().h(f11);
            this.f14909b2.invalidateSelf();
            x0();
        }
    }

    @Override // android.view.View
    public void setElevation(float f11) {
        this.f14909b2.X(f11);
        getBehavior().I(this, this.f14909b2.D() - this.f14909b2.C());
    }

    public void setFabAlignmentMode(int i11) {
        y0(i11, 0);
    }

    public void setFabAnimationMode(int i11) {
        this.f14924y2 = i11;
    }

    void setFabCornerSize(float f11) {
        if (f11 != getTopEdgeTreatment().d()) {
            getTopEdgeTreatment().i(f11);
            this.f14909b2.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f11) {
        if (f11 != getFabCradleMargin()) {
            getTopEdgeTreatment().j(f11);
            this.f14909b2.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f11) {
        if (f11 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().k(f11);
            this.f14909b2.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z11) {
        this.Q2 = z11;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(u0(drawable));
    }

    public void setNavigationIconTint(int i11) {
        this.Q1 = Integer.valueOf(i11);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public void v0(int i11) {
        if (i11 != 0) {
            this.f14913k3 = 0;
            getMenu().clear();
            x(i11);
        }
    }

    public void y0(int i11, int i12) {
        this.f14913k3 = i12;
        s0(i11, this.f14915m3);
        t0(i11);
        this.f14923x2 = i11;
    }

    boolean z0(int i11) {
        float f11 = i11;
        if (f11 != getTopEdgeTreatment().g()) {
            getTopEdgeTreatment().l(f11);
            this.f14909b2.invalidateSelf();
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Behavior getBehavior() {
        if (this.f14916n3 == null) {
            this.f14916n3 = new Behavior();
        }
        return this.f14916n3;
    }

    /* loaded from: classes3.dex */
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: e  reason: collision with root package name */
        private final Rect f14925e;

        /* renamed from: f  reason: collision with root package name */
        private WeakReference<BottomAppBar> f14926f;

        /* renamed from: g  reason: collision with root package name */
        private int f14927g;

        /* renamed from: h  reason: collision with root package name */
        private final View.OnLayoutChangeListener f14928h;

        /* loaded from: classes3.dex */
        class a implements View.OnLayoutChangeListener {
            a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f14926f.get();
                if (bottomAppBar != null && (view instanceof FloatingActionButton)) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.j(Behavior.this.f14925e);
                    int height = Behavior.this.f14925e.height();
                    bottomAppBar.z0(height);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.f14925e)));
                    CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
                    if (Behavior.this.f14927g == 0) {
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(fk.d.f26421y) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = bottomAppBar.getLeftInset();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = bottomAppBar.getRightInset();
                        if (l.d(floatingActionButton)) {
                            ((ViewGroup.MarginLayoutParams) fVar).leftMargin += bottomAppBar.V1;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) fVar).rightMargin += bottomAppBar.V1;
                            return;
                        }
                    }
                    return;
                }
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f14928h = new a();
            this.f14925e = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: Q */
        public boolean l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i11) {
            this.f14926f = new WeakReference<>(bottomAppBar);
            View o02 = bottomAppBar.o0();
            if (o02 != null && !a0.a0(o02)) {
                CoordinatorLayout.f fVar = (CoordinatorLayout.f) o02.getLayoutParams();
                fVar.f4234d = 49;
                this.f14927g = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                if (o02 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) o02;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(fk.a.f26362f);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(fk.a.f26361e);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.f14928h);
                    bottomAppBar.g0(floatingActionButton);
                }
                bottomAppBar.x0();
            }
            coordinatorLayout.I(bottomAppBar, i11);
            return super.l(coordinatorLayout, bottomAppBar, i11);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* renamed from: R */
        public boolean A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i11, int i12) {
            return bottomAppBar.getHideOnScroll() && super.A(coordinatorLayout, bottomAppBar, view, view2, i11, i12);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f14928h = new a();
            this.f14925e = new Rect();
        }
    }
}