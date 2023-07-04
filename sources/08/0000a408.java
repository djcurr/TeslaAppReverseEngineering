package org.spongycastle.pqc.crypto.sphincs;

import okhttp3.internal.http2.Settings;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
class Horst {
    static final int HORST_K = 32;
    static final int HORST_LOGT = 16;
    static final int HORST_SIGBYTES = 13312;
    static final int HORST_SKBYTES = 32;
    static final int HORST_T = 65536;
    static final int N_MASKS = 32;

    static void expand_seed(byte[] bArr, byte[] bArr2) {
        Seed.prg(bArr, 0, 2097152L, bArr2, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int horst_sign(HashFunctions hashFunctions, byte[] bArr, int i11, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        byte[] bArr6 = new byte[PKIFailureInfo.badSenderNonce];
        byte[] bArr7 = new byte[4194272];
        expand_seed(bArr6, bArr3);
        for (int i12 = 0; i12 < 65536; i12++) {
            hashFunctions.hash_n_n(bArr7, (Settings.DEFAULT_INITIAL_WINDOW_SIZE + i12) * 32, bArr6, i12 * 32);
        }
        for (int i13 = 0; i13 < 16; i13++) {
            int i14 = 16 - i13;
            long j11 = (1 << i14) - 1;
            int i15 = 1 << (i14 - 1);
            long j12 = i15 - 1;
            int i16 = 0;
            while (i16 < i15) {
                hashFunctions.hash_2n_n_mask(bArr7, (int) ((i16 + j12) * 32), bArr7, (int) (((i16 * 2) + j11) * 32), bArr4, i13 * 2 * 32);
                i16++;
                i15 = i15;
                j12 = j12;
            }
        }
        int i17 = 2016;
        int i18 = i11;
        while (i17 < 4064) {
            bArr[i18] = bArr7[i17];
            i17++;
            i18++;
        }
        for (int i19 = 0; i19 < 32; i19++) {
            int i21 = i19 * 2;
            int i22 = (bArr5[i21] & 255) + ((bArr5[i21 + 1] & 255) << 8);
            int i23 = 0;
            while (i23 < 32) {
                bArr[i18] = bArr6[(i22 * 32) + i23];
                i23++;
                i18++;
            }
            int i24 = i22 + Settings.DEFAULT_INITIAL_WINDOW_SIZE;
            for (int i25 = 0; i25 < 10; i25++) {
                int i26 = (i24 & 1) != 0 ? i24 + 1 : i24 - 1;
                int i27 = 0;
                while (i27 < 32) {
                    bArr[i18] = bArr7[(i26 * 32) + i27];
                    i27++;
                    i18++;
                }
                i24 = (i26 - 1) / 2;
            }
        }
        for (int i28 = 0; i28 < 32; i28++) {
            bArr2[i28] = bArr7[i28];
        }
        return HORST_SIGBYTES;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int horst_verify(HashFunctions hashFunctions, byte[] bArr, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4) {
        int i12;
        byte[] bArr5 = new byte[1024];
        int i13 = i11 + 2048;
        int i14 = 0;
        while (i14 < 32) {
            int i15 = i14 * 2;
            int i16 = (bArr4[i15] & 255) + ((bArr4[i15 + 1] & 255) << 8);
            if ((i16 & 1) == 0) {
                hashFunctions.hash_n_n(bArr5, 0, bArr2, i13);
                for (int i17 = 0; i17 < 32; i17++) {
                    bArr5[i17 + 32] = bArr2[i13 + 32 + i17];
                }
            } else {
                hashFunctions.hash_n_n(bArr5, 32, bArr2, i13);
                for (int i18 = 0; i18 < 32; i18++) {
                    bArr5[i18] = bArr2[i13 + 32 + i18];
                }
            }
            int i19 = i13 + 64;
            int i21 = 1;
            while (i21 < 10) {
                int i22 = i16 >>> 1;
                if ((i22 & 1) == 0) {
                    i12 = i21;
                    hashFunctions.hash_2n_n_mask(bArr5, 0, bArr5, 0, bArr3, (i21 - 1) * 2 * 32);
                    for (int i23 = 0; i23 < 32; i23++) {
                        bArr5[i23 + 32] = bArr2[i19 + i23];
                    }
                } else {
                    i12 = i21;
                    hashFunctions.hash_2n_n_mask(bArr5, 32, bArr5, 0, bArr3, (i12 - 1) * 2 * 32);
                    for (int i24 = 0; i24 < 32; i24++) {
                        bArr5[i24] = bArr2[i19 + i24];
                    }
                }
                i19 += 32;
                i21 = i12 + 1;
                i16 = i22;
            }
            int i25 = i16 >>> 1;
            hashFunctions.hash_2n_n_mask(bArr5, 0, bArr5, 0, bArr3, 576);
            for (int i26 = 0; i26 < 32; i26++) {
                if (bArr2[(i25 * 32) + i11 + i26] != bArr5[i26]) {
                    for (int i27 = 0; i27 < 32; i27++) {
                        bArr[i27] = 0;
                    }
                    return -1;
                }
            }
            i14++;
            i13 = i19;
        }
        for (int i28 = 0; i28 < 32; i28++) {
            hashFunctions.hash_2n_n_mask(bArr5, i28 * 32, bArr2, i11 + (i28 * 2 * 32), bArr3, 640);
        }
        for (int i29 = 0; i29 < 16; i29++) {
            hashFunctions.hash_2n_n_mask(bArr5, i29 * 32, bArr5, i29 * 2 * 32, bArr3, 704);
        }
        for (int i31 = 0; i31 < 8; i31++) {
            hashFunctions.hash_2n_n_mask(bArr5, i31 * 32, bArr5, i31 * 2 * 32, bArr3, 768);
        }
        for (int i32 = 0; i32 < 4; i32++) {
            hashFunctions.hash_2n_n_mask(bArr5, i32 * 32, bArr5, i32 * 2 * 32, bArr3, 832);
        }
        for (int i33 = 0; i33 < 2; i33++) {
            hashFunctions.hash_2n_n_mask(bArr5, i33 * 32, bArr5, i33 * 2 * 32, bArr3, 896);
        }
        hashFunctions.hash_2n_n_mask(bArr, 0, bArr5, 0, bArr3, 960);
        return 0;
    }
}