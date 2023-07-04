package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.adyen.checkout.components.model.payments.request.Address;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "DeviceOrientationRequestUpdateDataCreator")
/* loaded from: classes3.dex */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();
    @SafeParcelable.Field(defaultValueUnchecked = "DeviceOrientationRequestUpdateData.OPERATION_ADD", id = 1)
    final int zza;
    @SafeParcelable.Field(defaultValueUnchecked = Address.ADDRESS_NULL_PLACEHOLDER, id = 2)
    final zzh zzb;
    @SafeParcelable.Field(defaultValueUnchecked = Address.ADDRESS_NULL_PLACEHOLDER, getter = "getDeviceOrientationListenerBinder", id = 3, type = "android.os.IBinder")
    final com.google.android.gms.location.zzbf zzc;
    @SafeParcelable.Field(defaultValueUnchecked = Address.ADDRESS_NULL_PLACEHOLDER, getter = "getFusedLocationProviderCallbackBinder", id = 4, type = "android.os.IBinder")
    final zzai zzd;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public zzj(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) zzh zzhVar, @SafeParcelable.Param(id = 3) IBinder iBinder, @SafeParcelable.Param(id = 4) IBinder iBinder2) {
        this.zza = i11;
        this.zzb = zzhVar;
        zzai zzaiVar = null;
        this.zzc = iBinder == null ? null : com.google.android.gms.location.zzbe.zzb(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaiVar = queryLocalInterface instanceof zzai ? (zzai) queryLocalInterface : new zzag(iBinder2);
        }
        this.zzd = zzaiVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        com.google.android.gms.location.zzbf zzbfVar = this.zzc;
        SafeParcelWriter.writeIBinder(parcel, 3, zzbfVar == null ? null : zzbfVar.asBinder(), false);
        zzai zzaiVar = this.zzd;
        SafeParcelWriter.writeIBinder(parcel, 4, zzaiVar != null ? zzaiVar.asBinder() : null, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}