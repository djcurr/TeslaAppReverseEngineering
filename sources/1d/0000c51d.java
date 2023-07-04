package zp;

import ch.qos.logback.classic.Level;
import java.net.URI;
import java.text.ParseException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class o extends b {

    /* renamed from: p  reason: collision with root package name */
    private static final Set<String> f60666p;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f60667o;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("jku");
        hashSet.add("jwk");
        hashSet.add("x5u");
        hashSet.add("x5t");
        hashSet.add("x5t#S256");
        hashSet.add("x5c");
        hashSet.add("kid");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        hashSet.add("b64");
        f60666p = Collections.unmodifiableSet(hashSet);
    }

    public o(n nVar, g gVar, String str, Set<String> set, URI uri, fq.d dVar, URI uri2, nq.c cVar, nq.c cVar2, List<nq.a> list, String str2, boolean z11, Map<String, Object> map, nq.c cVar3) {
        super(nVar, gVar, str, set, uri, dVar, uri2, cVar, cVar2, list, str2, map, cVar3);
        if (!nVar.getName().equals(zp.a.f60565b.getName())) {
            this.f60667o = z11;
            return;
        }
        throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
    }

    public static Set<String> s() {
        return f60666p;
    }

    public static o u(String str, nq.c cVar) {
        return v(nq.j.n(str, Level.INFO_INT), cVar);
    }

    public static o v(Map<String, Object> map, nq.c cVar) {
        zp.a g11 = e.g(map);
        if (g11 instanceof n) {
            a i11 = new a((n) g11).i(cVar);
            for (String str : map.keySet()) {
                if (!"alg".equals(str)) {
                    if ("typ".equals(str)) {
                        String h11 = nq.j.h(map, str);
                        if (h11 != null) {
                            i11 = i11.j(new g(h11));
                        }
                    } else if ("cty".equals(str)) {
                        i11 = i11.c(nq.j.h(map, str));
                    } else if ("crit".equals(str)) {
                        List<String> j11 = nq.j.j(map, str);
                        if (j11 != null) {
                            i11 = i11.d(new HashSet(j11));
                        }
                    } else if ("jku".equals(str)) {
                        i11 = i11.g(nq.j.k(map, str));
                    } else if ("jwk".equals(str)) {
                        i11 = i11.f(b.q(nq.j.f(map, str)));
                    } else if ("x5u".equals(str)) {
                        i11 = i11.n(nq.j.k(map, str));
                    } else if ("x5t".equals(str)) {
                        i11 = i11.m(nq.c.f(nq.j.h(map, str)));
                    } else if ("x5t#S256".equals(str)) {
                        i11 = i11.l(nq.c.f(nq.j.h(map, str)));
                    } else if ("x5c".equals(str)) {
                        i11 = i11.k(nq.m.b(nq.j.e(map, str)));
                    } else if ("kid".equals(str)) {
                        i11 = i11.h(nq.j.h(map, str));
                    } else if ("b64".equals(str)) {
                        i11 = i11.a(nq.j.b(map, str));
                    } else {
                        i11 = i11.e(str, map.get(str));
                    }
                }
            }
            return i11.b();
        }
        throw new ParseException("Not a JWS header", 0);
    }

    public static o w(nq.c cVar) {
        return u(cVar.c(), cVar);
    }

    @Override // zp.b, zp.e
    public Map<String, Object> i() {
        Map<String, Object> i11 = super.i();
        if (!t()) {
            i11.put("b64", Boolean.FALSE);
        }
        return i11;
    }

    public n r() {
        return (n) super.a();
    }

    public boolean t() {
        return this.f60667o;
    }

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final n f60668a;

        /* renamed from: b  reason: collision with root package name */
        private g f60669b;

        /* renamed from: c  reason: collision with root package name */
        private String f60670c;

        /* renamed from: d  reason: collision with root package name */
        private Set<String> f60671d;

        /* renamed from: e  reason: collision with root package name */
        private URI f60672e;

        /* renamed from: f  reason: collision with root package name */
        private fq.d f60673f;

        /* renamed from: g  reason: collision with root package name */
        private URI f60674g;
        @Deprecated

        /* renamed from: h  reason: collision with root package name */
        private nq.c f60675h;

        /* renamed from: i  reason: collision with root package name */
        private nq.c f60676i;

        /* renamed from: j  reason: collision with root package name */
        private List<nq.a> f60677j;

        /* renamed from: k  reason: collision with root package name */
        private String f60678k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f60679l;

        /* renamed from: m  reason: collision with root package name */
        private Map<String, Object> f60680m;

        /* renamed from: n  reason: collision with root package name */
        private nq.c f60681n;

        public a(n nVar) {
            this.f60679l = true;
            if (!nVar.getName().equals(zp.a.f60565b.getName())) {
                this.f60668a = nVar;
                return;
            }
            throw new IllegalArgumentException("The JWS algorithm \"alg\" cannot be \"none\"");
        }

        public a a(boolean z11) {
            this.f60679l = z11;
            return this;
        }

        public o b() {
            return new o(this.f60668a, this.f60669b, this.f60670c, this.f60671d, this.f60672e, this.f60673f, this.f60674g, this.f60675h, this.f60676i, this.f60677j, this.f60678k, this.f60679l, this.f60680m, this.f60681n);
        }

        public a c(String str) {
            this.f60670c = str;
            return this;
        }

        public a d(Set<String> set) {
            this.f60671d = set;
            return this;
        }

        public a e(String str, Object obj) {
            if (!o.s().contains(str)) {
                if (this.f60680m == null) {
                    this.f60680m = new HashMap();
                }
                this.f60680m.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a f(fq.d dVar) {
            if (dVar != null && dVar.k()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f60673f = dVar;
            return this;
        }

        public a g(URI uri) {
            this.f60672e = uri;
            return this;
        }

        public a h(String str) {
            this.f60678k = str;
            return this;
        }

        public a i(nq.c cVar) {
            this.f60681n = cVar;
            return this;
        }

        public a j(g gVar) {
            this.f60669b = gVar;
            return this;
        }

        public a k(List<nq.a> list) {
            this.f60677j = list;
            return this;
        }

        public a l(nq.c cVar) {
            this.f60676i = cVar;
            return this;
        }

        @Deprecated
        public a m(nq.c cVar) {
            this.f60675h = cVar;
            return this;
        }

        public a n(URI uri) {
            this.f60674g = uri;
            return this;
        }

        public a(o oVar) {
            this(oVar.r());
            this.f60669b = oVar.f();
            this.f60670c = oVar.b();
            this.f60671d = oVar.c();
            this.f60672e = oVar.k();
            this.f60673f = oVar.j();
            this.f60674g = oVar.p();
            this.f60675h = oVar.o();
            this.f60676i = oVar.n();
            this.f60677j = oVar.m();
            this.f60678k = oVar.l();
            this.f60679l = oVar.t();
            this.f60680m = oVar.e();
        }
    }
}