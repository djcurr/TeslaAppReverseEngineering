package com.stripe.android.financialconnections.model;

import c30.b;
import d30.a;
import e30.f;
import f30.c;
import f30.d;
import f30.e;
import g30.b0;
import g30.g1;
import g30.u1;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final class GetFinancialConnectionsAcccountsParams$$serializer implements b0<GetFinancialConnectionsAcccountsParams> {
    public static final GetFinancialConnectionsAcccountsParams$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        GetFinancialConnectionsAcccountsParams$$serializer getFinancialConnectionsAcccountsParams$$serializer = new GetFinancialConnectionsAcccountsParams$$serializer();
        INSTANCE = getFinancialConnectionsAcccountsParams$$serializer;
        g1 g1Var = new g1("com.stripe.android.financialconnections.model.GetFinancialConnectionsAcccountsParams", getFinancialConnectionsAcccountsParams$$serializer, 2);
        g1Var.k("client_secret", false);
        g1Var.k("starting_after", false);
        descriptor = g1Var;
    }

    private GetFinancialConnectionsAcccountsParams$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        u1 u1Var = u1.f27647a;
        return new b[]{u1Var, a.o(u1Var)};
    }

    @Override // c30.a
    public GetFinancialConnectionsAcccountsParams deserialize(e decoder) {
        String str;
        Object obj;
        int i11;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.n()) {
            str = b11.i(descriptor2, 0);
            obj = b11.A(descriptor2, 1, u1.f27647a, null);
            i11 = 3;
        } else {
            str = null;
            Object obj2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z11 = false;
                } else if (p11 == 0) {
                    str = b11.i(descriptor2, 0);
                    i12 |= 1;
                } else if (p11 != 1) {
                    throw new UnknownFieldException(p11);
                } else {
                    obj2 = b11.A(descriptor2, 1, u1.f27647a, obj2);
                    i12 |= 2;
                }
            }
            obj = obj2;
            i11 = i12;
        }
        b11.d(descriptor2);
        return new GetFinancialConnectionsAcccountsParams(i11, str, (String) obj, null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, GetFinancialConnectionsAcccountsParams value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        GetFinancialConnectionsAcccountsParams.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}