package com.google.android.gms.internal.mlkit_vision_common;

import expo.modules.interfaces.permissions.PermissionsResponse;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzfu implements c {
    static final zzfu zza = new zzfu();
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
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a11.b(zzaeVar.zzb()).a();
        b.C0705b a12 = b.a("nnapiInfo");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a12.b(zzaeVar2.zzb()).a();
        b.C0705b a13 = b.a("gpuInfo");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a13.b(zzaeVar3.zzb()).a();
        b.C0705b a14 = b.a("pipelineIdentifier");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = a14.b(zzaeVar4.zzb()).a();
        b.C0705b a15 = b.a("acceptedConfigurations");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = a15.b(zzaeVar5.zzb()).a();
        b.C0705b a16 = b.a("action");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = a16.b(zzaeVar6.zzb()).a();
        b.C0705b a17 = b.a(PermissionsResponse.STATUS_KEY);
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = a17.b(zzaeVar7.zzb()).a();
        b.C0705b a18 = b.a("customErrors");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        zzi = a18.b(zzaeVar8.zzb()).a();
        b.C0705b a19 = b.a("benchmarkStatus");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        zzj = a19.b(zzaeVar9.zzb()).a();
        b.C0705b a21 = b.a("validationTestResult");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        zzk = a21.b(zzaeVar10.zzb()).a();
        b.C0705b a22 = b.a("timestampUs");
        zzae zzaeVar11 = new zzae();
        zzaeVar11.zza(11);
        zzl = a22.b(zzaeVar11.zzb()).a();
        b.C0705b a23 = b.a("elapsedUs");
        zzae zzaeVar12 = new zzae();
        zzaeVar12.zza(12);
        zzm = a23.b(zzaeVar12.zzb()).a();
    }

    private zzfu() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzke zzkeVar = (zzke) obj;
        d dVar = (d) obj2;
        throw null;
    }
}