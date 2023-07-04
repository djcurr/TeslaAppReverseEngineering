package com.google.android.gms.internal.mlkit_vision_barcode;

import expo.modules.interfaces.permissions.PermissionsResponse;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zziz implements c {
    static final zziz zza = new zziz();
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
    private static final b zzl;
    private static final b zzm;

    static {
        b.C0705b a11 = b.a("deviceInfo");
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(1);
        zzb = a11.b(zzdfVar.zzb()).a();
        b.C0705b a12 = b.a("nnapiInfo");
        zzdf zzdfVar2 = new zzdf();
        zzdfVar2.zza(2);
        zzc = a12.b(zzdfVar2.zzb()).a();
        b.C0705b a13 = b.a("gpuInfo");
        zzdf zzdfVar3 = new zzdf();
        zzdfVar3.zza(3);
        zzd = a13.b(zzdfVar3.zzb()).a();
        b.C0705b a14 = b.a("pipelineIdentifier");
        zzdf zzdfVar4 = new zzdf();
        zzdfVar4.zza(4);
        zze = a14.b(zzdfVar4.zzb()).a();
        b.C0705b a15 = b.a("acceptedConfigurations");
        zzdf zzdfVar5 = new zzdf();
        zzdfVar5.zza(5);
        zzf = a15.b(zzdfVar5.zzb()).a();
        b.C0705b a16 = b.a("action");
        zzdf zzdfVar6 = new zzdf();
        zzdfVar6.zza(6);
        zzg = a16.b(zzdfVar6.zzb()).a();
        b.C0705b a17 = b.a(PermissionsResponse.STATUS_KEY);
        zzdf zzdfVar7 = new zzdf();
        zzdfVar7.zza(7);
        zzh = a17.b(zzdfVar7.zzb()).a();
        b.C0705b a18 = b.a("customErrors");
        zzdf zzdfVar8 = new zzdf();
        zzdfVar8.zza(8);
        zzi = a18.b(zzdfVar8.zzb()).a();
        b.C0705b a19 = b.a("benchmarkStatus");
        zzdf zzdfVar9 = new zzdf();
        zzdfVar9.zza(9);
        zzj = a19.b(zzdfVar9.zzb()).a();
        b.C0705b a21 = b.a("validationTestResult");
        zzdf zzdfVar10 = new zzdf();
        zzdfVar10.zza(10);
        zzk = a21.b(zzdfVar10.zzb()).a();
        b.C0705b a22 = b.a("timestampUs");
        zzdf zzdfVar11 = new zzdf();
        zzdfVar11.zza(11);
        zzl = a22.b(zzdfVar11.zzb()).a();
        b.C0705b a23 = b.a("elapsedUs");
        zzdf zzdfVar12 = new zzdf();
        zzdfVar12.zza(12);
        zzm = a23.b(zzdfVar12.zzb()).a();
    }

    private zziz() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzns zznsVar = (zzns) obj;
        d dVar = (d) obj2;
        throw null;
    }
}