package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.TweakableBlockCipherParameters;

/* loaded from: classes4.dex */
public class ThreefishEngine implements BlockCipher {
    public static final int BLOCKSIZE_1024 = 1024;
    public static final int BLOCKSIZE_256 = 256;
    public static final int BLOCKSIZE_512 = 512;
    private static final long C_240 = 2004413935125273122L;
    private static final int MAX_ROUNDS = 80;
    private static int[] MOD17 = null;
    private static int[] MOD3 = null;
    private static int[] MOD5 = null;
    private static int[] MOD9 = null;
    private static final int ROUNDS_1024 = 80;
    private static final int ROUNDS_256 = 72;
    private static final int ROUNDS_512 = 72;
    private static final int TWEAK_SIZE_BYTES = 16;
    private static final int TWEAK_SIZE_WORDS = 2;
    private int blocksizeBytes;
    private int blocksizeWords;
    private ThreefishCipher cipher;
    private long[] currentBlock;
    private boolean forEncryption;

    /* renamed from: kw  reason: collision with root package name */
    private long[] f43514kw;

    /* renamed from: t  reason: collision with root package name */
    private long[] f43515t;

    /* loaded from: classes4.dex */
    private static final class Threefish1024Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 24;
        private static final int ROTATION_0_1 = 13;
        private static final int ROTATION_0_2 = 8;
        private static final int ROTATION_0_3 = 47;
        private static final int ROTATION_0_4 = 8;
        private static final int ROTATION_0_5 = 17;
        private static final int ROTATION_0_6 = 22;
        private static final int ROTATION_0_7 = 37;
        private static final int ROTATION_1_0 = 38;
        private static final int ROTATION_1_1 = 19;
        private static final int ROTATION_1_2 = 10;
        private static final int ROTATION_1_3 = 55;
        private static final int ROTATION_1_4 = 49;
        private static final int ROTATION_1_5 = 18;
        private static final int ROTATION_1_6 = 23;
        private static final int ROTATION_1_7 = 52;
        private static final int ROTATION_2_0 = 33;
        private static final int ROTATION_2_1 = 4;
        private static final int ROTATION_2_2 = 51;
        private static final int ROTATION_2_3 = 13;
        private static final int ROTATION_2_4 = 34;
        private static final int ROTATION_2_5 = 41;
        private static final int ROTATION_2_6 = 59;
        private static final int ROTATION_2_7 = 17;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 20;
        private static final int ROTATION_3_2 = 48;
        private static final int ROTATION_3_3 = 41;
        private static final int ROTATION_3_4 = 47;
        private static final int ROTATION_3_5 = 28;
        private static final int ROTATION_3_6 = 16;
        private static final int ROTATION_3_7 = 25;
        private static final int ROTATION_4_0 = 41;
        private static final int ROTATION_4_1 = 9;
        private static final int ROTATION_4_2 = 37;
        private static final int ROTATION_4_3 = 31;
        private static final int ROTATION_4_4 = 12;
        private static final int ROTATION_4_5 = 47;
        private static final int ROTATION_4_6 = 44;
        private static final int ROTATION_4_7 = 30;
        private static final int ROTATION_5_0 = 16;
        private static final int ROTATION_5_1 = 34;
        private static final int ROTATION_5_2 = 56;
        private static final int ROTATION_5_3 = 51;
        private static final int ROTATION_5_4 = 4;
        private static final int ROTATION_5_5 = 53;
        private static final int ROTATION_5_6 = 42;
        private static final int ROTATION_5_7 = 41;
        private static final int ROTATION_6_0 = 31;
        private static final int ROTATION_6_1 = 44;
        private static final int ROTATION_6_2 = 47;
        private static final int ROTATION_6_3 = 46;
        private static final int ROTATION_6_4 = 19;
        private static final int ROTATION_6_5 = 42;
        private static final int ROTATION_6_6 = 44;
        private static final int ROTATION_6_7 = 25;
        private static final int ROTATION_7_0 = 9;
        private static final int ROTATION_7_1 = 48;
        private static final int ROTATION_7_2 = 35;
        private static final int ROTATION_7_3 = 52;
        private static final int ROTATION_7_4 = 23;
        private static final int ROTATION_7_5 = 31;
        private static final int ROTATION_7_6 = 37;
        private static final int ROTATION_7_7 = 20;

