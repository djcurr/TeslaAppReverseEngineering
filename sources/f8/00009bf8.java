package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;

/* loaded from: classes4.dex */
class RSACoreEngine {
    private boolean forEncryption;
    private RSAKeyParameters key;

    public BigInteger convertInput(byte[] bArr, int i11, int i12) {
        if (i12 <= getInputBlockSize() + 1) {
            if (i12 == getInputBlockSize() + 1 && !this.forEncryption) {
                throw new DataLengthException("input too large for RSA cipher.");
            }
            if (i11 != 0 || i12 != bArr.length) {
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i11, bArr2, 0, i12);
                bArr = bArr2;
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(this.key.getModulus()) < 0) {
                return bigInteger;
            }
            throw new DataLengthException("input too large for RSA cipher.");
        }
        throw new DataLengthException("input too large for RSA cipher.");
    }

    public byte[] convertOutput(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (this.forEncryption) {
            if (byteArray[0] == 0 && byteArray.length > getOutputBlockSize()) {
                int length = byteArray.length - 1;
                byte[] bArr = new byte[length];
                System.arraycopy(byteArray, 1, bArr, 0, length);
                return bArr;
            } else if (byteArray.length < getOutputBlockSize()) {
                int outputBlockSize = getOutputBlockSize();
                byte[] bArr2 = new byte[outputBlockSize];
                System.arraycopy(byteArray, 0, bArr2, outputBlockSize - byteArray.length, byteArray.length);
                return bArr2;
            }
        } else if (byteArray[0] == 0) {
            int length2 = byteArray.length - 1;
            byte[] bArr3 = new byte[length2];
            System.arraycopy(byteArray, 1, bArr3, 0, length2);
            return bArr3;
        }
        return byteArray;
    }

    public int getInputBlockSize() {
        int bitLength = this.key.getModulus().bitLength();
        if (this.forEncryption) {
            return ((bitLength + 7) / 8) - 1;
        }
        return (bitLength + 7) / 8;
    }

    public int getOutputBlockSize() {
        int bitLength = this.key.getModulus().bitLength();
        if (this.forEncryption) {
            return (bitLength + 7) / 8;
        }
        return ((bitLength + 7) / 8) - 1;
    }

    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            this.key = (RSAKeyParameters) ((ParametersWithRandom) cipherParameters).getParameters();
        } else {
            this.key = (RSAKeyParameters) cipherParameters;
        }
        this.forEncryption = z11;
    }

    public BigInteger processBlock(BigInteger bigInteger) {
        RSAKeyParameters rSAKeyParameters = this.key;
        if (rSAKeyParameters instanceof RSAPrivateCrtKeyParameters) {
            RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) rSAKeyParameters;
            BigInteger p11 = rSAPrivateCrtKeyParameters.getP();
            BigInteger q11 = rSAPrivateCrtKeyParameters.getQ();
            BigInteger dp2 = rSAPrivateCrtKeyParameters.getDP();
            BigInteger dq2 = rSAPrivateCrtKeyParameters.getDQ();
            BigInteger qInv = rSAPrivateCrtKeyParameters.getQInv();
            BigInteger modPow = bigInteger.remainder(p11).modPow(dp2, p11);
            BigInteger modPow2 = bigInteger.remainder(q11).modPow(dq2, q11);
            return modPow.subtract(modPow2).multiply(qInv).mod(p11).multiply(q11).add(modPow2);
        }
        return bigInteger.modPow(rSAKeyParameters.getExponent(), this.key.getModulus());
    }
}