package fq;

import java.io.Serializable;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class k extends d {

    /* renamed from: l  reason: collision with root package name */
    private final nq.c f26778l;

    /* renamed from: m  reason: collision with root package name */
    private final nq.c f26779m;

    /* renamed from: n  reason: collision with root package name */
    private final nq.c f26780n;

    /* renamed from: o  reason: collision with root package name */
    private final nq.c f26781o;

    /* renamed from: p  reason: collision with root package name */
    private final nq.c f26782p;

    /* renamed from: q  reason: collision with root package name */
    private final nq.c f26783q;

    /* renamed from: t  reason: collision with root package name */
    private final nq.c f26784t;

    /* renamed from: w  reason: collision with root package name */
    private final nq.c f26785w;

    /* renamed from: x  reason: collision with root package name */
    private final List<a> f26786x;

    /* renamed from: y  reason: collision with root package name */
    private final PrivateKey f26787y;

    /* loaded from: classes2.dex */
    public static class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final nq.c f26788a;

        /* renamed from: b  reason: collision with root package name */
        private final nq.c f26789b;

        /* renamed from: c  reason: collision with root package name */
        private final nq.c f26790c;

        public a(nq.c cVar, nq.c cVar2, nq.c cVar3) {
            if (cVar != null) {
                this.f26788a = cVar;
                if (cVar2 != null) {
                    this.f26789b = cVar2;
                    if (cVar3 != null) {
                        this.f26790c = cVar3;
                        return;
                    }
                    throw new IllegalArgumentException("The factor CRT coefficient must not be null");
                }
                throw new IllegalArgumentException("The factor CRT exponent must not be null");
            }
            throw new IllegalArgumentException("The prime factor must not be null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public k(nq.c r17, nq.c r18, nq.c r19, nq.c r20, nq.c r21, nq.c r22, nq.c r23, nq.c r24, java.util.List<fq.k.a> r25, java.security.PrivateKey r26, fq.g r27, java.util.Set<com.nimbusds.jose.jwk.a> r28, zp.a r29, java.lang.String r30, java.net.URI r31, nq.c r32, nq.c r33, java.util.List<nq.a> r34, java.security.KeyStore r35) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: fq.k.<init>(nq.c, nq.c, nq.c, nq.c, nq.c, nq.c, nq.c, nq.c, java.util.List, java.security.PrivateKey, fq.g, java.util.Set, zp.a, java.lang.String, java.net.URI, nq.c, nq.c, java.util.List, java.security.KeyStore):void");
    }

    public static k p(Map<String, Object> map) {
        List<Object> e11;
        if (f.f26763c.equals(e.d(map))) {
            nq.c a11 = nq.j.a(map, "n");
            nq.c a12 = nq.j.a(map, "e");
            nq.c a13 = nq.j.a(map, "d");
            nq.c a14 = nq.j.a(map, "p");
            nq.c a15 = nq.j.a(map, "q");
            nq.c a16 = nq.j.a(map, "dp");
            nq.c a17 = nq.j.a(map, "dq");
            nq.c a18 = nq.j.a(map, "qi");
            ArrayList arrayList = null;
            if (map.containsKey("oth") && (e11 = nq.j.e(map, "oth")) != null) {
                arrayList = new ArrayList(e11.size());
                for (Object obj : e11) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        try {
                            arrayList.add(new a(nq.j.a(map2, "r"), nq.j.a(map2, "dq"), nq.j.a(map2, "t")));
                        } catch (IllegalArgumentException e12) {
                            throw new ParseException(e12.getMessage(), 0);
                        }
                    }
                }
            }
            try {
                return new k(a11, a12, a13, a14, a15, a16, a17, a18, arrayList, null, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
            } catch (IllegalArgumentException e13) {
                throw new ParseException(e13.getMessage(), 0);
            }
        }
        throw new ParseException("The key type \"kty\" must be RSA", 0);
    }

    @Override // fq.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && super.equals(obj)) {
            k kVar = (k) obj;
            return Objects.equals(this.f26778l, kVar.f26778l) && Objects.equals(this.f26779m, kVar.f26779m) && Objects.equals(this.f26780n, kVar.f26780n) && Objects.equals(this.f26781o, kVar.f26781o) && Objects.equals(this.f26782p, kVar.f26782p) && Objects.equals(this.f26783q, kVar.f26783q) && Objects.equals(this.f26784t, kVar.f26784t) && Objects.equals(this.f26785w, kVar.f26785w) && Objects.equals(this.f26786x, kVar.f26786x) && Objects.equals(this.f26787y, kVar.f26787y);
        }
        return false;
    }

    @Override // fq.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f26778l, this.f26779m, this.f26780n, this.f26781o, this.f26782p, this.f26783q, this.f26784t, this.f26785w, this.f26786x, this.f26787y);
    }

    @Override // fq.d
    public boolean k() {
        return (this.f26780n == null && this.f26781o == null && this.f26787y == null) ? false : true;
    }

    @Override // fq.d
    public Map<String, Object> m() {
        Map<String, Object> m11 = super.m();
        m11.put("n", this.f26778l.toString());
        m11.put("e", this.f26779m.toString());
        nq.c cVar = this.f26780n;
        if (cVar != null) {
            m11.put("d", cVar.toString());
        }
        nq.c cVar2 = this.f26781o;
        if (cVar2 != null) {
            m11.put("p", cVar2.toString());
        }
        nq.c cVar3 = this.f26782p;
        if (cVar3 != null) {
            m11.put("q", cVar3.toString());
        }
        nq.c cVar4 = this.f26783q;
        if (cVar4 != null) {
            m11.put("dp", cVar4.toString());
        }
        nq.c cVar5 = this.f26784t;
        if (cVar5 != null) {
            m11.put("dq", cVar5.toString());
        }
        nq.c cVar6 = this.f26785w;
        if (cVar6 != null) {
            m11.put("qi", cVar6.toString());
        }
        List<a> list = this.f26786x;
        if (list != null && !list.isEmpty()) {
            List<Object> a11 = nq.i.a();
            for (a aVar : this.f26786x) {
                Map<String, Object> l11 = nq.j.l();
                l11.put("r", aVar.f26788a.toString());
                l11.put("d", aVar.f26789b.toString());
                l11.put("t", aVar.f26790c.toString());
                a11.add(l11);
            }
            m11.put("oth", a11);
        }
        return m11;
    }

    public boolean o(X509Certificate x509Certificate) {
        try {
            RSAPublicKey rSAPublicKey = (RSAPublicKey) f().get(0).getPublicKey();
            if (this.f26779m.b().equals(rSAPublicKey.getPublicExponent())) {
                return this.f26778l.b().equals(rSAPublicKey.getModulus());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }
}