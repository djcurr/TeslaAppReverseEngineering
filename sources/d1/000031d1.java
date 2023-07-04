package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzabj extends zzaey implements zzagh {
    private static final zzabj zzb;
    private int zzd;
    private zzpy zze;
    private int zzf;
    private int zzg;
    private int zzi;
    private byte zzj = 2;
    private String zzh = "";

    static {
        zzabj zzabjVar = new zzabj();
        zzb = zzabjVar;
        zzaey.zzI(zzabj.class, zzabjVar);
    }

    private zzabj() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            this.zzj = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzabh(null);
                }
                return new zzabj();
            }
            return zzaey.zzF(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဌ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzabi.zza});
        }
        return Byte.valueOf(this.zzj);
    }
}