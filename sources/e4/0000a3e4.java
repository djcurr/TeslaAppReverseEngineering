package org.spongycastle.pqc.crypto.newhope;

import org.spongycastle.crypto.digests.SHAKEDigest;
import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
class Poly {
    Poly() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void add(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i11 = 0; i11 < 1024; i11++) {
            sArr3[i11] = Reduce.barrett((short) (sArr[i11] + sArr2[i11]));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void fromBytes(short[] sArr, byte[] bArr) {
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = i11 * 7;
            int i13 = bArr[i12 + 1] & 255;
            int i14 = bArr[i12 + 3] & 255;
            int i15 = bArr[i12 + 5] & 255;
            int i16 = i11 * 4;
            sArr[i16 + 0] = (short) ((bArr[i12 + 0] & 255) | ((i13 & 63) << 8));
            sArr[i16 + 1] = (short) ((i13 >>> 6) | ((bArr[i12 + 2] & 255) << 2) | ((i14 & 15) << 10));
            sArr[i16 + 2] = (short) ((i14 >>> 4) | ((bArr[i12 + 4] & 255) << 4) | ((i15 & 3) << 12));
            sArr[i16 + 3] = (short) (((bArr[i12 + 6] & 255) << 6) | (i15 >>> 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void fromNTT(short[] sArr) {
        NTT.bitReverse(sArr);
        NTT.core(sArr, Precomp.OMEGAS_INV_MONTGOMERY);
        NTT.mulCoefficients(sArr, Precomp.PSIS_INV_MONTGOMERY);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void getNoise(short[] sArr, byte[] bArr, byte b11) {
        byte[] bArr2 = new byte[8];
        bArr2[0] = b11;
        byte[] bArr3 = new byte[4096];
        ChaCha20.process(bArr, bArr2, bArr3, 0, 4096);
        for (int i11 = 0; i11 < 1024; i11++) {
            int bigEndianToInt = Pack.bigEndianToInt(bArr3, i11 * 4);
            int i12 = 0;
            for (int i13 = 0; i13 < 8; i13++) {
                i12 += (bigEndianToInt >> i13) & 16843009;
            }
            sArr[i11] = (short) (((((i12 >>> 24) + (i12 >>> 0)) & 255) + 12289) - (((i12 >>> 16) + (i12 >>> 8)) & 255));
        }
    }

    private static short normalize(short s11) {
        short barrett = Reduce.barrett(s11);
        int i11 = barrett - 12289;
        return (short) (((barrett ^ i11) & (i11 >> 31)) ^ i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void pointWise(short[] sArr, short[] sArr2, short[] sArr3) {
        for (int i11 = 0; i11 < 1024; i11++) {
            sArr3[i11] = Reduce.montgomery((sArr[i11] & 65535) * (65535 & Reduce.montgomery((sArr2[i11] & 65535) * 3186)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void toBytes(byte[] bArr, short[] sArr) {
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = i11 * 4;
            short normalize = normalize(sArr[i12 + 0]);
            short normalize2 = normalize(sArr[i12 + 1]);
            short normalize3 = normalize(sArr[i12 + 2]);
            short normalize4 = normalize(sArr[i12 + 3]);
            int i13 = i11 * 7;
            bArr[i13 + 0] = (byte) normalize;
            bArr[i13 + 1] = (byte) ((normalize >> 8) | (normalize2 << 6));
            bArr[i13 + 2] = (byte) (normalize2 >> 2);
            bArr[i13 + 3] = (byte) ((normalize2 >> 10) | (normalize3 << 4));
            bArr[i13 + 4] = (byte) (normalize3 >> 4);
            bArr[i13 + 5] = (byte) ((normalize3 >> 12) | (normalize4 << 2));
            bArr[i13 + 6] = (byte) (normalize4 >> 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void toNTT(short[] sArr) {
        NTT.mulCoefficients(sArr, Precomp.PSIS_BITREV_MONTGOMERY);
        NTT.core(sArr, Precomp.OMEGAS_MONTGOMERY);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void uniform(short[] sArr, byte[] bArr) {
        SHAKEDigest sHAKEDigest = new SHAKEDigest(128);
        sHAKEDigest.update(bArr, 0, bArr.length);
        int i11 = 0;
        while (true) {
            byte[] bArr2 = new byte[256];
            sHAKEDigest.doOutput(bArr2, 0, 256);
            for (int i12 = 0; i12 < 256; i12 += 2) {
                int i13 = ((bArr2[i12] & 255) | ((bArr2[i12 + 1] & 255) << 8)) & 16383;
                if (i13 < 12289) {
                    int i14 = i11 + 1;
                    sArr[i11] = (short) i13;
                    if (i14 == 1024) {
                        return;
                    }
                    i11 = i14;
                }
            }
        }
    }
}