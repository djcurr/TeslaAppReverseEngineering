package com.google.android.gms.internal.mlkit_vision_face;

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

    static {
        b.C0705b a11 = b.a("imageFormat");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a11.b(zzcqVar.zzb()).a();
        b.C0705b a12 = b.a("originalImageSize");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a12.b(zzcqVar2.zzb()).a();
        b.C0705b a13 = b.a("compressedImageSize");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = a13.b(zzcqVar3.zzb()).a();
        b.C0705b a14 = b.a("isOdmlImage");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = a14.b(zzcqVar4.zzb()).a();
    }

    private zzgh() {
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