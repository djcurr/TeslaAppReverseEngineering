package com.stripe.android.core.networking;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import okhttp3.HttpUrl;
import wz.b0;
import wz.e0;
import wz.v;
import wz.w;

/* loaded from: classes2.dex */
public final class QueryStringFactory {
    public static final QueryStringFactory INSTANCE = new QueryStringFactory();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class Parameter {
        private final String key;
        private final String value;

        public Parameter(String key, String value) {
            s.g(key, "key");
            s.g(value, "value");
            this.key = key;
            this.value = value;
        }

        private final String component1() {
            return this.key;
        }

        private final String component2() {
            return this.value;
        }

        public static /* synthetic */ Parameter copy$default(Parameter parameter, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = parameter.key;
            }
            if ((i11 & 2) != 0) {
                str2 = parameter.value;
            }
            return parameter.copy(str, str2);
        }

        private final String urlEncode(String str) {
            String encode = URLEncoder.encode(str, d.f35187b.name());
            s.f(encode, "encode(str, Charsets.UTF_8.name())");
            return encode;
        }

        public final Parameter copy(String key, String value) {
            s.g(key, "key");
            s.g(value, "value");
            return new Parameter(key, value);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Parameter) {
                Parameter parameter = (Parameter) obj;
                return s.c(this.key, parameter.key) && s.c(this.value, parameter.value);
            }
            return false;
        }

        public int hashCode() {
            return (this.key.hashCode() * 31) + this.value.hashCode();
        }

        public String toString() {
            String urlEncode = urlEncode(this.key);
            String urlEncode2 = urlEncode(this.value);
            return urlEncode + '=' + urlEncode2;
        }
    }

    private QueryStringFactory() {
    }

    private final List<Parameter> flattenParams(Map<String, ?> map) {
        return flattenParamsMap$default(this, map, null, 2, null);
    }

    private final List<Parameter> flattenParamsList(List<?> list, String str) {
        List<Parameter> d11;
        if (list.isEmpty()) {
            d11 = v.d(new Parameter(str, ""));
            return d11;
        }
        String p11 = s.p(str, HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            b0.z(arrayList, INSTANCE.flattenParamsValue(it2.next(), p11));
        }
        return arrayList;
    }

    private final List<Parameter> flattenParamsMap(Map<String, ?> map, String str) {
        ArrayList arrayList;
        List<Parameter> i11;
        if (map == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry<String, ?> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (str != null) {
                    String str2 = str + '[' + key + ']';
                    if (str2 != null) {
                        key = str2;
                    }
                }
                b0.z(arrayList2, INSTANCE.flattenParamsValue(value, key));
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            i11 = w.i();
            return i11;
        }
        return arrayList;
    }

    static /* synthetic */ List flattenParamsMap$default(QueryStringFactory queryStringFactory, Map map, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return queryStringFactory.flattenParamsMap(map, str);
    }

    private final List<Parameter> flattenParamsValue(Object obj, String str) {
        List<Parameter> d11;
        List<Parameter> d12;
        if (obj instanceof Map) {
            return flattenParamsMap((Map) obj, str);
        }
        if (obj instanceof List) {
            return flattenParamsList((List) obj, str);
        }
        if (obj == null) {
            d12 = v.d(new Parameter(str, ""));
            return d12;
        }
        d11 = v.d(new Parameter(str, obj.toString()));
        return d11;
    }

    public final Map<String, Object> compactParams(Map<String, ?> params) {
        s.g(params, "params");
        HashMap hashMap = new HashMap(params);
        Iterator it2 = new HashSet(hashMap.keySet()).iterator();
        while (it2.hasNext()) {
            String key = (String) it2.next();
            Object obj = hashMap.get(key);
            if (obj instanceof Map) {
                s.f(key, "key");
                hashMap.put(key, compactParams((Map) obj));
            } else if (obj == null) {
                hashMap.remove(key);
            }
        }
        return hashMap;
    }

    public final String create(Map<String, ?> map) {
        String l02;
        l02 = e0.l0(flattenParams(map), "&", null, null, 0, null, QueryStringFactory$create$1.INSTANCE, 30, null);
        return l02;
    }

    public final String createFromParamsWithEmptyValues(Map<String, ?> map) {
        QueryStringFactory queryStringFactory;
        Map<String, Object> compactParams;
        String create;
        return (map == null || (compactParams = (queryStringFactory = INSTANCE).compactParams(map)) == null || (create = queryStringFactory.create(compactParams)) == null) ? "" : create;
    }
}