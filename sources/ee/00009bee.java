package org.spongycastle.crypto.engines;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.util.DigestFactory;
import org.spongycastle.util.Arrays;

/* loaded from: classes4.dex */
public class RC2WrapEngine implements Wrapper {
    private static final byte[] IV2 = {74, -35, -94, 44, 121, -24, 33, 5};
    private CBCBlockCipher engine;
    private boolean forWrapping;

    /* renamed from: iv  reason: collision with root package name */
    private byte[] f43507iv;
    private CipherParameters param;
    private ParametersWithIV paramPlusIV;

    /* renamed from: sr  reason: collision with root package name */
    private SecureRandom f43508sr;
    Digest sha1 = DigestFactory.createSHA1();
    byte[] digest = new byte[20];

    private byte[] calculateCMSKeyChecksum(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        this.sha1.update(bArr, 0, bArr.length);
        this.sha1.doFinal(this.digest, 0);
        System.arraycopy(this.digest, 0, bArr2, 0, 8);
        return bArr2;
    }

    private boolean checkCMSKeyChecksum(byte[] bArr, byte[] bArr2) {
        return Arrays.constantTimeAreEqual(calculateCMSKeyChecksum(bArr), bArr2);
    }

    @Override // org.spongycastle.crypto.Wrapper
    public String getAlgorithmName() {
        return "RC2";
    }

