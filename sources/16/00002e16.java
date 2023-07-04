package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StreetViewPanoramaLinkCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class StreetViewPanoramaLink extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLink> CREATOR = new zzo();
    @SafeParcelable.Field(id = 3)
    public final float bearing;
    @SafeParcelable.Field(id = 2)
    public final String panoId;

    @SafeParcelable.Constructor
    public StreetViewPanoramaLink(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) float f11) {
        this.panoId = str;
        this.bearing = (((double) f11) <= 0.0d ? (f11 % 360.0f) + 360.0f : f11) % 360.0f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreetViewPanoramaLink) {
            StreetViewPanoramaLink streetViewPanoramaLink = (StreetViewPanoramaLink) obj;
            return this.panoId.equals(streetViewPanoramaLink.panoId) && Float.floatToIntBits(this.bearing) == Float.floatToIntBits(streetViewPanoramaLink.bearing);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.panoId, Float.valueOf(this.bearing));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("panoId", this.panoId).add("bearing", Float.valueOf(this.bearing)).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.panoId, false);
        SafeParcelWriter.writeFloat(parcel, 3, this.bearing);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}