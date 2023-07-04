package com.nimbusds.jose.crypto.impl;

import com.nimbusds.jose.JOSEException;
import java.security.AlgorithmParameters;
import java.security.Provider;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* loaded from: classes2.dex */
public class b0 {
    public static byte[] a(RSAPublicKey rSAPublicKey, SecretKey secretKey, int i11, Provider provider) {
        MGF1ParameterSpec mGF1ParameterSpec;
        String str;
        String str2;
        if (256 == i11) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
            str = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
            str2 = McElieceCCA2KeyGenParameterSpec.SHA256;
        } else if (384 == i11) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
            str = "RSA/ECB/OAEPWithSHA-384AndMGF1Padding";
            str2 = McElieceCCA2KeyGenParameterSpec.SHA384;
        } else if (512 == i11) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
            str = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
            str2 = McElieceCCA2KeyGenParameterSpec.SHA512;
        } else {
            throw new JOSEException("Unsupported SHA-2 bit size: " + i11);
        }
        try {
            AlgorithmParameters a11 = d.a("OAEP", provider);
            a11.init(new OAEPParameterSpec(str2, "MGF1", mGF1ParameterSpec, PSource.PSpecified.DEFAULT));
            Cipher a12 = i.a(str, provider);
            a12.init(1, rSAPublicKey, a11);
            return a12.doFinal(secretKey.getEncoded());
        } catch (IllegalBlockSizeException e11) {
            throw new JOSEException("RSA block size exception: The RSA key is too short, use a longer one", e11);
        } catch (Exception e12) {
            throw new JOSEException(e12.getMessage(), e12);
        }
    }
}