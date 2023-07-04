package com.google.android.gms.internal.mlkit_vision_text_common;

import com.stripe.android.model.Stripe3ds2AuthParams;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgp implements c {
    static final zzgp zza = new zzgp();
    private static final b zzb;
    private static final b zzc;

    static {
        b.C0705b a11 = b.a(Stripe3ds2AuthParams.FIELD_SOURCE);
        zzcv zzcvVar = new zzcv();
        zzcvVar.zza(1);
        zzb = a11.b(zzcvVar.zzb()).a();
        b.C0705b a12 = b.a("errorCode");
        zzcv zzcvVar2 = new zzcv();
        zzcvVar2.zza(2);
        zzc = a12.b(zzcvVar2.zzb()).a();
    }

    private zzgp() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzng zzngVar = (zzng) obj;
        d dVar = (d) obj2;
        throw null;
    }
}