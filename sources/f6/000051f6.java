package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes6.dex */
public final class SourceOrder implements StripeModel {
    private final Integer amount;
    private final String currency;
    private final String email;
    private final List<Item> items;
    private final Shipping shipping;
    public static final Parcelable.Creator<SourceOrder> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<SourceOrder> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceOrder createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(Item.CREATOR.createFromParcel(parcel));
            }
            return new SourceOrder(valueOf, readString, readString2, arrayList, parcel.readInt() != 0 ? Shipping.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SourceOrder[] newArray(int i11) {
            return new SourceOrder[i11];
        }
    }

    public SourceOrder() {
        this(null, null, null, null, null, 31, null);
    }

    public SourceOrder(Integer num, String str, String str2, List<Item> items, Shipping shipping) {
        s.g(items, "items");
        this.amount = num;
        this.currency = str;
        this.email = str2;
        this.items = items;
        this.shipping = shipping;
    }

    public static /* synthetic */ SourceOrder copy$default(SourceOrder sourceOrder, Integer num, String str, String str2, List list, Shipping shipping, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = sourceOrder.amount;
        }
        if ((i11 & 2) != 0) {
            str = sourceOrder.currency;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = sourceOrder.email;
        }
        String str4 = str2;
        List<Item> list2 = list;
        if ((i11 & 8) != 0) {
            list2 = sourceOrder.items;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            shipping = sourceOrder.shipping;
        }
        return sourceOrder.copy(num, str3, str4, list3, shipping);
    }

    public final Integer component1() {
        return this.amount;
    }

    public final String component2() {
        return this.currency;
    }

    public final String component3() {
        return this.email;
    }

    public final List<Item> component4() {
        return this.items;
    }

    public final Shipping component5() {
        return this.shipping;
    }

    public final SourceOrder copy(Integer num, String str, String str2, List<Item> items, Shipping shipping) {
        s.g(items, "items");
        return new SourceOrder(num, str, str2, items, shipping);
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
        if (obj instanceof SourceOrder) {
            SourceOrder sourceOrder = (SourceOrder) obj;
            return s.c(this.amount, sourceOrder.amount) && s.c(this.currency, sourceOrder.currency) && s.c(this.email, sourceOrder.email) && s.c(this.items, sourceOrder.items) && s.c(this.shipping, sourceOrder.shipping);
        }
        return false;
    }

    public final Integer getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getEmail() {
        return this.email;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        Integer num = this.amount;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.currency;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.email;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.items.hashCode()) * 31;
        Shipping shipping = this.shipping;
        return hashCode3 + (shipping != null ? shipping.hashCode() : 0);
    }

    public String toString() {
        return "SourceOrder(amount=" + this.amount + ", currency=" + ((Object) this.currency) + ", email=" + ((Object) this.email) + ", items=" + this.items + ", shipping=" + this.shipping + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        Integer num = this.amount;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeString(this.currency);
        out.writeString(this.email);
        List<Item> list = this.items;
        out.writeInt(list.size());
        for (Item item : list) {
            item.writeToParcel(out, i11);
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        shipping.writeToParcel(out, i11);
    }

    /* loaded from: classes6.dex */
    public static final class Item implements StripeModel {
        private final Integer amount;
        private final String currency;
        private final String description;
        private final Integer quantity;
        private final Type type;
        public static final Parcelable.Creator<Item> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Item> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Item createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Item(Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
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
            Shipping("shipping");
            
            public static final Companion Companion = new Companion(null);
            private final String code;

            /* loaded from: classes6.dex */
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final /* synthetic */ Type fromCode$payments_core_release(String str) {
                    Type[] values;
                    for (Type type : Type.values()) {
                        if (s.c(type.code, str)) {
                            return type;
                        }
                    }
                    return null;
                }
            }

            Type(String str) {
                this.code = str;
            }
        }

        public Item(Type type, Integer num, String str, String str2, Integer num2) {
            s.g(type, "type");
            this.type = type;
            this.amount = num;
            this.currency = str;
            this.description = str2;
            this.quantity = num2;
        }

        public static /* synthetic */ Item copy$default(Item item, Type type, Integer num, String str, String str2, Integer num2, int i11, Object obj) {
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
            String str3 = str;
            if ((i11 & 8) != 0) {
                str2 = item.description;
            }
            String str4 = str2;
            if ((i11 & 16) != 0) {
                num2 = item.quantity;
            }
            return item.copy(type, num3, str3, str4, num2);
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

        public final Integer component5() {
            return this.quantity;
        }

        public final Item copy(Type type, Integer num, String str, String str2, Integer num2) {
            s.g(type, "type");
            return new Item(type, num, str, str2, num2);
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
            if (obj instanceof Item) {
                Item item = (Item) obj;
                return this.type == item.type && s.c(this.amount, item.amount) && s.c(this.currency, item.currency) && s.c(this.description, item.description) && s.c(this.quantity, item.quantity);
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

        public final Integer getQuantity() {
            return this.quantity;
        }

        public final Type getType() {
            return this.type;
        }

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            int hashCode = this.type.hashCode() * 31;
            Integer num = this.amount;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.currency;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.description;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num2 = this.quantity;
            return hashCode4 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "Item(type=" + this.type + ", amount=" + this.amount + ", currency=" + ((Object) this.currency) + ", description=" + ((Object) this.description) + ", quantity=" + this.quantity + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.type.name());
            Integer num = this.amount;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            out.writeString(this.currency);
            out.writeString(this.description);
            Integer num2 = this.quantity;
            if (num2 == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }

        public /* synthetic */ Item(Type type, Integer num, String str, String str2, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(type, (i11 & 2) != 0 ? null : num, (i11 & 4) != 0 ? null : str, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : num2);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Shipping implements StripeModel {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Shipping> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Shipping(parcel.readInt() == 0 ? null : Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping[] newArray(int i11) {
                return new Shipping[i11];
            }
        }

        public Shipping() {
            this(null, null, null, null, null, 31, null);
        }

        public Shipping(Address address, String str, String str2, String str3, String str4) {
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
            return new Shipping(address, str, str2, str3, str4);
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

        @Override // com.stripe.android.core.model.StripeModel
        public int hashCode() {
            Address address = this.address;
            int hashCode = (address == null ? 0 : address.hashCode()) * 31;
            String str = this.carrier;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.phone;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.trackingNumber;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.address + ", carrier=" + ((Object) this.carrier) + ", name=" + ((Object) this.name) + ", phone=" + ((Object) this.phone) + ", trackingNumber=" + ((Object) this.trackingNumber) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
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
            out.writeString(this.carrier);
            out.writeString(this.name);
            out.writeString(this.phone);
            out.writeString(this.trackingNumber);
        }

        public /* synthetic */ Shipping(Address address, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : address, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
        }
    }

    public /* synthetic */ SourceOrder(Integer num, String str, String str2, List list, Shipping shipping, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? w.i() : list, (i11 & 16) != 0 ? null : shipping);
    }
}