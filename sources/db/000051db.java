package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import java.util.Currency;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class ShippingMethod implements StripeModel {
    private final long amount;
    private final Currency currency;
    private final String detail;
    private final String identifier;
    private final String label;
    public static final Parcelable.Creator<ShippingMethod> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ShippingMethod> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShippingMethod createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new ShippingMethod(parcel.readString(), parcel.readString(), parcel.readLong(), (Currency) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ShippingMethod[] newArray(int i11) {
            return new ShippingMethod[i11];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingMethod(String label, String identifier, long j11, String currencyCode) {
        this(label, identifier, j11, currencyCode, (String) null, 16, (DefaultConstructorMarker) null);
        s.g(label, "label");
        s.g(identifier, "identifier");
        s.g(currencyCode, "currencyCode");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShippingMethod(String label, String identifier, long j11, Currency currency) {
        this(label, identifier, j11, currency, (String) null, 16, (DefaultConstructorMarker) null);
        s.g(label, "label");
        s.g(identifier, "identifier");
        s.g(currency, "currency");
    }

    public ShippingMethod(String label, String identifier, long j11, Currency currency, String str) {
        s.g(label, "label");
        s.g(identifier, "identifier");
        s.g(currency, "currency");
        this.label = label;
        this.identifier = identifier;
        this.amount = j11;
        this.currency = currency;
        this.detail = str;
    }

    public static /* synthetic */ ShippingMethod copy$default(ShippingMethod shippingMethod, String str, String str2, long j11, Currency currency, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = shippingMethod.label;
        }
        if ((i11 & 2) != 0) {
            str2 = shippingMethod.identifier;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            j11 = shippingMethod.amount;
        }
        long j12 = j11;
        if ((i11 & 8) != 0) {
            currency = shippingMethod.currency;
        }
        Currency currency2 = currency;
        if ((i11 & 16) != 0) {
            str3 = shippingMethod.detail;
        }
        return shippingMethod.copy(str, str4, j12, currency2, str3);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this.identifier;
    }

    public final long component3() {
        return this.amount;
    }

    public final Currency component4() {
        return this.currency;
    }

    public final String component5() {
        return this.detail;
    }

    public final ShippingMethod copy(String label, String identifier, long j11, Currency currency, String str) {
        s.g(label, "label");
        s.g(identifier, "identifier");
        s.g(currency, "currency");
        return new ShippingMethod(label, identifier, j11, currency, str);
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
        if (obj instanceof ShippingMethod) {
            ShippingMethod shippingMethod = (ShippingMethod) obj;
            return s.c(this.label, shippingMethod.label) && s.c(this.identifier, shippingMethod.identifier) && this.amount == shippingMethod.amount && s.c(this.currency, shippingMethod.currency) && s.c(this.detail, shippingMethod.detail);
        }
        return false;
    }

    public final long getAmount() {
        return this.amount;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getLabel() {
        return this.label;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((((this.label.hashCode() * 31) + this.identifier.hashCode()) * 31) + Long.hashCode(this.amount)) * 31) + this.currency.hashCode()) * 31;
        String str = this.detail;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "ShippingMethod(label=" + this.label + ", identifier=" + this.identifier + ", amount=" + this.amount + ", currency=" + this.currency + ", detail=" + ((Object) this.detail) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.label);
        out.writeString(this.identifier);
        out.writeLong(this.amount);
        out.writeSerializable(this.currency);
        out.writeString(this.detail);
    }

    public /* synthetic */ ShippingMethod(String str, String str2, long j11, Currency currency, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j11, currency, (i11 & 16) != 0 ? null : str3);
    }

    public /* synthetic */ ShippingMethod(String str, String str2, long j11, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j11, str3, (i11 & 16) != 0 ? null : str4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ShippingMethod(java.lang.String r9, java.lang.String r10, long r11, java.lang.String r13, java.lang.String r14) {
        /*
            r8 = this;
            java.lang.String r0 = "label"
            kotlin.jvm.internal.s.g(r9, r0)
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.s.g(r10, r0)
            java.lang.String r0 = "currencyCode"
            kotlin.jvm.internal.s.g(r13, r0)
            java.util.Currency r6 = java.util.Currency.getInstance(r13)
            java.lang.String r13 = "getInstance(currencyCode)"
            kotlin.jvm.internal.s.f(r6, r13)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r7 = r14
            r1.<init>(r2, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.ShippingMethod.<init>(java.lang.String, java.lang.String, long, java.lang.String, java.lang.String):void");
    }
}