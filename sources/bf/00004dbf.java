package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import c30.b;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import com.tesla.TeslaV4.BuildConfig;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import g30.u1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

@a
/* loaded from: classes2.dex */
public final class FinancialConnectionsAccount extends PaymentAccount implements StripeModel {
    public static final String OBJECT_NEW = "financial_connections.account";
    public static final String OBJECT_OLD = "linked_account";
    private final Balance balance;
    private final BalanceRefresh balanceRefresh;
    private final Category category;
    private final int created;
    private final String displayName;

    /* renamed from: id  reason: collision with root package name */
    private final String f20907id;
    private final String institutionName;
    private final String last4;
    private final boolean livemode;
    private final String ownership;
    private final OwnershipRefresh ownershipRefresh;
    private final List<Permissions> permissions;
    private final Status status;
    private final Subcategory subcategory;
    private final List<SupportedPaymentMethodTypes> supportedPaymentMethodTypes;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsAccount> CREATOR = new Creator();

    @a
    /* loaded from: classes2.dex */
    public enum Category {
        CASH("cash"),
        CREDIT("credit"),
        INVESTMENT("investment"),
        OTHER("other"),
        UNKNOWN("unknown");
        
        public static final Companion Companion = new Companion(null);
        private final String value;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b<Category> serializer() {
                return FinancialConnectionsAccount$Category$$serializer.INSTANCE;
            }
        }

