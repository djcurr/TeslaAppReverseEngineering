package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "TransactionInfoCreator")
/* loaded from: classes3.dex */
public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new zzao();
    @SafeParcelable.Field(id = 1)
    int zza;
    @SafeParcelable.Field(id = 2)
    String zzb;
    @SafeParcelable.Field(id = 3)
    String zzc;

    /* loaded from: classes3.dex */
    public final class Builder {
        /* synthetic */ Builder(zzan zzanVar) {
        }

        public TransactionInfo build() {
            Preconditions.checkNotEmpty(TransactionInfo.this.zzc, "currencyCode must be set!");
            TransactionInfo transactionInfo = TransactionInfo.this;
            int i11 = transactionInfo.zza;
            if (i11 != 1) {
                if (i11 == 2) {
                    Preconditions.checkNotEmpty(transactionInfo.zzb, "An estimated total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_ESTIMATED!");
                } else if (i11 != 3) {
                    throw new IllegalArgumentException("totalPriceStatus must be set to one of WalletConstants.TotalPriceStatus!");
                }
            }
            TransactionInfo transactionInfo2 = TransactionInfo.this;
            if (transactionInfo2.zza == 3) {
                Preconditions.checkNotEmpty(transactionInfo2.zzb, "An final total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_FINAL!");
            }
            return TransactionInfo.this;
        }

        public Builder setCurrencyCode(String str) {
            TransactionInfo.this.zzc = str;
            return this;
        }

        public Builder setTotalPrice(String str) {
            TransactionInfo.this.zzb = str;
            return this;
        }

        public Builder setTotalPriceStatus(int i11) {
            TransactionInfo.this.zza = i11;
            return this;
        }
    }

    private TransactionInfo() {
    }

    public static Builder newBuilder() {
        return new Builder(null);
    }

    public String getCurrencyCode() {
        return this.zzc;
    }

    public String getTotalPrice() {
        return this.zzb;
    }

    public int getTotalPriceStatus() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @SafeParcelable.Constructor
    public TransactionInfo(@SafeParcelable.Param(id = 1) int i11, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2) {
        this.zza = i11;
        this.zzb = str;
        this.zzc = str2;
    }
}