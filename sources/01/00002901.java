package com.google.android.gms.internal.mlkit_vision_face;

import com.stripe.android.model.parsers.AccountRangeJsonParser;
import ezvcard.property.Kind;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzgb implements c {
    static final zzgb zza = new zzgb();
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
        b.C0705b a11 = b.a("sdkVersion");
        zzcq zzcqVar = new zzcq();
        zzcqVar.zza(1);
        zzb = a11.b(zzcqVar.zzb()).a();
        b.C0705b a12 = b.a("osBuild");
        zzcq zzcqVar2 = new zzcq();
        zzcqVar2.zza(2);
        zzc = a12.b(zzcqVar2.zzb()).a();
        b.C0705b a13 = b.a(AccountRangeJsonParser.FIELD_BRAND);
        zzcq zzcqVar3 = new zzcq();
        zzcqVar3.zza(3);
        zzd = a13.b(zzcqVar3.zzb()).a();
        b.C0705b a14 = b.a(Kind.DEVICE);
        zzcq zzcqVar4 = new zzcq();
        zzcqVar4.zza(4);
        zze = a14.b(zzcqVar4.zzb()).a();
        b.C0705b a15 = b.a("hardware");
        zzcq zzcqVar5 = new zzcq();
        zzcqVar5.zza(5);
        zzf = a15.b(zzcqVar5.zzb()).a();
        b.C0705b a16 = b.a("manufacturer");
        zzcq zzcqVar6 = new zzcq();
        zzcqVar6.zza(6);
        zzg = a16.b(zzcqVar6.zzb()).a();
        b.C0705b a17 = b.a("model");
        zzcq zzcqVar7 = new zzcq();
        zzcqVar7.zza(7);
        zzh = a17.b(zzcqVar7.zzb()).a();
        b.C0705b a18 = b.a("product");
        zzcq zzcqVar8 = new zzcq();
        zzcqVar8.zza(8);
        zzi = a18.b(zzcqVar8.zzb()).a();
        b.C0705b a19 = b.a("soc");
        zzcq zzcqVar9 = new zzcq();
        zzcqVar9.zza(9);
        zzj = a19.b(zzcqVar9.zzb()).a();
        b.C0705b a21 = b.a("socMetaBuildId");
        zzcq zzcqVar10 = new zzcq();
        zzcqVar10.zza(10);
        zzk = a21.b(zzcqVar10.zzb()).a();
    }

    private zzgb() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzna zznaVar = (zzna) obj;
        d dVar = (d) obj2;
        throw null;
    }
}