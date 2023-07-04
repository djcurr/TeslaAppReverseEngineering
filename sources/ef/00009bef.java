package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;

/* loaded from: classes4.dex */
public class RC4Engine implements StreamCipher {
    private static final int STATE_LENGTH = 256;
    private byte[] engineState = null;

    /* renamed from: x  reason: collision with root package name */
    private int f43509x = 0;

    /* renamed from: y  reason: collision with root package name */
    private int f43510y = 0;
    private byte[] workingKey = null;

    private void setKey(byte[] bArr) {
        this.workingKey = bArr;
        this.f43509x = 0;
        this.f43510y = 0;
        if (this.engineState == null) {
            this.engineState = new byte[256];
        }
        for (int i11 = 0; i11 < 256; i11++) {
            this.engineState[i11] = (byte) i11;
        }
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < 256; i14++) {
            byte[] bArr2 = this.engineState;
            i13 = ((bArr[i12] & 255) + bArr2[i14] + i13) & 255;
            byte b11 = bArr2[i14];
            bArr2[i14] = bArr2[i13];
            bArr2[i13] = b11;
            i12 = (i12 + 1) % bArr.length;
        }
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "RC4";
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            this.workingKey = key;
            setKey(key);
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to RC4 init - " + cipherParameters.getClass().getName());
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i11 + i12 <= bArr.length) {
            if (i13 + i12 <= bArr2.length) {
                for (int i14 = 0; i14 < i12; i14++) {
                    int i15 = (this.f43509x + 1) & 255;
                    this.f43509x = i15;
                    byte[] bArr3 = this.engineState;
                    int i16 = (bArr3[i15] + this.f43510y) & 255;
                    this.f43510y = i16;
                    byte b11 = bArr3[i15];
                    bArr3[i15] = bArr3[i16];
                    bArr3[i16] = b11;
                    bArr2[i14 + i13] = (byte) (bArr3[(bArr3[i15] + bArr3[i16]) & 255] ^ bArr[i14 + i11]);
                }
                return i12;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input buffer too short");
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public void reset() {
        setKey(this.workingKey);
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public byte returnByte(byte b11) {
        int i11 = (this.f43509x + 1) & 255;
        this.f43509x = i11;
        byte[] bArr = this.engineState;
        int i12 = (bArr[i11] + this.f43510y) & 255;
        this.f43510y = i12;
        byte b12 = bArr[i11];
        bArr[i11] = bArr[i12];
        bArr[i12] = b12;
        return (byte) (b11 ^ bArr[(bArr[i11] + bArr[i12]) & 255]);
    }
}