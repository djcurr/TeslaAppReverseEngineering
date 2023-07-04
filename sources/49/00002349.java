package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzks extends zzku {
    private zzks() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzks(zzkr zzkrVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzku
    public final void zza(Object obj, long j11) {
        ((zzkg) zzms.zzf(obj, j11)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzku
    public final void zzb(Object obj, Object obj2, long j11) {
        zzkg zzkgVar = (zzkg) zzms.zzf(obj, j11);
        zzkg zzkgVar2 = (zzkg) zzms.zzf(obj2, j11);
        int size = zzkgVar.size();
        int size2 = zzkgVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzkgVar.zzc()) {
                zzkgVar = zzkgVar.zzd(size2 + size);
            }
            zzkgVar.addAll(zzkgVar2);
        }
        if (size > 0) {
            zzkgVar2 = zzkgVar;
        }
        zzms.zzs(obj, j11, zzkgVar2);
    }
}