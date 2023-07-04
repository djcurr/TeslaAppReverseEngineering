package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzbk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        double d11 = 0.0d;
        double d12 = 0.0d;
        int i11 = 0;
        short s11 = 0;
        int i12 = 0;
        String str = null;
        float f11 = 0.0f;
        long j11 = 0;
        int i13 = -1;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    j11 = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    s11 = SafeParcelReader.readShort(parcel, readHeader);
                    break;
                case 4:
                    d11 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 5:
                    d12 = SafeParcelReader.readDouble(parcel, readHeader);
                    break;
                case 6:
                    f11 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 9:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzbj(str, i11, s11, d11, d12, f11, j11, i12, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzbj[i11];
    }
}