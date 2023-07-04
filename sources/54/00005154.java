package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.BlikPaymentMethod;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import com.stripe.android.model.wallets.Wallet;
import ezvcard.property.Kind;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.v;
import wz.r0;
import wz.s0;
import wz.x0;

/* loaded from: classes6.dex */
public final class PaymentMethod implements StripeModel {
    public final AuBecsDebit auBecsDebit;
    public final BacsDebit bacsDebit;
    public final BillingDetails billingDetails;
    public final Card card;
    public final CardPresent cardPresent;
    public final Long created;
    public final String customerId;
    public final Fpx fpx;

    /* renamed from: id */
    public final String f20932id;
    public final Ideal ideal;
    public final boolean liveMode;
    public final Netbanking netbanking;
    public final SepaDebit sepaDebit;
    public final Sofort sofort;
    public final Type type;
    public final Upi upi;
    public final USBankAccount usBankAccount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class AuBecsDebit extends TypeData {
        public final String bsbNumber;
        public final String fingerprint;
        public final String last4;
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<AuBecsDebit> {
            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new AuBecsDebit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final AuBecsDebit[] newArray(int i11) {
                return new AuBecsDebit[i11];
            }
        }

        public AuBecsDebit(String str, String str2, String str3) {
            super(null);
            this.bsbNumber = str;
            this.fingerprint = str2;
            this.last4 = str3;
        }

        public static /* synthetic */ AuBecsDebit copy$default(AuBecsDebit auBecsDebit, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = auBecsDebit.bsbNumber;
            }
            if ((i11 & 2) != 0) {
                str2 = auBecsDebit.fingerprint;
            }
            if ((i11 & 4) != 0) {
                str3 = auBecsDebit.last4;
            }
            return auBecsDebit.copy(str, str2, str3);
        }

        public final String component1() {
            return this.bsbNumber;
        }

        public final String component2() {
            return this.fingerprint;
        }

        public final String component3() {
            return this.last4;
        }

