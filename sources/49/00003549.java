package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzzx extends zzaey implements zzagh {
    private static final zzzx zzb;
    private int zzd;
    private zzpw zze;
    private byte zzf = 2;

    static {
        zzzx zzzxVar = new zzzx();
        zzb = zzzxVar;
        zzaey.zzI(zzzx.class, zzzxVar);
    }

    private zzzx() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            this.zzf = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzzw(null);
                }
                return new zzzx();
            }
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"zzd", "zze"});
        }
        return Byte.valueOf(this.zzf);
    }
}