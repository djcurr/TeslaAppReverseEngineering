package com.adyen.checkout.adyen3ds2.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.core.exception.ModelSerializationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONException;
import org.json.JSONObject;
import p7.c;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001!B7\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0012\u001a\u00020\bHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006\""}, d2 = {"Lcom/adyen/checkout/adyen3ds2/model/FingerprintToken;", "Lp7/c;", "Landroid/os/Parcel;", "dest", "", "flags", "Lvz/b0;", "writeToParcel", "", "component1", "component2", "component3", "component4", FingerprintToken.DIRECTORY_SERVER_ID, FingerprintToken.DIRECTORY_SERVER_PUBLIC_KEY, "threeDSServerTransID", FingerprintToken.THREEDS_MESSAGE_VERSION, "copy", "toString", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getDirectoryServerId", "()Ljava/lang/String;", "getDirectoryServerPublicKey", "getThreeDSServerTransID", "getThreeDSMessageVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "b", "3ds2_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FingerprintToken extends c {
    private static final String DIRECTORY_SERVER_ID = "directoryServerId";
    private static final String DIRECTORY_SERVER_PUBLIC_KEY = "directoryServerPublicKey";
    private static final String THREEDS_MESSAGE_VERSION = "threeDSMessageVersion";
    private static final String THREEDS_SERVER_TRANS_ID = "threeDSServerTransID";
    private final String directoryServerId;
    private final String directoryServerPublicKey;
    private final String threeDSMessageVersion;
    private final String threeDSServerTransID;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<FingerprintToken> CREATOR = new c.a(FingerprintToken.class);
    public static final c.b<FingerprintToken> SERIALIZER = new a();

    /* loaded from: classes.dex */
    public static final class a implements c.b<FingerprintToken> {
        a() {
        }

        @Override // p7.c.b
        /* renamed from: c */
        public FingerprintToken a(JSONObject jsonObject) {
            s.g(jsonObject, "jsonObject");
            try {
                return new FingerprintToken(p7.b.b(jsonObject, FingerprintToken.DIRECTORY_SERVER_ID), p7.b.b(jsonObject, FingerprintToken.DIRECTORY_SERVER_PUBLIC_KEY), p7.b.b(jsonObject, "threeDSServerTransID"), p7.b.b(jsonObject, FingerprintToken.THREEDS_MESSAGE_VERSION));
            } catch (JSONException e11) {
                throw new ModelSerializationException(FingerprintToken.class, e11);
            }
        }

        @Override // p7.c.b
        /* renamed from: d */
        public JSONObject b(FingerprintToken modelObject) {
            s.g(modelObject, "modelObject");
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt(FingerprintToken.DIRECTORY_SERVER_ID, modelObject.getDirectoryServerId());
                jSONObject.putOpt(FingerprintToken.DIRECTORY_SERVER_PUBLIC_KEY, modelObject.getDirectoryServerPublicKey());
                jSONObject.putOpt("threeDSServerTransID", modelObject.getThreeDSServerTransID());
                jSONObject.putOpt(FingerprintToken.THREEDS_MESSAGE_VERSION, modelObject.getThreeDSMessageVersion());
                return jSONObject;
            } catch (JSONException e11) {
                throw new ModelSerializationException(FingerprintToken.class, e11);
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

    public FingerprintToken() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ FingerprintToken(String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ FingerprintToken copy$default(FingerprintToken fingerprintToken, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = fingerprintToken.directoryServerId;
        }
        if ((i11 & 2) != 0) {
            str2 = fingerprintToken.directoryServerPublicKey;
        }
        if ((i11 & 4) != 0) {
            str3 = fingerprintToken.threeDSServerTransID;
        }
        if ((i11 & 8) != 0) {
            str4 = fingerprintToken.threeDSMessageVersion;
        }
        return fingerprintToken.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.directoryServerId;
    }

    public final String component2() {
        return this.directoryServerPublicKey;
    }

    public final String component3() {
        return this.threeDSServerTransID;
    }

    public final String component4() {
        return this.threeDSMessageVersion;
    }

    public final FingerprintToken copy(String str, String str2, String str3, String str4) {
        return new FingerprintToken(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FingerprintToken) {
            FingerprintToken fingerprintToken = (FingerprintToken) obj;
            return s.c(this.directoryServerId, fingerprintToken.directoryServerId) && s.c(this.directoryServerPublicKey, fingerprintToken.directoryServerPublicKey) && s.c(this.threeDSServerTransID, fingerprintToken.threeDSServerTransID) && s.c(this.threeDSMessageVersion, fingerprintToken.threeDSMessageVersion);
        }
        return false;
    }

    public final String getDirectoryServerId() {
        return this.directoryServerId;
    }

    public final String getDirectoryServerPublicKey() {
        return this.directoryServerPublicKey;
    }

    public final String getThreeDSMessageVersion() {
        return this.threeDSMessageVersion;
    }

    public final String getThreeDSServerTransID() {
        return this.threeDSServerTransID;
    }

    public int hashCode() {
        String str = this.directoryServerId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.directoryServerPublicKey;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.threeDSServerTransID;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.threeDSMessageVersion;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "FingerprintToken(directoryServerId=" + ((Object) this.directoryServerId) + ", directoryServerPublicKey=" + ((Object) this.directoryServerPublicKey) + ", threeDSServerTransID=" + ((Object) this.threeDSServerTransID) + ", threeDSMessageVersion=" + ((Object) this.threeDSMessageVersion) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        s.g(dest, "dest");
        p7.a.d(dest, SERIALIZER.b(this));
    }

    public FingerprintToken(String str, String str2, String str3, String str4) {
        this.directoryServerId = str;
        this.directoryServerPublicKey = str2;
        this.threeDSServerTransID = str3;
        this.threeDSMessageVersion = str4;
    }
}