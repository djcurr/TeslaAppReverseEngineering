package com.google.android.gms.internal.mlkit_vision_barcode;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzje implements c {
    static final zzje zza = new zzje();
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
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(1);
        zzb = a11.b(zzdfVar.zzb()).a();
        b.C0705b a12 = b.a("appVersion");
        zzdf zzdfVar2 = new zzdf();
        zzdfVar2.zza(2);
        zzc = a12.b(zzdfVar2.zzb()).a();
        b.C0705b a13 = b.a("firebaseProjectId");
        zzdf zzdfVar3 = new zzdf();
        zzdfVar3.zza(3);
        zzd = a13.b(zzdfVar3.zzb()).a();
        b.C0705b a14 = b.a("mlSdkVersion");
        zzdf zzdfVar4 = new zzdf();
        zzdfVar4.zza(4);
        zze = a14.b(zzdfVar4.zzb()).a();
        b.C0705b a15 = b.a("tfliteSchemaVersion");
        zzdf zzdfVar5 = new zzdf();
        zzdfVar5.zza(5);
        zzf = a15.b(zzdfVar5.zzb()).a();
        b.C0705b a16 = b.a("gcmSenderId");
        zzdf zzdfVar6 = new zzdf();
        zzdfVar6.zza(6);
        zzg = a16.b(zzdfVar6.zzb()).a();
        b.C0705b a17 = b.a("apiKey");
        zzdf zzdfVar7 = new zzdf();
        zzdfVar7.zza(7);
        zzh = a17.b(zzdfVar7.zzb()).a();
        b.C0705b a18 = b.a("languages");
        zzdf zzdfVar8 = new zzdf();
        zzdfVar8.zza(8);
        zzi = a18.b(zzdfVar8.zzb()).a();
        b.C0705b a19 = b.a("mlSdkInstanceId");
        zzdf zzdfVar9 = new zzdf();
        zzdfVar9.zza(9);
        zzj = a19.b(zzdfVar9.zzb()).a();
        b.C0705b a21 = b.a("isClearcutClient");
        zzdf zzdfVar10 = new zzdf();
        zzdfVar10.zza(10);
        zzk = a21.b(zzdfVar10.zzb()).a();
        b.C0705b a22 = b.a("isStandaloneMlkit");
        zzdf zzdfVar11 = new zzdf();
        zzdfVar11.zza(11);
        zzl = a22.b(zzdfVar11.zzb()).a();
        b.C0705b a23 = b.a("isJsonLogging");
        zzdf zzdfVar12 = new zzdf();
        zzdfVar12.zza(12);
        zzm = a23.b(zzdfVar12.zzb()).a();
        b.C0705b a24 = b.a("buildLevel");
        zzdf zzdfVar13 = new zzdf();
        zzdfVar13.zza(13);
        zzn = a24.b(zzdfVar13.zzb()).a();
        b.C0705b a25 = b.a("optionalModuleVersion");
        zzdf zzdfVar14 = new zzdf();
        zzdfVar14.zza(14);
        zzo = a25.b(zzdfVar14.zzb()).a();
    }

    private zzje() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzng zzngVar = (zzng) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzngVar.zzg());
        dVar.add(zzc, zzngVar.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, zzngVar.zzj());
        dVar.add(zzf, zzngVar.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, zzngVar.zza());
        dVar.add(zzj, zzngVar.zzi());
        dVar.add(zzk, zzngVar.zzb());
        dVar.add(zzl, zzngVar.zzd());
        dVar.add(zzm, zzngVar.zzc());
        dVar.add(zzn, zzngVar.zze());
        dVar.add(zzo, zzngVar.zzf());
    }
}