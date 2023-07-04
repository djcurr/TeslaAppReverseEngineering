package com.google.android.gms.internal.mlkit_common;

import com.stripe.android.model.Stripe3ds2AuthParams;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzff implements c {
    static final zzff zza = new zzff();
    private static final b zzb;
    private static final b zzc;
    private static final b zzd;
    private static final b zze;
    private static final b zzf;
    private static final b zzg;
    private static final b zzh;
    private static final b zzi;
    private static final b zzj;

    static {
        b.C0705b a11 = b.a("name");
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(1);
        zzb = a11.b(zzbhVar.zzb()).a();
        b.C0705b a12 = b.a("version");
        zzbh zzbhVar2 = new zzbh();
        zzbhVar2.zza(2);
        zzc = a12.b(zzbhVar2.zzb()).a();
        b.C0705b a13 = b.a(Stripe3ds2AuthParams.FIELD_SOURCE);
        zzbh zzbhVar3 = new zzbh();
        zzbhVar3.zza(3);
        zzd = a13.b(zzbhVar3.zzb()).a();
        b.C0705b a14 = b.a("uri");
        zzbh zzbhVar4 = new zzbh();
        zzbhVar4.zza(4);
        zze = a14.b(zzbhVar4.zzb()).a();
        b.C0705b a15 = b.a("hash");
        zzbh zzbhVar5 = new zzbh();
        zzbhVar5.zza(5);
        zzf = a15.b(zzbhVar5.zzb()).a();
        b.C0705b a16 = b.a("modelType");
        zzbh zzbhVar6 = new zzbh();
        zzbhVar6.zza(6);
        zzg = a16.b(zzbhVar6.zzb()).a();
        b.C0705b a17 = b.a("size");
        zzbh zzbhVar7 = new zzbh();
        zzbhVar7.zza(7);
        zzh = a17.b(zzbhVar7.zzb()).a();
        b.C0705b a18 = b.a("hasLabelMap");
        zzbh zzbhVar8 = new zzbh();
        zzbhVar8.zza(8);
        zzi = a18.b(zzbhVar8.zzb()).a();
        b.C0705b a19 = b.a("isManifestModel");
        zzbh zzbhVar9 = new zzbh();
        zzbhVar9.zza(9);
        zzj = a19.b(zzbhVar9.zzb()).a();
    }

    private zzff() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjl zzjlVar = (zzjl) obj;
        d dVar = (d) obj2;
        dVar.add(zzb, zzjlVar.zzd());
        dVar.add(zzc, (Object) null);
        dVar.add(zzd, zzjlVar.zzb());
        dVar.add(zze, (Object) null);
        dVar.add(zzf, zzjlVar.zzc());
        dVar.add(zzg, zzjlVar.zza());
        dVar.add(zzh, (Object) null);
        dVar.add(zzi, (Object) null);
        dVar.add(zzj, (Object) null);
    }
}