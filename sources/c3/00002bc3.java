package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzaf implements Parcelable.Creator<zzae> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        zzan[] zzanVarArr = null;
        zzy zzyVar = null;
        zzy zzyVar2 = null;
        zzy zzyVar3 = null;
        String str = null;
        String str2 = null;
        float f11 = 0.0f;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    zzanVarArr = (zzan[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzan.CREATOR);
                    break;
                case 3:
                    zzyVar = (zzy) SafeParcelReader.createParcelable(parcel, readHeader, zzy.CREATOR);
                    break;
                case 4:
                    zzyVar2 = (zzy) SafeParcelReader.createParcelable(parcel, readHeader, zzy.CREATOR);
                    break;
                case 5:
                    zzyVar3 = (zzy) SafeParcelReader.createParcelable(parcel, readHeader, zzy.CREATOR);
                    break;
                case 6:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    f11 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 8:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 10:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 11:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 12:
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzae(zzanVarArr, zzyVar, zzyVar2, zzyVar3, str, f11, str2, i11, z11, i12, i13);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzae[] newArray(int i11) {
        return new zzae[i11];
    }
}