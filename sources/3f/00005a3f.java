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
public final class CountrySpec$$serializer implements b0<CountrySpec> {
    public static final int $stable;
    public static final CountrySpec$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        CountrySpec$$serializer countrySpec$$serializer = new CountrySpec$$serializer();
        INSTANCE = countrySpec$$serializer;
        g1 g1Var = new g1("com.stripe.android.ui.core.elements.CountrySpec", countrySpec$$serializer, 2);
        g1Var.k("apiPath", true);
        g1Var.k("valid_country_codes", true);
        descriptor = g1Var;
        $stable = 8;
    }

    private CountrySpec$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{IdentifierSpec$$serializer.INSTANCE, new q0(u1.f27647a)};
    }

    @Override // c30.a
    public CountrySpec deserialize(e decoder) {
        Object obj;
        Object obj2;
        int i11;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.n()) {
            obj = b11.e(descriptor2, 0, IdentifierSpec$$serializer.INSTANCE, null);
            obj2 = b11.e(descriptor2, 1, new q0(u1.f27647a), null);
            i11 = 3;
        } else {
            obj = null;
            Object obj3 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z11 = false;
                } else if (p11 == 0) {
                    obj = b11.e(descriptor2, 0, IdentifierSpec$$serializer.INSTANCE, obj);
                    i12 |= 1;
                } else if (p11 != 1) {
                    throw new UnknownFieldException(p11);
                } else {
                    obj3 = b11.e(descriptor2, 1, new q0(u1.f27647a), obj3);
                    i12 |= 2;
                }
            }
            obj2 = obj3;
            i11 = i12;
        }
        b11.d(descriptor2);
        return new CountrySpec(i11, (IdentifierSpec) obj, (Set) obj2, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, CountrySpec value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CountrySpec.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}