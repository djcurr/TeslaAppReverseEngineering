package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.SourceTypeModel;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class CustomerSource extends CustomerPaymentSource {
    private final Source source;
    public static final Parcelable.Creator<CustomerSource> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<CustomerSource> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerSource createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new CustomerSource(Source.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CustomerSource[] newArray(int i11) {
            return new CustomerSource[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerSource(Source source) {
        super(null);
        s.g(source, "source");
        this.source = source;
    }

    public static /* synthetic */ CustomerSource copy$default(CustomerSource customerSource, Source source, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            source = customerSource.source;
        }
        return customerSource.copy(source);
    }

    public final Source component1() {
        return this.source;
    }

    public final CustomerSource copy(Source source) {
        s.g(source, "source");
        return new CustomerSource(source);
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
        return (obj instanceof CustomerSource) && s.c(this.source, ((CustomerSource) obj).source);
    }

    @Override // com.stripe.android.model.CustomerPaymentSource
    public String getId() {
        return this.source.getId();
    }

    public final Source getSource() {
        return this.source;
    }

    @Override // com.stripe.android.model.CustomerPaymentSource
    public TokenizationMethod getTokenizationMethod() {
        if (this.source.getSourceTypeModel() instanceof SourceTypeModel.Card) {
            return ((SourceTypeModel.Card) this.source.getSourceTypeModel()).getTokenizationMethod();
        }
        return null;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.source.hashCode();
    }

    public String toString() {
        return "CustomerSource(source=" + this.source + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        this.source.writeToParcel(out, i11);
    }
}