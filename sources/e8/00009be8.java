package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class ISAACEngine implements StreamCipher {
    private final int sizeL = 8;
    private final int stateArraySize = 256;
    private int[] engineState = null;
    private int[] results = null;

    /* renamed from: a  reason: collision with root package name */
    private int f43504a = 0;

    /* renamed from: b  reason: collision with root package name */
    private int f43505b = 0;

    /* renamed from: c  reason: collision with root package name */
    private int f43506c = 0;
    private int index = 0;
    private byte[] keyStream = new byte[1024];
    private byte[] workingKey = null;
    private boolean initialised = false;

    private void isaac() {
        int i11 = this.f43505b;
        int i12 = this.f43506c + 1;
        this.f43506c = i12;
        this.f43505b = i11 + i12;
        for (int i13 = 0; i13 < 256; i13++) {
            int[] iArr = this.engineState;
            int i14 = iArr[i13];
            int i15 = i13 & 3;
            if (i15 == 0) {
                int i16 = this.f43504a;
                this.f43504a = i16 ^ (i16 << 13);
            } else if (i15 == 1) {
                int i17 = this.f43504a;
                this.f43504a = i17 ^ (i17 >>> 6);
            } else if (i15 == 2) {
                int i18 = this.f43504a;
                this.f43504a = i18 ^ (i18 << 2);
            } else if (i15 == 3) {
                int i19 = this.f43504a;
                this.f43504a = i19 ^ (i19 >>> 16);
            }
            int i21 = this.f43504a + iArr[(i13 + 128) & 255];
            this.f43504a = i21;
            int i22 = iArr[(i14 >>> 2) & 255] + i21 + this.f43505b;
            iArr[i13] = i22;
            int[] iArr2 = this.results;
            int i23 = iArr[(i22 >>> 10) & 255] + i14;
            this.f43505b = i23;
            iArr2[i13] = i23;
        }
    }

    private void mix(int[] iArr) {
        iArr[0] = iArr[0] ^ (iArr[1] << 11);
        iArr[3] = iArr[3] + iArr[0];
        iArr[1] = iArr[1] + iArr[2];
        iArr[1] = iArr[1] ^ (iArr[2] >>> 2);
        iArr[4] = iArr[4] + iArr[1];
        iArr[2] = iArr[2] + iArr[3];
        iArr[2] = iArr[2] ^ (iArr[3] << 8);
        iArr[5] = iArr[5] + iArr[2];
        iArr[3] = iArr[3] + iArr[4];
        iArr[3] = iArr[3] ^ (iArr[4] >>> 16);
        iArr[6] = iArr[6] + iArr[3];
        iArr[4] = iArr[4] + iArr[5];
        iArr[4] = iArr[4] ^ (iArr[5] << 10);
        iArr[7] = iArr[7] + iArr[4];
        iArr[5] = iArr[5] + iArr[6];
        iArr[5] = (iArr[6] >>> 4) ^ iArr[5];
        iArr[0] = iArr[0] + iArr[5];
        iArr[6] = iArr[6] + iArr[7];
        iArr[6] = iArr[6] ^ (iArr[7] << 8);
        iArr[1] = iArr[1] + iArr[6];
        iArr[7] = iArr[7] + iArr[0];
        iArr[7] = iArr[7] ^ (iArr[0] >>> 9);
        iArr[2] = iArr[2] + iArr[7];
        iArr[0] = iArr[0] + iArr[1];
    }

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        if (this.engineState == null) {
            this.engineState = new int[256];
        }
        if (this.results == null) {
            this.results = new int[256];
        }
        for (int i11 = 0; i11 < 256; i11++) {
            int[] iArr = this.engineState;
            this.results[i11] = 0;
            iArr[i11] = 0;
        }
        this.f43506c = 0;
        this.f43505b = 0;
        this.f43504a = 0;
        this.index = 0;
        int length = bArr.length + (bArr.length & 3);
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        for (int i12 = 0; i12 < length; i12 += 4) {
            this.results[i12 >>> 2] = Pack.littleEndianToInt(bArr2, i12);
        }
        int[] iArr2 = new int[8];
        for (int i13 = 0; i13 < 8; i13++) {
            iArr2[i13] = -1640531527;
        }
        for (int i14 = 0; i14 < 4; i14++) {
            mix(iArr2);
        }
        int i15 = 0;
        while (i15 < 2) {
            for (int i16 = 0; i16 < 256; i16 += 8) {
                for (int i17 = 0; i17 < 8; i17++) {
                    iArr2[i17] = iArr2[i17] + (i15 < 1 ? this.results[i16 + i17] : this.engineState[i16 + i17]);
                }
                mix(iArr2);
                for (int i18 = 0; i18 < 8; i18++) {
                    this.engineState[i16 + i18] = iArr2[i18];
                }
            }
            i15++;
        }
        isaac();
        this.initialised = true;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ISAAC";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            setKey(((KeyParameter) cipherParameters).getKey());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to ISAAC init - " + cipherParameters.getClass().getName());
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (this.initialised) {
            if (i11 + i12 <= bArr.length) {
                if (i13 + i12 <= bArr2.length) {
                    for (int i14 = 0; i14 < i12; i14++) {
                        if (this.index == 0) {
                            isaac();
                            this.keyStream = Pack.intToBigEndian(this.results);
                        }
                        byte[] bArr3 = this.keyStream;
                        int i15 = this.index;
                        bArr2[i14 + i13] = (byte) (bArr3[i15] ^ bArr[i14 + i11]);
                        this.index = (i15 + 1) & 1023;
                    }
                    return i12;
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b11) {
        if (this.index == 0) {
            isaac();
            this.keyStream = Pack.intToBigEndian(this.results);
        }
        byte[] bArr = this.keyStream;
        int i11 = this.index;
        byte b12 = (byte) (b11 ^ bArr[i11]);
        this.index = (i11 + 1) & 1023;
        return b12;
    }
}