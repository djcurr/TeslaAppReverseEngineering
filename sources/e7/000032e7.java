package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public final class zzds {
    private Bitmap zza;

    public final zzdu zza() {
        zzig.zzi(this.zza != null, "Photo must be set to non-null value.");
        return new zzdu(this.zza, null);
    }

    public final zzds zzb(Bitmap bitmap) {
        this.zza = bitmap;
        return this;
    }
}