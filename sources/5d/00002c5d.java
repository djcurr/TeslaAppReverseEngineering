package com.google.android.gms.internal.vision;

import java.util.List;

/* loaded from: classes3.dex */
final class zzgs extends zzgp {
    private zzgs() {
        super();
    }

    private static <E> zzge<E> zzd(Object obj, long j11) {
        return (zzge) zziu.zzp(obj, j11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzgp
    public final <L> List<L> zza(Object obj, long j11) {
        zzge zzd = zzd(obj, j11);
        if (zzd.zzch()) {
            return zzd;
        }
        int size = zzd.size();
        zzge zzah = zzd.zzah(size == 0 ? 10 : size << 1);
        zziu.zza(obj, j11, zzah);
        return zzah;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.vision.zzgp
    public final void zzb(Object obj, long j11) {
        zzd(obj, j11).zzci();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    @Override // com.google.android.gms.internal.vision.zzgp
    public final <E> void zza(Object obj, Object obj2, long j11) {
        zzge<E> zzd = zzd(obj, j11);
        zzge<E> zzd2 = zzd(obj2, j11);
        int size = zzd.size();
        int size2 = zzd2.size();
        zzge<E> zzgeVar = zzd;
        zzgeVar = zzd;
        if (size > 0 && size2 > 0) {
            boolean zzch = zzd.zzch();
            zzge<E> zzgeVar2 = zzd;
            if (!zzch) {
                zzgeVar2 = zzd.zzah(size2 + size);
            }
            zzgeVar2.addAll(zzd2);
            zzgeVar = zzgeVar2;
        }
        if (size > 0) {
            zzd2 = zzgeVar;
        }
        zziu.zza(obj, j11, zzd2);
    }
}