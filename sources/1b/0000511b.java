package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.s0;

/* loaded from: classes6.dex */
public final class DateOfBirth implements StripeParamsModel, Parcelable {
    @Deprecated
    private static final String PARAM_DAY = "day";
    @Deprecated
    private static final String PARAM_MONTH = "month";
    @Deprecated
    private static final String PARAM_YEAR = "year";
    private final int day;
    private final int month;
    private final int year;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DateOfBirth> CREATOR = new Creator();
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
    public static final class Creator implements Parcelable.Creator<DateOfBirth> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DateOfBirth createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new DateOfBirth(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DateOfBirth[] newArray(int i11) {
            return new DateOfBirth[i11];
        }
    }

    public DateOfBirth(int i11, int i12, int i13) {
        this.day = i11;
        this.month = i12;
        this.year = i13;
    }

    public static /* synthetic */ DateOfBirth copy$default(DateOfBirth dateOfBirth, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = dateOfBirth.day;
        }
        if ((i14 & 2) != 0) {
            i12 = dateOfBirth.month;
        }
        if ((i14 & 4) != 0) {
            i13 = dateOfBirth.year;
        }
        return dateOfBirth.copy(i11, i12, i13);
    }

    public final int component1() {
        return this.day;
    }

    public final int component2() {
        return this.month;
    }

    public final int component3() {
        return this.year;
    }

    public final DateOfBirth copy(int i11, int i12, int i13) {
        return new DateOfBirth(i11, i12, i13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DateOfBirth) {
            DateOfBirth dateOfBirth = (DateOfBirth) obj;
            return this.day == dateOfBirth.day && this.month == dateOfBirth.month && this.year == dateOfBirth.year;
        }
        return false;
    }

    public final int getDay() {
        return this.day;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.day) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.year);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map<String, Object> l11;
        l11 = s0.l(v.a(PARAM_DAY, Integer.valueOf(this.day)), v.a(PARAM_MONTH, Integer.valueOf(this.month)), v.a(PARAM_YEAR, Integer.valueOf(this.year)));
        return l11;
    }

    public String toString() {
        return "DateOfBirth(day=" + this.day + ", month=" + this.month + ", year=" + this.year + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeInt(this.day);
        out.writeInt(this.month);
        out.writeInt(this.year);
    }
}