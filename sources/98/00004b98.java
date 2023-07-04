package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentIntent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class PaymentIntentResult extends StripeIntentResult<PaymentIntent> {
    private final String failureMessage;
    private final PaymentIntent intent;
    private final int outcomeFromFlow;
    public static final Parcelable.Creator<PaymentIntentResult> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<PaymentIntentResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentIntentResult createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new PaymentIntentResult(PaymentIntent.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentIntentResult[] newArray(int i11) {
            return new PaymentIntentResult[i11];
        }
    }

    public /* synthetic */ PaymentIntentResult(PaymentIntent paymentIntent, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(paymentIntent, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? null : str);
    }

    private final int component2() {
        return this.outcomeFromFlow;
    }

    public static /* synthetic */ PaymentIntentResult copy$default(PaymentIntentResult paymentIntentResult, PaymentIntent paymentIntent, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            paymentIntent = paymentIntentResult.getIntent();
        }
        if ((i12 & 2) != 0) {
            i11 = paymentIntentResult.outcomeFromFlow;
        }
        if ((i12 & 4) != 0) {
            str = paymentIntentResult.getFailureMessage();
        }
        return paymentIntentResult.copy(paymentIntent, i11, str);
    }

    public final PaymentIntent component1() {
        return getIntent();
    }

    public final String component3() {
        return getFailureMessage();
    }

    public final PaymentIntentResult copy(PaymentIntent intent, int i11, String str) {
        s.g(intent, "intent");
        return new PaymentIntentResult(intent, i11, str);
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
        if (obj instanceof PaymentIntentResult) {
            PaymentIntentResult paymentIntentResult = (PaymentIntentResult) obj;
            return s.c(getIntent(), paymentIntentResult.getIntent()) && this.outcomeFromFlow == paymentIntentResult.outcomeFromFlow && s.c(getFailureMessage(), paymentIntentResult.getFailureMessage());
        }
        return false;
    }

    @Override // com.stripe.android.StripeIntentResult
    public String getFailureMessage() {
        return this.failureMessage;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (((getIntent().hashCode() * 31) + Integer.hashCode(this.outcomeFromFlow)) * 31) + (getFailureMessage() == null ? 0 : getFailureMessage().hashCode());
    }

    public String toString() {
        return "PaymentIntentResult(intent=" + getIntent() + ", outcomeFromFlow=" + this.outcomeFromFlow + ", failureMessage=" + ((Object) getFailureMessage()) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        this.intent.writeToParcel(out, i11);
        out.writeInt(this.outcomeFromFlow);
        out.writeString(this.failureMessage);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentIntentResult(PaymentIntent intent, int i11, String str) {
        super(i11);
        s.g(intent, "intent");
        this.intent = intent;
        this.outcomeFromFlow = i11;
        this.failureMessage = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.StripeIntentResult
    public PaymentIntent getIntent() {
        return this.intent;
    }
}