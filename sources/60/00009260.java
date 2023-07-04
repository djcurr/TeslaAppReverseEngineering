package org.bouncycastle.jcajce.provider.asymmetric.edec;

import e50.m0;
import h60.m;
import h60.n;
import h60.p;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.l;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.util.a;
import org.bouncycastle.util.encoders.b;
import org.spongycastle.asn1.ASN1Encoding;
import u50.g0;
import u50.h0;
import u50.k0;
import u50.t1;
import u50.w1;
import z50.c;

/* loaded from: classes5.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    private static final byte Ed25519_type = 112;
    private static final byte Ed448_type = 113;
    private static final byte x25519_type = 110;
    private static final byte x448_type = 111;
    String algorithm;
    private final boolean isXdh;
    private final int specificBase;
    static final byte[] x448Prefix = b.a("3042300506032b656f033900");
    static final byte[] x25519Prefix = b.a("302a300506032b656e032100");
    static final byte[] Ed448Prefix = b.a("3043300506032b6571033a00");
    static final byte[] Ed25519Prefix = b.a("302a300506032b6570032100");

    /* loaded from: classes5.dex */
    public static class Ed25519 extends KeyFactorySpi {
        public Ed25519() {
            super("Ed25519", false, 112);
        }
    }

    /* loaded from: classes5.dex */
    public static class Ed448 extends KeyFactorySpi {
        public Ed448() {
            super("Ed448", false, 113);
        }
    }

    /* loaded from: classes5.dex */
    public static class EdDSA extends KeyFactorySpi {
        public EdDSA() {
            super("EdDSA", false, 0);
        }
    }

    /* loaded from: classes5.dex */
    public static class X25519 extends KeyFactorySpi {
        public X25519() {
            super("X25519", true, 110);
        }
    }

    /* loaded from: classes5.dex */
    public static class X448 extends KeyFactorySpi {
        public X448() {
            super("X448", true, 111);
        }
    }

    /* loaded from: classes5.dex */
    public static class XDH extends KeyFactorySpi {
        public XDH() {
            super("XDH", true, 0);
        }
    }

    public KeyFactorySpi(String str, boolean z11, int i11) {
        this.algorithm = str;
        this.isXdh = z11;
        this.specificBase = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof m) {
            u50.b c11 = z50.b.c(((m) keySpec).getEncoded());
            if (c11 instanceof g0) {
                return new BCEdDSAPrivateKey((g0) c11);
            }
            throw new IllegalStateException("openssh private key not Ed25519 private key");
        }
        return super.engineGeneratePrivate(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof X509EncodedKeySpec) {
            byte[] encoded = ((X509EncodedKeySpec) keySpec).getEncoded();
            int i11 = this.specificBase;
            if (i11 == 0 || i11 == encoded[8]) {
                if (encoded[9] == 5 && encoded[10] == 0) {
                    m0 h11 = m0.h(encoded);
                    try {
                        encoded = new m0(new e50.b(h11.e().e()), h11.i().q()).d(ASN1Encoding.DER);
                    } catch (IOException e11) {
                        throw new InvalidKeySpecException("attempt to reconstruct key failed: " + e11.getMessage());
                    }
                }
                switch (encoded[8]) {
                    case 110:
                        return new BCXDHPublicKey(x25519Prefix, encoded);
                    case 111:
                        return new BCXDHPublicKey(x448Prefix, encoded);
                    case 112:
                        return new BCEdDSAPublicKey(Ed25519Prefix, encoded);
                    case 113:
                        return new BCEdDSAPublicKey(Ed448Prefix, encoded);
                    default:
                        return super.engineGeneratePublic(keySpec);
                }
            }
        } else if (keySpec instanceof p) {
            byte[] encoded2 = ((p) keySpec).getEncoded();
            switch (this.specificBase) {
                case 110:
                    return new BCXDHPublicKey(new t1(encoded2));
                case 111:
                    return new BCXDHPublicKey(new w1(encoded2));
                case 112:
                    return new BCEdDSAPublicKey(new h0(encoded2));
                case 113:
                    return new BCEdDSAPublicKey(new k0(encoded2));
                default:
                    throw new InvalidKeySpecException("factory not a specific type, cannot recognise raw encoding");
            }
        } else if (keySpec instanceof n) {
            u50.b c11 = c.c(((n) keySpec).getEncoded());
            if (c11 instanceof h0) {
                return new BCEdDSAPublicKey(new byte[0], ((h0) c11).getEncoded());
            }
            throw new IllegalStateException("openssh public key not Ed25519 public key");
        }
        return super.engineGeneratePublic(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(m.class) && (key instanceof BCEdDSAPrivateKey)) {
            try {
                return new m(z50.b.b(new g0(l.p(org.bouncycastle.asn1.n.k(l.p(org.bouncycastle.asn1.p.p(key.getEncoded()).r(2)).r())).r())));
            } catch (IOException e11) {
                throw new InvalidKeySpecException(e11.getMessage(), e11.getCause());
            }
        } else if (!cls.isAssignableFrom(n.class) || !(key instanceof BCEdDSAPublicKey)) {
            if (cls.isAssignableFrom(p.class)) {
                if (key instanceof f60.c) {
                    return new p(((f60.c) key).getUEncoding());
                }
                if (key instanceof f60.b) {
                    return new p(((f60.b) key).getPointEncoding());
                }
            }
            return super.engineGetKeySpec(key, cls);
        } else {
            try {
                byte[] encoded = key.getEncoded();
                byte[] bArr = Ed25519Prefix;
                if (a.b(bArr, 0, bArr.length, encoded, 0, encoded.length - 32)) {
                    return new n(c.a(new h0(encoded, bArr.length)));
                }
                throw new InvalidKeySpecException("Invalid Ed25519 public key encoding");
            } catch (IOException e12) {
                throw new InvalidKeySpecException(e12.getMessage(), e12.getCause());
            }
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        throw new InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(w40.p pVar) {
        k e11 = pVar.i().e();
        if (this.isXdh) {
            int i11 = this.specificBase;
            if ((i11 == 0 || i11 == 111) && e11.j(j40.a.f33206c)) {
                return new BCXDHPrivateKey(pVar);
            }
            int i12 = this.specificBase;
            if ((i12 == 0 || i12 == 110) && e11.j(j40.a.f33205b)) {
                return new BCXDHPrivateKey(pVar);
            }
        } else {
            k kVar = j40.a.f33208e;
            if (e11.j(kVar) || e11.j(j40.a.f33207d)) {
                int i13 = this.specificBase;
                if ((i13 == 0 || i13 == 113) && e11.j(kVar)) {
                    return new BCEdDSAPrivateKey(pVar);
                }
                int i14 = this.specificBase;
                if ((i14 == 0 || i14 == 112) && e11.j(j40.a.f33207d)) {
                    return new BCEdDSAPrivateKey(pVar);
                }
            }
        }
        throw new IOException("algorithm identifier " + e11 + " in key not recognized");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(m0 m0Var) {
        k e11 = m0Var.e().e();
        if (this.isXdh) {
            int i11 = this.specificBase;
            if ((i11 == 0 || i11 == 111) && e11.j(j40.a.f33206c)) {
                return new BCXDHPublicKey(m0Var);
            }
            int i12 = this.specificBase;
            if ((i12 == 0 || i12 == 110) && e11.j(j40.a.f33205b)) {
                return new BCXDHPublicKey(m0Var);
            }
        } else {
            k kVar = j40.a.f33208e;
            if (e11.j(kVar) || e11.j(j40.a.f33207d)) {
                int i13 = this.specificBase;
                if ((i13 == 0 || i13 == 113) && e11.j(kVar)) {
                    return new BCEdDSAPublicKey(m0Var);
                }
                int i14 = this.specificBase;
                if ((i14 == 0 || i14 == 112) && e11.j(j40.a.f33207d)) {
                    return new BCEdDSAPublicKey(m0Var);
                }
            }
        }
        throw new IOException("algorithm identifier " + e11 + " in key not recognized");
    }
}