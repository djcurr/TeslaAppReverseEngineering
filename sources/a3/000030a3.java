package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Collection;

@SafeParcelable.Class(creator = "PaymentDataRequestCreator")
/* loaded from: classes3.dex */
public final class PaymentDataRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PaymentDataRequest> CREATOR = new zzac();
    @SafeParcelable.Field(id = 1)
    boolean zza;
    @SafeParcelable.Field(id = 2)
    boolean zzb;
    @SafeParcelable.Field(id = 3)
    CardRequirements zzc;
    @SafeParcelable.Field(id = 4)
    boolean zzd;
    @SafeParcelable.Field(id = 5)
    ShippingAddressRequirements zze;
    @SafeParcelable.Field(id = 6)
    ArrayList zzf;
    @SafeParcelable.Field(id = 7)
    PaymentMethodTokenizationParameters zzg;
    @SafeParcelable.Field(id = 8)
    TransactionInfo zzh;
    @SafeParcelable.Field(defaultValue = "true", id = 9)
    boolean zzi;
    @SafeParcelable.Field(id = 10)
    String zzj;
    @SafeParcelable.Field(id = 11)
    Bundle zzk;

    @Deprecated
    /* loaded from: classes3.dex */
    public final class Builder {
        /* synthetic */ Builder(zzab zzabVar) {
        }

        public Builder addAllowedPaymentMethod(int i11) {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzf == null) {
                paymentDataRequest.zzf = new ArrayList();
            }
            PaymentDataRequest.this.zzf.add(Integer.valueOf(i11));
            return this;
        }

        public Builder addAllowedPaymentMethods(Collection<Integer> collection) {
            boolean z11 = false;
            if (collection != null && !collection.isEmpty()) {
                z11 = true;
            }
            Preconditions.checkArgument(z11, "allowedPaymentMethods can't be null or empty!");
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzf == null) {
                paymentDataRequest.zzf = new ArrayList();
            }
            PaymentDataRequest.this.zzf.addAll(collection);
            return this;
        }

        public PaymentDataRequest build() {
            PaymentDataRequest paymentDataRequest = PaymentDataRequest.this;
            if (paymentDataRequest.zzj == null) {
                Preconditions.checkNotNull(paymentDataRequest.zzf, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                Preconditions.checkNotNull(PaymentDataRequest.this.zzc, "Card requirements must be set!");
                PaymentDataRequest paymentDataRequest2 = PaymentDataRequest.this;
                if (paymentDataRequest2.zzg != null) {
                    Preconditions.checkNotNull(paymentDataRequest2.zzh, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return PaymentDataRequest.this;
        }

        public Builder setCardRequirements(CardRequirements cardRequirements) {
            PaymentDataRequest.this.zzc = cardRequirements;
            return this;
        }

        public Builder setEmailRequired(boolean z11) {
            PaymentDataRequest.this.zza = z11;
            return this;
        }

        public Builder setPaymentMethodTokenizationParameters(PaymentMethodTokenizationParameters paymentMethodTokenizationParameters) {
            PaymentDataRequest.this.zzg = paymentMethodTokenizationParameters;
            return this;
        }

        public Builder setPhoneNumberRequired(boolean z11) {
            PaymentDataRequest.this.zzb = z11;
            return this;
        }

        public Builder setShippingAddressRequired(boolean z11) {
            PaymentDataRequest.this.zzd = z11;
            return this;
        }

        public Builder setShippingAddressRequirements(ShippingAddressRequirements shippingAddressRequirements) {
            PaymentDataRequest.this.zze = shippingAddressRequirements;
            return this;
        }

        public Builder setTransactionInfo(TransactionInfo transactionInfo) {
            PaymentDataRequest.this.zzh = transactionInfo;
            return this;
        }

        public Builder setUiRequired(boolean z11) {
            PaymentDataRequest.this.zzi = z11;
            return this;
        }
    }

    private PaymentDataRequest() {
        this.zzi = true;
    }

    public static PaymentDataRequest fromJson(String str) {
        Builder newBuilder = newBuilder();
        PaymentDataRequest.this.zzj = (String) Preconditions.checkNotNull(str, "paymentDataRequestJson cannot be null!");
        return newBuilder.build();
    }

    @Deprecated
    public static Builder newBuilder() {
        return new Builder(null);
    }

    @Deprecated
    public ArrayList<Integer> getAllowedPaymentMethods() {
        return this.zzf;
    }

    @Deprecated
    public CardRequirements getCardRequirements() {
        return this.zzc;
    }

    @Deprecated
    public PaymentMethodTokenizationParameters getPaymentMethodTokenizationParameters() {
        return this.zzg;
    }

    public Bundle getSavedState() {
        return this.zzk;
    }

    @Deprecated
    public ShippingAddressRequirements getShippingAddressRequirements() {
        return this.zze;
    }

    @Deprecated
    public TransactionInfo getTransactionInfo() {
        return this.zzh;
    }

    @Deprecated
    public boolean isEmailRequired() {
        return this.zza;
    }

    @Deprecated
    public boolean isPhoneNumberRequired() {
        return this.zzb;
    }

    @Deprecated
    public boolean isShippingAddressRequired() {
        return this.zzd;
    }

    @Deprecated
    public boolean isUiRequired() {
        return this.zzi;
    }

    public String toJson() {
        return this.zzj;
    }

    public PaymentDataRequest withSavedState(Bundle bundle) {
        this.zzk = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zza);
        SafeParcelWriter.writeBoolean(parcel, 2, this.zzb);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zzc, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zzd);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i11, false);
        SafeParcelWriter.writeIntegerList(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i11, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzh, i11, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzi);
        SafeParcelWriter.writeString(parcel, 10, this.zzj, false);
        SafeParcelWriter.writeBundle(parcel, 11, this.zzk, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SafeParcelable.Constructor
    public PaymentDataRequest(@SafeParcelable.Param(id = 1) boolean z11, @SafeParcelable.Param(id = 2) boolean z12, @SafeParcelable.Param(id = 3) CardRequirements cardRequirements, @SafeParcelable.Param(id = 4) boolean z13, @SafeParcelable.Param(id = 5) ShippingAddressRequirements shippingAddressRequirements, @SafeParcelable.Param(id = 6) ArrayList arrayList, @SafeParcelable.Param(id = 7) PaymentMethodTokenizationParameters paymentMethodTokenizationParameters, @SafeParcelable.Param(id = 8) TransactionInfo transactionInfo, @SafeParcelable.Param(id = 9) boolean z14, @SafeParcelable.Param(id = 10) String str, @SafeParcelable.Param(id = 11) Bundle bundle) {
        this.zza = z11;
        this.zzb = z12;
        this.zzc = cardRequirements;
        this.zzd = z13;
        this.zze = shippingAddressRequirements;
        this.zzf = arrayList;
        this.zzg = paymentMethodTokenizationParameters;
        this.zzh = transactionInfo;
        this.zzi = z14;
        this.zzj = str;
        this.zzk = bundle;
    }
}