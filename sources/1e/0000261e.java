package com.google.android.gms.internal.mlkit_vision_barcode;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzhp implements c {
    static final zzhp zza = new zzhp();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;

    static {
        b.C0705b a11 = b.a("inferenceCommonLogEvent");
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(1);
        zzb = a11.b(zzdfVar.zzb()).a();
        b.C0705b a12 = b.a("options");
        zzdf zzdfVar2 = new zzdf();
        zzdfVar2.zza(2);
        zzc = a12.b(zzdfVar2.zzb()).a();
        b.C0705b a13 = b.a("detectedBarcodeFormats");
        zzdf zzdfVar3 = new zzdf();
        zzdfVar3.zza(3);
        zzd = a13.b(zzdfVar3.zzb()).a();
        b.C0705b a14 = b.a("detectedBarcodeValueTypes");
        zzdf zzdfVar4 = new zzdf();
        zzdfVar4.zza(4);
        zze = a14.b(zzdfVar4.zzb()).a();
        b.C0705b a15 = b.a("imageInfo");
        zzdf zzdfVar5 = new zzdf();
        zzdfVar5.zza(5);
        zzf = a15.b(zzdfVar5.zzb()).a();
    }

    private zzhp() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlr zzlrVar = (zzlr) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzlrVar.zzd());
        dVar.add(zzc, zzlrVar.zze());
        dVar.add(zzd, zzlrVar.zza());
        dVar.add(zze, zzlrVar.zzb());
        dVar.add(zzf, zzlrVar.zzc());
    }
}