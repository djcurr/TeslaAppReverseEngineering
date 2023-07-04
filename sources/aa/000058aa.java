package com.stripe.android.stripe3ds2.transaction;

import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import vz.b0;
import zz.d;

/* loaded from: classes6.dex */
public final class ImmediateTimeoutTransactionTimer implements TransactionTimer {
    private final e<Boolean> timeout = g.x(Boolean.TRUE);

    @Override // com.stripe.android.stripe3ds2.transaction.TransactionTimer
    public e<Boolean> getTimeout() {
        return this.timeout;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.TransactionTimer
    public Object start(d<? super b0> dVar) {
        return b0.f54756a;
    }
}