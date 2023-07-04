package com.facebook.react.uimanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a */
    private static DisplayMetrics f12213a;

    /* renamed from: b */
    private static DisplayMetrics f12214b;

    public static WritableMap a(double d11) {
        wf.a.b((f12213a == null || f12214b == null) ? false : true, "DisplayMetricsHolder must be initialized with initDisplayMetricsIfNotInitialized or initDisplayMetrics");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap("windowPhysicalPixels", b(f12213a, d11));
        writableNativeMap.putMap("screenPhysicalPixels", b(f12214b, d11));
        return writableNativeMap;
    }

    private static WritableMap b(DisplayMetrics displayMetrics, double d11) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(Snapshot.WIDTH, displayMetrics.widthPixels);
        writableNativeMap.putInt(Snapshot.HEIGHT, displayMetrics.heightPixels);
        writableNativeMap.putDouble("scale", displayMetrics.density);
        writableNativeMap.putDouble("fontScale", d11);
        writableNativeMap.putDouble("densityDpi", displayMetrics.densityDpi);
        return writableNativeMap;
    }

    public static DisplayMetrics c() {
        return f12214b;
    }

    @Deprecated
    public static DisplayMetrics d() {
        return f12213a;
    }

    public static void e(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        h(displayMetrics);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        displayMetrics2.setTo(displayMetrics);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        wf.a.d(windowManager, "WindowManager is null!");
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics2);
        g(displayMetrics2);
    }

    public static void f(Context context) {
        if (c() != null) {
            return;
        }
        e(context);
    }

    public static void g(DisplayMetrics displayMetrics) {
        f12214b = displayMetrics;
    }

    public static void h(DisplayMetrics displayMetrics) {
        f12213a = displayMetrics;
    }
}