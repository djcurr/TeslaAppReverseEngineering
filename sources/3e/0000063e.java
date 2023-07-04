package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f4514a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f4515b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f4516c = null;

    /* renamed from: d  reason: collision with root package name */
    int f4517d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h0 f4518a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f4519b;

        a(g0 g0Var, h0 h0Var, View view) {
            this.f4518a = h0Var;
            this.f4519b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4518a.a(this.f4519b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4518a.b(this.f4519b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f4518a.c(this.f4519b);
        }
    }

    /* loaded from: classes.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j0 f4520a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f4521b;

        b(g0 g0Var, j0 j0Var, View view) {
            this.f4520a = j0Var;
            this.f4521b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f4520a.a(this.f4521b);
        }
    }

    /* loaded from: classes.dex */
    static class c implements h0 {

        /* renamed from: a  reason: collision with root package name */
        g0 f4522a;

        /* renamed from: b  reason: collision with root package name */
        boolean f4523b;

        c(g0 g0Var) {
            this.f4522a = g0Var;
        }

        @Override // androidx.core.view.h0
        public void a(View view) {
            Object tag = view.getTag(2113929216);
            h0 h0Var = tag instanceof h0 ? (h0) tag : null;
            if (h0Var != null) {
                h0Var.a(view);
            }
        }

        @Override // androidx.core.view.h0
        public void b(View view) {
            int i11 = this.f4522a.f4517d;
            if (i11 > -1) {
                view.setLayerType(i11, null);
                this.f4522a.f4517d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f4523b) {
                g0 g0Var = this.f4522a;
                Runnable runnable = g0Var.f4516c;
                if (runnable != null) {
                    g0Var.f4516c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                h0 h0Var = tag instanceof h0 ? (h0) tag : null;
                if (h0Var != null) {
                    h0Var.b(view);
                }
                this.f4523b = true;
            }
        }

        @Override // androidx.core.view.h0
        public void c(View view) {
            this.f4523b = false;
            if (this.f4522a.f4517d > -1) {
                view.setLayerType(2, null);
            }
            g0 g0Var = this.f4522a;
            Runnable runnable = g0Var.f4515b;
            if (runnable != null) {
                g0Var.f4515b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            h0 h0Var = tag instanceof h0 ? (h0) tag : null;
            if (h0Var != null) {
                h0Var.c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(View view) {
        this.f4514a = new WeakReference<>(view);
    }

    private void g(View view, h0 h0Var) {
        if (h0Var != null) {
            view.animate().setListener(new a(this, h0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public g0 a(float f11) {
        View view = this.f4514a.get();
        if (view != null) {
            view.animate().alpha(f11);
        }
        return this;
    }

    public void b() {
        View view = this.f4514a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.f4514a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public g0 d(long j11) {
        View view = this.f4514a.get();
        if (view != null) {
            view.animate().setDuration(j11);
        }
        return this;
    }

    public g0 e(Interpolator interpolator) {
        View view = this.f4514a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public g0 f(h0 h0Var) {
        View view = this.f4514a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT >= 16) {
                g(view, h0Var);
            } else {
                view.setTag(2113929216, h0Var);
                g(view, new c(this));
            }
        }
        return this;
    }

    public g0 h(long j11) {
        View view = this.f4514a.get();
        if (view != null) {
            view.animate().setStartDelay(j11);
        }
        return this;
    }

    public g0 i(j0 j0Var) {
        View view = this.f4514a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(j0Var != null ? new b(this, j0Var, view) : null);
        }
        return this;
    }

    public void j() {
        View view = this.f4514a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public g0 k(float f11) {
        View view = this.f4514a.get();
        if (view != null) {
            view.animate().translationY(f11);
        }
        return this;
    }
}