package com.google.android.gms.internal.mlkit_common;

import com.stripe.android.model.parsers.AccountRangeJsonParser;
import ezvcard.property.Kind;
import lm.b;
import lm.c;
import lm.d;

/* loaded from: classes3.dex */
final class zzeo implements c {
    static final zzeo zza = new zzeo();
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
        zzbh zzbhVar = new zzbh();
        zzbhVar.zza(1);
        zzb = a11.b(zzbhVar.zzb()).a();
        b.C0705b a12 = b.a("osBuild");
        zzbh zzbhVar2 = new zzbh();
        zzbhVar2.zza(2);
        zzc = a12.b(zzbhVar2.zzb()).a();
        b.C0705b a13 = b.a(AccountRangeJsonParser.FIELD_BRAND);
        zzbh zzbhVar3 = new zzbh();
        zzbhVar3.zza(3);
        zzd = a13.b(zzbhVar3.zzb()).a();
        b.C0705b a14 = b.a(Kind.DEVICE);
        zzbh zzbhVar4 = new zzbh();
        zzbhVar4.zza(4);
        zze = a14.b(zzbhVar4.zzb()).a();
        b.C0705b a15 = b.a("hardware");
        zzbh zzbhVar5 = new zzbh();
        zzbhVar5.zza(5);
        zzf = a15.b(zzbhVar5.zzb()).a();
        b.C0705b a16 = b.a("manufacturer");
        zzbh zzbhVar6 = new zzbh();
        zzbhVar6.zza(6);
        zzg = a16.b(zzbhVar6.zzb()).a();
        b.C0705b a17 = b.a("model");
        zzbh zzbhVar7 = new zzbh();
        zzbhVar7.zza(7);
        zzh = a17.b(zzbhVar7.zzb()).a();
        b.C0705b a18 = b.a("product");
        zzbh zzbhVar8 = new zzbh();
        zzbhVar8.zza(8);
        zzi = a18.b(zzbhVar8.zzb()).a();
        b.C0705b a19 = b.a("soc");
        zzbh zzbhVar9 = new zzbh();
        zzbhVar9.zza(9);
        zzj = a19.b(zzbhVar9.zzb()).a();
        b.C0705b a21 = b.a("socMetaBuildId");
        zzbh zzbhVar10 = new zzbh();
        zzbhVar10.zza(10);
        zzk = a21.b(zzbhVar10.zzb()).a();
    }

    private zzeo() {
    }

    @Override // lm.c
    public final /* bridge */ /* synthetic */ void encode(Object obj, Object obj2) {
        zzll zzllVar = (zzll) obj;
        d dVar = (d) obj2;
        throw null;
    }
}