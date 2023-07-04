package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.RecentlyNonNull;
import com.google.android.libraries.places.internal.zzig;

/* loaded from: classes3.dex */
public abstract class PhotoMetadata implements Parcelable {

    /* loaded from: classes3.dex */
    public static abstract class Builder {
        @RecentlyNonNull
        public PhotoMetadata build() {
            PhotoMetadata zzb = zzb();
            int width = zzb.getWidth();
            zzig.zzj(width >= 0, "Width must not be < 0, but was: %s.", width);
            int height = zzb.getHeight();
            zzig.zzj(height >= 0, "Height must not be < 0, but was: %s.", height);
            zzig.zzi(!TextUtils.isEmpty(zzb.zza()), "PhotoReference must not be null or empty.");
            return zzb;
        }

        @RecentlyNonNull
        public abstract String getAttributions();

        public abstract int getHeight();

        public abstract int getWidth();

        @RecentlyNonNull
        public abstract Builder setAttributions(@RecentlyNonNull String str);

        @RecentlyNonNull
        public abstract Builder setHeight(int i11);

        @RecentlyNonNull
        public abstract Builder setWidth(int i11);

        abstract PhotoMetadata zzb();
    }

    @RecentlyNonNull
    public static Builder builder(@RecentlyNonNull String str) {
        zzo zzoVar = new zzo();
        zzoVar.zza(str);
        zzoVar.setWidth(0);
        zzoVar.setHeight(0);
        zzoVar.setAttributions("");
        return zzoVar;
    }

    @RecentlyNonNull
    public abstract String getAttributions();

    public abstract int getHeight();

    public abstract int getWidth();

    @RecentlyNonNull
    public abstract String zza();
}