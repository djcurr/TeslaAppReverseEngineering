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
public final class l extends b {
    private static final Set<String> C;
    private final nq.c A;
    private final String B;

    /* renamed from: o  reason: collision with root package name */
    private final d f60621o;

    /* renamed from: p  reason: collision with root package name */
    private final fq.d f60622p;

    /* renamed from: q  reason: collision with root package name */
    private final c f60623q;

    /* renamed from: t  reason: collision with root package name */
    private final nq.c f60624t;

    /* renamed from: w  reason: collision with root package name */
    private final nq.c f60625w;

    /* renamed from: x  reason: collision with root package name */
    private final nq.c f60626x;

    /* renamed from: y  reason: collision with root package name */
    private final int f60627y;

    /* renamed from: z  reason: collision with root package name */
    private final nq.c f60628z;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final h f60629a;

        /* renamed from: b  reason: collision with root package name */
        private final d f60630b;

        /* renamed from: c  reason: collision with root package name */
        private g f60631c;

        /* renamed from: d  reason: collision with root package name */
        private String f60632d;

        /* renamed from: e  reason: collision with root package name */
        private Set<String> f60633e;

        /* renamed from: f  reason: collision with root package name */
        private URI f60634f;

        /* renamed from: g  reason: collision with root package name */
        private fq.d f60635g;

        /* renamed from: h  reason: collision with root package name */
        private URI f60636h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        private nq.c f60637i;

        /* renamed from: j  reason: collision with root package name */
        private nq.c f60638j;

        /* renamed from: k  reason: collision with root package name */
        private List<nq.a> f60639k;

        /* renamed from: l  reason: collision with root package name */
        private String f60640l;

        /* renamed from: m  reason: collision with root package name */
        private fq.d f60641m;

        /* renamed from: n  reason: collision with root package name */
        private c f60642n;

        /* renamed from: o  reason: collision with root package name */
        private nq.c f60643o;

        /* renamed from: p  reason: collision with root package name */
        private nq.c f60644p;

        /* renamed from: q  reason: collision with root package name */
        private nq.c f60645q;

        /* renamed from: r  reason: collision with root package name */
        private int f60646r;

        /* renamed from: s  reason: collision with root package name */
        private nq.c f60647s;

        /* renamed from: t  reason: collision with root package name */
        private nq.c f60648t;

        /* renamed from: u  reason: collision with root package name */
        private String f60649u;

        /* renamed from: v  reason: collision with root package name */
        private Map<String, Object> f60650v;

        /* renamed from: w  reason: collision with root package name */
        private nq.c f60651w;

        public a(h hVar, d dVar) {
            if (!hVar.getName().equals(zp.a.f60565b.getName())) {
                this.f60629a = hVar;
                if (dVar != null) {
                    this.f60630b = dVar;
                    return;
                }
                throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
            }
            throw new IllegalArgumentException("The JWE algorithm \"alg\" cannot be \"none\"");
        }

        public a a(nq.c cVar) {
            this.f60643o = cVar;
            return this;
        }

        public a b(nq.c cVar) {
            this.f60644p = cVar;
            return this;
        }

        public a c(nq.c cVar) {
            this.f60648t = cVar;
            return this;
        }

        public l d() {
            return new l(this.f60629a, this.f60630b, this.f60631c, this.f60632d, this.f60633e, this.f60634f, this.f60635g, this.f60636h, this.f60637i, this.f60638j, this.f60639k, this.f60640l, this.f60641m, this.f60642n, this.f60643o, this.f60644p, this.f60645q, this.f60646r, this.f60647s, this.f60648t, this.f60649u, this.f60650v, this.f60651w);
        }

        public a e(c cVar) {
            this.f60642n = cVar;
            return this;
        }

        public a f(String str) {
            this.f60632d = str;
            return this;
        }

        public a g(Set<String> set) {
            this.f60633e = set;
            return this;
        }

        public a h(String str, Object obj) {
            if (!l.u().contains(str)) {
                if (this.f60650v == null) {
                    this.f60650v = new HashMap();
                }
                this.f60650v.put(str, obj);
                return this;
            }
            throw new IllegalArgumentException("The parameter name \"" + str + "\" matches a registered name");
        }

