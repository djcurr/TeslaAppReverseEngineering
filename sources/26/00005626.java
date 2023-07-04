package com.stripe.android.paymentsheet.flowcontroller;

import androidx.lifecycle.l0;
import androidx.lifecycle.p0;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class FlowControllerViewModel extends p0 {
    private static final Companion Companion = new Companion(null);
    @Deprecated
    private static final String INIT_DATA_KEY = "init_data";
    private final l0 handle;
    private PaymentSelection paymentSelection;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FlowControllerViewModel(l0 handle) {
        s.g(handle, "handle");
        this.handle = handle;
    }

    public final InitData getInitData() {
        Object c11 = this.handle.c(INIT_DATA_KEY);
        if (c11 != null) {
            return (InitData) c11;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final PaymentSelection getPaymentSelection() {
        return this.paymentSelection;
    }

    public final void setInitData(InitData value) {
        s.g(value, "value");
        this.handle.h(INIT_DATA_KEY, value);
    }

    public final void setPaymentSelection(PaymentSelection paymentSelection) {
        this.paymentSelection = paymentSelection;
    }
}