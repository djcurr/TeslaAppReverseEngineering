package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithSBox;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes4.dex */
public class GOST28147Mac implements Mac {
    private int blockSize = 8;
    private int macSize = 4;
    private boolean firstStep = true;
    private int[] workingKey = null;
    private byte[] S = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, 14, 15, 12, 0, 13, 5, 3, 7, 14, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, 14, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, 14, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, 14, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, 14, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, 14, 11, 10, 15, 5, 0, 12, 14, 8, 6, 2, 3, 9, 1, 7, 13, 4};
    private byte[] mac = new byte[8];
    private byte[] buf = new byte[8];
    private int bufOff = 0;

    private byte[] CM5func(byte[] bArr, int i11, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length - i11];
        System.arraycopy(bArr, i11, bArr3, 0, bArr2.length);
        for (int i12 = 0; i12 != bArr2.length; i12++) {
            bArr3[i12] = (byte) (bArr3[i12] ^ bArr2[i12]);
        }
        return bArr3;
    }

    private int bytesToint(byte[] bArr, int i11) {
        return ((bArr[i11 + 3] << 24) & (-16777216)) + ((bArr[i11 + 2] << Tnaf.POW_2_WIDTH) & 16711680) + ((bArr[i11 + 1] << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) + (bArr[i11] & 255);
    }

    private int[] generateWorkingKey(byte[] bArr) {
        if (bArr.length == 32) {
            int[] iArr = new int[8];
            for (int i11 = 0; i11 != 8; i11++) {
                iArr[i11] = bytesToint(bArr, i11 * 4);
            }
            return iArr;
        }
        throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
    }

    private void gost28147MacFunc(int[] iArr, byte[] bArr, int i11, byte[] bArr2, int i12) {
        int bytesToint = bytesToint(bArr, i11);
        int bytesToint2 = bytesToint(bArr, i11 + 4);
        for (int i13 = 0; i13 < 2; i13++) {
            int i14 = 0;
            while (i14 < 8) {
                i14++;
                int i15 = bytesToint;
                bytesToint = bytesToint2 ^ gost28147_mainStep(bytesToint, iArr[i14]);
                bytesToint2 = i15;
            }
        }
        intTobytes(bytesToint, bArr2, i12);
        intTobytes(bytesToint2, bArr2, i12 + 4);
    }

    private int gost28147_mainStep(int i11, int i12) {
        int i13 = i12 + i11;
        byte[] bArr = this.S;
        int i14 = (bArr[((i13 >> 0) & 15) + 0] << 0) + (bArr[((i13 >> 4) & 15) + 16] << 4) + (bArr[((i13 >> 8) & 15) + 32] << 8) + (bArr[((i13 >> 12) & 15) + 48] << 12) + (bArr[((i13 >> 16) & 15) + 64] << Tnaf.POW_2_WIDTH) + (bArr[((i13 >> 20) & 15) + 80] << 20) + (bArr[((i13 >> 24) & 15) + 96] << 24) + (bArr[((i13 >> 28) & 15) + 112] << 28);
        return (i14 << 11) | (i14 >>> 21);
    }

    private void intTobytes(int i11, byte[] bArr, int i12) {
        bArr[i12 + 3] = (byte) (i11 >>> 24);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12] = (byte) i11;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) {
        while (true) {
            int i12 = this.bufOff;
            if (i12 >= this.blockSize) {
                break;
            }
            this.buf[i12] = 0;
            this.bufOff = i12 + 1;
        }
        byte[] bArr2 = this.buf;
        byte[] bArr3 = new byte[bArr2.length];
        System.arraycopy(bArr2, 0, bArr3, 0, this.mac.length);
        if (this.firstStep) {
            this.firstStep = false;
        } else {
            bArr3 = CM5func(this.buf, 0, this.mac);
        }
        gost28147MacFunc(this.workingKey, bArr3, 0, this.mac, 0);
        byte[] bArr4 = this.mac;
        int i13 = this.macSize;
        System.arraycopy(bArr4, (bArr4.length / 2) - i13, bArr, i11, i13);
        reset();
        return this.macSize;
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return "GOST28147Mac";
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return this.macSize;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        reset();
        this.buf = new byte[this.blockSize];
        if (cipherParameters instanceof ParametersWithSBox) {
            ParametersWithSBox parametersWithSBox = (ParametersWithSBox) cipherParameters;
            System.arraycopy(parametersWithSBox.getSBox(), 0, this.S, 0, parametersWithSBox.getSBox().length);
            if (parametersWithSBox.getParameters() != null) {
                this.workingKey = generateWorkingKey(((KeyParameter) parametersWithSBox.getParameters()).getKey());
            }
        } else if (cipherParameters instanceof KeyParameter) {
            this.workingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey());
        } else {
            throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + cipherParameters.getClass().getName());
        }
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
                this.firstStep = true;
                return;
            }
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b11) {
        int i11 = this.bufOff;
        byte[] bArr = this.buf;
        if (i11 == bArr.length) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, this.mac.length);
            if (this.firstStep) {
                this.firstStep = false;
            } else {
                bArr2 = CM5func(this.buf, 0, this.mac);
            }
            gost28147MacFunc(this.workingKey, bArr2, 0, this.mac, 0);
            this.bufOff = 0;
        }
        byte[] bArr3 = this.buf;
        int i12 = this.bufOff;
        this.bufOff = i12 + 1;
        bArr3[i12] = b11;
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) {
        if (i12 >= 0) {
            int i13 = this.blockSize;
            int i14 = this.bufOff;
            int i15 = i13 - i14;
            if (i12 > i15) {
                System.arraycopy(bArr, i11, this.buf, i14, i15);
                byte[] bArr2 = this.buf;
                byte[] bArr3 = new byte[bArr2.length];
                System.arraycopy(bArr2, 0, bArr3, 0, this.mac.length);
                if (this.firstStep) {
                    this.firstStep = false;
                } else {
                    bArr3 = CM5func(this.buf, 0, this.mac);
                }
                gost28147MacFunc(this.workingKey, bArr3, 0, this.mac, 0);
                this.bufOff = 0;
                while (true) {
                    i12 -= i15;
                    i11 += i15;
                    if (i12 <= this.blockSize) {
                        break;
                    }
                    gost28147MacFunc(this.workingKey, CM5func(bArr, i11, this.mac), 0, this.mac, 0);
                    i15 = this.blockSize;
                }
            }
            System.arraycopy(bArr, i11, this.buf, this.bufOff, i12);
            this.bufOff += i12;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}