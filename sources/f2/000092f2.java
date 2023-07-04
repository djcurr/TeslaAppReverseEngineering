package org.bouncycastle.jcajce.provider.asymmetric.util;

import e50.m0;
import f50.g;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Enumeration;
import l60.c;
import l60.e;
import n60.i;
import org.bouncycastle.asn1.k;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.a;
import r70.d;
import r70.m;
import u50.b;
import u50.c0;
import u50.d0;
import u50.e0;
import u50.y;
import w40.p;

/* loaded from: classes5.dex */
public class ECUtil {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] convertMidTerms(int[] iArr) {
        int[] iArr2 = new int[3];
        if (iArr.length == 1) {
            iArr2[0] = iArr[0];
        } else if (iArr.length != 3) {
            throw new IllegalArgumentException("Only Trinomials and pentanomials supported");
        } else {
            if (iArr[0] < iArr[1] && iArr[0] < iArr[2]) {
                iArr2[0] = iArr[0];
                if (iArr[1] < iArr[2]) {
                    iArr2[1] = iArr[1];
                    iArr2[2] = iArr[2];
                } else {
                    iArr2[1] = iArr[2];
                    iArr2[2] = iArr[1];
                }
            } else if (iArr[1] < iArr[2]) {
                iArr2[0] = iArr[1];
                if (iArr[0] < iArr[2]) {
                    iArr2[1] = iArr[0];
                    iArr2[2] = iArr[2];
                } else {
                    iArr2[1] = iArr[2];
                    iArr2[2] = iArr[0];
                }
            } else {
                iArr2[0] = iArr[2];
                if (iArr[0] < iArr[1]) {
                    iArr2[1] = iArr[0];
                    iArr2[2] = iArr[1];
                } else {
                    iArr2[1] = iArr[1];
                    iArr2[2] = iArr[0];
                }
            }
        }
        return iArr2;
    }

    public static String generateKeyFingerprint(i iVar, e eVar) {
        n60.e a11 = eVar.a();
        return a11 != null ? new d(a.r(iVar.l(false), a11.n().e(), a11.o().e(), eVar.b().l(false))).toString() : new d(iVar.l(false)).toString();
    }

    public static b generatePrivateKeyParameter(PrivateKey privateKey) {
        if (privateKey instanceof k60.b) {
            k60.b bVar = (k60.b) privateKey;
            e parameters = bVar.getParameters();
            if (parameters == null) {
                parameters = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            }
            if (bVar.getParameters() instanceof c) {
                return new d0(bVar.getD(), new c0(f50.d.f(((c) bVar.getParameters()).f()), parameters.a(), parameters.b(), parameters.d(), parameters.c(), parameters.e()));
            }
            return new d0(bVar.getD(), new y(parameters.a(), parameters.b(), parameters.d(), parameters.c(), parameters.e()));
        } else if (privateKey instanceof ECPrivateKey) {
            ECPrivateKey eCPrivateKey = (ECPrivateKey) privateKey;
            e convertSpec = EC5Util.convertSpec(eCPrivateKey.getParams());
            return new d0(eCPrivateKey.getS(), new y(convertSpec.a(), convertSpec.b(), convertSpec.d(), convertSpec.c(), convertSpec.e()));
        } else {
            try {
                byte[] encoded = privateKey.getEncoded();
                if (encoded != null) {
                    PrivateKey privateKey2 = BouncyCastleProvider.getPrivateKey(p.f(encoded));
                    if (privateKey2 instanceof ECPrivateKey) {
                        return generatePrivateKeyParameter(privateKey2);
                    }
                    throw new InvalidKeyException("can't identify EC private key.");
                }
                throw new InvalidKeyException("no encoding for EC private key");
            } catch (Exception e11) {
                throw new InvalidKeyException("cannot identify EC private key: " + e11.toString());
            }
        }
    }

    public static b generatePublicKeyParameter(PublicKey publicKey) {
        if (publicKey instanceof k60.c) {
            k60.c cVar = (k60.c) publicKey;
            e parameters = cVar.getParameters();
            return new e0(cVar.getQ(), new y(parameters.a(), parameters.b(), parameters.d(), parameters.c(), parameters.e()));
        } else if (publicKey instanceof ECPublicKey) {
            ECPublicKey eCPublicKey = (ECPublicKey) publicKey;
            e convertSpec = EC5Util.convertSpec(eCPublicKey.getParams());
            return new e0(EC5Util.convertPoint(eCPublicKey.getParams(), eCPublicKey.getW()), new y(convertSpec.a(), convertSpec.b(), convertSpec.d(), convertSpec.c(), convertSpec.e()));
        } else {
            try {
                byte[] encoded = publicKey.getEncoded();
                if (encoded != null) {
                    PublicKey publicKey2 = BouncyCastleProvider.getPublicKey(m0.h(encoded));
                    if (publicKey2 instanceof ECPublicKey) {
                        return generatePublicKeyParameter(publicKey2);
                    }
                    throw new InvalidKeyException("cannot identify EC public key.");
                }
                throw new InvalidKeyException("no encoding for EC public key");
            } catch (Exception e11) {
                throw new InvalidKeyException("cannot identify EC public key: " + e11.toString());
            }
        }
    }

    public static String getCurveName(k kVar) {
        return f50.d.d(kVar);
    }

    public static y getDomainParameters(ProviderConfiguration providerConfiguration, g gVar) {
        y yVar;
        if (gVar.i()) {
            k u11 = k.u(gVar.f());
            f50.i namedCurveByOid = getNamedCurveByOid(u11);
            if (namedCurveByOid == null) {
                namedCurveByOid = (f50.i) providerConfiguration.getAdditionalECParameters().get(u11);
            }
            return new c0(u11, namedCurveByOid);
        }
        if (gVar.h()) {
            e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            yVar = new y(ecImplicitlyCa.a(), ecImplicitlyCa.b(), ecImplicitlyCa.d(), ecImplicitlyCa.c(), ecImplicitlyCa.e());
        } else {
            f50.i i11 = f50.i.i(gVar.f());
            yVar = new y(i11.e(), i11.f(), i11.j(), i11.h(), i11.k());
        }
        return yVar;
    }

    public static y getDomainParameters(ProviderConfiguration providerConfiguration, e eVar) {
        if (eVar instanceof c) {
            c cVar = (c) eVar;
            return new c0(getNamedCurveOid(cVar.f()), cVar.a(), cVar.b(), cVar.d(), cVar.c(), cVar.e());
        } else if (eVar == null) {
            e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return new y(ecImplicitlyCa.a(), ecImplicitlyCa.b(), ecImplicitlyCa.d(), ecImplicitlyCa.c(), ecImplicitlyCa.e());
        } else {
            return new y(eVar.a(), eVar.b(), eVar.d(), eVar.c(), eVar.e());
        }
    }

    public static String getNameFrom(final AlgorithmParameterSpec algorithmParameterSpec) {
        return (String) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                try {
                    return algorithmParameterSpec.getClass().getMethod("getName", new Class[0]).invoke(algorithmParameterSpec, new Object[0]);
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    public static f50.i getNamedCurveByName(String str) {
        f50.i i11 = j50.a.i(str);
        return i11 == null ? f50.d.b(str) : i11;
    }

    public static f50.i getNamedCurveByOid(k kVar) {
        f50.i j11 = j50.a.j(kVar);
        return j11 == null ? f50.d.c(kVar) : j11;
    }

    public static k getNamedCurveOid(String str) {
        if (str == null || str.length() < 1) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf > 0) {
            str = str.substring(indexOf + 1);
        }
        k oid = getOID(str);
        return oid != null ? oid : f50.d.f(str);
    }

    public static k getNamedCurveOid(e eVar) {
        Enumeration e11 = f50.d.e();
        while (e11.hasMoreElements()) {
            String str = (String) e11.nextElement();
            f50.i b11 = f50.d.b(str);
            if (b11.j().equals(eVar.d()) && b11.h().equals(eVar.c()) && b11.e().l(eVar.a()) && b11.f().e(eVar.b())) {
                return f50.d.f(str);
            }
        }
        return null;
    }

    private static k getOID(String str) {
        char charAt = str.charAt(0);
        if (charAt < '0' || charAt > '2') {
            return null;
        }
        try {
            return new k(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getOrderBitLength(ProviderConfiguration providerConfiguration, BigInteger bigInteger, BigInteger bigInteger2) {
        if (bigInteger == null) {
            e ecImplicitlyCa = providerConfiguration.getEcImplicitlyCa();
            return ecImplicitlyCa == null ? bigInteger2.bitLength() : ecImplicitlyCa.d().bitLength();
        }
        return bigInteger.bitLength();
    }

    public static String privateKeyToString(String str, BigInteger bigInteger, e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        i A = new n60.k().a(eVar.b(), bigInteger).A();
        stringBuffer.append(str);
        stringBuffer.append(" Private Key [");
        stringBuffer.append(generateKeyFingerprint(A, eVar));
        stringBuffer.append("]");
        stringBuffer.append(d11);
        stringBuffer.append("            X: ");
        stringBuffer.append(A.f().t().toString(16));
        stringBuffer.append(d11);
        stringBuffer.append("            Y: ");
        stringBuffer.append(A.g().t().toString(16));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }

    public static String publicKeyToString(String str, i iVar, e eVar) {
        StringBuffer stringBuffer = new StringBuffer();
        String d11 = m.d();
        stringBuffer.append(str);
        stringBuffer.append(" Public Key [");
        stringBuffer.append(generateKeyFingerprint(iVar, eVar));
        stringBuffer.append("]");
        stringBuffer.append(d11);
        stringBuffer.append("            X: ");
        stringBuffer.append(iVar.f().t().toString(16));
        stringBuffer.append(d11);
        stringBuffer.append("            Y: ");
        stringBuffer.append(iVar.g().t().toString(16));
        stringBuffer.append(d11);
        return stringBuffer.toString();
    }
}