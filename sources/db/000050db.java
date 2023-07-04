package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class BinRange implements StripeModel {
    private final String high;
    private final String low;
    public static final Parcelable.Creator<BinRange> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<BinRange> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BinRange createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new BinRange(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BinRange[] newArray(int i11) {
            return new BinRange[i11];
        }
    }

    public BinRange(String low, String high) {
        s.g(low, "low");
        s.g(high, "high");
        this.low = low;
        this.high = high;
    }

    public static /* synthetic */ BinRange copy$default(BinRange binRange, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = binRange.low;
        }
        if ((i11 & 2) != 0) {
            str2 = binRange.high;
        }
        return binRange.copy(str, str2);
    }

    public final String component1() {
        return this.low;
    }

    public final String component2() {
        return this.high;
    }

    public final BinRange copy(String low, String high) {
        s.g(low, "low");
        s.g(high, "high");
        return new BinRange(low, high);
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
        if (obj instanceof BinRange) {
            BinRange binRange = (BinRange) obj;
            return s.c(this.low, binRange.low) && s.c(this.high, binRange.high);
        }
        return false;
    }

    public final String getHigh() {
        return this.high;
    }

    public final String getLow() {
        return this.low;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.low.hashCode() * 31) + this.high.hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (new java.math.BigDecimal(r3).compareTo(new java.math.BigDecimal(r6.low)) >= 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
        if (r0.compareTo(new java.math.BigDecimal(r7)) <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
        if (new java.math.BigDecimal(r7).compareTo(new java.math.BigDecimal(r6.high)) <= 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (r0.compareTo(new java.math.BigDecimal(r3)) >= 0) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean matches(com.stripe.android.cards.CardNumber.Unvalidated r7) {
        /*
            r6 = this;
            java.lang.String r0 = "cardNumber"
            kotlin.jvm.internal.s.g(r7, r0)
            java.lang.String r7 = r7.getNormalized()
            java.math.BigDecimal r0 = kotlin.text.m.k(r7)
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            int r2 = r7.length()
            java.lang.String r3 = r6.low
            int r3 = r3.length()
            r4 = 1
            if (r2 >= r3) goto L34
            java.math.BigDecimal r2 = new java.math.BigDecimal
            java.lang.String r3 = r6.low
            int r5 = r7.length()
            java.lang.String r3 = kotlin.text.m.i1(r3, r5)
            r2.<init>(r3)
            int r2 = r0.compareTo(r2)
            if (r2 < 0) goto L52
            goto L50
        L34:
            java.math.BigDecimal r2 = new java.math.BigDecimal
            java.lang.String r3 = r6.low
            int r3 = r3.length()
            java.lang.String r3 = kotlin.text.m.i1(r7, r3)
            r2.<init>(r3)
            java.math.BigDecimal r3 = new java.math.BigDecimal
            java.lang.String r5 = r6.low
            r3.<init>(r5)
            int r2 = r2.compareTo(r3)
            if (r2 < 0) goto L52
        L50:
            r2 = r4
            goto L53
        L52:
            r2 = r1
        L53:
            int r3 = r7.length()
            java.lang.String r5 = r6.high
            int r5 = r5.length()
            if (r3 >= r5) goto L75
            java.math.BigDecimal r3 = new java.math.BigDecimal
            java.lang.String r5 = r6.high
            int r7 = r7.length()
            java.lang.String r7 = kotlin.text.m.i1(r5, r7)
            r3.<init>(r7)
            int r7 = r0.compareTo(r3)
            if (r7 > 0) goto L93
            goto L91
        L75:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r3 = r6.high
            int r3 = r3.length()
            java.lang.String r7 = kotlin.text.m.i1(r7, r3)
            r0.<init>(r7)
            java.math.BigDecimal r7 = new java.math.BigDecimal
            java.lang.String r3 = r6.high
            r7.<init>(r3)
            int r7 = r0.compareTo(r7)
            if (r7 > 0) goto L93
        L91:
            r7 = r4
            goto L94
        L93:
            r7 = r1
        L94:
            if (r2 == 0) goto L99
            if (r7 == 0) goto L99
            r1 = r4
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.BinRange.matches(com.stripe.android.cards.CardNumber$Unvalidated):boolean");
    }

    public String toString() {
        return "BinRange(low=" + this.low + ", high=" + this.high + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.low);
        out.writeString(this.high);
    }
}