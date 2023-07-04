package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

@SafeParcelable.Class(creator = "PaymentCardRecognitionCreator")
/* loaded from: classes3.dex */
public final class PaymentCardRecognitionResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentCardRecognitionResult> CREATOR = new zzw();
    @SafeParcelable.Field(id = 1)
    String zza;
    @SafeParcelable.Field(id = 2)
    CreditCardExpirationDate zzb;

    PaymentCardRecognitionResult() {
    }

    public static PaymentCardRecognitionResult getFromIntent(Intent intent) {
        return (PaymentCardRecognitionResult) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.android.gms.wallet.PaymentCardRecognitionResult", CREATOR);
    }

    public CreditCardExpirationDate getCreditCardExpirationDate() {
        return this.zzb;
    }

    public String getPan() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, this.zza, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i11, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public PaymentCardRecognitionResult(@SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) CreditCardExpirationDate creditCardExpirationDate) {
        this.zza = str;
        this.zzb = creditCardExpirationDate;
    }
}