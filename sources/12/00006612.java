package dq;

import java.math.BigInteger;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* loaded from: classes2.dex */
public class b {
    public static boolean a(BigInteger bigInteger, BigInteger bigInteger2, ECParameterSpec eCParameterSpec) {
        EllipticCurve curve = eCParameterSpec.getCurve();
        BigInteger a11 = curve.getA();
        BigInteger b11 = curve.getB();
        BigInteger p11 = ((ECFieldFp) curve.getField()).getP();
        return bigInteger2.pow(2).mod(p11).equals(bigInteger.pow(3).add(a11.multiply(bigInteger)).add(b11).mod(p11));
    }

    public static boolean b(ECPublicKey eCPublicKey, ECParameterSpec eCParameterSpec) {
        ECPoint w11 = eCPublicKey.getW();
        return a(w11.getAffineX(), w11.getAffineY(), eCParameterSpec);
    }
}