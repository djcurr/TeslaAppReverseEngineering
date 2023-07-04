package org.spongycastle.pqc.crypto.ntru;

import java.nio.ByteBuffer;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;

/* loaded from: classes4.dex */
public class NTRUSigner {
    private Digest hashAlg;
    private NTRUSigningParameters params;
    private NTRUSigningPrivateKeyParameters signingKeyPair;
    private NTRUSigningPublicKeyParameters verificationKey;

    public NTRUSigner(NTRUSigningParameters nTRUSigningParameters) {
        this.params = nTRUSigningParameters;
    }

    private IntegerPolynomial sign(IntegerPolynomial integerPolynomial, NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters) {
        NTRUSigningParameters nTRUSigningParameters = this.params;
        int i11 = nTRUSigningParameters.N;
        int i12 = nTRUSigningParameters.f43841q;
        NTRUSigningPublicKeyParameters publicKey = nTRUSigningPrivateKeyParameters.getPublicKey();
        IntegerPolynomial integerPolynomial2 = new IntegerPolynomial(i11);
        for (int i13 = nTRUSigningParameters.B; i13 >= 1; i13--) {
            Polynomial polynomial = nTRUSigningPrivateKeyParameters.getBasis(i13).f43842f;
            Polynomial polynomial2 = nTRUSigningPrivateKeyParameters.getBasis(i13).fPrime;
            IntegerPolynomial mult = polynomial.mult(integerPolynomial);
            mult.div(i12);
            IntegerPolynomial mult2 = polynomial2.mult(mult);
            IntegerPolynomial mult3 = polynomial2.mult(integerPolynomial);
            mult3.div(i12);
            mult2.sub(polynomial.mult(mult3));
            integerPolynomial2.add(mult2);
            IntegerPolynomial integerPolynomial3 = (IntegerPolynomial) nTRUSigningPrivateKeyParameters.getBasis(i13).f43843h.clone();
            if (i13 > 1) {
                integerPolynomial3.sub(nTRUSigningPrivateKeyParameters.getBasis(i13 - 1).f43843h);
            } else {
                integerPolynomial3.sub(publicKey.f43844h);
            }
            integerPolynomial = mult2.mult(integerPolynomial3, i12);
        }
        Polynomial polynomial3 = nTRUSigningPrivateKeyParameters.getBasis(0).f43842f;
        Polynomial polynomial4 = nTRUSigningPrivateKeyParameters.getBasis(0).fPrime;
        IntegerPolynomial mult4 = polynomial3.mult(integerPolynomial);
        mult4.div(i12);
        IntegerPolynomial mult5 = polynomial4.mult(mult4);
        IntegerPolynomial mult6 = polynomial4.mult(integerPolynomial);
        mult6.div(i12);
        mult5.sub(polynomial3.mult(mult6));
        integerPolynomial2.add(mult5);
        integerPolynomial2.modPositive(i12);
        return integerPolynomial2;
    }

    private byte[] signHash(byte[] bArr, NTRUSigningPrivateKeyParameters nTRUSigningPrivateKeyParameters) {
        IntegerPolynomial createMsgRep;
        IntegerPolynomial sign;
        NTRUSigningPublicKeyParameters publicKey = nTRUSigningPrivateKeyParameters.getPublicKey();
        int i11 = 0;
        do {
            i11++;
            if (i11 <= this.params.signFailTolerance) {
                createMsgRep = createMsgRep(bArr, i11);
                sign = sign(createMsgRep, nTRUSigningPrivateKeyParameters);
            } else {
                throw new IllegalStateException("Signing failed: too many retries (max=" + this.params.signFailTolerance + ")");
            }
        } while (!verify(createMsgRep, sign, publicKey.f43844h));
        byte[] binary = sign.toBinary(this.params.f43841q);
        ByteBuffer allocate = ByteBuffer.allocate(binary.length + 4);
        allocate.put(binary);
        allocate.putInt(i11);
        return allocate.array();
    }

