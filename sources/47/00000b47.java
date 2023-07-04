package atd.x;

import atd.r0.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, List<String>> f6955a = Collections.unmodifiableMap(a());

    private static Map<String, List<String>> a() {
        HashMap hashMap = new HashMap();
        hashMap.put(atd.s0.a.a(-313114664692288L), Collections.singletonList(atd.s0.a.a(-312461829663296L)));
        hashMap.put(atd.s0.a.a(-351357053495872L), Collections.singletonList(atd.s0.a.a(-351803730094656L)));
        hashMap.put(atd.s0.a.a(-320639447394880L), Collections.singletonList(atd.s0.a.a(-320811246086720L)));
        hashMap.put(atd.s0.a.a(-501302951733824L), Arrays.asList(atd.s0.a.a(-501199872518720L), atd.s0.a.a(-552430242425408L)));
        hashMap.put(atd.s0.a.a(-452318849722944L), Collections.singletonList(atd.s0.a.a(-452215770507840L)));
        hashMap.put(atd.s0.a.a(-492369419758144L), Collections.singletonList(atd.s0.a.a(-491716584729152L)));
        hashMap.put(atd.s0.a.a(-473196685748800L), Collections.singletonList(atd.s0.a.a(-472268972812864L)));
        hashMap.put(atd.s0.a.a(-666002062633536L), Collections.singletonList(atd.s0.a.a(-666173861325376L)));
        hashMap.put(atd.s0.a.a(-636899364235840L), Collections.singletonList(atd.s0.a.a(-636246529206848L)));
        hashMap.put(atd.s0.a.a(-683078852602432L), Collections.singletonList(atd.s0.a.a(-682426017573440L)));
        return hashMap;
    }

    public static List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, List<String>> entry : f6955a.entrySet()) {
            if (a(entry.getKey()).equalsIgnoreCase(str)) {
                for (String str2 : entry.getValue()) {
                    arrayList.add(a(str2));
                }
                return arrayList;
            }
        }
        throw atd.y.c.UNKNOWN_DIRECTORY_SERVER.a();
    }

    private static String a(String str) {
        return g.a(str);
    }
}