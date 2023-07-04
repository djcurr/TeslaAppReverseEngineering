package com.swmansion.rnscreens;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.swmansion.rnscreens.d;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0011\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/swmansion/rnscreens/m;", "Lcom/swmansion/rnscreens/i;", "Lcom/swmansion/rnscreens/d;", "screenView", "<init>", "(Lcom/swmansion/rnscreens/d;)V", "()V", "a", "b", "react-native-screens_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class m extends i {

    /* renamed from: f */
    private AppBarLayout f21276f;

    /* renamed from: g */
    private Toolbar f21277g;

    /* renamed from: h */
    private boolean f21278h;

    /* renamed from: i */
    private boolean f21279i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class a extends CoordinatorLayout {
        private final i E;
        private final Animation.AnimationListener F;

        /* renamed from: com.swmansion.rnscreens.m$a$a */
        /* loaded from: classes6.dex */
        public static final class animation.Animation$AnimationListenerC0388a implements Animation.AnimationListener {
            animation.Animation$AnimationListenerC0388a() {
                a.this = r1;
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                kotlin.jvm.internal.s.g(animation, "animation");
                a.this.E.o();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                kotlin.jvm.internal.s.g(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                kotlin.jvm.internal.s.g(animation, "animation");
                a.this.E.q();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, i mFragment) {
            super(context);
            kotlin.jvm.internal.s.g(context, "context");
            kotlin.jvm.internal.s.g(mFragment, "mFragment");
            this.E = mFragment;
            this.F = new animation.Animation$AnimationListenerC0388a();
        }

        @Override // android.view.View
        public void startAnimation(Animation animation) {
            kotlin.jvm.internal.s.g(animation, "animation");
            b bVar = new b(this.E);
            bVar.setDuration(animation.getDuration());
            if ((animation instanceof AnimationSet) && !this.E.isRemoving()) {
                ((AnimationSet) animation).addAnimation(bVar);
                animation.setAnimationListener(this.F);
                super.startAnimation(animation);
                return;
            }
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(animation);
            animationSet.addAnimation(bVar);
            animationSet.setAnimationListener(this.F);
            super.startAnimation(animationSet);
        }
    }

    /* loaded from: classes6.dex */
    private static final class b extends Animation {

        /* renamed from: a */
        private final i f21281a;

        public b(i mFragment) {
            kotlin.jvm.internal.s.g(mFragment, "mFragment");
            this.f21281a = mFragment;
        }

        @Override // android.view.animation.Animation
        protected void applyTransformation(float f11, Transformation t11) {
            kotlin.jvm.internal.s.g(t11, "t");
            super.applyTransformation(f11, t11);
            i iVar = this.f21281a;
            iVar.k(f11, !iVar.isResumed());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(d screenView) {
        super(screenView);
        kotlin.jvm.internal.s.g(screenView, "screenView");
    }

    private final void B() {
        View view = getView();
        ViewParent parent = view == null ? null : view.getParent();
        if (parent instanceof k) {
            ((k) parent).E();
        }
    }

    public static final void C(m this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.h();
        this$0.f();
    }

    public static /* synthetic */ void z(m mVar) {
        C(mVar);
    }

    public final boolean A() {
        f<?> container = m().getContainer();
        if (container instanceof k) {
            if (kotlin.jvm.internal.s.c(((k) container).getRootScreen(), m())) {
                Fragment parentFragment = getParentFragment();
                if (parentFragment instanceof m) {
                    return ((m) parentFragment).A();
                }
                return false;
            }
            return true;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
    }

    public final void D() {
        Toolbar toolbar;
        AppBarLayout appBarLayout = this.f21276f;
        if (appBarLayout != null && (toolbar = this.f21277g) != null && toolbar.getParent() == appBarLayout) {
            appBarLayout.removeView(toolbar);
        }
        this.f21277g = null;
    }

    public final void E(Toolbar toolbar) {
        kotlin.jvm.internal.s.g(toolbar, "toolbar");
        AppBarLayout appBarLayout = this.f21276f;
        if (appBarLayout != null) {
            appBarLayout.addView(toolbar);
        }
        AppBarLayout.f fVar = new AppBarLayout.f(-1, -2);
        fVar.g(0);
        toolbar.setLayoutParams(fVar);
        this.f21277g = toolbar;
    }

    public final void F(boolean z11) {
        if (this.f21278h != z11) {
            AppBarLayout appBarLayout = this.f21276f;
            if (appBarLayout != null) {
                appBarLayout.setTargetElevation(z11 ? BitmapDescriptorFactory.HUE_RED : com.facebook.react.uimanager.p.c(4.0f));
            }
            this.f21278h = z11;
        }
    }

    public final void G(boolean z11) {
        if (this.f21279i != z11) {
            ViewGroup.LayoutParams layoutParams = m().getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
            ((CoordinatorLayout.f) layoutParams).o(z11 ? null : new AppBarLayout.ScrollingViewBehavior());
            this.f21279i = z11;
        }
    }

    public final void dismiss() {
        f<?> container = m().getContainer();
        if (container instanceof k) {
            ((k) container).z(this);
            return;
        }
        throw new IllegalStateException("ScreenStackFragment added into a non-stack container".toString());
    }

    @Override // com.swmansion.rnscreens.i
    public void n() {
        o headerConfig = m().getHeaderConfig();
        if (headerConfig == null) {
            return;
        }
        headerConfig.g();
    }

    @Override // com.swmansion.rnscreens.i
    public void o() {
        super.o();
        B();
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i11, boolean z11, int i12) {
        if (i11 == 0 && !isHidden() && m().getStackAnimation() == d.e.NONE) {
            if (z11) {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.l
                    {
                        m.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        m.z(m.this);
                    }
                });
                return null;
            }
            i();
            g();
            B();
            return null;
        }
        return null;
    }

    @Override // com.swmansion.rnscreens.i, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        AppBarLayout appBarLayout;
        AppBarLayout appBarLayout2;
        kotlin.jvm.internal.s.g(inflater, "inflater");
        Context context = getContext();
        a aVar = context == null ? null : new a(context, this);
        CoordinatorLayout.f fVar = new CoordinatorLayout.f(-1, -1);
        fVar.o(this.f21279i ? null : new AppBarLayout.ScrollingViewBehavior());
        m().setLayoutParams(fVar);
        if (aVar != null) {
            aVar.addView(i.s(m()));
        }
        Context context2 = getContext();
        AppBarLayout appBarLayout3 = context2 != null ? new AppBarLayout(context2) : null;
        this.f21276f = appBarLayout3;
        if (appBarLayout3 != null) {
            appBarLayout3.setBackgroundColor(0);
        }
        AppBarLayout appBarLayout4 = this.f21276f;
        if (appBarLayout4 != null) {
            appBarLayout4.setLayoutParams(new AppBarLayout.f(-1, -2));
        }
        if (aVar != null) {
            aVar.addView(this.f21276f);
        }
        if (this.f21278h && (appBarLayout2 = this.f21276f) != null) {
            appBarLayout2.setTargetElevation(BitmapDescriptorFactory.HUE_RED);
        }
        Toolbar toolbar = this.f21277g;
        if (toolbar != null && (appBarLayout = this.f21276f) != null) {
            appBarLayout.addView(i.s(toolbar));
        }
        return aVar;
    }

    public m() {
        throw new IllegalStateException("ScreenStack fragments should never be restored. Follow instructions from https://github.com/software-mansion/react-native-screens/issues/17#issuecomment-424704067 to properly configure your main activity.");
    }
}