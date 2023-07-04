package com.stripe.android.stripe3ds2.init.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;

/* loaded from: classes6.dex */
public final class StripeLabelCustomization extends BaseCustomization implements LabelCustomization {
    public static final Parcelable.Creator<StripeLabelCustomization> CREATOR = new Parcelable.Creator<StripeLabelCustomization>() { // from class: com.stripe.android.stripe3ds2.init.ui.StripeLabelCustomization.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeLabelCustomization createFromParcel(Parcel parcel) {
            return new StripeLabelCustomization(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeLabelCustomization[] newArray(int i11) {
            return new StripeLabelCustomization[i11];
        }
    };
    private String mHeadingTextColor;
    private String mHeadingTextFontName;
    private int mHeadingTextFontSize;

    private boolean typedEquals(StripeLabelCustomization stripeLabelCustomization) {
        return ObjectUtils.equals(this.mHeadingTextColor, stripeLabelCustomization.mHeadingTextColor) && ObjectUtils.equals(this.mHeadingTextFontName, stripeLabelCustomization.mHeadingTextFontName) && this.mHeadingTextFontSize == stripeLabelCustomization.mHeadingTextFontSize;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StripeLabelCustomization) && typedEquals((StripeLabelCustomization) obj));
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.LabelCustomization
    public String getHeadingTextColor() {
        return this.mHeadingTextColor;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.LabelCustomization
    public String getHeadingTextFontName() {
        return this.mHeadingTextFontName;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.LabelCustomization
    public int getHeadingTextFontSize() {
        return this.mHeadingTextFontSize;
    }

    public int hashCode() {
        return ObjectUtils.hash(this.mHeadingTextColor, this.mHeadingTextFontName, Integer.valueOf(this.mHeadingTextFontSize));
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.LabelCustomization
    public void setHeadingTextColor(String str) {
        this.mHeadingTextColor = CustomizeUtils.requireValidColor(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.LabelCustomization
    public void setHeadingTextFontName(String str) {
        this.mHeadingTextFontName = CustomizeUtils.requireValidString(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.LabelCustomization
    public void setHeadingTextFontSize(int i11) {
        this.mHeadingTextFontSize = CustomizeUtils.requireValidFontSize(i11);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.BaseCustomization, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        super.writeToParcel(parcel, i11);
        parcel.writeString(this.mHeadingTextColor);
        parcel.writeString(this.mHeadingTextFontName);
        parcel.writeInt(this.mHeadingTextFontSize);
    }

    public StripeLabelCustomization() {
    }

    private StripeLabelCustomization(Parcel parcel) {
        super(parcel);
        this.mHeadingTextColor = parcel.readString();
        this.mHeadingTextFontName = parcel.readString();
        this.mHeadingTextFontSize = parcel.readInt();
    }
}