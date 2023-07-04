package g6;

import android.graphics.Bitmap;
import android.os.Build;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    public static final int a(Bitmap allocationByteCountCompat) {
        s.g(allocationByteCountCompat, "$this$allocationByteCountCompat");
        if (!allocationByteCountCompat.isRecycled()) {
            try {
                if (Build.VERSION.SDK_INT >= 19) {
                    allocationByteCountCompat = allocationByteCountCompat.getAllocationByteCount();
                } else {
                    allocationByteCountCompat = allocationByteCountCompat.getHeight() * allocationByteCountCompat.getRowBytes();
                }
                return allocationByteCountCompat;
            } catch (Exception unused) {
                return m.f27804a.a(allocationByteCountCompat.getWidth(), allocationByteCountCompat.getHeight(), allocationByteCountCompat.getConfig());
            }
        }
        throw new IllegalStateException(("Cannot obtain size for recycled bitmap: " + allocationByteCountCompat + " [" + allocationByteCountCompat.getWidth() + " x " + allocationByteCountCompat.getHeight() + "] + " + allocationByteCountCompat.getConfig()).toString());
    }

    public static final int b(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return 1;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        return (Build.VERSION.SDK_INT < 26 || config != Bitmap.Config.RGBA_F16) ? 4 : 8;
    }

    public static final Bitmap.Config c(Bitmap safeConfig) {
        s.g(safeConfig, "$this$safeConfig");
        Bitmap.Config config = safeConfig.getConfig();
        return config != null ? config : Bitmap.Config.ARGB_8888;
    }

    public static final boolean d(Bitmap.Config isHardware) {
        s.g(isHardware, "$this$isHardware");
        return Build.VERSION.SDK_INT >= 26 && isHardware == Bitmap.Config.HARDWARE;
    }

    public static final Bitmap.Config e(Bitmap.Config config) {
        return (config == null || d(config)) ? Bitmap.Config.ARGB_8888 : config;
    }
}