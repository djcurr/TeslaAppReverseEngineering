package com.google.mlkit.vision.barcode.internal;

import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_barcode.zzbz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkk;
import com.google.android.gms.internal.mlkit_vision_barcode.zzkn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzko;
import com.google.android.gms.internal.mlkit_vision_barcode.zzks;
import com.google.android.gms.internal.mlkit_vision_barcode.zzla;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzld;
import com.google.android.gms.internal.mlkit_vision_barcode.zzlp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzof;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzoq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzos;
import com.google.android.gms.internal.mlkit_vision_barcode.zzot;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.internal.g;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class h extends com.google.mlkit.common.sdkinternal.f {

    /* renamed from: j  reason: collision with root package name */
    private static final lo.d f17306j = lo.d.b();

    /* renamed from: k  reason: collision with root package name */
    static boolean f17307k = true;

    /* renamed from: d  reason: collision with root package name */
    private final go.b f17308d;

    /* renamed from: e  reason: collision with root package name */
    private final i f17309e;

    /* renamed from: f  reason: collision with root package name */
    private final zzoq f17310f;

    /* renamed from: g  reason: collision with root package name */
    private final zzos f17311g;

    /* renamed from: h  reason: collision with root package name */
    private final lo.a f17312h = new lo.a();

    /* renamed from: i  reason: collision with root package name */
    private boolean f17313i;

    public h(com.google.mlkit.common.sdkinternal.i iVar, go.b bVar, i iVar2, zzoq zzoqVar) {
        Preconditions.checkNotNull(iVar, "MlKitContext can not be null");
        Preconditions.checkNotNull(bVar, "BarcodeScannerOptions can not be null");
        this.f17308d = bVar;
        this.f17309e = iVar2;
        this.f17310f = zzoqVar;
        this.f17311g = zzos.zza(iVar.b());
    }

    private final void m(final zzlb zzlbVar, long j11, final ko.a aVar, List list) {
        final zzbz zzbzVar = new zzbz();
        final zzbz zzbzVar2 = new zzbz();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ho.a aVar2 = (ho.a) it2.next();
                zzbzVar.zzd(b.a(aVar2.b()));
                zzbzVar2.zzd(b.b(aVar2.d()));
            }
        }
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j11;
        this.f17310f.zzf(new zzoo() { // from class: com.google.mlkit.vision.barcode.internal.f
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzoo
            public final zzof zza() {
                return h.this.j(elapsedRealtime, zzlbVar, zzbzVar, zzbzVar2, aVar);
            }
        }, zzlc.ON_DEVICE_BARCODE_DETECT);
        zzdw zzdwVar = new zzdw();
        zzdwVar.zze(zzlbVar);
        zzdwVar.zzf(Boolean.valueOf(f17307k));
        zzdwVar.zzg(b.c(this.f17308d));
        zzdwVar.zzc(zzbzVar.zzf());
        zzdwVar.zzd(zzbzVar2.zzf());
        final zzdy zzh = zzdwVar.zzh();
        final g gVar = new g(this);
        final zzoq zzoqVar = this.f17310f;
        final zzlc zzlcVar = zzlc.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        com.google.mlkit.common.sdkinternal.g.d().execute(new Runnable(zzlcVar, zzh, elapsedRealtime, gVar, null) { // from class: com.google.android.gms.internal.mlkit_vision_barcode.zzom
            public final /* synthetic */ zzlc zzb;
            public final /* synthetic */ Object zzc;
            public final /* synthetic */ long zzd;
            public final /* synthetic */ g zze;

            @Override // java.lang.Runnable
            public final void run() {
                zzoq.this.zzh(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.f17311g.zzc(true != this.f17313i ? 24301 : 24302, zzlbVar.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void b() {
        this.f17313i = this.f17309e.zzc();
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void d() {
        this.f17309e.zzb();
        f17307k = true;
        zzoq zzoqVar = this.f17310f;
        zzld zzldVar = new zzld();
        zzldVar.zze(this.f17313i ? zzla.TYPE_THICK : zzla.TYPE_THIN);
        zzlp zzlpVar = new zzlp();
        zzlpVar.zzi(b.c(this.f17308d));
        zzldVar.zzg(zzlpVar.zzj());
        zzoqVar.zzd(zzot.zzf(zzldVar), zzlc.ON_DEVICE_BARCODE_CLOSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzof j(long j11, zzlb zzlbVar, zzbz zzbzVar, zzbz zzbzVar2, ko.a aVar) {
        zzko zzkoVar;
        zzlp zzlpVar = new zzlp();
        zzks zzksVar = new zzks();
        zzksVar.zzc(Long.valueOf(j11));
        zzksVar.zzd(zzlbVar);
        zzksVar.zze(Boolean.valueOf(f17307k));
        Boolean bool = Boolean.TRUE;
        zzksVar.zza(bool);
        zzksVar.zzb(bool);
        zzlpVar.zzh(zzksVar.zzf());
        zzlpVar.zzi(b.c(this.f17308d));
        zzlpVar.zze(zzbzVar.zzf());
        zzlpVar.zzf(zzbzVar2.zzf());
        int f11 = aVar.f();
        int d11 = f17306j.d(aVar);
        zzkn zzknVar = new zzkn();
        if (f11 == -1) {
            zzkoVar = zzko.BITMAP;
        } else if (f11 == 35) {
            zzkoVar = zzko.YUV_420_888;
        } else if (f11 == 842094169) {
            zzkoVar = zzko.YV12;
        } else if (f11 == 16) {
            zzkoVar = zzko.NV16;
        } else if (f11 != 17) {
            zzkoVar = zzko.UNKNOWN_FORMAT;
        } else {
            zzkoVar = zzko.NV21;
        }
        zzknVar.zza(zzkoVar);
        zzknVar.zzb(Integer.valueOf(d11));
        zzlpVar.zzg(zzknVar.zzd());
        zzld zzldVar = new zzld();
        zzldVar.zze(this.f17313i ? zzla.TYPE_THICK : zzla.TYPE_THIN);
        zzldVar.zzg(zzlpVar.zzj());
        return zzot.zzf(zzldVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzof k(zzdy zzdyVar, int i11, zzkk zzkkVar) {
        zzld zzldVar = new zzld();
        zzldVar.zze(this.f17313i ? zzla.TYPE_THICK : zzla.TYPE_THIN);
        zzdv zzdvVar = new zzdv();
        zzdvVar.zza(Integer.valueOf(i11));
        zzdvVar.zzc(zzdyVar);
        zzdvVar.zzb(zzkkVar);
        zzldVar.zzd(zzdvVar.zze());
        return zzot.zzf(zzldVar);
    }

    @Override // com.google.mlkit.common.sdkinternal.f
    /* renamed from: l */
    public final synchronized List i(ko.a aVar) {
        zzlb zzlbVar;
        List a11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f17312h.a(aVar);
        try {
            a11 = this.f17309e.a(aVar);
            m(zzlb.NO_ERROR, elapsedRealtime, aVar, a11);
            f17307k = false;
        } catch (MlKitException e11) {
            if (e11.a() == 14) {
                zzlbVar = zzlb.MODEL_NOT_DOWNLOADED;
            } else {
                zzlbVar = zzlb.UNKNOWN_ERROR;
            }
            m(zzlbVar, elapsedRealtime, aVar, null);
            throw e11;
        }
        return a11;
    }
}