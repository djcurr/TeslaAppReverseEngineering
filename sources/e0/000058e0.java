package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import kotlin.text.v;
import org.json.JSONArray;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.q;
import vz.r;
import wz.e0;
import wz.w;
import wz.x0;

/* loaded from: classes6.dex */
public final class ChallengeResponseData implements Parcelable {
    private static final String FIELD_ACS_COUNTER_ACS_TO_SDK = "acsCounterAtoS";
    private static final String FIELD_ACS_HTML = "acsHTML";
    private static final String FIELD_ACS_HTML_REFRESH = "acsHTMLRefresh";
    private static final String FIELD_ACS_TRANS_ID = "acsTransID";
    private static final String FIELD_ACS_UI_TYPE = "acsUiType";
    private static final String FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT = "challengeAddInfo";
    private static final String FIELD_CHALLENGE_COMPLETION_INDICATOR = "challengeCompletionInd";
    private static final String FIELD_CHALLENGE_INFO_HEADER = "challengeInfoHeader";
    private static final String FIELD_CHALLENGE_INFO_LABEL = "challengeInfoLabel";
    private static final String FIELD_CHALLENGE_INFO_TEXT = "challengeInfoText";
    private static final String FIELD_CHALLENGE_INFO_TEXT_INDICATOR = "challengeInfoTextIndicator";
    private static final String FIELD_CHALLENGE_SELECT_INFO = "challengeSelectInfo";
    private static final String FIELD_EXPAND_INFO_LABEL = "expandInfoLabel";
    private static final String FIELD_EXPAND_INFO_TEXT = "expandInfoText";
    private static final String FIELD_ISSUER_IMAGE = "issuerImage";
    private static final String FIELD_MESSAGE_EXTENSION = "messageExtension";
    private static final String FIELD_MESSAGE_TYPE = "messageType";
    private static final String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final String FIELD_OOB_APP_LABEL = "oobAppLabel";
    private static final String FIELD_OOB_APP_URL = "oobAppURL";
    private static final String FIELD_OOB_CONTINUE_LABEL = "oobContinueLabel";
    private static final String FIELD_PAYMENT_SYSTEM_IMAGE = "psImage";
    private static final String FIELD_RESEND_INFORMATION_LABEL = "resendInformationLabel";
    private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final String FIELD_SERVER_TRANS_ID = "threeDSServerTransID";
    private static final String FIELD_SUBMIT_AUTHENTICATION_LABEL = "submitAuthenticationLabel";
    private static final String FIELD_TRANS_STATUS = "transStatus";
    private static final String FIELD_WHITELISTING_INFO_TEXT = "whitelistingInfoText";
    private static final String FIELD_WHY_INFO_LABEL = "whyInfoLabel";
    private static final String FIELD_WHY_INFO_TEXT = "whyInfoText";
    private static final Set<String> FINAL_CRES_FIELDS;
    public static final String MESSAGE_TYPE = "CRes";
    private static final String NO_VALUE = "N";
    private static final List<String> YES_NO_VALUES;
    private static final String YES_VALUE = "Y";
    private final String acsHtml;
    private final String acsHtmlRefresh;
    private final String acsTransId;
    private final String challengeAdditionalInfoText;
    private final String challengeInfoHeader;
    private final String challengeInfoLabel;
    private final String challengeInfoText;
    private final List<ChallengeSelectOption> challengeSelectOptions;
    private final String expandInfoLabel;
    private final String expandInfoText;
    private final boolean isChallengeCompleted;
    private final Image issuerImage;
    private final List<MessageExtension> messageExtensions;
    private final String messageVersion;
    private final String oobAppLabel;
    private final String oobAppUrl;
    private final String oobContinueLabel;
    private final Image paymentSystemImage;
    private final String resendInformationLabel;
    private final SdkTransactionId sdkTransId;
    private final String serverTransId;
    private final boolean shouldShowChallengeInfoTextIndicator;
    private final String submitAuthenticationLabel;
    private final String transStatus;
    private final UiType uiType;
    private final String whitelistingInfoText;
    private final String whyInfoLabel;
    private final String whyInfoText;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ChallengeResponseData> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public static final class ChallengeSelectOption implements Parcelable {
        private final String name;
        private final String text;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<ChallengeSelectOption> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final List<ChallengeSelectOption> fromJson$3ds2sdk_release(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                int length = jSONArray.length();
                while (i11 < length) {
                    int i12 = i11 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                    if (optJSONObject != null) {
                        String name = optJSONObject.keys().next();
                        String text = optJSONObject.optString(name);
                        s.f(name, "name");
                        s.f(text, "text");
                        arrayList.add(new ChallengeSelectOption(name, text));
                    }
                    i11 = i12;
                }
                return arrayList;
            }

            public final JSONArray toJsonArray$3ds2sdk_release(List<ChallengeSelectOption> list) {
                if (list == null) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray();
                for (ChallengeSelectOption challengeSelectOption : list) {
                    jSONArray.put(challengeSelectOption.toJson());
                }
                return jSONArray;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<ChallengeSelectOption> {
            @Override // android.os.Parcelable.Creator
            public final ChallengeSelectOption createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new ChallengeSelectOption(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ChallengeSelectOption[] newArray(int i11) {
                return new ChallengeSelectOption[i11];
            }
        }

        public ChallengeSelectOption(String name, String text) {
            s.g(name, "name");
            s.g(text, "text");
            this.name = name;
            this.text = text;
        }

        public static /* synthetic */ ChallengeSelectOption copy$default(ChallengeSelectOption challengeSelectOption, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = challengeSelectOption.name;
            }
            if ((i11 & 2) != 0) {
                str2 = challengeSelectOption.text;
            }
            return challengeSelectOption.copy(str, str2);
        }

        public final JSONObject toJson() {
            JSONObject put = new JSONObject().put(this.name, this.text);
            s.f(put, "JSONObject()\n                .put(name, text)");
            return put;
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.text;
        }

        public final ChallengeSelectOption copy(String name, String text) {
            s.g(name, "name");
            s.g(text, "text");
            return new ChallengeSelectOption(name, text);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ChallengeSelectOption) {
                ChallengeSelectOption challengeSelectOption = (ChallengeSelectOption) obj;
                return s.c(this.name, challengeSelectOption.name) && s.c(this.text, challengeSelectOption.text);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.text.hashCode();
        }

        public String toString() {
            return "ChallengeSelectOption(name=" + this.name + ", text=" + this.text + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.name);
            out.writeString(this.text);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String decodeHtml(String str) {
            Object b11;
            if (str == null) {
                return null;
            }
            Companion companion = ChallengeResponseData.Companion;
            try {
                q.a aVar = q.f54772b;
                byte[] decode = Base64.decode(str, 8);
                s.f(decode, "decode(encodedHtml, Base64.URL_SAFE)");
                b11 = q.b(new String(decode, d.f35187b));
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th2));
            }
            return q.g(b11) ? null : b11;
        }

