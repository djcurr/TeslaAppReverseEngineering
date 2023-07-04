package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class PaymentMethodsList implements StripeModel {
    public static final Parcelable.Creator<PaymentMethodsList> CREATOR = new Creator();
    private final List<PaymentMethod> paymentMethods;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PaymentMethodsList> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodsList createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(PaymentMethod.CREATOR.createFromParcel(parcel));
            }
            return new PaymentMethodsList(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentMethodsList[] newArray(int i11) {
            return new PaymentMethodsList[i11];
        }
    }

    public PaymentMethodsList(List<PaymentMethod> paymentMethods) {
        s.g(paymentMethods, "paymentMethods");
        this.paymentMethods = paymentMethods;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentMethodsList copy$default(PaymentMethodsList paymentMethodsList, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = paymentMethodsList.paymentMethods;
        }
        return paymentMethodsList.copy(list);
    }

    public final List<PaymentMethod> component1() {
        return this.paymentMethods;
    }

    public final PaymentMethodsList copy(List<PaymentMethod> paymentMethods) {
        s.g(paymentMethods, "paymentMethods");
        return new PaymentMethodsList(paymentMethods);
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
        return (obj instanceof PaymentMethodsList) && s.c(this.paymentMethods, ((PaymentMethodsList) obj).paymentMethods);
    }

    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.paymentMethods.hashCode();
    }

    public String toString() {
        return "PaymentMethodsList(paymentMethods=" + this.paymentMethods + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        List<PaymentMethod> list = this.paymentMethods;
        out.writeInt(list.size());
        for (PaymentMethod paymentMethod : list) {
            paymentMethod.writeToParcel(out, i11);
        }
    }
}