package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzeh extends zzjz implements zzlh {
    private static final zzeh zza;
    private int zze;
    private int zzf;
    private zzkg zzg = zzjz.zzby();
    private zzkg zzh = zzjz.zzby();
    private boolean zzi;
    private boolean zzj;

    static {
        zzeh zzehVar = new zzeh();
        zza = zzehVar;
        zzjz.zzbE(zzeh.class, zzehVar);
    }

    private zzeh() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzeh zzehVar, int i11, zzes zzesVar) {
        zzesVar.getClass();
        zzkg zzkgVar = zzehVar.zzg;
        if (!zzkgVar.zzc()) {
            zzehVar.zzg = zzjz.zzbz(zzkgVar);
        }
        zzehVar.zzg.set(i11, zzesVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzj(zzeh zzehVar, int i11, zzej zzejVar) {
        zzejVar.getClass();
        zzkg zzkgVar = zzehVar.zzh;
        if (!zzkgVar.zzc()) {
            zzehVar.zzh = zzjz.zzbz(zzkgVar);
        }
        zzehVar.zzh.set(i11, zzejVar);
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzb() {
        return this.zzh.size();
    }

    public final int zzc() {
        return this.zzg.size();
    }

    public final zzej zze(int i11) {
        return (zzej) this.zzh.get(i11);
    }

    public final zzes zzf(int i11) {
        return (zzes) this.zzg.get(i11);
    }

    public final List zzg() {
        return this.zzh;
    }

    public final List zzh() {
        return this.zzg;
    }

    public final boolean zzk() {
        return (this.zze & 1) != 0;
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
                    return new zzeg(null);
                }
                return new zzeh();
            }
            return zzjz.zzbD(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zze", "zzf", "zzg", zzes.class, "zzh", zzej.class, "zzi", "zzj"});
        }
        return (byte) 1;
    }
}