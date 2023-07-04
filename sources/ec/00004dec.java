package com.stripe.android.financialconnections.model.serializer;

import c30.a;
import com.stripe.android.financialconnections.model.BankAccount;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.stripe.android.financialconnections.model.PaymentAccount;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import kotlinx.serialization.json.f;
import kotlinx.serialization.json.h;

/* loaded from: classes2.dex */
public final class PaymentAccountSerializer extends f<PaymentAccount> {
    public static final PaymentAccountSerializer INSTANCE = new PaymentAccountSerializer();

    private PaymentAccountSerializer() {
        super(m0.b(PaymentAccount.class));
    }

    private final String getObjectValue(JsonElement jsonElement) {
        JsonPrimitive l11;
        JsonElement jsonElement2 = (JsonElement) h.k(jsonElement).get("object");
        if (jsonElement2 == null || (l11 = h.l(jsonElement2)) == null) {
            return null;
        }
        return l11.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.json.f
    public a<? extends PaymentAccount> selectDeserializer(JsonElement element) {
        s.g(element, "element");
        String objectValue = getObjectValue(element);
        return s.c(objectValue, FinancialConnectionsAccount.OBJECT_OLD) ? true : s.c(objectValue, FinancialConnectionsAccount.OBJECT_NEW) ? FinancialConnectionsAccount.Companion.serializer() : BankAccount.Companion.serializer();
    }
}