package org.bouncycastle.jcajce.provider.symmetric.util;

import h60.j;
import i60.c;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.c0;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.a;
import u50.b1;
import u50.f1;
import u50.g1;
import u50.h1;
import u50.i1;
import w40.p;

/* loaded from: classes5.dex */
public abstract class BaseWrapCipher extends CipherSpi implements PBE {
    private Class[] availableSpecs;
    protected AlgorithmParameters engineParams;
    private boolean forWrapping;
    private final c helper;

    /* renamed from: iv  reason: collision with root package name */
    private byte[] f43186iv;
    private int ivSize;
    protected int pbeHash;
    protected int pbeIvSize;
    protected int pbeKeySize;
    protected int pbeType;
    protected c0 wrapEngine;
    private ErasableOutputStream wrapStream;

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            a.y(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static class InvalidKeyOrParametersException extends InvalidKeyException {
        private final Throwable cause;

        /* JADX INFO: Access modifiers changed from: package-private */
        public InvalidKeyOrParametersException(String str, Throwable th2) {
            super(str);
            this.cause = th2;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseWrapCipher() {
        this.availableSpecs = new Class[]{j.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new i60.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseWrapCipher(c0 c0Var) {
        this(c0Var, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BaseWrapCipher(c0 c0Var, int i11) {
        this.availableSpecs = new Class[]{j.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class};
        this.pbeType = 2;
        this.pbeHash = 1;
        this.engineParams = null;
        this.wrapEngine = null;
        this.wrapStream = null;
        this.helper = new i60.a();
        this.wrapEngine = c0Var;
        this.ivSize = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AlgorithmParameters createParametersInstance(String str) {
        return this.helper.createAlgorithmParameters(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041 A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #2 {all -> 0x005f, blocks: (B:5:0x0007, B:8:0x000c, B:14:0x003c, B:16:0x0041, B:19:0x004c, B:20:0x0053, B:13:0x002a, B:11:0x0020, B:12:0x0029, B:22:0x0055, B:23:0x005e), top: B:33:0x0007, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #2 {all -> 0x005f, blocks: (B:5:0x0007, B:8:0x000c, B:14:0x003c, B:16:0x0041, B:19:0x004c, B:20:0x0053, B:13:0x002a, B:11:0x0020, B:12:0x0029, B:22:0x0055, B:23:0x005e), top: B:33:0x0007, inners: #0, #1 }] */
    @Override // javax.crypto.CipherSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected int engineDoFinal(byte[] r2, int r3, int r4, byte[] r5, int r6) {
        /*
            r1 = this;
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r0 = r1.wrapStream
            if (r0 == 0) goto L66
            r0.write(r2, r3, r4)
            boolean r2 = r1.forWrapping     // Catch: java.lang.Throwable -> L5f
            r3 = 0
            if (r2 == 0) goto L2a
            org.bouncycastle.crypto.c0 r2 = r1.wrapEngine     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L5f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r4 = r1.wrapStream     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L5f
            byte[] r4 = r4.getBuf()     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L5f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r0 = r1.wrapStream     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L5f
            int r0 = r0.size()     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L5f
            byte[] r2 = r2.wrap(r4, r3, r0)     // Catch: java.lang.Exception -> L1f java.lang.Throwable -> L5f
            goto L3c
        L1f:
            r2 = move-exception
            javax.crypto.IllegalBlockSizeException r3 = new javax.crypto.IllegalBlockSizeException     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            throw r3     // Catch: java.lang.Throwable -> L5f
        L2a:
            org.bouncycastle.crypto.c0 r2 = r1.wrapEngine     // Catch: org.bouncycastle.crypto.InvalidCipherTextException -> L54 java.lang.Throwable -> L5f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r4 = r1.wrapStream     // Catch: org.bouncycastle.crypto.InvalidCipherTextException -> L54 java.lang.Throwable -> L5f
            byte[] r4 = r4.getBuf()     // Catch: org.bouncycastle.crypto.InvalidCipherTextException -> L54 java.lang.Throwable -> L5f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r0 = r1.wrapStream     // Catch: org.bouncycastle.crypto.InvalidCipherTextException -> L54 java.lang.Throwable -> L5f
            int r0 = r0.size()     // Catch: org.bouncycastle.crypto.InvalidCipherTextException -> L54 java.lang.Throwable -> L5f
            byte[] r2 = r2.unwrap(r4, r3, r0)     // Catch: org.bouncycastle.crypto.InvalidCipherTextException -> L54 java.lang.Throwable -> L5f
        L3c:
            int r4 = r2.length     // Catch: java.lang.Throwable -> L5f
            int r4 = r4 + r6
            int r0 = r5.length     // Catch: java.lang.Throwable -> L5f
            if (r4 > r0) goto L4c
            int r4 = r2.length     // Catch: java.lang.Throwable -> L5f
            java.lang.System.arraycopy(r2, r3, r5, r6, r4)     // Catch: java.lang.Throwable -> L5f
            int r2 = r2.length     // Catch: java.lang.Throwable -> L5f
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r3 = r1.wrapStream
            r3.erase()
            return r2
        L4c:
            javax.crypto.ShortBufferException r2 = new javax.crypto.ShortBufferException     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = "output buffer too short for input."
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L5f
            throw r2     // Catch: java.lang.Throwable -> L5f
        L54:
            r2 = move-exception
            javax.crypto.BadPaddingException r3 = new javax.crypto.BadPaddingException     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            throw r3     // Catch: java.lang.Throwable -> L5f
        L5f:
            r2 = move-exception
            org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher$ErasableOutputStream r3 = r1.wrapStream
            r3.erase()
            throw r2
        L66:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "not supported in a wrapping mode"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher.engineDoFinal(byte[], int, int, byte[], int):int");
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineDoFinal(byte[] bArr, int i11, int i12) {
        byte[] unwrap;
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            if (bArr != null) {
                erasableOutputStream.write(bArr, i11, i12);
            }
            try {
                if (this.forWrapping) {
                    try {
                        unwrap = this.wrapEngine.wrap(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                        return unwrap;
                    } catch (Exception e11) {
                        throw new IllegalBlockSizeException(e11.getMessage());
                    }
                }
                try {
                    unwrap = this.wrapEngine.unwrap(this.wrapStream.getBuf(), 0, this.wrapStream.size());
                    return unwrap;
                } catch (InvalidCipherTextException e12) {
                    throw new BadPaddingException(e12.getMessage());
                }
            } finally {
                this.wrapStream.erase();
            }
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineGetIV() {
        return a.h(this.f43186iv);
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // javax.crypto.CipherSpi
    protected int engineGetOutputSize(int i11) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    protected AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.f43186iv != null) {
            String algorithmName = this.wrapEngine.getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters createParametersInstance = createParametersInstance(algorithmName);
                this.engineParams = createParametersInstance;
                createParametersInstance.init(new IvParameterSpec(this.f43186iv));
            } catch (Exception e11) {
                throw new RuntimeException(e11.toString());
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
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
        this.engineParams = algorithmParameters;
        engineInit(i11, key, algorithmParameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i11, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i11, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new InvalidKeyOrParametersException(e11.getMessage(), e11);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        f1 b1Var;
        int i12;
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                b1Var = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.wrapEngine.getAlgorithmName());
            } else if (bCPBEKey.getParam() == null) {
                throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
            } else {
                b1Var = bCPBEKey.getParam();
            }
        } else {
            b1Var = new b1(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof IvParameterSpec) {
            byte[] iv2 = ((IvParameterSpec) algorithmParameterSpec).getIV();
            this.f43186iv = iv2;
            b1Var = new f1(b1Var, iv2);
        }
        if (algorithmParameterSpec instanceof j) {
            j jVar = (j) algorithmParameterSpec;
            byte[] a11 = jVar.a();
            if (a11 != null) {
                b1Var = new h1(b1Var, a11);
            }
            b1Var = new i1(b1Var, jVar.b());
        }
        if ((b1Var instanceof b1) && (i12 = this.ivSize) != 0 && (i11 == 3 || i11 == 1)) {
            byte[] bArr = new byte[i12];
            this.f43186iv = bArr;
            secureRandom.nextBytes(bArr);
            b1Var = new f1(b1Var, this.f43186iv);
        }
        if (secureRandom != null) {
            b1Var = new g1(b1Var, secureRandom);
        }
        try {
            if (i11 != 1) {
                if (i11 == 2) {
                    this.wrapEngine.init(false, b1Var);
                    this.wrapStream = new ErasableOutputStream();
                } else if (i11 == 3) {
                    this.wrapEngine.init(true, b1Var);
                    this.wrapStream = null;
                } else if (i11 != 4) {
                    throw new InvalidParameterException("Unknown mode parameter passed to init.");
                } else {
                    this.wrapEngine.init(false, b1Var);
                    this.wrapStream = null;
                }
                this.forWrapping = false;
                return;
            }
            this.wrapEngine.init(true, b1Var);
            this.wrapStream = new ErasableOutputStream();
            this.forWrapping = true;
        } catch (Exception e11) {
            throw new InvalidKeyOrParametersException(e11.getMessage(), e11);
        }
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetMode(String str) {
        throw new NoSuchAlgorithmException("can't support mode " + str);
    }

    @Override // javax.crypto.CipherSpi
    protected void engineSetPadding(String str) {
        throw new NoSuchPaddingException("Padding " + str + " unknown.");
    }

    @Override // javax.crypto.CipherSpi
    protected Key engineUnwrap(byte[] bArr, String str, int i11) {
        try {
            c0 c0Var = this.wrapEngine;
            byte[] engineDoFinal = c0Var == null ? engineDoFinal(bArr, 0, bArr.length) : c0Var.unwrap(bArr, 0, bArr.length);
            if (i11 == 3) {
                return new SecretKeySpec(engineDoFinal, str);
            }
            if (str.equals("") && i11 == 2) {
                try {
                    p f11 = p.f(engineDoFinal);
                    PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(f11);
                    if (privateKey != null) {
                        return privateKey;
                    }
                    throw new InvalidKeyException("algorithm " + f11.i().e() + " not supported");
                } catch (Exception unused) {
                    throw new InvalidKeyException("Invalid key encoding.");
                }
            }
            try {
                KeyFactory createKeyFactory = this.helper.createKeyFactory(str);
                if (i11 == 1) {
                    return createKeyFactory.generatePublic(new X509EncodedKeySpec(engineDoFinal));
                }
                if (i11 == 2) {
                    return createKeyFactory.generatePrivate(new PKCS8EncodedKeySpec(engineDoFinal));
                }
                throw new InvalidKeyException("Unknown key type " + i11);
            } catch (NoSuchProviderException e11) {
                throw new InvalidKeyException("Unknown key type " + e11.getMessage());
            } catch (InvalidKeySpecException e12) {
                throw new InvalidKeyException("Unknown key type " + e12.getMessage());
            }
        } catch (BadPaddingException e13) {
            throw new InvalidKeyException(e13.getMessage());
        } catch (IllegalBlockSizeException e14) {
            throw new InvalidKeyException(e14.getMessage());
        } catch (InvalidCipherTextException e15) {
            throw new InvalidKeyException(e15.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    protected int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i11, i12);
            return 0;
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineUpdate(byte[] bArr, int i11, int i12) {
        ErasableOutputStream erasableOutputStream = this.wrapStream;
        if (erasableOutputStream != null) {
            erasableOutputStream.write(bArr, i11, i12);
            return null;
        }
        throw new IllegalStateException("not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    protected byte[] engineWrap(Key key) {
        byte[] encoded = key.getEncoded();
        if (encoded != null) {
            try {
                c0 c0Var = this.wrapEngine;
                return c0Var == null ? engineDoFinal(encoded, 0, encoded.length) : c0Var.wrap(encoded, 0, encoded.length);
            } catch (BadPaddingException e11) {
                throw new IllegalBlockSizeException(e11.getMessage());
            }
        }
        throw new InvalidKeyException("Cannot wrap key, null encoding.");
    }
}