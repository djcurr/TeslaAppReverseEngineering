package atd.x;

import atd.r0.g;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f6956a = Collections.unmodifiableMap(a());

    private static Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(atd.s0.a.a(-582185775852096L), atd.s0.a.a(-581258062916160L));
        hashMap.put(atd.s0.a.a(-575532871510592L), atd.s0.a.a(-575429792295488L));
        hashMap.put(atd.s0.a.a(-572762617604672L), atd.s0.a.a(-572659538389568L));
        hashMap.put(atd.s0.a.a(-566144073001536L), atd.s0.a.a(-566040993786432L));
        hashMap.put(atd.s0.a.a(-629022394214976L), atd.s0.a.a(-629469070813760L));
        hashMap.put(atd.s0.a.a(-623009440000576L), atd.s0.a.a(-623181238692416L));
        hashMap.put(atd.s0.a.a(-617271363693120L), atd.s0.a.a(-617168284478016L));
        hashMap.put(atd.s0.a.a(-610343581444672L), atd.s0.a.a(-610515380136512L));
        hashMap.put(atd.s0.a.a(-604687109515840L), atd.s0.a.a(-604584030300736L));
        return hashMap;
    }

    public static String b(String str) {
        for (Map.Entry<String, String> entry : f6956a.entrySet()) {
            if (a(entry.getKey()).equalsIgnoreCase(str)) {
                return a(entry.getValue());
            }
        }
        throw atd.y.c.UNKNOWN_DIRECTORY_SERVER.a();
    }

    private static String a(String str) {
        return g.a(str);
    }
}