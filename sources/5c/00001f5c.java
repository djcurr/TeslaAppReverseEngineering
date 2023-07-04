package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
/* loaded from: classes3.dex */
public final class DeviceProperties {
    private static Boolean zza;
    private static Boolean zzb;
    private static Boolean zzc;
    private static Boolean zzd;
    private static Boolean zze;
    private static Boolean zzf;
    private static Boolean zzg;
    private static Boolean zzh;
    private static Boolean zzi;
    private static Boolean zzj;
    private static Boolean zzk;
    private static Boolean zzl;

    private DeviceProperties() {
    }

    @KeepForSdk
    public static boolean isAuto(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzi == null) {
            boolean z11 = false;
            if (PlatformVersion.isAtLeastO() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z11 = true;
            }
            zzi = Boolean.valueOf(z11);
        }
        return zzi.booleanValue();
    }

    @KeepForSdk
    public static boolean isBstar(Context context) {
        if (zzl == null) {
            boolean z11 = false;
            if (PlatformVersion.isAtLeastR() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z11 = true;
            }
            zzl = Boolean.valueOf(z11);
        }
        return zzl.booleanValue();
    }

    @KeepForSdk
    public static boolean isLatchsky(Context context) {
        if (zzf == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z11 = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z11 = true;
            }
            zzf = Boolean.valueOf(z11);
        }
        return zzf.booleanValue();
    }

    @KeepForSdk
    public static boolean isPhone(Context context) {
        if (zza == null) {
            boolean z11 = false;
            if (!isTablet(context) && !isWearable(context) && !zzb(context)) {
                if (zzh == null) {
                    zzh = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
                }
                if (!zzh.booleanValue() && !isAuto(context) && !isTv(context)) {
                    if (zzk == null) {
                        zzk = Boolean.valueOf(context.getPackageManager().hasSystemFeature("com.google.android.feature.AMATI_EXPERIENCE"));
                    }
                    if (!zzk.booleanValue() && !isBstar(context)) {
                        z11 = true;
                    }
                }
            }
            zza = Boolean.valueOf(z11);
        }
        return zza.booleanValue();
    }

    @KeepForSdk
    public static boolean isSevenInchTablet(Context context) {
        return zzc(context.getResources());
    }

    @KeepForSdk
    public static boolean isSidewinder(Context context) {
        return zza(context);
    }

    @KeepForSdk
    public static boolean isTablet(Context context) {
        return isTablet(context.getResources());
    }

    @KeepForSdk
    public static boolean isTv(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzj == null) {
            boolean z11 = true;
            if (!packageManager.hasSystemFeature("com.google.android.tv") && !packageManager.hasSystemFeature("android.hardware.type.television") && !packageManager.hasSystemFeature("android.software.leanback")) {
                z11 = false;
            }
            zzj = Boolean.valueOf(z11);
        }
        return zzj.booleanValue();
    }

    @KeepForSdk
    public static boolean isUserBuild() {
        int i11 = GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        return "user".equals(Build.TYPE);
    }

    @KeepForSdk
    public static boolean isWearable(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzd == null) {
            boolean z11 = false;
            if (PlatformVersion.isAtLeastKitKatWatch() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z11 = true;
            }
            zzd = Boolean.valueOf(z11);
        }
        return zzd.booleanValue();
    }

    @KeepForSdk
    public static boolean isWearableWithoutPlayStore(Context context) {
        if (!isWearable(context) || PlatformVersion.isAtLeastN()) {
            if (zza(context)) {
                return !PlatformVersion.isAtLeastO() || PlatformVersion.isAtLeastR();
            }
            return false;
        }
        return true;
    }

    public static boolean zza(Context context) {
        if (zze == null) {
            boolean z11 = false;
            if (PlatformVersion.isAtLeastLollipop() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z11 = true;
            }
            zze = Boolean.valueOf(z11);
        }
        return zze.booleanValue();
    }

    public static boolean zzb(Context context) {
        if (zzg == null) {
            boolean z11 = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z11 = false;
            }
            zzg = Boolean.valueOf(z11);
        }
        return zzg.booleanValue();
    }

    public static boolean zzc(Resources resources) {
        boolean z11 = false;
        if (resources == null) {
            return false;
        }
        if (zzc == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z11 = true;
            }
            zzc = Boolean.valueOf(z11);
        }
        return zzc.booleanValue();
    }

    @KeepForSdk
    public static boolean isTablet(Resources resources) {
        if (resources == null) {
            return false;
        }
        if (zzb == null) {
            zzb = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || zzc(resources));
        }
        return zzb.booleanValue();
    }
}