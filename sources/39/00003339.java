package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.places.api.model.LocationBias;
import com.google.android.libraries.places.api.model.LocationRestriction;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;

/* loaded from: classes3.dex */
final class zzgk extends zzgi {
    public static final Parcelable.Creator<zzgk> CREATOR = new zzgj();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzgk(AutocompleteActivityMode autocompleteActivityMode, zziy zziyVar, zzgp zzgpVar, String str, String str2, LocationBias locationBias, LocationRestriction locationRestriction, zziy zziyVar2, TypeFilter typeFilter, zziy zziyVar3, int i11, int i12) {
        super(autocompleteActivityMode, zziyVar, zzgpVar, str, str2, locationBias, locationRestriction, zziyVar2, typeFilter, zziyVar3, i11, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(zzh(), i11);
        parcel.writeList(zzj());
        parcel.writeParcelable(zzf(), i11);
        if (zzm() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzm());
        }
        if (zzl() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(zzl());
        }
        parcel.writeParcelable(zzc(), i11);
        parcel.writeParcelable(zzd(), i11);
        parcel.writeList(zzi());
        parcel.writeParcelable(zze(), i11);
        parcel.writeList(zzk());
        parcel.writeInt(zza());
        parcel.writeInt(zzb());
    }
}