package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.c;
import com.google.mlkit.common.sdkinternal.g;
import com.google.mlkit.common.sdkinternal.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import r3.d;

/* loaded from: classes3.dex */
public final class zzoq {
    private static zzcc zza;
    private static final zzce zzb = zzce.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzop zze;
    private final n zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzoq(Context context, final n nVar, zzop zzopVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = nVar;
        this.zze = zzopVar;
        zzpc.zza();
        this.zzi = str;
        this.zzg = g.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzoj
            {
                zzoq.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzoq.this.zzb();
            }
        });
        g a11 = g.a();
        nVar.getClass();
        this.zzh = a11.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzok
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nVar.a();
            }
        });
        zzce zzceVar = zzb;
        this.zzj = zzceVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzceVar.get(str)) : -1;
    }

    static long zza(List list, double d11) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d11 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized zzcc zzi() {
        synchronized (zzoq.class) {
            zzcc zzccVar = zza;
            if (zzccVar != null) {
                return zzccVar;
            }
            r3.g a11 = d.a(Resources.getSystem().getConfiguration());
            zzbz zzbzVar = new zzbz();
            for (int i11 = 0; i11 < a11.f(); i11++) {
                zzbzVar.zzd(c.b(a11.c(i11)));
            }
            zzcc zzf = zzbzVar.zzf();
            zza = zzf;
            return zzf;
        }
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    private final boolean zzk(zzlc zzlcVar, long j11, long j12) {
        return this.zzk.get(zzlcVar) == null || j11 - ((Long) this.zzk.get(zzlcVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzb() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzof zzofVar, zzlc zzlcVar, String str) {
        String a11;
        zzofVar.zzb(zzlcVar);
        String zzd = zzofVar.zzd();
        zzne zzneVar = new zzne();
        zzneVar.zzb(this.zzc);
        zzneVar.zzc(this.zzd);
        zzneVar.zzh(zzi());
        zzneVar.zzg(Boolean.TRUE);
        zzneVar.zzl(zzd);
        zzneVar.zzj(str);
        if (this.zzh.isSuccessful()) {
            a11 = (String) this.zzh.getResult();
        } else {
            a11 = this.zzf.a();
        }
        zzneVar.zzi(a11);
        zzneVar.zzd(10);
        zzneVar.zzk(Integer.valueOf(this.zzj));
        zzofVar.zzc(zzneVar);
        this.zze.zza(zzofVar);
    }

    public final void zzd(zzof zzofVar, zzlc zzlcVar) {
        zze(zzofVar, zzlcVar, zzj());
    }

    public final void zze(final zzof zzofVar, final zzlc zzlcVar, final String str) {
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzol
            {
                zzoq.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzoq.this.zzc(zzofVar, zzlcVar, str);
            }
        });
    }

    public final void zzf(zzoo zzooVar, zzlc zzlcVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzlcVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzlcVar, Long.valueOf(elapsedRealtime));
            zze(zzooVar.zza(), zzlcVar, zzj());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzlc zzlcVar, com.google.mlkit.vision.barcode.internal.g gVar) {
        zzch zzchVar = (zzch) this.zzl.get(zzlcVar);
        if (zzchVar != null) {
            for (Object obj : zzchVar.zzq()) {
                ArrayList<Long> arrayList = new ArrayList(zzchVar.zzc(obj));
                Collections.sort(arrayList);
                zzki zzkiVar = new zzki();
                long j11 = 0;
                for (Long l11 : arrayList) {
                    j11 += l11.longValue();
                }
                zzkiVar.zza(Long.valueOf(j11 / arrayList.size()));
                zzkiVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzkiVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzkiVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzkiVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzkiVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zze(gVar.a(obj, arrayList.size(), zzkiVar.zzg()), zzlcVar, zzj());
            }
            this.zzl.remove(zzlcVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(zzlc zzlcVar, Object obj, long j11, com.google.mlkit.vision.barcode.internal.g gVar) {
        if (!this.zzl.containsKey(zzlcVar)) {
            this.zzl.put(zzlcVar, zzbh.zzr());
        }
        ((zzch) this.zzl.get(zzlcVar)).zzo(obj, Long.valueOf(j11));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzlcVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzlcVar, Long.valueOf(elapsedRealtime));
            g.d().execute(new Runnable(zzlcVar, gVar, null) { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzon
                public final /* synthetic */ zzlc zzb;
                public final /* synthetic */ com.google.mlkit.vision.barcode.internal.g zzc;

                {
                    zzoq.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzoq.this.zzg(this.zzb, this.zzc);
                }
            });
        }
    }
}