package com.stripe.android.financialconnections.model;

import c30.b;
import com.stripe.android.financialconnections.model.BalanceRefresh;
import d30.a;
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
public final class BalanceRefresh$$serializer implements b0<BalanceRefresh> {
    public static final BalanceRefresh$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        BalanceRefresh$$serializer balanceRefresh$$serializer = new BalanceRefresh$$serializer();
        INSTANCE = balanceRefresh$$serializer;
        g1 g1Var = new g1("com.stripe.android.financialconnections.model.BalanceRefresh", balanceRefresh$$serializer, 2);
        g1Var.k(PermissionsResponse.STATUS_KEY, true);
        g1Var.k("last_attempted_at", false);
        descriptor = g1Var;
    }

    private BalanceRefresh$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{a.o(BalanceRefresh$BalanceRefreshStatus$$serializer.INSTANCE), k0.f27606a};
    }

    @Override // c30.a
    public BalanceRefresh deserialize(e decoder) {
        Object obj;
        int i11;
        int i12;
        s.g(decoder, "decoder");
        f descriptor2 = getDescriptor();
        c b11 = decoder.b(descriptor2);
        if (b11.n()) {
            obj = b11.A(descriptor2, 0, BalanceRefresh$BalanceRefreshStatus$$serializer.INSTANCE, null);
            i11 = b11.C(descriptor2, 1);
            i12 = 3;
        } else {
            obj = null;
            int i13 = 0;
            int i14 = 0;
            boolean z11 = true;
            while (z11) {
                int p11 = b11.p(descriptor2);
                if (p11 == -1) {
                    z11 = false;
                } else if (p11 == 0) {
                    obj = b11.A(descriptor2, 0, BalanceRefresh$BalanceRefreshStatus$$serializer.INSTANCE, obj);
                    i14 |= 1;
                } else if (p11 != 1) {
                    throw new UnknownFieldException(p11);
                } else {
                    i13 = b11.C(descriptor2, 1);
                    i14 |= 2;
                }
            }
            i11 = i13;
            i12 = i14;
        }
        b11.d(descriptor2);
        return new BalanceRefresh(i12, (BalanceRefresh.BalanceRefreshStatus) obj, i11, (q1) null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, BalanceRefresh value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        BalanceRefresh.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}