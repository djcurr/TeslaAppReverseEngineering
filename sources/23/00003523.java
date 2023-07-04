package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzym extends zzaey implements zzagh {
    private static final zzym zzb;
    private int zzd;
    private int zze;
    private boolean zzi;
    private zzafg zzf = zzaey.zzB();
    private String zzg = "";
    private String zzh = "";
    private zzafg zzj = zzaey.zzB();

    static {
        zzym zzymVar = new zzym();
        zzb = zzymVar;
        zzaey.zzI(zzym.class, zzymVar);
    }

    private zzym() {
    }

    public static zzyl zza() {
        return (zzyl) zzb.zzw();
    }

    public static /* synthetic */ void zzd(zzym zzymVar, String str) {
        zzafg zzafgVar = zzymVar.zzf;
        if (!zzafgVar.zzc()) {
            zzymVar.zzf = zzaey.zzC(zzafgVar);
        }
        zzymVar.zzf.add(str);
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
                    return new zzyl(null);
                }
                return new zzym();
            }
            return zzaey.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return (byte) 1;
    }
}