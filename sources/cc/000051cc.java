package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.SetupIntentJsonParser;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.i;
import org.json.JSONObject;
import wz.e0;
import wz.w;
import wz.x0;

/* loaded from: classes6.dex */
public final class SetupIntent implements StripeIntent {
    private final CancellationReason cancellationReason;
    private final String clientSecret;
    private final long created;
    private final String description;

    /* renamed from: id  reason: collision with root package name */
    private final String f20935id;
    private final boolean isLiveMode;
    private final Error lastSetupError;
    private final StripeIntent.NextActionData nextActionData;
    private final PaymentMethod paymentMethod;
    private final String paymentMethodId;
    private final List<String> paymentMethodTypes;
    private final StripeIntent.Status status;
    private final List<String> unactivatedPaymentMethods;
    private final StripeIntent.Usage usage;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SetupIntent> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public enum CancellationReason {
        Duplicate("duplicate"),
        RequestedByCustomer("requested_by_customer"),
        Abandoned("abandoned");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CancellationReason fromCode$payments_core_release(String str) {
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
    public static final class ClientSecret {
        public static final Companion Companion = new Companion(null);
        private static final Pattern PATTERN = Pattern.compile("^seti_[^_]+_secret_[^_]+$");
        private final String setupIntentId;
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
            this.setupIntentId = ((String[]) array)[0];
            if (!Companion.isMatch(this.value)) {
                throw new IllegalArgumentException(s.p("Invalid Setup Intent client secret: ", getValue$payments_core_release()).toString());
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

        public final String getSetupIntentId$payments_core_release() {
            return this.setupIntentId;
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

        public final SetupIntent fromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new SetupIntentJsonParser().parse(jSONObject);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<SetupIntent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetupIntent createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new SetupIntent(parcel.readString(), parcel.readInt() == 0 ? null : CancellationReason.valueOf(parcel.readString()), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : StripeIntent.Status.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : StripeIntent.Usage.valueOf(parcel.readString()), parcel.readInt() != 0 ? Error.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), (StripeIntent.NextActionData) parcel.readParcelable(SetupIntent.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetupIntent[] newArray(int i11) {
            return new SetupIntent[i11];
        }
    }

    /* loaded from: classes6.dex */
    public static final class Error implements StripeModel {
        public static final String CODE_AUTHENTICATION_ERROR = "setup_intent_authentication_failure";
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
                return new Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()));
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

                public final Type fromCode$payments_core_release(String str) {
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

        public Error(String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod, Type type) {
            this.code = str;
            this.declineCode = str2;
            this.docUrl = str3;
            this.message = str4;
            this.param = str5;
            this.paymentMethod = paymentMethod;
            this.type = type;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod, Type type, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = error.code;
            }
            if ((i11 & 2) != 0) {
                str2 = error.declineCode;
            }
            String str6 = str2;
            if ((i11 & 4) != 0) {
                str3 = error.docUrl;
            }
            String str7 = str3;
            if ((i11 & 8) != 0) {
                str4 = error.message;
            }
            String str8 = str4;
            if ((i11 & 16) != 0) {
                str5 = error.param;
            }
            String str9 = str5;
            if ((i11 & 32) != 0) {
                paymentMethod = error.paymentMethod;
            }
            PaymentMethod paymentMethod2 = paymentMethod;
            if ((i11 & 64) != 0) {
                type = error.type;
            }
            return error.copy(str, str6, str7, str8, str9, paymentMethod2, type);
        }

        public final String component1() {
            return this.code;
        }

        public final String component2() {
            return this.declineCode;
        }

        public final String component3() {
            return this.docUrl;
        }

        public final String component4() {
            return this.message;
        }

        public final String component5() {
            return this.param;
        }

        public final PaymentMethod component6() {
            return this.paymentMethod;
        }

        public final Type component7() {
            return this.type;
        }

        public final Error copy(String str, String str2, String str3, String str4, String str5, PaymentMethod paymentMethod, Type type) {
            return new Error(str, str2, str3, str4, str5, paymentMethod, type);
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
                return s.c(this.code, error.code) && s.c(this.declineCode, error.declineCode) && s.c(this.docUrl, error.docUrl) && s.c(this.message, error.message) && s.c(this.param, error.param) && s.c(this.paymentMethod, error.paymentMethod) && this.type == error.type;
            }
            return false;
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
            String str = this.code;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.declineCode;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.docUrl;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.message;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.param;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            PaymentMethod paymentMethod = this.paymentMethod;
            int hashCode6 = (hashCode5 + (paymentMethod == null ? 0 : paymentMethod.hashCode())) * 31;
            Type type = this.type;
            return hashCode6 + (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            return "Error(code=" + ((Object) this.code) + ", declineCode=" + ((Object) this.declineCode) + ", docUrl=" + ((Object) this.docUrl) + ", message=" + ((Object) this.message) + ", param=" + ((Object) this.param) + ", paymentMethod=" + this.paymentMethod + ", type=" + this.type + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
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

    public SetupIntent(String str, CancellationReason cancellationReason, long j11, String str2, String str3, boolean z11, PaymentMethod paymentMethod, String str4, List<String> paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, Error error, List<String> unactivatedPaymentMethods, StripeIntent.NextActionData nextActionData) {
        s.g(paymentMethodTypes, "paymentMethodTypes");
        s.g(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        this.f20935id = str;
        this.cancellationReason = cancellationReason;
        this.created = j11;
        this.clientSecret = str2;
        this.description = str3;
        this.isLiveMode = z11;
        this.paymentMethod = paymentMethod;
        this.paymentMethodId = str4;
        this.paymentMethodTypes = paymentMethodTypes;
        this.status = status;
        this.usage = usage;
        this.lastSetupError = error;
        this.unactivatedPaymentMethods = unactivatedPaymentMethods;
        this.nextActionData = nextActionData;
    }

    public static final SetupIntent fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return getId();
    }

    public final StripeIntent.Status component10() {
        return getStatus();
    }

    public final StripeIntent.Usage component11() {
        return this.usage;
    }

    public final Error component12() {
        return this.lastSetupError;
    }

    public final List<String> component13() {
        return getUnactivatedPaymentMethods();
    }

    public final StripeIntent.NextActionData component14() {
        return getNextActionData();
    }

    public final CancellationReason component2() {
        return this.cancellationReason;
    }

    public final long component3() {
        return getCreated();
    }

    public final String component4() {
        return getClientSecret();
    }

    public final String component5() {
        return getDescription();
    }

    public final boolean component6() {
        return isLiveMode();
    }

    public final PaymentMethod component7() {
        return getPaymentMethod();
    }

    public final String component8() {
        return getPaymentMethodId();
    }

    public final List<String> component9() {
        return getPaymentMethodTypes();
    }

    public final SetupIntent copy(String str, CancellationReason cancellationReason, long j11, String str2, String str3, boolean z11, PaymentMethod paymentMethod, String str4, List<String> paymentMethodTypes, StripeIntent.Status status, StripeIntent.Usage usage, Error error, List<String> unactivatedPaymentMethods, StripeIntent.NextActionData nextActionData) {
        s.g(paymentMethodTypes, "paymentMethodTypes");
        s.g(unactivatedPaymentMethods, "unactivatedPaymentMethods");
        return new SetupIntent(str, cancellationReason, j11, str2, str3, z11, paymentMethod, str4, paymentMethodTypes, status, usage, error, unactivatedPaymentMethods, nextActionData);
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
        if (obj instanceof SetupIntent) {
            SetupIntent setupIntent = (SetupIntent) obj;
            return s.c(getId(), setupIntent.getId()) && this.cancellationReason == setupIntent.cancellationReason && getCreated() == setupIntent.getCreated() && s.c(getClientSecret(), setupIntent.getClientSecret()) && s.c(getDescription(), setupIntent.getDescription()) && isLiveMode() == setupIntent.isLiveMode() && s.c(getPaymentMethod(), setupIntent.getPaymentMethod()) && s.c(getPaymentMethodId(), setupIntent.getPaymentMethodId()) && s.c(getPaymentMethodTypes(), setupIntent.getPaymentMethodTypes()) && getStatus() == setupIntent.getStatus() && this.usage == setupIntent.usage && s.c(this.lastSetupError, setupIntent.lastSetupError) && s.c(getUnactivatedPaymentMethods(), setupIntent.getUnactivatedPaymentMethods()) && s.c(getNextActionData(), setupIntent.getNextActionData());
        }
        return false;
    }

    public final CancellationReason getCancellationReason() {
        return this.cancellationReason;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getClientSecret() {
        return this.clientSecret;
    }

    @Override // com.stripe.android.model.StripeIntent
    public long getCreated() {
        return this.created;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getDescription() {
        return this.description;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getId() {
        return this.f20935id;
    }

    @Override // com.stripe.android.model.StripeIntent
    public String getLastErrorMessage() {
        Error error = this.lastSetupError;
        if (error == null) {
            return null;
        }
        return error.getMessage();
    }

    public final Error getLastSetupError() {
        return this.lastSetupError;
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

    @Override // com.stripe.android.model.StripeIntent
    public StripeIntent.Status getStatus() {
        return this.status;
    }

    @Override // com.stripe.android.model.StripeIntent
    public List<String> getUnactivatedPaymentMethods() {
        return this.unactivatedPaymentMethods;
    }

    public final StripeIntent.Usage getUsage() {
        return this.usage;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = (getId() == null ? 0 : getId().hashCode()) * 31;
        CancellationReason cancellationReason = this.cancellationReason;
        int hashCode2 = (((((((hashCode + (cancellationReason == null ? 0 : cancellationReason.hashCode())) * 31) + Long.hashCode(getCreated())) * 31) + (getClientSecret() == null ? 0 : getClientSecret().hashCode())) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31;
        boolean isLiveMode = isLiveMode();
        int i11 = isLiveMode;
        if (isLiveMode) {
            i11 = 1;
        }
        int hashCode3 = (((((((((hashCode2 + i11) * 31) + (getPaymentMethod() == null ? 0 : getPaymentMethod().hashCode())) * 31) + (getPaymentMethodId() == null ? 0 : getPaymentMethodId().hashCode())) * 31) + getPaymentMethodTypes().hashCode()) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31;
        StripeIntent.Usage usage = this.usage;
        int hashCode4 = (hashCode3 + (usage == null ? 0 : usage.hashCode())) * 31;
        Error error = this.lastSetupError;
        return ((((hashCode4 + (error == null ? 0 : error.hashCode())) * 31) + getUnactivatedPaymentMethods().hashCode()) * 31) + (getNextActionData() != null ? getNextActionData().hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean isConfirmed() {
        Set i11;
        boolean T;
        i11 = x0.i(StripeIntent.Status.Processing, StripeIntent.Status.Succeeded);
        T = e0.T(i11, getStatus());
        return T;
    }

    @Override // com.stripe.android.model.StripeIntent
    public boolean isLiveMode() {
        return this.isLiveMode;
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
        return "SetupIntent(id=" + ((Object) getId()) + ", cancellationReason=" + this.cancellationReason + ", created=" + getCreated() + ", clientSecret=" + ((Object) getClientSecret()) + ", description=" + ((Object) getDescription()) + ", isLiveMode=" + isLiveMode() + ", paymentMethod=" + getPaymentMethod() + ", paymentMethodId=" + ((Object) getPaymentMethodId()) + ", paymentMethodTypes=" + getPaymentMethodTypes() + ", status=" + getStatus() + ", usage=" + this.usage + ", lastSetupError=" + this.lastSetupError + ", unactivatedPaymentMethods=" + getUnactivatedPaymentMethods() + ", nextActionData=" + getNextActionData() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f20935id);
        CancellationReason cancellationReason = this.cancellationReason;
        if (cancellationReason == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cancellationReason.name());
        }
        out.writeLong(this.created);
        out.writeString(this.clientSecret);
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
        out.writeStringList(this.paymentMethodTypes);
        StripeIntent.Status status = this.status;
        if (status == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(status.name());
        }
        StripeIntent.Usage usage = this.usage;
        if (usage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(usage.name());
        }
        Error error = this.lastSetupError;
        if (error == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            error.writeToParcel(out, i11);
        }
        out.writeStringList(this.unactivatedPaymentMethods);
        out.writeParcelable(this.nextActionData, i11);
    }

    public /* synthetic */ SetupIntent(String str, CancellationReason cancellationReason, long j11, String str2, String str3, boolean z11, PaymentMethod paymentMethod, String str4, List list, StripeIntent.Status status, StripeIntent.Usage usage, Error error, List list2, StripeIntent.NextActionData nextActionData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cancellationReason, j11, str2, str3, z11, (i11 & 64) != 0 ? null : paymentMethod, str4, list, status, usage, (i11 & 2048) != 0 ? null : error, list2, nextActionData);
    }
}