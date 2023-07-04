package com.stripe.android.financialconnections.model;

import android.os.Parcelable;
import c30.b;
import com.stripe.android.financialconnections.model.serializer.PaymentAccountSerializer;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.a;

@a(with = PaymentAccountSerializer.class)
/* loaded from: classes2.dex */
public abstract class PaymentAccount implements Parcelable {
    public static final Companion Companion = new Companion(null);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b<PaymentAccount> serializer() {
            return PaymentAccountSerializer.INSTANCE;
        }
    }

    private PaymentAccount() {
    }

    public /* synthetic */ PaymentAccount(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}