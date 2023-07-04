package com.google.android.gms.internal.mlkit_vision_face;

import com.stripe.android.model.Stripe3ds2AuthParams;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgk implements c {
    static final zzgk zza = new zzgk();
    private static final b zzb;
    private static final b zzc;

    static {
        b.C0705b a11 = b.a(Stripe3ds2AuthParams.FIELD_SOURCE);
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a11.b(zzcqVar.zzb()).a();
        b.C0705b a12 = b.a("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a12.b(zzcqVar2.zzb()).a();
    }

    private zzgk() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznc zzncVar = (zznc) obj;
        d dVar = (d) obj2;
        throw null;
    }
}