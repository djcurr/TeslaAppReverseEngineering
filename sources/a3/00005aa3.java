package com.stripe.android.ui.core.elements;

import c30.b;
import ch.qos.logback.core.CoreConstants;
import e30.f;
import f30.d;
import g30.f1;
import g30.q1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlinx.serialization.a;

@a
/* loaded from: classes6.dex */
public final class IdentifierSpec {
    public static final int $stable = 0;

    /* renamed from: v1  reason: collision with root package name */
    private final String f21046v1;
    public static final Companion Companion = new Companion(null);
    private static final IdentifierSpec Name = new IdentifierSpec("billing_details[name]");
    private static final IdentifierSpec CardBrand = new IdentifierSpec("card[brand]");
    private static final IdentifierSpec CardNumber = new IdentifierSpec("card[number]");
    private static final IdentifierSpec CardCvc = new IdentifierSpec("card[cvc]");
    private static final IdentifierSpec CardExpMonth = new IdentifierSpec("card[exp_month]");
    private static final IdentifierSpec CardExpYear = new IdentifierSpec("card[exp_year]");
    private static final IdentifierSpec Email = new IdentifierSpec("billing_details[email]");
    private static final IdentifierSpec Phone = new IdentifierSpec("billing_details[phone]");
    private static final IdentifierSpec Line1 = new IdentifierSpec("billing_details[address][line1]");
    private static final IdentifierSpec Line2 = new IdentifierSpec("billing_details[address][line2]");
    private static final IdentifierSpec City = new IdentifierSpec("billing_details[address][city]");
    private static final IdentifierSpec PostalCode = new IdentifierSpec("billing_details[address][postal_code]");
    private static final IdentifierSpec State = new IdentifierSpec("billing_details[address][state]");
    private static final IdentifierSpec Country = new IdentifierSpec("billing_details[address][country]");
    private static final IdentifierSpec SaveForFutureUse = new IdentifierSpec("save_for_future_use");

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final IdentifierSpec Generic(String _value) {
            s.g(_value, "_value");
            return new IdentifierSpec(_value);
        }

        public final IdentifierSpec get(String value) {
            s.g(value, "value");
            return s.c(value, getCardBrand().getV1()) ? getCardBrand() : s.c(value, getCardNumber().getV1()) ? getCardNumber() : s.c(value, getCardCvc().getV1()) ? getCardCvc() : s.c(value, getCity().getV1()) ? getCity() : s.c(value, getCountry().getV1()) ? getCountry() : s.c(value, getEmail().getV1()) ? getEmail() : s.c(value, getLine1().getV1()) ? getLine1() : s.c(value, getLine2().getV1()) ? getLine2() : s.c(value, getName().getV1()) ? getName() : s.c(value, getPhone().getV1()) ? getPhone() : s.c(value, getPostalCode().getV1()) ? getPostalCode() : s.c(value, getSaveForFutureUse().getV1()) ? getSaveForFutureUse() : s.c(value, getState().getV1()) ? getState() : Generic(value);
        }

        public final IdentifierSpec getCardBrand() {
            return IdentifierSpec.CardBrand;
        }

        public final IdentifierSpec getCardCvc() {
            return IdentifierSpec.CardCvc;
        }

        public final IdentifierSpec getCardExpMonth() {
            return IdentifierSpec.CardExpMonth;
        }

        public final IdentifierSpec getCardExpYear() {
            return IdentifierSpec.CardExpYear;
        }

        public final IdentifierSpec getCardNumber() {
            return IdentifierSpec.CardNumber;
        }

        public final IdentifierSpec getCity() {
            return IdentifierSpec.City;
        }

        public final IdentifierSpec getCountry() {
            return IdentifierSpec.Country;
        }

        public final IdentifierSpec getEmail() {
            return IdentifierSpec.Email;
        }

        public final IdentifierSpec getLine1() {
            return IdentifierSpec.Line1;
        }

        public final IdentifierSpec getLine2() {
            return IdentifierSpec.Line2;
        }

        public final IdentifierSpec getName() {
            return IdentifierSpec.Name;
        }

        public final IdentifierSpec getPhone() {
            return IdentifierSpec.Phone;
        }

        public final IdentifierSpec getPostalCode() {
            return IdentifierSpec.PostalCode;
        }

        public final IdentifierSpec getSaveForFutureUse() {
            return IdentifierSpec.SaveForFutureUse;
        }

        public final IdentifierSpec getState() {
            return IdentifierSpec.State;
        }

        public final b<IdentifierSpec> serializer() {
            return IdentifierSpec$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ IdentifierSpec(int i11, String str, q1 q1Var) {
        if (1 != (i11 & 1)) {
            f1.a(i11, 1, IdentifierSpec$$serializer.INSTANCE.getDescriptor());
        }
        this.f21046v1 = str;
    }

    public static /* synthetic */ IdentifierSpec copy$default(IdentifierSpec identifierSpec, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = identifierSpec.f21046v1;
        }
        return identifierSpec.copy(str);
    }

    public static final void write$Self(IdentifierSpec self, d output, f serialDesc) {
        s.g(self, "self");
        s.g(output, "output");
        s.g(serialDesc, "serialDesc");
        output.p(serialDesc, 0, self.f21046v1);
    }

    public final String component1() {
        return this.f21046v1;
    }

    public final IdentifierSpec copy(String v12) {
        s.g(v12, "v1");
        return new IdentifierSpec(v12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdentifierSpec) && s.c(this.f21046v1, ((IdentifierSpec) obj).f21046v1);
    }

    public final String getV1() {
        return this.f21046v1;
    }

    public int hashCode() {
        return this.f21046v1.hashCode();
    }

    public String toString() {
        return "IdentifierSpec(v1=" + this.f21046v1 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public IdentifierSpec(String v12) {
        s.g(v12, "v1");
        this.f21046v1 = v12;
    }

    public IdentifierSpec() {
        this("");
    }
}