package com.stripe.android.stripe3ds2.init;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class AppInfo implements Parcelable {
    public static final Parcelable.Creator<AppInfo> CREATOR = new Creator();
    private final String sdkAppId;
    private final int version;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<AppInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppInfo createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new AppInfo(parcel.readString(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppInfo[] newArray(int i11) {
            return new AppInfo[i11];
        }
    }

    public AppInfo(String sdkAppId, int i11) {
        s.g(sdkAppId, "sdkAppId");
        this.sdkAppId = sdkAppId;
        this.version = i11;
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = appInfo.sdkAppId;
        }
        if ((i12 & 2) != 0) {
            i11 = appInfo.version;
        }
        return appInfo.copy(str, i11);
    }

    public final String component1() {
        return this.sdkAppId;
    }

    public final int component2() {
        return this.version;
    }

    public final AppInfo copy(String sdkAppId, int i11) {
        s.g(sdkAppId, "sdkAppId");
        return new AppInfo(sdkAppId, i11);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppInfo) {
            AppInfo appInfo = (AppInfo) obj;
            return s.c(this.sdkAppId, appInfo.sdkAppId) && this.version == appInfo.version;
        }
        return false;
    }

    public final String getSdkAppId() {
        return this.sdkAppId;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (this.sdkAppId.hashCode() * 31) + Integer.hashCode(this.version);
    }

    public String toString() {
        return "AppInfo(sdkAppId=" + this.sdkAppId + ", version=" + this.version + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.sdkAppId);
        out.writeInt(this.version);
    }
}