package com.google.android.gms.internal.mlkit_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzem implements c {
    static final zzem zza = new zzem();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;

    static {
        b.C0705b a11 = b.a("remoteModelOptions");
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(1);
        zzb = a11.b(zzbhVar.zzb()).a();
        b.C0705b a12 = b.a("localModelOptions");
        zzbh zzbhVar2 = new zzbh();
        zzbhVar2.zza(2);
        zzc = a12.b(zzbhVar2.zzb()).a();
        b.C0705b a13 = b.a("errorCodes");
        zzbh zzbhVar3 = new zzbh();
        zzbhVar3.zza(3);
        zzd = a13.b(zzbhVar3.zzb()).a();
        b.C0705b a14 = b.a("modelInitializationMs");
        zzbh zzbhVar4 = new zzbh();
        zzbhVar4.zza(4);
        zze = a14.b(zzbhVar4.zzb()).a();
        b.C0705b a15 = b.a("isNnApiEnabled");
        zzbh zzbhVar5 = new zzbh();
        zzbhVar5.zza(5);
        zzf = a15.b(zzbhVar5.zzb()).a();
    }

    private zzem() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzie zzieVar = (zzie) obj;
        d dVar = (d) obj2;
        throw null;
    }
}