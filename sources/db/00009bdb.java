package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.CramerShoupKeyParameters;
import org.spongycastle.crypto.params.CramerShoupPrivateKeyParameters;
import org.spongycastle.crypto.params.CramerShoupPublicKeyParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.BigIntegers;

/* loaded from: classes4.dex */
public class CramerShoupCoreEngine {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private boolean forEncryption;
    private CramerShoupKeyParameters key;
    private String label = null;
    private SecureRandom random;

    /* loaded from: classes4.dex */
    public static class CramerShoupCiphertextException extends Exception {
        private static final long serialVersionUID = -6360977166495345076L;

        public CramerShoupCiphertextException(String str) {
            super(str);
        }
    }

    private BigInteger generateRandomElement(BigInteger bigInteger, SecureRandom secureRandom) {
        BigInteger bigInteger2 = ONE;
        return BigIntegers.createRandomInRange(bigInteger2, bigInteger.subtract(bigInteger2), secureRandom);
    }

    private boolean isValidMessage(BigInteger bigInteger, BigInteger bigInteger2) {
        return bigInteger.compareTo(bigInteger2) < 0;
    }

    public BigInteger convertInput(byte[] bArr, int i11, int i12) {
        if (i12 <= getInputBlockSize() + 1) {
            if (i12 == getInputBlockSize() + 1 && this.forEncryption) {
                throw new DataLengthException("input too large for Cramer Shoup cipher.");
            }
            if (i11 != 0 || i12 != bArr.length) {
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i11, bArr2, 0, i12);
                bArr = bArr2;
            }
            BigInteger bigInteger = new BigInteger(1, bArr);
            if (bigInteger.compareTo(this.key.getParameters().getP()) < 0) {
                return bigInteger;
            }
            throw new DataLengthException("input too large for Cramer Shoup cipher.");
        }
        throw new DataLengthException("input too large for Cramer Shoup cipher.");
    }

    public byte[] convertOutput(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (!this.forEncryption) {
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

    public BigInteger decryptBlock(CramerShoupCiphertext cramerShoupCiphertext) {
        if (this.key.isPrivate() && !this.forEncryption) {
            CramerShoupKeyParameters cramerShoupKeyParameters = this.key;
            if (cramerShoupKeyParameters instanceof CramerShoupPrivateKeyParameters) {
                CramerShoupPrivateKeyParameters cramerShoupPrivateKeyParameters = (CramerShoupPrivateKeyParameters) cramerShoupKeyParameters;
                BigInteger p11 = cramerShoupPrivateKeyParameters.getParameters().getP();
                Digest h11 = cramerShoupPrivateKeyParameters.getParameters().getH();
                byte[] byteArray = cramerShoupCiphertext.getU1().toByteArray();
                h11.update(byteArray, 0, byteArray.length);
                byte[] byteArray2 = cramerShoupCiphertext.getU2().toByteArray();
                h11.update(byteArray2, 0, byteArray2.length);
                byte[] byteArray3 = cramerShoupCiphertext.getE().toByteArray();
                h11.update(byteArray3, 0, byteArray3.length);
                String str = this.label;
                if (str != null) {
                    byte[] bytes = str.getBytes();
                    h11.update(bytes, 0, bytes.length);
                }
                byte[] bArr = new byte[h11.getDigestSize()];
                h11.doFinal(bArr, 0);
                BigInteger bigInteger = new BigInteger(1, bArr);
                if (cramerShoupCiphertext.f43496v.equals(cramerShoupCiphertext.f43494u1.modPow(cramerShoupPrivateKeyParameters.getX1().add(cramerShoupPrivateKeyParameters.getY1().multiply(bigInteger)), p11).multiply(cramerShoupCiphertext.f43495u2.modPow(cramerShoupPrivateKeyParameters.getX2().add(cramerShoupPrivateKeyParameters.getY2().multiply(bigInteger)), p11)).mod(p11))) {
                    return cramerShoupCiphertext.f43493e.multiply(cramerShoupCiphertext.f43494u1.modPow(cramerShoupPrivateKeyParameters.getZ(), p11).modInverse(p11)).mod(p11);
                }
                throw new CramerShoupCiphertextException("Sorry, that ciphertext is not correct");
            }
        }
        return null;
    }

    public CramerShoupCiphertext encryptBlock(BigInteger bigInteger) {
        if (this.key.isPrivate() || !this.forEncryption) {
            return null;
        }
        CramerShoupKeyParameters cramerShoupKeyParameters = this.key;
        if (cramerShoupKeyParameters instanceof CramerShoupPublicKeyParameters) {
            CramerShoupPublicKeyParameters cramerShoupPublicKeyParameters = (CramerShoupPublicKeyParameters) cramerShoupKeyParameters;
            BigInteger p11 = cramerShoupPublicKeyParameters.getParameters().getP();
            BigInteger g12 = cramerShoupPublicKeyParameters.getParameters().getG1();
            BigInteger g22 = cramerShoupPublicKeyParameters.getParameters().getG2();
            BigInteger h11 = cramerShoupPublicKeyParameters.getH();
            if (isValidMessage(bigInteger, p11)) {
                BigInteger generateRandomElement = generateRandomElement(p11, this.random);
                BigInteger modPow = g12.modPow(generateRandomElement, p11);
                BigInteger modPow2 = g22.modPow(generateRandomElement, p11);
                BigInteger mod = h11.modPow(generateRandomElement, p11).multiply(bigInteger).mod(p11);
                Digest h12 = cramerShoupPublicKeyParameters.getParameters().getH();
                byte[] byteArray = modPow.toByteArray();
                h12.update(byteArray, 0, byteArray.length);
                byte[] byteArray2 = modPow2.toByteArray();
                h12.update(byteArray2, 0, byteArray2.length);
                byte[] byteArray3 = mod.toByteArray();
                h12.update(byteArray3, 0, byteArray3.length);
                String str = this.label;
                if (str != null) {
                    byte[] bytes = str.getBytes();
                    h12.update(bytes, 0, bytes.length);
                }
                byte[] bArr = new byte[h12.getDigestSize()];
                h12.doFinal(bArr, 0);
                return new CramerShoupCiphertext(modPow, modPow2, mod, cramerShoupPublicKeyParameters.getC().modPow(generateRandomElement, p11).multiply(cramerShoupPublicKeyParameters.getD().modPow(generateRandomElement.multiply(new BigInteger(1, bArr)), p11)).mod(p11));
            }
            return null;
        }
        return null;
    }

    public int getInputBlockSize() {
        int bitLength = this.key.getParameters().getP().bitLength();
        if (this.forEncryption) {
            return ((bitLength + 7) / 8) - 1;
        }
        return (bitLength + 7) / 8;
    }

    public int getOutputBlockSize() {
        int bitLength = this.key.getParameters().getP().bitLength();
        if (this.forEncryption) {
            return (bitLength + 7) / 8;
        }
        return ((bitLength + 7) / 8) - 1;
    }

    public void init(boolean z11, CipherParameters cipherParameters, String str) {
        init(z11, cipherParameters);
        this.label = str;
    }

    protected SecureRandom initSecureRandom(boolean z11, SecureRandom secureRandom) {
        if (z11) {
            return secureRandom != null ? secureRandom : new SecureRandom();
        }
        return null;
    }

    public void init(boolean z11, CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.key = (CramerShoupKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.key = (CramerShoupKeyParameters) cipherParameters;
            secureRandom = null;
        }
        this.random = initSecureRandom(z11, secureRandom);
        this.forEncryption = z11;
    }
}