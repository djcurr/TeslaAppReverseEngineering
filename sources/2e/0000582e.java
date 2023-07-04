package com.stripe.android.stripe3ds2.init.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;

/* loaded from: classes6.dex */
public final class StripeToolbarCustomization extends BaseCustomization implements ToolbarCustomization {
    public static final Parcelable.Creator<StripeToolbarCustomization> CREATOR = new Parcelable.Creator<StripeToolbarCustomization>() { // from class: com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeToolbarCustomization createFromParcel(Parcel parcel) {
            return new StripeToolbarCustomization(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeToolbarCustomization[] newArray(int i11) {
            return new StripeToolbarCustomization[i11];
        }
    };
    private String mBackgroundColor;
    private String mButtonText;
    private String mHeaderText;
    private String mStatusBarColor;

    private boolean typedEquals(StripeToolbarCustomization stripeToolbarCustomization) {
        return ObjectUtils.equals(this.mBackgroundColor, stripeToolbarCustomization.mBackgroundColor) && ObjectUtils.equals(this.mStatusBarColor, stripeToolbarCustomization.mStatusBarColor) && ObjectUtils.equals(this.mHeaderText, stripeToolbarCustomization.mHeaderText) && ObjectUtils.equals(this.mButtonText, stripeToolbarCustomization.mButtonText);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StripeToolbarCustomization) && typedEquals((StripeToolbarCustomization) obj));
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization
    public String getBackgroundColor() {
        return this.mBackgroundColor;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization
    public String getButtonText() {
        return this.mButtonText;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization
    public String getHeaderText() {
        return this.mHeaderText;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization
    public String getStatusBarColor() {
        return this.mStatusBarColor;
    }

    public int hashCode() {
        return ObjectUtils.hash(this.mBackgroundColor, this.mStatusBarColor, this.mHeaderText, this.mButtonText);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization
    public void setBackgroundColor(String str) {
        this.mBackgroundColor = CustomizeUtils.requireValidColor(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization
    public void setButtonText(String str) {
        this.mButtonText = CustomizeUtils.requireValidString(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization
    public void setHeaderText(String str) {
        this.mHeaderText = CustomizeUtils.requireValidString(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization
    public void setStatusBarColor(String str) {
        this.mStatusBarColor = CustomizeUtils.requireValidColor(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.BaseCustomization, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.mBackgroundColor);
        parcel.writeString(this.mStatusBarColor);
        parcel.writeString(this.mHeaderText);
        parcel.writeString(this.mButtonText);
    }

    public StripeToolbarCustomization() {
    }

    private StripeToolbarCustomization(Parcel parcel) {
        super(parcel);
        this.mBackgroundColor = parcel.readString();
        this.mStatusBarColor = parcel.readString();
        this.mHeaderText = parcel.readString();
        this.mButtonText = parcel.readString();
    }
}