package org.spongycastle.jcajce.provider.symmetric.util;

import com.google.android.gms.stats.CodePackage;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.spongycastle.asn1.cms.GCMParameters;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.BufferedBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.modes.AEADBlockCipher;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.modes.CCMBlockCipher;
import org.spongycastle.crypto.modes.CFBBlockCipher;
import org.spongycastle.crypto.modes.CTSBlockCipher;
import org.spongycastle.crypto.modes.EAXBlockCipher;
import org.spongycastle.crypto.modes.GCFBBlockCipher;
import org.spongycastle.crypto.modes.GCMBlockCipher;
import org.spongycastle.crypto.modes.GOFBBlockCipher;
import org.spongycastle.crypto.modes.OCBBlockCipher;
import org.spongycastle.crypto.modes.OFBBlockCipher;
import org.spongycastle.crypto.modes.OpenPGPCFBBlockCipher;
import org.spongycastle.crypto.modes.PGPCFBBlockCipher;
import org.spongycastle.crypto.modes.SICBlockCipher;
import org.spongycastle.crypto.paddings.BlockCipherPadding;
import org.spongycastle.crypto.paddings.ISO10126d2Padding;
import org.spongycastle.crypto.paddings.ISO7816d4Padding;
import org.spongycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.spongycastle.crypto.paddings.TBCPadding;
import org.spongycastle.crypto.paddings.X923Padding;
import org.spongycastle.crypto.paddings.ZeroBytePadding;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.ParametersWithSBox;
import org.spongycastle.crypto.params.RC2Parameters;
import org.spongycastle.crypto.params.RC5Parameters;
import org.spongycastle.jcajce.PBKDF1Key;
import org.spongycastle.jcajce.PBKDF1KeyWithParameters;
import org.spongycastle.jcajce.PKCS12Key;
import org.spongycastle.jcajce.PKCS12KeyWithParameters;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.spongycastle.jcajce.spec.AEADParameterSpec;
import org.spongycastle.jcajce.spec.GOST28147ParameterSpec;
import org.spongycastle.jcajce.spec.RepeatedSecretKeySpec;
import org.spongycastle.util.Strings;

/* loaded from: classes4.dex */
public class BaseBlockCipher extends BaseWrapCipher {
    private static final Class gcmSpecClass = lookup("javax.crypto.spec.GCMParameterSpec");
    private AEADParameters aeadParams;
    private Class[] availableSpecs;
    private BlockCipher baseEngine;
    private GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private ParametersWithIV ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        private AEADBlockCipher cipher;

        static {
            Class lookup = BaseBlockCipher.lookup("javax.crypto.AEADBadTagException");
            if (lookup != null) {
                aeadBadTagConstructor = findExceptionConstructor(lookup);
            } else {
                aeadBadTagConstructor = null;
            }
        }

        AEADGenericBlockCipher(AEADBlockCipher aEADBlockCipher) {
            this.cipher = aEADBlockCipher;
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(String.class);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i11) {
            try {
                return this.cipher.doFinal(bArr, i11);
            } catch (InvalidCipherTextException e11) {
                Constructor constructor = aeadBadTagConstructor;
                if (constructor != null) {
                    BadPaddingException badPaddingException = null;
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(e11.getMessage());
                    } catch (Exception unused) {
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e11.getMessage());
            }
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i11) {
            return this.cipher.getOutputSize(i11);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i11) {
            return this.cipher.getUpdateOutputSize(i11);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z11, CipherParameters cipherParameters) {
            this.cipher.init(z11, cipherParameters);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b11, byte[] bArr, int i11) {
            return this.cipher.processByte(b11, bArr, i11);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
            return this.cipher.processBytes(bArr, i11, i12, bArr2, i13);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i11, int i12) {
            this.cipher.processAADBytes(bArr, i11, i12);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i11);

        String getAlgorithmName();

        int getOutputSize(int i11);

        BlockCipher getUnderlyingCipher();

        int getUpdateOutputSize(int i11);

