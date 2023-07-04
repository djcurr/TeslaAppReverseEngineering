package com.google.android.libraries.places.internal;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* loaded from: classes3.dex */
public abstract class zzkx {
    private static String zza = "com.google.android.libraries.places.internal.zzlc";
    private static String zzb = "com.google.common.flogger.backend.google.GooglePlatform";
    private static String zzc = "com.google.common.flogger.backend.system.DefaultPlatform";
    private static final String[] zzd = {"com.google.android.libraries.places.internal.zzlc", "com.google.common.flogger.backend.google.GooglePlatform", "com.google.common.flogger.backend.system.DefaultPlatform"};

    public static int zza() {
        return zzmc.zza();
    }

    public static long zzb() {
        zzkx zzkxVar;
        zzkxVar = zzkv.zza;
        return zzkxVar.zzc();
    }

    public static zzkg zzd(String str) {
        zzkx zzkxVar;
        zzkxVar = zzkv.zza;
        return zzkxVar.zze(str);
    }

    public static zzki zzf() {
        return zzi().zza();
    }

    public static zzkw zzg() {
        zzkx zzkxVar;
        zzkxVar = zzkv.zza;
        return zzkxVar.zzh();
    }

    public static zzll zzi() {
        zzkx zzkxVar;
        zzkxVar = zzkv.zza;
        return zzkxVar.zzj();
    }

    public static zzly zzk() {
        return zzi().zzc();
    }

    public static String zzl() {
        zzkx zzkxVar;
        zzkxVar = zzkv.zza;
        return zzkxVar.zzm();
    }

    public static boolean zzn(String str, Level level, boolean z11) {
        zzi().zzd(str, level, z11);
        return false;
    }

    protected long zzc() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract zzkg zze(String str);

    protected abstract zzkw zzh();

    protected zzll zzj() {
        return zzll.zze();
    }

    protected abstract String zzm();
}