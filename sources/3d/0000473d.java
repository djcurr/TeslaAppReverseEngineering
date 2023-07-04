package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import com.plaid.internal.h4;
import com.plaid.internal.j4;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes2.dex */
public final class LinkAccount implements Parcelable {
    public static final String NO_VALUE = "no_value";
    private final LinkAccountBalance balance;

    /* renamed from: id  reason: collision with root package name */
    private final String f19992id;
    private final String mask;
    private final String name;
    private final LinkAccountSubtype subtype;
    private final LinkAccountVerificationStatus verificationStatus;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<LinkAccount> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkAccount fromResponse$link_sdk_release(h4 account) {
            s.g(account, "account");
            String f11 = account.f();
            j4 b11 = account.b();
            String a11 = b11 == null ? null : b11.a();
            j4 b12 = account.b();
            return new LinkAccount(f11, a11, b12 == null ? null : b12.b(), LinkAccountSubtype.Companion.convert(account.c(), account.d()), LinkAccountVerificationStatus.Companion.convert(account.e()), LinkAccountBalance.Companion.convert$link_sdk_release(account.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<LinkAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccount createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new LinkAccount(parcel.readString(), parcel.readString(), parcel.readString(), (LinkAccountSubtype) parcel.readParcelable(LinkAccount.class.getClassLoader()), (LinkAccountVerificationStatus) parcel.readParcelable(LinkAccount.class.getClassLoader()), parcel.readInt() == 0 ? null : LinkAccountBalance.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccount[] newArray(int i11) {
            return new LinkAccount[i11];
        }
    }

    public LinkAccount(String id2, String str, String str2, LinkAccountSubtype subtype, LinkAccountVerificationStatus linkAccountVerificationStatus, LinkAccountBalance linkAccountBalance) {
        s.g(id2, "id");
        s.g(subtype, "subtype");
        this.f19992id = id2;
        this.name = str;
        this.mask = str2;
        this.subtype = subtype;
        this.verificationStatus = linkAccountVerificationStatus;
        this.balance = linkAccountBalance;
    }

    public static /* synthetic */ LinkAccount copy$default(LinkAccount linkAccount, String str, String str2, String str3, LinkAccountSubtype linkAccountSubtype, LinkAccountVerificationStatus linkAccountVerificationStatus, LinkAccountBalance linkAccountBalance, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = linkAccount.f19992id;
        }
        if ((i11 & 2) != 0) {
            str2 = linkAccount.name;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            str3 = linkAccount.mask;
        }
        String str5 = str3;
        if ((i11 & 8) != 0) {
            linkAccountSubtype = linkAccount.subtype;
        }
        LinkAccountSubtype linkAccountSubtype2 = linkAccountSubtype;
        if ((i11 & 16) != 0) {
            linkAccountVerificationStatus = linkAccount.verificationStatus;
        }
        LinkAccountVerificationStatus linkAccountVerificationStatus2 = linkAccountVerificationStatus;
        if ((i11 & 32) != 0) {
            linkAccountBalance = linkAccount.balance;
        }
        return linkAccount.copy(str, str4, str5, linkAccountSubtype2, linkAccountVerificationStatus2, linkAccountBalance);
    }

    public final String component1() {
        return this.f19992id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.mask;
    }

    public final LinkAccountSubtype component4() {
        return this.subtype;
    }

    public final LinkAccountVerificationStatus component5() {
        return this.verificationStatus;
    }

    public final LinkAccountBalance component6() {
        return this.balance;
    }

    public final LinkAccount copy(String id2, String str, String str2, LinkAccountSubtype subtype, LinkAccountVerificationStatus linkAccountVerificationStatus, LinkAccountBalance linkAccountBalance) {
        s.g(id2, "id");
        s.g(subtype, "subtype");
        return new LinkAccount(id2, str, str2, subtype, linkAccountVerificationStatus, linkAccountBalance);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LinkAccount) {
            LinkAccount linkAccount = (LinkAccount) obj;
            return s.c(this.f19992id, linkAccount.f19992id) && s.c(this.name, linkAccount.name) && s.c(this.mask, linkAccount.mask) && s.c(this.subtype, linkAccount.subtype) && s.c(this.verificationStatus, linkAccount.verificationStatus) && s.c(this.balance, linkAccount.balance);
        }
        return false;
    }

    public final LinkAccountBalance getBalance() {
        return this.balance;
    }

    public final String getId() {
        return this.f19992id;
    }

    public final String getMask() {
        return this.mask;
    }

    public final String getName() {
        return this.name;
    }

    public final LinkAccountSubtype getSubtype() {
        return this.subtype;
    }

    public final LinkAccountVerificationStatus getVerificationStatus() {
        return this.verificationStatus;
    }

    public int hashCode() {
        int hashCode = this.f19992id.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mask;
        int hashCode3 = (this.subtype.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        LinkAccountVerificationStatus linkAccountVerificationStatus = this.verificationStatus;
        int hashCode4 = (hashCode3 + (linkAccountVerificationStatus == null ? 0 : linkAccountVerificationStatus.hashCode())) * 31;
        LinkAccountBalance linkAccountBalance = this.balance;
        return hashCode4 + (linkAccountBalance != null ? linkAccountBalance.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a11 = g4.a("LinkAccount(id=");
        a11.append(this.f19992id);
        a11.append(", name=");
        a11.append((Object) this.name);
        a11.append(", mask=");
        a11.append((Object) this.mask);
        a11.append(", subtype=");
        a11.append(this.subtype);
        a11.append(", verificationStatus=");
        a11.append(this.verificationStatus);
        a11.append(", balance=");
        a11.append(this.balance);
        a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return a11.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f19992id);
        out.writeString(this.name);
        out.writeString(this.mask);
        out.writeParcelable(this.subtype, i11);
        out.writeParcelable(this.verificationStatus, i11);
        LinkAccountBalance linkAccountBalance = this.balance;
        if (linkAccountBalance == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        linkAccountBalance.writeToParcel(out, i11);
    }

    public /* synthetic */ LinkAccount(String str, String str2, String str3, LinkAccountSubtype linkAccountSubtype, LinkAccountVerificationStatus linkAccountVerificationStatus, LinkAccountBalance linkAccountBalance, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i11 & 8) != 0 ? new LinkAccountSubtype.UNKNOWN("", new LinkAccountType.UNKNOWN("")) : linkAccountSubtype, linkAccountVerificationStatus, (i11 & 32) != 0 ? null : linkAccountBalance);
    }
}