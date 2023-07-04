package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.OutputLengthException;
import org.spongycastle.crypto.params.KeyParameter;

/* loaded from: classes4.dex */
public abstract class SerpentEngineBase implements BlockCipher {
    protected static final int BLOCK_SIZE = 16;
    static final int PHI = -1640531527;
    static final int ROUNDS = 32;
    protected int X0;
    protected int X1;
    protected int X2;
    protected int X3;
    protected boolean encrypting;
    protected int[] wKey;

    /* JADX INFO: Access modifiers changed from: protected */
    public static int rotateLeft(int i11, int i12) {
        return (i11 >>> (-i12)) | (i11 << i12);
    }

    protected static int rotateRight(int i11, int i12) {
        return (i11 << (-i12)) | (i11 >>> i12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void LT() {
        int rotateLeft = rotateLeft(this.X0, 13);
        int rotateLeft2 = rotateLeft(this.X2, 3);
        this.X1 = rotateLeft((this.X1 ^ rotateLeft) ^ rotateLeft2, 1);
        int rotateLeft3 = rotateLeft((this.X3 ^ rotateLeft2) ^ (rotateLeft << 3), 7);
        this.X3 = rotateLeft3;
        this.X0 = rotateLeft((rotateLeft ^ this.X1) ^ rotateLeft3, 5);
        this.X2 = rotateLeft((this.X3 ^ rotateLeft2) ^ (this.X1 << 7), 22);
    }

    protected abstract void decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12);

    protected abstract void encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12);

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Serpent";
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ib0(int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i12 ^ i11;
        int i17 = (i15 | i16) ^ i14;
        int i18 = i13 ^ i17;
        int i19 = i16 ^ i18;
        this.X2 = i19;
        int i21 = (i16 & i14) ^ i15;
        int i22 = (i19 & i21) ^ i17;
        this.X1 = i22;
        int i23 = (i11 & i17) ^ (i22 | i18);
        this.X3 = i23;
        this.X0 = i23 ^ (i21 ^ i18);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ib1(int i11, int i12, int i13, int i14) {
        int i15 = i14 ^ i12;
        int i16 = i11 ^ (i12 & i15);
        int i17 = i15 ^ i16;
        int i18 = i13 ^ i17;
        this.X3 = i18;
        int i19 = i12 ^ (i15 & i16);
        int i21 = i16 ^ (i18 | i19);
        this.X1 = i21;
        int i22 = ~i21;
        int i23 = i19 ^ i18;
        this.X0 = i22 ^ i23;
        this.X2 = (i22 | i23) ^ i17;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ib2(int i11, int i12, int i13, int i14) {
        int i15 = i12 ^ i14;
        int i16 = ~i15;
        int i17 = i11 ^ i13;
        int i18 = i13 ^ i15;
        int i19 = (i12 & i18) ^ i17;
        this.X0 = i19;
        int i21 = (((i11 | i16) ^ i14) | i17) ^ i15;
        this.X3 = i21;
        int i22 = ~i18;
        int i23 = i21 | i19;
        this.X1 = i22 ^ i23;
        this.X2 = (i23 ^ i17) ^ (i14 & i22);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ib3(int i11, int i12, int i13, int i14) {
        int i15 = i11 | i12;
        int i16 = i12 ^ i13;
        int i17 = i11 ^ (i12 & i16);
        int i18 = i13 ^ i17;
        int i19 = i14 | i17;
        int i21 = i16 ^ i19;
        this.X0 = i21;
        int i22 = (i19 | i16) ^ i14;
        this.X2 = i18 ^ i22;
        int i23 = i15 ^ i22;
        int i24 = i17 ^ (i21 & i23);
        this.X3 = i24;
        this.X1 = i24 ^ (i23 ^ i21);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ib4(int i11, int i12, int i13, int i14) {
        int i15 = i12 ^ ((i13 | i14) & i11);
        int i16 = i13 ^ (i11 & i15);
        int i17 = i14 ^ i16;
        this.X1 = i17;
        int i18 = ~i11;
        int i19 = (i16 & i17) ^ i15;
        this.X3 = i19;
        int i21 = i14 ^ (i17 | i18);
        this.X0 = i19 ^ i21;
        this.X2 = (i18 ^ i17) ^ (i15 & i21);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ib5(int i11, int i12, int i13, int i14) {
        int i15 = ~i13;
        int i16 = (i12 & i15) ^ i14;
        int i17 = i11 & i16;
        int i18 = (i12 ^ i15) ^ i17;
        this.X3 = i18;
        int i19 = i18 | i12;
        this.X1 = i16 ^ (i11 & i19);
        int i21 = i14 | i11;
        this.X0 = (i15 ^ i19) ^ i21;
        this.X2 = ((i11 ^ i13) | i17) ^ (i12 & i21);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ib6(int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i11 ^ i12;
        int i17 = i13 ^ i16;
        int i18 = (i13 | i15) ^ i14;
        this.X1 = i17 ^ i18;
        int i19 = i16 ^ (i17 & i18);
        int i21 = i18 ^ (i12 | i19);
        this.X3 = i21;
        int i22 = i12 | i21;
        this.X0 = i19 ^ i22;
        this.X2 = (i14 & i15) ^ (i22 ^ i17);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ib7(int i11, int i12, int i13, int i14) {
        int i15 = (i11 & i12) | i13;
        int i16 = (i11 | i12) & i14;
        int i17 = i15 ^ i16;
        this.X3 = i17;
        int i18 = i12 ^ i16;
        int i19 = ((i17 ^ (~i14)) | i18) ^ i11;
        this.X1 = i19;
        int i21 = (i18 ^ i13) ^ (i14 | i19);
        this.X0 = i21;
        this.X2 = ((i11 & i17) ^ i21) ^ (i15 ^ i19);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            this.encrypting = z11;
            this.wKey = makeWorkingKey(((KeyParameter) cipherParameters).getKey());
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed to " + getAlgorithmName() + " init - " + cipherParameters.getClass().getName());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void inverseLT() {
        int rotateRight = (rotateRight(this.X2, 22) ^ this.X3) ^ (this.X1 << 7);
        int rotateRight2 = rotateRight(this.X0, 5) ^ this.X1;
        int i11 = this.X3;
        int i12 = rotateRight2 ^ i11;
        int rotateRight3 = rotateRight(i11, 7);
        int rotateRight4 = rotateRight(this.X1, 1);
        this.X3 = (rotateRight3 ^ rotateRight) ^ (i12 << 3);
        this.X1 = (rotateRight4 ^ i12) ^ rotateRight;
        this.X2 = rotateRight(rotateRight, 3);
        this.X0 = rotateRight(i12, 13);
    }

    protected abstract int[] makeWorkingKey(byte[] bArr);

    @Override // org.spongycastle.crypto.BlockCipher
    public final int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        if (this.wKey != null) {
            if (i11 + 16 <= bArr.length) {
                if (i12 + 16 <= bArr2.length) {
                    if (this.encrypting) {
                        encryptBlock(bArr, i11, bArr2, i12);
                        return 16;
                    }
                    decryptBlock(bArr, i11, bArr2, i12);
                    return 16;
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

    /* JADX INFO: Access modifiers changed from: protected */
    public final void sb0(int i11, int i12, int i13, int i14) {
        int i15 = i11 ^ i14;
        int i16 = i13 ^ i15;
        int i17 = i12 ^ i16;
        int i18 = (i14 & i11) ^ i17;
        this.X3 = i18;
        int i19 = i11 ^ (i12 & i15);
        this.X2 = (i13 | i19) ^ i17;
        int i21 = (i16 ^ i19) & i18;
        this.X1 = (~i16) ^ i21;
        this.X0 = (~i19) ^ i21;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void sb1(int i11, int i12, int i13, int i14) {
        int i15 = (~i11) ^ i12;
        int i16 = (i11 | i15) ^ i13;
        int i17 = i14 ^ i16;
        this.X2 = i17;
        int i18 = i12 ^ (i14 | i15);
        int i19 = i17 ^ i15;
        int i21 = (i16 & i18) ^ i19;
        this.X3 = i21;
        int i22 = i18 ^ i16;
        this.X1 = i21 ^ i22;
        this.X0 = i16 ^ (i22 & i19);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void sb2(int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i12 ^ i14;
        int i17 = (i13 & i15) ^ i16;
        this.X0 = i17;
        int i18 = i13 ^ i15;
        int i19 = i12 & (i13 ^ i17);
        int i21 = i18 ^ i19;
        this.X3 = i21;
        int i22 = i11 ^ ((i19 | i14) & (i17 | i18));
        this.X2 = i22;
        this.X1 = (i22 ^ (i14 | i15)) ^ (i16 ^ i21);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void sb3(int i11, int i12, int i13, int i14) {
        int i15 = i11 ^ i12;
        int i16 = i11 & i13;
        int i17 = i11 | i14;
        int i18 = i13 ^ i14;
        int i19 = i16 | (i15 & i17);
        int i21 = i18 ^ i19;
        this.X2 = i21;
        int i22 = (i17 ^ i12) ^ i19;
        int i23 = i15 ^ (i18 & i22);
        this.X0 = i23;
        int i24 = i23 & i21;
        this.X1 = i22 ^ i24;
        this.X3 = (i12 | i14) ^ (i18 ^ i24);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void sb4(int i11, int i12, int i13, int i14) {
        int i15 = i11 ^ i14;
        int i16 = i13 ^ (i14 & i15);
        int i17 = i12 | i16;
        this.X3 = i15 ^ i17;
        int i18 = ~i12;
        int i19 = (i15 | i18) ^ i16;
        this.X0 = i19;
        int i21 = i18 ^ i15;
        int i22 = (i17 & i21) ^ (i19 & i11);
        this.X2 = i22;
        this.X1 = (i11 ^ i16) ^ (i21 & i22);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void sb5(int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i11 ^ i12;
        int i17 = i11 ^ i14;
        int i18 = (i13 ^ i15) ^ (i16 | i17);
        this.X0 = i18;
        int i19 = i14 & i18;
        int i21 = (i16 ^ i18) ^ i19;
        this.X1 = i21;
        int i22 = i17 ^ (i18 | i15);
        this.X2 = (i16 | i19) ^ i22;
        this.X3 = (i22 & i21) ^ (i12 ^ i19);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void sb6(int i11, int i12, int i13, int i14) {
        int i15 = ~i11;
        int i16 = i11 ^ i14;
        int i17 = i12 ^ i16;
        int i18 = i13 ^ (i15 | i16);
        int i19 = i12 ^ i18;
        this.X1 = i19;
        int i21 = (i16 | i19) ^ i14;
        int i22 = (i18 & i21) ^ i17;
        this.X2 = i22;
        int i23 = i21 ^ i18;
        this.X0 = i22 ^ i23;
        this.X3 = (i23 & i17) ^ (~i18);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void sb7(int i11, int i12, int i13, int i14) {
        int i15 = i12 ^ i13;
        int i16 = (i13 & i15) ^ i14;
        int i17 = i11 ^ i16;
        int i18 = i12 ^ ((i14 | i15) & i17);
        this.X1 = i18;
        int i19 = (i11 & i17) ^ i15;
        this.X3 = i19;
        int i21 = (i18 | i16) ^ i17;
        int i22 = i16 ^ (i19 & i21);
        this.X2 = i22;
        this.X0 = (i19 & i22) ^ (~i21);
    }
}