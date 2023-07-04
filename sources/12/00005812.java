package com.stripe.android.stripe3ds2.init;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class HardwareId implements Parcelable {
    public static final Parcelable.Creator<HardwareId> CREATOR = new Creator();
    private final String value;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<HardwareId> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HardwareId createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new HardwareId(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HardwareId[] newArray(int i11) {
            return new HardwareId[i11];
        }
    }

    public HardwareId(String value) {
        s.g(value, "value");
        this.value = value;
    }

    public static /* synthetic */ HardwareId copy$default(HardwareId hardwareId, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = hardwareId.value;
        }
        return hardwareId.copy(str);
    }

    public final String component1() {
        return this.value;
    }

    public final HardwareId copy(String value) {
        s.g(value, "value");
        return new HardwareId(value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HardwareId) && s.c(this.value, ((HardwareId) obj).value);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value.hashCode();
    }

    public final boolean isPresent() {
        return this.value.length() > 0;
    }

    public String toString() {
        return "HardwareId(value=" + this.value + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.value);
    }
}