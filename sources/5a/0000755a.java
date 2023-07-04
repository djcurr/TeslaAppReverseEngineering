package ih;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private gh.a f30403a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Map<String, gh.a>> f30404b = new HashMap();

    public c(gh.a aVar) {
        this.f30403a = aVar;
    }

    public static c f() {
        gh.a aVar = gh.a.OLD;
        c cVar = new c(aVar);
        cVar.a("VCARD", "2.1", aVar);
        gh.a aVar2 = gh.a.NEW;
        cVar.a("VCARD", "3.0", aVar2);
        cVar.a("VCARD", "4.0", aVar2);
        return cVar;
    }

    public void a(String str, String str2, gh.a aVar) {
        String upperCase = str == null ? null : str.toUpperCase();
        Map<String, gh.a> map = this.f30404b.get(upperCase);
        if (map == null) {
            map = new HashMap<>();
            this.f30404b.put(upperCase, map);
        }
        map.put(str2, aVar);
    }

    public gh.a b() {
        return this.f30403a;
    }

    public gh.a c(String str, String str2) {
        Map<String, gh.a> map = this.f30404b.get(str == null ? null : str.toUpperCase());
        if (map == null) {
            return null;
        }
        return map.get(str2);
    }

    public boolean d(String str) {
        if (str != null) {
            str = str.toUpperCase();
        }
        return this.f30404b.containsKey(str);
    }

    public void e(gh.a aVar) {
        this.f30403a = aVar;
    }
}