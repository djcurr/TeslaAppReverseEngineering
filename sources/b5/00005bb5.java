package com.stripe.android.ui.core.forms.resources;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.forms.PaymentMethodRequirements;
import com.stripe.android.paymentsheet.forms.PaymentMethodRequirementsKt;
import com.stripe.android.ui.core.R;
import com.stripe.android.ui.core.elements.LayoutSpec;
import com.stripe.android.ui.core.forms.AffirmSpecKt;
import com.stripe.android.ui.core.forms.AfterpayClearpaySpecKt;
import com.stripe.android.ui.core.forms.AuBecsDebitSpecKt;
import com.stripe.android.ui.core.forms.BancontactSpecKt;
import com.stripe.android.ui.core.forms.CardSpecKt;
import com.stripe.android.ui.core.forms.EpsSpecKt;
import com.stripe.android.ui.core.forms.GiropaySpecKt;
import com.stripe.android.ui.core.forms.IdealSpecKt;
import com.stripe.android.ui.core.forms.KlarnaSpecKt;
import com.stripe.android.ui.core.forms.P24SpecKt;
import com.stripe.android.ui.core.forms.PaypalSpecKt;
import com.stripe.android.ui.core.forms.SepaDebitSpecKt;
import com.stripe.android.ui.core.forms.SofortSpecKt;
import com.stripe.android.ui.core.forms.USBankAccountSpecKt;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import m00.l;
import vz.k;
import vz.m;
import vz.p;
import vz.v;
import wz.r0;
import wz.x;

/* loaded from: classes6.dex */
public final class LpmRepository {
    public static final int $stable = 8;
    private final Map<String, SupportedPaymentMethod> codeToForm;
    private final k exposedPaymentMethods$delegate;

    /* loaded from: classes6.dex */
    public static class SupportedPaymentMethod {
        public static final int $stable = 8;
        private final int displayNameResource;
        private final LayoutSpec formSpec;
        private final int iconResource;
        private final PaymentMethodRequirements requirement;
        private final boolean tintIconOnSelection;
        private final PaymentMethod.Type type;

        /* loaded from: classes6.dex */
        public static final class Affirm extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final Affirm INSTANCE = new Affirm();

            private Affirm() {
                super(PaymentMethod.Type.Affirm, R.string.stripe_paymentsheet_payment_method_affirm, R.drawable.stripe_ic_paymentsheet_pm_affirm, false, PaymentMethodRequirementsKt.getAffirmRequirement(), AffirmSpecKt.getAffirmForm());
            }
        }

        /* loaded from: classes6.dex */
        public static final class AfterpayClearpay extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final AfterpayClearpay INSTANCE = new AfterpayClearpay();

