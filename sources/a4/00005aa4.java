package com.stripe.android.ui.core.elements;

import c30.b;
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

/* loaded from: classes6.dex */
public final class IdentifierSpec$$serializer implements b0<IdentifierSpec> {
    public static final int $stable;
    public static final IdentifierSpec$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        IdentifierSpec$$serializer identifierSpec$$serializer = new IdentifierSpec$$serializer();
        INSTANCE = identifierSpec$$serializer;
        g1 g1Var = new g1("com.stripe.android.ui.core.elements.IdentifierSpec", identifierSpec$$serializer, 1);
        g1Var.k("v1", false);
        descriptor = g1Var;
        $stable = 8;
    }

    private IdentifierSpec$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{u1.f27647a};
    }

    @Override // c30.a
    public IdentifierSpec deserialize(e decoder) {
        String str;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.n()) {
            str = b11.i(descriptor2, 0);
        } else {
            str = null;
            int i12 = 0;
            while (i11 != 0) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    i11 = 0;
                } else if (p11 != 0) {
                    throw new UnknownFieldException(p11);
                } else {
                    str = b11.i(descriptor2, 0);
                    i12 |= 1;
                }
            }
            i11 = i12;
        }
        b11.d(descriptor2);
        return new IdentifierSpec(i11, str, null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, IdentifierSpec value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        IdentifierSpec.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}