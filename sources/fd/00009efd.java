package org.spongycastle.jcajce.provider.asymmetric.util;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.EllipticCurve;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.x9.ECNamedCurveTable;
import org.spongycastle.asn1.x9.X962Parameters;
import org.spongycastle.asn1.x9.X9ECParameters;
import org.spongycastle.crypto.ec.CustomNamedCurves;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.jcajce.provider.config.ProviderConfiguration;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.jce.spec.ECNamedCurveParameterSpec;
import org.spongycastle.jce.spec.ECNamedCurveSpec;
import org.spongycastle.math.ec.ECAlgorithms;
import org.spongycastle.math.ec.ECCurve;
import org.spongycastle.math.ec.ECPoint;
import org.spongycastle.math.field.FiniteField;
import org.spongycastle.math.field.Polynomial;
import org.spongycastle.math.field.PolynomialExtensionField;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class EC5Util {
    private static Map customCurves = new HashMap();

    static {
        Enumeration names = CustomNamedCurves.getNames();
        while (names.hasMoreElements()) {
            String str = (String) names.nextElement();
            X9ECParameters byName = ECNamedCurveTable.getByName(str);
            if (byName != null) {
                customCurves.put(byName.getCurve(), CustomNamedCurves.getByName(str).getCurve());
            }
        }
        X9ECParameters byName2 = CustomNamedCurves.getByName("Curve25519");
        customCurves.put(new ECCurve.Fp(byName2.getCurve().getField().getCharacteristic(), byName2.getCurve().getA().toBigInteger(), byName2.getCurve().getB().toBigInteger()), byName2.getCurve());
    }

    public static EllipticCurve convertCurve(ECCurve eCCurve, byte[] bArr) {
        return new EllipticCurve(convertField(eCCurve.getField()), eCCurve.getA().toBigInteger(), eCCurve.getB().toBigInteger(), null);
    }

    public static ECField convertField(FiniteField finiteField) {
        if (ECAlgorithms.isFpField(finiteField)) {
            return new ECFieldFp(finiteField.getCharacteristic());
        }
        Polynomial minimalPolynomial = ((PolynomialExtensionField) finiteField).getMinimalPolynomial();
        int[] exponentsPresent = minimalPolynomial.getExponentsPresent();
        return new ECFieldF2m(minimalPolynomial.getDegree(), Arrays.reverse(Arrays.copyOfRange(exponentsPresent, 1, exponentsPresent.length - 1)));
    }

    public static ECPoint convertPoint(ECParameterSpec eCParameterSpec, java.security.spec.ECPoint eCPoint, boolean z11) {
        return convertPoint(convertCurve(eCParameterSpec.getCurve()), eCPoint, z11);
    }

    public static ECParameterSpec convertSpec(EllipticCurve ellipticCurve, org.spongycastle.jce.spec.ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec instanceof ECNamedCurveParameterSpec) {
            return new ECNamedCurveSpec(((ECNamedCurveParameterSpec) eCParameterSpec).getName(), ellipticCurve, new java.security.spec.ECPoint(eCParameterSpec.getG().getAffineXCoord().toBigInteger(), eCParameterSpec.getG().getAffineYCoord().toBigInteger()), eCParameterSpec.getN(), eCParameterSpec.getH());
        }
        return new ECParameterSpec(ellipticCurve, new java.security.spec.ECPoint(eCParameterSpec.getG().getAffineXCoord().toBigInteger(), eCParameterSpec.getG().getAffineYCoord().toBigInteger()), eCParameterSpec.getN(), eCParameterSpec.getH().intValue());
    }

    public static ECParameterSpec convertToSpec(X962Parameters x962Parameters, ECCurve eCCurve) {
        ECParameterSpec eCParameterSpec;
        if (x962Parameters.isNamedCurve()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) x962Parameters.getParameters();
            X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid == null) {
                Map additionalECParameters = BouncyCastleProvider.CONFIGURATION.getAdditionalECParameters();
                if (!additionalECParameters.isEmpty()) {
                    namedCurveByOid = (X9ECParameters) additionalECParameters.get(aSN1ObjectIdentifier);
                }
            }
            return new ECNamedCurveSpec(ECUtil.getCurveName(aSN1ObjectIdentifier), convertCurve(eCCurve, namedCurveByOid.getSeed()), new java.security.spec.ECPoint(namedCurveByOid.getG().getAffineXCoord().toBigInteger(), namedCurveByOid.getG().getAffineYCoord().toBigInteger()), namedCurveByOid.getN(), namedCurveByOid.getH());
        } else if (x962Parameters.isImplicitlyCA()) {
            return null;
        } else {
            X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
            EllipticCurve convertCurve = convertCurve(eCCurve, x9ECParameters.getSeed());
            if (x9ECParameters.getH() != null) {
                eCParameterSpec = new ECParameterSpec(convertCurve, new java.security.spec.ECPoint(x9ECParameters.getG().getAffineXCoord().toBigInteger(), x9ECParameters.getG().getAffineYCoord().toBigInteger()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
            } else {
                eCParameterSpec = new ECParameterSpec(convertCurve, new java.security.spec.ECPoint(x9ECParameters.getG().getAffineXCoord().toBigInteger(), x9ECParameters.getG().getAffineYCoord().toBigInteger()), x9ECParameters.getN(), 1);
            }
            return eCParameterSpec;
        }
    }

    public static ECCurve getCurve(ProviderConfiguration providerConfiguration, X962Parameters x962Parameters) {
        Set acceptableNamedCurves = providerConfiguration.getAcceptableNamedCurves();
        if (x962Parameters.isNamedCurve()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(x962Parameters.getParameters());
            if (!acceptableNamedCurves.isEmpty() && !acceptableNamedCurves.contains(aSN1ObjectIdentifier)) {
                throw new IllegalStateException("named curve not acceptable");
            }
            X9ECParameters namedCurveByOid = ECUtil.getNamedCurveByOid(aSN1ObjectIdentifier);
            if (namedCurveByOid == null) {
                namedCurveByOid = (X9ECParameters) providerConfiguration.getAdditionalECParameters().get(aSN1ObjectIdentifier);
            }
            return namedCurveByOid.getCurve();
        } else if (x962Parameters.isImplicitlyCA()) {
            return providerConfiguration.getEcImplicitlyCa().getCurve();
        } else {
            if (acceptableNamedCurves.isEmpty()) {
                return X9ECParameters.getInstance(x962Parameters.getParameters()).getCurve();
            }
            throw new IllegalStateException("encoded parameters not acceptable");
        }
    }

    public static ECDomainParameters getDomainParameters(ProviderConfiguration providerConfiguration, ECParameterSpec eCParameterSpec) {
        if (eCParameterSpec == null) {
            org.spongycastle.jce.spec.ECParameterSpec ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return new ECDomainParameters(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getG(), ecImplicitlyCa.getN(), ecImplicitlyCa.getH(), ecImplicitlyCa.getSeed());
        }
        return ECUtil.getDomainParameters(providerConfiguration, convertSpec(eCParameterSpec, false));
    }

    public static ECPoint convertPoint(ECCurve eCCurve, java.security.spec.ECPoint eCPoint, boolean z11) {
        return eCCurve.createPoint(eCPoint.getAffineX(), eCPoint.getAffineY());
    }

    public static ECCurve convertCurve(EllipticCurve ellipticCurve) {
        ECField field = ellipticCurve.getField();
        BigInteger a11 = ellipticCurve.getA();
        BigInteger b11 = ellipticCurve.getB();
        if (field instanceof ECFieldFp) {
            ECCurve.Fp fp2 = new ECCurve.Fp(((ECFieldFp) field).getP(), a11, b11);
            return customCurves.containsKey(fp2) ? (ECCurve) customCurves.get(fp2) : fp2;
        }
        ECFieldF2m eCFieldF2m = (ECFieldF2m) field;
        int m11 = eCFieldF2m.getM();
        int[] convertMidTerms = ECUtil.convertMidTerms(eCFieldF2m.getMidTermsOfReductionPolynomial());
        return new ECCurve.F2m(m11, convertMidTerms[0], convertMidTerms[1], convertMidTerms[2], a11, b11);
    }

    public static org.spongycastle.jce.spec.ECParameterSpec convertSpec(ECParameterSpec eCParameterSpec, boolean z11) {
        ECCurve convertCurve = convertCurve(eCParameterSpec.getCurve());
        return new org.spongycastle.jce.spec.ECParameterSpec(convertCurve, convertPoint(convertCurve, eCParameterSpec.getGenerator(), z11), eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor()), eCParameterSpec.getCurve().getSeed());
    }

    public static ECParameterSpec convertToSpec(X9ECParameters x9ECParameters) {
        return new ECParameterSpec(convertCurve(x9ECParameters.getCurve(), null), new java.security.spec.ECPoint(x9ECParameters.getG().getAffineXCoord().toBigInteger(), x9ECParameters.getG().getAffineYCoord().toBigInteger()), x9ECParameters.getN(), x9ECParameters.getH().intValue());
    }
}