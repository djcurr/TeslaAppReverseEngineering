package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzfq extends zzjz implements zzlh {
    private static final zzfq zza;
    private int zze;
    private String zzf = "";
    private long zzg;

    static {
        zzfq zzfqVar = new zzfq();
        zza = zzfqVar;
        zzjz.zzbE(zzfq.class, zzfqVar);
    }

    private zzfq() {
    }

    public static zzfp zza() {
        return (zzfp) zza.zzbs();
    }

    public static /* synthetic */ void zzc(zzfq zzfqVar, String str) {
        str.getClass();
        zzfqVar.zze |= 1;
        zzfqVar.zzf = str;
    }

    public static /* synthetic */ void zzd(zzfq zzfqVar, long j11) {
        zzfqVar.zze |= 2;
        zzfqVar.zzg = j11;
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
                    return new zzfp(null);
                }
                return new zzfq();
            }
            return zzjz.zzbD(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}