        private final String getOrNull(JSONObject jSONObject, String str) {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }

        public final void checkFinalCresFields$3ds2sdk_release(JSONObject cresJson) {
            s.g(cresJson, "cresJson");
            Iterator<String> keys = cresJson.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!ChallengeResponseData.FINAL_CRES_FIELDS.contains(next)) {
                    throw new ChallengeResponseParseException(ProtocolError.InvalidMessageReceived.getCode(), "Message is not final CRes", s.p("Invalid data element for final CRes: ", next));
                }
            }
        }

        public final void checkMessageType$3ds2sdk_release(JSONObject cresJson) {
            s.g(cresJson, "cresJson");
            if (!s.c(ChallengeResponseData.MESSAGE_TYPE, cresJson.optString("messageType"))) {
                throw new ChallengeResponseParseException(ProtocolError.InvalidMessageReceived.getCode(), "Message is not CRes", "Invalid Message Type");
            }
        }

        public final ChallengeResponseData fromJson$3ds2sdk_release(JSONObject cresJson) {
            ChallengeResponseData challengeResponseData;
            s.g(cresJson, "cresJson");
            checkMessageType$3ds2sdk_release(cresJson);
            boolean yesNoValue$3ds2sdk_release = getYesNoValue$3ds2sdk_release(cresJson, ChallengeResponseData.FIELD_CHALLENGE_COMPLETION_INDICATOR, true);
            SdkTransactionId sdkTransactionId = new SdkTransactionId(getTransactionId$3ds2sdk_release(cresJson, "sdkTransID"));
            String uuid = getTransactionId$3ds2sdk_release(cresJson, "threeDSServerTransID").toString();
            s.f(uuid, "getTransactionId(cresJso…RVER_TRANS_ID).toString()");
            String uuid2 = getTransactionId$3ds2sdk_release(cresJson, "acsTransID").toString();
            s.f(uuid2, "getTransactionId(cresJso…_ACS_TRANS_ID).toString()");
            String messageVersion$3ds2sdk_release = getMessageVersion$3ds2sdk_release(cresJson);
            List<MessageExtension> messageExtensions$3ds2sdk_release = getMessageExtensions$3ds2sdk_release(cresJson);
            if (yesNoValue$3ds2sdk_release) {
                checkFinalCresFields$3ds2sdk_release(cresJson);
                challengeResponseData = new ChallengeResponseData(uuid, uuid2, null, null, null, yesNoValue$3ds2sdk_release, null, null, null, null, false, null, null, null, null, messageExtensions$3ds2sdk_release, messageVersion$3ds2sdk_release, null, null, null, null, null, sdkTransactionId, null, null, null, null, getTransStatus$3ds2sdk_release(cresJson).getCode(), 129925084, null);
            } else {
                boolean yesNoValue$3ds2sdk_release2 = getYesNoValue$3ds2sdk_release(cresJson, ChallengeResponseData.FIELD_CHALLENGE_INFO_TEXT_INDICATOR, false);
                String resendInformationLabel$3ds2sdk_release = getResendInformationLabel$3ds2sdk_release(cresJson);
                JSONArray challengeSelectInfoArray$3ds2sdk_release = getChallengeSelectInfoArray$3ds2sdk_release(cresJson);
                UiType uiType$3ds2sdk_release = getUiType$3ds2sdk_release(cresJson);
                String submitAuthenticationLabel$3ds2sdk_release = getSubmitAuthenticationLabel$3ds2sdk_release(cresJson, uiType$3ds2sdk_release);
                String decodedAcsHtml$3ds2sdk_release = getDecodedAcsHtml$3ds2sdk_release(cresJson, uiType$3ds2sdk_release);
                String oobContinueLabel$3ds2sdk_release = getOobContinueLabel$3ds2sdk_release(cresJson, uiType$3ds2sdk_release);
                List<ChallengeSelectOption> fromJson$3ds2sdk_release = ChallengeSelectOption.Companion.fromJson$3ds2sdk_release(challengeSelectInfoArray$3ds2sdk_release);
                String decodeHtml = decodeHtml(cresJson.optString(ChallengeResponseData.FIELD_ACS_HTML_REFRESH));
                String optString = cresJson.optString(ChallengeResponseData.FIELD_CHALLENGE_INFO_HEADER);
                String optString2 = cresJson.optString(ChallengeResponseData.FIELD_CHALLENGE_INFO_LABEL);
                String optString3 = cresJson.optString(ChallengeResponseData.FIELD_CHALLENGE_INFO_TEXT);
                String optString4 = cresJson.optString(ChallengeResponseData.FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT);
                String optString5 = cresJson.optString(ChallengeResponseData.FIELD_EXPAND_INFO_LABEL);
                String optString6 = cresJson.optString(ChallengeResponseData.FIELD_EXPAND_INFO_TEXT);
                Image.Companion companion = Image.Companion;
                challengeResponseData = new ChallengeResponseData(uuid, uuid2, decodedAcsHtml$3ds2sdk_release, decodeHtml, uiType$3ds2sdk_release, yesNoValue$3ds2sdk_release, optString, optString2, optString3, optString4, yesNoValue$3ds2sdk_release2, fromJson$3ds2sdk_release, optString5, optString6, companion.fromJson$3ds2sdk_release(cresJson.optJSONObject(ChallengeResponseData.FIELD_ISSUER_IMAGE)), messageExtensions$3ds2sdk_release, messageVersion$3ds2sdk_release, cresJson.optString(ChallengeResponseData.FIELD_OOB_APP_URL), cresJson.optString(ChallengeResponseData.FIELD_OOB_APP_LABEL), oobContinueLabel$3ds2sdk_release, companion.fromJson$3ds2sdk_release(cresJson.optJSONObject(ChallengeResponseData.FIELD_PAYMENT_SYSTEM_IMAGE)), resendInformationLabel$3ds2sdk_release, sdkTransactionId, submitAuthenticationLabel$3ds2sdk_release, cresJson.optString(ChallengeResponseData.FIELD_WHITELISTING_INFO_TEXT), cresJson.optString(ChallengeResponseData.FIELD_WHY_INFO_LABEL), cresJson.optString(ChallengeResponseData.FIELD_WHY_INFO_TEXT), "");
            }
            if (challengeResponseData.isValidForUi$3ds2sdk_release()) {
                return challengeResponseData;
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing("UI fields missing");
        }

        public final JSONArray getChallengeSelectInfoArray$3ds2sdk_release(JSONObject cresJson) {
            Object b11;
            s.g(cresJson, "cresJson");
            if (!cresJson.has(ChallengeResponseData.FIELD_CHALLENGE_SELECT_INFO)) {
                cresJson = null;
            }
            if (cresJson == null) {
                return null;
            }
            Companion companion = ChallengeResponseData.Companion;
            try {
                q.a aVar = q.f54772b;
                b11 = q.b(cresJson.getJSONArray(ChallengeResponseData.FIELD_CHALLENGE_SELECT_INFO));
            } catch (Throwable th2) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th2));
            }
            if (q.e(b11) == null) {
                return (JSONArray) b11;
            }
            throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeResponseData.FIELD_CHALLENGE_SELECT_INFO);
        }

        public final String getDecodedAcsHtml$3ds2sdk_release(JSONObject cresJson, UiType uiType) {
            boolean z11;
            boolean w11;
            s.g(cresJson, "cresJson");
            s.g(uiType, "uiType");
            String orNull = getOrNull(cresJson, ChallengeResponseData.FIELD_ACS_HTML);
            if (orNull != null) {
                w11 = v.w(orNull);
                if (!w11) {
                    z11 = false;
                    if (!z11 && uiType == UiType.Html) {
                        throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_ACS_HTML);
                    }
                    return decodeHtml(orNull);
                }
            }
            z11 = true;
            if (!z11) {
            }
            return decodeHtml(orNull);
        }

        public final List<MessageExtension> getMessageExtensions$3ds2sdk_release(JSONObject cresJson) {
            String l02;
            s.g(cresJson, "cresJson");
            List<MessageExtension> fromJson = MessageExtension.Companion.fromJson(cresJson.optJSONArray(ChallengeResponseData.FIELD_MESSAGE_EXTENSION));
            if (fromJson != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = fromJson.iterator();
                while (true) {
                    boolean z11 = true;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    MessageExtension messageExtension = (MessageExtension) next;
                    if ((!messageExtension.getCriticalityIndicator() || messageExtension.isProcessable()) ? false : false) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ProtocolError protocolError = ProtocolError.UnrecognizedCriticalMessageExtensions;
                    l02 = e0.l0(arrayList, ",", null, null, 0, null, null, 62, null);
                    throw new ChallengeResponseParseException(protocolError, l02);
                }
            }
            return fromJson;
        }

        public final String getMessageVersion$3ds2sdk_release(JSONObject cresJson) {
            boolean w11;
            s.g(cresJson, "cresJson");
            String it2 = cresJson.optString("messageVersion");
            s.f(it2, "it");
            w11 = v.w(it2);
            if (!(!w11)) {
                it2 = null;
            }
            if (it2 != null) {
                return it2;
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing("messageVersion");
        }

        public final String getOobContinueLabel$3ds2sdk_release(JSONObject cresJson, UiType uiType) {
            boolean z11;
            boolean w11;
            s.g(cresJson, "cresJson");
            s.g(uiType, "uiType");
            String optString = cresJson.optString(ChallengeResponseData.FIELD_OOB_CONTINUE_LABEL);
            if (optString != null) {
                w11 = v.w(optString);
                if (!w11) {
                    z11 = false;
                    if (z11 || uiType != UiType.OutOfBand) {
                        return optString;
                    }
                    throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_OOB_CONTINUE_LABEL);
                }
            }
            z11 = true;
            if (z11) {
            }
            return optString;
        }

        public final String getResendInformationLabel$3ds2sdk_release(JSONObject cresJson) {
            s.g(cresJson, "cresJson");
            String orNull = getOrNull(cresJson, ChallengeResponseData.FIELD_RESEND_INFORMATION_LABEL);
            if (orNull != null) {
                if (orNull.length() == 0) {
                    throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeResponseData.FIELD_RESEND_INFORMATION_LABEL);
                }
            }
            return orNull;
        }

        public final String getSubmitAuthenticationLabel$3ds2sdk_release(JSONObject cresJson, UiType uiType) {
            boolean z11;
            boolean w11;
            s.g(cresJson, "cresJson");
            s.g(uiType, "uiType");
            String orNull = getOrNull(cresJson, ChallengeResponseData.FIELD_SUBMIT_AUTHENTICATION_LABEL);
            if (orNull != null) {
                w11 = v.w(orNull);
                if (!w11) {
                    z11 = false;
                    if (z11 || !uiType.getRequiresSubmitButton$3ds2sdk_release()) {
                        return orNull;
                    }
                    throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_SUBMIT_AUTHENTICATION_LABEL);
                }
            }
            z11 = true;
            if (z11) {
            }
            return orNull;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.stripe.android.stripe3ds2.transaction.TransactionStatus getTransStatus$3ds2sdk_release(org.json.JSONObject r3) {
            /*
                r2 = this;
                java.lang.String r0 = "cresJson"
                kotlin.jvm.internal.s.g(r3, r0)
                java.lang.String r0 = "transStatus"
                java.lang.String r3 = r3.optString(r0)
                if (r3 == 0) goto L16
                boolean r1 = kotlin.text.m.w(r3)
                if (r1 == 0) goto L14
                goto L16
            L14:
                r1 = 0
                goto L17
            L16:
                r1 = 1
            L17:
                if (r1 != 0) goto L29
                com.stripe.android.stripe3ds2.transaction.TransactionStatus$Companion r1 = com.stripe.android.stripe3ds2.transaction.TransactionStatus.Companion
                com.stripe.android.stripe3ds2.transaction.TransactionStatus r3 = r1.fromCode(r3)
                if (r3 == 0) goto L22
                return r3
            L22:
                com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException$Companion r3 = com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException.Companion
                com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException r3 = r3.createInvalidDataElementFormat(r0)
                throw r3
            L29:
                com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException$Companion r3 = com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException.Companion
                com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException r3 = r3.createRequiredDataElementMissing(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.Companion.getTransStatus$3ds2sdk_release(org.json.JSONObject):com.stripe.android.stripe3ds2.transaction.TransactionStatus");
        }

        /* JADX WARN: Removed duplicated region for block: B:42:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x001c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.UUID getTransactionId$3ds2sdk_release(org.json.JSONObject r2, java.lang.String r3) {
            /*
                r1 = this;
                java.lang.String r0 = "cresJson"
                kotlin.jvm.internal.s.g(r2, r0)
                java.lang.String r0 = "fieldName"
                kotlin.jvm.internal.s.g(r3, r0)
                java.lang.String r2 = r2.optString(r3)
                if (r2 == 0) goto L19
                boolean r0 = kotlin.text.m.w(r2)
                if (r0 == 0) goto L17
                goto L19
            L17:
                r0 = 0
                goto L1a
            L19:
                r0 = 1
            L1a:
                if (r0 != 0) goto L46
                vz.q$a r0 = vz.q.f54772b     // Catch: java.lang.Throwable -> L28
                java.util.UUID r2 = java.util.UUID.fromString(r2)     // Catch: java.lang.Throwable -> L28
                java.lang.String r0 = "fromString(transId)"
                kotlin.jvm.internal.s.f(r2, r0)     // Catch: java.lang.Throwable -> L28
                return r2
            L28:
                r2 = move-exception
                vz.q$a r0 = vz.q.f54772b
                java.lang.Object r2 = vz.r.a(r2)
                java.lang.Object r2 = vz.q.b(r2)
                java.lang.Throwable r2 = vz.q.e(r2)
                if (r2 != 0) goto L3f
                kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
                r2.<init>()
                throw r2
            L3f:
                com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException$Companion r2 = com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException.Companion
                com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException r2 = r2.createInvalidDataElementFormat(r3)
                throw r2
            L46:
                com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException$Companion r2 = com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException.Companion
                com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException r2 = r2.createRequiredDataElementMissing(r3)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.Companion.getTransactionId$3ds2sdk_release(org.json.JSONObject, java.lang.String):java.util.UUID");
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0019  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0029  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final com.stripe.android.stripe3ds2.transactions.UiType getUiType$3ds2sdk_release(org.json.JSONObject r3) {
            /*
                r2 = this;
                java.lang.String r0 = "cresJson"
                kotlin.jvm.internal.s.g(r3, r0)
                java.lang.String r0 = "acsUiType"
                java.lang.String r3 = r3.optString(r0)
                if (r3 == 0) goto L16
                boolean r1 = kotlin.text.m.w(r3)
                if (r1 == 0) goto L14
                goto L16
            L14:
                r1 = 0
                goto L17
            L16:
                r1 = 1
            L17:
                if (r1 != 0) goto L29
                com.stripe.android.stripe3ds2.transactions.UiType$Companion r1 = com.stripe.android.stripe3ds2.transactions.UiType.Companion
                com.stripe.android.stripe3ds2.transactions.UiType r3 = r1.fromCode$3ds2sdk_release(r3)
                if (r3 == 0) goto L22
                return r3
            L22:
                com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException$Companion r3 = com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException.Companion
                com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException r3 = r3.createInvalidDataElementFormat(r0)
                throw r3
            L29:
                com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException$Companion r3 = com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException.Companion
                com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException r3 = r3.createRequiredDataElementMissing(r0)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.Companion.getUiType$3ds2sdk_release(org.json.JSONObject):com.stripe.android.stripe3ds2.transactions.UiType");
        }

        public final boolean getYesNoValue$3ds2sdk_release(JSONObject cresJson, String fieldName, boolean z11) {
            String orNull;
            boolean w11;
            s.g(cresJson, "cresJson");
            s.g(fieldName, "fieldName");
            if (z11) {
                if (cresJson.has(fieldName)) {
                    orNull = cresJson.getString(fieldName);
                } else {
                    throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(fieldName);
                }
            } else {
                orNull = getOrNull(cresJson, fieldName);
            }
            if (orNull != null && !ChallengeResponseData.YES_NO_VALUES.contains(orNull)) {
                if (z11) {
                    w11 = v.w(orNull);
                    if (w11) {
                        throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(fieldName);
                    }
                }
                throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(fieldName);
            }
            return s.c(ChallengeResponseData.YES_VALUE, orNull);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ChallengeResponseData> {
        @Override // android.os.Parcelable.Creator
        public final ChallengeResponseData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            s.g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            UiType valueOf = parcel.readInt() == 0 ? null : UiType.valueOf(parcel.readString());
            boolean z11 = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(ChallengeSelectOption.CREATOR.createFromParcel(parcel));
                }
            }
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            Image createFromParcel = parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                int i12 = 0;
                while (i12 != readInt2) {
                    arrayList3.add(MessageExtension.CREATOR.createFromParcel(parcel));
                    i12++;
                    readInt2 = readInt2;
                }
                arrayList2 = arrayList3;
            }
            return new ChallengeResponseData(readString, readString2, readString3, readString4, valueOf, z11, readString5, readString6, readString7, readString8, z12, arrayList, readString9, readString10, createFromParcel, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Image.CREATOR.createFromParcel(parcel), parcel.readString(), SdkTransactionId.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ChallengeResponseData[] newArray(int i11) {
            return new ChallengeResponseData[i11];
        }
    }

    static {
        List<String> l11;
        Set<String> i11;
        l11 = w.l(YES_VALUE, "N");
        YES_NO_VALUES = l11;
        i11 = x0.i("threeDSServerTransID", "acsCounterAtoS", "acsTransID", FIELD_CHALLENGE_COMPLETION_INDICATOR, FIELD_MESSAGE_EXTENSION, "messageType", "messageVersion", "sdkTransID", FIELD_TRANS_STATUS);
        FINAL_CRES_FIELDS = i11;
    }

    public ChallengeResponseData(String serverTransId, String acsTransId, String str, String str2, UiType uiType, boolean z11, String str3, String str4, String str5, String str6, boolean z12, List<ChallengeSelectOption> list, String str7, String str8, Image image, List<MessageExtension> list2, String messageVersion, String str9, String str10, String str11, Image image2, String str12, SdkTransactionId sdkTransId, String str13, String str14, String str15, String str16, String str17) {
        s.g(serverTransId, "serverTransId");
        s.g(acsTransId, "acsTransId");
        s.g(messageVersion, "messageVersion");
        s.g(sdkTransId, "sdkTransId");
        this.serverTransId = serverTransId;
        this.acsTransId = acsTransId;
        this.acsHtml = str;
        this.acsHtmlRefresh = str2;
        this.uiType = uiType;
        this.isChallengeCompleted = z11;
        this.challengeInfoHeader = str3;
        this.challengeInfoLabel = str4;
        this.challengeInfoText = str5;
        this.challengeAdditionalInfoText = str6;
        this.shouldShowChallengeInfoTextIndicator = z12;
        this.challengeSelectOptions = list;
        this.expandInfoLabel = str7;
        this.expandInfoText = str8;
        this.issuerImage = image;
        this.messageExtensions = list2;
        this.messageVersion = messageVersion;
        this.oobAppUrl = str9;
        this.oobAppLabel = str10;
        this.oobContinueLabel = str11;
        this.paymentSystemImage = image2;
        this.resendInformationLabel = str12;
        this.sdkTransId = sdkTransId;
        this.submitAuthenticationLabel = str13;
        this.whitelistingInfoText = str14;
        this.whyInfoLabel = str15;
        this.whyInfoText = str16;
        this.transStatus = str17;
    }

    public final String component1() {
        return this.serverTransId;
    }

    public final String component10() {
        return this.challengeAdditionalInfoText;
    }

    public final boolean component11() {
        return this.shouldShowChallengeInfoTextIndicator;
    }

    public final List<ChallengeSelectOption> component12() {
        return this.challengeSelectOptions;
    }

    public final String component13() {
        return this.expandInfoLabel;
    }

    public final String component14() {
        return this.expandInfoText;
    }

    public final Image component15() {
        return this.issuerImage;
    }

    public final List<MessageExtension> component16() {
        return this.messageExtensions;
    }

    public final String component17() {
        return this.messageVersion;
    }

    public final String component18() {
        return this.oobAppUrl;
    }

    public final String component19() {
        return this.oobAppLabel;
    }

    public final String component2() {
        return this.acsTransId;
    }

    public final String component20() {
        return this.oobContinueLabel;
    }

    public final Image component21() {
        return this.paymentSystemImage;
    }

    public final String component22() {
        return this.resendInformationLabel;
    }

    public final SdkTransactionId component23() {
        return this.sdkTransId;
    }

    public final String component24() {
        return this.submitAuthenticationLabel;
    }

    public final String component25() {
        return this.whitelistingInfoText;
    }

    public final String component26() {
        return this.whyInfoLabel;
    }

    public final String component27() {
        return this.whyInfoText;
    }

    public final String component28() {
        return this.transStatus;
    }

    public final String component3() {
        return this.acsHtml;
    }

    public final String component4() {
        return this.acsHtmlRefresh;
    }

    public final UiType component5() {
        return this.uiType;
    }

    public final boolean component6() {
        return this.isChallengeCompleted;
    }

    public final String component7() {
        return this.challengeInfoHeader;
    }

    public final String component8() {
        return this.challengeInfoLabel;
    }

    public final String component9() {
        return this.challengeInfoText;
    }

    public final ChallengeResponseData copy(String serverTransId, String acsTransId, String str, String str2, UiType uiType, boolean z11, String str3, String str4, String str5, String str6, boolean z12, List<ChallengeSelectOption> list, String str7, String str8, Image image, List<MessageExtension> list2, String messageVersion, String str9, String str10, String str11, Image image2, String str12, SdkTransactionId sdkTransId, String str13, String str14, String str15, String str16, String str17) {
        s.g(serverTransId, "serverTransId");
        s.g(acsTransId, "acsTransId");
        s.g(messageVersion, "messageVersion");
        s.g(sdkTransId, "sdkTransId");
        return new ChallengeResponseData(serverTransId, acsTransId, str, str2, uiType, z11, str3, str4, str5, str6, z12, list, str7, str8, image, list2, messageVersion, str9, str10, str11, image2, str12, sdkTransId, str13, str14, str15, str16, str17);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChallengeResponseData) {
            ChallengeResponseData challengeResponseData = (ChallengeResponseData) obj;
            return s.c(this.serverTransId, challengeResponseData.serverTransId) && s.c(this.acsTransId, challengeResponseData.acsTransId) && s.c(this.acsHtml, challengeResponseData.acsHtml) && s.c(this.acsHtmlRefresh, challengeResponseData.acsHtmlRefresh) && this.uiType == challengeResponseData.uiType && this.isChallengeCompleted == challengeResponseData.isChallengeCompleted && s.c(this.challengeInfoHeader, challengeResponseData.challengeInfoHeader) && s.c(this.challengeInfoLabel, challengeResponseData.challengeInfoLabel) && s.c(this.challengeInfoText, challengeResponseData.challengeInfoText) && s.c(this.challengeAdditionalInfoText, challengeResponseData.challengeAdditionalInfoText) && this.shouldShowChallengeInfoTextIndicator == challengeResponseData.shouldShowChallengeInfoTextIndicator && s.c(this.challengeSelectOptions, challengeResponseData.challengeSelectOptions) && s.c(this.expandInfoLabel, challengeResponseData.expandInfoLabel) && s.c(this.expandInfoText, challengeResponseData.expandInfoText) && s.c(this.issuerImage, challengeResponseData.issuerImage) && s.c(this.messageExtensions, challengeResponseData.messageExtensions) && s.c(this.messageVersion, challengeResponseData.messageVersion) && s.c(this.oobAppUrl, challengeResponseData.oobAppUrl) && s.c(this.oobAppLabel, challengeResponseData.oobAppLabel) && s.c(this.oobContinueLabel, challengeResponseData.oobContinueLabel) && s.c(this.paymentSystemImage, challengeResponseData.paymentSystemImage) && s.c(this.resendInformationLabel, challengeResponseData.resendInformationLabel) && s.c(this.sdkTransId, challengeResponseData.sdkTransId) && s.c(this.submitAuthenticationLabel, challengeResponseData.submitAuthenticationLabel) && s.c(this.whitelistingInfoText, challengeResponseData.whitelistingInfoText) && s.c(this.whyInfoLabel, challengeResponseData.whyInfoLabel) && s.c(this.whyInfoText, challengeResponseData.whyInfoText) && s.c(this.transStatus, challengeResponseData.transStatus);
        }
        return false;
    }

    public final String getAcsHtml() {
        return this.acsHtml;
    }

    public final String getAcsHtmlRefresh() {
        return this.acsHtmlRefresh;
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final String getChallengeAdditionalInfoText() {
        return this.challengeAdditionalInfoText;
    }

    public final String getChallengeInfoHeader() {
        return this.challengeInfoHeader;
    }

    public final String getChallengeInfoLabel() {
        return this.challengeInfoLabel;
    }

    public final String getChallengeInfoText() {
        return this.challengeInfoText;
    }

    public final List<ChallengeSelectOption> getChallengeSelectOptions() {
        return this.challengeSelectOptions;
    }

    public final String getExpandInfoLabel() {
        return this.expandInfoLabel;
    }

    public final String getExpandInfoText() {
        return this.expandInfoText;
    }

    public final Image getIssuerImage() {
        return this.issuerImage;
    }

    public final List<MessageExtension> getMessageExtensions() {
        return this.messageExtensions;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final String getOobAppLabel() {
        return this.oobAppLabel;
    }

    public final String getOobAppUrl() {
        return this.oobAppUrl;
    }

    public final String getOobContinueLabel() {
        return this.oobContinueLabel;
    }

    public final Image getPaymentSystemImage() {
        return this.paymentSystemImage;
    }

    public final String getResendInformationLabel() {
        return this.resendInformationLabel;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final String getServerTransId() {
        return this.serverTransId;
    }

    public final boolean getShouldShowChallengeInfoTextIndicator() {
        return this.shouldShowChallengeInfoTextIndicator;
    }

    public final String getSubmitAuthenticationLabel() {
        return this.submitAuthenticationLabel;
    }

    public final String getTransStatus() {
        return this.transStatus;
    }

    public final UiType getUiType() {
        return this.uiType;
    }

    public final String getWhitelistingInfoText() {
        return this.whitelistingInfoText;
    }

    public final String getWhyInfoLabel() {
        return this.whyInfoLabel;
    }

    public final String getWhyInfoText() {
        return this.whyInfoText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.serverTransId.hashCode() * 31) + this.acsTransId.hashCode()) * 31;
        String str = this.acsHtml;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.acsHtmlRefresh;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UiType uiType = this.uiType;
        int hashCode4 = (hashCode3 + (uiType == null ? 0 : uiType.hashCode())) * 31;
        boolean z11 = this.isChallengeCompleted;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode4 + i11) * 31;
        String str3 = this.challengeInfoHeader;
        int hashCode5 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.challengeInfoLabel;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.challengeInfoText;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.challengeAdditionalInfoText;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        boolean z12 = this.shouldShowChallengeInfoTextIndicator;
        int i13 = (hashCode8 + (z12 ? 1 : z12 ? 1 : 0)) * 31;
        List<ChallengeSelectOption> list = this.challengeSelectOptions;
        int hashCode9 = (i13 + (list == null ? 0 : list.hashCode())) * 31;
        String str7 = this.expandInfoLabel;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.expandInfoText;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Image image = this.issuerImage;
        int hashCode12 = (hashCode11 + (image == null ? 0 : image.hashCode())) * 31;
        List<MessageExtension> list2 = this.messageExtensions;
        int hashCode13 = (((hashCode12 + (list2 == null ? 0 : list2.hashCode())) * 31) + this.messageVersion.hashCode()) * 31;
        String str9 = this.oobAppUrl;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.oobAppLabel;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.oobContinueLabel;
        int hashCode16 = (hashCode15 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Image image2 = this.paymentSystemImage;
        int hashCode17 = (hashCode16 + (image2 == null ? 0 : image2.hashCode())) * 31;
        String str12 = this.resendInformationLabel;
        int hashCode18 = (((hashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31) + this.sdkTransId.hashCode()) * 31;
        String str13 = this.submitAuthenticationLabel;
        int hashCode19 = (hashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.whitelistingInfoText;
        int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.whyInfoLabel;
        int hashCode21 = (hashCode20 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.whyInfoText;
        int hashCode22 = (hashCode21 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.transStatus;
        return hashCode22 + (str17 != null ? str17.hashCode() : 0);
    }

    public final boolean isChallengeCompleted() {
        return this.isChallengeCompleted;
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x00d4, code lost:
        if (r0 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0013, code lost:
        if (r0 != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00b8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0071 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean isValidForUi$3ds2sdk_release() {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.isValidForUi$3ds2sdk_release():boolean");
    }

    public final JSONObject toJson() {
        JSONObject put = new JSONObject().put("messageType", MESSAGE_TYPE).put("threeDSServerTransID", this.serverTransId).put("acsTransID", this.acsTransId).put(FIELD_ACS_HTML, this.acsHtml).put(FIELD_ACS_HTML_REFRESH, this.acsHtmlRefresh);
        UiType uiType = this.uiType;
        JSONObject put2 = put.put(FIELD_ACS_UI_TYPE, uiType == null ? null : uiType.getCode());
        boolean z11 = this.isChallengeCompleted;
        String str = YES_VALUE;
        JSONObject put3 = put2.put(FIELD_CHALLENGE_COMPLETION_INDICATOR, z11 ? YES_VALUE : "N").put(FIELD_CHALLENGE_INFO_HEADER, this.challengeInfoHeader).put(FIELD_CHALLENGE_INFO_LABEL, this.challengeInfoLabel).put(FIELD_CHALLENGE_INFO_TEXT, this.challengeInfoText).put(FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT, this.challengeAdditionalInfoText).put(FIELD_CHALLENGE_SELECT_INFO, ChallengeSelectOption.Companion.toJsonArray$3ds2sdk_release(this.challengeSelectOptions)).put(FIELD_EXPAND_INFO_LABEL, this.expandInfoLabel).put(FIELD_EXPAND_INFO_TEXT, this.expandInfoText);
        Image image = this.issuerImage;
        JSONObject put4 = put3.put(FIELD_ISSUER_IMAGE, image == null ? null : image.toJson$3ds2sdk_release()).put(FIELD_MESSAGE_EXTENSION, MessageExtension.Companion.toJsonArray(this.messageExtensions)).put("messageVersion", this.messageVersion).put(FIELD_OOB_APP_URL, this.oobAppUrl).put(FIELD_OOB_APP_LABEL, this.oobAppLabel).put(FIELD_OOB_CONTINUE_LABEL, this.oobContinueLabel);
        Image image2 = this.paymentSystemImage;
        JSONObject put5 = put4.put(FIELD_PAYMENT_SYSTEM_IMAGE, image2 != null ? image2.toJson$3ds2sdk_release() : null).put(FIELD_RESEND_INFORMATION_LABEL, this.resendInformationLabel).put("sdkTransID", this.sdkTransId).put(FIELD_SUBMIT_AUTHENTICATION_LABEL, this.submitAuthenticationLabel).put(FIELD_WHITELISTING_INFO_TEXT, this.whitelistingInfoText).put(FIELD_WHY_INFO_LABEL, this.whyInfoLabel).put(FIELD_WHY_INFO_TEXT, this.whyInfoText).put(FIELD_TRANS_STATUS, this.transStatus);
        if (!isChallengeCompleted()) {
            if (!getShouldShowChallengeInfoTextIndicator()) {
                str = "N";
            }
            put5.put(FIELD_CHALLENGE_INFO_TEXT_INDICATOR, str);
        }
        s.f(put5, "JSONObject()\n           …          }\n            }");
        return put5;
    }

    public String toString() {
        return "ChallengeResponseData(serverTransId=" + this.serverTransId + ", acsTransId=" + this.acsTransId + ", acsHtml=" + ((Object) this.acsHtml) + ", acsHtmlRefresh=" + ((Object) this.acsHtmlRefresh) + ", uiType=" + this.uiType + ", isChallengeCompleted=" + this.isChallengeCompleted + ", challengeInfoHeader=" + ((Object) this.challengeInfoHeader) + ", challengeInfoLabel=" + ((Object) this.challengeInfoLabel) + ", challengeInfoText=" + ((Object) this.challengeInfoText) + ", challengeAdditionalInfoText=" + ((Object) this.challengeAdditionalInfoText) + ", shouldShowChallengeInfoTextIndicator=" + this.shouldShowChallengeInfoTextIndicator + ", challengeSelectOptions=" + this.challengeSelectOptions + ", expandInfoLabel=" + ((Object) this.expandInfoLabel) + ", expandInfoText=" + ((Object) this.expandInfoText) + ", issuerImage=" + this.issuerImage + ", messageExtensions=" + this.messageExtensions + ", messageVersion=" + this.messageVersion + ", oobAppUrl=" + ((Object) this.oobAppUrl) + ", oobAppLabel=" + ((Object) this.oobAppLabel) + ", oobContinueLabel=" + ((Object) this.oobContinueLabel) + ", paymentSystemImage=" + this.paymentSystemImage + ", resendInformationLabel=" + ((Object) this.resendInformationLabel) + ", sdkTransId=" + this.sdkTransId + ", submitAuthenticationLabel=" + ((Object) this.submitAuthenticationLabel) + ", whitelistingInfoText=" + ((Object) this.whitelistingInfoText) + ", whyInfoLabel=" + ((Object) this.whyInfoLabel) + ", whyInfoText=" + ((Object) this.whyInfoText) + ", transStatus=" + ((Object) this.transStatus) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.serverTransId);
        out.writeString(this.acsTransId);
        out.writeString(this.acsHtml);
        out.writeString(this.acsHtmlRefresh);
        UiType uiType = this.uiType;
        if (uiType == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(uiType.name());
        }
        out.writeInt(this.isChallengeCompleted ? 1 : 0);
        out.writeString(this.challengeInfoHeader);
        out.writeString(this.challengeInfoLabel);
        out.writeString(this.challengeInfoText);
        out.writeString(this.challengeAdditionalInfoText);
        out.writeInt(this.shouldShowChallengeInfoTextIndicator ? 1 : 0);
        List<ChallengeSelectOption> list = this.challengeSelectOptions;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (ChallengeSelectOption challengeSelectOption : list) {
                challengeSelectOption.writeToParcel(out, i11);
            }
        }
        out.writeString(this.expandInfoLabel);
        out.writeString(this.expandInfoText);
        Image image = this.issuerImage;
        if (image == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            image.writeToParcel(out, i11);
        }
        List<MessageExtension> list2 = this.messageExtensions;
        if (list2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list2.size());
            for (MessageExtension messageExtension : list2) {
                messageExtension.writeToParcel(out, i11);
            }
        }
        out.writeString(this.messageVersion);
        out.writeString(this.oobAppUrl);
        out.writeString(this.oobAppLabel);
        out.writeString(this.oobContinueLabel);
        Image image2 = this.paymentSystemImage;
        if (image2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            image2.writeToParcel(out, i11);
        }
        out.writeString(this.resendInformationLabel);
        this.sdkTransId.writeToParcel(out, i11);
        out.writeString(this.submitAuthenticationLabel);
        out.writeString(this.whitelistingInfoText);
        out.writeString(this.whyInfoLabel);
        out.writeString(this.whyInfoText);
        out.writeString(this.transStatus);
    }

    /* loaded from: classes6.dex */
    public static final class Image implements Parcelable {
        private static final String FIELD_EXTRA_HIGH = "extraHigh";
        private static final String FIELD_HIGH = "high";
        private static final String FIELD_MEDIUM = "medium";
        private final String extraHighUrl;
        private final String highUrl;
        private final String mediumUrl;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Image> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Image fromJson$3ds2sdk_release(JSONObject jSONObject) {
                if (jSONObject == null) {
                    return null;
                }
                return new Image(jSONObject.optString("medium"), jSONObject.optString("high"), jSONObject.optString(Image.FIELD_EXTRA_HIGH));
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Image> {
            @Override // android.os.Parcelable.Creator
            public final Image createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Image(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Image[] newArray(int i11) {
                return new Image[i11];
            }
        }

        public Image(String str, String str2, String str3) {
            this.mediumUrl = str;
            this.highUrl = str2;
            this.extraHighUrl = str3;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = image.mediumUrl;
            }
            if ((i11 & 2) != 0) {
                str2 = image.highUrl;
            }
            if ((i11 & 4) != 0) {
                str3 = image.extraHighUrl;
            }
            return image.copy(str, str2, str3);
        }

        public final String component1$3ds2sdk_release() {
            return this.mediumUrl;
        }

        public final String component2$3ds2sdk_release() {
            return this.highUrl;
        }

        public final String component3$3ds2sdk_release() {
            return this.extraHighUrl;
        }

        public final Image copy(String str, String str2, String str3) {
            return new Image(str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Image) {
                Image image = (Image) obj;
                return s.c(this.mediumUrl, image.mediumUrl) && s.c(this.highUrl, image.highUrl) && s.c(this.extraHighUrl, image.extraHighUrl);
            }
            return false;
        }

        public final String getExtraHighUrl$3ds2sdk_release() {
            return this.extraHighUrl;
        }

        public final String getHighUrl$3ds2sdk_release() {
            return this.highUrl;
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0038 A[EDGE_INSN: B:38:0x0038->B:36:0x0038 ?: BREAK  , SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String getHighestFidelityImageUrl() {
            /*
                r5 = this;
                r0 = 3
                java.lang.String[] r0 = new java.lang.String[r0]
                java.lang.String r1 = r5.extraHighUrl
                r2 = 0
                r0[r2] = r1
                java.lang.String r1 = r5.highUrl
                r3 = 1
                r0[r3] = r1
                java.lang.String r1 = r5.mediumUrl
                r4 = 2
                r0[r4] = r1
                java.util.List r0 = wz.u.l(r0)
                java.util.Iterator r0 = r0.iterator()
            L1a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L37
                java.lang.Object r1 = r0.next()
                r4 = r1
                java.lang.String r4 = (java.lang.String) r4
                if (r4 == 0) goto L32
                boolean r4 = kotlin.text.m.w(r4)
                if (r4 == 0) goto L30
                goto L32
            L30:
                r4 = r2
                goto L33
            L32:
                r4 = r3
            L33:
                r4 = r4 ^ r3
                if (r4 == 0) goto L1a
                goto L38
            L37:
                r1 = 0
            L38:
                java.lang.String r1 = (java.lang.String) r1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.Image.getHighestFidelityImageUrl():java.lang.String");
        }

        public final String getMediumUrl$3ds2sdk_release() {
            return this.mediumUrl;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.String getUrlForDensity(int r2) {
            /*
                r1 = this;
                r0 = 160(0xa0, float:2.24E-43)
                if (r2 > r0) goto L7
                java.lang.String r2 = r1.mediumUrl
                goto L10
            L7:
                r0 = 320(0x140, float:4.48E-43)
                if (r2 < r0) goto Le
                java.lang.String r2 = r1.extraHighUrl
                goto L10
            Le:
                java.lang.String r2 = r1.highUrl
            L10:
                if (r2 == 0) goto L1b
                boolean r0 = kotlin.text.m.w(r2)
                if (r0 == 0) goto L19
                goto L1b
            L19:
                r0 = 0
                goto L1c
            L1b:
                r0 = 1
            L1c:
                if (r0 != 0) goto L1f
                goto L20
            L1f:
                r2 = 0
            L20:
                if (r2 != 0) goto L26
                java.lang.String r2 = r1.getHighestFidelityImageUrl()
            L26:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.Image.getUrlForDensity(int):java.lang.String");
        }

        public int hashCode() {
            String str = this.mediumUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.highUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.extraHighUrl;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final JSONObject toJson$3ds2sdk_release() {
            JSONObject put = new JSONObject().put("medium", this.mediumUrl).put("high", this.highUrl).put(FIELD_EXTRA_HIGH, this.extraHighUrl);
            s.f(put, "JSONObject()\n           …EXTRA_HIGH, extraHighUrl)");
            return put;
        }

        public String toString() {
            return "Image(mediumUrl=" + ((Object) this.mediumUrl) + ", highUrl=" + ((Object) this.highUrl) + ", extraHighUrl=" + ((Object) this.extraHighUrl) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.mediumUrl);
            out.writeString(this.highUrl);
            out.writeString(this.extraHighUrl);
        }

        public /* synthetic */ Image(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, str3);
        }
    }

    public /* synthetic */ ChallengeResponseData(String str, String str2, String str3, String str4, UiType uiType, boolean z11, String str5, String str6, String str7, String str8, boolean z12, List list, String str9, String str10, Image image, List list2, String str11, String str12, String str13, String str14, Image image2, String str15, SdkTransactionId sdkTransactionId, String str16, String str17, String str18, String str19, String str20, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : uiType, (i11 & 32) != 0 ? false : z11, (i11 & 64) != 0 ? null : str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : str7, (i11 & 512) != 0 ? null : str8, (i11 & 1024) != 0 ? false : z12, (i11 & 2048) != 0 ? null : list, (i11 & 4096) != 0 ? null : str9, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str10, (i11 & 16384) != 0 ? null : image, (32768 & i11) != 0 ? null : list2, str11, (131072 & i11) != 0 ? null : str12, (262144 & i11) != 0 ? null : str13, (524288 & i11) != 0 ? null : str14, (1048576 & i11) != 0 ? null : image2, (2097152 & i11) != 0 ? null : str15, sdkTransactionId, (8388608 & i11) != 0 ? null : str16, (16777216 & i11) != 0 ? null : str17, (33554432 & i11) != 0 ? null : str18, (67108864 & i11) != 0 ? null : str19, (i11 & 134217728) != 0 ? null : str20);
    }
}