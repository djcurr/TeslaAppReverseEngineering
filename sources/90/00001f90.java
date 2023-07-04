package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes3.dex */
public final class zzn {
    private static volatile zzaf zze;
    private static Context zzg;
    static final zzl zza = new zzf(zzj.zze("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
    static final zzl zzb = new zzg(zzj.zze("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
    static final zzl zzc = new zzh(zzj.zze("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
    static final zzl zzd = new zzi(zzj.zze("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
    private static final Object zzf = new Object();

    public static zzx zza(String str, zzj zzjVar, boolean z11, boolean z12) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return zzh(str, zzjVar, z11, z12);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static zzx zzb(String str, boolean z11, boolean z12, boolean z13) {
        return zzi(str, z11, false, false, true);
    }

    public static zzx zzc(String str, boolean z11, boolean z12, boolean z13) {
        return zzi(str, z11, false, false, false);
    }

    public static /* synthetic */ String zzd(boolean z11, String str, zzj zzjVar) {
        String str2 = true != (!z11 && zzh(str, zzjVar, true, false).zza) ? "not allowed" : "debug cert rejected";
        MessageDigest zza2 = AndroidUtilsLight.zza(McElieceCCA2KeyGenParameterSpec.SHA256);
        Preconditions.checkNotNull(zza2);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, Hex.bytesToStringLowercase(zza2.digest(zzjVar.zzf())), Boolean.valueOf(z11), "12451000.false");
    }

    public static synchronized void zze(Context context) {
        synchronized (zzn.class) {
            if (zzg != null) {
                Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } else if (context != null) {
                zzg = context.getApplicationContext();
            }
        }
    }

    public static boolean zzf() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzj();
                return zze.zzg();
            } catch (RemoteException | DynamiteModule.LoadingException e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static boolean zzg() {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzj();
                return zze.zzi();
            } catch (RemoteException | DynamiteModule.LoadingException e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                return false;
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static zzx zzh(final String str, final zzj zzjVar, final boolean z11, boolean z12) {
        try {
            zzj();
            Preconditions.checkNotNull(zzg);
            try {
                return zze.zzh(new zzs(str, zzjVar, z11, z12), ObjectWrapper.wrap(zzg.getPackageManager())) ? zzx.zzb() : new zzv(new Callable() { // from class: com.google.android.gms.common.zze
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzn.zzd(z11, str, zzjVar);
                    }
                }, null);
            } catch (RemoteException e11) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                return zzx.zzd("module call", e11);
            }
        } catch (DynamiteModule.LoadingException e12) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e12);
            return zzx.zzd("module init: ".concat(String.valueOf(e12.getMessage())), e12);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    private static zzx zzi(String str, boolean z11, boolean z12, boolean z13, boolean z14) {
        zzx zzd2;
        zzq zzf2;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Preconditions.checkNotNull(zzg);
            try {
                zzj();
                zzo zzoVar = new zzo(str, z11, false, ObjectWrapper.wrap(zzg), false);
                try {
                    if (z14) {
                        zzf2 = zze.zze(zzoVar);
                    } else {
                        zzf2 = zze.zzf(zzoVar);
                    }
                    if (zzf2.zzb()) {
                        zzd2 = zzx.zzf(zzf2.zzc());
                    } else {
                        String zza2 = zzf2.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = zzf2.zzd() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (zza2 == null) {
                            zza2 = "error checking package certificate";
                        }
                        zzd2 = zzx.zzg(zzf2.zzc(), zzf2.zzd(), zza2, nameNotFoundException);
                    }
                } catch (RemoteException e11) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e11);
                    zzd2 = zzx.zzd("module call", e11);
                }
            } catch (DynamiteModule.LoadingException e12) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e12);
                zzd2 = zzx.zzd("module init: ".concat(String.valueOf(e12.getMessage())), e12);
            }
            return zzd2;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static void zzj() {
        if (zze != null) {
            return;
        }
        Preconditions.checkNotNull(zzg);
        synchronized (zzf) {
            if (zze == null) {
                zze = com.google.android.gms.common.internal.zzae.zzb(DynamiteModule.load(zzg, DynamiteModule.PREFER_HIGHEST_OR_LOCAL_VERSION_NO_FORCE_STAGING, "com.google.android.gms.googlecertificates").instantiate("com.google.android.gms.common.GoogleCertificatesImpl"));
            }
        }
    }
}