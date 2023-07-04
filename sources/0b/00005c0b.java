package com.stripe.android.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeJsonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import wz.s0;

/* loaded from: classes6.dex */
public final class BecsDebitBanks {
    private final List<Bank> banks;
    private final boolean shouldIncludeTestBank;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    @Deprecated
    private static final Bank STRIPE_TEST_BANK = new Bank("00", "Stripe Test Bank");

    /* loaded from: classes6.dex */
    public static final class Bank implements Parcelable {
        private final String name;
        private final String prefix;
        public static final Parcelable.Creator<Bank> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Bank> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Bank createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new Bank(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Bank[] newArray(int i11) {
                return new Bank[i11];
            }
        }

        public Bank(String prefix, String name) {
            kotlin.jvm.internal.s.g(prefix, "prefix");
            kotlin.jvm.internal.s.g(name, "name");
            this.prefix = prefix;
            this.name = name;
        }

        public static /* synthetic */ Bank copy$default(Bank bank, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bank.prefix;
            }
            if ((i11 & 2) != 0) {
                str2 = bank.name;
            }
            return bank.copy(str, str2);
        }

        public final String component1() {
            return this.prefix;
        }

        public final String component2() {
            return this.name;
        }

        public final Bank copy(String prefix, String name) {
            kotlin.jvm.internal.s.g(prefix, "prefix");
            kotlin.jvm.internal.s.g(name, "name");
            return new Bank(prefix, name);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Bank) {
                Bank bank = (Bank) obj;
                return kotlin.jvm.internal.s.c(this.prefix, bank.prefix) && kotlin.jvm.internal.s.c(this.name, bank.name);
            }
            return false;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPrefix() {
            return this.prefix;
        }

        public int hashCode() {
            return (this.prefix.hashCode() * 31) + this.name.hashCode();
        }

        public String toString() {
            return "Bank(prefix=" + this.prefix + ", name=" + this.name + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.prefix);
            out.writeString(this.name);
        }
    }

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Bank> createBanksData(Context context) {
            Map jsonObjectToMap = StripeJsonUtils.INSTANCE.jsonObjectToMap(new JSONObject(readFile(context)));
            if (jsonObjectToMap == null) {
                jsonObjectToMap = s0.i();
            }
            ArrayList arrayList = new ArrayList(jsonObjectToMap.size());
            for (Map.Entry entry : jsonObjectToMap.entrySet()) {
                arrayList.add(new Bank((String) entry.getKey(), String.valueOf(entry.getValue())));
            }
            return arrayList;
        }

        private final String readFile(Context context) {
            String next = new Scanner(context.getResources().getAssets().open("au_becs_bsb.json")).useDelimiter("\\A").next();
            kotlin.jvm.internal.s.f(next, "Scanner(\n               …seDelimiter(\"\\\\A\").next()");
            return next;
        }
    }

    public BecsDebitBanks(List<Bank> banks, boolean z11) {
        kotlin.jvm.internal.s.g(banks, "banks");
        this.banks = banks;
        this.shouldIncludeTestBank = z11;
    }

    public final Bank byPrefix(String bsb) {
        List m11;
        List y02;
        boolean H;
        kotlin.jvm.internal.s.g(bsb, "bsb");
        List<Bank> list = this.banks;
        Bank bank = STRIPE_TEST_BANK;
        Object obj = null;
        if (!this.shouldIncludeTestBank) {
            bank = null;
        }
        m11 = wz.w.m(bank);
        y02 = wz.e0.y0(list, m11);
        Iterator it2 = y02.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            H = kotlin.text.v.H(bsb, ((Bank) next).getPrefix(), false, 2, null);
            if (H) {
                obj = next;
                break;
            }
        }
        return (Bank) obj;
    }

    public final List<Bank> getBanks$payments_core_release() {
        return this.banks;
    }

    public /* synthetic */ BecsDebitBanks(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i11 & 2) != 0 ? true : z11);
    }

    public /* synthetic */ BecsDebitBanks(Context context, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? true : z11);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitBanks(Context context, boolean z11) {
        this(Companion.createBanksData(context), z11);
        kotlin.jvm.internal.s.g(context, "context");
    }
}