        Category(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<FinancialConnectionsAccount> serializer() {
            return FinancialConnectionsAccount$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAccount createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            Category valueOf = Category.valueOf(parcel.readString());
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            boolean z11 = parcel.readInt() != 0;
            Status valueOf2 = Status.valueOf(parcel.readString());
            Subcategory valueOf3 = Subcategory.valueOf(parcel.readString());
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                arrayList.add(SupportedPaymentMethodTypes.valueOf(parcel.readString()));
            }
            ArrayList arrayList2 = null;
            Balance createFromParcel = parcel.readInt() == 0 ? null : Balance.CREATOR.createFromParcel(parcel);
            BalanceRefresh createFromParcel2 = parcel.readInt() == 0 ? null : BalanceRefresh.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            OwnershipRefresh createFromParcel3 = parcel.readInt() == 0 ? null : OwnershipRefresh.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt3 = parcel.readInt();
                arrayList2 = new ArrayList(readInt3);
                int i12 = 0;
                while (i12 != readInt3) {
                    arrayList2.add(Permissions.valueOf(parcel.readString()));
                    i12++;
                    readInt3 = readInt3;
                }
            }
            return new FinancialConnectionsAccount(valueOf, readInt, readString, readString2, z11, valueOf2, valueOf3, arrayList, createFromParcel, createFromParcel2, readString3, readString4, readString5, createFromParcel3, arrayList2);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAccount[] newArray(int i11) {
            return new FinancialConnectionsAccount[i11];
        }
    }

    @a
    /* loaded from: classes2.dex */
    public enum Permissions {
        BALANCES("balances"),
        OWNERSHIP(BuildConfig.AUTH_OPENID_CLIENT_ID),
        PAYMENT_METHOD("payment_method"),
        TRANSACTIONS("transactions"),
        UNKNOWN("unknown");
        
        public static final Companion Companion = new Companion(null);
        private final String value;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b<Permissions> serializer() {
                return FinancialConnectionsAccount$Permissions$$serializer.INSTANCE;
            }
        }

        Permissions(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @a
    /* loaded from: classes2.dex */
    public enum Status {
        ACTIVE("active"),
        DISCONNECTED("disconnected"),
        INACTIVE("inactive"),
        UNKNOWN("unknown");
        
        public static final Companion Companion = new Companion(null);
        private final String value;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b<Status> serializer() {
                return FinancialConnectionsAccount$Status$$serializer.INSTANCE;
            }
        }

        Status(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @a
    /* loaded from: classes2.dex */
    public enum Subcategory {
        CHECKING("checking"),
        CREDIT_CARD("credit_card"),
        LINE_OF_CREDIT("line_of_credit"),
        MORTGAGE("mortgage"),
        OTHER("other"),
        SAVINGS("savings"),
        UNKNOWN("unknown");
        
        public static final Companion Companion = new Companion(null);
        private final String value;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b<Subcategory> serializer() {
                return FinancialConnectionsAccount$Subcategory$$serializer.INSTANCE;
            }
        }

        Subcategory(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    @a
    /* loaded from: classes2.dex */
    public enum SupportedPaymentMethodTypes {
        LINK("link"),
        US_BANK_ACCOUNT("us_bank_account"),
        UNKNOWN("unknown");
        
        public static final Companion Companion = new Companion(null);
        private final String value;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b<SupportedPaymentMethodTypes> serializer() {
                return FinancialConnectionsAccount$SupportedPaymentMethodTypes$$serializer.INSTANCE;
            }
        }

        SupportedPaymentMethodTypes(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FinancialConnectionsAccount(int i11, Category category, int i12, String str, String str2, boolean z11, Status status, Subcategory subcategory, List list, Balance balance, BalanceRefresh balanceRefresh, String str3, String str4, String str5, OwnershipRefresh ownershipRefresh, List list2, q1 q1Var) {
        super(null);
        if (158 != (i11 & 158)) {
            f1.a(i11, 158, FinancialConnectionsAccount$$serializer.INSTANCE.getDescriptor());
        }
        this.category = (i11 & 1) == 0 ? Category.UNKNOWN : category;
        this.created = i12;
        this.f20907id = str;
        this.institutionName = str2;
        this.livemode = z11;
        this.status = (i11 & 32) == 0 ? Status.UNKNOWN : status;
        this.subcategory = (i11 & 64) == 0 ? Subcategory.UNKNOWN : subcategory;
        this.supportedPaymentMethodTypes = list;
        if ((i11 & 256) == 0) {
            this.balance = null;
        } else {
            this.balance = balance;
        }
        if ((i11 & 512) == 0) {
            this.balanceRefresh = null;
        } else {
            this.balanceRefresh = balanceRefresh;
        }
        if ((i11 & 1024) == 0) {
            this.displayName = null;
        } else {
            this.displayName = str3;
        }
        if ((i11 & 2048) == 0) {
            this.last4 = null;
        } else {
            this.last4 = str4;
        }
        if ((i11 & 4096) == 0) {
            this.ownership = null;
        } else {
            this.ownership = str5;
        }
        if ((i11 & PKIFailureInfo.certRevoked) == 0) {
            this.ownershipRefresh = null;
        } else {
            this.ownershipRefresh = ownershipRefresh;
        }
        if ((i11 & 16384) == 0) {
            this.permissions = null;
        } else {
            this.permissions = list2;
        }
    }

    public static /* synthetic */ void getBalance$annotations() {
    }

    public static /* synthetic */ void getBalanceRefresh$annotations() {
    }

    public static /* synthetic */ void getCategory$annotations() {
    }

    public static /* synthetic */ void getCreated$annotations() {
    }

    public static /* synthetic */ void getDisplayName$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getInstitutionName$annotations() {
    }

    public static /* synthetic */ void getLast4$annotations() {
    }

    public static /* synthetic */ void getLivemode$annotations() {
    }

    public static /* synthetic */ void getOwnership$annotations() {
    }

    public static /* synthetic */ void getOwnershipRefresh$annotations() {
    }

    public static /* synthetic */ void getPermissions$annotations() {
    }

    public static /* synthetic */ void getStatus$annotations() {
    }

    public static /* synthetic */ void getSubcategory$annotations() {
    }

    public static /* synthetic */ void getSupportedPaymentMethodTypes$annotations() {
    }

    public static final void write$Self(FinancialConnectionsAccount self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        if (output.k(serialDesc, 0) || self.category != Category.UNKNOWN) {
            output.q(serialDesc, 0, FinancialConnectionsAccount$Category$$serializer.INSTANCE, self.category);
        }
        output.n(serialDesc, 1, self.created);
        output.p(serialDesc, 2, self.f20907id);
        output.p(serialDesc, 3, self.institutionName);
        output.C(serialDesc, 4, self.livemode);
        if (output.k(serialDesc, 5) || self.status != Status.UNKNOWN) {
            output.q(serialDesc, 5, FinancialConnectionsAccount$Status$$serializer.INSTANCE, self.status);
        }
        if (output.k(serialDesc, 6) || self.subcategory != Subcategory.UNKNOWN) {
            output.q(serialDesc, 6, FinancialConnectionsAccount$Subcategory$$serializer.INSTANCE, self.subcategory);
        }
        output.q(serialDesc, 7, new g30.f(FinancialConnectionsAccount$SupportedPaymentMethodTypes$$serializer.INSTANCE), self.supportedPaymentMethodTypes);
        if (output.k(serialDesc, 8) || self.balance != null) {
            output.D(serialDesc, 8, Balance$$serializer.INSTANCE, self.balance);
        }
        if (output.k(serialDesc, 9) || self.balanceRefresh != null) {
            output.D(serialDesc, 9, BalanceRefresh$$serializer.INSTANCE, self.balanceRefresh);
        }
        if (output.k(serialDesc, 10) || self.displayName != null) {
            output.D(serialDesc, 10, u1.f27647a, self.displayName);
        }
        if (output.k(serialDesc, 11) || self.last4 != null) {
            output.D(serialDesc, 11, u1.f27647a, self.last4);
        }
        if (output.k(serialDesc, 12) || self.ownership != null) {
            output.D(serialDesc, 12, u1.f27647a, self.ownership);
        }
        if (output.k(serialDesc, 13) || self.ownershipRefresh != null) {
            output.D(serialDesc, 13, OwnershipRefresh$$serializer.INSTANCE, self.ownershipRefresh);
        }
        if (output.k(serialDesc, 14) || self.permissions != null) {
            output.D(serialDesc, 14, new g30.f(FinancialConnectionsAccount$Permissions$$serializer.INSTANCE), self.permissions);
        }
    }

    public final Category component1() {
        return this.category;
    }

    public final BalanceRefresh component10() {
        return this.balanceRefresh;
    }

    public final String component11() {
        return this.displayName;
    }

    public final String component12() {
        return this.last4;
    }

    public final String component13() {
        return this.ownership;
    }

    public final OwnershipRefresh component14() {
        return this.ownershipRefresh;
    }

    public final List<Permissions> component15() {
        return this.permissions;
    }

    public final int component2() {
        return this.created;
    }

    public final String component3() {
        return this.f20907id;
    }

    public final String component4() {
        return this.institutionName;
    }

    public final boolean component5() {
        return this.livemode;
    }

    public final Status component6() {
        return this.status;
    }

    public final Subcategory component7() {
        return this.subcategory;
    }

    public final List<SupportedPaymentMethodTypes> component8() {
        return this.supportedPaymentMethodTypes;
    }

    public final Balance component9() {
        return this.balance;
    }

    public final FinancialConnectionsAccount copy(Category category, int i11, String id2, String institutionName, boolean z11, Status status, Subcategory subcategory, List<? extends SupportedPaymentMethodTypes> supportedPaymentMethodTypes, Balance balance, BalanceRefresh balanceRefresh, String str, String str2, String str3, OwnershipRefresh ownershipRefresh, List<? extends Permissions> list) {
        s.g(category, "category");
        s.g(id2, "id");
        s.g(institutionName, "institutionName");
        s.g(status, "status");
        s.g(subcategory, "subcategory");
        s.g(supportedPaymentMethodTypes, "supportedPaymentMethodTypes");
        return new FinancialConnectionsAccount(category, i11, id2, institutionName, z11, status, subcategory, supportedPaymentMethodTypes, balance, balanceRefresh, str, str2, str3, ownershipRefresh, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FinancialConnectionsAccount) {
            FinancialConnectionsAccount financialConnectionsAccount = (FinancialConnectionsAccount) obj;
            return this.category == financialConnectionsAccount.category && this.created == financialConnectionsAccount.created && s.c(this.f20907id, financialConnectionsAccount.f20907id) && s.c(this.institutionName, financialConnectionsAccount.institutionName) && this.livemode == financialConnectionsAccount.livemode && this.status == financialConnectionsAccount.status && this.subcategory == financialConnectionsAccount.subcategory && s.c(this.supportedPaymentMethodTypes, financialConnectionsAccount.supportedPaymentMethodTypes) && s.c(this.balance, financialConnectionsAccount.balance) && s.c(this.balanceRefresh, financialConnectionsAccount.balanceRefresh) && s.c(this.displayName, financialConnectionsAccount.displayName) && s.c(this.last4, financialConnectionsAccount.last4) && s.c(this.ownership, financialConnectionsAccount.ownership) && s.c(this.ownershipRefresh, financialConnectionsAccount.ownershipRefresh) && s.c(this.permissions, financialConnectionsAccount.permissions);
        }
        return false;
    }

    public final Balance getBalance() {
        return this.balance;
    }

    public final BalanceRefresh getBalanceRefresh() {
        return this.balanceRefresh;
    }

    public final Category getCategory() {
        return this.category;
    }

    public final int getCreated() {
        return this.created;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getId() {
        return this.f20907id;
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getLast4() {
        return this.last4;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final String getOwnership() {
        return this.ownership;
    }

    public final OwnershipRefresh getOwnershipRefresh() {
        return this.ownershipRefresh;
    }

    public final List<Permissions> getPermissions() {
        return this.permissions;
    }

    public final Status getStatus() {
        return this.status;
    }

    public final Subcategory getSubcategory() {
        return this.subcategory;
    }

    public final List<SupportedPaymentMethodTypes> getSupportedPaymentMethodTypes() {
        return this.supportedPaymentMethodTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((((this.category.hashCode() * 31) + Integer.hashCode(this.created)) * 31) + this.f20907id.hashCode()) * 31) + this.institutionName.hashCode()) * 31;
        boolean z11 = this.livemode;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode2 = (((((((hashCode + i11) * 31) + this.status.hashCode()) * 31) + this.subcategory.hashCode()) * 31) + this.supportedPaymentMethodTypes.hashCode()) * 31;
        Balance balance = this.balance;
        int hashCode3 = (hashCode2 + (balance == null ? 0 : balance.hashCode())) * 31;
        BalanceRefresh balanceRefresh = this.balanceRefresh;
        int hashCode4 = (hashCode3 + (balanceRefresh == null ? 0 : balanceRefresh.hashCode())) * 31;
        String str = this.displayName;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.last4;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ownership;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        OwnershipRefresh ownershipRefresh = this.ownershipRefresh;
        int hashCode8 = (hashCode7 + (ownershipRefresh == null ? 0 : ownershipRefresh.hashCode())) * 31;
        List<Permissions> list = this.permissions;
        return hashCode8 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsAccount(category=" + this.category + ", created=" + this.created + ", id=" + this.f20907id + ", institutionName=" + this.institutionName + ", livemode=" + this.livemode + ", status=" + this.status + ", subcategory=" + this.subcategory + ", supportedPaymentMethodTypes=" + this.supportedPaymentMethodTypes + ", balance=" + this.balance + ", balanceRefresh=" + this.balanceRefresh + ", displayName=" + ((Object) this.displayName) + ", last4=" + ((Object) this.last4) + ", ownership=" + ((Object) this.ownership) + ", ownershipRefresh=" + this.ownershipRefresh + ", permissions=" + this.permissions + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.category.name());
        out.writeInt(this.created);
        out.writeString(this.f20907id);
        out.writeString(this.institutionName);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeString(this.status.name());
        out.writeString(this.subcategory.name());
        List<SupportedPaymentMethodTypes> list = this.supportedPaymentMethodTypes;
        out.writeInt(list.size());
        for (SupportedPaymentMethodTypes supportedPaymentMethodTypes : list) {
            out.writeString(supportedPaymentMethodTypes.name());
        }
        Balance balance = this.balance;
        if (balance == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            balance.writeToParcel(out, i11);
        }
        BalanceRefresh balanceRefresh = this.balanceRefresh;
        if (balanceRefresh == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            balanceRefresh.writeToParcel(out, i11);
        }
        out.writeString(this.displayName);
        out.writeString(this.last4);
        out.writeString(this.ownership);
        OwnershipRefresh ownershipRefresh = this.ownershipRefresh;
        if (ownershipRefresh == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            ownershipRefresh.writeToParcel(out, i11);
        }
        List<Permissions> list2 = this.permissions;
        if (list2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list2.size());
        for (Permissions permissions : list2) {
            out.writeString(permissions.name());
        }
    }

    public /* synthetic */ FinancialConnectionsAccount(Category category, int i11, String str, String str2, boolean z11, Status status, Subcategory subcategory, List list, Balance balance, BalanceRefresh balanceRefresh, String str3, String str4, String str5, OwnershipRefresh ownershipRefresh, List list2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? Category.UNKNOWN : category, i11, str, str2, z11, (i12 & 32) != 0 ? Status.UNKNOWN : status, (i12 & 64) != 0 ? Subcategory.UNKNOWN : subcategory, list, (i12 & 256) != 0 ? null : balance, (i12 & 512) != 0 ? null : balanceRefresh, (i12 & 1024) != 0 ? null : str3, (i12 & 2048) != 0 ? null : str4, (i12 & 4096) != 0 ? null : str5, (i12 & PKIFailureInfo.certRevoked) != 0 ? null : ownershipRefresh, (i12 & 16384) != 0 ? null : list2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FinancialConnectionsAccount(Category category, int i11, String id2, String institutionName, boolean z11, Status status, Subcategory subcategory, List<? extends SupportedPaymentMethodTypes> supportedPaymentMethodTypes, Balance balance, BalanceRefresh balanceRefresh, String str, String str2, String str3, OwnershipRefresh ownershipRefresh, List<? extends Permissions> list) {
        super(null);
        s.g(category, "category");
        s.g(id2, "id");
        s.g(institutionName, "institutionName");
        s.g(status, "status");
        s.g(subcategory, "subcategory");
        s.g(supportedPaymentMethodTypes, "supportedPaymentMethodTypes");
        this.category = category;
        this.created = i11;
        this.f20907id = id2;
        this.institutionName = institutionName;
        this.livemode = z11;
        this.status = status;
        this.subcategory = subcategory;
        this.supportedPaymentMethodTypes = supportedPaymentMethodTypes;
        this.balance = balance;
        this.balanceRefresh = balanceRefresh;
        this.displayName = str;
        this.last4 = str2;
        this.ownership = str3;
        this.ownershipRefresh = ownershipRefresh;
        this.permissions = list;
    }
}