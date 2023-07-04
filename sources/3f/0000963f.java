package org.bouncycastle.jcajce.provider.symmetric.util;

import e60.j;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.b0;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import u50.b1;
import u50.f1;

/* loaded from: classes5.dex */
public class BaseStreamCipher extends BaseWrapCipher {
    private Class[] availableSpecs;
    private b0 cipher;
    private int digest;
    private int ivLength;
    private f1 ivParam;
    private int keySizeInBits;
    private String pbeAlgorithm;
    private PBEParameterSpec pbeSpec;

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseStreamCipher(b0 b0Var, int i11) {
        this(b0Var, i11, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseStreamCipher(b0 b0Var, int i11, int i12) {
        this(b0Var, i11, i12, -1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseStreamCipher(b0 b0Var, int i11, int i12, int i13) {
        this.availableSpecs = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.ivLength = 0;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.cipher = b0Var;
        this.ivLength = i11;
        this.keySizeInBits = i12;
        this.digest = i13;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i13 + i12 <= bArr2.length) {
            if (i12 != 0) {
                this.cipher.processBytes(bArr, i11, i12, bArr2, i13);
            }
            this.cipher.reset();
            return i12;
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i11, int i12) {
        if (i12 == 0) {
            this.cipher.reset();
            return new byte[0];
        }
        byte[] engineUpdate = engineUpdate(bArr, i11, i12);
        this.cipher.reset();
        return engineUpdate;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
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
        return i11;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.pbeSpec != null) {
                try {
                    AlgorithmParameters createParametersInstance = createParametersInstance(this.pbeAlgorithm);
                    createParametersInstance.init(this.pbeSpec);
                    return createParametersInstance;
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.ivParam != null) {
                String algorithmName = this.cipher.getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                if (algorithmName.startsWith("ChaCha7539")) {
                    algorithmName = "ChaCha7539";
                } else if (algorithmName.startsWith("Grain")) {
                    algorithmName = "Grainv1";
                } else if (algorithmName.startsWith("HC")) {
                    int indexOf = algorithmName.indexOf(45);
                    algorithmName = algorithmName.substring(0, indexOf) + algorithmName.substring(indexOf + 1);
                }
                try {
                    AlgorithmParameters createParametersInstance2 = createParametersInstance(algorithmName);
                    this.engineParams = createParametersInstance2;
                    createParametersInstance2.init(new IvParameterSpec(this.ivParam.a()));
                } catch (Exception e11) {
                    throw new RuntimeException(e11.toString());
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

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        f1 f1Var;
        i b1Var;
        this.pbeSpec = null;
        this.pbeAlgorithm = null;
        this.engineParams = null;
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("Key for algorithm " + key.getAlgorithm() + " not suitable for symmetric enryption.");
        }
        if (key instanceof e60.i) {
            e60.i iVar = (e60.i) key;
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.pbeSpec = pBEParameterSpec;
            if ((iVar instanceof j) && pBEParameterSpec == null) {
                j jVar = (j) iVar;
                this.pbeSpec = new PBEParameterSpec(jVar.getSalt(), jVar.getIterationCount());
            }
            f1Var = PBE.Util.makePBEParameters(iVar.getEncoded(), 2, this.digest, this.keySizeInBits, this.ivLength * 8, this.pbeSpec, this.cipher.getAlgorithmName());
        } else {
            if (key instanceof BCPBEKey) {
                BCPBEKey bCPBEKey = (BCPBEKey) key;
                this.pbeAlgorithm = bCPBEKey.getOID() != null ? bCPBEKey.getOID().t() : bCPBEKey.getAlgorithm();
                if (bCPBEKey.getParam() != null) {
                    b1Var = bCPBEKey.getParam();
                    this.pbeSpec = new PBEParameterSpec(bCPBEKey.getSalt(), bCPBEKey.getIterationCount());
                } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                } else {
                    i makePBEParameters = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.cipher.getAlgorithmName());
                    this.pbeSpec = (PBEParameterSpec) algorithmParameterSpec;
                    b1Var = makePBEParameters;
                }
                if (bCPBEKey.getIvSize() != 0) {
                    this.ivParam = (f1) b1Var;
                }
            } else if (algorithmParameterSpec == null) {
                if (this.digest > 0) {
                    throw new InvalidKeyException("Algorithm requires a PBE key");
                }
                b1Var = new b1(key.getEncoded());
            } else if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unknown parameter type.");
            } else {
                f1 f1Var2 = new f1(new b1(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                this.ivParam = f1Var2;
                f1Var = f1Var2;
            }
            f1Var = b1Var;
        }
        if (this.ivLength != 0 && !(f1Var instanceof f1)) {
            if (secureRandom == null) {
                secureRandom = k.b();
            }
            if (i11 != 1 && i11 != 3) {
                throw new InvalidAlgorithmParameterException("no IV set when one expected");
            }
            byte[] bArr = new byte[this.ivLength];
            secureRandom.nextBytes(bArr);
            f1 f1Var3 = new f1(f1Var, bArr);
            this.ivParam = f1Var3;
            f1Var = f1Var3;
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
                this.cipher.init(false, f1Var);
                return;
            }
            this.cipher.init(true, f1Var);
        } catch (Exception e11) {
            throw new InvalidKeyException(e11.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetMode(String str) {
        if (str.equalsIgnoreCase("ECB") || str.equals("NONE")) {
            return;
        }
        throw new NoSuchAlgorithmException("can't support mode " + str);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected void engineSetPadding(String str) {
        if (str.equalsIgnoreCase("NoPadding")) {
            return;
        }
        throw new NoSuchPaddingException("Padding " + str + " unknown.");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i13 + i12 <= bArr2.length) {
            try {
                this.cipher.processBytes(bArr, i11, i12, bArr2, i13);
                return i12;
            } catch (DataLengthException e11) {
                throw new IllegalStateException(e11.getMessage());
            }
        }
        throw new ShortBufferException("output buffer too short for input.");
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        this.cipher.processBytes(bArr, i11, i12, bArr2, 0);
        return bArr2;
    }
}