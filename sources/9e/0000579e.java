package com.stripe.android.paymentsheet.ui;

import android.content.res.Resources;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.R;
import com.stripe.android.paymentsheet.paymentdatacollection.ach.TransformToBankIcon;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class PaymentMethodsUiExtensionKt {

    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[PaymentMethod.Type.values().length];
            iArr[PaymentMethod.Type.Card.ordinal()] = 1;
            iArr[PaymentMethod.Type.SepaDebit.ordinal()] = 2;
            iArr[PaymentMethod.Type.USBankAccount.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CardBrand.values().length];
            iArr2[CardBrand.Visa.ordinal()] = 1;
            iArr2[CardBrand.AmericanExpress.ordinal()] = 2;
            iArr2[CardBrand.Discover.ordinal()] = 3;
            iArr2[CardBrand.JCB.ordinal()] = 4;
            iArr2[CardBrand.DinersClub.ordinal()] = 5;
            iArr2[CardBrand.MasterCard.ordinal()] = 6;
            iArr2[CardBrand.UnionPay.ordinal()] = 7;
            iArr2[CardBrand.Unknown.ordinal()] = 8;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String createCardLabel(Resources resources, String str) {
        s.g(resources, "resources");
        String string = str == null ? null : resources.getString(R.string.paymentsheet_payment_method_item_card_number, str);
        return string == null ? "" : string;
    }

    public static final int getCardBrandIcon(CardBrand cardBrand) {
        s.g(cardBrand, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[cardBrand.ordinal()]) {
            case 1:
                return R.drawable.stripe_ic_paymentsheet_card_visa;
            case 2:
                return R.drawable.stripe_ic_paymentsheet_card_amex;
            case 3:
                return R.drawable.stripe_ic_paymentsheet_card_discover;
            case 4:
                return R.drawable.stripe_ic_paymentsheet_card_jcb;
            case 5:
                return R.drawable.stripe_ic_paymentsheet_card_dinersclub;
            case 6:
                return R.drawable.stripe_ic_paymentsheet_card_mastercard;
            case 7:
                return R.drawable.stripe_ic_paymentsheet_card_unionpay;
            case 8:
                return R.drawable.stripe_ic_paymentsheet_card_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final String getLabel(PaymentMethod paymentMethod, Resources resources) {
        s.g(paymentMethod, "<this>");
        s.g(resources, "resources");
        PaymentMethod.Type type = paymentMethod.type;
        int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i11 == 1) {
            PaymentMethod.Card card = paymentMethod.card;
            return createCardLabel(resources, card != null ? card.last4 : null);
        } else if (i11 == 2) {
            int i12 = R.string.paymentsheet_payment_method_item_card_number;
            Object[] objArr = new Object[1];
            PaymentMethod.SepaDebit sepaDebit = paymentMethod.sepaDebit;
            objArr[0] = sepaDebit != null ? sepaDebit.last4 : null;
            return resources.getString(i12, objArr);
        } else if (i11 != 3) {
            return null;
        } else {
            int i13 = R.string.paymentsheet_payment_method_item_card_number;
            Object[] objArr2 = new Object[1];
            PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
            objArr2[0] = uSBankAccount != null ? uSBankAccount.last4 : null;
            return resources.getString(i13, objArr2);
        }
    }

    public static final Integer getLabelIcon(PaymentMethod paymentMethod) {
        s.g(paymentMethod, "<this>");
        PaymentMethod.Type type = paymentMethod.type;
        if ((type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) == 3) {
            return Integer.valueOf(R.drawable.stripe_ic_bank);
        }
        return null;
    }

    public static final Integer getSavedPaymentMethodIcon(PaymentMethod paymentMethod) {
        int intValue;
        CardBrand cardBrand;
        PaymentMethod.USBankAccount uSBankAccount;
        String str;
        s.g(paymentMethod, "<this>");
        PaymentMethod.Type type = paymentMethod.type;
        int i11 = type == null ? -1 : WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        Integer num = null;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3 || (uSBankAccount = paymentMethod.usBankAccount) == null || (str = uSBankAccount.bankName) == null) {
                    return null;
                }
                return Integer.valueOf(TransformToBankIcon.Companion.invoke(str));
            }
            return Integer.valueOf(R.drawable.stripe_ic_paymentsheet_pm_sepa_debit);
        }
        PaymentMethod.Card card = paymentMethod.card;
        if (card != null && (cardBrand = card.brand) != null) {
            num = Integer.valueOf(getCardBrandIcon(cardBrand));
        }
        if (num == null) {
            intValue = R.drawable.stripe_ic_paymentsheet_card_unknown;
        } else {
            intValue = num.intValue();
        }
        return Integer.valueOf(intValue);
    }
}