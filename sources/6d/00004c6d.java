package com.stripe.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import ezvcard.property.Kind;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.e0;
import wz.r0;
import wz.s0;
import wz.w;

/* loaded from: classes2.dex */
public final class AppInfo implements Parcelable {
    private final String name;
    private final String partnerId;
    private final String url;
    private final String version;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<AppInfo> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AppInfo create$default(Companion companion, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            if ((i11 & 4) != 0) {
                str3 = null;
            }
            if ((i11 & 8) != 0) {
                str4 = null;
            }
            return companion.create(str, str2, str3, str4);
        }

        public final AppInfo create(String name) {
            s.g(name, "name");
            return create$default(this, name, null, null, null, 14, null);
        }

        public final AppInfo create(String name, String str) {
            s.g(name, "name");
            return create$default(this, name, str, null, null, 12, null);
        }

        public final AppInfo create(String name, String str, String str2) {
            s.g(name, "name");
            return create$default(this, name, str, str2, null, 8, null);
        }

        public final AppInfo create(String name, String str, String str2, String str3) {
            s.g(name, "name");
            return new AppInfo(name, str, str2, str3);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<AppInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppInfo createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new AppInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AppInfo[] newArray(int i11) {
            return new AppInfo[i11];
        }
    }

    public AppInfo(String name, String str, String str2, String str3) {
        s.g(name, "name");
        this.name = name;
        this.version = str;
        this.url = str2;
        this.partnerId = str3;
    }

    private final String component1() {
        return this.name;
    }

    private final String component2() {
        return this.version;
    }

    private final String component3() {
        return this.url;
    }

    private final String component4() {
        return this.partnerId;
    }

    public static /* synthetic */ AppInfo copy$default(AppInfo appInfo, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = appInfo.name;
        }
        if ((i11 & 2) != 0) {
            str2 = appInfo.version;
        }
        if ((i11 & 4) != 0) {
            str3 = appInfo.url;
        }
        if ((i11 & 8) != 0) {
            str4 = appInfo.partnerId;
        }
        return appInfo.copy(str, str2, str3, str4);
    }

    public static final AppInfo create(String str) {
        return Companion.create(str);
    }

    public static final AppInfo create(String str, String str2) {
        return Companion.create(str, str2);
    }

    public static final AppInfo create(String str, String str2, String str3) {
        return Companion.create(str, str2, str3);
    }

    public static final AppInfo create(String str, String str2, String str3, String str4) {
        return Companion.create(str, str2, str3, str4);
    }

    public final AppInfo copy(String name, String str, String str2, String str3) {
        s.g(name, "name");
        return new AppInfo(name, str, str2, str3);
    }

    public final Map<String, Map<String, String>> createClientHeaders$stripe_core_release() {
        Map l11;
        Map<String, Map<String, String>> f11;
        l11 = s0.l(v.a("name", this.name), v.a("version", this.version), v.a("url", this.url), v.a("partner_id", this.partnerId));
        f11 = r0.f(v.a(Kind.APPLICATION, l11));
        return f11;
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
            return s.c(this.name, appInfo.name) && s.c(this.version, appInfo.version) && s.c(this.url, appInfo.url) && s.c(this.partnerId, appInfo.partnerId);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.name.hashCode() * 31;
        String str = this.version;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.partnerId;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "AppInfo(name=" + this.name + ", version=" + ((Object) this.version) + ", url=" + ((Object) this.url) + ", partnerId=" + ((Object) this.partnerId) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final String toUserAgent$stripe_core_release() {
        List n11;
        String l02;
        String[] strArr = new String[3];
        strArr[0] = this.name;
        String str = this.version;
        String str2 = null;
        strArr[1] = str == null ? null : s.p("/", str);
        String str3 = this.url;
        if (str3 != null) {
            str2 = " (" + str3 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
        strArr[2] = str2;
        n11 = w.n(strArr);
        l02 = e0.l0(n11, "", null, null, 0, null, null, 62, null);
        return l02;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.name);
        out.writeString(this.version);
        out.writeString(this.url);
        out.writeString(this.partnerId);
    }
}