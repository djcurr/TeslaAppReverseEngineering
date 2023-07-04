package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.a0;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

@fg.a(name = StatusBarModule.NAME)
/* loaded from: classes3.dex */
public class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    /* loaded from: classes3.dex */
    class a extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f12075a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f12076b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f12077c;

        /* renamed from: com.facebook.react.modules.statusbar.StatusBarModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0234a implements ValueAnimator.AnimatorUpdateListener {
            C0234a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                a.this.f12075a.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(StatusBarModule statusBarModule, ReactContext reactContext, Activity activity, boolean z11, int i11) {
            super(reactContext);
            this.f12075a = activity;
            this.f12076b = z11;
            this.f12077c = i11;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            this.f12075a.getWindow().addFlags(Integer.MIN_VALUE);
            if (this.f12076b) {
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f12075a.getWindow().getStatusBarColor()), Integer.valueOf(this.f12077c));
                ofObject.addUpdateListener(new C0234a());
                ofObject.setDuration(300L).setStartDelay(0L);
                ofObject.start();
                return;
            }
            this.f12075a.getWindow().setStatusBarColor(this.f12077c);
        }
    }

    /* loaded from: classes3.dex */
    class b extends GuardedRunnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f12079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f12080b;

        /* loaded from: classes3.dex */
        class a implements View.OnApplyWindowInsetsListener {
            a(b bVar) {
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
                return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(StatusBarModule statusBarModule, ReactContext reactContext, Activity activity, boolean z11) {
            super(reactContext);
            this.f12079a = activity;
            this.f12080b = z11;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            View decorView = this.f12079a.getWindow().getDecorView();
            if (this.f12080b) {
                decorView.setOnApplyWindowInsetsListener(new a(this));
            } else {
                decorView.setOnApplyWindowInsetsListener(null);
            }
            a0.t0(decorView);
        }
    }

    /* loaded from: classes3.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f12081a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f12082b;

        c(StatusBarModule statusBarModule, boolean z11, Activity activity) {
            this.f12081a = z11;
            this.f12082b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f12081a) {
                this.f12082b.getWindow().addFlags(1024);
                this.f12082b.getWindow().clearFlags(2048);
                return;
            }
            this.f12082b.getWindow().addFlags(2048);
            this.f12082b.getWindow().clearFlags(1024);
        }
    }

    /* loaded from: classes3.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f12083a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12084b;

        d(StatusBarModule statusBarModule, Activity activity, String str) {
            this.f12083a = activity;
            this.f12084b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            View decorView = this.f12083a.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility("dark-content".equals(this.f12084b) ? systemUiVisibility | PKIFailureInfo.certRevoked : systemUiVisibility & (-8193));
        }
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return yf.c.e(HEIGHT_KEY, Float.valueOf(identifier > 0 ? p.a(reactApplicationContext.getResources().getDimensionPixelSize(identifier)) : BitmapDescriptorFactory.HUE_RED), DEFAULT_BACKGROUND_COLOR_KEY, currentActivity != null ? String.format("#%06X", Integer.valueOf(currentActivity.getWindow().getStatusBarColor() & 16777215)) : "black");
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double d11, boolean z11) {
        int i11 = (int) d11;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            nd.a.G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new a(this, getReactApplicationContext(), currentActivity, z11, i11));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(boolean z11) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            nd.a.G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new c(this, z11, currentActivity));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            nd.a.G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 23) {
            UiThreadUtil.runOnUiThread(new d(this, currentActivity, str));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(boolean z11) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            nd.a.G("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new b(this, getReactApplicationContext(), currentActivity, z11));
        }
    }
}