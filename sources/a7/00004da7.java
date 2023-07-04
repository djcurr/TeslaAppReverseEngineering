package com.stripe.android.financialconnections.model;

import c30.b;
import com.stripe.android.financialconnections.model.Balance;
import e30.f;
import f30.e;
import g30.b0;
import g30.u1;
import g30.w;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class Balance$Type$$serializer implements b0<Balance.Type> {
    public static final Balance$Type$$serializer INSTANCE = new Balance$Type$$serializer();
    public static final /* synthetic */ f descriptor;

    static {
        w wVar = new w("com.stripe.android.financialconnections.model.Balance.Type", 3);
        wVar.k("cash", false);
        wVar.k("credit", false);
        wVar.k("UNKNOWN", false);
        descriptor = wVar;
    }

    private Balance$Type$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{u1.f27647a};
    }

    @Override // c30.a
    public Balance.Type deserialize(e decoder) {
        s.g(decoder, "decoder");
        return Balance.Type.values()[decoder.G(getDescriptor())];
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, Balance.Type value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        encoder.x(getDescriptor(), value.ordinal());
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}