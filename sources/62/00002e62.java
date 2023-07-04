package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbc;
import com.google.android.gms.maps.model.PointOfInterest;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzr extends zzbc {
    final /* synthetic */ GoogleMap.OnPoiClickListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzr(GoogleMap googleMap, GoogleMap.OnPoiClickListener onPoiClickListener) {
        this.zza = onPoiClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbd
    public final void zzb(PointOfInterest pointOfInterest) {
        this.zza.onPoiClick(pointOfInterest);
    }
}