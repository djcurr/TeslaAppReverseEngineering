package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class SipHash implements Mac {

    /* renamed from: c  reason: collision with root package name */
    protected final int f43550c;

    /* renamed from: d  reason: collision with root package name */
    protected final int f43551d;

    /* renamed from: k0  reason: collision with root package name */
    protected long f43552k0;

    /* renamed from: k1  reason: collision with root package name */
    protected long f43553k1;

    /* renamed from: m  reason: collision with root package name */
    protected long f43554m;

    /* renamed from: v0  reason: collision with root package name */
    protected long f43555v0;

    /* renamed from: v1  reason: collision with root package name */
    protected long f43556v1;

    /* renamed from: v2  reason: collision with root package name */
    protected long f43557v2;

    /* renamed from: v3  reason: collision with root package name */
    protected long f43558v3;
    protected int wordCount;
    protected int wordPos;

    public SipHash() {
        this.f43554m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f43550c = 2;
        this.f43551d = 4;
    }

    protected static long rotateLeft(long j11, int i11) {
        return (j11 >>> (-i11)) | (j11 << i11);
    }

    protected void applySipRounds(int i11) {
        long j11 = this.f43555v0;
        long j12 = this.f43556v1;
        long j13 = this.f43557v2;
        long j14 = this.f43558v3;
        for (int i12 = 0; i12 < i11; i12++) {
            long j15 = j11 + j12;
            long j16 = j13 + j14;
            long rotateLeft = rotateLeft(j12, 13) ^ j15;
            long rotateLeft2 = rotateLeft(j14, 16) ^ j16;
            long j17 = j16 + rotateLeft;
            j11 = rotateLeft(j15, 32) + rotateLeft2;
            j12 = rotateLeft(rotateLeft, 17) ^ j17;
            j14 = rotateLeft(rotateLeft2, 21) ^ j11;
            j13 = rotateLeft(j17, 32);
        }
        this.f43555v0 = j11;
        this.f43556v1 = j12;
        this.f43557v2 = j13;
        this.f43558v3 = j14;
    }

    public long doFinal() {
        int i11;
        long j11 = this.f43554m >>> ((7 - this.wordPos) << 3);
        this.f43554m = j11;
        long j12 = j11 >>> 8;
        this.f43554m = j12;
        this.f43554m = j12 | ((((this.wordCount << 3) + i11) & 255) << 56);
        processMessageWord();
        this.f43557v2 ^= 255;
        applySipRounds(this.f43551d);
        long j13 = ((this.f43555v0 ^ this.f43556v1) ^ this.f43557v2) ^ this.f43558v3;
        reset();
        return j13;
    }

    @Override // org.spongycastle.crypto.Mac
    public String getAlgorithmName() {
        return "SipHash-" + this.f43550c + "-" + this.f43551d;
    }

    @Override // org.spongycastle.crypto.Mac
    public int getMacSize() {
        return 8;
    }

    @Override // org.spongycastle.crypto.Mac
    public void init(CipherParameters cipherParameters) {
        if (cipherParameters instanceof KeyParameter) {
            byte[] key = ((KeyParameter) cipherParameters).getKey();
            if (key.length == 16) {
                this.f43552k0 = Pack.littleEndianToLong(key, 0);
                this.f43553k1 = Pack.littleEndianToLong(key, 8);
                reset();
                return;
            }
            throw new IllegalArgumentException("'params' must be a 128-bit key");
        }
        throw new IllegalArgumentException("'params' must be an instance of KeyParameter");
    }

    protected void processMessageWord() {
        this.wordCount++;
        this.f43558v3 ^= this.f43554m;
        applySipRounds(this.f43550c);
        this.f43555v0 ^= this.f43554m;
    }

    @Override // org.spongycastle.crypto.Mac
    public void reset() {
        long j11 = this.f43552k0;
        this.f43555v0 = 8317987319222330741L ^ j11;
        long j12 = this.f43553k1;
        this.f43556v1 = 7237128888997146477L ^ j12;
        this.f43557v2 = j11 ^ 7816392313619706465L;
        this.f43558v3 = 8387220255154660723L ^ j12;
        this.f43554m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte b11) {
        long j11 = this.f43554m >>> 8;
        this.f43554m = j11;
        this.f43554m = j11 | ((b11 & 255) << 56);
        int i11 = this.wordPos + 1;
        this.wordPos = i11;
        if (i11 == 8) {
            processMessageWord();
            this.wordPos = 0;
        }
    }

    @Override // org.spongycastle.crypto.Mac
    public void update(byte[] bArr, int i11, int i12) {
        int i13 = i12 & (-8);
        int i14 = this.wordPos;
        int i15 = 0;
        if (i14 == 0) {
            while (i15 < i13) {
                this.f43554m = Pack.littleEndianToLong(bArr, i11 + i15);
                processMessageWord();
                i15 += 8;
            }
            while (i15 < i12) {
                long j11 = this.f43554m >>> 8;
                this.f43554m = j11;
                this.f43554m = j11 | ((bArr[i11 + i15] & 255) << 56);
                i15++;
            }
            this.wordPos = i12 - i13;
            return;
        }
        int i16 = i14 << 3;
        int i17 = 0;
        while (i17 < i13) {
            long littleEndianToLong = Pack.littleEndianToLong(bArr, i11 + i17);
            this.f43554m = (this.f43554m >>> (-i16)) | (littleEndianToLong << i16);
            processMessageWord();
            this.f43554m = littleEndianToLong;
            i17 += 8;
        }
        while (i17 < i12) {
            long j12 = this.f43554m >>> 8;
            this.f43554m = j12;
            this.f43554m = j12 | ((bArr[i11 + i17] & 255) << 56);
            int i18 = this.wordPos + 1;
            this.wordPos = i18;
            if (i18 == 8) {
                processMessageWord();
                this.wordPos = 0;
            }
            i17++;
        }
    }

    public SipHash(int i11, int i12) {
        this.f43554m = 0L;
        this.wordPos = 0;
        this.wordCount = 0;
        this.f43550c = i11;
        this.f43551d = i12;
    }

    @Override // org.spongycastle.crypto.Mac
    public int doFinal(byte[] bArr, int i11) {
        Pack.longToLittleEndian(doFinal(), bArr, i11);
        return 8;
    }
}