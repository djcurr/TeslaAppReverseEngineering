package org.spongycastle.crypto.modes.gcm;

import java.lang.reflect.Array;
import org.spongycastle.util.Arrays;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public class Tables64kGCMMultiplier implements GCMMultiplier {
    private byte[] H;
    private int[][][] M;

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void init(byte[] bArr) {
        if (this.M == null) {
            this.M = (int[][][]) Array.newInstance(int.class, 16, 256, 4);
        } else if (Arrays.areEqual(this.H, bArr)) {
            return;
        }
        this.H = Arrays.clone(bArr);
        int i11 = 0;
        GCMUtil.asInts(bArr, this.M[0][128]);
        for (int i12 = 64; i12 >= 1; i12 >>= 1) {
            int[][][] iArr = this.M;
            GCMUtil.multiplyP(iArr[0][i12 + i12], iArr[0][i12]);
        }
        while (true) {
            for (int i13 = 2; i13 < 256; i13 += i13) {
                for (int i14 = 1; i14 < i13; i14++) {
                    int[][][] iArr2 = this.M;
                    GCMUtil.xor(iArr2[i11][i13], iArr2[i11][i14], iArr2[i11][i13 + i14]);
                }
            }
            i11++;
            if (i11 == 16) {
                return;
            }
            for (int i15 = 128; i15 > 0; i15 >>= 1) {
                int[][][] iArr3 = this.M;
                GCMUtil.multiplyP8(iArr3[i11 - 1][i15], iArr3[i11][i15]);
            }
        }
    }

    @Override // org.spongycastle.crypto.modes.gcm.GCMMultiplier
    public void multiplyH(byte[] bArr) {
        int[] iArr = new int[4];
        for (int i11 = 15; i11 >= 0; i11--) {
            int[] iArr2 = this.M[i11][bArr[i11] & 255];
            iArr[0] = iArr[0] ^ iArr2[0];
            iArr[1] = iArr[1] ^ iArr2[1];
            iArr[2] = iArr[2] ^ iArr2[2];
            iArr[3] = iArr2[3] ^ iArr[3];
        }
        Pack.intToBigEndian(iArr, bArr, 0);
    }
}