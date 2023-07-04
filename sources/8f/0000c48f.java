package z50;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.k;
import u50.c0;
import u50.y;

/* loaded from: classes5.dex */
public class i {

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, k> f60340b = Collections.unmodifiableMap(new a());

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f60341c = Collections.unmodifiableMap(new b());

    /* renamed from: d  reason: collision with root package name */
    private static HashMap<n60.e, String> f60342d = new c();

    /* renamed from: a  reason: collision with root package name */
    private static final Map<k, String> f60339a = Collections.unmodifiableMap(new d());

    /* loaded from: classes5.dex */
    static class a extends HashMap<String, k> {
        a() {
            put("nistp256", y40.d.H);
            put("nistp384", y40.d.A);
            put("nistp521", y40.d.B);
            put("nistk163", y40.d.f59114b);
            put("nistp192", y40.d.G);
            put("nistp224", y40.d.f59138z);
            put("nistk233", y40.d.f59131s);
            put("nistb233", y40.d.f59132t);
            put("nistk283", y40.d.f59125m);
            put("nistk409", y40.d.C);
            put("nistb409", y40.d.D);
            put("nistt571", y40.d.E);
        }
    }

    /* loaded from: classes5.dex */
    static class b extends HashMap<String, String> {
        b() {
            String[][] strArr = {new String[]{"secp256r1", "nistp256"}, new String[]{"secp384r1", "nistp384"}, new String[]{"secp521r1", "nistp521"}, new String[]{"sect163k1", "nistk163"}, new String[]{"secp192r1", "nistp192"}, new String[]{"secp224r1", "nistp224"}, new String[]{"sect233k1", "nistk233"}, new String[]{"sect233r1", "nistb233"}, new String[]{"sect283k1", "nistk283"}, new String[]{"sect409k1", "nistk409"}, new String[]{"sect409r1", "nistb409"}, new String[]{"sect571k1", "nistt571"}};
            for (int i11 = 0; i11 != 12; i11++) {
                String[] strArr2 = strArr[i11];
                put(strArr2[0], strArr2[1]);
            }
        }
    }

    /* loaded from: classes5.dex */
    static class c extends HashMap<n60.e, String> {
        c() {
            Enumeration l11 = j50.a.l();
            while (l11.hasMoreElements()) {
                String str = (String) l11.nextElement();
                put(j50.a.i(str).e(), str);
            }
        }
    }

    /* loaded from: classes5.dex */
    static class d extends HashMap<k, String> {
        d() {
            for (String str : i.f60340b.keySet()) {
                put(i.f60340b.get(str), str);
            }
        }
    }

    public static k b(String str) {
        return f60340b.get(str);
    }

    public static String c(k kVar) {
        return f60339a.get(kVar);
    }

    public static String d(n60.e eVar) {
        return f60341c.get(f60342d.get(eVar));
    }

    public static String e(y yVar) {
        return yVar instanceof c0 ? c(((c0) yVar).j()) : d(yVar.a());
    }

    public static f50.i f(k kVar) {
        return r40.a.c(kVar);
    }
}