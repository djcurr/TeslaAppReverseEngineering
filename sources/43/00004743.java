package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.link.result.LinkAccountType;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.k;
import vz.m;

/* loaded from: classes2.dex */
public abstract class LinkAccountSubtype implements Parcelable {
    public static final Companion Companion = new Companion(null);
    private static final k<Map<LinkAccountType, Map<String, LinkAccountSubtype>>> accountTypeToMap$delegate;
    private static final k<Map<String, CREDIT>> creditMap$delegate;
    private static final k<Map<String, DEPOSITORY>> depositoryMap$delegate;
    private static final k<Map<String, INVESTMENT>> investmentMap$delegate;
    private static final k<Map<String, LOAN_SUBTYPE>> loanMap$delegate;
    private final LinkAccountType accountType;
    private final String json;

    /* loaded from: classes2.dex */
    public static abstract class CREDIT extends LinkAccountSubtype {

        /* loaded from: classes2.dex */
        public static final class ALL extends CREDIT {
            public static final ALL INSTANCE = new ALL();
            public static final Parcelable.Creator<ALL> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL[] newArray(int i11) {
                    return new ALL[i11];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class CREDIT_CARD extends CREDIT {
            public static final CREDIT_CARD INSTANCE = new CREDIT_CARD();
            public static final Parcelable.Creator<CREDIT_CARD> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<CREDIT_CARD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CREDIT_CARD createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return CREDIT_CARD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CREDIT_CARD[] newArray(int i11) {
                    return new CREDIT_CARD[i11];
                }
            }

            private CREDIT_CARD() {
                super("credit card", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class PAYPAL_CREDIT extends CREDIT {
            public static final PAYPAL_CREDIT INSTANCE = new PAYPAL_CREDIT();
            public static final Parcelable.Creator<PAYPAL_CREDIT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PAYPAL_CREDIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYPAL_CREDIT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PAYPAL_CREDIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYPAL_CREDIT[] newArray(int i11) {
                    return new PAYPAL_CREDIT[i11];
                }
            }

            private PAYPAL_CREDIT() {
                super("paypal", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        private CREDIT(String str) {
            super(str, LinkAccountType.CREDIT.INSTANCE, null);
        }

        public /* synthetic */ CREDIT(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Map<LinkAccountType, Map<String, LinkAccountSubtype>> getAccountTypeToMap() {
            return (Map) LinkAccountSubtype.accountTypeToMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, LinkAccountSubtype> getCreditMap() {
            return (Map) LinkAccountSubtype.creditMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, LinkAccountSubtype> getDepositoryMap() {
            return (Map) LinkAccountSubtype.depositoryMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, LinkAccountSubtype> getInvestmentMap() {
            return (Map) LinkAccountSubtype.investmentMap$delegate.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map<String, LinkAccountSubtype> getLoanMap() {
            return (Map) LinkAccountSubtype.loanMap$delegate.getValue();
        }

        public final LinkAccountSubtype convert(String str, String str2) {
            LinkAccountType.Companion companion = LinkAccountType.Companion;
            if (str2 == null) {
                str2 = "";
            }
            LinkAccountType convert = companion.convert(str2);
            if (s.c(convert, LinkAccountType.OTHER.INSTANCE)) {
                return OTHER.C0351OTHER.INSTANCE;
            }
            Map<String, LinkAccountSubtype> map = getAccountTypeToMap().get(convert);
            LinkAccountSubtype linkAccountSubtype = map == null ? null : map.get(str);
            if (linkAccountSubtype == null) {
                if (str == null) {
                    str = "";
                }
                linkAccountSubtype = new UNKNOWN(str, convert);
            }
            return linkAccountSubtype;
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class DEPOSITORY extends LinkAccountSubtype {

        /* loaded from: classes2.dex */
        public static final class ALL extends DEPOSITORY {
            public static final ALL INSTANCE = new ALL();
            public static final Parcelable.Creator<ALL> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL[] newArray(int i11) {
                    return new ALL[i11];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class CASH_MANAGEMENT extends DEPOSITORY {
            public static final CASH_MANAGEMENT INSTANCE = new CASH_MANAGEMENT();
            public static final Parcelable.Creator<CASH_MANAGEMENT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<CASH_MANAGEMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CASH_MANAGEMENT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return CASH_MANAGEMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CASH_MANAGEMENT[] newArray(int i11) {
                    return new CASH_MANAGEMENT[i11];
                }
            }

            private CASH_MANAGEMENT() {
                super("cash management", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class CD extends DEPOSITORY {
            public static final CD INSTANCE = new CD();
            public static final Parcelable.Creator<CD> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<CD> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CD createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return CD.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CD[] newArray(int i11) {
                    return new CD[i11];
                }
            }

            private CD() {
                super("cd", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class CHECKING extends DEPOSITORY {
            public static final CHECKING INSTANCE = new CHECKING();
            public static final Parcelable.Creator<CHECKING> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<CHECKING> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CHECKING createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return CHECKING.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CHECKING[] newArray(int i11) {
                    return new CHECKING[i11];
                }
            }

            private CHECKING() {
                super("checking", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class EBT extends DEPOSITORY {
            public static final EBT INSTANCE = new EBT();
            public static final Parcelable.Creator<EBT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<EBT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EBT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return EBT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EBT[] newArray(int i11) {
                    return new EBT[i11];
                }
            }

            private EBT() {
                super("ebt", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class HSA extends DEPOSITORY {
            public static final HSA INSTANCE = new HSA();
            public static final Parcelable.Creator<HSA> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<HSA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HSA createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return HSA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HSA[] newArray(int i11) {
                    return new HSA[i11];
                }
            }

            private HSA() {
                super("hsa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class MONEY_MARKET extends DEPOSITORY {
            public static final MONEY_MARKET INSTANCE = new MONEY_MARKET();
            public static final Parcelable.Creator<MONEY_MARKET> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<MONEY_MARKET> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MONEY_MARKET createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return MONEY_MARKET.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MONEY_MARKET[] newArray(int i11) {
                    return new MONEY_MARKET[i11];
                }
            }

            private MONEY_MARKET() {
                super("money market", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class PAYPAL extends DEPOSITORY {
            public static final PAYPAL INSTANCE = new PAYPAL();
            public static final Parcelable.Creator<PAYPAL> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PAYPAL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYPAL createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PAYPAL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PAYPAL[] newArray(int i11) {
                    return new PAYPAL[i11];
                }
            }

            private PAYPAL() {
                super("paypal", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class PREPAID extends DEPOSITORY {
            public static final PREPAID INSTANCE = new PREPAID();
            public static final Parcelable.Creator<PREPAID> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PREPAID> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PREPAID createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PREPAID.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PREPAID[] newArray(int i11) {
                    return new PREPAID[i11];
                }
            }

            private PREPAID() {
                super("prepaid", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SAVINGS extends DEPOSITORY {
            public static final SAVINGS INSTANCE = new SAVINGS();
            public static final Parcelable.Creator<SAVINGS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<SAVINGS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SAVINGS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return SAVINGS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SAVINGS[] newArray(int i11) {
                    return new SAVINGS[i11];
                }
            }

            private SAVINGS() {
                super("savings", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        private DEPOSITORY(String str) {
            super(str, LinkAccountType.DEPOSITORY.INSTANCE, null);
        }

        public /* synthetic */ DEPOSITORY(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class INVESTMENT extends LinkAccountSubtype {

        /* loaded from: classes2.dex */
        public static final class ALL extends INVESTMENT {
            public static final ALL INSTANCE = new ALL();
            public static final Parcelable.Creator<ALL> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL[] newArray(int i11) {
                    return new ALL[i11];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class BROKERAGE extends INVESTMENT {
            public static final BROKERAGE INSTANCE = new BROKERAGE();
            public static final Parcelable.Creator<BROKERAGE> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<BROKERAGE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BROKERAGE createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return BROKERAGE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BROKERAGE[] newArray(int i11) {
                    return new BROKERAGE[i11];
                }
            }

            private BROKERAGE() {
                super("brokerage", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class CASH_ISA extends INVESTMENT {
            public static final CASH_ISA INSTANCE = new CASH_ISA();
            public static final Parcelable.Creator<CASH_ISA> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<CASH_ISA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CASH_ISA createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return CASH_ISA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CASH_ISA[] newArray(int i11) {
                    return new CASH_ISA[i11];
                }
            }

            private CASH_ISA() {
                super("cash isa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class EDUCATION_SAVINGS_ACCOUNT extends INVESTMENT {
            public static final EDUCATION_SAVINGS_ACCOUNT INSTANCE = new EDUCATION_SAVINGS_ACCOUNT();
            public static final Parcelable.Creator<EDUCATION_SAVINGS_ACCOUNT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<EDUCATION_SAVINGS_ACCOUNT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EDUCATION_SAVINGS_ACCOUNT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return EDUCATION_SAVINGS_ACCOUNT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final EDUCATION_SAVINGS_ACCOUNT[] newArray(int i11) {
                    return new EDUCATION_SAVINGS_ACCOUNT[i11];
                }
            }

            private EDUCATION_SAVINGS_ACCOUNT() {
                super("education savings account", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class FIXED_ANNUITY extends INVESTMENT {
            public static final FIXED_ANNUITY INSTANCE = new FIXED_ANNUITY();
            public static final Parcelable.Creator<FIXED_ANNUITY> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<FIXED_ANNUITY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FIXED_ANNUITY createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return FIXED_ANNUITY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final FIXED_ANNUITY[] newArray(int i11) {
                    return new FIXED_ANNUITY[i11];
                }
            }

            private FIXED_ANNUITY() {
                super("fixed annuity", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class GIC extends INVESTMENT {
            public static final GIC INSTANCE = new GIC();
            public static final Parcelable.Creator<GIC> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<GIC> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GIC createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return GIC.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GIC[] newArray(int i11) {
                    return new GIC[i11];
                }
            }

            private GIC() {
                super("gic", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class HEALTH_REIMBURSEMENT_ARRANGEMENT extends INVESTMENT {
            public static final HEALTH_REIMBURSEMENT_ARRANGEMENT INSTANCE = new HEALTH_REIMBURSEMENT_ARRANGEMENT();
            public static final Parcelable.Creator<HEALTH_REIMBURSEMENT_ARRANGEMENT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<HEALTH_REIMBURSEMENT_ARRANGEMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HEALTH_REIMBURSEMENT_ARRANGEMENT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return HEALTH_REIMBURSEMENT_ARRANGEMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HEALTH_REIMBURSEMENT_ARRANGEMENT[] newArray(int i11) {
                    return new HEALTH_REIMBURSEMENT_ARRANGEMENT[i11];
                }
            }

            private HEALTH_REIMBURSEMENT_ARRANGEMENT() {
                super("health reimbursement arrangement", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class HSA extends INVESTMENT {
            public static final HSA INSTANCE = new HSA();
            public static final Parcelable.Creator<HSA> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<HSA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HSA createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return HSA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HSA[] newArray(int i11) {
                    return new HSA[i11];
                }
            }

            private HSA() {
                super("hsa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class INVESTMENT_401A extends INVESTMENT {
            public static final INVESTMENT_401A INSTANCE = new INVESTMENT_401A();
            public static final Parcelable.Creator<INVESTMENT_401A> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVESTMENT_401A> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_401A createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_401A.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_401A[] newArray(int i11) {
                    return new INVESTMENT_401A[i11];
                }
            }

            private INVESTMENT_401A() {
                super("401a", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class INVESTMENT_401K extends INVESTMENT {
            public static final INVESTMENT_401K INSTANCE = new INVESTMENT_401K();
            public static final Parcelable.Creator<INVESTMENT_401K> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVESTMENT_401K> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_401K createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_401K.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_401K[] newArray(int i11) {
                    return new INVESTMENT_401K[i11];
                }
            }

            private INVESTMENT_401K() {
                super("401k", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class INVESTMENT_403B extends INVESTMENT {
            public static final INVESTMENT_403B INSTANCE = new INVESTMENT_403B();
            public static final Parcelable.Creator<INVESTMENT_403B> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVESTMENT_403B> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_403B createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_403B.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_403B[] newArray(int i11) {
                    return new INVESTMENT_403B[i11];
                }
            }

            private INVESTMENT_403B() {
                super("403B", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class INVESTMENT_457B extends INVESTMENT {
            public static final INVESTMENT_457B INSTANCE = new INVESTMENT_457B();
            public static final Parcelable.Creator<INVESTMENT_457B> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVESTMENT_457B> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_457B createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_457B.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_457B[] newArray(int i11) {
                    return new INVESTMENT_457B[i11];
                }
            }

            private INVESTMENT_457B() {
                super("457b", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class INVESTMENT_529 extends INVESTMENT {
            public static final INVESTMENT_529 INSTANCE = new INVESTMENT_529();
            public static final Parcelable.Creator<INVESTMENT_529> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<INVESTMENT_529> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_529 createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return INVESTMENT_529.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final INVESTMENT_529[] newArray(int i11) {
                    return new INVESTMENT_529[i11];
                }
            }

            private INVESTMENT_529() {
                super("529", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class IRA extends INVESTMENT {
            public static final IRA INSTANCE = new IRA();
            public static final Parcelable.Creator<IRA> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<IRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IRA createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return IRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final IRA[] newArray(int i11) {
                    return new IRA[i11];
                }
            }

            private IRA() {
                super("ira", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class ISA extends INVESTMENT {
            public static final ISA INSTANCE = new ISA();
            public static final Parcelable.Creator<ISA> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ISA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ISA createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ISA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ISA[] newArray(int i11) {
                    return new ISA[i11];
                }
            }

            private ISA() {
                super("isa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class KEOGH extends INVESTMENT {
            public static final KEOGH INSTANCE = new KEOGH();
            public static final Parcelable.Creator<KEOGH> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<KEOGH> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final KEOGH createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return KEOGH.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final KEOGH[] newArray(int i11) {
                    return new KEOGH[i11];
                }
            }

            private KEOGH() {
                super("keogh", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class LIF extends INVESTMENT {
            public static final LIF INSTANCE = new LIF();
            public static final Parcelable.Creator<LIF> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<LIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LIF createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return LIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LIF[] newArray(int i11) {
                    return new LIF[i11];
                }
            }

            private LIF() {
                super("lif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class LIRA extends INVESTMENT {
            public static final LIRA INSTANCE = new LIRA();
            public static final Parcelable.Creator<LIRA> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<LIRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LIRA createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return LIRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LIRA[] newArray(int i11) {
                    return new LIRA[i11];
                }
            }

            private LIRA() {
                super("lira", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class LRIF extends INVESTMENT {
            public static final LRIF INSTANCE = new LRIF();
            public static final Parcelable.Creator<LRIF> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<LRIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LRIF createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return LRIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LRIF[] newArray(int i11) {
                    return new LRIF[i11];
                }
            }

            private LRIF() {
                super("lrif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class LRSP extends INVESTMENT {
            public static final LRSP INSTANCE = new LRSP();
            public static final Parcelable.Creator<LRSP> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<LRSP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LRSP createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return LRSP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LRSP[] newArray(int i11) {
                    return new LRSP[i11];
                }
            }

            private LRSP() {
                super("lrsp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class MUTUAL_FUND extends INVESTMENT {
            public static final MUTUAL_FUND INSTANCE = new MUTUAL_FUND();
            public static final Parcelable.Creator<MUTUAL_FUND> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<MUTUAL_FUND> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MUTUAL_FUND createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return MUTUAL_FUND.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MUTUAL_FUND[] newArray(int i11) {
                    return new MUTUAL_FUND[i11];
                }
            }

            private MUTUAL_FUND() {
                super("mutual fund", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class NON_TAXABLE_BROKERAGE_ACCOUNTT extends INVESTMENT {
            public static final NON_TAXABLE_BROKERAGE_ACCOUNTT INSTANCE = new NON_TAXABLE_BROKERAGE_ACCOUNTT();
            public static final Parcelable.Creator<NON_TAXABLE_BROKERAGE_ACCOUNTT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<NON_TAXABLE_BROKERAGE_ACCOUNTT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NON_TAXABLE_BROKERAGE_ACCOUNTT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return NON_TAXABLE_BROKERAGE_ACCOUNTT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final NON_TAXABLE_BROKERAGE_ACCOUNTT[] newArray(int i11) {
                    return new NON_TAXABLE_BROKERAGE_ACCOUNTT[i11];
                }
            }

            private NON_TAXABLE_BROKERAGE_ACCOUNTT() {
                super("non-taxable brokerage account", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class OTHER extends INVESTMENT {
            public static final OTHER INSTANCE = new OTHER();
            public static final Parcelable.Creator<OTHER> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<OTHER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OTHER createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return OTHER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OTHER[] newArray(int i11) {
                    return new OTHER[i11];
                }
            }

            private OTHER() {
                super("other", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class PENSION extends INVESTMENT {
            public static final PENSION INSTANCE = new PENSION();
            public static final Parcelable.Creator<PENSION> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PENSION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PENSION createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PENSION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PENSION[] newArray(int i11) {
                    return new PENSION[i11];
                }
            }

            private PENSION() {
                super("pension", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class PRIF extends INVESTMENT {
            public static final PRIF INSTANCE = new PRIF();
            public static final Parcelable.Creator<PRIF> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PRIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRIF createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PRIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PRIF[] newArray(int i11) {
                    return new PRIF[i11];
                }
            }

            private PRIF() {
                super("prif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class PROFIT_SHARING_PLAN extends INVESTMENT {
            public static final PROFIT_SHARING_PLAN INSTANCE = new PROFIT_SHARING_PLAN();
            public static final Parcelable.Creator<PROFIT_SHARING_PLAN> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<PROFIT_SHARING_PLAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PROFIT_SHARING_PLAN createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return PROFIT_SHARING_PLAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final PROFIT_SHARING_PLAN[] newArray(int i11) {
                    return new PROFIT_SHARING_PLAN[i11];
                }
            }

            private PROFIT_SHARING_PLAN() {
                super("profit sharing plan", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class QSHR extends INVESTMENT {
            public static final QSHR INSTANCE = new QSHR();
            public static final Parcelable.Creator<QSHR> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<QSHR> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final QSHR createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return QSHR.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final QSHR[] newArray(int i11) {
                    return new QSHR[i11];
                }
            }

            private QSHR() {
                super("qshr", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class RDSP extends INVESTMENT {
            public static final RDSP INSTANCE = new RDSP();
            public static final Parcelable.Creator<RDSP> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<RDSP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RDSP createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return RDSP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RDSP[] newArray(int i11) {
                    return new RDSP[i11];
                }
            }

            private RDSP() {
                super("rdsp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class RESP extends INVESTMENT {
            public static final RESP INSTANCE = new RESP();
            public static final Parcelable.Creator<RESP> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<RESP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RESP createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return RESP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RESP[] newArray(int i11) {
                    return new RESP[i11];
                }
            }

            private RESP() {
                super("resp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class RETIREMENT extends INVESTMENT {
            public static final RETIREMENT INSTANCE = new RETIREMENT();
            public static final Parcelable.Creator<RETIREMENT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<RETIREMENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RETIREMENT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return RETIREMENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RETIREMENT[] newArray(int i11) {
                    return new RETIREMENT[i11];
                }
            }

            private RETIREMENT() {
                super("retirement", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class RLIF extends INVESTMENT {
            public static final RLIF INSTANCE = new RLIF();
            public static final Parcelable.Creator<RLIF> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<RLIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RLIF createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return RLIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RLIF[] newArray(int i11) {
                    return new RLIF[i11];
                }
            }

            private RLIF() {
                super("rlif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class ROTH extends INVESTMENT {
            public static final ROTH INSTANCE = new ROTH();
            public static final Parcelable.Creator<ROTH> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ROTH> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ROTH createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ROTH.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ROTH[] newArray(int i11) {
                    return new ROTH[i11];
                }
            }

            private ROTH() {
                super("roth", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class ROTH_401K extends INVESTMENT {
            public static final ROTH_401K INSTANCE = new ROTH_401K();
            public static final Parcelable.Creator<ROTH_401K> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ROTH_401K> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ROTH_401K createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ROTH_401K.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ROTH_401K[] newArray(int i11) {
                    return new ROTH_401K[i11];
                }
            }

            private ROTH_401K() {
                super("roth 401k", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class RRIF extends INVESTMENT {
            public static final RRIF INSTANCE = new RRIF();
            public static final Parcelable.Creator<RRIF> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<RRIF> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RRIF createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return RRIF.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RRIF[] newArray(int i11) {
                    return new RRIF[i11];
                }
            }

            private RRIF() {
                super("rrif", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class RRSP extends INVESTMENT {
            public static final RRSP INSTANCE = new RRSP();
            public static final Parcelable.Creator<RRSP> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<RRSP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RRSP createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return RRSP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final RRSP[] newArray(int i11) {
                    return new RRSP[i11];
                }
            }

            private RRSP() {
                super("rrsp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SARSEP extends INVESTMENT {
            public static final SARSEP INSTANCE = new SARSEP();
            public static final Parcelable.Creator<SARSEP> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<SARSEP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SARSEP createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return SARSEP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SARSEP[] newArray(int i11) {
                    return new SARSEP[i11];
                }
            }

            private SARSEP() {
                super("sarsep", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SEP_IRA extends INVESTMENT {
            public static final SEP_IRA INSTANCE = new SEP_IRA();
            public static final Parcelable.Creator<SEP_IRA> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<SEP_IRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SEP_IRA createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return SEP_IRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SEP_IRA[] newArray(int i11) {
                    return new SEP_IRA[i11];
                }
            }

            private SEP_IRA() {
                super("sep ira", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SIMPLE_IRA extends INVESTMENT {
            public static final SIMPLE_IRA INSTANCE = new SIMPLE_IRA();
            public static final Parcelable.Creator<SIMPLE_IRA> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<SIMPLE_IRA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SIMPLE_IRA createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return SIMPLE_IRA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SIMPLE_IRA[] newArray(int i11) {
                    return new SIMPLE_IRA[i11];
                }
            }

            private SIMPLE_IRA() {
                super("simple ira", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class SIPP extends INVESTMENT {
            public static final SIPP INSTANCE = new SIPP();
            public static final Parcelable.Creator<SIPP> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<SIPP> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SIPP createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return SIPP.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final SIPP[] newArray(int i11) {
                    return new SIPP[i11];
                }
            }

            private SIPP() {
                super("sipp", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class STOCK_PLAN extends INVESTMENT {
            public static final STOCK_PLAN INSTANCE = new STOCK_PLAN();
            public static final Parcelable.Creator<STOCK_PLAN> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<STOCK_PLAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final STOCK_PLAN createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return STOCK_PLAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final STOCK_PLAN[] newArray(int i11) {
                    return new STOCK_PLAN[i11];
                }
            }

            private STOCK_PLAN() {
                super("stock plan", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class TFSA extends INVESTMENT {
            public static final TFSA INSTANCE = new TFSA();
            public static final Parcelable.Creator<TFSA> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<TFSA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TFSA createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return TFSA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TFSA[] newArray(int i11) {
                    return new TFSA[i11];
                }
            }

            private TFSA() {
                super("tfsa", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class THRIFT_SAVINGS_PLAN extends INVESTMENT {
            public static final THRIFT_SAVINGS_PLAN INSTANCE = new THRIFT_SAVINGS_PLAN();
            public static final Parcelable.Creator<THRIFT_SAVINGS_PLAN> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<THRIFT_SAVINGS_PLAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final THRIFT_SAVINGS_PLAN createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return THRIFT_SAVINGS_PLAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final THRIFT_SAVINGS_PLAN[] newArray(int i11) {
                    return new THRIFT_SAVINGS_PLAN[i11];
                }
            }

            private THRIFT_SAVINGS_PLAN() {
                super("thrift savings plan", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class TRUST extends INVESTMENT {
            public static final TRUST INSTANCE = new TRUST();
            public static final Parcelable.Creator<TRUST> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<TRUST> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TRUST createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return TRUST.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TRUST[] newArray(int i11) {
                    return new TRUST[i11];
                }
            }

            private TRUST() {
                super("trust", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class UGMA extends INVESTMENT {
            public static final UGMA INSTANCE = new UGMA();
            public static final Parcelable.Creator<UGMA> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<UGMA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UGMA createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return UGMA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UGMA[] newArray(int i11) {
                    return new UGMA[i11];
                }
            }

            private UGMA() {
                super("ugma", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class UTMA extends INVESTMENT {
            public static final UTMA INSTANCE = new UTMA();
            public static final Parcelable.Creator<UTMA> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<UTMA> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UTMA createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return UTMA.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UTMA[] newArray(int i11) {
                    return new UTMA[i11];
                }
            }

            private UTMA() {
                super("utma", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class VARIABLE_ANNUITY extends INVESTMENT {
            public static final VARIABLE_ANNUITY INSTANCE = new VARIABLE_ANNUITY();
            public static final Parcelable.Creator<VARIABLE_ANNUITY> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<VARIABLE_ANNUITY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VARIABLE_ANNUITY createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return VARIABLE_ANNUITY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final VARIABLE_ANNUITY[] newArray(int i11) {
                    return new VARIABLE_ANNUITY[i11];
                }
            }

            private VARIABLE_ANNUITY() {
                super("variable annuity", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        private INVESTMENT(String str) {
            super(str, LinkAccountType.INVESTMENT.INSTANCE, null);
        }

        public /* synthetic */ INVESTMENT(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ INVESTMENT(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class LOAN_SUBTYPE extends LinkAccountSubtype {

        /* loaded from: classes2.dex */
        public static final class ALL extends LOAN_SUBTYPE {
            public static final ALL INSTANCE = new ALL();
            public static final Parcelable.Creator<ALL> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<ALL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return ALL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ALL[] newArray(int i11) {
                    return new ALL[i11];
                }
            }

            private ALL() {
                super("all", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class AUTO extends LOAN_SUBTYPE {
            public static final AUTO INSTANCE = new AUTO();
            public static final Parcelable.Creator<AUTO> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<AUTO> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AUTO createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return AUTO.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AUTO[] newArray(int i11) {
                    return new AUTO[i11];
                }
            }

            private AUTO() {
                super("auto", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class BUSINESS extends LOAN_SUBTYPE {
            public static final BUSINESS INSTANCE = new BUSINESS();
            public static final Parcelable.Creator<BUSINESS> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<BUSINESS> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BUSINESS createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return BUSINESS.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final BUSINESS[] newArray(int i11) {
                    return new BUSINESS[i11];
                }
            }

            private BUSINESS() {
                super("business", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class COMMERCIAL extends LOAN_SUBTYPE {
            public static final COMMERCIAL INSTANCE = new COMMERCIAL();
            public static final Parcelable.Creator<COMMERCIAL> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<COMMERCIAL> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final COMMERCIAL createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return COMMERCIAL.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final COMMERCIAL[] newArray(int i11) {
                    return new COMMERCIAL[i11];
                }
            }

            private COMMERCIAL() {
                super("commercial", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class CONSTRUCTION extends LOAN_SUBTYPE {
            public static final CONSTRUCTION INSTANCE = new CONSTRUCTION();
            public static final Parcelable.Creator<CONSTRUCTION> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<CONSTRUCTION> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CONSTRUCTION createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return CONSTRUCTION.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CONSTRUCTION[] newArray(int i11) {
                    return new CONSTRUCTION[i11];
                }
            }

            private CONSTRUCTION() {
                super("construction", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class CONSUMER extends LOAN_SUBTYPE {
            public static final CONSUMER INSTANCE = new CONSUMER();
            public static final Parcelable.Creator<CONSUMER> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<CONSUMER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CONSUMER createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return CONSUMER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final CONSUMER[] newArray(int i11) {
                    return new CONSUMER[i11];
                }
            }

            private CONSUMER() {
                super("consumer", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class HOME_EQUITY extends LOAN_SUBTYPE {
            public static final HOME_EQUITY INSTANCE = new HOME_EQUITY();
            public static final Parcelable.Creator<HOME_EQUITY> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<HOME_EQUITY> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HOME_EQUITY createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return HOME_EQUITY.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final HOME_EQUITY[] newArray(int i11) {
                    return new HOME_EQUITY[i11];
                }
            }

            private HOME_EQUITY() {
                super("home equity", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class LINE_OF_CREDIT extends LOAN_SUBTYPE {
            public static final LINE_OF_CREDIT INSTANCE = new LINE_OF_CREDIT();
            public static final Parcelable.Creator<LINE_OF_CREDIT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<LINE_OF_CREDIT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LINE_OF_CREDIT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return LINE_OF_CREDIT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LINE_OF_CREDIT[] newArray(int i11) {
                    return new LINE_OF_CREDIT[i11];
                }
            }

            private LINE_OF_CREDIT() {
                super("line of credit", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class LOAN extends LOAN_SUBTYPE {
            public static final LOAN INSTANCE = new LOAN();
            public static final Parcelable.Creator<LOAN> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<LOAN> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LOAN createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return LOAN.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final LOAN[] newArray(int i11) {
                    return new LOAN[i11];
                }
            }

            private LOAN() {
                super("loan", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class MORTGAGE extends LOAN_SUBTYPE {
            public static final MORTGAGE INSTANCE = new MORTGAGE();
            public static final Parcelable.Creator<MORTGAGE> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<MORTGAGE> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MORTGAGE createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return MORTGAGE.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final MORTGAGE[] newArray(int i11) {
                    return new MORTGAGE[i11];
                }
            }

            private MORTGAGE() {
                super("mortgage", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class OTHER extends LOAN_SUBTYPE {
            public static final OTHER INSTANCE = new OTHER();
            public static final Parcelable.Creator<OTHER> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<OTHER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OTHER createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return OTHER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OTHER[] newArray(int i11) {
                    return new OTHER[i11];
                }
            }

            private OTHER() {
                super("other", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class OVERDRAFT extends LOAN_SUBTYPE {
            public static final OVERDRAFT INSTANCE = new OVERDRAFT();
            public static final Parcelable.Creator<OVERDRAFT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<OVERDRAFT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OVERDRAFT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return OVERDRAFT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final OVERDRAFT[] newArray(int i11) {
                    return new OVERDRAFT[i11];
                }
            }

            private OVERDRAFT() {
                super("overdraft", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        /* loaded from: classes2.dex */
        public static final class STUDENT extends LOAN_SUBTYPE {
            public static final STUDENT INSTANCE = new STUDENT();
            public static final Parcelable.Creator<STUDENT> CREATOR = new Creator();

            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<STUDENT> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final STUDENT createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return STUDENT.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final STUDENT[] newArray(int i11) {
                    return new STUDENT[i11];
                }
            }

            private STUDENT() {
                super("student", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        private LOAN_SUBTYPE(String str) {
            super(str, LinkAccountType.LOAN.INSTANCE, null);
        }

        public /* synthetic */ LOAN_SUBTYPE(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }

        public /* synthetic */ LOAN_SUBTYPE(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? "" : str, null);
        }
    }

    /* loaded from: classes2.dex */
    public static abstract class OTHER extends LinkAccountSubtype {

        /* renamed from: com.plaid.link.result.LinkAccountSubtype$OTHER$OTHER  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0351OTHER extends OTHER {
            public static final C0351OTHER INSTANCE = new C0351OTHER();
            public static final Parcelable.Creator<C0351OTHER> CREATOR = new Creator();

            /* renamed from: com.plaid.link.result.LinkAccountSubtype$OTHER$OTHER$Creator */
            /* loaded from: classes2.dex */
            public static final class Creator implements Parcelable.Creator<C0351OTHER> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final C0351OTHER createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    parcel.readInt();
                    return C0351OTHER.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final C0351OTHER[] newArray(int i11) {
                    return new C0351OTHER[i11];
                }
            }

            private C0351OTHER() {
                super("other", null);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(1);
            }
        }

        private OTHER(String str) {
            super(str, LinkAccountType.OTHER.INSTANCE, null);
        }

        public /* synthetic */ OTHER(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class UNKNOWN extends LinkAccountSubtype {
        public static final Parcelable.Creator<UNKNOWN> CREATOR = new Creator();
        private final String name;
        private final LinkAccountType type;

        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<UNKNOWN> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UNKNOWN createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new UNKNOWN(parcel.readString(), (LinkAccountType) parcel.readParcelable(UNKNOWN.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final UNKNOWN[] newArray(int i11) {
                return new UNKNOWN[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UNKNOWN(String name, LinkAccountType type) {
            super(name, type, null);
            s.g(name, "name");
            s.g(type, "type");
            this.name = name;
            this.type = type;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (s.c(UNKNOWN.class, obj == null ? null : obj.getClass())) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.plaid.link.result.LinkAccountSubtype.UNKNOWN");
                UNKNOWN unknown = (UNKNOWN) obj;
                return s.c(this.name, unknown.name) && s.c(this.type, unknown.type);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public final LinkAccountType getType() {
            return this.type;
        }

        public int hashCode() {
            return this.type.hashCode() + (this.name.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.name);
            out.writeParcelable(this.type, i11);
        }
    }

    static {
        k<Map<LinkAccountType, Map<String, LinkAccountSubtype>>> a11;
        k<Map<String, CREDIT>> a12;
        k<Map<String, DEPOSITORY>> a13;
        k<Map<String, INVESTMENT>> a14;
        k<Map<String, LOAN_SUBTYPE>> a15;
        a11 = m.a(LinkAccountSubtype$Companion$accountTypeToMap$2.INSTANCE);
        accountTypeToMap$delegate = a11;
        a12 = m.a(LinkAccountSubtype$Companion$creditMap$2.INSTANCE);
        creditMap$delegate = a12;
        a13 = m.a(LinkAccountSubtype$Companion$depositoryMap$2.INSTANCE);
        depositoryMap$delegate = a13;
        a14 = m.a(LinkAccountSubtype$Companion$investmentMap$2.INSTANCE);
        investmentMap$delegate = a14;
        a15 = m.a(LinkAccountSubtype$Companion$loanMap$2.INSTANCE);
        loanMap$delegate = a15;
    }

    private LinkAccountSubtype(String str, LinkAccountType linkAccountType) {
        this.json = str;
        this.accountType = linkAccountType;
    }

    public /* synthetic */ LinkAccountSubtype(String str, LinkAccountType linkAccountType, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, linkAccountType);
    }

    public final LinkAccountType getAccountType() {
        return this.accountType;
    }

    public final String getJson() {
        return this.json;
    }

    public /* synthetic */ LinkAccountSubtype(String str, LinkAccountType linkAccountType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? new LinkAccountType.UNKNOWN("") : linkAccountType, null);
    }
}