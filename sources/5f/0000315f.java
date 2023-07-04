package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
final class zzap extends zzp {
    public static final Parcelable.Creator<zzap> CREATOR = new zzao();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzap(String str, int i11, int i12, String str2) {
        super(str, i11, i12, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(getAttributions());
        parcel.writeInt(getHeight());
        parcel.writeInt(getWidth());
        parcel.writeString(zza());
    }
}