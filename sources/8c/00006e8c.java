package fq;

import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public class i extends d {

    /* renamed from: q  reason: collision with root package name */
    public static final Set<a> f26771q = Collections.unmodifiableSet(new HashSet(Arrays.asList(a.f26721h, a.f26722i, a.f26723j, a.f26724k)));

    /* renamed from: l  reason: collision with root package name */
    private final a f26772l;

    /* renamed from: m  reason: collision with root package name */
    private final nq.c f26773m;

    /* renamed from: n  reason: collision with root package name */
    private final byte[] f26774n;

    /* renamed from: o  reason: collision with root package name */
    private final nq.c f26775o;

    /* renamed from: p  reason: collision with root package name */
    private final byte[] f26776p;

    public i(a aVar, nq.c cVar, g gVar, Set<com.nimbusds.jose.jwk.a> set, zp.a aVar2, String str, URI uri, nq.c cVar2, nq.c cVar3, List<nq.a> list, KeyStore keyStore) {
        super(f.f26765e, gVar, set, aVar2, str, uri, cVar2, cVar3, list, keyStore);
        if (aVar != null) {
            if (f26771q.contains(aVar)) {
                this.f26772l = aVar;
                if (cVar != null) {
                    this.f26773m = cVar;
                    this.f26774n = cVar.a();
                    this.f26775o = null;
                    this.f26776p = null;
                    return;
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public static i o(Map<String, Object> map) {
        f fVar = f.f26765e;
        if (fVar.equals(e.d(map))) {
            try {
                a d11 = a.d(nq.j.h(map, "crv"));
                nq.c a11 = nq.j.a(map, "x");
                nq.c a12 = nq.j.a(map, "d");
                try {
                    if (a12 == null) {
                        return new i(d11, a11, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
                    }
                    return new i(d11, a11, a12, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
                } catch (IllegalArgumentException e11) {
                    throw new ParseException(e11.getMessage(), 0);
                }
            } catch (IllegalArgumentException e12) {
                throw new ParseException(e12.getMessage(), 0);
            }
        }
        throw new ParseException("The key type kty must be " + fVar.a(), 0);
    }

    @Override // fq.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof i) && super.equals(obj)) {
            i iVar = (i) obj;
            return Objects.equals(this.f26772l, iVar.f26772l) && Objects.equals(this.f26773m, iVar.f26773m) && Arrays.equals(this.f26774n, iVar.f26774n) && Objects.equals(this.f26775o, iVar.f26775o) && Arrays.equals(this.f26776p, iVar.f26776p);
        }
        return false;
    }

    @Override // fq.d
    public int hashCode() {
        return (((Objects.hash(Integer.valueOf(super.hashCode()), this.f26772l, this.f26773m, this.f26775o) * 31) + Arrays.hashCode(this.f26774n)) * 31) + Arrays.hashCode(this.f26776p);
    }

    @Override // fq.d
    public boolean k() {
        return this.f26775o != null;
    }

    @Override // fq.d
    public Map<String, Object> m() {
        Map<String, Object> m11 = super.m();
        m11.put("crv", this.f26772l.toString());
        m11.put("x", this.f26773m.toString());
        nq.c cVar = this.f26775o;
        if (cVar != null) {
            m11.put("d", cVar.toString());
        }
        return m11;
    }

    public i(a aVar, nq.c cVar, nq.c cVar2, g gVar, Set<com.nimbusds.jose.jwk.a> set, zp.a aVar2, String str, URI uri, nq.c cVar3, nq.c cVar4, List<nq.a> list, KeyStore keyStore) {
        super(f.f26765e, gVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            if (f26771q.contains(aVar)) {
                this.f26772l = aVar;
                if (cVar != null) {
                    this.f26773m = cVar;
                    this.f26774n = cVar.a();
                    if (cVar2 != null) {
                        this.f26775o = cVar2;
                        this.f26776p = cVar2.a();
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' parameter must not be null");
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}