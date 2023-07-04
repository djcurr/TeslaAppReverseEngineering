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
import g30.o0;
import g30.q1;
import g30.u1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes2.dex */
public final class Balance implements StripeModel, Parcelable {
    private final int asOf;
    private final CashBalance cash;
    private final CreditBalance credit;
    private final Map<String, Integer> current;
    private final Type type;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Balance> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<Balance> serializer() {
            return Balance$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<Balance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Balance createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i11 = 0; i11 != readInt2; i11++) {
                linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            return new Balance(readInt, linkedHashMap, Type.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : CashBalance.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CreditBalance.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Balance[] newArray(int i11) {
            return new Balance[i11];
        }
    }

    @a
    /* loaded from: classes2.dex */
    public enum Type {
        CASH("cash"),
        CREDIT("credit"),
        UNKNOWN("unknown");
        
        public static final Companion Companion = new Companion(null);
        private final String value;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b<Type> serializer() {
                return Balance$Type$$serializer.INSTANCE;
            }
        }

        Type(String str) {
            this.value = str;
        }

        public final String getValue() {
            return this.value;
        }
    }

    public /* synthetic */ Balance(int i11, int i12, Map map, Type type, CashBalance cashBalance, CreditBalance creditBalance, q1 q1Var) {
        if (3 != (i11 & 3)) {
            f1.a(i11, 3, Balance$$serializer.INSTANCE.getDescriptor());
        }
        this.asOf = i12;
        this.current = map;
        if ((i11 & 4) == 0) {
            this.type = Type.UNKNOWN;
        } else {
            this.type = type;
        }
        if ((i11 & 8) == 0) {
            this.cash = null;
        } else {
            this.cash = cashBalance;
        }
        if ((i11 & 16) == 0) {
            this.credit = null;
        } else {
            this.credit = creditBalance;
        }
    }

    public static /* synthetic */ Balance copy$default(Balance balance, int i11, Map map, Type type, CashBalance cashBalance, CreditBalance creditBalance, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = balance.asOf;
        }
        Map<String, Integer> map2 = map;
        if ((i12 & 2) != 0) {
            map2 = balance.current;
        }
        Map map3 = map2;
        if ((i12 & 4) != 0) {
            type = balance.type;
        }
        Type type2 = type;
        if ((i12 & 8) != 0) {
            cashBalance = balance.cash;
        }
        CashBalance cashBalance2 = cashBalance;
        if ((i12 & 16) != 0) {
            creditBalance = balance.credit;
        }
        return balance.copy(i11, map3, type2, cashBalance2, creditBalance);
    }

    public static /* synthetic */ void getAsOf$annotations() {
    }

    public static /* synthetic */ void getCash$annotations() {
    }

    public static /* synthetic */ void getCredit$annotations() {
    }

    public static /* synthetic */ void getCurrent$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static final void write$Self(Balance self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.n(serialDesc, 0, self.asOf);
        output.q(serialDesc, 1, new o0(u1.f27647a, k0.f27606a), self.current);
        if (output.k(serialDesc, 2) || self.type != Type.UNKNOWN) {
            output.q(serialDesc, 2, Balance$Type$$serializer.INSTANCE, self.type);
        }
        if (output.k(serialDesc, 3) || self.cash != null) {
            output.D(serialDesc, 3, CashBalance$$serializer.INSTANCE, self.cash);
        }
        if (output.k(serialDesc, 4) || self.credit != null) {
            output.D(serialDesc, 4, CreditBalance$$serializer.INSTANCE, self.credit);
        }
    }

    public final int component1() {
        return this.asOf;
    }

    public final Map<String, Integer> component2() {
        return this.current;
    }

    public final Type component3() {
        return this.type;
    }

    public final CashBalance component4() {
        return this.cash;
    }

    public final CreditBalance component5() {
        return this.credit;
    }

    public final Balance copy(int i11, Map<String, Integer> current, Type type, CashBalance cashBalance, CreditBalance creditBalance) {
        s.g(current, "current");
        s.g(type, "type");
        return new Balance(i11, current, type, cashBalance, creditBalance);
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
        if (obj instanceof Balance) {
            Balance balance = (Balance) obj;
            return this.asOf == balance.asOf && s.c(this.current, balance.current) && this.type == balance.type && s.c(this.cash, balance.cash) && s.c(this.credit, balance.credit);
        }
        return false;
    }

    public final int getAsOf() {
        return this.asOf;
    }

    public final CashBalance getCash() {
        return this.cash;
    }

    public final CreditBalance getCredit() {
        return this.credit;
    }

    public final Map<String, Integer> getCurrent() {
        return this.current;
    }

    public final Type getType() {
        return this.type;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.asOf) * 31) + this.current.hashCode()) * 31) + this.type.hashCode()) * 31;
        CashBalance cashBalance = this.cash;
        int hashCode2 = (hashCode + (cashBalance == null ? 0 : cashBalance.hashCode())) * 31;
        CreditBalance creditBalance = this.credit;
        return hashCode2 + (creditBalance != null ? creditBalance.hashCode() : 0);
    }

    public String toString() {
        return "Balance(asOf=" + this.asOf + ", current=" + this.current + ", type=" + this.type + ", cash=" + this.cash + ", credit=" + this.credit + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeInt(this.asOf);
        Map<String, Integer> map = this.current;
        out.writeInt(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeInt(entry.getValue().intValue());
        }
        out.writeString(this.type.name());
        CashBalance cashBalance = this.cash;
        if (cashBalance == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cashBalance.writeToParcel(out, i11);
        }
        CreditBalance creditBalance = this.credit;
        if (creditBalance == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        creditBalance.writeToParcel(out, i11);
    }

    public Balance(int i11, Map<String, Integer> current, Type type, CashBalance cashBalance, CreditBalance creditBalance) {
        s.g(current, "current");
        s.g(type, "type");
        this.asOf = i11;
        this.current = current;
        this.type = type;
        this.cash = cashBalance;
        this.credit = creditBalance;
    }

    public /* synthetic */ Balance(int i11, Map map, Type type, CashBalance cashBalance, CreditBalance creditBalance, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, map, (i12 & 4) != 0 ? Type.UNKNOWN : type, (i12 & 8) != 0 ? null : cashBalance, (i12 & 16) != 0 ? null : creditBalance);
    }
}