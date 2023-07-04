package com.google.android.gms.internal.mlkit_vision_barcode;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzhq implements c {
    static final zzhq zza = new zzhq();
    private static final b zzb;

    static {
        b.C0705b a11 = b.a("errorCode");
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(1);
        zzb = a11.b(zzdfVar.zzb()).a();
    }

    private zzhq() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((d) obj2).add(zzb, ((zzlu) obj).zza());
    }
}