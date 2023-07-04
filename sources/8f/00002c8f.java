package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
abstract class zzio<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b11, int i11, long j11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(B b11, int i11, zzeo zzeoVar);

    abstract void zza(B b11, int i11, T t11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zza(T t11, zzjj zzjjVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean zza(zzhv zzhvVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(B b11, zzhv zzhvVar) {
        int tag = zzhvVar.getTag();
        int i11 = tag >>> 3;
        int i12 = tag & 7;
        if (i12 == 0) {
            zza((zzio<T, B>) b11, i11, zzhvVar.zzcq());
            return true;
        } else if (i12 == 1) {
            zzb(b11, i11, zzhvVar.zzcs());
            return true;
        } else if (i12 == 2) {
            zza((zzio<T, B>) b11, i11, zzhvVar.zzcw());
            return true;
        } else if (i12 != 3) {
            if (i12 != 4) {
                if (i12 == 5) {
                    zzc(b11, i11, zzhvVar.zzct());
                    return true;
                }
                throw zzgf.zzfm();
            }
            return false;
        } else {
            B zzhd = zzhd();
            int i13 = 4 | (i11 << 3);
            while (zzhvVar.zzcn() != Integer.MAX_VALUE && zza((zzio<T, B>) zzhd, zzhvVar)) {
            }
            if (i13 == zzhvVar.getTag()) {
                zza((zzio<T, B>) b11, i11, (int) zzm(zzhd));
                return true;
            }
            throw zzgf.zzfl();
        }
    }

    abstract void zzb(B b11, int i11, long j11);

    abstract void zzc(B b11, int i11, int i12);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzc(T t11, zzjj zzjjVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zze(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zze(Object obj, T t11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzf(Object obj, B b11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzg(T t11, T t12);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzhd();

    abstract T zzm(B b11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzp(T t11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T zzt(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B zzu(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int zzv(T t11);
}