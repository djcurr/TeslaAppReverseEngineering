package com.stripe.android.ui.core.address;

import c30.b;
import ch.qos.logback.core.joran.action.Action;
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
public final class StateSchema$$serializer implements b0<StateSchema> {
    public static final int $stable;
    public static final StateSchema$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        StateSchema$$serializer stateSchema$$serializer = new StateSchema$$serializer();
        INSTANCE = stateSchema$$serializer;
        g1 g1Var = new g1("com.stripe.android.ui.core.address.StateSchema", stateSchema$$serializer, 3);
        g1Var.k("isoID", false);
        g1Var.k(Action.KEY_ATTRIBUTE, false);
        g1Var.k("name", false);
        descriptor = g1Var;
        $stable = 8;
    }

    private StateSchema$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        u1 u1Var = u1.f27647a;
        return new b[]{u1Var, u1Var, u1Var};
    }

    @Override // c30.a
    public StateSchema deserialize(e decoder) {
        String str;
        String str2;
        String str3;
        int i11;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.n()) {
            String i12 = b11.i(descriptor2, 0);
            String i13 = b11.i(descriptor2, 1);
            str = i12;
            str2 = b11.i(descriptor2, 2);
            str3 = i13;
            i11 = 7;
        } else {
            String str4 = null;
            String str5 = null;
            String str6 = null;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z11 = false;
                } else if (p11 == 0) {
                    str4 = b11.i(descriptor2, 0);
                    i14 |= 1;
                } else if (p11 == 1) {
                    str6 = b11.i(descriptor2, 1);
                    i14 |= 2;
                } else if (p11 != 2) {
                    throw new UnknownFieldException(p11);
                } else {
                    str5 = b11.i(descriptor2, 2);
                    i14 |= 4;
                }
            }
            str = str4;
            str2 = str5;
            str3 = str6;
            i11 = i14;
        }
        b11.d(descriptor2);
        return new StateSchema(i11, str, str3, str2, null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, StateSchema value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        StateSchema.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}