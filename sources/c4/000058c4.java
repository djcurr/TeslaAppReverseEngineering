package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class SdkTransactionId implements Parcelable, Serializable {
    private final String value;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SdkTransactionId> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SdkTransactionId create() {
            UUID randomUUID = UUID.randomUUID();
            s.f(randomUUID, "randomUUID()");
            return new SdkTransactionId(randomUUID);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<SdkTransactionId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdkTransactionId createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new SdkTransactionId(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SdkTransactionId[] newArray(int i11) {
            return new SdkTransactionId[i11];
        }
    }

    public SdkTransactionId(String value) {
        s.g(value, "value");
        this.value = value;
    }

    public static /* synthetic */ SdkTransactionId copy$default(SdkTransactionId sdkTransactionId, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sdkTransactionId.value;
        }
        return sdkTransactionId.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final SdkTransactionId copy(String value) {
        s.g(value, "value");
        return new SdkTransactionId(value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SdkTransactionId) && s.c(this.value, ((SdkTransactionId) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

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

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SdkTransactionId(java.util.UUID r2) {
        /*
            r1 = this;
            java.lang.String r0 = "uuidValue"
            kotlin.jvm.internal.s.g(r2, r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "uuidValue.toString()"
            kotlin.jvm.internal.s.f(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.SdkTransactionId.<init>(java.util.UUID):void");
    }
}