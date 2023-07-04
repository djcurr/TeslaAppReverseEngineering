package com.google.mlkit.vision.text.internal;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzeb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzec;
import com.google.android.gms.internal.mlkit_vision_text_common.zzee;
import com.google.android.gms.internal.mlkit_vision_text_common.zzkb;
import com.google.android.gms.internal.mlkit_vision_text_common.zzke;
import com.google.android.gms.internal.mlkit_vision_text_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_text_common.zzkj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzkr;
import com.google.android.gms.internal.mlkit_vision_text_common.zzks;
import com.google.android.gms.internal.mlkit_vision_text_common.zzkt;
import com.google.android.gms.internal.mlkit_vision_text_common.zzku;
import com.google.android.gms.internal.mlkit_vision_text_common.zzmk;
import com.google.android.gms.internal.mlkit_vision_text_common.zzmm;
import com.google.android.gms.internal.mlkit_vision_text_common.zzmn;
import com.google.android.gms.internal.mlkit_vision_text_common.zznv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoe;
import com.google.android.gms.internal.mlkit_vision_text_common.zzog;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoi;
import com.google.android.gms.internal.mlkit_vision_text_common.zzoj;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.o;
import com.google.mlkit.vision.text.internal.m;

/* loaded from: classes2.dex */
public class b extends com.google.mlkit.common.sdkinternal.f<oo.a, ko.a> {

    /* renamed from: i  reason: collision with root package name */
    static boolean f17379i = true;

    /* renamed from: d  reason: collision with root package name */
    private final i f17381d;

    /* renamed from: e  reason: collision with root package name */
    private final zzog f17382e;

    /* renamed from: f  reason: collision with root package name */
    private final zzoi f17383f;

    /* renamed from: g  reason: collision with root package name */
    private final oo.d f17384g;

    /* renamed from: j  reason: collision with root package name */
    private static final lo.d f17380j = lo.d.b();
    @KeepForSdk

