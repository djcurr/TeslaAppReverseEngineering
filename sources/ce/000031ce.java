package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
public final class zzabg extends zzaey implements zzagh {
    private static final zzabg zzb;
    private zzafg zzd = zzaey.zzB();
    private zzafg zze = zzaey.zzB();

    static {
        zzabg zzabgVar = new zzabg();
        zzb = zzabgVar;
        zzaey.zzI(zzabg.class, zzabgVar);
    }

    private zzabg() {
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
                    return new zzabf(null);
                }
                return new zzabg();
            }
            return zzaey.zzF(zzb, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"zzd", "zze", zzxh.class});
        }
        return (byte) 1;
    }
}