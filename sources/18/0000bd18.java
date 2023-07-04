package wp;

import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f56159a;

    public b(Context context) {
        this.f56159a = context;
    }

    private com.learnium.RNDeviceInfo.a b() {
        WindowManager windowManager = (WindowManager) this.f56159a.getSystemService("window");
        if (windowManager == null) {
            return com.learnium.RNDeviceInfo.a.UNKNOWN;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        double sqrt = Math.sqrt(Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d) + Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d));
        if (sqrt < 3.0d || sqrt > 6.9d) {
            if (sqrt > 6.9d && sqrt <= 18.0d) {
                return com.learnium.RNDeviceInfo.a.TABLET;
            }
            return com.learnium.RNDeviceInfo.a.UNKNOWN;
        }
        return com.learnium.RNDeviceInfo.a.HANDSET;
    }

    private com.learnium.RNDeviceInfo.a c() {
        int i11 = this.f56159a.getResources().getConfiguration().smallestScreenWidthDp;
        if (i11 == 0) {
            return com.learnium.RNDeviceInfo.a.UNKNOWN;
        }
        return i11 >= 600 ? com.learnium.RNDeviceInfo.a.TABLET : com.learnium.RNDeviceInfo.a.HANDSET;
    }

    public com.learnium.RNDeviceInfo.a a() {
        if (this.f56159a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return com.learnium.RNDeviceInfo.a.TV;
        }
        UiModeManager uiModeManager = (UiModeManager) this.f56159a.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return com.learnium.RNDeviceInfo.a.TV;
        }
        com.learnium.RNDeviceInfo.a c11 = c();
        return (c11 == null || c11 == com.learnium.RNDeviceInfo.a.UNKNOWN) ? b() : c11;
    }

    public boolean d() {
        return a() == com.learnium.RNDeviceInfo.a.TABLET;
    }
}