package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import ln.h;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ul.i {
    public static /* synthetic */ String a(Context context) {
        return h(context);
    }

    public static /* synthetic */ String b(Context context) {
        return e(context);
    }

    public static /* synthetic */ String c(Context context) {
        return f(context);
    }

    public static /* synthetic */ String d(Context context) {
        return g(context);
    }

    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    public static /* synthetic */ String g(Context context) {
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (i11 < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i11 < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i11 < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto" : "watch" : "tv";
    }

    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // ul.i
    public List<ul.d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ln.c.c());
        arrayList.add(qm.g.h());
        arrayList.add(ln.h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(ln.h.b("fire-core", "20.1.0"));
        arrayList.add(ln.h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(ln.h.b("device-model", i(Build.DEVICE)));
        arrayList.add(ln.h.b("device-brand", i(Build.BRAND)));
        arrayList.add(ln.h.c("android-target-sdk", new h.a() { // from class: com.google.firebase.f
            @Override // ln.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.b((Context) obj);
            }
        }));
        arrayList.add(ln.h.c("android-min-sdk", new h.a() { // from class: com.google.firebase.g
            @Override // ln.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.c((Context) obj);
            }
        }));
        arrayList.add(ln.h.c("android-platform", new h.a() { // from class: com.google.firebase.h
            @Override // ln.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.d((Context) obj);
            }
        }));
        arrayList.add(ln.h.c("android-installer", new h.a() { // from class: com.google.firebase.e
            @Override // ln.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.a((Context) obj);
            }
        }));
        String a11 = ln.e.a();
        if (a11 != null) {
            arrayList.add(ln.h.b("kotlin", a11));
        }
        return arrayList;
    }
}