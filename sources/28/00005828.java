package com.stripe.android.stripe3ds2.init.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;

/* loaded from: classes6.dex */
public final class StripeButtonCustomization extends BaseCustomization implements ButtonCustomization {
    public static final Parcelable.Creator<StripeButtonCustomization> CREATOR = new Parcelable.Creator<StripeButtonCustomization>() { // from class: com.stripe.android.stripe3ds2.init.ui.StripeButtonCustomization.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeButtonCustomization createFromParcel(Parcel parcel) {
            return new StripeButtonCustomization(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeButtonCustomization[] newArray(int i11) {
            return new StripeButtonCustomization[i11];
        }
    };
    private String mBackgroundColor;
    private int mCornerRadius;

    private boolean typedEquals(StripeButtonCustomization stripeButtonCustomization) {
        return ObjectUtils.equals(this.mBackgroundColor, stripeButtonCustomization.mBackgroundColor) && this.mCornerRadius == stripeButtonCustomization.mCornerRadius;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StripeButtonCustomization) && typedEquals((StripeButtonCustomization) obj));
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.ButtonCustomization
    public String getBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.ButtonCustomization
    public int getCornerRadius() {
        return this.mCornerRadius;
    }

    public int hashCode() {
        return ObjectUtils.hash(this.mBackgroundColor, Integer.valueOf(this.mCornerRadius));
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.ButtonCustomization
    public void setBackgroundColor(String str) {
        this.mBackgroundColor = CustomizeUtils.requireValidColor(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.ButtonCustomization
    public void setCornerRadius(int i11) {
        this.mCornerRadius = CustomizeUtils.requireValidDimension(i11);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.BaseCustomization, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.mBackgroundColor);
        parcel.writeInt(this.mCornerRadius);
    }

    public StripeButtonCustomization() {
    }

    private StripeButtonCustomization(Parcel parcel) {
        super(parcel);
        this.mBackgroundColor = parcel.readString();
        this.mCornerRadius = parcel.readInt();
    }
}