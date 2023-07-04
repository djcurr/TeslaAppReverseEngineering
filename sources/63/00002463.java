package com.google.android.gms.internal.mlkit_common;

import com.stripe.android.model.Stripe3ds2AuthParams;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzex implements c {
    static final zzex zza = new zzex();
    private static final b zzb;
    private static final b zzc;

    static {
        b.C0705b a11 = b.a(Stripe3ds2AuthParams.FIELD_SOURCE);
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(1);
        zzb = a11.b(zzbhVar.zzb()).a();
        b.C0705b a12 = b.a("errorCode");
        zzbh zzbhVar2 = new zzbh();
        zzbhVar2.zza(2);
        zzc = a12.b(zzbhVar2.zzb()).a();
    }

    private zzex() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzln zzlnVar = (zzln) obj;
        d dVar = (d) obj2;
        throw null;
    }
}