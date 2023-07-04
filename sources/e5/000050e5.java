package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.cards.Bin;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class CardMetadata implements StripeModel {
    public static final Parcelable.Creator<CardMetadata> CREATOR = new Creator();
    private final List<AccountRange> accountRanges;
    private final Bin bin;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<CardMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardMetadata createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            Bin bin = (Bin) parcel.readParcelable(CardMetadata.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(AccountRange.CREATOR.createFromParcel(parcel));
            }
            return new CardMetadata(bin, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CardMetadata[] newArray(int i11) {
            return new CardMetadata[i11];
        }
    }

    public CardMetadata(Bin bin, List<AccountRange> accountRanges) {
        s.g(bin, "bin");
        s.g(accountRanges, "accountRanges");
        this.bin = bin;
        this.accountRanges = accountRanges;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardMetadata copy$default(CardMetadata cardMetadata, Bin bin, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bin = cardMetadata.bin;
        }
        if ((i11 & 2) != 0) {
            list = cardMetadata.accountRanges;
        }
        return cardMetadata.copy(bin, list);
    }

    public final Bin component1() {
        return this.bin;
    }

    public final List<AccountRange> component2() {
        return this.accountRanges;
    }

    public final CardMetadata copy(Bin bin, List<AccountRange> accountRanges) {
        s.g(bin, "bin");
        s.g(accountRanges, "accountRanges");
        return new CardMetadata(bin, accountRanges);
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
        if (obj instanceof CardMetadata) {
            CardMetadata cardMetadata = (CardMetadata) obj;
            return s.c(this.bin, cardMetadata.bin) && s.c(this.accountRanges, cardMetadata.accountRanges);
        }
        return false;
    }

    public final List<AccountRange> getAccountRanges() {
        return this.accountRanges;
    }

    public final Bin getBin() {
        return this.bin;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return (this.bin.hashCode() * 31) + this.accountRanges.hashCode();
    }

    public String toString() {
        return "CardMetadata(bin=" + this.bin + ", accountRanges=" + this.accountRanges + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeParcelable(this.bin, i11);
        List<AccountRange> list = this.accountRanges;
        out.writeInt(list.size());
        for (AccountRange accountRange : list) {
            accountRange.writeToParcel(out, i11);
        }
    }
}