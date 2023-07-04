package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzxq extends zzaey implements zzagh {
    private static final zzxq zzb;
    private int zzd;
    private int zze;

    static {
        zzxq zzxqVar = new zzxq();
        zzb = zzxqVar;
        zzaey.zzI(zzxq.class, zzxqVar);
    }

    private zzxq() {
    }

    public static zzxp zza() {
        return (zzxp) zzb.zzw();
    }

    public static /* synthetic */ void zzd(zzxq zzxqVar, int i11) {
        zzxqVar.zzd |= 1;
        zzxqVar.zze = i11;
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
                    return new zzxp(null);
                }
                return new zzxq();
            }
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}