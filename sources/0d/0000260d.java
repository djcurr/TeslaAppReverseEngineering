package com.google.android.gms.internal.mlkit_vision_barcode;

import com.stripe.android.model.Stripe3ds2AuthParams;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgz implements c {
    static final zzgz zza = new zzgz();
    private static final b zzb;
    private static final b zzc;

    static {
        b.C0705b a11 = b.a(Stripe3ds2AuthParams.FIELD_SOURCE);
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(1);
        zzb = a11.b(zzdfVar.zzb()).a();
        b.C0705b a12 = b.a("errorCode");
        zzdf zzdfVar2 = new zzdf();
        zzdfVar2.zza(2);
        zzc = a12.b(zzdfVar2.zzb()).a();
    }

    private zzgz() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznn zznnVar = (zznn) obj;
        d dVar = (d) obj2;
        throw null;
    }
}