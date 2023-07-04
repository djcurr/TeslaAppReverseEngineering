package androidx.core.content;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.core.app.d;

/* loaded from: classes.dex */
public final class c {
    public static int a(Context context, String str) {
        return b(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(Context context, String str, int i11, int i12, String str2) {
        int b11;
        if (context.checkPermission(str, i11, i12) == -1) {
            return -1;
        }
        String c11 = d.c(str);
        if (c11 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i12);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (Process.myUid() == i12 && v3.c.a(context.getPackageName(), str2)) {
            b11 = d.a(context, i12, c11, str2);
        } else {
            b11 = d.b(context, c11, str2);
        }
        return b11 == 0 ? 0 : -2;
    }

    public static int c(Context context, String str) {
        return b(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}