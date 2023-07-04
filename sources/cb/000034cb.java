package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzvf extends zzaey implements zzagh {
    private static final zzvf zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;

    static {
        zzvf zzvfVar = new zzvf();
        zzb = zzvfVar;
        zzaey.zzI(zzvf.class, zzvfVar);
    }

    private zzvf() {
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
                    return new zzvd(null);
                }
                return new zzvf();
            }
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဂ\u0002", new Object[]{"zzd", "zze", zzve.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}