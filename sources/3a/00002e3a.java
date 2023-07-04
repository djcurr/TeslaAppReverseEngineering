package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* loaded from: classes3.dex */
public final class zzab implements Parcelable.Creator<GoogleMapOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleMapOptions createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        CameraPosition cameraPosition = null;
        Float f11 = null;
        Float f12 = null;
        LatLngBounds latLngBounds = null;
        Integer num = null;
        String str = null;
        byte b11 = -1;
        byte b12 = -1;
        byte b13 = -1;
        byte b14 = -1;
        byte b15 = -1;
        byte b16 = -1;
        byte b17 = -1;
        byte b18 = -1;
        byte b19 = -1;
        byte b21 = -1;
        byte b22 = -1;
        byte b23 = -1;
        int i11 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    b11 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 3:
                    b12 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 4:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.createParcelable(parcel, readHeader, CameraPosition.CREATOR);
                    break;
                case 6:
                    b13 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 7:
                    b14 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 8:
                    b15 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 9:
                    b16 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 10:
                    b17 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 11:
                    b18 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 12:
                    b19 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 13:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 14:
                    b21 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 15:
                    b22 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 16:
                    f11 = SafeParcelReader.readFloatObject(parcel, readHeader);
                    break;
                case 17:
                    f12 = SafeParcelReader.readFloatObject(parcel, readHeader);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.createParcelable(parcel, readHeader, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b23 = SafeParcelReader.readByte(parcel, readHeader);
                    break;
                case 20:
                    num = SafeParcelReader.readIntegerObject(parcel, readHeader);
                    break;
                case 21:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new GoogleMapOptions(b11, b12, i11, cameraPosition, b13, b14, b15, b16, b17, b18, b19, b21, b22, f11, f12, latLngBounds, b23, num, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions[] newArray(int i11) {
        return new GoogleMapOptions[i11];
    }
}