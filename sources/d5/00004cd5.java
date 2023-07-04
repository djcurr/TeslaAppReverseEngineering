package com.stripe.android.core.networking;

import com.stripe.android.core.exception.InvalidSerializationException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;
import kotlin.text.i;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import vz.v;
import wz.s0;
import wz.x;

/* loaded from: classes2.dex */
public final class JsonUtilsKt {
    public static final Map<String, ?> toMap(JsonElement jsonElement) {
        s.g(jsonElement, "<this>");
        if (jsonElement instanceof JsonObject) {
            return toMap((JsonObject) jsonElement);
        }
        String simpleName = jsonElement.getClass().getSimpleName();
        s.f(simpleName, "this::class.java.simpleName");
        throw new InvalidSerializationException(simpleName);
    }

    public static final Object toPrimitives(JsonElement jsonElement) {
        s.g(jsonElement, "<this>");
        if (s.c(jsonElement, JsonNull.f35610a)) {
            return null;
        }
        if (jsonElement instanceof JsonArray) {
            return toPrimitives((JsonArray) jsonElement);
        }
        if (jsonElement instanceof JsonObject) {
            return toMap((JsonObject) jsonElement);
        }
        if (jsonElement instanceof JsonPrimitive) {
            return new i("^\"|\"$").i(((JsonPrimitive) jsonElement).b(), "");
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Map<String, ?> toMap(JsonObject jsonObject) {
        Map<String, ?> t11;
        s.g(jsonObject, "<this>");
        ArrayList arrayList = new ArrayList(jsonObject.size());
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            arrayList.add(v.a(entry.getKey(), toPrimitives(entry.getValue())));
        }
        t11 = s0.t(arrayList);
        return t11;
    }

    public static final List<?> toPrimitives(JsonArray jsonArray) {
        int t11;
        s.g(jsonArray, "<this>");
        t11 = x.t(jsonArray, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<JsonElement> it2 = jsonArray.iterator();
        while (it2.hasNext()) {
            arrayList.add(toPrimitives(it2.next()));
        }
        return arrayList;
    }
}