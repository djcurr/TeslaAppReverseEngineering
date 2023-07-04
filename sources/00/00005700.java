package com.stripe.android.paymentsheet.paymentdatacollection;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.injection.InjectorKey;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.ui.core.Amount;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class FormFragmentArguments implements Parcelable {
    public static final Parcelable.Creator<FormFragmentArguments> CREATOR = new Creator();
    private final Amount amount;
    private final PaymentSheet.BillingDetails billingDetails;
    private final PaymentMethodCreateParams initialPaymentMethodCreateParams;
    private final String injectorKey;
    private final String merchantName;
    private final String paymentMethodCode;
    private final boolean showCheckbox;
    private final boolean showCheckboxControlledFields;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<FormFragmentArguments> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormFragmentArguments createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new FormFragmentArguments(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (Amount) parcel.readParcelable(FormFragmentArguments.class.getClassLoader()), parcel.readInt() == 0 ? null : PaymentSheet.BillingDetails.CREATOR.createFromParcel(parcel), parcel.readString(), (PaymentMethodCreateParams) parcel.readParcelable(FormFragmentArguments.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FormFragmentArguments[] newArray(int i11) {
            return new FormFragmentArguments[i11];
        }
    }

    public FormFragmentArguments(String paymentMethodCode, boolean z11, boolean z12, String merchantName, Amount amount, PaymentSheet.BillingDetails billingDetails, @InjectorKey String injectorKey, PaymentMethodCreateParams paymentMethodCreateParams) {
        s.g(paymentMethodCode, "paymentMethodCode");
        s.g(merchantName, "merchantName");
        s.g(injectorKey, "injectorKey");
        this.paymentMethodCode = paymentMethodCode;
        this.showCheckbox = z11;
        this.showCheckboxControlledFields = z12;
        this.merchantName = merchantName;
        this.amount = amount;
        this.billingDetails = billingDetails;
        this.injectorKey = injectorKey;
        this.initialPaymentMethodCreateParams = paymentMethodCreateParams;
    }

    public final String component1() {
        return this.paymentMethodCode;
    }

    public final boolean component2() {
        return this.showCheckbox;
    }

    public final boolean component3() {
        return this.showCheckboxControlledFields;
    }

    public final String component4() {
        return this.merchantName;
    }

    public final Amount component5() {
        return this.amount;
    }

    public final PaymentSheet.BillingDetails component6() {
        return this.billingDetails;
    }

    public final String component7() {
        return this.injectorKey;
    }

    public final PaymentMethodCreateParams component8() {
        return this.initialPaymentMethodCreateParams;
    }

    public final FormFragmentArguments copy(String paymentMethodCode, boolean z11, boolean z12, String merchantName, Amount amount, PaymentSheet.BillingDetails billingDetails, @InjectorKey String injectorKey, PaymentMethodCreateParams paymentMethodCreateParams) {
        s.g(paymentMethodCode, "paymentMethodCode");
        s.g(merchantName, "merchantName");
        s.g(injectorKey, "injectorKey");
        return new FormFragmentArguments(paymentMethodCode, z11, z12, merchantName, amount, billingDetails, injectorKey, paymentMethodCreateParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FormFragmentArguments) {
            FormFragmentArguments formFragmentArguments = (FormFragmentArguments) obj;
            return s.c(this.paymentMethodCode, formFragmentArguments.paymentMethodCode) && this.showCheckbox == formFragmentArguments.showCheckbox && this.showCheckboxControlledFields == formFragmentArguments.showCheckboxControlledFields && s.c(this.merchantName, formFragmentArguments.merchantName) && s.c(this.amount, formFragmentArguments.amount) && s.c(this.billingDetails, formFragmentArguments.billingDetails) && s.c(this.injectorKey, formFragmentArguments.injectorKey) && s.c(this.initialPaymentMethodCreateParams, formFragmentArguments.initialPaymentMethodCreateParams);
        }
        return false;
    }

    public final Amount getAmount() {
        return this.amount;
    }

    public final PaymentSheet.BillingDetails getBillingDetails() {
        return this.billingDetails;
    }

    public final PaymentMethodCreateParams getInitialPaymentMethodCreateParams() {
        return this.initialPaymentMethodCreateParams;
    }

    public final String getInjectorKey() {
        return this.injectorKey;
    }

    public final String getMerchantName() {
        return this.merchantName;
    }

    public final String getPaymentMethodCode() {
        return this.paymentMethodCode;
    }

    public final boolean getShowCheckbox() {
        return this.showCheckbox;
    }

    public final boolean getShowCheckboxControlledFields() {
        return this.showCheckboxControlledFields;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.paymentMethodCode.hashCode() * 31;
        boolean z11 = this.showCheckbox;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z12 = this.showCheckboxControlledFields;
        int hashCode2 = (((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.merchantName.hashCode()) * 31;
        Amount amount = this.amount;
        int hashCode3 = (hashCode2 + (amount == null ? 0 : amount.hashCode())) * 31;
        PaymentSheet.BillingDetails billingDetails = this.billingDetails;
        int hashCode4 = (((hashCode3 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31) + this.injectorKey.hashCode()) * 31;
        PaymentMethodCreateParams paymentMethodCreateParams = this.initialPaymentMethodCreateParams;
        return hashCode4 + (paymentMethodCreateParams != null ? paymentMethodCreateParams.hashCode() : 0);
    }

    public String toString() {
        return "FormFragmentArguments(paymentMethodCode=" + this.paymentMethodCode + ", showCheckbox=" + this.showCheckbox + ", showCheckboxControlledFields=" + this.showCheckboxControlledFields + ", merchantName=" + this.merchantName + ", amount=" + this.amount + ", billingDetails=" + this.billingDetails + ", injectorKey=" + this.injectorKey + ", initialPaymentMethodCreateParams=" + this.initialPaymentMethodCreateParams + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.paymentMethodCode);
        out.writeInt(this.showCheckbox ? 1 : 0);
        out.writeInt(this.showCheckboxControlledFields ? 1 : 0);
        out.writeString(this.merchantName);
        out.writeParcelable(this.amount, i11);
        PaymentSheet.BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            billingDetails.writeToParcel(out, i11);
        }
        out.writeString(this.injectorKey);
        out.writeParcelable(this.initialPaymentMethodCreateParams, i11);
    }

    public /* synthetic */ FormFragmentArguments(String str, boolean z11, boolean z12, String str2, Amount amount, PaymentSheet.BillingDetails billingDetails, String str3, PaymentMethodCreateParams paymentMethodCreateParams, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, z12, str2, (i11 & 16) != 0 ? null : amount, (i11 & 32) != 0 ? null : billingDetails, str3, (i11 & 128) != 0 ? null : paymentMethodCreateParams);
    }
}