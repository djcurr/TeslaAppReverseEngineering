package com.google.android.gms.maps;

import android.location.Location;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzba;

/* loaded from: classes3.dex */
final class zzi extends zzba {
    final /* synthetic */ GoogleMap.OnMyLocationClickListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzi(GoogleMap googleMap, GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        this.zza = onMyLocationClickListener;
    }

    @Override // com.google.android.gms.maps.internal.zzbb
    public final void zzb(Location location) {
        this.zza.onMyLocationClick(location);
    }
}