package org.bouncycastle.jcajce.provider.asymmetric.util;

import f50.d;
import f50.g;
import f50.i;
import i40.b;
import j50.a;
import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import n60.c;
import n60.e;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import u50.y;
import u60.f;

/* loaded from: classes5.dex */
public class EC5Util {
    private static Map customCurves = new HashMap();

    static {
        Enumeration l11 = a.l();
        while (l11.hasMoreElements()) {
            String str = (String) l11.nextElement();
            i b11 = d.b(str);
            if (b11 != null) {
                customCurves.put(b11.e(), a.i(str).e());
            }
        }
        e e11 = a.i("Curve25519").e();
        customCurves.put(new e.f(e11.s().getCharacteristic(), e11.n().t(), e11.o().t(), e11.w(), e11.p()), e11);
    }

    public static EllipticCurve convertCurve(e eVar, byte[] bArr) {
        return new EllipticCurve(convertField(eVar.s()), eVar.n().t(), eVar.o().t(), null);
    }

    public static e convertCurve(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a11 = ellipticCurve.getA();
        BigInteger b11 = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            e.f fVar = new e.f(((ECFieldFp) field).getP(), a11, b11);
            return customCurves.containsKey(fVar) ? (e) customCurves.get(fVar) : fVar;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m11 = eCFieldF2m.getM();
        int[] convertMidTerms = ECUtil.convertMidTerms(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new e.C0796e(m11, convertMidTerms[0], convertMidTerms[1], convertMidTerms[2], a11, b11);
    }

    public static ECField convertField(u60.a aVar) {
        if (c.o(aVar)) {
            return new ECFieldFp(aVar.getCharacteristic());
        }
        u60.e minimalPolynomial = ((f) aVar).getMinimalPolynomial();
        int[] exponentsPresent = minimalPolynomial.getExponentsPresent();
        return new ECFieldF2m(minimalPolynomial.getDegree(), org.bouncycastle.util.a.R(org.bouncycastle.util.a.x(exponentsPresent, 1, exponentsPresent.length - 1)));
    }

    public static ECPoint convertPoint(n60.i iVar) {
        n60.i A = iVar.A();
        return new ECPoint(A.f().t(), A.g().t());
    }

    public static n60.i convertPoint(ECParameterSpec eCParameterSpec, ECPoint eCPoint) {
        return convertPoint(convertCurve(eCParameterSpec.getCurve()), eCPoint);
    }

    public static n60.i convertPoint(e eVar, ECPoint eCPoint) {
        return eVar.g(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static ECParameterSpec convertSpec(EllipticCurve ellipticCurve, l60.e eVar) {
        ECPoint convertPoint = convertPoint(eVar.b());
        return eVar instanceof l60.c ? new l60.d(((l60.c) eVar).f(), ellipticCurve, convertPoint, eVar.d(), eVar.c()) : new ECParameterSpec(ellipticCurve, convertPoint, eVar.d(), eVar.c().intValue());
    }

    public static l60.e convertSpec(ECParameterSpec eCParameterSpec) {
        e convertCurve = convertCurve(eCParameterSpec.getCurve());
        n60.i convertPoint = convertPoint(convertCurve, eCParameterSpec.getGenerator());
        BigInteger order = eCParameterSpec.getOrder();
        BigInteger valueOf = BigInteger.valueOf(eCParameterSpec.getCofactor());
        byte[] seed = eCParameterSpec.getCurve().getSeed();
        return eCParameterSpec instanceof l60.d ? new l60.c(((l60.d) eCParameterSpec).c(), convertCurve, convertPoint, order, valueOf, seed) : new l60.e(convertCurve, convertPoint, order, valueOf, seed);
    }

    public static ECParameterSpec convertToSpec(g gVar, e eVar) {
        ECParameterSpec dVar;
        if (gVar.i()) {
            k kVar = (k) gVar.f();
            i namedCurveByOid = ECUtil.getNamedCurveByOid(kVar);
            if (namedCurveByOid == null) {
                Map additionalECParameters = BouncyCastleProvider.CONFIGURATION.getAdditionalECParameters();
                if (!additionalECParameters.isEmpty()) {
                    namedCurveByOid = (i) additionalECParameters.get(kVar);
                }
            }
            return new l60.d(ECUtil.getCurveName(kVar), convertCurve(eVar, namedCurveByOid.k()), convertPoint(namedCurveByOid.f()), namedCurveByOid.j(), namedCurveByOid.h());
        } else if (gVar.h()) {
            return null;
        } else {
            p p11 = p.p(gVar.f());
            if (p11.size() > 3) {
                i i11 = i.i(p11);
                EllipticCurve convertCurve = convertCurve(eVar, i11.k());
                dVar = i11.h() != null ? new ECParameterSpec(convertCurve, convertPoint(i11.f()), i11.j(), i11.h().intValue()) : new ECParameterSpec(convertCurve, convertPoint(i11.f()), i11.j(), 1);
            } else {
                i40.f h11 = i40.f.h(p11);
                l60.c a11 = j60.a.a(b.g(h11.i()));
                dVar = new l60.d(b.g(h11.i()), convertCurve(a11.a(), a11.e()), convertPoint(a11.b()), a11.d(), a11.c());
            }
            return dVar;
        }
    }

    public static ECParameterSpec convertToSpec(i iVar) {
        return new ECParameterSpec(convertCurve(iVar.e(), null), convertPoint(iVar.f()), iVar.j(), iVar.h().intValue());
    }

    public static ECParameterSpec convertToSpec(y yVar) {
        return new ECParameterSpec(convertCurve(yVar.a(), null), convertPoint(yVar.b()), yVar.e(), yVar.c().intValue());
    }

    public static e getCurve(ProviderConfiguration providerConfiguration, g gVar) {
        Set acceptableNamedCurves = providerConfiguration.getAcceptableNamedCurves();
        if (!gVar.i()) {
            if (gVar.h()) {
                return providerConfiguration.getEcImplicitlyCa().a();
            }
            p p11 = p.p(gVar.f());
            if (acceptableNamedCurves.isEmpty()) {
                return (p11.size() > 3 ? i.i(p11) : b.f(k.u(p11.r(0)))).e();
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
        k u11 = k.u(gVar.f());
        if (acceptableNamedCurves.isEmpty() || acceptableNamedCurves.contains(u11)) {
            i namedCurveByOid = ECUtil.getNamedCurveByOid(u11);
            if (namedCurveByOid == null) {
                namedCurveByOid = (i) providerConfiguration.getAdditionalECParameters().get(u11);
            }
            return namedCurveByOid.e();
        }
        throw new IllegalStateException("named curve not acceptable");
    }

    public static y getDomainParameters(ProviderConfiguration providerConfiguration, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec == null) {
            l60.e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return new y(ecImplicitlyCa.a(), ecImplicitlyCa.b(), ecImplicitlyCa.d(), ecImplicitlyCa.c(), ecImplicitlyCa.e());
        }
        return ECUtil.getDomainParameters(providerConfiguration, convertSpec(eCParameterSpec));
    }
}