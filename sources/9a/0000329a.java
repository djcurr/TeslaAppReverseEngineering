package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzay extends zzaey implements zzagh {
    private static final zzafe zzb = new zzav();
    private static final zzay zzd;
    private int zze;
    private int zzf;
    private long zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private zzafd zzk = zzaey.zzz();
    private int zzl;

    static {
        zzay zzayVar = new zzay();
        zzd = zzayVar;
        zzaey.zzI(zzay.class, zzayVar);
    }

    private zzay() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 == 2) {
                zzafc zzafcVar = zzax.zza;
                return zzaey.zzF(zzd, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006\u001e\u0007ဌ\u0005", new Object[]{"zze", "zzf", zzao.zza, "zzg", "zzh", "zzi", "zzj", "zzk", zzafcVar, "zzl", zzafcVar});
            } else if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 != 5) {
                        return null;
                    }
                    return zzd;
                }
                return new zzaw(null);
            } else {
                return new zzay();
            }
        }
        return (byte) 1;
    }
}