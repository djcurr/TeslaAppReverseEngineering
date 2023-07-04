package com.google.android.libraries.places.internal;

/* loaded from: classes3.dex */
final class zzafx implements zzage {
    private final zzage[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzafx(zzage... zzageVarArr) {
        this.zza = zzageVarArr;
    }

    @Override // com.google.android.libraries.places.internal.zzage
    public final zzagd zzb(Class cls) {
        zzage[] zzageVarArr = this.zza;
        for (int i11 = 0; i11 < 2; i11++) {
            zzage zzageVar = zzageVarArr[i11];
            if (zzageVar.zzc(cls)) {
                return zzageVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.libraries.places.internal.zzage
    public final boolean zzc(Class cls) {
        zzage[] zzageVarArr = this.zza;
        for (int i11 = 0; i11 < 2; i11++) {
            if (zzageVarArr[i11].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}