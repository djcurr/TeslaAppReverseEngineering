package org.spongycastle.crypto.prng;

/* loaded from: classes4.dex */
public class ReversedWindowGenerator implements RandomGenerator {
    private final RandomGenerator generator;
    private byte[] window;
    private int windowCount;

    public ReversedWindowGenerator(RandomGenerator randomGenerator, int i11) {
        if (randomGenerator == null) {
            throw new IllegalArgumentException("generator cannot be null");
        }
        if (i11 >= 2) {
            this.generator = randomGenerator;
            this.window = new byte[i11];
            return;
        }
        throw new IllegalArgumentException("windowSize must be at least 2");
    }

    private void doNextBytes(byte[] bArr, int i11, int i12) {
        synchronized (this) {
            for (int i13 = 0; i13 < i12; i13++) {
                if (this.windowCount < 1) {
                    RandomGenerator randomGenerator = this.generator;
                    byte[] bArr2 = this.window;
                    randomGenerator.nextBytes(bArr2, 0, bArr2.length);
                    this.windowCount = this.window.length;
                }
                byte[] bArr3 = this.window;
                int i14 = this.windowCount - 1;
                this.windowCount = i14;
                bArr[i13 + i11] = bArr3[i14];
            }
        }
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        synchronized (this) {
            this.windowCount = 0;
            this.generator.addSeedMaterial(bArr);
        }
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        doNextBytes(bArr, 0, bArr.length);
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i11, int i12) {
        doNextBytes(bArr, i11, i12);
    }

    @Override // org.spongycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j11) {
        synchronized (this) {
            this.windowCount = 0;
            this.generator.addSeedMaterial(j11);
        }
    }
}