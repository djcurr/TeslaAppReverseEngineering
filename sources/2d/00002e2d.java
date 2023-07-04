package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzm implements Parcelable.Creator<PolylineOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ PolylineOptions createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        float f11 = 0.0f;
        float f12 = 0.0f;
        ArrayList arrayList = null;
        Cap cap = null;
        Cap cap2 = null;
        ArrayList arrayList2 = null;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i12 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, LatLng.CREATOR);
                    break;
                case 3:
                    f11 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 4:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    f12 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 6:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 8:
                    z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    cap = (Cap) SafeParcelReader.createParcelable(parcel, readHeader, Cap.CREATOR);
                    break;
                case 10:
                    cap2 = (Cap) SafeParcelReader.createParcelable(parcel, readHeader, Cap.CREATOR);
                    break;
                case 11:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 12:
                    arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, PatternItem.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new PolylineOptions(arrayList, f11, i11, f12, z11, z12, z13, cap, cap2, i12, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PolylineOptions[] newArray(int i11) {
        return new PolylineOptions[i11];
    }
}