        public a i(fq.d dVar) {
            this.f60641m = dVar;
            return this;
        }

        public a j(nq.c cVar) {
            this.f60647s = cVar;
            return this;
        }

        public a k(fq.d dVar) {
            if (dVar != null && dVar.k()) {
                throw new IllegalArgumentException("The JWK must be public");
            }
            this.f60635g = dVar;
            return this;
        }

        public a l(URI uri) {
            this.f60634f = uri;
            return this;
        }

        public a m(String str) {
            this.f60640l = str;
            return this;
        }

        public a n(nq.c cVar) {
            this.f60651w = cVar;
            return this;
        }

        public a o(int i11) {
            if (i11 >= 0) {
                this.f60646r = i11;
                return this;
            }
            throw new IllegalArgumentException("The PBES2 count parameter must not be negative");
        }

        public a p(nq.c cVar) {
            this.f60645q = cVar;
            return this;
        }

        public a q(String str) {
            this.f60649u = str;
            return this;
        }

        public a r(g gVar) {
            this.f60631c = gVar;
            return this;
        }

        public a s(List<nq.a> list) {
            this.f60639k = list;
            return this;
        }

        public a t(nq.c cVar) {
            this.f60638j = cVar;
            return this;
        }

        @Deprecated
        public a u(nq.c cVar) {
            this.f60637i = cVar;
            return this;
        }

        public a v(URI uri) {
            this.f60636h = uri;
            return this;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("alg");
        hashSet.add("enc");
        hashSet.add("epk");
        hashSet.add("zip");
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
        hashSet.add("apu");
        hashSet.add("apv");
        hashSet.add("p2s");
        hashSet.add("p2c");
        hashSet.add("iv");
        hashSet.add("tag");
        hashSet.add("skid");
        hashSet.add("authTag");
        C = Collections.unmodifiableSet(hashSet);
    }

    public l(zp.a aVar, d dVar, g gVar, String str, Set<String> set, URI uri, fq.d dVar2, URI uri2, nq.c cVar, nq.c cVar2, List<nq.a> list, String str2, fq.d dVar3, c cVar3, nq.c cVar4, nq.c cVar5, nq.c cVar6, int i11, nq.c cVar7, nq.c cVar8, String str3, Map<String, Object> map, nq.c cVar9) {
        super(aVar, gVar, str, set, uri, dVar2, uri2, cVar, cVar2, list, str2, map, cVar9);
        if (aVar.getName().equals(zp.a.f60565b.getName())) {
            throw new IllegalArgumentException("The JWE algorithm cannot be \"none\"");
        }
        if (dVar != null) {
            if (dVar3 != null && dVar3.k()) {
                throw new IllegalArgumentException("Ephemeral public key should not be a private key");
            }
            this.f60621o = dVar;
            this.f60622p = dVar3;
            this.f60623q = cVar3;
            this.f60624t = cVar4;
            this.f60625w = cVar5;
            this.f60626x = cVar6;
            this.f60627y = i11;
            this.f60628z = cVar7;
            this.A = cVar8;
            this.B = str3;
            return;
        }
        throw new IllegalArgumentException("The encryption method \"enc\" parameter must not be null");
    }

    public static Set<String> u() {
        return C;
    }

    public static l v(String str, nq.c cVar) {
        return w(nq.j.n(str, Level.INFO_INT), cVar);
    }

