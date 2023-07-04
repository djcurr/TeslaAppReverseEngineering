package com.stripe.android.financialconnections.model;

import c30.b;
import com.stripe.android.financialconnections.model.AccountHolder;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import d30.a;
import e30.f;
import f30.c;
import f30.d;
import f30.e;
import g30.b0;
import g30.g1;
import g30.q1;
import g30.u1;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final class AccountHolder$$serializer implements b0<AccountHolder> {
    public static final AccountHolder$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        AccountHolder$$serializer accountHolder$$serializer = new AccountHolder$$serializer();
        INSTANCE = accountHolder$$serializer;
        g1 g1Var = new g1("com.stripe.android.financialconnections.model.AccountHolder", accountHolder$$serializer, 3);
        g1Var.k("type", true);
        g1Var.k("account", true);
        g1Var.k(PaymentSheetEvent.FIELD_CUSTOMER, true);
        descriptor = g1Var;
    }

    private AccountHolder$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        u1 u1Var = u1.f27647a;
        return new b[]{AccountHolder$Type$$serializer.INSTANCE, a.o(u1Var), a.o(u1Var)};
    }

    @Override // c30.a
    public AccountHolder deserialize(e decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        int i11;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        Object obj4 = null;
        if (b11.n()) {
            obj2 = b11.e(descriptor2, 0, AccountHolder$Type$$serializer.INSTANCE, null);
            u1 u1Var = u1.f27647a;
            obj = b11.A(descriptor2, 1, u1Var, null);
            obj3 = b11.A(descriptor2, 2, u1Var, null);
            i11 = 7;
        } else {
            Object obj5 = null;
            Object obj6 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z11 = false;
                } else if (p11 == 0) {
                    obj4 = b11.e(descriptor2, 0, AccountHolder$Type$$serializer.INSTANCE, obj4);
                    i12 |= 1;
                } else if (p11 == 1) {
                    obj5 = b11.A(descriptor2, 1, u1.f27647a, obj5);
                    i12 |= 2;
                } else if (p11 != 2) {
                    throw new UnknownFieldException(p11);
                } else {
                    obj6 = b11.A(descriptor2, 2, u1.f27647a, obj6);
                    i12 |= 4;
                }
            }
            obj = obj5;
            obj2 = obj4;
            obj3 = obj6;
            i11 = i12;
        }
        b11.d(descriptor2);
        return new AccountHolder(i11, (AccountHolder.Type) obj2, (String) obj, (String) obj3, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, AccountHolder value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        AccountHolder.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}