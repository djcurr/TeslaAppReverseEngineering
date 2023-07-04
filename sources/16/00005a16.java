package com.stripe.android.ui.core.elements;

import c30.b;
import e30.f;
import f30.c;
import f30.d;
import f30.e;
import g30.b0;
import g30.g1;
import g30.q1;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes6.dex */
public final class CardDetailsSectionSpec$$serializer implements b0<CardDetailsSectionSpec> {
    public static final int $stable;
    public static final CardDetailsSectionSpec$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        CardDetailsSectionSpec$$serializer cardDetailsSectionSpec$$serializer = new CardDetailsSectionSpec$$serializer();
        INSTANCE = cardDetailsSectionSpec$$serializer;
        g1 g1Var = new g1("com.stripe.android.ui.core.elements.CardDetailsSectionSpec", cardDetailsSectionSpec$$serializer, 1);
        g1Var.k("apiPath", true);
        descriptor = g1Var;
        $stable = 8;
    }

    private CardDetailsSectionSpec$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{IdentifierSpec$$serializer.INSTANCE};
    }

    @Override // c30.a
    public CardDetailsSectionSpec deserialize(e decoder) {
        Object obj;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        int i11 = 1;
        if (b11.n()) {
            obj = b11.e(descriptor2, 0, IdentifierSpec$$serializer.INSTANCE, null);
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
                    obj = b11.e(descriptor2, 0, IdentifierSpec$$serializer.INSTANCE, obj);
                    i12 |= 1;
                }
            }
            i11 = i12;
        }
        b11.d(descriptor2);
        return new CardDetailsSectionSpec(i11, (IdentifierSpec) obj, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, CardDetailsSectionSpec value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CardDetailsSectionSpec.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}