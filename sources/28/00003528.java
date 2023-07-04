package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzyr extends zzaey implements zzagh {
    private static final zzyr zzb;
    private int zzd;
    private zzym zzg;
    private zzpy zzh;
    private int zzk;
    private int zzl;
    private int zzn;
    private byte zzo = 2;
    private String zze = "";
    private String zzf = "";
    private int zzi = 1;
    private String zzj = "";
    private String zzm = "";

    static {
        zzyr zzyrVar = new zzyr();
        zzb = zzyrVar;
        zzaey.zzI(zzyr.class, zzyrVar);
    }

    private zzyr() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            this.zzo = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzyn(null);
                }
                return new zzyr();
            }
            return zzaey.zzF(zzb, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဌ\u0006\bင\u0007\tဈ\b\nဌ\t", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", zzyo.zza, "zzj", "zzk", zzyq.zza, "zzl", "zzm", "zzn", zzyp.zza});
        }
        return Byte.valueOf(this.zzo);
    }
}