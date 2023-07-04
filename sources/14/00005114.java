package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class CustomerCard extends CustomerPaymentSource {
    private final Card card;
    public static final Parcelable.Creator<CustomerCard> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<CustomerCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerCard createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new CustomerCard((Card) parcel.readParcelable(CustomerCard.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerCard[] newArray(int i11) {
            return new CustomerCard[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerCard(Card card) {
        super(null);
        s.g(card, "card");
        this.card = card;
    }

    public static /* synthetic */ CustomerCard copy$default(CustomerCard customerCard, Card card, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            card = customerCard.card;
        }
        return customerCard.copy(card);
    }

    public final Card component1() {
        return this.card;
    }

    public final CustomerCard copy(Card card) {
        s.g(card, "card");
        return new CustomerCard(card);
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
        return (obj instanceof CustomerCard) && s.c(this.card, ((CustomerCard) obj).card);
    }

    public final Card getCard() {
        return this.card;
    }

    @Override // com.stripe.android.model.CustomerPaymentSource
    public String getId() {
        return this.card.getId();
    }

    @Override // com.stripe.android.model.CustomerPaymentSource
    public TokenizationMethod getTokenizationMethod() {
        return this.card.getTokenizationMethod();
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.card.hashCode();
    }

    public String toString() {
        return "CustomerCard(card=" + this.card + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeParcelable(this.card, i11);
    }
}