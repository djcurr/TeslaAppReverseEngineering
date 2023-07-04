package org.spongycastle.pqc.crypto.ntru;

import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.IntegerPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.Polynomial;
import org.spongycastle.pqc.math.ntru.polynomial.ProductFormPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.SparseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class NTRUEngine implements AsymmetricBlockCipher {
    private boolean forEncryption;
    private NTRUEncryptionParameters params;
    private NTRUEncryptionPrivateKeyParameters privKey;
    private NTRUEncryptionPublicKeyParameters pubKey;
    private SecureRandom random;

    private IntegerPolynomial MGF(byte[] bArr, int i11, int i12, boolean z11) {
        Digest digest = this.params.hashAlg;
        int digestSize = digest.getDigestSize();
        byte[] bArr2 = new byte[i12 * digestSize];
        if (z11) {
            bArr = calcHash(digest, bArr);
        }
        int i13 = 0;
        while (i13 < i12) {
            digest.update(bArr, 0, bArr.length);
            putInt(digest, i13);
            System.arraycopy(calcHash(digest), 0, bArr2, i13 * digestSize, digestSize);
            i13++;
        }
        IntegerPolynomial integerPolynomial = new IntegerPolynomial(i11);
        while (true) {
            int i14 = 0;
            for (int i15 = 0; i15 != bArr2.length; i15++) {
                int i16 = bArr2[i15] & 255;
                if (i16 < 243) {
                    for (int i17 = 0; i17 < 4; i17++) {
                        int i18 = i16 % 3;
                        integerPolynomial.coeffs[i14] = i18 - 1;
                        i14++;
                        if (i14 == i11) {
                            return integerPolynomial;
                        }
                        i16 = (i16 - i18) / 3;
                    }
                    integerPolynomial.coeffs[i14] = i16 - 1;
                    i14++;
                    if (i14 == i11) {
                        return integerPolynomial;
                    }
                }
            }
            if (i14 >= i11) {
                return integerPolynomial;
            }
            digest.update(bArr, 0, bArr.length);
            putInt(digest, i13);
            bArr2 = calcHash(digest);
            i13++;
        }
    }

    private byte[] buildSData(byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4) {
        byte[] bArr5 = new byte[bArr.length + i11 + bArr3.length + bArr4.length];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
        return bArr5;
    }

    private byte[] calcHash(Digest digest) {
        byte[] bArr = new byte[digest.getDigestSize()];
        digest.doFinal(bArr, 0);
        return bArr;
    }

    private byte[] copyOf(byte[] bArr, int i11) {
        byte[] bArr2 = new byte[i11];
        if (i11 >= bArr.length) {
            i11 = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr2, 0, i11);
        return bArr2;
    }

    private byte[] decrypt(byte[] bArr, NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters) {
        Polynomial polynomial = nTRUEncryptionPrivateKeyParameters.f43830t;
        IntegerPolynomial integerPolynomial = nTRUEncryptionPrivateKeyParameters.f43828fp;
        IntegerPolynomial integerPolynomial2 = nTRUEncryptionPrivateKeyParameters.f43829h;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        int i11 = nTRUEncryptionParameters.N;
        int i12 = nTRUEncryptionParameters.f43827q;
        int i13 = nTRUEncryptionParameters.f43823db;
        int i14 = nTRUEncryptionParameters.maxMsgLenBytes;
        int i15 = nTRUEncryptionParameters.dm0;
        int i16 = nTRUEncryptionParameters.pkLen;
        int i17 = nTRUEncryptionParameters.minCallsMask;
        boolean z11 = nTRUEncryptionParameters.hashSeed;
        byte[] bArr2 = nTRUEncryptionParameters.oid;
        if (i14 <= 255) {
            int i18 = i13 / 8;
            IntegerPolynomial fromBinary = IntegerPolynomial.fromBinary(bArr, i11, i12);
            IntegerPolynomial decrypt = decrypt(fromBinary, polynomial, integerPolynomial);
            if (decrypt.count(-1) >= i15) {
                if (decrypt.count(0) >= i15) {
                    if (decrypt.count(1) >= i15) {
                        IntegerPolynomial integerPolynomial3 = (IntegerPolynomial) fromBinary.clone();
                        integerPolynomial3.sub(decrypt);
                        integerPolynomial3.modPositive(i12);
                        IntegerPolynomial integerPolynomial4 = (IntegerPolynomial) integerPolynomial3.clone();
                        integerPolynomial4.modPositive(4);
                        decrypt.sub(MGF(integerPolynomial4.toBinary(4), i11, i17, z11));
                        decrypt.mod3();
                        byte[] binary3Sves = decrypt.toBinary3Sves();
                        byte[] bArr3 = new byte[i18];
                        System.arraycopy(binary3Sves, 0, bArr3, 0, i18);
                        int i19 = 255 & binary3Sves[i18];
                        if (i19 <= i14) {
                            byte[] bArr4 = new byte[i19];
                            int i21 = i18 + 1;
                            System.arraycopy(binary3Sves, i21, bArr4, 0, i19);
                            int i22 = i21 + i19;
                            int length = binary3Sves.length - i22;
                            byte[] bArr5 = new byte[length];
                            System.arraycopy(binary3Sves, i22, bArr5, 0, length);
                            if (Arrays.constantTimeAreEqual(bArr5, new byte[length])) {
                                IntegerPolynomial mult = generateBlindingPoly(buildSData(bArr2, bArr4, i19, bArr3, copyOf(integerPolynomial2.toBinary(i12), i16 / 8)), bArr4).mult(integerPolynomial2);
                                mult.modPositive(i12);
                                if (mult.equals(integerPolynomial3)) {
                                    return bArr4;
                                }
                                throw new InvalidCipherTextException("Invalid message encoding");
                            }
                            throw new InvalidCipherTextException("The message is not followed by zeroes");
                        }
                        throw new InvalidCipherTextException("Message too long: " + i19 + ">" + i14);
                    }
                    throw new InvalidCipherTextException("Less than dm0 coefficients equal 1");
                }
                throw new InvalidCipherTextException("Less than dm0 coefficients equal 0");
            }
            throw new InvalidCipherTextException("Less than dm0 coefficients equal -1");
        }
        throw new DataLengthException("maxMsgLenBytes values bigger than 255 are not supported");
    }

    private byte[] encrypt(byte[] bArr, NTRUEncryptionPublicKeyParameters nTRUEncryptionPublicKeyParameters) {
        byte[] bArr2 = bArr;
        IntegerPolynomial integerPolynomial = nTRUEncryptionPublicKeyParameters.f43831h;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        int i11 = nTRUEncryptionParameters.N;
        int i12 = nTRUEncryptionParameters.f43827q;
        int i13 = nTRUEncryptionParameters.maxMsgLenBytes;
        int i14 = nTRUEncryptionParameters.f43823db;
        int i15 = nTRUEncryptionParameters.bufferLenBits;
        int i16 = nTRUEncryptionParameters.dm0;
        int i17 = nTRUEncryptionParameters.pkLen;
        int i18 = nTRUEncryptionParameters.minCallsMask;
        boolean z11 = nTRUEncryptionParameters.hashSeed;
        byte[] bArr3 = nTRUEncryptionParameters.oid;
        int length = bArr2.length;
        if (i13 > 255) {
            throw new IllegalArgumentException("llen values bigger than 1 are not supported");
        }
        if (length > i13) {
            throw new DataLengthException("Message too long: " + length + ">" + i13);
        }
        while (true) {
            int i19 = i14 / 8;
            byte[] bArr4 = new byte[i19];
            boolean z12 = z11;
            this.random.nextBytes(bArr4);
            int i21 = (i13 + 1) - length;
            int i22 = i18;
            int i23 = i14;
            byte[] bArr5 = new byte[i15 / 8];
            int i24 = i15;
            System.arraycopy(bArr4, 0, bArr5, 0, i19);
            bArr5[i19] = (byte) length;
            int i25 = i19 + 1;
            System.arraycopy(bArr2, 0, bArr5, i25, bArr2.length);
            System.arraycopy(new byte[i21], 0, bArr5, i25 + bArr2.length, i21);
            IntegerPolynomial fromBinary3Sves = IntegerPolynomial.fromBinary3Sves(bArr5, i11);
            int i26 = length;
            byte[] bArr6 = bArr3;
            int i27 = i17;
            IntegerPolynomial mult = generateBlindingPoly(buildSData(bArr3, bArr, i26, bArr4, copyOf(integerPolynomial.toBinary(i12), i17 / 8)), bArr5).mult(integerPolynomial, i12);
            IntegerPolynomial integerPolynomial2 = (IntegerPolynomial) mult.clone();
            integerPolynomial2.modPositive(4);
            fromBinary3Sves.add(MGF(integerPolynomial2.toBinary(4), i11, i22, z12));
            fromBinary3Sves.mod3();
            if (fromBinary3Sves.count(-1) >= i16 && fromBinary3Sves.count(0) >= i16 && fromBinary3Sves.count(1) >= i16) {
                mult.add(fromBinary3Sves, i12);
                mult.ensurePositive(i12);
                return mult.toBinary(i12);
            }
            z11 = z12;
            i18 = i22;
            i17 = i27;
            i14 = i23;
            i15 = i24;
            length = i26;
            bArr3 = bArr6;
            bArr2 = bArr;
        }
    }

    private int[] generateBlindingCoeffs(IndexGenerator indexGenerator, int i11) {
        int[] iArr = new int[this.params.N];
        for (int i12 = -1; i12 <= 1; i12 += 2) {
            int i13 = 0;
            while (i13 < i11) {
                int nextIndex = indexGenerator.nextIndex();
                if (iArr[nextIndex] == 0) {
                    iArr[nextIndex] = i12;
                    i13++;
                }
            }
        }
        return iArr;
    }

    private Polynomial generateBlindingPoly(byte[] bArr, byte[] bArr2) {
        IndexGenerator indexGenerator = new IndexGenerator(bArr, this.params);
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        if (nTRUEncryptionParameters.polyType == 1) {
            return new ProductFormPolynomial(new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, nTRUEncryptionParameters.dr1)), new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr2)), new SparseTernaryPolynomial(generateBlindingCoeffs(indexGenerator, this.params.dr3)));
        }
        int i11 = nTRUEncryptionParameters.f43826dr;
        boolean z11 = nTRUEncryptionParameters.sparse;
        int[] generateBlindingCoeffs = generateBlindingCoeffs(indexGenerator, i11);
        if (z11) {
            return new SparseTernaryPolynomial(generateBlindingCoeffs);
        }
        return new DenseTernaryPolynomial(generateBlindingCoeffs);
    }

    private int log2(int i11) {
        if (i11 == 2048) {
            return 11;
        }
        throw new IllegalStateException("log2 not fully implemented");
    }

    private void putInt(Digest digest, int i11) {
        digest.update((byte) (i11 >> 24));
        digest.update((byte) (i11 >> 16));
        digest.update((byte) (i11 >> 8));
        digest.update((byte) i11);
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        return this.params.maxMsgLenBytes;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        return ((nTRUEncryptionParameters.N * log2(nTRUEncryptionParameters.f43827q)) + 7) / 8;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forEncryption = z11;
        if (z11) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                this.pubKey = (NTRUEncryptionPublicKeyParameters) parametersWithRandom.getParameters();
            } else {
                this.random = new SecureRandom();
                this.pubKey = (NTRUEncryptionPublicKeyParameters) cipherParameters;
            }
            this.params = this.pubKey.getParameters();
            return;
        }
        NTRUEncryptionPrivateKeyParameters nTRUEncryptionPrivateKeyParameters = (NTRUEncryptionPrivateKeyParameters) cipherParameters;
        this.privKey = nTRUEncryptionPrivateKeyParameters;
        this.params = nTRUEncryptionPrivateKeyParameters.getParameters();
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        if (this.forEncryption) {
            return encrypt(bArr2, this.pubKey);
        }
        return decrypt(bArr2, this.privKey);
    }

    private byte[] calcHash(Digest digest, byte[] bArr) {
        byte[] bArr2 = new byte[digest.getDigestSize()];
        digest.update(bArr, 0, bArr.length);
        digest.doFinal(bArr2, 0);
        return bArr2;
    }

    protected IntegerPolynomial encrypt(IntegerPolynomial integerPolynomial, TernaryPolynomial ternaryPolynomial, IntegerPolynomial integerPolynomial2) {
        IntegerPolynomial mult = ternaryPolynomial.mult(integerPolynomial2, this.params.f43827q);
        mult.add(integerPolynomial, this.params.f43827q);
        mult.ensurePositive(this.params.f43827q);
        return mult;
    }

    protected IntegerPolynomial decrypt(IntegerPolynomial integerPolynomial, Polynomial polynomial, IntegerPolynomial integerPolynomial2) {
        IntegerPolynomial mult;
        NTRUEncryptionParameters nTRUEncryptionParameters = this.params;
        if (nTRUEncryptionParameters.fastFp) {
            mult = polynomial.mult(integerPolynomial, nTRUEncryptionParameters.f43827q);
            mult.mult(3);
            mult.add(integerPolynomial);
        } else {
            mult = polynomial.mult(integerPolynomial, nTRUEncryptionParameters.f43827q);
        }
        mult.center0(this.params.f43827q);
        mult.mod3();
        if (!this.params.fastFp) {
            mult = new DenseTernaryPolynomial(mult).mult(integerPolynomial2, 3);
        }
        mult.center0(3);
        return mult;
    }
}