    /* renamed from: h  reason: collision with root package name */
    private static final o f17378h = new o();

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(zzog zzogVar, i iVar, oo.d dVar) {
        super(f17378h);
        this.f17382e = zzogVar;
        this.f17381d = iVar;
        this.f17383f = zzoi.zza(com.google.mlkit.common.sdkinternal.i.c().b());
        this.f17384g = dVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i m(Context context, oo.d dVar, zzog zzogVar) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) < 204700000 && !dVar.c()) {
            return new e(context);
        }
        return new d(context, dVar, zzogVar);
    }

    private final void n(final zzks zzksVar, long j11, final ko.a aVar) {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - j11;
        this.f17382e.zzf(new zzoe() { // from class: com.google.mlkit.vision.text.internal.l
            @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzoe
            public final zznv zza() {
                return b.this.j(elapsedRealtime, zzksVar, aVar);
            }
        }, zzkt.ON_DEVICE_TEXT_DETECT);
        zzec zzecVar = new zzec();
        zzecVar.zza(zzksVar);
        zzecVar.zzb(Boolean.valueOf(f17379i));
        zzmn zzmnVar = new zzmn();
        zzmnVar.zza(a.a(this.f17384g.f()));
        zzecVar.zzc(zzmnVar.zzc());
        final zzee zzd = zzecVar.zzd();
        final m mVar = new m(this);
        final zzog zzogVar = this.f17382e;
        final zzkt zzktVar = zzkt.AGGREGATED_ON_DEVICE_TEXT_DETECTION;
        com.google.mlkit.common.sdkinternal.g.d().execute(new Runnable(zzktVar, zzd, elapsedRealtime, mVar, null) { // from class: com.google.android.gms.internal.mlkit_vision_text_common.zzoc
            public final /* synthetic */ zzkt zzb;
            public final /* synthetic */ Object zzc;
            public final /* synthetic */ long zzd;
            public final /* synthetic */ m zze;

            @Override // java.lang.Runnable
            public final void run() {
                zzog.this.zzh(this.zzb, this.zzc, this.zzd, this.zze);
            }
        });
        long currentTimeMillis = System.currentTimeMillis();
        this.f17383f.zzc(this.f17384g.d(), zzksVar.zza(), currentTimeMillis - elapsedRealtime, currentTimeMillis);
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void b() {
        this.f17381d.zzb();
    }

    @Override // com.google.mlkit.common.sdkinternal.k
    public final synchronized void d() {
        f17379i = true;
        this.f17381d.zzc();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zznv j(long j11, zzks zzksVar, ko.a aVar) {
        zzkf zzkfVar;
        zzkr zzkrVar;
        zzmk zzmkVar = new zzmk();
        zzkj zzkjVar = new zzkj();
        zzkjVar.zzc(Long.valueOf(j11));
        zzkjVar.zzd(zzksVar);
        zzkjVar.zze(Boolean.valueOf(f17379i));
        Boolean bool = Boolean.TRUE;
        zzkjVar.zza(bool);
        zzkjVar.zzb(bool);
        zzmkVar.zzd(zzkjVar.zzf());
        lo.d dVar = f17380j;
        int c11 = dVar.c(aVar);
        int d11 = dVar.d(aVar);
        zzke zzkeVar = new zzke();
        if (c11 == -1) {
            zzkfVar = zzkf.BITMAP;
        } else if (c11 == 35) {
            zzkfVar = zzkf.YUV_420_888;
        } else if (c11 == 842094169) {
            zzkfVar = zzkf.YV12;
        } else if (c11 == 16) {
            zzkfVar = zzkf.NV16;
        } else if (c11 != 17) {
            zzkfVar = zzkf.UNKNOWN_FORMAT;
        } else {
            zzkfVar = zzkf.NV21;
        }
        zzkeVar.zza(zzkfVar);
        zzkeVar.zzb(Integer.valueOf(d11));
        zzmkVar.zzc(zzkeVar.zzd());
        zzmn zzmnVar = new zzmn();
        zzmnVar.zza(a.a(this.f17384g.f()));
        zzmkVar.zze(zzmnVar.zzc());
        zzmm zzf = zzmkVar.zzf();
        zzku zzkuVar = new zzku();
        if (this.f17384g.c()) {
            zzkrVar = zzkr.TYPE_THICK;
        } else {
            zzkrVar = zzkr.TYPE_THIN;
        }
        zzkuVar.zze(zzkrVar);
        zzkuVar.zzh(zzf);
        return zzoj.zzf(zzkuVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zznv k(zzee zzeeVar, int i11, zzkb zzkbVar) {
        zzkr zzkrVar;
        zzku zzkuVar = new zzku();
        if (this.f17384g.c()) {
            zzkrVar = zzkr.TYPE_THICK;
        } else {
            zzkrVar = zzkr.TYPE_THIN;
        }
        zzkuVar.zze(zzkrVar);
        zzeb zzebVar = new zzeb();
        zzebVar.zza(Integer.valueOf(i11));
        zzebVar.zzc(zzeeVar);
        zzebVar.zzb(zzkbVar);
        zzkuVar.zzd(zzebVar.zze());
        return zzoj.zzf(zzkuVar);
    }

    @Override // com.google.mlkit.common.sdkinternal.f
    /* renamed from: l */
    public final synchronized oo.a i(ko.a aVar) {
        zzks zzksVar;
        oo.a a11;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            a11 = this.f17381d.a(aVar);
            n(zzks.NO_ERROR, elapsedRealtime, aVar);
            f17379i = false;
        } catch (MlKitException e11) {
            if (e11.a() == 14) {
                zzksVar = zzks.MODEL_NOT_DOWNLOADED;
            } else {
                zzksVar = zzks.UNKNOWN_ERROR;
            }
            n(zzksVar, elapsedRealtime, aVar);
            throw e11;
        }
        return a11;
    }
}