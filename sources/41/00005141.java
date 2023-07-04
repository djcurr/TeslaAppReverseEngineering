package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.PaymentIntentJsonParser;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.i;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import wz.e0;
import wz.w;
import wz.x0;

/* loaded from: classes6.dex */
public final class PaymentIntent implements StripeIntent {
    private final Long amount;
    private final long canceledAt;
    private final CancellationReason cancellationReason;
    private final CaptureMethod captureMethod;
    private final String clientSecret;
    private final ConfirmationMethod confirmationMethod;
    private final long created;
    private final String currency;
    private final String description;

    /* renamed from: id  reason: collision with root package name */
    private final String f20931id;
    private final boolean isLiveMode;
    private final Error lastPaymentError;
    private final StripeIntent.NextActionData nextActionData;
    private final PaymentMethod paymentMethod;
    private final String paymentMethodId;
    private final List<String> paymentMethodTypes;
    private final String receiptEmail;
    private final StripeIntent.Usage setupFutureUsage;
    private final Shipping shipping;
    private final StripeIntent.Status status;
    private final List<String> unactivatedPaymentMethods;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PaymentIntent> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public enum CancellationReason {
        Duplicate("duplicate"),
        Fraudulent("fraudulent"),
        RequestedByCustomer("requested_by_customer"),
        Abandoned("abandoned"),
        FailedInvoice("failed_invoice"),
        VoidInvoice("void_invoice"),
        Automatic("automatic");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CancellationReason fromCode(String str) {
                CancellationReason[] values;
                for (CancellationReason cancellationReason : CancellationReason.values()) {
                    if (s.c(cancellationReason.code, str)) {
                        return cancellationReason;
                    }
                }
                return null;
            }
        }

