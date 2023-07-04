package com.tesla.TeslaV4.reactnative.module;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.tesla.logging.TeslaLog;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007R\u001d\u0010\u0013\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/ScreenUtilsNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "getName", "", "getScreenWidth", "getScreenHeight", "getTopInset", "getBottomInset", "color", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "setNavigationBarColor", "Landroid/util/DisplayMetrics;", "metrics$delegate", "Lvz/k;", "getMetrics", "()Landroid/util/DisplayMetrics;", "metrics", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ScreenUtilsNativeModule extends ReactContextBaseJavaModule {
    private final vz.k metrics$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static final class a extends kotlin.jvm.internal.u implements h00.a<DisplayMetrics> {

        /* renamed from: a */
        final /* synthetic */ ReactApplicationContext f21405a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactApplicationContext reactApplicationContext) {
            super(0);
            this.f21405a = reactApplicationContext;
        }

        @Override // h00.a
        /* renamed from: a */
        public final DisplayMetrics invoke() {
            Object systemService = this.f21405a.getSystemService("window");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            DisplayMetrics displayMetrics = this.f21405a.getResources().getDisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            return displayMetrics;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenUtilsNativeModule(ReactApplicationContext context) {
        super(context);
        vz.k a11;
        kotlin.jvm.internal.s.g(context, "context");
        a11 = vz.m.a(new a(context));
        this.metrics$delegate = a11;
        int screenWidth = getScreenWidth();
        _init_$log("getScreenWidth()=" + screenWidth);
        int screenHeight = getScreenHeight();
        _init_$log("getScreenHeight()=" + screenHeight);
        int topInset = getTopInset();
        _init_$log("getTopInset()=" + topInset);
        int bottomInset = getBottomInset();
        _init_$log("getBottomInset()=" + bottomInset);
    }

    private static final void _init_$log(String str) {
        TeslaLog.INSTANCE.i("ScreenUtils", str);
    }

    public static /* synthetic */ void a(ScreenUtilsNativeModule screenUtilsNativeModule, String str, Promise promise) {
        m575setNavigationBarColor$lambda0(screenUtilsNativeModule, str, promise);
    }

    private final DisplayMetrics getMetrics() {
        Object value = this.metrics$delegate.getValue();
        kotlin.jvm.internal.s.f(value, "<get-metrics>(...)");
        return (DisplayMetrics) value;
    }

    /* renamed from: setNavigationBarColor$lambda-0 */
    public static final void m575setNavigationBarColor$lambda0(ScreenUtilsNativeModule this$0, String color, Promise promise) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(color, "$color");
        kotlin.jvm.internal.s.g(promise, "$promise");
        Activity currentActivity = this$0.getCurrentActivity();
        Window window = currentActivity == null ? null : currentActivity.getWindow();
        if (window != null) {
            window.setNavigationBarColor(Color.parseColor(color));
        }
        promise.resolve(Boolean.TRUE);
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final int getBottomInset() {
        int c11;
        int c12;
        Activity currentActivity;
        Window window;
        View decorView;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
        WindowInsets windowInsets = null;
        if (Build.VERSION.SDK_INT >= 23 && (currentActivity = getCurrentActivity()) != null && (window = currentActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            windowInsets = decorView.getRootWindowInsets();
        }
        if (windowInsets == null) {
            int identifier = reactApplicationContext.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier <= 0 || ViewConfiguration.get(reactApplicationContext).hasPermanentMenuKey()) {
                return 0;
            }
            c12 = j00.c.c(reactApplicationContext.getResources().getDimensionPixelSize(identifier) / getMetrics().density);
            return c12;
        }
        c11 = j00.c.c(windowInsets.getSystemWindowInsetBottom() / getMetrics().density);
        return c11;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ScreenUtils";
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final int getScreenHeight() {
        int c11;
        c11 = j00.c.c(getMetrics().heightPixels / getMetrics().density);
        return c11;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final int getScreenWidth() {
        int c11;
        c11 = j00.c.c(getMetrics().widthPixels / getMetrics().density);
        return c11;
    }

    @ReactMethod(isBlockingSynchronousMethod = true)
    public final int getTopInset() {
        int c11;
        int c12;
        Activity currentActivity;
        Window window;
        View decorView;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        kotlin.jvm.internal.s.f(reactApplicationContext, "reactApplicationContext");
        WindowInsets windowInsets = null;
        if (Build.VERSION.SDK_INT >= 23 && (currentActivity = getCurrentActivity()) != null && (window = currentActivity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            windowInsets = decorView.getRootWindowInsets();
        }
        if (windowInsets == null) {
            int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier > 0) {
                c12 = j00.c.c(reactApplicationContext.getResources().getDimensionPixelSize(identifier) / getMetrics().density);
                return c12;
            }
            return 0;
        }
        c11 = j00.c.c(windowInsets.getSystemWindowInsetTop() / getMetrics().density);
        return c11;
    }

    @ReactMethod
    public final void setNavigationBarColor(final String color, final Promise promise) {
        kotlin.jvm.internal.s.g(color, "color");
        kotlin.jvm.internal.s.g(promise, "promise");
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.tesla.TeslaV4.reactnative.module.c0
                    {
                        ScreenUtilsNativeModule.this = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ScreenUtilsNativeModule.a(ScreenUtilsNativeModule.this, color, promise);
                    }
                });
                return;
            } catch (IllegalViewOperationException e11) {
                promise.reject(e11);
                return;
            }
        }
        promise.reject(new Throwable("Only Android Lollipop and above is supported"));
    }
}