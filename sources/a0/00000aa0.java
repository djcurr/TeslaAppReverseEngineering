package atd.i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import atd.i.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d implements b {
    private void b(Context context) {
        List emptyList;
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 4096);
            List<String> b11 = b();
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                emptyList = Arrays.asList(strArr);
            } else {
                emptyList = Collections.emptyList();
            }
            for (String str : b11) {
                if (!emptyList.contains(str)) {
                    throw new c(c.a.MISSING_PERMISSION, null);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                for (String str2 : b11) {
                    if (context.checkSelfPermission(str2) != 0) {
                        throw new c(c.a.MISSING_PERMISSION, null);
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e11) {
            throw new RuntimeException(atd.s0.a.a(-74361727674944L) + packageName, e11);
        }
    }

    @Override // atd.i.b
    public final Object a(Context context) {
        b(context);
        try {
            return c(context);
        } catch (SecurityException unused) {
            throw new c(c.a.MISSING_PERMISSION, null);
        }
    }

    protected abstract List<String> b();

    protected abstract Object c(Context context);
}