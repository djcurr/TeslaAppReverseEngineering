package com.stripe.android.stripe3ds2.transaction;

import kotlinx.coroutines.flow.e;
import vz.b0;
import zz.d;

/* loaded from: classes6.dex */
public interface TransactionTimer {
    e<Boolean> getTimeout();

    Object start(d<? super b0> dVar);
}