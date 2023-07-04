package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes3.dex */
public final class zzpx implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        zzpm zzpmVar = null;
        String str = null;
        String str2 = null;
        zzpn[] zzpnVarArr = null;
        zzpk[] zzpkVarArr = null;
        String[] strArr = null;
        zzpf[] zzpfVarArr = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    zzpmVar = (zzpm) SafeParcelReader.createParcelable(parcel, readHeader, zzpm.CREATOR);
                    break;
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    zzpnVarArr = (zzpn[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzpn.CREATOR);
                    break;
                case 5:
                    zzpkVarArr = (zzpk[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzpk.CREATOR);
                    break;
                case 6:
                    strArr = SafeParcelReader.createStringArray(parcel, readHeader);
                    break;
                case 7:
                    zzpfVarArr = (zzpf[]) SafeParcelReader.createTypedArray(parcel, readHeader, zzpf.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzpi(zzpmVar, str, str2, zzpnVarArr, zzpkVarArr, strArr, zzpfVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new zzpi[i11];
    }
}