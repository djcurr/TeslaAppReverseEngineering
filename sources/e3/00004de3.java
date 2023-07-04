package com.stripe.android.financialconnections.model;

import c30.b;
import com.stripe.android.financialconnections.model.OwnershipRefresh;
import e30.f;
import expo.modules.interfaces.permissions.PermissionsResponse;
import f30.c;
import f30.d;
import f30.e;
import g30.b0;
import g30.g1;
import g30.k0;
import g30.q1;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final class OwnershipRefresh$$serializer implements b0<OwnershipRefresh> {
    public static final OwnershipRefresh$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        OwnershipRefresh$$serializer ownershipRefresh$$serializer = new OwnershipRefresh$$serializer();
        INSTANCE = ownershipRefresh$$serializer;
        g1 g1Var = new g1("com.stripe.android.financialconnections.model.OwnershipRefresh", ownershipRefresh$$serializer, 2);
        g1Var.k("last_attempted_at", false);
        g1Var.k(PermissionsResponse.STATUS_KEY, true);
        descriptor = g1Var;
    }

    private OwnershipRefresh$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{k0.f27606a, OwnershipRefresh$Status$$serializer.INSTANCE};
    }

    @Override // c30.a
    public OwnershipRefresh deserialize(e decoder) {
        int i11;
        Object obj;
        int i12;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.n()) {
            i11 = b11.C(descriptor2, 0);
            obj = b11.e(descriptor2, 1, OwnershipRefresh$Status$$serializer.INSTANCE, null);
            i12 = 3;
        } else {
            Object obj2 = null;
            i11 = 0;
            int i13 = 0;
            boolean z11 = true;
            while (z11) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z11 = false;
                } else if (p11 == 0) {
                    i11 = b11.C(descriptor2, 0);
                    i13 |= 1;
                } else if (p11 != 1) {
                    throw new UnknownFieldException(p11);
                } else {
                    obj2 = b11.e(descriptor2, 1, OwnershipRefresh$Status$$serializer.INSTANCE, obj2);
                    i13 |= 2;
                }
            }
            obj = obj2;
            i12 = i13;
        }
        b11.d(descriptor2);
        return new OwnershipRefresh(i12, i11, (OwnershipRefresh.Status) obj, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, OwnershipRefresh value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        OwnershipRefresh.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}