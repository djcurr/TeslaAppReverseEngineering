package com.google.android.gms.internal.mlkit_vision_common;

import com.stripe.android.model.parsers.AccountRangeJsonParser;
import ezvcard.property.Kind;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzdl implements c {
    static final zzdl zza = new zzdl();
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
        zzae zzaeVar = new zzae();
        zzaeVar.zza(1);
        zzb = a11.b(zzaeVar.zzb()).a();
        b.C0705b a12 = b.a("osBuild");
        zzae zzaeVar2 = new zzae();
        zzaeVar2.zza(2);
        zzc = a12.b(zzaeVar2.zzb()).a();
        b.C0705b a13 = b.a(AccountRangeJsonParser.FIELD_BRAND);
        zzae zzaeVar3 = new zzae();
        zzaeVar3.zza(3);
        zzd = a13.b(zzaeVar3.zzb()).a();
        b.C0705b a14 = b.a(Kind.DEVICE);
        zzae zzaeVar4 = new zzae();
        zzaeVar4.zza(4);
        zze = a14.b(zzaeVar4.zzb()).a();
        b.C0705b a15 = b.a("hardware");
        zzae zzaeVar5 = new zzae();
        zzaeVar5.zza(5);
        zzf = a15.b(zzaeVar5.zzb()).a();
        b.C0705b a16 = b.a("manufacturer");
        zzae zzaeVar6 = new zzae();
        zzaeVar6.zza(6);
        zzg = a16.b(zzaeVar6.zzb()).a();
        b.C0705b a17 = b.a("model");
        zzae zzaeVar7 = new zzae();
        zzaeVar7.zza(7);
        zzh = a17.b(zzaeVar7.zzb()).a();
        b.C0705b a18 = b.a("product");
        zzae zzaeVar8 = new zzae();
        zzaeVar8.zza(8);
        zzi = a18.b(zzaeVar8.zzb()).a();
        b.C0705b a19 = b.a("soc");
        zzae zzaeVar9 = new zzae();
        zzaeVar9.zza(9);
        zzj = a19.b(zzaeVar9.zzb()).a();
        b.C0705b a21 = b.a("socMetaBuildId");
        zzae zzaeVar10 = new zzae();
        zzaeVar10.zza(10);
        zzk = a21.b(zzaeVar10.zzb()).a();
    }

    private zzdl() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzjx zzjxVar = (zzjx) obj;
        d dVar = (d) obj2;
        throw null;
    }
}