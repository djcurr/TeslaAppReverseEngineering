package org.bouncycastle.jcajce.provider.asymmetric.dstu;

import e50.y0;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.crypto.i;
import org.bouncycastle.crypto.m;
import org.bouncycastle.crypto.p;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import w40.n;
import y50.d;

/* loaded from: classes5.dex */
public class SignatureSpi extends java.security.SignatureSpi implements n, y0 {
    private p digest;
    private m signer = new d();

    @Override // java.security.SignatureSpi
    protected Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected AlgorithmParameters engineGetParameters() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    @Override // java.security.SignatureSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void engineInitSign(java.security.PrivateKey r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof org.bouncycastle.jcajce.provider.asymmetric.dstu.BCDSTU4145PrivateKey
            if (r0 == 0) goto L18
            u50.b r5 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r5)
            i50.d r0 = new i50.d
            byte[] r1 = a50.d.f()
            byte[] r1 = r4.expandSbox(r1)
            r0.<init>(r1)
        L15:
            r4.digest = r0
            goto L2f
        L18:
            boolean r0 = r5 instanceof k60.a
            if (r0 == 0) goto L2e
            u50.b r5 = org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil.generatePrivateKeyParameter(r5)
            i50.d r0 = new i50.d
            byte[] r1 = a50.d.f()
            byte[] r1 = r4.expandSbox(r1)
            r0.<init>(r1)
            goto L15
        L2e:
            r5 = 0
        L2f:
            java.security.SecureRandom r0 = r4.appRandom
            r1 = 1
            if (r0 == 0) goto L3f
            org.bouncycastle.crypto.m r2 = r4.signer
            u50.g1 r3 = new u50.g1
            r3.<init>(r5, r0)
            r2.init(r1, r3)
            goto L44
        L3f:
            org.bouncycastle.crypto.m r0 = r4.signer
            r0.init(r1, r5)
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.asymmetric.dstu.SignatureSpi.engineInitSign(java.security.PrivateKey):void");
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        i generatePublicKeyParameter;
        if (publicKey instanceof BCDSTU4145PublicKey) {
            BCDSTU4145PublicKey bCDSTU4145PublicKey = (BCDSTU4145PublicKey) publicKey;
            generatePublicKeyParameter = bCDSTU4145PublicKey.engineGetKeyParameters();
            this.digest = new i50.d(expandSbox(bCDSTU4145PublicKey.getSbox()));
        } else {
            generatePublicKeyParameter = ECUtil.generatePublicKeyParameter(publicKey);
            this.digest = new i50.d(expandSbox(a50.d.f()));
        }
        this.signer.init(false, generatePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    protected void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            BigInteger[] generateSignature = this.signer.generateSignature(bArr);
            byte[] byteArray = generateSignature[0].toByteArray();
            byte[] byteArray2 = generateSignature[1].toByteArray();
            int length = (byteArray.length > byteArray2.length ? byteArray.length : byteArray2.length) * 2;
            byte[] bArr2 = new byte[length];
            System.arraycopy(byteArray2, 0, bArr2, (length / 2) - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr2, length - byteArray.length, byteArray.length);
            return new s0(bArr2).getEncoded();
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        try {
            byte[] r11 = ((l) org.bouncycastle.asn1.n.k(bArr)).r();
            byte[] bArr3 = new byte[r11.length / 2];
            byte[] bArr4 = new byte[r11.length / 2];
            System.arraycopy(r11, 0, bArr4, 0, r11.length / 2);
            System.arraycopy(r11, r11.length / 2, bArr3, 0, r11.length / 2);
            BigInteger[] bigIntegerArr = {new BigInteger(1, bArr3), new BigInteger(1, bArr4)};
            return this.signer.verifySignature(bArr2, bigIntegerArr[0], bigIntegerArr[1]);
        } catch (Exception unused) {
            throw new SignatureException("error decoding signature bytes.");
        }
    }

    byte[] expandSbox(byte[] bArr) {
        byte[] bArr2 = new byte[128];
        for (int i11 = 0; i11 < bArr.length; i11++) {
            int i12 = i11 * 2;
            bArr2[i12] = (byte) ((bArr[i11] >> 4) & 15);
            bArr2[i12 + 1] = (byte) (bArr[i11] & 15);
        }
        return bArr2;
    }
}