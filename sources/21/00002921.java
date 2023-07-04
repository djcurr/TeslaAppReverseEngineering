package com.google.android.gms.internal.mlkit_vision_face;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzhg implements c {
    static final zzhg zza = new zzhg();
    private static final b zzb;

    static {
        b.C0705b a11 = b.a("errorCode");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a11.b(zzcqVar.zzb()).a();
    }

    private zzhg() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((d) obj2).add(zzb, ((zzlo) obj).zza());
    }
}