package com.stripe.android.ui.core.elements;

import c30.b;
import e30.f;
import f30.c;
import f30.d;
import f30.e;
import g30.b0;
import g30.g1;
import g30.q0;
import g30.q1;
import g30.u1;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes6.dex */
public final class AddressSpec$$serializer implements b0<AddressSpec> {
    public static final int $stable;
    public static final AddressSpec$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        AddressSpec$$serializer addressSpec$$serializer = new AddressSpec$$serializer();
        INSTANCE = addressSpec$$serializer;
        g1 g1Var = new g1("com.stripe.android.ui.core.elements.AddressSpec", addressSpec$$serializer, 3);
        g1Var.k("apiPath", true);
        g1Var.k("valid_country_codes", true);
        g1Var.k("display_fields", true);
        descriptor = g1Var;
        $stable = 8;
    }

    private AddressSpec$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{IdentifierSpec$$serializer.INSTANCE, new q0(u1.f27647a), new q0(DisplayField$$serializer.INSTANCE)};
    }

    @Override // c30.a
    public AddressSpec deserialize(e decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        int i11;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        Object obj4 = null;
        if (b11.n()) {
            obj2 = b11.e(descriptor2, 0, IdentifierSpec$$serializer.INSTANCE, null);
            Object e11 = b11.e(descriptor2, 1, new q0(u1.f27647a), null);
            obj3 = b11.e(descriptor2, 2, new q0(DisplayField$$serializer.INSTANCE), null);
            i11 = 7;
            obj = e11;
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
                    obj4 = b11.e(descriptor2, 0, IdentifierSpec$$serializer.INSTANCE, obj4);
                    i12 |= 1;
                } else if (p11 == 1) {
                    obj5 = b11.e(descriptor2, 1, new q0(u1.f27647a), obj5);
                    i12 |= 2;
                } else if (p11 != 2) {
                    throw new UnknownFieldException(p11);
                } else {
                    obj6 = b11.e(descriptor2, 2, new q0(DisplayField$$serializer.INSTANCE), obj6);
                    i12 |= 4;
                }
            }
            obj = obj5;
            obj2 = obj4;
            obj3 = obj6;
            i11 = i12;
        }
        b11.d(descriptor2);
        return new AddressSpec(i11, (IdentifierSpec) obj2, (Set) obj, (Set) obj3, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, AddressSpec value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        AddressSpec.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}