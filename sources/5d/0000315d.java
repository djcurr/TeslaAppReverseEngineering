package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
final class zzan extends zzn {
    public static final Parcelable.Creator<zzan> CREATOR = new zzam();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzan(TimeOfWeek timeOfWeek, TimeOfWeek timeOfWeek2) {
        super(timeOfWeek, timeOfWeek2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(getOpen(), i11);
        parcel.writeParcelable(getClose(), i11);
    }
}