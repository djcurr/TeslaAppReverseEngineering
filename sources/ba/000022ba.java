package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
public final class zzfk extends zzjz implements zzlh {
    private static final zzfk zza;
    private int zze;
    private int zzf;
    private zzgd zzg;
    private zzgd zzh;
    private boolean zzi;

    static {
        zzfk zzfkVar = new zzfk();
        zza = zzfkVar;
        zzjz.zzbE(zzfk.class, zzfkVar);
    }

    private zzfk() {
    }

    public static zzfj zzb() {
        return (zzfj) zza.zzbs();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzf(zzfk zzfkVar, int i11) {
        zzfkVar.zze |= 1;
        zzfkVar.zzf = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzg(zzfk zzfkVar, zzgd zzgdVar) {
        zzgdVar.getClass();
        zzfkVar.zzg = zzgdVar;
        zzfkVar.zze |= 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzh(zzfk zzfkVar, zzgd zzgdVar) {
        zzfkVar.zzh = zzgdVar;
        zzfkVar.zze |= 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzi(zzfk zzfkVar, boolean z11) {
        zzfkVar.zze |= 8;
        zzfkVar.zzi = z11;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgd zzd() {
        zzgd zzgdVar = this.zzg;
        return zzgdVar == null ? zzgd.zzh() : zzgdVar;
    }

    public final zzgd zze() {
        zzgd zzgdVar = this.zzh;
        return zzgdVar == null ? zzgd.zzh() : zzgdVar;
    }

    public final boolean zzj() {
        return this.zzi;
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
                    return new zzfj(null);
                }
                return new zzfk();
            }
            return zzjz.zzbD(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }

    public final boolean zzm() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzn() {
        return (this.zze & 4) != 0;
    }
}