package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LinkSuccessMetadata implements Parcelable {
    public static final Parcelable.Creator<LinkSuccessMetadata> CREATOR = new Creator();
    private final List<LinkAccount> accounts;
    private final LinkInstitution institution;
    private final String linkSessionId;
    private final String metadataJson;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LinkSuccessMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkSuccessMetadata createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            LinkInstitution createFromParcel = parcel.readInt() == 0 ? null : LinkInstitution.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(LinkAccount.CREATOR.createFromParcel(parcel));
            }
            return new LinkSuccessMetadata(createFromParcel, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkSuccessMetadata[] newArray(int i11) {
            return new LinkSuccessMetadata[i11];
        }
    }

    public LinkSuccessMetadata(LinkInstitution linkInstitution, List<LinkAccount> accounts, String linkSessionId, String metadataJson) {
        s.g(accounts, "accounts");
        s.g(linkSessionId, "linkSessionId");
        s.g(metadataJson, "metadataJson");
        this.institution = linkInstitution;
        this.accounts = accounts;
        this.linkSessionId = linkSessionId;
        this.metadataJson = metadataJson;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkSuccessMetadata copy$default(LinkSuccessMetadata linkSuccessMetadata, LinkInstitution linkInstitution, List list, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkInstitution = linkSuccessMetadata.institution;
        }
        if ((i11 & 2) != 0) {
            list = linkSuccessMetadata.accounts;
        }
        if ((i11 & 4) != 0) {
            str = linkSuccessMetadata.linkSessionId;
        }
        if ((i11 & 8) != 0) {
            str2 = linkSuccessMetadata.metadataJson;
        }
        return linkSuccessMetadata.copy(linkInstitution, list, str, str2);
    }

    public final LinkInstitution component1() {
        return this.institution;
    }

    public final List<LinkAccount> component2() {
        return this.accounts;
    }

    public final String component3() {
        return this.linkSessionId;
    }

    public final String component4() {
        return this.metadataJson;
    }

    public final LinkSuccessMetadata copy(LinkInstitution linkInstitution, List<LinkAccount> accounts, String linkSessionId, String metadataJson) {
        s.g(accounts, "accounts");
        s.g(linkSessionId, "linkSessionId");
        s.g(metadataJson, "metadataJson");
        return new LinkSuccessMetadata(linkInstitution, accounts, linkSessionId, metadataJson);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkSuccessMetadata) {
            LinkSuccessMetadata linkSuccessMetadata = (LinkSuccessMetadata) obj;
            return s.c(this.institution, linkSuccessMetadata.institution) && s.c(this.accounts, linkSuccessMetadata.accounts) && s.c(this.linkSessionId, linkSuccessMetadata.linkSessionId) && s.c(this.metadataJson, linkSuccessMetadata.metadataJson);
        }
        return false;
    }

    public final List<LinkAccount> getAccounts() {
        return this.accounts;
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

    public int hashCode() {
        LinkInstitution linkInstitution = this.institution;
        int hashCode = linkInstitution == null ? 0 : linkInstitution.hashCode();
        int hashCode2 = this.accounts.hashCode();
        return this.metadataJson.hashCode() + ((this.linkSessionId.hashCode() + ((hashCode2 + (hashCode * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkSuccessMetadata(institution=");
        a11.append(this.institution);
        a11.append(", accounts=");
        a11.append(this.accounts);
        a11.append(", linkSessionId=");
        a11.append(this.linkSessionId);
        a11.append(", metadataJson=");
        a11.append(this.metadataJson);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        LinkInstitution linkInstitution = this.institution;
        if (linkInstitution == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkInstitution.writeToParcel(out, i11);
        }
        List<LinkAccount> list = this.accounts;
        out.writeInt(list.size());
        for (LinkAccount linkAccount : list) {
            linkAccount.writeToParcel(out, i11);
        }
        out.writeString(this.linkSessionId);
        out.writeString(this.metadataJson);
    }
}