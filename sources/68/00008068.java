package kotlinx.serialization.json;

import h30.h0;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.m0;

/* loaded from: classes5.dex */
public final class h {
    public static final JsonPrimitive a(Boolean bool) {
        if (bool == null) {
            return JsonNull.f35610a;
        }
        return new n(bool, false);
    }

    public static final JsonPrimitive b(Number number) {
        if (number == null) {
            return JsonNull.f35610a;
        }
        return new n(number, false);
    }

    public static final JsonPrimitive c(String str) {
        if (str == null) {
            return JsonNull.f35610a;
        }
        return new n(str, true);
    }

    private static final Void d(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + m0.b(jsonElement.getClass()) + " is not a " + str);
    }

    public static final Boolean e(JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.s.g(jsonPrimitive, "<this>");
        return h0.d(jsonPrimitive.b());
    }

    public static final String f(JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.s.g(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.b();
    }

    public static final double g(JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.s.g(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.b());
    }

    public static final Double h(JsonPrimitive jsonPrimitive) {
        Double l11;
        kotlin.jvm.internal.s.g(jsonPrimitive, "<this>");
        l11 = kotlin.text.t.l(jsonPrimitive.b());
        return l11;
    }

    public static final float i(JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.s.g(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.b());
    }

    public static final int j(JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.s.g(jsonPrimitive, "<this>");
        return Integer.parseInt(jsonPrimitive.b());
    }

    public static final JsonObject k(JsonElement jsonElement) {
        kotlin.jvm.internal.s.g(jsonElement, "<this>");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        if (jsonObject != null) {
            return jsonObject;
        }
        d(jsonElement, "JsonObject");
        throw new KotlinNothingValueException();
    }

    public static final JsonPrimitive l(JsonElement jsonElement) {
        kotlin.jvm.internal.s.g(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        d(jsonElement, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final long m(JsonPrimitive jsonPrimitive) {
        kotlin.jvm.internal.s.g(jsonPrimitive, "<this>");
        return Long.parseLong(jsonPrimitive.b());
    }

    public static final Long n(JsonPrimitive jsonPrimitive) {
        Long p11;
        kotlin.jvm.internal.s.g(jsonPrimitive, "<this>");
        p11 = kotlin.text.u.p(jsonPrimitive.b());
        return p11;
    }
}