package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class PaymentSessionData implements Parcelable {
    private final long cartTotal;
    private final boolean isShippingInfoRequired;
    private final boolean isShippingMethodRequired;
    private final PaymentMethod paymentMethod;
    private final ShippingInformation shippingInformation;
    private final ShippingMethod shippingMethod;
    private final long shippingTotal;
    private final boolean useGooglePay;
    public static final Parcelable.Creator<PaymentSessionData> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<PaymentSessionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSessionData createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new PaymentSessionData(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readLong(), parcel.readLong(), parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ShippingMethod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? PaymentMethod.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentSessionData[] newArray(int i11) {
            return new PaymentSessionData[i11];
        }
    }

    public PaymentSessionData(boolean z11, boolean z12, long j11, long j12, ShippingInformation shippingInformation, ShippingMethod shippingMethod, PaymentMethod paymentMethod, boolean z13) {
        this.isShippingInfoRequired = z11;
        this.isShippingMethodRequired = z12;
        this.cartTotal = j11;
        this.shippingTotal = j12;
        this.shippingInformation = shippingInformation;
        this.shippingMethod = shippingMethod;
        this.paymentMethod = paymentMethod;
        this.useGooglePay = z13;
    }

    private final boolean component1() {
        return this.isShippingInfoRequired;
    }

    private final boolean component2() {
        return this.isShippingMethodRequired;
    }

    public final long component3() {
        return this.cartTotal;
    }

    public final long component4() {
        return this.shippingTotal;
    }

    public final ShippingInformation component5() {
        return this.shippingInformation;
    }

    public final ShippingMethod component6() {
        return this.shippingMethod;
    }

    public final PaymentMethod component7() {
        return this.paymentMethod;
    }

    public final boolean component8() {
        return this.useGooglePay;
    }

    public final PaymentSessionData copy(boolean z11, boolean z12, long j11, long j12, ShippingInformation shippingInformation, ShippingMethod shippingMethod, PaymentMethod paymentMethod, boolean z13) {
        return new PaymentSessionData(z11, z12, j11, j12, shippingInformation, shippingMethod, paymentMethod, z13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaymentSessionData) {
            PaymentSessionData paymentSessionData = (PaymentSessionData) obj;
            return this.isShippingInfoRequired == paymentSessionData.isShippingInfoRequired && this.isShippingMethodRequired == paymentSessionData.isShippingMethodRequired && this.cartTotal == paymentSessionData.cartTotal && this.shippingTotal == paymentSessionData.shippingTotal && s.c(this.shippingInformation, paymentSessionData.shippingInformation) && s.c(this.shippingMethod, paymentSessionData.shippingMethod) && s.c(this.paymentMethod, paymentSessionData.paymentMethod) && this.useGooglePay == paymentSessionData.useGooglePay;
        }
        return false;
    }

    public final long getCartTotal() {
        return this.cartTotal;
    }

    public final PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    public final ShippingMethod getShippingMethod() {
        return this.shippingMethod;
    }

    public final long getShippingTotal() {
        return this.shippingTotal;
    }

    public final boolean getUseGooglePay() {
        return this.useGooglePay;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z11 = this.isShippingInfoRequired;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        ?? r22 = this.isShippingMethodRequired;
        int i12 = r22;
        if (r22 != 0) {
            i12 = 1;
        }
        int hashCode = (((((i11 + i12) * 31) + Long.hashCode(this.cartTotal)) * 31) + Long.hashCode(this.shippingTotal)) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        int hashCode2 = (hashCode + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31;
        ShippingMethod shippingMethod = this.shippingMethod;
        int hashCode3 = (hashCode2 + (shippingMethod == null ? 0 : shippingMethod.hashCode())) * 31;
        PaymentMethod paymentMethod = this.paymentMethod;
        int hashCode4 = (hashCode3 + (paymentMethod != null ? paymentMethod.hashCode() : 0)) * 31;
        boolean z12 = this.useGooglePay;
        return hashCode4 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public final boolean isPaymentReadyToCharge() {
        return (this.paymentMethod != null || this.useGooglePay) && !((this.isShippingInfoRequired && this.shippingInformation == null) || (this.isShippingMethodRequired && this.shippingMethod == null));
    }

    public String toString() {
        return "PaymentSessionData(isShippingInfoRequired=" + this.isShippingInfoRequired + ", isShippingMethodRequired=" + this.isShippingMethodRequired + ", cartTotal=" + this.cartTotal + ", shippingTotal=" + this.shippingTotal + ", shippingInformation=" + this.shippingInformation + ", shippingMethod=" + this.shippingMethod + ", paymentMethod=" + this.paymentMethod + ", useGooglePay=" + this.useGooglePay + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeInt(this.isShippingInfoRequired ? 1 : 0);
        out.writeInt(this.isShippingMethodRequired ? 1 : 0);
        out.writeLong(this.cartTotal);
        out.writeLong(this.shippingTotal);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingInformation.writeToParcel(out, i11);
        }
        ShippingMethod shippingMethod = this.shippingMethod;
        if (shippingMethod == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingMethod.writeToParcel(out, i11);
        }
        PaymentMethod paymentMethod = this.paymentMethod;
        if (paymentMethod == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            paymentMethod.writeToParcel(out, i11);
        }
        out.writeInt(this.useGooglePay ? 1 : 0);
    }

    public /* synthetic */ PaymentSessionData(boolean z11, boolean z12, long j11, long j12, ShippingInformation shippingInformation, ShippingMethod shippingMethod, PaymentMethod paymentMethod, boolean z13, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, z12, (i11 & 4) != 0 ? 0L : j11, (i11 & 8) != 0 ? 0L : j12, (i11 & 16) != 0 ? null : shippingInformation, (i11 & 32) != 0 ? null : shippingMethod, (i11 & 64) != 0 ? null : paymentMethod, (i11 & 128) != 0 ? false : z13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentSessionData(PaymentSessionConfig config) {
        this(config.isShippingInfoRequired(), config.isShippingMethodRequired(), 0L, 0L, null, null, null, false, 252, null);
        s.g(config, "config");
    }
}