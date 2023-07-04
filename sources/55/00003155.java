package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
final class zzaf extends zzg {
    public static final Parcelable.Creator<zzaf> CREATOR = new zzae();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaf(int i11, int i12) {
        super(i11, i12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(zzb());
        parcel.writeInt(zza());
    }
}