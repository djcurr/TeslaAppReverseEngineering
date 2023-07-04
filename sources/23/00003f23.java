package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Signature;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes2.dex */
public class y {
    private static Signature a(String str, Provider provider) {
        return b(str, provider, null);
    }

    private static Signature b(String str, Provider provider, PSSParameterSpec pSSParameterSpec) {
        Signature signature;
        try {
            if (provider != null) {
                signature = Signature.getInstance(str, provider);
            } else {
                signature = Signature.getInstance(str);
            }
            if (pSSParameterSpec != null) {
                try {
                    signature.setParameter(pSSParameterSpec);
                } catch (InvalidAlgorithmParameterException e11) {
                    throw new JOSEException("Invalid RSASSA-PSS salt length parameter: " + e11.getMessage(), e11);
                }
            }
            return signature;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static Signature c(zp.n nVar, Provider provider) {
        Signature a11;
        Signature b11;
        Signature a12;
        Signature b12;
        Signature a13;
        Signature b13;
        Signature a14;
        Signature a15;
        Signature a16;
        if (!nVar.equals(zp.n.f60655f) || (a16 = a("SHA256withRSA", provider)) == null) {
            if (!nVar.equals(zp.n.f60656g) || (a15 = a("SHA384withRSA", provider)) == null) {
                if (!nVar.equals(zp.n.f60657h) || (a14 = a("SHA512withRSA", provider)) == null) {
                    zp.n nVar2 = zp.n.f60662m;
                    if (!nVar.equals(nVar2) || (b13 = b("RSASSA-PSS", provider, new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA256, "MGF1", MGF1ParameterSpec.SHA256, 32, 1))) == null) {
                        if (!nVar.equals(nVar2) || (a13 = a("SHA256withRSAandMGF1", provider)) == null) {
                            zp.n nVar3 = zp.n.f60663n;
                            if (!nVar.equals(nVar3) || (b12 = b("RSASSA-PSS", provider, new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA384, "MGF1", MGF1ParameterSpec.SHA384, 48, 1))) == null) {
                                if (!nVar.equals(nVar3) || (a12 = a("SHA384withRSAandMGF1", provider)) == null) {
                                    zp.n nVar4 = zp.n.f60664o;
                                    if (!nVar.equals(nVar4) || (b11 = b("RSASSA-PSS", provider, new PSSParameterSpec(McElieceCCA2KeyGenParameterSpec.SHA512, "MGF1", MGF1ParameterSpec.SHA512, 64, 1))) == null) {
                                        if (!nVar.equals(nVar4) || (a11 = a("SHA512withRSAandMGF1", provider)) == null) {
                                            throw new JOSEException(e.d(nVar, z.f17957c));
                                        }
                                        return a11;
                                    }
                                    return b11;
                                }
                                return a12;
                            }
                            return b12;
                        }
                        return a13;
                    }
                    return b13;
                }
                return a14;
            }
            return a15;
        }
        return a16;
    }
}