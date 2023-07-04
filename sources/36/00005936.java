package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneTextViewBinding;
import com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ChallengeZoneTextView extends LinearLayout implements FormField {
    private final TextInputLayout infoLabel;
    private final TextInputEditText textEntryView;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneTextView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ ChallengeZoneTextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public final TextInputLayout getInfoLabel$3ds2sdk_release() {
        return this.infoLabel;
    }

    public final TextInputEditText getTextEntryView$3ds2sdk_release() {
        return this.textEntryView;
    }

    @Override // com.stripe.android.stripe3ds2.views.FormField
    public String getUserEntry() {
        Editable text = this.textEntryView.getText();
        String obj = text == null ? null : text.toString();
        return obj == null ? "" : obj;
    }

    public final void setText(String text) {
        s.g(text, "text");
        this.textEntryView.setText(text);
    }

    public final void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) {
        if (textBoxCustomization == null) {
            return;
        }
        String textColor = textBoxCustomization.getTextColor();
        if (textColor != null) {
            getTextEntryView$3ds2sdk_release().setTextColor(Color.parseColor(textColor));
        }
        Integer valueOf = Integer.valueOf(textBoxCustomization.getTextFontSize());
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            getTextEntryView$3ds2sdk_release().setTextSize(2, valueOf.intValue());
        }
        if (textBoxCustomization.getCornerRadius() >= 0) {
            float cornerRadius = textBoxCustomization.getCornerRadius();
            this.infoLabel.setBoxCornerRadii(cornerRadius, cornerRadius, cornerRadius, cornerRadius);
        }
        String borderColor = textBoxCustomization.getBorderColor();
        if (borderColor != null) {
            getInfoLabel$3ds2sdk_release().setBoxBackgroundMode(2);
            getInfoLabel$3ds2sdk_release().setBoxStrokeColor(Color.parseColor(borderColor));
        }
        String hintTextColor = textBoxCustomization.getHintTextColor();
        if (hintTextColor == null) {
            return;
        }
        getInfoLabel$3ds2sdk_release().setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(hintTextColor)));
    }

    public final void setTextEntryLabel(String str) {
        this.infoLabel.setHint(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneTextView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        StripeChallengeZoneTextViewBinding inflate = StripeChallengeZoneTextViewBinding.inflate(LayoutInflater.from(context), this, true);
        s.f(inflate, "inflate(\n            Lay…           true\n        )");
        TextInputLayout textInputLayout = inflate.label;
        s.f(textInputLayout, "viewBinding.label");
        this.infoLabel = textInputLayout;
        TextInputEditText textInputEditText = inflate.textEntry;
        s.f(textInputEditText, "viewBinding.textEntry");
        this.textEntryView = textInputEditText;
    }
}