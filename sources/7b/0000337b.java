package com.google.android.libraries.places.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zziw extends zzim {
    private final zziy zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zziw(zziy zziyVar, int i11) {
        super(zziyVar.size(), i11);
        this.zza = zziyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzim
    protected final Object zza(int i11) {
        return this.zza.get(i11);
    }
}