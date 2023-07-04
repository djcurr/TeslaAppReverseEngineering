package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.view.Bank;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.s0;

/* loaded from: classes6.dex */
public final class BankStatuses implements StripeModel {
    public static final Parcelable.Creator<BankStatuses> CREATOR = new Creator();
    private final Map<String, Boolean> statuses;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<BankStatuses> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankStatuses createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                linkedHashMap.put(parcel.readString(), Boolean.valueOf(parcel.readInt() != 0));
            }
            return new BankStatuses(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankStatuses[] newArray(int i11) {
            return new BankStatuses[i11];
        }
    }

    public BankStatuses() {
        this(null, 1, null);
    }

    public BankStatuses(Map<String, Boolean> statuses) {
        s.g(statuses, "statuses");
        this.statuses = statuses;
    }

    private final Map<String, Boolean> component1() {
        return this.statuses;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BankStatuses copy$default(BankStatuses bankStatuses, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = bankStatuses.statuses;
        }
        return bankStatuses.copy(map);
    }

    public final BankStatuses copy(Map<String, Boolean> statuses) {
        s.g(statuses, "statuses");
        return new BankStatuses(statuses);
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
        return (obj instanceof BankStatuses) && s.c(this.statuses, ((BankStatuses) obj).statuses);
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.statuses.hashCode();
    }

    public final /* synthetic */ boolean isOnline$payments_core_release(Bank bank) {
        s.g(bank, "bank");
        Boolean bool = this.statuses.get(bank.getId());
        if (bool == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public final int size$payments_core_release() {
        return this.statuses.size();
    }

    public String toString() {
        return "BankStatuses(statuses=" + this.statuses + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        Map<String, Boolean> map = this.statuses;
        out.writeInt(map.size());
        for (Map.Entry<String, Boolean> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeInt(entry.getValue().booleanValue() ? 1 : 0);
        }
    }

    public /* synthetic */ BankStatuses(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? s0.i() : map);
    }
}