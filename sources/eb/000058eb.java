package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class ErrorData implements Parcelable {
    private static final String FIELD_3DS_SERVER_TRANS_ID = "threeDSServerTransID";
    private static final String FIELD_ACS_TRANS_ID = "acsTransID";
    private static final String FIELD_DS_TRANS_ID = "dsTransID";
    private static final String FIELD_ERROR_CODE = "errorCode";
    private static final String FIELD_ERROR_COMPONENT = "errorComponent";
    private static final String FIELD_ERROR_DESCRIPTION = "errorDescription";
    private static final String FIELD_ERROR_DETAIL = "errorDetail";
    private static final String FIELD_ERROR_MESSAGE_TYPE = "errorMessageType";
    private static final String FIELD_MESSAGE_TYPE = "messageType";
    private static final String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final String MESSAGE_TYPE = "Erro";
    private final String acsTransId;
    private final String dsTransId;
    private final String errorCode;
    private final ErrorComponent errorComponent;
    private final String errorDescription;
    private final String errorDetail;
    private final String errorMessageType;
    private final String messageVersion;
    private final SdkTransactionId sdkTransId;
    private final String serverTransId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ErrorData> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ErrorData fromJson$3ds2sdk_release(JSONObject payload) {
            s.g(payload, "payload");
            String optString = payload.optString("threeDSServerTransID");
            String optString2 = payload.optString("acsTransID");
            String optString3 = payload.optString(ErrorData.FIELD_DS_TRANS_ID);
            String optString4 = payload.optString(ErrorData.FIELD_ERROR_CODE);
            s.f(optString4, "payload.optString(FIELD_ERROR_CODE)");
            ErrorComponent fromCode = ErrorComponent.Companion.fromCode(payload.optString(ErrorData.FIELD_ERROR_COMPONENT));
            String optString5 = payload.optString(ErrorData.FIELD_ERROR_DESCRIPTION);
            s.f(optString5, "payload.optString(FIELD_ERROR_DESCRIPTION)");
            String optString6 = payload.optString(ErrorData.FIELD_ERROR_DETAIL);
            s.f(optString6, "payload.optString(FIELD_ERROR_DETAIL)");
            String optString7 = payload.optString(ErrorData.FIELD_ERROR_MESSAGE_TYPE);
            String optString8 = payload.optString("messageVersion");
            s.f(optString8, "payload.optString(FIELD_MESSAGE_VERSION)");
            String optString9 = payload.optString("sdkTransID");
            return new ErrorData(optString, optString2, optString3, optString4, fromCode, optString5, optString6, optString7, optString8, optString9 == null ? null : new SdkTransactionId(optString9));
        }

        public final boolean isErrorMessage$3ds2sdk_release(JSONObject payload) {
            s.g(payload, "payload");
            return s.c(ErrorData.MESSAGE_TYPE, payload.optString("messageType"));
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ErrorData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorData createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new ErrorData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ErrorComponent.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SdkTransactionId.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ErrorData[] newArray(int i11) {
            return new ErrorData[i11];
        }
    }

    /* loaded from: classes6.dex */
    public enum ErrorComponent {
        ThreeDsSdk(Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE),
        ThreeDsServer("S"),
        DirectoryServer("D"),
        Acs("A");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ErrorComponent fromCode(String str) {
                ErrorComponent[] values = ErrorComponent.values();
                int length = values.length;
                int i11 = 0;
                while (i11 < length) {
                    ErrorComponent errorComponent = values[i11];
                    i11++;
                    if (s.c(errorComponent.getCode(), str)) {
                        return errorComponent;
                    }
                }
                return null;
            }
        }

        ErrorComponent(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    public ErrorData(String str, String str2, String str3, String errorCode, ErrorComponent errorComponent, String errorDescription, String errorDetail, String str4, String messageVersion, SdkTransactionId sdkTransactionId) {
        s.g(errorCode, "errorCode");
        s.g(errorDescription, "errorDescription");
        s.g(errorDetail, "errorDetail");
        s.g(messageVersion, "messageVersion");
        this.serverTransId = str;
        this.acsTransId = str2;
        this.dsTransId = str3;
        this.errorCode = errorCode;
        this.errorComponent = errorComponent;
        this.errorDescription = errorDescription;
        this.errorDetail = errorDetail;
        this.errorMessageType = str4;
        this.messageVersion = messageVersion;
        this.sdkTransId = sdkTransactionId;
    }

    public final String component1() {
        return this.serverTransId;
    }

    public final SdkTransactionId component10() {
        return this.sdkTransId;
    }

    public final String component2() {
        return this.acsTransId;
    }

    public final String component3() {
        return this.dsTransId;
    }

    public final String component4() {
        return this.errorCode;
    }

    public final ErrorComponent component5() {
        return this.errorComponent;
    }

    public final String component6() {
        return this.errorDescription;
    }

    public final String component7() {
        return this.errorDetail;
    }

    public final String component8() {
        return this.errorMessageType;
    }

    public final String component9() {
        return this.messageVersion;
    }

    public final ErrorData copy(String str, String str2, String str3, String errorCode, ErrorComponent errorComponent, String errorDescription, String errorDetail, String str4, String messageVersion, SdkTransactionId sdkTransactionId) {
        s.g(errorCode, "errorCode");
        s.g(errorDescription, "errorDescription");
        s.g(errorDetail, "errorDetail");
        s.g(messageVersion, "messageVersion");
        return new ErrorData(str, str2, str3, errorCode, errorComponent, errorDescription, errorDetail, str4, messageVersion, sdkTransactionId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ErrorData) {
            ErrorData errorData = (ErrorData) obj;
            return s.c(this.serverTransId, errorData.serverTransId) && s.c(this.acsTransId, errorData.acsTransId) && s.c(this.dsTransId, errorData.dsTransId) && s.c(this.errorCode, errorData.errorCode) && this.errorComponent == errorData.errorComponent && s.c(this.errorDescription, errorData.errorDescription) && s.c(this.errorDetail, errorData.errorDetail) && s.c(this.errorMessageType, errorData.errorMessageType) && s.c(this.messageVersion, errorData.messageVersion) && s.c(this.sdkTransId, errorData.sdkTransId);
        }
        return false;
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final String getDsTransId() {
        return this.dsTransId;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final ErrorComponent getErrorComponent() {
        return this.errorComponent;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getErrorDetail() {
        return this.errorDetail;
    }

    public final String getErrorMessageType() {
        return this.errorMessageType;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final String getServerTransId() {
        return this.serverTransId;
    }

    public int hashCode() {
        String str = this.serverTransId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsTransId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dsTransId;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.errorCode.hashCode()) * 31;
        ErrorComponent errorComponent = this.errorComponent;
        int hashCode4 = (((((hashCode3 + (errorComponent == null ? 0 : errorComponent.hashCode())) * 31) + this.errorDescription.hashCode()) * 31) + this.errorDetail.hashCode()) * 31;
        String str4 = this.errorMessageType;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.messageVersion.hashCode()) * 31;
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        return hashCode5 + (sdkTransactionId != null ? sdkTransactionId.hashCode() : 0);
    }

    public final JSONObject toJson$3ds2sdk_release() {
        JSONObject json = new JSONObject().put("messageType", MESSAGE_TYPE).put("messageVersion", this.messageVersion).put("sdkTransID", this.sdkTransId).put(FIELD_ERROR_CODE, this.errorCode).put(FIELD_ERROR_DESCRIPTION, this.errorDescription).put(FIELD_ERROR_DETAIL, this.errorDetail);
        String str = this.serverTransId;
        if (str != null) {
            json.put("threeDSServerTransID", str);
        }
        String str2 = this.acsTransId;
        if (str2 != null) {
            json.put("acsTransID", str2);
        }
        String str3 = this.dsTransId;
        if (str3 != null) {
            json.put(FIELD_DS_TRANS_ID, str3);
        }
        ErrorComponent errorComponent = this.errorComponent;
        if (errorComponent != null) {
            json.put(FIELD_ERROR_COMPONENT, errorComponent.getCode());
        }
        String str4 = this.errorMessageType;
        if (str4 != null) {
            json.put(FIELD_ERROR_MESSAGE_TYPE, str4);
        }
        s.f(json, "json");
        return json;
    }

    public String toString() {
        return "ErrorData(serverTransId=" + ((Object) this.serverTransId) + ", acsTransId=" + ((Object) this.acsTransId) + ", dsTransId=" + ((Object) this.dsTransId) + ", errorCode=" + this.errorCode + ", errorComponent=" + this.errorComponent + ", errorDescription=" + this.errorDescription + ", errorDetail=" + this.errorDetail + ", errorMessageType=" + ((Object) this.errorMessageType) + ", messageVersion=" + this.messageVersion + ", sdkTransId=" + this.sdkTransId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.serverTransId);
        out.writeString(this.acsTransId);
        out.writeString(this.dsTransId);
        out.writeString(this.errorCode);
        ErrorComponent errorComponent = this.errorComponent;
        if (errorComponent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(errorComponent.name());
        }
        out.writeString(this.errorDescription);
        out.writeString(this.errorDetail);
        out.writeString(this.errorMessageType);
        out.writeString(this.messageVersion);
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        if (sdkTransactionId == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        sdkTransactionId.writeToParcel(out, i11);
    }

    public /* synthetic */ ErrorData(String str, String str2, String str3, String str4, ErrorComponent errorComponent, String str5, String str6, String str7, String str8, SdkTransactionId sdkTransactionId, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, str4, (i11 & 16) != 0 ? null : errorComponent, str5, str6, (i11 & 128) != 0 ? null : str7, str8, sdkTransactionId);
    }
}