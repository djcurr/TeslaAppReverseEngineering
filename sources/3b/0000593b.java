package com.stripe.android.stripe3ds2.views;

import android.graphics.Color;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class HeaderZoneCustomizer {
    public static final Companion Companion = new Companion(null);
    private final androidx.fragment.app.h activity;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void customizeStatusBar(androidx.appcompat.app.d activity, ToolbarCustomization toolbarCustomization) {
            s.g(activity, "activity");
            s.g(toolbarCustomization, "toolbarCustomization");
            if (toolbarCustomization.getStatusBarColor() != null) {
                CustomizeUtils.INSTANCE.setStatusBarColor(activity, Color.parseColor(toolbarCustomization.getStatusBarColor()));
            } else if (toolbarCustomization.getBackgroundColor() != null) {
                int parseColor = Color.parseColor(toolbarCustomization.getBackgroundColor());
                CustomizeUtils customizeUtils = CustomizeUtils.INSTANCE;
                customizeUtils.setStatusBarColor(activity, customizeUtils.darken$3ds2sdk_release(parseColor));
            }
        }
    }

    public HeaderZoneCustomizer(androidx.fragment.app.h activity) {
        s.g(activity, "activity");
        this.activity = activity;
    }

    public static /* synthetic */ ThreeDS2Button customize$default(HeaderZoneCustomizer headerZoneCustomizer, ToolbarCustomization toolbarCustomization, ButtonCustomization buttonCustomization, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            toolbarCustomization = null;
        }
        if ((i11 & 2) != 0) {
            buttonCustomization = null;
        }
        return headerZoneCustomizer.customize(toolbarCustomization, buttonCustomization);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (r0 != false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.stripe.android.stripe3ds2.views.ThreeDS2Button customize(com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization r10, com.stripe.android.stripe3ds2.init.ui.ButtonCustomization r11) {
        /*
            r9 = this;
            androidx.fragment.app.h r0 = r9.activity
            boolean r1 = r0 instanceof androidx.appcompat.app.d
            r2 = 0
            if (r1 == 0) goto La
            androidx.appcompat.app.d r0 = (androidx.appcompat.app.d) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 != 0) goto Lf
            r1 = r2
            goto L13
        Lf:
            androidx.appcompat.app.a r1 = r0.getSupportActionBar()
        L13:
            if (r1 != 0) goto L16
            return r2
        L16:
            l.d r4 = new l.d
            androidx.fragment.app.h r2 = r9.activity
            int r3 = com.stripe.android.stripe3ds2.R.style.Stripe3DS2ActionBarButton
            r4.<init>(r2, r3)
            com.stripe.android.stripe3ds2.views.ThreeDS2Button r2 = new com.stripe.android.stripe3ds2.views.ThreeDS2Button
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)
            r3 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r3)
            r2.setBackgroundTintList(r4)
            r2.setButtonCustomization(r11)
            androidx.appcompat.app.a$a r11 = new androidx.appcompat.app.a$a
            r4 = 8388629(0x800015, float:1.1754973E-38)
            r5 = -2
            r11.<init>(r5, r5, r4)
            r1.t(r2, r11)
            r11 = 1
            r1.w(r11)
            if (r10 == 0) goto Laf
            java.lang.String r4 = r10.getButtonText()
            if (r4 == 0) goto L55
            boolean r4 = kotlin.text.m.w(r4)
            if (r4 == 0) goto L53
            goto L55
        L53:
            r4 = r3
            goto L56
        L55:
            r4 = r11
        L56:
            if (r4 != 0) goto L60
            java.lang.String r4 = r10.getButtonText()
            r2.setText(r4)
            goto L65
        L60:
            int r4 = com.stripe.android.stripe3ds2.R.string.stripe_3ds2_hzv_cancel_label
            r2.setText(r4)
        L65:
            java.lang.String r4 = r10.getBackgroundColor()
            if (r4 != 0) goto L6c
            goto L7d
        L6c:
            android.graphics.drawable.ColorDrawable r5 = new android.graphics.drawable.ColorDrawable
            int r4 = android.graphics.Color.parseColor(r4)
            r5.<init>(r4)
            r1.s(r5)
            com.stripe.android.stripe3ds2.views.HeaderZoneCustomizer$Companion r4 = com.stripe.android.stripe3ds2.views.HeaderZoneCustomizer.Companion
            r4.customizeStatusBar(r0, r10)
        L7d:
            java.lang.String r0 = r10.getHeaderText()
            if (r0 == 0) goto L89
            boolean r0 = kotlin.text.m.w(r0)
            if (r0 == 0) goto L8a
        L89:
            r3 = r11
        L8a:
            if (r3 != 0) goto L96
            java.lang.String r11 = r10.getHeaderText()
            java.lang.String r0 = "{\n                toolba….headerText\n            }"
            kotlin.jvm.internal.s.f(r11, r0)
            goto La3
        L96:
            androidx.fragment.app.h r11 = r9.activity
            int r0 = com.stripe.android.stripe3ds2.R.string.stripe_3ds2_hzv_header_label
            java.lang.String r11 = r11.getString(r0)
            java.lang.String r0 = "{\n                activi…ader_label)\n            }"
            kotlin.jvm.internal.s.f(r11, r0)
        La3:
            com.stripe.android.stripe3ds2.utils.CustomizeUtils r0 = com.stripe.android.stripe3ds2.utils.CustomizeUtils.INSTANCE
            androidx.fragment.app.h r3 = r9.activity
            android.text.SpannableString r10 = r0.buildStyledText(r3, r11, r10)
            r1.C(r10)
            goto Lb9
        Laf:
            int r10 = com.stripe.android.stripe3ds2.R.string.stripe_3ds2_hzv_header_label
            r1.B(r10)
            int r10 = com.stripe.android.stripe3ds2.R.string.stripe_3ds2_hzv_cancel_label
            r2.setText(r10)
        Lb9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.views.HeaderZoneCustomizer.customize(com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization, com.stripe.android.stripe3ds2.init.ui.ButtonCustomization):com.stripe.android.stripe3ds2.views.ThreeDS2Button");
    }
}