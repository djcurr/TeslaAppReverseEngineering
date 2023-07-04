package com.google.android.gms.internal.mlkit_vision_text_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgm implements c {
    static final zzgm zza = new zzgm();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;

    static {
        b.C0705b a11 = b.a("imageFormat");
        zzcv zzcvVar = new zzcv();
        zzcvVar.zza(1);
        zzb = a11.b(zzcvVar.zzb()).a();
        b.C0705b a12 = b.a("originalImageSize");
        zzcv zzcvVar2 = new zzcv();
        zzcvVar2.zza(2);
        zzc = a12.b(zzcvVar2.zzb()).a();
        b.C0705b a13 = b.a("compressedImageSize");
        zzcv zzcvVar3 = new zzcv();
        zzcvVar3.zza(3);
        zzd = a13.b(zzcvVar3.zzb()).a();
        b.C0705b a14 = b.a("isOdmlImage");
        zzcv zzcvVar4 = new zzcv();
        zzcvVar4.zza(4);
        zze = a14.b(zzcvVar4.zzb()).a();
    }

    private zzgm() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkh zzkhVar = (zzkh) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzkhVar.zza());
        dVar.add(zzc, zzkhVar.zzb());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, (Object) null);
    }
}