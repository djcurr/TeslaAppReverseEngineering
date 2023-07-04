package i70;

import e50.m0;
import java.io.IOException;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.n;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import w40.p;

/* loaded from: classes5.dex */
public class f extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // java.security.KeyFactorySpi
    protected PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            p f11 = p.f(n.k(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (w60.e.f55680c.j(f11.i().e())) {
                    w60.c h11 = w60.c.h(f11.n());
                    return new c(new y60.f(h11.j(), h11.i(), h11.e(), h11.f(), h11.k(), h11.m(), h11.n()));
                }
                throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
            } catch (IOException unused) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
            }
        } catch (IOException e11) {
            throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec: " + e11);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
        }
        try {
            m0 h11 = m0.h(n.k(((X509EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (w60.e.f55680c.j(h11.e().e())) {
                    w60.d f11 = w60.d.f(h11.j());
                    return new d(new y60.g(f11.h(), f11.i(), f11.e()));
                }
                throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
            } catch (IOException e11) {
                throw new InvalidKeySpecException("Unable to decode X509EncodedKeySpec: " + e11.getMessage());
            }
        } catch (IOException e12) {
            throw new InvalidKeySpecException(e12.toString());
        }
    }

    @Override // java.security.KeyFactorySpi
    protected KeySpec engineGetKeySpec(Key key, Class cls) {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(p pVar) {
        w60.c h11 = w60.c.h(pVar.n().toASN1Primitive());
        return new c(new y60.f(h11.j(), h11.i(), h11.e(), h11.f(), h11.k(), h11.m(), h11.n()));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(m0 m0Var) {
        w60.d f11 = w60.d.f(m0Var.j());
        return new d(new y60.g(f11.h(), f11.i(), f11.e()));
    }
}