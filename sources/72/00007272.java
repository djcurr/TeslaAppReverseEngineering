package h30;

import ch.qos.logback.core.CoreConstants;
import e30.j;
import g30.l0;
import java.lang.annotation.Annotation;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.m0;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public final class b0 {
    public static final /* synthetic */ void a(c30.h hVar, c30.h hVar2, String str) {
        f(hVar, hVar2, str);
    }

    public static final void b(e30.j kind) {
        kotlin.jvm.internal.s.g(kind, "kind");
        if (!(kind instanceof j.b)) {
            if (!(kind instanceof e30.e)) {
                if (kind instanceof e30.d) {
                    throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
                }
                return;
            }
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
    }

    public static final String c(e30.f fVar, kotlinx.serialization.json.a json) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(json, "json");
        for (Annotation annotation : fVar.getAnnotations()) {
            if (annotation instanceof kotlinx.serialization.json.d) {
                return ((kotlinx.serialization.json.d) annotation).discriminator();
            }
        }
        return json.e().c();
    }

    public static final <T> T d(kotlinx.serialization.json.g gVar, c30.a<T> deserializer) {
        JsonPrimitive l11;
        kotlin.jvm.internal.s.g(gVar, "<this>");
        kotlin.jvm.internal.s.g(deserializer, "deserializer");
        if ((deserializer instanceof g30.b) && !gVar.c().e().k()) {
            JsonElement f11 = gVar.f();
            e30.f descriptor = deserializer.getDescriptor();
            if (f11 instanceof JsonObject) {
                JsonObject jsonObject = (JsonObject) f11;
                String c11 = c(deserializer.getDescriptor(), gVar.c());
                JsonElement jsonElement = (JsonElement) jsonObject.get(c11);
                String b11 = (jsonElement == null || (l11 = kotlinx.serialization.json.h.l(jsonElement)) == null) ? null : l11.b();
                c30.a<? extends T> c12 = ((g30.b) deserializer).c(gVar, b11);
                if (c12 != null) {
                    return (T) i0.b(gVar.c(), c11, jsonObject, c12);
                }
                e(b11, jsonObject);
                throw new KotlinNothingValueException();
            }
            throw o.e(-1, "Expected " + m0.b(JsonObject.class) + " as the serialized body of " + descriptor.h() + ", but had " + m0.b(f11.getClass()));
        }
        return deserializer.mo133deserialize(gVar);
    }

    private static final Void e(String str, JsonObject jsonObject) {
        String str2;
        if (str == null) {
            str2 = "missing class discriminator ('null')";
        } else {
            str2 = "class discriminator '" + str + CoreConstants.SINGLE_QUOTE_CHAR;
        }
        throw o.f(-1, "Polymorphic serializer was not found for " + str2, jsonObject.toString());
    }

    public static final void f(c30.h<?> hVar, c30.h<Object> hVar2, String str) {
        if ((hVar instanceof c30.f) && l0.a(hVar2.getDescriptor()).contains(str)) {
            String h11 = hVar.getDescriptor().h();
            String h12 = hVar2.getDescriptor().h();
            throw new IllegalStateException(("Sealed class '" + h12 + "' cannot be serialized as base class '" + h11 + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}