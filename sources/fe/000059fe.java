package com.stripe.android.ui.core.elements;

import c30.b;
import e30.f;
import expo.modules.interfaces.permissions.PermissionsResponse;
import f30.e;
import g30.b0;
import g30.w;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class Capitalization$$serializer implements b0<Capitalization> {
    public static final int $stable;
    public static final Capitalization$$serializer INSTANCE = new Capitalization$$serializer();
    public static final /* synthetic */ f descriptor;

    static {
        w wVar = new w("com.stripe.android.ui.core.elements.Capitalization", 4);
        wVar.k(PermissionsResponse.SCOPE_NONE, false);
        wVar.k("characters", false);
        wVar.k("words", false);
        wVar.k("sentences", false);
        descriptor = wVar;
        $stable = 8;
    }

    private Capitalization$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[0];
    }

    @Override // c30.a
    public Capitalization deserialize(e decoder) {
        s.g(decoder, "decoder");
        return Capitalization.values()[decoder.G(getDescriptor())];
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, Capitalization value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        encoder.x(getDescriptor(), value.ordinal());
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}