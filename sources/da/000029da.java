package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.c;
import com.google.mlkit.common.sdkinternal.g;
import com.google.mlkit.common.sdkinternal.n;
import com.google.mlkit.vision.face.internal.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import r3.d;

/* loaded from: classes3.dex */
public final class zzoc {
    private static zzbn zza;
    private static final zzbp zzb = zzbp.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzob zze;
    private final n zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzoc(Context context, final n nVar, zzob zzobVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = nVar;
        this.zze = zzobVar;
        zzoo.zza();
        this.zzi = str;
        this.zzg = g.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznv
            {
                zzoc.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzoc.this.zzb();
            }
        });
        g a11 = g.a();
        nVar.getClass();
        this.zzh = a11.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nVar.a();
            }
        });
        zzbp zzbpVar = zzb;
        this.zzj = zzbpVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzbpVar.get(str)) : -1;
    }

    static long zza(List list, double d11) {
        return ((Long) list.get(Math.max(((int) Math.ceil((d11 / 100.0d) * list.size())) - 1, 0))).longValue();
    }

    private static synchronized zzbn zzi() {
        synchronized (zzoc.class) {
            zzbn zzbnVar = zza;
            if (zzbnVar != null) {
                return zzbnVar;
            }
            r3.g a11 = d.a(Resources.getSystem().getConfiguration());
            zzbk zzbkVar = new zzbk();
            for (int i11 = 0; i11 < a11.f(); i11++) {
                zzbkVar.zzb(c.b(a11.c(i11)));
            }
            zzbn zzc = zzbkVar.zzc();
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
    public final /* synthetic */ void zzc(zznr zznrVar, zzkt zzktVar, String str) {
        String a11;
        zznrVar.zzb(zzktVar);
        String zzd = zznrVar.zzd();
        zzmt zzmtVar = new zzmt();
        zzmtVar.zzb(this.zzc);
        zzmtVar.zzc(this.zzd);
        zzmtVar.zzh(zzi());
        zzmtVar.zzg(Boolean.TRUE);
        zzmtVar.zzl(zzd);
        zzmtVar.zzj(str);
        if (this.zzh.isSuccessful()) {
            a11 = (String) this.zzh.getResult();
        } else {
            a11 = this.zzf.a();
        }
        zzmtVar.zzi(a11);
        zzmtVar.zzd(10);
        zzmtVar.zzk(Integer.valueOf(this.zzj));
        zznrVar.zzc(zzmtVar);
        this.zze.zza(zznrVar);
    }

    public final void zzd(zznr zznrVar, zzkt zzktVar) {
        zze(zznrVar, zzktVar, zzj());
    }

    public final void zze(final zznr zznrVar, final zzkt zzktVar, final String str) {
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_vision_face.zznx
            {
                zzoc.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzoc.this.zzc(zznrVar, zzktVar, str);
            }
        });
    }

    public final void zzf(zzoa zzoaVar, zzkt zzktVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzktVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzktVar, Long.valueOf(elapsedRealtime));
            zze(zzoaVar.zza(), zzktVar, zzj());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzg(zzkt zzktVar, f fVar) {
        zzbs zzbsVar = (zzbs) this.zzl.get(zzktVar);
        if (zzbsVar != null) {
            for (Object obj : zzbsVar.zzq()) {
                ArrayList<Long> arrayList = new ArrayList(zzbsVar.zzc(obj));
                Collections.sort(arrayList);
                zzjt zzjtVar = new zzjt();
                long j11 = 0;
                for (Long l11 : arrayList) {
                    j11 += l11.longValue();
                }
                zzjtVar.zza(Long.valueOf(j11 / arrayList.size()));
                zzjtVar.zzc(Long.valueOf(zza(arrayList, 100.0d)));
                zzjtVar.zzf(Long.valueOf(zza(arrayList, 75.0d)));
                zzjtVar.zzd(Long.valueOf(zza(arrayList, 50.0d)));
                zzjtVar.zzb(Long.valueOf(zza(arrayList, 25.0d)));
                zzjtVar.zze(Long.valueOf(zza(arrayList, 0.0d)));
                zze(fVar.a(obj, arrayList.size(), zzjtVar.zzg()), zzktVar, zzj());
            }
            this.zzl.remove(zzktVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzh(zzkt zzktVar, Object obj, long j11, f fVar) {
        if (!this.zzl.containsKey(zzktVar)) {
            this.zzl.put(zzktVar, zzas.zzr());
        }
        ((zzbs) this.zzl.get(zzktVar)).zzo(obj, Long.valueOf(j11));
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (zzk(zzktVar, elapsedRealtime, 30L)) {
            this.zzk.put(zzktVar, Long.valueOf(elapsedRealtime));
            g.d().execute(new Runnable(zzktVar, fVar, null) { // from class: com.google.android.gms.internal.mlkit_vision_face.zznz
                public final /* synthetic */ zzkt zzb;
                public final /* synthetic */ f zzc;

                {
                    zzoc.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzoc.this.zzg(this.zzb, this.zzc);
                }
            });
        }
    }
}