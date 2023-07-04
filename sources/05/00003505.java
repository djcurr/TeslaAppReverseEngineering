package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzxj extends zzaey implements zzagh {
    private static final zzxj zzb;
    private int zzd;
    private int zze;

    static {
        zzxj zzxjVar = new zzxj();
        zzb = zzxjVar;
        zzaey.zzI(zzxj.class, zzxjVar);
    }

    private zzxj() {
    }

    public static zzxi zza() {
        return (zzxi) zzb.zzw();
    }

    public static /* synthetic */ void zzd(zzxj zzxjVar, int i11) {
        zzxjVar.zzd |= 1;
        zzxjVar.zze = i11;
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
                    return new zzxi(null);
                }
                return new zzxj();
            }
            return zzaey.zzF(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}