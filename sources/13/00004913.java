package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.d7;
import com.plaid.internal.g4;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LinkSuccess implements LinkResult {
    private final LinkSuccessMetadata metadata;
    private final String publicToken;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LinkSuccess> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkSuccess fromMap$link_sdk_release(Map<String, String> linkData, List<LinkAccount> accounts) {
            String a11;
            String a12;
            String a13;
            String linkSessionId;
            String metadataJson;
            s.g(linkData, "linkData");
            s.g(accounts, "accounts");
            LinkInstitution linkInstitution = null;
            a11 = d7.a(linkData, "public_token", (r3 & 2) != 0 ? "" : null);
            a12 = d7.a(linkData, "institution_id", (r3 & 2) != 0 ? "" : null);
            a13 = d7.a(linkData, "institution_name", (r3 & 2) != 0 ? "" : null);
            linkSessionId = d7.a(linkData, "link_session_id", (r3 & 2) != 0 ? "" : null);
            metadataJson = d7.a(linkData, "metadata_json", (r3 & 2) != 0 ? "" : null);
            s.g(accounts, "accounts");
            s.g(linkSessionId, "linkSessionId");
            s.g(metadataJson, "metadataJson");
            boolean z11 = false;
            if (!(a12 == null || a12.length() == 0)) {
                if (a13 == null || a13.length() == 0) {
                    z11 = true;
                }
                if (!z11) {
                    linkInstitution = new LinkInstitution(a12, a13);
                }
            }
            return new LinkSuccess(a11, new LinkSuccessMetadata(linkInstitution, accounts, linkSessionId, metadataJson));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LinkSuccess> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkSuccess createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new LinkSuccess(parcel.readString(), LinkSuccessMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkSuccess[] newArray(int i11) {
            return new LinkSuccess[i11];
        }
    }

    public LinkSuccess(String publicToken, LinkSuccessMetadata metadata) {
        s.g(publicToken, "publicToken");
        s.g(metadata, "metadata");
        this.publicToken = publicToken;
        this.metadata = metadata;
    }

    public static /* synthetic */ LinkSuccess copy$default(LinkSuccess linkSuccess, String str, LinkSuccessMetadata linkSuccessMetadata, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = linkSuccess.publicToken;
        }
        if ((i11 & 2) != 0) {
            linkSuccessMetadata = linkSuccess.metadata;
        }
        return linkSuccess.copy(str, linkSuccessMetadata);
    }

    public final String component1() {
        return this.publicToken;
    }

    public final LinkSuccessMetadata component2() {
        return this.metadata;
    }

    public final LinkSuccess copy(String publicToken, LinkSuccessMetadata metadata) {
        s.g(publicToken, "publicToken");
        s.g(metadata, "metadata");
        return new LinkSuccess(publicToken, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkSuccess) {
            LinkSuccess linkSuccess = (LinkSuccess) obj;
            return s.c(this.publicToken, linkSuccess.publicToken) && s.c(this.metadata, linkSuccess.metadata);
        }
        return false;
    }

    public final LinkSuccessMetadata getMetadata() {
        return this.metadata;
    }

    public final String getPublicToken() {
        return this.publicToken;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.publicToken.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkSuccess(publicToken=");
        a11.append(this.publicToken);
        a11.append(", metadata=");
        a11.append(this.metadata);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.publicToken);
        this.metadata.writeToParcel(out, i11);
    }
}