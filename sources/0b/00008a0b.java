package n8;

import android.os.Environment;
import java.io.File;

/* loaded from: classes.dex */
public final class c {
    public static String a(String str) {
        try {
            if (b()) {
                File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath(), str);
                if (file.exists()) {
                    file.delete();
                    return "";
                }
                return null;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean b() {
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState == null || externalStorageState.length() <= 0) {
            return false;
        }
        return (externalStorageState.equals("mounted") || externalStorageState.equals("mounted_ro")) && Environment.getExternalStorageDirectory() != null;
    }
}