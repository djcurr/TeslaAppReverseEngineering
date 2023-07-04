package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
class JniNativeApi implements f {

    /* renamed from: b */
    private static final boolean f16612b;

    /* renamed from: c */
    private static final FilenameFilter f16613c = new FilenameFilter() { // from class: com.google.firebase.crashlytics.ndk.e
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return JniNativeApi.b(file, str);
        }
    };

    /* renamed from: a */
    private final Context f16614a;

    static {
        boolean z11;
        try {
            System.loadLibrary("crashlytics");
            z11 = true;
        } catch (UnsatisfiedLinkError e11) {
            wl.f.f().d("libcrashlytics could not be loaded. This APK may not have been compiled for this device's architecture. NDK crashes will not be reported to Crashlytics:\n" + e11.getLocalizedMessage());
            z11 = false;
        }
        f16612b = z11;
    }

    public JniNativeApi(Context context) {
        this.f16614a = context;
    }

    public static /* synthetic */ boolean b(File file, String str) {
        return g(file, str);
    }

    public static void c(List<String> list, PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        String[] strArr = applicationInfo.splitSourceDirs;
        if (strArr != null) {
            Collections.addAll(list, strArr);
        }
        File file = new File(applicationInfo.dataDir, String.format("files/splitcompat/%s/verified-splits", e(packageInfo)));
        if (!file.exists()) {
            wl.f.f().b("No dynamic features found at " + file.getAbsolutePath());
            return;
        }
        File[] listFiles = file.listFiles(f16613c);
        if (listFiles == null) {
            listFiles = new File[0];
        }
        wl.f.f().b("Found " + listFiles.length + " APKs in " + file.getAbsolutePath());
        for (File file2 : listFiles) {
            wl.f.f().b("Adding " + file2.getName() + " to classpath.");
            list.add(file2.getAbsolutePath());
        }
    }

    private static int d() {
        return Build.VERSION.SDK_INT >= 24 ? 9216 : 1024;
    }

    private static String e(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Long.toString(packageInfo.getLongVersionCode());
        }
        return Integer.toString(packageInfo.versionCode);
    }

    public static boolean f() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static /* synthetic */ boolean g(File file, String str) {
        return str.toLowerCase().endsWith(".apk");
    }

    private native boolean nativeInit(String[] strArr, Object obj);

    @Override // com.google.firebase.crashlytics.ndk.f
    public boolean a(String str, AssetManager assetManager) {
        String[] h11 = h(Build.CPU_ABI);
        if (h11.length < 2) {
            return false;
        }
        return f16612b && nativeInit(new String[]{h11[0], h11[1], str}, assetManager);
    }

    public String[] h(String str) {
        try {
            PackageInfo packageInfo = this.f16614a.getPackageManager().getPackageInfo(this.f16614a.getPackageName(), d());
            ArrayList<String> arrayList = new ArrayList(10);
            arrayList.add(packageInfo.applicationInfo.sourceDir);
            if (f()) {
                c(arrayList, packageInfo);
            }
            String[] strArr = packageInfo.applicationInfo.sharedLibraryFiles;
            if (strArr != null) {
                Collections.addAll(arrayList, strArr);
            }
            ArrayList arrayList2 = new ArrayList(10);
            File parentFile = new File(packageInfo.applicationInfo.nativeLibraryDir).getParentFile();
            if (parentFile != null) {
                arrayList2.add(new File(parentFile, str).getPath());
                if (str.startsWith("arm64")) {
                    arrayList2.add(new File(parentFile, "arm64").getPath());
                } else if (str.startsWith("arm")) {
                    arrayList2.add(new File(parentFile, "arm").getPath());
                }
            }
            for (String str2 : arrayList) {
                if (str2.endsWith(".apk")) {
                    arrayList2.add(str2 + "!/lib/" + str);
                }
            }
            arrayList2.add(System.getProperty("java.library.path"));
            arrayList2.add(packageInfo.applicationInfo.nativeLibraryDir);
            String str3 = File.pathSeparator;
            return new String[]{TextUtils.join(str3, arrayList), TextUtils.join(str3, arrayList2)};
        } catch (PackageManager.NameNotFoundException e11) {
            wl.f.f().e("Unable to compose package paths", e11);
            throw new RuntimeException(e11);
        }
    }
}