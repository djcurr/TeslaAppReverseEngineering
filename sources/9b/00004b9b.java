package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import b30.a;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.Source;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.view.AuthActivityStarter;
import com.stripe.android.view.AuthActivityStarterHost;
import com.stripe.android.view.PaymentRelayActivity;
import java.io.Serializable;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public interface PaymentRelayStarter extends AuthActivityStarter<Args> {

    /* loaded from: classes2.dex */
    public static abstract class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public static /* synthetic */ Args create$default(Companion companion, StripeIntent stripeIntent, String str, int i11, Object obj) {
                if ((i11 & 2) != 0) {
                    str = null;
                }
                return companion.create(stripeIntent, str);
            }

            public final Args create(StripeIntent stripeIntent, String str) {
                s.g(stripeIntent, "stripeIntent");
                if (stripeIntent instanceof PaymentIntent) {
                    return new PaymentIntentArgs((PaymentIntent) stripeIntent, str);
                }
                if (stripeIntent instanceof SetupIntent) {
                    return new SetupIntentArgs((SetupIntent) stripeIntent, str);
                }
                throw new NoWhenBranchMatchedException();
            }
        }

        /* loaded from: classes2.dex */
        public static final class ErrorArgs extends Args {
            private final StripeException exception;
            private final int requestCode;
            public static final Companion Companion = new Companion(null);
            public static final Parcelable.Creator<ErrorArgs> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Companion implements b30.a<ErrorArgs> {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                /* renamed from: newArray */
                public ErrorArgs[] m123newArray(int i11) {
                    return (ErrorArgs[]) a.C0144a.a(this, i11);
                }

                /* renamed from: create */
                public ErrorArgs m122create(Parcel parcel) {
                    s.g(parcel, "parcel");
                    Serializable readSerializable = parcel.readSerializable();
                    Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type com.stripe.android.core.exception.StripeException");
                    return new ErrorArgs((StripeException) readSerializable, parcel.readInt());
                }

                public void write(ErrorArgs errorArgs, Parcel parcel, int i11) {
                    s.g(errorArgs, "<this>");
                    s.g(parcel, "parcel");
                    parcel.writeSerializable(errorArgs.getException$payments_core_release());
                    parcel.writeInt(errorArgs.getRequestCode());
                }
            }

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ErrorArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ErrorArgs createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return ErrorArgs.Companion.m122create(parcel);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ErrorArgs[] newArray(int i11) {
                    return new ErrorArgs[i11];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ErrorArgs(StripeException exception, int i11) {
                super(null);
                s.g(exception, "exception");
                this.exception = exception;
                this.requestCode = i11;
            }

            public static /* synthetic */ ErrorArgs copy$default(ErrorArgs errorArgs, StripeException stripeException, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    stripeException = errorArgs.exception;
                }
                if ((i12 & 2) != 0) {
                    i11 = errorArgs.getRequestCode();
                }
                return errorArgs.copy(stripeException, i11);
            }

            public final StripeException component1$payments_core_release() {
                return this.exception;
            }

            public final int component2() {
                return getRequestCode();
            }

            public final ErrorArgs copy(StripeException exception, int i11) {
                s.g(exception, "exception");
                return new ErrorArgs(exception, i11);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof ErrorArgs) {
                    ErrorArgs errorArgs = (ErrorArgs) obj;
                    return s.c(this.exception, errorArgs.exception) && getRequestCode() == errorArgs.getRequestCode();
                }
                return false;
            }

            public final StripeException getException$payments_core_release() {
                return this.exception;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public int getRequestCode() {
                return this.requestCode;
            }

            public int hashCode() {
                return (this.exception.hashCode() * 31) + Integer.hashCode(getRequestCode());
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(null, 0, this.exception, false, null, null, null, 123, null);
            }

            public String toString() {
                return "ErrorArgs(exception=" + this.exception + ", requestCode=" + getRequestCode() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                Companion.write(this, out, i11);
            }
        }

        /* loaded from: classes2.dex */
        public static final class PaymentIntentArgs extends Args {
            private final PaymentIntent paymentIntent;
            private final String stripeAccountId;
            public static final Parcelable.Creator<PaymentIntentArgs> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PaymentIntentArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntentArgs createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new PaymentIntentArgs(PaymentIntent.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PaymentIntentArgs[] newArray(int i11) {
                    return new PaymentIntentArgs[i11];
                }
            }

            public /* synthetic */ PaymentIntentArgs(PaymentIntent paymentIntent, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(paymentIntent, (i11 & 2) != 0 ? null : str);
            }

            public static /* synthetic */ PaymentIntentArgs copy$default(PaymentIntentArgs paymentIntentArgs, PaymentIntent paymentIntent, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paymentIntent = paymentIntentArgs.paymentIntent;
                }
                if ((i11 & 2) != 0) {
                    str = paymentIntentArgs.stripeAccountId;
                }
                return paymentIntentArgs.copy(paymentIntent, str);
            }

            public final PaymentIntent component1$payments_core_release() {
                return this.paymentIntent;
            }

            public final String component2$payments_core_release() {
                return this.stripeAccountId;
            }

            public final PaymentIntentArgs copy(PaymentIntent paymentIntent, String str) {
                s.g(paymentIntent, "paymentIntent");
                return new PaymentIntentArgs(paymentIntent, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof PaymentIntentArgs) {
                    PaymentIntentArgs paymentIntentArgs = (PaymentIntentArgs) obj;
                    return s.c(this.paymentIntent, paymentIntentArgs.paymentIntent) && s.c(this.stripeAccountId, paymentIntentArgs.stripeAccountId);
                }
                return false;
            }

            public final PaymentIntent getPaymentIntent$payments_core_release() {
                return this.paymentIntent;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public int getRequestCode() {
                return StripePaymentController.PAYMENT_REQUEST_CODE;
            }

            public final String getStripeAccountId$payments_core_release() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = this.paymentIntent.hashCode() * 31;
                String str = this.stripeAccountId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(this.paymentIntent.getClientSecret(), 0, null, false, null, null, this.stripeAccountId, 62, null);
            }

            public String toString() {
                return "PaymentIntentArgs(paymentIntent=" + this.paymentIntent + ", stripeAccountId=" + ((Object) this.stripeAccountId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                this.paymentIntent.writeToParcel(out, i11);
                out.writeString(this.stripeAccountId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public PaymentIntentArgs(PaymentIntent paymentIntent, String str) {
                super(null);
                s.g(paymentIntent, "paymentIntent");
                this.paymentIntent = paymentIntent;
                this.stripeAccountId = str;
            }
        }

        /* loaded from: classes2.dex */
        public static final class SetupIntentArgs extends Args {
            private final SetupIntent setupIntent;
            private final String stripeAccountId;
            public static final Parcelable.Creator<SetupIntentArgs> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<SetupIntentArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntentArgs createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new SetupIntentArgs(SetupIntent.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SetupIntentArgs[] newArray(int i11) {
                    return new SetupIntentArgs[i11];
                }
            }

            public /* synthetic */ SetupIntentArgs(SetupIntent setupIntent, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(setupIntent, (i11 & 2) != 0 ? null : str);
            }

            public static /* synthetic */ SetupIntentArgs copy$default(SetupIntentArgs setupIntentArgs, SetupIntent setupIntent, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    setupIntent = setupIntentArgs.setupIntent;
                }
                if ((i11 & 2) != 0) {
                    str = setupIntentArgs.stripeAccountId;
                }
                return setupIntentArgs.copy(setupIntent, str);
            }

            public final SetupIntent component1$payments_core_release() {
                return this.setupIntent;
            }

            public final String component2$payments_core_release() {
                return this.stripeAccountId;
            }

            public final SetupIntentArgs copy(SetupIntent setupIntent, String str) {
                s.g(setupIntent, "setupIntent");
                return new SetupIntentArgs(setupIntent, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SetupIntentArgs) {
                    SetupIntentArgs setupIntentArgs = (SetupIntentArgs) obj;
                    return s.c(this.setupIntent, setupIntentArgs.setupIntent) && s.c(this.stripeAccountId, setupIntentArgs.stripeAccountId);
                }
                return false;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public int getRequestCode() {
                return StripePaymentController.SETUP_REQUEST_CODE;
            }

            public final SetupIntent getSetupIntent$payments_core_release() {
                return this.setupIntent;
            }

            public final String getStripeAccountId$payments_core_release() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = this.setupIntent.hashCode() * 31;
                String str = this.stripeAccountId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(this.setupIntent.getClientSecret(), 0, null, false, null, null, this.stripeAccountId, 62, null);
            }

            public String toString() {
                return "SetupIntentArgs(setupIntent=" + this.setupIntent + ", stripeAccountId=" + ((Object) this.stripeAccountId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                this.setupIntent.writeToParcel(out, i11);
                out.writeString(this.stripeAccountId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SetupIntentArgs(SetupIntent setupIntent, String str) {
                super(null);
                s.g(setupIntent, "setupIntent");
                this.setupIntent = setupIntent;
                this.stripeAccountId = str;
            }
        }

        /* loaded from: classes2.dex */
        public static final class SourceArgs extends Args {
            private final Source source;
            private final String stripeAccountId;
            public static final Parcelable.Creator<SourceArgs> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<SourceArgs> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SourceArgs createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new SourceArgs(Source.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SourceArgs[] newArray(int i11) {
                    return new SourceArgs[i11];
                }
            }

            public /* synthetic */ SourceArgs(Source source, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(source, (i11 & 2) != 0 ? null : str);
            }

            public static /* synthetic */ SourceArgs copy$default(SourceArgs sourceArgs, Source source, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    source = sourceArgs.source;
                }
                if ((i11 & 2) != 0) {
                    str = sourceArgs.stripeAccountId;
                }
                return sourceArgs.copy(source, str);
            }

            public final Source component1$payments_core_release() {
                return this.source;
            }

            public final String component2$payments_core_release() {
                return this.stripeAccountId;
            }

            public final SourceArgs copy(Source source, String str) {
                s.g(source, "source");
                return new SourceArgs(source, str);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof SourceArgs) {
                    SourceArgs sourceArgs = (SourceArgs) obj;
                    return s.c(this.source, sourceArgs.source) && s.c(this.stripeAccountId, sourceArgs.stripeAccountId);
                }
                return false;
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public int getRequestCode() {
                return StripePaymentController.SOURCE_REQUEST_CODE;
            }

            public final Source getSource$payments_core_release() {
                return this.source;
            }

            public final String getStripeAccountId$payments_core_release() {
                return this.stripeAccountId;
            }

            public int hashCode() {
                int hashCode = this.source.hashCode() * 31;
                String str = this.stripeAccountId;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            @Override // com.stripe.android.PaymentRelayStarter.Args
            public PaymentFlowResult.Unvalidated toResult() {
                return new PaymentFlowResult.Unvalidated(null, 0, null, false, null, this.source, this.stripeAccountId, 31, null);
            }

            public String toString() {
                return "SourceArgs(source=" + this.source + ", stripeAccountId=" + ((Object) this.stripeAccountId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                this.source.writeToParcel(out, i11);
                out.writeString(this.stripeAccountId);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SourceArgs(Source source, String str) {
                super(null);
                s.g(source, "source");
                this.source = source;
                this.stripeAccountId = str;
            }
        }

        private Args() {
        }

        public /* synthetic */ Args(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getRequestCode();

        public abstract PaymentFlowResult.Unvalidated toResult();
    }

    /* loaded from: classes2.dex */
    public static final class Legacy implements PaymentRelayStarter {
        public static final int $stable = 0;
        private final AuthActivityStarterHost host;

        public Legacy(AuthActivityStarterHost host) {
            s.g(host, "host");
            this.host = host;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(Args args) {
            s.g(args, "args");
            this.host.startActivityForResult(PaymentRelayActivity.class, args.toResult().toBundle(), args.getRequestCode());
        }
    }

    /* loaded from: classes2.dex */
    public static final class Modern implements PaymentRelayStarter {
        public static final int $stable = 8;
        private final androidx.activity.result.d<Args> launcher;

        public Modern(androidx.activity.result.d<Args> launcher) {
            s.g(launcher, "launcher");
            this.launcher = launcher;
        }

        @Override // com.stripe.android.view.AuthActivityStarter
        public void start(Args args) {
            s.g(args, "args");
            this.launcher.b(args);
        }
    }
}