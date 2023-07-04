package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class WeChat implements StripeModel {
    private final String appId;
    private final String nonce;
    private final String packageValue;
    private final String partnerId;
    private final String prepayId;
    private final String qrCodeUrl;
    private final String sign;
    private final String statementDescriptor;
    private final String timestamp;
    public static final Parcelable.Creator<WeChat> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<WeChat> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeChat createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new WeChat(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WeChat[] newArray(int i11) {
            return new WeChat[i11];
        }
    }

    public WeChat(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.statementDescriptor = str;
        this.appId = str2;
        this.nonce = str3;
        this.packageValue = str4;
        this.partnerId = str5;
        this.prepayId = str6;
        this.sign = str7;
        this.timestamp = str8;
        this.qrCodeUrl = str9;
    }

    public final String component1() {
        return this.statementDescriptor;
    }

    public final String component2() {
        return this.appId;
    }

    public final String component3() {
        return this.nonce;
    }

    public final String component4() {
        return this.packageValue;
    }

    public final String component5() {
        return this.partnerId;
    }

    public final String component6() {
        return this.prepayId;
    }

    public final String component7() {
        return this.sign;
    }

    public final String component8() {
        return this.timestamp;
    }

    public final String component9() {
        return this.qrCodeUrl;
    }

    public final WeChat copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new WeChat(str, str2, str3, str4, str5, str6, str7, str8, str9);
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
        if (obj instanceof WeChat) {
            WeChat weChat = (WeChat) obj;
            return s.c(this.statementDescriptor, weChat.statementDescriptor) && s.c(this.appId, weChat.appId) && s.c(this.nonce, weChat.nonce) && s.c(this.packageValue, weChat.packageValue) && s.c(this.partnerId, weChat.partnerId) && s.c(this.prepayId, weChat.prepayId) && s.c(this.sign, weChat.sign) && s.c(this.timestamp, weChat.timestamp) && s.c(this.qrCodeUrl, weChat.qrCodeUrl);
        }
        return false;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getNonce() {
        return this.nonce;
    }

    public final String getPackageValue() {
        return this.packageValue;
    }

    public final String getPartnerId() {
        return this.partnerId;
    }

    public final String getPrepayId() {
        return this.prepayId;
    }

    public final String getQrCodeUrl() {
        return this.qrCodeUrl;
    }

    public final String getSign() {
        return this.sign;
    }

    public final String getStatementDescriptor() {
        return this.statementDescriptor;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.statementDescriptor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nonce;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.packageValue;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.partnerId;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.prepayId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.sign;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.timestamp;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.qrCodeUrl;
        return hashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public String toString() {
        return "WeChat(statementDescriptor=" + ((Object) this.statementDescriptor) + ", appId=" + ((Object) this.appId) + ", nonce=" + ((Object) this.nonce) + ", packageValue=" + ((Object) this.packageValue) + ", partnerId=" + ((Object) this.partnerId) + ", prepayId=" + ((Object) this.prepayId) + ", sign=" + ((Object) this.sign) + ", timestamp=" + ((Object) this.timestamp) + ", qrCodeUrl=" + ((Object) this.qrCodeUrl) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.statementDescriptor);
        out.writeString(this.appId);
        out.writeString(this.nonce);
        out.writeString(this.packageValue);
        out.writeString(this.partnerId);
        out.writeString(this.prepayId);
        out.writeString(this.sign);
        out.writeString(this.timestamp);
        out.writeString(this.qrCodeUrl);
    }

    public /* synthetic */ WeChat(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, str2, str3, str4, str5, str6, str7, str8, (i11 & 256) != 0 ? null : str9);
    }
}