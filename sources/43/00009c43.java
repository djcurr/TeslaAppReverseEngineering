package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.modes.CBCBlockCipher;

/* loaded from: classes4.dex */
public class BlockCipherMac implements Mac {
    private byte[] buf;
    private int bufOff;
    private BlockCipher cipher;
    private byte[] mac;
    private int macSize;

    public BlockCipherMac(BlockCipher blockCipher) {
        this(blockCipher, (blockCipher.getBlockSize() * 8) / 2);
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) {
        int blockSize = this.cipher.getBlockSize();
        while (true) {
            int i12 = this.bufOff;
            if (i12 < blockSize) {
                this.buf[i12] = 0;
                this.bufOff = i12 + 1;
            } else {
                this.cipher.processBlock(this.buf, 0, this.mac, 0);
                System.arraycopy(this.mac, 0, bArr, i11, this.macSize);
                reset();
                return this.macSize;
            }
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return this.cipher.getAlgorithmName();
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        reset();
        this.cipher.init(true, cipherParameters);
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        int i11 = 0;
        while (true) {
            byte[] bArr = this.buf;
            if (i11 < bArr.length) {
                bArr[i11] = 0;
                i11++;
            } else {
                this.bufOff = 0;
                this.cipher.reset();
                return;
            }
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b11) {
        int i11 = this.bufOff;
        byte[] bArr = this.buf;
        if (i11 == bArr.length) {
            this.cipher.processBlock(bArr, 0, this.mac, 0);
            this.bufOff = 0;
        }
        byte[] bArr2 = this.buf;
        int i12 = this.bufOff;
        this.bufOff = i12 + 1;
        bArr2[i12] = b11;
    }

    public BlockCipherMac(BlockCipher blockCipher, int i11) {
        if (i11 % 8 == 0) {
            this.cipher = new CBCBlockCipher(blockCipher);
            this.macSize = i11 / 8;
            this.mac = new byte[blockCipher.getBlockSize()];
            this.buf = new byte[blockCipher.getBlockSize()];
            this.bufOff = 0;
            return;
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) {
        if (i12 >= 0) {
            int blockSize = this.cipher.getBlockSize();
            int i13 = this.bufOff;
            int i14 = blockSize - i13;
            if (i12 > i14) {
                System.arraycopy(bArr, i11, this.buf, i13, i14);
                this.cipher.processBlock(this.buf, 0, this.mac, 0);
                this.bufOff = 0;
                i12 -= i14;
                i11 += i14;
                while (i12 > blockSize) {
                    this.cipher.processBlock(bArr, i11, this.mac, 0);
                    i12 -= blockSize;
                    i11 += blockSize;
                }
            }
            System.arraycopy(bArr, i11, this.buf, this.bufOff, i12);
            this.bufOff += i12;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}