package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "StreetViewPanoramaLocationCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public class StreetViewPanoramaLocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StreetViewPanoramaLocation> CREATOR = new zzp();
    @SafeParcelable.Field(id = 2)
    public final StreetViewPanoramaLink[] links;
    @SafeParcelable.Field(id = 4)
    public final String panoId;
    @SafeParcelable.Field(id = 3)
    public final LatLng position;

    @SafeParcelable.Constructor
    public StreetViewPanoramaLocation(@SafeParcelable.Param(id = 2) StreetViewPanoramaLink[] streetViewPanoramaLinkArr, @SafeParcelable.Param(id = 3) LatLng latLng, @SafeParcelable.Param(id = 4) String str) {
        this.links = streetViewPanoramaLinkArr;
        this.position = latLng;
        this.panoId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StreetViewPanoramaLocation) {
            StreetViewPanoramaLocation streetViewPanoramaLocation = (StreetViewPanoramaLocation) obj;
            return this.panoId.equals(streetViewPanoramaLocation.panoId) && this.position.equals(streetViewPanoramaLocation.position);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.position, this.panoId);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("panoId", this.panoId).add("position", this.position.toString()).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.links, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.position, i11, false);
        SafeParcelWriter.writeString(parcel, 4, this.panoId, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}