    @Override // org.spongycastle.crypto.Wrapper
    public void init(boolean z11, CipherParameters cipherParameters) {
        this.forWrapping = z11;
        this.engine = new CBCBlockCipher(new RC2Engine());
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.f43508sr = parametersWithRandom.getRandom();
            cipherParameters = parametersWithRandom.getParameters();
        } else {
            this.f43508sr = new SecureRandom();
        }
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            this.paramPlusIV = parametersWithIV;
            this.f43507iv = parametersWithIV.getIV();
            this.param = this.paramPlusIV.getParameters();
            if (this.forWrapping) {
                byte[] bArr = this.f43507iv;
                if (bArr == null || bArr.length != 8) {
                    throw new IllegalArgumentException("IV is not 8 octets");
                }
                return;
            }
            throw new IllegalArgumentException("You should not supply an IV for unwrapping");
        }
        this.param = cipherParameters;
        if (this.forWrapping) {
            byte[] bArr2 = new byte[8];
            this.f43507iv = bArr2;
            this.f43508sr.nextBytes(bArr2);
            this.paramPlusIV = new ParametersWithIV(this.param, this.f43507iv);
        }
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] unwrap(byte[] bArr, int i11, int i12) {
        if (this.forWrapping) {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (bArr != null) {
            if (i12 % this.engine.getBlockSize() == 0) {
                this.engine.init(false, new ParametersWithIV(this.param, IV2));
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i11, bArr2, 0, i12);
                for (int i13 = 0; i13 < i12 / this.engine.getBlockSize(); i13++) {
                    int blockSize = this.engine.getBlockSize() * i13;
                    this.engine.processBlock(bArr2, blockSize, bArr2, blockSize);
                }
                byte[] bArr3 = new byte[i12];
                int i14 = 0;
                while (i14 < i12) {
                    int i15 = i14 + 1;
                    bArr3[i14] = bArr2[i12 - i15];
                    i14 = i15;
                }
                byte[] bArr4 = new byte[8];
                this.f43507iv = bArr4;
                int i16 = i12 - 8;
                byte[] bArr5 = new byte[i16];
                System.arraycopy(bArr3, 0, bArr4, 0, 8);
                System.arraycopy(bArr3, 8, bArr5, 0, i16);
                ParametersWithIV parametersWithIV = new ParametersWithIV(this.param, this.f43507iv);
                this.paramPlusIV = parametersWithIV;
                this.engine.init(false, parametersWithIV);
                byte[] bArr6 = new byte[i16];
                System.arraycopy(bArr5, 0, bArr6, 0, i16);
                for (int i17 = 0; i17 < i16 / this.engine.getBlockSize(); i17++) {
                    int blockSize2 = this.engine.getBlockSize() * i17;
                    this.engine.processBlock(bArr6, blockSize2, bArr6, blockSize2);
                }
                int i18 = i16 - 8;
                byte[] bArr7 = new byte[i18];
                byte[] bArr8 = new byte[8];
                System.arraycopy(bArr6, 0, bArr7, 0, i18);
                System.arraycopy(bArr6, i18, bArr8, 0, 8);
                if (checkCMSKeyChecksum(bArr7, bArr8)) {
                    if (i18 - ((bArr7[0] & 255) + 1) <= 7) {
                        int i19 = bArr7[0];
                        byte[] bArr9 = new byte[i19];
                        System.arraycopy(bArr7, 1, bArr9, 0, i19);
                        return bArr9;
                    }
                    throw new InvalidCipherTextException("too many pad bytes (" + (i18 - ((bArr7[0] & 255) + 1)) + ")");
                }
                throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
            }
            throw new InvalidCipherTextException("Ciphertext not multiple of " + this.engine.getBlockSize());
        }
        throw new InvalidCipherTextException("Null pointer as ciphertext");
    }

    @Override // org.spongycastle.crypto.Wrapper
    public byte[] wrap(byte[] bArr, int i11, int i12) {
        if (this.forWrapping) {
            int i13 = i12 + 1;
            int i14 = i13 % 8;
            int i15 = i14 != 0 ? (8 - i14) + i13 : i13;
            byte[] bArr2 = new byte[i15];
            bArr2[0] = (byte) i12;
            System.arraycopy(bArr, i11, bArr2, 1, i12);
            int i16 = (i15 - i12) - 1;
            byte[] bArr3 = new byte[i16];
            if (i16 > 0) {
                this.f43508sr.nextBytes(bArr3);
                System.arraycopy(bArr3, 0, bArr2, i13, i16);
            }
            byte[] calculateCMSKeyChecksum = calculateCMSKeyChecksum(bArr2);
            int length = calculateCMSKeyChecksum.length + i15;
            byte[] bArr4 = new byte[length];
            System.arraycopy(bArr2, 0, bArr4, 0, i15);
            System.arraycopy(calculateCMSKeyChecksum, 0, bArr4, i15, calculateCMSKeyChecksum.length);
            byte[] bArr5 = new byte[length];
            System.arraycopy(bArr4, 0, bArr5, 0, length);
            int blockSize = length / this.engine.getBlockSize();
            if (length % this.engine.getBlockSize() == 0) {
                this.engine.init(true, this.paramPlusIV);
                for (int i17 = 0; i17 < blockSize; i17++) {
                    int blockSize2 = this.engine.getBlockSize() * i17;
                    this.engine.processBlock(bArr5, blockSize2, bArr5, blockSize2);
                }
                byte[] bArr6 = this.f43507iv;
                int length2 = bArr6.length + length;
                byte[] bArr7 = new byte[length2];
                System.arraycopy(bArr6, 0, bArr7, 0, bArr6.length);
                System.arraycopy(bArr5, 0, bArr7, this.f43507iv.length, length);
                byte[] bArr8 = new byte[length2];
                int i18 = 0;
                while (i18 < length2) {
                    int i19 = i18 + 1;
                    bArr8[i18] = bArr7[length2 - i19];
                    i18 = i19;
                }
                this.engine.init(true, new ParametersWithIV(this.param, IV2));
                for (int i21 = 0; i21 < blockSize + 1; i21++) {
                    int blockSize3 = this.engine.getBlockSize() * i21;
                    this.engine.processBlock(bArr8, blockSize3, bArr8, blockSize3);
                }
                return bArr8;
            }
            throw new IllegalStateException("Not multiple of block length");
        }
        throw new IllegalStateException("Not initialized for wrapping");
    }
}