package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.parsers.TokenJsonParser;
import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Token implements StripeModel, StripePaymentSource {
    private final BankAccount bankAccount;
    private final Card card;
    private final Date created;

    /* renamed from: id  reason: collision with root package name */
    private final String f20939id;
    private final boolean livemode;
    private final Type type;
    private final boolean used;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Token> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Token fromJson(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            return new TokenJsonParser().parse(jSONObject);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Token> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Token createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new Token(parcel.readString(), Type.valueOf(parcel.readString()), (Date) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : BankAccount.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Card.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Token[] newArray(int i11) {
            return new Token[i11];
        }
    }

    /* loaded from: classes6.dex */
    public enum Type {
        Card("card"),
        BankAccount("bank_account"),
        Pii("pii"),
        Account("account"),
        CvcUpdate("cvc_update"),
        Person("person");
        
        public static final Companion Companion = new Companion(null);
        private final String code;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Type fromCode(String str) {
                Type[] values;
                for (Type type : Type.values()) {
                    if (s.c(type.getCode(), str)) {
                        return type;
                    }
                }
                return null;
            }
        }

        Type(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    public Token(String id2, Type type, Date created, boolean z11, boolean z12, BankAccount bankAccount, Card card) {
        s.g(id2, "id");
        s.g(type, "type");
        s.g(created, "created");
        this.f20939id = id2;
        this.type = type;
        this.created = created;
        this.livemode = z11;
        this.used = z12;
        this.bankAccount = bankAccount;
        this.card = card;
    }

    public static /* synthetic */ Token copy$default(Token token, String str, Type type, Date date, boolean z11, boolean z12, BankAccount bankAccount, Card card, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = token.getId();
        }
        if ((i11 & 2) != 0) {
            type = token.type;
        }
        Type type2 = type;
        if ((i11 & 4) != 0) {
            date = token.created;
        }
        Date date2 = date;
        if ((i11 & 8) != 0) {
            z11 = token.livemode;
        }
        boolean z13 = z11;
        if ((i11 & 16) != 0) {
            z12 = token.used;
        }
        boolean z14 = z12;
        if ((i11 & 32) != 0) {
            bankAccount = token.bankAccount;
        }
        BankAccount bankAccount2 = bankAccount;
        if ((i11 & 64) != 0) {
            card = token.card;
        }
        return token.copy(str, type2, date2, z13, z14, bankAccount2, card);
    }

    public static final Token fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return getId();
    }

    public final Type component2() {
        return this.type;
    }

    public final Date component3() {
        return this.created;
    }

    public final boolean component4() {
        return this.livemode;
    }

    public final boolean component5() {
        return this.used;
    }

    public final BankAccount component6() {
        return this.bankAccount;
    }

    public final Card component7() {
        return this.card;
    }

    public final Token copy(String id2, Type type, Date created, boolean z11, boolean z12, BankAccount bankAccount, Card card) {
        s.g(id2, "id");
        s.g(type, "type");
        s.g(created, "created");
        return new Token(id2, type, created, z11, z12, bankAccount, card);
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
        if (obj instanceof Token) {
            Token token = (Token) obj;
            return s.c(getId(), token.getId()) && this.type == token.type && s.c(this.created, token.created) && this.livemode == token.livemode && this.used == token.used && s.c(this.bankAccount, token.bankAccount) && s.c(this.card, token.card);
        }
        return false;
    }

    public final BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public final Card getCard() {
        return this.card;
    }

    public final Date getCreated() {
        return this.created;
    }

    @Override // com.stripe.android.model.StripePaymentSource
    public String getId() {
        return this.f20939id;
    }

    public final boolean getLivemode() {
        return this.livemode;
    }

    public final Type getType() {
        return this.type;
    }

    public final boolean getUsed() {
        return this.used;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((getId().hashCode() * 31) + this.type.hashCode()) * 31) + this.created.hashCode()) * 31;
        boolean z11 = this.livemode;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z12 = this.used;
        int i13 = (i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31;
        BankAccount bankAccount = this.bankAccount;
        int hashCode2 = (i13 + (bankAccount == null ? 0 : bankAccount.hashCode())) * 31;
        Card card = this.card;
        return hashCode2 + (card != null ? card.hashCode() : 0);
    }

    public String toString() {
        return "Token(id=" + getId() + ", type=" + this.type + ", created=" + this.created + ", livemode=" + this.livemode + ", used=" + this.used + ", bankAccount=" + this.bankAccount + ", card=" + this.card + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f20939id);
        out.writeString(this.type.name());
        out.writeSerializable(this.created);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeInt(this.used ? 1 : 0);
        BankAccount bankAccount = this.bankAccount;
        if (bankAccount == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bankAccount.writeToParcel(out, i11);
        }
        Card card = this.card;
        if (card == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        card.writeToParcel(out, i11);
    }

    public /* synthetic */ Token(String str, Type type, Date date, boolean z11, boolean z12, BankAccount bankAccount, Card card, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, type, date, z11, z12, (i11 & 32) != 0 ? null : bankAccount, (i11 & 64) != 0 ? null : card);
    }
}