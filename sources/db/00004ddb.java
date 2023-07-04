package com.stripe.android.financialconnections.model;

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

/* loaded from: classes2.dex */
public final class FinancialConnectionsSessionManifest$$serializer implements b0<FinancialConnectionsSessionManifest> {
    public static final FinancialConnectionsSessionManifest$$serializer INSTANCE;
    public static final /* synthetic */ f descriptor;

    static {
        FinancialConnectionsSessionManifest$$serializer financialConnectionsSessionManifest$$serializer = new FinancialConnectionsSessionManifest$$serializer();
        INSTANCE = financialConnectionsSessionManifest$$serializer;
        g1 g1Var = new g1("com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest", financialConnectionsSessionManifest$$serializer, 3);
        g1Var.k("hosted_auth_url", false);
        g1Var.k("success_url", false);
        g1Var.k("cancel_url", false);
        descriptor = g1Var;
    }

    private FinancialConnectionsSessionManifest$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        u1 u1Var = u1.f27647a;
        return new b[]{u1Var, u1Var, u1Var};
    }

    @Override // c30.a
    public FinancialConnectionsSessionManifest deserialize(e decoder) {
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
        return new FinancialConnectionsSessionManifest(i11, str, str3, str2, null);
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, FinancialConnectionsSessionManifest value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        f descriptor2 = getDescriptor();
        d b11 = encoder.b(descriptor2);
        FinancialConnectionsSessionManifest.write$Self(value, b11, descriptor2);
        b11.d(descriptor2);
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}