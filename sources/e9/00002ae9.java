package com.google.android.gms.internal.mlkit_vision_text_common;

import expo.modules.interfaces.permissions.PermissionsResponse;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzip implements c {
    static final zzip zza = new zzip();
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
        zzcv zzcvVar = new zzcv();
        zzcvVar.zza(1);
        zzb = a11.b(zzcvVar.zzb()).a();
        b.C0705b a12 = b.a("nnapiInfo");
        zzcv zzcvVar2 = new zzcv();
        zzcvVar2.zza(2);
        zzc = a12.b(zzcvVar2.zzb()).a();
        b.C0705b a13 = b.a("gpuInfo");
        zzcv zzcvVar3 = new zzcv();
        zzcvVar3.zza(3);
        zzd = a13.b(zzcvVar3.zzb()).a();
        b.C0705b a14 = b.a("pipelineIdentifier");
        zzcv zzcvVar4 = new zzcv();
        zzcvVar4.zza(4);
        zze = a14.b(zzcvVar4.zzb()).a();
        b.C0705b a15 = b.a("acceptedConfigurations");
        zzcv zzcvVar5 = new zzcv();
        zzcvVar5.zza(5);
        zzf = a15.b(zzcvVar5.zzb()).a();
        b.C0705b a16 = b.a("action");
        zzcv zzcvVar6 = new zzcv();
        zzcvVar6.zza(6);
        zzg = a16.b(zzcvVar6.zzb()).a();
        b.C0705b a17 = b.a(PermissionsResponse.STATUS_KEY);
        zzcv zzcvVar7 = new zzcv();
        zzcvVar7.zza(7);
        zzh = a17.b(zzcvVar7.zzb()).a();
        b.C0705b a18 = b.a("customErrors");
        zzcv zzcvVar8 = new zzcv();
        zzcvVar8.zza(8);
        zzi = a18.b(zzcvVar8.zzb()).a();
        b.C0705b a19 = b.a("benchmarkStatus");
        zzcv zzcvVar9 = new zzcv();
        zzcvVar9.zza(9);
        zzj = a19.b(zzcvVar9.zzb()).a();
        b.C0705b a21 = b.a("validationTestResult");
        zzcv zzcvVar10 = new zzcv();
        zzcvVar10.zza(10);
        zzk = a21.b(zzcvVar10.zzb()).a();
        b.C0705b a22 = b.a("timestampUs");
        zzcv zzcvVar11 = new zzcv();
        zzcvVar11.zza(11);
        zzl = a22.b(zzcvVar11.zzb()).a();
        b.C0705b a23 = b.a("elapsedUs");
        zzcv zzcvVar12 = new zzcv();
        zzcvVar12.zza(12);
        zzm = a23.b(zzcvVar12.zzb()).a();
    }

    private zzip() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zznl zznlVar = (zznl) obj;
        d dVar = (d) obj2;
        throw null;
    }
}