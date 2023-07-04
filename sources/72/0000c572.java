package zu;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public static final u f60790a = new u();

    private u() {
    }

    private final JSONArray c(List<?> list) {
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Integer) {
                jSONArray.put(((Number) obj).intValue());
            } else if (obj instanceof Boolean) {
                jSONArray.put(((Boolean) obj).booleanValue());
            } else if (obj instanceof Long) {
                jSONArray.put(((Number) obj).longValue());
            } else if (obj instanceof Double) {
                jSONArray.put(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                jSONArray.put(obj);
            } else if (obj instanceof List) {
                jSONArray.put(f60790a.c((List) obj));
            } else if (obj instanceof Map) {
                u uVar = f60790a;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                jSONArray.put(uVar.d((Map) obj));
            } else {
                jSONArray.put(obj);
            }
        }
        return jSONArray;
    }

    public final WritableArray a(JSONArray jsonArray) {
        kotlin.jvm.internal.s.g(jsonArray, "jsonArray");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        int length = jsonArray.length();
        if (length > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                Object obj = jsonArray.get(i11);
                kotlin.jvm.internal.s.f(obj, "jsonArray.get(i)");
                if (obj instanceof JSONObject) {
                    writableNativeArray.pushMap(b((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableNativeArray.pushArray(a((JSONArray) obj));
                } else if (obj instanceof Boolean) {
                    writableNativeArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (obj instanceof Integer) {
                    writableNativeArray.pushInt(((Number) obj).intValue());
                } else if (obj instanceof Double) {
                    writableNativeArray.pushDouble(((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    writableNativeArray.pushString((String) obj);
                } else {
                    writableNativeArray.pushString(obj.toString());
                }
                if (i12 >= length) {
                    break;
                }
                i11 = i12;
            }
        }
        return writableNativeArray;
    }

    public final WritableMap b(JSONObject jsonObject) {
        kotlin.jvm.internal.s.g(jsonObject, "jsonObject");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jsonObject.get(next);
            if (obj instanceof JSONObject) {
                writableNativeMap.putMap(next, b((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeMap.putArray(next, a((JSONArray) obj));
            } else if (obj instanceof Boolean) {
                writableNativeMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableNativeMap.putInt(next, ((Number) obj).intValue());
            } else if (obj instanceof Double) {
                writableNativeMap.putDouble(next, ((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                writableNativeMap.putString(next, (String) obj);
            } else {
                writableNativeMap.putString(next, obj.toString());
            }
        }
        return writableNativeMap;
    }

    public final JSONObject d(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (value instanceof List) {
                    jSONObject.put(key, f60790a.c((List) value));
                } else if (value instanceof Map) {
                    u uVar = f60790a;
                    Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, *>");
                    jSONObject.put(key, uVar.d((Map) value));
                } else {
                    jSONObject.put(key, value);
                }
            }
        }
        return jSONObject;
    }
}