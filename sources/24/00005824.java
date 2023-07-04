package com.stripe.android.stripe3ds2.init.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;

/* loaded from: classes6.dex */
public abstract class BaseCustomization implements Customization, Parcelable {
    private String mTextColor;
    private String mTextFontName;
    private int mTextFontSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseCustomization() {
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.Customization
    public String getTextColor() {
        return this.mTextColor;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.Customization
    public String getTextFontName() {
        return this.mTextFontName;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.Customization
    public int getTextFontSize() {
        return this.mTextFontSize;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.Customization
    public void setTextColor(String str) {
        this.mTextColor = CustomizeUtils.requireValidColor(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.Customization
    public void setTextFontName(String str) {
        this.mTextFontName = CustomizeUtils.requireValidString(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.Customization
    public void setTextFontSize(int i11) {
        this.mTextFontSize = CustomizeUtils.requireValidFontSize(i11);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.mTextFontName);
        parcel.writeString(this.mTextColor);
        parcel.writeInt(this.mTextFontSize);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseCustomization(Parcel parcel) {
        this.mTextFontName = parcel.readString();
        this.mTextColor = parcel.readString();
        this.mTextFontSize = parcel.readInt();
    }
}