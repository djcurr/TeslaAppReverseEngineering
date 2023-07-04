package com.swmansion.rnscreens;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import androidx.core.view.a0;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.rnscreens.d;
import com.swmansion.rnscreens.s;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public final class s {

    /* renamed from: a */
    public static final s f21312a = new s();

    /* renamed from: b */
    private static boolean f21313b;

    /* renamed from: c */
    private static boolean f21314c;

    /* renamed from: d */
    private static Integer f21315d;

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21316a;

        static {
            int[] iArr = new int[d.g.values().length];
            iArr[d.g.ORIENTATION.ordinal()] = 1;
            iArr[d.g.COLOR.ordinal()] = 2;
            iArr[d.g.STYLE.ordinal()] = 3;
            iArr[d.g.TRANSLUCENT.ordinal()] = 4;
            iArr[d.g.HIDDEN.ordinal()] = 5;
            iArr[d.g.ANIMATED.ordinal()] = 6;
            f21316a = iArr;
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends GuardedRunnable {

        /* renamed from: a */
        final /* synthetic */ Activity f21317a;

        /* renamed from: b */
        final /* synthetic */ Integer f21318b;

        /* renamed from: c */
        final /* synthetic */ boolean f21319c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Activity activity, Integer num, boolean z11, ReactContext reactContext) {
            super(reactContext);
            this.f21317a = activity;
            this.f21318b = num;
            this.f21319c = z11;
        }

        public static /* synthetic */ void a(Activity activity, ValueAnimator valueAnimator) {
            b(activity, valueAnimator);
        }

        public static final void b(Activity activity, ValueAnimator valueAnimator) {
            Window window = activity.getWindow();
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            window.setStatusBarColor(((Integer) animatedValue).intValue());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            this.f21317a.getWindow().addFlags(Integer.MIN_VALUE);
            ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f21317a.getWindow().getStatusBarColor()), this.f21318b);
            final Activity activity = this.f21317a;
            ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.swmansion.rnscreens.t
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    s.b.a(activity, valueAnimator);
                }
            });
            if (this.f21319c) {
                ofObject.setDuration(300L).setStartDelay(0L);
            } else {
                ofObject.setDuration(0L).setStartDelay(300L);
            }
            ofObject.start();
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends GuardedRunnable {

        /* renamed from: a */
        final /* synthetic */ Activity f21320a;

        /* renamed from: b */
        final /* synthetic */ boolean f21321b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Activity activity, boolean z11, ReactContext reactContext) {
            super(reactContext);
            this.f21320a = activity;
            this.f21321b = z11;
        }

        public static /* synthetic */ WindowInsets a(View view, WindowInsets windowInsets) {
            return b(view, windowInsets);
        }

        public static final WindowInsets b(View view, WindowInsets windowInsets) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
            return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            View decorView = this.f21320a.getWindow().getDecorView();
            kotlin.jvm.internal.s.f(decorView, "activity.window.decorView");
            if (this.f21321b) {
                decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.swmansion.rnscreens.u
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return s.c.a(view, windowInsets);
                    }
                });
            } else {
                decorView.setOnApplyWindowInsetsListener(null);
            }
            a0.t0(decorView);
        }
    }

    private s() {
    }

    public static /* synthetic */ void a(Activity activity, String str) {
        m(activity, str);
    }

    public static /* synthetic */ void b(boolean z11, Activity activity) {
        j(z11, activity);
    }

    private final boolean e(d dVar, d.g gVar) {
        switch (a.f21316a[gVar.ordinal()]) {
            case 1:
                if (dVar.getScreenOrientation() != null) {
                    return true;
                }
                break;
            case 2:
                if (dVar.getStatusBarColor() != null) {
                    return true;
                }
                break;
            case 3:
                if (dVar.getStatusBarStyle() != null) {
                    return true;
                }
                break;
            case 4:
                if (dVar.d() != null) {
                    return true;
                }
                break;
            case 5:
                if (dVar.c() != null) {
                    return true;
                }
                break;
            case 6:
                if (dVar.b() != null) {
                    return true;
                }
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    private final d f(d dVar, d.g gVar) {
        i fragment;
        if (dVar == null || (fragment = dVar.getFragment()) == null) {
            return null;
        }
        for (f<?> fVar : fragment.l()) {
            d topScreen = fVar.getTopScreen();
            s sVar = f21312a;
            d f11 = sVar.f(topScreen, gVar);
            if (f11 != null) {
                return f11;
            }
            if (topScreen != null && sVar.e(topScreen, gVar)) {
                return topScreen;
            }
        }
        return null;
    }

    private final d g(d dVar, d.g gVar) {
        for (ViewParent container = dVar.getContainer(); container != null; container = container.getParent()) {
            if (container instanceof d) {
                d dVar2 = (d) container;
                if (e(dVar2, gVar)) {
                    return dVar2;
                }
            }
        }
        return null;
    }

    private final d h(d dVar, d.g gVar) {
        d f11 = f(dVar, gVar);
        return f11 != null ? f11 : e(dVar, gVar) ? dVar : g(dVar, gVar);
    }

    public static final void j(boolean z11, Activity activity) {
        if (z11) {
            activity.getWindow().addFlags(1024);
            activity.getWindow().clearFlags(2048);
            return;
        }
        activity.getWindow().addFlags(2048);
        activity.getWindow().clearFlags(1024);
    }

    public static final void m(Activity activity, String style) {
        kotlin.jvm.internal.s.g(style, "$style");
        View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.s.f(decorView, "activity.window.decorView");
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(kotlin.jvm.internal.s.c("dark", style) ? systemUiVisibility | PKIFailureInfo.certRevoked : systemUiVisibility & (-8193));
    }

    public final void c() {
        f21313b = true;
    }

    public final void d() {
        f21314c = true;
    }

    public final void i(d screen, Activity activity, ReactContext reactContext) {
        Boolean b11;
        kotlin.jvm.internal.s.g(screen, "screen");
        if (activity == null || reactContext == null || Build.VERSION.SDK_INT < 21) {
            return;
        }
        if (f21315d == null) {
            f21315d = Integer.valueOf(activity.getWindow().getStatusBarColor());
        }
        d h11 = h(screen, d.g.COLOR);
        d h12 = h(screen, d.g.ANIMATED);
        Integer statusBarColor = h11 == null ? null : h11.getStatusBarColor();
        if (statusBarColor == null) {
            statusBarColor = f21315d;
        }
        boolean z11 = false;
        if (h12 != null && (b11 = h12.b()) != null) {
            z11 = b11.booleanValue();
        }
        UiThreadUtil.runOnUiThread(new b(activity, statusBarColor, z11, reactContext));
    }

    public final void k(d screen, final Activity activity) {
        Boolean c11;
        kotlin.jvm.internal.s.g(screen, "screen");
        if (activity == null) {
            return;
        }
        d h11 = h(screen, d.g.HIDDEN);
        final boolean z11 = false;
        if (h11 != null && (c11 = h11.c()) != null) {
            z11 = c11.booleanValue();
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.r
            @Override // java.lang.Runnable
            public final void run() {
                s.b(z11, activity);
            }
        });
    }

    public final void l(d screen, Activity activity) {
        Integer screenOrientation;
        kotlin.jvm.internal.s.g(screen, "screen");
        if (activity == null) {
            return;
        }
        d h11 = h(screen, d.g.ORIENTATION);
        int i11 = -1;
        if (h11 != null && (screenOrientation = h11.getScreenOrientation()) != null) {
            i11 = screenOrientation.intValue();
        }
        activity.setRequestedOrientation(i11);
    }

    public final void n(d screen, final Activity activity, ReactContext reactContext) {
        String statusBarStyle;
        kotlin.jvm.internal.s.g(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        d h11 = h(screen, d.g.STYLE);
        final String str = "light";
        if (h11 != null && (statusBarStyle = h11.getStatusBarStyle()) != null) {
            str = statusBarStyle;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.swmansion.rnscreens.q
                @Override // java.lang.Runnable
                public final void run() {
                    s.a(activity, str);
                }
            });
        }
    }

    public final void o(d screen, Activity activity, ReactContext reactContext) {
        Boolean d11;
        kotlin.jvm.internal.s.g(screen, "screen");
        if (activity == null || reactContext == null) {
            return;
        }
        d h11 = h(screen, d.g.TRANSLUCENT);
        boolean z11 = false;
        if (h11 != null && (d11 = h11.d()) != null) {
            z11 = d11.booleanValue();
        }
        UiThreadUtil.runOnUiThread(new c(activity, z11, reactContext));
    }

    public final void p(d screen, Activity activity, ReactContext reactContext) {
        kotlin.jvm.internal.s.g(screen, "screen");
        if (f21313b) {
            l(screen, activity);
        }
        if (f21314c) {
            i(screen, activity, reactContext);
            n(screen, activity, reactContext);
            o(screen, activity, reactContext);
            k(screen, activity);
        }
    }
}