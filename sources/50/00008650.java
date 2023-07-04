package m7;

import com.adyen.checkout.components.model.payments.Amount;
import com.adyen.checkout.core.exception.CheckoutException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {
    static {
        o7.a.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(String str) {
        if (a.isSupported(str)) {
            return;
        }
        throw new CheckoutException("Currency " + str + " not supported");
    }

    public static String b(Amount amount, Locale locale) {
        String currency = amount.getCurrency();
        a find = a.find(currency);
        Currency currency2 = Currency.getInstance(currency);
        NumberFormat currencyInstance = DecimalFormat.getCurrencyInstance(locale);
        currencyInstance.setCurrency(currency2);
        currencyInstance.setMinimumFractionDigits(find.getFractionDigits());
        currencyInstance.setMaximumFractionDigits(find.getFractionDigits());
        return currencyInstance.format(BigDecimal.valueOf(amount.getValue(), find.getFractionDigits()));
    }
}