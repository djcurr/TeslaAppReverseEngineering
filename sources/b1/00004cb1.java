package com.stripe.android.core.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import m00.i;
import m00.l;
import org.json.JSONArray;
import org.json.JSONObject;
import vz.v;
import wz.n0;
import wz.r0;
import wz.s0;
import wz.x;

/* loaded from: classes2.dex */
public final class StripeJsonUtils {
    public static final StripeJsonUtils INSTANCE = new StripeJsonUtils();
    private static final String NULL = "null";

    private StripeJsonUtils() {
    }

    private final JSONArray listToJsonArray(List<?> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object obj : list) {
            if (obj instanceof Map) {
                obj = INSTANCE.mapToJsonObject((Map) obj);
            } else if (obj instanceof List) {
                obj = INSTANCE.listToJsonArray((List) obj);
            } else if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                obj = String.valueOf(obj);
            }
            jSONArray.put(obj);
        }
        return jSONArray;
    }

    public static final String optCurrency(JSONObject jsonObject, String fieldName) {
        s.g(jsonObject, "jsonObject");
        s.g(fieldName, "fieldName");
        String nullIfNullOrEmpty = INSTANCE.nullIfNullOrEmpty(jsonObject.optString(fieldName));
        if (nullIfNullOrEmpty != null) {
            if (nullIfNullOrEmpty.length() == 3) {
                return nullIfNullOrEmpty;
            }
        }
        return null;
    }

    public static final String optString(JSONObject jSONObject, String fieldName) {
        s.g(fieldName, "fieldName");
        return INSTANCE.nullIfNullOrEmpty(jSONObject == null ? null : jSONObject.optString(fieldName));
    }

    public final /* synthetic */ List jsonArrayToList(JSONArray jSONArray) {
        i r11;
        int t11;
        if (jSONArray == null) {
            return null;
        }
        r11 = l.r(0, jSONArray.length());
        t11 = x.t(r11, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            arrayList.add(jSONArray.get(((n0) it2).a()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (obj instanceof JSONArray) {
                obj = INSTANCE.jsonArrayToList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = INSTANCE.jsonObjectToMap((JSONObject) obj);
            } else if (s.c(obj, "null")) {
                obj = null;
            }
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public final /* synthetic */ Map jsonObjectToMap(JSONObject jSONObject) {
        i r11;
        int t11;
        Map i11;
        Map f11;
        if (jSONObject == null) {
            return null;
        }
        JSONArray names = jSONObject.names();
        if (names == null) {
            names = new JSONArray();
        }
        r11 = l.r(0, names.length());
        t11 = x.t(r11, 10);
        ArrayList<String> arrayList = new ArrayList(t11);
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            arrayList.add(names.getString(((n0) it2).a()));
        }
        ArrayList<Map> arrayList2 = new ArrayList();
        for (String str : arrayList) {
            Object opt = jSONObject.opt(str);
            if (opt == null || s.c(opt, "null")) {
                f11 = null;
            } else {
                if (opt instanceof JSONObject) {
                    opt = INSTANCE.jsonObjectToMap((JSONObject) opt);
                } else if (opt instanceof JSONArray) {
                    opt = INSTANCE.jsonArrayToList((JSONArray) opt);
                }
                f11 = r0.f(v.a(str, opt));
            }
            if (f11 != null) {
                arrayList2.add(f11);
            }
        }
        i11 = s0.i();
        for (Map map : arrayList2) {
            i11 = s0.p(i11, map);
        }
        return i11;
    }

    public final /* synthetic */ Map jsonObjectToStringMap(JSONObject jSONObject) {
        i r11;
        int t11;
        Map i11;
        if (jSONObject == null) {
            return null;
        }
        JSONArray names = jSONObject.names();
        if (names == null) {
            names = new JSONArray();
        }
        r11 = l.r(0, names.length());
        t11 = x.t(r11, 10);
        ArrayList<String> arrayList = new ArrayList(t11);
        Iterator<Integer> it2 = r11.iterator();
        while (it2.hasNext()) {
            arrayList.add(names.getString(((n0) it2).a()));
        }
        ArrayList<Map> arrayList2 = new ArrayList();
        for (String str : arrayList) {
            Object opt = jSONObject.opt(str);
            Map f11 = (opt == null || s.c(opt, "null")) ? null : r0.f(v.a(str, opt.toString()));
            if (f11 != null) {
                arrayList2.add(f11);
            }
        }
        i11 = s0.i();
        for (Map map : arrayList2) {
            i11 = s0.p(i11, map);
        }
        return i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject mapToJsonObject(java.util.Map<java.lang.String, ?> r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L4
            r6 = 0
            return r6
        L4:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r6.get(r2)
            if (r3 != 0) goto L24
            goto L11
        L24:
            boolean r4 = r3 instanceof java.util.Map     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L32
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L11
            org.json.JSONObject r3 = r5.mapToJsonObject(r3)     // Catch: java.lang.Throwable -> L11
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L11
            goto L11
        L32:
            boolean r4 = r3 instanceof java.util.List     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L40
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L11
            org.json.JSONArray r3 = r5.listToJsonArray(r3)     // Catch: java.lang.Throwable -> L11
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L11
            goto L11
        L40:
            boolean r4 = r3 instanceof java.lang.Number     // Catch: java.lang.Throwable -> L11
            if (r4 != 0) goto L51
            boolean r4 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> L11
            if (r4 == 0) goto L49
            goto L51
        L49:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L11
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L11
            goto L11
        L51:
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L11
            goto L11
        L55:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.model.StripeJsonUtils.mapToJsonObject(java.util.Map):org.json.JSONObject");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
        if ((r5.length() == 0) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ java.lang.String nullIfNullOrEmpty(java.lang.String r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            goto L1f
        L4:
            java.lang.String r1 = "null"
            boolean r1 = kotlin.jvm.internal.s.c(r1, r5)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L19
            int r1 = r5.length()
            if (r1 != 0) goto L16
            r1 = r3
            goto L17
        L16:
            r1 = r2
        L17:
            if (r1 == 0) goto L1a
        L19:
            r2 = r3
        L1a:
            if (r2 != 0) goto L1d
            goto L1e
        L1d:
            r5 = r0
        L1e:
            r0 = r5
        L1f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.core.model.StripeJsonUtils.nullIfNullOrEmpty(java.lang.String):java.lang.String");
    }

    public final /* synthetic */ boolean optBoolean(JSONObject jsonObject, String fieldName) {
        s.g(jsonObject, "jsonObject");
        s.g(fieldName, "fieldName");
        return jsonObject.has(fieldName) && jsonObject.optBoolean(fieldName, false);
    }

    public final /* synthetic */ String optCountryCode(JSONObject jsonObject, String fieldName) {
        s.g(jsonObject, "jsonObject");
        s.g(fieldName, "fieldName");
        String nullIfNullOrEmpty = nullIfNullOrEmpty(jsonObject.optString(fieldName));
        if (nullIfNullOrEmpty != null) {
            if (nullIfNullOrEmpty.length() == 2) {
                return nullIfNullOrEmpty;
            }
        }
        return null;
    }

    public final /* synthetic */ Map optHash(JSONObject jsonObject, String fieldName) {
        s.g(jsonObject, "jsonObject");
        s.g(fieldName, "fieldName");
        JSONObject optJSONObject = jsonObject.optJSONObject(fieldName);
        if (optJSONObject == null) {
            return null;
        }
        return INSTANCE.jsonObjectToStringMap(optJSONObject);
    }

    public final /* synthetic */ Integer optInteger(JSONObject jsonObject, String fieldName) {
        s.g(jsonObject, "jsonObject");
        s.g(fieldName, "fieldName");
        if (jsonObject.has(fieldName)) {
            return Integer.valueOf(jsonObject.optInt(fieldName));
        }
        return null;
    }

    public final /* synthetic */ Long optLong(JSONObject jsonObject, String fieldName) {
        s.g(jsonObject, "jsonObject");
        s.g(fieldName, "fieldName");
        if (jsonObject.has(fieldName)) {
            return Long.valueOf(jsonObject.optLong(fieldName));
        }
        return null;
    }

    public final /* synthetic */ Map optMap(JSONObject jsonObject, String fieldName) {
        s.g(jsonObject, "jsonObject");
        s.g(fieldName, "fieldName");
        JSONObject optJSONObject = jsonObject.optJSONObject(fieldName);
        if (optJSONObject == null) {
            return null;
        }
        return INSTANCE.jsonObjectToMap(optJSONObject);
    }
}