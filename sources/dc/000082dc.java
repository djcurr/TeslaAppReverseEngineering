package l8;

import ch.qos.logback.core.CoreConstants;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, a> f37107a = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f37108a;

        /* renamed from: b  reason: collision with root package name */
        public long f37109b;

        /* renamed from: c  reason: collision with root package name */
        public long f37110c;
    }

    public static String a(String str) {
        a aVar;
        String str2;
        Map<String, a> map = f37107a;
        if (map == null || (aVar = map.get(str)) == null) {
            return null;
        }
        if (!(System.currentTimeMillis() - aVar.f37109b < aVar.f37110c) || (str2 = aVar.f37108a) == null) {
            map.remove(str);
            return null;
        }
        return str2;
    }

    public static void b(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        Map<String, a> map = f37107a;
        a aVar = map.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.f37108a = str2;
        aVar.f37110c = CoreConstants.MILLIS_IN_ONE_DAY;
        aVar.f37109b = System.currentTimeMillis();
        map.put(str, aVar);
    }
}