        public final AuBecsDebit copy(String str, String str2, String str3) {
            return new AuBecsDebit(str, str2, str3);
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
            if (obj instanceof AuBecsDebit) {
                AuBecsDebit auBecsDebit = (AuBecsDebit) obj;
                return s.c(this.bsbNumber, auBecsDebit.bsbNumber) && s.c(this.fingerprint, auBecsDebit.fingerprint) && s.c(this.last4, auBecsDebit.last4);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.AuBecsDebit;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bsbNumber;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.fingerprint;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last4;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + ((Object) this.bsbNumber) + ", fingerprint=" + ((Object) this.fingerprint) + ", last4=" + ((Object) this.last4) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.bsbNumber);
            out.writeString(this.fingerprint);
            out.writeString(this.last4);
        }
    }

    /* loaded from: classes6.dex */
    public static final class BacsDebit extends TypeData {
        public final String fingerprint;
        public final String last4;
        public final String sortCode;
        public static final Parcelable.Creator<BacsDebit> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<BacsDebit> {
            @Override // android.os.Parcelable.Creator
            public final BacsDebit createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new BacsDebit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BacsDebit[] newArray(int i11) {
                return new BacsDebit[i11];
            }
        }

        public BacsDebit(String str, String str2, String str3) {
            super(null);
            this.fingerprint = str;
            this.last4 = str2;
            this.sortCode = str3;
        }

        public static /* synthetic */ BacsDebit copy$default(BacsDebit bacsDebit, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bacsDebit.fingerprint;
            }
            if ((i11 & 2) != 0) {
                str2 = bacsDebit.last4;
            }
            if ((i11 & 4) != 0) {
                str3 = bacsDebit.sortCode;
            }
            return bacsDebit.copy(str, str2, str3);
        }

        public final String component1() {
            return this.fingerprint;
        }

        public final String component2() {
            return this.last4;
        }

        public final String component3() {
            return this.sortCode;
        }

        public final BacsDebit copy(String str, String str2, String str3) {
            return new BacsDebit(str, str2, str3);
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
            if (obj instanceof BacsDebit) {
                BacsDebit bacsDebit = (BacsDebit) obj;
                return s.c(this.fingerprint, bacsDebit.fingerprint) && s.c(this.last4, bacsDebit.last4) && s.c(this.sortCode, bacsDebit.sortCode);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.BacsDebit;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.fingerprint;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.last4;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.sortCode;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BacsDebit(fingerprint=" + ((Object) this.fingerprint) + ", last4=" + ((Object) this.last4) + ", sortCode=" + ((Object) this.sortCode) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.fingerprint);
            out.writeString(this.last4);
            out.writeString(this.sortCode);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Builder implements ObjectBuilder<PaymentMethod> {
        public static final int $stable = 8;
        private AuBecsDebit auBecsDebit;
        private BacsDebit bacsDebit;
        private BillingDetails billingDetails;
        private Card card;
        private CardPresent cardPresent;
        private Long created;
        private String customerId;
        private Fpx fpx;

        /* renamed from: id */
        private String f20933id;
        private Ideal ideal;
        private boolean liveMode;
        private Map<String, String> metadata;
        private Netbanking netbanking;
        private SepaDebit sepaDebit;
        private Sofort sofort;
        private Type type;
        private Upi upi;
        private USBankAccount usBankAccount;

        public final Builder setAuBecsDebit(AuBecsDebit auBecsDebit) {
            this.auBecsDebit = auBecsDebit;
            return this;
        }

        public final Builder setBacsDebit(BacsDebit bacsDebit) {
            this.bacsDebit = bacsDebit;
            return this;
        }

        public final Builder setBillingDetails(BillingDetails billingDetails) {
            this.billingDetails = billingDetails;
            return this;
        }

        public final Builder setCard(Card card) {
            this.card = card;
            return this;
        }

        public final Builder setCardPresent(CardPresent cardPresent) {
            this.cardPresent = cardPresent;
            return this;
        }

        public final Builder setCreated(Long l11) {
            this.created = l11;
            return this;
        }

        public final Builder setCustomerId(String str) {
            this.customerId = str;
            return this;
        }

        public final Builder setFpx(Fpx fpx) {
            this.fpx = fpx;
            return this;
        }

        public final Builder setId(String str) {
            this.f20933id = str;
            return this;
        }

        public final Builder setIdeal(Ideal ideal) {
            this.ideal = ideal;
            return this;
        }

        public final Builder setLiveMode(boolean z11) {
            this.liveMode = z11;
            return this;
        }

        public final Builder setMetadata(Map<String, String> map) {
            this.metadata = map;
            return this;
        }

        public final Builder setNetbanking(Netbanking netbanking) {
            this.netbanking = netbanking;
            return this;
        }

        public final Builder setSepaDebit(SepaDebit sepaDebit) {
            this.sepaDebit = sepaDebit;
            return this;
        }

        public final Builder setSofort(Sofort sofort) {
            this.sofort = sofort;
            return this;
        }

        public final Builder setType(Type type) {
            this.type = type;
            return this;
        }

        public final Builder setUSBankAccount(USBankAccount uSBankAccount) {
            this.usBankAccount = uSBankAccount;
            return this;
        }

        public final Builder setUpi(Upi upi) {
            this.upi = upi;
            return this;
        }

        @Override // com.stripe.android.ObjectBuilder
        public PaymentMethod build() {
            return new PaymentMethod(this.f20933id, this.created, this.liveMode, this.type, this.billingDetails, this.customerId, this.card, this.cardPresent, this.fpx, this.ideal, this.sepaDebit, this.auBecsDebit, this.bacsDebit, this.sofort, null, this.netbanking, this.usBankAccount, 16384, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class CardPresent extends TypeData {
        private final boolean ignore;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<CardPresent> CREATOR = new Creator();
        public static final int $stable = 8;
        private static final /* synthetic */ CardPresent EMPTY = new CardPresent(false, 1, null);

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final CardPresent getEMPTY$payments_core_release() {
                return CardPresent.EMPTY;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<CardPresent> {
            @Override // android.os.Parcelable.Creator
            public final CardPresent createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new CardPresent(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final CardPresent[] newArray(int i11) {
                return new CardPresent[i11];
            }
        }

        public CardPresent() {
            this(false, 1, null);
        }

        public /* synthetic */ CardPresent(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? true : z11);
        }

        private final boolean component1() {
            return this.ignore;
        }

        public static /* synthetic */ CardPresent copy$default(CardPresent cardPresent, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = cardPresent.ignore;
            }
            return cardPresent.copy(z11);
        }

        public final CardPresent copy(boolean z11) {
            return new CardPresent(z11);
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
            return (obj instanceof CardPresent) && this.ignore == ((CardPresent) obj).ignore;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.CardPresent;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            boolean z11 = this.ignore;
            if (z11) {
                return 1;
            }
            return z11 ? 1 : 0;
        }

        public String toString() {
            return "CardPresent(ignore=" + this.ignore + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeInt(this.ignore ? 1 : 0);
        }

        public CardPresent(boolean z11) {
            super(null);
            this.ignore = z11;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PaymentMethod fromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new PaymentMethodJsonParser().parse(jSONObject);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PaymentMethod> {
        @Override // android.os.Parcelable.Creator
        public final PaymentMethod createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new PaymentMethod(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readInt() == 0 ? null : Type.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BillingDetails.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Card.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : CardPresent.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Fpx.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Ideal.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SepaDebit.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AuBecsDebit.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : BacsDebit.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Sofort.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Upi.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Netbanking.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? USBankAccount.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final PaymentMethod[] newArray(int i11) {
            return new PaymentMethod[i11];
        }
    }

    /* loaded from: classes6.dex */
    public static final class Fpx extends TypeData {
        public final String accountHolderType;
        public final String bank;
        public static final Parcelable.Creator<Fpx> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Fpx> {
            @Override // android.os.Parcelable.Creator
            public final Fpx createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Fpx(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Fpx[] newArray(int i11) {
                return new Fpx[i11];
            }
        }

        public Fpx(String str, String str2) {
            super(null);
            this.bank = str;
            this.accountHolderType = str2;
        }

        public static /* synthetic */ Fpx copy$default(Fpx fpx, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = fpx.bank;
            }
            if ((i11 & 2) != 0) {
                str2 = fpx.accountHolderType;
            }
            return fpx.copy(str, str2);
        }

        public final String component1() {
            return this.bank;
        }

        public final String component2() {
            return this.accountHolderType;
        }

        public final Fpx copy(String str, String str2) {
            return new Fpx(str, str2);
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
            if (obj instanceof Fpx) {
                Fpx fpx = (Fpx) obj;
                return s.c(this.bank, fpx.bank) && s.c(this.accountHolderType, fpx.accountHolderType);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Fpx;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bank;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.accountHolderType;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Fpx(bank=" + ((Object) this.bank) + ", accountHolderType=" + ((Object) this.accountHolderType) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.bank);
            out.writeString(this.accountHolderType);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Ideal extends TypeData {
        public final String bank;
        public final String bankIdentifierCode;
        public static final Parcelable.Creator<Ideal> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Ideal> {
            @Override // android.os.Parcelable.Creator
            public final Ideal createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Ideal(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Ideal[] newArray(int i11) {
                return new Ideal[i11];
            }
        }

        public Ideal(String str, String str2) {
            super(null);
            this.bank = str;
            this.bankIdentifierCode = str2;
        }

        public static /* synthetic */ Ideal copy$default(Ideal ideal, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = ideal.bank;
            }
            if ((i11 & 2) != 0) {
                str2 = ideal.bankIdentifierCode;
            }
            return ideal.copy(str, str2);
        }

        public final String component1() {
            return this.bank;
        }

        public final String component2() {
            return this.bankIdentifierCode;
        }

        public final Ideal copy(String str, String str2) {
            return new Ideal(str, str2);
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
            if (obj instanceof Ideal) {
                Ideal ideal = (Ideal) obj;
                return s.c(this.bank, ideal.bank) && s.c(this.bankIdentifierCode, ideal.bankIdentifierCode);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Ideal;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bank;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.bankIdentifierCode;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Ideal(bank=" + ((Object) this.bank) + ", bankIdentifierCode=" + ((Object) this.bankIdentifierCode) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.bank);
            out.writeString(this.bankIdentifierCode);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Netbanking extends TypeData {
        public final String bank;
        public static final Parcelable.Creator<Netbanking> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Netbanking> {
            @Override // android.os.Parcelable.Creator
            public final Netbanking createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Netbanking(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Netbanking[] newArray(int i11) {
                return new Netbanking[i11];
            }
        }

        public Netbanking(String str) {
            super(null);
            this.bank = str;
        }

        public static /* synthetic */ Netbanking copy$default(Netbanking netbanking, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = netbanking.bank;
            }
            return netbanking.copy(str);
        }

        public final String component1() {
            return this.bank;
        }

        public final Netbanking copy(String str) {
            return new Netbanking(str);
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
            return (obj instanceof Netbanking) && s.c(this.bank, ((Netbanking) obj).bank);
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Netbanking;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bank;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + ((Object) this.bank) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.bank);
        }
    }

    /* loaded from: classes6.dex */
    public static final class SepaDebit extends TypeData {
        public final String bankCode;
        public final String branchCode;
        public final String country;
        public final String fingerprint;
        public final String last4;
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<SepaDebit> {
            @Override // android.os.Parcelable.Creator
            public final SepaDebit createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new SepaDebit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SepaDebit[] newArray(int i11) {
                return new SepaDebit[i11];
            }
        }

        public SepaDebit(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.bankCode = str;
            this.branchCode = str2;
            this.country = str3;
            this.fingerprint = str4;
            this.last4 = str5;
        }

        public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sepaDebit.bankCode;
            }
            if ((i11 & 2) != 0) {
                str2 = sepaDebit.branchCode;
            }
            String str6 = str2;
            if ((i11 & 4) != 0) {
                str3 = sepaDebit.country;
            }
            String str7 = str3;
            if ((i11 & 8) != 0) {
                str4 = sepaDebit.fingerprint;
            }
            String str8 = str4;
            if ((i11 & 16) != 0) {
                str5 = sepaDebit.last4;
            }
            return sepaDebit.copy(str, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.bankCode;
        }

        public final String component2() {
            return this.branchCode;
        }

        public final String component3() {
            return this.country;
        }

        public final String component4() {
            return this.fingerprint;
        }

        public final String component5() {
            return this.last4;
        }

        public final SepaDebit copy(String str, String str2, String str3, String str4, String str5) {
            return new SepaDebit(str, str2, str3, str4, str5);
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
            if (obj instanceof SepaDebit) {
                SepaDebit sepaDebit = (SepaDebit) obj;
                return s.c(this.bankCode, sepaDebit.bankCode) && s.c(this.branchCode, sepaDebit.branchCode) && s.c(this.country, sepaDebit.country) && s.c(this.fingerprint, sepaDebit.fingerprint) && s.c(this.last4, sepaDebit.last4);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.SepaDebit;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.bankCode;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.branchCode;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.country;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.fingerprint;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.last4;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + ((Object) this.bankCode) + ", branchCode=" + ((Object) this.branchCode) + ", country=" + ((Object) this.country) + ", fingerprint=" + ((Object) this.fingerprint) + ", last4=" + ((Object) this.last4) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.bankCode);
            out.writeString(this.branchCode);
            out.writeString(this.country);
            out.writeString(this.fingerprint);
            out.writeString(this.last4);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Sofort extends TypeData {
        public final String country;
        public static final Parcelable.Creator<Sofort> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Sofort> {
            @Override // android.os.Parcelable.Creator
            public final Sofort createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Sofort(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Sofort[] newArray(int i11) {
                return new Sofort[i11];
            }
        }

        public Sofort(String str) {
            super(null);
            this.country = str;
        }

        public static /* synthetic */ Sofort copy$default(Sofort sofort, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = sofort.country;
            }
            return sofort.copy(str);
        }

        public final String component1() {
            return this.country;
        }

        public final Sofort copy(String str) {
            return new Sofort(str);
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
            return (obj instanceof Sofort) && s.c(this.country, ((Sofort) obj).country);
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Sofort;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.country;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + ((Object) this.country) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.country);
        }
    }

    /* loaded from: classes6.dex */
    public enum Type implements Parcelable {
        Link("link", false, false, true, false),
        Card("card", true, false, false, false),
        CardPresent("card_present", false, false, false, false),
        Fpx("fpx", false, false, false, false),
        Ideal("ideal", false, false, true, false),
        SepaDebit("sepa_debit", false, false, true, true),
        AuBecsDebit("au_becs_debit", true, false, true, true),
        BacsDebit("bacs_debit", true, false, true, true),
        Sofort("sofort", false, false, true, true),
        Upi("upi", false, false, false, false),
        P24("p24", false, false, false, false),
        Bancontact("bancontact", false, false, true, false),
        Giropay("giropay", false, false, false, false),
        Eps("eps", false, false, true, false),
        Oxxo("oxxo", false, true, false, false),
        Alipay("alipay", false, false, false, false),
        GrabPay("grabpay", false, false, false, false),
        PayPal("paypal", false, false, false, false),
        AfterpayClearpay("afterpay_clearpay", false, false, false, false),
        Netbanking("netbanking", false, false, false, false),
        Blik(BlikPaymentMethod.PAYMENT_METHOD_TYPE, false, false, false, false),
        WeChatPay("wechat_pay", false, false, false, false),
        Klarna("klarna", false, false, false, false),
        Affirm("affirm", false, false, false, false),
        USBankAccount("us_bank_account", true, false, true, true);
        
        public final String code;
        private final boolean hasDelayedSettlement;
        public final boolean isReusable;
        public final boolean isVoucher;
        public final boolean requiresMandate;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Type> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ Type fromCode(String str) {
                Type[] values;
                for (Type type : Type.values()) {
                    if (s.c(type.code, str)) {
                        return type;
                    }
                }
                return null;
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Type> {
            @Override // android.os.Parcelable.Creator
            public final Type createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return Type.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Type[] newArray(int i11) {
                return new Type[i11];
            }
        }

        Type(String str, boolean z11, boolean z12, boolean z13, boolean z14) {
            this.code = str;
            this.isReusable = z11;
            this.isVoucher = z12;
            this.requiresMandate = z13;
            this.hasDelayedSettlement = z14;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean hasDelayedSettlement() {
            return this.hasDelayedSettlement;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.code;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(name());
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class TypeData implements StripeModel {
        public static final int $stable = 0;

        private TypeData() {
        }

        public /* synthetic */ TypeData(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract Type getType();
    }

    /* loaded from: classes6.dex */
    public static final class USBankAccount extends TypeData {
        public final USBankAccountHolderType accountHolderType;
        public final USBankAccountType accountType;
        public final String bankName;
        public final String fingerprint;
        public final String last4;
        public final String linkedAccount;
        public final USBankNetworks networks;
        public final String routingNumber;
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new USBankAccount(USBankAccountHolderType.CREATOR.createFromParcel(parcel), USBankAccountType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : USBankNetworks.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i11) {
                return new USBankAccount[i11];
            }
        }

        /* loaded from: classes6.dex */
        public enum USBankAccountHolderType implements StripeModel {
            UNKNOWN("unknown"),
            INDIVIDUAL(Kind.INDIVIDUAL),
            COMPANY("company");
            
            public static final Parcelable.Creator<USBankAccountHolderType> CREATOR = new Creator();
            private final String value;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<USBankAccountHolderType> {
                @Override // android.os.Parcelable.Creator
                public final USBankAccountHolderType createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return USBankAccountHolderType.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final USBankAccountHolderType[] newArray(int i11) {
                    return new USBankAccountHolderType[i11];
                }
            }

            USBankAccountHolderType(String str) {
                this.value = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(name());
            }
        }

        /* loaded from: classes6.dex */
        public enum USBankAccountType implements StripeModel {
            UNKNOWN("unknown"),
            CHECKING("checking"),
            SAVINGS("savings");
            
            public static final Parcelable.Creator<USBankAccountType> CREATOR = new Creator();
            private final String value;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<USBankAccountType> {
                @Override // android.os.Parcelable.Creator
                public final USBankAccountType createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return USBankAccountType.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final USBankAccountType[] newArray(int i11) {
                    return new USBankAccountType[i11];
                }
            }

            USBankAccountType(String str) {
                this.value = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String getValue() {
                return this.value;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(name());
            }
        }

        /* loaded from: classes6.dex */
        public static final class USBankNetworks implements StripeModel {
            private final String preferred;
            private final List<String> supported;
            public static final Parcelable.Creator<USBankNetworks> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<USBankNetworks> {
                @Override // android.os.Parcelable.Creator
                public final USBankNetworks createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new USBankNetworks(parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final USBankNetworks[] newArray(int i11) {
                    return new USBankNetworks[i11];
                }
            }

            public USBankNetworks(String str, List<String> supported) {
                s.g(supported, "supported");
                this.preferred = str;
                this.supported = supported;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ USBankNetworks copy$default(USBankNetworks uSBankNetworks, String str, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = uSBankNetworks.preferred;
                }
                if ((i11 & 2) != 0) {
                    list = uSBankNetworks.supported;
                }
                return uSBankNetworks.copy(str, list);
            }

            public final String component1() {
                return this.preferred;
            }

            public final List<String> component2() {
                return this.supported;
            }

            public final USBankNetworks copy(String str, List<String> supported) {
                s.g(supported, "supported");
                return new USBankNetworks(str, supported);
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
                if (obj instanceof USBankNetworks) {
                    USBankNetworks uSBankNetworks = (USBankNetworks) obj;
                    return s.c(this.preferred, uSBankNetworks.preferred) && s.c(this.supported, uSBankNetworks.supported);
                }
                return false;
            }

            public final String getPreferred() {
                return this.preferred;
            }

            public final List<String> getSupported() {
                return this.supported;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                String str = this.preferred;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.supported.hashCode();
            }

            public String toString() {
                return "USBankNetworks(preferred=" + ((Object) this.preferred) + ", supported=" + this.supported + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.preferred);
                out.writeStringList(this.supported);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public USBankAccount(USBankAccountHolderType accountHolderType, USBankAccountType accountType, String str, String str2, String str3, String str4, USBankNetworks uSBankNetworks, String str5) {
            super(null);
            s.g(accountHolderType, "accountHolderType");
            s.g(accountType, "accountType");
            this.accountHolderType = accountHolderType;
            this.accountType = accountType;
            this.bankName = str;
            this.fingerprint = str2;
            this.last4 = str3;
            this.linkedAccount = str4;
            this.networks = uSBankNetworks;
            this.routingNumber = str5;
        }

        public final USBankAccountHolderType component1() {
            return this.accountHolderType;
        }

        public final USBankAccountType component2() {
            return this.accountType;
        }

        public final String component3() {
            return this.bankName;
        }

        public final String component4() {
            return this.fingerprint;
        }

        public final String component5() {
            return this.last4;
        }

        public final String component6() {
            return this.linkedAccount;
        }

        public final USBankNetworks component7() {
            return this.networks;
        }

        public final String component8() {
            return this.routingNumber;
        }

        public final USBankAccount copy(USBankAccountHolderType accountHolderType, USBankAccountType accountType, String str, String str2, String str3, String str4, USBankNetworks uSBankNetworks, String str5) {
            s.g(accountHolderType, "accountHolderType");
            s.g(accountType, "accountType");
            return new USBankAccount(accountHolderType, accountType, str, str2, str3, str4, uSBankNetworks, str5);
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
            if (obj instanceof USBankAccount) {
                USBankAccount uSBankAccount = (USBankAccount) obj;
                return this.accountHolderType == uSBankAccount.accountHolderType && this.accountType == uSBankAccount.accountType && s.c(this.bankName, uSBankAccount.bankName) && s.c(this.fingerprint, uSBankAccount.fingerprint) && s.c(this.last4, uSBankAccount.last4) && s.c(this.linkedAccount, uSBankAccount.linkedAccount) && s.c(this.networks, uSBankAccount.networks) && s.c(this.routingNumber, uSBankAccount.routingNumber);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.USBankAccount;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int hashCode = ((this.accountHolderType.hashCode() * 31) + this.accountType.hashCode()) * 31;
            String str = this.bankName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.fingerprint;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last4;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.linkedAccount;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            USBankNetworks uSBankNetworks = this.networks;
            int hashCode6 = (hashCode5 + (uSBankNetworks == null ? 0 : uSBankNetworks.hashCode())) * 31;
            String str5 = this.routingNumber;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(accountHolderType=" + this.accountHolderType + ", accountType=" + this.accountType + ", bankName=" + ((Object) this.bankName) + ", fingerprint=" + ((Object) this.fingerprint) + ", last4=" + ((Object) this.last4) + ", linkedAccount=" + ((Object) this.linkedAccount) + ", networks=" + this.networks + ", routingNumber=" + ((Object) this.routingNumber) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.accountHolderType.writeToParcel(out, i11);
            this.accountType.writeToParcel(out, i11);
            out.writeString(this.bankName);
            out.writeString(this.fingerprint);
            out.writeString(this.last4);
            out.writeString(this.linkedAccount);
            USBankNetworks uSBankNetworks = this.networks;
            if (uSBankNetworks == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                uSBankNetworks.writeToParcel(out, i11);
            }
            out.writeString(this.routingNumber);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Upi extends TypeData {
        public final String vpa;
        public static final Parcelable.Creator<Upi> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Upi> {
            @Override // android.os.Parcelable.Creator
            public final Upi createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Upi(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Upi[] newArray(int i11) {
                return new Upi[i11];
            }
        }

        public Upi(String str) {
            super(null);
            this.vpa = str;
        }

        public static /* synthetic */ Upi copy$default(Upi upi, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = upi.vpa;
            }
            return upi.copy(str);
        }

        public final String component1() {
            return this.vpa;
        }

        public final Upi copy(String str) {
            return new Upi(str);
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
            return (obj instanceof Upi) && s.c(this.vpa, ((Upi) obj).vpa);
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Upi;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            String str = this.vpa;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + ((Object) this.vpa) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.vpa);
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            iArr[Type.Card.ordinal()] = 1;
            iArr[Type.CardPresent.ordinal()] = 2;
            iArr[Type.Fpx.ordinal()] = 3;
            iArr[Type.Ideal.ordinal()] = 4;
            iArr[Type.SepaDebit.ordinal()] = 5;
            iArr[Type.AuBecsDebit.ordinal()] = 6;
            iArr[Type.BacsDebit.ordinal()] = 7;
            iArr[Type.Sofort.ordinal()] = 8;
            iArr[Type.USBankAccount.ordinal()] = 9;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaymentMethod(String str, Long l11, boolean z11, Type type, BillingDetails billingDetails, String str2, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount) {
        this.f20932id = str;
        this.created = l11;
        this.liveMode = z11;
        this.type = type;
        this.billingDetails = billingDetails;
        this.customerId = str2;
        this.card = card;
        this.cardPresent = cardPresent;
        this.fpx = fpx;
        this.ideal = ideal;
        this.sepaDebit = sepaDebit;
        this.auBecsDebit = auBecsDebit;
        this.bacsDebit = bacsDebit;
        this.sofort = sofort;
        this.upi = upi;
        this.netbanking = netbanking;
        this.usBankAccount = uSBankAccount;
    }

    public static final PaymentMethod fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return this.f20932id;
    }

    public final Ideal component10() {
        return this.ideal;
    }

    public final SepaDebit component11() {
        return this.sepaDebit;
    }

    public final AuBecsDebit component12() {
        return this.auBecsDebit;
    }

    public final BacsDebit component13() {
        return this.bacsDebit;
    }

    public final Sofort component14() {
        return this.sofort;
    }

    public final Upi component15() {
        return this.upi;
    }

    public final Netbanking component16() {
        return this.netbanking;
    }

    public final USBankAccount component17() {
        return this.usBankAccount;
    }

    public final Long component2() {
        return this.created;
    }

    public final boolean component3() {
        return this.liveMode;
    }

    public final Type component4() {
        return this.type;
    }

    public final BillingDetails component5() {
        return this.billingDetails;
    }

    public final String component6() {
        return this.customerId;
    }

    public final Card component7() {
        return this.card;
    }

    public final CardPresent component8() {
        return this.cardPresent;
    }

    public final Fpx component9() {
        return this.fpx;
    }

    public final PaymentMethod copy(String str, Long l11, boolean z11, Type type, BillingDetails billingDetails, String str2, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount) {
        return new PaymentMethod(str, l11, z11, type, billingDetails, str2, card, cardPresent, fpx, ideal, sepaDebit, auBecsDebit, bacsDebit, sofort, upi, netbanking, uSBankAccount);
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
        if (obj instanceof PaymentMethod) {
            PaymentMethod paymentMethod = (PaymentMethod) obj;
            return s.c(this.f20932id, paymentMethod.f20932id) && s.c(this.created, paymentMethod.created) && this.liveMode == paymentMethod.liveMode && this.type == paymentMethod.type && s.c(this.billingDetails, paymentMethod.billingDetails) && s.c(this.customerId, paymentMethod.customerId) && s.c(this.card, paymentMethod.card) && s.c(this.cardPresent, paymentMethod.cardPresent) && s.c(this.fpx, paymentMethod.fpx) && s.c(this.ideal, paymentMethod.ideal) && s.c(this.sepaDebit, paymentMethod.sepaDebit) && s.c(this.auBecsDebit, paymentMethod.auBecsDebit) && s.c(this.bacsDebit, paymentMethod.bacsDebit) && s.c(this.sofort, paymentMethod.sofort) && s.c(this.upi, paymentMethod.upi) && s.c(this.netbanking, paymentMethod.netbanking) && s.c(this.usBankAccount, paymentMethod.usBankAccount);
        }
        return false;
    }

    public final boolean hasExpectedDetails() {
        Type type = this.type;
        switch (type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                if (this.card == null) {
                    return false;
                }
                break;
            case 2:
                if (this.cardPresent == null) {
                    return false;
                }
                break;
            case 3:
                if (this.fpx == null) {
                    return false;
                }
                break;
            case 4:
                if (this.ideal == null) {
                    return false;
                }
                break;
            case 5:
                if (this.sepaDebit == null) {
                    return false;
                }
                break;
            case 6:
                if (this.auBecsDebit == null) {
                    return false;
                }
                break;
            case 7:
                if (this.bacsDebit == null) {
                    return false;
                }
                break;
            case 8:
                if (this.sofort == null) {
                    return false;
                }
                break;
            case 9:
                if (this.usBankAccount == null) {
                    return false;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.f20932id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l11 = this.created;
        int hashCode2 = (hashCode + (l11 == null ? 0 : l11.hashCode())) * 31;
        boolean z11 = this.liveMode;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode2 + i11) * 31;
        Type type = this.type;
        int hashCode3 = (i12 + (type == null ? 0 : type.hashCode())) * 31;
        BillingDetails billingDetails = this.billingDetails;
        int hashCode4 = (hashCode3 + (billingDetails == null ? 0 : billingDetails.hashCode())) * 31;
        String str2 = this.customerId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Card card = this.card;
        int hashCode6 = (hashCode5 + (card == null ? 0 : card.hashCode())) * 31;
        CardPresent cardPresent = this.cardPresent;
        int hashCode7 = (hashCode6 + (cardPresent == null ? 0 : cardPresent.hashCode())) * 31;
        Fpx fpx = this.fpx;
        int hashCode8 = (hashCode7 + (fpx == null ? 0 : fpx.hashCode())) * 31;
        Ideal ideal = this.ideal;
        int hashCode9 = (hashCode8 + (ideal == null ? 0 : ideal.hashCode())) * 31;
        SepaDebit sepaDebit = this.sepaDebit;
        int hashCode10 = (hashCode9 + (sepaDebit == null ? 0 : sepaDebit.hashCode())) * 31;
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        int hashCode11 = (hashCode10 + (auBecsDebit == null ? 0 : auBecsDebit.hashCode())) * 31;
        BacsDebit bacsDebit = this.bacsDebit;
        int hashCode12 = (hashCode11 + (bacsDebit == null ? 0 : bacsDebit.hashCode())) * 31;
        Sofort sofort = this.sofort;
        int hashCode13 = (hashCode12 + (sofort == null ? 0 : sofort.hashCode())) * 31;
        Upi upi = this.upi;
        int hashCode14 = (hashCode13 + (upi == null ? 0 : upi.hashCode())) * 31;
        Netbanking netbanking = this.netbanking;
        int hashCode15 = (hashCode14 + (netbanking == null ? 0 : netbanking.hashCode())) * 31;
        USBankAccount uSBankAccount = this.usBankAccount;
        return hashCode15 + (uSBankAccount != null ? uSBankAccount.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethod(id=" + ((Object) this.f20932id) + ", created=" + this.created + ", liveMode=" + this.liveMode + ", type=" + this.type + ", billingDetails=" + this.billingDetails + ", customerId=" + ((Object) this.customerId) + ", card=" + this.card + ", cardPresent=" + this.cardPresent + ", fpx=" + this.fpx + ", ideal=" + this.ideal + ", sepaDebit=" + this.sepaDebit + ", auBecsDebit=" + this.auBecsDebit + ", bacsDebit=" + this.bacsDebit + ", sofort=" + this.sofort + ", upi=" + this.upi + ", netbanking=" + this.netbanking + ", usBankAccount=" + this.usBankAccount + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f20932id);
        Long l11 = this.created;
        if (l11 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l11.longValue());
        }
        out.writeInt(this.liveMode ? 1 : 0);
        Type type = this.type;
        if (type == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            type.writeToParcel(out, i11);
        }
        BillingDetails billingDetails = this.billingDetails;
        if (billingDetails == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            billingDetails.writeToParcel(out, i11);
        }
        out.writeString(this.customerId);
        Card card = this.card;
        if (card == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            card.writeToParcel(out, i11);
        }
        CardPresent cardPresent = this.cardPresent;
        if (cardPresent == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cardPresent.writeToParcel(out, i11);
        }
        Fpx fpx = this.fpx;
        if (fpx == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            fpx.writeToParcel(out, i11);
        }
        Ideal ideal = this.ideal;
        if (ideal == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            ideal.writeToParcel(out, i11);
        }
        SepaDebit sepaDebit = this.sepaDebit;
        if (sepaDebit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sepaDebit.writeToParcel(out, i11);
        }
        AuBecsDebit auBecsDebit = this.auBecsDebit;
        if (auBecsDebit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            auBecsDebit.writeToParcel(out, i11);
        }
        BacsDebit bacsDebit = this.bacsDebit;
        if (bacsDebit == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bacsDebit.writeToParcel(out, i11);
        }
        Sofort sofort = this.sofort;
        if (sofort == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sofort.writeToParcel(out, i11);
        }
        Upi upi = this.upi;
        if (upi == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            upi.writeToParcel(out, i11);
        }
        Netbanking netbanking = this.netbanking;
        if (netbanking == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            netbanking.writeToParcel(out, i11);
        }
        USBankAccount uSBankAccount = this.usBankAccount;
        if (uSBankAccount == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        uSBankAccount.writeToParcel(out, i11);
    }

    /* loaded from: classes6.dex */
    public static final class Card extends TypeData {
        public final CardBrand brand;
        public final Checks checks;
        public final String country;
        public final Integer expiryMonth;
        public final Integer expiryYear;
        public final String fingerprint;
        public final String funding;
        public final String last4;
        public final Networks networks;
        public final ThreeDSecureUsage threeDSecureUsage;
        public final Wallet wallet;
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Checks implements StripeModel {
            public final String addressLine1Check;
            public final String addressPostalCodeCheck;
            public final String cvcCheck;
            public static final Parcelable.Creator<Checks> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Checks> {
                @Override // android.os.Parcelable.Creator
                public final Checks createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new Checks(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Checks[] newArray(int i11) {
                    return new Checks[i11];
                }
            }

            public Checks(String str, String str2, String str3) {
                this.addressLine1Check = str;
                this.addressPostalCodeCheck = str2;
                this.cvcCheck = str3;
            }

            public static /* synthetic */ Checks copy$default(Checks checks, String str, String str2, String str3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = checks.addressLine1Check;
                }
                if ((i11 & 2) != 0) {
                    str2 = checks.addressPostalCodeCheck;
                }
                if ((i11 & 4) != 0) {
                    str3 = checks.cvcCheck;
                }
                return checks.copy(str, str2, str3);
            }

            public final String component1() {
                return this.addressLine1Check;
            }

            public final String component2() {
                return this.addressPostalCodeCheck;
            }

            public final String component3() {
                return this.cvcCheck;
            }

            public final Checks copy(String str, String str2, String str3) {
                return new Checks(str, str2, str3);
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
                if (obj instanceof Checks) {
                    Checks checks = (Checks) obj;
                    return s.c(this.addressLine1Check, checks.addressLine1Check) && s.c(this.addressPostalCodeCheck, checks.addressPostalCodeCheck) && s.c(this.cvcCheck, checks.cvcCheck);
                }
                return false;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                String str = this.addressLine1Check;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.addressPostalCodeCheck;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.cvcCheck;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Checks(addressLine1Check=" + ((Object) this.addressLine1Check) + ", addressPostalCodeCheck=" + ((Object) this.addressPostalCodeCheck) + ", cvcCheck=" + ((Object) this.cvcCheck) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeString(this.addressLine1Check);
                out.writeString(this.addressPostalCodeCheck);
                out.writeString(this.cvcCheck);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Card> {
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Card(CardBrand.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Checks.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ThreeDSecureUsage.CREATOR.createFromParcel(parcel), (Wallet) parcel.readParcelable(Card.class.getClassLoader()), parcel.readInt() != 0 ? Networks.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        /* loaded from: classes6.dex */
        public static final class ThreeDSecureUsage implements StripeModel {
            public final boolean isSupported;
            public static final Parcelable.Creator<ThreeDSecureUsage> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<ThreeDSecureUsage> {
                @Override // android.os.Parcelable.Creator
                public final ThreeDSecureUsage createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    return new ThreeDSecureUsage(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ThreeDSecureUsage[] newArray(int i11) {
                    return new ThreeDSecureUsage[i11];
                }
            }

            public ThreeDSecureUsage(boolean z11) {
                this.isSupported = z11;
            }

            public static /* synthetic */ ThreeDSecureUsage copy$default(ThreeDSecureUsage threeDSecureUsage, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = threeDSecureUsage.isSupported;
                }
                return threeDSecureUsage.copy(z11);
            }

            public final boolean component1() {
                return this.isSupported;
            }

            public final ThreeDSecureUsage copy(boolean z11) {
                return new ThreeDSecureUsage(z11);
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
                return (obj instanceof ThreeDSecureUsage) && this.isSupported == ((ThreeDSecureUsage) obj).isSupported;
            }

            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                boolean z11 = this.isSupported;
                if (z11) {
                    return 1;
                }
                return z11 ? 1 : 0;
            }

            public String toString() {
                return "ThreeDSecureUsage(isSupported=" + this.isSupported + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                out.writeInt(this.isSupported ? 1 : 0);
            }
        }

        public Card() {
            this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        }

        public /* synthetic */ Card(CardBrand cardBrand, Checks checks, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage, Wallet wallet, Networks networks, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CardBrand.Unknown : cardBrand, (i11 & 2) != 0 ? null : checks, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? null : str4, (i11 & 256) != 0 ? null : threeDSecureUsage, (i11 & 512) != 0 ? null : wallet, (i11 & 1024) == 0 ? networks : null);
        }

        public final CardBrand component1() {
            return this.brand;
        }

        public final Wallet component10() {
            return this.wallet;
        }

        public final Networks component11$payments_core_release() {
            return this.networks;
        }

        public final Checks component2() {
            return this.checks;
        }

        public final String component3() {
            return this.country;
        }

        public final Integer component4() {
            return this.expiryMonth;
        }

        public final Integer component5() {
            return this.expiryYear;
        }

        public final String component6() {
            return this.fingerprint;
        }

        public final String component7() {
            return this.funding;
        }

        public final String component8() {
            return this.last4;
        }

        public final ThreeDSecureUsage component9() {
            return this.threeDSecureUsage;
        }

        public final Card copy(CardBrand brand, Checks checks, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage, Wallet wallet, Networks networks) {
            s.g(brand, "brand");
            return new Card(brand, checks, str, num, num2, str2, str3, str4, threeDSecureUsage, wallet, networks);
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
            if (obj instanceof Card) {
                Card card = (Card) obj;
                return this.brand == card.brand && s.c(this.checks, card.checks) && s.c(this.country, card.country) && s.c(this.expiryMonth, card.expiryMonth) && s.c(this.expiryYear, card.expiryYear) && s.c(this.fingerprint, card.fingerprint) && s.c(this.funding, card.funding) && s.c(this.last4, card.last4) && s.c(this.threeDSecureUsage, card.threeDSecureUsage) && s.c(this.wallet, card.wallet) && s.c(this.networks, card.networks);
            }
            return false;
        }

        @Override // com.stripe.android.model.PaymentMethod.TypeData
        public Type getType() {
            return Type.Card;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int hashCode = this.brand.hashCode() * 31;
            Checks checks = this.checks;
            int hashCode2 = (hashCode + (checks == null ? 0 : checks.hashCode())) * 31;
            String str = this.country;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.expiryMonth;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.expiryYear;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.fingerprint;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.funding;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.last4;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            int hashCode9 = (hashCode8 + (threeDSecureUsage == null ? 0 : threeDSecureUsage.hashCode())) * 31;
            Wallet wallet = this.wallet;
            int hashCode10 = (hashCode9 + (wallet == null ? 0 : wallet.hashCode())) * 31;
            Networks networks = this.networks;
            return hashCode10 + (networks != null ? networks.hashCode() : 0);
        }

        public String toString() {
            return "Card(brand=" + this.brand + ", checks=" + this.checks + ", country=" + ((Object) this.country) + ", expiryMonth=" + this.expiryMonth + ", expiryYear=" + this.expiryYear + ", fingerprint=" + ((Object) this.fingerprint) + ", funding=" + ((Object) this.funding) + ", last4=" + ((Object) this.last4) + ", threeDSecureUsage=" + this.threeDSecureUsage + ", wallet=" + this.wallet + ", networks=" + this.networks + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.brand.name());
            Checks checks = this.checks;
            if (checks == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                checks.writeToParcel(out, i11);
            }
            out.writeString(this.country);
            Integer num = this.expiryMonth;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.expiryYear;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.fingerprint);
            out.writeString(this.funding);
            out.writeString(this.last4);
            ThreeDSecureUsage threeDSecureUsage = this.threeDSecureUsage;
            if (threeDSecureUsage == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                threeDSecureUsage.writeToParcel(out, i11);
            }
            out.writeParcelable(this.wallet, i11);
            Networks networks = this.networks;
            if (networks == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            networks.writeToParcel(out, i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Card(CardBrand brand, Checks checks, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage, Wallet wallet, Networks networks) {
            super(null);
            s.g(brand, "brand");
            this.brand = brand;
            this.checks = checks;
            this.country = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.fingerprint = str2;
            this.funding = str3;
            this.last4 = str4;
            this.threeDSecureUsage = threeDSecureUsage;
            this.wallet = wallet;
            this.networks = networks;
        }

        /* loaded from: classes6.dex */
        public static final class Networks implements StripeModel {
            private final Set<String> available;
            private final String preferred;
            private final boolean selectionMandatory;
            public static final Parcelable.Creator<Networks> CREATOR = new Creator();
            public static final int $stable = 8;

            /* loaded from: classes6.dex */
            public static final class Creator implements Parcelable.Creator<Networks> {
                @Override // android.os.Parcelable.Creator
                public final Networks createFromParcel(Parcel parcel) {
                    s.g(parcel, "parcel");
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new Networks(linkedHashSet, parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Networks[] newArray(int i11) {
                    return new Networks[i11];
                }
            }

            public Networks() {
                this(null, false, null, 7, null);
            }

            public Networks(Set<String> available, boolean z11, String str) {
                s.g(available, "available");
                this.available = available;
                this.selectionMandatory = z11;
                this.preferred = str;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Networks copy$default(Networks networks, Set set, boolean z11, String str, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    set = networks.available;
                }
                if ((i11 & 2) != 0) {
                    z11 = networks.selectionMandatory;
                }
                if ((i11 & 4) != 0) {
                    str = networks.preferred;
                }
                return networks.copy(set, z11, str);
            }

            public final Set<String> component1() {
                return this.available;
            }

            public final boolean component2() {
                return this.selectionMandatory;
            }

            public final String component3() {
                return this.preferred;
            }

            public final Networks copy(Set<String> available, boolean z11, String str) {
                s.g(available, "available");
                return new Networks(available, z11, str);
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
                if (obj instanceof Networks) {
                    Networks networks = (Networks) obj;
                    return s.c(this.available, networks.available) && this.selectionMandatory == networks.selectionMandatory && s.c(this.preferred, networks.preferred);
                }
                return false;
            }

            public final Set<String> getAvailable() {
                return this.available;
            }

            public final String getPreferred() {
                return this.preferred;
            }

            public final boolean getSelectionMandatory() {
                return this.selectionMandatory;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.stripe.android.core.model.StripeModel
            public int hashCode() {
                int hashCode = this.available.hashCode() * 31;
                boolean z11 = this.selectionMandatory;
                int i11 = z11;
                if (z11 != 0) {
                    i11 = 1;
                }
                int i12 = (hashCode + i11) * 31;
                String str = this.preferred;
                return i12 + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Networks(available=" + this.available + ", selectionMandatory=" + this.selectionMandatory + ", preferred=" + ((Object) this.preferred) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i11) {
                s.g(out, "out");
                Set<String> set = this.available;
                out.writeInt(set.size());
                for (String str : set) {
                    out.writeString(str);
                }
                out.writeInt(this.selectionMandatory ? 1 : 0);
                out.writeString(this.preferred);
            }

            public /* synthetic */ Networks(Set set, boolean z11, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? x0.d() : set, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? null : str);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class BillingDetails implements StripeModel, StripeParamsModel {
        public static final int $stable = 0;
        public static final String PARAM_ADDRESS = "address";
        public static final String PARAM_EMAIL = "email";
        public static final String PARAM_NAME = "name";
        public static final String PARAM_PHONE = "phone";
        public final Address address;
        public final String email;
        public final String name;
        public final String phone;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<BillingDetails> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        public static final class Builder implements ObjectBuilder<BillingDetails> {
            public static final int $stable = 8;
            private Address address;
            private String email;
            private String name;
            private String phone;

            public final Builder setAddress(Address address) {
                this.address = address;
                return this;
            }

            public final Builder setEmail(String str) {
                this.email = str;
                return this;
            }

            public final Builder setName(String str) {
                this.name = str;
                return this;
            }

            public final Builder setPhone(String str) {
                this.phone = str;
                return this;
            }

            @Override // com.stripe.android.ObjectBuilder
            public BillingDetails build() {
                return new BillingDetails(this.address, this.email, this.name, this.phone);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final BillingDetails create(ShippingInformation shippingInformation) {
                s.g(shippingInformation, "shippingInformation");
                return new BillingDetails(shippingInformation.getAddress(), null, shippingInformation.getName(), shippingInformation.getPhone(), 2, null);
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<BillingDetails> {
            @Override // android.os.Parcelable.Creator
            public final BillingDetails createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new BillingDetails(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BillingDetails[] newArray(int i11) {
                return new BillingDetails[i11];
            }
        }

        public BillingDetails() {
            this(null, null, null, null, 15, null);
        }

        public BillingDetails(Address address) {
            this(address, null, null, null, 14, null);
        }

        public BillingDetails(Address address, String str) {
            this(address, str, null, null, 12, null);
        }

        public BillingDetails(Address address, String str, String str2) {
            this(address, str, str2, null, 8, null);
        }

        public BillingDetails(Address address, String str, String str2, String str3) {
            this.address = address;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public static /* synthetic */ BillingDetails copy$default(BillingDetails billingDetails, Address address, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                address = billingDetails.address;
            }
            if ((i11 & 2) != 0) {
                str = billingDetails.email;
            }
            if ((i11 & 4) != 0) {
                str2 = billingDetails.name;
            }
            if ((i11 & 8) != 0) {
                str3 = billingDetails.phone;
            }
            return billingDetails.copy(address, str, str2, str3);
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final BillingDetails copy(Address address, String str, String str2, String str3) {
            return new BillingDetails(address, str, str2, str3);
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
            if (obj instanceof BillingDetails) {
                BillingDetails billingDetails = (BillingDetails) obj;
                return s.c(this.address, billingDetails.address) && s.c(this.email, billingDetails.email) && s.c(this.name, billingDetails.name) && s.c(this.phone, billingDetails.phone);
            }
            return false;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final Builder toBuilder() {
            return new Builder().setAddress(this.address).setEmail(this.email).setName(this.name).setPhone(this.phone);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map i11;
            Map p11;
            Map p12;
            Map p13;
            Map<String, Object> p14;
            i11 = s0.i();
            Address address = this.address;
            Map f11 = address == null ? null : r0.f(v.a("address", address.toParamMap()));
            if (f11 == null) {
                f11 = s0.i();
            }
            p11 = s0.p(i11, f11);
            String str = this.email;
            Map f12 = str == null ? null : r0.f(v.a("email", str));
            if (f12 == null) {
                f12 = s0.i();
            }
            p12 = s0.p(p11, f12);
            String str2 = this.name;
            Map f13 = str2 == null ? null : r0.f(v.a("name", str2));
            if (f13 == null) {
                f13 = s0.i();
            }
            p13 = s0.p(p12, f13);
            String str3 = this.phone;
            Map f14 = str3 != null ? r0.f(v.a(PARAM_PHONE, str3)) : null;
            if (f14 == null) {
                f14 = s0.i();
            }
            p14 = s0.p(p13, f14);
            return p14;
        }

        public String toString() {
            return "BillingDetails(address=" + this.address + ", email=" + ((Object) this.email) + ", name=" + ((Object) this.name) + ", phone=" + ((Object) this.phone) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            Address address = this.address;
            if (address == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                address.writeToParcel(out, i11);
            }
            out.writeString(this.email);
            out.writeString(this.name);
            out.writeString(this.phone);
        }

        public /* synthetic */ BillingDetails(Address address, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : address, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3);
        }
    }

    public /* synthetic */ PaymentMethod(String str, Long l11, boolean z11, Type type, BillingDetails billingDetails, String str2, Card card, CardPresent cardPresent, Fpx fpx, Ideal ideal, SepaDebit sepaDebit, AuBecsDebit auBecsDebit, BacsDebit bacsDebit, Sofort sofort, Upi upi, Netbanking netbanking, USBankAccount uSBankAccount, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, l11, z11, type, (i11 & 16) != 0 ? null : billingDetails, (i11 & 32) != 0 ? null : str2, (i11 & 64) != 0 ? null : card, (i11 & 128) != 0 ? null : cardPresent, (i11 & 256) != 0 ? null : fpx, (i11 & 512) != 0 ? null : ideal, (i11 & 1024) != 0 ? null : sepaDebit, (i11 & 2048) != 0 ? null : auBecsDebit, (i11 & 4096) != 0 ? null : bacsDebit, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : sofort, (i11 & 16384) != 0 ? null : upi, (32768 & i11) != 0 ? null : netbanking, (i11 & 65536) != 0 ? null : uSBankAccount);
    }
}