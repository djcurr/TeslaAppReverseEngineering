package com.google.android.gms.wallet.callback;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PaymentAuthorizationResultCreator")
/* loaded from: classes3.dex */
public class PaymentAuthorizationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentAuthorizationResult> CREATOR = new zzm();
    @SafeParcelable.Field(id = 1)
    String zza;
    @SafeParcelable.Field(id = 2)
    Bundle zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public PaymentAuthorizationResult(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public static PaymentAuthorizationResult fromJson(String str) {
        return new PaymentAuthorizationResult((String) Preconditions.checkNotNull(str, "JSON cannot be null!"), null);
    }

    public Bundle getUpdatedSavedState() {
        return this.zzb;
    }

    public String toJson() {
        return this.zza;
    }

    public PaymentAuthorizationResult withUpdatedSavedState(Bundle bundle) {
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