package com.stripe.android.ui.core;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.ui.core.CurrencyFormatter;
import java.util.Locale;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class Amount implements Parcelable {
    private final String currencyCode;
    private final long value;
    public static final Parcelable.Creator<Amount> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Amount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Amount createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new Amount(parcel.readLong(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Amount[] newArray(int i11) {
            return new Amount[i11];
        }
    }

    public Amount(long j11, String currencyCode) {
        s.g(currencyCode, "currencyCode");
        this.value = j11;
        this.currencyCode = currencyCode;
    }

    public static /* synthetic */ Amount copy$default(Amount amount, long j11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = amount.value;
        }
        if ((i11 & 2) != 0) {
            str = amount.currencyCode;
        }
        return amount.copy(j11, str);
    }

    public final String buildPayButtonLabel(Resources resources) {
        s.g(resources, "resources");
        String string = resources.getString(R.string.stripe_pay_button_amount, CurrencyFormatter.Companion.format$default(CurrencyFormatter.Companion, this.value, this.currencyCode, (Locale) null, 4, (Object) null));
        s.f(string, "resources.getString(\n   …, currencyCode)\n        )");
        return string;
    }

    public final long component1() {
        return this.value;
    }

    public final String component2() {
        return this.currencyCode;
    }

    public final Amount copy(long j11, String currencyCode) {
        s.g(currencyCode, "currencyCode");
        return new Amount(j11, currencyCode);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Amount) {
            Amount amount = (Amount) obj;
            return this.value == amount.value && s.c(this.currencyCode, amount.currencyCode);
        }
        return false;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final long getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Long.hashCode(this.value) * 31) + this.currencyCode.hashCode();
    }

    public String toString() {
        return "Amount(value=" + this.value + ", currencyCode=" + this.currencyCode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeLong(this.value);
        out.writeString(this.currencyCode);
    }
}