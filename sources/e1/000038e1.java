package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* loaded from: classes3.dex */
class x {

    /* renamed from: a  reason: collision with root package name */
    private String f16611a;

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a(Context context) {
        if (this.f16611a == null) {
            this.f16611a = b(context);
        }
        return "".equals(this.f16611a) ? null : this.f16611a;
    }
}