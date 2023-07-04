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
public final class CreditBalance implements StripeModel, Parcelable {
    private final Map<String, Integer> used;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<CreditBalance> CREATOR = new Creator();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<CreditBalance> serializer() {
            return CreditBalance$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<CreditBalance> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditBalance createFromParcel(Parcel parcel) {
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
            return new CreditBalance(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CreditBalance[] newArray(int i11) {
            return new CreditBalance[i11];
        }
    }

    public CreditBalance() {
        this((Map) null, 1, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ CreditBalance(int i11, Map map, q1 q1Var) {
        if ((i11 & 0) != 0) {
            f1.a(i11, 0, CreditBalance$$serializer.INSTANCE.getDescriptor());
        }
        if ((i11 & 1) == 0) {
            this.used = null;
        } else {
            this.used = map;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreditBalance copy$default(CreditBalance creditBalance, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = creditBalance.used;
        }
        return creditBalance.copy(map);
    }

    public static /* synthetic */ void getUsed$annotations() {
    }

    public static final void write$Self(CreditBalance self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        boolean z11 = true;
        if (!output.k(serialDesc, 0) && self.used == null) {
            z11 = false;
        }
        if (z11) {
            output.D(serialDesc, 0, new o0(u1.f27647a, k0.f27606a), self.used);
        }
    }

    public final Map<String, Integer> component1() {
        return this.used;
    }

    public final CreditBalance copy(Map<String, Integer> map) {
        return new CreditBalance(map);
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
        return (obj instanceof CreditBalance) && s.c(this.used, ((CreditBalance) obj).used);
    }

    public final Map<String, Integer> getUsed() {
        return this.used;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        Map<String, Integer> map = this.used;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        return "CreditBalance(used=" + this.used + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        Map<String, Integer> map = this.used;
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

    public CreditBalance(Map<String, Integer> map) {
        this.used = map;
    }

    public /* synthetic */ CreditBalance(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : map);
    }
}