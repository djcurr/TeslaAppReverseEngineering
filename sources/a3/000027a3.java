package com.google.android.gms.internal.mlkit_vision_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzfe implements c {
    static final zzfe zza = new zzfe();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;

    static {
        b.C0705b a11 = b.a("detectorMode");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a11.b(zzaeVar.zzb()).a();
        b.C0705b a12 = b.a("multipleObjectsEnabled");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a12.b(zzaeVar2.zzb()).a();
        b.C0705b a13 = b.a("classificationEnabled");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a13.b(zzaeVar3.zzb()).a();
        b.C0705b a14 = b.a("maxPerObjectLabelCount");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = a14.b(zzaeVar4.zzb()).a();
        b.C0705b a15 = b.a("classificationConfidenceThreshold");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = a15.b(zzaeVar5.zzb()).a();
        b.C0705b a16 = b.a("customLocalModelOptions");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = a16.b(zzaeVar6.zzb()).a();
    }

    private zzfe() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zziy zziyVar = (zziy) obj;
        d dVar = (d) obj2;
        throw null;
    }
}