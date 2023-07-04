package com.google.android.libraries.places.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes3.dex */
public enum zzgp implements Parcelable {
    FRAGMENT,
    INTENT;
    
    public static final Parcelable.Creator<zzgp> CREATOR = new Parcelable.Creator() { // from class: com.google.android.libraries.places.internal.zzgo
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            Objects.requireNonNull(readString);
            return zzgp.valueOf(readString);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i11) {
            return new zzgp[i11];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(name());
    }
}