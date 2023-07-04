package com.stripe.android.financialconnections.model.serializer;

import d30.a;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.h;
import kotlinx.serialization.json.u;

/* loaded from: classes2.dex */
public final class JsonAsStringSerializer extends u<String> {
    public static final JsonAsStringSerializer INSTANCE = new JsonAsStringSerializer();

    private JsonAsStringSerializer() {
        super(a.x(q0.f34921a));
    }

    @Override // kotlinx.serialization.json.u
    protected JsonElement transformDeserialize(JsonElement element) {
        s.g(element, "element");
        return h.c(element.toString());
    }
}