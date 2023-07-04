package com.google.android.gms.internal.mlkit_vision_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzeu implements c {
    static final zzeu zza = new zzeu();
    private static final b zzb;
    private static final b zzc;

    static {
        b.C0705b a11 = b.a("isFaceMeshEnabled");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a11.b(zzaeVar.zzb()).a();
        b.C0705b a12 = b.a("useCase");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a12.b(zzaeVar2.zzb()).a();
    }

    private zzeu() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzio zzioVar = (zzio) obj;
        d dVar = (d) obj2;
        throw null;
    }
}