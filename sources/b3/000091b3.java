package org.bouncycastle.jcajce.provider.asymmetric.ec;

import i50.a0;
import i50.h0;
import i50.p;
import i50.s;
import i50.v;
import i50.w;
import i50.x;
import i50.y;
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
import org.bouncycastle.crypto.engines.a;
import org.bouncycastle.crypto.k;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.provider.util.BadBlockException;
import r70.m;
import u50.b;
import u50.g1;

/* loaded from: classes5.dex */
public class GMCipherSpi extends CipherSpi {
    private a engine;
    private b key;
    private SecureRandom random;
    private final c helper = new i60.a();
    private int state = -1;
    private ErasableOutputStream buffer = new ErasableOutputStream();

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes5.dex */
    public static final class ErasableOutputStream extends ByteArrayOutputStream {
        public void erase() {
            org.bouncycastle.util.a.y(((ByteArrayOutputStream) this).buf, (byte) 0);
            reset();
        }

        public byte[] getBuf() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    /* loaded from: classes5.dex */
    public static class SM2 extends GMCipherSpi {
        public SM2() {
            super(new a());
        }
    }

    /* loaded from: classes5.dex */
    public static class SM2withBlake2b extends GMCipherSpi {
        public SM2withBlake2b() {
            super(new a(new i50.a(512)));
        }
    }

    /* loaded from: classes5.dex */
    public static class SM2withBlake2s extends GMCipherSpi {
        public SM2withBlake2s() {
            super(new a(new i50.b(256)));
        }
    }

    /* loaded from: classes5.dex */
    public static class SM2withMD5 extends GMCipherSpi {
        public SM2withMD5() {
            super(new a(new p()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SM2withRMD extends GMCipherSpi {
        public SM2withRMD() {
            super(new a(new s()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SM2withSha1 extends GMCipherSpi {
        public SM2withSha1() {
            super(new a(new v()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SM2withSha224 extends GMCipherSpi {
        public SM2withSha224() {
            super(new a(new w()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SM2withSha256 extends GMCipherSpi {
        public SM2withSha256() {
            super(new a(new x()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SM2withSha384 extends GMCipherSpi {
        public SM2withSha384() {
            super(new a(new y()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SM2withSha512 extends GMCipherSpi {
        public SM2withSha512() {
            super(new a(new a0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SM2withWhirlpool extends GMCipherSpi {
        public SM2withWhirlpool() {
            super(new a(new h0()));
        }
    }

    public GMCipherSpi(a aVar) {
        this.engine = aVar;
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        byte[] engineDoFinal = engineDoFinal(bArr, i11, i12);
        System.arraycopy(engineDoFinal, 0, bArr2, i13, engineDoFinal.length);
        return engineDoFinal.length;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i11, int i12) {
        byte[] j11;
        if (i12 != 0) {
            this.buffer.write(bArr, i11, i12);
        }
        try {
            int i13 = this.state;
            if (i13 == 1 || i13 == 3) {
                try {
                    this.engine.f(true, new g1(this.key, this.random));
                    j11 = this.engine.j(this.buffer.getBuf(), 0, this.buffer.size());
                    return j11;
                } catch (Exception e11) {
                    throw new BadBlockException("unable to process block", e11);
                }
            } else if (i13 == 2 || i13 == 4) {
                try {
                    this.engine.f(false, this.key);
                    j11 = this.engine.j(this.buffer.getBuf(), 0, this.buffer.size());
                    return j11;
                } catch (Exception e12) {
                    throw new BadBlockException("unable to process block", e12);
                }
            } else {
                throw new IllegalStateException("cipher not initialised");
            }
        } finally {
            this.buffer.erase();
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
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
        int i12 = this.state;
        if (i12 == 1 || i12 == 3 || i12 == 2 || i12 == 4) {
            return this.engine.e(i11);
        }
        throw new IllegalStateException("cipher not initialised");
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i11, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        if (algorithmParameters == null) {
            engineInit(i11, key, (AlgorithmParameterSpec) null, secureRandom);
            return;
        }
        throw new InvalidAlgorithmParameterException("cannot recognise parameters: " + algorithmParameters.getClass().getName());
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
        b generatePublicKeyParameter;
        if (i11 == 1 || i11 == 3) {
            if (!(key instanceof PublicKey)) {
                throw new InvalidKeyException("must be passed public EC key for encryption");
            }
            generatePublicKeyParameter = ECUtils.generatePublicKeyParameter((PublicKey) key);
        } else if (i11 != 2 && i11 != 4) {
            throw new InvalidKeyException("must be passed EC key");
        } else {
            if (!(key instanceof PrivateKey)) {
                throw new InvalidKeyException("must be passed private EC key for decryption");
            }
            generatePublicKeyParameter = ECUtil.generatePrivateKeyParameter((PrivateKey) key);
        }
        this.key = generatePublicKeyParameter;
        if (secureRandom != null) {
            this.random = secureRandom;
        } else {
            this.random = k.b();
        }
        this.state = i11;
        this.buffer.reset();
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        if (m.k(str).equals("NONE")) {
            return;
        }
        throw new IllegalArgumentException("can't support mode " + str);
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) {
        if (!m.k(str).equals("NOPADDING")) {
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