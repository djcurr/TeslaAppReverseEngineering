package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import io.sentry.f3;

/* loaded from: classes5.dex */
final class b0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static PackageInfo a(Context context, int i11, io.sentry.d0 d0Var) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i11);
        } catch (Throwable th2) {
            d0Var.b(f3.ERROR, "Error getting package info.", th2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PackageInfo b(Context context, io.sentry.d0 d0Var) {
        return a(context, 0, d0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Long.toString(packageInfo.getLongVersionCode());
        }
        return d(packageInfo);
    }

    private static String d(PackageInfo packageInfo) {
        return Integer.toString(packageInfo.versionCode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String e(PackageInfo packageInfo) {
        return packageInfo.versionName;
    }
}