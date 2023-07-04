package com.google.android.gms.internal.mlkit_vision_face;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzhm implements c {
    static final zzhm zza = new zzhm();
    private static final b zzb;
    private static final b zzc;

    static {
        b.C0705b a11 = b.a("confidence");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a11.b(zzcqVar.zzb()).a();
        b.C0705b a12 = b.a("languageCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a12.b(zzcqVar2.zzb()).a();
    }

    private zzhm() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlt zzltVar = (zzlt) obj;
        d dVar = (d) obj2;
        throw null;
    }
}