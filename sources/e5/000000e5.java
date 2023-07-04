package al;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.godotengine.godot.R;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static Random f573a = new Random(SystemClock.uptimeMillis());

    static {
        Pattern.compile("attachment;\\s*filename\\s*=\\s*\"([^\"]*)\"");
    }

    public static boolean a(Context context, String str, long j11, boolean z11) {
        File file = new File(b(context, str));
        if (file.exists()) {
            if (file.length() == j11) {
                return true;
            }
            if (z11) {
                file.delete();
                return false;
            }
            return false;
        }
        return false;
    }

    public static String b(Context context, String str) {
        return g(context) + File.separator + str;
    }

    public static long c(File file) {
        StatFs statFs = new StatFs(file.getPath());
        return statFs.getBlockSize() * (statFs.getAvailableBlocks() - 4);
    }

    public static String d(long j11, long j12) {
        if (j12 == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        Locale locale = Locale.ENGLISH;
        sb2.append(String.format(locale, "%.2f", Float.valueOf(((float) j11) / 1048576.0f)));
        sb2.append("MB /");
        sb2.append(String.format(locale, "%.2f", Float.valueOf(((float) j12) / 1048576.0f)));
        sb2.append("MB");
        return sb2.toString();
    }

    public static int e(int i11) {
        switch (i11) {
            case 1:
                return R.string.state_idle;
            case 2:
                return R.string.state_fetching_url;
            case 3:
                return R.string.state_connecting;
            case 4:
                return R.string.state_downloading;
            case 5:
                return R.string.state_completed;
            case 6:
                return R.string.state_paused_network_unavailable;
            case 7:
                return R.string.state_paused_by_request;
            case 8:
                return R.string.state_paused_wifi_disabled;
            case 9:
                return R.string.state_paused_wifi_unavailable;
            case 10:
                return R.string.state_paused_wifi_disabled;
            case 11:
                return R.string.state_paused_wifi_unavailable;
            case 12:
                return R.string.state_paused_roaming;
            case 13:
                return R.string.state_paused_network_setup_failure;
            case 14:
                return R.string.state_paused_sdcard_unavailable;
            case 15:
                return R.string.state_failed_unlicensed;
            case 16:
                return R.string.state_failed_fetching_url;
            case 17:
                return R.string.state_failed_sdcard_full;
            case 18:
                return R.string.state_failed_cancelled;
            default:
                return R.string.state_unknown;
        }
    }

    public static File f(String str) {
        File downloadCacheDirectory = Environment.getDownloadCacheDirectory();
        if (str.startsWith(downloadCacheDirectory.getPath())) {
            return downloadCacheDirectory;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (str.startsWith(externalStorageDirectory.getPath())) {
            return externalStorageDirectory;
        }
        throw new IllegalArgumentException("Cannot determine filesystem root for " + str);
    }

    public static String g(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getObbDir().toString();
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        return externalStorageDirectory.toString() + a.f552a + context.getPackageName();
    }

    public static String h(float f11) {
        return String.format(Locale.ENGLISH, "%.2f", Float.valueOf((f11 * 1000.0f) / 1024.0f));
    }

    public static String i(long j11) {
        SimpleDateFormat simpleDateFormat;
        if (j11 > CoreConstants.MILLIS_IN_ONE_HOUR) {
            simpleDateFormat = new SimpleDateFormat("HH:mm", Locale.getDefault());
        } else {
            simpleDateFormat = new SimpleDateFormat("mm:ss", Locale.getDefault());
        }
        return simpleDateFormat.format(new Date(j11 - TimeZone.getDefault().getRawOffset()));
    }

    public static boolean j() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean k(String str) {
        String replaceFirst = str.replaceFirst("/+", "/");
        return replaceFirst.startsWith(Environment.getDownloadCacheDirectory().toString()) || replaceFirst.startsWith(Environment.getExternalStorageDirectory().toString());
    }
}