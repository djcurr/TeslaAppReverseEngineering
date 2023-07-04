package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
final class zzaj extends zzj {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzai();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(int i11, int i12) {
        super(i11, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(getHours());
        parcel.writeInt(getMinutes());
    }
}