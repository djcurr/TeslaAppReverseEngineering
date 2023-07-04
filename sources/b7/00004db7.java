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
public final class CashBalance implements StripeModel, Parcelable {
    private final Map<String, Integer> available;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CashBalance> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<CashBalance> serializer() {
            return CashBalance$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CashBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashBalance createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            s.g(parcel, "parcel");
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    linkedHashMap2.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
                }
                linkedHashMap = linkedHashMap2;
            }
            return new CashBalance(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CashBalance[] newArray(int i11) {
            return new CashBalance[i11];
        }
    }

    public CashBalance() {
        this((Map) null, 1, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ CashBalance(int i11, Map map, q1 q1Var) {
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, CashBalance$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.available = null;
        } else {
            this.available = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CashBalance copy$default(CashBalance cashBalance, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = cashBalance.available;
        }
        return cashBalance.copy(map);
    }

    public static /* synthetic */ void getAvailable$annotations() {
    }

    public static final void write$Self(CashBalance self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        boolean z11 = true;
        if (!output.k(serialDesc, 0) && self.available == null) {
            z11 = false;
        }
        if (z11) {
            output.D(serialDesc, 0, new o0(u1.f27647a, k0.f27606a), self.available);
        }
    }

    public final Map<String, Integer> component1() {
        return this.available;
    }

    public final CashBalance copy(Map<String, Integer> map) {
        return new CashBalance(map);
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
        return (obj instanceof CashBalance) && s.c(this.available, ((CashBalance) obj).available);
    }

    public final Map<String, Integer> getAvailable() {
        return this.available;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        Map<String, Integer> map = this.available;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "CashBalance(available=" + this.available + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        Map<String, Integer> map = this.available;
        if (map == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeInt(entry.getValue().intValue());
        }
    }

    public CashBalance(Map<String, Integer> map) {
        this.available = map;
    }

    public /* synthetic */ CashBalance(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : map);
    }
}