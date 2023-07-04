package com.stripe.android.financialconnections.model;

import c30.b;
import com.stripe.android.financialconnections.model.serializer.JsonAsStringSerializer;
import com.stripe.android.financialconnections.model.serializer.PaymentAccountSerializer;
import d30.a;
import e30.f;
import f30.c;
import f30.d;
import f30.e;
import g30.b0;
import g30.g1;
import g30.i;
import g30.q1;
import g30.u1;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final class FinancialConnectionsSession$$serializer implements b0<FinancialConnectionsSession> {
    public static final FinancialConnectionsSession$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        FinancialConnectionsSession$$serializer financialConnectionsSession$$serializer = new FinancialConnectionsSession$$serializer();
        INSTANCE = financialConnectionsSession$$serializer;
        g1 g1Var = new g1("com.stripe.android.financialconnections.model.FinancialConnectionsSession", financialConnectionsSession$$serializer, 8);
        g1Var.k("client_secret", false);
        g1Var.k("id", false);
        g1Var.k("linked_accounts", true);
        g1Var.k("accounts", true);
        g1Var.k("livemode", false);
        g1Var.k("payment_account", true);
        g1Var.k("return_url", true);
        g1Var.k("bank_account_token", true);
        descriptor = g1Var;
    }

    private FinancialConnectionsSession$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        u1 u1Var = u1.f27647a;
        FinancialConnectionsAccountList$$serializer financialConnectionsAccountList$$serializer = FinancialConnectionsAccountList$$serializer.INSTANCE;
        return new b[]{u1Var, u1Var, a.o(financialConnectionsAccountList$$serializer), a.o(financialConnectionsAccountList$$serializer), i.f27597a, a.o(PaymentAccountSerializer.INSTANCE), a.o(u1Var), a.o(JsonAsStringSerializer.INSTANCE)};
    }

    @Override // c30.a
    public FinancialConnectionsSession deserialize(e decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i11;
        String str;
        String str2;
        Object obj5;
        boolean z11;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i12 = 7;
        if (b11.n()) {
            String i13 = b11.i(descriptor2, 0);
            String i14 = b11.i(descriptor2, 1);
            FinancialConnectionsAccountList$$serializer financialConnectionsAccountList$$serializer = FinancialConnectionsAccountList$$serializer.INSTANCE;
            Object A = b11.A(descriptor2, 2, financialConnectionsAccountList$$serializer, null);
            obj5 = b11.A(descriptor2, 3, financialConnectionsAccountList$$serializer, null);
            boolean o11 = b11.o(descriptor2, 4);
            obj4 = b11.A(descriptor2, 5, PaymentAccountSerializer.INSTANCE, null);
            obj3 = b11.A(descriptor2, 6, u1.f27647a, null);
            obj2 = b11.A(descriptor2, 7, JsonAsStringSerializer.INSTANCE, null);
            z11 = o11;
            obj = A;
            i11 = 255;
            str2 = i14;
            str = i13;
        } else {
            boolean z12 = true;
            boolean z13 = false;
            Object obj6 = null;
            Object obj7 = null;
            String str3 = null;
            String str4 = null;
            obj = null;
            Object obj8 = null;
            Object obj9 = null;
            int i15 = 0;
            while (z12) {
                int p11 = b11.p(descriptor2);
                switch (p11) {
                    case -1:
                        z12 = false;
                        break;
                    case 0:
                        i15 |= 1;
                        str3 = b11.i(descriptor2, 0);
                        i12 = 7;
                        break;
                    case 1:
                        str4 = b11.i(descriptor2, 1);
                        i15 |= 2;
                        i12 = 7;
                        break;
                    case 2:
                        obj = b11.A(descriptor2, 2, FinancialConnectionsAccountList$$serializer.INSTANCE, obj);
                        i15 |= 4;
                        i12 = 7;
                        break;
                    case 3:
                        obj8 = b11.A(descriptor2, 3, FinancialConnectionsAccountList$$serializer.INSTANCE, obj8);
                        i15 |= 8;
                        i12 = 7;
                        continue;
                    case 4:
                        z13 = b11.o(descriptor2, 4);
                        i15 |= 16;
                        break;
                    case 5:
                        obj9 = b11.A(descriptor2, 5, PaymentAccountSerializer.INSTANCE, obj9);
                        i15 |= 32;
                        break;
                    case 6:
                        obj7 = b11.A(descriptor2, 6, u1.f27647a, obj7);
                        i15 |= 64;
                        break;
                    case 7:
                        obj6 = b11.A(descriptor2, i12, JsonAsStringSerializer.INSTANCE, obj6);
                        i15 |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(p11);
                }
            }
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj9;
            i11 = i15;
            str = str3;
            str2 = str4;
            obj5 = obj8;
            z11 = z13;
        }
        b11.d(descriptor2);
        return new FinancialConnectionsSession(i11, str, str2, (FinancialConnectionsAccountList) obj, (FinancialConnectionsAccountList) obj5, z11, (PaymentAccount) obj4, (String) obj3, (String) obj2, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, FinancialConnectionsSession value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        FinancialConnectionsSession.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}