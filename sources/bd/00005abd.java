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
public final class NameSpec$$serializer implements b0<NameSpec> {
    public static final int $stable;
    public static final NameSpec$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        NameSpec$$serializer nameSpec$$serializer = new NameSpec$$serializer();
        INSTANCE = nameSpec$$serializer;
        g1 g1Var = new g1("com.stripe.android.ui.core.elements.NameSpec", nameSpec$$serializer, 2);
        g1Var.k("apiPath", true);
        g1Var.k("label_translation_id", true);
        descriptor = g1Var;
        $stable = 8;
    }

    private NameSpec$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{IdentifierSpec$$serializer.INSTANCE, TranslationId$$serializer.INSTANCE};
    }

    @Override // c30.a
    public NameSpec deserialize(e decoder) {
        Object obj;
        Object obj2;
        int i11;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.n()) {
            obj = b11.e(descriptor2, 0, IdentifierSpec$$serializer.INSTANCE, null);
            obj2 = b11.e(descriptor2, 1, TranslationId$$serializer.INSTANCE, null);
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
                    obj3 = b11.e(descriptor2, 1, TranslationId$$serializer.INSTANCE, obj3);
                    i12 |= 2;
                }
            }
            obj2 = obj3;
            i11 = i12;
        }
        b11.d(descriptor2);
        return new NameSpec(i11, (IdentifierSpec) obj, (TranslationId) obj2, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, NameSpec value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        NameSpec.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}