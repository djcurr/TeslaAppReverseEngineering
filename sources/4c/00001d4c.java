package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.zzag;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.concurrent.atomic.AtomicBoolean;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

@ShowFirstParty
@KeepForSdk
/* loaded from: classes3.dex */
public class GooglePlayServicesUtilLight {
    @KeepForSdk
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    @KeepForSdk
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    @KeepForSdk
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";
    @KeepForSdk
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @KeepForSdk
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    @KeepForSdk
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    @VisibleForTesting
    static boolean zza = false;
    private static boolean zzb = false;
    @VisibleForTesting
    @KeepForSdk
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static final AtomicBoolean zzc = new AtomicBoolean();

    @KeepForSdk
    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
            }
        } catch (SecurityException unused) {
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @KeepForSdk
    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i11) {
        int isGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i11);
        if (isGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, isGooglePlayServicesAvailable, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + isGooglePlayServicesAvailable);
            if (errorResolutionIntent == null) {
                throw new GooglePlayServicesNotAvailableException(isGooglePlayServicesAvailable);
            }
            throw new GooglePlayServicesRepairableException(isGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static int getClientVersion(Context context) {
        Preconditions.checkState(true);
        return ClientLibraryUtils.getClientVersion(context, context.getPackageName());
    }

    @KeepForSdk
    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i11, Context context, int i12) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i11, i12);
    }

    @VisibleForTesting
    @KeepForSdk
    @Deprecated
    public static String getErrorString(int i11) {
        return ConnectionResult.zza(i11);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i11) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, i11, null);
    }

    @KeepForSdk
    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @KeepForSdk
    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @ShowFirstParty
    @KeepForSdk
    public static boolean honorsDebugCertificates(Context context) {
        try {
            if (!zza) {
                PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo("com.google.android.gms", 64);
                GoogleSignatureVerifier.getInstance(context);
                if (packageInfo == null || GoogleSignatureVerifier.zzb(packageInfo, false) || !GoogleSignatureVerifier.zzb(packageInfo, true)) {
                    zzb = false;
                } else {
                    zzb = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e11) {
            Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e11);
        } finally {
            zza = true;
        }
        return zzb || !DeviceProperties.isUserBuild();
    }

    @HideFirstParty
    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i11) {
        return UidVerifier.isGooglePlayServicesUid(context, i11);
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i11) {
        if (i11 == 18) {
            return true;
        }
        if (i11 == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @ShowFirstParty
    @KeepForSdk
    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i11) {
        if (i11 == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    @KeepForSdk
    public static boolean isRestrictedUserProfile(Context context) {
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            Object systemService = context.getSystemService("user");
            Preconditions.checkNotNull(systemService);
            Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
            return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
        }
        return false;
    }

    @VisibleForTesting
    @Deprecated
    @ShowFirstParty
    @KeepForSdk
    public static boolean isSidewinderDevice(Context context) {
        return DeviceProperties.isSidewinder(context);
    }

    @KeepForSdk
    @Deprecated
    public static boolean isUserRecoverableError(int i11) {
        return i11 == 1 || i11 == 2 || i11 == 3 || i11 == 9;
    }

    @KeepForSdk
    @Deprecated
    public static boolean uidHasPackageName(Context context, int i11, String str) {
        return UidVerifier.uidHasPackageName(context, i11, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zza(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean equals = str.equals("com.google.android.gms");
        if (PlatformVersion.isAtLeastLollipop()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, PKIFailureInfo.certRevoked);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        if (equals) {
            return applicationInfo.enabled;
        }
        return applicationInfo.enabled && !isRestrictedUserProfile(context);
    }

    @KeepForSdk
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i11) {
        PackageInfo packageInfo;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !zzc.get()) {
            int zza2 = zzag.zza(context);
            if (zza2 != 0) {
                if (zza2 != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                    throw new GooglePlayServicesIncorrectManifestValueException(zza2);
                }
            } else {
                throw new GooglePlayServicesMissingManifestValueException();
            }
        }
        boolean z11 = (DeviceProperties.isWearableWithoutPlayStore(context) || DeviceProperties.zzb(context)) ? false : true;
        Preconditions.checkArgument(i11 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z11) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            GoogleSignatureVerifier.getInstance(context);
            if (!GoogleSignatureVerifier.zzb(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (z11) {
                    Preconditions.checkNotNull(packageInfo);
                    if (!GoogleSignatureVerifier.zzb(packageInfo, true)) {
                        Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                    }
                }
                if (z11 && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else if (com.google.android.gms.common.util.zza.zza(packageInfo2.versionCode) < com.google.android.gms.common.util.zza.zza(i11)) {
                    int i12 = packageInfo2.versionCode;
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i11 + " but found " + i12);
                    return 2;
                } else {
                    ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e11) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                            return 1;
                        }
                    }
                    return !applicationInfo.enabled ? 3 : 0;
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }
}