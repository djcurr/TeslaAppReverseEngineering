package com.stripe.android.link;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.ConsumerPaymentDetails;
import com.stripe.android.model.PaymentMethodCreateParams;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class LinkPaymentDetails implements Parcelable {
    private final ConsumerPaymentDetails.PaymentDetails paymentDetails;
    private final PaymentMethodCreateParams paymentMethodCreateParams;
    public static final Parcelable.Creator<LinkPaymentDetails> CREATOR = new Creator();
    public static final int $stable = PaymentMethodCreateParams.$stable | ConsumerPaymentDetails.PaymentDetails.$stable;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<LinkPaymentDetails> {
        @Override // android.os.Parcelable.Creator
        public final LinkPaymentDetails createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new LinkPaymentDetails((ConsumerPaymentDetails.PaymentDetails) parcel.readParcelable(LinkPaymentDetails.class.getClassLoader()), (PaymentMethodCreateParams) parcel.readParcelable(LinkPaymentDetails.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final LinkPaymentDetails[] newArray(int i11) {
            return new LinkPaymentDetails[i11];
        }
    }

    public LinkPaymentDetails(ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams) {
        s.g(paymentDetails, "paymentDetails");
        s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
        this.paymentDetails = paymentDetails;
        this.paymentMethodCreateParams = paymentMethodCreateParams;
    }

    public static /* synthetic */ LinkPaymentDetails copy$default(LinkPaymentDetails linkPaymentDetails, ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            paymentDetails = linkPaymentDetails.paymentDetails;
        }
        if ((i11 & 2) != 0) {
            paymentMethodCreateParams = linkPaymentDetails.paymentMethodCreateParams;
        }
        return linkPaymentDetails.copy(paymentDetails, paymentMethodCreateParams);
    }

    public final ConsumerPaymentDetails.PaymentDetails component1() {
        return this.paymentDetails;
    }

    public final PaymentMethodCreateParams component2() {
        return this.paymentMethodCreateParams;
    }

    public final LinkPaymentDetails copy(ConsumerPaymentDetails.PaymentDetails paymentDetails, PaymentMethodCreateParams paymentMethodCreateParams) {
        s.g(paymentDetails, "paymentDetails");
        s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
        return new LinkPaymentDetails(paymentDetails, paymentMethodCreateParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkPaymentDetails) {
            LinkPaymentDetails linkPaymentDetails = (LinkPaymentDetails) obj;
            return s.c(this.paymentDetails, linkPaymentDetails.paymentDetails) && s.c(this.paymentMethodCreateParams, linkPaymentDetails.paymentMethodCreateParams);
        }
        return false;
    }

    public final ConsumerPaymentDetails.PaymentDetails getPaymentDetails() {
        return this.paymentDetails;
    }

    public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    public int hashCode() {
        return (this.paymentDetails.hashCode() * 31) + this.paymentMethodCreateParams.hashCode();
    }

    public String toString() {
        return "LinkPaymentDetails(paymentDetails=" + this.paymentDetails + ", paymentMethodCreateParams=" + this.paymentMethodCreateParams + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeParcelable(this.paymentDetails, i11);
        out.writeParcelable(this.paymentMethodCreateParams, i11);
    }
}