package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class Customer implements StripeModel {
    private final String defaultSource;
    private final String description;
    private final String email;
    private final boolean hasMore;

    /* renamed from: id  reason: collision with root package name */
    private final String f20929id;
    private final boolean liveMode;
    private final ShippingInformation shippingInformation;
    private final List<CustomerPaymentSource> sources;
    private final Integer totalCount;
    private final String url;
    public static final Parcelable.Creator<Customer> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<Customer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Customer createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ShippingInformation createFromParcel = parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(parcel.readParcelable(Customer.class.getClassLoader()));
            }
            return new Customer(readString, readString2, createFromParcel, arrayList, parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Customer[] newArray(int i11) {
            return new Customer[i11];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Customer(String str, String str2, ShippingInformation shippingInformation, List<? extends CustomerPaymentSource> sources, boolean z11, Integer num, String str3, String str4, String str5, boolean z12) {
        s.g(sources, "sources");
        this.f20929id = str;
        this.defaultSource = str2;
        this.shippingInformation = shippingInformation;
        this.sources = sources;
        this.hasMore = z11;
        this.totalCount = num;
        this.url = str3;
        this.description = str4;
        this.email = str5;
        this.liveMode = z12;
    }

    public final String component1() {
        return this.f20929id;
    }

    public final boolean component10() {
        return this.liveMode;
    }

    public final String component2() {
        return this.defaultSource;
    }

    public final ShippingInformation component3() {
        return this.shippingInformation;
    }

    public final List<CustomerPaymentSource> component4() {
        return this.sources;
    }

    public final boolean component5() {
        return this.hasMore;
    }

    public final Integer component6() {
        return this.totalCount;
    }

    public final String component7() {
        return this.url;
    }

    public final String component8() {
        return this.description;
    }

    public final String component9() {
        return this.email;
    }

    public final Customer copy(String str, String str2, ShippingInformation shippingInformation, List<? extends CustomerPaymentSource> sources, boolean z11, Integer num, String str3, String str4, String str5, boolean z12) {
        s.g(sources, "sources");
        return new Customer(str, str2, shippingInformation, sources, z11, num, str3, str4, str5, z12);
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
        if (obj instanceof Customer) {
            Customer customer = (Customer) obj;
            return s.c(this.f20929id, customer.f20929id) && s.c(this.defaultSource, customer.defaultSource) && s.c(this.shippingInformation, customer.shippingInformation) && s.c(this.sources, customer.sources) && this.hasMore == customer.hasMore && s.c(this.totalCount, customer.totalCount) && s.c(this.url, customer.url) && s.c(this.description, customer.description) && s.c(this.email, customer.email) && this.liveMode == customer.liveMode;
        }
        return false;
    }

    public final String getDefaultSource() {
        return this.defaultSource;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getEmail() {
        return this.email;
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getId() {
        return this.f20929id;
    }

    public final boolean getLiveMode() {
        return this.liveMode;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }

    public final CustomerPaymentSource getSourceById(String sourceId) {
        Object obj;
        s.g(sourceId, "sourceId");
        Iterator<T> it2 = this.sources.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (s.c(((CustomerPaymentSource) obj).getId(), sourceId)) {
                break;
            }
        }
        return (CustomerPaymentSource) obj;
    }

    public final List<CustomerPaymentSource> getSources() {
        return this.sources;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        String str = this.f20929id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultSource;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        int hashCode3 = (((hashCode2 + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31) + this.sources.hashCode()) * 31;
        boolean z11 = this.hasMore;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode3 + i11) * 31;
        Integer num = this.totalCount;
        int hashCode4 = (i12 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.url;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        boolean z12 = this.liveMode;
        return hashCode7 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        return "Customer(id=" + ((Object) this.f20929id) + ", defaultSource=" + ((Object) this.defaultSource) + ", shippingInformation=" + this.shippingInformation + ", sources=" + this.sources + ", hasMore=" + this.hasMore + ", totalCount=" + this.totalCount + ", url=" + ((Object) this.url) + ", description=" + ((Object) this.description) + ", email=" + ((Object) this.email) + ", liveMode=" + this.liveMode + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f20929id);
        out.writeString(this.defaultSource);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shippingInformation.writeToParcel(out, i11);
        }
        List<CustomerPaymentSource> list = this.sources;
        out.writeInt(list.size());
        for (CustomerPaymentSource customerPaymentSource : list) {
            out.writeParcelable(customerPaymentSource, i11);
        }
        out.writeInt(this.hasMore ? 1 : 0);
        Integer num = this.totalCount;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.url);
        out.writeString(this.description);
        out.writeString(this.email);
        out.writeInt(this.liveMode ? 1 : 0);
    }
}