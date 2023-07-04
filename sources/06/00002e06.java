package com.google.android.gms.maps.model;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.GoogleMapOptions;

@SafeParcelable.Class(creator = "LatLngBoundsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class LatLngBounds extends AbstractSafeParcelable implements ReflectedParcelable {
    @KeepForSdk
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new zzf();
    @SafeParcelable.Field(id = 3)
    public final LatLng northeast;
    @SafeParcelable.Field(id = 2)
    public final LatLng southwest;

    /* loaded from: classes3.dex */
    public static final class Builder {
        private double zza = Double.POSITIVE_INFINITY;
        private double zzb = Double.NEGATIVE_INFINITY;
        private double zzc = Double.NaN;
        private double zzd = Double.NaN;

        public LatLngBounds build() {
            Preconditions.checkState(!Double.isNaN(this.zzc), "no included points");
            return new LatLngBounds(new LatLng(this.zza, this.zzc), new LatLng(this.zzb, this.zzd));
        }

        public Builder include(LatLng latLng) {
            Preconditions.checkNotNull(latLng, "point must not be null");
            this.zza = Math.min(this.zza, latLng.latitude);
            this.zzb = Math.max(this.zzb, latLng.latitude);
            double d11 = latLng.longitude;
            if (Double.isNaN(this.zzc)) {
                this.zzc = d11;
                this.zzd = d11;
            } else {
                double d12 = this.zzc;
                double d13 = this.zzd;
                if (d12 > d13 ? !(d12 <= d11 || d11 <= d13) : !(d12 <= d11 && d11 <= d13)) {
                    Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                    if (((d12 - d11) + 360.0d) % 360.0d < ((d11 - d13) + 360.0d) % 360.0d) {
                        this.zzc = d11;
                    } else {
                        this.zzd = d11;
                    }
                }
            }
            return this;
        }
    }

    @SafeParcelable.Constructor
    public LatLngBounds(@SafeParcelable.Param(id = 2) LatLng latLng, @SafeParcelable.Param(id = 3) LatLng latLng2) {
        Preconditions.checkNotNull(latLng, "southwest must not be null.");
        Preconditions.checkNotNull(latLng2, "northeast must not be null.");
        double d11 = latLng2.latitude;
        double d12 = latLng.latitude;
        Preconditions.checkArgument(d11 >= d12, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d12), Double.valueOf(latLng2.latitude));
        this.southwest = latLng;
        this.northeast = latLng2;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LatLngBounds createFromAttributes(Context context, AttributeSet attributeSet) {
        return GoogleMapOptions.zzb(context, attributeSet);
    }

    private final boolean zza(double d11) {
        double d12 = this.southwest.longitude;
        double d13 = this.northeast.longitude;
        int i11 = (d12 > d13 ? 1 : (d12 == d13 ? 0 : -1));
        int i12 = (d12 > d11 ? 1 : (d12 == d11 ? 0 : -1));
        return i11 <= 0 ? i12 <= 0 && d11 <= d13 : i12 <= 0 || d11 <= d13;
    }

    public boolean contains(LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double d11 = latLng2.latitude;
        return this.southwest.latitude <= d11 && d11 <= this.northeast.latitude && zza(latLng2.longitude);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LatLngBounds) {
            LatLngBounds latLngBounds = (LatLngBounds) obj;
            return this.southwest.equals(latLngBounds.southwest) && this.northeast.equals(latLngBounds.northeast);
        }
        return false;
    }

    public LatLng getCenter() {
        LatLng latLng = this.southwest;
        double d11 = latLng.latitude;
        LatLng latLng2 = this.northeast;
        double d12 = (d11 + latLng2.latitude) / 2.0d;
        double d13 = latLng2.longitude;
        double d14 = latLng.longitude;
        if (d14 > d13) {
            d13 += 360.0d;
        }
        return new LatLng(d12, (d13 + d14) / 2.0d);
    }

    public int hashCode() {
        return Objects.hashCode(this.southwest, this.northeast);
    }

    public LatLngBounds including(LatLng latLng) {
        LatLng latLng2 = (LatLng) Preconditions.checkNotNull(latLng, "point must not be null.");
        double min = Math.min(this.southwest.latitude, latLng2.latitude);
        double max = Math.max(this.northeast.latitude, latLng2.latitude);
        double d11 = this.northeast.longitude;
        double d12 = this.southwest.longitude;
        double d13 = latLng2.longitude;
        if (!zza(d13)) {
            if (((d12 - d13) + 360.0d) % 360.0d < ((d13 - d11) + 360.0d) % 360.0d) {
                d12 = d13;
            } else {
                d11 = d13;
            }
        }
        return new LatLngBounds(new LatLng(min, d12), new LatLng(max, d11));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("southwest", this.southwest).add("northeast", this.northeast).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.southwest, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.northeast, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}