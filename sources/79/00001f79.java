package com.google.android.gms.common.wrappers;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.PlatformVersion;
import v3.d;

@KeepForSdk
/* loaded from: classes3.dex */
public class PackageManagerWrapper {
    protected final Context zza;

    public PackageManagerWrapper(Context context) {
        this.zza = context;
    }

    @KeepForSdk
    public int checkCallingOrSelfPermission(String str) {
        return this.zza.checkCallingOrSelfPermission(str);
    }

    @KeepForSdk
    public int checkPermission(String str, String str2) {
        return this.zza.getPackageManager().checkPermission(str, str2);
    }

    @KeepForSdk
    public ApplicationInfo getApplicationInfo(String str, int i11) {
        return this.zza.getPackageManager().getApplicationInfo(str, i11);
    }

    @KeepForSdk
    public CharSequence getApplicationLabel(String str) {
        return this.zza.getPackageManager().getApplicationLabel(this.zza.getPackageManager().getApplicationInfo(str, 0));
    }

    @KeepForSdk
    public d<CharSequence, Drawable> getApplicationLabelAndIcon(String str) {
        ApplicationInfo applicationInfo = this.zza.getPackageManager().getApplicationInfo(str, 0);
        return d.a(this.zza.getPackageManager().getApplicationLabel(applicationInfo), this.zza.getPackageManager().getApplicationIcon(applicationInfo));
    }

    @KeepForSdk
    public PackageInfo getPackageInfo(String str, int i11) {
        return this.zza.getPackageManager().getPackageInfo(str, i11);
    }

    @KeepForSdk
    public boolean isCallerInstantApp() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return InstantApps.isInstantApp(this.zza);
        }
        if (!PlatformVersion.isAtLeastO() || (nameForUid = this.zza.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.zza.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean zza(int i11, String str) {
        if (PlatformVersion.isAtLeastKitKat()) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) this.zza.getSystemService("appops");
                if (appOpsManager != null) {
                    appOpsManager.checkPackage(i11, str);
                    return true;
                }
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            } catch (SecurityException unused) {
                return false;
            }
        }
        String[] packagesForUid = this.zza.getPackageManager().getPackagesForUid(i11);
        if (str != null && packagesForUid != null) {
            for (String str2 : packagesForUid) {
                if (str.equals(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}