package com.google.android.gms.internal.mlkit_vision_barcode;

import ezvcard.property.Kind;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzja implements c {
    static final zzja zza = new zzja();
    private static final b zzb;
    private static final b zzc;

    static {
        b.C0705b a11 = b.a("stageId");
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(1);
        zzb = a11.b(zzdfVar.zzb()).a();
        b.C0705b a12 = b.a(Kind.DEVICE);
        zzdf zzdfVar2 = new zzdf();
        zzdfVar2.zza(2);
        zzc = a12.b(zzdfVar2.zzb()).a();
    }

    private zzja() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznt zzntVar = (zznt) obj;
        d dVar = (d) obj2;
        throw null;
    }
}