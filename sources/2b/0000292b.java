package com.google.android.gms.internal.mlkit_vision_face;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzhq implements c {
    static final zzhq zza = new zzhq();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;

    static {
        b.C0705b a11 = b.a("detectorMode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a11.b(zzcqVar.zzb()).a();
        b.C0705b a12 = b.a("multipleObjectsEnabled");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a12.b(zzcqVar2.zzb()).a();
        b.C0705b a13 = b.a("classificationEnabled");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = a13.b(zzcqVar3.zzb()).a();
        b.C0705b a14 = b.a("maxPerObjectLabelCount");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = a14.b(zzcqVar4.zzb()).a();
        b.C0705b a15 = b.a("classificationConfidenceThreshold");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = a15.b(zzcqVar5.zzb()).a();
        b.C0705b a16 = b.a("customLocalModelOptions");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = a16.b(zzcqVar6.zzb()).a();
    }

    private zzhq() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzly zzlyVar = (zzly) obj;
        d dVar = (d) obj2;
        throw null;
    }
}