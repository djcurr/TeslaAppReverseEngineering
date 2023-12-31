package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.GOST3411Digest;
import org.spongycastle.crypto.digests.MD2Digest;
import org.spongycastle.crypto.digests.RIPEMD160Digest;
import org.spongycastle.crypto.digests.TigerDigest;
import org.spongycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.spongycastle.crypto.generators.PKCS12ParametersGenerator;
import org.spongycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.spongycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.spongycastle.crypto.params.DESParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.util.DigestFactory;

/* loaded from: classes4.dex */
public interface PBE {
    public static final int GOST3411 = 6;
    public static final int MD2 = 5;
    public static final int MD5 = 0;
    public static final int OPENSSL = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S1_UTF8 = 4;
    public static final int PKCS5S2 = 1;
    public static final int PKCS5S2_UTF8 = 5;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;
    public static final int SHA224 = 7;
    public static final int SHA256 = 4;
    public static final int SHA384 = 8;
    public static final int SHA512 = 9;
    public static final int TIGER = 3;

    /* loaded from: classes4.dex */
    public static class Util {
        private static byte[] convertPassword(int i11, PBEKeySpec pBEKeySpec) {
            if (i11 == 2) {
                return PBEParametersGenerator.PKCS12PasswordToBytes(pBEKeySpec.getPassword());
            }
            if (i11 != 5 && i11 != 4) {
                return PBEParametersGenerator.PKCS5PasswordToBytes(pBEKeySpec.getPassword());
            }
            return PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(pBEKeySpec.getPassword());
        }

        private static PBEParametersGenerator makePBEGenerator(int i11, int i12) {
            if (i11 == 0 || i11 == 4) {
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 5) {
                            return new PKCS5S1ParametersGenerator(new MD2Digest());
                        }
                        throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
                    }
                    return new PKCS5S1ParametersGenerator(DigestFactory.createSHA1());
                }
                return new PKCS5S1ParametersGenerator(DigestFactory.createMD5());
            } else if (i11 == 1 || i11 == 5) {
                switch (i12) {
                    case 0:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createMD5());
                    case 1:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA1());
                    case 2:
                        return new PKCS5S2ParametersGenerator(new RIPEMD160Digest());
                    case 3:
                        return new PKCS5S2ParametersGenerator(new TigerDigest());
                    case 4:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA256());
                    case 5:
                        return new PKCS5S2ParametersGenerator(new MD2Digest());
                    case 6:
                        return new PKCS5S2ParametersGenerator(new GOST3411Digest());
                    case 7:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA224());
                    case 8:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA384());
                    case 9:
                        return new PKCS5S2ParametersGenerator(DigestFactory.createSHA512());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
                }
            } else if (i11 == 2) {
                switch (i12) {
                    case 0:
                        return new PKCS12ParametersGenerator(DigestFactory.createMD5());
                    case 1:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA1());
                    case 2:
                        return new PKCS12ParametersGenerator(new RIPEMD160Digest());
                    case 3:
                        return new PKCS12ParametersGenerator(new TigerDigest());
                    case 4:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA256());
                    case 5:
                        return new PKCS12ParametersGenerator(new MD2Digest());
                    case 6:
                        return new PKCS12ParametersGenerator(new GOST3411Digest());
                    case 7:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA224());
                    case 8:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA384());
                    case 9:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA512());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                }
            } else {
                return new OpenSSLPBEParametersGenerator();
            }
        }

        public static CipherParameters makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec != null && (algorithmParameterSpec instanceof PBEParameterSpec)) {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                PBEParametersGenerator makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
                makePBEGenerator.init(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                return makePBEGenerator.generateDerivedMacParameters(bCPBEKey.getKeySize());
            }
            throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
        }

        public static CipherParameters makePBEParameters(byte[] bArr, int i11, int i12, int i13, int i14, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            CipherParameters generateDerivedParameters;
            if (algorithmParameterSpec != null && (algorithmParameterSpec instanceof PBEParameterSpec)) {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                PBEParametersGenerator makePBEGenerator = makePBEGenerator(i11, i12);
                makePBEGenerator.init(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                if (i14 != 0) {
                    generateDerivedParameters = makePBEGenerator.generateDerivedParameters(i13, i14);
                } else {
                    generateDerivedParameters = makePBEGenerator.generateDerivedParameters(i13);
                }
                if (str.startsWith("DES")) {
                    if (generateDerivedParameters instanceof ParametersWithIV) {
                        DESParameters.setOddParity(((KeyParameter) ((ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
                    } else {
                        DESParameters.setOddParity(((KeyParameter) generateDerivedParameters).getKey());
                    }
                }
                return generateDerivedParameters;
            }
            throw new InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
        }

        public static CipherParameters makePBEMacParameters(PBEKeySpec pBEKeySpec, int i11, int i12, int i13) {
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i11, i12);
            byte[] convertPassword = convertPassword(i11, pBEKeySpec);
            makePBEGenerator.init(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            CipherParameters generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i13);
            for (int i14 = 0; i14 != convertPassword.length; i14++) {
                convertPassword[i14] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static CipherParameters makePBEMacParameters(SecretKey secretKey, int i11, int i12, int i13, PBEParameterSpec pBEParameterSpec) {
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i11, i12);
            byte[] encoded = secretKey.getEncoded();
            makePBEGenerator.init(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters generateDerivedMacParameters = makePBEGenerator.generateDerivedMacParameters(i13);
            for (int i14 = 0; i14 != encoded.length; i14++) {
                encoded[i14] = 0;
            }
            return generateDerivedMacParameters;
        }

        public static CipherParameters makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            CipherParameters generateDerivedParameters;
            if (algorithmParameterSpec != null && (algorithmParameterSpec instanceof PBEParameterSpec)) {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                PBEParametersGenerator makePBEGenerator = makePBEGenerator(bCPBEKey.getType(), bCPBEKey.getDigest());
                byte[] encoded = bCPBEKey.getEncoded();
                if (bCPBEKey.shouldTryWrongPKCS12()) {
                    encoded = new byte[2];
                }
                makePBEGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                if (bCPBEKey.getIvSize() != 0) {
                    generateDerivedParameters = makePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize(), bCPBEKey.getIvSize());
                } else {
                    generateDerivedParameters = makePBEGenerator.generateDerivedParameters(bCPBEKey.getKeySize());
                }
                if (str.startsWith("DES")) {
                    if (generateDerivedParameters instanceof ParametersWithIV) {
                        DESParameters.setOddParity(((KeyParameter) ((ParametersWithIV) generateDerivedParameters).getParameters()).getKey());
                    } else {
                        DESParameters.setOddParity(((KeyParameter) generateDerivedParameters).getKey());
                    }
                }
                return generateDerivedParameters;
            }
            throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
        }

        public static CipherParameters makePBEParameters(PBEKeySpec pBEKeySpec, int i11, int i12, int i13, int i14) {
            CipherParameters generateDerivedParameters;
            PBEParametersGenerator makePBEGenerator = makePBEGenerator(i11, i12);
            byte[] convertPassword = convertPassword(i11, pBEKeySpec);
            makePBEGenerator.init(convertPassword, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            if (i14 != 0) {
                generateDerivedParameters = makePBEGenerator.generateDerivedParameters(i13, i14);
            } else {
                generateDerivedParameters = makePBEGenerator.generateDerivedParameters(i13);
            }
            for (int i15 = 0; i15 != convertPassword.length; i15++) {
                convertPassword[i15] = 0;
            }
            return generateDerivedParameters;
        }
    }
}