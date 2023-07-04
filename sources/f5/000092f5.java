package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import k60.i;
import k60.j;
import l60.n;
import u50.b;
import u50.t0;
import u50.u0;
import u50.v0;

/* loaded from: classes5.dex */
public class GOST3410Util {
    public static b generatePrivateKeyParameter(PrivateKey privateKey) {
        if (privateKey instanceof i) {
            i iVar = (i) privateKey;
            n publicKeyParameters = iVar.getParameters().getPublicKeyParameters();
            return new u0(iVar.getX(), new t0(publicKeyParameters.b(), publicKeyParameters.c(), publicKeyParameters.a()));
        }
        throw new InvalidKeyException("can't identify GOST3410 private key.");
    }

    public static b generatePublicKeyParameter(PublicKey publicKey) {
        if (publicKey instanceof j) {
            j jVar = (j) publicKey;
            n publicKeyParameters = jVar.getParameters().getPublicKeyParameters();
            return new v0(jVar.getY(), new t0(publicKeyParameters.b(), publicKeyParameters.c(), publicKeyParameters.a()));
        }
        throw new InvalidKeyException("can't identify GOST3410 public key: " + publicKey.getClass().getName());
    }
}