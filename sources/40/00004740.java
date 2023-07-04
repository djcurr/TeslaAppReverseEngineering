package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import com.plaid.internal.i4;
import com.plaid.internal.y6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import nn.c;

/* loaded from: classes2.dex */
public final class LinkAccountBalance implements Parcelable {
    @c("available")
    private final Double available;
    @c("currency")
    private final String currency;
    @c("current")
    private final Double current;
    @c("localized")
    private final LocalizedLinkAccountBalance localized;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LinkAccountBalance> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkAccountBalance convert$link_sdk_release(i4 i4Var) {
            if (i4Var == null) {
                return null;
            }
            Double a11 = i4Var.a();
            Double c11 = i4Var.c();
            String b11 = i4Var.b();
            y6 d11 = i4Var.d();
            String a12 = d11 == null ? null : d11.a();
            y6 d12 = i4Var.d();
            return new LinkAccountBalance(a11, c11, b11, new LocalizedLinkAccountBalance(a12, d12 != null ? d12.b() : null));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LinkAccountBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccountBalance createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new LinkAccountBalance(parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() != 0 ? LocalizedLinkAccountBalance.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccountBalance[] newArray(int i11) {
            return new LinkAccountBalance[i11];
        }
    }

    public LinkAccountBalance() {
        this(null, null, null, null, 15, null);
    }

    public LinkAccountBalance(Double d11, Double d12, String str, LocalizedLinkAccountBalance localizedLinkAccountBalance) {
        this.available = d11;
        this.current = d12;
        this.currency = str;
        this.localized = localizedLinkAccountBalance;
    }

    public static /* synthetic */ LinkAccountBalance copy$default(LinkAccountBalance linkAccountBalance, Double d11, Double d12, String str, LocalizedLinkAccountBalance localizedLinkAccountBalance, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            d11 = linkAccountBalance.available;
        }
        if ((i11 & 2) != 0) {
            d12 = linkAccountBalance.current;
        }
        if ((i11 & 4) != 0) {
            str = linkAccountBalance.currency;
        }
        if ((i11 & 8) != 0) {
            localizedLinkAccountBalance = linkAccountBalance.localized;
        }
        return linkAccountBalance.copy(d11, d12, str, localizedLinkAccountBalance);
    }

    public final Double component1() {
        return this.available;
    }

    public final Double component2() {
        return this.current;
    }

    public final String component3() {
        return this.currency;
    }

    public final LocalizedLinkAccountBalance component4() {
        return this.localized;
    }

    public final LinkAccountBalance copy(Double d11, Double d12, String str, LocalizedLinkAccountBalance localizedLinkAccountBalance) {
        return new LinkAccountBalance(d11, d12, str, localizedLinkAccountBalance);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkAccountBalance) {
            LinkAccountBalance linkAccountBalance = (LinkAccountBalance) obj;
            return s.c(this.available, linkAccountBalance.available) && s.c(this.current, linkAccountBalance.current) && s.c(this.currency, linkAccountBalance.currency) && s.c(this.localized, linkAccountBalance.localized);
        }
        return false;
    }

    public final Double getAvailable() {
        return this.available;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final Double getCurrent() {
        return this.current;
    }

    public final LocalizedLinkAccountBalance getLocalized() {
        return this.localized;
    }

    public int hashCode() {
        Double d11 = this.available;
        int hashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.current;
        int hashCode2 = (hashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
        String str = this.currency;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        LocalizedLinkAccountBalance localizedLinkAccountBalance = this.localized;
        return hashCode3 + (localizedLinkAccountBalance != null ? localizedLinkAccountBalance.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkAccountBalance(available=");
        a11.append(this.available);
        a11.append(", current=");
        a11.append(this.current);
        a11.append(", currency=");
        a11.append((Object) this.currency);
        a11.append(", localized=");
        a11.append(this.localized);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        Double d11 = this.available;
        if (d11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d11.doubleValue());
        }
        Double d12 = this.current;
        if (d12 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeDouble(d12.doubleValue());
        }
        out.writeString(this.currency);
        LocalizedLinkAccountBalance localizedLinkAccountBalance = this.localized;
        if (localizedLinkAccountBalance == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        localizedLinkAccountBalance.writeToParcel(out, i11);
    }

    public /* synthetic */ LinkAccountBalance(Double d11, Double d12, String str, LocalizedLinkAccountBalance localizedLinkAccountBalance, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : d11, (i11 & 2) != 0 ? null : d12, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : localizedLinkAccountBalance);
    }
}