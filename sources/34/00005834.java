package com.stripe.android.stripe3ds2.init.ui;

/* loaded from: classes6.dex */
public interface UiCustomization {

    /* loaded from: classes6.dex */
    public enum ButtonType {
        SUBMIT,
        CONTINUE,
        NEXT,
        CANCEL,
        RESEND,
        SELECT
    }

    String getAccentColor();

    ButtonCustomization getButtonCustomization(ButtonType buttonType);

    ButtonCustomization getButtonCustomization(String str);

    LabelCustomization getLabelCustomization();

    TextBoxCustomization getTextBoxCustomization();

    ToolbarCustomization getToolbarCustomization();

    void setAccentColor(String str);

    void setButtonCustomization(ButtonCustomization buttonCustomization, ButtonType buttonType);

    void setButtonCustomization(ButtonCustomization buttonCustomization, String str);

    void setLabelCustomization(LabelCustomization labelCustomization);

    void setTextBoxCustomization(TextBoxCustomization textBoxCustomization);

    void setToolbarCustomization(ToolbarCustomization toolbarCustomization);
}