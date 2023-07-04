package com.stripe.android;

import android.app.Activity;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeLabelCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeTextBoxCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization;
import com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization;
import com.stripe.android.stripe3ds2.init.ui.ToolbarCustomization;
import com.stripe.android.stripe3ds2.init.ui.UiCustomization;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class PaymentAuthConfig {
    private static PaymentAuthConfig instance;
    private final Stripe3ds2Config stripe3ds2Config;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final PaymentAuthConfig DEFAULT = new Builder().set3ds2Config(new Stripe3ds2Config.Builder().build()).build();

    /* loaded from: classes2.dex */
    public static final class Builder implements ObjectBuilder<PaymentAuthConfig> {
        public static final int $stable = 8;
        private Stripe3ds2Config stripe3ds2Config;

        public final Builder set3ds2Config(Stripe3ds2Config stripe3ds2Config) {
            s.g(stripe3ds2Config, "stripe3ds2Config");
            this.stripe3ds2Config = stripe3ds2Config;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.stripe.android.ObjectBuilder
        public PaymentAuthConfig build() {
            Stripe3ds2Config stripe3ds2Config = this.stripe3ds2Config;
            if (stripe3ds2Config != null) {
                return new PaymentAuthConfig(stripe3ds2Config, null);
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentAuthConfig get() {
            PaymentAuthConfig paymentAuthConfig = PaymentAuthConfig.instance;
            return paymentAuthConfig == null ? PaymentAuthConfig.DEFAULT : paymentAuthConfig;
        }

        public final void init(PaymentAuthConfig config) {
            s.g(config, "config");
            PaymentAuthConfig.instance = config;
        }

        public final /* synthetic */ void reset$payments_core_release() {
            PaymentAuthConfig.instance = null;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Stripe3ds2ButtonCustomization {
        public static final int $stable = 8;
        private final ButtonCustomization buttonCustomization;

        /* loaded from: classes2.dex */
        public static final class Builder implements ObjectBuilder<Stripe3ds2ButtonCustomization> {
            public static final int $stable = 8;
            private final ButtonCustomization buttonCustomization = new StripeButtonCustomization();

            public final Builder setBackgroundColor(String hexColor) {
                s.g(hexColor, "hexColor");
                this.buttonCustomization.setBackgroundColor(hexColor);
                return this;
            }

            public final Builder setCornerRadius(int i11) {
                this.buttonCustomization.setCornerRadius(i11);
                return this;
            }

            public final Builder setTextColor(String hexColor) {
                s.g(hexColor, "hexColor");
                this.buttonCustomization.setTextColor(hexColor);
                return this;
            }

            public final Builder setTextFontName(String fontName) {
                s.g(fontName, "fontName");
                this.buttonCustomization.setTextFontName(fontName);
                return this;
            }

            public final Builder setTextFontSize(int i11) {
                this.buttonCustomization.setTextFontSize(i11);
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Stripe3ds2ButtonCustomization build() {
                return new Stripe3ds2ButtonCustomization(this.buttonCustomization);
            }
        }

        public Stripe3ds2ButtonCustomization(ButtonCustomization buttonCustomization) {
            s.g(buttonCustomization, "buttonCustomization");
            this.buttonCustomization = buttonCustomization;
        }

        public static /* synthetic */ Stripe3ds2ButtonCustomization copy$default(Stripe3ds2ButtonCustomization stripe3ds2ButtonCustomization, ButtonCustomization buttonCustomization, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonCustomization = stripe3ds2ButtonCustomization.buttonCustomization;
            }
            return stripe3ds2ButtonCustomization.copy(buttonCustomization);
        }

        public final ButtonCustomization component1$payments_core_release() {
            return this.buttonCustomization;
        }

        public final Stripe3ds2ButtonCustomization copy(ButtonCustomization buttonCustomization) {
            s.g(buttonCustomization, "buttonCustomization");
            return new Stripe3ds2ButtonCustomization(buttonCustomization);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stripe3ds2ButtonCustomization) && s.c(this.buttonCustomization, ((Stripe3ds2ButtonCustomization) obj).buttonCustomization);
        }

        public final ButtonCustomization getButtonCustomization$payments_core_release() {
            return this.buttonCustomization;
        }

        public int hashCode() {
            return this.buttonCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2ButtonCustomization(buttonCustomization=" + this.buttonCustomization + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Stripe3ds2Config implements Parcelable {
        public static final int DEFAULT_TIMEOUT = 5;
        private final int timeout;
        private final Stripe3ds2UiCustomization uiCustomization;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Stripe3ds2Config> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes2.dex */
        public static final class Builder implements ObjectBuilder<Stripe3ds2Config> {
            public static final int $stable = 8;
            private int timeout = 5;
            private Stripe3ds2UiCustomization uiCustomization = new Stripe3ds2UiCustomization.Builder().build();

            public final Builder setTimeout(int i11) {
                this.timeout = i11;
                return this;
            }

            public final Builder setUiCustomization(Stripe3ds2UiCustomization uiCustomization) {
                s.g(uiCustomization, "uiCustomization");
                this.uiCustomization = uiCustomization;
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Stripe3ds2Config build() {
                return new Stripe3ds2Config(this.timeout, this.uiCustomization);
            }
        }

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Stripe3ds2Config> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2Config createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Stripe3ds2Config(parcel.readInt(), Stripe3ds2UiCustomization.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2Config[] newArray(int i11) {
                return new Stripe3ds2Config[i11];
            }
        }

        public Stripe3ds2Config(int i11, Stripe3ds2UiCustomization uiCustomization) {
            s.g(uiCustomization, "uiCustomization");
            this.timeout = i11;
            this.uiCustomization = uiCustomization;
            checkValidTimeout(i11);
        }

        private final void checkValidTimeout(int i11) {
            if (!(i11 >= 5 && i11 <= 99)) {
                throw new IllegalArgumentException("Timeout value must be between 5 and 99, inclusive".toString());
            }
        }

        public static /* synthetic */ Stripe3ds2Config copy$default(Stripe3ds2Config stripe3ds2Config, int i11, Stripe3ds2UiCustomization stripe3ds2UiCustomization, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = stripe3ds2Config.timeout;
            }
            if ((i12 & 2) != 0) {
                stripe3ds2UiCustomization = stripe3ds2Config.uiCustomization;
            }
            return stripe3ds2Config.copy(i11, stripe3ds2UiCustomization);
        }

        public final int component1$payments_core_release() {
            return this.timeout;
        }

        public final Stripe3ds2UiCustomization component2$payments_core_release() {
            return this.uiCustomization;
        }

        public final Stripe3ds2Config copy(int i11, Stripe3ds2UiCustomization uiCustomization) {
            s.g(uiCustomization, "uiCustomization");
            return new Stripe3ds2Config(i11, uiCustomization);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Stripe3ds2Config) {
                Stripe3ds2Config stripe3ds2Config = (Stripe3ds2Config) obj;
                return this.timeout == stripe3ds2Config.timeout && s.c(this.uiCustomization, stripe3ds2Config.uiCustomization);
            }
            return false;
        }

        public final int getTimeout$payments_core_release() {
            return this.timeout;
        }

        public final Stripe3ds2UiCustomization getUiCustomization$payments_core_release() {
            return this.uiCustomization;
        }

        public int hashCode() {
            return (Integer.hashCode(this.timeout) * 31) + this.uiCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2Config(timeout=" + this.timeout + ", uiCustomization=" + this.uiCustomization + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(this.timeout);
            this.uiCustomization.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Stripe3ds2LabelCustomization {
        public static final int $stable = 8;
        private final LabelCustomization labelCustomization;

        /* loaded from: classes2.dex */
        public static final class Builder implements ObjectBuilder<Stripe3ds2LabelCustomization> {
            public static final int $stable = 8;
            private final LabelCustomization labelCustomization = new StripeLabelCustomization();

            public final Builder setHeadingTextColor(String hexColor) {
                s.g(hexColor, "hexColor");
                this.labelCustomization.setHeadingTextColor(hexColor);
                return this;
            }

            public final Builder setHeadingTextFontName(String fontName) {
                s.g(fontName, "fontName");
                this.labelCustomization.setHeadingTextFontName(fontName);
                return this;
            }

            public final Builder setHeadingTextFontSize(int i11) {
                this.labelCustomization.setHeadingTextFontSize(i11);
                return this;
            }

            public final Builder setTextColor(String hexColor) {
                s.g(hexColor, "hexColor");
                this.labelCustomization.setTextColor(hexColor);
                return this;
            }

            public final Builder setTextFontName(String fontName) {
                s.g(fontName, "fontName");
                this.labelCustomization.setTextFontName(fontName);
                return this;
            }

            public final Builder setTextFontSize(int i11) {
                this.labelCustomization.setTextFontSize(i11);
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Stripe3ds2LabelCustomization build() {
                return new Stripe3ds2LabelCustomization(this.labelCustomization);
            }
        }

        public Stripe3ds2LabelCustomization(LabelCustomization labelCustomization) {
            s.g(labelCustomization, "labelCustomization");
            this.labelCustomization = labelCustomization;
        }

        public static /* synthetic */ Stripe3ds2LabelCustomization copy$default(Stripe3ds2LabelCustomization stripe3ds2LabelCustomization, LabelCustomization labelCustomization, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                labelCustomization = stripe3ds2LabelCustomization.labelCustomization;
            }
            return stripe3ds2LabelCustomization.copy(labelCustomization);
        }

        public final LabelCustomization component1$payments_core_release() {
            return this.labelCustomization;
        }

        public final Stripe3ds2LabelCustomization copy(LabelCustomization labelCustomization) {
            s.g(labelCustomization, "labelCustomization");
            return new Stripe3ds2LabelCustomization(labelCustomization);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stripe3ds2LabelCustomization) && s.c(this.labelCustomization, ((Stripe3ds2LabelCustomization) obj).labelCustomization);
        }

        public final LabelCustomization getLabelCustomization$payments_core_release() {
            return this.labelCustomization;
        }

        public int hashCode() {
            return this.labelCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2LabelCustomization(labelCustomization=" + this.labelCustomization + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Stripe3ds2TextBoxCustomization {
        public static final int $stable = 8;
        private final TextBoxCustomization textBoxCustomization;

        /* loaded from: classes2.dex */
        public static final class Builder implements ObjectBuilder<Stripe3ds2TextBoxCustomization> {
            public static final int $stable = 8;
            private final TextBoxCustomization textBoxCustomization = new StripeTextBoxCustomization();

            public final Builder setBorderColor(String hexColor) {
                s.g(hexColor, "hexColor");
                this.textBoxCustomization.setBorderColor(hexColor);
                return this;
            }

            public final Builder setBorderWidth(int i11) {
                this.textBoxCustomization.setBorderWidth(i11);
                return this;
            }

            public final Builder setCornerRadius(int i11) {
                this.textBoxCustomization.setCornerRadius(i11);
                return this;
            }

            public final Builder setTextColor(String hexColor) {
                s.g(hexColor, "hexColor");
                this.textBoxCustomization.setTextColor(hexColor);
                return this;
            }

            public final Builder setTextFontName(String fontName) {
                s.g(fontName, "fontName");
                this.textBoxCustomization.setTextFontName(fontName);
                return this;
            }

            public final Builder setTextFontSize(int i11) {
                this.textBoxCustomization.setTextFontSize(i11);
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Stripe3ds2TextBoxCustomization build() {
                return new Stripe3ds2TextBoxCustomization(this.textBoxCustomization);
            }
        }

        public Stripe3ds2TextBoxCustomization(TextBoxCustomization textBoxCustomization) {
            s.g(textBoxCustomization, "textBoxCustomization");
            this.textBoxCustomization = textBoxCustomization;
        }

        public static /* synthetic */ Stripe3ds2TextBoxCustomization copy$default(Stripe3ds2TextBoxCustomization stripe3ds2TextBoxCustomization, TextBoxCustomization textBoxCustomization, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textBoxCustomization = stripe3ds2TextBoxCustomization.textBoxCustomization;
            }
            return stripe3ds2TextBoxCustomization.copy(textBoxCustomization);
        }

        public final TextBoxCustomization component1$payments_core_release() {
            return this.textBoxCustomization;
        }

        public final Stripe3ds2TextBoxCustomization copy(TextBoxCustomization textBoxCustomization) {
            s.g(textBoxCustomization, "textBoxCustomization");
            return new Stripe3ds2TextBoxCustomization(textBoxCustomization);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stripe3ds2TextBoxCustomization) && s.c(this.textBoxCustomization, ((Stripe3ds2TextBoxCustomization) obj).textBoxCustomization);
        }

        public final TextBoxCustomization getTextBoxCustomization$payments_core_release() {
            return this.textBoxCustomization;
        }

        public int hashCode() {
            return this.textBoxCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2TextBoxCustomization(textBoxCustomization=" + this.textBoxCustomization + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Stripe3ds2ToolbarCustomization {
        public static final int $stable = 8;
        private final ToolbarCustomization toolbarCustomization;

        /* loaded from: classes2.dex */
        public static final class Builder implements ObjectBuilder<Stripe3ds2ToolbarCustomization> {
            public static final int $stable = 8;
            private final ToolbarCustomization toolbarCustomization = new StripeToolbarCustomization();

            public final Builder setBackgroundColor(String hexColor) {
                s.g(hexColor, "hexColor");
                this.toolbarCustomization.setBackgroundColor(hexColor);
                return this;
            }

            public final Builder setButtonText(String buttonText) {
                s.g(buttonText, "buttonText");
                this.toolbarCustomization.setButtonText(buttonText);
                return this;
            }

            public final Builder setHeaderText(String headerText) {
                s.g(headerText, "headerText");
                this.toolbarCustomization.setHeaderText(headerText);
                return this;
            }

            public final Builder setStatusBarColor(String hexColor) {
                s.g(hexColor, "hexColor");
                this.toolbarCustomization.setStatusBarColor(hexColor);
                return this;
            }

            public final Builder setTextColor(String hexColor) {
                s.g(hexColor, "hexColor");
                this.toolbarCustomization.setTextColor(hexColor);
                return this;
            }

            public final Builder setTextFontName(String fontName) {
                s.g(fontName, "fontName");
                this.toolbarCustomization.setTextFontName(fontName);
                return this;
            }

            public final Builder setTextFontSize(int i11) {
                this.toolbarCustomization.setTextFontSize(i11);
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Stripe3ds2ToolbarCustomization build() {
                return new Stripe3ds2ToolbarCustomization(this.toolbarCustomization);
            }
        }

        public Stripe3ds2ToolbarCustomization(ToolbarCustomization toolbarCustomization) {
            s.g(toolbarCustomization, "toolbarCustomization");
            this.toolbarCustomization = toolbarCustomization;
        }

        public static /* synthetic */ Stripe3ds2ToolbarCustomization copy$default(Stripe3ds2ToolbarCustomization stripe3ds2ToolbarCustomization, ToolbarCustomization toolbarCustomization, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                toolbarCustomization = stripe3ds2ToolbarCustomization.toolbarCustomization;
            }
            return stripe3ds2ToolbarCustomization.copy(toolbarCustomization);
        }

        public final ToolbarCustomization component1$payments_core_release() {
            return this.toolbarCustomization;
        }

        public final Stripe3ds2ToolbarCustomization copy(ToolbarCustomization toolbarCustomization) {
            s.g(toolbarCustomization, "toolbarCustomization");
            return new Stripe3ds2ToolbarCustomization(toolbarCustomization);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stripe3ds2ToolbarCustomization) && s.c(this.toolbarCustomization, ((Stripe3ds2ToolbarCustomization) obj).toolbarCustomization);
        }

        public final ToolbarCustomization getToolbarCustomization$payments_core_release() {
            return this.toolbarCustomization;
        }

        public int hashCode() {
            return this.toolbarCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2ToolbarCustomization(toolbarCustomization=" + this.toolbarCustomization + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Stripe3ds2UiCustomization implements Parcelable {
        private final StripeUiCustomization uiCustomization;
        public static final Parcelable.Creator<Stripe3ds2UiCustomization> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes2.dex */
        public static final class Builder implements ObjectBuilder<Stripe3ds2UiCustomization> {
            private final StripeUiCustomization uiCustomization;
            public static final Companion Companion = new Companion(null);
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Builder createWithAppTheme(Activity activity) {
                    s.g(activity, "activity");
                    return new Builder(activity, null);
                }
            }

            /* loaded from: classes2.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ButtonType.values().length];
                    iArr[ButtonType.SUBMIT.ordinal()] = 1;
                    iArr[ButtonType.CONTINUE.ordinal()] = 2;
                    iArr[ButtonType.NEXT.ordinal()] = 3;
                    iArr[ButtonType.CANCEL.ordinal()] = 4;
                    iArr[ButtonType.RESEND.ordinal()] = 5;
                    iArr[ButtonType.SELECT.ordinal()] = 6;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Builder(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
                this(activity);
            }

            private Builder(StripeUiCustomization stripeUiCustomization) {
                this.uiCustomization = stripeUiCustomization;
            }

            public static final Builder createWithAppTheme(Activity activity) {
                return Companion.createWithAppTheme(activity);
            }

            private final UiCustomization.ButtonType getUiButtonType(ButtonType buttonType) {
                switch (WhenMappings.$EnumSwitchMapping$0[buttonType.ordinal()]) {
                    case 1:
                        return UiCustomization.ButtonType.SUBMIT;
                    case 2:
                        return UiCustomization.ButtonType.CONTINUE;
                    case 3:
                        return UiCustomization.ButtonType.NEXT;
                    case 4:
                        return UiCustomization.ButtonType.CANCEL;
                    case 5:
                        return UiCustomization.ButtonType.RESEND;
                    case 6:
                        return UiCustomization.ButtonType.SELECT;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }

            public final Builder setAccentColor(String hexColor) {
                s.g(hexColor, "hexColor");
                this.uiCustomization.setAccentColor(hexColor);
                return this;
            }

            public final Builder setButtonCustomization(Stripe3ds2ButtonCustomization buttonCustomization, ButtonType buttonType) {
                s.g(buttonCustomization, "buttonCustomization");
                s.g(buttonType, "buttonType");
                this.uiCustomization.setButtonCustomization(buttonCustomization.getButtonCustomization$payments_core_release(), getUiButtonType(buttonType));
                return this;
            }

            public final Builder setLabelCustomization(Stripe3ds2LabelCustomization labelCustomization) {
                s.g(labelCustomization, "labelCustomization");
                this.uiCustomization.setLabelCustomization(labelCustomization.getLabelCustomization$payments_core_release());
                return this;
            }

            public final Builder setTextBoxCustomization(Stripe3ds2TextBoxCustomization textBoxCustomization) {
                s.g(textBoxCustomization, "textBoxCustomization");
                this.uiCustomization.setTextBoxCustomization(textBoxCustomization.getTextBoxCustomization$payments_core_release());
                return this;
            }

            public final Builder setToolbarCustomization(Stripe3ds2ToolbarCustomization toolbarCustomization) {
                s.g(toolbarCustomization, "toolbarCustomization");
                this.uiCustomization.setToolbarCustomization(toolbarCustomization.getToolbarCustomization$payments_core_release());
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.stripe.android.ObjectBuilder
            public Stripe3ds2UiCustomization build() {
                return new Stripe3ds2UiCustomization(this.uiCustomization);
            }

            public Builder() {
                this(new StripeUiCustomization());
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private Builder(android.app.Activity r2) {
                /*
                    r1 = this;
                    com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization r2 = com.stripe.android.stripe3ds2.init.ui.StripeUiCustomization.createWithAppTheme(r2)
                    java.lang.String r0 = "createWithAppTheme(activity)"
                    kotlin.jvm.internal.s.f(r2, r0)
                    r1.<init>(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.PaymentAuthConfig.Stripe3ds2UiCustomization.Builder.<init>(android.app.Activity):void");
            }
        }

        /* loaded from: classes2.dex */
        public enum ButtonType {
            SUBMIT,
            CONTINUE,
            NEXT,
            CANCEL,
            RESEND,
            SELECT
        }

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<Stripe3ds2UiCustomization> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2UiCustomization createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Stripe3ds2UiCustomization((StripeUiCustomization) parcel.readParcelable(Stripe3ds2UiCustomization.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Stripe3ds2UiCustomization[] newArray(int i11) {
                return new Stripe3ds2UiCustomization[i11];
            }
        }

        public Stripe3ds2UiCustomization(StripeUiCustomization uiCustomization) {
            s.g(uiCustomization, "uiCustomization");
            this.uiCustomization = uiCustomization;
        }

        public static /* synthetic */ Stripe3ds2UiCustomization copy$default(Stripe3ds2UiCustomization stripe3ds2UiCustomization, StripeUiCustomization stripeUiCustomization, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                stripeUiCustomization = stripe3ds2UiCustomization.uiCustomization;
            }
            return stripe3ds2UiCustomization.copy(stripeUiCustomization);
        }

        public final StripeUiCustomization component1() {
            return this.uiCustomization;
        }

        public final Stripe3ds2UiCustomization copy(StripeUiCustomization uiCustomization) {
            s.g(uiCustomization, "uiCustomization");
            return new Stripe3ds2UiCustomization(uiCustomization);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stripe3ds2UiCustomization) && s.c(this.uiCustomization, ((Stripe3ds2UiCustomization) obj).uiCustomization);
        }

        public final StripeUiCustomization getUiCustomization() {
            return this.uiCustomization;
        }

        public int hashCode() {
            return this.uiCustomization.hashCode();
        }

        public String toString() {
            return "Stripe3ds2UiCustomization(uiCustomization=" + this.uiCustomization + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeParcelable(this.uiCustomization, i11);
        }
    }

    private PaymentAuthConfig(Stripe3ds2Config stripe3ds2Config) {
        this.stripe3ds2Config = stripe3ds2Config;
    }

    public /* synthetic */ PaymentAuthConfig(Stripe3ds2Config stripe3ds2Config, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripe3ds2Config);
    }

    public static final PaymentAuthConfig get() {
        return Companion.get();
    }

    public static final void init(PaymentAuthConfig paymentAuthConfig) {
        Companion.init(paymentAuthConfig);
    }

    public final Stripe3ds2Config getStripe3ds2Config$payments_core_release() {
        return this.stripe3ds2Config;
    }
}