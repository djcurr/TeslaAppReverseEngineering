package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzaac extends zzaey implements zzagh {
    private static final zzaac zzb;
    private int zzd;
    private zzym zze;
    private int zzf;
    private int zzg;
    private zzaau zzh;

    static {
        zzaac zzaacVar = new zzaac();
        zzb = zzaacVar;
        zzaey.zzI(zzaac.class, zzaacVar);
    }

    private zzaac() {
    }

    public static zzaaa zza() {
        return (zzaaa) zzb.zzw();
    }

    public static /* synthetic */ void zzd(zzaac zzaacVar, int i11) {
        zzaacVar.zzd |= 4;
        zzaacVar.zzg = i11;
    }

    public static /* synthetic */ void zze(zzaac zzaacVar, zzaau zzaauVar) {
        zzaauVar.getClass();
        zzaacVar.zzh = zzaauVar;
        zzaacVar.zzd |= 8;
    }

    public static /* synthetic */ void zzf(zzaac zzaacVar, int i11) {
        zzaacVar.zzf = i11 - 1;
        zzaacVar.zzd |= 2;
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
                    return new zzaaa(null);
                }
                return new zzaac();
            }
            return zzaey.zzF(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", zzaab.zza, "zzg", "zzh"});
        }
        return (byte) 1;
    }
}