        void init(boolean z11, CipherParameters cipherParameters);

        int processByte(byte b11, byte[] bArr, int i11);

        int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

        void updateAAD(byte[] bArr, int i11, int i12);

        boolean wrapOnNoPadding();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class InvalidKeyOrParametersException extends InvalidKeyException {
        private final Throwable cause;

        InvalidKeyOrParametersException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(BlockCipher blockCipher) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private CipherParameters adjustParameters(AlgorithmParameterSpec algorithmParameterSpec, CipherParameters cipherParameters) {
        ParametersWithSBox parametersWithSBox;
        if (cipherParameters instanceof ParametersWithIV) {
            CipherParameters parameters = ((ParametersWithIV) cipherParameters).getParameters();
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                ParametersWithIV parametersWithIV = new ParametersWithIV(parameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
                this.ivParam = parametersWithIV;
                return parametersWithIV;
            } else if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec) algorithmParameterSpec;
                ParametersWithSBox parametersWithSBox2 = new ParametersWithSBox(cipherParameters, gOST28147ParameterSpec.getSbox());
                if (gOST28147ParameterSpec.getIV() == null || this.ivLength == 0) {
                    return parametersWithSBox2;
                }
                ParametersWithIV parametersWithIV2 = new ParametersWithIV(parameters, gOST28147ParameterSpec.getIV());
                this.ivParam = parametersWithIV2;
                return parametersWithIV2;
            } else {
                return cipherParameters;
            }
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            ParametersWithIV parametersWithIV3 = new ParametersWithIV(cipherParameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
            this.ivParam = parametersWithIV3;
            parametersWithSBox = parametersWithIV3;
        } else if (!(algorithmParameterSpec instanceof GOST28147ParameterSpec)) {
            return cipherParameters;
        } else {
            GOST28147ParameterSpec gOST28147ParameterSpec2 = (GOST28147ParameterSpec) algorithmParameterSpec;
            ParametersWithSBox parametersWithSBox3 = new ParametersWithSBox(cipherParameters, gOST28147ParameterSpec2.getSbox());
            parametersWithSBox = parametersWithSBox3;
            if (gOST28147ParameterSpec2.getIV() != null) {
                parametersWithSBox = parametersWithSBox3;
                if (this.ivLength != 0) {
                    return new ParametersWithIV(parametersWithSBox3, gOST28147ParameterSpec2.getIV());
                }
            }
        }
        return parametersWithSBox;
    }

