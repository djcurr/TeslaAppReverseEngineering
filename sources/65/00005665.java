package com.stripe.android.paymentsheet.forms;

import java.util.Set;
import wz.w0;
import wz.x0;

/* loaded from: classes6.dex */
public final class PaymentMethodRequirementsKt {
    private static final PaymentMethodRequirements AffirmRequirement;
    private static final PaymentMethodRequirements AfterpayClearpayRequirement;
    private static final PaymentMethodRequirements AuBecsDebitRequirement;
    private static final PaymentMethodRequirements BancontactRequirement;
    private static final PaymentMethodRequirements CardRequirement;
    private static final PaymentMethodRequirements EpsRequirement;
    private static final PaymentMethodRequirements GiropayRequirement;
    private static final PaymentMethodRequirements IdealRequirement;
    private static final PaymentMethodRequirements KlarnaRequirement;
    private static final PaymentMethodRequirements P24Requirement;
    private static final PaymentMethodRequirements PaypalRequirement;
    private static final PaymentMethodRequirements SepaDebitRequirement;
    private static final PaymentMethodRequirements SofortRequirement;
    private static final PaymentMethodRequirements USBankAccountRequirement;

    static {
        Set d11;
        Set d12;
        Set d13;
        Set c11;
        Set d14;
        Set c12;
        Set d15;
        Set d16;
        Set d17;
        Set c13;
        Set d18;
        Set d19;
        Set c14;
        Set c15;
        Set c16;
        Set c17;
        d11 = x0.d();
        d12 = x0.d();
        Boolean bool = Boolean.TRUE;
        CardRequirement = new PaymentMethodRequirements(d11, d12, bool);
        d13 = x0.d();
        Boolean bool2 = Boolean.FALSE;
        BancontactRequirement = new PaymentMethodRequirements(d13, null, bool2);
        Delayed delayed = Delayed.INSTANCE;
        c11 = w0.c(delayed);
        SofortRequirement = new PaymentMethodRequirements(c11, null, bool2);
        d14 = x0.d();
        IdealRequirement = new PaymentMethodRequirements(d14, null, bool2);
        c12 = w0.c(delayed);
        SepaDebitRequirement = new PaymentMethodRequirements(c12, null, bool2);
        d15 = x0.d();
        EpsRequirement = new PaymentMethodRequirements(d15, null, null);
        d16 = x0.d();
        P24Requirement = new PaymentMethodRequirements(d16, null, null);
        d17 = x0.d();
        GiropayRequirement = new PaymentMethodRequirements(d17, null, null);
        ShippingAddress shippingAddress = ShippingAddress.INSTANCE;
        c13 = w0.c(shippingAddress);
        AfterpayClearpayRequirement = new PaymentMethodRequirements(c13, null, null);
        d18 = x0.d();
        KlarnaRequirement = new PaymentMethodRequirements(d18, null, null);
        d19 = x0.d();
        PaypalRequirement = new PaymentMethodRequirements(d19, null, null);
        c14 = w0.c(shippingAddress);
        AffirmRequirement = new PaymentMethodRequirements(c14, null, null);
        c15 = w0.c(delayed);
        AuBecsDebitRequirement = new PaymentMethodRequirements(c15, null, null);
        c16 = w0.c(delayed);
        c17 = w0.c(delayed);
        USBankAccountRequirement = new PaymentMethodRequirements(c16, c17, bool);
    }

    public static final PaymentMethodRequirements getAffirmRequirement() {
        return AffirmRequirement;
    }

    public static final PaymentMethodRequirements getAfterpayClearpayRequirement() {
        return AfterpayClearpayRequirement;
    }

    public static final PaymentMethodRequirements getAuBecsDebitRequirement() {
        return AuBecsDebitRequirement;
    }

    public static final PaymentMethodRequirements getBancontactRequirement() {
        return BancontactRequirement;
    }

    public static final PaymentMethodRequirements getCardRequirement() {
        return CardRequirement;
    }

    public static final PaymentMethodRequirements getEpsRequirement() {
        return EpsRequirement;
    }

    public static final PaymentMethodRequirements getGiropayRequirement() {
        return GiropayRequirement;
    }

    public static final PaymentMethodRequirements getIdealRequirement() {
        return IdealRequirement;
    }

    public static final PaymentMethodRequirements getKlarnaRequirement() {
        return KlarnaRequirement;
    }

    public static final PaymentMethodRequirements getP24Requirement() {
        return P24Requirement;
    }

    public static final PaymentMethodRequirements getPaypalRequirement() {
        return PaypalRequirement;
    }

    public static final PaymentMethodRequirements getSepaDebitRequirement() {
        return SepaDebitRequirement;
    }

    public static final PaymentMethodRequirements getSofortRequirement() {
        return SofortRequirement;
    }

    public static final PaymentMethodRequirements getUSBankAccountRequirement() {
        return USBankAccountRequirement;
    }
}