package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzyy extends zzaey implements zzagh {
    private static final zzyy zzb;
    private int zzd;
    private zzpy zzf;
    private zzym zzg;
    private byte zzh = 2;
    private String zze = "";

    static {
        zzyy zzyyVar = new zzyy();
        zzb = zzyyVar;
        zzaey.zzI(zzyy.class, zzyyVar);
    }

    private zzyy() {
    }

    public static zzyx zza() {
        return (zzyx) zzb.zzw();
    }

    public static /* synthetic */ void zzd(zzyy zzyyVar, zzym zzymVar) {
        zzyyVar.zzg = zzymVar;
        zzyyVar.zzd |= 4;
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            this.zzh = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzyx(null);
                }
                return new zzyy();
            }
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return Byte.valueOf(this.zzh);
    }
}