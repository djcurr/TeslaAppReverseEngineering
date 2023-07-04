package org.bouncycastle.jcajce.provider.asymmetric.ec;

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
import k60.k;
import l50.c0;
import l60.p;
import n50.l;
import n50.q;
import n50.t;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.f;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.s;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.IESUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import p50.g;
import r70.m;
import u50.a0;
import u50.b;
import u50.b0;
import u50.e0;
import u50.f1;
import u50.y;
import u50.y0;
import z50.a;

/* loaded from: classes5.dex */
public class IESCipher extends CipherSpi {
    private ByteArrayOutputStream buffer;
    private boolean dhaesMode;
    private c0 engine;
    private AlgorithmParameters engineParam;
    private p engineSpec;
    private final c helper;
    private int ivLength;
    private b key;
    private b otherKeyParameter;
    private SecureRandom random;
    private int state;

    /* loaded from: classes5.dex */
    public static class ECIES extends IESCipher {
        public ECIES() {
            this(a.b(), a.b());
        }

        public ECIES(org.bouncycastle.crypto.p pVar, org.bouncycastle.crypto.p pVar2) {
            super(new c0(new g50.c(), new t(pVar), new g(pVar2)));
        }
    }

    /* loaded from: classes5.dex */
    public static class ECIESwithAESCBC extends ECIESwithCipher {
        public ECIESwithAESCBC() {
            super(new q50.c(new l50.a()), 16);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECIESwithCipher extends IESCipher {
        public ECIESwithCipher(e eVar, int i11) {
            this(eVar, i11, a.b(), a.b());
        }

        public ECIESwithCipher(e eVar, int i11, org.bouncycastle.crypto.p pVar, org.bouncycastle.crypto.p pVar2) {
            super(new c0(new g50.c(), new t(pVar), new g(pVar2), new t50.e(eVar)), i11);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECIESwithDESedeCBC extends ECIESwithCipher {
        public ECIESwithDESedeCBC() {
            super(new q50.c(new l50.p()), 8);
        }
    }

    /* loaded from: classes5.dex */
    public static class ECIESwithSHA256 extends ECIES {
        public ECIESwithSHA256() {
            super(a.d(), a.d());
        }
    }

    /* loaded from: classes5.dex */
    public static class ECIESwithSHA256andAESCBC extends ECIESwithCipher {
        public ECIESwithSHA256andAESCBC() {
            super(new q50.c(new l50.a()), 16, a.d(), a.d());
        }
    }

    /* loaded from: classes5.dex */
    public static class ECIESwithSHA256andDESedeCBC extends ECIESwithCipher {
        public ECIESwithSHA256andDESedeCBC() {
            super(new q50.c(new l50.p()), 8, a.d(), a.d());
        }
    }

    /* loaded from: classes5.dex */
    public static class ECIESwithSHA384 extends ECIES {
        public ECIESwithSHA384() {
            super(a.e(), a.e());
        }
    }

    /* loaded from: classes5.dex */
    public static class ECIESwithSHA384andAESCBC extends ECIESwithCipher {
        public ECIESwithSHA384andAESCBC() {
            super(new q50.c(new l50.a()), 16, a.e(), a.e());
        }
    }

    /* loaded from: classes5.dex */
    public static class ECIESwithSHA384andDESedeCBC extends ECIESwithCipher {
        public ECIESwithSHA384andDESedeCBC() {
            super(new q50.c(new l50.p()), 8, a.e(), a.e());
        }
    }

    /* loaded from: classes5.dex */
    public static class ECIESwithSHA512 extends ECIES {
        public ECIESwithSHA512() {
            super(a.j(), a.j());
        }
    }

    /* loaded from: classes5.dex */
    public static class ECIESwithSHA512andAESCBC extends ECIESwithCipher {
        public ECIESwithSHA512andAESCBC() {
            super(new q50.c(new l50.a()), 16, a.j(), a.j());
        }
    }

    /* loaded from: classes5.dex */
    public static class ECIESwithSHA512andDESedeCBC extends ECIESwithCipher {
        public ECIESwithSHA512andDESedeCBC() {
            super(new q50.c(new l50.p()), 8, a.j(), a.j());
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
        y b11 = ((b0) this.key).b();
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
        if (i14 != 1 && i14 != 3) {
            if (i14 == 2 || i14 == 4) {
                try {
                    this.engine.h(this.key, y0Var, new v50.b(b11));
                    return this.engine.j(byteArray, 0, byteArray.length);
                } catch (InvalidCipherTextException e12) {
                    throw new BadBlockException("unable to process block", e12);
                }
            }
            throw new IllegalStateException("cipher not initialised");
        }
        l lVar = new l();
        lVar.b(new a0(b11, this.random));
        final boolean f11 = this.engineSpec.f();
        try {
            this.engine.g(this.key, y0Var, new q(lVar, new s() { // from class: org.bouncycastle.jcajce.provider.asymmetric.ec.IESCipher.1
                @Override // org.bouncycastle.crypto.s
                public byte[] getEncoded(b bVar2) {
                    return ((e0) bVar2).c().l(f11);
                }
            }));
            return this.engine.j(byteArray, 0, byteArray.length);
        } catch (Exception e13) {
            throw new BadBlockException("unable to process block", e13);
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
        if (key instanceof k60.a) {
            return ((k60.a) key).getParameters().a().t();
        }
        throw new IllegalArgumentException("not an EC key");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i11) {
        int size;
        f d11;
        if (this.key != null) {
            int macSize = this.engine.f().getMacSize();
            int t11 = this.otherKeyParameter == null ? ((((b0) this.key).b().a().t() + 7) / 8) * 2 : 0;
            if (this.engine.d() != null) {
                int i12 = this.state;
                if (i12 == 1 || i12 == 3) {
                    d11 = this.engine.d();
                } else if (i12 != 2 && i12 != 4) {
                    throw new IllegalStateException("cipher not initialised");
                } else {
                    d11 = this.engine.d();
                    i11 = (i11 - macSize) - t11;
                }
                i11 = d11.c(i11);
            }
            int i13 = this.state;
            if (i13 == 1 || i13 == 3) {
                size = this.buffer.size() + macSize + 1 + t11;
            } else if (i13 != 2 && i13 != 4) {
                throw new IllegalStateException("cipher not initialised");
            } else {
                size = (this.buffer.size() - macSize) - t11;
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
        byte[] bArr = null;
        this.otherKeyParameter = null;
        if (algorithmParameterSpec == null) {
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
            if (!(key instanceof PublicKey)) {
                if (!(key instanceof k)) {
                    throw new InvalidKeyException("must be passed recipient's public EC key for encryption");
                }
                k kVar = (k) key;
                this.key = ECUtils.generatePublicKeyParameter(kVar.getPublic());
                this.otherKeyParameter = ECUtil.generatePrivateKeyParameter(kVar.getPrivate());
                this.random = secureRandom;
                this.state = i11;
                this.buffer.reset();
            }
            generatePublicKeyParameter = ECUtils.generatePublicKeyParameter((PublicKey) key);
        } else if (i11 != 2 && i11 != 4) {
            throw new InvalidKeyException("must be passed EC key");
        } else {
            if (key instanceof PrivateKey) {
                privateKey = (PrivateKey) key;
            } else if (!(key instanceof k)) {
                throw new InvalidKeyException("must be passed recipient's private EC key for decryption");
            } else {
                k kVar2 = (k) key;
                this.otherKeyParameter = ECUtils.generatePublicKeyParameter(kVar2.getPublic());
                privateKey = kVar2.getPrivate();
            }
            generatePublicKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
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