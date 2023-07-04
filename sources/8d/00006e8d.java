package fq;

import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public final class j extends d {

    /* renamed from: l  reason: collision with root package name */
    private final nq.c f26777l;

    public j(nq.c cVar, g gVar, Set<com.nimbusds.jose.jwk.a> set, zp.a aVar, String str, URI uri, nq.c cVar2, nq.c cVar3, List<nq.a> list, KeyStore keyStore) {
        super(f.f26764d, gVar, set, aVar, str, uri, cVar2, cVar3, list, keyStore);
        if (cVar != null) {
            this.f26777l = cVar;
            return;
        }
        throw new IllegalArgumentException("The key value must not be null");
    }

    public static j p(Map<String, Object> map) {
        f fVar = f.f26764d;
        if (fVar.equals(e.d(map))) {
            try {
                return new j(nq.j.a(map, "k"), e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
            } catch (IllegalArgumentException e11) {
                throw new ParseException(e11.getMessage(), 0);
            }
        }
        throw new ParseException("The key type kty must be " + fVar.a(), 0);
    }

    @Override // fq.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof j) && super.equals(obj)) {
            return Objects.equals(this.f26777l, ((j) obj).f26777l);
        }
        return false;
    }

    @Override // fq.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f26777l);
    }

    @Override // fq.d
    public boolean k() {
        return true;
    }

    @Override // fq.d
    public Map<String, Object> m() {
        Map<String, Object> m11 = super.m();
        m11.put("k", this.f26777l.toString());
        return m11;
    }

    public nq.c o() {
        return this.f26777l;
    }

    public byte[] q() {
        return o().a();
    }

    public SecretKey r(String str) {
        return new SecretKeySpec(q(), str);
    }
}