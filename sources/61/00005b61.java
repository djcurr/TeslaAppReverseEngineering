package com.stripe.android.ui.core.elements;

import c30.b;
import e30.f;
import f30.c;
import f30.d;
import f30.e;
import g30.b0;
import g30.g1;
import g30.i;
import g30.k0;
import g30.q1;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes6.dex */
public final class SimpleTextSpec$$serializer implements b0<SimpleTextSpec> {
    public static final int $stable;
    public static final SimpleTextSpec$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        SimpleTextSpec$$serializer simpleTextSpec$$serializer = new SimpleTextSpec$$serializer();
        INSTANCE = simpleTextSpec$$serializer;
        g1 g1Var = new g1("com.stripe.android.ui.core.elements.SimpleTextSpec", simpleTextSpec$$serializer, 5);
        g1Var.k("apiPath", false);
        g1Var.k("label", false);
        g1Var.k("capitalization", true);
        g1Var.k("keyboard_type", true);
        g1Var.k("show_optional_label", true);
        descriptor = g1Var;
        $stable = 8;
    }

    private SimpleTextSpec$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{IdentifierSpec$$serializer.INSTANCE, k0.f27606a, Capitalization$$serializer.INSTANCE, KeyboardType$$serializer.INSTANCE, i.f27597a};
    }

    @Override // c30.a
    public SimpleTextSpec deserialize(e decoder) {
        boolean z11;
        Object obj;
        Object obj2;
        Object obj3;
        int i11;
        int i12;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        Object obj4 = null;
        if (b11.n()) {
            obj2 = b11.e(descriptor2, 0, IdentifierSpec$$serializer.INSTANCE, null);
            i12 = b11.C(descriptor2, 1);
            obj = b11.e(descriptor2, 2, Capitalization$$serializer.INSTANCE, null);
            obj3 = b11.e(descriptor2, 3, KeyboardType$$serializer.INSTANCE, null);
            i11 = 31;
            z11 = b11.o(descriptor2, 4);
        } else {
            Object obj5 = null;
            Object obj6 = null;
            boolean z12 = true;
            z11 = false;
            int i13 = 0;
            int i14 = 0;
            while (z12) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z12 = false;
                } else if (p11 == 0) {
                    obj4 = b11.e(descriptor2, 0, IdentifierSpec$$serializer.INSTANCE, obj4);
                    i13 |= 1;
                } else if (p11 == 1) {
                    i14 = b11.C(descriptor2, 1);
                    i13 |= 2;
                } else if (p11 == 2) {
                    obj5 = b11.e(descriptor2, 2, Capitalization$$serializer.INSTANCE, obj5);
                    i13 |= 4;
                } else if (p11 == 3) {
                    obj6 = b11.e(descriptor2, 3, KeyboardType$$serializer.INSTANCE, obj6);
                    i13 |= 8;
                } else if (p11 != 4) {
                    throw new UnknownFieldException(p11);
                } else {
                    z11 = b11.o(descriptor2, 4);
                    i13 |= 16;
                }
            }
            obj = obj5;
            obj2 = obj4;
            obj3 = obj6;
            i11 = i13;
            i12 = i14;
        }
        b11.d(descriptor2);
        return new SimpleTextSpec(i11, (IdentifierSpec) obj2, i12, (Capitalization) obj, (KeyboardType) obj3, z11, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, SimpleTextSpec value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        SimpleTextSpec.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}