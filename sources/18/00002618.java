package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzhj implements c {
    static final zzhj zza = new zzhj();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;

    static {
        b.C0705b a11 = b.a("isChargingRequired");
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(1);
        zzb = a11.b(zzdfVar.zzb()).a();
        b.C0705b a12 = b.a(DownloaderService.EXTRA_IS_WIFI_REQUIRED);
        zzdf zzdfVar2 = new zzdf();
        zzdfVar2.zza(2);
        zzc = a12.b(zzdfVar2.zzb()).a();
        b.C0705b a13 = b.a("isDeviceIdleRequired");
        zzdf zzdfVar3 = new zzdf();
        zzdfVar3.zza(3);
        zzd = a13.b(zzdfVar3.zzb()).a();
        b.C0705b a14 = b.a("canDownloadInBackground");
        zzdf zzdfVar4 = new zzdf();
        zzdfVar4.zza(4);
        zze = a14.b(zzdfVar4.zzb()).a();
    }

    private zzhj() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzli zzliVar = (zzli) obj;
        d dVar = (d) obj2;
        throw null;
    }
}