package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
final class zzafs extends zzafu {
    private zzafs() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzafs(zzafr zzafrVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzafu
    public final void zza(Object obj, long j11) {
        ((zzafg) zzahs.zzf(obj, j11)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.libraries.places.internal.zzafu
    public final void zzb(Object obj, Object obj2, long j11) {
        zzafg zzafgVar = (zzafg) zzahs.zzf(obj, j11);
        zzafg zzafgVar2 = (zzafg) zzahs.zzf(obj2, j11);
        int size = zzafgVar.size();
        int size2 = zzafgVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzafgVar.zzc()) {
                zzafgVar = zzafgVar.zzf(size2 + size);
            }
            zzafgVar.addAll(zzafgVar2);
        }
        if (size > 0) {
            zzafgVar2 = zzafgVar;
        }
        zzahs.zzs(obj, j11, zzafgVar2);
    }
}