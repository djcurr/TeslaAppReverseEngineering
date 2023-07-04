package l70;

import e50.m0;
import java.security.InvalidKeyException;
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
import w60.f;
import w60.g;

/* loaded from: classes5.dex */
public class c extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof p70.a) {
            return new a((p70.a) keySpec);
        }
        if (keySpec instanceof PKCS8EncodedKeySpec) {
            try {
                return generatePrivate(p.f(n.k(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
            } catch (Exception e11) {
                throw new InvalidKeySpecException(e11.toString());
            }
        }
        throw new InvalidKeySpecException("Unsupported key specification: " + keySpec.getClass() + ".");
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (keySpec instanceof p70.b) {
            return new b((p70.b) keySpec);
        }
        if (keySpec instanceof X509EncodedKeySpec) {
            try {
                return generatePublic(m0.h(((X509EncodedKeySpec) keySpec).getEncoded()));
            } catch (Exception e11) {
                throw new InvalidKeySpecException(e11.toString());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + keySpec + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof a) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
            if (p70.a.class.isAssignableFrom(cls)) {
                a aVar = (a) key;
                return new p70.a(aVar.c(), aVar.a(), aVar.d(), aVar.b(), aVar.f(), aVar.e());
            }
        } else if (!(key instanceof b)) {
            throw new InvalidKeySpecException("Unsupported key type: " + key.getClass() + ".");
        } else if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
            return new X509EncodedKeySpec(key.getEncoded());
        } else {
            if (p70.b.class.isAssignableFrom(cls)) {
                b bVar = (b) key;
                return new p70.b(bVar.d(), bVar.a(), bVar.c(), bVar.b());
            }
        }
        throw new InvalidKeySpecException("Unknown key specification: " + cls + ".");
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if ((key instanceof a) || (key instanceof b)) {
            return key;
        }
        throw new InvalidKeyException("Unsupported key type");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(p pVar) {
        f h11 = f.h(pVar.n());
        return new a(h11.i(), h11.e(), h11.j(), h11.f(), h11.m(), h11.k());
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(m0 m0Var) {
        g j11 = g.j(m0Var.j());
        return new b(j11.i(), j11.e(), j11.h(), j11.f());
    }
}