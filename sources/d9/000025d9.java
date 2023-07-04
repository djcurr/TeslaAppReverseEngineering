package com.google.android.gms.internal.mlkit_vision_barcode;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzfa implements c {
    static final zzfa zza = new zzfa();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;

    static {
        b.C0705b a11 = b.a("errorCode");
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(1);
        zzb = a11.b(zzdfVar.zzb()).a();
        b.C0705b a12 = b.a("hasResult");
        zzdf zzdfVar2 = new zzdf();
        zzdfVar2.zza(2);
        zzc = a12.b(zzdfVar2.zzb()).a();
        b.C0705b a13 = b.a("isColdCall");
        zzdf zzdfVar3 = new zzdf();
        zzdfVar3.zza(3);
        zzd = a13.b(zzdfVar3.zzb()).a();
        b.C0705b a14 = b.a("imageInfo");
        zzdf zzdfVar4 = new zzdf();
        zzdfVar4.zza(4);
        zze = a14.b(zzdfVar4.zzb()).a();
        b.C0705b a15 = b.a("options");
        zzdf zzdfVar5 = new zzdf();
        zzdfVar5.zza(5);
        zzf = a15.b(zzdfVar5.zzb()).a();
        b.C0705b a16 = b.a("detectedBarcodeFormats");
        zzdf zzdfVar6 = new zzdf();
        zzdfVar6.zza(6);
        zzg = a16.b(zzdfVar6.zzb()).a();
        b.C0705b a17 = b.a("detectedBarcodeValueTypes");
        zzdf zzdfVar7 = new zzdf();
        zzdfVar7.zza(7);
        zzh = a17.b(zzdfVar7.zzb()).a();
    }

    private zzfa() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzdy zzdyVar = (zzdy) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzdyVar.zzc());
        dVar.add(zzc, (Object) null);
        dVar.add(zzd, zzdyVar.zze());
        dVar.add(zze, (Object) null);
        dVar.add(zzf, zzdyVar.zzd());
        dVar.add(zzg, zzdyVar.zza());
        dVar.add(zzh, zzdyVar.zzb());
    }
}