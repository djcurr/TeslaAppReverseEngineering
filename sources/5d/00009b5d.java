package org.spongycastle.crypto;

/* loaded from: classes4.dex */
public abstract class StreamBlockCipher implements BlockCipher, StreamCipher {
    private final BlockCipher cipher;

    /* JADX INFO: Access modifiers changed from: protected */
    public StreamBlockCipher(BlockCipher blockCipher) {
        this.cipher = blockCipher;
    }

    protected abstract byte calculateByte(byte b11);

    public BlockCipher getUnderlyingCipher() {
        return this.cipher;
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public int processBytes(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        if (i13 + i12 <= bArr2.length) {
            int i14 = i11 + i12;
            if (i14 <= bArr.length) {
                while (i11 < i14) {
                    bArr2[i13] = calculateByte(bArr[i11]);
                    i13++;
                    i11++;
                }
                return i12;
            }
            throw new DataLengthException("input buffer too small");
        }
        throw new DataLengthException("output buffer too short");
    }

    @Override // org.spongycastle.crypto.StreamCipher
    public final byte returnByte(byte b11) {
        return calculateByte(b11);
    }
}