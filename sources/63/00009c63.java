package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.SkippingStreamCipher;
import org.spongycastle.crypto.StreamBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class SICBlockCipher extends StreamBlockCipher implements SkippingStreamCipher {
    private byte[] IV;
    private final int blockSize;
    private int byteCount;
    private final BlockCipher cipher;
    private byte[] counter;
    private byte[] counterOut;

    public SICBlockCipher(BlockCipher blockCipher) {
        super(blockCipher);
        this.cipher = blockCipher;
        int blockSize = blockCipher.getBlockSize();
        this.blockSize = blockSize;
        this.IV = new byte[blockSize];
        this.counter = new byte[blockSize];
        this.counterOut = new byte[blockSize];
        this.byteCount = 0;
    }

    private void adjustCounter(long j11) {
        int i11 = 5;
        if (j11 >= 0) {
            long j12 = (this.byteCount + j11) / this.blockSize;
            long j13 = j12;
            if (j12 > 255) {
                while (i11 >= 1) {
                    long j14 = 1 << (i11 * 8);
                    while (j13 >= j14) {
                        incrementCounterAt(i11);
                        j13 -= j14;
                    }
                    i11--;
                }
            }
            incrementCounter((int) j13);
            this.byteCount = (int) ((j11 + this.byteCount) - (this.blockSize * j12));
            return;
        }
        long j15 = ((-j11) - this.byteCount) / this.blockSize;
        long j16 = j15;
        if (j15 > 255) {
            while (i11 >= 1) {
                long j17 = 1 << (i11 * 8);
                while (j16 > j17) {
                    decrementCounterAt(i11);
                    j16 -= j17;
                }
                i11--;
            }
        }
        for (long j18 = 0; j18 != j16; j18++) {
            decrementCounterAt(0);
        }
        int i12 = (int) (this.byteCount + j11 + (this.blockSize * j15));
        if (i12 >= 0) {
            this.byteCount = 0;
            return;
        }
        decrementCounterAt(0);
        this.byteCount = this.blockSize + i12;
    }

    private void checkCounter() {
        if (this.IV.length >= this.blockSize) {
            return;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr = this.IV;
            if (i11 == bArr.length) {
                return;
            }
            if (this.counter[i11] != bArr[i11]) {
                throw new IllegalStateException("Counter in CTR/SIC mode out of range.");
            }
            i11++;
        }
    }

    private void decrementCounterAt(int i11) {
        byte[] bArr;
        byte b11;
        int length = this.counter.length - i11;
        do {
            length--;
            if (length < 0) {
                return;
            }
            b11 = (byte) (bArr[length] - 1);
            this.counter[length] = b11;
        } while (b11 == -1);
    }

    private void incrementCounter(int i11) {
        byte[] bArr = this.counter;
        byte b11 = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        bArr[length] = (byte) (bArr[length] + i11);
        if (b11 == 0 || bArr[bArr.length - 1] >= b11) {
            return;
        }
        incrementCounterAt(1);
    }

    private void incrementCounterAt(int i11) {
        byte b11;
        int length = this.counter.length - i11;
        do {
            length--;
            if (length < 0) {
                return;
            }
            byte[] bArr = this.counter;
            b11 = (byte) (bArr[length] + 1);
            bArr[length] = b11;
        } while (b11 == 0);
    }

    @Override // org.spongycastle.crypto.StreamBlockCipher
    protected byte calculateByte(byte b11) {
        int i11 = this.byteCount;
        if (i11 == 0) {
            this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
            byte[] bArr = this.counterOut;
            int i12 = this.byteCount;
            this.byteCount = i12 + 1;
            return (byte) (b11 ^ bArr[i12]);
        }
        byte[] bArr2 = this.counterOut;
        int i13 = i11 + 1;
        this.byteCount = i13;
        byte b12 = (byte) (b11 ^ bArr2[i11]);
        if (i13 == this.counter.length) {
            this.byteCount = 0;
            incrementCounterAt(0);
            checkCounter();
        }
        return b12;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName() + "/SIC";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long getPosition() {
        int i11;
        byte[] bArr = this.counter;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        for (int i12 = length - 1; i12 >= 1; i12--) {
            byte[] bArr3 = this.IV;
            if (i12 < bArr3.length) {
                i11 = (bArr2[i12] & 255) - (bArr3[i12] & 255);
            } else {
                i11 = bArr2[i12] & 255;
            }
            if (i11 < 0) {
                int i13 = i12 - 1;
                bArr2[i13] = (byte) (bArr2[i13] - 1);
                i11 += 256;
            }
            bArr2[i12] = (byte) i11;
        }
        return (Pack.bigEndianToLong(bArr2, length - 8) * this.blockSize) + this.byteCount;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof ParametersWithIV) {
            ParametersWithIV parametersWithIV = (ParametersWithIV) cipherParameters;
            byte[] clone = Arrays.clone(parametersWithIV.getIV());
            this.IV = clone;
            int i11 = this.blockSize;
            if (i11 >= clone.length) {
                int i12 = 8 > i11 / 2 ? i11 / 2 : 8;
                if (i11 - clone.length <= i12) {
                    if (parametersWithIV.getParameters() != null) {
                        this.cipher.init(true, parametersWithIV.getParameters());
                    }
                    reset();
                    return;
                }
                throw new IllegalArgumentException("CTR/SIC mode requires IV of at least: " + (this.blockSize - i12) + " bytes.");
            }
            throw new IllegalArgumentException("CTR/SIC mode requires IV no greater than: " + this.blockSize + " bytes.");
        }
        throw new IllegalArgumentException("CTR/SIC mode requires ParametersWithIV");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        processBytes(bArr, i11, this.blockSize, bArr2, i12);
        return this.blockSize;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
        Arrays.fill(this.counter, (byte) 0);
        byte[] bArr = this.IV;
        System.arraycopy(bArr, 0, this.counter, 0, bArr.length);
        this.cipher.reset();
        this.byteCount = 0;
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long seekTo(long j11) {
        reset();
        return skip(j11);
    }

    @Override // org.spongycastle.crypto.SkippingCipher
    public long skip(long j11) {
        adjustCounter(j11);
        checkCounter();
        this.cipher.processBlock(this.counter, 0, this.counterOut, 0);
        return j11;
    }
}