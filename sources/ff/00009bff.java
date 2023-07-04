package org.spongycastle.crypto.engines;

import org.spongycastle.util.Pack;

/* loaded from: classes4.dex */
public final class SerpentEngine extends SerpentEngineBase {
    @Override // org.spongycastle.crypto.engines.SerpentEngineBase
    protected void decryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        this.X0 = this.wKey[128] ^ Pack.littleEndianToInt(bArr, i11);
        this.X1 = this.wKey[129] ^ Pack.littleEndianToInt(bArr, i11 + 4);
        this.X2 = this.wKey[130] ^ Pack.littleEndianToInt(bArr, i11 + 8);
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i11 + 12) ^ this.wKey[131];
        this.X3 = littleEndianToInt;
        ib7(this.X0, this.X1, this.X2, littleEndianToInt);
        int i13 = this.X0;
        int[] iArr = this.wKey;
        this.X0 = i13 ^ iArr[124];
        this.X1 ^= iArr[125];
        this.X2 ^= iArr[126];
        this.X3 ^= iArr[127];
        inverseLT();
        ib6(this.X0, this.X1, this.X2, this.X3);
        int i14 = this.X0;
        int[] iArr2 = this.wKey;
        this.X0 = i14 ^ iArr2[120];
        this.X1 ^= iArr2[121];
        this.X2 ^= iArr2[122];
        this.X3 ^= iArr2[123];
        inverseLT();
        ib5(this.X0, this.X1, this.X2, this.X3);
        int i15 = this.X0;
        int[] iArr3 = this.wKey;
        this.X0 = i15 ^ iArr3[116];
        this.X1 ^= iArr3[117];
        this.X2 ^= iArr3[118];
        this.X3 ^= iArr3[119];
        inverseLT();
        ib4(this.X0, this.X1, this.X2, this.X3);
        int i16 = this.X0;
        int[] iArr4 = this.wKey;
        this.X0 = i16 ^ iArr4[112];
        this.X1 ^= iArr4[113];
        this.X2 ^= iArr4[114];
        this.X3 ^= iArr4[115];
        inverseLT();
        ib3(this.X0, this.X1, this.X2, this.X3);
        int i17 = this.X0;
        int[] iArr5 = this.wKey;
        this.X0 = i17 ^ iArr5[108];
        this.X1 ^= iArr5[109];
        this.X2 ^= iArr5[110];
        this.X3 ^= iArr5[111];
        inverseLT();
        ib2(this.X0, this.X1, this.X2, this.X3);
        int i18 = this.X0;
        int[] iArr6 = this.wKey;
        this.X0 = i18 ^ iArr6[104];
        this.X1 ^= iArr6[105];
        this.X2 ^= iArr6[106];
        this.X3 ^= iArr6[107];
        inverseLT();
        ib1(this.X0, this.X1, this.X2, this.X3);
        int i19 = this.X0;
        int[] iArr7 = this.wKey;
        this.X0 = i19 ^ iArr7[100];
        this.X1 ^= iArr7[101];
        this.X2 ^= iArr7[102];
        this.X3 ^= iArr7[103];
        inverseLT();
        ib0(this.X0, this.X1, this.X2, this.X3);
        int i21 = this.X0;
        int[] iArr8 = this.wKey;
        this.X0 = i21 ^ iArr8[96];
        this.X1 ^= iArr8[97];
        this.X2 ^= iArr8[98];
        this.X3 ^= iArr8[99];
        inverseLT();
        ib7(this.X0, this.X1, this.X2, this.X3);
        int i22 = this.X0;
        int[] iArr9 = this.wKey;
        this.X0 = i22 ^ iArr9[92];
        this.X1 ^= iArr9[93];
        this.X2 ^= iArr9[94];
        this.X3 ^= iArr9[95];
        inverseLT();
        ib6(this.X0, this.X1, this.X2, this.X3);
        int i23 = this.X0;
        int[] iArr10 = this.wKey;
        this.X0 = i23 ^ iArr10[88];
        this.X1 ^= iArr10[89];
        this.X2 ^= iArr10[90];
        this.X3 ^= iArr10[91];
        inverseLT();
        ib5(this.X0, this.X1, this.X2, this.X3);
        int i24 = this.X0;
        int[] iArr11 = this.wKey;
        this.X0 = i24 ^ iArr11[84];
        this.X1 ^= iArr11[85];
        this.X2 ^= iArr11[86];
        this.X3 ^= iArr11[87];
        inverseLT();
        ib4(this.X0, this.X1, this.X2, this.X3);
        int i25 = this.X0;
        int[] iArr12 = this.wKey;
        this.X0 = i25 ^ iArr12[80];
        this.X1 ^= iArr12[81];
        this.X2 ^= iArr12[82];
        this.X3 ^= iArr12[83];
        inverseLT();
        ib3(this.X0, this.X1, this.X2, this.X3);
        int i26 = this.X0;
        int[] iArr13 = this.wKey;
        this.X0 = i26 ^ iArr13[76];
        this.X1 ^= iArr13[77];
        this.X2 ^= iArr13[78];
        this.X3 ^= iArr13[79];
        inverseLT();
        ib2(this.X0, this.X1, this.X2, this.X3);
        int i27 = this.X0;
        int[] iArr14 = this.wKey;
        this.X0 = i27 ^ iArr14[72];
        this.X1 ^= iArr14[73];
        this.X2 ^= iArr14[74];
        this.X3 ^= iArr14[75];
        inverseLT();
        ib1(this.X0, this.X1, this.X2, this.X3);
        int i28 = this.X0;
        int[] iArr15 = this.wKey;
        this.X0 = i28 ^ iArr15[68];
        this.X1 ^= iArr15[69];
        this.X2 ^= iArr15[70];
        this.X3 ^= iArr15[71];
        inverseLT();
        ib0(this.X0, this.X1, this.X2, this.X3);
        int i29 = this.X0;
        int[] iArr16 = this.wKey;
        this.X0 = i29 ^ iArr16[64];
        this.X1 ^= iArr16[65];
        this.X2 ^= iArr16[66];
        this.X3 ^= iArr16[67];
        inverseLT();
        ib7(this.X0, this.X1, this.X2, this.X3);
        int i31 = this.X0;
        int[] iArr17 = this.wKey;
        this.X0 = i31 ^ iArr17[60];
        this.X1 ^= iArr17[61];
        this.X2 ^= iArr17[62];
        this.X3 ^= iArr17[63];
        inverseLT();
        ib6(this.X0, this.X1, this.X2, this.X3);
        int i32 = this.X0;
        int[] iArr18 = this.wKey;
        this.X0 = i32 ^ iArr18[56];
        this.X1 ^= iArr18[57];
        this.X2 ^= iArr18[58];
        this.X3 ^= iArr18[59];
        inverseLT();
        ib5(this.X0, this.X1, this.X2, this.X3);
        int i33 = this.X0;
        int[] iArr19 = this.wKey;
        this.X0 = i33 ^ iArr19[52];
        this.X1 ^= iArr19[53];
        this.X2 ^= iArr19[54];
        this.X3 ^= iArr19[55];
        inverseLT();
        ib4(this.X0, this.X1, this.X2, this.X3);
        int i34 = this.X0;
        int[] iArr20 = this.wKey;
        this.X0 = i34 ^ iArr20[48];
        this.X1 ^= iArr20[49];
        this.X2 ^= iArr20[50];
        this.X3 ^= iArr20[51];
        inverseLT();
        ib3(this.X0, this.X1, this.X2, this.X3);
        int i35 = this.X0;
        int[] iArr21 = this.wKey;
        this.X0 = i35 ^ iArr21[44];
        this.X1 ^= iArr21[45];
        this.X2 ^= iArr21[46];
        this.X3 ^= iArr21[47];
        inverseLT();
        ib2(this.X0, this.X1, this.X2, this.X3);
        int i36 = this.X0;
        int[] iArr22 = this.wKey;
        this.X0 = i36 ^ iArr22[40];
        this.X1 ^= iArr22[41];
        this.X2 ^= iArr22[42];
        this.X3 ^= iArr22[43];
        inverseLT();
        ib1(this.X0, this.X1, this.X2, this.X3);
        int i37 = this.X0;
        int[] iArr23 = this.wKey;
        this.X0 = i37 ^ iArr23[36];
        this.X1 ^= iArr23[37];
        this.X2 ^= iArr23[38];
        this.X3 ^= iArr23[39];
        inverseLT();
        ib0(this.X0, this.X1, this.X2, this.X3);
        int i38 = this.X0;
        int[] iArr24 = this.wKey;
        this.X0 = i38 ^ iArr24[32];
        this.X1 ^= iArr24[33];
        this.X2 ^= iArr24[34];
        this.X3 ^= iArr24[35];
        inverseLT();
        ib7(this.X0, this.X1, this.X2, this.X3);
        int i39 = this.X0;
        int[] iArr25 = this.wKey;
        this.X0 = i39 ^ iArr25[28];
        this.X1 ^= iArr25[29];
        this.X2 ^= iArr25[30];
        this.X3 ^= iArr25[31];
        inverseLT();
        ib6(this.X0, this.X1, this.X2, this.X3);
        int i41 = this.X0;
        int[] iArr26 = this.wKey;
        this.X0 = i41 ^ iArr26[24];
        this.X1 ^= iArr26[25];
        this.X2 ^= iArr26[26];
        this.X3 ^= iArr26[27];
        inverseLT();
        ib5(this.X0, this.X1, this.X2, this.X3);
        int i42 = this.X0;
        int[] iArr27 = this.wKey;
        this.X0 = i42 ^ iArr27[20];
        this.X1 ^= iArr27[21];
        this.X2 ^= iArr27[22];
        this.X3 ^= iArr27[23];
        inverseLT();
        ib4(this.X0, this.X1, this.X2, this.X3);
        int i43 = this.X0;
        int[] iArr28 = this.wKey;
        this.X0 = i43 ^ iArr28[16];
        this.X1 ^= iArr28[17];
        this.X2 ^= iArr28[18];
        this.X3 ^= iArr28[19];
        inverseLT();
        ib3(this.X0, this.X1, this.X2, this.X3);
        int i44 = this.X0;
        int[] iArr29 = this.wKey;
        this.X0 = i44 ^ iArr29[12];
        this.X1 ^= iArr29[13];
        this.X2 ^= iArr29[14];
        this.X3 ^= iArr29[15];
        inverseLT();
        ib2(this.X0, this.X1, this.X2, this.X3);
        int i45 = this.X0;
        int[] iArr30 = this.wKey;
        this.X0 = i45 ^ iArr30[8];
        this.X1 ^= iArr30[9];
        this.X2 ^= iArr30[10];
        this.X3 ^= iArr30[11];
        inverseLT();
        ib1(this.X0, this.X1, this.X2, this.X3);
        int i46 = this.X0;
        int[] iArr31 = this.wKey;
        this.X0 = i46 ^ iArr31[4];
        this.X1 ^= iArr31[5];
        this.X2 ^= iArr31[6];
        this.X3 ^= iArr31[7];
        inverseLT();
        ib0(this.X0, this.X1, this.X2, this.X3);
        Pack.intToLittleEndian(this.X0 ^ this.wKey[0], bArr2, i12);
        Pack.intToLittleEndian(this.X1 ^ this.wKey[1], bArr2, i12 + 4);
        Pack.intToLittleEndian(this.X2 ^ this.wKey[2], bArr2, i12 + 8);
        Pack.intToLittleEndian(this.X3 ^ this.wKey[3], bArr2, i12 + 12);
    }

    @Override // org.spongycastle.crypto.engines.SerpentEngineBase
    protected void encryptBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        this.X0 = Pack.littleEndianToInt(bArr, i11);
        this.X1 = Pack.littleEndianToInt(bArr, i11 + 4);
        this.X2 = Pack.littleEndianToInt(bArr, i11 + 8);
        int littleEndianToInt = Pack.littleEndianToInt(bArr, i11 + 12);
        this.X3 = littleEndianToInt;
        int[] iArr = this.wKey;
        sb0(iArr[0] ^ this.X0, iArr[1] ^ this.X1, iArr[2] ^ this.X2, littleEndianToInt ^ iArr[3]);
        LT();
        int[] iArr2 = this.wKey;
        sb1(iArr2[4] ^ this.X0, iArr2[5] ^ this.X1, iArr2[6] ^ this.X2, iArr2[7] ^ this.X3);
        LT();
        int[] iArr3 = this.wKey;
        sb2(iArr3[8] ^ this.X0, iArr3[9] ^ this.X1, iArr3[10] ^ this.X2, iArr3[11] ^ this.X3);
        LT();
        int[] iArr4 = this.wKey;
        sb3(iArr4[12] ^ this.X0, iArr4[13] ^ this.X1, iArr4[14] ^ this.X2, iArr4[15] ^ this.X3);
        LT();
        int[] iArr5 = this.wKey;
        sb4(iArr5[16] ^ this.X0, iArr5[17] ^ this.X1, iArr5[18] ^ this.X2, iArr5[19] ^ this.X3);
        LT();
        int[] iArr6 = this.wKey;
        sb5(iArr6[20] ^ this.X0, iArr6[21] ^ this.X1, iArr6[22] ^ this.X2, iArr6[23] ^ this.X3);
        LT();
        int[] iArr7 = this.wKey;
        sb6(iArr7[24] ^ this.X0, iArr7[25] ^ this.X1, iArr7[26] ^ this.X2, iArr7[27] ^ this.X3);
        LT();
        int[] iArr8 = this.wKey;
        sb7(iArr8[28] ^ this.X0, iArr8[29] ^ this.X1, iArr8[30] ^ this.X2, iArr8[31] ^ this.X3);
        LT();
        int[] iArr9 = this.wKey;
        sb0(iArr9[32] ^ this.X0, iArr9[33] ^ this.X1, iArr9[34] ^ this.X2, iArr9[35] ^ this.X3);
        LT();
        int[] iArr10 = this.wKey;
        sb1(iArr10[36] ^ this.X0, iArr10[37] ^ this.X1, iArr10[38] ^ this.X2, iArr10[39] ^ this.X3);
        LT();
        int[] iArr11 = this.wKey;
        sb2(iArr11[40] ^ this.X0, iArr11[41] ^ this.X1, iArr11[42] ^ this.X2, iArr11[43] ^ this.X3);
        LT();
        int[] iArr12 = this.wKey;
        sb3(iArr12[44] ^ this.X0, iArr12[45] ^ this.X1, iArr12[46] ^ this.X2, iArr12[47] ^ this.X3);
        LT();
        int[] iArr13 = this.wKey;
        sb4(iArr13[48] ^ this.X0, iArr13[49] ^ this.X1, iArr13[50] ^ this.X2, iArr13[51] ^ this.X3);
        LT();
        int[] iArr14 = this.wKey;
        sb5(iArr14[52] ^ this.X0, iArr14[53] ^ this.X1, iArr14[54] ^ this.X2, iArr14[55] ^ this.X3);
        LT();
        int[] iArr15 = this.wKey;
        sb6(iArr15[56] ^ this.X0, iArr15[57] ^ this.X1, iArr15[58] ^ this.X2, iArr15[59] ^ this.X3);
        LT();
        int[] iArr16 = this.wKey;
        sb7(iArr16[60] ^ this.X0, iArr16[61] ^ this.X1, iArr16[62] ^ this.X2, iArr16[63] ^ this.X3);
        LT();
        int[] iArr17 = this.wKey;
        sb0(iArr17[64] ^ this.X0, iArr17[65] ^ this.X1, iArr17[66] ^ this.X2, iArr17[67] ^ this.X3);
        LT();
        int[] iArr18 = this.wKey;
        sb1(iArr18[68] ^ this.X0, iArr18[69] ^ this.X1, iArr18[70] ^ this.X2, iArr18[71] ^ this.X3);
        LT();
        int[] iArr19 = this.wKey;
        sb2(iArr19[72] ^ this.X0, iArr19[73] ^ this.X1, iArr19[74] ^ this.X2, iArr19[75] ^ this.X3);
        LT();
        int[] iArr20 = this.wKey;
        sb3(iArr20[76] ^ this.X0, iArr20[77] ^ this.X1, iArr20[78] ^ this.X2, iArr20[79] ^ this.X3);
        LT();
        int[] iArr21 = this.wKey;
        sb4(iArr21[80] ^ this.X0, iArr21[81] ^ this.X1, iArr21[82] ^ this.X2, iArr21[83] ^ this.X3);
        LT();
        int[] iArr22 = this.wKey;
        sb5(iArr22[84] ^ this.X0, iArr22[85] ^ this.X1, iArr22[86] ^ this.X2, iArr22[87] ^ this.X3);
        LT();
        int[] iArr23 = this.wKey;
        sb6(iArr23[88] ^ this.X0, iArr23[89] ^ this.X1, iArr23[90] ^ this.X2, iArr23[91] ^ this.X3);
        LT();
        int[] iArr24 = this.wKey;
        sb7(iArr24[92] ^ this.X0, iArr24[93] ^ this.X1, iArr24[94] ^ this.X2, iArr24[95] ^ this.X3);
        LT();
        int[] iArr25 = this.wKey;
        sb0(iArr25[96] ^ this.X0, iArr25[97] ^ this.X1, iArr25[98] ^ this.X2, iArr25[99] ^ this.X3);
        LT();
        int[] iArr26 = this.wKey;
        sb1(iArr26[100] ^ this.X0, iArr26[101] ^ this.X1, iArr26[102] ^ this.X2, iArr26[103] ^ this.X3);
        LT();
        int[] iArr27 = this.wKey;
        sb2(iArr27[104] ^ this.X0, iArr27[105] ^ this.X1, iArr27[106] ^ this.X2, iArr27[107] ^ this.X3);
        LT();
        int[] iArr28 = this.wKey;
        sb3(iArr28[108] ^ this.X0, iArr28[109] ^ this.X1, iArr28[110] ^ this.X2, iArr28[111] ^ this.X3);
        LT();
        int[] iArr29 = this.wKey;
        sb4(iArr29[112] ^ this.X0, iArr29[113] ^ this.X1, iArr29[114] ^ this.X2, iArr29[115] ^ this.X3);
        LT();
        int[] iArr30 = this.wKey;
        sb5(iArr30[116] ^ this.X0, iArr30[117] ^ this.X1, iArr30[118] ^ this.X2, iArr30[119] ^ this.X3);
        LT();
        int[] iArr31 = this.wKey;
        sb6(iArr31[120] ^ this.X0, iArr31[121] ^ this.X1, iArr31[122] ^ this.X2, iArr31[123] ^ this.X3);
        LT();
        int[] iArr32 = this.wKey;
        sb7(iArr32[124] ^ this.X0, iArr32[125] ^ this.X1, iArr32[126] ^ this.X2, iArr32[127] ^ this.X3);
        Pack.intToLittleEndian(this.wKey[128] ^ this.X0, bArr2, i12);
        Pack.intToLittleEndian(this.wKey[129] ^ this.X1, bArr2, i12 + 4);
        Pack.intToLittleEndian(this.wKey[130] ^ this.X2, bArr2, i12 + 8);
        Pack.intToLittleEndian(this.wKey[131] ^ this.X3, bArr2, i12 + 12);
    }

    @Override // org.spongycastle.crypto.engines.SerpentEngineBase
    protected int[] makeWorkingKey(byte[] bArr) {
        int[] iArr = new int[16];
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i11 + 4;
            if (i13 >= bArr.length) {
                break;
            }
            iArr[i12] = Pack.littleEndianToInt(bArr, i11);
            i11 = i13;
            i12++;
        }
        if (i11 % 4 == 0) {
            int i14 = i12 + 1;
            iArr[i12] = Pack.littleEndianToInt(bArr, i11);
            if (i14 < 8) {
                iArr[i14] = 1;
            }
            int[] iArr2 = new int[132];
            for (int i15 = 8; i15 < 16; i15++) {
                int i16 = i15 - 8;
                iArr[i15] = SerpentEngineBase.rotateLeft(((-1640531527) ^ (((iArr[i16] ^ iArr[i15 - 5]) ^ iArr[i15 - 3]) ^ iArr[i15 - 1])) ^ i16, 11);
            }
            System.arraycopy(iArr, 8, iArr2, 0, 8);
            for (int i17 = 8; i17 < 132; i17++) {
                iArr2[i17] = SerpentEngineBase.rotateLeft(((((iArr2[i17 - 8] ^ iArr2[i17 - 5]) ^ iArr2[i17 - 3]) ^ iArr2[i17 - 1]) ^ (-1640531527)) ^ i17, 11);
            }
            sb3(iArr2[0], iArr2[1], iArr2[2], iArr2[3]);
            iArr2[0] = this.X0;
            iArr2[1] = this.X1;
            iArr2[2] = this.X2;
            iArr2[3] = this.X3;
            sb2(iArr2[4], iArr2[5], iArr2[6], iArr2[7]);
            iArr2[4] = this.X0;
            iArr2[5] = this.X1;
            iArr2[6] = this.X2;
            iArr2[7] = this.X3;
            sb1(iArr2[8], iArr2[9], iArr2[10], iArr2[11]);
            iArr2[8] = this.X0;
            iArr2[9] = this.X1;
            iArr2[10] = this.X2;
            iArr2[11] = this.X3;
            sb0(iArr2[12], iArr2[13], iArr2[14], iArr2[15]);
            iArr2[12] = this.X0;
            iArr2[13] = this.X1;
            iArr2[14] = this.X2;
            iArr2[15] = this.X3;
            sb7(iArr2[16], iArr2[17], iArr2[18], iArr2[19]);
            iArr2[16] = this.X0;
            iArr2[17] = this.X1;
            iArr2[18] = this.X2;
            iArr2[19] = this.X3;
            sb6(iArr2[20], iArr2[21], iArr2[22], iArr2[23]);
            iArr2[20] = this.X0;
            iArr2[21] = this.X1;
            iArr2[22] = this.X2;
            iArr2[23] = this.X3;
            sb5(iArr2[24], iArr2[25], iArr2[26], iArr2[27]);
            iArr2[24] = this.X0;
            iArr2[25] = this.X1;
            iArr2[26] = this.X2;
            iArr2[27] = this.X3;
            sb4(iArr2[28], iArr2[29], iArr2[30], iArr2[31]);
            iArr2[28] = this.X0;
            iArr2[29] = this.X1;
            iArr2[30] = this.X2;
            iArr2[31] = this.X3;
            sb3(iArr2[32], iArr2[33], iArr2[34], iArr2[35]);
            iArr2[32] = this.X0;
            iArr2[33] = this.X1;
            iArr2[34] = this.X2;
            iArr2[35] = this.X3;
            sb2(iArr2[36], iArr2[37], iArr2[38], iArr2[39]);
            iArr2[36] = this.X0;
            iArr2[37] = this.X1;
            iArr2[38] = this.X2;
            iArr2[39] = this.X3;
            sb1(iArr2[40], iArr2[41], iArr2[42], iArr2[43]);
            iArr2[40] = this.X0;
            iArr2[41] = this.X1;
            iArr2[42] = this.X2;
            iArr2[43] = this.X3;
            sb0(iArr2[44], iArr2[45], iArr2[46], iArr2[47]);
            iArr2[44] = this.X0;
            iArr2[45] = this.X1;
            iArr2[46] = this.X2;
            iArr2[47] = this.X3;
            sb7(iArr2[48], iArr2[49], iArr2[50], iArr2[51]);
            iArr2[48] = this.X0;
            iArr2[49] = this.X1;
            iArr2[50] = this.X2;
            iArr2[51] = this.X3;
            sb6(iArr2[52], iArr2[53], iArr2[54], iArr2[55]);
            iArr2[52] = this.X0;
            iArr2[53] = this.X1;
            iArr2[54] = this.X2;
            iArr2[55] = this.X3;
            sb5(iArr2[56], iArr2[57], iArr2[58], iArr2[59]);
            iArr2[56] = this.X0;
            iArr2[57] = this.X1;
            iArr2[58] = this.X2;
            iArr2[59] = this.X3;
            sb4(iArr2[60], iArr2[61], iArr2[62], iArr2[63]);
            iArr2[60] = this.X0;
            iArr2[61] = this.X1;
            iArr2[62] = this.X2;
            iArr2[63] = this.X3;
            sb3(iArr2[64], iArr2[65], iArr2[66], iArr2[67]);
            iArr2[64] = this.X0;
            iArr2[65] = this.X1;
            iArr2[66] = this.X2;
            iArr2[67] = this.X3;
            sb2(iArr2[68], iArr2[69], iArr2[70], iArr2[71]);
            iArr2[68] = this.X0;
            iArr2[69] = this.X1;
            iArr2[70] = this.X2;
            iArr2[71] = this.X3;
            sb1(iArr2[72], iArr2[73], iArr2[74], iArr2[75]);
            iArr2[72] = this.X0;
            iArr2[73] = this.X1;
            iArr2[74] = this.X2;
            iArr2[75] = this.X3;
            sb0(iArr2[76], iArr2[77], iArr2[78], iArr2[79]);
            iArr2[76] = this.X0;
            iArr2[77] = this.X1;
            iArr2[78] = this.X2;
            iArr2[79] = this.X3;
            sb7(iArr2[80], iArr2[81], iArr2[82], iArr2[83]);
            iArr2[80] = this.X0;
            iArr2[81] = this.X1;
            iArr2[82] = this.X2;
            iArr2[83] = this.X3;
            sb6(iArr2[84], iArr2[85], iArr2[86], iArr2[87]);
            iArr2[84] = this.X0;
            iArr2[85] = this.X1;
            iArr2[86] = this.X2;
            iArr2[87] = this.X3;
            sb5(iArr2[88], iArr2[89], iArr2[90], iArr2[91]);
            iArr2[88] = this.X0;
            iArr2[89] = this.X1;
            iArr2[90] = this.X2;
            iArr2[91] = this.X3;
            sb4(iArr2[92], iArr2[93], iArr2[94], iArr2[95]);
            iArr2[92] = this.X0;
            iArr2[93] = this.X1;
            iArr2[94] = this.X2;
            iArr2[95] = this.X3;
            sb3(iArr2[96], iArr2[97], iArr2[98], iArr2[99]);
            iArr2[96] = this.X0;
            iArr2[97] = this.X1;
            iArr2[98] = this.X2;
            iArr2[99] = this.X3;
            sb2(iArr2[100], iArr2[101], iArr2[102], iArr2[103]);
            iArr2[100] = this.X0;
            iArr2[101] = this.X1;
            iArr2[102] = this.X2;
            iArr2[103] = this.X3;
            sb1(iArr2[104], iArr2[105], iArr2[106], iArr2[107]);
            iArr2[104] = this.X0;
            iArr2[105] = this.X1;
            iArr2[106] = this.X2;
            iArr2[107] = this.X3;
            sb0(iArr2[108], iArr2[109], iArr2[110], iArr2[111]);
            iArr2[108] = this.X0;
            iArr2[109] = this.X1;
            iArr2[110] = this.X2;
            iArr2[111] = this.X3;
            sb7(iArr2[112], iArr2[113], iArr2[114], iArr2[115]);
            iArr2[112] = this.X0;
            iArr2[113] = this.X1;
            iArr2[114] = this.X2;
            iArr2[115] = this.X3;
            sb6(iArr2[116], iArr2[117], iArr2[118], iArr2[119]);
            iArr2[116] = this.X0;
            iArr2[117] = this.X1;
            iArr2[118] = this.X2;
            iArr2[119] = this.X3;
            sb5(iArr2[120], iArr2[121], iArr2[122], iArr2[123]);
            iArr2[120] = this.X0;
            iArr2[121] = this.X1;
            iArr2[122] = this.X2;
            iArr2[123] = this.X3;
            sb4(iArr2[124], iArr2[125], iArr2[126], iArr2[127]);
            iArr2[124] = this.X0;
            iArr2[125] = this.X1;
            iArr2[126] = this.X2;
            iArr2[127] = this.X3;
            sb3(iArr2[128], iArr2[129], iArr2[130], iArr2[131]);
            iArr2[128] = this.X0;
            iArr2[129] = this.X1;
            iArr2[130] = this.X2;
            iArr2[131] = this.X3;
            return iArr2;
        }
        throw new IllegalArgumentException("key must be a multiple of 4 bytes");
    }
}