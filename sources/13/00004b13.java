package com.stripe.android;

import java.util.Calendar;
import kotlin.jvm.internal.u;

/* loaded from: classes2.dex */
final class CustomerSession$Companion$initCustomerSession$timeSupplier$1 extends u implements h00.a<Long> {
    public static final CustomerSession$Companion$initCustomerSession$timeSupplier$1 INSTANCE = new CustomerSession$Companion$initCustomerSession$timeSupplier$1();

    CustomerSession$Companion$initCustomerSession$timeSupplier$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final Long invoke() {
        return Long.valueOf(Calendar.getInstance().getTimeInMillis());
    }
}