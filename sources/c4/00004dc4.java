package com.stripe.android.financialconnections.model;

import c30.b;
import com.stripe.android.financialconnections.model.FinancialConnectionsAccount;
import e30.f;
import f30.e;
import g30.b0;
import g30.u1;
import g30.w;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class FinancialConnectionsAccount$Subcategory$$serializer implements b0<FinancialConnectionsAccount.Subcategory> {
    public static final FinancialConnectionsAccount$Subcategory$$serializer INSTANCE = new FinancialConnectionsAccount$Subcategory$$serializer();
    public static final /* synthetic */ f descriptor;

    static {
        w wVar = new w("com.stripe.android.financialconnections.model.FinancialConnectionsAccount.Subcategory", 7);
        wVar.k("checking", false);
        wVar.k("credit_card", false);
        wVar.k("line_of_credit", false);
        wVar.k("mortgage", false);
        wVar.k("other", false);
        wVar.k("savings", false);
        wVar.k("UNKNOWN", false);
        descriptor = wVar;
    }

    private FinancialConnectionsAccount$Subcategory$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{u1.f27647a};
    }

    @Override // c30.a
    public FinancialConnectionsAccount.Subcategory deserialize(e decoder) {
        s.g(decoder, "decoder");
        return FinancialConnectionsAccount.Subcategory.values()[decoder.G(getDescriptor())];
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, FinancialConnectionsAccount.Subcategory value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        encoder.x(getDescriptor(), value.ordinal());
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}