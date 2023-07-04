package com.google.android.gms.internal.mlkit_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgs implements c {
    static final zzgs zza = new zzgs();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        b.C0705b a11 = b.a("languageOption");
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(3);
        zzb = a11.b(zzbhVar.zzb()).a();
        b.C0705b a12 = b.a("isUsingLegacyApi");
        zzbh zzbhVar2 = new zzbh();
        zzbhVar2.zza(4);
        zzc = a12.b(zzbhVar2.zzb()).a();
        b.C0705b a13 = b.a("sdkVersion");
        zzbh zzbhVar3 = new zzbh();
        zzbhVar3.zza(5);
        zzd = a13.b(zzbhVar3.zzb()).a();
    }

    private zzgs() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzky zzkyVar = (zzky) obj;
        d dVar = (d) obj2;
        throw null;
    }
}