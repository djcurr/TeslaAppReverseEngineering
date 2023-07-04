package nz;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import rz.j;
import rz.m;

/* loaded from: classes5.dex */
abstract class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private final String f41990a;

    /* renamed from: b  reason: collision with root package name */
    private final Properties f41991b;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(String str, Properties properties) {
        this.f41990a = (String) j.a(str, "prefix is required");
        this.f41991b = (Properties) j.a(properties, "properties are required");
    }

    @Override // nz.f
    public Map<String, String> getMap(String str) {
        String str2 = this.f41990a + str + ".";
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f41991b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    hashMap.put(str3.substring(str2.length()), m.d((String) entry.getValue(), "\""));
                }
            }
        }
        return hashMap;
    }

    @Override // nz.f
    public String getProperty(String str) {
        Properties properties = this.f41991b;
        return m.d(properties.getProperty(this.f41990a + str), "\"");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(Properties properties) {
        this("", properties);
    }
}