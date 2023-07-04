package fq;

import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.text.ParseException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import nq.m;

/* loaded from: classes2.dex */
public abstract class d implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final f f26751a;

    /* renamed from: b  reason: collision with root package name */
    private final g f26752b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<com.nimbusds.jose.jwk.a> f26753c;

    /* renamed from: d  reason: collision with root package name */
    private final zp.a f26754d;

    /* renamed from: e  reason: collision with root package name */
    private final String f26755e;

    /* renamed from: f  reason: collision with root package name */
    private final URI f26756f;
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    private final nq.c f26757g;

    /* renamed from: h  reason: collision with root package name */
    private final nq.c f26758h;

    /* renamed from: i  reason: collision with root package name */
    private final List<nq.a> f26759i;

    /* renamed from: j  reason: collision with root package name */
    private final List<X509Certificate> f26760j;

    /* renamed from: k  reason: collision with root package name */
    private final KeyStore f26761k;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(f fVar, g gVar, Set<com.nimbusds.jose.jwk.a> set, zp.a aVar, String str, URI uri, nq.c cVar, nq.c cVar2, List<nq.a> list, KeyStore keyStore) {
        if (fVar != null) {
            this.f26751a = fVar;
            if (h.a(gVar, set)) {
                this.f26752b = gVar;
                this.f26753c = set;
                this.f26754d = aVar;
                this.f26755e = str;
                this.f26756f = uri;
                this.f26757g = cVar;
                this.f26758h = cVar2;
                if (list != null && list.isEmpty()) {
                    throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
                }
                this.f26759i = list;
                try {
                    this.f26760j = m.a(list);
                    this.f26761k = keyStore;
                    return;
                } catch (ParseException e11) {
                    throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e11.getMessage(), e11);
                }
            }
            throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
        }
        throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
    }

    public static d l(Map<String, Object> map) {
        String h11 = nq.j.h(map, "kty");
        if (h11 != null) {
            f b11 = f.b(h11);
            if (b11 == f.f26762b) {
                return b.w(map);
            }
            if (b11 == f.f26763c) {
                return k.p(map);
            }
            if (b11 == f.f26764d) {
                return j.p(map);
            }
            if (b11 == f.f26765e) {
                return i.o(map);
            }
            throw new ParseException("Unsupported key type \"kty\" parameter: " + b11, 0);
        }
        throw new ParseException("Missing key type \"kty\" parameter", 0);
    }

    public zp.a a() {
        return this.f26754d;
    }

    public String b() {
        return this.f26755e;
    }

    public Set<com.nimbusds.jose.jwk.a> c() {
        return this.f26753c;
    }

    public KeyStore d() {
        return this.f26761k;
    }

    public g e() {
        return this.f26752b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return Objects.equals(this.f26751a, dVar.f26751a) && Objects.equals(this.f26752b, dVar.f26752b) && Objects.equals(this.f26753c, dVar.f26753c) && Objects.equals(this.f26754d, dVar.f26754d) && Objects.equals(this.f26755e, dVar.f26755e) && Objects.equals(this.f26756f, dVar.f26756f) && Objects.equals(this.f26757g, dVar.f26757g) && Objects.equals(this.f26758h, dVar.f26758h) && Objects.equals(this.f26759i, dVar.f26759i) && Objects.equals(this.f26761k, dVar.f26761k);
        }
        return false;
    }

    public List<X509Certificate> f() {
        List<X509Certificate> list = this.f26760j;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public List<nq.a> g() {
        List<nq.a> list = this.f26759i;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    public nq.c h() {
        return this.f26758h;
    }

    public int hashCode() {
        return Objects.hash(this.f26751a, this.f26752b, this.f26753c, this.f26754d, this.f26755e, this.f26756f, this.f26757g, this.f26758h, this.f26759i, this.f26761k);
    }

    @Deprecated
    public nq.c i() {
        return this.f26757g;
    }

    public URI j() {
        return this.f26756f;
    }

    public abstract boolean k();

    public Map<String, Object> m() {
        Map<String, Object> l11 = nq.j.l();
        l11.put("kty", this.f26751a.a());
        g gVar = this.f26752b;
        if (gVar != null) {
            l11.put("use", gVar.a());
        }
        if (this.f26753c != null) {
            List<Object> a11 = nq.i.a();
            for (com.nimbusds.jose.jwk.a aVar : this.f26753c) {
                a11.add(aVar.identifier());
            }
            l11.put("key_ops", a11);
        }
        zp.a aVar2 = this.f26754d;
        if (aVar2 != null) {
            l11.put("alg", aVar2.getName());
        }
        String str = this.f26755e;
        if (str != null) {
            l11.put("kid", str);
        }
        URI uri = this.f26756f;
        if (uri != null) {
            l11.put("x5u", uri.toString());
        }
        nq.c cVar = this.f26757g;
        if (cVar != null) {
            l11.put("x5t", cVar.toString());
        }
        nq.c cVar2 = this.f26758h;
        if (cVar2 != null) {
            l11.put("x5t#S256", cVar2.toString());
        }
        if (this.f26759i != null) {
            List<Object> a12 = nq.i.a();
            for (nq.a aVar3 : this.f26759i) {
                a12.add(aVar3.toString());
            }
            l11.put("x5c", a12);
        }
        return l11;
    }

    public String n() {
        return nq.j.o(m());
    }

    public String toString() {
        return nq.j.o(m());
    }
}