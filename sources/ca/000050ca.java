package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class AlipayAuthResult implements StripeModel {
    public static final String RESULT_CODE_CANCELLED = "6001";
    public static final String RESULT_CODE_FAILED = "4000";
    public static final String RESULT_CODE_SUCCESS = "9000";
    private final int outcome;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AlipayAuthResult> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<AlipayAuthResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlipayAuthResult createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new AlipayAuthResult(parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AlipayAuthResult[] newArray(int i11) {
            return new AlipayAuthResult[i11];
        }
    }

    public AlipayAuthResult(int i11) {
        this.outcome = i11;
    }

    public static /* synthetic */ AlipayAuthResult copy$default(AlipayAuthResult alipayAuthResult, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = alipayAuthResult.outcome;
        }
        return alipayAuthResult.copy(i11);
    }

    public final int component1() {
        return this.outcome;
    }

    public final AlipayAuthResult copy(int i11) {
        return new AlipayAuthResult(i11);
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
        return (obj instanceof AlipayAuthResult) && this.outcome == ((AlipayAuthResult) obj).outcome;
    }

    public final int getOutcome() {
        return this.outcome;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return Integer.hashCode(this.outcome);
    }

    public String toString() {
        return "AlipayAuthResult(outcome=" + this.outcome + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeInt(this.outcome);
    }
}