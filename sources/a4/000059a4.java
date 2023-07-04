package com.stripe.android.ui.core.address;

import c30.b;
import e30.f;
import f30.c;
import f30.d;
import f30.e;
import g30.b0;
import g30.g1;
import g30.i;
import g30.q1;
import g30.u1;
import g30.x;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes6.dex */
public final class FieldSchema$$serializer implements b0<FieldSchema> {
    public static final int $stable;
    public static final FieldSchema$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        FieldSchema$$serializer fieldSchema$$serializer = new FieldSchema$$serializer();
        INSTANCE = fieldSchema$$serializer;
        g1 g1Var = new g1("com.stripe.android.ui.core.address.FieldSchema", fieldSchema$$serializer, 3);
        g1Var.k("isNumeric", true);
        g1Var.k("examples", true);
        g1Var.k("nameType", false);
        descriptor = g1Var;
        $stable = 8;
    }

    private FieldSchema$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{i.f27597a, new g30.f(u1.f27647a), new x("com.stripe.android.ui.core.address.NameType", NameType.values())};
    }

    @Override // c30.a
    public FieldSchema deserialize(e decoder) {
        boolean z11;
        int i11;
        Object obj;
        Object obj2;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.n()) {
            boolean o11 = b11.o(descriptor2, 0);
            obj = b11.e(descriptor2, 1, new g30.f(u1.f27647a), null);
            obj2 = b11.e(descriptor2, 2, new x("com.stripe.android.ui.core.address.NameType", NameType.values()), null);
            z11 = o11;
            i11 = 7;
        } else {
            Object obj3 = null;
            Object obj4 = null;
            boolean z12 = false;
            int i12 = 0;
            boolean z13 = true;
            while (z13) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z13 = false;
                } else if (p11 == 0) {
                    z12 = b11.o(descriptor2, 0);
                    i12 |= 1;
                } else if (p11 == 1) {
                    obj3 = b11.e(descriptor2, 1, new g30.f(u1.f27647a), obj3);
                    i12 |= 2;
                } else if (p11 != 2) {
                    throw new UnknownFieldException(p11);
                } else {
                    obj4 = b11.e(descriptor2, 2, new x("com.stripe.android.ui.core.address.NameType", NameType.values()), obj4);
                    i12 |= 4;
                }
            }
            z11 = z12;
            i11 = i12;
            obj = obj3;
            obj2 = obj4;
        }
        b11.d(descriptor2);
        return new FieldSchema(i11, z11, (List) obj, (NameType) obj2, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, FieldSchema value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        FieldSchema.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}