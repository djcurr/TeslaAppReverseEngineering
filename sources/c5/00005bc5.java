package com.stripe.android.ui.core.forms.resources;

import com.stripe.android.ui.core.forms.resources.LpmRepository;
import h00.a;
import java.util.List;
import kotlin.jvm.internal.u;
import wz.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class LpmRepository$exposedPaymentMethods$2 extends u implements a<List<? extends LpmRepository.SupportedPaymentMethod>> {
    public static final LpmRepository$exposedPaymentMethods$2 INSTANCE = new LpmRepository$exposedPaymentMethods$2();

    LpmRepository$exposedPaymentMethods$2() {
        super(0);
    }

    @Override // h00.a
    public final List<? extends LpmRepository.SupportedPaymentMethod> invoke() {
        List<? extends LpmRepository.SupportedPaymentMethod> l11;
        l11 = w.l(LpmRepository.SupportedPaymentMethod.Card.INSTANCE, LpmRepository.SupportedPaymentMethod.Bancontact.INSTANCE, LpmRepository.SupportedPaymentMethod.Sofort.INSTANCE, LpmRepository.SupportedPaymentMethod.Ideal.INSTANCE, LpmRepository.SupportedPaymentMethod.SepaDebit.INSTANCE, LpmRepository.SupportedPaymentMethod.Eps.INSTANCE, LpmRepository.SupportedPaymentMethod.Giropay.INSTANCE, LpmRepository.SupportedPaymentMethod.P24.INSTANCE, LpmRepository.SupportedPaymentMethod.Klarna.INSTANCE, LpmRepository.SupportedPaymentMethod.PayPal.INSTANCE, LpmRepository.SupportedPaymentMethod.AfterpayClearpay.INSTANCE, LpmRepository.SupportedPaymentMethod.USBankAccount.INSTANCE, LpmRepository.SupportedPaymentMethod.Affirm.INSTANCE, LpmRepository.SupportedPaymentMethod.AuBecsDebit.INSTANCE);
        return l11;
    }
}