package com.stripe.android.ui.core.address;

import c30.b;
import d30.a;
import e30.f;
import f30.c;
import f30.d;
import f30.e;
import g30.b0;
import g30.g1;
import g30.i;
import g30.q1;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes6.dex */
public final class CountryAddressSchema$$serializer implements b0<CountryAddressSchema> {
    public static final int $stable;
    public static final CountryAddressSchema$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        CountryAddressSchema$$serializer countryAddressSchema$$serializer = new CountryAddressSchema$$serializer();
        INSTANCE = countryAddressSchema$$serializer;
        g1 g1Var = new g1("com.stripe.android.ui.core.address.CountryAddressSchema", countryAddressSchema$$serializer, 3);
        g1Var.k("type", false);
        g1Var.k("required", false);
        g1Var.k("schema", true);
        descriptor = g1Var;
        $stable = 8;
    }

    private CountryAddressSchema$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{a.o(FieldTypeAsStringSerializer.INSTANCE), i.f27597a, a.o(FieldSchema$$serializer.INSTANCE)};
    }

    @Override // c30.a
    public CountryAddressSchema deserialize(e decoder) {
        int i11;
        boolean z11;
        Object obj;
        Object obj2;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        Object obj3 = null;
        if (b11.n()) {
            obj2 = b11.A(descriptor2, 0, FieldTypeAsStringSerializer.INSTANCE, null);
            boolean o11 = b11.o(descriptor2, 1);
            obj = b11.A(descriptor2, 2, FieldSchema$$serializer.INSTANCE, null);
            z11 = o11;
            i11 = 7;
        } else {
            Object obj4 = null;
            int i12 = 0;
            boolean z12 = false;
            boolean z13 = true;
            while (z13) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z13 = false;
                } else if (p11 == 0) {
                    obj3 = b11.A(descriptor2, 0, FieldTypeAsStringSerializer.INSTANCE, obj3);
                    i12 |= 1;
                } else if (p11 == 1) {
                    z12 = b11.o(descriptor2, 1);
                    i12 |= 2;
                } else if (p11 != 2) {
                    throw new UnknownFieldException(p11);
                } else {
                    obj4 = b11.A(descriptor2, 2, FieldSchema$$serializer.INSTANCE, obj4);
                    i12 |= 4;
                }
            }
            i11 = i12;
            z11 = z12;
            Object obj5 = obj3;
            obj = obj4;
            obj2 = obj5;
        }
        b11.d(descriptor2);
        return new CountryAddressSchema(i11, (FieldType) obj2, z11, (FieldSchema) obj, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, CountryAddressSchema value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        CountryAddressSchema.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}