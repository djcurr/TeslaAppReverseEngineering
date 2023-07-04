package com.google.android.gms.internal.mlkit_common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzam extends zzae {
    private final zzao zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzam(zzao zzaoVar, int i11) {
        super(zzaoVar.size(), i11);
        this.zza = zzaoVar;
    }

    @Override // com.google.android.gms.internal.mlkit_common.zzae
    protected final Object zza(int i11) {
        return this.zza.get(i11);
    }
}