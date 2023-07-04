package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;
import vz.q;
import vz.r;
import vz.v;
import wz.r0;
import wz.s0;
import wz.w;

/* loaded from: classes6.dex */
public final class Stripe3ds2AuthParams implements StripeParamsModel, Parcelable {
    public static final String FIELD_APP = "app";
    private static final String FIELD_DEVICE_RENDER_OPTIONS = "deviceRenderOptions";
    public static final String FIELD_FALLBACK_RETURN_URL = "fallback_return_url";
    private static final String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final String FIELD_SDK_APP_ID = "sdkAppID";
    private static final String FIELD_SDK_ENC_DATA = "sdkEncData";
    private static final String FIELD_SDK_EPHEM_PUB_KEY = "sdkEphemPubKey";
    private static final String FIELD_SDK_INTERFACE = "sdkInterface";
    private static final String FIELD_SDK_MAX_TIMEOUT = "sdkMaxTimeout";
    private static final String FIELD_SDK_REFERENCE_NUMBER = "sdkReferenceNumber";
    private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final String FIELD_SDK_UI_TYPE = "sdkUiType";
    public static final String FIELD_SOURCE = "source";
    private final String deviceData;
    private final int maxTimeout;
    private final String messageVersion;
    private final String returnUrl;
    private final String sdkAppId;
    private final String sdkEphemeralPublicKey;
    private final String sdkReferenceNumber;
    private final String sdkTransactionId;
    private final String sourceId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Stripe3ds2AuthParams> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Stripe3ds2AuthParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthParams createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new Stripe3ds2AuthParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Stripe3ds2AuthParams[] newArray(int i11) {
            return new Stripe3ds2AuthParams[i11];
        }
    }

    public Stripe3ds2AuthParams(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int i11, String str) {
        s.g(sourceId, "sourceId");
        s.g(sdkAppId, "sdkAppId");
        s.g(sdkReferenceNumber, "sdkReferenceNumber");
        s.g(sdkTransactionId, "sdkTransactionId");
        s.g(deviceData, "deviceData");
        s.g(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        s.g(messageVersion, "messageVersion");
        this.sourceId = sourceId;
        this.sdkAppId = sdkAppId;
        this.sdkReferenceNumber = sdkReferenceNumber;
        this.sdkTransactionId = sdkTransactionId;
        this.deviceData = deviceData;
        this.sdkEphemeralPublicKey = sdkEphemeralPublicKey;
        this.messageVersion = messageVersion;
        this.maxTimeout = i11;
        this.returnUrl = str;
    }

    private final String component1() {
        return this.sourceId;
    }

    private final String component2() {
        return this.sdkAppId;
    }

    private final String component3() {
        return this.sdkReferenceNumber;
    }

    private final String component4() {
        return this.sdkTransactionId;
    }

    private final String component5() {
        return this.deviceData;
    }

    private final String component6() {
        return this.sdkEphemeralPublicKey;
    }

    private final String component7() {
        return this.messageVersion;
    }

    private final int component8() {
        return this.maxTimeout;
    }

    private final String component9() {
        return this.returnUrl;
    }

    private final JSONObject getDeviceRenderOptions() {
        JSONObject b11;
        List l11;
        try {
            q.a aVar = q.f54772b;
            JSONObject put = new JSONObject().put(FIELD_SDK_INTERFACE, "03");
            l11 = w.l("01", "02", "03", "04", "05");
            b11 = q.b(put.put(FIELD_SDK_UI_TYPE, new JSONArray((Collection) l11)));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        JSONObject jSONObject = new JSONObject();
        if (q.g(b11)) {
            b11 = jSONObject;
        }
        return (JSONObject) b11;
    }

    public final Stripe3ds2AuthParams copy(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int i11, String str) {
        s.g(sourceId, "sourceId");
        s.g(sdkAppId, "sdkAppId");
        s.g(sdkReferenceNumber, "sdkReferenceNumber");
        s.g(sdkTransactionId, "sdkTransactionId");
        s.g(deviceData, "deviceData");
        s.g(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        s.g(messageVersion, "messageVersion");
        return new Stripe3ds2AuthParams(sourceId, sdkAppId, sdkReferenceNumber, sdkTransactionId, deviceData, sdkEphemeralPublicKey, messageVersion, i11, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Stripe3ds2AuthParams) {
            Stripe3ds2AuthParams stripe3ds2AuthParams = (Stripe3ds2AuthParams) obj;
            return s.c(this.sourceId, stripe3ds2AuthParams.sourceId) && s.c(this.sdkAppId, stripe3ds2AuthParams.sdkAppId) && s.c(this.sdkReferenceNumber, stripe3ds2AuthParams.sdkReferenceNumber) && s.c(this.sdkTransactionId, stripe3ds2AuthParams.sdkTransactionId) && s.c(this.deviceData, stripe3ds2AuthParams.deviceData) && s.c(this.sdkEphemeralPublicKey, stripe3ds2AuthParams.sdkEphemeralPublicKey) && s.c(this.messageVersion, stripe3ds2AuthParams.messageVersion) && this.maxTimeout == stripe3ds2AuthParams.maxTimeout && s.c(this.returnUrl, stripe3ds2AuthParams.returnUrl);
        }
        return false;
    }

    public final /* synthetic */ JSONObject getAppParams$payments_core_release() {
        JSONObject b11;
        String m02;
        try {
            q.a aVar = q.f54772b;
            JSONObject put = new JSONObject().put(FIELD_SDK_APP_ID, this.sdkAppId).put("sdkTransID", this.sdkTransactionId).put(FIELD_SDK_ENC_DATA, this.deviceData).put("sdkEphemPubKey", new JSONObject(this.sdkEphemeralPublicKey));
            m02 = kotlin.text.w.m0(String.valueOf(this.maxTimeout), 2, '0');
            b11 = q.b(put.put(FIELD_SDK_MAX_TIMEOUT, m02).put(FIELD_SDK_REFERENCE_NUMBER, this.sdkReferenceNumber).put("messageVersion", this.messageVersion).put(FIELD_DEVICE_RENDER_OPTIONS, getDeviceRenderOptions()));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        JSONObject jSONObject = new JSONObject();
        if (q.g(b11)) {
            b11 = jSONObject;
        }
        return (JSONObject) b11;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this.sourceId.hashCode() * 31) + this.sdkAppId.hashCode()) * 31) + this.sdkReferenceNumber.hashCode()) * 31) + this.sdkTransactionId.hashCode()) * 31) + this.deviceData.hashCode()) * 31) + this.sdkEphemeralPublicKey.hashCode()) * 31) + this.messageVersion.hashCode()) * 31) + Integer.hashCode(this.maxTimeout)) * 31;
        String str = this.returnUrl;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map l11;
        Map<String, Object> p11;
        l11 = s0.l(v.a(FIELD_SOURCE, this.sourceId), v.a(FIELD_APP, getAppParams$payments_core_release().toString()));
        String str = this.returnUrl;
        Map f11 = str == null ? null : r0.f(v.a(FIELD_FALLBACK_RETURN_URL, str));
        if (f11 == null) {
            f11 = s0.i();
        }
        p11 = s0.p(l11, f11);
        return p11;
    }

    public String toString() {
        return "Stripe3ds2AuthParams(sourceId=" + this.sourceId + ", sdkAppId=" + this.sdkAppId + ", sdkReferenceNumber=" + this.sdkReferenceNumber + ", sdkTransactionId=" + this.sdkTransactionId + ", deviceData=" + this.deviceData + ", sdkEphemeralPublicKey=" + this.sdkEphemeralPublicKey + ", messageVersion=" + this.messageVersion + ", maxTimeout=" + this.maxTimeout + ", returnUrl=" + ((Object) this.returnUrl) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.sourceId);
        out.writeString(this.sdkAppId);
        out.writeString(this.sdkReferenceNumber);
        out.writeString(this.sdkTransactionId);
        out.writeString(this.deviceData);
        out.writeString(this.sdkEphemeralPublicKey);
        out.writeString(this.messageVersion);
        out.writeInt(this.maxTimeout);
        out.writeString(this.returnUrl);
    }
}