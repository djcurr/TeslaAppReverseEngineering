package ca.jaysoo.extradimensions;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class ExtraDimensionsModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    private ReactContext mReactContext;

    public ExtraDimensionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mReactContext = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
    }

    protected static float getNormalNavigationBarHeight(Context context) {
        int identifier;
        try {
            Resources resources = context.getResources();
            int identifier2 = resources.getIdentifier("config_showNavigationBar", "bool", "android");
            if (identifier2 > 0 && resources.getBoolean(identifier2) && (identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                return resources.getDimensionPixelSize(identifier);
            }
        } catch (Throwable unused) {
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    private float getRealHeight(DisplayMetrics displayMetrics) {
        return displayMetrics.heightPixels / displayMetrics.density;
    }

    private float getRealWidth(DisplayMetrics displayMetrics) {
        return displayMetrics.widthPixels / displayMetrics.density;
    }

    private float getSmartBarHeight(DisplayMetrics displayMetrics) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        boolean equals = Build.MANUFACTURER.equals("Meizu");
        boolean z11 = Settings.System.getInt(reactApplicationContext.getContentResolver(), "mz_smartbar_auto_hide", 0) == 1;
        if (!equals || z11) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.R$dimen");
            return reactApplicationContext.getResources().getDimensionPixelSize(Integer.parseInt(cls.getField("mz_action_button_min_height").get(cls.newInstance()).toString())) / displayMetrics.density;
        } catch (Throwable unused) {
            return getNormalNavigationBarHeight(reactApplicationContext) / displayMetrics.density;
        }
    }

    private float getSoftMenuBarHeight(DisplayMetrics displayMetrics) {
        if (hasPermanentMenuKey()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        int identifier = reactApplicationContext.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
        return identifier > 0 ? reactApplicationContext.getResources().getDimensionPixelSize(identifier) / displayMetrics.density : BitmapDescriptorFactory.HUE_RED;
    }

    private float getStatusBarHeight(DisplayMetrics displayMetrics) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        int identifier = reactApplicationContext.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? reactApplicationContext.getResources().getDimensionPixelSize(identifier) / displayMetrics.density : BitmapDescriptorFactory.HUE_RED;
    }

    private boolean hasPermanentMenuKey() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        int identifier = reactApplicationContext.getResources().getIdentifier("config_showNavigationBar", "bool", "android");
        return identifier <= 0 || !reactApplicationContext.getResources().getBoolean(identifier);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        DisplayMetrics displayMetrics = getReactApplicationContext().getResources().getDisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                Display.class.getMethod("getRealMetrics", DisplayMetrics.class).invoke(((WindowManager) this.mReactContext.getSystemService("window")).getDefaultDisplay(), displayMetrics);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        hashMap.put("REAL_WINDOW_HEIGHT", Float.valueOf(getRealHeight(displayMetrics)));
        hashMap.put("REAL_WINDOW_WIDTH", Float.valueOf(getRealWidth(displayMetrics)));
        hashMap.put("STATUS_BAR_HEIGHT", Float.valueOf(getStatusBarHeight(displayMetrics)));
        hashMap.put("SOFT_MENU_BAR_HEIGHT", Float.valueOf(getSoftMenuBarHeight(displayMetrics)));
        hashMap.put("SMART_BAR_HEIGHT", Float.valueOf(getSmartBarHeight(displayMetrics)));
        hashMap.put("SOFT_MENU_BAR_ENABLED", Boolean.valueOf(hasPermanentMenuKey()));
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ExtraDimensions";
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }
}