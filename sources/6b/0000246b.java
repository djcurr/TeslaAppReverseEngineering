package com.google.android.gms.internal.mlkit_common;

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
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;

    static {
        b.C0705b a11 = b.a("options");
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(1);
        zzb = a11.b(zzbhVar.zzb()).a();
        b.C0705b a12 = b.a("roughDownloadDurationMs");
        zzbh zzbhVar2 = new zzbh();
        zzbhVar2.zza(2);
        zzc = a12.b(zzbhVar2.zzb()).a();
        b.C0705b a13 = b.a("errorCode");
        zzbh zzbhVar3 = new zzbh();
        zzbhVar3.zza(3);
        zzd = a13.b(zzbhVar3.zzb()).a();
        b.C0705b a14 = b.a("exactDownloadDurationMs");
        zzbh zzbhVar4 = new zzbh();
        zzbhVar4.zza(4);
        zze = a14.b(zzbhVar4.zzb()).a();
        b.C0705b a15 = b.a("downloadStatus");
        zzbh zzbhVar5 = new zzbh();
        zzbhVar5.zza(5);
        zzf = a15.b(zzbhVar5.zzb()).a();
        b.C0705b a16 = b.a("downloadFailureStatus");
        zzbh zzbhVar6 = new zzbh();
        zzbhVar6.zza(6);
        zzg = a16.b(zzbhVar6.zzb()).a();
        b.C0705b a17 = b.a("mddDownloadErrorCodes");
        zzbh zzbhVar7 = new zzbh();
        zzbhVar7.zza(7);
        zzh = a17.b(zzbhVar7.zzb()).a();
    }

    private zzfe() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjg zzjgVar = (zzjg) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzjgVar.zzc());
        dVar.add(zzc, zzjgVar.zzf());
        dVar.add(zzd, zzjgVar.zza());
        dVar.add(zze, zzjgVar.zze());
        dVar.add(zzf, zzjgVar.zzb());
        dVar.add(zzg, zzjgVar.zzd());
        dVar.add(zzh, (Object) null);
    }
}