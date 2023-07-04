package com.stripe.android.ui.core.address;

import c30.b;
import e30.e;
import e30.f;
import e30.i;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class FieldTypeAsStringSerializer implements b<FieldType> {
    public static final FieldTypeAsStringSerializer INSTANCE = new FieldTypeAsStringSerializer();
    private static final f descriptor = i.a("FieldType", e.i.f24566a);

    private FieldTypeAsStringSerializer() {
    }

    @Override // c30.b, c30.h, c30.a
    public f getDescriptor() {
        return descriptor;
    }

    @Override // c30.a
    public FieldType deserialize(f30.e decoder) {
        s.g(decoder, "decoder");
        return FieldType.Companion.from(decoder.B());
    }

    @Override // c30.h
    public void serialize(f30.f encoder, FieldType fieldType) {
        String serializedValue;
        s.g(encoder, "encoder");
        String str = "";
        if (fieldType != null && (serializedValue = fieldType.getSerializedValue()) != null) {
            str = serializedValue;
        }
        encoder.E(str);
    }
}