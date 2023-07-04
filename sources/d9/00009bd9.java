package org.spongycastle.crypto.engines;

import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class ChaChaEngine extends Salsa20Engine {
    public ChaChaEngine() {
    }

    public static void chachaCore(int i11, int[] iArr, int[] iArr2) {
        int i12 = 16;
        if (iArr.length == 16) {
            if (iArr2.length == 16) {
                if (i11 % 2 == 0) {
                    char c11 = 0;
                    int i13 = iArr[0];
                    int i14 = iArr[1];
                    int i15 = iArr[2];
                    int i16 = iArr[3];
                    int i17 = iArr[4];
                    int i18 = iArr[5];
                    int i19 = iArr[6];
                    int i21 = 7;
                    int i22 = iArr[7];
                    int i23 = 8;
                    int i24 = iArr[8];
                    int i25 = iArr[9];
                    int i26 = iArr[10];
                    int i27 = iArr[11];
                    int i28 = 12;
                    int i29 = iArr[12];
                    int i31 = iArr[13];
                    int i32 = iArr[14];
                    int i33 = iArr[15];
                    int i34 = i32;
                    int i35 = i31;
                    int i36 = i29;
                    int i37 = i27;
                    int i38 = i26;
                    int i39 = i25;
                    int i41 = i24;
                    int i42 = i22;
                    int i43 = i19;
                    int i44 = i18;
                    int i45 = i17;
                    int i46 = i16;
                    int i47 = i15;
                    int i48 = i14;
                    int i49 = i13;
                    int i51 = i11;
                    while (i51 > 0) {
                        int i52 = i49 + i45;
                        int rotl = Salsa20Engine.rotl(i36 ^ i52, i12);
                        int i53 = i41 + rotl;
                        int rotl2 = Salsa20Engine.rotl(i45 ^ i53, i28);
                        int i54 = i52 + rotl2;
                        int rotl3 = Salsa20Engine.rotl(rotl ^ i54, i23);
                        int i55 = i53 + rotl3;
                        int rotl4 = Salsa20Engine.rotl(rotl2 ^ i55, i21);
                        int i56 = i48 + i44;
                        int rotl5 = Salsa20Engine.rotl(i35 ^ i56, i12);
                        int i57 = i39 + rotl5;
                        int rotl6 = Salsa20Engine.rotl(i44 ^ i57, i28);
                        int i58 = i56 + rotl6;
                        int rotl7 = Salsa20Engine.rotl(rotl5 ^ i58, i23);
                        int i59 = i57 + rotl7;
                        int rotl8 = Salsa20Engine.rotl(rotl6 ^ i59, i21);
                        int i61 = i47 + i43;
                        int rotl9 = Salsa20Engine.rotl(i34 ^ i61, i12);
                        int i62 = i38 + rotl9;
                        int rotl10 = Salsa20Engine.rotl(i43 ^ i62, i28);
                        int i63 = i61 + rotl10;
                        int rotl11 = Salsa20Engine.rotl(rotl9 ^ i63, i23);
                        int i64 = i62 + rotl11;
                        int rotl12 = Salsa20Engine.rotl(rotl10 ^ i64, i21);
                        int i65 = i46 + i42;
                        int rotl13 = Salsa20Engine.rotl(i33 ^ i65, 16);
                        int i66 = i37 + rotl13;
                        int rotl14 = Salsa20Engine.rotl(i42 ^ i66, i28);
                        int i67 = i65 + rotl14;
                        int rotl15 = Salsa20Engine.rotl(rotl13 ^ i67, 8);
                        int i68 = i66 + rotl15;
                        int rotl16 = Salsa20Engine.rotl(rotl14 ^ i68, 7);
                        int i69 = i54 + rotl8;
                        int rotl17 = Salsa20Engine.rotl(rotl15 ^ i69, 16);
                        int i71 = i64 + rotl17;
                        int rotl18 = Salsa20Engine.rotl(rotl8 ^ i71, 12);
                        i49 = i69 + rotl18;
                        i33 = Salsa20Engine.rotl(rotl17 ^ i49, 8);
                        i38 = i71 + i33;
                        i44 = Salsa20Engine.rotl(rotl18 ^ i38, 7);
                        int i72 = i58 + rotl12;
                        int rotl19 = Salsa20Engine.rotl(rotl3 ^ i72, 16);
                        int i73 = i68 + rotl19;
                        int rotl20 = Salsa20Engine.rotl(rotl12 ^ i73, 12);
                        i48 = i72 + rotl20;
                        i36 = Salsa20Engine.rotl(rotl19 ^ i48, 8);
                        i37 = i73 + i36;
                        i43 = Salsa20Engine.rotl(rotl20 ^ i37, 7);
                        int i74 = i63 + rotl16;
                        int rotl21 = Salsa20Engine.rotl(rotl7 ^ i74, 16);
                        int i75 = i55 + rotl21;
                        int rotl22 = Salsa20Engine.rotl(rotl16 ^ i75, 12);
                        i47 = i74 + rotl22;
                        i35 = Salsa20Engine.rotl(rotl21 ^ i47, 8);
                        i41 = i75 + i35;
                        i42 = Salsa20Engine.rotl(rotl22 ^ i41, 7);
                        int i76 = i67 + rotl4;
                        i12 = 16;
                        int rotl23 = Salsa20Engine.rotl(rotl11 ^ i76, 16);
                        int i77 = i59 + rotl23;
                        int rotl24 = Salsa20Engine.rotl(rotl4 ^ i77, 12);
                        i46 = i76 + rotl24;
                        i34 = Salsa20Engine.rotl(rotl23 ^ i46, 8);
                        i39 = i77 + i34;
                        i45 = Salsa20Engine.rotl(rotl24 ^ i39, 7);
                        i51 -= 2;
                        c11 = 0;
                        i28 = 12;
                        i23 = 8;
                        i21 = 7;
                    }
                    iArr2[c11] = i49 + iArr[c11];
                    iArr2[1] = i48 + iArr[1];
                    iArr2[2] = i47 + iArr[2];
                    iArr2[3] = i46 + iArr[3];
                    iArr2[4] = i45 + iArr[4];
                    iArr2[5] = i44 + iArr[5];
                    iArr2[6] = i43 + iArr[6];
                    iArr2[7] = i42 + iArr[7];
                    iArr2[8] = i41 + iArr[8];
                    iArr2[9] = i39 + iArr[9];
                    iArr2[10] = i38 + iArr[10];
                    iArr2[11] = i37 + iArr[11];
                    iArr2[12] = i36 + iArr[12];
                    iArr2[13] = i35 + iArr[13];
                    iArr2[14] = i34 + iArr[14];
                    iArr2[15] = i33 + iArr[15];
                    return;
                }
                throw new IllegalArgumentException("Number of rounds must be even");
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void advanceCounter(long j11) {
        int i11 = (int) (j11 >>> 32);
        int i12 = (int) j11;
        if (i11 > 0) {
            int[] iArr = this.engineState;
            iArr[13] = iArr[13] + i11;
        }
        int[] iArr2 = this.engineState;
        int i13 = iArr2[12];
        iArr2[12] = iArr2[12] + i12;
        if (i13 == 0 || iArr2[12] >= i13) {
            return;
        }
        iArr2[13] = iArr2[13] + 1;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void generateKeyStream(byte[] bArr) {
        chachaCore(this.rounds, this.engineState, this.f43513x);
        Pack.intToLittleEndian(this.f43513x, bArr, 0);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine, org.spongycastle.crypto.StreamCipher
    public String getAlgorithmName() {
        return "ChaCha" + this.rounds;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected long getCounter() {
        int[] iArr = this.engineState;
        return (iArr[13] << 32) | (iArr[12] & 4294967295L);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void resetCounter() {
        int[] iArr = this.engineState;
        iArr[13] = 0;
        iArr[12] = 0;
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void retreatCounter(long j11) {
        int i11 = (int) (j11 >>> 32);
        int i12 = (int) j11;
        if (i11 != 0) {
            int[] iArr = this.engineState;
            if ((iArr[13] & 4294967295L) >= (i11 & 4294967295L)) {
                iArr[13] = iArr[13] - i11;
            } else {
                throw new IllegalStateException("attempt to reduce counter past zero.");
            }
        }
        int[] iArr2 = this.engineState;
        if ((iArr2[12] & 4294967295L) >= (4294967295L & i12)) {
            iArr2[12] = iArr2[12] - i12;
        } else if (iArr2[13] != 0) {
            iArr2[13] = iArr2[13] - 1;
            iArr2[12] = iArr2[12] - i12;
        } else {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    public void setKey(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            if (bArr.length != 16 && bArr.length != 32) {
                throw new IllegalArgumentException(getAlgorithmName() + " requires 128 bit or 256 bit key");
            }
            packTauOrSigma(bArr.length, this.engineState, 0);
            Pack.littleEndianToInt(bArr, 0, this.engineState, 4, 4);
            Pack.littleEndianToInt(bArr, bArr.length - 16, this.engineState, 8, 4);
        }
        Pack.littleEndianToInt(bArr2, 0, this.engineState, 14, 2);
    }

    public ChaChaEngine(int i11) {
        super(i11);
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void advanceCounter() {
        int[] iArr = this.engineState;
        int i11 = iArr[12] + 1;
        iArr[12] = i11;
        if (i11 == 0) {
            iArr[13] = iArr[13] + 1;
        }
    }

    @Override // org.spongycastle.crypto.engines.Salsa20Engine
    protected void retreatCounter() {
        int[] iArr = this.engineState;
        if (iArr[12] == 0 && iArr[13] == 0) {
            throw new IllegalStateException("attempt to reduce counter past zero.");
        }
        int i11 = iArr[12] - 1;
        iArr[12] = i11;
        if (i11 == -1) {
            iArr[13] = iArr[13] - 1;
        }
    }
}