            private AfterpayClearpay() {
                super(PaymentMethod.Type.AfterpayClearpay, R.string.stripe_paymentsheet_payment_method_afterpay_clearpay, R.drawable.stripe_ic_paymentsheet_pm_afterpay_clearpay, false, PaymentMethodRequirementsKt.getAfterpayClearpayRequirement(), AfterpayClearpaySpecKt.getAfterpayClearpayForm());
            }
        }

        /* loaded from: classes6.dex */
        public static final class AuBecsDebit extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final AuBecsDebit INSTANCE = new AuBecsDebit();

            private AuBecsDebit() {
                super(PaymentMethod.Type.AuBecsDebit, R.string.stripe_paymentsheet_payment_method_au_becs_debit, R.drawable.stripe_ic_paymentsheet_pm_bank, true, PaymentMethodRequirementsKt.getAuBecsDebitRequirement(), AuBecsDebitSpecKt.getAuBecsDebitForm());
            }
        }

        /* loaded from: classes6.dex */
        public static final class Bancontact extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final Bancontact INSTANCE = new Bancontact();

            private Bancontact() {
                super(PaymentMethod.Type.Bancontact, R.string.stripe_paymentsheet_payment_method_bancontact, R.drawable.stripe_ic_paymentsheet_pm_bancontact, false, PaymentMethodRequirementsKt.getBancontactRequirement(), BancontactSpecKt.getBancontactForm());
            }
        }

        /* loaded from: classes6.dex */
        public static final class Card extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final Card INSTANCE = new Card();

            private Card() {
                super(PaymentMethod.Type.Card, R.string.stripe_paymentsheet_payment_method_card, R.drawable.stripe_ic_paymentsheet_pm_card, true, PaymentMethodRequirementsKt.getCardRequirement(), CardSpecKt.getCardForm());
            }
        }

        /* loaded from: classes6.dex */
        public static final class Eps extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final Eps INSTANCE = new Eps();

            private Eps() {
                super(PaymentMethod.Type.Eps, R.string.stripe_paymentsheet_payment_method_eps, R.drawable.stripe_ic_paymentsheet_pm_eps, false, PaymentMethodRequirementsKt.getEpsRequirement(), EpsSpecKt.getEpsForm());
            }
        }

        /* loaded from: classes6.dex */
        public static final class Giropay extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final Giropay INSTANCE = new Giropay();

            private Giropay() {
                super(PaymentMethod.Type.Giropay, R.string.stripe_paymentsheet_payment_method_giropay, R.drawable.stripe_ic_paymentsheet_pm_giropay, false, PaymentMethodRequirementsKt.getGiropayRequirement(), GiropaySpecKt.getGiropayForm());
            }
        }

        /* loaded from: classes6.dex */
        public static final class Ideal extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final Ideal INSTANCE = new Ideal();

            private Ideal() {
                super(PaymentMethod.Type.Ideal, R.string.stripe_paymentsheet_payment_method_ideal, R.drawable.stripe_ic_paymentsheet_pm_ideal, false, PaymentMethodRequirementsKt.getIdealRequirement(), IdealSpecKt.getIdealForm());
            }
        }

        /* loaded from: classes6.dex */
        public static final class Klarna extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final Klarna INSTANCE = new Klarna();

            private Klarna() {
                super(PaymentMethod.Type.Klarna, R.string.stripe_paymentsheet_payment_method_klarna, R.drawable.stripe_ic_paymentsheet_pm_klarna, false, PaymentMethodRequirementsKt.getKlarnaRequirement(), KlarnaSpecKt.getKlarnaForm());
            }
        }

        /* loaded from: classes6.dex */
        public static final class P24 extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final P24 INSTANCE = new P24();

            private P24() {
                super(PaymentMethod.Type.P24, R.string.stripe_paymentsheet_payment_method_p24, R.drawable.stripe_ic_paymentsheet_pm_p24, false, PaymentMethodRequirementsKt.getP24Requirement(), P24SpecKt.getP24Form());
            }
        }

        /* loaded from: classes6.dex */
        public static final class PayPal extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final PayPal INSTANCE = new PayPal();

            private PayPal() {
                super(PaymentMethod.Type.PayPal, R.string.stripe_paymentsheet_payment_method_paypal, R.drawable.stripe_ic_paymentsheet_pm_paypal, false, PaymentMethodRequirementsKt.getPaypalRequirement(), PaypalSpecKt.getPaypalForm());
            }
        }

        /* loaded from: classes6.dex */
        public static final class SepaDebit extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final SepaDebit INSTANCE = new SepaDebit();

            private SepaDebit() {
                super(PaymentMethod.Type.SepaDebit, R.string.stripe_paymentsheet_payment_method_sepa_debit, R.drawable.stripe_ic_paymentsheet_pm_sepa_debit, false, PaymentMethodRequirementsKt.getSepaDebitRequirement(), SepaDebitSpecKt.getSepaDebitForm());
            }
        }

        /* loaded from: classes6.dex */
        public static final class Sofort extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final Sofort INSTANCE = new Sofort();

            private Sofort() {
                super(PaymentMethod.Type.Sofort, R.string.stripe_paymentsheet_payment_method_sofort, R.drawable.stripe_ic_paymentsheet_pm_klarna, false, PaymentMethodRequirementsKt.getSofortRequirement(), SofortSpecKt.getSofortForm());
            }
        }

        /* loaded from: classes6.dex */
        public static final class USBankAccount extends SupportedPaymentMethod {
            public static final int $stable = 0;
            public static final USBankAccount INSTANCE = new USBankAccount();

            private USBankAccount() {
                super(PaymentMethod.Type.USBankAccount, R.string.stripe_paymentsheet_payment_method_us_bank_account, R.drawable.stripe_ic_paymentsheet_pm_bank, true, PaymentMethodRequirementsKt.getUSBankAccountRequirement(), USBankAccountSpecKt.getUSBankAccountForm());
            }
        }

        public SupportedPaymentMethod(PaymentMethod.Type type, int i11, int i12, boolean z11, PaymentMethodRequirements requirement, LayoutSpec formSpec) {
            s.g(type, "type");
            s.g(requirement, "requirement");
            s.g(formSpec, "formSpec");
            this.type = type;
            this.displayNameResource = i11;
            this.iconResource = i12;
            this.tintIconOnSelection = z11;
            this.requirement = requirement;
            this.formSpec = formSpec;
        }

        public final int getDisplayNameResource() {
            return this.displayNameResource;
        }

        public final LayoutSpec getFormSpec() {
            return this.formSpec;
        }

        public final int getIconResource() {
            return this.iconResource;
        }

        public final PaymentMethodRequirements getRequirement() {
            return this.requirement;
        }

        public final boolean getTintIconOnSelection() {
            return this.tintIconOnSelection;
        }

        public final PaymentMethod.Type getType() {
            return this.type;
        }

        public final boolean supportsCustomerSavedPM() {
            return s.c(this.requirement.getConfirmPMFromCustomer(), Boolean.TRUE);
        }

        public String toString() {
            return this.type.code;
        }
    }

    public LpmRepository() {
        k a11;
        int t11;
        int e11;
        int d11;
        a11 = m.a(LpmRepository$exposedPaymentMethods$2.INSTANCE);
        this.exposedPaymentMethods$delegate = a11;
        List<SupportedPaymentMethod> exposedPaymentMethods$payments_ui_core_release = getExposedPaymentMethods$payments_ui_core_release();
        t11 = x.t(exposedPaymentMethods$payments_ui_core_release, 10);
        e11 = r0.e(t11);
        d11 = l.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (SupportedPaymentMethod supportedPaymentMethod : exposedPaymentMethods$payments_ui_core_release) {
            p a12 = v.a(supportedPaymentMethod.getType().code, supportedPaymentMethod);
            linkedHashMap.put(a12.c(), a12.d());
        }
        this.codeToForm = linkedHashMap;
    }

    public static /* synthetic */ void getExposedPaymentMethods$payments_ui_core_release$annotations() {
    }

    public final SupportedPaymentMethod fromCode(String str) {
        if (str == null) {
            return null;
        }
        return this.codeToForm.get(str);
    }

    public final List<SupportedPaymentMethod> getExposedPaymentMethods$payments_ui_core_release() {
        return (List) this.exposedPaymentMethods$delegate.getValue();
    }

    public final List<SupportedPaymentMethod> values() {
        return getExposedPaymentMethods$payments_ui_core_release();
    }
}