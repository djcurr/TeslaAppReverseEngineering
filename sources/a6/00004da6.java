package com.stripe.android.financialconnections.model;

import c30.b;
import com.stripe.android.financialconnections.model.Balance;
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
public final class Balance$$serializer implements b0<Balance> {
    public static final Balance$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        Balance$$serializer balance$$serializer = new Balance$$serializer();
        INSTANCE = balance$$serializer;
        g1 g1Var = new g1("com.stripe.android.financialconnections.model.Balance", balance$$serializer, 5);
        g1Var.k("as_of", false);
        g1Var.k("current", false);
        g1Var.k("type", true);
        g1Var.k("cash", true);
        g1Var.k("credit", true);
        descriptor = g1Var;
    }

    private Balance$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        k0 k0Var = k0.f27606a;
        return new b[]{k0Var, new o0(u1.f27647a, k0Var), Balance$Type$$serializer.INSTANCE, a.o(CashBalance$$serializer.INSTANCE), a.o(CreditBalance$$serializer.INSTANCE)};
    }

    @Override // c30.a
    /* renamed from: deserialize */
    public Balance mo133deserialize(e decoder) {
        int i11;
        int i12;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i13 = 3;
        if (b11.n()) {
            int C = b11.C(descriptor2, 0);
            obj = b11.e(descriptor2, 1, new o0(u1.f27647a, k0.f27606a), null);
            obj2 = b11.e(descriptor2, 2, Balance$Type$$serializer.INSTANCE, null);
            obj3 = b11.A(descriptor2, 3, CashBalance$$serializer.INSTANCE, null);
            obj4 = b11.A(descriptor2, 4, CreditBalance$$serializer.INSTANCE, null);
            i11 = C;
            i12 = 31;
        } else {
            Object obj5 = null;
            Object obj6 = null;
            Object obj7 = null;
            Object obj8 = null;
            int i14 = 0;
            int i15 = 0;
            boolean z11 = true;
            while (z11) {
                int p11 = b11.p(descriptor2);
                if (p11 != -1) {
                    if (p11 == 0) {
                        i14 = b11.C(descriptor2, 0);
                        i15 |= 1;
                    } else if (p11 == 1) {
                        obj5 = b11.e(descriptor2, 1, new o0(u1.f27647a, k0.f27606a), obj5);
                        i15 |= 2;
                    } else if (p11 == 2) {
                        obj6 = b11.e(descriptor2, 2, Balance$Type$$serializer.INSTANCE, obj6);
                        i15 |= 4;
                    } else if (p11 == i13) {
                        obj7 = b11.A(descriptor2, i13, CashBalance$$serializer.INSTANCE, obj7);
                        i15 |= 8;
                    } else if (p11 != 4) {
                        throw new UnknownFieldException(p11);
                    } else {
                        obj8 = b11.A(descriptor2, 4, CreditBalance$$serializer.INSTANCE, obj8);
                        i15 |= 16;
                    }
                    i13 = 3;
                } else {
                    z11 = false;
                }
            }
            i11 = i14;
            i12 = i15;
            obj = obj5;
            obj2 = obj6;
            obj3 = obj7;
            obj4 = obj8;
        }
        b11.d(descriptor2);
        return new Balance(i12, i11, (Map) obj, (Balance.Type) obj2, (CashBalance) obj3, (CreditBalance) obj4, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, Balance value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        Balance.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}