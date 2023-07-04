package org.spongycastle.crypto.engines;

import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class ChaCha7539Engine extends Salsa20Engine {
    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void advanceCounter(long j11) {
        int i11 = (int) (j11 >>> 32);
        int i12 = (int) j11;
        if (i11 <= 0) {
            int[] iArr = this.engineState;
            int i13 = iArr[12];
            iArr[12] = iArr[12] + i12;
            if (i13 != 0 && iArr[12] < i13) {
                throw new IllegalStateException("attempt to increase counter past 2^32.");
            }
            return;
        }
        throw new IllegalStateException("attempt to increase counter past 2^32.");
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void generateKeyStream(byte[] bArr) {
        ChaChaEngine.chachaCore(this.rounds, this.engineState, this.f43513x);
        Pack.intToLittleEndian(this.f43513x, bArr, 0);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine, org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha7539-" + this.rounds;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected long getCounter() {
        return this.engineState[12] & 4294967295L;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected int getNonceSize() {
        return 12;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void resetCounter() {
        this.engineState[12] = 0;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void retreatCounter(long j11) {
        int i11 = (int) (j11 >>> 32);
        int i12 = (int) j11;
        if (i11 == 0) {
            int[] iArr = this.engineState;
            if ((iArr[12] & 4294967295L) >= (4294967295L & i12)) {
                iArr[12] = iArr[12] - i12;
                return;
            }
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        throw new IllegalStateException("attempt to reduce counter past zero.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length == 32) {
                packTauOrSigma(bArr.length, this.engineState, 0);
                Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 8);
            } else {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 256 bit key");
            }
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 13, 3);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void retreatCounter() {
        int[] iArr = this.engineState;
        if (iArr[12] != 0) {
            iArr[12] = iArr[12] - 1;
            return;
        }
        throw new IllegalStateException("attempt to reduce counter past zero.");
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i11 = iArr[12] + 1;
        iArr[12] = i11;
        if (i11 == 0) {
            throw new IllegalStateException("attempt to increase counter past 2^32.");
        }
    }
}