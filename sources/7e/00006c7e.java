package ezvcard.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static final String f25469a = System.getProperty("line.separator");

    public static String a(Collection<?> collection, String str) {
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (Object obj : collection) {
            if (!z11) {
                sb2.append(str);
            }
            sb2.append(obj);
            z11 = false;
        }
        return sb2.toString();
    }

    public static Map<String, String> b(Map<String, String> map) {
        HashMap hashMap = new HashMap(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String str = null;
            String lowerCase = key == null ? null : key.toLowerCase();
            String value = entry.getValue();
            if (value != null) {
                str = value.toLowerCase();
            }
            hashMap.put(lowerCase, str);
        }
        return hashMap;
    }
}