package org.bouncycastle.jcajce.provider.asymmetric.x509;

import f50.o;
import i60.d;
import j40.a;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import q40.c;
import v40.b;
import w40.n;
import w40.u;

/* loaded from: classes5.dex */
class X509SignatureUtil {
    private static final Map<k, String> algNames;
    private static final j derNull;

    static {
        HashMap hashMap = new HashMap();
        algNames = hashMap;
        hashMap.put(a.f33207d, "Ed25519");
        hashMap.put(a.f33208e, "Ed448");
        hashMap.put(b.f54052g, "SHA1withDSA");
        hashMap.put(o.O0, "SHA1withDSA");
        derNull = q0.f43085a;
    }

    X509SignatureUtil() {
    }

    private static String findAlgName(k kVar) {
        String lookupAlg;
        String lookupAlg2;
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider == null || (lookupAlg2 = lookupAlg(provider, kVar)) == null) {
            Provider[] providers = Security.getProviders();
            for (int i11 = 0; i11 != providers.length; i11++) {
                if (provider != providers[i11] && (lookupAlg = lookupAlg(providers[i11], kVar)) != null) {
                    return lookupAlg;
                }
            }
            return kVar.t();
        }
        return lookupAlg2;
    }

    private static String getDigestAlgName(k kVar) {
        String a11 = d.a(kVar);
        int indexOf = a11.indexOf(45);
        if (indexOf <= 0 || a11.startsWith("SHA3")) {
            return a11;
        }
        return a11.substring(0, indexOf) + a11.substring(indexOf + 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getSignatureName(e50.b bVar) {
        e40.b i11 = bVar.i();
        if (i11 != null && !derNull.i(i11)) {
            if (bVar.e().j(n.f55557w1)) {
                u f11 = u.f(i11);
                return getDigestAlgName(f11.e().e()) + "withRSAandMGF1";
            } else if (bVar.e().j(o.f25892i0)) {
                p p11 = p.p(i11);
                return getDigestAlgName((k) p11.r(0)) + "withECDSA";
            }
        }
        String str = algNames.get(bVar.e());
        return str != null ? str : findAlgName(bVar.e());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isCompositeAlgorithm(e50.b bVar) {
        return c.f47480z.j(bVar.e());
    }

    private static String lookupAlg(Provider provider, k kVar) {
        String property = provider.getProperty("Alg.Alias.Signature." + kVar);
        if (property != null) {
            return property;
        }
        String property2 = provider.getProperty("Alg.Alias.Signature.OID." + kVar);
        if (property2 != null) {
            return property2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void prettyPrintSignature(byte[] bArr, StringBuffer stringBuffer, String str) {
        int length = bArr.length;
        stringBuffer.append("            Signature: ");
        if (length <= 20) {
            stringBuffer.append(org.bouncycastle.util.encoders.b.f(bArr));
            stringBuffer.append(str);
            return;
        }
        stringBuffer.append(org.bouncycastle.util.encoders.b.g(bArr, 0, 20));
        stringBuffer.append(str);
        int i11 = 20;
        while (i11 < bArr.length) {
            int length2 = bArr.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i11 < length2 ? org.bouncycastle.util.encoders.b.g(bArr, i11, 20) : org.bouncycastle.util.encoders.b.g(bArr, i11, bArr.length - i11));
            stringBuffer.append(str);
            i11 += 20;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSignatureParameters(Signature signature, e40.b bVar) {
        if (bVar == null || derNull.i(bVar)) {
            return;
        }
        AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(signature.getAlgorithm(), signature.getProvider());
        try {
            algorithmParameters.init(bVar.toASN1Primitive().getEncoded());
            if (signature.getAlgorithm().endsWith("MGF1")) {
                try {
                    signature.setParameter(algorithmParameters.getParameterSpec(PSSParameterSpec.class));
                } catch (GeneralSecurityException e11) {
                    throw new SignatureException("Exception extracting parameters: " + e11.getMessage());
                }
            }
        } catch (IOException e12) {
            throw new SignatureException("IOException decoding parameters: " + e12.getMessage());
        }
    }
}