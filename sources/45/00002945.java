package com.google.android.gms.internal.mlkit_vision_face;

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
    private static final b zzn;
    private static final b zzo;

    static {
        b.C0705b a11 = b.a("appId");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a11.b(zzcqVar.zzb()).a();
        b.C0705b a12 = b.a("appVersion");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a12.b(zzcqVar2.zzb()).a();
        b.C0705b a13 = b.a("firebaseProjectId");
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = a13.b(zzcqVar3.zzb()).a();
        b.C0705b a14 = b.a("mlSdkVersion");
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = a14.b(zzcqVar4.zzb()).a();
        b.C0705b a15 = b.a("tfliteSchemaVersion");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = a15.b(zzcqVar5.zzb()).a();
        b.C0705b a16 = b.a("gcmSenderId");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = a16.b(zzcqVar6.zzb()).a();
        b.C0705b a17 = b.a("apiKey");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = a17.b(zzcqVar7.zzb()).a();
        b.C0705b a18 = b.a("languages");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = a18.b(zzcqVar8.zzb()).a();
        b.C0705b a19 = b.a("mlSdkInstanceId");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        zzj = a19.b(zzcqVar9.zzb()).a();
        b.C0705b a21 = b.a("isClearcutClient");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        zzk = a21.b(zzcqVar10.zzb()).a();
        b.C0705b a22 = b.a("isStandaloneMlkit");
        zzcq zzcqVar11 = new zzcq();
        zzcqVar11.zza(11);
        zzl = a22.b(zzcqVar11.zzb()).a();
        b.C0705b a23 = b.a("isJsonLogging");
        zzcq zzcqVar12 = new zzcq();
        zzcqVar12.zza(12);
        zzm = a23.b(zzcqVar12.zzb()).a();
        b.C0705b a24 = b.a("buildLevel");
        zzcq zzcqVar13 = new zzcq();
        zzcqVar13.zza(13);
        zzn = a24.b(zzcqVar13.zzb()).a();
        b.C0705b a25 = b.a("optionalModuleVersion");
        zzcq zzcqVar14 = new zzcq();
        zzcqVar14.zza(14);
        zzo = a25.b(zzcqVar14.zzb()).a();
    }

    private zzip() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzmv zzmvVar = (zzmv) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzmvVar.zzg());
        dVar.add(zzc, zzmvVar.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, zzmvVar.zzj());
        dVar.add(zzf, zzmvVar.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, zzmvVar.zza());
        dVar.add(zzj, zzmvVar.zzi());
        dVar.add(zzk, zzmvVar.zzb());
        dVar.add(zzl, zzmvVar.zzd());
        dVar.add(zzm, zzmvVar.zzc());
        dVar.add(zzn, zzmvVar.zze());
        dVar.add(zzo, zzmvVar.zzf());
    }
}