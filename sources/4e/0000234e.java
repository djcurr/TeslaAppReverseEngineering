package com.google.android.gms.internal.measurement;

/* loaded from: classes3.dex */
final class zzkx implements zzle {
    private final zzle[] zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzkx(zzle... zzleVarArr) {
        this.zza = zzleVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzle
    public final zzld zzb(Class cls) {
        zzle[] zzleVarArr = this.zza;
        for (int i11 = 0; i11 < 2; i11++) {
            zzle zzleVar = zzleVarArr[i11];
            if (zzleVar.zzc(cls)) {
                return zzleVar.zzb(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.measurement.zzle
    public final boolean zzc(Class cls) {
        zzle[] zzleVarArr = this.zza;
        for (int i11 = 0; i11 < 2; i11++) {
            if (zzleVarArr[i11].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}