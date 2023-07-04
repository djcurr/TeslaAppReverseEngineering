package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzgb extends zzjz implements zzlh {
    private static final zzgb zza;
    private int zze;
    private int zzf = 1;
    private zzkg zzg = zzjz.zzby();

    static {
        zzgb zzgbVar = new zzgb();
        zza = zzgbVar;
        zzjz.zzbE(zzgb.class, zzgbVar);
    }

    private zzgb() {
    }

    public static zzfz zza() {
        return (zzfz) zza.zzbs();
    }

    public static /* synthetic */ void zzc(zzgb zzgbVar, zzfq zzfqVar) {
        zzfqVar.getClass();
        zzkg zzkgVar = zzgbVar.zzg;
        if (!zzkgVar.zzc()) {
            zzgbVar.zzg = zzjz.zzbz(zzkgVar);
        }
        zzgbVar.zzg.add(zzfqVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzjz
    public final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzfz(null);
                }
                return new zzgb();
            }
            return zzjz.zzbD(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zze", "zzf", zzga.zza, "zzg", zzfq.class});
        }
        return (byte) 1;
    }
}