        public Threefish1024Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f43516kw;
            long[] jArr4 = this.f43517t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length == 33) {
                if (jArr4.length == 5) {
                    long j11 = jArr[0];
                    int i11 = 1;
                    long j12 = jArr[1];
                    long j13 = jArr[2];
                    long j14 = jArr[3];
                    long j15 = jArr[4];
                    long j16 = jArr[5];
                    long j17 = jArr[6];
                    long j18 = jArr[7];
                    long j19 = jArr[8];
                    long j21 = jArr[9];
                    long j22 = jArr[10];
                    long j23 = jArr[11];
                    long j24 = jArr[12];
                    long j25 = jArr[13];
                    long j26 = jArr[14];
                    long j27 = jArr[15];
                    int i12 = 19;
                    while (i12 >= i11) {
                        int i13 = iArr[i12];
                        int i14 = iArr2[i12];
                        int i15 = i13 + 1;
                        long j28 = j11 - jArr3[i15];
                        int i16 = i13 + 2;
                        long j29 = j12 - jArr3[i16];
                        int i17 = i13 + 3;
                        long j31 = j13 - jArr3[i17];
                        int i18 = i13 + 4;
                        long j32 = j14 - jArr3[i18];
                        int i19 = i13 + 5;
                        long j33 = j15 - jArr3[i19];
                        int i21 = i13 + 6;
                        int[] iArr3 = iArr;
                        int[] iArr4 = iArr2;
                        long j34 = j16 - jArr3[i21];
                        int i22 = i13 + 7;
                        long j35 = j17 - jArr3[i22];
                        int i23 = i13 + 8;
                        long j36 = j18 - jArr3[i23];
                        int i24 = i13 + 9;
                        long j37 = j19 - jArr3[i24];
                        int i25 = i13 + 10;
                        long j38 = j21 - jArr3[i25];
                        int i26 = i13 + 11;
                        long j39 = j22 - jArr3[i26];
                        int i27 = i13 + 12;
                        long j41 = j23 - jArr3[i27];
                        int i28 = i13 + 13;
                        long j42 = j24 - jArr3[i28];
                        int i29 = i13 + 14;
                        int i31 = i14 + 1;
                        long j43 = j25 - (jArr3[i29] + jArr4[i31]);
                        int i32 = i13 + 15;
                        long j44 = j26 - (jArr3[i32] + jArr4[i14 + 2]);
                        long[] jArr5 = jArr3;
                        long j45 = i12;
                        long xorRotr = ThreefishEngine.xorRotr(j27 - ((jArr3[i13 + 16] + j45) + 1), 9, j28);
                        long j46 = j28 - xorRotr;
                        long xorRotr2 = ThreefishEngine.xorRotr(j41, 48, j31);
                        long j47 = j31 - xorRotr2;
                        long xorRotr3 = ThreefishEngine.xorRotr(j43, 35, j35);
                        long j48 = j35 - xorRotr3;
                        long[] jArr6 = jArr4;
                        long xorRotr4 = ThreefishEngine.xorRotr(j38, 52, j33);
                        long j49 = j33 - xorRotr4;
                        long xorRotr5 = ThreefishEngine.xorRotr(j29, 23, j44);
                        long j51 = j44 - xorRotr5;
                        long xorRotr6 = ThreefishEngine.xorRotr(j34, 31, j37);
                        long j52 = j37 - xorRotr6;
                        long xorRotr7 = ThreefishEngine.xorRotr(j32, 37, j39);
                        long j53 = j39 - xorRotr7;
                        long xorRotr8 = ThreefishEngine.xorRotr(j36, 20, j42);
                        long j54 = j42 - xorRotr8;
                        long xorRotr9 = ThreefishEngine.xorRotr(xorRotr8, 31, j46);
                        long j55 = j46 - xorRotr9;
                        long xorRotr10 = ThreefishEngine.xorRotr(xorRotr6, 44, j47);
                        long j56 = j47 - xorRotr10;
                        long xorRotr11 = ThreefishEngine.xorRotr(xorRotr7, 47, j49);
                        long j57 = j49 - xorRotr11;
                        long xorRotr12 = ThreefishEngine.xorRotr(xorRotr5, 46, j48);
                        long j58 = j48 - xorRotr12;
                        long xorRotr13 = ThreefishEngine.xorRotr(xorRotr, 19, j54);
                        long j59 = j54 - xorRotr13;
                        long xorRotr14 = ThreefishEngine.xorRotr(xorRotr3, 42, j51);
                        long j61 = j51 - xorRotr14;
                        long xorRotr15 = ThreefishEngine.xorRotr(xorRotr2, 44, j52);
                        long j62 = j52 - xorRotr15;
                        long xorRotr16 = ThreefishEngine.xorRotr(xorRotr4, 25, j53);
                        long j63 = j53 - xorRotr16;
                        long xorRotr17 = ThreefishEngine.xorRotr(xorRotr16, 16, j55);
                        long j64 = j55 - xorRotr17;
                        long xorRotr18 = ThreefishEngine.xorRotr(xorRotr14, 34, j56);
                        long j65 = j56 - xorRotr18;
                        long xorRotr19 = ThreefishEngine.xorRotr(xorRotr15, 56, j58);
                        long j66 = j58 - xorRotr19;
                        long xorRotr20 = ThreefishEngine.xorRotr(xorRotr13, 51, j57);
                        long j67 = j57 - xorRotr20;
                        long xorRotr21 = ThreefishEngine.xorRotr(xorRotr9, 4, j63);
                        long j68 = j63 - xorRotr21;
                        long xorRotr22 = ThreefishEngine.xorRotr(xorRotr11, 53, j59);
                        long j69 = j59 - xorRotr22;
                        long xorRotr23 = ThreefishEngine.xorRotr(xorRotr10, 42, j61);
                        long j71 = j61 - xorRotr23;
                        long xorRotr24 = ThreefishEngine.xorRotr(xorRotr12, 41, j62);
                        long j72 = j62 - xorRotr24;
                        long xorRotr25 = ThreefishEngine.xorRotr(xorRotr24, 41, j64);
                        long xorRotr26 = ThreefishEngine.xorRotr(xorRotr22, 9, j65);
                        long xorRotr27 = ThreefishEngine.xorRotr(xorRotr23, 37, j67);
                        long j73 = j67 - xorRotr27;
                        long xorRotr28 = ThreefishEngine.xorRotr(xorRotr21, 31, j66);
                        long j74 = j66 - xorRotr28;
                        long xorRotr29 = ThreefishEngine.xorRotr(xorRotr17, 12, j72);
                        long j75 = j72 - xorRotr29;
                        long xorRotr30 = ThreefishEngine.xorRotr(xorRotr19, 47, j68);
                        long j76 = j68 - xorRotr30;
                        long xorRotr31 = ThreefishEngine.xorRotr(xorRotr18, 44, j69);
                        long j77 = j69 - xorRotr31;
                        long xorRotr32 = ThreefishEngine.xorRotr(xorRotr20, 30, j71);
                        long j78 = j71 - xorRotr32;
                        long j79 = (j64 - xorRotr25) - jArr5[i13];
                        long j81 = xorRotr25 - jArr5[i15];
                        long j82 = (j65 - xorRotr26) - jArr5[i16];
                        long j83 = xorRotr26 - jArr5[i17];
                        long j84 = j73 - jArr5[i18];
                        long j85 = xorRotr27 - jArr5[i19];
                        long j86 = j74 - jArr5[i21];
                        long j87 = xorRotr28 - jArr5[i22];
                        long j88 = j75 - jArr5[i23];
                        long j89 = xorRotr29 - jArr5[i24];
                        long j90 = j76 - jArr5[i25];
                        long j91 = xorRotr30 - jArr5[i26];
                        long j92 = j77 - jArr5[i27];
                        long j93 = xorRotr31 - (jArr5[i28] + jArr6[i14]);
                        long j94 = j78 - (jArr5[i29] + jArr6[i31]);
                        long xorRotr33 = ThreefishEngine.xorRotr(xorRotr32 - (jArr5[i32] + j45), 5, j79);
                        long j95 = j79 - xorRotr33;
                        long xorRotr34 = ThreefishEngine.xorRotr(j91, 20, j82);
                        long j96 = j82 - xorRotr34;
                        long xorRotr35 = ThreefishEngine.xorRotr(j93, 48, j86);
                        long j97 = j86 - xorRotr35;
                        long xorRotr36 = ThreefishEngine.xorRotr(j89, 41, j84);
                        long j98 = j84 - xorRotr36;
                        long xorRotr37 = ThreefishEngine.xorRotr(j81, 47, j94);
                        long j99 = j94 - xorRotr37;
                        long xorRotr38 = ThreefishEngine.xorRotr(j85, 28, j88);
                        long j100 = j88 - xorRotr38;
                        long xorRotr39 = ThreefishEngine.xorRotr(j83, 16, j90);
                        long j101 = j90 - xorRotr39;
                        long xorRotr40 = ThreefishEngine.xorRotr(j87, 25, j92);
                        long j102 = j92 - xorRotr40;
                        long xorRotr41 = ThreefishEngine.xorRotr(xorRotr40, 33, j95);
                        long j103 = j95 - xorRotr41;
                        long xorRotr42 = ThreefishEngine.xorRotr(xorRotr38, 4, j96);
                        long j104 = j96 - xorRotr42;
                        long xorRotr43 = ThreefishEngine.xorRotr(xorRotr39, 51, j98);
                        long j105 = j98 - xorRotr43;
                        long xorRotr44 = ThreefishEngine.xorRotr(xorRotr37, 13, j97);
                        long j106 = j97 - xorRotr44;
                        long xorRotr45 = ThreefishEngine.xorRotr(xorRotr33, 34, j102);
                        long j107 = j102 - xorRotr45;
                        long xorRotr46 = ThreefishEngine.xorRotr(xorRotr35, 41, j99);
                        long j108 = j99 - xorRotr46;
                        long xorRotr47 = ThreefishEngine.xorRotr(xorRotr34, 59, j100);
                        long j109 = j100 - xorRotr47;
                        long xorRotr48 = ThreefishEngine.xorRotr(xorRotr36, 17, j101);
                        long j110 = j101 - xorRotr48;
                        long xorRotr49 = ThreefishEngine.xorRotr(xorRotr48, 38, j103);
                        long j111 = j103 - xorRotr49;
                        long xorRotr50 = ThreefishEngine.xorRotr(xorRotr46, 19, j104);
                        long j112 = j104 - xorRotr50;
                        long xorRotr51 = ThreefishEngine.xorRotr(xorRotr47, 10, j106);
                        long j113 = j106 - xorRotr51;
                        long xorRotr52 = ThreefishEngine.xorRotr(xorRotr45, 55, j105);
                        long j114 = j105 - xorRotr52;
                        long xorRotr53 = ThreefishEngine.xorRotr(xorRotr41, 49, j110);
                        long j115 = j110 - xorRotr53;
                        long xorRotr54 = ThreefishEngine.xorRotr(xorRotr43, 18, j107);
                        long j116 = j107 - xorRotr54;
                        long xorRotr55 = ThreefishEngine.xorRotr(xorRotr42, 23, j108);
                        long j117 = j108 - xorRotr55;
                        long xorRotr56 = ThreefishEngine.xorRotr(xorRotr44, 52, j109);
                        long j118 = j109 - xorRotr56;
                        long xorRotr57 = ThreefishEngine.xorRotr(xorRotr56, 24, j111);
                        long j119 = j111 - xorRotr57;
                        long xorRotr58 = ThreefishEngine.xorRotr(xorRotr54, 13, j112);
                        j13 = j112 - xorRotr58;
                        long xorRotr59 = ThreefishEngine.xorRotr(xorRotr55, 8, j114);
                        long j120 = j114 - xorRotr59;
                        long xorRotr60 = ThreefishEngine.xorRotr(xorRotr53, 47, j113);
                        long j121 = j113 - xorRotr60;
                        long xorRotr61 = ThreefishEngine.xorRotr(xorRotr49, 8, j118);
                        long j122 = j118 - xorRotr61;
                        long xorRotr62 = ThreefishEngine.xorRotr(xorRotr51, 17, j115);
                        long j123 = j115 - xorRotr62;
                        j25 = ThreefishEngine.xorRotr(xorRotr50, 22, j116);
                        j27 = ThreefishEngine.xorRotr(xorRotr52, 37, j117);
                        j26 = j117 - j27;
                        j23 = xorRotr62;
                        j24 = j116 - j25;
                        iArr = iArr3;
                        jArr4 = jArr6;
                        jArr3 = jArr5;
                        j19 = j122;
                        j21 = xorRotr61;
                        i11 = 1;
                        j15 = j120;
                        j12 = xorRotr57;
                        i12 -= 2;
                        j14 = xorRotr58;
                        iArr2 = iArr4;
                        j18 = xorRotr60;
                        j22 = j123;
                        j16 = xorRotr59;
                        j17 = j121;
                        j11 = j119;
                    }
                    long[] jArr7 = jArr3;
                    long[] jArr8 = jArr4;
                    long j124 = j11 - jArr7[0];
                    long j125 = j12 - jArr7[1];
                    long j126 = j13 - jArr7[2];
                    long j127 = j14 - jArr7[3];
                    long j128 = j15 - jArr7[4];
                    long j129 = j16 - jArr7[5];
                    long j130 = j17 - jArr7[6];
                    long j131 = j18 - jArr7[7];
                    long j132 = j19 - jArr7[8];
                    long j133 = j21 - jArr7[9];
                    long j134 = j22 - jArr7[10];
                    long j135 = j24 - jArr7[12];
                    long j136 = j25 - (jArr7[13] + jArr8[0]);
                    long j137 = j26 - (jArr7[14] + jArr8[1]);
                    jArr2[0] = j124;
                    jArr2[1] = j125;
                    jArr2[2] = j126;
                    jArr2[3] = j127;
                    jArr2[4] = j128;
                    jArr2[5] = j129;
                    jArr2[6] = j130;
                    jArr2[7] = j131;
                    jArr2[8] = j132;
                    jArr2[9] = j133;
                    jArr2[10] = j134;
                    jArr2[11] = j23 - jArr7[11];
                    jArr2[12] = j135;
                    jArr2[13] = j136;
                    jArr2[14] = j137;
                    jArr2[15] = j27 - jArr7[15];
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f43516kw;
            long[] jArr4 = this.f43517t;
            int[] iArr = ThreefishEngine.MOD17;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length == 33) {
                if (jArr4.length == 5) {
                    long j11 = jArr[0];
                    int i11 = 1;
                    long j12 = jArr[1];
                    long j13 = jArr[2];
                    long j14 = jArr[3];
                    long j15 = jArr[4];
                    long j16 = jArr[5];
                    long j17 = jArr[6];
                    long j18 = jArr[7];
                    long j19 = jArr[8];
                    long j21 = jArr[9];
                    long j22 = jArr[10];
                    long j23 = jArr[11];
                    long j24 = jArr[12];
                    long j25 = jArr[13];
                    long j26 = jArr[14];
                    long j27 = jArr[15];
                    long j28 = j11 + jArr3[0];
                    long j29 = j12 + jArr3[1];
                    long j31 = j13 + jArr3[2];
                    long j32 = j14 + jArr3[3];
                    long j33 = j15 + jArr3[4];
                    long j34 = j16 + jArr3[5];
                    long j35 = j17 + jArr3[6];
                    long j36 = j18 + jArr3[7];
                    long j37 = j19 + jArr3[8];
                    long j38 = j21 + jArr3[9];
                    long j39 = j22 + jArr3[10];
                    long j41 = j23 + jArr3[11];
                    long j42 = j24 + jArr3[12];
                    long j43 = j25 + jArr3[13] + jArr4[0];
                    long j44 = j26 + jArr3[14] + jArr4[1];
                    long j45 = j32;
                    long j46 = j34;
                    long j47 = j36;
                    long j48 = j38;
                    long j49 = j41;
                    long j51 = j43;
                    long j52 = j27 + jArr3[15];
                    while (i11 < 20) {
                        int i12 = iArr[i11];
                        int i13 = iArr2[i11];
                        long j53 = j28 + j29;
                        long rotlXor = ThreefishEngine.rotlXor(j29, 24, j53);
                        long j54 = j31 + j45;
                        long rotlXor2 = ThreefishEngine.rotlXor(j45, 13, j54);
                        long[] jArr5 = jArr3;
                        int[] iArr3 = iArr;
                        int[] iArr4 = iArr2;
                        long j55 = j46;
                        long j56 = j33 + j55;
                        long rotlXor3 = ThreefishEngine.rotlXor(j55, 8, j56);
                        int i14 = i11;
                        long j57 = j47;
                        long j58 = j35 + j57;
                        long rotlXor4 = ThreefishEngine.rotlXor(j57, 47, j58);
                        long[] jArr6 = jArr4;
                        long j59 = j48;
                        long j61 = j37 + j59;
                        long rotlXor5 = ThreefishEngine.rotlXor(j59, 8, j61);
                        long j62 = j49;
                        long j63 = j39 + j62;
                        long rotlXor6 = ThreefishEngine.rotlXor(j62, 17, j63);
                        long j64 = j51;
                        long j65 = j42 + j64;
                        long rotlXor7 = ThreefishEngine.rotlXor(j64, 22, j65);
                        long j66 = j52;
                        long j67 = j44 + j66;
                        long rotlXor8 = ThreefishEngine.rotlXor(j66, 37, j67);
                        long j68 = j53 + rotlXor5;
                        long rotlXor9 = ThreefishEngine.rotlXor(rotlXor5, 38, j68);
                        long j69 = j54 + rotlXor7;
                        long rotlXor10 = ThreefishEngine.rotlXor(rotlXor7, 19, j69);
                        long j71 = j58 + rotlXor6;
                        long rotlXor11 = ThreefishEngine.rotlXor(rotlXor6, 10, j71);
                        long j72 = j56 + rotlXor8;
                        long rotlXor12 = ThreefishEngine.rotlXor(rotlXor8, 55, j72);
                        long j73 = j63 + rotlXor4;
                        long rotlXor13 = ThreefishEngine.rotlXor(rotlXor4, 49, j73);
                        long j74 = j65 + rotlXor2;
                        long rotlXor14 = ThreefishEngine.rotlXor(rotlXor2, 18, j74);
                        long j75 = j67 + rotlXor3;
                        long rotlXor15 = ThreefishEngine.rotlXor(rotlXor3, 23, j75);
                        long j76 = j61 + rotlXor;
                        long rotlXor16 = ThreefishEngine.rotlXor(rotlXor, 52, j76);
                        long j77 = j68 + rotlXor13;
                        long rotlXor17 = ThreefishEngine.rotlXor(rotlXor13, 33, j77);
                        long j78 = j69 + rotlXor15;
                        long rotlXor18 = ThreefishEngine.rotlXor(rotlXor15, 4, j78);
                        long j79 = j72 + rotlXor14;
                        long rotlXor19 = ThreefishEngine.rotlXor(rotlXor14, 51, j79);
                        long j81 = j71 + rotlXor16;
                        long rotlXor20 = ThreefishEngine.rotlXor(rotlXor16, 13, j81);
                        long j82 = j74 + rotlXor12;
                        long rotlXor21 = ThreefishEngine.rotlXor(rotlXor12, 34, j82);
                        long j83 = j75 + rotlXor10;
                        long rotlXor22 = ThreefishEngine.rotlXor(rotlXor10, 41, j83);
                        long j84 = j76 + rotlXor11;
                        long rotlXor23 = ThreefishEngine.rotlXor(rotlXor11, 59, j84);
                        long j85 = j73 + rotlXor9;
                        long rotlXor24 = ThreefishEngine.rotlXor(rotlXor9, 17, j85);
                        long j86 = j77 + rotlXor21;
                        long rotlXor25 = ThreefishEngine.rotlXor(rotlXor21, 5, j86);
                        long j87 = j78 + rotlXor23;
                        long rotlXor26 = ThreefishEngine.rotlXor(rotlXor23, 20, j87);
                        long j88 = j81 + rotlXor22;
                        long rotlXor27 = ThreefishEngine.rotlXor(rotlXor22, 48, j88);
                        long j89 = j79 + rotlXor24;
                        long rotlXor28 = ThreefishEngine.rotlXor(rotlXor24, 41, j89);
                        long j90 = j83 + rotlXor20;
                        long rotlXor29 = ThreefishEngine.rotlXor(rotlXor20, 47, j90);
                        long j91 = j84 + rotlXor18;
                        long rotlXor30 = ThreefishEngine.rotlXor(rotlXor18, 28, j91);
                        long j92 = j85 + rotlXor19;
                        long rotlXor31 = ThreefishEngine.rotlXor(rotlXor19, 16, j92);
                        long j93 = j82 + rotlXor17;
                        long rotlXor32 = ThreefishEngine.rotlXor(rotlXor17, 25, j93);
                        long j94 = j86 + jArr5[i12];
                        int i15 = i12 + 1;
                        long j95 = rotlXor29 + jArr5[i15];
                        int i16 = i12 + 2;
                        long j96 = j87 + jArr5[i16];
                        int i17 = i12 + 3;
                        long j97 = rotlXor31 + jArr5[i17];
                        int i18 = i12 + 4;
                        long j98 = j89 + jArr5[i18];
                        int i19 = i12 + 5;
                        long j99 = rotlXor30 + jArr5[i19];
                        int i21 = i12 + 6;
                        long j100 = j88 + jArr5[i21];
                        int i22 = i12 + 7;
                        long j101 = rotlXor32 + jArr5[i22];
                        int i23 = i12 + 8;
                        long j102 = j91 + jArr5[i23];
                        int i24 = i12 + 9;
                        long j103 = rotlXor28 + jArr5[i24];
                        int i25 = i12 + 10;
                        long j104 = j92 + jArr5[i25];
                        int i26 = i12 + 11;
                        long j105 = rotlXor26 + jArr5[i26];
                        int i27 = i12 + 12;
                        long j106 = j93 + jArr5[i27];
                        int i28 = i12 + 13;
                        long j107 = rotlXor27 + jArr5[i28] + jArr6[i13];
                        int i29 = i12 + 14;
                        int i31 = i13 + 1;
                        long j108 = j90 + jArr5[i29] + jArr6[i31];
                        int i32 = i12 + 15;
                        long j109 = jArr5[i32];
                        long j110 = i14;
                        long j111 = rotlXor25 + j109 + j110;
                        long j112 = j94 + j95;
                        long rotlXor33 = ThreefishEngine.rotlXor(j95, 41, j112);
                        long j113 = j96 + j97;
                        long rotlXor34 = ThreefishEngine.rotlXor(j97, 9, j113);
                        long j114 = j98 + j99;
                        long rotlXor35 = ThreefishEngine.rotlXor(j99, 37, j114);
                        long j115 = j100 + j101;
                        long rotlXor36 = ThreefishEngine.rotlXor(j101, 31, j115);
                        long j116 = j102 + j103;
                        long rotlXor37 = ThreefishEngine.rotlXor(j103, 12, j116);
                        long j117 = j104 + j105;
                        long rotlXor38 = ThreefishEngine.rotlXor(j105, 47, j117);
                        long j118 = j106 + j107;
                        long rotlXor39 = ThreefishEngine.rotlXor(j107, 44, j118);
                        long j119 = j108 + j111;
                        long rotlXor40 = ThreefishEngine.rotlXor(j111, 30, j119);
                        long j120 = j112 + rotlXor37;
                        long rotlXor41 = ThreefishEngine.rotlXor(rotlXor37, 16, j120);
                        long j121 = j113 + rotlXor39;
                        long rotlXor42 = ThreefishEngine.rotlXor(rotlXor39, 34, j121);
                        long j122 = j115 + rotlXor38;
                        long rotlXor43 = ThreefishEngine.rotlXor(rotlXor38, 56, j122);
                        long j123 = j114 + rotlXor40;
                        long rotlXor44 = ThreefishEngine.rotlXor(rotlXor40, 51, j123);
                        long j124 = j117 + rotlXor36;
                        long rotlXor45 = ThreefishEngine.rotlXor(rotlXor36, 4, j124);
                        long j125 = j118 + rotlXor34;
                        long rotlXor46 = ThreefishEngine.rotlXor(rotlXor34, 53, j125);
                        long j126 = j119 + rotlXor35;
                        long rotlXor47 = ThreefishEngine.rotlXor(rotlXor35, 42, j126);
                        long j127 = j116 + rotlXor33;
                        long rotlXor48 = ThreefishEngine.rotlXor(rotlXor33, 41, j127);
                        long j128 = j120 + rotlXor45;
                        long rotlXor49 = ThreefishEngine.rotlXor(rotlXor45, 31, j128);
                        long j129 = j121 + rotlXor47;
                        long rotlXor50 = ThreefishEngine.rotlXor(rotlXor47, 44, j129);
                        long j130 = j123 + rotlXor46;
                        long rotlXor51 = ThreefishEngine.rotlXor(rotlXor46, 47, j130);
                        long j131 = j122 + rotlXor48;
                        long rotlXor52 = ThreefishEngine.rotlXor(rotlXor48, 46, j131);
                        long j132 = j125 + rotlXor44;
                        long rotlXor53 = ThreefishEngine.rotlXor(rotlXor44, 19, j132);
                        long j133 = j126 + rotlXor42;
                        long rotlXor54 = ThreefishEngine.rotlXor(rotlXor42, 42, j133);
                        long j134 = j127 + rotlXor43;
                        long rotlXor55 = ThreefishEngine.rotlXor(rotlXor43, 44, j134);
                        long j135 = j124 + rotlXor41;
                        long rotlXor56 = ThreefishEngine.rotlXor(rotlXor41, 25, j135);
                        long j136 = j128 + rotlXor53;
                        long rotlXor57 = ThreefishEngine.rotlXor(rotlXor53, 9, j136);
                        long j137 = j129 + rotlXor55;
                        long rotlXor58 = ThreefishEngine.rotlXor(rotlXor55, 48, j137);
                        long j138 = j131 + rotlXor54;
                        long rotlXor59 = ThreefishEngine.rotlXor(rotlXor54, 35, j138);
                        long j139 = j130 + rotlXor56;
                        long rotlXor60 = ThreefishEngine.rotlXor(rotlXor56, 52, j139);
                        long j140 = j133 + rotlXor52;
                        long rotlXor61 = ThreefishEngine.rotlXor(rotlXor52, 23, j140);
                        long j141 = j134 + rotlXor50;
                        long rotlXor62 = ThreefishEngine.rotlXor(rotlXor50, 31, j141);
                        long j142 = j135 + rotlXor51;
                        long rotlXor63 = ThreefishEngine.rotlXor(rotlXor51, 37, j142);
                        long j143 = j132 + rotlXor49;
                        long rotlXor64 = ThreefishEngine.rotlXor(rotlXor49, 20, j143);
                        long j144 = j136 + jArr5[i15];
                        long j145 = rotlXor61 + jArr5[i16];
                        long j146 = j137 + jArr5[i17];
                        long j147 = rotlXor63 + jArr5[i18];
                        long j148 = j139 + jArr5[i19];
                        long j149 = rotlXor62 + jArr5[i21];
                        long j150 = j138 + jArr5[i22];
                        long j151 = rotlXor64 + jArr5[i23];
                        long j152 = j141 + jArr5[i24];
                        j48 = rotlXor60 + jArr5[i25];
                        j39 = j142 + jArr5[i26];
                        j49 = rotlXor58 + jArr5[i27];
                        long j153 = j143 + jArr5[i28];
                        j51 = rotlXor59 + jArr5[i29] + jArr6[i31];
                        j52 = rotlXor57 + jArr5[i12 + 16] + j110 + 1;
                        j47 = j151;
                        j45 = j147;
                        j46 = j149;
                        j44 = j140 + jArr5[i32] + jArr6[i13 + 2];
                        iArr2 = iArr4;
                        j37 = j152;
                        j35 = j150;
                        j42 = j153;
                        j29 = j145;
                        iArr = iArr3;
                        jArr4 = jArr6;
                        jArr3 = jArr5;
                        i11 = i14 + 2;
                        j33 = j148;
                        j28 = j144;
                        j31 = j146;
                    }
                    jArr2[0] = j28;
                    jArr2[1] = j29;
                    jArr2[2] = j31;
                    jArr2[3] = j45;
                    jArr2[4] = j33;
                    jArr2[5] = j46;
                    jArr2[6] = j35;
                    jArr2[7] = j47;
                    jArr2[8] = j37;
                    jArr2[9] = j48;
                    jArr2[10] = j39;
                    jArr2[11] = j49;
                    jArr2[12] = j42;
                    jArr2[13] = j51;
                    jArr2[14] = j44;
                    jArr2[15] = j52;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    /* loaded from: classes4.dex */
    private static final class Threefish256Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 14;
        private static final int ROTATION_0_1 = 16;
        private static final int ROTATION_1_0 = 52;
        private static final int ROTATION_1_1 = 57;
        private static final int ROTATION_2_0 = 23;
        private static final int ROTATION_2_1 = 40;
        private static final int ROTATION_3_0 = 5;
        private static final int ROTATION_3_1 = 37;
        private static final int ROTATION_4_0 = 25;
        private static final int ROTATION_4_1 = 33;
        private static final int ROTATION_5_0 = 46;
        private static final int ROTATION_5_1 = 12;
        private static final int ROTATION_6_0 = 58;
        private static final int ROTATION_6_1 = 22;
        private static final int ROTATION_7_0 = 32;
        private static final int ROTATION_7_1 = 32;

        public Threefish256Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f43516kw;
            long[] jArr4 = this.f43517t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length == 9) {
                if (jArr4.length == 5) {
                    char c11 = 0;
                    long j11 = jArr[0];
                    long j12 = jArr[1];
                    long j13 = jArr[2];
                    long j14 = jArr[3];
                    int i11 = 17;
                    for (int i12 = 1; i11 >= i12; i12 = 1) {
                        int i13 = iArr[i11];
                        int i14 = iArr2[i11];
                        int i15 = i13 + 1;
                        long j15 = j11 - jArr3[i15];
                        int i16 = i13 + 2;
                        int i17 = i14 + 1;
                        long j16 = j12 - (jArr3[i16] + jArr4[i17]);
                        int i18 = i13 + 3;
                        long j17 = j13 - (jArr3[i18] + jArr4[i14 + 2]);
                        long j18 = i11;
                        long xorRotr = ThreefishEngine.xorRotr(j14 - ((jArr3[i13 + 4] + j18) + 1), 32, j15);
                        long j19 = j15 - xorRotr;
                        int[] iArr3 = iArr;
                        long xorRotr2 = ThreefishEngine.xorRotr(j16, 32, j17);
                        long j21 = j17 - xorRotr2;
                        long xorRotr3 = ThreefishEngine.xorRotr(xorRotr2, 58, j19);
                        long j22 = j19 - xorRotr3;
                        long xorRotr4 = ThreefishEngine.xorRotr(xorRotr, 22, j21);
                        long j23 = j21 - xorRotr4;
                        long xorRotr5 = ThreefishEngine.xorRotr(xorRotr4, 46, j22);
                        long j24 = j22 - xorRotr5;
                        long xorRotr6 = ThreefishEngine.xorRotr(xorRotr3, 12, j23);
                        long j25 = j23 - xorRotr6;
                        long xorRotr7 = ThreefishEngine.xorRotr(xorRotr6, 25, j24);
                        long xorRotr8 = ThreefishEngine.xorRotr(xorRotr5, 33, j25);
                        long j26 = (j24 - xorRotr7) - jArr3[i13];
                        long j27 = xorRotr7 - (jArr3[i15] + jArr4[i14]);
                        long j28 = (j25 - xorRotr8) - (jArr3[i16] + jArr4[i17]);
                        long xorRotr9 = ThreefishEngine.xorRotr(xorRotr8 - (jArr3[i18] + j18), 5, j26);
                        long j29 = j26 - xorRotr9;
                        long xorRotr10 = ThreefishEngine.xorRotr(j27, 37, j28);
                        long j31 = j28 - xorRotr10;
                        long xorRotr11 = ThreefishEngine.xorRotr(xorRotr10, 23, j29);
                        long j32 = j29 - xorRotr11;
                        long xorRotr12 = ThreefishEngine.xorRotr(xorRotr9, 40, j31);
                        long j33 = j31 - xorRotr12;
                        long xorRotr13 = ThreefishEngine.xorRotr(xorRotr12, 52, j32);
                        long j34 = j32 - xorRotr13;
                        long xorRotr14 = ThreefishEngine.xorRotr(xorRotr11, 57, j33);
                        long j35 = j33 - xorRotr14;
                        long xorRotr15 = ThreefishEngine.xorRotr(xorRotr14, 14, j34);
                        j11 = j34 - xorRotr15;
                        j14 = ThreefishEngine.xorRotr(xorRotr13, 16, j35);
                        j13 = j35 - j14;
                        i11 -= 2;
                        j12 = xorRotr15;
                        iArr = iArr3;
                        iArr2 = iArr2;
                        c11 = 0;
                    }
                    char c12 = c11;
                    long j36 = j12 - (jArr3[1] + jArr4[c12]);
                    long j37 = j13 - (jArr3[2] + jArr4[1]);
                    jArr2[c12] = j11 - jArr3[c12];
                    jArr2[1] = j36;
                    jArr2[2] = j37;
                    jArr2[3] = j14 - jArr3[3];
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f43516kw;
            long[] jArr4 = this.f43517t;
            int[] iArr = ThreefishEngine.MOD5;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length == 9) {
                if (jArr4.length == 5) {
                    long j11 = jArr[0];
                    long j12 = jArr[1];
                    long j13 = jArr[2];
                    long j14 = jArr[3];
                    long j15 = j11 + jArr3[0];
                    long j16 = j12 + jArr3[1] + jArr4[0];
                    long j17 = j13 + jArr3[2] + jArr4[1];
                    int i11 = 1;
                    long j18 = j14 + jArr3[3];
                    while (i11 < 18) {
                        int i12 = iArr[i11];
                        int i13 = iArr2[i11];
                        long j19 = j15 + j16;
                        long rotlXor = ThreefishEngine.rotlXor(j16, 14, j19);
                        long j21 = j17 + j18;
                        long rotlXor2 = ThreefishEngine.rotlXor(j18, 16, j21);
                        long j22 = j19 + rotlXor2;
                        long rotlXor3 = ThreefishEngine.rotlXor(rotlXor2, 52, j22);
                        long j23 = j21 + rotlXor;
                        long rotlXor4 = ThreefishEngine.rotlXor(rotlXor, 57, j23);
                        long j24 = j22 + rotlXor4;
                        long rotlXor5 = ThreefishEngine.rotlXor(rotlXor4, 23, j24);
                        long j25 = j23 + rotlXor3;
                        long rotlXor6 = ThreefishEngine.rotlXor(rotlXor3, 40, j25);
                        long j26 = j24 + rotlXor6;
                        long rotlXor7 = ThreefishEngine.rotlXor(rotlXor6, 5, j26);
                        long j27 = j25 + rotlXor5;
                        long rotlXor8 = ThreefishEngine.rotlXor(rotlXor5, 37, j27);
                        long j28 = j26 + jArr3[i12];
                        int i14 = i12 + 1;
                        long j29 = rotlXor8 + jArr3[i14] + jArr4[i13];
                        int i15 = i12 + 2;
                        int i16 = i13 + 1;
                        long j31 = j27 + jArr3[i15] + jArr4[i16];
                        int i17 = i12 + 3;
                        int[] iArr3 = iArr;
                        long j32 = i11;
                        long j33 = rotlXor7 + jArr3[i17] + j32;
                        long j34 = j28 + j29;
                        long rotlXor9 = ThreefishEngine.rotlXor(j29, 25, j34);
                        long j35 = j31 + j33;
                        long rotlXor10 = ThreefishEngine.rotlXor(j33, 33, j35);
                        long j36 = j34 + rotlXor10;
                        long rotlXor11 = ThreefishEngine.rotlXor(rotlXor10, 46, j36);
                        long j37 = j35 + rotlXor9;
                        long rotlXor12 = ThreefishEngine.rotlXor(rotlXor9, 12, j37);
                        long j38 = j36 + rotlXor12;
                        long rotlXor13 = ThreefishEngine.rotlXor(rotlXor12, 58, j38);
                        long j39 = j37 + rotlXor11;
                        long rotlXor14 = ThreefishEngine.rotlXor(rotlXor11, 22, j39);
                        long j41 = j38 + rotlXor14;
                        long rotlXor15 = ThreefishEngine.rotlXor(rotlXor14, 32, j41);
                        long j42 = j39 + rotlXor13;
                        long rotlXor16 = ThreefishEngine.rotlXor(rotlXor13, 32, j42);
                        j15 = j41 + jArr3[i14];
                        j16 = rotlXor16 + jArr3[i15] + jArr4[i16];
                        j17 = j42 + jArr3[i17] + jArr4[i13 + 2];
                        j18 = rotlXor15 + jArr3[i12 + 4] + j32 + 1;
                        i11 += 2;
                        iArr = iArr3;
                        iArr2 = iArr2;
                    }
                    jArr2[0] = j15;
                    jArr2[1] = j16;
                    jArr2[2] = j17;
                    jArr2[3] = j18;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    /* loaded from: classes4.dex */
    private static final class Threefish512Cipher extends ThreefishCipher {
        private static final int ROTATION_0_0 = 46;
        private static final int ROTATION_0_1 = 36;
        private static final int ROTATION_0_2 = 19;
        private static final int ROTATION_0_3 = 37;
        private static final int ROTATION_1_0 = 33;
        private static final int ROTATION_1_1 = 27;
        private static final int ROTATION_1_2 = 14;
        private static final int ROTATION_1_3 = 42;
        private static final int ROTATION_2_0 = 17;
        private static final int ROTATION_2_1 = 49;
        private static final int ROTATION_2_2 = 36;
        private static final int ROTATION_2_3 = 39;
        private static final int ROTATION_3_0 = 44;
        private static final int ROTATION_3_1 = 9;
        private static final int ROTATION_3_2 = 54;
        private static final int ROTATION_3_3 = 56;
        private static final int ROTATION_4_0 = 39;
        private static final int ROTATION_4_1 = 30;
        private static final int ROTATION_4_2 = 34;
        private static final int ROTATION_4_3 = 24;
        private static final int ROTATION_5_0 = 13;
        private static final int ROTATION_5_1 = 50;
        private static final int ROTATION_5_2 = 10;
        private static final int ROTATION_5_3 = 17;
        private static final int ROTATION_6_0 = 25;
        private static final int ROTATION_6_1 = 29;
        private static final int ROTATION_6_2 = 39;
        private static final int ROTATION_6_3 = 43;
        private static final int ROTATION_7_0 = 8;
        private static final int ROTATION_7_1 = 35;
        private static final int ROTATION_7_2 = 56;
        private static final int ROTATION_7_3 = 22;

        protected Threefish512Cipher(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void decryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f43516kw;
            long[] jArr4 = this.f43517t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length == 17) {
                if (jArr4.length == 5) {
                    char c11 = 0;
                    long j11 = jArr[0];
                    int i11 = 1;
                    long j12 = jArr[1];
                    long j13 = jArr[2];
                    long j14 = jArr[3];
                    long j15 = jArr[4];
                    long j16 = jArr[5];
                    long j17 = jArr[6];
                    long j18 = jArr[7];
                    int i12 = 17;
                    while (i12 >= i11) {
                        int i13 = iArr[i12];
                        int i14 = iArr2[i12];
                        int i15 = i13 + 1;
                        long j19 = j11 - jArr3[i15];
                        int i16 = i13 + 2;
                        long j21 = j12 - jArr3[i16];
                        int i17 = i13 + 3;
                        long j22 = j13 - jArr3[i17];
                        int i18 = i13 + 4;
                        long j23 = j14 - jArr3[i18];
                        int i19 = i13 + 5;
                        long j24 = j15 - jArr3[i19];
                        int i21 = i13 + 6;
                        int i22 = i14 + 1;
                        long j25 = j16 - (jArr3[i21] + jArr4[i22]);
                        int i23 = i13 + 7;
                        int[] iArr3 = iArr;
                        int[] iArr4 = iArr2;
                        long j26 = j17 - (jArr3[i23] + jArr4[i14 + 2]);
                        long[] jArr5 = jArr3;
                        long j27 = i12;
                        int i24 = i12;
                        long xorRotr = ThreefishEngine.xorRotr(j21, 8, j26);
                        long j28 = j26 - xorRotr;
                        long xorRotr2 = ThreefishEngine.xorRotr(j18 - ((jArr3[i13 + 8] + j27) + 1), 35, j19);
                        long j29 = j19 - xorRotr2;
                        long xorRotr3 = ThreefishEngine.xorRotr(j25, 56, j22);
                        long j31 = j22 - xorRotr3;
                        long xorRotr4 = ThreefishEngine.xorRotr(j23, 22, j24);
                        long j32 = j24 - xorRotr4;
                        long xorRotr5 = ThreefishEngine.xorRotr(xorRotr, 25, j32);
                        long j33 = j32 - xorRotr5;
                        long xorRotr6 = ThreefishEngine.xorRotr(xorRotr4, 29, j28);
                        long j34 = j28 - xorRotr6;
                        long xorRotr7 = ThreefishEngine.xorRotr(xorRotr3, 39, j29);
                        long j35 = j29 - xorRotr7;
                        long xorRotr8 = ThreefishEngine.xorRotr(xorRotr2, 43, j31);
                        long j36 = j31 - xorRotr8;
                        long xorRotr9 = ThreefishEngine.xorRotr(xorRotr5, 13, j36);
                        long j37 = j36 - xorRotr9;
                        long xorRotr10 = ThreefishEngine.xorRotr(xorRotr8, 50, j33);
                        long j38 = j33 - xorRotr10;
                        long xorRotr11 = ThreefishEngine.xorRotr(xorRotr7, 10, j34);
                        long j39 = j34 - xorRotr11;
                        long xorRotr12 = ThreefishEngine.xorRotr(xorRotr6, 17, j35);
                        long j41 = j35 - xorRotr12;
                        long xorRotr13 = ThreefishEngine.xorRotr(xorRotr9, 39, j41);
                        long xorRotr14 = ThreefishEngine.xorRotr(xorRotr12, 30, j37);
                        long xorRotr15 = ThreefishEngine.xorRotr(xorRotr11, 34, j38);
                        long j42 = j38 - xorRotr15;
                        long xorRotr16 = ThreefishEngine.xorRotr(xorRotr10, 24, j39);
                        long j43 = (j41 - xorRotr13) - jArr5[i13];
                        long j44 = xorRotr13 - jArr5[i15];
                        long j45 = (j37 - xorRotr14) - jArr5[i16];
                        long j46 = xorRotr14 - jArr5[i17];
                        long j47 = j42 - jArr5[i18];
                        long j48 = xorRotr15 - (jArr5[i19] + jArr4[i14]);
                        long j49 = (j39 - xorRotr16) - (jArr5[i21] + jArr4[i22]);
                        long xorRotr17 = ThreefishEngine.xorRotr(j44, 44, j49);
                        long j51 = j49 - xorRotr17;
                        long xorRotr18 = ThreefishEngine.xorRotr(xorRotr16 - (jArr5[i23] + j27), 9, j43);
                        long j52 = j43 - xorRotr18;
                        long xorRotr19 = ThreefishEngine.xorRotr(j48, 54, j45);
                        long j53 = j45 - xorRotr19;
                        long xorRotr20 = ThreefishEngine.xorRotr(j46, 56, j47);
                        long j54 = j47 - xorRotr20;
                        long xorRotr21 = ThreefishEngine.xorRotr(xorRotr17, 17, j54);
                        long j55 = j54 - xorRotr21;
                        long xorRotr22 = ThreefishEngine.xorRotr(xorRotr20, 49, j51);
                        long j56 = j51 - xorRotr22;
                        long xorRotr23 = ThreefishEngine.xorRotr(xorRotr19, 36, j52);
                        long j57 = j52 - xorRotr23;
                        long xorRotr24 = ThreefishEngine.xorRotr(xorRotr18, 39, j53);
                        long j58 = j53 - xorRotr24;
                        long xorRotr25 = ThreefishEngine.xorRotr(xorRotr21, 33, j58);
                        long j59 = j58 - xorRotr25;
                        long xorRotr26 = ThreefishEngine.xorRotr(xorRotr24, 27, j55);
                        long j61 = j55 - xorRotr26;
                        long xorRotr27 = ThreefishEngine.xorRotr(xorRotr23, 14, j56);
                        long j62 = j56 - xorRotr27;
                        long[] jArr6 = jArr4;
                        long xorRotr28 = ThreefishEngine.xorRotr(xorRotr22, 42, j57);
                        long j63 = j57 - xorRotr28;
                        long xorRotr29 = ThreefishEngine.xorRotr(xorRotr25, 46, j63);
                        long j64 = j63 - xorRotr29;
                        j14 = ThreefishEngine.xorRotr(xorRotr28, 36, j59);
                        long xorRotr30 = ThreefishEngine.xorRotr(xorRotr27, 19, j61);
                        j15 = j61 - xorRotr30;
                        j18 = ThreefishEngine.xorRotr(xorRotr26, 37, j62);
                        j17 = j62 - j18;
                        j13 = j59 - j14;
                        j12 = xorRotr29;
                        j16 = xorRotr30;
                        i12 = i24 - 2;
                        iArr2 = iArr4;
                        jArr3 = jArr5;
                        c11 = 0;
                        i11 = 1;
                        j11 = j64;
                        jArr4 = jArr6;
                        iArr = iArr3;
                    }
                    long[] jArr7 = jArr3;
                    long[] jArr8 = jArr4;
                    char c12 = c11;
                    long j65 = j11 - jArr7[c12];
                    long j66 = j12 - jArr7[1];
                    long j67 = j13 - jArr7[2];
                    long j68 = j14 - jArr7[3];
                    long j69 = j15 - jArr7[4];
                    long j71 = j17 - (jArr7[6] + jArr8[1]);
                    jArr2[c12] = j65;
                    jArr2[1] = j66;
                    jArr2[2] = j67;
                    jArr2[3] = j68;
                    jArr2[4] = j69;
                    jArr2[5] = j16 - (jArr7[5] + jArr8[c12]);
                    jArr2[6] = j71;
                    jArr2[7] = j18 - jArr7[7];
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        @Override // org.spongycastle.crypto.engines.ThreefishEngine.ThreefishCipher
        public void encryptBlock(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f43516kw;
            long[] jArr4 = this.f43517t;
            int[] iArr = ThreefishEngine.MOD9;
            int[] iArr2 = ThreefishEngine.MOD3;
            if (jArr3.length == 17) {
                if (jArr4.length == 5) {
                    long j11 = jArr[0];
                    long j12 = jArr[1];
                    long j13 = jArr[2];
                    long j14 = jArr[3];
                    long j15 = jArr[4];
                    long j16 = jArr[5];
                    long j17 = jArr[6];
                    long j18 = jArr[7];
                    long j19 = j11 + jArr3[0];
                    long j21 = j12 + jArr3[1];
                    long j22 = j13 + jArr3[2];
                    long j23 = j14 + jArr3[3];
                    long j24 = j15 + jArr3[4];
                    long j25 = j16 + jArr3[5] + jArr4[0];
                    long j26 = j17 + jArr3[6] + jArr4[1];
                    int i11 = 1;
                    long j27 = j23;
                    long j28 = j25;
                    long j29 = j18 + jArr3[7];
                    while (i11 < 18) {
                        int i12 = iArr[i11];
                        int i13 = iArr2[i11];
                        long j31 = j19 + j21;
                        long rotlXor = ThreefishEngine.rotlXor(j21, 46, j31);
                        long j32 = j22 + j27;
                        long rotlXor2 = ThreefishEngine.rotlXor(j27, 36, j32);
                        long[] jArr5 = jArr3;
                        int[] iArr3 = iArr;
                        long j33 = j28;
                        long j34 = j24 + j33;
                        long rotlXor3 = ThreefishEngine.rotlXor(j33, 19, j34);
                        int i14 = i11;
                        long j35 = j29;
                        long j36 = j26 + j35;
                        long rotlXor4 = ThreefishEngine.rotlXor(j35, 37, j36);
                        long j37 = j32 + rotlXor;
                        long rotlXor5 = ThreefishEngine.rotlXor(rotlXor, 33, j37);
                        long j38 = j34 + rotlXor4;
                        long rotlXor6 = ThreefishEngine.rotlXor(rotlXor4, 27, j38);
                        long j39 = j36 + rotlXor3;
                        long rotlXor7 = ThreefishEngine.rotlXor(rotlXor3, 14, j39);
                        long j41 = j31 + rotlXor2;
                        long rotlXor8 = ThreefishEngine.rotlXor(rotlXor2, 42, j41);
                        long j42 = j38 + rotlXor5;
                        long rotlXor9 = ThreefishEngine.rotlXor(rotlXor5, 17, j42);
                        long j43 = j39 + rotlXor8;
                        long rotlXor10 = ThreefishEngine.rotlXor(rotlXor8, 49, j43);
                        long j44 = j41 + rotlXor7;
                        long rotlXor11 = ThreefishEngine.rotlXor(rotlXor7, 36, j44);
                        long j45 = j37 + rotlXor6;
                        long rotlXor12 = ThreefishEngine.rotlXor(rotlXor6, 39, j45);
                        long j46 = j43 + rotlXor9;
                        long rotlXor13 = ThreefishEngine.rotlXor(rotlXor9, 44, j46);
                        long j47 = j44 + rotlXor12;
                        long rotlXor14 = ThreefishEngine.rotlXor(rotlXor12, 9, j47);
                        long j48 = j45 + rotlXor11;
                        long rotlXor15 = ThreefishEngine.rotlXor(rotlXor11, 54, j48);
                        long j49 = j42 + rotlXor10;
                        long rotlXor16 = ThreefishEngine.rotlXor(rotlXor10, 56, j49);
                        long j51 = j47 + jArr5[i12];
                        int i15 = i12 + 1;
                        long j52 = rotlXor13 + jArr5[i15];
                        int i16 = i12 + 2;
                        long j53 = j48 + jArr5[i16];
                        int i17 = i12 + 3;
                        long j54 = rotlXor16 + jArr5[i17];
                        int i18 = i12 + 4;
                        long j55 = j49 + jArr5[i18];
                        int i19 = i12 + 5;
                        long j56 = rotlXor15 + jArr5[i19] + jArr4[i13];
                        int i21 = i12 + 6;
                        int i22 = i13 + 1;
                        long j57 = j46 + jArr5[i21] + jArr4[i22];
                        int i23 = i12 + 7;
                        long j58 = i14;
                        long j59 = rotlXor14 + jArr5[i23] + j58;
                        long j61 = j51 + j52;
                        long rotlXor17 = ThreefishEngine.rotlXor(j52, 39, j61);
                        long j62 = j53 + j54;
                        long rotlXor18 = ThreefishEngine.rotlXor(j54, 30, j62);
                        long j63 = j55 + j56;
                        long rotlXor19 = ThreefishEngine.rotlXor(j56, 34, j63);
                        long j64 = j57 + j59;
                        long rotlXor20 = ThreefishEngine.rotlXor(j59, 24, j64);
                        long j65 = j62 + rotlXor17;
                        long rotlXor21 = ThreefishEngine.rotlXor(rotlXor17, 13, j65);
                        long j66 = j63 + rotlXor20;
                        long rotlXor22 = ThreefishEngine.rotlXor(rotlXor20, 50, j66);
                        long j67 = j64 + rotlXor19;
                        long rotlXor23 = ThreefishEngine.rotlXor(rotlXor19, 10, j67);
                        long j68 = j61 + rotlXor18;
                        long rotlXor24 = ThreefishEngine.rotlXor(rotlXor18, 17, j68);
                        long j69 = j66 + rotlXor21;
                        long rotlXor25 = ThreefishEngine.rotlXor(rotlXor21, 25, j69);
                        long j71 = j67 + rotlXor24;
                        long rotlXor26 = ThreefishEngine.rotlXor(rotlXor24, 29, j71);
                        long j72 = j68 + rotlXor23;
                        long rotlXor27 = ThreefishEngine.rotlXor(rotlXor23, 39, j72);
                        long j73 = j65 + rotlXor22;
                        long rotlXor28 = ThreefishEngine.rotlXor(rotlXor22, 43, j73);
                        long j74 = j71 + rotlXor25;
                        long rotlXor29 = ThreefishEngine.rotlXor(rotlXor25, 8, j74);
                        long j75 = j72 + rotlXor28;
                        long rotlXor30 = ThreefishEngine.rotlXor(rotlXor28, 35, j75);
                        long j76 = j73 + rotlXor27;
                        long rotlXor31 = ThreefishEngine.rotlXor(rotlXor27, 56, j76);
                        long j77 = j69 + rotlXor26;
                        long rotlXor32 = ThreefishEngine.rotlXor(rotlXor26, 22, j77);
                        long j78 = j75 + jArr5[i15];
                        j21 = rotlXor29 + jArr5[i16];
                        long j79 = j76 + jArr5[i17];
                        long j81 = rotlXor32 + jArr5[i18];
                        long j82 = j77 + jArr5[i19];
                        long j83 = rotlXor31 + jArr5[i21] + jArr4[i22];
                        j26 = j74 + jArr5[i23] + jArr4[i13 + 2];
                        j29 = rotlXor30 + jArr5[i12 + 8] + j58 + 1;
                        j24 = j82;
                        j28 = j83;
                        iArr = iArr3;
                        iArr2 = iArr2;
                        jArr3 = jArr5;
                        i11 = i14 + 2;
                        j27 = j81;
                        j22 = j79;
                        j19 = j78;
                    }
                    jArr2[0] = j19;
                    jArr2[1] = j21;
                    jArr2[2] = j22;
                    jArr2[3] = j27;
                    jArr2[4] = j24;
                    jArr2[5] = j28;
                    jArr2[6] = j26;
                    jArr2[7] = j29;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static abstract class ThreefishCipher {

        /* renamed from: kw  reason: collision with root package name */
        protected final long[] f43516kw;

        /* renamed from: t  reason: collision with root package name */
        protected final long[] f43517t;

        protected ThreefishCipher(long[] jArr, long[] jArr2) {
            this.f43516kw = jArr;
            this.f43517t = jArr2;
        }

        abstract void decryptBlock(long[] jArr, long[] jArr2);

        abstract void encryptBlock(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        MOD9 = iArr;
        MOD17 = new int[iArr.length];
        MOD5 = new int[iArr.length];
        MOD3 = new int[iArr.length];
        int i11 = 0;
        while (true) {
            int[] iArr2 = MOD9;
            if (i11 >= iArr2.length) {
                return;
            }
            MOD17[i11] = i11 % 17;
            iArr2[i11] = i11 % 9;
            MOD5[i11] = i11 % 5;
            MOD3[i11] = i11 % 3;
            i11++;
        }
    }

    public ThreefishEngine(int i11) {
        long[] jArr = new long[5];
        this.f43515t = jArr;
        int i12 = i11 / 8;
        this.blocksizeBytes = i12;
        int i13 = i12 / 8;
        this.blocksizeWords = i13;
        this.currentBlock = new long[i13];
        long[] jArr2 = new long[(i13 * 2) + 1];
        this.f43514kw = jArr2;
        if (i11 == 256) {
            this.cipher = new Threefish256Cipher(jArr2, jArr);
        } else if (i11 == 512) {
            this.cipher = new Threefish512Cipher(jArr2, jArr);
        } else if (i11 == 1024) {
            this.cipher = new Threefish1024Cipher(jArr2, jArr);
        } else {
            throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
        }
    }

    public static long bytesToWord(byte[] bArr, int i11) {
        if (i11 + 8 <= bArr.length) {
            int i12 = i11 + 1;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            int i15 = i14 + 1;
            int i16 = i15 + 1;
            int i17 = i16 + 1;
            return ((bArr[i17 + 1] & 255) << 56) | (bArr[i11] & 255) | ((bArr[i12] & 255) << 8) | ((bArr[i13] & 255) << 16) | ((bArr[i14] & 255) << 24) | ((bArr[i15] & 255) << 32) | ((bArr[i16] & 255) << 40) | ((bArr[i17] & 255) << 48);
        }
        throw new IllegalArgumentException();
    }

    static long rotlXor(long j11, int i11, long j12) {
        return ((j11 >>> (-i11)) | (j11 << i11)) ^ j12;
    }

    private void setKey(long[] jArr) {
        if (jArr.length != this.blocksizeWords) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.blocksizeWords + " words)");
        }
        long j11 = C_240;
        int i11 = 0;
        while (true) {
            int i12 = this.blocksizeWords;
            if (i11 < i12) {
                long[] jArr2 = this.f43514kw;
                jArr2[i11] = jArr[i11];
                j11 ^= jArr2[i11];
                i11++;
            } else {
                long[] jArr3 = this.f43514kw;
                jArr3[i12] = j11;
                System.arraycopy(jArr3, 0, jArr3, i12 + 1, i12);
                return;
            }
        }
    }

    private void setTweak(long[] jArr) {
        if (jArr.length == 2) {
            long[] jArr2 = this.f43515t;
            jArr2[0] = jArr[0];
            jArr2[1] = jArr[1];
            jArr2[2] = jArr2[0] ^ jArr2[1];
            jArr2[3] = jArr2[0];
            jArr2[4] = jArr2[1];
            return;
        }
        throw new IllegalArgumentException("Tweak must be 2 words.");
    }

    public static void wordToBytes(long j11, byte[] bArr, int i11) {
        if (i11 + 8 <= bArr.length) {
            int i12 = i11 + 1;
            bArr[i11] = (byte) j11;
            int i13 = i12 + 1;
            bArr[i12] = (byte) (j11 >> 8);
            int i14 = i13 + 1;
            bArr[i13] = (byte) (j11 >> 16);
            int i15 = i14 + 1;
            bArr[i14] = (byte) (j11 >> 24);
            int i16 = i15 + 1;
            bArr[i15] = (byte) (j11 >> 32);
            int i17 = i16 + 1;
            bArr[i16] = (byte) (j11 >> 40);
            bArr[i17] = (byte) (j11 >> 48);
            bArr[i17 + 1] = (byte) (j11 >> 56);
            return;
        }
        throw new IllegalArgumentException();
    }

    static long xorRotr(long j11, int i11, long j12) {
        long j13 = j11 ^ j12;
        return (j13 << (-i11)) | (j13 >>> i11);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "Threefish-" + (this.blocksizeBytes * 8);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int getBlockSize() {
        return this.blocksizeBytes;
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void init(boolean z11, CipherParameters cipherParameters) {
        byte[] key;
        byte[] bArr;
        long[] jArr;
        long[] jArr2 = null;
        if (cipherParameters instanceof TweakableBlockCipherParameters) {
            TweakableBlockCipherParameters tweakableBlockCipherParameters = (TweakableBlockCipherParameters) cipherParameters;
            key = tweakableBlockCipherParameters.getKey().getKey();
            bArr = tweakableBlockCipherParameters.getTweak();
        } else if (cipherParameters instanceof KeyParameter) {
            key = ((KeyParameter) cipherParameters).getKey();
            bArr = null;
        } else {
            throw new IllegalArgumentException("Invalid parameter passed to Threefish init - " + cipherParameters.getClass().getName());
        }
        if (key == null) {
            jArr = null;
        } else if (key.length == this.blocksizeBytes) {
            int i11 = this.blocksizeWords;
            jArr = new long[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                jArr[i12] = bytesToWord(key, i12 * 8);
            }
        } else {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.blocksizeBytes + " bytes)");
        }
        if (bArr != null) {
            if (bArr.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{bytesToWord(bArr, 0), bytesToWord(bArr, 8)};
        }
        init(z11, jArr, jArr2);
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.blocksizeBytes;
        if (i12 + i13 <= bArr2.length) {
            if (i13 + i11 <= bArr.length) {
                int i14 = 0;
                for (int i15 = 0; i15 < this.blocksizeBytes; i15 += 8) {
                    this.currentBlock[i15 >> 3] = bytesToWord(bArr, i11 + i15);
                }
                long[] jArr = this.currentBlock;
                processBlock(jArr, jArr);
                while (true) {
                    int i16 = this.blocksizeBytes;
                    if (i14 >= i16) {
                        return i16;
                    }
                    wordToBytes(this.currentBlock[i14 >> 3], bArr2, i12 + i14);
                    i14 += 8;
                }
            } else {
                throw new DataLengthException("Input buffer too short");
            }
        } else {
            throw new DataLengthException("Output buffer too short");
        }
    }

    @Override // org.spongycastle.crypto.BlockCipher
    public void reset() {
    }

    public int processBlock(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.f43514kw;
        int i11 = this.blocksizeWords;
        if (jArr3[i11] != 0) {
            if (jArr.length == i11) {
                if (jArr2.length == i11) {
                    if (this.forEncryption) {
                        this.cipher.encryptBlock(jArr, jArr2);
                    } else {
                        this.cipher.decryptBlock(jArr, jArr2);
                    }
                    return this.blocksizeWords;
                }
                throw new DataLengthException("Output buffer too short");
            }
            throw new DataLengthException("Input buffer too short");
        }
        throw new IllegalStateException("Threefish engine not initialised");
    }

    public void init(boolean z11, long[] jArr, long[] jArr2) {
        this.forEncryption = z11;
        if (jArr != null) {
            setKey(jArr);
        }
        if (jArr2 != null) {
            setTweak(jArr2);
        }
    }
}