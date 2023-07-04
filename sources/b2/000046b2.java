package com.plaid.link.event;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.networking.FraudDetectionData;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nn.c;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.p;
import vz.v;
import wz.s0;

/* loaded from: classes2.dex */
public final class LinkEventMetadata implements Parcelable {
    @c("brand_name")
    private final String brandName;
    @c("error_code")
    private final String errorCode;
    @c("error_message")
    private final String errorMessage;
    @c("error_type")
    private final String errorType;
    @c("exit_status")
    private final String exitStatus;
    @c("institution_id")
    private final String institutionId;
    @c("institution_name")
    private final String institutionName;
    @c("institution_search_query")
    private final String institutionSearchQuery;
    @c("link_session_id")
    private final String linkSessionId;
    @c("metadata_json")
    private final String metadataJson;
    @c("mfa_type")
    private final String mfaType;
    @c("request_id")
    private final String requestId;
    @c("routing_number")
    private final String routingNumber;
    @c(BaseSheetViewModel.SAVE_SELECTION)
    private final String selection;
    @c(FraudDetectionData.KEY_TIMESTAMP)
    private final String timestamp;
    @c("view_name")
    private final LinkEventViewName viewName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LinkEventMetadata> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkEventMetadata fromMap(Map<String, String> linkData, String str) {
            s.g(linkData, "linkData");
            String str2 = linkData.get("error_code");
            String str3 = linkData.get("error_message");
            String str4 = linkData.get("error_type");
            String str5 = linkData.get("exit_status");
            String str6 = linkData.get("institution_id");
            String str7 = linkData.get("institution_name");
            String str8 = linkData.get("institution_search_query");
            String str9 = str == null ? "" : str;
            String str10 = linkData.get("mfa_type");
            String str11 = linkData.get("request_id");
            String str12 = str11 == null ? "" : str11;
            String str13 = linkData.containsKey("routing_number") ? linkData.get("routing_number") : null;
            String str14 = linkData.get(FraudDetectionData.KEY_TIMESTAMP);
            String str15 = str14 == null ? "" : str14;
            LinkEventViewName fromString$link_sdk_release = LinkEventViewName.Companion.fromString$link_sdk_release(linkData.get("view_name"));
            return new LinkEventMetadata(linkData.containsKey("brand_name") ? linkData.get("brand_name") : null, str2, str3, str4, str5, str6, str7, str8, str9, str10, str12, linkData.containsKey(BaseSheetViewModel.SAVE_SELECTION) ? linkData.get(BaseSheetViewModel.SAVE_SELECTION) : null, str15, fromString$link_sdk_release, linkData.get("metadata_json"), str13);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LinkEventMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEventMetadata createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new LinkEventMetadata(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LinkEventViewName) parcel.readParcelable(LinkEventMetadata.class.getClassLoader()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEventMetadata[] newArray(int i11) {
            return new LinkEventMetadata[i11];
        }
    }

    public LinkEventMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String linkSessionId, String str9, String str10, String str11, String timestamp, LinkEventViewName linkEventViewName, String str12, String str13) {
        s.g(linkSessionId, "linkSessionId");
        s.g(timestamp, "timestamp");
        this.brandName = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.errorType = str4;
        this.exitStatus = str5;
        this.institutionId = str6;
        this.institutionName = str7;
        this.institutionSearchQuery = str8;
        this.linkSessionId = linkSessionId;
        this.mfaType = str9;
        this.requestId = str10;
        this.selection = str11;
        this.timestamp = timestamp;
        this.viewName = linkEventViewName;
        this.metadataJson = str12;
        this.routingNumber = str13;
    }

    public final String component1() {
        return this.brandName;
    }

    public final String component10() {
        return this.mfaType;
    }

    public final String component11() {
        return this.requestId;
    }

    public final String component12() {
        return this.selection;
    }

    public final String component13() {
        return this.timestamp;
    }

    public final LinkEventViewName component14() {
        return this.viewName;
    }

    public final String component15() {
        return this.metadataJson;
    }

    public final String component16() {
        return this.routingNumber;
    }

    public final String component2() {
        return this.errorCode;
    }

    public final String component3() {
        return this.errorMessage;
    }

    public final String component4() {
        return this.errorType;
    }

    public final String component5() {
        return this.exitStatus;
    }

    public final String component6() {
        return this.institutionId;
    }

    public final String component7() {
        return this.institutionName;
    }

    public final String component8() {
        return this.institutionSearchQuery;
    }

    public final String component9() {
        return this.linkSessionId;
    }

