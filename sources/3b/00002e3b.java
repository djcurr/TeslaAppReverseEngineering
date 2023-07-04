package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.IGoogleMapDelegate;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzac extends com.google.android.gms.maps.internal.zzaq {
    final /* synthetic */ OnMapReadyCallback zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzac(zzad zzadVar, OnMapReadyCallback onMapReadyCallback) {
        this.zza = onMapReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzar
    public final void zzb(IGoogleMapDelegate iGoogleMapDelegate) {
        this.zza.onMapReady(new GoogleMap(iGoogleMapDelegate));
    }
}