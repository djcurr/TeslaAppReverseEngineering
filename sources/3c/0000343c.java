package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzpy extends zzaey implements zzagh {
    private static final zzpy zzb;
    private int zzd;
    private zzpw zze;
    private zzpw zzf;
    private byte zzg = 2;

    static {
        zzpy zzpyVar = new zzpy();
        zzb = zzpyVar;
        zzaey.zzI(zzpy.class, zzpyVar);
    }

    private zzpy() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            this.zzg = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzpx(null);
                }
                return new zzpy();
            }
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}