package org.bouncycastle.jce.provider;

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
import l50.b1;
import l50.o;
import l50.p;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jce.provider.BrokenPBE;
import q50.c;
import q50.v;
import r70.m;
import u50.f1;
import u50.j1;
import u50.k1;

/* loaded from: classes5.dex */
public class BrokenJCEBlockCipher implements BrokenPBE {
    private Class[] availableSpecs;
    private f cipher;
    private AlgorithmParameters engineParams;
    private int ivLength;
    private f1 ivParam;
    private int pbeHash;
    private int pbeIvSize;
    private int pbeKeySize;
    private int pbeType;

    /* loaded from: classes5.dex */
    public static class BrokePBEWithMD5AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithMD5AndDES() {
            super(new c(new o()), 0, 0, 64, 64);
        }
    }

    /* loaded from: classes5.dex */
    public static class BrokePBEWithSHA1AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithSHA1AndDES() {
            super(new c(new o()), 0, 1, 64, 64);
        }
    }

    /* loaded from: classes5.dex */
    public static class BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES2Key() {
            super(new c(new p()), 2, 1, 128, 64);
        }
    }

    /* loaded from: classes5.dex */
    public static class BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES3Key() {
            super(new c(new p()), 2, 1, 192, 64);
        }
    }

    /* loaded from: classes5.dex */
    public static class OldPBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndDES3Key() {
            super(new c(new p()), 3, 1, 192, 64);
        }
    }

    /* loaded from: classes5.dex */
    public static class OldPBEWithSHAAndTwofish extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndTwofish() {
            super(new c(new b1()), 3, 1, 256, 128);
        }
    }

    protected BrokenJCEBlockCipher(e eVar) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.ivLength = 0;
        this.engineParams = null;
        this.cipher = new t50.e(eVar);
    }

    protected BrokenJCEBlockCipher(e eVar, int i11, int i12, int i13, int i14) {
        this.availableSpecs = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.ivLength = 0;
        this.engineParams = null;
        this.cipher = new t50.e(eVar);
        this.pbeType = i11;
        this.pbeHash = i12;
        this.pbeKeySize = i13;
        this.pbeIvSize = i14;
    }

    protected int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int h11 = i12 != 0 ? this.cipher.h(bArr, i11, i12, bArr2, i13) : 0;
        try {
            return h11 + this.cipher.a(bArr2, i13 + h11);
        } catch (DataLengthException e11) {
            throw new IllegalBlockSizeException(e11.getMessage());
        } catch (InvalidCipherTextException e12) {
            throw new BadPaddingException(e12.getMessage());
        }
    }

    protected byte[] engineDoFinal(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[engineGetOutputSize(i12)];
        int h11 = i12 != 0 ? this.cipher.h(bArr, i11, i12, bArr2, 0) : 0;
        try {
            int a11 = h11 + this.cipher.a(bArr2, h11);
            byte[] bArr3 = new byte[a11];
            System.arraycopy(bArr2, 0, bArr3, 0, a11);
            return bArr3;
        } catch (DataLengthException e11) {
            throw new IllegalBlockSizeException(e11.getMessage());
        } catch (InvalidCipherTextException e12) {
            throw new BadPaddingException(e12.getMessage());
        }
    }

    protected int engineGetBlockSize() {
        return this.cipher.b();
    }

    protected byte[] engineGetIV() {
        f1 f1Var = this.ivParam;
        if (f1Var != null) {
            return f1Var.a();
        }
        return null;
    }

    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    protected int engineGetOutputSize(int i11) {
        return this.cipher.c(i11);
    }

    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.ivParam != null) {
            String algorithmName = this.cipher.d().getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithmName, BouncyCastleProvider.PROVIDER_NAME);
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.ivParam.a());
            } catch (Exception e11) {
                throw new RuntimeException(e11.toString());
            }
        }
        return this.engineParams;
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

    protected void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        f1 f1Var;
        f1 f1Var2;
        f1 f1Var3;
        i b1Var;
        if (key instanceof BCPBEKey) {
            i makePBEParameters = BrokenPBE.Util.makePBEParameters((BCPBEKey) key, algorithmParameterSpec, this.pbeType, this.pbeHash, this.cipher.d().getAlgorithmName(), this.pbeKeySize, this.pbeIvSize);
            f1Var3 = makePBEParameters;
            if (this.pbeIvSize != 0) {
                this.ivParam = (f1) makePBEParameters;
                f1Var3 = makePBEParameters;
            }
        } else {
            if (algorithmParameterSpec == null) {
                b1Var = new u50.b1(key.getEncoded());
            } else {
                if (algorithmParameterSpec instanceof IvParameterSpec) {
                    if (this.ivLength != 0) {
                        f1 f1Var4 = new f1(new u50.b1(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                        this.ivParam = f1Var4;
                        f1Var2 = f1Var4;
                    } else {
                        b1Var = new u50.b1(key.getEncoded());
                    }
                } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                    RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                    i j1Var = new j1(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                    f1Var2 = j1Var;
                    if (rC2ParameterSpec.getIV() != null) {
                        f1Var2 = j1Var;
                        if (this.ivLength != 0) {
                            f1Var = new f1(j1Var, rC2ParameterSpec.getIV());
                            this.ivParam = f1Var;
                            f1Var3 = f1Var;
                        }
                    }
                } else if (!(algorithmParameterSpec instanceof RC5ParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("unknown parameter type.");
                } else {
                    RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                    i k1Var = new k1(key.getEncoded(), rC5ParameterSpec.getRounds());
                    if (rC5ParameterSpec.getWordSize() != 32) {
                        throw new IllegalArgumentException("can only accept RC5 word size 32 (at the moment...)");
                    }
                    f1Var2 = k1Var;
                    if (rC5ParameterSpec.getIV() != null) {
                        f1Var2 = k1Var;
                        if (this.ivLength != 0) {
                            f1Var = new f1(k1Var, rC5ParameterSpec.getIV());
                            this.ivParam = f1Var;
                            f1Var3 = f1Var;
                        }
                    }
                }
                f1Var3 = f1Var2;
            }
            f1Var3 = b1Var;
        }
        f1 f1Var5 = f1Var3;
        if (this.ivLength != 0) {
            boolean z11 = f1Var3 instanceof f1;
            f1Var5 = f1Var3;
            if (!z11) {
                if (secureRandom == null) {
                    secureRandom = k.b();
                }
                if (i11 != 1 && i11 != 3) {
                    throw new InvalidAlgorithmParameterException("no IV set when one expected");
                }
                byte[] bArr = new byte[this.ivLength];
                secureRandom.nextBytes(bArr);
                f1 f1Var6 = new f1(f1Var3, bArr);
                this.ivParam = f1Var6;
                f1Var5 = f1Var6;
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
            this.cipher.f(false, f1Var5);
            return;
        }
        this.cipher.f(true, f1Var5);
    }

    protected void engineSetMode(String str) {
        t50.e eVar;
        t50.e eVar2;
        String k11 = m.k(str);
        if (k11.equals("ECB")) {
            this.ivLength = 0;
            eVar = new t50.e(this.cipher.d());
        } else if (k11.equals("CBC")) {
            this.ivLength = this.cipher.d().getBlockSize();
            eVar = new t50.e(new c(this.cipher.d()));
        } else if (k11.startsWith("OFB")) {
            this.ivLength = this.cipher.d().getBlockSize();
            if (k11.length() != 3) {
                eVar2 = new t50.e(new v(this.cipher.d(), Integer.parseInt(k11.substring(3))));
                this.cipher = eVar2;
                return;
            }
            eVar = new t50.e(new v(this.cipher.d(), this.cipher.b() * 8));
        } else if (!k11.startsWith("CFB")) {
            throw new IllegalArgumentException("can't support mode " + str);
        } else {
            this.ivLength = this.cipher.d().getBlockSize();
            if (k11.length() != 3) {
                eVar2 = new t50.e(new q50.e(this.cipher.d(), Integer.parseInt(k11.substring(3))));
                this.cipher = eVar2;
                return;
            }
            eVar = new t50.e(new q50.e(this.cipher.d(), this.cipher.b() * 8));
        }
        this.cipher = eVar;
    }

    protected void engineSetPadding(String str) {
        f eVar;
        String k11 = m.k(str);
        if (k11.equals("NOPADDING")) {
            eVar = new f(this.cipher.d());
        } else if (k11.equals("PKCS5PADDING") || k11.equals("PKCS7PADDING") || k11.equals("ISO10126PADDING")) {
            eVar = new t50.e(this.cipher.d());
        } else if (!k11.equals("WITHCTS")) {
            throw new NoSuchPaddingException("Padding " + str + " unknown.");
        } else {
            eVar = new q50.f(this.cipher.d());
        }
        this.cipher = eVar;
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

    protected int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        return this.cipher.h(bArr, i11, i12, bArr2, i13);
    }

    protected byte[] engineUpdate(byte[] bArr, int i11, int i12) {
        int e11 = this.cipher.e(i12);
        if (e11 <= 0) {
            this.cipher.h(bArr, i11, i12, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[e11];
        this.cipher.h(bArr, i11, i12, bArr2, 0);
        return bArr2;
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
}