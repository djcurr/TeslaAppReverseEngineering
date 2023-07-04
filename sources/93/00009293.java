package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import e50.b;
import i50.o;
import i50.q;
import i50.r;
import i50.s;
import i50.t;
import java.security.AlgorithmParameters;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.SignatureSpi;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import k50.c;
import l50.n0;
import org.bouncycastle.asn1.k;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.crypto.a;
import org.bouncycastle.crypto.p;
import org.spongycastle.asn1.ASN1Encoding;
import u50.n1;
import w40.n;

/* loaded from: classes5.dex */
public class DigestSignatureSpi extends SignatureSpi {
    private b algId;
    private a cipher;
    private p digest;

    /* loaded from: classes5.dex */
    public static class MD2 extends DigestSignatureSpi {
        public MD2() {
            super(n.X1, new i50.n(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MD4 extends DigestSignatureSpi {
        public MD4() {
            super(n.Y1, new o(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class MD5 extends DigestSignatureSpi {
        public MD5() {
            super(n.Z1, z50.a.a(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class RIPEMD128 extends DigestSignatureSpi {
        public RIPEMD128() {
            super(z40.b.f60194c, new r(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class RIPEMD160 extends DigestSignatureSpi {
        public RIPEMD160() {
            super(z40.b.f60193b, new s(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class RIPEMD256 extends DigestSignatureSpi {
        public RIPEMD256() {
            super(z40.b.f60195d, new t(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA1 extends DigestSignatureSpi {
        public SHA1() {
            super(v40.b.f54051f, z50.a.b(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA224 extends DigestSignatureSpi {
        public SHA224() {
            super(r40.b.f49147f, z50.a.c(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA256 extends DigestSignatureSpi {
        public SHA256() {
            super(r40.b.f49141c, z50.a.d(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA384 extends DigestSignatureSpi {
        public SHA384() {
            super(r40.b.f49143d, z50.a.e(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_224 extends DigestSignatureSpi {
        public SHA3_224() {
            super(r40.b.f49153i, z50.a.f(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_256 extends DigestSignatureSpi {
        public SHA3_256() {
            super(r40.b.f49154j, z50.a.g(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_384 extends DigestSignatureSpi {
        public SHA3_384() {
            super(r40.b.f49155k, z50.a.h(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA3_512 extends DigestSignatureSpi {
        public SHA3_512() {
            super(r40.b.f49156l, z50.a.i(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512 extends DigestSignatureSpi {
        public SHA512() {
            super(r40.b.f49145e, z50.a.j(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512_224 extends DigestSignatureSpi {
        public SHA512_224() {
            super(r40.b.f49149g, z50.a.k(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class SHA512_256 extends DigestSignatureSpi {
        public SHA512_256() {
            super(r40.b.f49151h, z50.a.l(), new c(new n0()));
        }
    }

    /* loaded from: classes5.dex */
    public static class noneRSA extends DigestSignatureSpi {
        public noneRSA() {
            super(new q(), new c(new n0()));
        }
    }

    protected DigestSignatureSpi(k kVar, p pVar, a aVar) {
        this.digest = pVar;
        this.cipher = aVar;
        this.algId = new b(kVar, q0.f43085a);
    }

    protected DigestSignatureSpi(p pVar, a aVar) {
        this.digest = pVar;
        this.cipher = aVar;
        this.algId = null;
    }

    private byte[] derEncode(byte[] bArr) {
        b bVar = this.algId;
        return bVar == null ? bArr : new e50.r(bVar, bArr).d(ASN1Encoding.DER);
    }

    private String getType(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.getClass().getName();
    }

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) {
        if (privateKey instanceof RSAPrivateKey) {
            n1 generatePrivateKeyParameter = RSAUtil.generatePrivateKeyParameter((RSAPrivateKey) privateKey);
            this.digest.reset();
            this.cipher.init(true, generatePrivateKeyParameter);
            return;
        }
        throw new InvalidKeyException("Supplied key (" + getType(privateKey) + ") is not a RSAPrivateKey instance");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        if (publicKey instanceof RSAPublicKey) {
            n1 generatePublicKeyParameter = RSAUtil.generatePublicKeyParameter((RSAPublicKey) publicKey);
            this.digest.reset();
            this.cipher.init(false, generatePublicKeyParameter);
            return;
        }
        throw new InvalidKeyException("Supplied key (" + getType(publicKey) + ") is not a RSAPublicKey instance");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected byte[] engineSign() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            byte[] derEncode = derEncode(bArr);
            return this.cipher.processBlock(derEncode, 0, derEncode.length);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new SignatureException("key too small for signature type");
        } catch (Exception e11) {
            throw new SignatureException(e11.toString());
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte b11) {
        this.digest.update(b11);
    }

    @Override // java.security.SignatureSpi
    protected void engineUpdate(byte[] bArr, int i11, int i12) {
        this.digest.update(bArr, i11, i12);
    }

    @Override // java.security.SignatureSpi
    protected boolean engineVerify(byte[] bArr) {
        byte[] processBlock;
        byte[] derEncode;
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            processBlock = this.cipher.processBlock(bArr, 0, bArr.length);
            derEncode = derEncode(bArr2);
        } catch (Exception unused) {
        }
        if (processBlock.length == derEncode.length) {
            return org.bouncycastle.util.a.u(processBlock, derEncode);
        }
        if (processBlock.length != derEncode.length - 2) {
            org.bouncycastle.util.a.u(derEncode, derEncode);
            return false;
        }
        derEncode[1] = (byte) (derEncode[1] - 2);
        derEncode[3] = (byte) (derEncode[3] - 2);
        int i11 = derEncode[3] + 4;
        int i12 = i11 + 2;
        int i13 = 0;
        for (int i14 = 0; i14 < derEncode.length - i12; i14++) {
            i13 |= processBlock[i11 + i14] ^ derEncode[i12 + i14];
        }
        for (int i15 = 0; i15 < i11; i15++) {
            i13 |= processBlock[i15] ^ derEncode[i15];
        }
        return i13 == 0;
    }
}