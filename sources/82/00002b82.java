package com.google.android.gms.internal.mlkit_vision_text_common;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.c;
import com.google.mlkit.common.sdkinternal.g;
import com.google.mlkit.common.sdkinternal.n;
import com.google.mlkit.vision.text.internal.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import r3.d;

/* loaded from: classes3.dex */
public final class zzog {
    private static zzbm zza;
    private static final zzbo zzb = zzbo.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzof zze;
    private final n zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzog(Context context, final n nVar, zzof zzofVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = nVar;
        this.zze = zzofVar;
        zzos.zza();
        this.zzi = str;
        this.zzg = g.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zznz
            {
                zzog.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzog.this.zzb();
            }
        });
        g a11 = g.a();
        nVar.getClass();
        this.zzh = a11.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzoa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nVar.a();
            }
        });
        zzbo zzboVar = zzb;
        this.zzj = zzboVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzboVar.get(str)) : -1;
    }

    static long zza(List list, double d11) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d11 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized zzbm zzi() {
        synchronized (zzog.class) {
            zzbm zzbmVar = zza;
            if (zzbmVar != null) {
                return zzbmVar;
            }
            r3.g a11 = d.a(Resources.getSystem().getConfiguration());
            zzbj zzbjVar = new zzbj();
            for (int i11 = 0; i11 < a11.f(); i11++) {
                zzbjVar.zzb(c.b(a11.c(i11)));
            }
            zzbm zzc = zzbjVar.zzc();
            zza = zzc;
            return zzc;
        }
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    private final boolean zzk(zzkt zzktVar, long j11, long j12) {
        return this.zzk.get(zzktVar) == null || j11 - ((Long) this.zzk.get(zzktVar)).longValue() > TimeUnit.SECONDS.toMillis(30L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zzb() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zznv zznvVar, zzkt zzktVar, String str) {
        String a11;
        zznvVar.zzb(zzktVar);
        String zzd = zznvVar.zzd();
        zzmw zzmwVar = new zzmw();
        zzmwVar.zzb(this.zzc);
        zzmwVar.zzc(this.zzd);
        zzmwVar.zzh(zzi());
        zzmwVar.zzg(Boolean.TRUE);
        zzmwVar.zzl(zzd);
        zzmwVar.zzj(str);
        if (this.zzh.isSuccessful()) {
            a11 = (String) this.zzh.getResult();
        } else {
            a11 = this.zzf.a();
        }
        zzmwVar.zzi(a11);
        zzmwVar.zzd(10);
        zzmwVar.zzk(Integer.valueOf(this.zzj));
        zznvVar.zzc(zzmwVar);
        this.zze.zza(zznvVar);
    }

    public final void zzd(zznv zznvVar, zzkt zzktVar) {
        zze(zznvVar, zzktVar, zzj());
    }

    public final void zze(final zznv zznvVar, final zzkt zzktVar, final String str) {
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzob
            {
                zzog.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzog.this.zzc(zznvVar, zzktVar, str);
            }
        });
    }

    public final void zzf(zzoe zzoeVar, zzkt zzktVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzktVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzktVar, Long.valueOf(elapsedRealtime));
            zze(zzoeVar.zza(), zzktVar, zzj());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzkt zzktVar, m mVar) {
        zzbr zzbrVar = (zzbr) this.zzl.get(zzktVar);
        if (zzbrVar != null) {
            for (Object obj : zzbrVar.zzq()) {
                ArrayList<Long> arrayList = new ArrayList(zzbrVar.zzc(obj));
                Collections.sort(arrayList);
                zzjz zzjzVar = new zzjz();
                long j11 = 0;
                for (Long l11 : arrayList) {
                    j11 += l11.longValue();
                }
                zzjzVar.zza(Long.valueOf(j11 / arrayList.size()));
                zzjzVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzjzVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzjzVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzjzVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzjzVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zze(mVar.a(obj, arrayList.size(), zzjzVar.zzg()), zzktVar, zzj());
            }
            this.zzl.remove(zzktVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(zzkt zzktVar, Object obj, long j11, m mVar) {
        if (!this.zzl.containsKey(zzktVar)) {
            this.zzl.put(zzktVar, zzar.zzr());
        }
        ((zzbr) this.zzl.get(zzktVar)).zzo(obj, Long.valueOf(j11));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzktVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzktVar, Long.valueOf(elapsedRealtime));
            g.d().execute(new Runnable(zzktVar, mVar, null) { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzod
                public final /* synthetic */ zzkt zzb;
                public final /* synthetic */ m zzc;

                {
                    zzog.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzog.this.zzg(this.zzb, this.zzc);
                }
            });
        }
    }
}