    private boolean verify(IntegerPolynomial integerPolynomial, IntegerPolynomial integerPolynomial2, IntegerPolynomial integerPolynomial3) {
        NTRUSigningParameters nTRUSigningParameters = this.params;
        int i11 = nTRUSigningParameters.f43841q;
        double d11 = nTRUSigningParameters.normBoundSq;
        double d12 = nTRUSigningParameters.betaSq;
        IntegerPolynomial mult = integerPolynomial3.mult(integerPolynomial2, i11);
        mult.sub(integerPolynomial);
        return ((double) ((long) (((double) integerPolynomial2.centeredNormSq(i11)) + (d12 * ((double) mult.centeredNormSq(i11)))))) <= d11;
    }

    private boolean verifyHash(byte[] bArr, byte[] bArr2, NTRUSigningPublicKeyParameters nTRUSigningPublicKeyParameters) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr2);
        byte[] bArr3 = new byte[bArr2.length - 4];
        wrap.get(bArr3);
        NTRUSigningParameters nTRUSigningParameters = this.params;
        return verify(createMsgRep(bArr, wrap.getInt()), IntegerPolynomial.fromBinary(bArr3, nTRUSigningParameters.N, nTRUSigningParameters.f43841q), nTRUSigningPublicKeyParameters.f43844h);
    }

    protected IntegerPolynomial createMsgRep(byte[] bArr, int i11) {
        NTRUSigningParameters nTRUSigningParameters = this.params;
        int i12 = nTRUSigningParameters.N;
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(nTRUSigningParameters.f43841q);
        int i13 = (numberOfLeadingZeros + 7) / 8;
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i12);
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 4);
        allocate.put(bArr);
        allocate.putInt(i11);
        NTRUSignerPrng nTRUSignerPrng = new NTRUSignerPrng(allocate.array(), this.params.hashAlg);
        for (int i14 = 0; i14 < i12; i14++) {
            byte[] nextBytes = nTRUSignerPrng.nextBytes(i13);
            int i15 = (i13 * 8) - numberOfLeadingZeros;
            nextBytes[nextBytes.length - 1] = (byte) ((nextBytes[nextBytes.length - 1] >> i15) << i15);
            ByteBuffer allocate2 = ByteBuffer.allocate(4);
            allocate2.put(nextBytes);
            allocate2.rewind();
            integerPolynomial.coeffs[i14] = Integer.reverseBytes(allocate2.getInt());
        }
        return integerPolynomial;
    }

    public byte[] generateSignature() {
        Digest digest = this.hashAlg;
        if (digest != null && this.signingKeyPair != null) {
            byte[] bArr = new byte[digest.getDigestSize()];
            this.hashAlg.doFinal(bArr, 0);
            return signHash(bArr, this.signingKeyPair);
        }
        throw new IllegalStateException("Call initSign first!");
    }

    public void init(boolean z11, CipherParameters cipherParameters) {
        if (z11) {
            this.signingKeyPair = (NTRUSigningPrivateKeyParameters) cipherParameters;
        } else {
            this.verificationKey = (NTRUSigningPublicKeyParameters) cipherParameters;
        }
        Digest digest = this.params.hashAlg;
        this.hashAlg = digest;
        digest.reset();
    }

    public void update(byte b11) {
        Digest digest = this.hashAlg;
        if (digest != null) {
            digest.update(b11);
            return;
        }
        throw new IllegalStateException("Call initSign or initVerify first!");
    }

    public boolean verifySignature(byte[] bArr) {
        Digest digest = this.hashAlg;
        if (digest != null && this.verificationKey != null) {
            byte[] bArr2 = new byte[digest.getDigestSize()];
            this.hashAlg.doFinal(bArr2, 0);
            return verifyHash(bArr2, bArr, this.verificationKey);
        }
        throw new IllegalStateException("Call initVerify first!");
    }

    public void update(byte[] bArr, int i11, int i12) {
        Digest digest = this.hashAlg;
        if (digest != null) {
            digest.update(bArr, i11, i12);
            return;
        }
        throw new IllegalStateException("Call initSign or initVerify first!");
    }
}