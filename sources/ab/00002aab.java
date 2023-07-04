package com.google.android.gms.internal.mlkit_vision_text_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgh implements c {
    static final zzgh zza = new zzgh();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;

    static {
        b.C0705b a11 = b.a("maxMs");
        zzcv zzcvVar = new zzcv();
        zzcvVar.zza(1);
        zzb = a11.b(zzcvVar.zzb()).a();
        b.C0705b a12 = b.a("minMs");
        zzcv zzcvVar2 = new zzcv();
        zzcvVar2.zza(2);
        zzc = a12.b(zzcvVar2.zzb()).a();
        b.C0705b a13 = b.a("avgMs");
        zzcv zzcvVar3 = new zzcv();
        zzcvVar3.zza(3);
        zzd = a13.b(zzcvVar3.zzb()).a();
        b.C0705b a14 = b.a("firstQuartileMs");
        zzcv zzcvVar4 = new zzcv();
        zzcvVar4.zza(4);
        zze = a14.b(zzcvVar4.zzb()).a();
        b.C0705b a15 = b.a("medianMs");
        zzcv zzcvVar5 = new zzcv();
        zzcvVar5.zza(5);
        zzf = a15.b(zzcvVar5.zzb()).a();
        b.C0705b a16 = b.a("thirdQuartileMs");
        zzcv zzcvVar6 = new zzcv();
        zzcvVar6.zza(6);
        zzg = a16.b(zzcvVar6.zzb()).a();
    }

    private zzgh() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkb zzkbVar = (zzkb) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzkbVar.zzc());
        dVar.add(zzc, zzkbVar.zze());
        dVar.add(zzd, zzkbVar.zza());
        dVar.add(zze, zzkbVar.zzb());
        dVar.add(zzf, zzkbVar.zzd());
        dVar.add(zzg, zzkbVar.zzf());
    }
}