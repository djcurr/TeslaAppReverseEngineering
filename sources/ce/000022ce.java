package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzgd extends zzjz implements zzlh {
    private static final zzgd zza;
    private zzkf zze = zzjz.zzbw();
    private zzkf zzf = zzjz.zzbw();
    private zzkg zzg = zzjz.zzby();
    private zzkg zzh = zzjz.zzby();

    static {
        zzgd zzgdVar = new zzgd();
        zza = zzgdVar;
        zzjz.zzbE(zzgd.class, zzgdVar);
    }

    private zzgd() {
    }

    public static zzgc zzf() {
        return (zzgc) zza.zzbs();
    }

    public static zzgd zzh() {
        return zza;
    }

    public static /* synthetic */ void zzo(zzgd zzgdVar, Iterable iterable) {
        zzkf zzkfVar = zzgdVar.zze;
        if (!zzkfVar.zzc()) {
            zzgdVar.zze = zzjz.zzbx(zzkfVar);
        }
        zzih.zzbo(iterable, zzgdVar.zze);
    }

    public static /* synthetic */ void zzq(zzgd zzgdVar, Iterable iterable) {
        zzkf zzkfVar = zzgdVar.zzf;
        if (!zzkfVar.zzc()) {
            zzgdVar.zzf = zzjz.zzbx(zzkfVar);
        }
        zzih.zzbo(iterable, zzgdVar.zzf);
    }

    public static /* synthetic */ void zzs(zzgd zzgdVar, Iterable iterable) {
        zzgdVar.zzw();
        zzih.zzbo(iterable, zzgdVar.zzg);
    }

    public static /* synthetic */ void zzt(zzgd zzgdVar, int i11) {
        zzgdVar.zzw();
        zzgdVar.zzg.remove(i11);
    }

    public static /* synthetic */ void zzu(zzgd zzgdVar, Iterable iterable) {
        zzgdVar.zzx();
        zzih.zzbo(iterable, zzgdVar.zzh);
    }

    public static /* synthetic */ void zzv(zzgd zzgdVar, int i11) {
        zzgdVar.zzx();
        zzgdVar.zzh.remove(i11);
    }

    private final void zzw() {
        zzkg zzkgVar = this.zzg;
        if (zzkgVar.zzc()) {
            return;
        }
        this.zzg = zzjz.zzbz(zzkgVar);
    }

    private final void zzx() {
        zzkg zzkgVar = this.zzh;
        if (zzkgVar.zzc()) {
            return;
        }
        this.zzh = zzjz.zzbz(zzkgVar);
    }

    public final int zza() {
        return this.zzg.size();
    }

    public final int zzb() {
        return this.zzf.size();
    }

    public final int zzc() {
        return this.zzh.size();
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzfm zze(int i11) {
        return (zzfm) this.zzg.get(i11);
    }

    public final zzgf zzi(int i11) {
        return (zzgf) this.zzh.get(i11);
    }

    public final List zzj() {
        return this.zzg;
    }

    public final List zzk() {
        return this.zzf;
    }

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
                    return new zzgc(null);
                }
                return new zzgd();
            }
            return zzjz.zzbD(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zze", "zzf", "zzg", zzfm.class, "zzh", zzgf.class});
        }
        return (byte) 1;
    }

    public final List zzm() {
        return this.zzh;
    }

    public final List zzn() {
        return this.zze;
    }
}