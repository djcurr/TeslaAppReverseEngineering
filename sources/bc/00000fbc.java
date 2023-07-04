package c7;

import com.adyen.checkout.core.exception.CheckoutException;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final CheckoutException f8916a;

    public d(CheckoutException checkoutException) {
        this.f8916a = checkoutException;
    }

    public String a() {
        return this.f8916a.getMessage();
    }
}