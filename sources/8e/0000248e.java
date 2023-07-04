package com.google.android.gms.internal.mlkit_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgm implements c {
    static final zzgm zza = new zzgm();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        b.C0705b a11 = b.a("inferenceCommonLogEvent");
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(1);
        zzb = a11.b(zzbhVar.zzb()).a();
        b.C0705b a12 = b.a("detectorOptions");
        zzbh zzbhVar2 = new zzbh();
        zzbhVar2.zza(2);
        zzc = a12.b(zzbhVar2.zzb()).a();
        b.C0705b a13 = b.a("imageInfo");
        zzbh zzbhVar3 = new zzbh();
        zzbhVar3.zza(3);
        zzd = a13.b(zzbhVar3.zzb()).a();
    }

    private zzgm() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzks zzksVar = (zzks) obj;
        d dVar = (d) obj2;
        throw null;
    }
}