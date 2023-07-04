package com.stripe.android.stripe3ds2.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.stripe.android.stripe3ds2.databinding.StripeInformationZoneViewBinding;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes6.dex */
public final class InformationZoneView extends FrameLayout {
    private final int animationDuration;
    private int defaultColor;
    private final AppCompatImageView expandArrow;
    private final LinearLayout expandContainer;
    private final ThreeDS2TextView expandLabel;
    private final ThreeDS2TextView expandText;
    private int toggleColor;
    private final StripeInformationZoneViewBinding viewBinding;
    private final AppCompatImageView whyArrow;
    private final LinearLayout whyContainer;
    private final ThreeDS2TextView whyLabel;
    private final ThreeDS2TextView whyText;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context) {
        this(context, null, 0, 6, null);
        s.g(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        s.g(context, "context");
    }

    public /* synthetic */ InformationZoneView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* renamed from: _init_$lambda-0 */
    public static final void m361_init_$lambda0(InformationZoneView this$0, View view) {
        s.g(this$0, "this$0");
        this$0.toggleView(this$0.whyArrow, this$0.whyLabel, this$0.whyText);
    }

    /* renamed from: _init_$lambda-1 */
    public static final void m362_init_$lambda1(InformationZoneView this$0, View view) {
        s.g(this$0, "this$0");
        this$0.toggleView(this$0.expandArrow, this$0.expandLabel, this$0.expandText);
    }

    public static /* synthetic */ void a(View view) {
        m363toggleView$lambda2(view);
    }

    public static /* synthetic */ void b(InformationZoneView informationZoneView, View view) {
        m362_init_$lambda1(informationZoneView, view);
    }

    public static /* synthetic */ void c(InformationZoneView informationZoneView, View view) {
        m361_init_$lambda0(informationZoneView, view);
    }

    public static /* synthetic */ void getExpandArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandText$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyText$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void setExpandInfo$default(InformationZoneView informationZoneView, String str, String str2, LabelCustomization labelCustomization, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            labelCustomization = null;
        }
        informationZoneView.setExpandInfo(str, str2, labelCustomization);
    }

    public static /* synthetic */ void setWhyInfo$default(InformationZoneView informationZoneView, String str, String str2, LabelCustomization labelCustomization, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            labelCustomization = null;
        }
        informationZoneView.setWhyInfo(str, str2, labelCustomization);
    }

    private final void toggleView(View view, TextView textView, final View view2) {
        boolean z11 = view2.getVisibility() == 8;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", z11 ? CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 : 0);
        ofFloat.setDuration(this.animationDuration);
        ofFloat.start();
        textView.setEnabled(z11);
        view.setEnabled(z11);
        if (this.toggleColor != 0) {
            if (this.defaultColor == 0) {
                this.defaultColor = textView.getTextColors().getDefaultColor();
            }
            textView.setTextColor(z11 ? this.toggleColor : this.defaultColor);
        }
        view2.setVisibility(z11 ? 0 : 8);
        if (z11) {
            view2.postDelayed(new Runnable() { // from class: com.stripe.android.stripe3ds2.views.p
                @Override // java.lang.Runnable
                public final void run() {
                    InformationZoneView.a(view2);
                }
            }, this.animationDuration);
        }
    }

    /* renamed from: toggleView$lambda-2 */
    public static final void m363toggleView$lambda2(View detailsView) {
        s.g(detailsView, "$detailsView");
        Rect rect = new Rect(0, 0, detailsView.getWidth(), detailsView.getHeight());
        detailsView.getHitRect(rect);
        detailsView.requestRectangleOnScreen(rect, false);
    }

    public final void expandViews() {
        this.expandArrow.setRotation(180.0f);
        this.whyArrow.setRotation(180.0f);
        this.expandText.setVisibility(0);
        this.whyText.setVisibility(0);
    }

    public final AppCompatImageView getExpandArrow$3ds2sdk_release() {
        return this.expandArrow;
    }

    public final LinearLayout getExpandContainer$3ds2sdk_release() {
        return this.expandContainer;
    }

    public final ThreeDS2TextView getExpandLabel$3ds2sdk_release() {
        return this.expandLabel;
    }

    public final ThreeDS2TextView getExpandText$3ds2sdk_release() {
        return this.expandText;
    }

    public final int getToggleColor$3ds2sdk_release() {
        return this.toggleColor;
    }

    public final AppCompatImageView getWhyArrow$3ds2sdk_release() {
        return this.whyArrow;
    }

    public final LinearLayout getWhyContainer$3ds2sdk_release() {
        return this.whyContainer;
    }

    public final ThreeDS2TextView getWhyLabel$3ds2sdk_release() {
        return this.whyLabel;
    }

    public final ThreeDS2TextView getWhyText$3ds2sdk_release() {
        return this.whyText;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setExpandInfo(java.lang.String r3, java.lang.String r4, com.stripe.android.stripe3ds2.init.ui.LabelCustomization r5) {
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
            if (r1 == 0) goto L10
            return
        L10:
            com.stripe.android.stripe3ds2.views.ThreeDS2TextView r1 = r2.expandLabel
            r1.setText(r3, r5)
            android.widget.LinearLayout r3 = r2.expandContainer
            r3.setVisibility(r0)
            com.stripe.android.stripe3ds2.views.ThreeDS2TextView r3 = r2.expandText
            r3.setText(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.InformationZoneView.setExpandInfo(java.lang.String, java.lang.String, com.stripe.android.stripe3ds2.init.ui.LabelCustomization):void");
    }

    public final void setToggleColor$3ds2sdk_release(int i11) {
        this.toggleColor = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setWhyInfo(java.lang.String r3, java.lang.String r4, com.stripe.android.stripe3ds2.init.ui.LabelCustomization r5) {
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
            if (r1 == 0) goto L10
            return
        L10:
            com.stripe.android.stripe3ds2.views.ThreeDS2TextView r1 = r2.whyLabel
            r1.setText(r3, r5)
            android.widget.LinearLayout r3 = r2.whyContainer
            r3.setVisibility(r0)
            com.stripe.android.stripe3ds2.views.ThreeDS2TextView r3 = r2.whyText
            r3.setText(r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.InformationZoneView.setWhyInfo(java.lang.String, java.lang.String, com.stripe.android.stripe3ds2.init.ui.LabelCustomization):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        s.g(context, "context");
        StripeInformationZoneViewBinding inflate = StripeInformationZoneViewBinding.inflate(LayoutInflater.from(context), this, true);
        s.f(inflate, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.viewBinding = inflate;
        ThreeDS2TextView threeDS2TextView = inflate.whyLabel;
        s.f(threeDS2TextView, "viewBinding.whyLabel");
        this.whyLabel = threeDS2TextView;
        ThreeDS2TextView threeDS2TextView2 = inflate.whyText;
        s.f(threeDS2TextView2, "viewBinding.whyText");
        this.whyText = threeDS2TextView2;
        LinearLayout linearLayout = inflate.whyContainer;
        s.f(linearLayout, "viewBinding.whyContainer");
        this.whyContainer = linearLayout;
        AppCompatImageView appCompatImageView = inflate.whyArrow;
        s.f(appCompatImageView, "viewBinding.whyArrow");
        this.whyArrow = appCompatImageView;
        ThreeDS2TextView threeDS2TextView3 = inflate.expandLabel;
        s.f(threeDS2TextView3, "viewBinding.expandLabel");
        this.expandLabel = threeDS2TextView3;
        ThreeDS2TextView threeDS2TextView4 = inflate.expandText;
        s.f(threeDS2TextView4, "viewBinding.expandText");
        this.expandText = threeDS2TextView4;
        LinearLayout linearLayout2 = inflate.expandContainer;
        s.f(linearLayout2, "viewBinding.expandContainer");
        this.expandContainer = linearLayout2;
        AppCompatImageView appCompatImageView2 = inflate.expandArrow;
        s.f(appCompatImageView2, "viewBinding.expandArrow");
        this.expandArrow = appCompatImageView2;
        this.animationDuration = getResources().getInteger(17694720);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.o
            {
                InformationZoneView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView.c(InformationZoneView.this, view);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.stripe.android.stripe3ds2.views.n
            {
                InformationZoneView.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InformationZoneView.b(InformationZoneView.this, view);
            }
        });
    }
}