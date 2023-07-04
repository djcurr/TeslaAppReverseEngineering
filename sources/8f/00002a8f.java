package com.google.android.gms.internal.mlkit_vision_text_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzfg implements c {
    static final zzfg zza = new zzfg();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;

    static {
        b.C0705b a11 = b.a("errorCode");
        zzcv zzcvVar = new zzcv();
        zzcvVar.zza(1);
        zzb = a11.b(zzcvVar.zzb()).a();
        b.C0705b a12 = b.a("hasResult");
        zzcv zzcvVar2 = new zzcv();
        zzcvVar2.zza(2);
        zzc = a12.b(zzcvVar2.zzb()).a();
        b.C0705b a13 = b.a("isColdCall");
        zzcv zzcvVar3 = new zzcv();
        zzcvVar3.zza(3);
        zzd = a13.b(zzcvVar3.zzb()).a();
        b.C0705b a14 = b.a("imageInfo");
        zzcv zzcvVar4 = new zzcv();
        zzcvVar4.zza(4);
        zze = a14.b(zzcvVar4.zzb()).a();
        b.C0705b a15 = b.a("recognizerOptions");
        zzcv zzcvVar5 = new zzcv();
        zzcvVar5.zza(5);
        zzf = a15.b(zzcvVar5.zzb()).a();
    }

    private zzfg() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzee zzeeVar = (zzee) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzeeVar.zza());
        dVar.add(zzc, (Object) null);
        dVar.add(zzd, zzeeVar.zzc());
        dVar.add(zze, (Object) null);
        dVar.add(zzf, zzeeVar.zzb());
    }
}