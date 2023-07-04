package com.stripe.android.financialconnections.model;

import android.os.Parcel;
import android.os.Parcelable;
import c30.b;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import e30.f;
import f30.d;
import g30.f1;
import g30.k0;
import g30.q1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes2.dex */
public final class FinancialConnectionsAccountList implements StripeModel, Parcelable {
    private final Integer count;
    private final List<FinancialConnectionsAccount> data;
    private final boolean hasMore;
    private final Integer totalCount;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<FinancialConnectionsAccountList> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<FinancialConnectionsAccountList> serializer() {
            return FinancialConnectionsAccountList$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<FinancialConnectionsAccountList> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAccountList createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(FinancialConnectionsAccount.CREATOR.createFromParcel(parcel));
            }
            return new FinancialConnectionsAccountList(arrayList, parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FinancialConnectionsAccountList[] newArray(int i11) {
            return new FinancialConnectionsAccountList[i11];
        }
    }

    public /* synthetic */ FinancialConnectionsAccountList(int i11, List list, boolean z11, String str, Integer num, Integer num2, q1 q1Var) {
        if (7 != (i11 & 7)) {
            f1.a(i11, 7, FinancialConnectionsAccountList$$serializer.INSTANCE.getDescriptor());
        }
        this.data = list;
        this.hasMore = z11;
        this.url = str;
        if ((i11 & 8) == 0) {
            this.count = null;
        } else {
            this.count = num;
        }
        if ((i11 & 16) == 0) {
            this.totalCount = null;
        } else {
            this.totalCount = num2;
        }
    }

    public static /* synthetic */ FinancialConnectionsAccountList copy$default(FinancialConnectionsAccountList financialConnectionsAccountList, List list, boolean z11, String str, Integer num, Integer num2, int i11, Object obj) {
        List<FinancialConnectionsAccount> list2 = list;
        if ((i11 & 1) != 0) {
            list2 = financialConnectionsAccountList.data;
        }
        if ((i11 & 2) != 0) {
            z11 = financialConnectionsAccountList.hasMore;
        }
        boolean z12 = z11;
        if ((i11 & 4) != 0) {
            str = financialConnectionsAccountList.url;
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            num = financialConnectionsAccountList.count;
        }
        Integer num3 = num;
        if ((i11 & 16) != 0) {
            num2 = financialConnectionsAccountList.totalCount;
        }
        return financialConnectionsAccountList.copy(list2, z12, str2, num3, num2);
    }

    public static /* synthetic */ void getCount$annotations() {
    }

    public static /* synthetic */ void getData$annotations() {
    }

    public static /* synthetic */ void getHasMore$annotations() {
    }

    public static /* synthetic */ void getTotalCount$annotations() {
    }

    public static /* synthetic */ void getUrl$annotations() {
    }

    public static final void write$Self(FinancialConnectionsAccountList self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.q(serialDesc, 0, new g30.f(FinancialConnectionsAccount$$serializer.INSTANCE), self.data);
        output.C(serialDesc, 1, self.hasMore);
        output.p(serialDesc, 2, self.url);
        if (output.k(serialDesc, 3) || self.count != null) {
            output.D(serialDesc, 3, k0.f27606a, self.count);
        }
        if (output.k(serialDesc, 4) || self.totalCount != null) {
            output.D(serialDesc, 4, k0.f27606a, self.totalCount);
        }
    }

    public final List<FinancialConnectionsAccount> component1() {
        return this.data;
    }

    public final boolean component2() {
        return this.hasMore;
    }

    public final String component3() {
        return this.url;
    }

    public final Integer component4() {
        return this.count;
    }

    public final Integer component5() {
        return this.totalCount;
    }

    public final FinancialConnectionsAccountList copy(List<FinancialConnectionsAccount> data, boolean z11, String url, Integer num, Integer num2) {
        s.g(data, "data");
        s.g(url, "url");
        return new FinancialConnectionsAccountList(data, z11, url, num, num2);
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
        if (obj instanceof FinancialConnectionsAccountList) {
            FinancialConnectionsAccountList financialConnectionsAccountList = (FinancialConnectionsAccountList) obj;
            return s.c(this.data, financialConnectionsAccountList.data) && this.hasMore == financialConnectionsAccountList.hasMore && s.c(this.url, financialConnectionsAccountList.url) && s.c(this.count, financialConnectionsAccountList.count) && s.c(this.totalCount, financialConnectionsAccountList.totalCount);
        }
        return false;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final List<FinancialConnectionsAccount> getData() {
        return this.data;
    }

    public final boolean getHasMore() {
        return this.hasMore;
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
        int hashCode = this.data.hashCode() * 31;
        boolean z11 = this.hasMore;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode2 = (((hashCode + i11) * 31) + this.url.hashCode()) * 31;
        Integer num = this.count;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.totalCount;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "FinancialConnectionsAccountList(data=" + this.data + ", hasMore=" + this.hasMore + ", url=" + this.url + ", count=" + this.count + ", totalCount=" + this.totalCount + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        List<FinancialConnectionsAccount> list = this.data;
        out.writeInt(list.size());
        for (FinancialConnectionsAccount financialConnectionsAccount : list) {
            financialConnectionsAccount.writeToParcel(out, i11);
        }
        out.writeInt(this.hasMore ? 1 : 0);
        out.writeString(this.url);
        Integer num = this.count;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Integer num2 = this.totalCount;
        if (num2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num2.intValue());
    }

    public FinancialConnectionsAccountList(List<FinancialConnectionsAccount> data, boolean z11, String url, Integer num, Integer num2) {
        s.g(data, "data");
        s.g(url, "url");
        this.data = data;
        this.hasMore = z11;
        this.url = url;
        this.count = num;
        this.totalCount = num2;
    }

    public /* synthetic */ FinancialConnectionsAccountList(List list, boolean z11, String str, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z11, str, (i11 & 8) != 0 ? null : num, (i11 & 16) != 0 ? null : num2);
    }
}