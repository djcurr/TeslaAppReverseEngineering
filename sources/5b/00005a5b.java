package com.stripe.android.ui.core.elements;

import c30.b;
import e30.f;
import f30.e;
import g30.b0;
import g30.w;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class DisplayField$$serializer implements b0<DisplayField> {
    public static final int $stable;
    public static final DisplayField$$serializer INSTANCE = new DisplayField$$serializer();
    public static final /* synthetic */ f descriptor;

    static {
        w wVar = new w("com.stripe.android.ui.core.elements.DisplayField", 1);
        wVar.k("country", false);
        descriptor = wVar;
        $stable = 8;
    }

    private DisplayField$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[0];
    }

    @Override // c30.a
    public DisplayField deserialize(e decoder) {
        s.g(decoder, "decoder");
        return DisplayField.values()[decoder.G(getDescriptor())];
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, DisplayField value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        encoder.x(getDescriptor(), value.ordinal());
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}