        CancellationReason(String str) {
            this.code = str;
        }
    }

    /* loaded from: classes6.dex */
    public enum CaptureMethod {
        Automatic("automatic"),
        Manual("manual");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CaptureMethod fromCode(String str) {
                CaptureMethod captureMethod;
                CaptureMethod[] values = CaptureMethod.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        captureMethod = null;
                        break;
                    }
                    captureMethod = values[i11];
                    if (s.c(captureMethod.code, str)) {
                        break;
                    }
                    i11++;
                }
                return captureMethod == null ? CaptureMethod.Automatic : captureMethod;
            }
        }

        CaptureMethod(String str) {
            this.code = str;
        }
    }

    /* loaded from: classes6.dex */
    public static final class ClientSecret {
        public static final Companion Companion = new Companion(null);
        private static final Pattern PATTERN = Pattern.compile("^pi_[^_]+_secret_[^_]+$");
        private final String paymentIntentId;
        private final String value;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean isMatch(String value) {
                s.g(value, "value");
                return ClientSecret.PATTERN.matcher(value).matches();
            }
        }

        public ClientSecret(String value) {
            List i11;
            boolean z11;
            s.g(value, "value");
            this.value = value;
            List<String> j11 = new i("_secret").j(value, 0);
            if (!j11.isEmpty()) {
                ListIterator<String> listIterator = j11.listIterator(j11.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z11 = true;
                        continue;
                    } else {
                        z11 = false;
                        continue;
                    }
                    if (!z11) {
                        i11 = e0.H0(j11, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            i11 = w.i();
            Object[] array = i11.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            this.paymentIntentId = ((String[]) array)[0];
            if (!Companion.isMatch(this.value)) {
                throw new IllegalArgumentException(s.p("Invalid Payment Intent client secret: ", getValue$payments_core_release()).toString());
            }
        }

        public static /* synthetic */ ClientSecret copy$default(ClientSecret clientSecret, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = clientSecret.value;
            }
            return clientSecret.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.value;
        }

        public final ClientSecret copy(String value) {
            s.g(value, "value");
            return new ClientSecret(value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClientSecret) && s.c(this.value, ((ClientSecret) obj).value);
        }

        public final String getPaymentIntentId$payments_core_release() {
            return this.paymentIntentId;
        }

        public final String getValue$payments_core_release() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "ClientSecret(value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentIntent fromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new PaymentIntentJsonParser().parse(jSONObject);
        }
    }

    /* loaded from: classes6.dex */
    public enum ConfirmationMethod {
        Automatic("automatic"),
        Manual("manual");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ConfirmationMethod fromCode(String str) {
                ConfirmationMethod confirmationMethod;
                ConfirmationMethod[] values = ConfirmationMethod.values();
                int length = values.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        confirmationMethod = null;
                        break;
                    }
                    confirmationMethod = values[i11];
                    if (s.c(confirmationMethod.code, str)) {
                        break;
                    }
                    i11++;
                }
                return confirmationMethod == null ? ConfirmationMethod.Automatic : confirmationMethod;
            }
        }

        ConfirmationMethod(String str) {
            this.code = str;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PaymentIntent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentIntent createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new PaymentIntent(parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readLong(), parcel.readInt() == 0 ? null : CancellationReason.valueOf(parcel.readString()), CaptureMethod.valueOf(parcel.readString()), parcel.readString(), ConfirmationMethod.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Error.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Shipping.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), (StripeIntent.NextActionData) parcel.readParcelable(PaymentIntent.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentIntent[] newArray(int i11) {
            return new PaymentIntent[i11];
        }
    }

    /* loaded from: classes6.dex */
    public static final class Error implements StripeModel {
        public static final String CODE_AUTHENTICATION_ERROR = "payment_intent_authentication_failure";
        private final String charge;
        private final String code;
        private final String declineCode;
        private final String docUrl;
        private final String message;
        private final String param;
        private final PaymentMethod paymentMethod;
        private final Type type;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Error> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i11) {
                return new Error[i11];
            }
        }

        /* loaded from: classes6.dex */
        public enum Type {
            ApiConnectionError("api_connection_error"),
            ApiError("api_error"),
            AuthenticationError("authentication_error"),
            CardError("card_error"),
            IdempotencyError("idempotency_error"),
            InvalidRequestError("invalid_request_error"),
            RateLimitError("rate_limit_error");
            
            public static final Companion Companion = new Companion(null);
            private final String code;

            /* loaded from: classes6.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final Type fromCode(String str) {
                    Type[] values;
                    for (Type type : Type.values()) {
                        if (s.c(type.getCode(), str)) {
                            return type;
                        }
                    }
                    return null;
                }
            }

            Type(String str) {
                this.code = str;
            }

            public final String getCode() {
                return this.code;
            }
        }

        public Error(String str, String str2, String str3, String str4, String str5, String str6, PaymentMethod paymentMethod, Type type) {
            this.charge = str;
            this.code = str2;
            this.declineCode = str3;
            this.docUrl = str4;
            this.message = str5;
            this.param = str6;
            this.paymentMethod = paymentMethod;
            this.type = type;
        }

        public final String component1() {
            return this.charge;
        }

        public final String component2() {
            return this.code;
        }

        public final String component3() {
            return this.declineCode;
        }

        public final String component4() {
            return this.docUrl;
        }

        public final String component5() {
            return this.message;
        }

        public final String component6() {
            return this.param;
        }

        public final PaymentMethod component7() {
            return this.paymentMethod;
        }

        public final Type component8() {
            return this.type;
        }

        public final Error copy(String str, String str2, String str3, String str4, String str5, String str6, PaymentMethod paymentMethod, Type type) {
            return new Error(str, str2, str3, str4, str5, str6, paymentMethod, type);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Error) {
                Error error = (Error) obj;
                return s.c(this.charge, error.charge) && s.c(this.code, error.code) && s.c(this.declineCode, error.declineCode) && s.c(this.docUrl, error.docUrl) && s.c(this.message, error.message) && s.c(this.param, error.param) && s.c(this.paymentMethod, error.paymentMethod) && this.type == error.type;
            }
            return false;
        }

        public final String getCharge() {
            return this.charge;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getDeclineCode() {
            return this.declineCode;
        }

        public final String getDocUrl() {
            return this.docUrl;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getParam() {
            return this.param;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final Type getType() {
            return this.type;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.charge;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.code;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.declineCode;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.docUrl;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.message;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.param;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            int hashCode7 = (hashCode6 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            Type type = this.type;
            return hashCode7 + (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            return "Error(charge=" + ((Object) this.charge) + ", code=" + ((Object) this.code) + ", declineCode=" + ((Object) this.declineCode) + ", docUrl=" + ((Object) this.docUrl) + ", message=" + ((Object) this.message) + ", param=" + ((Object) this.param) + ", paymentMethod=" + this.paymentMethod + ", type=" + this.type + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.charge);
            out.writeString(this.code);
            out.writeString(this.declineCode);
            out.writeString(this.docUrl);
            out.writeString(this.message);
            out.writeString(this.param);
            PaymentMethod paymentMethod = this.paymentMethod;
            if (paymentMethod == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                paymentMethod.writeToParcel(out, i11);
            }
            Type type = this.type;
            if (type == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(type.name());
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StripeIntent.Usage.values().length];
            iArr[StripeIntent.Usage.OnSession.ordinal()] = 1;
            iArr[StripeIntent.Usage.OffSession.ordinal()] = 2;
            iArr[StripeIntent.Usage.OneTime.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentIntent(String str, List<String> paymentMethodTypes, Long l11, long j11, CancellationReason cancellationReason, CaptureMethod captureMethod, String str2, ConfirmationMethod confirmationMethod, long j12, String str3, String str4, boolean z11, PaymentMethod paymentMethod, String str5, String str6, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List<String> unactivatedPaymentMethods, StripeIntent.NextActionData nextActionData) {
        s.g(paymentMethodTypes, "paymentMethodTypes");
        s.g(captureMethod, "captureMethod");
        s.g(confirmationMethod, "confirmationMethod");
        s.g(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        this.f20931id = str;
        this.paymentMethodTypes = paymentMethodTypes;
        this.amount = l11;
        this.canceledAt = j11;
        this.cancellationReason = cancellationReason;
        this.captureMethod = captureMethod;
        this.clientSecret = str2;
        this.confirmationMethod = confirmationMethod;
        this.created = j12;
        this.currency = str3;
        this.description = str4;
        this.isLiveMode = z11;
        this.paymentMethod = paymentMethod;
        this.paymentMethodId = str5;
        this.receiptEmail = str6;
        this.status = status;
        this.setupFutureUsage = usage;
        this.lastPaymentError = error;
        this.shipping = shipping;
        this.unactivatedPaymentMethods = unactivatedPaymentMethods;
        this.nextActionData = nextActionData;
    }

    public static final PaymentIntent fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return getId();
    }

    public final String component10() {
        return this.currency;
    }

    public final String component11() {
        return getDescription();
    }

    public final boolean component12() {
        return isLiveMode();
    }

    public final PaymentMethod component13() {
        return getPaymentMethod();
    }

    public final String component14() {
        return getPaymentMethodId();
    }

    public final String component15() {
        return this.receiptEmail;
    }

    public final StripeIntent.Status component16() {
        return getStatus();
    }

    public final StripeIntent.Usage component17() {
        return this.setupFutureUsage;
    }

    public final Error component18() {
        return this.lastPaymentError;
    }

    public final Shipping component19() {
        return this.shipping;
    }

    public final List<String> component2() {
        return getPaymentMethodTypes();
    }

    public final List<String> component20() {
        return getUnactivatedPaymentMethods();
    }

    public final StripeIntent.NextActionData component21() {
        return getNextActionData();
    }

    public final Long component3() {
        return this.amount;
    }

    public final long component4() {
        return this.canceledAt;
    }

    public final CancellationReason component5() {
        return this.cancellationReason;
    }

    public final CaptureMethod component6() {
        return this.captureMethod;
    }

    public final String component7() {
        return getClientSecret();
    }

    public final ConfirmationMethod component8() {
        return this.confirmationMethod;
    }

    public final long component9() {
        return getCreated();
    }

    public final PaymentIntent copy(String str, List<String> paymentMethodTypes, Long l11, long j11, CancellationReason cancellationReason, CaptureMethod captureMethod, String str2, ConfirmationMethod confirmationMethod, long j12, String str3, String str4, boolean z11, PaymentMethod paymentMethod, String str5, String str6, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List<String> unactivatedPaymentMethods, StripeIntent.NextActionData nextActionData) {
        s.g(paymentMethodTypes, "paymentMethodTypes");
        s.g(captureMethod, "captureMethod");
        s.g(confirmationMethod, "confirmationMethod");
        s.g(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        return new PaymentIntent(str, paymentMethodTypes, l11, j11, cancellationReason, captureMethod, str2, confirmationMethod, j12, str3, str4, z11, paymentMethod, str5, str6, status, usage, error, shipping, unactivatedPaymentMethods, nextActionData);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentIntent) {
            PaymentIntent paymentIntent = (PaymentIntent) obj;
            return s.c(getId(), paymentIntent.getId()) && s.c(getPaymentMethodTypes(), paymentIntent.getPaymentMethodTypes()) && s.c(this.amount, paymentIntent.amount) && this.canceledAt == paymentIntent.canceledAt && this.cancellationReason == paymentIntent.cancellationReason && this.captureMethod == paymentIntent.captureMethod && s.c(getClientSecret(), paymentIntent.getClientSecret()) && this.confirmationMethod == paymentIntent.confirmationMethod && getCreated() == paymentIntent.getCreated() && s.c(this.currency, paymentIntent.currency) && s.c(getDescription(), paymentIntent.getDescription()) && isLiveMode() == paymentIntent.isLiveMode() && s.c(getPaymentMethod(), paymentIntent.getPaymentMethod()) && s.c(getPaymentMethodId(), paymentIntent.getPaymentMethodId()) && s.c(this.receiptEmail, paymentIntent.receiptEmail) && getStatus() == paymentIntent.getStatus() && this.setupFutureUsage == paymentIntent.setupFutureUsage && s.c(this.lastPaymentError, paymentIntent.lastPaymentError) && s.c(this.shipping, paymentIntent.shipping) && s.c(getUnactivatedPaymentMethods(), paymentIntent.getUnactivatedPaymentMethods()) && s.c(getNextActionData(), paymentIntent.getNextActionData());
        }
        return false;
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final long getCanceledAt() {
        return this.canceledAt;
    }

    public final CancellationReason getCancellationReason() {
        return this.cancellationReason;
    }

    public final CaptureMethod getCaptureMethod() {
        return this.captureMethod;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getClientSecret() {
        return this.clientSecret;
    }

    public final ConfirmationMethod getConfirmationMethod() {
        return this.confirmationMethod;
    }

    @Override // com.stripe.android.model.StripeIntent
    public long getCreated() {
        return this.created;
    }

    public final String getCurrency() {
        return this.currency;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getDescription() {
        return this.description;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.f20931id;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getLastErrorMessage() {
        Error error = this.lastPaymentError;
        if (error == null) {
            return null;
        }
        return error.getMessage();
    }

    public final Error getLastPaymentError() {
        return this.lastPaymentError;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionData getNextActionData() {
        return this.nextActionData;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.NextActionType getNextActionType() {
        StripeIntent.NextActionData nextActionData = getNextActionData();
        if (nextActionData instanceof StripeIntent.NextActionData.SdkData) {
            return StripeIntent.NextActionType.UseStripeSdk;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.RedirectToUrl) {
            return StripeIntent.NextActionType.RedirectToUrl;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.DisplayOxxoDetails) {
            return StripeIntent.NextActionType.DisplayOxxoDetails;
        }
        if (nextActionData instanceof StripeIntent.NextActionData.VerifyWithMicrodeposits) {
            return StripeIntent.NextActionType.VerifyWithMicrodeposits;
        }
        return null;
    }

    @Override // com.stripe.android.model.StripeIntent
    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    public final String getReceiptEmail() {
        return this.receiptEmail;
    }

    public final StripeIntent.Usage getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.status;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getUnactivatedPaymentMethods() {
        return this.unactivatedPaymentMethods;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = (((getId() == null ? 0 : getId().hashCode()) * 31) + getPaymentMethodTypes().hashCode()) * 31;
        Long l11 = this.amount;
        int hashCode2 = (((hashCode + (l11 == null ? 0 : l11.hashCode())) * 31) + Long.hashCode(this.canceledAt)) * 31;
        CancellationReason cancellationReason = this.cancellationReason;
        int hashCode3 = (((((((((hashCode2 + (cancellationReason == null ? 0 : cancellationReason.hashCode())) * 31) + this.captureMethod.hashCode()) * 31) + (getClientSecret() == null ? 0 : getClientSecret().hashCode())) * 31) + this.confirmationMethod.hashCode()) * 31) + Long.hashCode(getCreated())) * 31;
        String str = this.currency;
        int hashCode4 = (((hashCode3 + (str == null ? 0 : str.hashCode())) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31;
        boolean isLiveMode = isLiveMode();
        int i11 = isLiveMode;
        if (isLiveMode) {
            i11 = 1;
        }
        int hashCode5 = (((((hashCode4 + i11) * 31) + (getPaymentMethod() == null ? 0 : getPaymentMethod().hashCode())) * 31) + (getPaymentMethodId() == null ? 0 : getPaymentMethodId().hashCode())) * 31;
        String str2 = this.receiptEmail;
        int hashCode6 = (((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31;
        StripeIntent.Usage usage = this.setupFutureUsage;
        int hashCode7 = (hashCode6 + (usage == null ? 0 : usage.hashCode())) * 31;
        Error error = this.lastPaymentError;
        int hashCode8 = (hashCode7 + (error == null ? 0 : error.hashCode())) * 31;
        Shipping shipping = this.shipping;
        return ((((hashCode8 + (shipping == null ? 0 : shipping.hashCode())) * 31) + getUnactivatedPaymentMethods().hashCode()) * 31) + (getNextActionData() != null ? getNextActionData().hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean isConfirmed() {
        Set i11;
        boolean T;
        i11 = x0.i(StripeIntent.Status.Processing, StripeIntent.Status.RequiresCapture, StripeIntent.Status.Succeeded);
        T = e0.T(i11, getStatus());
        return T;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean isLiveMode() {
        return this.isLiveMode;
    }

    public final boolean isSetupFutureUsageSet() {
        StripeIntent.Usage usage = this.setupFutureUsage;
        int i11 = usage == null ? -1 : WhenMappings.$EnumSwitchMapping$0[usage.ordinal()];
        if (i11 != -1) {
            if (i11 == 1 || i11 == 2) {
                return true;
            }
            if (i11 == 3) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        return false;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean requiresAction() {
        return getStatus() == StripeIntent.Status.RequiresAction;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean requiresConfirmation() {
        return getStatus() == StripeIntent.Status.RequiresConfirmation;
    }

    public String toString() {
        return "PaymentIntent(id=" + ((Object) getId()) + ", paymentMethodTypes=" + getPaymentMethodTypes() + ", amount=" + this.amount + ", canceledAt=" + this.canceledAt + ", cancellationReason=" + this.cancellationReason + ", captureMethod=" + this.captureMethod + ", clientSecret=" + ((Object) getClientSecret()) + ", confirmationMethod=" + this.confirmationMethod + ", created=" + getCreated() + ", currency=" + ((Object) this.currency) + ", description=" + ((Object) getDescription()) + ", isLiveMode=" + isLiveMode() + ", paymentMethod=" + getPaymentMethod() + ", paymentMethodId=" + ((Object) getPaymentMethodId()) + ", receiptEmail=" + ((Object) this.receiptEmail) + ", status=" + getStatus() + ", setupFutureUsage=" + this.setupFutureUsage + ", lastPaymentError=" + this.lastPaymentError + ", shipping=" + this.shipping + ", unactivatedPaymentMethods=" + getUnactivatedPaymentMethods() + ", nextActionData=" + getNextActionData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f20931id);
        out.writeStringList(this.paymentMethodTypes);
        Long l11 = this.amount;
        if (l11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l11.longValue());
        }
        out.writeLong(this.canceledAt);
        CancellationReason cancellationReason = this.cancellationReason;
        if (cancellationReason == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cancellationReason.name());
        }
        out.writeString(this.captureMethod.name());
        out.writeString(this.clientSecret);
        out.writeString(this.confirmationMethod.name());
        out.writeLong(this.created);
        out.writeString(this.currency);
        out.writeString(this.description);
        out.writeInt(this.isLiveMode ? 1 : 0);
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            paymentMethod.writeToParcel(out, i11);
        }
        out.writeString(this.paymentMethodId);
        out.writeString(this.receiptEmail);
        StripeIntent.Status status = this.status;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StripeIntent.Usage usage = this.setupFutureUsage;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        Error error = this.lastPaymentError;
        if (error == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            error.writeToParcel(out, i11);
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shipping.writeToParcel(out, i11);
        }
        out.writeStringList(this.unactivatedPaymentMethods);
        out.writeParcelable(this.nextActionData, i11);
    }

    /* loaded from: classes6.dex */
    public static final class Shipping implements StripeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Shipping> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping[] newArray(int i11) {
                return new Shipping[i11];
            }
        }

        public Shipping(Address address, String str, String str2, String str3, String str4) {
            s.g(address, "address");
            this.address = address;
            this.carrier = str;
            this.name = str2;
            this.phone = str3;
            this.trackingNumber = str4;
        }

        public static /* synthetic */ Shipping copy$default(Shipping shipping, Address address, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                address = shipping.address;
            }
            if ((i11 & 2) != 0) {
                str = shipping.carrier;
            }
            String str5 = str;
            if ((i11 & 4) != 0) {
                str2 = shipping.name;
            }
            String str6 = str2;
            if ((i11 & 8) != 0) {
                str3 = shipping.phone;
            }
            String str7 = str3;
            if ((i11 & 16) != 0) {
                str4 = shipping.trackingNumber;
            }
            return shipping.copy(address, str5, str6, str7, str4);
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.carrier;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final String component5() {
            return this.trackingNumber;
        }

        public final Shipping copy(Address address, String str, String str2, String str3, String str4) {
            s.g(address, "address");
            return new Shipping(address, str, str2, str3, str4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Shipping) {
                Shipping shipping = (Shipping) obj;
                return s.c(this.address, shipping.address) && s.c(this.carrier, shipping.carrier) && s.c(this.name, shipping.name) && s.c(this.phone, shipping.phone) && s.c(this.trackingNumber, shipping.trackingNumber);
            }
            return false;
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getCarrier() {
            return this.carrier;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getTrackingNumber() {
            return this.trackingNumber;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int hashCode = this.address.hashCode() * 31;
            String str = this.carrier;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackingNumber;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.address + ", carrier=" + ((Object) this.carrier) + ", name=" + ((Object) this.name) + ", phone=" + ((Object) this.phone) + ", trackingNumber=" + ((Object) this.trackingNumber) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.address.writeToParcel(out, i11);
            out.writeString(this.carrier);
            out.writeString(this.name);
            out.writeString(this.phone);
            out.writeString(this.trackingNumber);
        }

        public /* synthetic */ Shipping(Address address, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(address, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
        }
    }

    public /* synthetic */ PaymentIntent(String str, List list, Long l11, long j11, CancellationReason cancellationReason, CaptureMethod captureMethod, String str2, ConfirmationMethod confirmationMethod, long j12, String str3, String str4, boolean z11, PaymentMethod paymentMethod, String str5, String str6, StripeIntent.Status status, StripeIntent.Usage usage, Error error, Shipping shipping, List list2, StripeIntent.NextActionData nextActionData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, l11, (i11 & 8) != 0 ? 0L : j11, (i11 & 16) != 0 ? null : cancellationReason, (i11 & 32) != 0 ? CaptureMethod.Automatic : captureMethod, str2, (i11 & 128) != 0 ? ConfirmationMethod.Automatic : confirmationMethod, j12, str3, (i11 & 1024) != 0 ? null : str4, z11, (i11 & 4096) != 0 ? null : paymentMethod, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str5, (i11 & 16384) != 0 ? null : str6, (32768 & i11) != 0 ? null : status, (65536 & i11) != 0 ? null : usage, (131072 & i11) != 0 ? null : error, (262144 & i11) != 0 ? null : shipping, list2, (i11 & PKIFailureInfo.badCertTemplate) != 0 ? null : nextActionData);
    }
}