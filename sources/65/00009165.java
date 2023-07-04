package org.bouncycastle.jcajce.provider.asymmetric.dh;

import g50.a;
import i60.c;
import java.io.ByteArrayOutputStream;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import l50.c0;
import l60.p;
import n50.q;
import n50.t;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.s;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import p50.g;
import r70.m;
import t50.e;
import u50.b;
import u50.f;
import u50.f1;
import u50.k;
import u50.y0;

/* loaded from: classes5.dex */
public class IESCipher extends CipherSpi {
    private ByteArrayOutputStream buffer;
    private boolean dhaesMode;
    private c0 engine;
    private AlgorithmParameters engineParam;
    private p engineSpec;
    private final c helper;
    private final int ivLength;
    private b key;
    private b otherKeyParameter;
    private SecureRandom random;
    private int state;

    /* loaded from: classes5.dex */
    public static class IES extends IESCipher {
        public IES() {
            super(new c0(new a(), new t(z50.a.b()), new g(z50.a.b())));
        }
    }

    /* loaded from: classes5.dex */
    public static class IESwithAESCBC extends IESCipher {
        public IESwithAESCBC() {
            super(new c0(new a(), new t(z50.a.b()), new g(z50.a.b()), new e(new q50.c(new l50.a()))), 16);
        }
    }

    /* loaded from: classes5.dex */
    public static class IESwithDESedeCBC extends IESCipher {
        public IESwithDESedeCBC() {
            super(new c0(new a(), new t(z50.a.b()), new g(z50.a.b()), new e(new q50.c(new l50.p()))), 8);
        }
    }

    public IESCipher(c0 c0Var) {
        this.helper = new i60.a();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = c0Var;
        this.ivLength = 0;
    }

