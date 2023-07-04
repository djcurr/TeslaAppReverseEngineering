package g6;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.StatFs;
import ch.qos.logback.core.rolling.SizeBasedTriggeringPolicy;
import java.io.File;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f27804a = new m();

    private m() {
    }

    public final int a(int i11, int i12, Bitmap.Config config) {
        return i11 * i12 * a.b(config);
    }

    public final long b(Context context, double d11) {
        int i11;
        Object systemService;
        s.g(context, "context");
        try {
            systemService = androidx.core.content.b.getSystemService(context, ActivityManager.class);
        } catch (Exception unused) {
            i11 = 256;
        }
        if (systemService != null) {
            ActivityManager activityManager = (ActivityManager) systemService;
            i11 = (context.getApplicationInfo().flags & PKIFailureInfo.badCertTemplate) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
            double d12 = 1024;
            return (long) (d11 * i11 * d12 * d12);
        }
        throw new IllegalStateException(("System service of type " + ActivityManager.class + " was not found.").toString());
    }

    public final long c(File cacheDirectory) {
        long n11;
        s.g(cacheDirectory, "cacheDirectory");
        try {
            StatFs statFs = new StatFs(cacheDirectory.getAbsolutePath());
            int i11 = Build.VERSION.SDK_INT;
            n11 = m00.l.n((long) (0.02d * (i11 >= 18 ? statFs.getBlockCountLong() : statFs.getBlockCount()) * (i11 >= 18 ? statFs.getBlockSizeLong() : statFs.getBlockSize())), SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE, 262144000L);
            return n11;
        } catch (Exception unused) {
            return SizeBasedTriggeringPolicy.DEFAULT_MAX_FILE_SIZE;
        }
    }

    public final Bitmap.Config d() {
        return Build.VERSION.SDK_INT >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double e(android.content.Context r5) {
        /*
            r4 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r5, r0)
            r0 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            java.lang.Class<android.app.ActivityManager> r2 = android.app.ActivityManager.class
            java.lang.Object r5 = androidx.core.content.b.getSystemService(r5, r2)     // Catch: java.lang.Exception -> L4e
            if (r5 == 0) goto L2c
            android.app.ActivityManager r5 = (android.app.ActivityManager) r5     // Catch: java.lang.Exception -> L4e
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L4e
            r3 = 19
            if (r2 < r3) goto L23
            boolean r5 = r5.isLowRamDevice()     // Catch: java.lang.Exception -> L4e
            if (r5 == 0) goto L21
            goto L23
        L21:
            r5 = 0
            goto L24
        L23:
            r5 = 1
        L24:
            if (r5 == 0) goto L4e
            r0 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            goto L4e
        L2c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L4e
            r5.<init>()     // Catch: java.lang.Exception -> L4e
            java.lang.String r2 = "System service of type "
            r5.append(r2)     // Catch: java.lang.Exception -> L4e
            java.lang.Class<android.app.ActivityManager> r2 = android.app.ActivityManager.class
            r5.append(r2)     // Catch: java.lang.Exception -> L4e
            java.lang.String r2 = " was not found."
            r5.append(r2)     // Catch: java.lang.Exception -> L4e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L4e
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L4e
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> L4e
            r2.<init>(r5)     // Catch: java.lang.Exception -> L4e
            throw r2     // Catch: java.lang.Exception -> L4e
        L4e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.m.e(android.content.Context):double");
    }

    public final double f() {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 24) {
            return 0.0d;
        }
        return i11 >= 19 ? 0.5d : 0.25d;
    }

    public final File g(Context context) {
        s.g(context, "context");
        File file = new File(context.getCacheDir(), "image_cache");
        file.mkdirs();
        return file;
    }
}