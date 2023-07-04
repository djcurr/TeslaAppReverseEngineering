package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzfe extends zzjz implements zzlh {
    private static final zzfe zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzfe zzfeVar = new zzfe();
        zza = zzfeVar;
        zzjz.zzbE(zzfe.class, zzfeVar);
    }

    private zzfe() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    /* JADX INFO: Access modifiers changed from: protected */
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
                    return new zzfd(null);
                }
                return new zzfe();
            }
            return zzjz.zzbD(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}