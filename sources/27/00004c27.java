package com.stripe.android;

import java.util.UUID;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class StripeOperationIdFactory implements OperationIdFactory {
    @Override // com.stripe.android.OperationIdFactory
    public String create() {
        String uuid = UUID.randomUUID().toString();
        s.f(uuid, "randomUUID().toString()");
        return uuid;
    }
}