package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;
import wz.s0;
import wz.x;

/* loaded from: classes6.dex */
public final class SourceOrderParams implements StripeParamsModel, Parcelable {
    @Deprecated
    private static final String PARAM_ITEMS = "items";
    @Deprecated
    private static final String PARAM_SHIPPING = "shipping";
    private final List<Item> items;
    private final Shipping shipping;
    private static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<SourceOrderParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<SourceOrderParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceOrderParams createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            s.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(Item.CREATOR.createFromParcel(parcel));
                }
            }
            return new SourceOrderParams(arrayList, parcel.readInt() != 0 ? Shipping.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceOrderParams[] newArray(int i11) {
            return new SourceOrderParams[i11];
        }
    }

    public SourceOrderParams() {
        this(null, null, 3, null);
    }

    public SourceOrderParams(List<Item> list) {
        this(list, null, 2, null);
    }

    public SourceOrderParams(List<Item> list, Shipping shipping) {
        this.items = list;
        this.shipping = shipping;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SourceOrderParams copy$default(SourceOrderParams sourceOrderParams, List list, Shipping shipping, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = sourceOrderParams.items;
        }
        if ((i11 & 2) != 0) {
            shipping = sourceOrderParams.shipping;
        }
        return sourceOrderParams.copy(list, shipping);
    }

    public final List<Item> component1() {
        return this.items;
    }

    public final Shipping component2() {
        return this.shipping;
    }

    public final SourceOrderParams copy(List<Item> list, Shipping shipping) {
        return new SourceOrderParams(list, shipping);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SourceOrderParams) {
            SourceOrderParams sourceOrderParams = (SourceOrderParams) obj;
            return s.c(this.items, sourceOrderParams.items) && s.c(this.shipping, sourceOrderParams.shipping);
        }
        return false;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    public int hashCode() {
        List<Item> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Shipping shipping = this.shipping;
        return hashCode + (shipping != null ? shipping.hashCode() : 0);
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map i11;
        int t11;
        Map f11;
        Map p11;
        Map<String, Object> p12;
        i11 = s0.i();
        List<Item> list = this.items;
        if (list == null) {
            f11 = null;
        } else {
            t11 = x.t(list, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (Item item : list) {
                arrayList.add(item.toParamMap());
            }
            f11 = r0.f(v.a(PARAM_ITEMS, arrayList));
        }
        if (f11 == null) {
            f11 = s0.i();
        }
        p11 = s0.p(i11, f11);
        Shipping shipping = this.shipping;
        Map f12 = shipping != null ? r0.f(v.a(PARAM_SHIPPING, shipping.toParamMap())) : null;
        if (f12 == null) {
            f12 = s0.i();
        }
        p12 = s0.p(p11, f12);
        return p12;
    }

    public String toString() {
        return "SourceOrderParams(items=" + this.items + ", shipping=" + this.shipping + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        List<Item> list = this.items;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (Item item : list) {
                item.writeToParcel(out, i11);
            }
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        shipping.writeToParcel(out, i11);
    }

    public /* synthetic */ SourceOrderParams(List list, Shipping shipping, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : list, (i11 & 2) != 0 ? null : shipping);
    }

    /* loaded from: classes6.dex */
    public static final class Shipping implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        @Deprecated
        private static final String PARAM_ADDRESS = "address";
        @Deprecated
        private static final String PARAM_CARRIER = "carrier";
        @Deprecated
        private static final String PARAM_NAME = "name";
        @Deprecated
        private static final String PARAM_PHONE = "phone";
        @Deprecated
        private static final String PARAM_TRACKING_NUMBER = "tracking_number";
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Shipping> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping[] newArray(int i11) {
                return new Shipping[i11];
            }
        }

        public Shipping(Address address, String str, String str2, String str3, String str4) {
            s.g(address, "address");
            this.address = address;
            this.carrier = str;
            this.name = str2;
            this.phone = str3;
            this.trackingNumber = str4;
        }

        public static /* synthetic */ Shipping copy$default(Shipping shipping, Address address, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                address = shipping.address;
            }
            if ((i11 & 2) != 0) {
                str = shipping.carrier;
            }
            String str5 = str;
            if ((i11 & 4) != 0) {
                str2 = shipping.name;
            }
            String str6 = str2;
            if ((i11 & 8) != 0) {
                str3 = shipping.phone;
            }
            String str7 = str3;
            if ((i11 & 16) != 0) {
                str4 = shipping.trackingNumber;
            }
            return shipping.copy(address, str5, str6, str7, str4);
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.carrier;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final String component5() {
            return this.trackingNumber;
        }

        public final Shipping copy(Address address, String str, String str2, String str3, String str4) {
            s.g(address, "address");
            return new Shipping(address, str, str2, str3, str4);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Shipping) {
                Shipping shipping = (Shipping) obj;
                return s.c(this.address, shipping.address) && s.c(this.carrier, shipping.carrier) && s.c(this.name, shipping.name) && s.c(this.phone, shipping.phone) && s.c(this.trackingNumber, shipping.trackingNumber);
            }
            return false;
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getCarrier() {
            return this.carrier;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getTrackingNumber() {
            return this.trackingNumber;
        }

        public int hashCode() {
            int hashCode = this.address.hashCode() * 31;
            String str = this.carrier;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackingNumber;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map f11;
            Map p11;
            Map p12;
            Map p13;
            Map<String, Object> p14;
            f11 = r0.f(v.a("address", this.address.toParamMap()));
            String str = this.carrier;
            Map f12 = str == null ? null : r0.f(v.a(PARAM_CARRIER, str));
            if (f12 == null) {
                f12 = s0.i();
            }
            p11 = s0.p(f11, f12);
            String str2 = this.name;
            Map f13 = str2 == null ? null : r0.f(v.a("name", str2));
            if (f13 == null) {
                f13 = s0.i();
            }
            p12 = s0.p(p11, f13);
            String str3 = this.phone;
            Map f14 = str3 == null ? null : r0.f(v.a("phone", str3));
            if (f14 == null) {
                f14 = s0.i();
            }
            p13 = s0.p(p12, f14);
            String str4 = this.trackingNumber;
            Map f15 = str4 != null ? r0.f(v.a(PARAM_TRACKING_NUMBER, str4)) : null;
            if (f15 == null) {
                f15 = s0.i();
            }
            p14 = s0.p(p13, f15);
            return p14;
        }

        public String toString() {
            return "Shipping(address=" + this.address + ", carrier=" + ((Object) this.carrier) + ", name=" + ((Object) this.name) + ", phone=" + ((Object) this.phone) + ", trackingNumber=" + ((Object) this.trackingNumber) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.address.writeToParcel(out, i11);
            out.writeString(this.carrier);
            out.writeString(this.name);
            out.writeString(this.phone);
            out.writeString(this.trackingNumber);
        }

        public /* synthetic */ Shipping(Address address, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(address, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Item implements StripeParamsModel, Parcelable {
        @Deprecated
        private static final String PARAM_AMOUNT = "amount";
        @Deprecated
        private static final String PARAM_CURRENCY = "currency";
        @Deprecated
        private static final String PARAM_DESCRIPTION = "description";
        @Deprecated
        private static final String PARAM_PARENT = "parent";
        @Deprecated
        private static final String PARAM_QUANTITY = "quantity";
        @Deprecated
        private static final String PARAM_TYPE = "type";
        private final Integer amount;
        private final String currency;
        private final String description;
        private final String parent;
        private final Integer quantity;
        private final Type type;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Item> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Item createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Item(parcel.readInt() == 0 ? null : Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Item[] newArray(int i11) {
                return new Item[i11];
            }
        }

        /* loaded from: classes6.dex */
        public enum Type {
            Sku("sku"),
            Tax("tax"),
            Shipping(SourceOrderParams.PARAM_SHIPPING);
            
            private final String code;

            Type(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        public Item() {
            this(null, null, null, null, null, null, 63, null);
        }

        public Item(Type type, Integer num, String str, String str2, String str3, Integer num2) {
            this.type = type;
            this.amount = num;
            this.currency = str;
            this.description = str2;
            this.parent = str3;
            this.quantity = num2;
        }

        public static /* synthetic */ Item copy$default(Item item, Type type, Integer num, String str, String str2, String str3, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                type = item.type;
            }
            if ((i11 & 2) != 0) {
                num = item.amount;
            }
            Integer num3 = num;
            if ((i11 & 4) != 0) {
                str = item.currency;
            }
            String str4 = str;
            if ((i11 & 8) != 0) {
                str2 = item.description;
            }
            String str5 = str2;
            if ((i11 & 16) != 0) {
                str3 = item.parent;
            }
            String str6 = str3;
            if ((i11 & 32) != 0) {
                num2 = item.quantity;
            }
            return item.copy(type, num3, str4, str5, str6, num2);
        }

        public final Type component1() {
            return this.type;
        }

        public final Integer component2() {
            return this.amount;
        }

        public final String component3() {
            return this.currency;
        }

        public final String component4() {
            return this.description;
        }

        public final String component5() {
            return this.parent;
        }

        public final Integer component6() {
            return this.quantity;
        }

        public final Item copy(Type type, Integer num, String str, String str2, String str3, Integer num2) {
            return new Item(type, num, str, str2, str3, num2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Item) {
                Item item = (Item) obj;
                return this.type == item.type && s.c(this.amount, item.amount) && s.c(this.currency, item.currency) && s.c(this.description, item.description) && s.c(this.parent, item.parent) && s.c(this.quantity, item.quantity);
            }
            return false;
        }

        public final Integer getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getParent() {
            return this.parent;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            Type type = this.type;
            int hashCode = (type == null ? 0 : type.hashCode()) * 31;
            Integer num = this.amount;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.currency;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.parent;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num2 = this.quantity;
            return hashCode5 + (num2 != null ? num2.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            Map i11;
            Map p11;
            Map p12;
            Map p13;
            Map p14;
            Map p15;
            Map<String, Object> p16;
            i11 = s0.i();
            Integer num = this.amount;
            Map f11 = num == null ? null : r0.f(v.a("amount", Integer.valueOf(num.intValue())));
            if (f11 == null) {
                f11 = s0.i();
            }
            p11 = s0.p(i11, f11);
            String str = this.currency;
            Map f12 = str == null ? null : r0.f(v.a(PARAM_CURRENCY, str));
            if (f12 == null) {
                f12 = s0.i();
            }
            p12 = s0.p(p11, f12);
            String str2 = this.description;
            Map f13 = str2 == null ? null : r0.f(v.a(PARAM_DESCRIPTION, str2));
            if (f13 == null) {
                f13 = s0.i();
            }
            p13 = s0.p(p12, f13);
            String str3 = this.parent;
            Map f14 = str3 == null ? null : r0.f(v.a(PARAM_PARENT, str3));
            if (f14 == null) {
                f14 = s0.i();
            }
            p14 = s0.p(p13, f14);
            Integer num2 = this.quantity;
            Map f15 = num2 == null ? null : r0.f(v.a(PARAM_QUANTITY, Integer.valueOf(num2.intValue())));
            if (f15 == null) {
                f15 = s0.i();
            }
            p15 = s0.p(p14, f15);
            Type type = this.type;
            Map f16 = type != null ? r0.f(v.a("type", type.getCode$payments_core_release())) : null;
            if (f16 == null) {
                f16 = s0.i();
            }
            p16 = s0.p(p15, f16);
            return p16;
        }

        public String toString() {
            return "Item(type=" + this.type + ", amount=" + this.amount + ", currency=" + ((Object) this.currency) + ", description=" + ((Object) this.description) + ", parent=" + ((Object) this.parent) + ", quantity=" + this.quantity + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            Type type = this.type;
            if (type == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(type.name());
            }
            Integer num = this.amount;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.currency);
            out.writeString(this.description);
            out.writeString(this.parent);
            Integer num2 = this.quantity;
            if (num2 == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }

        public /* synthetic */ Item(Type type, Integer num, String str, String str2, String str3, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : type, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : num2);
        }
    }
}