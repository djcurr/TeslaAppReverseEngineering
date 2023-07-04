package com.google.android.gms.internal.mlkit_common;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzfh implements c {
    static final zzfh zza = new zzfh();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;

    static {
        b.C0705b a11 = b.a("isChargingRequired");
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(1);
        zzb = a11.b(zzbhVar.zzb()).a();
        b.C0705b a12 = b.a(DownloaderService.EXTRA_IS_WIFI_REQUIRED);
        zzbh zzbhVar2 = new zzbh();
        zzbhVar2.zza(2);
        zzc = a12.b(zzbhVar2.zzb()).a();
        b.C0705b a13 = b.a("isDeviceIdleRequired");
        zzbh zzbhVar3 = new zzbh();
        zzbhVar3.zza(3);
        zzd = a13.b(zzbhVar3.zzb()).a();
        b.C0705b a14 = b.a("canDownloadInBackground");
        zzbh zzbhVar4 = new zzbh();
        zzbhVar4.zza(4);
        zze = a14.b(zzbhVar4.zzb()).a();
    }

    private zzfh() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjn zzjnVar = (zzjn) obj;
        d dVar = (d) obj2;
        throw null;
    }
}