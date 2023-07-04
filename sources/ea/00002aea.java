package com.google.android.gms.internal.mlkit_vision_text_common;

import ezvcard.property.Kind;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zziq implements c {
    static final zziq zza = new zziq();
    private static final b zzb;
    private static final b zzc;

    static {
        b.C0705b a11 = b.a("stageId");
        zzcv zzcvVar = new zzcv();
        zzcvVar.zza(1);
        zzb = a11.b(zzcvVar.zzb()).a();
        b.C0705b a12 = b.a(Kind.DEVICE);
        zzcv zzcvVar2 = new zzcv();
        zzcvVar2.zza(2);
        zzc = a12.b(zzcvVar2.zzb()).a();
    }

    private zziq() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznm zznmVar = (zznm) obj;
        d dVar = (d) obj2;
        throw null;
    }
}