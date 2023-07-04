package com.google.android.gms.internal.mlkit_vision_face;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzg implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzn[] zznVarArr = null;
        zzd[] zzdVarArr = null;
        int i11 = 0;
        int i12 = 0;
        float f11 = Float.MAX_VALUE;
        float f12 = Float.MAX_VALUE;
        float f13 = Float.MAX_VALUE;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f21 = 0.0f;
        float f22 = -1.0f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 3:
                    f14 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 4:
                    f15 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 5:
                    f16 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 6:
                    f17 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    f11 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    f12 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 9:
                    zznVarArr = (zzn[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzn.CREATOR);
                    break;
                case 10:
                    f18 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 11:
                    f19 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 12:
                    f21 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 13:
                    zzdVarArr = (zzd[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzd.CREATOR);
                    break;
                case 14:
                    f13 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 15:
                    f22 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzf(i11, i12, f14, f15, f16, f17, f11, f12, f13, zznVarArr, f18, f19, f21, zzdVarArr, f22);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzf[i11];
    }
}