package org.bouncycastle.jce.provider;

import f50.o;
import i40.a;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.PSSParameterSpec;
import org.bouncycastle.asn1.j;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.q0;
import v40.b;
import w40.n;
import w40.u;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class X509SignatureUtil {
    private static final j derNull = q0.f43085a;

    X509SignatureUtil() {
    }

    private static String getDigestAlgName(k kVar) {
        return n.Z1.j(kVar) ? "MD5" : b.f54051f.j(kVar) ? "SHA1" : r40.b.f49147f.j(kVar) ? "SHA224" : r40.b.f49141c.j(kVar) ? "SHA256" : r40.b.f49143d.j(kVar) ? "SHA384" : r40.b.f49145e.j(kVar) ? "SHA512" : z40.b.f60194c.j(kVar) ? "RIPEMD128" : z40.b.f60193b.j(kVar) ? "RIPEMD160" : z40.b.f60195d.j(kVar) ? "RIPEMD256" : a.f29839b.j(kVar) ? "GOST3411" : kVar.t();
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
                return getDigestAlgName(k.u(p11.r(0))) + "withECDSA";
            }
        }
        return bVar.e().t();
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