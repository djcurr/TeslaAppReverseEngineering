package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzyw extends zzaey implements zzagh {
    private static final zzyw zzb;
    private int zzd;
    private zzpw zzf;
    private byte zzk = 2;
    private String zze = "";
    private String zzg = "";
    private zzafg zzh = zzaey.zzB();
    private String zzi = "";
    private String zzj = "";

    static {
        zzyw zzywVar = new zzyw();
        zzb = zzywVar;
        zzaey.zzI(zzyw.class, zzywVar);
    }

    private zzyw() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    public final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            this.zzk = obj == null ? (byte) 0 : (byte) 1;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzyv(null);
                }
                return new zzyw();
            }
            return zzaey.zzF(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004\u001a\u0005ဈ\u0003\u0006ဈ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}