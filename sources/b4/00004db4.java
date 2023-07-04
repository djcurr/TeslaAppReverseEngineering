package com.stripe.android.financialconnections.model;

import c30.b;
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
public final class BankAccount$$serializer implements b0<BankAccount> {
    public static final BankAccount$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        BankAccount$$serializer bankAccount$$serializer = new BankAccount$$serializer();
        INSTANCE = bankAccount$$serializer;
        g1 g1Var = new g1("com.stripe.android.financialconnections.model.BankAccount", bankAccount$$serializer, 4);
        g1Var.k("id", false);
        g1Var.k("last4", false);
        g1Var.k("bank_name", true);
        g1Var.k("routing_number", true);
        descriptor = g1Var;
    }

    private BankAccount$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        u1 u1Var = u1.f27647a;
        return new b[]{u1Var, u1Var, a.o(u1Var), a.o(u1Var)};
    }

    @Override // c30.a
    public BankAccount deserialize(e decoder) {
        String str;
        int i11;
        String str2;
        Object obj;
        Object obj2;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.n()) {
            String i12 = b11.i(descriptor2, 0);
            String i13 = b11.i(descriptor2, 1);
            u1 u1Var = u1.f27647a;
            obj = b11.A(descriptor2, 2, u1Var, null);
            obj2 = b11.A(descriptor2, 3, u1Var, null);
            str = i12;
            i11 = 15;
            str2 = i13;
        } else {
            String str3 = null;
            String str4 = null;
            Object obj3 = null;
            Object obj4 = null;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z11 = false;
                } else if (p11 == 0) {
                    str3 = b11.i(descriptor2, 0);
                    i14 |= 1;
                } else if (p11 == 1) {
                    str4 = b11.i(descriptor2, 1);
                    i14 |= 2;
                } else if (p11 == 2) {
                    obj3 = b11.A(descriptor2, 2, u1.f27647a, obj3);
                    i14 |= 4;
                } else if (p11 != 3) {
                    throw new UnknownFieldException(p11);
                } else {
                    obj4 = b11.A(descriptor2, 3, u1.f27647a, obj4);
                    i14 |= 8;
                }
            }
            str = str3;
            i11 = i14;
            str2 = str4;
            obj = obj3;
            obj2 = obj4;
        }
        b11.d(descriptor2);
        return new BankAccount(i11, str, str2, (String) obj, (String) obj2, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, BankAccount value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        BankAccount.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}