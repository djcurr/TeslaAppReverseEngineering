package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import ezvcard.property.Gender;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class ChallengeRequestData implements Serializable, Parcelable {
    public static final String FIELD_3DS_SERVER_TRANS_ID = "threeDSServerTransID";
    public static final String FIELD_ACS_TRANS_ID = "acsTransID";
    public static final String FIELD_CHALLENGE_CANCEL = "challengeCancel";
    public static final String FIELD_CHALLENGE_DATA_ENTRY = "challengeDataEntry";
    public static final String FIELD_CHALLENGE_HTML_DATA_ENTRY = "challengeHTMLDataEntry";
    public static final String FIELD_MESSAGE_EXTENSION = "messageExtensions";
    public static final String FIELD_MESSAGE_TYPE = "messageType";
    public static final String FIELD_MESSAGE_VERSION = "messageVersion";
    public static final String FIELD_OOB_CONTINUE = "oobContinue";
    public static final String FIELD_RESEND_CHALLENGE = "resendChallenge";
    public static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    public static final String MESSAGE_TYPE = "CReq";
    private final String acsTransId;
    private final CancelReason cancelReason;
    private final String challengeDataEntry;
    private final String challengeHtmlDataEntry;
    private final List<MessageExtension> messageExtensions;
    private final String messageVersion;
    private final Boolean oobContinue;
    private final SdkTransactionId sdkTransId;
    private final Boolean shouldResendChallenge;
    private final String threeDsServerTransId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChallengeRequestData> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public enum CancelReason {
        UserSelected("01"),
        Reserved("02"),
        TransactionTimedOutDecoupled("03"),
        TransactionTimedOutOther("04"),
        TransactionTimedOutFirstCreq("05"),
        TransactionError("06"),
        Unknown("07");
        
        private final String code;

        CancelReason(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ChallengeRequestData> {
        @Override // android.os.Parcelable.Creator
        public final ChallengeRequestData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            s.g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            SdkTransactionId createFromParcel = SdkTransactionId.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            CancelReason valueOf = parcel.readInt() == 0 ? null : CancelReason.valueOf(parcel.readString());
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(MessageExtension.CREATOR.createFromParcel(parcel));
                }
            }
            return new ChallengeRequestData(readString, readString2, readString3, createFromParcel, readString4, valueOf, readString5, arrayList, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0));
        }

        @Override // android.os.Parcelable.Creator
        public final ChallengeRequestData[] newArray(int i11) {
            return new ChallengeRequestData[i11];
        }
    }

    public ChallengeRequestData(String messageVersion, String threeDsServerTransId, String acsTransId, SdkTransactionId sdkTransId, String str, CancelReason cancelReason, String str2, List<MessageExtension> list, Boolean bool, Boolean bool2) {
        s.g(messageVersion, "messageVersion");
        s.g(threeDsServerTransId, "threeDsServerTransId");
        s.g(acsTransId, "acsTransId");
        s.g(sdkTransId, "sdkTransId");
        this.messageVersion = messageVersion;
        this.threeDsServerTransId = threeDsServerTransId;
        this.acsTransId = acsTransId;
        this.sdkTransId = sdkTransId;
        this.challengeDataEntry = str;
        this.cancelReason = cancelReason;
        this.challengeHtmlDataEntry = str2;
        this.messageExtensions = list;
        this.oobContinue = bool;
        this.shouldResendChallenge = bool2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChallengeRequestData copy$default(ChallengeRequestData challengeRequestData, String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, CancelReason cancelReason, String str5, List list, Boolean bool, Boolean bool2, int i11, Object obj) {
        return challengeRequestData.copy((i11 & 1) != 0 ? challengeRequestData.messageVersion : str, (i11 & 2) != 0 ? challengeRequestData.threeDsServerTransId : str2, (i11 & 4) != 0 ? challengeRequestData.acsTransId : str3, (i11 & 8) != 0 ? challengeRequestData.sdkTransId : sdkTransactionId, (i11 & 16) != 0 ? challengeRequestData.challengeDataEntry : str4, (i11 & 32) != 0 ? challengeRequestData.cancelReason : cancelReason, (i11 & 64) != 0 ? challengeRequestData.challengeHtmlDataEntry : str5, (i11 & 128) != 0 ? challengeRequestData.messageExtensions : list, (i11 & 256) != 0 ? challengeRequestData.oobContinue : bool, (i11 & 512) != 0 ? challengeRequestData.shouldResendChallenge : bool2);
    }

    public final String component1() {
        return this.messageVersion;
    }

    public final Boolean component10() {
        return this.shouldResendChallenge;
    }

    public final String component2() {
        return this.threeDsServerTransId;
    }

    public final String component3() {
        return this.acsTransId;
    }

    public final SdkTransactionId component4() {
        return this.sdkTransId;
    }

    public final String component5() {
        return this.challengeDataEntry;
    }

    public final CancelReason component6() {
        return this.cancelReason;
    }

    public final String component7() {
        return this.challengeHtmlDataEntry;
    }

    public final List<MessageExtension> component8() {
        return this.messageExtensions;
    }

    public final Boolean component9() {
        return this.oobContinue;
    }

    public final ChallengeRequestData copy(String messageVersion, String threeDsServerTransId, String acsTransId, SdkTransactionId sdkTransId, String str, CancelReason cancelReason, String str2, List<MessageExtension> list, Boolean bool, Boolean bool2) {
        s.g(messageVersion, "messageVersion");
        s.g(threeDsServerTransId, "threeDsServerTransId");
        s.g(acsTransId, "acsTransId");
        s.g(sdkTransId, "sdkTransId");
        return new ChallengeRequestData(messageVersion, threeDsServerTransId, acsTransId, sdkTransId, str, cancelReason, str2, list, bool, bool2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChallengeRequestData) {
            ChallengeRequestData challengeRequestData = (ChallengeRequestData) obj;
            return s.c(this.messageVersion, challengeRequestData.messageVersion) && s.c(this.threeDsServerTransId, challengeRequestData.threeDsServerTransId) && s.c(this.acsTransId, challengeRequestData.acsTransId) && s.c(this.sdkTransId, challengeRequestData.sdkTransId) && s.c(this.challengeDataEntry, challengeRequestData.challengeDataEntry) && this.cancelReason == challengeRequestData.cancelReason && s.c(this.challengeHtmlDataEntry, challengeRequestData.challengeHtmlDataEntry) && s.c(this.messageExtensions, challengeRequestData.messageExtensions) && s.c(this.oobContinue, challengeRequestData.oobContinue) && s.c(this.shouldResendChallenge, challengeRequestData.shouldResendChallenge);
        }
        return false;
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final CancelReason getCancelReason() {
        return this.cancelReason;
    }

    public final String getChallengeDataEntry() {
        return this.challengeDataEntry;
    }

    public final String getChallengeHtmlDataEntry() {
        return this.challengeHtmlDataEntry;
    }

    public final List<MessageExtension> getMessageExtensions() {
        return this.messageExtensions;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final Boolean getOobContinue() {
        return this.oobContinue;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final Boolean getShouldResendChallenge() {
        return this.shouldResendChallenge;
    }

    public final String getThreeDsServerTransId() {
        return this.threeDsServerTransId;
    }

    public int hashCode() {
        int hashCode = ((((((this.messageVersion.hashCode() * 31) + this.threeDsServerTransId.hashCode()) * 31) + this.acsTransId.hashCode()) * 31) + this.sdkTransId.hashCode()) * 31;
        String str = this.challengeDataEntry;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CancelReason cancelReason = this.cancelReason;
        int hashCode3 = (hashCode2 + (cancelReason == null ? 0 : cancelReason.hashCode())) * 31;
        String str2 = this.challengeHtmlDataEntry;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<MessageExtension> list = this.messageExtensions;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.oobContinue;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldResendChallenge;
        return hashCode6 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final ChallengeRequestData sanitize$3ds2sdk_release() {
        return copy$default(this, null, null, null, null, null, null, null, null, null, null, 943, null);
    }

    public final JSONObject toJson$3ds2sdk_release() {
        try {
            q.a aVar = q.f54772b;
            JSONObject json = new JSONObject().put(FIELD_MESSAGE_TYPE, MESSAGE_TYPE).put(FIELD_MESSAGE_VERSION, getMessageVersion()).put(FIELD_SDK_TRANS_ID, getSdkTransId().getValue()).put(FIELD_3DS_SERVER_TRANS_ID, getThreeDsServerTransId()).put(FIELD_ACS_TRANS_ID, getAcsTransId());
            if (getCancelReason() != null) {
                json.put(FIELD_CHALLENGE_CANCEL, getCancelReason().getCode());
            }
            if (getChallengeDataEntry() != null) {
                json.put(FIELD_CHALLENGE_DATA_ENTRY, getChallengeDataEntry());
            }
            if (getChallengeHtmlDataEntry() != null) {
                json.put(FIELD_CHALLENGE_HTML_DATA_ENTRY, getChallengeHtmlDataEntry());
            }
            JSONArray jsonArray = MessageExtension.Companion.toJsonArray(getMessageExtensions());
            if (jsonArray != null) {
                json.put(FIELD_MESSAGE_EXTENSION, jsonArray);
            }
            if (getOobContinue() != null) {
                json.put(FIELD_OOB_CONTINUE, getOobContinue().booleanValue());
            }
            if (getShouldResendChallenge() != null) {
                json.put(FIELD_RESEND_CHALLENGE, getShouldResendChallenge().booleanValue() ? "Y" : Gender.NONE);
            }
            s.f(json, "json");
            return json;
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            Throwable e11 = q.e(q.b(r.a(th2)));
            if (e11 == null) {
                throw new KotlinNothingValueException();
            }
            throw new SDKRuntimeException(e11);
        }
    }

    public String toString() {
        return "ChallengeRequestData(messageVersion=" + this.messageVersion + ", threeDsServerTransId=" + this.threeDsServerTransId + ", acsTransId=" + this.acsTransId + ", sdkTransId=" + this.sdkTransId + ", challengeDataEntry=" + ((Object) this.challengeDataEntry) + ", cancelReason=" + this.cancelReason + ", challengeHtmlDataEntry=" + ((Object) this.challengeHtmlDataEntry) + ", messageExtensions=" + this.messageExtensions + ", oobContinue=" + this.oobContinue + ", shouldResendChallenge=" + this.shouldResendChallenge + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.messageVersion);
        out.writeString(this.threeDsServerTransId);
        out.writeString(this.acsTransId);
        this.sdkTransId.writeToParcel(out, i11);
        out.writeString(this.challengeDataEntry);
        CancelReason cancelReason = this.cancelReason;
        if (cancelReason == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cancelReason.name());
        }
        out.writeString(this.challengeHtmlDataEntry);
        List<MessageExtension> list = this.messageExtensions;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (MessageExtension messageExtension : list) {
                messageExtension.writeToParcel(out, i11);
            }
        }
        Boolean bool = this.oobContinue;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.shouldResendChallenge;
        if (bool2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(bool2.booleanValue() ? 1 : 0);
    }

    public /* synthetic */ ChallengeRequestData(String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, CancelReason cancelReason, String str5, List list, Boolean bool, Boolean bool2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, sdkTransactionId, (i11 & 16) != 0 ? null : str4, (i11 & 32) != 0 ? null : cancelReason, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : list, (i11 & 256) != 0 ? null : bool, (i11 & 512) != 0 ? null : bool2);
    }
}