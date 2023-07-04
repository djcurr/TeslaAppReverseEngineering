package com.plaid.link.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public enum PlaidProduct implements Parcelable {
    ASSETS,
    AUTH,
    DEPOSIT_SWITCH,
    IDENTITY,
    INCOME,
    INVESTMENTS,
    LIABILITIES,
    LIABILITIES_REPORT,
    PAYMENT_INITIATION,
    TRANSACTIONS;
    
    public static final Parcelable.Creator<PlaidProduct> CREATOR = new Parcelable.Creator<PlaidProduct>() { // from class: com.plaid.link.configuration.PlaidProduct.Creator
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlaidProduct createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return PlaidProduct.valueOf(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlaidProduct[] newArray(int i11) {
            return new PlaidProduct[i11];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(name());
    }
}