package com.stripe.android.paymentsheet.forms;

import c30.b;
import c30.d;
import d30.a;
import e30.f;
import f30.c;
import f30.e;
import g30.b0;
import g30.g1;
import g30.i;
import g30.q0;
import java.lang.annotation.Annotation;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes6.dex */
public final class PaymentMethodRequirements$$serializer implements b0<PaymentMethodRequirements> {
    public static final int $stable;
    public static final PaymentMethodRequirements$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        PaymentMethodRequirements$$serializer paymentMethodRequirements$$serializer = new PaymentMethodRequirements$$serializer();
        INSTANCE = paymentMethodRequirements$$serializer;
        g1 g1Var = new g1("com.stripe.android.paymentsheet.forms.PaymentMethodRequirements", paymentMethodRequirements$$serializer, 3);
        g1Var.k("piRequirements", false);
        g1Var.k("siRequirements", false);
        g1Var.k("confirmPMFromCustomer", false);
        descriptor = g1Var;
        $stable = 8;
    }

    private PaymentMethodRequirements$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{a.o(new q0(new d(m0.b(PIRequirement.class), new Annotation[0]))), a.o(new q0(new d(m0.b(SIRequirement.class), new Annotation[0]))), a.o(i.f27597a)};
    }

    @Override // c30.a
    public PaymentMethodRequirements deserialize(e decoder) {
        Object obj;
        int i11;
        Object obj2;
        Object obj3;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.n()) {
            obj = b11.A(descriptor2, 0, new q0(new d(m0.b(PIRequirement.class), new Annotation[0])), null);
            obj2 = b11.A(descriptor2, 1, new q0(new d(m0.b(SIRequirement.class), new Annotation[0])), null);
            obj3 = b11.A(descriptor2, 2, i.f27597a, null);
            i11 = 7;
        } else {
            Object obj4 = null;
            Object obj5 = null;
            Object obj6 = null;
            boolean z11 = true;
            int i12 = 0;
            while (z11) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z11 = false;
                } else if (p11 == 0) {
                    obj4 = b11.A(descriptor2, 0, new q0(new d(m0.b(PIRequirement.class), new Annotation[0])), obj4);
                    i12 |= 1;
                } else if (p11 == 1) {
                    obj5 = b11.A(descriptor2, 1, new q0(new d(m0.b(SIRequirement.class), new Annotation[0])), obj5);
                    i12 |= 2;
                } else if (p11 != 2) {
                    throw new UnknownFieldException(p11);
                } else {
                    obj6 = b11.A(descriptor2, 2, i.f27597a, obj6);
                    i12 |= 4;
                }
            }
            obj = obj4;
            i11 = i12;
            obj2 = obj5;
            obj3 = obj6;
        }
        b11.d(descriptor2);
        return new PaymentMethodRequirements(i11, (Set) obj, (Set) obj2, (Boolean) obj3, null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, PaymentMethodRequirements value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        f30.d b11 = encoder.b(descriptor2);
        PaymentMethodRequirements.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}