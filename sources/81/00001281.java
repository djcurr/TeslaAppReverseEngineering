package com.adyen.checkout.adyen3ds2.model;

import android.os.Parcel;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.ModelSerializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001.BO\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b+\u0010,J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\bHÆ\u0003JQ\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0016\u001a\u00020\bHÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R$\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R$\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R$\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010 R$\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u001c\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 ¨\u0006/"}, d2 = {"Lcom/adyen/checkout/adyen3ds2/model/ChallengeToken;", "Lp7/c;", "Landroid/os/Parcel;", "dest", "", "flags", "Lvz/b0;", "writeToParcel", "", "component1", "component2", "component3", "component4", "component5", "component6", ChallengeToken.ACS_REFERENCE_NUMBER, ChallengeToken.ACS_SIGNED_CONTENT, "acsTransID", "acsURL", "messageVersion", "threeDSServerTransID", "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getAcsReferenceNumber", "()Ljava/lang/String;", "setAcsReferenceNumber", "(Ljava/lang/String;)V", "getAcsSignedContent", "setAcsSignedContent", "getAcsTransID", "setAcsTransID", "getAcsURL", "setAcsURL", "getMessageVersion", "setMessageVersion", "getThreeDSServerTransID", "setThreeDSServerTransID", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "b", "3ds2_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class ChallengeToken extends c {
    private static final String ACS_REFERENCE_NUMBER = "acsReferenceNumber";
    private static final String ACS_SIGNED_CONTENT = "acsSignedContent";
    private static final String ACS_TRANS_ID = "acsTransID";
    private static final String ACS_URL = "acsURL";
    private static final String MESSAGE_VERSION = "messageVersion";
    private static final String THREEDS_SERVER_TRANS_ID = "threeDSServerTransID";
    private String acsReferenceNumber;
    private String acsSignedContent;
    private String acsTransID;
    private String acsURL;
    private String messageVersion;
    private String threeDSServerTransID;
    public static final b Companion = new b(null);
    public static final c.a<ChallengeToken> CREATOR = new c.a<>(ChallengeToken.class);
    public static final c.b<ChallengeToken> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<ChallengeToken> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public ChallengeToken a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                return new ChallengeToken(p7.b.b(jsonObject, ChallengeToken.ACS_REFERENCE_NUMBER), p7.b.b(jsonObject, ChallengeToken.ACS_SIGNED_CONTENT), p7.b.b(jsonObject, "acsTransID"), p7.b.b(jsonObject, "acsURL"), p7.b.b(jsonObject, "messageVersion"), p7.b.b(jsonObject, "threeDSServerTransID"));
            } catch (JSONException e11) {
                throw new ModelSerializationException(ChallengeToken.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(ChallengeToken modelObject) {
            s.g(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(ChallengeToken.ACS_REFERENCE_NUMBER, modelObject.getAcsReferenceNumber());
                jSONObject.putOpt(ChallengeToken.ACS_SIGNED_CONTENT, modelObject.getAcsSignedContent());
                jSONObject.putOpt("acsTransID", modelObject.getAcsTransID());
                jSONObject.putOpt("acsURL", modelObject.getAcsURL());
                jSONObject.putOpt("messageVersion", modelObject.getMessageVersion());
                jSONObject.putOpt("threeDSServerTransID", modelObject.getThreeDSServerTransID());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(ChallengeToken.class, e11);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public ChallengeToken() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ ChallengeToken(String str, String str2, String str3, String str4, String str5, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6);
    }

    public static /* synthetic */ ChallengeToken copy$default(ChallengeToken challengeToken, String str, String str2, String str3, String str4, String str5, String str6, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = challengeToken.acsReferenceNumber;
        }
        if ((i11 & 2) != 0) {
            str2 = challengeToken.acsSignedContent;
        }
        String str7 = str2;
        if ((i11 & 4) != 0) {
            str3 = challengeToken.acsTransID;
        }
        String str8 = str3;
        if ((i11 & 8) != 0) {
            str4 = challengeToken.acsURL;
        }
        String str9 = str4;
        if ((i11 & 16) != 0) {
            str5 = challengeToken.messageVersion;
        }
        String str10 = str5;
        if ((i11 & 32) != 0) {
            str6 = challengeToken.threeDSServerTransID;
        }
        return challengeToken.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.acsReferenceNumber;
    }

    public final String component2() {
        return this.acsSignedContent;
    }

    public final String component3() {
        return this.acsTransID;
    }

    public final String component4() {
        return this.acsURL;
    }

    public final String component5() {
        return this.messageVersion;
    }

    public final String component6() {
        return this.threeDSServerTransID;
    }

    public final ChallengeToken copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new ChallengeToken(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChallengeToken) {
            ChallengeToken challengeToken = (ChallengeToken) obj;
            return s.c(this.acsReferenceNumber, challengeToken.acsReferenceNumber) && s.c(this.acsSignedContent, challengeToken.acsSignedContent) && s.c(this.acsTransID, challengeToken.acsTransID) && s.c(this.acsURL, challengeToken.acsURL) && s.c(this.messageVersion, challengeToken.messageVersion) && s.c(this.threeDSServerTransID, challengeToken.threeDSServerTransID);
        }
        return false;
    }

    public final String getAcsReferenceNumber() {
        return this.acsReferenceNumber;
    }

    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    public final String getAcsTransID() {
        return this.acsTransID;
    }

    public final String getAcsURL() {
        return this.acsURL;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final String getThreeDSServerTransID() {
        return this.threeDSServerTransID;
    }

    public int hashCode() {
        String str = this.acsReferenceNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.acsSignedContent;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.acsTransID;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.acsURL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.messageVersion;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.threeDSServerTransID;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setAcsReferenceNumber(String str) {
        this.acsReferenceNumber = str;
    }

    public final void setAcsSignedContent(String str) {
        this.acsSignedContent = str;
    }

    public final void setAcsTransID(String str) {
        this.acsTransID = str;
    }

    public final void setAcsURL(String str) {
        this.acsURL = str;
    }

    public final void setMessageVersion(String str) {
        this.messageVersion = str;
    }

    public final void setThreeDSServerTransID(String str) {
        this.threeDSServerTransID = str;
    }

    public String toString() {
        return "ChallengeToken(acsReferenceNumber=" + ((Object) this.acsReferenceNumber) + ", acsSignedContent=" + ((Object) this.acsSignedContent) + ", acsTransID=" + ((Object) this.acsTransID) + ", acsURL=" + ((Object) this.acsURL) + ", messageVersion=" + ((Object) this.messageVersion) + ", threeDSServerTransID=" + ((Object) this.threeDSServerTransID) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        s.g(dest, "dest");
        p7.a.d(dest, SERIALIZER.b(this));
    }

    public ChallengeToken(String str, String str2, String str3, String str4, String str5, String str6) {
        this.acsReferenceNumber = str;
        this.acsSignedContent = str2;
        this.acsTransID = str3;
        this.acsURL = str4;
        this.messageVersion = str5;
        this.threeDSServerTransID = str6;
    }
}