package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.c;
import com.google.mlkit.common.sdkinternal.g;
import com.google.mlkit.common.sdkinternal.n;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import r3.d;

/* loaded from: classes3.dex */
public final class zzkz {
    private static zzp zza;
    private static final zzr zzb = zzr.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzky zze;
    private final n zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzkz(Context context, final n nVar, zzky zzkyVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = nVar;
        this.zze = zzkyVar;
        zzlm.zza();
        this.zzi = str;
        this.zzg = g.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzkv
            {
                zzkz.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzkz.this.zza();
            }
        });
        g a11 = g.a();
        nVar.getClass();
        this.zzh = a11.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzkw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nVar.a();
            }
        });
        zzr zzrVar = zzb;
        this.zzj = zzrVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzrVar.get(str)) : -1;
    }

    private static synchronized zzp zzd() {
        synchronized (zzkz.class) {
            zzp zzpVar = zza;
            if (zzpVar != null) {
                return zzpVar;
            }
            r3.g a11 = d.a(Resources.getSystem().getConfiguration());
            zzm zzmVar = new zzm();
            for (int i11 = 0; i11 < a11.f(); i11++) {
                zzmVar.zzb(c.b(a11.c(i11)));
            }
            zzp zzc = zzmVar.zzc();
            zza = zzc;
            return zzc;
        }
    }

    public final /* synthetic */ String zza() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    public final /* synthetic */ void zzb(zzkr zzkrVar, zzht zzhtVar, String str) {
        String a11;
        zzkrVar.zza(zzhtVar);
        String zzc = zzkrVar.zzc();
        zzjp zzjpVar = new zzjp();
        zzjpVar.zzb(this.zzc);
        zzjpVar.zzc(this.zzd);
        zzjpVar.zzh(zzd());
        zzjpVar.zzg(Boolean.TRUE);
        zzjpVar.zzl(zzc);
        zzjpVar.zzj(str);
        if (this.zzh.isSuccessful()) {
            a11 = (String) this.zzh.getResult();
        } else {
            a11 = this.zzf.a();
        }
        zzjpVar.zzi(a11);
        zzjpVar.zzd(10);
        zzjpVar.zzk(Integer.valueOf(this.zzj));
        zzkrVar.zzb(zzjpVar);
        this.zze.zza(zzkrVar);
    }

    public final void zzc(zzlj zzljVar, final zzht zzhtVar) {
        zzhh zzhhVar;
        zzhm zzhmVar;
        final String version;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzk.get(zzhtVar) != null && elapsedRealtime - ((Long) this.zzk.get(zzhtVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
            return;
        }
        this.zzk.put(zzhtVar, Long.valueOf(elapsedRealtime));
        int i11 = zzljVar.zza;
        int i12 = zzljVar.zzb;
        int i13 = zzljVar.zzc;
        int i14 = zzljVar.zzd;
        int i15 = zzljVar.zze;
        long j11 = zzljVar.zzf;
        int i16 = zzljVar.zzg;
        zzhl zzhlVar = new zzhl();
        if (i11 == -1) {
            zzhhVar = zzhh.BITMAP;
        } else if (i11 == 35) {
            zzhhVar = zzhh.YUV_420_888;
        } else if (i11 == 842094169) {
            zzhhVar = zzhh.YV12;
        } else if (i11 == 16) {
            zzhhVar = zzhh.NV16;
        } else if (i11 != 17) {
            zzhhVar = zzhh.UNKNOWN_FORMAT;
        } else {
            zzhhVar = zzhh.NV21;
        }
        zzhlVar.zzd(zzhhVar);
        if (i12 == 1) {
            zzhmVar = zzhm.BITMAP;
        } else if (i12 == 2) {
            zzhmVar = zzhm.BYTEARRAY;
        } else if (i12 == 3) {
            zzhmVar = zzhm.BYTEBUFFER;
        } else if (i12 != 4) {
            zzhmVar = zzhm.ANDROID_MEDIA_IMAGE;
        } else {
            zzhmVar = zzhm.FILEPATH;
        }
        zzhlVar.zzf(zzhmVar);
        zzhlVar.zzc(Integer.valueOf(i13));
        zzhlVar.zze(Integer.valueOf(i14));
        zzhlVar.zzg(Integer.valueOf(i15));
        zzhlVar.zzb(Long.valueOf(j11));
        zzhlVar.zzh(Integer.valueOf(i16));
        zzho zzj = zzhlVar.zzj();
        zzhu zzhuVar = new zzhu();
        zzhuVar.zzd(zzj);
        final zzkr zze = zzla.zze(zzhuVar);
        if (this.zzg.isSuccessful()) {
            version = (String) this.zzg.getResult();
        } else {
            version = LibraryVersion.getInstance().getVersion(this.zzi);
        }
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_common.zzkx
            {
                zzkz.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzkz.this.zzb(zze, zzhtVar, version);
            }
        });
    }
}