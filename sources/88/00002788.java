package com.google.android.gms.internal.mlkit_vision_common;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzee implements c {
    static final zzee zza = new zzee();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;

    static {
        b.C0705b a11 = b.a("isChargingRequired");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a11.b(zzaeVar.zzb()).a();
        b.C0705b a12 = b.a(DownloaderService.EXTRA_IS_WIFI_REQUIRED);
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a12.b(zzaeVar2.zzb()).a();
        b.C0705b a13 = b.a("isDeviceIdleRequired");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a13.b(zzaeVar3.zzb()).a();
        b.C0705b a14 = b.a("canDownloadInBackground");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = a14.b(zzaeVar4.zzb()).a();
    }

    private zzee() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhz zzhzVar = (zzhz) obj;
        d dVar = (d) obj2;
        throw null;
    }
}