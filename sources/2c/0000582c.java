package com.stripe.android.stripe3ds2.init.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;

/* loaded from: classes6.dex */
public final class StripeTextBoxCustomization extends BaseCustomization implements TextBoxCustomization {
    public static final Parcelable.Creator<StripeTextBoxCustomization> CREATOR = new Parcelable.Creator<StripeTextBoxCustomization>() { // from class: com.stripe.android.stripe3ds2.init.ui.StripeTextBoxCustomization.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeTextBoxCustomization createFromParcel(Parcel parcel) {
            return new StripeTextBoxCustomization(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeTextBoxCustomization[] newArray(int i11) {
            return new StripeTextBoxCustomization[i11];
        }
    };
    private String mBorderColor;
    private int mBorderWidth;
    private int mCornerRadius;
    private String mHintTextColor;

    private boolean typedEquals(StripeTextBoxCustomization stripeTextBoxCustomization) {
        return this.mBorderWidth == stripeTextBoxCustomization.mBorderWidth && ObjectUtils.equals(this.mBorderColor, stripeTextBoxCustomization.mBorderColor) && this.mCornerRadius == stripeTextBoxCustomization.mCornerRadius && ObjectUtils.equals(this.mHintTextColor, stripeTextBoxCustomization.mHintTextColor);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StripeTextBoxCustomization) && typedEquals((StripeTextBoxCustomization) obj));
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization
    public String getBorderColor() {
        return this.mBorderColor;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization
    public int getBorderWidth() {
        return this.mBorderWidth;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization
    public int getCornerRadius() {
        return this.mCornerRadius;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization
    public String getHintTextColor() {
        return this.mHintTextColor;
    }

    public int hashCode() {
        return ObjectUtils.hash(Integer.valueOf(this.mBorderWidth), this.mBorderColor, Integer.valueOf(this.mCornerRadius), this.mHintTextColor);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization
    public void setBorderColor(String str) {
        this.mBorderColor = CustomizeUtils.requireValidColor(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization
    public void setBorderWidth(int i11) {
        this.mBorderWidth = CustomizeUtils.requireValidDimension(i11);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization
    public void setCornerRadius(int i11) {
        this.mCornerRadius = CustomizeUtils.requireValidDimension(i11);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization
    public void setHintTextColor(String str) {
        this.mHintTextColor = CustomizeUtils.requireValidColor(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.BaseCustomization, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeInt(this.mBorderWidth);
        parcel.writeString(this.mBorderColor);
        parcel.writeInt(this.mCornerRadius);
        parcel.writeString(this.mHintTextColor);
    }

    public StripeTextBoxCustomization() {
    }

    private StripeTextBoxCustomization(Parcel parcel) {
        super(parcel);
        this.mBorderWidth = parcel.readInt();
        this.mBorderColor = parcel.readString();
        this.mCornerRadius = parcel.readInt();
        this.mHintTextColor = parcel.readString();
    }
}