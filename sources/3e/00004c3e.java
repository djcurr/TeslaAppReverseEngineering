package com.stripe.android.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.y;

/* loaded from: classes2.dex */
public final class Bin implements StripeModel {
    private static final int BIN_LENGTH = 6;
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Bin> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bin create(String cardNumber) {
            String i12;
            s.g(cardNumber, "cardNumber");
            i12 = y.i1(cardNumber, 6);
            if (!(i12.length() == 6)) {
                i12 = null;
            }
            if (i12 == null) {
                return null;
            }
            return new Bin(i12);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<Bin> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Bin createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new Bin(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Bin[] newArray(int i11) {
            return new Bin[i11];
        }
    }

    public Bin(String value) {
        s.g(value, "value");
        this.value = value;
    }

    public static /* synthetic */ Bin copy$default(Bin bin, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = bin.value;
        }
        return bin.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final Bin copy(String value) {
        s.g(value, "value");
        return new Bin(value);
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
        return (obj instanceof Bin) && s.c(this.value, ((Bin) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.value.hashCode();
    }

    public String toString() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.value);
    }
}