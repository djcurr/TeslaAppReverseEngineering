package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nn.c;

/* loaded from: classes2.dex */
public final class LocalizedLinkAccountBalance implements Parcelable {
    public static final Parcelable.Creator<LocalizedLinkAccountBalance> CREATOR = new Creator();
    @c("available")
    private final String available;
    @c("current")
    private final String current;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LocalizedLinkAccountBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizedLinkAccountBalance createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new LocalizedLinkAccountBalance(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizedLinkAccountBalance[] newArray(int i11) {
            return new LocalizedLinkAccountBalance[i11];
        }
    }

    public LocalizedLinkAccountBalance() {
        this(null, null, 3, null);
    }

    public LocalizedLinkAccountBalance(String str, String str2) {
        this.available = str;
        this.current = str2;
    }

    public static /* synthetic */ LocalizedLinkAccountBalance copy$default(LocalizedLinkAccountBalance localizedLinkAccountBalance, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = localizedLinkAccountBalance.available;
        }
        if ((i11 & 2) != 0) {
            str2 = localizedLinkAccountBalance.current;
        }
        return localizedLinkAccountBalance.copy(str, str2);
    }

    public final String component1() {
        return this.available;
    }

    public final String component2() {
        return this.current;
    }

    public final LocalizedLinkAccountBalance copy(String str, String str2) {
        return new LocalizedLinkAccountBalance(str, str2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalizedLinkAccountBalance) {
            LocalizedLinkAccountBalance localizedLinkAccountBalance = (LocalizedLinkAccountBalance) obj;
            return s.c(this.available, localizedLinkAccountBalance.available) && s.c(this.current, localizedLinkAccountBalance.current);
        }
        return false;
    }

    public final String getAvailable() {
        return this.available;
    }

    public final String getCurrent() {
        return this.current;
    }

    public int hashCode() {
        String str = this.available;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.current;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LocalizedLinkAccountBalance(available=");
        a11.append((Object) this.available);
        a11.append(", current=");
        a11.append((Object) this.current);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.available);
        out.writeString(this.current);
    }

    public /* synthetic */ LocalizedLinkAccountBalance(String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2);
    }
}