package com.stripe.android.financialconnections.model;

import c30.b;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import d30.a;
import e30.f;
import f30.c;
import f30.d;
import f30.e;
import g30.b0;
import g30.g1;
import g30.i;
import g30.k0;
import g30.q1;
import g30.u1;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final class FinancialConnectionsAccountList$$serializer implements b0<FinancialConnectionsAccountList> {
    public static final FinancialConnectionsAccountList$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        FinancialConnectionsAccountList$$serializer financialConnectionsAccountList$$serializer = new FinancialConnectionsAccountList$$serializer();
        INSTANCE = financialConnectionsAccountList$$serializer;
        g1 g1Var = new g1("com.stripe.android.financialconnections.model.FinancialConnectionsAccountList", financialConnectionsAccountList$$serializer, 5);
        g1Var.k(MessageExtension.FIELD_DATA, false);
        g1Var.k("has_more", false);
        g1Var.k("url", false);
        g1Var.k("count", true);
        g1Var.k("total_count", true);
        descriptor = g1Var;
    }

    private FinancialConnectionsAccountList$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        k0 k0Var = k0.f27606a;
        return new b[]{new g30.f(FinancialConnectionsAccount$$serializer.INSTANCE), i.f27597a, u1.f27647a, a.o(k0Var), a.o(k0Var)};
    }

    @Override // c30.a
    public FinancialConnectionsAccountList deserialize(e decoder) {
        Object obj;
        String str;
        int i11;
        Object obj2;
        Object obj3;
        boolean z11;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.n()) {
            obj = b11.e(descriptor2, 0, new g30.f(FinancialConnectionsAccount$$serializer.INSTANCE), null);
            boolean o11 = b11.o(descriptor2, 1);
            String i12 = b11.i(descriptor2, 2);
            k0 k0Var = k0.f27606a;
            obj2 = b11.A(descriptor2, 3, k0Var, null);
            obj3 = b11.A(descriptor2, 4, k0Var, null);
            i11 = 31;
            str = i12;
            z11 = o11;
        } else {
            obj = null;
            str = null;
            Object obj4 = null;
            Object obj5 = null;
            i11 = 0;
            boolean z12 = false;
            boolean z13 = true;
            while (z13) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z13 = false;
                } else if (p11 == 0) {
                    obj = b11.e(descriptor2, 0, new g30.f(FinancialConnectionsAccount$$serializer.INSTANCE), obj);
                    i11 |= 1;
                } else if (p11 == 1) {
                    z12 = b11.o(descriptor2, 1);
                    i11 |= 2;
                } else if (p11 == 2) {
                    str = b11.i(descriptor2, 2);
                    i11 |= 4;
                } else if (p11 == 3) {
                    obj4 = b11.A(descriptor2, 3, k0.f27606a, obj4);
                    i11 |= 8;
                } else if (p11 != 4) {
                    throw new UnknownFieldException(p11);
                } else {
                    obj5 = b11.A(descriptor2, 4, k0.f27606a, obj5);
                    i11 |= 16;
                }
            }
            obj2 = obj4;
            obj3 = obj5;
            z11 = z12;
        }
        b11.d(descriptor2);
        return new FinancialConnectionsAccountList(i11, (List) obj, z11, str, (Integer) obj2, (Integer) obj3, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, FinancialConnectionsAccountList value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        FinancialConnectionsAccountList.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}