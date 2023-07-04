package org.bouncycastle.jcajce.provider.symmetric.util;

import b60.c;
import com.google.android.gms.stats.CodePackage;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import l50.r;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.i;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;
import q50.b;
import q50.d;
import q50.h;
import q50.o;
import q50.p;
import q50.s;
import q50.t;
import q50.u;
import q50.v;
import q50.w;
import q50.x;
import q50.y;
import r70.m;
import t50.g;
import u50.a;
import u50.f1;
import u50.h1;
import w40.n;

/* loaded from: classes5.dex */
public class BaseBlockCipher extends BaseWrapCipher {
    private static final int BUF_SIZE = 512;
    private static final Class gcmSpecClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.spec.GCMParameterSpec");
    private a aeadParams;
    private Class[] availableSpecs;
    private e baseEngine;
    private GenericBlockCipher cipher;
    private int digest;
    private BlockCipherProvider engineProvider;
    private boolean fixedIv;
    private int ivLength;
    private f1 ivParam;
    private int keySizeInBits;
    private String modeName;
    private boolean padded;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;
    private int scheme;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class AEADGenericBlockCipher implements GenericBlockCipher {
        private static final Constructor aeadBadTagConstructor;
        private b cipher;

        static {
            Class loadClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
            aeadBadTagConstructor = loadClass != null ? findExceptionConstructor(loadClass) : null;
        }

        AEADGenericBlockCipher(b bVar) {
            this.cipher = bVar;
        }

        private static Constructor findExceptionConstructor(Class cls) {
            try {
                return cls.getConstructor(String.class);
            } catch (Exception unused) {
                return null;
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
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

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            b bVar = this.cipher;
            return bVar instanceof q50.a ? ((q50.a) bVar).getUnderlyingCipher().getAlgorithmName() : bVar.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i11) {
            return this.cipher.getOutputSize(i11);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public e getUnderlyingCipher() {
            b bVar = this.cipher;
            if (bVar instanceof q50.a) {
                return ((q50.a) bVar).getUnderlyingCipher();
            }
            return null;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i11) {
            return this.cipher.getUpdateOutputSize(i11);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z11, i iVar) {
            this.cipher.init(z11, iVar);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b11, byte[] bArr, int i11) {
            return this.cipher.processByte(b11, bArr, i11);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
            return this.cipher.processBytes(bArr, i11, i12, bArr2, i13);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i11, int i12) {
            this.cipher.processAADBytes(bArr, i11, i12);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    /* loaded from: classes5.dex */
    private static class BufferedFPEBlockCipher implements GenericBlockCipher {
        private m50.a cipher;
        private BaseWrapCipher.ErasableOutputStream eOut = new BaseWrapCipher.ErasableOutputStream();

        BufferedFPEBlockCipher(m50.a aVar) {
            this.cipher = aVar;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i11) {
            try {
                return this.cipher.e(this.eOut.getBuf(), 0, this.eOut.size(), bArr, i11);
            } finally {
                this.eOut.erase();
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.c();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i11) {
            return this.eOut.size() + i11;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public e getUnderlyingCipher() {
            throw new IllegalStateException("not applicable for FPE");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i11) {
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z11, i iVar) {
            this.cipher.d(z11, iVar);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b11, byte[] bArr, int i11) {
            this.eOut.write(b11);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
            this.eOut.write(bArr, i11, i12);
            return 0;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i11, int i12) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return false;
        }
    }

    /* loaded from: classes5.dex */
    private static class BufferedGenericBlockCipher implements GenericBlockCipher {
        private f cipher;

        BufferedGenericBlockCipher(e eVar) {
            this.cipher = new t50.e(eVar);
        }

        BufferedGenericBlockCipher(e eVar, t50.a aVar) {
            this.cipher = new t50.e(eVar, aVar);
        }

        BufferedGenericBlockCipher(f fVar) {
            this.cipher = fVar;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int doFinal(byte[] bArr, int i11) {
            try {
                return this.cipher.a(bArr, i11);
            } catch (InvalidCipherTextException e11) {
                throw new BadPaddingException(e11.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public String getAlgorithmName() {
            return this.cipher.d().getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getOutputSize(int i11) {
            return this.cipher.c(i11);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public e getUnderlyingCipher() {
            return this.cipher.d();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int getUpdateOutputSize(int i11) {
            return this.cipher.e(i11);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void init(boolean z11, i iVar) {
            this.cipher.f(z11, iVar);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processByte(byte b11, byte[] bArr, int i11) {
            return this.cipher.g(b11, bArr, i11);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
            return this.cipher.h(bArr, i11, i12, bArr2, i13);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public void updateAAD(byte[] bArr, int i11, int i12) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.GenericBlockCipher
        public boolean wrapOnNoPadding() {
            return !(this.cipher instanceof q50.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public interface GenericBlockCipher {
        int doFinal(byte[] bArr, int i11);

        String getAlgorithmName();

        int getOutputSize(int i11);

        e getUnderlyingCipher();

        int getUpdateOutputSize(int i11);

        void init(boolean z11, i iVar);

        int processByte(byte b11, byte[] bArr, int i11);

        int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13);

        void updateAAD(byte[] bArr, int i11, int i12);

        boolean wrapOnNoPadding();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(e eVar) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h60.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = eVar;
        this.cipher = new BufferedGenericBlockCipher(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(e eVar, int i11) {
        this(eVar, true, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(e eVar, int i11, int i12, int i13, int i14) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h60.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = eVar;
        this.scheme = i11;
        this.digest = i12;
        this.keySizeInBits = i13;
        this.ivLength = i14;
        this.cipher = new BufferedGenericBlockCipher(eVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(e eVar, boolean z11, int i11) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h60.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = eVar;
        this.fixedIv = z11;
        this.cipher = new BufferedGenericBlockCipher(eVar);
        this.ivLength = i11 / 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(f fVar, int i11) {
        this(fVar, true, i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(f fVar, boolean z11, int i11) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h60.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = fVar.d();
        this.cipher = new BufferedGenericBlockCipher(fVar);
        this.fixedIv = z11;
        this.ivLength = i11 / 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h60.i.class, IvParameterSpec.class, PBEParameterSpec.class};
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
    public BaseBlockCipher(q50.a aVar) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h60.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aVar.getUnderlyingCipher();
        this.ivLength = aVar.getAlgorithmName().indexOf(CodePackage.GCM) >= 0 ? 12 : this.baseEngine.getBlockSize();
        this.cipher = new AEADGenericBlockCipher(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(q50.a aVar, boolean z11, int i11) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h60.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = aVar.getUnderlyingCipher();
        this.fixedIv = z11;
        this.ivLength = i11;
        this.cipher = new AEADGenericBlockCipher(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseBlockCipher(b bVar, boolean z11, int i11) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, gcmSpecClass, h60.i.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.scheme = -1;
        this.ivLength = 0;
        this.fixedIv = true;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.modeName = null;
        this.baseEngine = null;
        this.fixedIv = z11;
        this.ivLength = i11;
        this.cipher = new AEADGenericBlockCipher(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i adjustParameters(AlgorithmParameterSpec algorithmParameterSpec, i iVar) {
        h1 h1Var;
        f1 f1Var;
        if (iVar instanceof f1) {
            i b11 = ((f1) iVar).b();
            if (algorithmParameterSpec instanceof IvParameterSpec) {
                f1Var = new f1(b11, ((IvParameterSpec) algorithmParameterSpec).getIV());
            } else if (!(algorithmParameterSpec instanceof h60.i)) {
                return iVar;
            } else {
                h60.i iVar2 = (h60.i) algorithmParameterSpec;
                h1 h1Var2 = new h1(iVar, iVar2.d());
                if (iVar2.a() == null || this.ivLength == 0) {
                    return h1Var2;
                }
                f1Var = new f1(b11, iVar2.a());
            }
            this.ivParam = f1Var;
            return f1Var;
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            f1 f1Var2 = new f1(iVar, ((IvParameterSpec) algorithmParameterSpec).getIV());
            this.ivParam = f1Var2;
            h1Var = f1Var2;
        } else if (!(algorithmParameterSpec instanceof h60.i)) {
            return iVar;
        } else {
            h60.i iVar3 = (h60.i) algorithmParameterSpec;
            h1 h1Var3 = new h1(iVar, iVar3.d());
            h1Var = h1Var3;
            if (iVar3.a() != null) {
                h1Var = h1Var3;
                if (this.ivLength != 0) {
                    return new f1(h1Var3, iVar3.a());
                }
            }
        }
        return h1Var;
    }

    private boolean isAEADModeName(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || CodePackage.GCM.equals(str) || "GCM-SIV".equals(str) || "OCB".equals(str);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
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

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i11, int i12) {
        int engineGetOutputSize = engineGetOutputSize(i12);
        byte[] bArr2 = new byte[engineGetOutputSize];
        int processBytes = i12 != 0 ? this.cipher.processBytes(bArr, i11, i12, bArr2, 0) : 0;
        try {
            int doFinal = processBytes + this.cipher.doFinal(bArr2, processBytes);
            if (doFinal == engineGetOutputSize) {
                return bArr2;
            }
            if (doFinal <= engineGetOutputSize) {
                byte[] bArr3 = new byte[doFinal];
                System.arraycopy(bArr2, 0, bArr3, 0, doFinal);
                return bArr3;
            }
            throw new IllegalBlockSizeException("internal buffer overflow");
        } catch (DataLengthException e11) {
            throw new IllegalBlockSizeException(e11.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        e eVar = this.baseEngine;
        if (eVar == null) {
            return -1;
        }
        return eVar.getBlockSize();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        a aVar = this.aeadParams;
        if (aVar != null) {
            return aVar.d();
        }
        f1 f1Var = this.ivParam;
        if (f1Var != null) {
            return f1Var.a();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i11) {
        return this.cipher.getOutputSize(i11);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
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
                if (this.baseEngine == null) {
                    try {
                        AlgorithmParameters createParametersInstance2 = createParametersInstance(n.H2.t());
                        this.engineParams = createParametersInstance2;
                        createParametersInstance2.init(new s0(this.aeadParams.d()).getEncoded());
                    } catch (Exception e11) {
                        throw new RuntimeException(e11.toString());
                    }
                } else {
                    try {
                        AlgorithmParameters createParametersInstance3 = createParametersInstance(CodePackage.GCM);
                        this.engineParams = createParametersInstance3;
                        createParametersInstance3.init(new c(this.aeadParams.d(), this.aeadParams.c() / 8).getEncoded());
                    } catch (Exception e12) {
                        throw new RuntimeException(e12.toString());
                    }
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    AlgorithmParameters createParametersInstance4 = createParametersInstance(algorithmName);
                    this.engineParams = createParametersInstance4;
                    createParametersInstance4.init(new IvParameterSpec(this.ivParam.a()));
                } catch (Exception e13) {
                    throw new RuntimeException(e13.toString());
                }
            }
        }
        return this.engineParams;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec algorithmParameterSpec;
        if (algorithmParameters != null) {
            algorithmParameterSpec = SpecUtil.extractSpec(algorithmParameters, this.availableSpecs);
            if (algorithmParameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        } else {
            algorithmParameterSpec = null;
        }
        engineInit(i11, key, algorithmParameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i11, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i11, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new InvalidKeyException(e11.getMessage());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01f9, code lost:
        if (r8 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ac, code lost:
        if (r8 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
        r20.ivParam = (u50.f1) r6;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
        if (r8 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0145, code lost:
        if (r8 != false) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:220:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x04dd A[Catch: Exception -> 0x0504, IllegalArgumentException -> 0x050f, TryCatch #3 {IllegalArgumentException -> 0x050f, Exception -> 0x0504, blocks: (B:245:0x04af, B:246:0x04ca, B:247:0x04cb, B:249:0x04d7, B:251:0x04dd, B:253:0x04e1, B:248:0x04d2), top: B:265:0x04a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:266:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v83, types: [u50.f1] */
    /* JADX WARN: Type inference failed for: r6v11, types: [org.bouncycastle.crypto.i] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [org.bouncycastle.crypto.i, u50.k1] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22, types: [u50.f1] */
    /* JADX WARN: Type inference failed for: r6v24, types: [org.bouncycastle.crypto.i] */
    /* JADX WARN: Type inference failed for: r6v29, types: [u50.a] */
    /* JADX WARN: Type inference failed for: r6v55 */
    /* JADX WARN: Type inference failed for: r6v56 */
    /* JADX WARN: Type inference failed for: r6v57 */
    /* JADX WARN: Type inference failed for: r6v58 */
    /* JADX WARN: Type inference failed for: r6v59 */
    /* JADX WARN: Type inference failed for: r6v60 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62 */
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void engineInit(int r21, java.security.Key r22, java.security.spec.AlgorithmParameterSpec r23, java.security.SecureRandom r24) {
        /*
            Method dump skipped, instructions count: 1314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.engineInit(int, java.security.Key, java.security.spec.AlgorithmParameterSpec, java.security.SecureRandom):void");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) {
        GenericBlockCipher aEADGenericBlockCipher;
        BufferedGenericBlockCipher bufferedGenericBlockCipher;
        if (this.baseEngine == null) {
            throw new NoSuchAlgorithmException("no mode supported for this algorithm");
        }
        String k11 = m.k(str);
        this.modeName = k11;
        if (k11.equals("ECB")) {
            this.ivLength = 0;
            aEADGenericBlockCipher = new BufferedGenericBlockCipher(this.baseEngine);
        } else if (this.modeName.equals("CBC")) {
            this.ivLength = this.baseEngine.getBlockSize();
            aEADGenericBlockCipher = new BufferedGenericBlockCipher(new q50.c(this.baseEngine));
        } else if (this.modeName.startsWith("OFB")) {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new v(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                this.cipher = bufferedGenericBlockCipher;
                return;
            }
            e eVar = this.baseEngine;
            aEADGenericBlockCipher = new BufferedGenericBlockCipher(new v(eVar, eVar.getBlockSize() * 8));
        } else if (!this.modeName.startsWith("CFB")) {
            if (this.modeName.startsWith("PGPCFB")) {
                boolean equals = this.modeName.equals("PGPCFBWITHIV");
                if (!equals && this.modeName.length() != 6) {
                    throw new NoSuchAlgorithmException("no mode support for " + this.modeName);
                }
                this.ivLength = this.baseEngine.getBlockSize();
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new x(this.baseEngine, equals));
            } else if (this.modeName.equals("OPENPGPCFB")) {
                this.ivLength = 0;
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(new w(this.baseEngine));
            } else if (this.modeName.equals("FF1")) {
                this.ivLength = 0;
                aEADGenericBlockCipher = new BufferedFPEBlockCipher(new m50.b(this.baseEngine));
            } else if (this.modeName.equals("FF3-1")) {
                this.ivLength = 0;
                aEADGenericBlockCipher = new BufferedFPEBlockCipher(new m50.c(this.baseEngine));
            } else if (this.modeName.equals("SIC")) {
                int blockSize = this.baseEngine.getBlockSize();
                this.ivLength = blockSize;
                if (blockSize < 16) {
                    throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
                }
                this.fixedIv = false;
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(new f(new y(this.baseEngine)));
            } else if (this.modeName.equals("CTR")) {
                this.ivLength = this.baseEngine.getBlockSize();
                this.fixedIv = false;
                e eVar2 = this.baseEngine;
                bufferedGenericBlockCipher = eVar2 instanceof r ? new BufferedGenericBlockCipher(new f(new s(eVar2))) : new BufferedGenericBlockCipher(new f(new y(eVar2)));
            } else if (this.modeName.equals("GOFB")) {
                this.ivLength = this.baseEngine.getBlockSize();
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(new f(new p(this.baseEngine)));
            } else if (this.modeName.equals("GCFB")) {
                this.ivLength = this.baseEngine.getBlockSize();
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(new f(new q50.m(this.baseEngine)));
            } else if (this.modeName.equals("CTS")) {
                this.ivLength = this.baseEngine.getBlockSize();
                aEADGenericBlockCipher = new BufferedGenericBlockCipher(new q50.f(new q50.c(this.baseEngine)));
            } else if (this.modeName.equals("CCM")) {
                this.ivLength = 12;
                aEADGenericBlockCipher = this.baseEngine instanceof r ? new AEADGenericBlockCipher(new q50.r(this.baseEngine)) : new AEADGenericBlockCipher(new d(this.baseEngine));
            } else if (this.modeName.equals("OCB")) {
                if (this.engineProvider == null) {
                    throw new NoSuchAlgorithmException("can't support mode " + str);
                }
                this.ivLength = 15;
                aEADGenericBlockCipher = new AEADGenericBlockCipher(new u(this.baseEngine, this.engineProvider.get()));
            } else if (this.modeName.equals("EAX")) {
                this.ivLength = this.baseEngine.getBlockSize();
                aEADGenericBlockCipher = new AEADGenericBlockCipher(new h(this.baseEngine));
            } else if (this.modeName.equals("GCM-SIV")) {
                this.ivLength = 12;
                aEADGenericBlockCipher = new AEADGenericBlockCipher(new o(this.baseEngine));
            } else if (!this.modeName.equals(CodePackage.GCM)) {
                throw new NoSuchAlgorithmException("can't support mode " + str);
            } else {
                e eVar3 = this.baseEngine;
                if (eVar3 instanceof r) {
                    this.ivLength = eVar3.getBlockSize();
                    aEADGenericBlockCipher = new AEADGenericBlockCipher(new t(this.baseEngine));
                } else {
                    this.ivLength = 12;
                    aEADGenericBlockCipher = new AEADGenericBlockCipher(new q50.n(this.baseEngine));
                }
            }
            this.cipher = bufferedGenericBlockCipher;
            return;
        } else {
            this.ivLength = this.baseEngine.getBlockSize();
            if (this.modeName.length() != 3) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new q50.e(this.baseEngine, Integer.parseInt(this.modeName.substring(3))));
                this.cipher = bufferedGenericBlockCipher;
                return;
            }
            e eVar4 = this.baseEngine;
            aEADGenericBlockCipher = new BufferedGenericBlockCipher(new q50.e(eVar4, eVar4.getBlockSize() * 8));
        }
        this.cipher = aEADGenericBlockCipher;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) {
        BufferedGenericBlockCipher bufferedGenericBlockCipher;
        if (this.baseEngine == null) {
            throw new NoSuchPaddingException("no padding supported for this algorithm");
        }
        String k11 = m.k(str);
        if (k11.equals("NOPADDING")) {
            if (!this.cipher.wrapOnNoPadding()) {
                return;
            }
            bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new f(this.cipher.getUnderlyingCipher()));
        } else if (k11.equals("WITHCTS") || k11.equals("CTSPADDING") || k11.equals("CS3PADDING")) {
            bufferedGenericBlockCipher = new BufferedGenericBlockCipher(new q50.f(this.cipher.getUnderlyingCipher()));
        } else {
            this.padded = true;
            if (isAEADModeName(this.modeName)) {
                throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
            }
            if (k11.equals("PKCS5PADDING") || k11.equals("PKCS7PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher());
            } else if (k11.equals("ZEROBYTEPADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new t50.h());
            } else if (k11.equals("ISO10126PADDING") || k11.equals("ISO10126-2PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new t50.b());
            } else if (k11.equals("X9.23PADDING") || k11.equals("X923PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new g());
            } else if (k11.equals("ISO7816-4PADDING") || k11.equals("ISO9797-1PADDING")) {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new t50.c());
            } else if (!k11.equals("TBCPADDING")) {
                throw new NoSuchPaddingException("Padding " + str + " unknown.");
            } else {
                bufferedGenericBlockCipher = new BufferedGenericBlockCipher(this.cipher.getUnderlyingCipher(), new t50.f());
            }
        }
        this.cipher = bufferedGenericBlockCipher;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
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

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i11, int i12) {
        int updateOutputSize = this.cipher.getUpdateOutputSize(i12);
        if (updateOutputSize <= 0) {
            this.cipher.processBytes(bArr, i11, i12, null, 0);
            return null;
        }
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

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        if (remaining < 1) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), remaining);
            byteBuffer.position(byteBuffer.limit());
        } else if (remaining <= 512) {
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, remaining);
            org.bouncycastle.util.a.y(bArr, (byte) 0);
        } else {
            byte[] bArr2 = new byte[512];
            do {
                int min = Math.min(512, remaining);
                byteBuffer.get(bArr2, 0, min);
                engineUpdateAAD(bArr2, 0, min);
                remaining -= min;
            } while (remaining > 0);
            org.bouncycastle.util.a.y(bArr2, (byte) 0);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineUpdateAAD(byte[] bArr, int i11, int i12) {
        this.cipher.updateAAD(bArr, i11, i12);
    }
}