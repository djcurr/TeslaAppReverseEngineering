package s60;

/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f50303a = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};

    public static void A(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i21 = iArr[9];
        int i22 = iArr[10];
        int i23 = iArr[11];
        int i24 = iArr[12];
        int i25 = iArr[13];
        int i26 = iArr[14];
        int i27 = iArr[15];
        int i28 = iArr2[0];
        int i29 = iArr2[1];
        int i31 = iArr2[2];
        int i32 = iArr2[3];
        int i33 = iArr2[4];
        int i34 = iArr2[5];
        int i35 = iArr2[6];
        int i36 = iArr2[7];
        int i37 = iArr2[8];
        int i38 = iArr2[9];
        int i39 = iArr2[10];
        int i41 = iArr2[11];
        int i42 = iArr2[12];
        int i43 = iArr2[13];
        int i44 = iArr2[14];
        int i45 = iArr2[15];
        int i46 = i11 + i19;
        int i47 = i13 + i22;
        int i48 = i14 + i23;
        int i49 = i15 + i24;
        int i51 = i16 + i25;
        int i52 = i17 + i26;
        int i53 = i28 + i37;
        int i54 = i29 + i38;
        int i55 = i31 + i39;
        int i56 = i32 + i41;
        int i57 = i33 + i42;
        int i58 = i34 + i43;
        int i59 = i35 + i44;
        int i61 = i36 + i45;
        long j11 = i11;
        long j12 = i28;
        long j13 = j11 * j12;
        long j14 = i18;
        long j15 = i29;
        long j16 = j14 * j15;
        long j17 = i17;
        long j18 = i31;
        long j19 = i16;
        long j21 = i32;
        long j22 = i15;
        long j23 = i33;
        long j24 = i14;
        long j25 = i34;
        long j26 = i13;
        long j27 = i35;
        long j28 = i12;
        long j29 = i36;
        long j31 = i19;
        long j32 = i37;
        long j33 = j31 * j32;
        long j34 = i27;
        long j35 = i38;
        long j36 = j34 * j35;
        long j37 = i26;
        long j38 = i39;
        long j39 = i25;
        long j41 = i41;
        long j42 = i24;
        long j43 = i42;
        long j44 = i23;
        long j45 = i43;
        long j46 = i22;
        long j47 = i44;
        long j48 = i21;
        long j49 = i45;
        long j51 = i46;
        long j52 = i53;
        long j53 = j51 * j52;
        long j54 = i18 + i27;
        long j55 = i54;
        long j56 = j54 * j55;
        long j57 = i52;
        long j58 = i55;
        long j59 = i51;
        long j61 = i56;
        long j62 = i49;
        long j63 = i57;
        long j64 = i48;
        long j65 = i58;
        long j66 = i47;
        long j67 = i59;
        long j68 = i12 + i21;
        long j69 = i61;
        long j71 = j56 + (j57 * j58) + (j59 * j61) + (j62 * j63) + (j64 * j65) + (j66 * j67) + (j68 * j69);
        long j72 = ((j13 + j33) + j71) - ((((((j16 + (j17 * j18)) + (j19 * j21)) + (j22 * j23)) + (j24 * j25)) + (j26 * j27)) + (j28 * j29));
        int i62 = ((int) j72) & 268435455;
        long j73 = j72 >>> 28;
        long j74 = ((((((((j36 + (j37 * j38)) + (j39 * j41)) + (j42 * j43)) + (j44 * j45)) + (j46 * j47)) + (j48 * j49)) + j53) - j13) + j71;
        int i63 = ((int) j74) & 268435455;
        long j75 = (j28 * j12) + (j11 * j15);
        long j76 = (j34 * j38) + (j37 * j41) + (j39 * j43) + (j42 * j45) + (j44 * j47) + (j46 * j49);
        long j77 = (j68 * j52) + (j51 * j55);
        long j78 = (j54 * j58) + (j57 * j61) + (j59 * j63) + (j62 * j65) + (j64 * j67) + (j66 * j69);
        long j79 = j73 + (((j75 + ((j48 * j32) + (j31 * j35))) + j78) - ((((((j14 * j18) + (j17 * j21)) + (j19 * j23)) + (j22 * j25)) + (j24 * j27)) + (j26 * j29)));
        int i64 = ((int) j79) & 268435455;
        long j81 = (j74 >>> 28) + ((j76 + j77) - j75) + j78;
        int i65 = ((int) j81) & 268435455;
        long j82 = (j26 * j12) + (j28 * j15) + (j11 * j18);
        long j83 = (j34 * j41) + (j37 * j43) + (j39 * j45) + (j42 * j47) + (j44 * j49);
        long j84 = (j66 * j52) + (j68 * j55) + (j51 * j58);
        long j85 = (j54 * j61) + (j57 * j63) + (j59 * j65) + (j62 * j67) + (j64 * j69);
        long j86 = (j79 >>> 28) + (((j82 + (((j46 * j32) + (j48 * j35)) + (j31 * j38))) + j85) - (((((j14 * j21) + (j17 * j23)) + (j19 * j25)) + (j22 * j27)) + (j24 * j29)));
        int i66 = ((int) j86) & 268435455;
        long j87 = (j81 >>> 28) + ((j83 + j84) - j82) + j85;
        int i67 = ((int) j87) & 268435455;
        long j88 = (j24 * j12) + (j26 * j15) + (j28 * j18) + (j11 * j21);
        long j89 = (j34 * j43) + (j37 * j45) + (j39 * j47) + (j42 * j49);
        long j90 = (j64 * j52) + (j66 * j55) + (j68 * j58) + (j51 * j61);
        long j91 = (j54 * j63) + (j57 * j65) + (j59 * j67) + (j62 * j69);
        long j92 = (j86 >>> 28) + (((j88 + ((((j44 * j32) + (j46 * j35)) + (j48 * j38)) + (j31 * j41))) + j91) - ((((j14 * j23) + (j17 * j25)) + (j19 * j27)) + (j22 * j29)));
        int i68 = ((int) j92) & 268435455;
        long j93 = (j87 >>> 28) + ((j89 + j90) - j88) + j91;
        int i69 = ((int) j93) & 268435455;
        long j94 = (j22 * j12) + (j24 * j15) + (j26 * j18) + (j28 * j21) + (j11 * j23);
        long j95 = (j34 * j45) + (j37 * j47) + (j39 * j49);
        long j96 = (j62 * j52) + (j64 * j55) + (j66 * j58) + (j68 * j61) + (j51 * j63);
        long j97 = (j54 * j65) + (j57 * j67) + (j59 * j69);
        long j98 = (j92 >>> 28) + (((j94 + (((((j42 * j32) + (j44 * j35)) + (j46 * j38)) + (j48 * j41)) + (j31 * j43))) + j97) - (((j14 * j25) + (j17 * j27)) + (j19 * j29)));
        int i71 = ((int) j98) & 268435455;
        long j99 = (j93 >>> 28) + ((j95 + j96) - j94) + j97;
        int i72 = ((int) j99) & 268435455;
        long j100 = (j19 * j12) + (j22 * j15) + (j24 * j18) + (j26 * j21) + (j28 * j23) + (j11 * j25);
        long j101 = (j34 * j47) + (j37 * j49);
        long j102 = (j59 * j52) + (j62 * j55) + (j64 * j58) + (j66 * j61) + (j68 * j63) + (j51 * j65);
        long j103 = (j54 * j67) + (j57 * j69);
        long j104 = (j98 >>> 28) + (((j100 + ((((((j39 * j32) + (j42 * j35)) + (j44 * j38)) + (j46 * j41)) + (j48 * j43)) + (j31 * j45))) + j103) - ((j14 * j27) + (j17 * j29)));
        int i73 = ((int) j104) & 268435455;
        long j105 = (j99 >>> 28) + ((j101 + j102) - j100) + j103;
        int i74 = ((int) j105) & 268435455;
        long j106 = (j17 * j12) + (j19 * j15) + (j22 * j18) + (j24 * j21) + (j26 * j23) + (j28 * j25) + (j11 * j27);
        long j107 = j34 * j49;
        long j108 = (j57 * j52) + (j59 * j55) + (j62 * j58) + (j64 * j61) + (j66 * j63) + (j68 * j65) + (j51 * j67);
        long j109 = j54 * j69;
        long j110 = (j104 >>> 28) + (((j106 + (((((((j37 * j32) + (j39 * j35)) + (j42 * j38)) + (j44 * j41)) + (j46 * j43)) + (j48 * j45)) + (j31 * j47))) + j109) - (j14 * j29));
        int i75 = ((int) j110) & 268435455;
        long j111 = (j105 >>> 28) + ((j107 + j108) - j106) + j109;
        long j112 = (j12 * j14) + (j15 * j17) + (j19 * j18) + (j22 * j21) + (j24 * j23) + (j26 * j25) + (j28 * j27) + (j11 * j29);
        long j113 = (j54 * j52) + (j57 * j55) + (j59 * j58) + (j62 * j61) + (j64 * j63) + (j66 * j65) + (j68 * j67) + (j51 * j69);
        long j114 = (j110 >>> 28) + j112 + (j34 * j32) + (j35 * j37) + (j39 * j38) + (j42 * j41) + (j44 * j43) + (j46 * j45) + (j48 * j47) + (j31 * j49);
        long j115 = (j111 >>> 28) + (j113 - j112);
        long j116 = j115 >>> 28;
        long j117 = (j114 >>> 28) + j116 + i63;
        long j118 = j116 + i62;
        iArr3[0] = ((int) j118) & 268435455;
        iArr3[1] = i64 + ((int) (j118 >>> 28));
        iArr3[2] = i66;
        iArr3[3] = i68;
        iArr3[4] = i71;
        iArr3[5] = i73;
        iArr3[6] = i75;
        iArr3[7] = ((int) j114) & 268435455;
        iArr3[8] = ((int) j117) & 268435455;
        iArr3[9] = i65 + ((int) (j117 >>> 28));
        iArr3[10] = i67;
        iArr3[11] = i69;
        iArr3[12] = i72;
        iArr3[13] = i74;
        iArr3[14] = ((int) j111) & 268435455;
        iArr3[15] = ((int) j115) & 268435455;
    }

    public static void B(int[] iArr, int[] iArr2) {
        J(g(), iArr, iArr2);
    }

    public static void C(int[] iArr) {
        F(iArr, 1);
        F(iArr, -1);
    }

    public static void D(int[] iArr) {
        iArr[0] = 1;
        for (int i11 = 1; i11 < 16; i11++) {
            iArr[i11] = 0;
        }
    }

    private static void E(int[] iArr, int[] iArr2) {
        int[] g11 = g();
        H(iArr, g11);
        A(iArr, g11, g11);
        int[] g12 = g();
        H(g11, g12);
        A(iArr, g12, g12);
        int[] g13 = g();
        G(g12, 3, g13);
        A(g12, g13, g13);
        int[] g14 = g();
        G(g13, 3, g14);
        A(g12, g14, g14);
        int[] g15 = g();
        G(g14, 9, g15);
        A(g14, g15, g15);
        int[] g16 = g();
        H(g15, g16);
        A(iArr, g16, g16);
        int[] g17 = g();
        G(g16, 18, g17);
        A(g15, g17, g17);
        int[] g18 = g();
        G(g17, 37, g18);
        A(g17, g18, g18);
        int[] g19 = g();
        G(g18, 37, g19);
        A(g17, g19, g19);
        int[] g21 = g();
        G(g19, 111, g21);
        A(g19, g21, g21);
        int[] g22 = g();
        H(g21, g22);
        A(iArr, g22, g22);
        int[] g23 = g();
        G(g22, 223, g23);
        A(g23, g21, iArr2);
    }

    private static void F(int[] iArr, int i11) {
        int i12;
        int i13 = iArr[15];
        int i14 = i13 & 268435455;
        long j11 = (i13 >>> 28) + i11;
        int i15 = 0;
        long j12 = j11;
        while (true) {
            if (i15 >= 8) {
                break;
            }
            long j13 = j12 + (4294967295L & iArr[i15]);
            iArr[i15] = ((int) j13) & 268435455;
            j12 = j13 >> 28;
            i15++;
        }
        long j14 = j12 + j11;
        for (i12 = 8; i12 < 15; i12++) {
            long j15 = j14 + (iArr[i12] & 4294967295L);
            iArr[i12] = ((int) j15) & 268435455;
            j14 = j15 >> 28;
        }
        iArr[15] = i14 + ((int) j14);
    }

    public static void G(int[] iArr, int i11, int[] iArr2) {
        H(iArr, iArr2);
        while (true) {
            i11--;
            if (i11 <= 0) {
                return;
            }
            H(iArr2, iArr2);
        }
    }

    public static void H(int[] iArr, int[] iArr2) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i21 = iArr[9];
        int i22 = iArr[10];
        int i23 = iArr[11];
        int i24 = iArr[12];
        int i25 = iArr[13];
        int i26 = iArr[14];
        int i27 = iArr[15];
        int i28 = i11 * 2;
        int i29 = i12 * 2;
        int i31 = i13 * 2;
        int i32 = i14 * 2;
        int i33 = i15 * 2;
        int i34 = i16 * 2;
        int i35 = i17 * 2;
        int i36 = i19 * 2;
        int i37 = i21 * 2;
        int i38 = i22 * 2;
        int i39 = i23 * 2;
        int i41 = i24 * 2;
        int i42 = i25 * 2;
        int i43 = i26 * 2;
        int i44 = i11 + i19;
        int i45 = i12 + i21;
        int i46 = i13 + i22;
        int i47 = i14 + i23;
        int i48 = i15 + i24;
        int i49 = i16 + i25;
        int i51 = i17 + i26;
        int i52 = i18 + i27;
        int i53 = i44 * 2;
        int i54 = i45 * 2;
        int i55 = i46 * 2;
        int i56 = i47 * 2;
        int i57 = i49 * 2;
        long j11 = i11;
        long j12 = j11 * j11;
        long j13 = i18;
        long j14 = i29;
        long j15 = j13 * j14;
        long j16 = i17;
        long j17 = i31;
        long j18 = i16;
        long j19 = i32;
        long j21 = i15;
        long j22 = i19;
        long j23 = i27;
        long j24 = i37;
        long j25 = j23 * j24;
        long j26 = i26;
        long j27 = i38;
        long j28 = i25;
        long j29 = i39;
        long j31 = i24;
        long j32 = i44;
        long j33 = i52;
        long j34 = i54 & 4294967295L;
        long j35 = j33 * j34;
        long j36 = i51;
        long j37 = i55 & 4294967295L;
        long j38 = i49;
        long j39 = i56 & 4294967295L;
        long j41 = i48;
        long j42 = j35 + (j36 * j37) + (j38 * j39) + (j41 * j41);
        long j43 = ((j12 + (j22 * j22)) + j42) - (((j15 + (j16 * j17)) + (j18 * j19)) + (j21 * j21));
        int i58 = ((int) j43) & 268435455;
        long j44 = (((((j25 + (j26 * j27)) + (j28 * j29)) + (j31 * j31)) + (j32 * j32)) - j12) + j42;
        int i59 = ((int) j44) & 268435455;
        long j45 = j44 >>> 28;
        long j46 = i12;
        long j47 = i28;
        long j48 = j46 * j47;
        long j49 = i33;
        long j51 = i21;
        long j52 = i36;
        long j53 = j51 * j52;
        long j54 = i41;
        long j55 = i45;
        long j56 = i53 & 4294967295L;
        long j57 = (i48 * 2) & 4294967295L;
        long j58 = (j33 * j37) + (j36 * j39) + (j38 * j57);
        long j59 = (j43 >>> 28) + (((j48 + j53) + j58) - (((j13 * j17) + (j16 * j19)) + (j18 * j49)));
        int i61 = ((int) j59) & 268435455;
        long j61 = j45 + (((((j23 * j27) + (j26 * j29)) + (j28 * j54)) + (j55 * j56)) - j48) + j58;
        int i62 = ((int) j61) & 268435455;
        long j62 = j61 >>> 28;
        long j63 = i13;
        long j64 = (j63 * j47) + (j46 * j46);
        long j65 = (j13 * j19) + (j16 * j49) + (j18 * j18);
        long j66 = i22;
        long j67 = (j66 * j52) + (j51 * j51);
        long j68 = i46;
        long j69 = (j68 * j56) + (j55 * j55);
        long j71 = (j33 * j39) + (j36 * j57) + (j38 * j38);
        long j72 = (j59 >>> 28) + (((j64 + j67) + j71) - j65);
        int i63 = ((int) j72) & 268435455;
        long j73 = j62 + (((((j23 * j29) + (j26 * j54)) + (j28 * j28)) + j69) - j64) + j71;
        int i64 = ((int) j73) & 268435455;
        long j74 = i14;
        long j75 = (j74 * j47) + (j63 * j14);
        long j76 = i34;
        long j77 = i23;
        long j78 = (j77 * j52) + (j66 * j24);
        long j79 = i42;
        long j81 = i47;
        long j82 = j57 * j33;
        long j83 = i57 & 4294967295L;
        long j84 = j82 + (j36 * j83);
        long j85 = (j72 >>> 28) + (((j75 + j78) + j84) - ((j13 * j49) + (j16 * j76)));
        int i65 = ((int) j85) & 268435455;
        long j86 = (j73 >>> 28) + ((((j23 * j54) + (j26 * j79)) + ((j81 * j56) + (j68 * j34))) - j75) + j84;
        int i66 = ((int) j86) & 268435455;
        long j87 = (j21 * j47) + (j74 * j14) + (j63 * j63);
        long j88 = (j31 * j52) + (j77 * j24) + (j66 * j66);
        long j89 = (j41 * j56) + (j81 * j34) + (j68 * j68);
        long j90 = (j33 * j83) + (j36 * j36);
        long j91 = (j85 >>> 28) + (((j87 + j88) + j90) - ((j13 * j76) + (j16 * j16)));
        int i67 = ((int) j91) & 268435455;
        long j92 = (j86 >>> 28) + ((((j23 * j79) + (j26 * j26)) + j89) - j87) + j90;
        int i68 = ((int) j92) & 268435455;
        long j93 = (j18 * j47) + (j21 * j14) + (j74 * j17);
        long j94 = (j28 * j52) + (j31 * j24) + (j77 * j27);
        long j95 = ((i51 * 2) & 4294967295L) * j33;
        long j96 = (j91 >>> 28) + (((j93 + j94) + j95) - (i35 * j13));
        long j97 = (j92 >>> 28) + (((i43 * j23) + (((j38 * j56) + (j41 * j34)) + (j81 * j37))) - j93) + j95;
        long j98 = (j16 * j47) + (j18 * j14) + (j21 * j17) + (j74 * j74);
        long j99 = j33 * j33;
        long j100 = (j96 >>> 28) + (((j98 + ((((j26 * j52) + (j28 * j24)) + (j31 * j27)) + (j77 * j77))) + j99) - (j13 * j13));
        long j101 = (j97 >>> 28) + (((j23 * j23) + ((((j36 * j56) + (j38 * j34)) + (j41 * j37)) + (j81 * j81))) - j98) + j99;
        long j102 = (j13 * j47) + (j16 * j14) + (j18 * j17) + (j21 * j19);
        long j103 = (j100 >>> 28) + (j52 * j23) + (j26 * j24) + (j28 * j27) + (j31 * j29) + j102;
        long j104 = (j101 >>> 28) + (((((j56 * j33) + (j36 * j34)) + (j38 * j37)) + (j41 * j39)) - j102);
        long j105 = j104 >>> 28;
        long j106 = (j103 >>> 28) + j105 + i59;
        long j107 = j105 + i58;
        iArr2[0] = ((int) j107) & 268435455;
        iArr2[1] = i61 + ((int) (j107 >>> 28));
        iArr2[2] = i63;
        iArr2[3] = i65;
        iArr2[4] = i67;
        iArr2[5] = ((int) j96) & 268435455;
        iArr2[6] = ((int) j100) & 268435455;
        iArr2[7] = ((int) j103) & 268435455;
        iArr2[8] = ((int) j106) & 268435455;
        iArr2[9] = i62 + ((int) (j106 >>> 28));
        iArr2[10] = i64;
        iArr2[11] = i66;
        iArr2[12] = i68;
        iArr2[13] = ((int) j97) & 268435455;
        iArr2[14] = ((int) j101) & 268435455;
        iArr2[15] = ((int) j104) & 268435455;
    }

    public static boolean I(int[] iArr, int[] iArr2, int[] iArr3) {
        int[] g11 = g();
        int[] g12 = g();
        H(iArr, g11);
        A(g11, iArr2, g11);
        H(g11, g12);
        A(g11, iArr, g11);
        A(g12, iArr, g12);
        A(g12, iArr2, g12);
        int[] g13 = g();
        E(g12, g13);
        A(g13, g11, g13);
        int[] g14 = g();
        H(g13, g14);
        A(g14, iArr2, g14);
        J(iArr, g14, g14);
        C(g14);
        if (y(g14)) {
            f(g13, 0, iArr3, 0);
            return true;
        }
        return false;
    }

    public static void J(int[] iArr, int[] iArr2, int[] iArr3) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i21 = iArr[9];
        int i22 = iArr[10];
        int i23 = iArr[11];
        int i24 = iArr[12];
        int i25 = iArr[13];
        int i26 = iArr[14];
        int i27 = iArr[15];
        int i28 = iArr2[0];
        int i29 = iArr2[1];
        int i31 = iArr2[2];
        int i32 = iArr2[3];
        int i33 = iArr2[4];
        int i34 = iArr2[5];
        int i35 = iArr2[6];
        int i36 = iArr2[7];
        int i37 = iArr2[8];
        int i38 = iArr2[9];
        int i39 = iArr2[10];
        int i41 = iArr2[11];
        int i42 = iArr2[12];
        int i43 = iArr2[13];
        int i44 = (i12 + 536870910) - i29;
        int i45 = (i16 + 536870910) - i34;
        int i46 = (i21 + 536870910) - i38;
        int i47 = (i25 + 536870910) - i43;
        int i48 = ((i13 + 536870910) - i31) + (i44 >>> 28);
        int i49 = ((i17 + 536870910) - i35) + (i45 >>> 28);
        int i51 = ((i22 + 536870910) - i39) + (i46 >>> 28);
        int i52 = ((i26 + 536870910) - iArr2[14]) + (i47 >>> 28);
        int i53 = ((i14 + 536870910) - i32) + (i48 >>> 28);
        int i54 = ((i18 + 536870910) - i36) + (i49 >>> 28);
        int i55 = ((i23 + 536870910) - i41) + (i51 >>> 28);
        int i56 = ((i27 + 536870910) - iArr2[15]) + (i52 >>> 28);
        int i57 = i56 >>> 28;
        int i58 = ((i11 + 536870910) - i28) + i57;
        int i59 = ((i15 + 536870910) - i33) + (i53 >>> 28);
        int i61 = ((i19 + 536870908) - i37) + i57 + (i54 >>> 28);
        int i62 = ((i24 + 536870910) - i42) + (i55 >>> 28);
        iArr3[0] = i58 & 268435455;
        iArr3[1] = (i44 & 268435455) + (i58 >>> 28);
        iArr3[2] = i48 & 268435455;
        iArr3[3] = i53 & 268435455;
        iArr3[4] = i59 & 268435455;
        iArr3[5] = (i45 & 268435455) + (i59 >>> 28);
        iArr3[6] = i49 & 268435455;
        iArr3[7] = i54 & 268435455;
        iArr3[8] = i61 & 268435455;
        iArr3[9] = (i46 & 268435455) + (i61 >>> 28);
        iArr3[10] = i51 & 268435455;
        iArr3[11] = i55 & 268435455;
        iArr3[12] = i62 & 268435455;
        iArr3[13] = (i47 & 268435455) + (i62 >>> 28);
        iArr3[14] = i52 & 268435455;
        iArr3[15] = i56 & 268435455;
    }

    public static void K(int[] iArr) {
        int[] g11 = g();
        g11[0] = 1;
        J(iArr, g11, iArr);
    }

    public static void L(int[] iArr) {
        for (int i11 = 0; i11 < 16; i11++) {
            iArr[i11] = 0;
        }
    }

    public static void a(int[] iArr, int[] iArr2, int[] iArr3) {
        for (int i11 = 0; i11 < 16; i11++) {
            iArr3[i11] = iArr[i11] + iArr2[i11];
        }
    }

    public static void b(int[] iArr) {
        iArr[0] = iArr[0] + 1;
    }

    public static void c(int[] iArr) {
        int i11 = iArr[0];
        int i12 = iArr[1];
        int i13 = iArr[2];
        int i14 = iArr[3];
        int i15 = iArr[4];
        int i16 = iArr[5];
        int i17 = iArr[6];
        int i18 = iArr[7];
        int i19 = iArr[8];
        int i21 = iArr[9];
        int i22 = iArr[10];
        int i23 = iArr[11];
        int i24 = iArr[12];
        int i25 = iArr[13];
        int i26 = i12 + (i11 >>> 28);
        int i27 = i16 + (i15 >>> 28);
        int i28 = i21 + (i19 >>> 28);
        int i29 = i25 + (i24 >>> 28);
        int i31 = i13 + (i26 >>> 28);
        int i32 = i17 + (i27 >>> 28);
        int i33 = i22 + (i28 >>> 28);
        int i34 = iArr[14] + (i29 >>> 28);
        int i35 = i14 + (i31 >>> 28);
        int i36 = i18 + (i32 >>> 28);
        int i37 = i23 + (i33 >>> 28);
        int i38 = iArr[15] + (i34 >>> 28);
        int i39 = i38 >>> 28;
        int i41 = (i11 & 268435455) + i39;
        int i42 = (i15 & 268435455) + (i35 >>> 28);
        int i43 = (i19 & 268435455) + i39 + (i36 >>> 28);
        int i44 = (i24 & 268435455) + (i37 >>> 28);
        iArr[0] = i41 & 268435455;
        iArr[1] = (i26 & 268435455) + (i41 >>> 28);
        iArr[2] = i31 & 268435455;
        iArr[3] = i35 & 268435455;
        iArr[4] = i42 & 268435455;
        iArr[5] = (i27 & 268435455) + (i42 >>> 28);
        iArr[6] = i32 & 268435455;
        iArr[7] = i36 & 268435455;
        iArr[8] = i43 & 268435455;
        iArr[9] = (i28 & 268435455) + (i43 >>> 28);
        iArr[10] = i33 & 268435455;
        iArr[11] = i37 & 268435455;
        iArr[12] = i44 & 268435455;
        iArr[13] = (i29 & 268435455) + (i44 >>> 28);
        iArr[14] = i34 & 268435455;
        iArr[15] = i38 & 268435455;
    }

    public static void d(int i11, int[] iArr, int i12, int[] iArr2, int i13) {
        for (int i14 = 0; i14 < 16; i14++) {
            int i15 = i13 + i14;
            int i16 = iArr2[i15];
            iArr2[i15] = i16 ^ ((iArr[i12 + i14] ^ i16) & i11);
        }
    }

    public static void e(int i11, int[] iArr) {
        int[] g11 = g();
        J(g11, iArr, g11);
        d(-i11, g11, 0, iArr, 0);
    }

    public static void f(int[] iArr, int i11, int[] iArr2, int i12) {
        for (int i13 = 0; i13 < 16; i13++) {
            iArr2[i12 + i13] = iArr[i11 + i13];
        }
    }

    public static int[] g() {
        return new int[16];
    }

    public static int[] h(int i11) {
        return new int[i11 * 16];
    }

    public static void i(int i11, int[] iArr, int[] iArr2) {
        int i12 = 0 - i11;
        for (int i13 = 0; i13 < 16; i13++) {
            int i14 = iArr[i13];
            int i15 = iArr2[i13];
            int i16 = (i14 ^ i15) & i12;
            iArr[i13] = i14 ^ i16;
            iArr2[i13] = i15 ^ i16;
        }
    }

    public static void j(byte[] bArr, int i11, int[] iArr) {
        o(bArr, i11, iArr, 0);
        o(bArr, i11 + 7, iArr, 2);
        o(bArr, i11 + 14, iArr, 4);
        o(bArr, i11 + 21, iArr, 6);
        o(bArr, i11 + 28, iArr, 8);
        o(bArr, i11 + 35, iArr, 10);
        o(bArr, i11 + 42, iArr, 12);
        o(bArr, i11 + 49, iArr, 14);
    }

    public static void k(int[] iArr, int i11, int[] iArr2) {
        l(iArr, i11, iArr2, 0);
        l(iArr, i11 + 7, iArr2, 8);
    }

    private static void l(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = iArr[i11 + 0];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        int i17 = iArr[i11 + 4];
        int i18 = iArr[i11 + 5];
        int i19 = iArr[i11 + 6];
        iArr2[i12 + 0] = i13 & 268435455;
        iArr2[i12 + 1] = ((i13 >>> 28) | (i14 << 4)) & 268435455;
        iArr2[i12 + 2] = ((i14 >>> 24) | (i15 << 8)) & 268435455;
        iArr2[i12 + 3] = ((i15 >>> 20) | (i16 << 12)) & 268435455;
        iArr2[i12 + 4] = ((i16 >>> 16) | (i17 << 16)) & 268435455;
        iArr2[i12 + 5] = ((i17 >>> 12) | (i18 << 20)) & 268435455;
        iArr2[i12 + 6] = ((i18 >>> 8) | (i19 << 24)) & 268435455;
        iArr2[i12 + 7] = i19 >>> 4;
    }

    private static int m(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        return ((bArr[i12 + 1] & 255) << 16) | (bArr[i11] & 255) | ((bArr[i12] & 255) << 8);
    }

    private static int n(byte[] bArr, int i11) {
        int i12 = i11 + 1;
        int i13 = i12 + 1;
        return (bArr[i13 + 1] << 24) | (bArr[i11] & 255) | ((bArr[i12] & 255) << 8) | ((bArr[i13] & 255) << 16);
    }

    private static void o(byte[] bArr, int i11, int[] iArr, int i12) {
        int n11 = n(bArr, i11);
        int m11 = m(bArr, i11 + 4);
        iArr[i12] = 268435455 & n11;
        iArr[i12 + 1] = (m11 << 4) | (n11 >>> 28);
    }

    public static void p(int[] iArr, byte[] bArr, int i11) {
        u(iArr, 0, bArr, i11);
        u(iArr, 2, bArr, i11 + 7);
        u(iArr, 4, bArr, i11 + 14);
        u(iArr, 6, bArr, i11 + 21);
        u(iArr, 8, bArr, i11 + 28);
        u(iArr, 10, bArr, i11 + 35);
        u(iArr, 12, bArr, i11 + 42);
        u(iArr, 14, bArr, i11 + 49);
    }

    public static void q(int[] iArr, int[] iArr2, int i11) {
        r(iArr, 0, iArr2, i11);
        r(iArr, 8, iArr2, i11 + 7);
    }

    private static void r(int[] iArr, int i11, int[] iArr2, int i12) {
        int i13 = iArr[i11 + 0];
        int i14 = iArr[i11 + 1];
        int i15 = iArr[i11 + 2];
        int i16 = iArr[i11 + 3];
        int i17 = iArr[i11 + 4];
        int i18 = iArr[i11 + 5];
        int i19 = iArr[i11 + 6];
        int i21 = iArr[i11 + 7];
        iArr2[i12 + 0] = i13 | (i14 << 28);
        iArr2[i12 + 1] = (i14 >>> 4) | (i15 << 24);
        iArr2[i12 + 2] = (i15 >>> 8) | (i16 << 20);
        iArr2[i12 + 3] = (i16 >>> 12) | (i17 << 16);
        iArr2[i12 + 4] = (i17 >>> 16) | (i18 << 12);
        iArr2[i12 + 5] = (i18 >>> 20) | (i19 << 8);
        iArr2[i12 + 6] = (i21 << 4) | (i19 >>> 24);
    }

    private static void s(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        bArr[i13 + 1] = (byte) (i11 >>> 16);
    }

    private static void t(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        int i13 = i12 + 1;
        bArr[i13] = (byte) (i11 >>> 8);
        int i14 = i13 + 1;
        bArr[i14] = (byte) (i11 >>> 16);
        bArr[i14 + 1] = (byte) (i11 >>> 24);
    }

    private static void u(int[] iArr, int i11, byte[] bArr, int i12) {
        int i13 = iArr[i11];
        int i14 = iArr[i11 + 1];
        t((i14 << 28) | i13, bArr, i12);
        s(i14 >>> 4, bArr, i12 + 4);
    }

    public static void v(int[] iArr, int[] iArr2) {
        int[] g11 = g();
        int[] iArr3 = new int[14];
        f(iArr, 0, g11, 0);
        C(g11);
        q(g11, iArr3, 0);
        v60.c.k(f50303a, iArr3, iArr3);
        k(iArr3, 0, iArr2);
    }

    public static void w(int[] iArr, int[] iArr2) {
        int[] g11 = g();
        int[] iArr3 = new int[14];
        f(iArr, 0, g11, 0);
        C(g11);
        q(g11, iArr3, 0);
        v60.c.l(f50303a, iArr3, iArr3);
        k(iArr3, 0, iArr2);
    }

    public static int x(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            i11 |= iArr[i12];
        }
        return (((i11 >>> 1) | (i11 & 1)) - 1) >> 31;
    }

    public static boolean y(int[] iArr) {
        return x(iArr) != 0;
    }

    public static void z(int[] iArr, int i11, int[] iArr2) {
        int i12 = iArr[0];
        int i13 = iArr[1];
        int i14 = iArr[2];
        int i15 = iArr[3];
        int i16 = iArr[4];
        int i17 = iArr[5];
        int i18 = iArr[6];
        int i19 = iArr[7];
        int i21 = iArr[8];
        int i22 = iArr[9];
        int i23 = iArr[10];
        int i24 = iArr[11];
        int i25 = iArr[12];
        int i26 = iArr[13];
        int i27 = iArr[14];
        int i28 = iArr[15];
        long j11 = i13;
        long j12 = i11;
        long j13 = j11 * j12;
        int i29 = ((int) j13) & 268435455;
        long j14 = i17 * j12;
        int i31 = ((int) j14) & 268435455;
        long j15 = i22 * j12;
        int i32 = ((int) j15) & 268435455;
        long j16 = i26 * j12;
        long j17 = (j13 >>> 28) + (i14 * j12);
        iArr2[2] = ((int) j17) & 268435455;
        long j18 = (j14 >>> 28) + (i18 * j12);
        iArr2[6] = ((int) j18) & 268435455;
        long j19 = (j15 >>> 28) + (i23 * j12);
        iArr2[10] = ((int) j19) & 268435455;
        long j21 = (j16 >>> 28) + (i27 * j12);
        iArr2[14] = ((int) j21) & 268435455;
        long j22 = (j17 >>> 28) + (i15 * j12);
        iArr2[3] = ((int) j22) & 268435455;
        long j23 = (j18 >>> 28) + (i19 * j12);
        iArr2[7] = ((int) j23) & 268435455;
        long j24 = (j19 >>> 28) + (i24 * j12);
        iArr2[11] = ((int) j24) & 268435455;
        long j25 = (j21 >>> 28) + (i28 * j12);
        iArr2[15] = ((int) j25) & 268435455;
        long j26 = j25 >>> 28;
        long j27 = (j22 >>> 28) + (i16 * j12);
        iArr2[4] = ((int) j27) & 268435455;
        long j28 = (j23 >>> 28) + j26 + (i21 * j12);
        iArr2[8] = ((int) j28) & 268435455;
        long j29 = (j24 >>> 28) + (i25 * j12);
        iArr2[12] = ((int) j29) & 268435455;
        long j31 = j26 + (i12 * j12);
        iArr2[0] = ((int) j31) & 268435455;
        iArr2[1] = i29 + ((int) (j31 >>> 28));
        iArr2[5] = i31 + ((int) (j27 >>> 28));
        iArr2[9] = i32 + ((int) (j28 >>> 28));
        iArr2[13] = (((int) j16) & 268435455) + ((int) (j29 >>> 28));
    }
}