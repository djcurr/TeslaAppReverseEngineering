package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzaas extends zzaey implements zzagh {
    private static final zzaas zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;

    static {
        zzaas zzaasVar = new zzaas();
        zzb = zzaasVar;
        zzaey.zzI(zzaas.class, zzaasVar);
    }

    private zzaas() {
    }

    public static zzaaq zza() {
        return (zzaaq) zzb.zzw();
    }

    public static /* synthetic */ void zzd(zzaas zzaasVar, int i11) {
        zzaasVar.zze = 1;
        zzaasVar.zzd = 1 | zzaasVar.zzd;
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
                    return new zzaaq(null);
                }
                return new zzaas();
            }
            return zzaey.zzF(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"zzd", "zze", zzaar.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}