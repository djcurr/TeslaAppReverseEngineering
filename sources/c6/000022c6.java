package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzfw extends zzjz implements zzlh {
    private static final zzfw zza;
    private zzkg zze = zzjz.zzby();

    static {
        zzfw zzfwVar = new zzfw();
        zza = zzfwVar;
        zzjz.zzbE(zzfw.class, zzfwVar);
    }

    private zzfw() {
    }

    public static zzfv zza() {
        return (zzfv) zza.zzbs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zze(zzfw zzfwVar, zzfy zzfyVar) {
        zzfyVar.getClass();
        zzkg zzkgVar = zzfwVar.zze;
        if (!zzkgVar.zzc()) {
            zzfwVar.zze = zzjz.zzbz(zzkgVar);
        }
        zzfwVar.zze.add(zzfyVar);
    }

    public final zzfy zzc(int i11) {
        return (zzfy) this.zze.get(0);
    }

    public final List zzd() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.measurement.zzjz
    public final Object zzl(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 != 0) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            return null;
                        }
                        return zza;
                    }
                    return new zzfv(null);
                }
                return new zzfw();
            }
            return zzjz.zzbD(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzfy.class});
        }
        return (byte) 1;
    }
}