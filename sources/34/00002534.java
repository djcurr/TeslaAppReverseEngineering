package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.internal.LibraryVersion;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.mlkit.common.sdkinternal.c;
import com.google.mlkit.common.sdkinternal.g;
import com.google.mlkit.common.sdkinternal.l;
import com.google.mlkit.common.sdkinternal.n;
import eo.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import r3.d;

/* loaded from: classes3.dex */
public final class zzmq {
    private static zzao zza;
    private static final zzar zzb = zzar.zzc("optional-module-barcode", "com.google.android.gms.vision.barcode");
    private final String zzc;
    private final String zzd;
    private final zzmp zze;
    private final n zzf;
    private final Task zzg;
    private final Task zzh;
    private final String zzi;
    private final int zzj;
    private final Map zzk = new HashMap();
    private final Map zzl = new HashMap();

    public zzmq(Context context, final n nVar, zzmp zzmpVar, String str) {
        this.zzc = context.getPackageName();
        this.zzd = c.a(context);
        this.zzf = nVar;
        this.zze = zzmpVar;
        zzne.zza();
        this.zzi = str;
        this.zzg = g.a().b(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzml
            {
                zzmq.this = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzmq.this.zza();
            }
        });
        g a11 = g.a();
        nVar.getClass();
        this.zzh = a11.b(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzmm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return nVar.a();
            }
        });
        zzar zzarVar = zzb;
        this.zzj = zzarVar.containsKey(str) ? DynamiteModule.getRemoteVersion(context, (String) zzarVar.get(str)) : -1;
    }

    private static synchronized zzao zzh() {
        synchronized (zzmq.class) {
            zzao zzaoVar = zza;
            if (zzaoVar != null) {
                return zzaoVar;
            }
            r3.g a11 = d.a(Resources.getSystem().getConfiguration());
            zzal zzalVar = new zzal();
            for (int i11 = 0; i11 < a11.f(); i11++) {
                zzalVar.zzc(c.b(a11.c(i11)));
            }
            zzao zzd = zzalVar.zzd();
            zza = zzd;
            return zzd;
        }
    }

    private final zzle zzi(String str, String str2) {
        String a11;
        zzle zzleVar = new zzle();
        zzleVar.zzb(this.zzc);
        zzleVar.zzc(this.zzd);
        zzleVar.zzh(zzh());
        zzleVar.zzg(Boolean.TRUE);
        zzleVar.zzl(str);
        zzleVar.zzj(str2);
        if (this.zzh.isSuccessful()) {
            a11 = (String) this.zzh.getResult();
        } else {
            a11 = this.zzf.a();
        }
        zzleVar.zzi(a11);
        zzleVar.zzd(10);
        zzleVar.zzk(Integer.valueOf(this.zzj));
        return zzleVar;
    }

    private final String zzj() {
        if (this.zzg.isSuccessful()) {
            return (String) this.zzg.getResult();
        }
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ String zza() {
        return LibraryVersion.getInstance().getVersion(this.zzi);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzmh zzmhVar, zziz zzizVar, String str) {
        zzmhVar.zza(zzizVar);
        zzmhVar.zzc(zzi(zzmhVar.zzd(), str));
        this.zze.zza(zzmhVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzmh zzmhVar, zzms zzmsVar, b bVar) {
        zzmhVar.zza(zziz.MODEL_DOWNLOAD);
        zzmhVar.zzc(zzi(zzmsVar.zze(), zzj()));
        zzmhVar.zzb(zznc.zza(bVar, this.zzf, zzmsVar));
        this.zze.zza(zzmhVar);
    }

    public final void zzd(final zzmh zzmhVar, final zziz zzizVar) {
        final String zzj = zzj();
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzmn
            {
                zzmq.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzmq.this.zzb(zzmhVar, zzizVar, zzj);
            }
        });
    }

    public final void zze(zzmh zzmhVar, b bVar, boolean z11, int i11) {
        zzmr zzh = zzms.zzh();
        zzh.zzf(false);
        zzh.zzd(bVar.c());
        zzh.zza(zzje.FAILED);
        zzh.zzb(zziy.DOWNLOAD_FAILED);
        zzh.zzc(i11);
        zzg(zzmhVar, bVar, zzh.zzh());
    }

    public final void zzf(zzmh zzmhVar, b bVar, zziy zziyVar, boolean z11, l lVar, zzje zzjeVar) {
        zzmr zzh = zzms.zzh();
        zzh.zzf(z11);
        zzh.zzd(lVar);
        zzh.zzb(zziyVar);
        zzh.zza(zzjeVar);
        zzg(zzmhVar, bVar, zzh.zzh());
    }

    public final void zzg(final zzmh zzmhVar, final b bVar, final zzms zzmsVar) {
        g.d().execute(new Runnable() { // from class: com.google.android.gms.internal.mlkit_common.zzmo
            @Override // java.lang.Runnable
            public final void run() {
                zzmq.this.zzc(zzmhVar, zzmsVar, bVar);
            }
        });
    }
}