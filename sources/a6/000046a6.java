package com.plaid.link.configuration;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import com.plaid.link.exception.LinkConfigurationMissingTokenException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.s0;

/* loaded from: classes2.dex */
public final class LinkTokenConfiguration implements Parcelable {
    public static final Parcelable.Creator<LinkTokenConfiguration> CREATOR = new Creator();
    private final Map<String, String> extraParams;
    private final LinkLogLevel logLevel;
    private final boolean noLoadingState;
    private final String token;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private Map<String, String> extraParams;
        private LinkLogLevel logLevel = LinkLogLevel.ASSERT;
        private boolean noLoadingState;
        private String token;

        public Builder() {
            Map<String, String> i11;
            i11 = s0.i();
            this.extraParams = i11;
        }

        public final LinkTokenConfiguration build() {
            Map v11;
            String str = this.token;
            if (str != null) {
                LinkLogLevel logLevel = getLogLevel();
                boolean noLoadingState = getNoLoadingState();
                v11 = s0.v(getExtraParams());
                return new LinkTokenConfiguration(str, logLevel, noLoadingState, v11, null);
            }
            throw LinkConfigurationMissingTokenException.INSTANCE;
        }

        public final Builder extraParams(Map<String, String> extraParams) {
            Map v11;
            s.g(extraParams, "extraParams");
            v11 = s0.v(extraParams);
            setExtraParams(v11);
            return this;
        }

        public final Map<String, String> getExtraParams() {
            return this.extraParams;
        }

        public final LinkLogLevel getLogLevel() {
            return this.logLevel;
        }

        public final boolean getNoLoadingState() {
            return this.noLoadingState;
        }

        public final String getToken() {
            return this.token;
        }

        public final Builder logLevel(LinkLogLevel logLevel) {
            s.g(logLevel, "logLevel");
            setLogLevel(logLevel);
            return this;
        }

        public final Builder noLoadingState(boolean z11) {
            setNoLoadingState(z11);
            return this;
        }

        public final /* synthetic */ void setExtraParams(Map map) {
            s.g(map, "<set-?>");
            this.extraParams = map;
        }

        public final /* synthetic */ void setLogLevel(LinkLogLevel linkLogLevel) {
            s.g(linkLogLevel, "<set-?>");
            this.logLevel = linkLogLevel;
        }

        public final /* synthetic */ void setNoLoadingState(boolean z11) {
            this.noLoadingState = z11;
        }

        public final /* synthetic */ void setToken(String str) {
            this.token = str;
        }

        public final Builder token(String token) {
            s.g(token, "token");
            setToken(token);
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LinkTokenConfiguration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkTokenConfiguration createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            String readString = parcel.readString();
            LinkLogLevel valueOf = LinkLogLevel.valueOf(parcel.readString());
            boolean z11 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new LinkTokenConfiguration(readString, valueOf, z11, linkedHashMap, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkTokenConfiguration[] newArray(int i11) {
            return new LinkTokenConfiguration[i11];
        }
    }

    private LinkTokenConfiguration(String str, LinkLogLevel linkLogLevel, boolean z11, Map<String, String> map) {
        this.token = str;
        this.logLevel = linkLogLevel;
        this.noLoadingState = z11;
        this.extraParams = map;
    }

    public /* synthetic */ LinkTokenConfiguration(String str, LinkLogLevel linkLogLevel, boolean z11, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkLogLevel, z11, map);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (s.c(LinkTokenConfiguration.class, obj == null ? null : obj.getClass())) {
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.plaid.link.configuration.LinkTokenConfiguration");
            LinkTokenConfiguration linkTokenConfiguration = (LinkTokenConfiguration) obj;
            return this.logLevel == linkTokenConfiguration.logLevel && s.c(this.token, linkTokenConfiguration.token) && this.noLoadingState == linkTokenConfiguration.noLoadingState && s.c(this.extraParams, linkTokenConfiguration.extraParams);
        }
        return false;
    }

    public final Map<String, String> getExtraParams() {
        return this.extraParams;
    }

    public final LinkLogLevel getLogLevel() {
        return this.logLevel;
    }

    public final boolean getNoLoadingState() {
        return this.noLoadingState;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return Objects.hash(this.token, this.logLevel, Boolean.valueOf(this.noLoadingState), this.extraParams);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkTokenConfiguration(token=");
        a11.append(this.token);
        a11.append(", logLevel=");
        a11.append(this.logLevel);
        a11.append(", noLoadingState=");
        a11.append(this.noLoadingState);
        a11.append(", extraParams=");
        a11.append(this.extraParams);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.token);
        out.writeString(this.logLevel.name());
        out.writeInt(this.noLoadingState ? 1 : 0);
        Map<String, String> map = this.extraParams;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public /* synthetic */ LinkTokenConfiguration(String str, LinkLogLevel linkLogLevel, boolean z11, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? LinkLogLevel.ASSERT : linkLogLevel, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? s0.i() : map);
    }
}