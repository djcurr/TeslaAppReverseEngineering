package com.google.android.gms.internal.mlkit_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgd implements c {
    static final zzgd zza = new zzgd();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;

    static {
        b.C0705b a11 = b.a("detectorMode");
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(1);
        zzb = a11.b(zzbhVar.zzb()).a();
        b.C0705b a12 = b.a("multipleObjectsEnabled");
        zzbh zzbhVar2 = new zzbh();
        zzbhVar2.zza(2);
        zzc = a12.b(zzbhVar2.zzb()).a();
        b.C0705b a13 = b.a("classificationEnabled");
        zzbh zzbhVar3 = new zzbh();
        zzbhVar3.zza(3);
        zzd = a13.b(zzbhVar3.zzb()).a();
        b.C0705b a14 = b.a("maxPerObjectLabelCount");
        zzbh zzbhVar4 = new zzbh();
        zzbhVar4.zza(4);
        zze = a14.b(zzbhVar4.zzb()).a();
        b.C0705b a15 = b.a("classificationConfidenceThreshold");
        zzbh zzbhVar5 = new zzbh();
        zzbhVar5.zza(5);
        zzf = a15.b(zzbhVar5.zzb()).a();
        b.C0705b a16 = b.a("customLocalModelOptions");
        zzbh zzbhVar6 = new zzbh();
        zzbhVar6.zza(6);
        zzg = a16.b(zzbhVar6.zzb()).a();
    }

    private zzgd() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkj zzkjVar = (zzkj) obj;
        d dVar = (d) obj2;
        throw null;
    }
}