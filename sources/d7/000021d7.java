package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzbg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = zzbf.zza;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        long j11 = Long.MAX_VALUE;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId != 1) {
                switch (fieldId) {
                    case 5:
                        arrayList = SafeParcelReader.createTypedList(parcel, readHeader, ClientIdentity.CREATOR);
                        continue;
                    case 6:
                        str = SafeParcelReader.createString(parcel, readHeader);
                        continue;
                    case 7:
                        z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                        continue;
                    case 8:
                        z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                        continue;
                    case 9:
                        z13 = SafeParcelReader.readBoolean(parcel, readHeader);
                        continue;
                    case 10:
                        str2 = SafeParcelReader.createString(parcel, readHeader);
                        continue;
                    case 11:
                        z14 = SafeParcelReader.readBoolean(parcel, readHeader);
                        continue;
                    case 12:
                        z15 = SafeParcelReader.readBoolean(parcel, readHeader);
                        continue;
                    case 13:
                        str3 = SafeParcelReader.createString(parcel, readHeader);
                        continue;
                    case 14:
                        j11 = SafeParcelReader.readLong(parcel, readHeader);
                        continue;
                    default:
                        SafeParcelReader.skipUnknownField(parcel, readHeader);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) SafeParcelReader.createParcelable(parcel, readHeader, LocationRequest.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbf(locationRequest, arrayList, str, z11, z12, z13, str2, z14, z15, str3, j11);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzbf[i11];
    }
}