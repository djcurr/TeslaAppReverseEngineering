package com.google.android.gms.internal.mlkit_vision_face;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class zzox implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Rect rect = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        int i11 = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    rect = (Rect) SafeParcelReader.createParcelable(parcel, readHeader, Rect.CREATOR);
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
                    f17 = SafeParcelReader.readFloat(parcel, readHeader);
                    break;
                case 10:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, zzpc.CREATOR);
                    break;
                case 11:
                    arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, zzos.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzow(i11, rect, f11, f12, f13, f14, f15, f16, f17, arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzow[i11];
    }
}