package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzgm extends zzjz implements zzlh {
    private static final zzgm zza;
    private int zze;
    private String zzf = "";
    private zzkg zzg = zzjz.zzby();

    static {
        zzgm zzgmVar = new zzgm();
        zza = zzgmVar;
        zzjz.zzbE(zzgm.class, zzgmVar);
    }

    private zzgm() {
    }

    public final String zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzg;
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
                    return new zzgl(null);
                }
                return new zzgm();
            }
            return zzjz.zzbD(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zze", "zzf", "zzg", zzgt.class});
        }
        return (byte) 1;
    }
}