package com.google.android.gms.internal.mlkit_vision_common;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzn extends zzh {
    private final zzp zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzn(zzp zzpVar, int i11) {
        super(zzpVar.size(), i11);
        this.zza = zzpVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzh
    protected final Object zza(int i11) {
        return this.zza.get(i11);
    }
}