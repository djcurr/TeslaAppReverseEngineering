package zp;

import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class e implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    private static final Map<String, Object> f60586g = Collections.unmodifiableMap(new HashMap());

    /* renamed from: a  reason: collision with root package name */
    private final a f60587a;

    /* renamed from: b  reason: collision with root package name */
    private final g f60588b;

    /* renamed from: c  reason: collision with root package name */
    private final String f60589c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<String> f60590d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Object> f60591e;

    /* renamed from: f  reason: collision with root package name */
    private final nq.c f60592f;

    /* JADX INFO: Access modifiers changed from: protected */
    public e(a aVar, g gVar, String str, Set<String> set, Map<String, Object> map, nq.c cVar) {
        if (aVar != null) {
            this.f60587a = aVar;
            this.f60588b = gVar;
            this.f60589c = str;
            if (set != null) {
                this.f60590d = Collections.unmodifiableSet(new HashSet(set));
            } else {
                this.f60590d = null;
            }
            if (map != null) {
                this.f60591e = Collections.unmodifiableMap(new HashMap(map));
            } else {
                this.f60591e = f60586g;
            }
            this.f60592f = cVar;
            return;
        }
        throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
    }

    public static a g(Map<String, Object> map) {
        String h11 = nq.j.h(map, "alg");
        if (h11 != null) {
            a aVar = a.f60565b;
            if (h11.equals(aVar.getName())) {
                return aVar;
            }
            if (map.containsKey("enc")) {
                return h.b(h11);
            }
            return n.b(h11);
        }
        throw new ParseException("Missing \"alg\" in header JSON object", 0);
    }

    public a a() {
        return this.f60587a;
    }

    public String b() {
        return this.f60589c;
    }

    public Set<String> c() {
        return this.f60590d;
    }

    public Object d(String str) {
        return this.f60591e.get(str);
    }

    public Map<String, Object> e() {
        return this.f60591e;
    }

    public g f() {
        return this.f60588b;
    }

    public nq.c h() {
        nq.c cVar = this.f60592f;
        return cVar == null ? nq.c.d(toString()) : cVar;
    }

    public Map<String, Object> i() {
        Map<String, Object> l11 = nq.j.l();
        l11.putAll(this.f60591e);
        l11.put("alg", this.f60587a.toString());
        g gVar = this.f60588b;
        if (gVar != null) {
            l11.put("typ", gVar.toString());
        }
        String str = this.f60589c;
        if (str != null) {
            l11.put("cty", str);
        }
        Set<String> set = this.f60590d;
        if (set != null && !set.isEmpty()) {
            l11.put("crit", new ArrayList(this.f60590d));
        }
        return l11;
    }

    public String toString() {
        return nq.j.o(i());
    }
}