package com.google.android.gms.internal.mlkit_vision_common;

import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzfz implements c {
    static final zzfz zza = new zzfz();
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
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a11.b(zzaeVar.zzb()).a();
        b.C0705b a12 = b.a("appVersion");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a12.b(zzaeVar2.zzb()).a();
        b.C0705b a13 = b.a("firebaseProjectId");
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a13.b(zzaeVar3.zzb()).a();
        b.C0705b a14 = b.a("mlSdkVersion");
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = a14.b(zzaeVar4.zzb()).a();
        b.C0705b a15 = b.a("tfliteSchemaVersion");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = a15.b(zzaeVar5.zzb()).a();
        b.C0705b a16 = b.a("gcmSenderId");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = a16.b(zzaeVar6.zzb()).a();
        b.C0705b a17 = b.a("apiKey");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = a17.b(zzaeVar7.zzb()).a();
        b.C0705b a18 = b.a("languages");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        zzi = a18.b(zzaeVar8.zzb()).a();
        b.C0705b a19 = b.a("mlSdkInstanceId");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        zzj = a19.b(zzaeVar9.zzb()).a();
        b.C0705b a21 = b.a("isClearcutClient");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        zzk = a21.b(zzaeVar10.zzb()).a();
        b.C0705b a22 = b.a("isStandaloneMlkit");
        zzae zzaeVar11 = new zzae();
        zzaeVar11.zza(11);
        zzl = a22.b(zzaeVar11.zzb()).a();
        b.C0705b a23 = b.a("isJsonLogging");
        zzae zzaeVar12 = new zzae();
        zzaeVar12.zza(12);
        zzm = a23.b(zzaeVar12.zzb()).a();
        b.C0705b a24 = b.a("buildLevel");
        zzae zzaeVar13 = new zzae();
        zzaeVar13.zza(13);
        zzn = a24.b(zzaeVar13.zzb()).a();
        b.C0705b a25 = b.a("optionalModuleVersion");
        zzae zzaeVar14 = new zzae();
        zzaeVar14.zza(14);
        zzo = a25.b(zzaeVar14.zzb()).a();
    }

    private zzfz() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjr zzjrVar = (zzjr) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzjrVar.zzg());
        dVar.add(zzc, zzjrVar.zzh());
        dVar.add(zzd, (Object) null);
        dVar.add(zze, zzjrVar.zzj());
        dVar.add(zzf, zzjrVar.zzk());
        dVar.add(zzg, (Object) null);
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, zzjrVar.zza());
        dVar.add(zzj, zzjrVar.zzi());
        dVar.add(zzk, zzjrVar.zzb());
        dVar.add(zzl, zzjrVar.zzd());
        dVar.add(zzm, zzjrVar.zzc());
        dVar.add(zzn, zzjrVar.zze());
        dVar.add(zzo, zzjrVar.zzf());
    }
}