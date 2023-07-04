package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class IssuingCardPin implements StripeModel {
    private final String pin;
    public static final Parcelable.Creator<IssuingCardPin> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<IssuingCardPin> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IssuingCardPin createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new IssuingCardPin(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IssuingCardPin[] newArray(int i11) {
            return new IssuingCardPin[i11];
        }
    }

    public IssuingCardPin(String pin) {
        s.g(pin, "pin");
        this.pin = pin;
    }

    public static /* synthetic */ IssuingCardPin copy$default(IssuingCardPin issuingCardPin, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = issuingCardPin.pin;
        }
        return issuingCardPin.copy(str);
    }

    public final String component1() {
        return this.pin;
    }

    public final IssuingCardPin copy(String pin) {
        s.g(pin, "pin");
        return new IssuingCardPin(pin);
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
        return (obj instanceof IssuingCardPin) && s.c(this.pin, ((IssuingCardPin) obj).pin);
    }

    public final String getPin() {
        return this.pin;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.pin.hashCode();
    }

    public String toString() {
        return "IssuingCardPin(pin=" + this.pin + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.pin);
    }
}