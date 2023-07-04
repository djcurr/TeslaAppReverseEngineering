package com.google.android.gms.internal.mlkit_vision_text_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzhv implements c {
    static final zzhv zza = new zzhv();
    private static final b zzb;
    private static final b zzc;

    static {
        b.C0705b a11 = b.a("confidence");
        zzcv zzcvVar = new zzcv();
        zzcvVar.zza(1);
        zzb = a11.b(zzcvVar.zzb()).a();
        b.C0705b a12 = b.a("languageCode");
        zzcv zzcvVar2 = new zzcv();
        zzcvVar2.zza(2);
        zzc = a12.b(zzcvVar2.zzb()).a();
    }

    private zzhv() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlt zzltVar = (zzlt) obj;
        d dVar = (d) obj2;
        throw null;
    }
}