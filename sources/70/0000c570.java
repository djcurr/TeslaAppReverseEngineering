package zu;

import android.os.Bundle;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.tesla.logging.TeslaLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class t {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f60789a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f60789a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f60789a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f60789a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f60789a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f60789a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f60789a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static Object a(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return g((JSONObject) obj);
        }
        return obj instanceof JSONArray ? f((JSONArray) obj) : obj;
    }

    public static JSONArray b(ReadableArray readableArray) {
        JSONArray jSONArray = new JSONArray();
        if (readableArray == null) {
            return null;
        }
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            switch (a.f60789a[readableArray.getType(i11).ordinal()]) {
                case 1:
                    jSONArray.put((Object) null);
                    break;
                case 2:
                    jSONArray.put(readableArray.getBoolean(i11));
                    break;
                case 3:
                    int i12 = readableArray.getInt(i11);
                    double d11 = readableArray.getDouble(i11);
                    if (i12 * 1.0d == d11) {
                        jSONArray.put(i12);
                        break;
                    } else {
                        jSONArray.put(d11);
                        break;
                    }
                case 4:
                    jSONArray.put(readableArray.getString(i11));
                    break;
                case 5:
                    jSONArray.put(c(readableArray.getMap(i11)));
                    break;
                case 6:
                    jSONArray.put(b(readableArray.getArray(i11)));
                    break;
                default:
                    d("Failed to convert array to json array", new IllegalStateException("Failed to convert array to json array"));
                    break;
            }
        }
        return jSONArray;
    }

    public static JSONObject c(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (keySetIterator.hasNextKey()) {
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                try {
                } catch (JSONException e11) {
                    d("Failed to convert map to json object", e11);
                }
                switch (a.f60789a[readableMap.getType(nextKey).ordinal()]) {
                    case 1:
                        jSONObject.put(nextKey, (Object) null);
                        continue;
                    case 2:
                        jSONObject.put(nextKey, readableMap.getBoolean(nextKey));
                        continue;
                    case 3:
                        int i11 = readableMap.getInt(nextKey);
                        double d11 = readableMap.getDouble(nextKey);
                        if (i11 * 1.0d == d11) {
                            jSONObject.put(nextKey, i11);
                        } else {
                            jSONObject.put(nextKey, d11);
                            continue;
                        }
                    case 4:
                        jSONObject.put(nextKey, readableMap.getString(nextKey));
                        continue;
                    case 5:
                        jSONObject.put(nextKey, c(readableMap.getMap(nextKey)));
                        continue;
                    case 6:
                        jSONObject.put(nextKey, b(readableMap.getArray(nextKey)));
                        continue;
                    default:
                        d("Failed to convert map to json object", new IllegalStateException("Failed to convert map to json object"));
                        continue;
                }
                d("Failed to convert map to json object", e11);
            }
            return jSONObject;
        }
        return jSONObject;
    }

    private static void d(String str, Exception exc) {
        TeslaLog.INSTANCE.d("JSONHelper", str);
    }

    public static Object e(Object obj) {
        if (obj instanceof Map) {
            JSONObject jSONObject = new JSONObject();
            Map map = (Map) obj;
            for (Object obj2 : map.keySet()) {
                jSONObject.put(obj2.toString(), e(map.get(obj2)));
            }
            return jSONObject;
        } else if (obj instanceof Iterable) {
            JSONArray jSONArray = new JSONArray();
            for (Object obj3 : (Iterable) obj) {
                jSONArray.put(obj3);
            }
            return jSONArray;
        } else if (obj instanceof Bundle) {
            JSONObject jSONObject2 = new JSONObject();
            Bundle bundle = (Bundle) obj;
            for (String str : bundle.keySet()) {
                jSONObject2.put(str, e(bundle.get(str)));
            }
            return jSONObject2;
        } else {
            return obj;
        }
    }

    public static List f(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            arrayList.add(a(jSONArray.get(i11)));
        }
        return arrayList;
    }

    public static Map<String, Object> g(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, a(jSONObject.get(next)));
        }
        return hashMap;
    }
}