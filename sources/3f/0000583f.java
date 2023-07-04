package com.stripe.android.stripe3ds2.observability;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.observability.DefaultErrorReporter;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import java.util.Map;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;
import wz.s0;

/* loaded from: classes6.dex */
public final class Stripe3ds2ErrorReporterConfig implements DefaultErrorReporter.Config, Parcelable {
    public static final Parcelable.Creator<Stripe3ds2ErrorReporterConfig> CREATOR = new Creator();
    private final SdkTransactionId sdkTransactionId;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Stripe3ds2ErrorReporterConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2ErrorReporterConfig createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new Stripe3ds2ErrorReporterConfig(parcel.readInt() == 0 ? null : SdkTransactionId.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2ErrorReporterConfig[] newArray(int i11) {
            return new Stripe3ds2ErrorReporterConfig[i11];
        }
    }

    public Stripe3ds2ErrorReporterConfig(SdkTransactionId sdkTransactionId) {
        this.sdkTransactionId = sdkTransactionId;
    }

    private final SdkTransactionId component1() {
        return this.sdkTransactionId;
    }

    public static /* synthetic */ Stripe3ds2ErrorReporterConfig copy$default(Stripe3ds2ErrorReporterConfig stripe3ds2ErrorReporterConfig, SdkTransactionId sdkTransactionId, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sdkTransactionId = stripe3ds2ErrorReporterConfig.sdkTransactionId;
        }
        return stripe3ds2ErrorReporterConfig.copy(sdkTransactionId);
    }

    public final Stripe3ds2ErrorReporterConfig copy(SdkTransactionId sdkTransactionId) {
        return new Stripe3ds2ErrorReporterConfig(sdkTransactionId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Stripe3ds2ErrorReporterConfig) && s.c(this.sdkTransactionId, ((Stripe3ds2ErrorReporterConfig) obj).sdkTransactionId);
    }

    @Override // com.stripe.android.stripe3ds2.observability.DefaultErrorReporter.Config
    public Map<String, String> getCustomTags() {
        Map<String, String> i11;
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        Map<String, String> f11 = sdkTransactionId == null ? null : r0.f(v.a("sdk_transaction_id", sdkTransactionId.getValue()));
        if (f11 == null) {
            i11 = s0.i();
            return i11;
        }
        return f11;
    }

    public int hashCode() {
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        if (sdkTransactionId == null) {
            return 0;
        }
        return sdkTransactionId.hashCode();
    }

    public String toString() {
        return "Stripe3ds2ErrorReporterConfig(sdkTransactionId=" + this.sdkTransactionId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        SdkTransactionId sdkTransactionId = this.sdkTransactionId;
        if (sdkTransactionId == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        sdkTransactionId.writeToParcel(out, i11);
    }
}