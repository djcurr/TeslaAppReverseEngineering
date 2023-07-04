package com.google.android.gms.internal.mlkit_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzfc implements c {
    static final zzfc zza = new zzfc();
    private static final b zzb;

    static {
        b.C0705b a11 = b.a("api");
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(1);
        zzb = a11.b(zzbhVar.zzb()).a();
    }

    private zzfc() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        ((d) obj2).add(zzb, ((zzix) obj).zza());
    }
}