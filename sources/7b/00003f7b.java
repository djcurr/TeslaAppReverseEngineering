package com.plaid;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u000e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b"}, d2 = {"Lorg/json/JSONObject;", "jsonObject", "Lcom/facebook/react/bridge/WritableMap;", "convertJsonToMap", "Lorg/json/JSONArray;", "jsonArray", "Lcom/facebook/react/bridge/WritableArray;", "convertJsonToArray", "react-native-plaid-link-sdk_release"}, k = 2, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class GlobalFunctionsKt {
    public static final WritableArray convertJsonToArray(JSONArray jsonArray) {
        s.g(jsonArray, "jsonArray");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        int length = jsonArray.length();
        if (length > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                Object obj = jsonArray.get(i11);
                if (obj instanceof JSONObject) {
                    writableNativeArray.pushMap(convertJsonToMap((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableNativeArray.pushArray(convertJsonToArray((JSONArray) obj));
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

    public static final WritableMap convertJsonToMap(JSONObject jsonObject) {
        s.g(jsonObject, "jsonObject");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jsonObject.get(next);
            if (obj instanceof JSONObject) {
                writableNativeMap.putMap(next, convertJsonToMap((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableNativeMap.putArray(next, convertJsonToArray((JSONArray) obj));
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
}