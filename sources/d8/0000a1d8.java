package org.spongycastle.jce.provider;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.engines.DESEngine;
import org.spongycastle.crypto.engines.DESedeEngine;
import org.spongycastle.crypto.engines.TwofishEngine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.modes.CFBBlockCipher;
import org.spongycastle.crypto.modes.CTSBlockCipher;
import org.spongycastle.crypto.modes.OFBBlockCipher;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.RC2Parameters;
import org.spongycastle.crypto.params.RC5Parameters;
import org.spongycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.spongycastle.jce.provider.BrokenPBE;
import org.spongycastle.util.Strings;

/* loaded from: classes4.dex */
public class BrokenJCEBlockCipher implements BrokenPBE {
    private Class[] availableSpecs;
    private BufferedBlockCipher cipher;
    private AlgorithmParameters engineParams;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int pbeHash;
    private int pbeIvSize;
    private int pbeKeySize;
    private int pbeType;

    /* loaded from: classes4.dex */
    public static class BrokePBEWithMD5AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithMD5AndDES() {
            super(new CBCBlockCipher(new DESEngine()), 0, 0, 64, 64);
        }
    }

    /* loaded from: classes4.dex */
    public static class BrokePBEWithSHA1AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithSHA1AndDES() {
            super(new CBCBlockCipher(new DESEngine()), 0, 1, 64, 64);
        }
    }

    /* loaded from: classes4.dex */
    public static class BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES2Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 128, 64);
        }
    }

    /* loaded from: classes4.dex */
    public static class BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES3Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 192, 64);
        }
    }

    /* loaded from: classes4.dex */
    public static class OldPBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndDES3Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 3, 1, 192, 64);
        }
    }

    /* loaded from: classes4.dex */
    public static class OldPBEWithSHAAndTwofish extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndTwofish() {
            super(new CBCBlockCipher(new TwofishEngine()), 3, 1, 256, 128);
        }
    }

    protected BrokenJCEBlockCipher(BlockCipher blockCipher) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.ivLength = 0;
        this.engineParams = null;
        this.cipher = new PaddedBufferedBlockCipher(blockCipher);
    }

    protected byte[] engineDoFinal(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[engineGetOutputSize(i12)];
        int processBytes = i12 != 0 ? this.cipher.processBytes(bArr, i11, i12, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.cipher.doFinal(bArr2, processBytes);
            byte[] bArr3 = new byte[doFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
            return bArr3;
        } catch (DataLengthException e11) {
            throw new IllegalBlockSizeException(e11.getMessage());
        } catch (InvalidCipherTextException e12) {
            throw new BadPaddingException(e12.getMessage());
        }
    }

    protected int engineGetBlockSize() {
        return this.cipher.getBlockSize();
    }

    protected byte[] engineGetIV() {
        ParametersWithIV parametersWithIV = this.ivParam;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    protected int engineGetOutputSize(int i11) {
        return this.cipher.getOutputSize(i11);
    }

    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.ivParam != null) {
            String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithmName, BouncyCastleProvider.PROVIDER_NAME);
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.ivParam.getIV());
            } catch (Exception e11) {
                throw new RuntimeException(e11.toString());
            }
        }
        return this.engineParams;
    }

    protected void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        ParametersWithIV parametersWithIV;
        ParametersWithIV parametersWithIV2;
        CipherParameters keyParameter;
        if (key instanceof BCPBEKey) {
            CipherParameters makePBEParameters = BrokenPBE.Util.makePBEParameters((BCPBEKey) key, algorithmParameterSpec, this.pbeType, this.pbeHash, this.cipher.getUnderlyingCipher().getAlgorithmName(), this.pbeKeySize, this.pbeIvSize);
            parametersWithIV2 = makePBEParameters;
            if (this.pbeIvSize != 0) {
                this.ivParam = (ParametersWithIV) makePBEParameters;
                parametersWithIV2 = makePBEParameters;
            }
        } else {
            if (algorithmParameterSpec == null) {
                keyParameter = new KeyParameter(key.getEncoded());
            } else {
                if (algorithmParameterSpec instanceof IvParameterSpec) {
                    if (this.ivLength != 0) {
                        ParametersWithIV parametersWithIV3 = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                        this.ivParam = parametersWithIV3;
                        parametersWithIV = parametersWithIV3;
                    } else {
                        keyParameter = new KeyParameter(key.getEncoded());
                    }
                } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                    RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                    CipherParameters rC2Parameters = new RC2Parameters(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                    parametersWithIV = rC2Parameters;
                    if (rC2ParameterSpec.getIV() != null) {
                        parametersWithIV = rC2Parameters;
                        if (this.ivLength != 0) {
                            ParametersWithIV parametersWithIV4 = new ParametersWithIV(rC2Parameters, rC2ParameterSpec.getIV());
                            this.ivParam = parametersWithIV4;
                            parametersWithIV2 = parametersWithIV4;
                        }
                    }
                } else if (algorithmParameterSpec instanceof RC5ParameterSpec) {
                    RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                    CipherParameters rC5Parameters = new RC5Parameters(key.getEncoded(), rC5ParameterSpec.getRounds());
                    if (rC5ParameterSpec.getWordSize() == 32) {
                        parametersWithIV = rC5Parameters;
                        if (rC5ParameterSpec.getIV() != null) {
                            parametersWithIV = rC5Parameters;
                            if (this.ivLength != 0) {
                                ParametersWithIV parametersWithIV5 = new ParametersWithIV(rC5Parameters, rC5ParameterSpec.getIV());
                                this.ivParam = parametersWithIV5;
                                parametersWithIV2 = parametersWithIV5;
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("can only accept RC5 word size 32 (at the moment...)");
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("unknown parameter type.");
                }
                parametersWithIV2 = parametersWithIV;
            }
            parametersWithIV2 = keyParameter;
        }
        ParametersWithIV parametersWithIV6 = parametersWithIV2;
        if (this.ivLength != 0) {
            boolean z11 = parametersWithIV2 instanceof ParametersWithIV;
            parametersWithIV6 = parametersWithIV2;
            if (!z11) {
                if (secureRandom == null) {
                    secureRandom = new SecureRandom();
                }
                if (i11 != 1 && i11 != 3) {
                    throw new InvalidAlgorithmParameterException("no IV set when one expected");
                }
                byte[] bArr = new byte[this.ivLength];
                secureRandom.nextBytes(bArr);
                ParametersWithIV parametersWithIV7 = new ParametersWithIV(parametersWithIV2, bArr);
                this.ivParam = parametersWithIV7;
                parametersWithIV6 = parametersWithIV7;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        System.out.println("eeek!");
                        return;
                    }
                }
            }
            this.cipher.init(false, parametersWithIV6);
            return;
        }
        this.cipher.init(true, parametersWithIV6);
    }

    protected void engineSetMode(String str) {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("ECB")) {
            this.ivLength = 0;
            this.cipher = new PaddedBufferedBlockCipher(this.cipher.getUnderlyingCipher());
        } else if (upperCase.equals("CBC")) {
            this.ivLength = this.cipher.getUnderlyingCipher().getBlockSize();
            this.cipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(this.cipher.getUnderlyingCipher()));
        } else if (upperCase.startsWith("OFB")) {
            this.ivLength = this.cipher.getUnderlyingCipher().getBlockSize();
            if (upperCase.length() != 3) {
                this.cipher = new PaddedBufferedBlockCipher(new OFBBlockCipher(this.cipher.getUnderlyingCipher(), Integer.parseInt(upperCase.substring(3))));
                return;
            }
            this.cipher = new PaddedBufferedBlockCipher(new OFBBlockCipher(this.cipher.getUnderlyingCipher(), this.cipher.getBlockSize() * 8));
        } else if (upperCase.startsWith("CFB")) {
            this.ivLength = this.cipher.getUnderlyingCipher().getBlockSize();
            if (upperCase.length() != 3) {
                this.cipher = new PaddedBufferedBlockCipher(new CFBBlockCipher(this.cipher.getUnderlyingCipher(), Integer.parseInt(upperCase.substring(3))));
                return;
            }
            this.cipher = new PaddedBufferedBlockCipher(new CFBBlockCipher(this.cipher.getUnderlyingCipher(), this.cipher.getBlockSize() * 8));
        } else {
            throw new IllegalArgumentException("can't support mode " + str);
        }
    }

    protected void engineSetPadding(String str) {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            this.cipher = new BufferedBlockCipher(this.cipher.getUnderlyingCipher());
        } else if (!upperCase.equals("PKCS5PADDING") && !upperCase.equals("PKCS7PADDING") && !upperCase.equals("ISO10126PADDING")) {
            if (upperCase.equals("WITHCTS")) {
                this.cipher = new CTSBlockCipher(this.cipher.getUnderlyingCipher());
                return;
            }
            throw new NoSuchPaddingException("Padding " + str + " unknown.");
        } else {
            this.cipher = new PaddedBufferedBlockCipher(this.cipher.getUnderlyingCipher());
        }
    }

    protected Key engineUnwrap(byte[] bArr, String str, int i11) {
        try {
            byte[] engineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i11 == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            try {
                KeyFactory keyFactory = KeyFactory.getInstance(str, BouncyCastleProvider.PROVIDER_NAME);
                if (i11 == 1) {
                    return keyFactory.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                }
                if (i11 == 2) {
                    return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new InvalidKeyException("Unknown key type " + i11);
            } catch (NoSuchAlgorithmException e11) {
                throw new InvalidKeyException("Unknown key type " + e11.getMessage());
            } catch (NoSuchProviderException e12) {
                throw new InvalidKeyException("Unknown key type " + e12.getMessage());
            } catch (InvalidKeySpecException e13) {
                throw new InvalidKeyException("Unknown key type " + e13.getMessage());
            }
        } catch (BadPaddingException e14) {
            throw new InvalidKeyException(e14.getMessage());
        } catch (IllegalBlockSizeException e15) {
            throw new InvalidKeyException(e15.getMessage());
        }
    }

    protected byte[] engineUpdate(byte[] bArr, int i11, int i12) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i12);
        if (updateOutputSize > 0) {
            byte[] bArr2 = new byte[updateOutputSize];
            this.cipher.processBytes(bArr, i11, i12, bArr2, 0);
            return bArr2;
        }
        this.cipher.processBytes(bArr, i11, i12, null, 0);
        return null;
    }

    protected byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                return engineDoFinal(encoded, 0, encoded.length);
            } catch (BadPaddingException e11) {
                throw new IllegalBlockSizeException(e11.getMessage());
            }
        }
        throw new InvalidKeyException("Cannot wrap key, null encoding.");
    }

    protected int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        return this.cipher.processBytes(bArr, i11, i12, bArr2, i13);
    }

    protected BrokenJCEBlockCipher(BlockCipher blockCipher, int i11, int i12, int i13, int i14) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.ivLength = 0;
        this.engineParams = null;
        this.cipher = new PaddedBufferedBlockCipher(blockCipher);
        this.pbeType = i11;
        this.pbeHash = i12;
        this.pbeKeySize = i13;
        this.pbeIvSize = i14;
    }

    protected int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int processBytes = i12 != 0 ? this.cipher.processBytes(bArr, i11, i12, bArr2, i13) : 0;
        try {
            return processBytes + this.cipher.doFinal(bArr2, i13 + processBytes);
        } catch (DataLengthException e11) {
            throw new IllegalBlockSizeException(e11.getMessage());
        } catch (InvalidCipherTextException e12) {
            throw new BadPaddingException(e12.getMessage());
        }
    }

    protected void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i12 = 0;
            while (true) {
                Class[] clsArr = this.availableSpecs;
                if (i12 == clsArr.length) {
                    break;
                }
                try {
                    algorithmParameterSpec = algorithmParameters.getParameterSpec(clsArr[i12]);
                    break;
                } catch (Exception unused) {
                    i12++;
                }
            }
            if (algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        this.engineParams = algorithmParameters;
        engineInit(i11, key, algorithmParameterSpec, secureRandom);
    }

    protected void engineInit(int i11, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i11, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new IllegalArgumentException(e11.getMessage());
        }
    }
}