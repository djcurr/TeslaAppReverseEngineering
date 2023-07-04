package org.spongycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class Tables8kGCMMultiplier implements GCMMultiplier {
    private byte[] H;
    private int[][][] M;

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.M == null) {
            this.M = (int[][][]) Array.newInstance(int.class, 32, 16, 4);
        } else if (Arrays.areEqual(this.H, bArr)) {
            return;
        }
        this.H = Arrays.clone(bArr);
        GCMUtil.asInts(bArr, this.M[1][8]);
        for (int i11 = 4; i11 >= 1; i11 >>= 1) {
            int[][][] iArr = this.M;
            GCMUtil.multiplyP(iArr[1][i11 + i11], iArr[1][i11]);
        }
        int[][][] iArr2 = this.M;
        int i12 = 0;
        GCMUtil.multiplyP(iArr2[1][1], iArr2[0][8]);
        for (int i13 = 4; i13 >= 1; i13 >>= 1) {
            int[][][] iArr3 = this.M;
            GCMUtil.multiplyP(iArr3[0][i13 + i13], iArr3[0][i13]);
        }
        while (true) {
            for (int i14 = 2; i14 < 16; i14 += i14) {
                for (int i15 = 1; i15 < i14; i15++) {
                    int[][][] iArr4 = this.M;
                    GCMUtil.xor(iArr4[i12][i14], iArr4[i12][i15], iArr4[i12][i14 + i15]);
                }
            }
            i12++;
            if (i12 == 32) {
                return;
            }
            if (i12 > 1) {
                for (int i16 = 8; i16 > 0; i16 >>= 1) {
                    int[][][] iArr5 = this.M;
                    GCMUtil.multiplyP8(iArr5[i12 - 2][i16], iArr5[i12][i16]);
                }
            }
        }
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        int[] iArr = new int[4];
        for (int i11 = 15; i11 >= 0; i11--) {
            int[][][] iArr2 = this.M;
            int i12 = i11 + i11;
            int[] iArr3 = iArr2[i12][bArr[i11] & 15];
            iArr[0] = iArr[0] ^ iArr3[0];
            iArr[1] = iArr[1] ^ iArr3[1];
            iArr[2] = iArr[2] ^ iArr3[2];
            iArr[3] = iArr3[3] ^ iArr[3];
            int[] iArr4 = iArr2[i12 + 1][(bArr[i11] & 240) >>> 4];
            iArr[0] = iArr[0] ^ iArr4[0];
            iArr[1] = iArr[1] ^ iArr4[1];
            iArr[2] = iArr[2] ^ iArr4[2];
            iArr[3] = iArr[3] ^ iArr4[3];
        }
        Pack.intToBigEndian(iArr, bArr, 0);
    }
}