    public IESCipher(c0 c0Var, int i11) {
        this.helper = new i60.a();
        this.state = -1;
        this.buffer = new ByteArrayOutputStream();
        this.engineParam = null;
        this.engineSpec = null;
        this.dhaesMode = false;
        this.otherKeyParameter = null;
        this.engine = c0Var;
        this.ivLength = i11;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        byte[] engineDoFinal = engineDoFinal(bArr, i11, i12);
        System.arraycopy(engineDoFinal, 0, bArr2, i13, engineDoFinal.length);
        return engineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i11, int i12) {
        if (i12 != 0) {
            this.buffer.write(bArr, i11, i12);
        }
        byte[] byteArray = this.buffer.toByteArray();
        this.buffer.reset();
        i y0Var = new y0(this.engineSpec.b(), this.engineSpec.c(), this.engineSpec.d(), this.engineSpec.a());
        if (this.engineSpec.e() != null) {
            y0Var = new f1(y0Var, this.engineSpec.e());
        }
        u50.i b11 = ((f) this.key).b();
        b bVar = this.otherKeyParameter;
        if (bVar != null) {
            try {
                int i13 = this.state;
                if (i13 != 1 && i13 != 3) {
                    this.engine.i(false, this.key, bVar, y0Var);
                    return this.engine.j(byteArray, 0, byteArray.length);
                }
                this.engine.i(true, bVar, this.key, y0Var);
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (Exception e11) {
                throw new BadBlockException("unable to process block", e11);
            }
        }
        int i14 = this.state;
        if (i14 == 1 || i14 == 3) {
            n50.f fVar = new n50.f();
            fVar.a(new u50.e(this.random, b11));
            try {
                this.engine.g(this.key, y0Var, new q(fVar, new s() { // from class: org.bouncycastle.jcajce.provider.asymmetric.dh.IESCipher.1
                    @Override // org.bouncycastle.crypto.s
                    public byte[] getEncoded(b bVar2) {
                        int bitLength = (((f) bVar2).b().f().bitLength() + 7) / 8;
                        byte[] bArr2 = new byte[bitLength];
                        byte[] c11 = r70.a.c(((k) bVar2).c());
                        if (c11.length <= bitLength) {
                            System.arraycopy(c11, 0, bArr2, bitLength - c11.length, c11.length);
                            return bArr2;
                        }
                        throw new IllegalArgumentException("Senders's public key longer than expected.");
                    }
                }));
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (Exception e12) {
                throw new BadBlockException("unable to process block", e12);
            }
        } else if (i14 == 2 || i14 == 4) {
            try {
                c0 c0Var = this.engine;
                b bVar2 = this.key;
                c0Var.h(bVar2, y0Var, new v50.a(((f) bVar2).b()));
                return this.engine.j(byteArray, 0, byteArray.length);
            } catch (InvalidCipherTextException e13) {
                throw new BadBlockException("unable to process block", e13);
            }
        } else {
            throw new IllegalStateException("IESCipher not initialised");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        if (this.engine.d() != null) {
            return this.engine.d().b();
        }
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        p pVar = this.engineSpec;
        if (pVar != null) {
            return pVar.e();
        }
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        if (key instanceof DHKey) {
            return ((DHKey) key).getParams().getP().bitLength();
        }
        throw new IllegalArgumentException("not a DH key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i11) {
        int size;
        org.bouncycastle.crypto.f d11;
        if (this.key != null) {
            int macSize = this.engine.f().getMacSize();
            int bitLength = this.otherKeyParameter == null ? (((((f) this.key).b().f().bitLength() + 7) * 2) / 8) + 1 : 0;
            if (this.engine.d() != null) {
                int i12 = this.state;
                if (i12 == 1 || i12 == 3) {
                    d11 = this.engine.d();
                } else if (i12 != 2 && i12 != 4) {
                    throw new IllegalStateException("cipher not initialised");
                } else {
                    d11 = this.engine.d();
                    i11 = (i11 - macSize) - bitLength;
                }
                i11 = d11.c(i11);
            }
            int i13 = this.state;
            if (i13 == 1 || i13 == 3) {
                size = this.buffer.size() + macSize + bitLength;
            } else if (i13 != 2 && i13 != 4) {
                throw new IllegalStateException("IESCipher not initialised");
            } else {
                size = (this.buffer.size() - macSize) - bitLength;
            }
            return size + i11;
        }
        throw new IllegalStateException("cipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParam == null && this.engineSpec != null) {
            try {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters("IES");
                this.engineParam = createAlgorithmParameters;
                createAlgorithmParameters.init(this.engineSpec);
            } catch (Exception e11) {
                throw new RuntimeException(e11.toString());
            }
        }
        return this.engineParam;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(p.class);
            } catch (Exception e11) {
                throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + e11.toString());
            }
        } else {
            parameterSpec = null;
        }
        this.engineParam = algorithmParameters;
        engineInit(i11, key, parameterSpec, secureRandom);
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i11, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e11) {
            throw new IllegalArgumentException("cannot handle supplied parameter spec: " + e11.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        p pVar;
        b generatePublicKeyParameter;
        PrivateKey privateKey;
        if (algorithmParameterSpec == null) {
            byte[] bArr = null;
            int i12 = this.ivLength;
            if (i12 != 0 && i11 == 1) {
                bArr = new byte[i12];
                secureRandom.nextBytes(bArr);
            }
            pVar = IESUtil.guessParameterSpec(this.engine.d(), bArr);
        } else if (!(algorithmParameterSpec instanceof p)) {
            throw new InvalidAlgorithmParameterException("must be passed IES parameters");
        } else {
            pVar = (p) algorithmParameterSpec;
        }
        this.engineSpec = pVar;
        byte[] e11 = this.engineSpec.e();
        int i13 = this.ivLength;
        if (i13 != 0 && (e11 == null || e11.length != i13)) {
            throw new InvalidAlgorithmParameterException("NONCE in IES Parameters needs to be " + this.ivLength + " bytes long");
        }
        if (i11 == 1 || i11 == 3) {
            if (!(key instanceof DHPublicKey)) {
                if (!(key instanceof k60.k)) {
                    throw new InvalidKeyException("must be passed recipient's public DH key for encryption");
                }
                k60.k kVar = (k60.k) key;
                this.key = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter(kVar.getPublic());
                this.otherKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePrivateKeyParameter(kVar.getPrivate());
                this.random = secureRandom;
                this.state = i11;
                this.buffer.reset();
            }
            generatePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter((PublicKey) key);
        } else if (i11 != 2 && i11 != 4) {
            throw new InvalidKeyException("must be passed EC key");
        } else {
            if (key instanceof DHPrivateKey) {
                privateKey = (PrivateKey) key;
            } else if (!(key instanceof k60.k)) {
                throw new InvalidKeyException("must be passed recipient's private DH key for decryption");
            } else {
                k60.k kVar2 = (k60.k) key;
                this.otherKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePublicKeyParameter(kVar2.getPublic());
                privateKey = kVar2.getPrivate();
            }
            generatePublicKeyParameter = org.bouncycastle.jcajce.provider.asymmetric.util.DHUtil.generatePrivateKeyParameter(privateKey);
        }
        this.key = generatePublicKeyParameter;
        this.random = secureRandom;
        this.state = i11;
        this.buffer.reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        boolean z11;
        String k11 = m.k(str);
        if (k11.equals("NONE")) {
            z11 = false;
        } else if (!k11.equals("DHAES")) {
            throw new IllegalArgumentException("can't support mode " + str);
        } else {
            z11 = true;
        }
        this.dhaesMode = z11;
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) {
        String k11 = m.k(str);
        if (!k11.equals("NOPADDING") && !k11.equals("PKCS5PADDING") && !k11.equals("PKCS7PADDING")) {
            throw new NoSuchPaddingException("padding not available with IESCipher");
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        this.buffer.write(bArr, i11, i12);
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i11, int i12) {
        this.buffer.write(bArr, i11, i12);
        return null;
    }
}