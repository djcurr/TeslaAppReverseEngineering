package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class AccountRange implements StripeModel {
    public static final int $stable = 0;
    public static final Parcelable.Creator<AccountRange> CREATOR = new Creator();
    private final BinRange binRange;
    private final BrandInfo brandInfo;
    private final String country;
    private final int panLength;

    /* loaded from: classes6.dex */
    public enum BrandInfo {
        Visa("VISA", CardBrand.Visa),
        Mastercard("MASTERCARD", CardBrand.MasterCard),
        AmericanExpress("AMERICAN_EXPRESS", CardBrand.AmericanExpress),
        JCB("JCB", CardBrand.JCB),
        DinersClub("DINERS_CLUB", CardBrand.DinersClub),
        Discover("DISCOVER", CardBrand.Discover),
        UnionPay("UNIONPAY", CardBrand.UnionPay);
        
        private final CardBrand brand;
        private final String brandName;

        BrandInfo(String str, CardBrand cardBrand) {
            this.brandName = str;
            this.brand = cardBrand;
        }

        public final CardBrand getBrand() {
            return this.brand;
        }

        public final String getBrandName() {
            return this.brandName;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<AccountRange> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountRange createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new AccountRange(BinRange.CREATOR.createFromParcel(parcel), parcel.readInt(), BrandInfo.valueOf(parcel.readString()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AccountRange[] newArray(int i11) {
            return new AccountRange[i11];
        }
    }

    public AccountRange(BinRange binRange, int i11, BrandInfo brandInfo, String str) {
        s.g(binRange, "binRange");
        s.g(brandInfo, "brandInfo");
        this.binRange = binRange;
        this.panLength = i11;
        this.brandInfo = brandInfo;
        this.country = str;
    }

    public static /* synthetic */ AccountRange copy$default(AccountRange accountRange, BinRange binRange, int i11, BrandInfo brandInfo, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            binRange = accountRange.binRange;
        }
        if ((i12 & 2) != 0) {
            i11 = accountRange.panLength;
        }
        if ((i12 & 4) != 0) {
            brandInfo = accountRange.brandInfo;
        }
        if ((i12 & 8) != 0) {
            str = accountRange.country;
        }
        return accountRange.copy(binRange, i11, brandInfo, str);
    }

    public final BinRange component1() {
        return this.binRange;
    }

    public final int component2() {
        return this.panLength;
    }

    public final BrandInfo component3() {
        return this.brandInfo;
    }

    public final String component4() {
        return this.country;
    }

    public final AccountRange copy(BinRange binRange, int i11, BrandInfo brandInfo, String str) {
        s.g(binRange, "binRange");
        s.g(brandInfo, "brandInfo");
        return new AccountRange(binRange, i11, brandInfo, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccountRange) {
            AccountRange accountRange = (AccountRange) obj;
            return s.c(this.binRange, accountRange.binRange) && this.panLength == accountRange.panLength && this.brandInfo == accountRange.brandInfo && s.c(this.country, accountRange.country);
        }
        return false;
    }

    public final BinRange getBinRange() {
        return this.binRange;
    }

    public final CardBrand getBrand() {
        return this.brandInfo.getBrand();
    }

    public final BrandInfo getBrandInfo() {
        return this.brandInfo;
    }

    public final String getCountry() {
        return this.country;
    }

    public final int getPanLength() {
        return this.panLength;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((this.binRange.hashCode() * 31) + Integer.hashCode(this.panLength)) * 31) + this.brandInfo.hashCode()) * 31;
        String str = this.country;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "AccountRange(binRange=" + this.binRange + ", panLength=" + this.panLength + ", brandInfo=" + this.brandInfo + ", country=" + ((Object) this.country) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        this.binRange.writeToParcel(out, i11);
        out.writeInt(this.panLength);
        out.writeString(this.brandInfo.name());
        out.writeString(this.country);
    }

    public /* synthetic */ AccountRange(BinRange binRange, int i11, BrandInfo brandInfo, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(binRange, i11, brandInfo, (i12 & 8) != 0 ? null : str);
    }
}