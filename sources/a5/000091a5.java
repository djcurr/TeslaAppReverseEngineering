package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import e50.m0;
import f50.o;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.DSAPrivateKey;
import java.security.interfaces.DSAPublicKey;
import org.bouncycastle.asn1.k;
import org.bouncycastle.util.a;
import r70.d;
import u50.r;
import u50.s;
import v40.b;

/* loaded from: classes5.dex */
public class DSAUtil {
    public static final k[] dsaOids = {o.N0, b.f54052g, o.O0};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String generateKeyFingerprint(BigInteger bigInteger, DSAParams dSAParams) {
        return new d(a.r(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray())).toString();
    }

    public static u50.b generatePrivateKeyParameter(PrivateKey privateKey) {
        if (privateKey instanceof DSAPrivateKey) {
            DSAPrivateKey dSAPrivateKey = (DSAPrivateKey) privateKey;
            return new s(dSAPrivateKey.getX(), new r(dSAPrivateKey.getParams().getP(), dSAPrivateKey.getParams().getQ(), dSAPrivateKey.getParams().getG()));
        }
        throw new InvalidKeyException("can't identify DSA private key.");
    }

    public static u50.b generatePublicKeyParameter(PublicKey publicKey) {
        if (publicKey instanceof BCDSAPublicKey) {
            return ((BCDSAPublicKey) publicKey).engineGetKeyParameters();
        }
        if (publicKey instanceof DSAPublicKey) {
            return new BCDSAPublicKey((DSAPublicKey) publicKey).engineGetKeyParameters();
        }
        try {
            return new BCDSAPublicKey(m0.h(publicKey.getEncoded())).engineGetKeyParameters();
        } catch (Exception unused) {
            throw new InvalidKeyException("can't identify DSA public key: " + publicKey.getClass().getName());
        }
    }

    public static boolean isDsaOid(k kVar) {
        int i11 = 0;
        while (true) {
            k[] kVarArr = dsaOids;
            if (i11 == kVarArr.length) {
                return false;
            }
            if (kVar.j(kVarArr[i11])) {
                return true;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static r toDSAParameters(DSAParams dSAParams) {
        if (dSAParams != null) {
            return new r(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }
}