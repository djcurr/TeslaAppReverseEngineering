package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.d7;
import com.plaid.internal.g4;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExitMetadataStatus;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LinkExit implements LinkResult {
    private final LinkError error;
    private final LinkExitMetadata metadata;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LinkExit> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkExit fromMap$link_sdk_release(Map<String, String> linkData) {
            LinkError linkError;
            String a11;
            String a12;
            String a13;
            LinkInstitution linkInstitution;
            String a14;
            String a15;
            String a16;
            String a17;
            String a18;
            String a19;
            String a21;
            s.g(linkData, "linkData");
            if (linkData.get("error_code") != null) {
                LinkErrorCode.Companion companion = LinkErrorCode.Companion;
                a17 = d7.a(linkData, "error_code", (r3 & 2) != 0 ? "" : null);
                LinkErrorCode convert = companion.convert(a17);
                a18 = d7.a(linkData, "error_message", (r3 & 2) != 0 ? "" : null);
                a19 = d7.a(linkData, "error_display_message", (r3 & 2) != 0 ? "" : null);
                a21 = d7.a(linkData, "error_json", (r3 & 2) != 0 ? "" : null);
                linkError = new LinkError(convert, a18, a19, a21);
            } else {
                linkError = null;
            }
            LinkExitMetadataStatus.Companion companion2 = LinkExitMetadataStatus.Companion;
            a11 = d7.a(linkData, PermissionsResponse.STATUS_KEY, (r3 & 2) != 0 ? "" : null);
            LinkExitMetadataStatus fromString = companion2.fromString(a11);
            a12 = d7.a(linkData, "institution_id", (r3 & 2) != 0 ? "" : null);
            a13 = d7.a(linkData, "institution_name", (r3 & 2) != 0 ? "" : null);
            boolean z11 = false;
            if (!(a12 == null || a12.length() == 0)) {
                if (a13 == null || a13.length() == 0) {
                    z11 = true;
                }
                if (!z11) {
                    linkInstitution = new LinkInstitution(a12, a13);
                    a14 = d7.a(linkData, "link_session_id", (r3 & 2) != 0 ? "" : null);
                    a15 = d7.a(linkData, "request_id", (r3 & 2) != 0 ? "" : null);
                    a16 = d7.a(linkData, "metadata_json", (r3 & 2) != 0 ? "" : null);
                    return new LinkExit(linkError, new LinkExitMetadata(fromString, linkInstitution, a14, a15, a16));
                }
            }
            linkInstitution = null;
            a14 = d7.a(linkData, "link_session_id", (r3 & 2) != 0 ? "" : null);
            a15 = d7.a(linkData, "request_id", (r3 & 2) != 0 ? "" : null);
            a16 = d7.a(linkData, "metadata_json", (r3 & 2) != 0 ? "" : null);
            return new LinkExit(linkError, new LinkExitMetadata(fromString, linkInstitution, a14, a15, a16));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LinkExit> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkExit createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new LinkExit(parcel.readInt() == 0 ? null : LinkError.CREATOR.createFromParcel(parcel), LinkExitMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkExit[] newArray(int i11) {
            return new LinkExit[i11];
        }
    }

    public LinkExit() {
        this(null, null, 3, null);
    }

    public LinkExit(LinkError linkError, LinkExitMetadata metadata) {
        s.g(metadata, "metadata");
        this.error = linkError;
        this.metadata = metadata;
    }

    public static /* synthetic */ LinkExit copy$default(LinkExit linkExit, LinkError linkError, LinkExitMetadata linkExitMetadata, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkError = linkExit.error;
        }
        if ((i11 & 2) != 0) {
            linkExitMetadata = linkExit.metadata;
        }
        return linkExit.copy(linkError, linkExitMetadata);
    }

    public final LinkError component1() {
        return this.error;
    }

    public final LinkExitMetadata component2() {
        return this.metadata;
    }

    public final LinkExit copy(LinkError linkError, LinkExitMetadata metadata) {
        s.g(metadata, "metadata");
        return new LinkExit(linkError, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkExit) {
            LinkExit linkExit = (LinkExit) obj;
            return s.c(this.error, linkExit.error) && s.c(this.metadata, linkExit.metadata);
        }
        return false;
    }

    public final LinkError getError() {
        return this.error;
    }

    public final LinkExitMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        LinkError linkError = this.error;
        return this.metadata.hashCode() + ((linkError == null ? 0 : linkError.hashCode()) * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkExit(error=");
        a11.append(this.error);
        a11.append(", metadata=");
        a11.append(this.metadata);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        LinkError linkError = this.error;
        if (linkError == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkError.writeToParcel(out, i11);
        }
        this.metadata.writeToParcel(out, i11);
    }

    public /* synthetic */ LinkExit(LinkError linkError, LinkExitMetadata linkExitMetadata, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : linkError, (i11 & 2) != 0 ? new LinkExitMetadata(null, null, null, null, null, 15, null) : linkExitMetadata);
    }
}