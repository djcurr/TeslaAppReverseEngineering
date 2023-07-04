package com.stripe.android.paymentsheet.analytics;

import com.stripe.android.core.networking.AnalyticsEvent;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.ui.core.PaymentsThemeDefaults;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;

/* loaded from: classes6.dex */
public abstract class PaymentSheetEvent implements AnalyticsEvent {
    public static final Companion Companion = new Companion(null);
    public static final String FIELD_APPEARANCE = "appearance";
    public static final String FIELD_APPEARANCE_USAGE = "usage";
    public static final String FIELD_BILLING = "default_billing_details";
    public static final String FIELD_BORDER_WIDTH = "border_width";
    public static final String FIELD_COLORS_DARK = "colorsDark";
    public static final String FIELD_COLORS_LIGHT = "colorsLight";
    public static final String FIELD_CORNER_RADIUS = "corner_radius";
    public static final String FIELD_CUSTOMER = "customer";
    public static final String FIELD_DELAYED_PMS = "allows_delayed_payment_methods";
    public static final String FIELD_FONT = "font";
    public static final String FIELD_GOOGLE_PAY = "googlepay";
    public static final String FIELD_MOBILE_PAYMENT_ELEMENT_CONFIGURATION = "mpe_config";
    public static final String FIELD_PRIMARY_BUTTON = "primary_button";
    public static final String FIELD_PRIMARY_BUTTON_COLOR = "primary_button_color";
    public static final String FIELD_SIZE_SCALE_FACTOR = "size_scale_factor";

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String analyticsValue(PaymentSelection paymentSelection) {
            return s.c(paymentSelection, PaymentSelection.GooglePay.INSTANCE) ? PaymentSheetEvent.FIELD_GOOGLE_PAY : paymentSelection instanceof PaymentSelection.Saved ? "savedpm" : paymentSelection instanceof PaymentSelection.New ? "newpm" : "unknown";
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String formatEventName(EventReporter.Mode mode, String str) {
            return "mc_" + mode + '_' + str;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Dismiss extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Dismiss(EventReporter.Mode mode) {
            super(null);
            Map<String, Object> i11;
            s.g(mode, "mode");
            this.eventName = PaymentSheetEvent.Companion.formatEventName(mode, "dismiss");
            i11 = s0.i();
            this.additionalParams = i11;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Init extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final PaymentSheet.Configuration configuration;
        private final EventReporter.Mode mode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Init(EventReporter.Mode mode, PaymentSheet.Configuration configuration) {
            super(null);
            s.g(mode, "mode");
            this.mode = mode;
            this.configuration = configuration;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            PaymentSheet.Appearance appearance;
            PaymentSheet.PrimaryButtonShape shape;
            PaymentSheet.PrimaryButtonShape shape2;
            PaymentSheet.PrimaryButtonTypography typography;
            Map l11;
            PaymentSheet.Appearance appearance2;
            PaymentSheet.Appearance appearance3;
            PaymentSheet.Appearance appearance4;
            PaymentSheet.Shapes shapes;
            PaymentSheet.Appearance appearance5;
            PaymentSheet.Shapes shapes2;
            PaymentSheet.Appearance appearance6;
            PaymentSheet.Typography typography2;
            PaymentSheet.Appearance appearance7;
            PaymentSheet.Typography typography3;
            Map n11;
            Map l12;
            Map<String, Object> f11;
            PaymentSheet.Configuration configuration = this.configuration;
            PaymentSheet.PrimaryButton primaryButton = (configuration == null || (appearance = configuration.getAppearance()) == null) ? null : appearance.getPrimaryButton();
            p[] pVarArr = new p[5];
            PaymentSheet.PrimaryButtonColors colorsLight = primaryButton == null ? null : primaryButton.getColorsLight();
            PaymentSheet.PrimaryButtonColors.Companion companion = PaymentSheet.PrimaryButtonColors.Companion;
            pVarArr[0] = v.a(PaymentSheetEvent.FIELD_COLORS_LIGHT, Boolean.valueOf(!s.c(colorsLight, companion.getDefaultLight())));
            pVarArr[1] = v.a(PaymentSheetEvent.FIELD_COLORS_DARK, Boolean.valueOf(!s.c(primaryButton == null ? null : primaryButton.getColorsDark(), companion.getDefaultDark())));
            pVarArr[2] = v.a(PaymentSheetEvent.FIELD_CORNER_RADIUS, Boolean.valueOf(((primaryButton != null && (shape = primaryButton.getShape()) != null) ? shape.getCornerRadiusDp() : null) != null));
            pVarArr[3] = v.a(PaymentSheetEvent.FIELD_BORDER_WIDTH, Boolean.valueOf(((primaryButton != null && (shape2 = primaryButton.getShape()) != null) ? shape2.getBorderStrokeWidthDp() : null) != null));
            pVarArr[4] = v.a(PaymentSheetEvent.FIELD_FONT, Boolean.valueOf(((primaryButton != null && (typography = primaryButton.getTypography()) != null) ? typography.getFontResId() : null) != null));
            l11 = s0.l(pVarArr);
            p[] pVarArr2 = new p[7];
            PaymentSheet.Configuration configuration2 = this.configuration;
            PaymentSheet.Colors colorsLight2 = (configuration2 == null || (appearance2 = configuration2.getAppearance()) == null) ? null : appearance2.getColorsLight();
            PaymentSheet.Colors.Companion companion2 = PaymentSheet.Colors.Companion;
            pVarArr2[0] = v.a(PaymentSheetEvent.FIELD_COLORS_LIGHT, Boolean.valueOf(!s.c(colorsLight2, companion2.getDefaultLight())));
            PaymentSheet.Configuration configuration3 = this.configuration;
            pVarArr2[1] = v.a(PaymentSheetEvent.FIELD_COLORS_DARK, Boolean.valueOf(!s.c((configuration3 == null || (appearance3 = configuration3.getAppearance()) == null) ? null : appearance3.getColorsDark(), companion2.getDefaultDark())));
            PaymentSheet.Configuration configuration4 = this.configuration;
            Float valueOf = (configuration4 == null || (appearance4 = configuration4.getAppearance()) == null || (shapes = appearance4.getShapes()) == null) ? null : Float.valueOf(shapes.getCornerRadiusDp());
            PaymentsThemeDefaults paymentsThemeDefaults = PaymentsThemeDefaults.INSTANCE;
            pVarArr2[2] = v.a(PaymentSheetEvent.FIELD_CORNER_RADIUS, Boolean.valueOf(!s.a(valueOf, paymentsThemeDefaults.getShapes().getCornerRadius())));
            PaymentSheet.Configuration configuration5 = this.configuration;
            pVarArr2[3] = v.a(PaymentSheetEvent.FIELD_BORDER_WIDTH, Boolean.valueOf(!s.a((configuration5 == null || (appearance5 = configuration5.getAppearance()) == null || (shapes2 = appearance5.getShapes()) == null) ? null : Float.valueOf(shapes2.getBorderStrokeWidthDp()), paymentsThemeDefaults.getShapes().getBorderStrokeWidth())));
            PaymentSheet.Configuration configuration6 = this.configuration;
            pVarArr2[4] = v.a(PaymentSheetEvent.FIELD_FONT, Boolean.valueOf(((configuration6 != null && (appearance6 = configuration6.getAppearance()) != null && (typography2 = appearance6.getTypography()) != null) ? typography2.getFontResId() : null) != null));
            PaymentSheet.Configuration configuration7 = this.configuration;
            pVarArr2[5] = v.a(PaymentSheetEvent.FIELD_SIZE_SCALE_FACTOR, Boolean.valueOf(!s.a((configuration7 == null || (appearance7 = configuration7.getAppearance()) == null || (typography3 = appearance7.getTypography()) == null) ? null : Float.valueOf(typography3.getSizeScaleFactor()), paymentsThemeDefaults.getTypography().getFontSizeMultiplier())));
            pVarArr2[6] = v.a(PaymentSheetEvent.FIELD_PRIMARY_BUTTON, l11);
            n11 = s0.n(pVarArr2);
            boolean contains = l11.values().contains(Boolean.TRUE);
            Collection values = n11.values();
            ArrayList arrayList = new ArrayList();
            for (Object obj : values) {
                if (obj instanceof Boolean) {
                    arrayList.add(obj);
                }
            }
            n11.put(PaymentSheetEvent.FIELD_APPEARANCE_USAGE, Boolean.valueOf(arrayList.contains(Boolean.TRUE) || contains));
            p[] pVarArr3 = new p[6];
            PaymentSheet.Configuration configuration8 = this.configuration;
            pVarArr3[0] = v.a(PaymentSheetEvent.FIELD_CUSTOMER, Boolean.valueOf((configuration8 == null ? null : configuration8.getCustomer()) != null));
            PaymentSheet.Configuration configuration9 = this.configuration;
            pVarArr3[1] = v.a(PaymentSheetEvent.FIELD_GOOGLE_PAY, Boolean.valueOf((configuration9 == null ? null : configuration9.getGooglePay()) != null));
            PaymentSheet.Configuration configuration10 = this.configuration;
            pVarArr3[2] = v.a(PaymentSheetEvent.FIELD_PRIMARY_BUTTON_COLOR, Boolean.valueOf((configuration10 == null ? null : configuration10.getPrimaryButtonColor()) != null));
            PaymentSheet.Configuration configuration11 = this.configuration;
            pVarArr3[3] = v.a(PaymentSheetEvent.FIELD_BILLING, Boolean.valueOf((configuration11 == null ? null : configuration11.getDefaultBillingDetails()) != null));
            PaymentSheet.Configuration configuration12 = this.configuration;
            pVarArr3[4] = v.a(PaymentSheetEvent.FIELD_DELAYED_PMS, configuration12 == null ? null : Boolean.valueOf(configuration12.getAllowsDelayedPaymentMethods()));
            pVarArr3[5] = v.a(PaymentSheetEvent.FIELD_APPEARANCE, n11);
            l12 = s0.l(pVarArr3);
            f11 = r0.f(v.a(PaymentSheetEvent.FIELD_MOBILE_PAYMENT_ELEMENT_CONFIGURATION, l12));
            return f11;
        }

        /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
            r1 = wz.e0.l0(r3, "_", null, null, 0, null, null, 62, null);
         */
        @Override // com.stripe.android.core.networking.AnalyticsEvent
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.String getEventName() {
            /*
                r12 = this;
                r0 = 2
                java.lang.String[] r0 = new java.lang.String[r0]
                com.stripe.android.paymentsheet.PaymentSheet$Configuration r1 = r12.configuration
                r2 = 0
                if (r1 != 0) goto La
                r1 = r2
                goto Le
            La:
                com.stripe.android.paymentsheet.PaymentSheet$CustomerConfiguration r1 = r1.getCustomer()
            Le:
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L14
                r1 = r3
                goto L15
            L14:
                r1 = r4
            L15:
                if (r1 == 0) goto L1a
                java.lang.String r1 = "customer"
                goto L1b
            L1a:
                r1 = r2
            L1b:
                r0[r4] = r1
                com.stripe.android.paymentsheet.PaymentSheet$Configuration r1 = r12.configuration
                if (r1 != 0) goto L23
                r1 = r2
                goto L27
            L23:
                com.stripe.android.paymentsheet.PaymentSheet$GooglePayConfiguration r1 = r1.getGooglePay()
            L27:
                if (r1 == 0) goto L2a
                r4 = r3
            L2a:
                if (r4 == 0) goto L2f
                java.lang.String r1 = "googlepay"
                goto L30
            L2f:
                r1 = r2
            L30:
                r0[r3] = r1
                java.util.List r0 = wz.u.n(r0)
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L3e
                r3 = r0
                goto L3f
            L3e:
                r3 = r2
            L3f:
                java.lang.String r0 = "default"
                if (r3 != 0) goto L44
                goto L56
            L44:
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 62
                r11 = 0
                java.lang.String r4 = "_"
                java.lang.String r1 = wz.u.l0(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r1 != 0) goto L55
                goto L56
            L55:
                r0 = r1
            L56:
                com.stripe.android.paymentsheet.analytics.PaymentSheetEvent$Companion r1 = com.stripe.android.paymentsheet.analytics.PaymentSheetEvent.Companion
                com.stripe.android.paymentsheet.analytics.EventReporter$Mode r2 = r12.mode
                java.lang.String r3 = "init_"
                java.lang.String r0 = kotlin.jvm.internal.s.p(r3, r0)
                java.lang.String r0 = com.stripe.android.paymentsheet.analytics.PaymentSheetEvent.Companion.access$formatEventName(r1, r2, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.analytics.PaymentSheetEvent.Init.getEventName():java.lang.String");
        }
    }

    /* loaded from: classes6.dex */
    public static final class Payment extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;

        /* loaded from: classes6.dex */
        public enum Result {
            Success("success"),
            Failure("failure");
            
            private final String code;

            Result(String str) {
                this.code = str;
            }

            @Override // java.lang.Enum
            public String toString() {
                return this.code;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Payment(EventReporter.Mode mode, Result result, PaymentSelection paymentSelection) {
            super(null);
            Map<String, Object> i11;
            s.g(mode, "mode");
            s.g(result, "result");
            Companion companion = PaymentSheetEvent.Companion;
            this.eventName = companion.formatEventName(mode, "payment_" + companion.analyticsValue(paymentSelection) + '_' + result);
            i11 = s0.i();
            this.additionalParams = i11;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    /* loaded from: classes6.dex */
    public static final class SelectPaymentOption extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectPaymentOption(EventReporter.Mode mode, PaymentSelection paymentSelection) {
            super(null);
            Map<String, Object> i11;
            s.g(mode, "mode");
            Companion companion = PaymentSheetEvent.Companion;
            this.eventName = companion.formatEventName(mode, "paymentoption_" + companion.analyticsValue(paymentSelection) + "_select");
            i11 = s0.i();
            this.additionalParams = i11;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    /* loaded from: classes6.dex */
    public static final class ShowExistingPaymentOptions extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowExistingPaymentOptions(EventReporter.Mode mode) {
            super(null);
            Map<String, Object> i11;
            s.g(mode, "mode");
            this.eventName = PaymentSheetEvent.Companion.formatEventName(mode, "sheet_savedpm_show");
            i11 = s0.i();
            this.additionalParams = i11;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    /* loaded from: classes6.dex */
    public static final class ShowNewPaymentOptionForm extends PaymentSheetEvent {
        public static final int $stable = 8;
        private final Map<String, Object> additionalParams;
        private final String eventName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowNewPaymentOptionForm(EventReporter.Mode mode) {
            super(null);
            Map<String, Object> i11;
            s.g(mode, "mode");
            this.eventName = PaymentSheetEvent.Companion.formatEventName(mode, "sheet_newpm_show");
            i11 = s0.i();
            this.additionalParams = i11;
        }

        @Override // com.stripe.android.paymentsheet.analytics.PaymentSheetEvent
        public Map<String, Object> getAdditionalParams() {
            return this.additionalParams;
        }

        @Override // com.stripe.android.core.networking.AnalyticsEvent
        public String getEventName() {
            return this.eventName;
        }
    }

    private PaymentSheetEvent() {
    }

    public /* synthetic */ PaymentSheetEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Map<String, Object> getAdditionalParams();
}