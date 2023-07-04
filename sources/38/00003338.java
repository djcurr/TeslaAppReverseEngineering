package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

/* loaded from: classes3.dex */
final class zzgj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zzgk((AutocompleteActivityMode) parcel.readParcelable(zzgr.class.getClassLoader()), zziy.zzk(parcel.readArrayList(Place.Field.class.getClassLoader())), (zzgp) parcel.readParcelable(zzgr.class.getClassLoader()), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null, (LocationBias) parcel.readParcelable(zzgr.class.getClassLoader()), (LocationRestriction) parcel.readParcelable(zzgr.class.getClassLoader()), zziy.zzk(parcel.readArrayList(String.class.getClassLoader())), (TypeFilter) parcel.readParcelable(zzgr.class.getClassLoader()), zziy.zzk(parcel.readArrayList(String.class.getClassLoader())), parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzgk[i11];
    }
}