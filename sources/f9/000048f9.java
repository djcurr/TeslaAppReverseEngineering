package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LinkExitMetadata implements Parcelable {
    public static final Parcelable.Creator<LinkExitMetadata> CREATOR = new Creator();
    private final LinkInstitution institution;
    private final String linkSessionId;
    private final String metadataJson;
    private final String requestId;
    private final LinkExitMetadataStatus status;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LinkExitMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkExitMetadata createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new LinkExitMetadata((LinkExitMetadataStatus) parcel.readParcelable(LinkExitMetadata.class.getClassLoader()), parcel.readInt() == 0 ? null : LinkInstitution.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkExitMetadata[] newArray(int i11) {
            return new LinkExitMetadata[i11];
        }
    }

    public LinkExitMetadata() {
        this(null, null, null, null, null, 31, null);
    }

    public LinkExitMetadata(LinkExitMetadataStatus linkExitMetadataStatus, LinkInstitution linkInstitution, String str, String str2, String str3) {
        this.status = linkExitMetadataStatus;
        this.institution = linkInstitution;
        this.linkSessionId = str;
        this.requestId = str2;
        this.metadataJson = str3;
    }

    public static /* synthetic */ LinkExitMetadata copy$default(LinkExitMetadata linkExitMetadata, LinkExitMetadataStatus linkExitMetadataStatus, LinkInstitution linkInstitution, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkExitMetadataStatus = linkExitMetadata.status;
        }
        if ((i11 & 2) != 0) {
            linkInstitution = linkExitMetadata.institution;
        }
        LinkInstitution linkInstitution2 = linkInstitution;
        if ((i11 & 4) != 0) {
            str = linkExitMetadata.linkSessionId;
        }
        String str4 = str;
        if ((i11 & 8) != 0) {
            str2 = linkExitMetadata.requestId;
        }
        String str5 = str2;
        if ((i11 & 16) != 0) {
            str3 = linkExitMetadata.metadataJson;
        }
        return linkExitMetadata.copy(linkExitMetadataStatus, linkInstitution2, str4, str5, str3);
    }

    public final LinkExitMetadataStatus component1() {
        return this.status;
    }

    public final LinkInstitution component2() {
        return this.institution;
    }

    public final String component3() {
        return this.linkSessionId;
    }

    public final String component4() {
        return this.requestId;
    }

    public final String component5() {
        return this.metadataJson;
    }

    public final LinkExitMetadata copy(LinkExitMetadataStatus linkExitMetadataStatus, LinkInstitution linkInstitution, String str, String str2, String str3) {
        return new LinkExitMetadata(linkExitMetadataStatus, linkInstitution, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkExitMetadata) {
            LinkExitMetadata linkExitMetadata = (LinkExitMetadata) obj;
            return s.c(this.status, linkExitMetadata.status) && s.c(this.institution, linkExitMetadata.institution) && s.c(this.linkSessionId, linkExitMetadata.linkSessionId) && s.c(this.requestId, linkExitMetadata.requestId) && s.c(this.metadataJson, linkExitMetadata.metadataJson);
        }
        return false;
    }

    public final LinkInstitution getInstitution() {
        return this.institution;
    }

    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    public final String getMetadataJson() {
        return this.metadataJson;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final LinkExitMetadataStatus getStatus() {
        return this.status;
    }

    public int hashCode() {
        LinkExitMetadataStatus linkExitMetadataStatus = this.status;
        int hashCode = (linkExitMetadataStatus == null ? 0 : linkExitMetadataStatus.hashCode()) * 31;
        LinkInstitution linkInstitution = this.institution;
        int hashCode2 = (hashCode + (linkInstitution == null ? 0 : linkInstitution.hashCode())) * 31;
        String str = this.linkSessionId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestId;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.metadataJson;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkExitMetadata(status=");
        a11.append(this.status);
        a11.append(", institution=");
        a11.append(this.institution);
        a11.append(", linkSessionId=");
        a11.append((Object) this.linkSessionId);
        a11.append(", requestId=");
        a11.append((Object) this.requestId);
        a11.append(", metadataJson=");
        a11.append((Object) this.metadataJson);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeParcelable(this.status, i11);
        LinkInstitution linkInstitution = this.institution;
        if (linkInstitution == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkInstitution.writeToParcel(out, i11);
        }
        out.writeString(this.linkSessionId);
        out.writeString(this.requestId);
        out.writeString(this.metadataJson);
    }

    public /* synthetic */ LinkExitMetadata(LinkExitMetadataStatus linkExitMetadataStatus, LinkInstitution linkInstitution, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : linkExitMetadataStatus, (i11 & 2) != 0 ? null : linkInstitution, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3);
    }
}