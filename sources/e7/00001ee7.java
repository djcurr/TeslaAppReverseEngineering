package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes3.dex */
public final class zzm implements Parcelable.Creator {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(GetServiceRequest getServiceRequest, Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getServiceRequest.zzc);
        SafeParcelWriter.writeInt(parcel, 2, getServiceRequest.zzd);
        SafeParcelWriter.writeInt(parcel, 3, getServiceRequest.zze);
        SafeParcelWriter.writeString(parcel, 4, getServiceRequest.zzf, false);
        SafeParcelWriter.writeIBinder(parcel, 5, getServiceRequest.zzg, false);
        SafeParcelWriter.writeTypedArray(parcel, 6, getServiceRequest.zzh, i11, false);
        SafeParcelWriter.writeBundle(parcel, 7, getServiceRequest.zzi, false);
        SafeParcelWriter.writeParcelable(parcel, 8, getServiceRequest.zzj, i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 10, getServiceRequest.zzk, i11, false);
        SafeParcelWriter.writeTypedArray(parcel, 11, getServiceRequest.zzl, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 12, getServiceRequest.zzm);
        SafeParcelWriter.writeInt(parcel, 13, getServiceRequest.zzn);
        SafeParcelWriter.writeBoolean(parcel, 14, getServiceRequest.zzo);
        SafeParcelWriter.writeString(parcel, 15, getServiceRequest.zza(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Scope[] scopeArr = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.zzb;
        Feature[] featureArr2 = featureArr;
        String str = null;
        IBinder iBinder = null;
        Account account = null;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = false;
        int i14 = 0;
        boolean z12 = false;
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
                    i13 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 4:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    iBinder = SafeParcelReader.readIBinder(parcel, readHeader);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.createTypedArray(parcel, readHeader, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.createParcelable(parcel, readHeader, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.createTypedArray(parcel, readHeader, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.createTypedArray(parcel, readHeader, Feature.CREATOR);
                    break;
                case 12:
                    z11 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 13:
                    i14 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 14:
                    z12 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 15:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new GetServiceRequest(i11, i12, i13, str, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z11, i14, z12, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i11) {
        return new GetServiceRequest[i11];
    }
}