    public static l w(Map<String, Object> map, nq.c cVar) {
        zp.a g11 = e.g(map);
        if (g11 instanceof h) {
            a n11 = new a((h) g11, y(map)).n(cVar);
            for (String str : map.keySet()) {
                if (!"alg".equals(str) && !"enc".equals(str)) {
                    if ("typ".equals(str)) {
                        String h11 = nq.j.h(map, str);
                        if (h11 != null) {
                            n11 = n11.r(new g(h11));
                        }
                    } else if ("cty".equals(str)) {
                        n11 = n11.f(nq.j.h(map, str));
                    } else if ("crit".equals(str)) {
                        List<String> j11 = nq.j.j(map, str);
                        if (j11 != null) {
                            n11 = n11.g(new HashSet(j11));
                        }
                    } else if ("jku".equals(str)) {
                        n11 = n11.l(nq.j.k(map, str));
                    } else if ("jwk".equals(str)) {
                        n11 = n11.k(b.q(nq.j.f(map, str)));
                    } else if ("x5u".equals(str)) {
                        n11 = n11.v(nq.j.k(map, str));
                    } else if ("x5t".equals(str)) {
                        n11 = n11.u(nq.c.f(nq.j.h(map, str)));
                    } else if ("x5t#S256".equals(str)) {
                        n11 = n11.t(nq.c.f(nq.j.h(map, str)));
                    } else if ("x5c".equals(str)) {
                        n11 = n11.s(nq.m.b(nq.j.e(map, str)));
                    } else if ("kid".equals(str)) {
                        n11 = n11.m(nq.j.h(map, str));
                    } else if ("epk".equals(str)) {
                        n11 = n11.i(fq.d.l(nq.j.f(map, str)));
                    } else if ("zip".equals(str)) {
                        String h12 = nq.j.h(map, str);
                        if (h12 != null) {
                            n11 = n11.e(new c(h12));
                        }
                    } else if ("apu".equals(str)) {
                        n11 = n11.a(nq.c.f(nq.j.h(map, str)));
                    } else if ("apv".equals(str)) {
                        n11 = n11.b(nq.c.f(nq.j.h(map, str)));
                    } else if ("p2s".equals(str)) {
                        n11 = n11.p(nq.c.f(nq.j.h(map, str)));
                    } else if ("p2c".equals(str)) {
                        n11 = n11.o(nq.j.d(map, str));
                    } else if ("iv".equals(str)) {
                        n11 = n11.j(nq.c.f(nq.j.h(map, str)));
                    } else if ("tag".equals(str)) {
                        n11 = n11.c(nq.c.f(nq.j.h(map, str)));
                    } else if ("skid".equals(str)) {
                        n11 = n11.q(nq.j.h(map, str));
                    } else {
                        n11 = n11.h(str, map.get(str));
                    }
                }
            }
            return n11.d();
        }
        throw new ParseException("The algorithm \"alg\" header parameter must be for encryption", 0);
    }

    public static l x(nq.c cVar) {
        return v(cVar.c(), cVar);
    }

    private static d y(Map<String, Object> map) {
        return d.c(nq.j.h(map, "enc"));
    }

    @Override // zp.b, zp.e
    public Map<String, Object> i() {
        Map<String, Object> i11 = super.i();
        d dVar = this.f60621o;
        if (dVar != null) {
            i11.put("enc", dVar.toString());
        }
        fq.d dVar2 = this.f60622p;
        if (dVar2 != null) {
            i11.put("epk", dVar2.m());
        }
        c cVar = this.f60623q;
        if (cVar != null) {
            i11.put("zip", cVar.toString());
        }
        nq.c cVar2 = this.f60624t;
        if (cVar2 != null) {
            i11.put("apu", cVar2.toString());
        }
        nq.c cVar3 = this.f60625w;
        if (cVar3 != null) {
            i11.put("apv", cVar3.toString());
        }
        nq.c cVar4 = this.f60626x;
        if (cVar4 != null) {
            i11.put("p2s", cVar4.toString());
        }
        int i12 = this.f60627y;
        if (i12 > 0) {
            i11.put("p2c", Integer.valueOf(i12));
        }
        nq.c cVar5 = this.f60628z;
        if (cVar5 != null) {
            i11.put("iv", cVar5.toString());
        }
        nq.c cVar6 = this.A;
        if (cVar6 != null) {
            i11.put("tag", cVar6.toString());
        }
        String str = this.B;
        if (str != null) {
            i11.put("skid", str);
        }
        return i11;
    }

    public h r() {
        return (h) super.a();
    }

    public c s() {
        return this.f60623q;
    }

    public d t() {
        return this.f60621o;
    }
}