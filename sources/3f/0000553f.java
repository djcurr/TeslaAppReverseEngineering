package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.paymentsheet.flowcontroller.FlowControllerFactory;
import com.stripe.android.paymentsheet.model.PaymentOption;
import com.stripe.android.ui.core.PaymentsThemeDefaults;
import com.stripe.android.ui.core.PaymentsThemeKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PaymentSheet {
    public static final int $stable = 8;
    private final PaymentSheetLauncher paymentSheetLauncher;

    /* loaded from: classes6.dex */
    public static final class CustomerConfiguration implements Parcelable {
        private final String ephemeralKeySecret;

        /* renamed from: id */
        private final String f20954id;
        public static final Parcelable.Creator<CustomerConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<CustomerConfiguration> {
            @Override // android.os.Parcelable.Creator
            public final CustomerConfiguration createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new CustomerConfiguration(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CustomerConfiguration[] newArray(int i11) {
                return new CustomerConfiguration[i11];
            }
        }

        public CustomerConfiguration(String id2, String ephemeralKeySecret) {
            kotlin.jvm.internal.s.g(id2, "id");
            kotlin.jvm.internal.s.g(ephemeralKeySecret, "ephemeralKeySecret");
            this.f20954id = id2;
            this.ephemeralKeySecret = ephemeralKeySecret;
        }

        public static /* synthetic */ CustomerConfiguration copy$default(CustomerConfiguration customerConfiguration, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = customerConfiguration.f20954id;
            }
            if ((i11 & 2) != 0) {
                str2 = customerConfiguration.ephemeralKeySecret;
            }
            return customerConfiguration.copy(str, str2);
        }

        public final String component1() {
            return this.f20954id;
        }

        public final String component2() {
            return this.ephemeralKeySecret;
        }

        public final CustomerConfiguration copy(String id2, String ephemeralKeySecret) {
            kotlin.jvm.internal.s.g(id2, "id");
            kotlin.jvm.internal.s.g(ephemeralKeySecret, "ephemeralKeySecret");
            return new CustomerConfiguration(id2, ephemeralKeySecret);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CustomerConfiguration) {
                CustomerConfiguration customerConfiguration = (CustomerConfiguration) obj;
                return kotlin.jvm.internal.s.c(this.f20954id, customerConfiguration.f20954id) && kotlin.jvm.internal.s.c(this.ephemeralKeySecret, customerConfiguration.ephemeralKeySecret);
            }
            return false;
        }

        public final String getEphemeralKeySecret() {
            return this.ephemeralKeySecret;
        }

        public final String getId() {
            return this.f20954id;
        }

        public int hashCode() {
            return (this.f20954id.hashCode() * 31) + this.ephemeralKeySecret.hashCode();
        }

        public String toString() {
            return "CustomerConfiguration(id=" + this.f20954id + ", ephemeralKeySecret=" + this.ephemeralKeySecret + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f20954id);
            out.writeString(this.ephemeralKeySecret);
        }
    }

    /* loaded from: classes6.dex */
    public interface FlowController {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* loaded from: classes6.dex */
        public interface ConfigCallback {
            void onConfigured(boolean z11, Throwable th2);
        }

        /* loaded from: classes6.dex */
        public static final class DefaultImpls {
            public static /* synthetic */ void configureWithPaymentIntent$default(FlowController flowController, String str, Configuration configuration, ConfigCallback configCallback, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configureWithPaymentIntent");
                }
                if ((i11 & 2) != 0) {
                    configuration = null;
                }
                flowController.configureWithPaymentIntent(str, configuration, configCallback);
            }

            public static /* synthetic */ void configureWithSetupIntent$default(FlowController flowController, String str, Configuration configuration, ConfigCallback configCallback, int i11, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: configureWithSetupIntent");
                }
                if ((i11 & 2) != 0) {
                    configuration = null;
                }
                flowController.configureWithSetupIntent(str, configuration, configCallback);
            }
        }

        /* loaded from: classes6.dex */
        public static abstract class Result {
            public static final int $stable = 0;

            /* loaded from: classes6.dex */
            public static final class Failure extends Result {
                public static final int $stable = 8;
                private final Throwable error;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Failure(Throwable error) {
                    super(null);
                    kotlin.jvm.internal.s.g(error, "error");
                    this.error = error;
                }

                public final Throwable getError() {
                    return this.error;
                }
            }

            /* loaded from: classes6.dex */
            public static final class Success extends Result {
                public static final int $stable = 0;
                public static final Success INSTANCE = new Success();

                private Success() {
                    super(null);
                }
            }

            private Result() {
            }

            public /* synthetic */ Result(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static FlowController create(ComponentActivity componentActivity, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return Companion.create(componentActivity, paymentOptionCallback, paymentSheetResultCallback);
        }

        static FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentSheetResultCallback) {
            return Companion.create(fragment, paymentOptionCallback, paymentSheetResultCallback);
        }

        void configureWithPaymentIntent(String str, Configuration configuration, ConfigCallback configCallback);

        void configureWithSetupIntent(String str, Configuration configuration, ConfigCallback configCallback);

        void confirm();

        PaymentOption getPaymentOption();

        void presentPaymentOptions();

        /* loaded from: classes6.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            private Companion() {
            }

            public final FlowController create(ComponentActivity activity, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
                kotlin.jvm.internal.s.g(activity, "activity");
                kotlin.jvm.internal.s.g(paymentOptionCallback, "paymentOptionCallback");
                kotlin.jvm.internal.s.g(paymentResultCallback, "paymentResultCallback");
                return new FlowControllerFactory(activity, paymentOptionCallback, paymentResultCallback).create();
            }

            public final FlowController create(Fragment fragment, PaymentOptionCallback paymentOptionCallback, PaymentSheetResultCallback paymentResultCallback) {
                kotlin.jvm.internal.s.g(fragment, "fragment");
                kotlin.jvm.internal.s.g(paymentOptionCallback, "paymentOptionCallback");
                kotlin.jvm.internal.s.g(paymentResultCallback, "paymentResultCallback");
                return new FlowControllerFactory(fragment, paymentOptionCallback, paymentResultCallback).create();
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class Typography implements Parcelable {

        /* renamed from: default */
        private static final Typography f26default;
        private final Integer fontResId;
        private final float sizeScaleFactor;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Typography> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Typography getDefault() {
                return Typography.f26default;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Typography> {
            @Override // android.os.Parcelable.Creator
            public final Typography createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new Typography(parcel.readFloat(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            @Override // android.os.Parcelable.Creator
            public final Typography[] newArray(int i11) {
                return new Typography[i11];
            }
        }

        static {
            PaymentsThemeDefaults paymentsThemeDefaults = PaymentsThemeDefaults.INSTANCE;
            f26default = new Typography(paymentsThemeDefaults.getTypography().getFontSizeMultiplier(), paymentsThemeDefaults.getTypography().getFontFamily());
        }

        public Typography(float f11, Integer num) {
            this.sizeScaleFactor = f11;
            this.fontResId = num;
        }

        public static /* synthetic */ Typography copy$default(Typography typography, float f11, Integer num, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = typography.sizeScaleFactor;
            }
            if ((i11 & 2) != 0) {
                num = typography.fontResId;
            }
            return typography.copy(f11, num);
        }

        public final float component1() {
            return this.sizeScaleFactor;
        }

        public final Integer component2() {
            return this.fontResId;
        }

        public final Typography copy(float f11, Integer num) {
            return new Typography(f11, num);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Typography) {
                Typography typography = (Typography) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.sizeScaleFactor), Float.valueOf(typography.sizeScaleFactor)) && kotlin.jvm.internal.s.c(this.fontResId, typography.fontResId);
            }
            return false;
        }

        public final Integer getFontResId() {
            return this.fontResId;
        }

        public final float getSizeScaleFactor() {
            return this.sizeScaleFactor;
        }

        public int hashCode() {
            int hashCode = Float.hashCode(this.sizeScaleFactor) * 31;
            Integer num = this.fontResId;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Typography(sizeScaleFactor=" + this.sizeScaleFactor + ", fontResId=" + this.fontResId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            int intValue;
            kotlin.jvm.internal.s.g(out, "out");
            out.writeFloat(this.sizeScaleFactor);
            Integer num = this.fontResId;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
        }
    }

    public PaymentSheet(PaymentSheetLauncher paymentSheetLauncher) {
        kotlin.jvm.internal.s.g(paymentSheetLauncher, "paymentSheetLauncher");
        this.paymentSheetLauncher = paymentSheetLauncher;
    }

    public static /* synthetic */ void presentWithPaymentIntent$default(PaymentSheet paymentSheet, String str, Configuration configuration, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            configuration = null;
        }
        paymentSheet.presentWithPaymentIntent(str, configuration);
    }

    public static /* synthetic */ void presentWithSetupIntent$default(PaymentSheet paymentSheet, String str, Configuration configuration, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            configuration = null;
        }
        paymentSheet.presentWithSetupIntent(str, configuration);
    }

    public final void presentWithPaymentIntent(String paymentIntentClientSecret) {
        kotlin.jvm.internal.s.g(paymentIntentClientSecret, "paymentIntentClientSecret");
        presentWithPaymentIntent$default(this, paymentIntentClientSecret, null, 2, null);
    }

    public final void presentWithPaymentIntent(String paymentIntentClientSecret, Configuration configuration) {
        kotlin.jvm.internal.s.g(paymentIntentClientSecret, "paymentIntentClientSecret");
        this.paymentSheetLauncher.presentWithPaymentIntent(paymentIntentClientSecret, configuration);
    }

    public final void presentWithSetupIntent(String setupIntentClientSecret) {
        kotlin.jvm.internal.s.g(setupIntentClientSecret, "setupIntentClientSecret");
        presentWithSetupIntent$default(this, setupIntentClientSecret, null, 2, null);
    }

    public final void presentWithSetupIntent(String setupIntentClientSecret, Configuration configuration) {
        kotlin.jvm.internal.s.g(setupIntentClientSecret, "setupIntentClientSecret");
        this.paymentSheetLauncher.presentWithSetupIntent(setupIntentClientSecret, configuration);
    }

    /* loaded from: classes6.dex */
    public static final class PrimaryButtonShape implements Parcelable {
        private final Float borderStrokeWidthDp;
        private final Float cornerRadiusDp;
        public static final Parcelable.Creator<PrimaryButtonShape> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<PrimaryButtonShape> {
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonShape createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new PrimaryButtonShape(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonShape[] newArray(int i11) {
                return new PrimaryButtonShape[i11];
            }
        }

        public PrimaryButtonShape() {
            this(null, null, 3, null);
        }

        public PrimaryButtonShape(Float f11, Float f12) {
            this.cornerRadiusDp = f11;
            this.borderStrokeWidthDp = f12;
        }

        public static /* synthetic */ PrimaryButtonShape copy$default(PrimaryButtonShape primaryButtonShape, Float f11, Float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = primaryButtonShape.cornerRadiusDp;
            }
            if ((i11 & 2) != 0) {
                f12 = primaryButtonShape.borderStrokeWidthDp;
            }
            return primaryButtonShape.copy(f11, f12);
        }

        public final Float component1() {
            return this.cornerRadiusDp;
        }

        public final Float component2() {
            return this.borderStrokeWidthDp;
        }

        public final PrimaryButtonShape copy(Float f11, Float f12) {
            return new PrimaryButtonShape(f11, f12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PrimaryButtonShape) {
                PrimaryButtonShape primaryButtonShape = (PrimaryButtonShape) obj;
                return kotlin.jvm.internal.s.c(this.cornerRadiusDp, primaryButtonShape.cornerRadiusDp) && kotlin.jvm.internal.s.c(this.borderStrokeWidthDp, primaryButtonShape.borderStrokeWidthDp);
            }
            return false;
        }

        public final Float getBorderStrokeWidthDp() {
            return this.borderStrokeWidthDp;
        }

        public final Float getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        public int hashCode() {
            Float f11 = this.cornerRadiusDp;
            int hashCode = (f11 == null ? 0 : f11.hashCode()) * 31;
            Float f12 = this.borderStrokeWidthDp;
            return hashCode + (f12 != null ? f12.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonShape(cornerRadiusDp=" + this.cornerRadiusDp + ", borderStrokeWidthDp=" + this.borderStrokeWidthDp + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            Float f11 = this.cornerRadiusDp;
            if (f11 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeFloat(f11.floatValue());
            }
            Float f12 = this.borderStrokeWidthDp;
            if (f12 == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeFloat(f12.floatValue());
        }

        public /* synthetic */ PrimaryButtonShape(Float f11, Float f12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : f11, (i11 & 2) != 0 ? null : f12);
        }

        public /* synthetic */ PrimaryButtonShape(Context context, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : num2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PrimaryButtonShape(Context context, Integer num, Integer num2) {
            this(num == null ? null : Float.valueOf(PaymentsThemeKt.getRawValueFromDimenResource(context, num.intValue())), num2 != null ? Float.valueOf(PaymentsThemeKt.getRawValueFromDimenResource(context, num2.intValue())) : null);
            kotlin.jvm.internal.s.g(context, "context");
        }
    }

    /* loaded from: classes6.dex */
    public static final class PrimaryButtonTypography implements Parcelable {
        private final Integer fontResId;
        private final Float fontSizeSp;
        public static final Parcelable.Creator<PrimaryButtonTypography> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<PrimaryButtonTypography> {
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonTypography createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new PrimaryButtonTypography(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonTypography[] newArray(int i11) {
                return new PrimaryButtonTypography[i11];
            }
        }

        public PrimaryButtonTypography() {
            this(null, null, 3, null);
        }

        public PrimaryButtonTypography(Integer num, Float f11) {
            this.fontResId = num;
            this.fontSizeSp = f11;
        }

        public static /* synthetic */ PrimaryButtonTypography copy$default(PrimaryButtonTypography primaryButtonTypography, Integer num, Float f11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = primaryButtonTypography.fontResId;
            }
            if ((i11 & 2) != 0) {
                f11 = primaryButtonTypography.fontSizeSp;
            }
            return primaryButtonTypography.copy(num, f11);
        }

        public final Integer component1() {
            return this.fontResId;
        }

        public final Float component2() {
            return this.fontSizeSp;
        }

        public final PrimaryButtonTypography copy(Integer num, Float f11) {
            return new PrimaryButtonTypography(num, f11);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PrimaryButtonTypography) {
                PrimaryButtonTypography primaryButtonTypography = (PrimaryButtonTypography) obj;
                return kotlin.jvm.internal.s.c(this.fontResId, primaryButtonTypography.fontResId) && kotlin.jvm.internal.s.c(this.fontSizeSp, primaryButtonTypography.fontSizeSp);
            }
            return false;
        }

        public final Integer getFontResId() {
            return this.fontResId;
        }

        public final Float getFontSizeSp() {
            return this.fontSizeSp;
        }

        public int hashCode() {
            Integer num = this.fontResId;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Float f11 = this.fontSizeSp;
            return hashCode + (f11 != null ? f11.hashCode() : 0);
        }

        public String toString() {
            return "PrimaryButtonTypography(fontResId=" + this.fontResId + ", fontSizeSp=" + this.fontSizeSp + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            Integer num = this.fontResId;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Float f11 = this.fontSizeSp;
            if (f11 == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeFloat(f11.floatValue());
        }

        public /* synthetic */ PrimaryButtonTypography(Integer num, Float f11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : f11);
        }

        public /* synthetic */ PrimaryButtonTypography(Context context, Integer num, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i12 & 2) != 0 ? null : num, i11);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public PrimaryButtonTypography(Context context, Integer num, int i11) {
            this(num, Float.valueOf(PaymentsThemeKt.getRawValueFromDimenResource(context, i11)));
            kotlin.jvm.internal.s.g(context, "context");
        }
    }

    /* loaded from: classes6.dex */
    public static final class Shapes implements Parcelable {

        /* renamed from: default */
        private static final Shapes f25default;
        private final float borderStrokeWidthDp;
        private final float cornerRadiusDp;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Shapes> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Shapes getDefault() {
                return Shapes.f25default;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Shapes> {
            @Override // android.os.Parcelable.Creator
            public final Shapes createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new Shapes(parcel.readFloat(), parcel.readFloat());
            }

            @Override // android.os.Parcelable.Creator
            public final Shapes[] newArray(int i11) {
                return new Shapes[i11];
            }
        }

        static {
            PaymentsThemeDefaults paymentsThemeDefaults = PaymentsThemeDefaults.INSTANCE;
            f25default = new Shapes(paymentsThemeDefaults.getShapes().getCornerRadius(), paymentsThemeDefaults.getShapes().getBorderStrokeWidth());
        }

        public Shapes(float f11, float f12) {
            this.cornerRadiusDp = f11;
            this.borderStrokeWidthDp = f12;
        }

        public static /* synthetic */ Shapes copy$default(Shapes shapes, float f11, float f12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = shapes.cornerRadiusDp;
            }
            if ((i11 & 2) != 0) {
                f12 = shapes.borderStrokeWidthDp;
            }
            return shapes.copy(f11, f12);
        }

        public final float component1() {
            return this.cornerRadiusDp;
        }

        public final float component2() {
            return this.borderStrokeWidthDp;
        }

        public final Shapes copy(float f11, float f12) {
            return new Shapes(f11, f12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Shapes) {
                Shapes shapes = (Shapes) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.cornerRadiusDp), Float.valueOf(shapes.cornerRadiusDp)) && kotlin.jvm.internal.s.c(Float.valueOf(this.borderStrokeWidthDp), Float.valueOf(shapes.borderStrokeWidthDp));
            }
            return false;
        }

        public final float getBorderStrokeWidthDp() {
            return this.borderStrokeWidthDp;
        }

        public final float getCornerRadiusDp() {
            return this.cornerRadiusDp;
        }

        public int hashCode() {
            return (Float.hashCode(this.cornerRadiusDp) * 31) + Float.hashCode(this.borderStrokeWidthDp);
        }

        public String toString() {
            return "Shapes(cornerRadiusDp=" + this.cornerRadiusDp + ", borderStrokeWidthDp=" + this.borderStrokeWidthDp + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeFloat(this.cornerRadiusDp);
            out.writeFloat(this.borderStrokeWidthDp);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Shapes(Context context, int i11, int i12) {
            this(PaymentsThemeKt.getRawValueFromDimenResource(context, i11), PaymentsThemeKt.getRawValueFromDimenResource(context, i12));
            kotlin.jvm.internal.s.g(context, "context");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentSheet(ComponentActivity activity, PaymentSheetResultCallback callback) {
        this(new DefaultPaymentSheetLauncher(activity, callback));
        kotlin.jvm.internal.s.g(activity, "activity");
        kotlin.jvm.internal.s.g(callback, "callback");
    }

    /* loaded from: classes6.dex */
    public static final class GooglePayConfiguration implements Parcelable {
        private final String countryCode;
        private final String currencyCode;
        private final Environment environment;
        public static final Parcelable.Creator<GooglePayConfiguration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<GooglePayConfiguration> {
            @Override // android.os.Parcelable.Creator
            public final GooglePayConfiguration createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new GooglePayConfiguration(Environment.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final GooglePayConfiguration[] newArray(int i11) {
                return new GooglePayConfiguration[i11];
            }
        }

        /* loaded from: classes6.dex */
        public enum Environment {
            Production,
            Test
        }

        public GooglePayConfiguration(Environment environment, String countryCode, String str) {
            kotlin.jvm.internal.s.g(environment, "environment");
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            this.environment = environment;
            this.countryCode = countryCode;
            this.currencyCode = str;
        }

        public static /* synthetic */ GooglePayConfiguration copy$default(GooglePayConfiguration googlePayConfiguration, Environment environment, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                environment = googlePayConfiguration.environment;
            }
            if ((i11 & 2) != 0) {
                str = googlePayConfiguration.countryCode;
            }
            if ((i11 & 4) != 0) {
                str2 = googlePayConfiguration.currencyCode;
            }
            return googlePayConfiguration.copy(environment, str, str2);
        }

        public final Environment component1() {
            return this.environment;
        }

        public final String component2() {
            return this.countryCode;
        }

        public final String component3() {
            return this.currencyCode;
        }

        public final GooglePayConfiguration copy(Environment environment, String countryCode, String str) {
            kotlin.jvm.internal.s.g(environment, "environment");
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            return new GooglePayConfiguration(environment, countryCode, str);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof GooglePayConfiguration) {
                GooglePayConfiguration googlePayConfiguration = (GooglePayConfiguration) obj;
                return this.environment == googlePayConfiguration.environment && kotlin.jvm.internal.s.c(this.countryCode, googlePayConfiguration.countryCode) && kotlin.jvm.internal.s.c(this.currencyCode, googlePayConfiguration.currencyCode);
            }
            return false;
        }

        public final String getCountryCode() {
            return this.countryCode;
        }

        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        public final Environment getEnvironment() {
            return this.environment;
        }

        public int hashCode() {
            int hashCode = ((this.environment.hashCode() * 31) + this.countryCode.hashCode()) * 31;
            String str = this.currencyCode;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "GooglePayConfiguration(environment=" + this.environment + ", countryCode=" + this.countryCode + ", currencyCode=" + ((Object) this.currencyCode) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.environment.name());
            out.writeString(this.countryCode);
            out.writeString(this.currencyCode);
        }

        public /* synthetic */ GooglePayConfiguration(Environment environment, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(environment, str, (i11 & 4) != 0 ? null : str2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public GooglePayConfiguration(Environment environment, String countryCode) {
            this(environment, countryCode, null);
            kotlin.jvm.internal.s.g(environment, "environment");
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
        }
    }

    /* loaded from: classes6.dex */
    public static final class PrimaryButtonColors implements Parcelable {
        private static final PrimaryButtonColors defaultDark;
        private static final PrimaryButtonColors defaultLight;
        private final Integer background;
        private final int border;
        private final int onBackground;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<PrimaryButtonColors> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final PrimaryButtonColors getDefaultDark() {
                return PrimaryButtonColors.defaultDark;
            }

            public final PrimaryButtonColors getDefaultLight() {
                return PrimaryButtonColors.defaultLight;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<PrimaryButtonColors> {
            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonColors createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new PrimaryButtonColors(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final PrimaryButtonColors[] newArray(int i11) {
                return new PrimaryButtonColors[i11];
            }
        }

        static {
            PaymentsThemeDefaults paymentsThemeDefaults = PaymentsThemeDefaults.INSTANCE;
            defaultLight = new PrimaryButtonColors((Integer) null, t1.c0.j(paymentsThemeDefaults.getPrimaryButtonStyle().getColorsLight().m418getOnBackground0d7_KjU()), t1.c0.j(paymentsThemeDefaults.getPrimaryButtonStyle().getColorsLight().m417getBorder0d7_KjU()));
            defaultDark = new PrimaryButtonColors((Integer) null, t1.c0.j(paymentsThemeDefaults.getPrimaryButtonStyle().getColorsDark().m418getOnBackground0d7_KjU()), t1.c0.j(paymentsThemeDefaults.getPrimaryButtonStyle().getColorsDark().m417getBorder0d7_KjU()));
        }

        public PrimaryButtonColors(Integer num, int i11, int i12) {
            this.background = num;
            this.onBackground = i11;
            this.border = i12;
        }

        public /* synthetic */ PrimaryButtonColors(t1.a0 a0Var, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
            this(a0Var, j11, j12);
        }

        public static /* synthetic */ PrimaryButtonColors copy$default(PrimaryButtonColors primaryButtonColors, Integer num, int i11, int i12, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                num = primaryButtonColors.background;
            }
            if ((i13 & 2) != 0) {
                i11 = primaryButtonColors.onBackground;
            }
            if ((i13 & 4) != 0) {
                i12 = primaryButtonColors.border;
            }
            return primaryButtonColors.copy(num, i11, i12);
        }

        public final Integer component1() {
            return this.background;
        }

        public final int component2() {
            return this.onBackground;
        }

        public final int component3() {
            return this.border;
        }

        public final PrimaryButtonColors copy(Integer num, int i11, int i12) {
            return new PrimaryButtonColors(num, i11, i12);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PrimaryButtonColors) {
                PrimaryButtonColors primaryButtonColors = (PrimaryButtonColors) obj;
                return kotlin.jvm.internal.s.c(this.background, primaryButtonColors.background) && this.onBackground == primaryButtonColors.onBackground && this.border == primaryButtonColors.border;
            }
            return false;
        }

        public final Integer getBackground() {
            return this.background;
        }

        public final int getBorder() {
            return this.border;
        }

        public final int getOnBackground() {
            return this.onBackground;
        }

        public int hashCode() {
            Integer num = this.background;
            return ((((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.onBackground)) * 31) + Integer.hashCode(this.border);
        }

        public String toString() {
            return "PrimaryButtonColors(background=" + this.background + ", onBackground=" + this.onBackground + ", border=" + this.border + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            int intValue;
            kotlin.jvm.internal.s.g(out, "out");
            Integer num = this.background;
            if (num == null) {
                intValue = 0;
            } else {
                out.writeInt(1);
                intValue = num.intValue();
            }
            out.writeInt(intValue);
            out.writeInt(this.onBackground);
            out.writeInt(this.border);
        }

        private PrimaryButtonColors(t1.a0 a0Var, long j11, long j12) {
            this(a0Var == null ? null : Integer.valueOf(t1.c0.j(a0Var.v())), t1.c0.j(j11), t1.c0.j(j12));
        }
    }

    /* loaded from: classes6.dex */
    public static final class BillingDetails implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<BillingDetails> CREATOR = new Creator();
        private final Address address;
        private final String email;
        private final String name;
        private final String phone;

        /* loaded from: classes6.dex */
        public static final class Builder {
            public static final int $stable = 8;
            private Address address;
            private String email;
            private String name;
            private String phone;

            public final Builder address(Address address) {
                this.address = address;
                return this;
            }

            public final BillingDetails build() {
                return new BillingDetails(this.address, this.email, this.name, this.phone);
            }

            public final Builder email(String str) {
                this.email = str;
                return this;
            }

            public final Builder name(String str) {
                this.name = str;
                return this;
            }

            public final Builder phone(String str) {
                this.phone = str;
                return this;
            }

            public final Builder address(Address.Builder addressBuilder) {
                kotlin.jvm.internal.s.g(addressBuilder, "addressBuilder");
                this.address = addressBuilder.build();
                return this;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<BillingDetails> {
            @Override // android.os.Parcelable.Creator
            public final BillingDetails createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new BillingDetails(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BillingDetails[] newArray(int i11) {
                return new BillingDetails[i11];
            }
        }

        public BillingDetails() {
            this(null, null, null, null, 15, null);
        }

        public BillingDetails(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public static /* synthetic */ BillingDetails copy$default(BillingDetails billingDetails, Address address, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                address = billingDetails.address;
            }
            if ((i11 & 2) != 0) {
                str = billingDetails.email;
            }
            if ((i11 & 4) != 0) {
                str2 = billingDetails.name;
            }
            if ((i11 & 8) != 0) {
                str3 = billingDetails.phone;
            }
            return billingDetails.copy(address, str, str2, str3);
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final BillingDetails copy(Address address, String str, String str2, String str3) {
            return new BillingDetails(address, str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof BillingDetails) {
                BillingDetails billingDetails = (BillingDetails) obj;
                return kotlin.jvm.internal.s.c(this.address, billingDetails.address) && kotlin.jvm.internal.s.c(this.email, billingDetails.email) && kotlin.jvm.internal.s.c(this.name, billingDetails.name) && kotlin.jvm.internal.s.c(this.phone, billingDetails.phone);
            }
            return false;
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BillingDetails(address=" + this.address + ", email=" + ((Object) this.email) + ", name=" + ((Object) this.name) + ", phone=" + ((Object) this.phone) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            Address address = this.address;
            if (address == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address.writeToParcel(out, i11);
            }
            out.writeString(this.email);
            out.writeString(this.name);
            out.writeString(this.phone);
        }

        public /* synthetic */ BillingDetails(Address address, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : address, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
        }
    }

    /* loaded from: classes6.dex */
    public static final class PrimaryButton implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<PrimaryButton> CREATOR = new Creator();
        private final PrimaryButtonColors colorsDark;
        private final PrimaryButtonColors colorsLight;
        private final PrimaryButtonShape shape;
        private final PrimaryButtonTypography typography;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<PrimaryButton> {
            @Override // android.os.Parcelable.Creator
            public final PrimaryButton createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                Parcelable.Creator<PrimaryButtonColors> creator = PrimaryButtonColors.CREATOR;
                return new PrimaryButton(creator.createFromParcel(parcel), creator.createFromParcel(parcel), PrimaryButtonShape.CREATOR.createFromParcel(parcel), PrimaryButtonTypography.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final PrimaryButton[] newArray(int i11) {
                return new PrimaryButton[i11];
            }
        }

        public PrimaryButton() {
            this(null, null, null, null, 15, null);
        }

        public PrimaryButton(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
            kotlin.jvm.internal.s.g(colorsLight, "colorsLight");
            kotlin.jvm.internal.s.g(colorsDark, "colorsDark");
            kotlin.jvm.internal.s.g(shape, "shape");
            kotlin.jvm.internal.s.g(typography, "typography");
            this.colorsLight = colorsLight;
            this.colorsDark = colorsDark;
            this.shape = shape;
            this.typography = typography;
        }

        public static /* synthetic */ PrimaryButton copy$default(PrimaryButton primaryButton, PrimaryButtonColors primaryButtonColors, PrimaryButtonColors primaryButtonColors2, PrimaryButtonShape primaryButtonShape, PrimaryButtonTypography primaryButtonTypography, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                primaryButtonColors = primaryButton.colorsLight;
            }
            if ((i11 & 2) != 0) {
                primaryButtonColors2 = primaryButton.colorsDark;
            }
            if ((i11 & 4) != 0) {
                primaryButtonShape = primaryButton.shape;
            }
            if ((i11 & 8) != 0) {
                primaryButtonTypography = primaryButton.typography;
            }
            return primaryButton.copy(primaryButtonColors, primaryButtonColors2, primaryButtonShape, primaryButtonTypography);
        }

        public final PrimaryButtonColors component1() {
            return this.colorsLight;
        }

        public final PrimaryButtonColors component2() {
            return this.colorsDark;
        }

        public final PrimaryButtonShape component3() {
            return this.shape;
        }

        public final PrimaryButtonTypography component4() {
            return this.typography;
        }

        public final PrimaryButton copy(PrimaryButtonColors colorsLight, PrimaryButtonColors colorsDark, PrimaryButtonShape shape, PrimaryButtonTypography typography) {
            kotlin.jvm.internal.s.g(colorsLight, "colorsLight");
            kotlin.jvm.internal.s.g(colorsDark, "colorsDark");
            kotlin.jvm.internal.s.g(shape, "shape");
            kotlin.jvm.internal.s.g(typography, "typography");
            return new PrimaryButton(colorsLight, colorsDark, shape, typography);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PrimaryButton) {
                PrimaryButton primaryButton = (PrimaryButton) obj;
                return kotlin.jvm.internal.s.c(this.colorsLight, primaryButton.colorsLight) && kotlin.jvm.internal.s.c(this.colorsDark, primaryButton.colorsDark) && kotlin.jvm.internal.s.c(this.shape, primaryButton.shape) && kotlin.jvm.internal.s.c(this.typography, primaryButton.typography);
            }
            return false;
        }

        public final PrimaryButtonColors getColorsDark() {
            return this.colorsDark;
        }

        public final PrimaryButtonColors getColorsLight() {
            return this.colorsLight;
        }

        public final PrimaryButtonShape getShape() {
            return this.shape;
        }

        public final PrimaryButtonTypography getTypography() {
            return this.typography;
        }

        public int hashCode() {
            return (((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.shape.hashCode()) * 31) + this.typography.hashCode();
        }

        public String toString() {
            return "PrimaryButton(colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ", shape=" + this.shape + ", typography=" + this.typography + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            this.colorsLight.writeToParcel(out, i11);
            this.colorsDark.writeToParcel(out, i11);
            this.shape.writeToParcel(out, i11);
            this.typography.writeToParcel(out, i11);
        }

        public /* synthetic */ PrimaryButton(PrimaryButtonColors primaryButtonColors, PrimaryButtonColors primaryButtonColors2, PrimaryButtonShape primaryButtonShape, PrimaryButtonTypography primaryButtonTypography, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? PrimaryButtonColors.Companion.getDefaultLight() : primaryButtonColors, (i11 & 2) != 0 ? PrimaryButtonColors.Companion.getDefaultDark() : primaryButtonColors2, (i11 & 4) != 0 ? new PrimaryButtonShape(null, null, 3, null) : primaryButtonShape, (i11 & 8) != 0 ? new PrimaryButtonTypography(null, null, 3, null) : primaryButtonTypography);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentSheet(Fragment fragment, PaymentSheetResultCallback callback) {
        this(new DefaultPaymentSheetLauncher(fragment, callback));
        kotlin.jvm.internal.s.g(fragment, "fragment");
        kotlin.jvm.internal.s.g(callback, "callback");
    }

    /* loaded from: classes6.dex */
    public static final class Appearance implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Appearance> CREATOR = new Creator();
        private final Colors colorsDark;
        private final Colors colorsLight;
        private final PrimaryButton primaryButton;
        private final Shapes shapes;
        private final Typography typography;

        /* loaded from: classes6.dex */
        public static final class Builder {
            public static final int $stable = 8;
            private Colors colorsDark;
            private Colors colorsLight;
            private PrimaryButton primaryButton;
            private Shapes shapes;
            private Typography typography;

            public Builder() {
                Colors.Companion companion = Colors.Companion;
                this.colorsLight = companion.getDefaultLight();
                this.colorsDark = companion.getDefaultDark();
                this.shapes = Shapes.Companion.getDefault();
                this.typography = Typography.Companion.getDefault();
                this.primaryButton = new PrimaryButton(null, null, null, null, 15, null);
            }

            public final Builder colorsDark(Colors colors) {
                kotlin.jvm.internal.s.g(colors, "colors");
                this.colorsDark = colors;
                return this;
            }

            public final Builder colorsLight(Colors colors) {
                kotlin.jvm.internal.s.g(colors, "colors");
                this.colorsLight = colors;
                return this;
            }

            public final Builder primaryButton(PrimaryButton primaryButton) {
                kotlin.jvm.internal.s.g(primaryButton, "primaryButton");
                this.primaryButton = primaryButton;
                return this;
            }

            public final Builder shapes(Shapes shapes) {
                kotlin.jvm.internal.s.g(shapes, "shapes");
                this.shapes = shapes;
                return this;
            }

            public final Builder typography(Typography typography) {
                kotlin.jvm.internal.s.g(typography, "typography");
                this.typography = typography;
                return this;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Appearance> {
            @Override // android.os.Parcelable.Creator
            public final Appearance createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                Parcelable.Creator<Colors> creator = Colors.CREATOR;
                return new Appearance(creator.createFromParcel(parcel), creator.createFromParcel(parcel), Shapes.CREATOR.createFromParcel(parcel), Typography.CREATOR.createFromParcel(parcel), PrimaryButton.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Appearance[] newArray(int i11) {
                return new Appearance[i11];
            }
        }

        public Appearance() {
            this(null, null, null, null, null, 31, null);
        }

        public Appearance(Colors colorsLight, Colors colorsDark, Shapes shapes, Typography typography, PrimaryButton primaryButton) {
            kotlin.jvm.internal.s.g(colorsLight, "colorsLight");
            kotlin.jvm.internal.s.g(colorsDark, "colorsDark");
            kotlin.jvm.internal.s.g(shapes, "shapes");
            kotlin.jvm.internal.s.g(typography, "typography");
            kotlin.jvm.internal.s.g(primaryButton, "primaryButton");
            this.colorsLight = colorsLight;
            this.colorsDark = colorsDark;
            this.shapes = shapes;
            this.typography = typography;
            this.primaryButton = primaryButton;
        }

        public static /* synthetic */ Appearance copy$default(Appearance appearance, Colors colors, Colors colors2, Shapes shapes, Typography typography, PrimaryButton primaryButton, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                colors = appearance.colorsLight;
            }
            if ((i11 & 2) != 0) {
                colors2 = appearance.colorsDark;
            }
            Colors colors3 = colors2;
            if ((i11 & 4) != 0) {
                shapes = appearance.shapes;
            }
            Shapes shapes2 = shapes;
            if ((i11 & 8) != 0) {
                typography = appearance.typography;
            }
            Typography typography2 = typography;
            if ((i11 & 16) != 0) {
                primaryButton = appearance.primaryButton;
            }
            return appearance.copy(colors, colors3, shapes2, typography2, primaryButton);
        }

        public final Colors component1() {
            return this.colorsLight;
        }

        public final Colors component2() {
            return this.colorsDark;
        }

        public final Shapes component3() {
            return this.shapes;
        }

        public final Typography component4() {
            return this.typography;
        }

        public final PrimaryButton component5() {
            return this.primaryButton;
        }

        public final Appearance copy(Colors colorsLight, Colors colorsDark, Shapes shapes, Typography typography, PrimaryButton primaryButton) {
            kotlin.jvm.internal.s.g(colorsLight, "colorsLight");
            kotlin.jvm.internal.s.g(colorsDark, "colorsDark");
            kotlin.jvm.internal.s.g(shapes, "shapes");
            kotlin.jvm.internal.s.g(typography, "typography");
            kotlin.jvm.internal.s.g(primaryButton, "primaryButton");
            return new Appearance(colorsLight, colorsDark, shapes, typography, primaryButton);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Appearance) {
                Appearance appearance = (Appearance) obj;
                return kotlin.jvm.internal.s.c(this.colorsLight, appearance.colorsLight) && kotlin.jvm.internal.s.c(this.colorsDark, appearance.colorsDark) && kotlin.jvm.internal.s.c(this.shapes, appearance.shapes) && kotlin.jvm.internal.s.c(this.typography, appearance.typography) && kotlin.jvm.internal.s.c(this.primaryButton, appearance.primaryButton);
            }
            return false;
        }

        public final Colors getColors(boolean z11) {
            return z11 ? this.colorsDark : this.colorsLight;
        }

        public final Colors getColorsDark() {
            return this.colorsDark;
        }

        public final Colors getColorsLight() {
            return this.colorsLight;
        }

        public final PrimaryButton getPrimaryButton() {
            return this.primaryButton;
        }

        public final Shapes getShapes() {
            return this.shapes;
        }

        public final Typography getTypography() {
            return this.typography;
        }

        public int hashCode() {
            return (((((((this.colorsLight.hashCode() * 31) + this.colorsDark.hashCode()) * 31) + this.shapes.hashCode()) * 31) + this.typography.hashCode()) * 31) + this.primaryButton.hashCode();
        }

        public String toString() {
            return "Appearance(colorsLight=" + this.colorsLight + ", colorsDark=" + this.colorsDark + ", shapes=" + this.shapes + ", typography=" + this.typography + ", primaryButton=" + this.primaryButton + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            this.colorsLight.writeToParcel(out, i11);
            this.colorsDark.writeToParcel(out, i11);
            this.shapes.writeToParcel(out, i11);
            this.typography.writeToParcel(out, i11);
            this.primaryButton.writeToParcel(out, i11);
        }

        public /* synthetic */ Appearance(Colors colors, Colors colors2, Shapes shapes, Typography typography, PrimaryButton primaryButton, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? Colors.Companion.getDefaultLight() : colors, (i11 & 2) != 0 ? Colors.Companion.getDefaultDark() : colors2, (i11 & 4) != 0 ? Shapes.Companion.getDefault() : shapes, (i11 & 8) != 0 ? Typography.Companion.getDefault() : typography, (i11 & 16) != 0 ? new PrimaryButton(null, null, null, null, 15, null) : primaryButton);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Address implements Parcelable {
        private final String city;
        private final String country;
        private final String line1;
        private final String line2;
        private final String postalCode;
        private final String state;
        public static final Parcelable.Creator<Address> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Builder {
            public static final int $stable = 8;
            private String city;
            private String country;
            private String line1;
            private String line2;
            private String postalCode;
            private String state;

            public final Address build() {
                return new Address(this.city, this.country, this.line1, this.line2, this.postalCode, this.state);
            }

            public final Builder city(String str) {
                this.city = str;
                return this;
            }

            public final Builder country(String str) {
                this.country = str;
                return this;
            }

            public final Builder line1(String str) {
                this.line1 = str;
                return this;
            }

            public final Builder line2(String str) {
                this.line2 = str;
                return this;
            }

            public final Builder postalCode(String str) {
                this.postalCode = str;
                return this;
            }

            public final Builder state(String str) {
                this.state = str;
                return this;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Address> {
            @Override // android.os.Parcelable.Creator
            public final Address createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Address[] newArray(int i11) {
                return new Address[i11];
            }
        }

        public Address() {
            this(null, null, null, null, null, null, 63, null);
        }

        public Address(String str, String str2, String str3, String str4, String str5, String str6) {
            this.city = str;
            this.country = str2;
            this.line1 = str3;
            this.line2 = str4;
            this.postalCode = str5;
            this.state = str6;
        }

        public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = address.city;
            }
            if ((i11 & 2) != 0) {
                str2 = address.country;
            }
            String str7 = str2;
            if ((i11 & 4) != 0) {
                str3 = address.line1;
            }
            String str8 = str3;
            if ((i11 & 8) != 0) {
                str4 = address.line2;
            }
            String str9 = str4;
            if ((i11 & 16) != 0) {
                str5 = address.postalCode;
            }
            String str10 = str5;
            if ((i11 & 32) != 0) {
                str6 = address.state;
            }
            return address.copy(str, str7, str8, str9, str10, str6);
        }

        public final String component1() {
            return this.city;
        }

        public final String component2() {
            return this.country;
        }

        public final String component3() {
            return this.line1;
        }

        public final String component4() {
            return this.line2;
        }

        public final String component5() {
            return this.postalCode;
        }

        public final String component6() {
            return this.state;
        }

        public final Address copy(String str, String str2, String str3, String str4, String str5, String str6) {
            return new Address(str, str2, str3, str4, str5, str6);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Address) {
                Address address = (Address) obj;
                return kotlin.jvm.internal.s.c(this.city, address.city) && kotlin.jvm.internal.s.c(this.country, address.country) && kotlin.jvm.internal.s.c(this.line1, address.line1) && kotlin.jvm.internal.s.c(this.line2, address.line2) && kotlin.jvm.internal.s.c(this.postalCode, address.postalCode) && kotlin.jvm.internal.s.c(this.state, address.state);
            }
            return false;
        }

        public final String getCity() {
            return this.city;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getLine1() {
            return this.line1;
        }

        public final String getLine2() {
            return this.line2;
        }

        public final String getPostalCode() {
            return this.postalCode;
        }

        public final String getState() {
            return this.state;
        }

        public int hashCode() {
            String str = this.city;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.country;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.line1;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.line2;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.postalCode;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.state;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Address(city=" + ((Object) this.city) + ", country=" + ((Object) this.country) + ", line1=" + ((Object) this.line1) + ", line2=" + ((Object) this.line2) + ", postalCode=" + ((Object) this.postalCode) + ", state=" + ((Object) this.state) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.city);
            out.writeString(this.country);
            out.writeString(this.line1);
            out.writeString(this.line2);
            out.writeString(this.postalCode);
            out.writeString(this.state);
        }

        public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Configuration implements Parcelable {
        private final boolean allowsDelayedPaymentMethods;
        private final Appearance appearance;
        private final CustomerConfiguration customer;
        private final BillingDetails defaultBillingDetails;
        private final GooglePayConfiguration googlePay;
        private final String merchantDisplayName;
        private final ColorStateList primaryButtonColor;
        public static final Parcelable.Creator<Configuration> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Builder {
            public static final int $stable = 8;
            private boolean allowsDelayedPaymentMethods;
            private Appearance appearance;
            private CustomerConfiguration customer;
            private BillingDetails defaultBillingDetails;
            private GooglePayConfiguration googlePay;
            private String merchantDisplayName;
            private ColorStateList primaryButtonColor;

            public Builder(String merchantDisplayName) {
                kotlin.jvm.internal.s.g(merchantDisplayName, "merchantDisplayName");
                this.merchantDisplayName = merchantDisplayName;
                this.appearance = new Appearance(null, null, null, null, null, 31, null);
            }

            public final Builder allowsDelayedPaymentMethods(boolean z11) {
                this.allowsDelayedPaymentMethods = z11;
                return this;
            }

            public final Builder appearance(Appearance appearance) {
                kotlin.jvm.internal.s.g(appearance, "appearance");
                this.appearance = appearance;
                return this;
            }

            public final Configuration build() {
                return new Configuration(this.merchantDisplayName, this.customer, this.googlePay, this.primaryButtonColor, this.defaultBillingDetails, this.allowsDelayedPaymentMethods, this.appearance);
            }

            public final Builder customer(CustomerConfiguration customerConfiguration) {
                this.customer = customerConfiguration;
                return this;
            }

            public final Builder defaultBillingDetails(BillingDetails billingDetails) {
                this.defaultBillingDetails = billingDetails;
                return this;
            }

            public final Builder googlePay(GooglePayConfiguration googlePayConfiguration) {
                this.googlePay = googlePayConfiguration;
                return this;
            }

            public final Builder merchantDisplayName(String merchantDisplayName) {
                kotlin.jvm.internal.s.g(merchantDisplayName, "merchantDisplayName");
                this.merchantDisplayName = merchantDisplayName;
                return this;
            }

            public final Builder primaryButtonColor(ColorStateList colorStateList) {
                this.primaryButtonColor = colorStateList;
                return this;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Configuration> {
            @Override // android.os.Parcelable.Creator
            public final Configuration createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new Configuration(parcel.readString(), parcel.readInt() == 0 ? null : CustomerConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GooglePayConfiguration.CREATOR.createFromParcel(parcel), (ColorStateList) parcel.readParcelable(Configuration.class.getClassLoader()), parcel.readInt() != 0 ? BillingDetails.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, Appearance.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Configuration[] newArray(int i11) {
                return new Configuration[i11];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName) {
            this(merchantDisplayName, null, null, null, null, false, null, 126, null);
            kotlin.jvm.internal.s.g(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration) {
            this(merchantDisplayName, customerConfiguration, null, null, null, false, null, 124, null);
            kotlin.jvm.internal.s.g(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, null, null, false, null, 120, null);
            kotlin.jvm.internal.s.g(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, null, false, null, 112, null);
            kotlin.jvm.internal.s.g(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, false, null, 96, null);
            kotlin.jvm.internal.s.g(merchantDisplayName, "merchantDisplayName");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, boolean z11) {
            this(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, z11, null, 64, null);
            kotlin.jvm.internal.s.g(merchantDisplayName, "merchantDisplayName");
        }

        public Configuration(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, boolean z11, Appearance appearance) {
            kotlin.jvm.internal.s.g(merchantDisplayName, "merchantDisplayName");
            kotlin.jvm.internal.s.g(appearance, "appearance");
            this.merchantDisplayName = merchantDisplayName;
            this.customer = customerConfiguration;
            this.googlePay = googlePayConfiguration;
            this.primaryButtonColor = colorStateList;
            this.defaultBillingDetails = billingDetails;
            this.allowsDelayedPaymentMethods = z11;
            this.appearance = appearance;
        }

        public static /* synthetic */ Configuration copy$default(Configuration configuration, String str, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, boolean z11, Appearance appearance, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = configuration.merchantDisplayName;
            }
            if ((i11 & 2) != 0) {
                customerConfiguration = configuration.customer;
            }
            CustomerConfiguration customerConfiguration2 = customerConfiguration;
            if ((i11 & 4) != 0) {
                googlePayConfiguration = configuration.googlePay;
            }
            GooglePayConfiguration googlePayConfiguration2 = googlePayConfiguration;
            if ((i11 & 8) != 0) {
                colorStateList = configuration.primaryButtonColor;
            }
            ColorStateList colorStateList2 = colorStateList;
            if ((i11 & 16) != 0) {
                billingDetails = configuration.defaultBillingDetails;
            }
            BillingDetails billingDetails2 = billingDetails;
            if ((i11 & 32) != 0) {
                z11 = configuration.allowsDelayedPaymentMethods;
            }
            boolean z12 = z11;
            if ((i11 & 64) != 0) {
                appearance = configuration.appearance;
            }
            return configuration.copy(str, customerConfiguration2, googlePayConfiguration2, colorStateList2, billingDetails2, z12, appearance);
        }

        public static /* synthetic */ void getPrimaryButtonColor$annotations() {
        }

        public final String component1() {
            return this.merchantDisplayName;
        }

        public final CustomerConfiguration component2() {
            return this.customer;
        }

        public final GooglePayConfiguration component3() {
            return this.googlePay;
        }

        public final ColorStateList component4() {
            return this.primaryButtonColor;
        }

        public final BillingDetails component5() {
            return this.defaultBillingDetails;
        }

        public final boolean component6() {
            return this.allowsDelayedPaymentMethods;
        }

        public final Appearance component7() {
            return this.appearance;
        }

        public final Configuration copy(String merchantDisplayName, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, boolean z11, Appearance appearance) {
            kotlin.jvm.internal.s.g(merchantDisplayName, "merchantDisplayName");
            kotlin.jvm.internal.s.g(appearance, "appearance");
            return new Configuration(merchantDisplayName, customerConfiguration, googlePayConfiguration, colorStateList, billingDetails, z11, appearance);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Configuration) {
                Configuration configuration = (Configuration) obj;
                return kotlin.jvm.internal.s.c(this.merchantDisplayName, configuration.merchantDisplayName) && kotlin.jvm.internal.s.c(this.customer, configuration.customer) && kotlin.jvm.internal.s.c(this.googlePay, configuration.googlePay) && kotlin.jvm.internal.s.c(this.primaryButtonColor, configuration.primaryButtonColor) && kotlin.jvm.internal.s.c(this.defaultBillingDetails, configuration.defaultBillingDetails) && this.allowsDelayedPaymentMethods == configuration.allowsDelayedPaymentMethods && kotlin.jvm.internal.s.c(this.appearance, configuration.appearance);
            }
            return false;
        }

        public final boolean getAllowsDelayedPaymentMethods() {
            return this.allowsDelayedPaymentMethods;
        }

        public final Appearance getAppearance() {
            return this.appearance;
        }

        public final CustomerConfiguration getCustomer() {
            return this.customer;
        }

        public final BillingDetails getDefaultBillingDetails() {
            return this.defaultBillingDetails;
        }

        public final GooglePayConfiguration getGooglePay() {
            return this.googlePay;
        }

        public final String getMerchantDisplayName() {
            return this.merchantDisplayName;
        }

        public final ColorStateList getPrimaryButtonColor() {
            return this.primaryButtonColor;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.merchantDisplayName.hashCode() * 31;
            CustomerConfiguration customerConfiguration = this.customer;
            int hashCode2 = (hashCode + (customerConfiguration == null ? 0 : customerConfiguration.hashCode())) * 31;
            GooglePayConfiguration googlePayConfiguration = this.googlePay;
            int hashCode3 = (hashCode2 + (googlePayConfiguration == null ? 0 : googlePayConfiguration.hashCode())) * 31;
            ColorStateList colorStateList = this.primaryButtonColor;
            int hashCode4 = (hashCode3 + (colorStateList == null ? 0 : colorStateList.hashCode())) * 31;
            BillingDetails billingDetails = this.defaultBillingDetails;
            int hashCode5 = (hashCode4 + (billingDetails != null ? billingDetails.hashCode() : 0)) * 31;
            boolean z11 = this.allowsDelayedPaymentMethods;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return ((hashCode5 + i11) * 31) + this.appearance.hashCode();
        }

        public String toString() {
            return "Configuration(merchantDisplayName=" + this.merchantDisplayName + ", customer=" + this.customer + ", googlePay=" + this.googlePay + ", primaryButtonColor=" + this.primaryButtonColor + ", defaultBillingDetails=" + this.defaultBillingDetails + ", allowsDelayedPaymentMethods=" + this.allowsDelayedPaymentMethods + ", appearance=" + this.appearance + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.merchantDisplayName);
            CustomerConfiguration customerConfiguration = this.customer;
            if (customerConfiguration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                customerConfiguration.writeToParcel(out, i11);
            }
            GooglePayConfiguration googlePayConfiguration = this.googlePay;
            if (googlePayConfiguration == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                googlePayConfiguration.writeToParcel(out, i11);
            }
            out.writeParcelable(this.primaryButtonColor, i11);
            BillingDetails billingDetails = this.defaultBillingDetails;
            if (billingDetails == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                billingDetails.writeToParcel(out, i11);
            }
            out.writeInt(this.allowsDelayedPaymentMethods ? 1 : 0);
            this.appearance.writeToParcel(out, i11);
        }

        public /* synthetic */ Configuration(String str, CustomerConfiguration customerConfiguration, GooglePayConfiguration googlePayConfiguration, ColorStateList colorStateList, BillingDetails billingDetails, boolean z11, Appearance appearance, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? null : customerConfiguration, (i11 & 4) != 0 ? null : googlePayConfiguration, (i11 & 8) != 0 ? null : colorStateList, (i11 & 16) == 0 ? billingDetails : null, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? new Appearance(null, null, null, null, null, 31, null) : appearance);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Colors implements Parcelable {
        private static final Colors defaultDark;
        private static final Colors defaultLight;
        private final int appBarIcon;
        private final int component;
        private final int componentBorder;
        private final int componentDivider;
        private final int error;
        private final int onComponent;
        private final int onSurface;
        private final int placeholderText;
        private final int primary;
        private final int subtitle;
        private final int surface;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Colors> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Colors getDefaultDark() {
                return Colors.defaultDark;
            }

            public final Colors getDefaultLight() {
                return Colors.defaultLight;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Colors> {
            @Override // android.os.Parcelable.Creator
            public final Colors createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new Colors(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Colors[] newArray(int i11) {
                return new Colors[i11];
            }
        }

        static {
            PaymentsThemeDefaults paymentsThemeDefaults = PaymentsThemeDefaults.INSTANCE;
            defaultLight = new Colors(paymentsThemeDefaults.getColorsLight().getMaterialColors().j(), paymentsThemeDefaults.getColorsLight().getMaterialColors().n(), paymentsThemeDefaults.getColorsLight().m381getComponent0d7_KjU(), paymentsThemeDefaults.getColorsLight().m382getComponentBorder0d7_KjU(), paymentsThemeDefaults.getColorsLight().m383getComponentDivider0d7_KjU(), paymentsThemeDefaults.getColorsLight().m384getOnComponent0d7_KjU(), paymentsThemeDefaults.getColorsLight().m386getSubtitle0d7_KjU(), paymentsThemeDefaults.getColorsLight().m385getPlaceholderText0d7_KjU(), paymentsThemeDefaults.getColorsLight().getMaterialColors().i(), paymentsThemeDefaults.getColorsLight().m380getAppBarIcon0d7_KjU(), paymentsThemeDefaults.getColorsLight().getMaterialColors().d(), null);
            defaultDark = new Colors(paymentsThemeDefaults.getColorsDark().getMaterialColors().j(), paymentsThemeDefaults.getColorsDark().getMaterialColors().n(), paymentsThemeDefaults.getColorsDark().m381getComponent0d7_KjU(), paymentsThemeDefaults.getColorsDark().m382getComponentBorder0d7_KjU(), paymentsThemeDefaults.getColorsDark().m383getComponentDivider0d7_KjU(), paymentsThemeDefaults.getColorsDark().m384getOnComponent0d7_KjU(), paymentsThemeDefaults.getColorsDark().m386getSubtitle0d7_KjU(), paymentsThemeDefaults.getColorsDark().m385getPlaceholderText0d7_KjU(), paymentsThemeDefaults.getColorsDark().getMaterialColors().i(), paymentsThemeDefaults.getColorsDark().m380getAppBarIcon0d7_KjU(), paymentsThemeDefaults.getColorsDark().getMaterialColors().d(), null);
        }

        public Colors(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22) {
            this.primary = i11;
            this.surface = i12;
            this.component = i13;
            this.componentBorder = i14;
            this.componentDivider = i15;
            this.onComponent = i16;
            this.onSurface = i17;
            this.subtitle = i18;
            this.placeholderText = i19;
            this.appBarIcon = i21;
            this.error = i22;
        }

        public /* synthetic */ Colors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22);
        }

        public final int component1() {
            return this.primary;
        }

        public final int component10() {
            return this.appBarIcon;
        }

        public final int component11() {
            return this.error;
        }

        public final int component2() {
            return this.surface;
        }

        public final int component3() {
            return this.component;
        }

        public final int component4() {
            return this.componentBorder;
        }

        public final int component5() {
            return this.componentDivider;
        }

        public final int component6() {
            return this.onComponent;
        }

        public final int component7() {
            return this.onSurface;
        }

        public final int component8() {
            return this.subtitle;
        }

        public final int component9() {
            return this.placeholderText;
        }

        public final Colors copy(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22) {
            return new Colors(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, i22);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Colors) {
                Colors colors = (Colors) obj;
                return this.primary == colors.primary && this.surface == colors.surface && this.component == colors.component && this.componentBorder == colors.componentBorder && this.componentDivider == colors.componentDivider && this.onComponent == colors.onComponent && this.onSurface == colors.onSurface && this.subtitle == colors.subtitle && this.placeholderText == colors.placeholderText && this.appBarIcon == colors.appBarIcon && this.error == colors.error;
            }
            return false;
        }

        public final int getAppBarIcon() {
            return this.appBarIcon;
        }

        public final int getComponent() {
            return this.component;
        }

        public final int getComponentBorder() {
            return this.componentBorder;
        }

        public final int getComponentDivider() {
            return this.componentDivider;
        }

        public final int getError() {
            return this.error;
        }

        public final int getOnComponent() {
            return this.onComponent;
        }

        public final int getOnSurface() {
            return this.onSurface;
        }

        public final int getPlaceholderText() {
            return this.placeholderText;
        }

        public final int getPrimary() {
            return this.primary;
        }

        public final int getSubtitle() {
            return this.subtitle;
        }

        public final int getSurface() {
            return this.surface;
        }

        public int hashCode() {
            return (((((((((((((((((((Integer.hashCode(this.primary) * 31) + Integer.hashCode(this.surface)) * 31) + Integer.hashCode(this.component)) * 31) + Integer.hashCode(this.componentBorder)) * 31) + Integer.hashCode(this.componentDivider)) * 31) + Integer.hashCode(this.onComponent)) * 31) + Integer.hashCode(this.onSurface)) * 31) + Integer.hashCode(this.subtitle)) * 31) + Integer.hashCode(this.placeholderText)) * 31) + Integer.hashCode(this.appBarIcon)) * 31) + Integer.hashCode(this.error);
        }

        public String toString() {
            return "Colors(primary=" + this.primary + ", surface=" + this.surface + ", component=" + this.component + ", componentBorder=" + this.componentBorder + ", componentDivider=" + this.componentDivider + ", onComponent=" + this.onComponent + ", onSurface=" + this.onSurface + ", subtitle=" + this.subtitle + ", placeholderText=" + this.placeholderText + ", appBarIcon=" + this.appBarIcon + ", error=" + this.error + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeInt(this.primary);
            out.writeInt(this.surface);
            out.writeInt(this.component);
            out.writeInt(this.componentBorder);
            out.writeInt(this.componentDivider);
            out.writeInt(this.onComponent);
            out.writeInt(this.onSurface);
            out.writeInt(this.subtitle);
            out.writeInt(this.placeholderText);
            out.writeInt(this.appBarIcon);
            out.writeInt(this.error);
        }

        private Colors(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22) {
            this(t1.c0.j(j11), t1.c0.j(j12), t1.c0.j(j13), t1.c0.j(j14), t1.c0.j(j15), t1.c0.j(j16), t1.c0.j(j19), t1.c0.j(j17), t1.c0.j(j18), t1.c0.j(j21), t1.c0.j(j22));
        }
    }
}