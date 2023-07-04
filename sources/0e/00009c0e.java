package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;

/* loaded from: classes4.dex */
public class XTEAEngine implements BlockCipher {
    private static final int block_size = 8;
    private static final int delta = -1640531527;
    private static final int rounds = 32;
    private boolean _forEncryption;
    private int[] _S = new int[4];
    private int[] _sum0 = new int[32];
    private int[] _sum1 = new int[32];
    private boolean _initialised = false;

    private int bytesToInt(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        int i14 = (bArr[i11] << 24) | ((bArr[i12] & 255) << 16);
        return (bArr[i13 + 1] & 255) | i14 | ((bArr[i13] & 255) << 8);
    }

    private int decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int bytesToInt = bytesToInt(bArr, i11);
        int bytesToInt2 = bytesToInt(bArr, i11 + 4);
        for (int i13 = 31; i13 >= 0; i13--) {
            bytesToInt2 -= (((bytesToInt << 4) ^ (bytesToInt >>> 5)) + bytesToInt) ^ this._sum1[i13];
            bytesToInt -= (((bytesToInt2 << 4) ^ (bytesToInt2 >>> 5)) + bytesToInt2) ^ this._sum0[i13];
        }
        unpackInt(bytesToInt, bArr2, i12);
        unpackInt(bytesToInt2, bArr2, i12 + 4);
        return 8;
    }

    private int encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int bytesToInt = bytesToInt(bArr, i11);
        int bytesToInt2 = bytesToInt(bArr, i11 + 4);
        for (int i13 = 0; i13 < 32; i13++) {
            bytesToInt += (((bytesToInt2 << 4) ^ (bytesToInt2 >>> 5)) + bytesToInt2) ^ this._sum0[i13];
            bytesToInt2 += (((bytesToInt << 4) ^ (bytesToInt >>> 5)) + bytesToInt) ^ this._sum1[i13];
        }
        unpackInt(bytesToInt, bArr2, i12);
        unpackInt(bytesToInt2, bArr2, i12 + 4);
        return 8;
    }

    private void setKey(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("Key size must be 128 bits.");
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < 4) {
            this._S[i11] = bytesToInt(bArr, i12);
            i11++;
            i12 += 4;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            int[] iArr = this._sum0;
            int[] iArr2 = this._S;
            iArr[i14] = iArr2[i13 & 3] + i13;
            i13 -= 1640531527;
            this._sum1[i14] = iArr2[(i13 >>> 11) & 3] + i13;
        }
    }

    private void unpackInt(int i11, byte[] bArr, int i12) {
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >>> 24);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i11 >>> 16);
        bArr[i14] = (byte) (i11 >>> 8);
        bArr[i14 + 1] = (byte) i11;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "XTEA";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this._forEncryption = z11;
            this._initialised = true;
            setKey(((KeyParameter) cipherParameters).getKey());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to TEA init - " + cipherParameters.getClass().getName());
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this._initialised) {
            if (i11 + 8 <= bArr.length) {
                if (i12 + 8 <= bArr2.length) {
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