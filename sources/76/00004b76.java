package com.stripe.android;

/* loaded from: classes2.dex */
public interface OperationIdFactory {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final /* synthetic */ OperationIdFactory get$payments_core_release() {
            return new StripeOperationIdFactory();
        }
    }

    String create();
}