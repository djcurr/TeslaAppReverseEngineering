package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.PaymentMethod;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;
import wz.w;

/* loaded from: classes6.dex */
public final class ListPaymentMethodsParams implements StripeParamsModel, Parcelable {
    @Deprecated
    private static final String PARAM_CUSTOMER = "customer";
    @Deprecated
    private static final String PARAM_ENDING_BEFORE = "ending_before";
    @Deprecated
    private static final String PARAM_LIMIT = "limit";
    @Deprecated
    private static final String PARAM_STARTING_AFTER = "starting_after";
    @Deprecated
    private static final String PARAM_TYPE = "type";
    private final String customerId;
    private final String endingBefore;
    private final Integer limit;
    private final PaymentMethod.Type paymentMethodType;
    private final String startingAfter;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ListPaymentMethodsParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ListPaymentMethodsParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListPaymentMethodsParams createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new ListPaymentMethodsParams(parcel.readString(), PaymentMethod.Type.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ListPaymentMethodsParams[] newArray(int i11) {
            return new ListPaymentMethodsParams[i11];
        }
    }

    public ListPaymentMethodsParams(String customerId, PaymentMethod.Type paymentMethodType, Integer num, String str, String str2) {
        s.g(customerId, "customerId");
        s.g(paymentMethodType, "paymentMethodType");
        this.customerId = customerId;
        this.paymentMethodType = paymentMethodType;
        this.limit = num;
        this.endingBefore = str;
        this.startingAfter = str2;
    }

    private final String component1() {
        return this.customerId;
    }

    private final Integer component3() {
        return this.limit;
    }

    private final String component4() {
        return this.endingBefore;
    }

    private final String component5() {
        return this.startingAfter;
    }

    public static /* synthetic */ ListPaymentMethodsParams copy$default(ListPaymentMethodsParams listPaymentMethodsParams, String str, PaymentMethod.Type type, Integer num, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = listPaymentMethodsParams.customerId;
        }
        if ((i11 & 2) != 0) {
            type = listPaymentMethodsParams.paymentMethodType;
        }
        PaymentMethod.Type type2 = type;
        if ((i11 & 4) != 0) {
            num = listPaymentMethodsParams.limit;
        }
        Integer num2 = num;
        if ((i11 & 8) != 0) {
            str2 = listPaymentMethodsParams.endingBefore;
        }
        String str4 = str2;
        if ((i11 & 16) != 0) {
            str3 = listPaymentMethodsParams.startingAfter;
        }
        return listPaymentMethodsParams.copy(str, type2, num2, str4, str3);
    }

    public final PaymentMethod.Type component2$payments_core_release() {
        return this.paymentMethodType;
    }

    public final ListPaymentMethodsParams copy(String customerId, PaymentMethod.Type paymentMethodType, Integer num, String str, String str2) {
        s.g(customerId, "customerId");
        s.g(paymentMethodType, "paymentMethodType");
        return new ListPaymentMethodsParams(customerId, paymentMethodType, num, str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ListPaymentMethodsParams) {
            ListPaymentMethodsParams listPaymentMethodsParams = (ListPaymentMethodsParams) obj;
            return s.c(this.customerId, listPaymentMethodsParams.customerId) && this.paymentMethodType == listPaymentMethodsParams.paymentMethodType && s.c(this.limit, listPaymentMethodsParams.limit) && s.c(this.endingBefore, listPaymentMethodsParams.endingBefore) && s.c(this.startingAfter, listPaymentMethodsParams.startingAfter);
        }
        return false;
    }

    public final PaymentMethod.Type getPaymentMethodType$payments_core_release() {
        return this.paymentMethodType;
    }

    public int hashCode() {
        int hashCode = ((this.customerId.hashCode() * 31) + this.paymentMethodType.hashCode()) * 31;
        Integer num = this.limit;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.endingBefore;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.startingAfter;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        List<p> l11;
        Map<String, Object> i11;
        l11 = w.l(v.a("customer", this.customerId), v.a("type", this.paymentMethodType.code), v.a(PARAM_LIMIT, this.limit), v.a(PARAM_ENDING_BEFORE, this.endingBefore), v.a(PARAM_STARTING_AFTER, this.startingAfter));
        i11 = s0.i();
        for (p pVar : l11) {
            String str = (String) pVar.a();
            Object b11 = pVar.b();
            Map f11 = b11 == null ? null : r0.f(v.a(str, b11));
            if (f11 == null) {
                f11 = s0.i();
            }
            i11 = s0.p(i11, f11);
        }
        return i11;
    }

    public String toString() {
        return "ListPaymentMethodsParams(customerId=" + this.customerId + ", paymentMethodType=" + this.paymentMethodType + ", limit=" + this.limit + ", endingBefore=" + ((Object) this.endingBefore) + ", startingAfter=" + ((Object) this.startingAfter) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        int intValue;
        s.g(out, "out");
        out.writeString(this.customerId);
        this.paymentMethodType.writeToParcel(out, i11);
        Integer num = this.limit;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.endingBefore);
        out.writeString(this.startingAfter);
    }

    public /* synthetic */ ListPaymentMethodsParams(String str, PaymentMethod.Type type, Integer num, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, type, (i11 & 4) != 0 ? null : num, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3);
    }
}