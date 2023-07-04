package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneViewBinding;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ChallengeZoneView extends LinearLayout {
    private final FrameLayout challengeEntryView;
    private final ThreeDS2HeaderTextView infoHeader;
    private final ThreeDS2TextView infoTextView;
    private final ThreeDS2Button resendButton;
    private final ThreeDS2Button submitButton;
    private final RadioButton whitelistNoRadioButton;
    private final RadioGroup whitelistRadioGroup;
    private final RadioButton whitelistYesRadioButton;
    private final ThreeDS2TextView whitelistingLabel;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ ChallengeZoneView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    public static /* synthetic */ void setInfoHeaderText$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            labelCustomization = null;
        }
        challengeZoneView.setInfoHeaderText(str, labelCustomization);
    }

    public static /* synthetic */ void setInfoText$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            labelCustomization = null;
        }
        challengeZoneView.setInfoText(str, labelCustomization);
    }

    public static /* synthetic */ void setResendButtonLabel$default(ChallengeZoneView challengeZoneView, String str, ButtonCustomization buttonCustomization, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setResendButtonLabel(str, buttonCustomization);
    }

    public static /* synthetic */ void setSubmitButton$default(ChallengeZoneView challengeZoneView, String str, ButtonCustomization buttonCustomization, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setSubmitButton(str, buttonCustomization);
    }

    public static /* synthetic */ void setWhitelistingLabel$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, ButtonCustomization buttonCustomization, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            labelCustomization = null;
        }
        if ((i11 & 4) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setWhitelistingLabel(str, labelCustomization, buttonCustomization);
    }

    public final FrameLayout getChallengeEntryView$3ds2sdk_release() {
        return this.challengeEntryView;
    }

    public final ThreeDS2HeaderTextView getInfoHeader$3ds2sdk_release() {
        return this.infoHeader;
    }

    public final ThreeDS2TextView getInfoTextView$3ds2sdk_release() {
        return this.infoTextView;
    }

    public final ThreeDS2Button getResendButton$3ds2sdk_release() {
        return this.resendButton;
    }

    public final ThreeDS2Button getSubmitButton$3ds2sdk_release() {
        return this.submitButton;
    }

    public final RadioButton getWhitelistNoRadioButton$3ds2sdk_release() {
        return this.whitelistNoRadioButton;
    }

    public final RadioGroup getWhitelistRadioGroup$3ds2sdk_release() {
        return this.whitelistRadioGroup;
    }

    public final RadioButton getWhitelistYesRadioButton$3ds2sdk_release() {
        return this.whitelistYesRadioButton;
    }

    public final ThreeDS2TextView getWhitelistingLabel$3ds2sdk_release() {
        return this.whitelistingLabel;
    }

    public final boolean getWhitelistingSelection$3ds2sdk_release() {
        return this.whitelistRadioGroup.getCheckedRadioButtonId() == R.id.czv_whitelist_yes_button;
    }

    public final void setChallengeEntryView(View challengeEntryView) {
        s.g(challengeEntryView, "challengeEntryView");
        this.challengeEntryView.addView(challengeEntryView);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setInfoHeaderText(java.lang.String r2, com.stripe.android.stripe3ds2.init.ui.LabelCustomization r3) {
        /*
            r1 = this;
            if (r2 == 0) goto Lb
            boolean r0 = kotlin.text.m.w(r2)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            if (r0 == 0) goto L16
            com.stripe.android.stripe3ds2.views.ThreeDS2HeaderTextView r2 = r1.infoHeader
            r3 = 8
            r2.setVisibility(r3)
            goto L1b
        L16:
            com.stripe.android.stripe3ds2.views.ThreeDS2HeaderTextView r0 = r1.infoHeader
            r0.setText(r2, r3)
        L1b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.ChallengeZoneView.setInfoHeaderText(java.lang.String, com.stripe.android.stripe3ds2.init.ui.LabelCustomization):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setInfoText(java.lang.String r2, com.stripe.android.stripe3ds2.init.ui.LabelCustomization r3) {
        /*
            r1 = this;
            if (r2 == 0) goto Lb
            boolean r0 = kotlin.text.m.w(r2)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            if (r0 == 0) goto L16
            com.stripe.android.stripe3ds2.views.ThreeDS2TextView r2 = r1.infoTextView
            r3 = 8
            r2.setVisibility(r3)
            goto L1b
        L16:
            com.stripe.android.stripe3ds2.views.ThreeDS2TextView r0 = r1.infoTextView
            r0.setText(r2, r3)
        L1b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.ChallengeZoneView.setInfoText(java.lang.String, com.stripe.android.stripe3ds2.init.ui.LabelCustomization):void");
    }

    public final void setInfoTextIndicator(int i11) {
        this.infoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(i11, 0, 0, 0);
    }

    public final void setResendButtonClickListener(View.OnClickListener onClickListener) {
        this.resendButton.setOnClickListener(onClickListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setResendButtonLabel(java.lang.String r3, com.stripe.android.stripe3ds2.init.ui.ButtonCustomization r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto Lc
            boolean r1 = kotlin.text.m.w(r3)
            if (r1 == 0) goto La
            goto Lc
        La:
            r1 = r0
            goto Ld
        Lc:
            r1 = 1
        Ld:
            if (r1 != 0) goto L1e
            com.stripe.android.stripe3ds2.views.ThreeDS2Button r1 = r2.resendButton
            r1.setVisibility(r0)
            com.stripe.android.stripe3ds2.views.ThreeDS2Button r0 = r2.resendButton
            r0.setText(r3)
            com.stripe.android.stripe3ds2.views.ThreeDS2Button r3 = r2.resendButton
            r3.setButtonCustomization(r4)
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.ChallengeZoneView.setResendButtonLabel(java.lang.String, com.stripe.android.stripe3ds2.init.ui.ButtonCustomization):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setSubmitButton(java.lang.String r2, com.stripe.android.stripe3ds2.init.ui.ButtonCustomization r3) {
        /*
            r1 = this;
            if (r2 == 0) goto Lb
            boolean r0 = kotlin.text.m.w(r2)
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            if (r0 == 0) goto L16
            com.stripe.android.stripe3ds2.views.ThreeDS2Button r2 = r1.submitButton
            r3 = 8
            r2.setVisibility(r3)
            goto L20
        L16:
            com.stripe.android.stripe3ds2.views.ThreeDS2Button r0 = r1.submitButton
            r0.setText(r2)
            com.stripe.android.stripe3ds2.views.ThreeDS2Button r2 = r1.submitButton
            r2.setButtonCustomization(r3)
        L20:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.ChallengeZoneView.setSubmitButton(java.lang.String, com.stripe.android.stripe3ds2.init.ui.ButtonCustomization):void");
    }

    public final void setSubmitButtonClickListener(View.OnClickListener onClickListener) {
        this.submitButton.setOnClickListener(onClickListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setWhitelistingLabel(java.lang.String r5, com.stripe.android.stripe3ds2.init.ui.LabelCustomization r6, com.stripe.android.stripe3ds2.init.ui.ButtonCustomization r7) {
        /*
            r4 = this;
            r0 = 1
            r1 = 0
            if (r5 == 0) goto Ld
            boolean r2 = kotlin.text.m.w(r5)
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            r2 = r1
            goto Le
        Ld:
            r2 = r0
        Le:
            if (r2 != 0) goto La7
            com.stripe.android.stripe3ds2.views.ThreeDS2TextView r2 = r4.whitelistingLabel
            r2.setText(r5, r6)
            if (r7 == 0) goto L9d
            android.widget.RadioGroup r5 = r4.whitelistRadioGroup
            int r5 = r5.getChildCount()
            m00.i r5 = m00.j.r(r1, r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L2a:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L4e
            r2 = r5
            wz.n0 r2 = (wz.n0) r2
            int r2 = r2.a()
            android.widget.RadioGroup r3 = r4.getWhitelistRadioGroup$3ds2sdk_release()
            android.view.View r2 = r3.getChildAt(r2)
            boolean r3 = r2 instanceof android.widget.RadioButton
            if (r3 == 0) goto L46
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
            goto L47
        L46:
            r2 = 0
        L47:
            if (r2 != 0) goto L4a
            goto L2a
        L4a:
            r6.add(r2)
            goto L2a
        L4e:
            java.util.Iterator r5 = r6.iterator()
        L52:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L9d
            java.lang.Object r6 = r5.next()
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            java.lang.String r2 = r7.getBackgroundColor()
            if (r2 == 0) goto L6d
            boolean r2 = kotlin.text.m.w(r2)
            if (r2 == 0) goto L6b
            goto L6d
        L6b:
            r2 = r1
            goto L6e
        L6d:
            r2 = r0
        L6e:
            if (r2 != 0) goto L7f
            java.lang.String r2 = r7.getBackgroundColor()
            int r2 = android.graphics.Color.parseColor(r2)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            androidx.core.widget.c.c(r6, r2)
        L7f:
            java.lang.String r2 = r7.getTextColor()
            if (r2 == 0) goto L8e
            boolean r2 = kotlin.text.m.w(r2)
            if (r2 == 0) goto L8c
            goto L8e
        L8c:
            r2 = r1
            goto L8f
        L8e:
            r2 = r0
        L8f:
            if (r2 != 0) goto L52
            java.lang.String r2 = r7.getTextColor()
            int r2 = android.graphics.Color.parseColor(r2)
            r6.setTextColor(r2)
            goto L52
        L9d:
            com.stripe.android.stripe3ds2.views.ThreeDS2TextView r5 = r4.whitelistingLabel
            r5.setVisibility(r1)
            android.widget.RadioGroup r5 = r4.whitelistRadioGroup
            r5.setVisibility(r1)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.ChallengeZoneView.setWhitelistingLabel(java.lang.String, com.stripe.android.stripe3ds2.init.ui.LabelCustomization, com.stripe.android.stripe3ds2.init.ui.ButtonCustomization):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        StripeChallengeZoneViewBinding inflate = StripeChallengeZoneViewBinding.inflate(LayoutInflater.from(context), this);
        s.f(inflate, "inflate(\n            Lay…           this\n        )");
        ThreeDS2HeaderTextView threeDS2HeaderTextView = inflate.czvHeader;
        s.f(threeDS2HeaderTextView, "viewBinding.czvHeader");
        this.infoHeader = threeDS2HeaderTextView;
        ThreeDS2TextView threeDS2TextView = inflate.czvInfo;
        s.f(threeDS2TextView, "viewBinding.czvInfo");
        this.infoTextView = threeDS2TextView;
        ThreeDS2Button threeDS2Button = inflate.czvSubmitButton;
        s.f(threeDS2Button, "viewBinding.czvSubmitButton");
        this.submitButton = threeDS2Button;
        ThreeDS2Button threeDS2Button2 = inflate.czvResendButton;
        s.f(threeDS2Button2, "viewBinding.czvResendButton");
        this.resendButton = threeDS2Button2;
        ThreeDS2TextView threeDS2TextView2 = inflate.czvWhitelistingLabel;
        s.f(threeDS2TextView2, "viewBinding.czvWhitelistingLabel");
        this.whitelistingLabel = threeDS2TextView2;
        RadioGroup radioGroup = inflate.czvWhitelistRadioGroup;
        s.f(radioGroup, "viewBinding.czvWhitelistRadioGroup");
        this.whitelistRadioGroup = radioGroup;
        FrameLayout frameLayout = inflate.czvEntryView;
        s.f(frameLayout, "viewBinding.czvEntryView");
        this.challengeEntryView = frameLayout;
        RadioButton radioButton = inflate.czvWhitelistYesButton;
        s.f(radioButton, "viewBinding.czvWhitelistYesButton");
        this.whitelistYesRadioButton = radioButton;
        RadioButton radioButton2 = inflate.czvWhitelistNoButton;
        s.f(radioButton2, "viewBinding.czvWhitelistNoButton");
        this.whitelistNoRadioButton = radioButton2;
    }
}