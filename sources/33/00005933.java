package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneMultiSelectViewBinding;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneSingleSelectViewBinding;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.e0;
import wz.n0;
import wz.x;

/* loaded from: classes6.dex */
public final class ChallengeZoneSelectView extends FrameLayout implements FormField {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String STATE_SELECTED_INDEXED = "state_selected_indexes";
    @Deprecated
    private static final String STATE_SUPER = "state_super";
    private final int buttonBottomMargin;
    private final int buttonLabelPadding;
    private final int buttonMinHeight;
    private final int buttonOffsetMargin;
    private final ThreeDS2TextView infoLabel;
    private final boolean isSingleSelectMode;
    private final LinearLayout selectGroup;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneSelectView(Context context) {
        this(context, null, 0, false, 14, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, false, 8, null);
        s.g(context, "context");
    }

    public /* synthetic */ ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? false : z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:
        if (r1 != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.widget.CompoundButton buildButton$3ds2sdk_release(com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.ChallengeSelectOption r5, com.stripe.android.stripe3ds2.init.ui.ButtonCustomization r6, boolean r7) {
        /*
            r4 = this;
            java.lang.String r0 = "option"
            kotlin.jvm.internal.s.g(r5, r0)
            boolean r0 = r4.isSingleSelectMode
            if (r0 == 0) goto L13
            sk.a r0 = new sk.a
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
            goto L1c
        L13:
            com.google.android.material.checkbox.MaterialCheckBox r0 = new com.google.android.material.checkbox.MaterialCheckBox
            android.content.Context r1 = r4.getContext()
            r0.<init>(r1)
        L1c:
            if (r6 == 0) goto L5b
            java.lang.String r1 = r6.getBackgroundColor()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2f
            boolean r1 = kotlin.text.m.w(r1)
            if (r1 == 0) goto L2d
            goto L2f
        L2d:
            r1 = r2
            goto L30
        L2f:
            r1 = r3
        L30:
            if (r1 != 0) goto L41
            java.lang.String r1 = r6.getBackgroundColor()
            int r1 = android.graphics.Color.parseColor(r1)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            androidx.core.widget.c.c(r0, r1)
        L41:
            java.lang.String r1 = r6.getTextColor()
            if (r1 == 0) goto L4d
            boolean r1 = kotlin.text.m.w(r1)
            if (r1 == 0) goto L4e
        L4d:
            r2 = r3
        L4e:
            if (r2 != 0) goto L5b
            java.lang.String r6 = r6.getTextColor()
            int r6 = android.graphics.Color.parseColor(r6)
            r0.setTextColor(r6)
        L5b:
            int r6 = android.view.View.generateViewId()
            r0.setId(r6)
            r0.setTag(r5)
            java.lang.String r5 = r5.getText()
            r0.setText(r5)
            int r5 = r4.buttonLabelPadding
            int r6 = r0.getPaddingTop()
            int r1 = r0.getPaddingRight()
            int r2 = r0.getPaddingBottom()
            r0.setPadding(r5, r6, r1, r2)
            int r5 = r4.buttonMinHeight
            r0.setMinimumHeight(r5)
            android.widget.RadioGroup$LayoutParams r5 = new android.widget.RadioGroup$LayoutParams
            r6 = -1
            r1 = -2
            r5.<init>(r6, r1)
            if (r7 != 0) goto L8f
            int r6 = r4.buttonBottomMargin
            r5.bottomMargin = r6
        L8f:
            int r6 = r4.buttonOffsetMargin
            r5.leftMargin = r6
            r0.setLayoutParams(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.ChallengeZoneSelectView.buildButton$3ds2sdk_release(com.stripe.android.stripe3ds2.transactions.ChallengeResponseData$ChallengeSelectOption, com.stripe.android.stripe3ds2.init.ui.ButtonCustomization, boolean):android.widget.CompoundButton");
    }

    public final List<CheckBox> getCheckBoxes() {
        m00.i r11;
        int t11;
        if (this.isSingleSelectMode) {
            return null;
        }
        r11 = m00.l.r(0, this.selectGroup.getChildCount());
        t11 = x.t(r11, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            View childAt = getSelectGroup$3ds2sdk_release().getChildAt(((n0) it2).a());
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.CheckBox");
            arrayList.add((CheckBox) childAt);
        }
        return arrayList;
    }

    public final ThreeDS2TextView getInfoLabel$3ds2sdk_release() {
        return this.infoLabel;
    }

    public final LinearLayout getSelectGroup$3ds2sdk_release() {
        return this.selectGroup;
    }

    public final List<Integer> getSelectedIndexes$3ds2sdk_release() {
        m00.i r11;
        List<Integer> H0;
        r11 = m00.l.r(0, this.selectGroup.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            int a11 = ((n0) it2).a();
            View childAt = getSelectGroup$3ds2sdk_release().getChildAt(a11);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
            Integer valueOf = ((CompoundButton) childAt).isChecked() ? Integer.valueOf(a11) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        H0 = e0.H0(arrayList, this.isSingleSelectMode ? 1 : arrayList.size());
        return H0;
    }

    public final List<ChallengeResponseData.ChallengeSelectOption> getSelectedOptions() {
        int t11;
        List<Integer> selectedIndexes$3ds2sdk_release = getSelectedIndexes$3ds2sdk_release();
        t11 = x.t(selectedIndexes$3ds2sdk_release, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (Number number : selectedIndexes$3ds2sdk_release) {
            Object tag = getSelectGroup$3ds2sdk_release().getChildAt(number.intValue()).getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.ChallengeSelectOption");
            arrayList.add((ChallengeResponseData.ChallengeSelectOption) tag);
        }
        return arrayList;
    }

    @Override // com.stripe.android.stripe3ds2.views.FormField
    public String getUserEntry() {
        String l02;
        l02 = e0.l0(getSelectedOptions(), ",", null, null, 0, null, ChallengeZoneSelectView$userEntry$1.INSTANCE, 30, null);
        return l02;
    }

    public final boolean isSingleSelectMode() {
        return this.isSingleSelectMode;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        s.g(state, "state");
        if (state instanceof Bundle) {
            Bundle bundle = (Bundle) state;
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER));
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(STATE_SELECTED_INDEXED);
            if (integerArrayList == null) {
                return;
            }
            for (Integer it2 : integerArrayList) {
                s.f(it2, "it");
                selectOption(it2.intValue());
            }
            return;
        }
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        return r3.b.a(v.a(STATE_SUPER, super.onSaveInstanceState()), v.a(STATE_SELECTED_INDEXED, new ArrayList(getSelectedIndexes$3ds2sdk_release())));
    }

    public final void selectOption(int i11) {
        View childAt = this.selectGroup.getChildAt(i11);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
        ((CompoundButton) childAt).setChecked(true);
    }

    public final void setChallengeSelectOptions(List<ChallengeResponseData.ChallengeSelectOption> list, ButtonCustomization buttonCustomization) {
        m00.i r11;
        Integer valueOf = list == null ? null : Integer.valueOf(list.size());
        if (valueOf == null) {
            return;
        }
        int intValue = valueOf.intValue();
        r11 = m00.l.r(0, intValue);
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            int a11 = ((n0) it2).a();
            ChallengeResponseData.ChallengeSelectOption challengeSelectOption = list.get(a11);
            boolean z11 = true;
            if (a11 != intValue - 1) {
                z11 = false;
            }
            getSelectGroup$3ds2sdk_release().addView(buildButton$3ds2sdk_release(challengeSelectOption, buttonCustomization, z11));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setTextEntryLabel(java.lang.String r2, com.stripe.android.stripe3ds2.init.ui.LabelCustomization r3) {
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
            com.stripe.android.stripe3ds2.views.ThreeDS2TextView r2 = r1.infoLabel
            r3 = 8
            r2.setVisibility(r3)
            goto L1b
        L16:
            com.stripe.android.stripe3ds2.views.ThreeDS2TextView r0 = r1.infoLabel
            r0.setText(r2, r3)
        L1b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.ChallengeZoneSelectView.setTextEntryLabel(java.lang.String, com.stripe.android.stripe3ds2.init.ui.LabelCustomization):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i11, boolean z11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        this.isSingleSelectMode = z11;
        if (getId() == -1) {
            setId(R.id.stripe_3ds2_default_challenge_zone_select_view_id);
        }
        this.buttonBottomMargin = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_vertical_margin);
        this.buttonLabelPadding = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_label_padding);
        this.buttonOffsetMargin = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_offset_margin);
        this.buttonMinHeight = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_min_height);
        if (z11) {
            StripeChallengeZoneSingleSelectViewBinding inflate = StripeChallengeZoneSingleSelectViewBinding.inflate(LayoutInflater.from(context), this, true);
            s.f(inflate, "inflate(\n               …   true\n                )");
            ThreeDS2TextView threeDS2TextView = inflate.label;
            s.f(threeDS2TextView, "viewBinding.label");
            this.infoLabel = threeDS2TextView;
            RadioGroup radioGroup = inflate.selectGroup;
            s.f(radioGroup, "viewBinding.selectGroup");
            this.selectGroup = radioGroup;
            return;
        }
        StripeChallengeZoneMultiSelectViewBinding inflate2 = StripeChallengeZoneMultiSelectViewBinding.inflate(LayoutInflater.from(context), this, true);
        s.f(inflate2, "inflate(\n               …   true\n                )");
        ThreeDS2TextView threeDS2TextView2 = inflate2.label;
        s.f(threeDS2TextView2, "viewBinding.label");
        this.infoLabel = threeDS2TextView2;
        LinearLayout linearLayout = inflate2.selectGroup;
        s.f(linearLayout, "viewBinding.selectGroup");
        this.selectGroup = linearLayout;
    }
}