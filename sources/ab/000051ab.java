package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.PaymentMethod;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.p;
import wz.r0;
import wz.s0;
import wz.v;
import wz.w;

/* loaded from: classes6.dex */
public abstract class PaymentMethodOptionsParams implements StripeParamsModel, Parcelable {
    public static final int $stable = 0;
    private final PaymentMethod.Type type;

    /* loaded from: classes6.dex */
    public static final class Blik extends PaymentMethodOptionsParams {
        public static final String PARAM_CODE = "code";
        private String code;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Blik> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Blik> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Blik createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Blik(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Blik[] newArray(int i11) {
                return new Blik[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Blik(String code) {
            super(PaymentMethod.Type.Blik, null);
            s.g(code, "code");
            this.code = code;
        }

        public static /* synthetic */ Blik copy$default(Blik blik, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = blik.code;
            }
            return blik.copy(str);
        }

        public final String component1() {
            return this.code;
        }

        public final Blik copy(String code) {
            s.g(code, "code");
            return new Blik(code);
        }

        @Override // com.stripe.android.model.PaymentMethodOptionsParams
        public List<p<String, Object>> createTypeParams$payments_core_release() {
            List<p<String, Object>> d11;
            d11 = v.d(vz.v.a(PARAM_CODE, this.code));
            return d11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Blik) && s.c(this.code, ((Blik) obj).code);
        }

        public final String getCode() {
            return this.code;
        }

        public int hashCode() {
            return this.code.hashCode();
        }

        public final void setCode(String str) {
            s.g(str, "<set-?>");
            this.code = str;
        }

        public String toString() {
            return "Blik(code=" + this.code + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.code);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Card extends PaymentMethodOptionsParams {
        @Deprecated
        private static final String PARAM_CVC = "cvc";
        @Deprecated
        private static final String PARAM_MOTO = "moto";
        @Deprecated
        private static final String PARAM_NETWORK = "network";
        @Deprecated
        private static final String PARAM_SETUP_FUTURE_USAGE = "setup_future_usage";
        private String cvc;
        private Boolean moto;
        private String network;
        private ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
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
        public static final class Creator implements Parcelable.Creator<Card> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Boolean bool = null;
                ConfirmPaymentIntentParams.SetupFutureUsage valueOf = parcel.readInt() == 0 ? null : ConfirmPaymentIntentParams.SetupFutureUsage.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new Card(readString, readString2, valueOf, bool);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Card[] newArray(int i11) {
                return new Card[i11];
            }
        }

        public Card() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ Card(String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Boolean bool, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : setupFutureUsage, (i11 & 8) != 0 ? null : bool);
        }

        public static /* synthetic */ Card copy$default(Card card, String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = card.cvc;
            }
            if ((i11 & 2) != 0) {
                str2 = card.network;
            }
            if ((i11 & 4) != 0) {
                setupFutureUsage = card.setupFutureUsage;
            }
            if ((i11 & 8) != 0) {
                bool = card.moto;
            }
            return card.copy(str, str2, setupFutureUsage, bool);
        }

        public final String component1() {
            return this.cvc;
        }

        public final String component2() {
            return this.network;
        }

        public final ConfirmPaymentIntentParams.SetupFutureUsage component3() {
            return this.setupFutureUsage;
        }

        public final Boolean component4$payments_core_release() {
            return this.moto;
        }

        public final Card copy(String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Boolean bool) {
            return new Card(str, str2, setupFutureUsage, bool);
        }

