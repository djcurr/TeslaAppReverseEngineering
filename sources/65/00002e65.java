package com.google.android.gms.maps;

import com.google.android.gms.maps.GoogleMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzu extends com.google.android.gms.maps.internal.zzu {
    final /* synthetic */ GoogleMap.OnCameraMoveStartedListener zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzu(GoogleMap googleMap, GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.zza = onCameraMoveStartedListener;
    }

    @Override // com.google.android.gms.maps.internal.zzv
    public final void zzb(int i11) {
        this.zza.onCameraMoveStarted(i11);
    }
}