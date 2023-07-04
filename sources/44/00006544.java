package d5;

import android.content.Context;
import android.os.Build;
import androidx.work.q;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private static final String f23638a = q.f("WrkDbPathHelper");

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f23639b = {"-journal", "-shm", "-wal"};

    public static File a(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return b(context);
        }
        return c(context, "androidx.work.workdb");
    }

    public static File b(Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }

    private static File c(Context context, String str) {
        return new File(context.getNoBackupFilesDir(), str);
    }

    public static String d() {
        return "androidx.work.workdb";
    }

    public static void e(Context context) {
        String format;
        File b11 = b(context);
        if (Build.VERSION.SDK_INT < 23 || !b11.exists()) {
            return;
        }
        q.c().a(f23638a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        Map<File, File> f11 = f(context);
        for (File file : f11.keySet()) {
            File file2 = f11.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    q.c().h(f23638a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                if (file.renameTo(file2)) {
                    format = String.format("Migrated %s to %s", file, file2);
                } else {
                    format = String.format("Renaming %s to %s failed", file, file2);
                }
                q.c().a(f23638a, format, new Throwable[0]);
            }
        }
    }

    public static Map<File, File> f(Context context) {
        File b11;
        File a11;
        String[] strArr;
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            hashMap.put(b(context), a(context));
            for (String str : f23639b) {
                hashMap.put(new File(b11.getPath() + str), new File(a11.getPath() + str));
            }
        }
        return hashMap;
    }
}