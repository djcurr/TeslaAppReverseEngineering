package org.spongycastle.crypto.encodings;

import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.util.DigestFactory;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class OAEPEncoding implements AsymmetricBlockCipher {
    private byte[] defHash;
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private Digest mgf1Hash;
    private SecureRandom random;

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher) {
        this(asymmetricBlockCipher, DigestFactory.createSHA1(), null);
    }

    private void ItoOSP(int i11, byte[] bArr) {
        bArr[0] = (byte) (i11 >>> 24);
        bArr[1] = (byte) (i11 >>> 16);
        bArr[2] = (byte) (i11 >>> 8);
        bArr[3] = (byte) (i11 >>> 0);
    }

    private byte[] maskGeneratorFunction1(byte[] bArr, int i11, int i12, int i13) {
        byte[] bArr2 = new byte[i13];
        int digestSize = this.mgf1Hash.getDigestSize();
        byte[] bArr3 = new byte[digestSize];
        byte[] bArr4 = new byte[4];
        this.mgf1Hash.reset();
        int i14 = 0;
        while (i14 < i13 / digestSize) {
            ItoOSP(i14, bArr4);
            this.mgf1Hash.update(bArr, i11, i12);
            this.mgf1Hash.update(bArr4, 0, 4);
            this.mgf1Hash.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i14 * digestSize, digestSize);
            i14++;
        }
        int i15 = digestSize * i14;
        if (i15 < i13) {
            ItoOSP(i14, bArr4);
            this.mgf1Hash.update(bArr, i11, i12);
            this.mgf1Hash.update(bArr4, 0, 4);
            this.mgf1Hash.doFinal(bArr3, 0);
            System.arraycopy(bArr3, 0, bArr2, i15, i13 - i15);
        }
        return bArr2;
    }

    public byte[] decodeBlock(byte[] bArr, int i11, int i12) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] processBlock = this.engine.processBlock(bArr, i11, i12);
        int outputBlockSize = this.engine.getOutputBlockSize();
        byte[] bArr4 = new byte[outputBlockSize];
        System.arraycopy(processBlock, 0, bArr4, outputBlockSize - processBlock.length, processBlock.length);
        byte[] bArr5 = this.defHash;
        boolean z11 = outputBlockSize < (bArr5.length * 2) + 1;
        byte[] maskGeneratorFunction1 = maskGeneratorFunction1(bArr4, bArr5.length, outputBlockSize - bArr5.length, bArr5.length);
        int i13 = 0;
        while (true) {
            bArr2 = this.defHash;
            if (i13 == bArr2.length) {
                break;
            }
            bArr4[i13] = (byte) (bArr4[i13] ^ maskGeneratorFunction1[i13]);
            i13++;
        }
        byte[] maskGeneratorFunction12 = maskGeneratorFunction1(bArr4, 0, bArr2.length, outputBlockSize - bArr2.length);
        for (int length = this.defHash.length; length != outputBlockSize; length++) {
            bArr4[length] = (byte) (bArr4[length] ^ maskGeneratorFunction12[length - this.defHash.length]);
        }
        int i14 = 0;
        boolean z12 = false;
        while (true) {
            bArr3 = this.defHash;
            if (i14 == bArr3.length) {
                break;
            }
            if (bArr3[i14] != bArr4[bArr3.length + i14]) {
                z12 = true;
            }
            i14++;
        }
        int i15 = outputBlockSize;
        for (int length2 = bArr3.length * 2; length2 != outputBlockSize; length2++) {
            if ((bArr4[length2] != 0) & (i15 == outputBlockSize)) {
                i15 = length2;
            }
        }
        boolean z13 = i15 > outputBlockSize + (-1);
        boolean z14 = bArr4[i15] != 1;
        int i16 = i15 + 1;
        if (!(z13 | z14 | z11 | z12)) {
            int i17 = outputBlockSize - i16;
            byte[] bArr6 = new byte[i17];
            System.arraycopy(bArr4, i16, bArr6, 0, i17);
            return bArr6;
        }
        Arrays.fill(bArr4, (byte) 0);
        throw new InvalidCipherTextException("data wrong");
    }

    public byte[] encodeBlock(byte[] bArr, int i11, int i12) {
        if (i12 <= getInputBlockSize()) {
            int inputBlockSize = getInputBlockSize() + 1 + (this.defHash.length * 2);
            byte[] bArr2 = new byte[inputBlockSize];
            int i13 = inputBlockSize - i12;
            System.arraycopy(bArr, i11, bArr2, i13, i12);
            bArr2[i13 - 1] = 1;
            byte[] bArr3 = this.defHash;
            System.arraycopy(bArr3, 0, bArr2, bArr3.length, bArr3.length);
            int length = this.defHash.length;
            byte[] bArr4 = new byte[length];
            this.random.nextBytes(bArr4);
            byte[] maskGeneratorFunction1 = maskGeneratorFunction1(bArr4, 0, length, inputBlockSize - this.defHash.length);
            for (int length2 = this.defHash.length; length2 != inputBlockSize; length2++) {
                bArr2[length2] = (byte) (bArr2[length2] ^ maskGeneratorFunction1[length2 - this.defHash.length]);
            }
            System.arraycopy(bArr4, 0, bArr2, 0, this.defHash.length);
            byte[] bArr5 = this.defHash;
            byte[] maskGeneratorFunction12 = maskGeneratorFunction1(bArr2, bArr5.length, inputBlockSize - bArr5.length, bArr5.length);
            for (int i14 = 0; i14 != this.defHash.length; i14++) {
                bArr2[i14] = (byte) (bArr2[i14] ^ maskGeneratorFunction12[i14]);
            }
            return this.engine.processBlock(bArr2, 0, inputBlockSize);
        }
        throw new DataLengthException("input data too long");
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getInputBlockSize() {
        int inputBlockSize = this.engine.getInputBlockSize();
        return this.forEncryption ? (inputBlockSize - 1) - (this.defHash.length * 2) : inputBlockSize;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public int getOutputBlockSize() {
        int outputBlockSize = this.engine.getOutputBlockSize();
        return this.forEncryption ? outputBlockSize : (outputBlockSize - 1) - (this.defHash.length * 2);
    }

    public AsymmetricBlockCipher getUnderlyingCipher() {
        return this.engine;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithRandom) {
            this.random = ((ParametersWithRandom) cipherParameters).getRandom();
        } else {
            this.random = new SecureRandom();
        }
        this.engine.init(z11, cipherParameters);
        this.forEncryption = z11;
    }

    @Override // org.spongycastle.crypto.AsymmetricBlockCipher
    public byte[] processBlock(byte[] bArr, int i11, int i12) {
        if (this.forEncryption) {
            return encodeBlock(bArr, i11, i12);
        }
        return decodeBlock(bArr, i11, i12);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest) {
        this(asymmetricBlockCipher, digest, null);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, byte[] bArr) {
        this(asymmetricBlockCipher, digest, digest, bArr);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricBlockCipher, Digest digest, Digest digest2, byte[] bArr) {
        this.engine = asymmetricBlockCipher;
        this.mgf1Hash = digest2;
        this.defHash = new byte[digest.getDigestSize()];
        digest.reset();
        if (bArr != null) {
            digest.update(bArr, 0, bArr.length);
        }
        digest.doFinal(this.defHash, 0);
    }
}