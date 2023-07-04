package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzps implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i11 = 0;
        int i12 = 0;
        String str = null;
        String str2 = null;
        byte[] bArr = null;
        Point[] pointArr = null;
        zzpk zzpkVar = null;
        zzpn zzpnVar = null;
        zzpo zzpoVar = null;
        zzpq zzpqVar = null;
        zzpp zzppVar = null;
        zzpl zzplVar = null;
        zzph zzphVar = null;
        zzpi zzpiVar = null;
        zzpj zzpjVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i11 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 5:
                    pointArr = (Point[]) SafeParcelReader.createTypedArray(parcel, readHeader, Point.CREATOR);
                    break;
                case 6:
                    i12 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 7:
                    zzpkVar = (zzpk) SafeParcelReader.createParcelable(parcel, readHeader, zzpk.CREATOR);
                    break;
                case 8:
                    zzpnVar = (zzpn) SafeParcelReader.createParcelable(parcel, readHeader, zzpn.CREATOR);
                    break;
                case 9:
                    zzpoVar = (zzpo) SafeParcelReader.createParcelable(parcel, readHeader, zzpo.CREATOR);
                    break;
                case 10:
                    zzpqVar = (zzpq) SafeParcelReader.createParcelable(parcel, readHeader, zzpq.CREATOR);
                    break;
                case 11:
                    zzppVar = (zzpp) SafeParcelReader.createParcelable(parcel, readHeader, zzpp.CREATOR);
                    break;
                case 12:
                    zzplVar = (zzpl) SafeParcelReader.createParcelable(parcel, readHeader, zzpl.CREATOR);
                    break;
                case 13:
                    zzphVar = (zzph) SafeParcelReader.createParcelable(parcel, readHeader, zzph.CREATOR);
                    break;
                case 14:
                    zzpiVar = (zzpi) SafeParcelReader.createParcelable(parcel, readHeader, zzpi.CREATOR);
                    break;
                case 15:
                    zzpjVar = (zzpj) SafeParcelReader.createParcelable(parcel, readHeader, zzpj.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzpr(i11, str, str2, bArr, pointArr, i12, zzpkVar, zzpnVar, zzpoVar, zzpqVar, zzppVar, zzplVar, zzphVar, zzpiVar, zzpjVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzpr[i11];
    }
}