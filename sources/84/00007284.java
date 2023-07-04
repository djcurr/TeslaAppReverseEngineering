package h30;

import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public final class i0 {
    public static final <T> T a(kotlinx.serialization.json.a aVar, JsonElement element, c30.a<T> deserializer) {
        f30.e rVar;
        kotlin.jvm.internal.s.g(aVar, "<this>");
        kotlin.jvm.internal.s.g(element, "element");
        kotlin.jvm.internal.s.g(deserializer, "deserializer");
        if (element instanceof JsonObject) {
            rVar = new u(aVar, (JsonObject) element, null, null, 12, null);
        } else if (element instanceof JsonArray) {
            rVar = new w(aVar, (JsonArray) element);
        } else {
            if (!(element instanceof kotlinx.serialization.json.n ? true : kotlin.jvm.internal.s.c(element, JsonNull.f35610a))) {
                throw new NoWhenBranchMatchedException();
            }
            rVar = new r(aVar, (JsonPrimitive) element);
        }
        return (T) rVar.m(deserializer);
    }

    public static final <T> T b(kotlinx.serialization.json.a aVar, String discriminator, JsonObject element, c30.a<T> deserializer) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        kotlin.jvm.internal.s.g(discriminator, "discriminator");
        kotlin.jvm.internal.s.g(element, "element");
        kotlin.jvm.internal.s.g(deserializer, "deserializer");
        return (T) new u(aVar, element, discriminator, deserializer.getDescriptor()).m(deserializer);
    }
}