package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import vz.v;
import wz.s0;
import wz.w;

/* loaded from: classes6.dex */
public final class ShippingInformation implements StripeModel, StripeParamsModel {
    public static final int $stable = 0;
    private static final String PARAM_ADDRESS = "address";
    private static final String PARAM_NAME = "name";
    private static final String PARAM_PHONE = "phone";
    private final Address address;
    private final String name;
    private final String phone;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ShippingInformation> CREATOR = new Creator();

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ShippingInformation> {
        @Override // android.os.Parcelable.Creator
        public final ShippingInformation createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new ShippingInformation(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShippingInformation[] newArray(int i11) {
            return new ShippingInformation[i11];
        }
    }

    public ShippingInformation() {
        this(null, null, null, 7, null);
    }

    public ShippingInformation(Address address, String str, String str2) {
        this.address = address;
        this.name = str;
        this.phone = str2;
    }

    public static /* synthetic */ ShippingInformation copy$default(ShippingInformation shippingInformation, Address address, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            address = shippingInformation.address;
        }
        if ((i11 & 2) != 0) {
            str = shippingInformation.name;
        }
        if ((i11 & 4) != 0) {
            str2 = shippingInformation.phone;
        }
        return shippingInformation.copy(address, str, str2);
    }

    public final Address component1() {
        return this.address;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.phone;
    }

    public final ShippingInformation copy(Address address, String str, String str2) {
        return new ShippingInformation(address, str, str2);
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
        if (obj instanceof ShippingInformation) {
            ShippingInformation shippingInformation = (ShippingInformation) obj;
            return s.c(this.address, shippingInformation.address) && s.c(this.name, shippingInformation.name) && s.c(this.phone, shippingInformation.phone);
        }
        return false;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPhone() {
        return this.phone;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        Address address = this.address;
        int hashCode = (address == null ? 0 : address.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.phone;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        List<p> l11;
        Map<String, Object> t11;
        p[] pVarArr = new p[3];
        pVarArr[0] = v.a("name", this.name);
        pVarArr[1] = v.a("phone", this.phone);
        Address address = this.address;
        pVarArr[2] = v.a("address", address == null ? null : address.toParamMap());
        l11 = w.l(pVarArr);
        ArrayList arrayList = new ArrayList();
        for (p pVar : l11) {
            String str = (String) pVar.a();
            Object b11 = pVar.b();
            p pVar2 = b11 == null ? null : new p(str, b11);
            if (pVar2 != null) {
                arrayList.add(pVar2);
            }
        }
        t11 = s0.t(arrayList);
        return t11;
    }

    public String toString() {
        return "ShippingInformation(address=" + this.address + ", name=" + ((Object) this.name) + ", phone=" + ((Object) this.phone) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
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
        out.writeString(this.name);
        out.writeString(this.phone);
    }

    public /* synthetic */ ShippingInformation(Address address, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : address, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }
}