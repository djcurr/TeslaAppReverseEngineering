package com.google.android.gms.internal.mlkit_vision_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzdw implements c {
    static final zzdw zza = new zzdw();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;

    static {
        b.C0705b a11 = b.a("modelType");
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a11.b(zzaeVar.zzb()).a();
        b.C0705b a12 = b.a("isDownloaded");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a12.b(zzaeVar2.zzb()).a();
        b.C0705b a13 = b.a("modelName");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a13.b(zzaeVar3.zzb()).a();
    }

    private zzdw() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzhp zzhpVar = (zzhp) obj;
        d dVar = (d) obj2;
        throw null;
    }
}