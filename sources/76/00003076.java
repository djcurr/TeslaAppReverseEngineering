package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class zzm implements Parcelable.Creator<LandmarkParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LandmarkParcel createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f11 = BitmapDescriptorFactory.HUE_RED;
        int i11 = 0;
        int i12 = 0;
        float f12 = 0.0f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                i11 = SafeParcelReader.readInt(parcel, readHeader);
            } else if (fieldId == 2) {
                f11 = SafeParcelReader.readFloat(parcel, readHeader);
            } else if (fieldId == 3) {
                f12 = SafeParcelReader.readFloat(parcel, readHeader);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                i12 = SafeParcelReader.readInt(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LandmarkParcel(i11, f11, f12, i12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LandmarkParcel[] newArray(int i11) {
        return new LandmarkParcel[i11];
    }
}