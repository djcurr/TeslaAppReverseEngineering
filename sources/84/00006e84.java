package fq;

import com.nimbusds.jose.JOSEException;
import java.math.BigInteger;
import java.net.URI;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes2.dex */
public final class b extends d {

    /* renamed from: q  reason: collision with root package name */
    public static final Set<fq.a> f26727q = Collections.unmodifiableSet(new HashSet(Arrays.asList(fq.a.f26716c, fq.a.f26717d, fq.a.f26719f, fq.a.f26720g)));

    /* renamed from: l  reason: collision with root package name */
    private final fq.a f26728l;

    /* renamed from: m  reason: collision with root package name */
    private final nq.c f26729m;

    /* renamed from: n  reason: collision with root package name */
    private final nq.c f26730n;

    /* renamed from: o  reason: collision with root package name */
    private final nq.c f26731o;

    /* renamed from: p  reason: collision with root package name */
    private final PrivateKey f26732p;

    public b(fq.a aVar, nq.c cVar, nq.c cVar2, g gVar, Set<com.nimbusds.jose.jwk.a> set, zp.a aVar2, String str, URI uri, nq.c cVar3, nq.c cVar4, List<nq.a> list, KeyStore keyStore) {
        super(f.f26762b, gVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            this.f26728l = aVar;
            if (cVar != null) {
                this.f26729m = cVar;
                if (cVar2 != null) {
                    this.f26730n = cVar2;
                    q(aVar, cVar, cVar2);
                    p(f());
                    this.f26731o = null;
                    this.f26732p = null;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public static nq.c o(int i11, BigInteger bigInteger) {
        byte[] a11 = nq.d.a(bigInteger);
        int i12 = (i11 + 7) / 8;
        if (a11.length >= i12) {
            return nq.c.e(a11);
        }
        byte[] bArr = new byte[i12];
        System.arraycopy(a11, 0, bArr, i12 - a11.length, a11.length);
        return nq.c.e(bArr);
    }

    private void p(List<X509Certificate> list) {
        if (list != null && !u(list.get(0))) {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    private static void q(fq.a aVar, nq.c cVar, nq.c cVar2) {
        if (f26727q.contains(aVar)) {
            if (dq.b.a(cVar.b(), cVar2.b(), aVar.e())) {
                return;
            }
            throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + aVar + " curve");
        }
        throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
    }

    public static b v(String str) {
        return w(nq.j.m(str));
    }

    public static b w(Map<String, Object> map) {
        if (f.f26762b.equals(e.d(map))) {
            try {
                fq.a d11 = fq.a.d(nq.j.h(map, "crv"));
                nq.c a11 = nq.j.a(map, "x");
                nq.c a12 = nq.j.a(map, "y");
                nq.c a13 = nq.j.a(map, "d");
                try {
                    if (a13 == null) {
                        return new b(d11, a11, a12, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
                    }
                    return new b(d11, a11, a12, a13, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), (KeyStore) null);
                } catch (IllegalArgumentException e11) {
                    throw new ParseException(e11.getMessage(), 0);
                }
            } catch (IllegalArgumentException e12) {
                throw new ParseException(e12.getMessage(), 0);
            }
        }
        throw new ParseException("The key type \"kty\" must be EC", 0);
    }

    @Override // fq.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b) && super.equals(obj)) {
            b bVar = (b) obj;
            return Objects.equals(this.f26728l, bVar.f26728l) && Objects.equals(this.f26729m, bVar.f26729m) && Objects.equals(this.f26730n, bVar.f26730n) && Objects.equals(this.f26731o, bVar.f26731o) && Objects.equals(this.f26732p, bVar.f26732p);
        }
        return false;
    }

    @Override // fq.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f26728l, this.f26729m, this.f26730n, this.f26731o, this.f26732p);
    }

    @Override // fq.d
    public boolean k() {
        return (this.f26731o == null && this.f26732p == null) ? false : true;
    }

    @Override // fq.d
    public Map<String, Object> m() {
        Map<String, Object> m11 = super.m();
        m11.put("crv", this.f26728l.toString());
        m11.put("x", this.f26729m.toString());
        m11.put("y", this.f26730n.toString());
        nq.c cVar = this.f26731o;
        if (cVar != null) {
            m11.put("d", cVar.toString());
        }
        return m11;
    }

    public fq.a r() {
        return this.f26728l;
    }

    public nq.c s() {
        return this.f26729m;
    }

    public nq.c t() {
        return this.f26730n;
    }

    public boolean u(X509Certificate x509Certificate) {
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) f().get(0).getPublicKey();
            if (s().b().equals(eCPublicKey.getW().getAffineX())) {
                return t().b().equals(eCPublicKey.getW().getAffineY());
            }
            return false;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public ECPublicKey x() {
        return y(null);
    }

    public ECPublicKey y(Provider provider) {
        KeyFactory keyFactory;
        ECParameterSpec e11 = this.f26728l.e();
        if (e11 != null) {
            ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(new ECPoint(this.f26729m.b(), this.f26730n.b()), e11);
            try {
                if (provider == null) {
                    keyFactory = KeyFactory.getInstance("EC");
                } else {
                    keyFactory = KeyFactory.getInstance("EC", provider);
                }
                return (ECPublicKey) keyFactory.generatePublic(eCPublicKeySpec);
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e12) {
                throw new JOSEException(e12.getMessage(), e12);
            }
        }
        throw new JOSEException("Couldn't get EC parameter spec for curve " + this.f26728l);
    }

    public b z() {
        return new b(r(), s(), t(), e(), c(), a(), b(), j(), i(), h(), g(), d());
    }

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final fq.a f26733a;

        /* renamed from: b  reason: collision with root package name */
        private final nq.c f26734b;

        /* renamed from: c  reason: collision with root package name */
        private final nq.c f26735c;

        /* renamed from: d  reason: collision with root package name */
        private nq.c f26736d;

        /* renamed from: e  reason: collision with root package name */
        private PrivateKey f26737e;

        /* renamed from: f  reason: collision with root package name */
        private g f26738f;

        /* renamed from: g  reason: collision with root package name */
        private Set<com.nimbusds.jose.jwk.a> f26739g;

        /* renamed from: h  reason: collision with root package name */
        private zp.a f26740h;

        /* renamed from: i  reason: collision with root package name */
        private String f26741i;

        /* renamed from: j  reason: collision with root package name */
        private URI f26742j;
        @Deprecated

        /* renamed from: k  reason: collision with root package name */
        private nq.c f26743k;

        /* renamed from: l  reason: collision with root package name */
        private nq.c f26744l;

        /* renamed from: m  reason: collision with root package name */
        private List<nq.a> f26745m;

        /* renamed from: n  reason: collision with root package name */
        private KeyStore f26746n;

        public a(fq.a aVar, nq.c cVar, nq.c cVar2) {
            if (aVar != null) {
                this.f26733a = aVar;
                if (cVar != null) {
                    this.f26734b = cVar;
                    if (cVar2 != null) {
                        this.f26735c = cVar2;
                        return;
                    }
                    throw new IllegalArgumentException("The 'y' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'x' coordinate must not be null");
            }
            throw new IllegalArgumentException("The curve must not be null");
        }

        public b a() {
            try {
                if (this.f26736d == null && this.f26737e == null) {
                    return new b(this.f26733a, this.f26734b, this.f26735c, this.f26738f, this.f26739g, this.f26740h, this.f26741i, this.f26742j, this.f26743k, this.f26744l, this.f26745m, this.f26746n);
                }
                if (this.f26737e != null) {
                    return new b(this.f26733a, this.f26734b, this.f26735c, this.f26737e, this.f26738f, this.f26739g, this.f26740h, this.f26741i, this.f26742j, this.f26743k, this.f26744l, this.f26745m, this.f26746n);
                }
                return new b(this.f26733a, this.f26734b, this.f26735c, this.f26736d, this.f26738f, this.f26739g, this.f26740h, this.f26741i, this.f26742j, this.f26743k, this.f26744l, this.f26745m, this.f26746n);
            } catch (IllegalArgumentException e11) {
                throw new IllegalStateException(e11.getMessage(), e11);
            }
        }

        public a b(String str) {
            this.f26741i = str;
            return this;
        }

        public a c(g gVar) {
            this.f26738f = gVar;
            return this;
        }

        public a(fq.a aVar, ECPublicKey eCPublicKey) {
            this(aVar, b.o(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), b.o(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()));
        }
    }

    public b(fq.a aVar, nq.c cVar, nq.c cVar2, nq.c cVar3, g gVar, Set<com.nimbusds.jose.jwk.a> set, zp.a aVar2, String str, URI uri, nq.c cVar4, nq.c cVar5, List<nq.a> list, KeyStore keyStore) {
        super(f.f26762b, gVar, set, aVar2, str, uri, cVar4, cVar5, list, keyStore);
        if (aVar != null) {
            this.f26728l = aVar;
            if (cVar != null) {
                this.f26729m = cVar;
                if (cVar2 != null) {
                    this.f26730n = cVar2;
                    q(aVar, cVar, cVar2);
                    p(f());
                    if (cVar3 != null) {
                        this.f26731o = cVar3;
                        this.f26732p = null;
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public b(fq.a aVar, nq.c cVar, nq.c cVar2, PrivateKey privateKey, g gVar, Set<com.nimbusds.jose.jwk.a> set, zp.a aVar2, String str, URI uri, nq.c cVar3, nq.c cVar4, List<nq.a> list, KeyStore keyStore) {
        super(f.f26762b, gVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            this.f26728l = aVar;
            if (cVar != null) {
                this.f26729m = cVar;
                if (cVar2 != null) {
                    this.f26730n = cVar2;
                    q(aVar, cVar, cVar2);
                    p(f());
                    this.f26731o = null;
                    this.f26732p = privateKey;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}