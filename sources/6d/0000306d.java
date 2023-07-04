package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzd implements Parcelable.Creator<FaceParcel> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FaceParcel createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        LandmarkParcel[] landmarkParcelArr = null;
        zza[] zzaVarArr = null;
        int i11 = 0;
        int i12 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f21 = 0.0f;
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
                    f11 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 4:
                    f12 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 5:
                    f13 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 6:
                    f14 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 7:
                    f15 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    f16 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) SafeParcelReader.createTypedArray(parcel, readHeader, LandmarkParcel.CREATOR);
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
                    zzaVarArr = (zza[]) SafeParcelReader.createTypedArray(parcel, readHeader, zza.CREATOR);
                    break;
                case 14:
                    f17 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new FaceParcel(i11, i12, f11, f12, f13, f14, f15, f16, f17, landmarkParcelArr, f18, f19, f21, zzaVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ FaceParcel[] newArray(int i11) {
        return new FaceParcel[i11];
    }
}