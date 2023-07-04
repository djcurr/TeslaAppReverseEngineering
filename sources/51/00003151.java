package com.google.android.libraries.places.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes3.dex */
final class zzab extends zzc {
    public static final Parcelable.Creator<zzab> CREATOR = new zzaa();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzab(List list) {
        super(list);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        parcel.writeList(asList());
    }
}