    private boolean isAEADModeName(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || CodePackage.GCM.equals(str) || "OCB".equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Class lookup(String str) {
        try {
            return BaseBlockCipher.class.getClassLoader().loadClass(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i11, int i12) {
        int engineGetOutputSize = engineGetOutputSize(i12);
        byte[] bArr2 = new byte[engineGetOutputSize];
        int processBytes = i12 != 0 ? this.cipher.processBytes(bArr, i11, i12, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.cipher.doFinal(bArr2, processBytes);
            if (doFinal == engineGetOutputSize) {
                return bArr2;
            }
            byte[] bArr3 = new byte[doFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
            return bArr3;
        } catch (DataLengthException e11) {
            throw new IllegalBlockSizeException(e11.getMessage());
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return this.baseEngine.getBlockSize();
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        AEADParameters aEADParameters = this.aeadParams;
        if (aEADParameters != null) {
            return aEADParameters.getNonce();
        }
        ParametersWithIV parametersWithIV = this.ivParam;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i11) {
        return this.cipher.getOutputSize(i11);
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    AlgorithmParameters createParametersInstance = createParametersInstance(this.pbeAlgorithm);
                    this.engineParams = createParametersInstance;
                    createParametersInstance.init(this.pbeSpec);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.aeadParams != null) {
                try {
                    AlgorithmParameters createParametersInstance2 = createParametersInstance(CodePackage.GCM);
                    this.engineParams = createParametersInstance2;
                    createParametersInstance2.init(new GCMParameters(this.aeadParams.getNonce(), this.aeadParams.getMacSize() / 8).getEncoded());
                } catch (Exception e11) {
                    throw new RuntimeException(e11.toString());
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    AlgorithmParameters createParametersInstance3 = createParametersInstance(algorithmName);
                    this.engineParams = createParametersInstance3;
                    createParametersInstance3.init(this.ivParam.getIV());
                } catch (Exception e12) {
                    throw new RuntimeException(e12.toString());
                }
            }
        }
        return this.engineParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v73, types: [org.spongycastle.crypto.params.ParametersWithIV] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v10, types: [org.spongycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v17, types: [org.spongycastle.crypto.params.RC5Parameters, org.spongycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r5v20, types: [org.spongycastle.crypto.params.RC2Parameters, org.spongycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24, types: [org.spongycastle.crypto.params.ParametersWithSBox, org.spongycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r5v27, types: [org.spongycastle.crypto.params.ParametersWithIV] */
    /* JADX WARN: Type inference failed for: r5v30, types: [org.spongycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r5v35, types: [org.spongycastle.crypto.params.AEADParameters] */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v57 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v64 */
    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        CipherParameters makePBEParameters;
        KeyParameter keyParameter;
        ParametersWithIV parametersWithIV;
        ParametersWithIV parametersWithIV2;
        GenericBlockCipher genericBlockCipher;
        KeyParameter keyParameter2;
        CipherParameters cipherParameters;
        ?? r52 = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        this.aeadParams = null;
        if (!(key instanceof SecretKey)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Key for algorithm ");
            sb2.append(key != null ? key.getAlgorithm() : null);
            sb2.append(" not suitable for symmetric enryption.");
            throw new InvalidKeyException(sb2.toString());
        } else if (algorithmParameterSpec == null && this.baseEngine.getAlgorithmName().startsWith("RC5-64")) {
            throw new InvalidAlgorithmParameterException("RC5 requires an RC5ParametersSpec to be passed in.");
        } else {
            int i12 = this.scheme;
            if (i12 != 2 && !(key instanceof PKCS12Key)) {
                if (key instanceof PBKDF1Key) {
                    PBKDF1Key pBKDF1Key = (PBKDF1Key) key;
                    if (algorithmParameterSpec instanceof PBEParameterSpec) {
                        this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                    }
                    if ((pBKDF1Key instanceof PBKDF1KeyWithParameters) && this.pbeSpec == null) {
                        PBKDF1KeyWithParameters pBKDF1KeyWithParameters = (PBKDF1KeyWithParameters) pBKDF1Key;
                        this.pbeSpec = new PBEParameterSpec(pBKDF1KeyWithParameters.getSalt(), pBKDF1KeyWithParameters.getIterationCount());
                    }
                    CipherParameters makePBEParameters2 = PBE.Util.makePBEParameters(pBKDF1Key.getEncoded(), 0, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                    boolean z11 = makePBEParameters2 instanceof ParametersWithIV;
                    r52 = makePBEParameters2;
                    if (z11) {
                        this.ivParam = (ParametersWithIV) makePBEParameters2;
                        r52 = makePBEParameters2;
                    }
                } else if (key instanceof BCPBEKey) {
                    BCPBEKey bCPBEKey = (BCPBEKey) key;
                    if (bCPBEKey.getOID() != null) {
                        this.pbeAlgorithm = bCPBEKey.getOID().getId();
                    } else {
                        this.pbeAlgorithm = bCPBEKey.getAlgorithm();
                    }
                    if (bCPBEKey.getParam() != null) {
                        cipherParameters = adjustParameters(algorithmParameterSpec, bCPBEKey.getParam());
                    } else if (algorithmParameterSpec instanceof PBEParameterSpec) {
                        this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                        cipherParameters = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.cipher.getUnderlyingCipher().getAlgorithmName());
                    } else {
                        throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                    }
                    boolean z12 = cipherParameters instanceof ParametersWithIV;
                    r52 = cipherParameters;
                    if (z12) {
                        this.ivParam = (ParametersWithIV) cipherParameters;
                        r52 = cipherParameters;
                    }
                } else if (key instanceof PBEKey) {
                    PBEKey pBEKey = (PBEKey) key;
                    PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                    this.pbeSpec = pBEParameterSpec;
                    if ((pBEKey instanceof PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                        this.pbeSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                    }
                    CipherParameters makePBEParameters3 = PBE.Util.makePBEParameters(pBEKey.getEncoded(), this.scheme, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                    boolean z13 = makePBEParameters3 instanceof ParametersWithIV;
                    r52 = makePBEParameters3;
                    if (z13) {
                        this.ivParam = (ParametersWithIV) makePBEParameters3;
                        r52 = makePBEParameters3;
                    }
                } else if (!(key instanceof RepeatedSecretKeySpec)) {
                    if (i12 != 0 && i12 != 4 && i12 != 1 && i12 != 5) {
                        r52 = new KeyParameter(key.getEncoded());
                    } else {
                        throw new InvalidKeyException("Algorithm requires a PBE key");
                    }
                }
            } else {
                try {
                    SecretKey secretKey = (SecretKey) key;
                    if (algorithmParameterSpec instanceof PBEParameterSpec) {
                        this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                    }
                    boolean z14 = secretKey instanceof PBEKey;
                    if (z14 && this.pbeSpec == null) {
                        PBEKey pBEKey2 = (PBEKey) secretKey;
                        if (pBEKey2.getSalt() != null) {
                            this.pbeSpec = new PBEParameterSpec(pBEKey2.getSalt(), pBEKey2.getIterationCount());
                        } else {
                            throw new InvalidAlgorithmParameterException("PBEKey requires parameters to specify salt");
                        }
                    }
                    if (this.pbeSpec == null && !z14) {
                        throw new InvalidKeyException("Algorithm requires a PBE key");
                    }
                    if (key instanceof BCPBEKey) {
                        CipherParameters param = ((BCPBEKey) key).getParam();
                        if (!(param instanceof ParametersWithIV)) {
                            if (param == null) {
                                param = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                            } else {
                                throw new InvalidKeyException("Algorithm requires a PBE key suitable for PKCS12");
                            }
                        }
                        makePBEParameters = param;
                    } else {
                        makePBEParameters = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
                    }
                    boolean z15 = makePBEParameters instanceof ParametersWithIV;
                    r52 = makePBEParameters;
                    if (z15) {
                        this.ivParam = (ParametersWithIV) makePBEParameters;
                        r52 = makePBEParameters;
                    }
                } catch (Exception unused) {
                    throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
                }
            }
            if (algorithmParameterSpec instanceof AEADParameterSpec) {
                if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher)) {
                    throw new InvalidAlgorithmParameterException("AEADParameterSpec can only be used with AEAD modes.");
                }
                AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
                if (r52 instanceof ParametersWithIV) {
                    keyParameter2 = (KeyParameter) ((ParametersWithIV) r52).getParameters();
                } else {
                    keyParameter2 = r52;
                }
                r52 = new AEADParameters(keyParameter2, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
                this.aeadParams = r52;
            } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                if (this.ivLength != 0) {
                    IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
                    if (ivParameterSpec.getIV().length != this.ivLength && !(this.cipher instanceof AEADGenericBlockCipher) && this.fixedIv) {
                        throw new InvalidAlgorithmParameterException("IV must be " + this.ivLength + " bytes long.");
                    }
                    if (r52 instanceof ParametersWithIV) {
                        parametersWithIV2 = new ParametersWithIV(((ParametersWithIV) r52).getParameters(), ivParameterSpec.getIV());
                    } else {
                        parametersWithIV2 = new ParametersWithIV(r52, ivParameterSpec.getIV());
                    }
                    r52 = parametersWithIV2;
                    this.ivParam = r52;
                } else {
                    String str = this.modeName;
                    if (str != null && str.equals("ECB")) {
                        throw new InvalidAlgorithmParameterException("ECB mode does not use an IV");
                    }
                }
            } else if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec) algorithmParameterSpec;
                r52 = new ParametersWithSBox(new KeyParameter(key.getEncoded()), gOST28147ParameterSpec.getSbox());
                if (gOST28147ParameterSpec.getIV() != null && this.ivLength != 0) {
                    if (r52 instanceof ParametersWithIV) {
                        parametersWithIV = new ParametersWithIV(((ParametersWithIV) r52).getParameters(), gOST28147ParameterSpec.getIV());
                    } else {
                        parametersWithIV = new ParametersWithIV(r52, gOST28147ParameterSpec.getIV());
                    }
                    this.ivParam = parametersWithIV;
                    r52 = parametersWithIV;
                }
            } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
                RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
                r52 = new RC2Parameters(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
                if (rC2ParameterSpec.getIV() != null && this.ivLength != 0) {
                    if (r52 instanceof ParametersWithIV) {
                        parametersWithIV = new ParametersWithIV(((ParametersWithIV) r52).getParameters(), rC2ParameterSpec.getIV());
                    } else {
                        parametersWithIV = new ParametersWithIV(r52, rC2ParameterSpec.getIV());
                    }
                    this.ivParam = parametersWithIV;
                    r52 = parametersWithIV;
                }
            } else if (algorithmParameterSpec instanceof RC5ParameterSpec) {
                RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
                r52 = new RC5Parameters(key.getEncoded(), rC5ParameterSpec.getRounds());
                if (this.baseEngine.getAlgorithmName().startsWith("RC5")) {
                    if (this.baseEngine.getAlgorithmName().equals("RC5-32")) {
                        if (rC5ParameterSpec.getWordSize() != 32) {
                            throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 32 not " + rC5ParameterSpec.getWordSize() + ".");
                        }
                    } else if (this.baseEngine.getAlgorithmName().equals("RC5-64") && rC5ParameterSpec.getWordSize() != 64) {
                        throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 64 not " + rC5ParameterSpec.getWordSize() + ".");
                    }
                    if (rC5ParameterSpec.getIV() != null && this.ivLength != 0) {
                        if (r52 instanceof ParametersWithIV) {
                            parametersWithIV = new ParametersWithIV(((ParametersWithIV) r52).getParameters(), rC5ParameterSpec.getIV());
                        } else {
                            parametersWithIV = new ParametersWithIV(r52, rC5ParameterSpec.getIV());
                        }
                        this.ivParam = parametersWithIV;
                        r52 = parametersWithIV;
                    }
                } else {
                    throw new InvalidAlgorithmParameterException("RC5 parameters passed to a cipher that is not RC5.");
                }
            } else {
                Class cls = gcmSpecClass;
                if (cls != null && cls.isInstance(algorithmParameterSpec)) {
                    if (!isAEADModeName(this.modeName) && !(this.cipher instanceof AEADGenericBlockCipher)) {
                        throw new InvalidAlgorithmParameterException("GCMParameterSpec can only be used with AEAD modes.");
                    }
                    try {
                        Method declaredMethod = cls.getDeclaredMethod("getTLen", new Class[0]);
                        Method declaredMethod2 = cls.getDeclaredMethod("getIV", new Class[0]);
                        if (r52 instanceof ParametersWithIV) {
                            keyParameter = (KeyParameter) ((ParametersWithIV) r52).getParameters();
                        } else {
                            keyParameter = (KeyParameter) r52;
                        }
                        AEADParameters aEADParameters = new AEADParameters(keyParameter, ((Integer) declaredMethod.invoke(algorithmParameterSpec, new Object[0])).intValue(), (byte[]) declaredMethod2.invoke(algorithmParameterSpec, new Object[0]));
                        this.aeadParams = aEADParameters;
                        r52 = aEADParameters;
                    } catch (Exception unused2) {
                        throw new InvalidAlgorithmParameterException("Cannot process GCMParameterSpec.");
                    }
                } else if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("unknown parameter type.");
                }
            }
            ParametersWithRandom parametersWithRandom = r52;
            if (this.ivLength != 0) {
                boolean z16 = r52 instanceof ParametersWithIV;
                parametersWithRandom = r52;
                if (!z16) {
                    boolean z17 = r52 instanceof AEADParameters;
                    parametersWithRandom = r52;
                    if (!z17) {
                        SecureRandom secureRandom2 = secureRandom == null ? new SecureRandom() : secureRandom;
                        if (i11 != 1 && i11 != 3) {
                            parametersWithRandom = r52;
                            if (this.cipher.getUnderlyingCipher().getAlgorithmName().indexOf("PGPCFB") < 0) {
                                throw new InvalidAlgorithmParameterException("no IV set when one expected");
                            }
                        } else {
                            byte[] bArr = new byte[this.ivLength];
                            secureRandom2.nextBytes(bArr);
                            ?? parametersWithIV3 = new ParametersWithIV(r52, bArr);
                            this.ivParam = parametersWithIV3;
                            parametersWithRandom = parametersWithIV3;
                        }
                    }
                }
            }
            if (secureRandom != null && this.padded) {
                parametersWithRandom = new ParametersWithRandom(parametersWithRandom, secureRandom);
            }
            try {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                throw new InvalidParameterException("unknown opmode " + i11 + " passed");
                            }
                        }
                    }
                    this.cipher.init(false, parametersWithRandom);
                    genericBlockCipher = this.cipher;
                    if ((genericBlockCipher instanceof AEADGenericBlockCipher) || this.aeadParams != null) {
                    }
                    this.aeadParams = new AEADParameters((KeyParameter) this.ivParam.getParameters(), ((AEADGenericBlockCipher) genericBlockCipher).cipher.getMac().length * 8, this.ivParam.getIV());
                    return;
                }
                this.cipher.init(true, parametersWithRandom);
                genericBlockCipher = this.cipher;
                if (genericBlockCipher instanceof AEADGenericBlockCipher) {
                }
            } catch (Exception e11) {
                throw new InvalidKeyOrParametersException(e11.getMessage(), e11);
            }
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) {
        String upperCase = Strings.toUpperCase(str);
        this.modeName = upperCase;
        if (upperCase.equals("ECB")) {
            this.ivLength = 0;
            this.cipher = new BufferedGenericBlockCipher(this.baseEngine);
        } else if (this.modeName.equals("CBC")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new CBCBlockCipher(this.baseEngine));
        } else if (this.modeName.startsWith("OFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                this.cipher = new BufferedGenericBlockCipher(new OFBBlockCipher(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            }
            BlockCipher blockCipher = this.baseEngine;
            this.cipher = new BufferedGenericBlockCipher(new OFBBlockCipher(blockCipher, blockCipher.getBlockSize() * 8));
        } else if (this.modeName.startsWith("CFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                this.cipher = new BufferedGenericBlockCipher(new CFBBlockCipher(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                return;
            }
            BlockCipher blockCipher2 = this.baseEngine;
            this.cipher = new BufferedGenericBlockCipher(new CFBBlockCipher(blockCipher2, blockCipher2.getBlockSize() * 8));
        } else if (this.modeName.startsWith("PGP")) {
            boolean equalsIgnoreCase = this.modeName.equalsIgnoreCase("PGPCFBwithIV");
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new PGPCFBBlockCipher(this.baseEngine, equalsIgnoreCase));
        } else if (this.modeName.equalsIgnoreCase("OpenPGPCFB")) {
            this.ivLength = 0;
            this.cipher = new BufferedGenericBlockCipher(new OpenPGPCFBBlockCipher(this.baseEngine));
        } else if (this.modeName.startsWith("SIC")) {
            int blockSize = this.baseEngine.getBlockSize();
            this.ivLength = blockSize;
            if (blockSize >= 16) {
                this.fixedIv = false;
                this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new SICBlockCipher(this.baseEngine)));
                return;
            }
            throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
        } else if (this.modeName.startsWith("CTR")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.fixedIv = false;
            this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new SICBlockCipher(this.baseEngine)));
        } else if (this.modeName.startsWith("GOFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new GOFBBlockCipher(this.baseEngine)));
        } else if (this.modeName.startsWith("GCFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(new GCFBBlockCipher(this.baseEngine)));
        } else if (this.modeName.startsWith("CTS")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new BufferedGenericBlockCipher(new CTSBlockCipher(new CBCBlockCipher(this.baseEngine)));
        } else if (this.modeName.startsWith("CCM")) {
            this.ivLength = 13;
            this.cipher = new AEADGenericBlockCipher(new CCMBlockCipher(this.baseEngine));
        } else if (this.modeName.startsWith("OCB")) {
            if (this.engineProvider != null) {
                this.ivLength = 15;
                this.cipher = new AEADGenericBlockCipher(new OCBBlockCipher(this.baseEngine, this.engineProvider.get()));
                return;
            }
            throw new NoSuchAlgorithmException("can't support mode " + str);
        } else if (this.modeName.startsWith("EAX")) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new AEADGenericBlockCipher(new EAXBlockCipher(this.baseEngine));
        } else if (this.modeName.startsWith(CodePackage.GCM)) {
            this.ivLength = this.baseEngine.getBlockSize();
            this.cipher = new AEADGenericBlockCipher(new GCMBlockCipher(this.baseEngine));
        } else {
            throw new NoSuchAlgorithmException("can't support mode " + str);
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) {
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            if (this.cipher.wrapOnNoPadding()) {
                this.cipher = new BufferedGenericBlockCipher(new BufferedBlockCipher(this.cipher.getUnderlyingCipher()));
            }
        } else if (upperCase.equals("WITHCTS")) {
            this.cipher = new BufferedGenericBlockCipher(new CTSBlockCipher(this.cipher.getUnderlyingCipher()));
        } else {
            this.padded = true;
            if (!isAEADModeName(this.modeName)) {
                if (!upperCase.equals("PKCS5PADDING") && !upperCase.equals("PKCS7PADDING")) {
                    if (upperCase.equals("ZEROBYTEPADDING")) {
                        this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ZeroBytePadding());
                        return;
                    } else if (!upperCase.equals("ISO10126PADDING") && !upperCase.equals("ISO10126-2PADDING")) {
                        if (!upperCase.equals("X9.23PADDING") && !upperCase.equals("X923PADDING")) {
                            if (!upperCase.equals("ISO7816-4PADDING") && !upperCase.equals("ISO9797-1PADDING")) {
                                if (upperCase.equals("TBCPADDING")) {
                                    this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new TBCPadding());
                                    return;
                                }
                                throw new NoSuchPaddingException("Padding " + str + " unknown.");
                            }
                            this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ISO7816d4Padding());
                            return;
                        }
                        this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new X923Padding());
                        return;
                    } else {
                        this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new ISO10126d2Padding());
                        return;
                    }
                }
                this.cipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
                return;
            }
            throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
        }
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i11, int i12) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i12);
        if (updateOutputSize > 0) {
            byte[] bArr2 = new byte[updateOutputSize];
            int processBytes = this.cipher.processBytes(bArr, i11, i12, bArr2, 0);
            if (processBytes == 0) {
                return null;
            }
            if (processBytes != updateOutputSize) {
                byte[] bArr3 = new byte[processBytes];
                System.arraycopy(bArr2, 0, bArr3, 0, processBytes);
                return bArr3;
            }
            return bArr2;
        }
        this.cipher.processBytes(bArr, i11, i12, null, 0);
        return null;
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] bArr, int i11, int i12) {
        this.cipher.updateAAD(bArr, i11, i12);
    }

    /* loaded from: classes4.dex */
    private static class BufferedGenericBlockCipher implements GenericBlockCipher {
        private BufferedBlockCipher cipher;

        BufferedGenericBlockCipher(BufferedBlockCipher bufferedBlockCipher) {
            this.cipher = bufferedBlockCipher;
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i11) {
            try {
                return this.cipher.doFinal(bArr, i11);
            } catch (InvalidCipherTextException e11) {
                throw new BadPaddingException(e11.getMessage());
            }
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.getUnderlyingCipher().getAlgorithmName();
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i11) {
            return this.cipher.getOutputSize(i11);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public BlockCipher getUnderlyingCipher() {
            return this.cipher.getUnderlyingCipher();
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i11) {
            return this.cipher.getUpdateOutputSize(i11);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z11, CipherParameters cipherParameters) {
            this.cipher.init(z11, cipherParameters);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b11, byte[] bArr, int i11) {
            return this.cipher.processByte(b11, bArr, i11);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
            return this.cipher.processBytes(bArr, i11, i12, bArr2, i13);
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i11, int i12) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return !(this.cipher instanceof CTSBlockCipher);
        }

        BufferedGenericBlockCipher(BlockCipher blockCipher) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher);
        }

        BufferedGenericBlockCipher(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
            this.cipher = new PaddedBufferedBlockCipher(blockCipher, blockCipherPadding);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(ByteBuffer byteBuffer) {
        engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        int processBytes;
        if (engineGetOutputSize(i12) + i13 <= bArr2.length) {
            if (i12 != 0) {
                try {
                    processBytes = this.cipher.processBytes(bArr, i11, i12, bArr2, i13);
                } catch (OutputLengthException e11) {
                    throw new IllegalBlockSizeException(e11.getMessage());
                } catch (DataLengthException e12) {
                    throw new IllegalBlockSizeException(e12.getMessage());
                }
            } else {
                processBytes = 0;
            }
            return processBytes + this.cipher.doFinal(bArr2, i13 + processBytes);
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (this.cipher.getUpdateOutputSize(i12) + i13 <= bArr2.length) {
            try {
                return this.cipher.processBytes(bArr, i11, i12, bArr2, i13);
            } catch (DataLengthException e11) {
                throw new IllegalStateException(e11.toString());
            }
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(BlockCipher blockCipher, int i11, int i12, int i13, int i14) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.scheme = i11;
        this.digest = i12;
        this.keySizeInBits = i13;
        this.ivLength = i14;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipherProvider.get();
        this.engineProvider = blockCipherProvider;
        this.cipher = new BufferedGenericBlockCipher(blockCipherProvider.get());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(AEADBlockCipher aEADBlockCipher) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        BlockCipher underlyingCipher = aEADBlockCipher.getUnderlyingCipher();
        this.baseEngine = underlyingCipher;
        this.ivLength = underlyingCipher.getBlockSize();
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(AEADBlockCipher aEADBlockCipher, boolean z11, int i11) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aEADBlockCipher.getUnderlyingCipher();
        this.fixedIv = z11;
        this.ivLength = i11;
        this.cipher = new AEADGenericBlockCipher(aEADBlockCipher);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(BlockCipher blockCipher, int i11) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = blockCipher;
        this.cipher = new BufferedGenericBlockCipher(blockCipher);
        this.ivLength = i11 / 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(BufferedBlockCipher bufferedBlockCipher, int i11) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, IvParameterSpec.class, PBEParameterSpec.class, GOST28147ParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = bufferedBlockCipher.getUnderlyingCipher();
        this.cipher = new BufferedGenericBlockCipher(bufferedBlockCipher);
        this.ivLength = i11 / 8;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (algorithmParameters != null) {
            int i12 = 0;
            while (true) {
                Class[] clsArr = this.availableSpecs;
                if (i12 == clsArr.length) {
                    break;
                }
                if (clsArr[i12] != null) {
                    try {
                        algorithmParameterSpec = algorithmParameters.getParameterSpec(clsArr[i12]);
                        break;
                    } catch (Exception unused) {
                        i12++;
                    }
                }
                i12++;
            }
            if (algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        engineInit(i11, key, algorithmParameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    @Override // org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i11, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i11, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new InvalidKeyException(e11.getMessage());
        }
    }
}