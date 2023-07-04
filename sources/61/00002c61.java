package com.google.android.gms.internal.vision;

/* loaded from: classes3.dex */
final class zzgw implements zzhe {
    private zzhe[] zzyu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgw(zzhe... zzheVarArr) {
        this.zzyu = zzheVarArr;
    }

    @Override // com.google.android.gms.internal.vision.zzhe
    public final boolean zzb(Class<?> cls) {
        for (zzhe zzheVar : this.zzyu) {
            if (zzheVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.vision.zzhe
    public final zzhd zzc(Class<?> cls) {
        zzhe[] zzheVarArr;
        for (zzhe zzheVar : this.zzyu) {
            if (zzheVar.zzb(cls)) {
                return zzheVar.zzc(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }
}