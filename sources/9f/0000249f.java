package com.google.android.gms.internal.mlkit_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzhc implements c {
    static final zzhc zza = new zzhc();
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
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(1);
        zzb = a11.b(zzbhVar.zzb()).a();
        b.C0705b a12 = b.a("appVersion");
        zzbh zzbhVar2 = new zzbh();
        zzbhVar2.zza(2);
        zzc = a12.b(zzbhVar2.zzb()).a();
        b.C0705b a13 = b.a("firebaseProjectId");
        zzbh zzbhVar3 = new zzbh();
        zzbhVar3.zza(3);
        zzd = a13.b(zzbhVar3.zzb()).a();
        b.C0705b a14 = b.a("mlSdkVersion");
        zzbh zzbhVar4 = new zzbh();
        zzbhVar4.zza(4);
        zze = a14.b(zzbhVar4.zzb()).a();
        b.C0705b a15 = b.a("tfliteSchemaVersion");
        zzbh zzbhVar5 = new zzbh();
        zzbhVar5.zza(5);
        zzf = a15.b(zzbhVar5.zzb()).a();
        b.C0705b a16 = b.a("gcmSenderId");
        zzbh zzbhVar6 = new zzbh();
        zzbhVar6.zza(6);
        zzg = a16.b(zzbhVar6.zzb()).a();
        b.C0705b a17 = b.a("apiKey");
        zzbh zzbhVar7 = new zzbh();
        zzbhVar7.zza(7);
        zzh = a17.b(zzbhVar7.zzb()).a();
        b.C0705b a18 = b.a("languages");
        zzbh zzbhVar8 = new zzbh();
        zzbhVar8.zza(8);
        zzi = a18.b(zzbhVar8.zzb()).a();
        b.C0705b a19 = b.a("mlSdkInstanceId");
        zzbh zzbhVar9 = new zzbh();
        zzbhVar9.zza(9);
        zzj = a19.b(zzbhVar9.zzb()).a();
        b.C0705b a21 = b.a("isClearcutClient");
        zzbh zzbhVar10 = new zzbh();
        zzbhVar10.zza(10);
        zzk = a21.b(zzbhVar10.zzb()).a();
        b.C0705b a22 = b.a("isStandaloneMlkit");
        zzbh zzbhVar11 = new zzbh();
        zzbhVar11.zza(11);
        zzl = a22.b(zzbhVar11.zzb()).a();
        b.C0705b a23 = b.a("isJsonLogging");
        zzbh zzbhVar12 = new zzbh();
        zzbhVar12.zza(12);
        zzm = a23.b(zzbhVar12.zzb()).a();
        b.C0705b a24 = b.a("buildLevel");
        zzbh zzbhVar13 = new zzbh();
        zzbhVar13.zza(13);
        zzn = a24.b(zzbhVar13.zzb()).a();
        b.C0705b a25 = b.a("optionalModuleVersion");
        zzbh zzbhVar14 = new zzbh();
        zzbhVar14.zza(14);
        zzo = a25.b(zzbhVar14.zzb()).a();
    }

    private zzhc() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzlg zzlgVar = (zzlg) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzlgVar.zzg());
        dVar.add(zzc, zzlgVar.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, zzlgVar.zzj());
        dVar.add(zzf, zzlgVar.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, zzlgVar.zza());
        dVar.add(zzj, zzlgVar.zzi());
        dVar.add(zzk, zzlgVar.zzb());
        dVar.add(zzl, zzlgVar.zzd());
        dVar.add(zzm, zzlgVar.zzc());
        dVar.add(zzn, zzlgVar.zze());
        dVar.add(zzo, zzlgVar.zzf());
    }
}