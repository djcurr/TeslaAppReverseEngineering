package com.stripe.android.paymentsheet.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.security.InvalidParameterException;
import kotlin.jvm.internal.s;
import kotlin.text.v;

/* loaded from: classes6.dex */
public final class SetupIntentClientSecret extends ClientSecret {
    public static final Parcelable.Creator<SetupIntentClientSecret> CREATOR = new Creator();
    private final String value;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<SetupIntentClientSecret> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetupIntentClientSecret createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new SetupIntentClientSecret(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SetupIntentClientSecret[] newArray(int i11) {
            return new SetupIntentClientSecret[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetupIntentClientSecret(String value) {
        super(null);
        s.g(value, "value");
        this.value = value;
    }

    public static /* synthetic */ SetupIntentClientSecret copy$default(SetupIntentClientSecret setupIntentClientSecret, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = setupIntentClientSecret.getValue();
        }
        return setupIntentClientSecret.copy(str);
    }

    public final String component1() {
        return getValue();
    }

    public final SetupIntentClientSecret copy(String value) {
        s.g(value, "value");
        return new SetupIntentClientSecret(value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetupIntentClientSecret) && s.c(getValue(), ((SetupIntentClientSecret) obj).getValue());
    }

    @Override // com.stripe.android.paymentsheet.model.ClientSecret
    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "SetupIntentClientSecret(value=" + getValue() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // com.stripe.android.paymentsheet.model.ClientSecret
    public void validate() {
        boolean w11;
        w11 = v.w(getValue());
        if (w11) {
            throw new InvalidParameterException("The SetupIntent client_secret cannot be an empty string.");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.value);
    }
}