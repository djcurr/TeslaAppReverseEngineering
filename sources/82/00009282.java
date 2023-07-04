package org.bouncycastle.jcajce.provider.asymmetric.gost;

import e50.m0;
import i40.a;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.KeySpec;
import k60.i;
import k60.j;
import l60.m;
import l60.n;
import l60.o;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import w40.p;

/* loaded from: classes5.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        return keySpec instanceof m ? new BCGOST3410PrivateKey((m) keySpec) : super.engineGeneratePrivate(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        return keySpec instanceof o ? new BCGOST3410PublicKey((o) keySpec) : super.engineGeneratePublic(keySpec);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        if (cls.isAssignableFrom(o.class) && (key instanceof j)) {
            j jVar = (j) key;
            n publicKeyParameters = jVar.getParameters().getPublicKeyParameters();
            return new o(jVar.getY(), publicKeyParameters.b(), publicKeyParameters.c(), publicKeyParameters.a());
        } else if (cls.isAssignableFrom(m.class) && (key instanceof i)) {
            i iVar = (i) key;
            n publicKeyParameters2 = iVar.getParameters().getPublicKeyParameters();
            return new m(iVar.getX(), publicKeyParameters2.b(), publicKeyParameters2.c(), publicKeyParameters2.a());
        } else {
            return super.engineGetKeySpec(key, cls);
        }
    }

    @Override // java.security.KeyFactorySpi
    protected Key engineTranslateKey(Key key) {
        if (key instanceof j) {
            return new BCGOST3410PublicKey((j) key);
        }
        if (key instanceof i) {
            return new BCGOST3410PrivateKey((i) key);
        }
        throw new InvalidKeyException("key type unknown");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(p pVar) {
        k e11 = pVar.i().e();
        if (e11.j(a.f29849l)) {
            return new BCGOST3410PrivateKey(pVar);
        }
        throw new IOException("algorithm identifier " + e11 + " in key not recognised");
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(m0 m0Var) {
        k e11 = m0Var.e().e();
        if (e11.j(a.f29849l)) {
            return new BCGOST3410PublicKey(m0Var);
        }
        throw new IOException("algorithm identifier " + e11 + " in key not recognised");
    }
}