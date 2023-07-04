package androidx.core.app;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes.dex */
    static class a {
        static int a(AppOpsManager appOpsManager, String str, int i11, String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i11, str2);
        }

        static String b(Context context) {
            return context.getOpPackageName();
        }

        static AppOpsManager c(Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    public static int a(Context context, int i11, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager c11 = a.c(context);
            int a11 = a.a(c11, str, Binder.getCallingUid(), str2);
            return a11 != 0 ? a11 : a.a(c11, str, i11, a.b(context));
        }
        return b(context, str, str2);
    }

    public static int b(Context context, String str, String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(str, str2);
        }
        return 1;
    }

    public static String c(String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AppOpsManager.permissionToOp(str);
        }
        return null;
    }
}