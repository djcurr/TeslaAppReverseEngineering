package com.google.android.gms.internal.mlkit_vision_barcode;

import com.google.android.libraries.places.api.model.PlaceTypes;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgu implements c {
    static final zzgu zza = new zzgu();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;

    static {
        b.C0705b a11 = b.a("mode");
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(1);
        zzb = a11.b(zzdfVar.zzb()).a();
        b.C0705b a12 = b.a(PlaceTypes.LANDMARK);
        zzdf zzdfVar2 = new zzdf();
        zzdfVar2.zza(2);
        zzc = a12.b(zzdfVar2.zzb()).a();
        b.C0705b a13 = b.a("classification");
        zzdf zzdfVar3 = new zzdf();
        zzdfVar3.zza(3);
        zzd = a13.b(zzdfVar3.zzb()).a();
        b.C0705b a14 = b.a("prominentFaceOnly");
        zzdf zzdfVar4 = new zzdf();
        zzdfVar4.zza(4);
        zze = a14.b(zzdfVar4.zzb()).a();
        b.C0705b a15 = b.a("tracking");
        zzdf zzdfVar5 = new zzdf();
        zzdfVar5.zza(5);
        zzf = a15.b(zzdfVar5.zzb()).a();
        b.C0705b a16 = b.a("minFaceSize");
        zzdf zzdfVar6 = new zzdf();
        zzdfVar6.zza(6);
        zzg = a16.b(zzdfVar6.zzb()).a();
    }

    private zzgu() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzob zzobVar = (zzob) obj;
        d dVar = (d) obj2;
        throw null;
    }
}