package com.stripe.android.financialconnections.model;

import c30.b;
import com.stripe.android.financialconnections.model.OwnershipRefresh;
import e30.f;
import f30.e;
import g30.b0;
import g30.u1;
import g30.w;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class OwnershipRefresh$Status$$serializer implements b0<OwnershipRefresh.Status> {
    public static final OwnershipRefresh$Status$$serializer INSTANCE = new OwnershipRefresh$Status$$serializer();
    public static final /* synthetic */ f descriptor;

    static {
        w wVar = new w("com.stripe.android.financialconnections.model.OwnershipRefresh.Status", 4);
        wVar.k("failed", false);
        wVar.k("pending", false);
        wVar.k("succeeded", false);
        wVar.k("UNKNOWN", false);
        descriptor = wVar;
    }

    private OwnershipRefresh$Status$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{u1.f27647a};
    }

    @Override // c30.a
    public OwnershipRefresh.Status deserialize(e decoder) {
        s.g(decoder, "decoder");
        return OwnershipRefresh.Status.values()[decoder.G(getDescriptor())];
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, OwnershipRefresh.Status value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        encoder.x(getDescriptor(), value.ordinal());
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}