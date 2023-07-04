package com.stripe.android.financialconnections.model;

import c30.b;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import com.tesla.TeslaV4.BuildConfig;
import e30.f;
import f30.e;
import g30.b0;
import g30.u1;
import g30.w;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class FinancialConnectionsAccount$Permissions$$serializer implements b0<FinancialConnectionsAccount.Permissions> {
    public static final FinancialConnectionsAccount$Permissions$$serializer INSTANCE = new FinancialConnectionsAccount$Permissions$$serializer();
    public static final /* synthetic */ f descriptor;

    static {
        w wVar = new w("com.stripe.android.financialconnections.model.FinancialConnectionsAccount.Permissions", 5);
        wVar.k("balances", false);
        wVar.k(BuildConfig.AUTH_OPENID_CLIENT_ID, false);
        wVar.k("payment_method", false);
        wVar.k("transactions", false);
        wVar.k("UNKNOWN", false);
        descriptor = wVar;
    }

    private FinancialConnectionsAccount$Permissions$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{u1.f27647a};
    }

    @Override // c30.a
    public FinancialConnectionsAccount.Permissions deserialize(e decoder) {
        s.g(decoder, "decoder");
        return FinancialConnectionsAccount.Permissions.values()[decoder.G(getDescriptor())];
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, FinancialConnectionsAccount.Permissions value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        encoder.x(getDescriptor(), value.ordinal());
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}