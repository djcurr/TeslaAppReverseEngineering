package com.stripe.android.exception;

import com.google.android.gms.wallet.WalletConstants;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.StripeException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class CardException extends StripeException {
    public static final int $stable = 0;
    private final String charge;
    private final String code;
    private final String declineCode;
    private final String param;

    public /* synthetic */ CardException(StripeError stripeError, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(stripeError, (i11 & 2) != 0 ? null : str);
    }

    public final String getCharge() {
        return this.charge;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDeclineCode() {
        return this.declineCode;
    }

    public final String getParam() {
        return this.param;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardException(StripeError stripeError, String str) {
        super(stripeError, str, WalletConstants.ERROR_CODE_SERVICE_UNAVAILABLE, null, null, 24, null);
        s.g(stripeError, "stripeError");
        this.code = stripeError.getCode();
        this.param = stripeError.getParam();
        this.declineCode = stripeError.getDeclineCode();
        this.charge = stripeError.getCharge();
    }
}