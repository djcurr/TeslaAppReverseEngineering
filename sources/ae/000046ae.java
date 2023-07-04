package com.plaid.link.event;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.d7;
import com.plaid.internal.g4;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.event.LinkEventViewName;
import com.stripe.android.networking.FraudDetectionData;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class LinkEvent implements Parcelable {
    private final LinkEventName eventName;
    private final LinkEventMetadata metadata;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LinkEvent> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getTimestamp() {
            String format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.ENGLISH).format(new Date());
            s.f(format, "SimpleDateFormat(\"yyyy-M…e.ENGLISH).format(Date())");
            return format;
        }

        public final LinkEvent fromMap$link_sdk_release(Map<String, String> linkData) {
            String a11;
            String a12;
            String a13;
            String a14;
            String a15;
            String a16;
            String a17;
            String a18;
            String a19;
            String a21;
            String a22;
            String a23;
            String a24;
            s.g(linkData, "linkData");
            LinkEventName.Companion companion = LinkEventName.Companion;
            a11 = d7.a(linkData, "event_name", (r3 & 2) != 0 ? "" : null);
            LinkEventName fromString$link_sdk_release = companion.fromString$link_sdk_release(a11);
            a12 = d7.a(linkData, "error_code", (r3 & 2) != 0 ? "" : null);
            a13 = d7.a(linkData, "error_message", (r3 & 2) != 0 ? "" : null);
            a14 = d7.a(linkData, "error_type", (r3 & 2) != 0 ? "" : null);
            a15 = d7.a(linkData, "exit_status", (r3 & 2) != 0 ? "" : null);
            a16 = d7.a(linkData, "institution_id", (r3 & 2) != 0 ? "" : null);
            a17 = d7.a(linkData, "institution_name", (r3 & 2) != 0 ? "" : null);
            a18 = d7.a(linkData, "institution_search_query", (r3 & 2) != 0 ? "" : null);
            a19 = d7.a(linkData, "link_session_id", (r3 & 2) != 0 ? "" : null);
            a21 = d7.a(linkData, "mfa_type", (r3 & 2) != 0 ? "" : null);
            a22 = d7.a(linkData, "request_id", (r3 & 2) != 0 ? "" : null);
            String a25 = d7.a(linkData, FraudDetectionData.KEY_TIMESTAMP, getTimestamp());
            LinkEventViewName.Companion companion2 = LinkEventViewName.Companion;
            a23 = d7.a(linkData, "view_name", (r3 & 2) != 0 ? "" : null);
            LinkEventViewName fromString$link_sdk_release2 = companion2.fromString$link_sdk_release(a23);
            a24 = d7.a(linkData, "metadata_json", (r3 & 2) != 0 ? "" : null);
            return new LinkEvent(fromString$link_sdk_release, new LinkEventMetadata(null, a12, a13, a14, a15, a16, a17, a18, a19, a21, a22, null, a25, fromString$link_sdk_release2, a24, null, 34817, null));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LinkEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEvent createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new LinkEvent((LinkEventName) parcel.readParcelable(LinkEvent.class.getClassLoader()), LinkEventMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEvent[] newArray(int i11) {
            return new LinkEvent[i11];
        }
    }

    public LinkEvent(LinkEventName eventName, LinkEventMetadata metadata) {
        s.g(eventName, "eventName");
        s.g(metadata, "metadata");
        this.eventName = eventName;
        this.metadata = metadata;
    }

    public static /* synthetic */ LinkEvent copy$default(LinkEvent linkEvent, LinkEventName linkEventName, LinkEventMetadata linkEventMetadata, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            linkEventName = linkEvent.eventName;
        }
        if ((i11 & 2) != 0) {
            linkEventMetadata = linkEvent.metadata;
        }
        return linkEvent.copy(linkEventName, linkEventMetadata);
    }

    public final LinkEventName component1() {
        return this.eventName;
    }

    public final LinkEventMetadata component2() {
        return this.metadata;
    }

    public final LinkEvent copy(LinkEventName eventName, LinkEventMetadata metadata) {
        s.g(eventName, "eventName");
        s.g(metadata, "metadata");
        return new LinkEvent(eventName, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkEvent) {
            LinkEvent linkEvent = (LinkEvent) obj;
            return s.c(this.eventName, linkEvent.eventName) && s.c(this.metadata, linkEvent.metadata);
        }
        return false;
    }

    public final LinkEventName getEventName() {
        return this.eventName;
    }

    public final LinkEventMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.eventName.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkEvent(eventName=");
        a11.append(this.eventName);
        a11.append(", metadata=");
        a11.append(this.metadata);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeParcelable(this.eventName, i11);
        this.metadata.writeToParcel(out, i11);
    }
}