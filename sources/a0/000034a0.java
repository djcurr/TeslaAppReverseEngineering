package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zztq extends zzaey implements zzagh {
    private static final zzafe zzb = new zztl();
    private static final zzafe zzd = new zztm();
    private static final zztq zze;
    private int zzf;
    private long zzh;
    private zzafg zzg = zzaey.zzB();
    private zzafd zzi = zzaey.zzz();
    private zzafd zzj = zzaey.zzz();

    static {
        zztq zztqVar = new zztq();
        zze = zztqVar;
        zzaey.zzI(zztq.class, zztqVar);
    }

    private zztq() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 == 2) {
                zzafc zzafcVar = zzol.zza;
                return zzaey.zzF(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002ဂ\u0000\u0003,\u0004,", new Object[]{"zzf", "zzg", zztp.class, "zzh", "zzi", zzafcVar, "zzj", zzafcVar});
            } else if (i12 != 3) {
                if (i12 != 4) {
                    if (i12 != 5) {
                        return null;
                    }
                    return zze;
                }
                return new zztn(null);
            } else {
                return new zztq();
            }
        }
        return (byte) 1;
    }
}