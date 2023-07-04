package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;

/* loaded from: classes3.dex */
final class zzt extends com.google.android.gms.maps.internal.zzm {
    final /* synthetic */ GoogleMap.OnCameraChangeListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzt(GoogleMap googleMap, GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        this.zza = onCameraChangeListener;
    }

    @Override // com.google.android.gms.maps.internal.zzn
    public final void zzb(CameraPosition cameraPosition) {
        this.zza.onCameraChange(cameraPosition);
    }
}