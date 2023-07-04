package com.stripe.android.ui.core.elements;

import c30.b;
import com.stripe.android.model.PaymentMethod;
import e30.f;
import f30.e;
import g30.b0;
import g30.w;
import kotlin.jvm.internal.s;
import kotlinx.serialization.KSerializer;
import org.spongycastle.i18n.TextBundle;

/* loaded from: classes6.dex */
public final class KeyboardType$$serializer implements b0<KeyboardType> {
    public static final int $stable;
    public static final KeyboardType$$serializer INSTANCE = new KeyboardType$$serializer();
    public static final /* synthetic */ f descriptor;

    static {
        w wVar = new w("com.stripe.android.ui.core.elements.KeyboardType", 8);
        wVar.k(TextBundle.TEXT_ENTRY, false);
        wVar.k("ascii", false);
        wVar.k("number", false);
        wVar.k(PaymentMethod.BillingDetails.PARAM_PHONE, false);
        wVar.k("uri", false);
        wVar.k("email", false);
        wVar.k("password", false);
        wVar.k("number_password", false);
        descriptor = wVar;
        $stable = 8;
    }

    private KeyboardType$$serializer() {
    }

    @Override // g30.b0
    public KSerializer<?>[] childSerializers() {
        return new b[0];
    }

    @Override // c30.a
    public KeyboardType deserialize(e decoder) {
        s.g(decoder, "decoder");
        return KeyboardType.values()[decoder.G(getDescriptor())];
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.h
    public void serialize(f30.f encoder, KeyboardType value) {
        s.g(encoder, "encoder");
        s.g(value, "value");
        encoder.x(getDescriptor(), value.ordinal());
    }

    @Override // g30.b0
    public KSerializer<?>[] typeParametersSerializers() {
        return b0.a.a(this);
    }
}