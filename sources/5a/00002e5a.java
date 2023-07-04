package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzj extends com.google.android.gms.maps.internal.zzam {
    final /* synthetic */ GoogleMap.OnMapLoadedCallback zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj(GoogleMap googleMap, GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.zza = onMapLoadedCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzan
    public final void zzb() {
        this.zza.onMapLoaded();
    }
}