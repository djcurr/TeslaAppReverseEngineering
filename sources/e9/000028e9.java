package com.google.android.gms.internal.mlkit_vision_face;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzfe implements c {
    static final zzfe zza = new zzfe();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;

    static {
        b.C0705b a11 = b.a("remoteModelOptions");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a11.b(zzcqVar.zzb()).a();
        b.C0705b a12 = b.a("localModelOptions");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a12.b(zzcqVar2.zzb()).a();
        b.C0705b a13 = b.a("errorCodes");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = a13.b(zzcqVar3.zzb()).a();
        b.C0705b a14 = b.a("modelInitializationMs");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = a14.b(zzcqVar4.zzb()).a();
    }

    private zzfe() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzee zzeeVar = (zzee) obj;
        d dVar = (d) obj2;
        throw null;
    }
}