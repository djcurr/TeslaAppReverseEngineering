package com.google.android.gms.internal.mlkit_vision_face;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgj implements c {
    static final zzgj zza = new zzgj();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;
    private static final b zzi;
    private static final b zzj;
    private static final b zzk;

    static {
        b.C0705b a11 = b.a("durationMs");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a11.b(zzcqVar.zzb()).a();
        b.C0705b a12 = b.a("errorCode");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a12.b(zzcqVar2.zzb()).a();
        b.C0705b a13 = b.a("isColdCall");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = a13.b(zzcqVar3.zzb()).a();
        b.C0705b a14 = b.a("autoManageModelOnBackground");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = a14.b(zzcqVar4.zzb()).a();
        b.C0705b a15 = b.a("autoManageModelOnLowMemory");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = a15.b(zzcqVar5.zzb()).a();
        b.C0705b a16 = b.a("isNnApiEnabled");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = a16.b(zzcqVar6.zzb()).a();
        b.C0705b a17 = b.a("eventsCount");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = a17.b(zzcqVar7.zzb()).a();
        b.C0705b a18 = b.a("otherErrors");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = a18.b(zzcqVar8.zzb()).a();
        b.C0705b a19 = b.a("remoteConfigValueForAcceleration");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        zzj = a19.b(zzcqVar9.zzb()).a();
        b.C0705b a21 = b.a("isAccelerated");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        zzk = a21.b(zzcqVar10.zzb()).a();
    }

    private zzgj() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzkl zzklVar = (zzkl) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzklVar.zze());
        dVar.add(zzc, zzklVar.zza());
        dVar.add(zzd, zzklVar.zzd());
        dVar.add(zze, zzklVar.zzb());
        dVar.add(zzf, zzklVar.zzc());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) null);
        dVar.add(zzj, (Object) null);
        dVar.add(zzk, (Object) null);
    }
}