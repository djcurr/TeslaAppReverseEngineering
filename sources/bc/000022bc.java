package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzfm extends zzjz implements zzlh {
    private static final zzfm zza;
    private int zze;
    private int zzf;
    private long zzg;

    static {
        zzfm zzfmVar = new zzfm();
        zza = zzfmVar;
        zzjz.zzbE(zzfm.class, zzfmVar);
    }

    private zzfm() {
    }

    public static zzfl zzc() {
        return (zzfl) zza.zzbs();
    }

    public static /* synthetic */ void zze(zzfm zzfmVar, int i11) {
        zzfmVar.zze |= 1;
        zzfmVar.zzf = i11;
    }

    public static /* synthetic */ void zzf(zzfm zzfmVar, long j11) {
        zzfmVar.zze |= 2;
        zzfmVar.zzg = j11;
    }

    public final int zza() {
        return this.zzf;
    }

    public final long zzb() {
        return this.zzg;
    }

    public final boolean zzg() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzh() {
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
                    return new zzfl(null);
                }
                return new zzfm();
            }
            return zzjz.zzbD(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}