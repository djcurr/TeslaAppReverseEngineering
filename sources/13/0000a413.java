package org.spongycastle.pqc.crypto.sphincs;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class Wots {
    static final int WOTS_L = 67;
    static final int WOTS_L1 = 64;
    static final int WOTS_LOGW = 4;
    static final int WOTS_LOG_L = 7;
    static final int WOTS_SIGBYTES = 2144;
    static final int WOTS_W = 16;

    private static void clear(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 != i12; i13++) {
            bArr[i13 + i11] = 0;
        }
    }

    static void expand_seed(byte[] bArr, int i11, byte[] bArr2, int i12) {
        clear(bArr, i11, WOTS_SIGBYTES);
        Seed.prg(bArr, i11, 2144L, bArr2, i12);
    }

    static void gen_chain(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13, int i14) {
        for (int i15 = 0; i15 < 32; i15++) {
            bArr[i15 + i11] = bArr2[i15 + i12];
        }
        for (int i16 = 0; i16 < i14 && i16 < 16; i16++) {
            hashFunctions.hash_n_n_mask(bArr, i11, bArr, i11, bArr3, i13 + (i16 * 32));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void wots_pkgen(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, int i12, byte[] bArr3, int i13) {
        expand_seed(bArr, i11, bArr2, i12);
        for (int i14 = 0; i14 < 67; i14++) {
            int i15 = i11 + (i14 * 32);
            gen_chain(hashFunctions, bArr, i15, bArr, i15, bArr3, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void wots_sign(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i12 = 0;
        int i13 = 0;
        while (i12 < 64) {
            int i14 = i12 / 2;
            iArr[i12] = bArr2[i14] & 15;
            int i15 = i12 + 1;
            iArr[i15] = (bArr2[i14] & 255) >>> 4;
            i13 = i13 + (15 - iArr[i12]) + (15 - iArr[i15]);
            i12 += 2;
        }
        while (i12 < 67) {
            iArr[i12] = i13 & 15;
            i13 >>>= 4;
            i12++;
        }
        expand_seed(bArr, i11, bArr3, 0);
        for (int i16 = 0; i16 < 67; i16++) {
            int i17 = i11 + (i16 * 32);
            gen_chain(hashFunctions, bArr, i17, bArr, i17, bArr4, 0, iArr[i16]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void wots_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4) {
        int[] iArr = new int[67];
        int i12 = 0;
        int i13 = 0;
        while (i12 < 64) {
            int i14 = i12 / 2;
            iArr[i12] = bArr3[i14] & 15;
            int i15 = i12 + 1;
            iArr[i15] = (bArr3[i14] & 255) >>> 4;
            i13 = i13 + (15 - iArr[i12]) + (15 - iArr[i15]);
            i12 += 2;
        }
        while (i12 < 67) {
            iArr[i12] = i13 & 15;
            i13 >>>= 4;
            i12++;
        }
        for (int i16 = 0; i16 < 67; i16++) {
            int i17 = i16 * 32;
            gen_chain(hashFunctions, bArr, i17, bArr2, i11 + i17, bArr4, iArr[i16] * 32, 15 - iArr[i16]);
        }
    }
}