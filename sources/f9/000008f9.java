package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class f extends w0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f6132a;

        a(f fVar, View view) {
            this.f6132a = view;
        }

        @Override // androidx.transition.z, androidx.transition.y.g
        public void onTransitionEnd(y yVar) {
            p0.h(this.f6132a, 1.0f);
            p0.a(this.f6132a);
            yVar.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private final View f6133a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f6134b = false;

        b(View view) {
            this.f6133a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            p0.h(this.f6133a, 1.0f);
            if (this.f6134b) {
                this.f6133a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (androidx.core.view.a0.V(this.f6133a) && this.f6133a.getLayerType() == 0) {
                this.f6134b = true;
                this.f6133a.setLayerType(2, null);
            }
        }
    }

    public f(int i11) {
        setMode(i11);
    }

    private Animator a(View view, float f11, float f12) {
        if (f11 == f12) {
            return null;
        }
        p0.h(view, f11);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, p0.f6196b, f12);
        ofFloat.addListener(new b(view));
        addListener(new a(this, view));
        return ofFloat;
    }

    private static float b(e0 e0Var, float f11) {
        Float f12;
        return (e0Var == null || (f12 = (Float) e0Var.f6129a.get("android:fade:transitionAlpha")) == null) ? f11 : f12.floatValue();
    }

    @Override // androidx.transition.w0, androidx.transition.y
    public void captureStartValues(e0 e0Var) {
        super.captureStartValues(e0Var);
        e0Var.f6129a.put("android:fade:transitionAlpha", Float.valueOf(p0.c(e0Var.f6130b)));
    }

    @Override // androidx.transition.w0
    public Animator onAppear(ViewGroup viewGroup, View view, e0 e0Var, e0 e0Var2) {
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float b11 = b(e0Var, BitmapDescriptorFactory.HUE_RED);
        if (b11 != 1.0f) {
            f11 = b11;
        }
        return a(view, f11, 1.0f);
    }

    @Override // androidx.transition.w0
    public Animator onDisappear(ViewGroup viewGroup, View view, e0 e0Var, e0 e0Var2) {
        p0.e(view);
        return a(view, b(e0Var, 1.0f), BitmapDescriptorFactory.HUE_RED);
    }

    public f() {
    }
}