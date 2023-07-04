package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zznr extends zzaey implements zzagh {
    private static final zznr zzb;
    private int zzd;
    private zzafg zze = zzaey.zzB();
    private int zzf;

    static {
        zznr zznrVar = new zznr();
        zzb = zznrVar;
        zzaey.zzI(zznr.class, zznrVar);
    }

    private zznr() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zznq(null);
                }
                return new zznr();
            }
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zzd", "zze", zznm.class, "zzf"});
        }
        return (byte) 1;
    }
}