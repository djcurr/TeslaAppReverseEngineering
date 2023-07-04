package com.google.android.gms.internal.mlkit_vision_text_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzij implements c {
    static final zzij zza = new zzij();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        b.C0705b a11 = b.a("inferenceCommonLogEvent");
        zzcv zzcvVar = new zzcv();
        zzcvVar.zza(1);
        zzb = a11.b(zzcvVar.zzb()).a();
        b.C0705b a12 = b.a("imageInfo");
        zzcv zzcvVar2 = new zzcv();
        zzcvVar2.zza(2);
        zzc = a12.b(zzcvVar2.zzb()).a();
        b.C0705b a13 = b.a("recognizerOptions");
        zzcv zzcvVar3 = new zzcv();
        zzcvVar3.zza(3);
        zzd = a13.b(zzcvVar3.zzb()).a();
    }

    private zzij() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmm zzmmVar = (zzmm) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzmmVar.zzb());
        dVar.add(zzc, zzmmVar.zza());
        dVar.add(zzd, zzmmVar.zzc());
    }
}