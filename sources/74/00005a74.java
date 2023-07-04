package com.stripe.android.ui.core.elements;

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

/* loaded from: classes6.dex */
public final class DropdownItemSpec$$serializer implements b0<DropdownItemSpec> {
    public static final int $stable;
    public static final DropdownItemSpec$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        DropdownItemSpec$$serializer dropdownItemSpec$$serializer = new DropdownItemSpec$$serializer();
        INSTANCE = dropdownItemSpec$$serializer;
        g1 g1Var = new g1("com.stripe.android.ui.core.elements.DropdownItemSpec", dropdownItemSpec$$serializer, 2);
        g1Var.k("api_value", true);
        g1Var.k("display_text", true);
        descriptor = g1Var;
        $stable = 8;
    }

    private DropdownItemSpec$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        u1 u1Var = u1.f27647a;
        return new b[]{a.o(u1Var), u1Var};
    }

    @Override // c30.a
    public DropdownItemSpec deserialize(e decoder) {
        Object obj;
        String str;
        int i11;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.n()) {
            obj = b11.A(descriptor2, 0, u1.f27647a, null);
            str = b11.i(descriptor2, 1);
            i11 = 3;
        } else {
            obj = null;
            String str2 = null;
            int i12 = 0;
            boolean z11 = true;
            while (z11) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z11 = false;
                } else if (p11 == 0) {
                    obj = b11.A(descriptor2, 0, u1.f27647a, obj);
                    i12 |= 1;
                } else if (p11 != 1) {
                    throw new UnknownFieldException(p11);
                } else {
                    str2 = b11.i(descriptor2, 1);
                    i12 |= 2;
                }
            }
            str = str2;
            i11 = i12;
        }
        b11.d(descriptor2);
        return new DropdownItemSpec(i11, (String) obj, str, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, DropdownItemSpec value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        DropdownItemSpec.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}