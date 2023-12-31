package com.google.android.gms.maps;

import android.graphics.Bitmap;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.internal.zzbt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzq extends zzbt {
    final /* synthetic */ GoogleMap.SnapshotReadyCallback zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzq(GoogleMap googleMap, GoogleMap.SnapshotReadyCallback snapshotReadyCallback) {
        this.zza = snapshotReadyCallback;
    }

    @Override // com.google.android.gms.maps.internal.zzbu
    public final void zzb(Bitmap bitmap) {
        this.zza.onSnapshotReady(bitmap);
    }

    @Override // com.google.android.gms.maps.internal.zzbu
    public final void zzc(IObjectWrapper iObjectWrapper) {
        this.zza.onSnapshotReady((Bitmap) ObjectWrapper.unwrap(iObjectWrapper));
    }
}