    public final LinkEventMetadata copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String linkSessionId, String str9, String str10, String str11, String timestamp, LinkEventViewName linkEventViewName, String str12, String str13) {
        s.g(linkSessionId, "linkSessionId");
        s.g(timestamp, "timestamp");
        return new LinkEventMetadata(str, str2, str3, str4, str5, str6, str7, str8, linkSessionId, str9, str10, str11, timestamp, linkEventViewName, str12, str13);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkEventMetadata) {
            LinkEventMetadata linkEventMetadata = (LinkEventMetadata) obj;
            return s.c(this.brandName, linkEventMetadata.brandName) && s.c(this.errorCode, linkEventMetadata.errorCode) && s.c(this.errorMessage, linkEventMetadata.errorMessage) && s.c(this.errorType, linkEventMetadata.errorType) && s.c(this.exitStatus, linkEventMetadata.exitStatus) && s.c(this.institutionId, linkEventMetadata.institutionId) && s.c(this.institutionName, linkEventMetadata.institutionName) && s.c(this.institutionSearchQuery, linkEventMetadata.institutionSearchQuery) && s.c(this.linkSessionId, linkEventMetadata.linkSessionId) && s.c(this.mfaType, linkEventMetadata.mfaType) && s.c(this.requestId, linkEventMetadata.requestId) && s.c(this.selection, linkEventMetadata.selection) && s.c(this.timestamp, linkEventMetadata.timestamp) && s.c(this.viewName, linkEventMetadata.viewName) && s.c(this.metadataJson, linkEventMetadata.metadataJson) && s.c(this.routingNumber, linkEventMetadata.routingNumber);
        }
        return false;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getExitStatus() {
        return this.exitStatus;
    }

    public final String getInstitutionId() {
        return this.institutionId;
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getInstitutionSearchQuery() {
        return this.institutionSearchQuery;
    }

    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    public final String getMetadataJson() {
        return this.metadataJson;
    }

    public final String getMfaType() {
        return this.mfaType;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public final String getSelection() {
        return this.selection;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final LinkEventViewName getViewName() {
        return this.viewName;
    }

    public int hashCode() {
        String str = this.brandName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.exitStatus;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.institutionId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.institutionName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.institutionSearchQuery;
        int hashCode8 = (this.linkSessionId.hashCode() + ((hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31)) * 31;
        String str9 = this.mfaType;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.requestId;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.selection;
        int hashCode11 = (this.timestamp.hashCode() + ((hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31)) * 31;
        LinkEventViewName linkEventViewName = this.viewName;
        int hashCode12 = (hashCode11 + (linkEventViewName == null ? 0 : linkEventViewName.hashCode())) * 31;
        String str12 = this.metadataJson;
        int hashCode13 = (hashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.routingNumber;
        return hashCode13 + (str13 != null ? str13.hashCode() : 0);
    }

    public final Map<String, String> toMap() {
        Map l11;
        p[] pVarArr = new p[15];
        pVarArr[0] = v.a("brand_name", this.brandName);
        pVarArr[1] = v.a("error_code", this.errorCode);
        pVarArr[2] = v.a("error_message", this.errorMessage);
        pVarArr[3] = v.a("error_type", this.errorType);
        pVarArr[4] = v.a("exit_status", this.exitStatus);
        pVarArr[5] = v.a("institution_id", this.institutionId);
        pVarArr[6] = v.a("institution_name", this.institutionName);
        pVarArr[7] = v.a("institution_search_query", this.institutionSearchQuery);
        pVarArr[8] = v.a("link_session_id", this.linkSessionId);
        pVarArr[9] = v.a("mfa_type", this.mfaType);
        pVarArr[10] = v.a("request_id", this.requestId);
        pVarArr[11] = v.a("routing_number", this.routingNumber);
        pVarArr[12] = v.a(BaseSheetViewModel.SAVE_SELECTION, this.selection);
        pVarArr[13] = v.a(FraudDetectionData.KEY_TIMESTAMP, this.timestamp);
        LinkEventViewName linkEventViewName = this.viewName;
        pVarArr[14] = v.a("view_name", (linkEventViewName == null || (r1 = linkEventViewName.getJsonValue()) == null) ? null : null);
        l11 = s0.l(pVarArr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : l11.entrySet()) {
            CharSequence charSequence = (CharSequence) entry.getValue();
            if (!(charSequence == null || charSequence.length() == 0)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        return "LinkEventMetadata(brandName=" + ((Object) this.brandName) + ", errorCode=" + ((Object) this.errorCode) + ", errorMessage=" + ((Object) this.errorMessage) + ", errorType=" + ((Object) this.errorType) + ", exitStatus=" + ((Object) this.exitStatus) + ", institutionId=" + ((Object) this.institutionId) + ", institutionName=" + ((Object) this.institutionName) + ", institutionSearchQuery=" + ((Object) this.institutionSearchQuery) + ", linkSessionId=" + this.linkSessionId + ", mfaType=" + ((Object) this.mfaType) + ", requestId=" + ((Object) this.requestId) + ", selection=" + ((Object) this.selection) + ", timestamp=" + this.timestamp + ", viewName=" + this.viewName + ", metadataJson=" + ((Object) this.metadataJson) + ", routingNumber=" + ((Object) this.routingNumber) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.brandName);
        out.writeString(this.errorCode);
        out.writeString(this.errorMessage);
        out.writeString(this.errorType);
        out.writeString(this.exitStatus);
        out.writeString(this.institutionId);
        out.writeString(this.institutionName);
        out.writeString(this.institutionSearchQuery);
        out.writeString(this.linkSessionId);
        out.writeString(this.mfaType);
        out.writeString(this.requestId);
        out.writeString(this.selection);
        out.writeString(this.timestamp);
        out.writeParcelable(this.viewName, i11);
        out.writeString(this.metadataJson);
        out.writeString(this.routingNumber);
    }

    public /* synthetic */ LinkEventMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, LinkEventViewName linkEventViewName, String str14, String str15, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) != 0 ? null : str12, str13, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : linkEventViewName, (i11 & 16384) != 0 ? null : str14, (i11 & 32768) != 0 ? null : str15);
    }
}