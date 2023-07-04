package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes4.dex */
public class NoekeonEngine implements BlockCipher {
    private static final int genericSize = 16;
    private static final int[] nullVector = {0, 0, 0, 0};
    private static final int[] roundConstants = {128, 27, 54, 108, 216, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212};
    private boolean _forEncryption;
    private int[] state = new int[4];
    private int[] subKeys = new int[4];
    private int[] decryptKeys = new int[4];
    private boolean _initialised = false;

    private int bytesToIntBig(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = (bArr[i11] << 24) | ((bArr[i12] & 255) << 16);
        return (bArr[i13 + 1] & 255) | i14 | ((bArr[i13] & 255) << 8);
    }

    private int decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        this.state[0] = bytesToIntBig(bArr, i11);
        this.state[1] = bytesToIntBig(bArr, i11 + 4);
        this.state[2] = bytesToIntBig(bArr, i11 + 8);
        this.state[3] = bytesToIntBig(bArr, i11 + 12);
        int[] iArr = this.subKeys;
        System.arraycopy(iArr, 0, this.decryptKeys, 0, iArr.length);
        theta(this.decryptKeys, nullVector);
        int i13 = 16;
        while (i13 > 0) {
            theta(this.state, this.decryptKeys);
            int[] iArr2 = this.state;
            iArr2[0] = iArr2[0] ^ roundConstants[i13];
            pi1(iArr2);
            gamma(this.state);
            pi2(this.state);
            i13--;
        }
        theta(this.state, this.decryptKeys);
        int[] iArr3 = this.state;
        iArr3[0] = roundConstants[i13] ^ iArr3[0];
        intToBytesBig(iArr3[0], bArr2, i12);
        intToBytesBig(this.state[1], bArr2, i12 + 4);
        intToBytesBig(this.state[2], bArr2, i12 + 8);
        intToBytesBig(this.state[3], bArr2, i12 + 12);
        return 16;
    }

    private int encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        this.state[0] = bytesToIntBig(bArr, i11);
        this.state[1] = bytesToIntBig(bArr, i11 + 4);
        this.state[2] = bytesToIntBig(bArr, i11 + 8);
        this.state[3] = bytesToIntBig(bArr, i11 + 12);
        int i13 = 0;
        while (i13 < 16) {
            int[] iArr = this.state;
            iArr[0] = iArr[0] ^ roundConstants[i13];
            theta(iArr, this.subKeys);
            pi1(this.state);
            gamma(this.state);
            pi2(this.state);
            i13++;
        }
        int[] iArr2 = this.state;
        iArr2[0] = roundConstants[i13] ^ iArr2[0];
        theta(iArr2, this.subKeys);
        intToBytesBig(this.state[0], bArr2, i12);
        intToBytesBig(this.state[1], bArr2, i12 + 4);
        intToBytesBig(this.state[2], bArr2, i12 + 8);
        intToBytesBig(this.state[3], bArr2, i12 + 12);
        return 16;
    }

    private void gamma(int[] iArr) {
        iArr[1] = iArr[1] ^ ((~iArr[3]) & (~iArr[2]));
        iArr[0] = iArr[0] ^ (iArr[2] & iArr[1]);
        int i11 = iArr[3];
        iArr[3] = iArr[0];
        iArr[0] = i11;
        iArr[2] = iArr[2] ^ ((iArr[0] ^ iArr[1]) ^ iArr[3]);
        iArr[1] = ((~iArr[3]) & (~iArr[2])) ^ iArr[1];
        iArr[0] = (iArr[1] & iArr[2]) ^ iArr[0];
    }

    private void intToBytesBig(int i11, byte[] bArr, int i12) {
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >>> 24);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i11 >>> 16);
        bArr[i14] = (byte) (i11 >>> 8);
        bArr[i14 + 1] = (byte) i11;
    }

    private void pi1(int[] iArr) {
        iArr[1] = rotl(iArr[1], 1);
        iArr[2] = rotl(iArr[2], 5);
        iArr[3] = rotl(iArr[3], 2);
    }

    private void pi2(int[] iArr) {
        iArr[1] = rotl(iArr[1], 31);
        iArr[2] = rotl(iArr[2], 27);
        iArr[3] = rotl(iArr[3], 30);
    }

    private int rotl(int i11, int i12) {
        return (i11 >>> (32 - i12)) | (i11 << i12);
    }

    private void setKey(byte[] bArr) {
        this.subKeys[0] = bytesToIntBig(bArr, 0);
        this.subKeys[1] = bytesToIntBig(bArr, 4);
        this.subKeys[2] = bytesToIntBig(bArr, 8);
        this.subKeys[3] = bytesToIntBig(bArr, 12);
    }

    private void theta(int[] iArr, int[] iArr2) {
        int i11 = iArr[0] ^ iArr[2];
        int rotl = i11 ^ (rotl(i11, 8) ^ rotl(i11, 24));
        iArr[1] = iArr[1] ^ rotl;
        iArr[3] = rotl ^ iArr[3];
        for (int i12 = 0; i12 < 4; i12++) {
            iArr[i12] = iArr[i12] ^ iArr2[i12];
        }
        int i13 = iArr[1] ^ iArr[3];
        int rotl2 = i13 ^ (rotl(i13, 8) ^ rotl(i13, 24));
        iArr[0] = iArr[0] ^ rotl2;
        iArr[2] = rotl2 ^ iArr[2];
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Noekeon";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this._forEncryption = z11;
            this._initialised = true;
            setKey(((KeyParameter) cipherParameters).getKey());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to Noekeon init - " + cipherParameters.getClass().getName());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this._initialised) {
            if (i11 + 16 <= bArr.length) {
                if (i12 + 16 <= bArr2.length) {
                    return this._forEncryption ? encryptBlock(bArr, i11, bArr2, i12) : decryptBlock(bArr, i11, bArr2, i12);
                }
                throw new OutputLengthException("output buffer too short");
            }
            throw new DataLengthException("input buffer too short");
        }
        throw new IllegalStateException(getAlgorithmName() + " not initialised");
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }
}