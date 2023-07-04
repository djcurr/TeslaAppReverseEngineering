package com.google.android.gms.internal.mlkit_vision_text_common;

/* loaded from: classes3.dex */
final class zzbk extends zzac {
    private final zzbm zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbk(zzbm zzbmVar, int i11) {
        super(zzbmVar.size(), i11);
        this.zza = zzbmVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzac
    protected final Object zza(int i11) {
        return this.zza.get(i11);
    }
}