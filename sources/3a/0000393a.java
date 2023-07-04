package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f16819a;

    /* renamed from: b  reason: collision with root package name */
    private String f16820b;

    /* renamed from: c  reason: collision with root package name */
    private String f16821c;

    /* renamed from: d  reason: collision with root package name */
    private int f16822d;

    /* renamed from: e  reason: collision with root package name */
    private int f16823e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i0(Context context) {
        this.f16819a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(com.google.firebase.d dVar) {
        String d11 = dVar.m().d();
        if (d11 != null) {
            return d11;
        }
        String c11 = dVar.m().c();
        if (c11.startsWith("1:")) {
            String[] split = c11.split(":");
            if (split.length < 2) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return c11;
    }

    private PackageInfo f(String str) {
        try {
            return this.f16819a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e11) {
            Log.w("FirebaseMessaging", "Failed to find package " + e11);
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f11 = f(this.f16819a.getPackageName());
        if (f11 != null) {
            this.f16820b = Integer.toString(f11.versionCode);
            this.f16821c = f11.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String a() {
        if (this.f16820b == null) {
            h();
        }
        return this.f16820b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized String b() {
        if (this.f16821c == null) {
            h();
        }
        return this.f16821c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized int d() {
        PackageInfo f11;
        if (this.f16822d == 0 && (f11 = f("com.google.android.gms")) != null) {
            this.f16822d = f11.versionCode;
        }
        return this.f16822d;
    }

    synchronized int e() {
        int i11 = this.f16823e;
        if (i11 != 0) {
            return i11;
        }
        PackageManager packageManager = this.f16819a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f16823e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f16823e = 2;
            return 2;
        }
        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
        if (PlatformVersion.isAtLeastO()) {
            this.f16823e = 2;
        } else {
            this.f16823e = 1;
        }
        return this.f16823e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g() {
        return e() != 0;
    }
}