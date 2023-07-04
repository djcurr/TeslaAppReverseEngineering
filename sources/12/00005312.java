package com.stripe.android.networking;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import vz.v;
import wz.s0;

/* loaded from: classes6.dex */
public final class FraudDetectionData implements StripeModel {
    private static final String KEY_GUID = "guid";
    private static final String KEY_MUID = "muid";
    private static final String KEY_SID = "sid";
    public static final String KEY_TIMESTAMP = "timestamp";
    private final String guid;
    private final String muid;
    private final String sid;
    private final long timestamp;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FraudDetectionData> CREATOR = new Creator();
    private static final long TTL = TimeUnit.MINUTES.toMillis(30);

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<FraudDetectionData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FraudDetectionData createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new FraudDetectionData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FraudDetectionData[] newArray(int i11) {
            return new FraudDetectionData[i11];
        }
    }

    public FraudDetectionData(String guid, String muid, String sid, long j11) {
        s.g(guid, "guid");
        s.g(muid, "muid");
        s.g(sid, "sid");
        this.guid = guid;
        this.muid = muid;
        this.sid = sid;
        this.timestamp = j11;
    }

    public static /* synthetic */ FraudDetectionData copy$default(FraudDetectionData fraudDetectionData, String str, String str2, String str3, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fraudDetectionData.guid;
        }
        if ((i11 & 2) != 0) {
            str2 = fraudDetectionData.muid;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            str3 = fraudDetectionData.sid;
        }
        String str5 = str3;
        if ((i11 & 8) != 0) {
            j11 = fraudDetectionData.timestamp;
        }
        return fraudDetectionData.copy(str, str4, str5, j11);
    }

    public final String component1$payments_core_release() {
        return this.guid;
    }

    public final String component2$payments_core_release() {
        return this.muid;
    }

    public final String component3$payments_core_release() {
        return this.sid;
    }

    public final long component4$payments_core_release() {
        return this.timestamp;
    }

    public final FraudDetectionData copy(String guid, String muid, String sid, long j11) {
        s.g(guid, "guid");
        s.g(muid, "muid");
        s.g(sid, "sid");
        return new FraudDetectionData(guid, muid, sid, j11);
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
        if (obj instanceof FraudDetectionData) {
            FraudDetectionData fraudDetectionData = (FraudDetectionData) obj;
            return s.c(this.guid, fraudDetectionData.guid) && s.c(this.muid, fraudDetectionData.muid) && s.c(this.sid, fraudDetectionData.sid) && this.timestamp == fraudDetectionData.timestamp;
        }
        return false;
    }

    public final String getGuid$payments_core_release() {
        return this.guid;
    }

    public final String getMuid$payments_core_release() {
        return this.muid;
    }

    public final Map<String, String> getParams() {
        Map<String, String> l11;
        l11 = s0.l(v.a(KEY_GUID, this.guid), v.a(KEY_MUID, this.muid), v.a(KEY_SID, this.sid));
        return l11;
    }

    public final String getSid$payments_core_release() {
        return this.sid;
    }

    public final long getTimestamp$payments_core_release() {
        return this.timestamp;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (((((this.guid.hashCode() * 31) + this.muid.hashCode()) * 31) + this.sid.hashCode()) * 31) + Long.hashCode(this.timestamp);
    }

    public final boolean isExpired(long j11) {
        return j11 - this.timestamp > TTL;
    }

    public final JSONObject toJson() {
        JSONObject put = new JSONObject().put(KEY_GUID, this.guid).put(KEY_MUID, this.muid).put(KEY_SID, this.sid).put(KEY_TIMESTAMP, this.timestamp);
        s.f(put, "JSONObject()\n           …KEY_TIMESTAMP, timestamp)");
        return put;
    }

    public String toString() {
        return "FraudDetectionData(guid=" + this.guid + ", muid=" + this.muid + ", sid=" + this.sid + ", timestamp=" + this.timestamp + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.guid);
        out.writeString(this.muid);
        out.writeString(this.sid);
        out.writeLong(this.timestamp);
    }

    public /* synthetic */ FraudDetectionData(String str, String str2, String str3, long j11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? 0L : j11);
    }
}