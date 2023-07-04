package com.google.android.gms.internal.mlkit_vision_barcode;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgy implements c {
    static final zzgy zza = new zzgy();
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
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(1);
        zzb = a11.b(zzdfVar.zzb()).a();
        b.C0705b a12 = b.a("errorCode");
        zzdf zzdfVar2 = new zzdf();
        zzdfVar2.zza(2);
        zzc = a12.b(zzdfVar2.zzb()).a();
        b.C0705b a13 = b.a("isColdCall");
        zzdf zzdfVar3 = new zzdf();
        zzdfVar3.zza(3);
        zzd = a13.b(zzdfVar3.zzb()).a();
        b.C0705b a14 = b.a("autoManageModelOnBackground");
        zzdf zzdfVar4 = new zzdf();
        zzdfVar4.zza(4);
        zze = a14.b(zzdfVar4.zzb()).a();
        b.C0705b a15 = b.a("autoManageModelOnLowMemory");
        zzdf zzdfVar5 = new zzdf();
        zzdfVar5.zza(5);
        zzf = a15.b(zzdfVar5.zzb()).a();
        b.C0705b a16 = b.a("isNnApiEnabled");
        zzdf zzdfVar6 = new zzdf();
        zzdfVar6.zza(6);
        zzg = a16.b(zzdfVar6.zzb()).a();
        b.C0705b a17 = b.a("eventsCount");
        zzdf zzdfVar7 = new zzdf();
        zzdfVar7.zza(7);
        zzh = a17.b(zzdfVar7.zzb()).a();
        b.C0705b a18 = b.a("otherErrors");
        zzdf zzdfVar8 = new zzdf();
        zzdfVar8.zza(8);
        zzi = a18.b(zzdfVar8.zzb()).a();
        b.C0705b a19 = b.a("remoteConfigValueForAcceleration");
        zzdf zzdfVar9 = new zzdf();
        zzdfVar9.zza(9);
        zzj = a19.b(zzdfVar9.zzb()).a();
        b.C0705b a21 = b.a("isAccelerated");
        zzdf zzdfVar10 = new zzdf();
        zzdfVar10.zza(10);
        zzk = a21.b(zzdfVar10.zzb()).a();
    }

    private zzgy() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzku zzkuVar = (zzku) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzkuVar.zze());
        dVar.add(zzc, zzkuVar.zza());
        dVar.add(zzd, zzkuVar.zzd());
        dVar.add(zze, zzkuVar.zzb());
        dVar.add(zzf, zzkuVar.zzc());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) null);
        dVar.add(zzj, (Object) null);
        dVar.add(zzk, (Object) null);
    }
}