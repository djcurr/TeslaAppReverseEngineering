package com.stripe.android.financialconnections.model;

import c30.b;
import d30.a;
import e30.f;
import f30.c;
import f30.d;
import f30.e;
import g30.b0;
import g30.g1;
import g30.k0;
import g30.o0;
import g30.q1;
import g30.u1;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final class CreditBalance$$serializer implements b0<CreditBalance> {
    public static final CreditBalance$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        CreditBalance$$serializer creditBalance$$serializer = new CreditBalance$$serializer();
        INSTANCE = creditBalance$$serializer;
        g1 g1Var = new g1("com.stripe.android.financialconnections.model.CreditBalance", creditBalance$$serializer, 1);
        g1Var.k("used", true);
        descriptor = g1Var;
    }

    private CreditBalance$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{a.o(new o0(u1.f27647a, k0.f27606a))};
    }

    @Override // c30.a
    public CreditBalance deserialize(e decoder) {
        Object obj;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.n()) {
            obj = b11.A(descriptor2, 0, new o0(u1.f27647a, k0.f27606a), null);
        } else {
            obj = null;
            int i12 = 0;
            while (i11 != 0) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    i11 = 0;
                } else if (p11 != 0) {
                    throw new UnknownFieldException(p11);
                } else {
                    obj = b11.A(descriptor2, 0, new o0(u1.f27647a, k0.f27606a), obj);
                    i12 |= 1;
                }
            }
            i11 = i12;
        }
        b11.d(descriptor2);
        return new CreditBalance(i11, (Map) obj, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, CreditBalance value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CreditBalance.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}