package nz;

import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import rz.m;

/* loaded from: classes5.dex */
final class d implements f {
    private String e(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // nz.f
    public Map<String, String> getMap(String str) {
        String d11;
        String str2 = e(str) + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str2) && (d11 = m.d(entry.getValue(), "\"")) != null) {
                concurrentHashMap.put(key.substring(str2.length()).toLowerCase(Locale.ROOT), d11);
            }
        }
        return concurrentHashMap;
    }

    @Override // nz.f
    public String getProperty(String str) {
        return m.d(System.getenv(e(str)), "\"");
    }
}