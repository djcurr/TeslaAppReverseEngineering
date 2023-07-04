package org.bouncycastle.jce.provider;

import i50.p;
import i50.s;
import i50.v;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import n50.x;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.w;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public interface BrokenPBE {
    public static final int MD5 = 0;
    public static final int OLD_PKCS12 = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S2 = 1;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;

    /* loaded from: classes5.dex */
    public static class Util {
        private static w makePBEGenerator(int i11, int i12) {
            if (i11 == 0) {
                if (i12 != 0) {
                    if (i12 == 1) {
                        return new n50.w(new v());
                    }
                    throw new IllegalStateException("PKCS5 scheme 1 only supports only MD5 and SHA1.");
                }
                return new n50.w(new p());
            } else if (i11 == 1) {
                return new x();
            } else {
                if (i11 == 3) {
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2) {
                                return new OldPKCS12ParametersGenerator(new s());
                            }
                            throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                        }
                        return new OldPKCS12ParametersGenerator(new v());
                    }
                    return new OldPKCS12ParametersGenerator(new p());
                } else if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            return new n50.v(new s());
                        }
                        throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                    }
                    return new n50.v(new v());
                } else {
                    return new n50.v(new p());
                }
            }
        }

        static i makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i11, int i12, int i13) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            w makePBEGenerator = makePBEGenerator(i11, i12);
            byte[] encoded = bCPBEKey.getEncoded();
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            i generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i13);
            for (int i14 = 0; i14 != encoded.length; i14++) {
                encoded[i14] = 0;
            }
            return generateDerivedMacParameters;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static i makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, int i11, int i12, String str, int i13, int i14) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            w makePBEGenerator = makePBEGenerator(i11, i12);
            byte[] encoded = bCPBEKey.getEncoded();
            makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            i generateDerivedParameters = i14 != 0 ? makePBEGenerator.generateDerivedParameters(i13, i14) : makePBEGenerator.generateDerivedParameters(i13);
            if (str.startsWith("DES")) {
                if (generateDerivedParameters instanceof f1) {
                    setOddParity(((b1) ((f1) generateDerivedParameters).b()).a());
                } else {
                    setOddParity(((b1) generateDerivedParameters).a());
                }
            }
            for (int i15 = 0; i15 != encoded.length; i15++) {
                encoded[i15] = 0;
            }
            return generateDerivedParameters;
        }

        private static void setOddParity(byte[] bArr) {
            for (int i11 = 0; i11 < bArr.length; i11++) {
                byte b11 = bArr[i11];
                bArr[i11] = (byte) ((((b11 >> 7) ^ ((((((b11 >> 1) ^ (b11 >> 2)) ^ (b11 >> 3)) ^ (b11 >> 4)) ^ (b11 >> 5)) ^ (b11 >> 6))) ^ 1) | (b11 & 254));
            }
        }
    }
}