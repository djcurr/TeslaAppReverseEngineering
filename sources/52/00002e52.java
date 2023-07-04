package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzb extends com.google.android.gms.maps.internal.zzau {
    final /* synthetic */ GoogleMap.OnMarkerDragListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzb(GoogleMap googleMap, GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        this.zza = onMarkerDragListener;
    }

    @Override // com.google.android.gms.maps.internal.zzav
    public final void zzb(com.google.android.gms.internal.maps.zzx zzxVar) {
        this.zza.onMarkerDrag(new Marker(zzxVar));
    }

    @Override // com.google.android.gms.maps.internal.zzav
    public final void zzc(com.google.android.gms.internal.maps.zzx zzxVar) {
        this.zza.onMarkerDragEnd(new Marker(zzxVar));
    }

    @Override // com.google.android.gms.maps.internal.zzav
    public final void zzd(com.google.android.gms.internal.maps.zzx zzxVar) {
        this.zza.onMarkerDragStart(new Marker(zzxVar));
    }
}