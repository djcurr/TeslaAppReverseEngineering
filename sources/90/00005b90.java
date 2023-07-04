package com.stripe.android.ui.core.elements;

import c30.b;
import e30.f;
import f30.e;
import g30.b0;
import g30.k0;
import g30.w;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class TranslationId$$serializer implements b0<TranslationId> {
    public static final int $stable;
    public static final TranslationId$$serializer INSTANCE = new TranslationId$$serializer();
    public static final /* synthetic */ f descriptor;

    static {
        w wVar = new w("com.stripe.android.ui.core.elements.TranslationId", 5);
        wVar.k("upe.labels.ideal.bank", false);
        wVar.k("upe.labels.p24.bank", false);
        wVar.k("upe.labels.eps.bank", false);
        wVar.k("address.label.name", false);
        wVar.k("upe.labels.name.onAccount", false);
        descriptor = wVar;
        $stable = 8;
    }

    private TranslationId$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[]{k0.f27606a};
    }

    @Override // c30.a
    public TranslationId deserialize(e decoder) {
        s.g(decoder, "decoder");
        return TranslationId.values()[decoder.G(getDescriptor())];
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, TranslationId value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        encoder.x(getDescriptor(), value.ordinal());
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}