package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzgf extends zzjz implements zzlh {
    private static final zzgf zza;
    private int zze;
    private int zzf;
    private zzkf zzg = zzjz.zzbw();

    static {
        zzgf zzgfVar = new zzgf();
        zza = zzgfVar;
        zzjz.zzbE(zzgf.class, zzgfVar);
    }

    private zzgf() {
    }

    public static zzge zzd() {
        return (zzge) zza.zzbs();
    }

    public static /* synthetic */ void zzg(zzgf zzgfVar, int i11) {
        zzgfVar.zze |= 1;
        zzgfVar.zzf = i11;
    }

    public static /* synthetic */ void zzh(zzgf zzgfVar, Iterable iterable) {
        zzkf zzkfVar = zzgfVar.zzg;
        if (!zzkfVar.zzc()) {
            zzgfVar.zzg = zzjz.zzbx(zzkfVar);
        }
        zzih.zzbo(iterable, zzgfVar.zzg);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf;
    }

    public final long zzc(int i11) {
        return this.zzg.zza(i11);
    }

    public final List zzf() {
        return this.zzg;
    }

    public final boolean zzi() {
        return (this.zze & 1) != 0;
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
                    return new zzge(null);
                }
                return new zzgf();
            }
            return zzjz.zzbD(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}