package com.stripe.android.stripe3ds2.init.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import androidx.core.content.b;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.stripe3ds2.utils.ObjectUtils;
import g.a;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import l.d;

/* loaded from: classes6.dex */
public final class StripeUiCustomization implements UiCustomization, Parcelable {
    public static final Parcelable.Creator<StripeUiCustomization> CREATOR = new Parcelable.Creator<StripeUiCustomization>() { // from class: com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeUiCustomization createFromParcel(Parcel parcel) {
            return new StripeUiCustomization(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StripeUiCustomization[] newArray(int i11) {
            return new StripeUiCustomization[i11];
        }
    };
    private String mAccentColor;
    private final Map<String, ButtonCustomization> mCustomButtonTypeCustomization;
    private final Map<UiCustomization.ButtonType, ButtonCustomization> mDefaultButtonTypeCustomizations;
    private LabelCustomization mLabelCustomization;
    private TextBoxCustomization mTextBoxCustomization;
    private ToolbarCustomization mToolbarCustomization;

    public static StripeUiCustomization createWithAppTheme(Activity activity) {
        return new StripeUiCustomization(activity);
    }

    private String getThemeColor(Context context, int i11) {
        int i12;
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i11, typedValue, true)) {
            int i13 = typedValue.resourceId;
            if (i13 != 0) {
                i12 = b.getColor(context, i13);
            } else {
                i12 = typedValue.data;
            }
            return CustomizeUtils.colorIntToHex(i12);
        }
        return null;
    }

    private Context getThemeContext(Activity activity, int i11) {
        TypedValue typedValue = new TypedValue();
        return activity.getTheme().resolveAttribute(i11, typedValue, true) ? new d(activity, typedValue.resourceId) : activity;
    }

    private boolean typedEquals(StripeUiCustomization stripeUiCustomization) {
        return ObjectUtils.equals(this.mToolbarCustomization, stripeUiCustomization.mToolbarCustomization) && ObjectUtils.equals(this.mAccentColor, stripeUiCustomization.mAccentColor) && ObjectUtils.equals(this.mLabelCustomization, stripeUiCustomization.mLabelCustomization) && ObjectUtils.equals(this.mTextBoxCustomization, stripeUiCustomization.mTextBoxCustomization) && ObjectUtils.equals(this.mDefaultButtonTypeCustomizations, stripeUiCustomization.mDefaultButtonTypeCustomizations) && ObjectUtils.equals(this.mCustomButtonTypeCustomization, stripeUiCustomization.mCustomButtonTypeCustomization);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof StripeUiCustomization) && typedEquals((StripeUiCustomization) obj));
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public String getAccentColor() {
        return this.mAccentColor;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public ButtonCustomization getButtonCustomization(UiCustomization.ButtonType buttonType) {
        return this.mDefaultButtonTypeCustomizations.get(buttonType);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public LabelCustomization getLabelCustomization() {
        return this.mLabelCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public TextBoxCustomization getTextBoxCustomization() {
        return this.mTextBoxCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public ToolbarCustomization getToolbarCustomization() {
        return this.mToolbarCustomization;
    }

    public int hashCode() {
        return ObjectUtils.hash(this.mToolbarCustomization, this.mAccentColor, this.mLabelCustomization, this.mTextBoxCustomization, this.mDefaultButtonTypeCustomizations, this.mCustomButtonTypeCustomization);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public void setAccentColor(String str) {
        this.mAccentColor = CustomizeUtils.requireValidColor(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public void setButtonCustomization(ButtonCustomization buttonCustomization, UiCustomization.ButtonType buttonType) {
        this.mDefaultButtonTypeCustomizations.put(buttonType, buttonCustomization);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public void setLabelCustomization(LabelCustomization labelCustomization) {
        this.mLabelCustomization = labelCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) {
        this.mTextBoxCustomization = textBoxCustomization;
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public void setToolbarCustomization(ToolbarCustomization toolbarCustomization) {
        this.mToolbarCustomization = toolbarCustomization;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.mAccentColor);
        parcel.writeParcelable((StripeToolbarCustomization) this.mToolbarCustomization, 0);
        parcel.writeParcelable((StripeLabelCustomization) this.mLabelCustomization, 0);
        parcel.writeParcelable((StripeTextBoxCustomization) this.mTextBoxCustomization, 0);
        Bundle bundle = new Bundle();
        for (Map.Entry<UiCustomization.ButtonType, ButtonCustomization> entry : this.mDefaultButtonTypeCustomizations.entrySet()) {
            bundle.putParcelable(entry.getKey().name(), (StripeButtonCustomization) entry.getValue());
        }
        parcel.writeBundle(bundle);
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, ButtonCustomization> entry2 : this.mCustomButtonTypeCustomization.entrySet()) {
            bundle2.putParcelable(entry2.getKey(), (StripeButtonCustomization) entry2.getValue());
        }
        parcel.writeBundle(bundle2);
    }

    public StripeUiCustomization() {
        this.mDefaultButtonTypeCustomizations = new EnumMap(UiCustomization.ButtonType.class);
        this.mCustomButtonTypeCustomization = new HashMap();
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public ButtonCustomization getButtonCustomization(String str) {
        return this.mCustomButtonTypeCustomization.get(str);
    }

    @Override // com.stripe.android.stripe3ds2.init.ui.UiCustomization
    public void setButtonCustomization(ButtonCustomization buttonCustomization, String str) {
        this.mCustomButtonTypeCustomization.put(str, buttonCustomization);
    }

    private StripeUiCustomization(Activity activity) {
        this();
        Context themeContext = getThemeContext(activity, a.f27044f);
        String themeColor = getThemeColor(activity, 16843827);
        String themeColor2 = getThemeColor(activity, 16843828);
        String themeColor3 = getThemeColor(themeContext, 16842806);
        String themeColor4 = getThemeColor(activity, 16842904);
        String themeColor5 = getThemeColor(activity, 16843829);
        String themeColor6 = getThemeColor(activity, 16842906);
        this.mToolbarCustomization = new StripeToolbarCustomization();
        this.mLabelCustomization = new StripeLabelCustomization();
        StripeTextBoxCustomization stripeTextBoxCustomization = new StripeTextBoxCustomization();
        this.mTextBoxCustomization = stripeTextBoxCustomization;
        if (themeColor6 != null) {
            stripeTextBoxCustomization.setHintTextColor(themeColor6);
        }
        StripeButtonCustomization stripeButtonCustomization = new StripeButtonCustomization();
        StripeButtonCustomization stripeButtonCustomization2 = new StripeButtonCustomization();
        if (themeColor3 != null) {
            this.mToolbarCustomization.setTextColor(themeColor3);
            stripeButtonCustomization.setTextColor(themeColor3);
        }
        if (themeColor != null) {
            this.mToolbarCustomization.setBackgroundColor(themeColor);
        }
        if (themeColor2 != null) {
            this.mToolbarCustomization.setStatusBarColor(themeColor2);
        }
        if (themeColor4 != null) {
            this.mLabelCustomization.setTextColor(themeColor4);
            this.mLabelCustomization.setHeadingTextColor(themeColor4);
            stripeButtonCustomization2.setTextColor(themeColor4);
            this.mTextBoxCustomization.setTextColor(themeColor4);
        }
        if (themeColor5 != null) {
            setAccentColor(themeColor5);
            StripeButtonCustomization stripeButtonCustomization3 = new StripeButtonCustomization();
            stripeButtonCustomization3.setTextColor(themeColor5);
            setButtonCustomization(stripeButtonCustomization3, UiCustomization.ButtonType.RESEND);
            stripeButtonCustomization2.setBackgroundColor(themeColor5);
        }
        setButtonCustomization(stripeButtonCustomization, UiCustomization.ButtonType.CANCEL);
        setButtonCustomization(stripeButtonCustomization2, UiCustomization.ButtonType.NEXT);
        setButtonCustomization(stripeButtonCustomization2, UiCustomization.ButtonType.CONTINUE);
        setButtonCustomization(stripeButtonCustomization2, UiCustomization.ButtonType.SUBMIT);
        setButtonCustomization(stripeButtonCustomization2, UiCustomization.ButtonType.SELECT);
    }

    private StripeUiCustomization(Parcel parcel) {
        this.mAccentColor = parcel.readString();
        this.mToolbarCustomization = (ToolbarCustomization) parcel.readParcelable(StripeToolbarCustomization.class.getClassLoader());
        this.mLabelCustomization = (LabelCustomization) parcel.readParcelable(StripeLabelCustomization.class.getClassLoader());
        this.mTextBoxCustomization = (TextBoxCustomization) parcel.readParcelable(StripeTextBoxCustomization.class.getClassLoader());
        this.mDefaultButtonTypeCustomizations = new HashMap();
        Bundle readBundle = parcel.readBundle(StripeUiCustomization.class.getClassLoader());
        if (readBundle != null) {
            for (String str : readBundle.keySet()) {
                ButtonCustomization buttonCustomization = (ButtonCustomization) readBundle.getParcelable(str);
                if (buttonCustomization != null) {
                    this.mDefaultButtonTypeCustomizations.put(UiCustomization.ButtonType.valueOf(str), buttonCustomization);
                }
            }
        }
        this.mCustomButtonTypeCustomization = new HashMap();
        Bundle readBundle2 = parcel.readBundle(StripeUiCustomization.class.getClassLoader());
        if (readBundle2 != null) {
            for (String str2 : readBundle2.keySet()) {
                ButtonCustomization buttonCustomization2 = (ButtonCustomization) readBundle2.getParcelable(str2);
                if (buttonCustomization2 != null) {
                    this.mCustomButtonTypeCustomization.put(str2, buttonCustomization2);
                }
            }
        }
    }
}