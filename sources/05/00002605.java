package com.google.android.gms.internal.mlkit_vision_barcode;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgr implements c {
    static final zzgr zza = new zzgr();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;

    static {
        b.C0705b a11 = b.a("maxMs");
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(1);
        zzb = a11.b(zzdfVar.zzb()).a();
        b.C0705b a12 = b.a("minMs");
        zzdf zzdfVar2 = new zzdf();
        zzdfVar2.zza(2);
        zzc = a12.b(zzdfVar2.zzb()).a();
        b.C0705b a13 = b.a("avgMs");
        zzdf zzdfVar3 = new zzdf();
        zzdfVar3.zza(3);
        zzd = a13.b(zzdfVar3.zzb()).a();
        b.C0705b a14 = b.a("firstQuartileMs");
        zzdf zzdfVar4 = new zzdf();
        zzdfVar4.zza(4);
        zze = a14.b(zzdfVar4.zzb()).a();
        b.C0705b a15 = b.a("medianMs");
        zzdf zzdfVar5 = new zzdf();
        zzdfVar5.zza(5);
        zzf = a15.b(zzdfVar5.zzb()).a();
        b.C0705b a16 = b.a("thirdQuartileMs");
        zzdf zzdfVar6 = new zzdf();
        zzdfVar6.zza(6);
        zzg = a16.b(zzdfVar6.zzb()).a();
    }

    private zzgr() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkk zzkkVar = (zzkk) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzkkVar.zzc());
        dVar.add(zzc, zzkkVar.zze());
        dVar.add(zzd, zzkkVar.zza());
        dVar.add(zze, zzkkVar.zzb());
        dVar.add(zzf, zzkkVar.zzd());
        dVar.add(zzg, zzkkVar.zzf());
    }
}