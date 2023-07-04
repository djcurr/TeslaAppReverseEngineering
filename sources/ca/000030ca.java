package com.google.android.gms.wallet.callback;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentDataRequestUpdateCreator")
/* loaded from: classes3.dex */
public class PaymentDataRequestUpdate extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequestUpdate> CREATOR = new zzn();
    @SafeParcelable.Field(id = 1)
    String zza;
    @SafeParcelable.Field(id = 2)
    Bundle zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public PaymentDataRequestUpdate(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public static PaymentDataRequestUpdate fromJson(String str) {
        return new PaymentDataRequestUpdate((String) Preconditions.checkNotNull(str, "JSON cannot be null!"), null);
    }

    public Bundle getUpdatedSavedState() {
        return this.zzb;
    }

    public String toJson() {
        return this.zza;
    }

    public PaymentDataRequestUpdate withUpdatedSavedState(Bundle bundle) {
        this.zzb = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeBundle(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}