package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzmu extends zzaey implements zzagh {
    private static final zzmu zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private String zze = "";
    private String zzh = "";

    static {
        zzmu zzmuVar = new zzmu();
        zzb = zzmuVar;
        zzaey.zzI(zzmu.class, zzmuVar);
    }

    private zzmu() {
    }

    public static zzmp zza() {
        return (zzmp) zzb.zzw();
    }

    public static /* synthetic */ void zzd(zzmu zzmuVar, String str) {
        zzmuVar.zzd |= 1;
        zzmuVar.zze = str;
    }

    public static /* synthetic */ void zze(zzmu zzmuVar, int i11) {
        zzmuVar.zzd |= 2;
        zzmuVar.zzf = i11;
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
                    return new zzmp(null);
                }
                return new zzmu();
            }
            return zzaey.zzF(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007\tဌ\b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzmq.zza, "zzk", zzms.zza, "zzl", zzmr.zza, "zzm", zzmt.zza});
        }
        return (byte) 1;
    }
}