        @Override // com.stripe.android.model.PaymentMethodOptionsParams
        public List<p<String, Object>> createTypeParams$payments_core_release() {
            List<p<String, Object>> l11;
            p[] pVarArr = new p[4];
            pVarArr[0] = vz.v.a(PARAM_CVC, this.cvc);
            pVarArr[1] = vz.v.a(PARAM_NETWORK, this.network);
            pVarArr[2] = vz.v.a(PARAM_MOTO, this.moto);
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            pVarArr[3] = vz.v.a("setup_future_usage", setupFutureUsage == null ? null : setupFutureUsage.getCode$payments_core_release());
            l11 = w.l(pVarArr);
            return l11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Card) {
                Card card = (Card) obj;
                return s.c(this.cvc, card.cvc) && s.c(this.network, card.network) && this.setupFutureUsage == card.setupFutureUsage && s.c(this.moto, card.moto);
            }
            return false;
        }

        public final String getCvc() {
            return this.cvc;
        }

        public final Boolean getMoto$payments_core_release() {
            return this.moto;
        }

        public final String getNetwork() {
            return this.network;
        }

        public final ConfirmPaymentIntentParams.SetupFutureUsage getSetupFutureUsage() {
            return this.setupFutureUsage;
        }

        public int hashCode() {
            String str = this.cvc;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.network;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            int hashCode3 = (hashCode2 + (setupFutureUsage == null ? 0 : setupFutureUsage.hashCode())) * 31;
            Boolean bool = this.moto;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final void setCvc(String str) {
            this.cvc = str;
        }

        public final void setMoto$payments_core_release(Boolean bool) {
            this.moto = bool;
        }

        public final void setNetwork(String str) {
            this.network = str;
        }

        public final void setSetupFutureUsage(ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            this.setupFutureUsage = setupFutureUsage;
        }

        public String toString() {
            return "Card(cvc=" + ((Object) this.cvc) + ", network=" + ((Object) this.network) + ", setupFutureUsage=" + this.setupFutureUsage + ", moto=" + this.moto + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.cvc);
            out.writeString(this.network);
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            if (setupFutureUsage == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(setupFutureUsage.name());
            }
            Boolean bool = this.moto;
            if (bool == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }

        public Card(String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, Boolean bool) {
            super(PaymentMethod.Type.Card, null);
            this.cvc = str;
            this.network = str2;
            this.setupFutureUsage = setupFutureUsage;
            this.moto = bool;
        }

        public /* synthetic */ Card(String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : setupFutureUsage);
        }

        public Card(String str, String str2, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            this(str, str2, setupFutureUsage, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class USBankAccount extends PaymentMethodOptionsParams {
        public static final String PARAM_SETUP_FUTURE_USAGE = "setup_future_usage";
        private ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<USBankAccount> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<USBankAccount> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new USBankAccount(parcel.readInt() == 0 ? null : ConfirmPaymentIntentParams.SetupFutureUsage.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccount[] newArray(int i11) {
                return new USBankAccount[i11];
            }
        }

        public USBankAccount() {
            this(null, 1, null);
        }

        public /* synthetic */ USBankAccount(ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : setupFutureUsage);
        }

        public static /* synthetic */ USBankAccount copy$default(USBankAccount uSBankAccount, ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                setupFutureUsage = uSBankAccount.setupFutureUsage;
            }
            return uSBankAccount.copy(setupFutureUsage);
        }

        public final ConfirmPaymentIntentParams.SetupFutureUsage component1() {
            return this.setupFutureUsage;
        }

        public final USBankAccount copy(ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            return new USBankAccount(setupFutureUsage);
        }

        @Override // com.stripe.android.model.PaymentMethodOptionsParams
        public List<p<String, Object>> createTypeParams$payments_core_release() {
            List<p<String, Object>> d11;
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            d11 = v.d(vz.v.a(PARAM_SETUP_FUTURE_USAGE, setupFutureUsage == null ? null : setupFutureUsage.getCode$payments_core_release()));
            return d11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof USBankAccount) && this.setupFutureUsage == ((USBankAccount) obj).setupFutureUsage;
        }

        public final ConfirmPaymentIntentParams.SetupFutureUsage getSetupFutureUsage() {
            return this.setupFutureUsage;
        }

        public int hashCode() {
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            if (setupFutureUsage == null) {
                return 0;
            }
            return setupFutureUsage.hashCode();
        }

        public final void setSetupFutureUsage(ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            this.setupFutureUsage = setupFutureUsage;
        }

        public String toString() {
            return "USBankAccount(setupFutureUsage=" + this.setupFutureUsage + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
            if (setupFutureUsage == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeString(setupFutureUsage.name());
        }

        public USBankAccount(ConfirmPaymentIntentParams.SetupFutureUsage setupFutureUsage) {
            super(PaymentMethod.Type.USBankAccount, null);
            this.setupFutureUsage = setupFutureUsage;
        }
    }

    /* loaded from: classes6.dex */
    public static final class WeChatPay extends PaymentMethodOptionsParams {
        public static final String PARAM_APP_ID = "app_id";
        public static final String PARAM_CLIENT = "client";
        private String appId;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<WeChatPay> CREATOR = new Creator();
        public static final int $stable = 8;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<WeChatPay> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WeChatPay createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new WeChatPay(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final WeChatPay[] newArray(int i11) {
                return new WeChatPay[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WeChatPay(String appId) {
            super(PaymentMethod.Type.WeChatPay, null);
            s.g(appId, "appId");
            this.appId = appId;
        }

        public static /* synthetic */ WeChatPay copy$default(WeChatPay weChatPay, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = weChatPay.appId;
            }
            return weChatPay.copy(str);
        }

        public final String component1() {
            return this.appId;
        }

        public final WeChatPay copy(String appId) {
            s.g(appId, "appId");
            return new WeChatPay(appId);
        }

        @Override // com.stripe.android.model.PaymentMethodOptionsParams
        public List<p<String, Object>> createTypeParams$payments_core_release() {
            List<p<String, Object>> l11;
            l11 = w.l(vz.v.a(PARAM_CLIENT, "android"), vz.v.a(PARAM_APP_ID, this.appId));
            return l11;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WeChatPay) && s.c(this.appId, ((WeChatPay) obj).appId);
        }

        public final String getAppId() {
            return this.appId;
        }

        public int hashCode() {
            return this.appId.hashCode();
        }

        public final void setAppId(String str) {
            s.g(str, "<set-?>");
            this.appId = str;
        }

        public String toString() {
            return "WeChatPay(appId=" + this.appId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.appId);
        }
    }

    private PaymentMethodOptionsParams(PaymentMethod.Type type) {
        this.type = type;
    }

    public /* synthetic */ PaymentMethodOptionsParams(PaymentMethod.Type type, DefaultConstructorMarker defaultConstructorMarker) {
        this(type);
    }

    public abstract List<p<String, Object>> createTypeParams$payments_core_release();

    public final PaymentMethod.Type getType() {
        return this.type;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map i11;
        Map<String, Object> i12;
        Map<String, Object> f11;
        List<p<String, Object>> createTypeParams$payments_core_release = createTypeParams$payments_core_release();
        i11 = s0.i();
        Iterator<T> it2 = createTypeParams$payments_core_release.iterator();
        while (it2.hasNext()) {
            p pVar = (p) it2.next();
            String str = (String) pVar.a();
            Object b11 = pVar.b();
            Map f12 = b11 == null ? null : r0.f(vz.v.a(str, b11));
            if (f12 == null) {
                f12 = s0.i();
            }
            i11 = s0.p(i11, f12);
        }
        if (!i11.isEmpty()) {
            f11 = r0.f(vz.v.a(this.type.code, i11));
            return f11;
        }
        i12 = s0.i();
        return i12;
    }
}