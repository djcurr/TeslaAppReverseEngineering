package org.spongycastle.crypto.prng;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

/* loaded from: classes4.dex */
public class FixedSecureRandom extends SecureRandom {
    private byte[] _data;
    private int _index;
    private int _intPad;

    public FixedSecureRandom(byte[] bArr) {
        this(false, new byte[][]{bArr});
    }

    private int nextValue() {
        byte[] bArr = this._data;
        int i11 = this._index;
        this._index = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i11) {
        byte[] bArr = new byte[i11];
        nextBytes(bArr);
        return bArr;
    }

    public boolean isExhausted() {
        return this._index == this._data.length;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        System.arraycopy(this._data, this._index, bArr, 0, bArr.length);
        this._index += bArr.length;
    }

    @Override // java.util.Random
    public int nextInt() {
        int nextValue = (nextValue() << 24) | 0 | (nextValue() << 16);
        int i11 = this._intPad;
        if (i11 == 2) {
            this._intPad = i11 - 1;
        } else {
            nextValue |= nextValue() << 8;
        }
        int i12 = this._intPad;
        if (i12 == 1) {
            this._intPad = i12 - 1;
            return nextValue;
        }
        return nextValue | nextValue();
    }

    @Override // java.util.Random
    public long nextLong() {
        return (nextValue() << 56) | 0 | (nextValue() << 48) | (nextValue() << 40) | (nextValue() << 32) | (nextValue() << 24) | (nextValue() << 16) | (nextValue() << 8) | nextValue();
    }

    public FixedSecureRandom(byte[][] bArr) {
        this(false, bArr);
    }

    public FixedSecureRandom(boolean z11, byte[] bArr) {
        this(z11, new byte[][]{bArr});
    }

    public FixedSecureRandom(boolean z11, byte[][] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i11 = 0; i11 != bArr.length; i11++) {
            try {
                byteArrayOutputStream.write(bArr[i11]);
            } catch (IOException unused) {
                throw new IllegalArgumentException("can't save value array.");
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        this._data = byteArray;
        if (z11) {
            this._intPad = byteArray.length % 4;
        }
    }
}