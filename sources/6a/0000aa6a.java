package p7;

import java.util.List;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b {
    public static final Boolean a(JSONObject jSONObject, String key) {
        s.g(jSONObject, "<this>");
        s.g(key, "key");
        if (jSONObject.has(key)) {
            return Boolean.valueOf(jSONObject.getBoolean(key));
        }
        return null;
    }

    public static final String b(JSONObject jSONObject, String key) {
        s.g(jSONObject, "<this>");
        s.g(key, "key");
        if (jSONObject.has(key)) {
            return jSONObject.getString(key);
        }
        return null;
    }

    public static final List<String> c(JSONObject jSONObject, String key) {
        s.g(jSONObject, "<this>");
        s.g(key, "key");
        return a.a(jSONObject.optJSONArray(key));
    }

    public static final String d(JSONArray jSONArray) {
        s.g(jSONArray, "<this>");
        try {
            String jSONArray2 = jSONArray.toString(4);
            s.f(jSONArray2, "{\n        toString(INDENTATION_SPACES)\n    }");
            return jSONArray2;
        } catch (JSONException unused) {
            return "PARSING_ERROR";
        }
    }

    public static final String e(JSONObject jSONObject) {
        s.g(jSONObject, "<this>");
        try {
            String jSONObject2 = jSONObject.toString(4);
            s.f(jSONObject2, "{\n        toString(INDENTATION_SPACES)\n    }");
            return jSONObject2;
        } catch (JSONException unused) {
            return "PARSING_ERROR";
        }
    }
}