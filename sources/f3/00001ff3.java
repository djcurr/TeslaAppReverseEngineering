package com.google.android.gms.identity.intents.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zza implements Parcelable.Creator<CountrySpecification> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CountrySpecification createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) != 2) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new CountrySpecification(str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ CountrySpecification[] newArray(int i11) {
        return new CountrySpecification[i11];
    }
}