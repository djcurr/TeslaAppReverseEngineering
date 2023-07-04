package l60;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;

/* loaded from: classes5.dex */
public class d extends ECParameterSpec {

    /* renamed from: a  reason: collision with root package name */
    private String f37060a;

    public d(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.f37060a = str;
    }

    public d(String str, n60.e eVar, n60.i iVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(a(eVar, bArr), EC5Util.convertPoint(iVar), bigInteger, bigInteger2.intValue());
        this.f37060a = str;
    }

    private static EllipticCurve a(n60.e eVar, byte[] bArr) {
        return new EllipticCurve(b(eVar.s()), eVar.n().t(), eVar.o().t(), bArr);
    }

    private static ECField b(u60.a aVar) {
        if (n60.c.o(aVar)) {
            return new ECFieldFp(aVar.getCharacteristic());
        }
        u60.e minimalPolynomial = ((u60.f) aVar).getMinimalPolynomial();
        int[] exponentsPresent = minimalPolynomial.getExponentsPresent();
        return new ECFieldF2m(minimalPolynomial.getDegree(), org.bouncycastle.util.a.R(org.bouncycastle.util.a.x(exponentsPresent, 1, exponentsPresent.length - 1)));
    }

    public String c() {
        return this.f37060a;
    }
}