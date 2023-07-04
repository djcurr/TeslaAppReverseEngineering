package l50;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import u50.q1;

/* loaded from: classes5.dex */
public class z0 implements org.bouncycastle.crypto.e {

    /* renamed from: h  reason: collision with root package name */
    private static int[] f36982h;

    /* renamed from: i  reason: collision with root package name */
    private static int[] f36983i;

    /* renamed from: j  reason: collision with root package name */
    private static int[] f36984j;

    /* renamed from: k  reason: collision with root package name */
    private static int[] f36985k;

    /* renamed from: a  reason: collision with root package name */
    private int f36986a;

    /* renamed from: b  reason: collision with root package name */
    private int f36987b;

    /* renamed from: c  reason: collision with root package name */
    private long[] f36988c;

    /* renamed from: d  reason: collision with root package name */
    private long[] f36989d;

    /* renamed from: e  reason: collision with root package name */
    private long[] f36990e;

    /* renamed from: f  reason: collision with root package name */
    private d f36991f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f36992g;

    /* loaded from: classes5.dex */
    private static final class a extends d {
        public a(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // l50.z0.d
        void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f36994b;
            long[] jArr4 = this.f36993a;
            int[] iArr = z0.f36983i;
            int[] iArr2 = z0.f36985k;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
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
                long l11 = z0.l(j27 - ((jArr3[i13 + 16] + j45) + 1), 9, j28);
                long j46 = j28 - l11;
                long l12 = z0.l(j41, 48, j31);
                long j47 = j31 - l12;
                long l13 = z0.l(j43, 35, j35);
                long j48 = j35 - l13;
                long[] jArr6 = jArr4;
                long l14 = z0.l(j38, 52, j33);
                long j49 = j33 - l14;
                long l15 = z0.l(j29, 23, j44);
                long j51 = j44 - l15;
                long l16 = z0.l(j34, 31, j37);
                long j52 = j37 - l16;
                long l17 = z0.l(j32, 37, j39);
                long j53 = j39 - l17;
                long l18 = z0.l(j36, 20, j42);
                long j54 = j42 - l18;
                long l19 = z0.l(l18, 31, j46);
                long j55 = j46 - l19;
                long l21 = z0.l(l16, 44, j47);
                long j56 = j47 - l21;
                long l22 = z0.l(l17, 47, j49);
                long j57 = j49 - l22;
                long l23 = z0.l(l15, 46, j48);
                long j58 = j48 - l23;
                long l24 = z0.l(l11, 19, j54);
                long j59 = j54 - l24;
                long l25 = z0.l(l13, 42, j51);
                long j61 = j51 - l25;
                long l26 = z0.l(l12, 44, j52);
                long j62 = j52 - l26;
                long l27 = z0.l(l14, 25, j53);
                long j63 = j53 - l27;
                long l28 = z0.l(l27, 16, j55);
                long j64 = j55 - l28;
                long l29 = z0.l(l25, 34, j56);
                long j65 = j56 - l29;
                long l31 = z0.l(l26, 56, j58);
                long j66 = j58 - l31;
                long l32 = z0.l(l24, 51, j57);
                long j67 = j57 - l32;
                long l33 = z0.l(l19, 4, j63);
                long j68 = j63 - l33;
                long l34 = z0.l(l22, 53, j59);
                long j69 = j59 - l34;
                long l35 = z0.l(l21, 42, j61);
                long j71 = j61 - l35;
                long l36 = z0.l(l23, 41, j62);
                long j72 = j62 - l36;
                long l37 = z0.l(l36, 41, j64);
                long l38 = z0.l(l34, 9, j65);
                long l39 = z0.l(l35, 37, j67);
                long j73 = j67 - l39;
                long l41 = z0.l(l33, 31, j66);
                long j74 = j66 - l41;
                long l42 = z0.l(l28, 12, j72);
                long j75 = j72 - l42;
                long l43 = z0.l(l31, 47, j68);
                long j76 = j68 - l43;
                long l44 = z0.l(l29, 44, j69);
                long j77 = j69 - l44;
                long l45 = z0.l(l32, 30, j71);
                long j78 = j71 - l45;
                long j79 = (j64 - l37) - jArr5[i13];
                long j81 = l37 - jArr5[i15];
                long j82 = (j65 - l38) - jArr5[i16];
                long j83 = l38 - jArr5[i17];
                long j84 = j73 - jArr5[i18];
                long j85 = l39 - jArr5[i19];
                long j86 = j74 - jArr5[i21];
                long j87 = l41 - jArr5[i22];
                long j88 = j75 - jArr5[i23];
                long j89 = l42 - jArr5[i24];
                long j90 = j76 - jArr5[i25];
                long j91 = l43 - jArr5[i26];
                long j92 = j77 - jArr5[i27];
                long j93 = l44 - (jArr5[i28] + jArr6[i14]);
                long j94 = j78 - (jArr5[i29] + jArr6[i31]);
                long l46 = z0.l(l45 - (jArr5[i32] + j45), 5, j79);
                long j95 = j79 - l46;
                long l47 = z0.l(j91, 20, j82);
                long j96 = j82 - l47;
                long l48 = z0.l(j93, 48, j86);
                long j97 = j86 - l48;
                long l49 = z0.l(j89, 41, j84);
                long j98 = j84 - l49;
                long l51 = z0.l(j81, 47, j94);
                long j99 = j94 - l51;
                long l52 = z0.l(j85, 28, j88);
                long j100 = j88 - l52;
                long l53 = z0.l(j83, 16, j90);
                long j101 = j90 - l53;
                long l54 = z0.l(j87, 25, j92);
                long j102 = j92 - l54;
                long l55 = z0.l(l54, 33, j95);
                long j103 = j95 - l55;
                long l56 = z0.l(l52, 4, j96);
                long j104 = j96 - l56;
                long l57 = z0.l(l53, 51, j98);
                long j105 = j98 - l57;
                long l58 = z0.l(l51, 13, j97);
                long j106 = j97 - l58;
                long l59 = z0.l(l46, 34, j102);
                long j107 = j102 - l59;
                long l61 = z0.l(l48, 41, j99);
                long j108 = j99 - l61;
                long l62 = z0.l(l47, 59, j100);
                long j109 = j100 - l62;
                long l63 = z0.l(l49, 17, j101);
                long j110 = j101 - l63;
                long l64 = z0.l(l63, 38, j103);
                long j111 = j103 - l64;
                long l65 = z0.l(l61, 19, j104);
                long j112 = j104 - l65;
                long l66 = z0.l(l62, 10, j106);
                long j113 = j106 - l66;
                long l67 = z0.l(l59, 55, j105);
                long j114 = j105 - l67;
                long l68 = z0.l(l55, 49, j110);
                long j115 = j110 - l68;
                long l69 = z0.l(l57, 18, j107);
                long j116 = j107 - l69;
                long l71 = z0.l(l56, 23, j108);
                long j117 = j108 - l71;
                long l72 = z0.l(l58, 52, j109);
                long j118 = j109 - l72;
                long l73 = z0.l(l72, 24, j111);
                long j119 = j111 - l73;
                long l74 = z0.l(l69, 13, j112);
                j13 = j112 - l74;
                long l75 = z0.l(l71, 8, j114);
                long j120 = j114 - l75;
                long l76 = z0.l(l68, 47, j113);
                long j121 = j113 - l76;
                long l77 = z0.l(l64, 8, j118);
                long j122 = j118 - l77;
                long l78 = z0.l(l66, 17, j115);
                long j123 = j115 - l78;
                j25 = z0.l(l65, 22, j116);
                j27 = z0.l(l67, 37, j117);
                j26 = j117 - j27;
                j23 = l78;
                j24 = j116 - j25;
                iArr = iArr3;
                jArr4 = jArr6;
                jArr3 = jArr5;
                j19 = j122;
                j21 = l77;
                i11 = 1;
                j15 = j120;
                j12 = l73;
                i12 -= 2;
                j14 = l74;
                iArr2 = iArr4;
                j18 = l76;
                j22 = j123;
                j16 = l75;
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
        }

        @Override // l50.z0.d
        void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f36994b;
            long[] jArr4 = this.f36993a;
            int[] iArr = z0.f36983i;
            int[] iArr2 = z0.f36985k;
            if (jArr3.length != 33) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
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
                long h11 = z0.h(j29, 24, j53);
                long j54 = j31 + j45;
                long h12 = z0.h(j45, 13, j54);
                long[] jArr5 = jArr3;
                int[] iArr3 = iArr;
                int[] iArr4 = iArr2;
                long j55 = j46;
                long j56 = j33 + j55;
                long h13 = z0.h(j55, 8, j56);
                int i14 = i11;
                long j57 = j47;
                long j58 = j35 + j57;
                long h14 = z0.h(j57, 47, j58);
                long[] jArr6 = jArr4;
                long j59 = j48;
                long j61 = j37 + j59;
                long h15 = z0.h(j59, 8, j61);
                long j62 = j49;
                long j63 = j39 + j62;
                long h16 = z0.h(j62, 17, j63);
                long j64 = j51;
                long j65 = j42 + j64;
                long h17 = z0.h(j64, 22, j65);
                long j66 = j52;
                long j67 = j44 + j66;
                long h18 = z0.h(j66, 37, j67);
                long j68 = j53 + h15;
                long h19 = z0.h(h15, 38, j68);
                long j69 = j54 + h17;
                long h21 = z0.h(h17, 19, j69);
                long j71 = j58 + h16;
                long h22 = z0.h(h16, 10, j71);
                long j72 = j56 + h18;
                long h23 = z0.h(h18, 55, j72);
                long j73 = j63 + h14;
                long h24 = z0.h(h14, 49, j73);
                long j74 = j65 + h12;
                long h25 = z0.h(h12, 18, j74);
                long j75 = j67 + h13;
                long h26 = z0.h(h13, 23, j75);
                long j76 = j61 + h11;
                long h27 = z0.h(h11, 52, j76);
                long j77 = j68 + h24;
                long h28 = z0.h(h24, 33, j77);
                long j78 = j69 + h26;
                long h29 = z0.h(h26, 4, j78);
                long j79 = j72 + h25;
                long h31 = z0.h(h25, 51, j79);
                long j81 = j71 + h27;
                long h32 = z0.h(h27, 13, j81);
                long j82 = j74 + h23;
                long h33 = z0.h(h23, 34, j82);
                long j83 = j75 + h21;
                long h34 = z0.h(h21, 41, j83);
                long j84 = j76 + h22;
                long h35 = z0.h(h22, 59, j84);
                long j85 = j73 + h19;
                long h36 = z0.h(h19, 17, j85);
                long j86 = j77 + h33;
                long h37 = z0.h(h33, 5, j86);
                long j87 = j78 + h35;
                long h38 = z0.h(h35, 20, j87);
                long j88 = j81 + h34;
                long h39 = z0.h(h34, 48, j88);
                long j89 = j79 + h36;
                long h41 = z0.h(h36, 41, j89);
                long j90 = j83 + h32;
                long h42 = z0.h(h32, 47, j90);
                long j91 = j84 + h29;
                long h43 = z0.h(h29, 28, j91);
                long j92 = j85 + h31;
                long h44 = z0.h(h31, 16, j92);
                long j93 = j82 + h28;
                long h45 = z0.h(h28, 25, j93);
                long j94 = j86 + jArr5[i12];
                int i15 = i12 + 1;
                long j95 = h42 + jArr5[i15];
                int i16 = i12 + 2;
                long j96 = j87 + jArr5[i16];
                int i17 = i12 + 3;
                long j97 = h44 + jArr5[i17];
                int i18 = i12 + 4;
                long j98 = j89 + jArr5[i18];
                int i19 = i12 + 5;
                long j99 = h43 + jArr5[i19];
                int i21 = i12 + 6;
                long j100 = j88 + jArr5[i21];
                int i22 = i12 + 7;
                long j101 = h45 + jArr5[i22];
                int i23 = i12 + 8;
                long j102 = j91 + jArr5[i23];
                int i24 = i12 + 9;
                long j103 = h41 + jArr5[i24];
                int i25 = i12 + 10;
                long j104 = j92 + jArr5[i25];
                int i26 = i12 + 11;
                long j105 = h38 + jArr5[i26];
                int i27 = i12 + 12;
                long j106 = j93 + jArr5[i27];
                int i28 = i12 + 13;
                long j107 = h39 + jArr5[i28] + jArr6[i13];
                int i29 = i12 + 14;
                int i31 = i13 + 1;
                long j108 = j90 + jArr5[i29] + jArr6[i31];
                int i32 = i12 + 15;
                long j109 = jArr5[i32];
                long j110 = i14;
                long j111 = h37 + j109 + j110;
                long j112 = j94 + j95;
                long h46 = z0.h(j95, 41, j112);
                long j113 = j96 + j97;
                long h47 = z0.h(j97, 9, j113);
                long j114 = j98 + j99;
                long h48 = z0.h(j99, 37, j114);
                long j115 = j100 + j101;
                long h49 = z0.h(j101, 31, j115);
                long j116 = j102 + j103;
                long h51 = z0.h(j103, 12, j116);
                long j117 = j104 + j105;
                long h52 = z0.h(j105, 47, j117);
                long j118 = j106 + j107;
                long h53 = z0.h(j107, 44, j118);
                long j119 = j108 + j111;
                long h54 = z0.h(j111, 30, j119);
                long j120 = j112 + h51;
                long h55 = z0.h(h51, 16, j120);
                long j121 = j113 + h53;
                long h56 = z0.h(h53, 34, j121);
                long j122 = j115 + h52;
                long h57 = z0.h(h52, 56, j122);
                long j123 = j114 + h54;
                long h58 = z0.h(h54, 51, j123);
                long j124 = j117 + h49;
                long h59 = z0.h(h49, 4, j124);
                long j125 = j118 + h47;
                long h61 = z0.h(h47, 53, j125);
                long j126 = j119 + h48;
                long h62 = z0.h(h48, 42, j126);
                long j127 = j116 + h46;
                long h63 = z0.h(h46, 41, j127);
                long j128 = j120 + h59;
                long h64 = z0.h(h59, 31, j128);
                long j129 = j121 + h62;
                long h65 = z0.h(h62, 44, j129);
                long j130 = j123 + h61;
                long h66 = z0.h(h61, 47, j130);
                long j131 = j122 + h63;
                long h67 = z0.h(h63, 46, j131);
                long j132 = j125 + h58;
                long h68 = z0.h(h58, 19, j132);
                long j133 = j126 + h56;
                long h69 = z0.h(h56, 42, j133);
                long j134 = j127 + h57;
                long h71 = z0.h(h57, 44, j134);
                long j135 = j124 + h55;
                long h72 = z0.h(h55, 25, j135);
                long j136 = j128 + h68;
                long h73 = z0.h(h68, 9, j136);
                long j137 = j129 + h71;
                long h74 = z0.h(h71, 48, j137);
                long j138 = j131 + h69;
                long h75 = z0.h(h69, 35, j138);
                long j139 = j130 + h72;
                long h76 = z0.h(h72, 52, j139);
                long j140 = j133 + h67;
                long h77 = z0.h(h67, 23, j140);
                long j141 = j134 + h65;
                long h78 = z0.h(h65, 31, j141);
                long j142 = j135 + h66;
                long h79 = z0.h(h66, 37, j142);
                long j143 = j132 + h64;
                long h81 = z0.h(h64, 20, j143);
                long j144 = j136 + jArr5[i15];
                long j145 = h77 + jArr5[i16];
                long j146 = j137 + jArr5[i17];
                long j147 = h79 + jArr5[i18];
                long j148 = j139 + jArr5[i19];
                long j149 = h78 + jArr5[i21];
                long j150 = j138 + jArr5[i22];
                long j151 = h81 + jArr5[i23];
                long j152 = j141 + jArr5[i24];
                j48 = h76 + jArr5[i25];
                j39 = j142 + jArr5[i26];
                j49 = h74 + jArr5[i27];
                long j153 = j143 + jArr5[i28];
                j51 = h75 + jArr5[i29] + jArr6[i31];
                j52 = h73 + jArr5[i12 + 16] + j110 + 1;
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
        }
    }

    /* loaded from: classes5.dex */
    private static final class b extends d {
        public b(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // l50.z0.d
        void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f36994b;
            long[] jArr4 = this.f36993a;
            int[] iArr = z0.f36984j;
            int[] iArr2 = z0.f36985k;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
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
                long l11 = z0.l(j14 - ((jArr3[i13 + 4] + j18) + 1), 32, j15);
                long j19 = j15 - l11;
                int[] iArr3 = iArr;
                long l12 = z0.l(j16, 32, j17);
                long j21 = j17 - l12;
                long l13 = z0.l(l12, 58, j19);
                long j22 = j19 - l13;
                long l14 = z0.l(l11, 22, j21);
                long j23 = j21 - l14;
                long l15 = z0.l(l14, 46, j22);
                long j24 = j22 - l15;
                long l16 = z0.l(l13, 12, j23);
                long j25 = j23 - l16;
                long l17 = z0.l(l16, 25, j24);
                long l18 = z0.l(l15, 33, j25);
                long j26 = (j24 - l17) - jArr3[i13];
                long j27 = l17 - (jArr3[i15] + jArr4[i14]);
                long j28 = (j25 - l18) - (jArr3[i16] + jArr4[i17]);
                long l19 = z0.l(l18 - (jArr3[i18] + j18), 5, j26);
                long j29 = j26 - l19;
                long l21 = z0.l(j27, 37, j28);
                long j31 = j28 - l21;
                long l22 = z0.l(l21, 23, j29);
                long j32 = j29 - l22;
                long l23 = z0.l(l19, 40, j31);
                long j33 = j31 - l23;
                long l24 = z0.l(l23, 52, j32);
                long j34 = j32 - l24;
                long l25 = z0.l(l22, 57, j33);
                long j35 = j33 - l25;
                long l26 = z0.l(l25, 14, j34);
                j11 = j34 - l26;
                j14 = z0.l(l24, 16, j35);
                j13 = j35 - j14;
                i11 -= 2;
                j12 = l26;
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
        }

        @Override // l50.z0.d
        void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f36994b;
            long[] jArr4 = this.f36993a;
            int[] iArr = z0.f36984j;
            int[] iArr2 = z0.f36985k;
            if (jArr3.length != 9) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
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
                long h11 = z0.h(j16, 14, j19);
                long j21 = j17 + j18;
                long h12 = z0.h(j18, 16, j21);
                long j22 = j19 + h12;
                long h13 = z0.h(h12, 52, j22);
                long j23 = j21 + h11;
                long h14 = z0.h(h11, 57, j23);
                long j24 = j22 + h14;
                long h15 = z0.h(h14, 23, j24);
                long j25 = j23 + h13;
                long h16 = z0.h(h13, 40, j25);
                long j26 = j24 + h16;
                long h17 = z0.h(h16, 5, j26);
                long j27 = j25 + h15;
                long h18 = z0.h(h15, 37, j27);
                long j28 = j26 + jArr3[i12];
                int i14 = i12 + 1;
                long j29 = h18 + jArr3[i14] + jArr4[i13];
                int i15 = i12 + 2;
                int i16 = i13 + 1;
                long j31 = j27 + jArr3[i15] + jArr4[i16];
                int i17 = i12 + 3;
                int[] iArr3 = iArr;
                long j32 = i11;
                long j33 = h17 + jArr3[i17] + j32;
                long j34 = j28 + j29;
                long h19 = z0.h(j29, 25, j34);
                long j35 = j31 + j33;
                long h21 = z0.h(j33, 33, j35);
                long j36 = j34 + h21;
                long h22 = z0.h(h21, 46, j36);
                long j37 = j35 + h19;
                long h23 = z0.h(h19, 12, j37);
                long j38 = j36 + h23;
                long h24 = z0.h(h23, 58, j38);
                long j39 = j37 + h22;
                long h25 = z0.h(h22, 22, j39);
                long j41 = j38 + h25;
                long h26 = z0.h(h25, 32, j41);
                long j42 = j39 + h24;
                long h27 = z0.h(h24, 32, j42);
                j15 = j41 + jArr3[i14];
                j16 = h27 + jArr3[i15] + jArr4[i16];
                j17 = j42 + jArr3[i17] + jArr4[i13 + 2];
                j18 = h26 + jArr3[i12 + 4] + j32 + 1;
                i11 += 2;
                iArr = iArr3;
                iArr2 = iArr2;
            }
            jArr2[0] = j15;
            jArr2[1] = j16;
            jArr2[2] = j17;
            jArr2[3] = j18;
        }
    }

    /* loaded from: classes5.dex */
    private static final class c extends d {
        protected c(long[] jArr, long[] jArr2) {
            super(jArr, jArr2);
        }

        @Override // l50.z0.d
        public void a(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f36994b;
            long[] jArr4 = this.f36993a;
            int[] iArr = z0.f36982h;
            int[] iArr2 = z0.f36985k;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
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
                long l11 = z0.l(j21, 8, j26);
                long j28 = j26 - l11;
                long l12 = z0.l(j18 - ((jArr3[i13 + 8] + j27) + 1), 35, j19);
                long j29 = j19 - l12;
                long l13 = z0.l(j25, 56, j22);
                long j31 = j22 - l13;
                long l14 = z0.l(j23, 22, j24);
                long j32 = j24 - l14;
                long l15 = z0.l(l11, 25, j32);
                long j33 = j32 - l15;
                long l16 = z0.l(l14, 29, j28);
                long j34 = j28 - l16;
                long l17 = z0.l(l13, 39, j29);
                long j35 = j29 - l17;
                long l18 = z0.l(l12, 43, j31);
                long j36 = j31 - l18;
                long l19 = z0.l(l15, 13, j36);
                long j37 = j36 - l19;
                long l21 = z0.l(l18, 50, j33);
                long j38 = j33 - l21;
                long l22 = z0.l(l17, 10, j34);
                long j39 = j34 - l22;
                long l23 = z0.l(l16, 17, j35);
                long j41 = j35 - l23;
                long l24 = z0.l(l19, 39, j41);
                long l25 = z0.l(l23, 30, j37);
                long l26 = z0.l(l22, 34, j38);
                long j42 = j38 - l26;
                long l27 = z0.l(l21, 24, j39);
                long j43 = (j41 - l24) - jArr5[i13];
                long j44 = l24 - jArr5[i15];
                long j45 = (j37 - l25) - jArr5[i16];
                long j46 = l25 - jArr5[i17];
                long j47 = j42 - jArr5[i18];
                long j48 = l26 - (jArr5[i19] + jArr4[i14]);
                long j49 = (j39 - l27) - (jArr5[i21] + jArr4[i22]);
                long l28 = z0.l(j44, 44, j49);
                long j51 = j49 - l28;
                long l29 = z0.l(l27 - (jArr5[i23] + j27), 9, j43);
                long j52 = j43 - l29;
                long l31 = z0.l(j48, 54, j45);
                long j53 = j45 - l31;
                long l32 = z0.l(j46, 56, j47);
                long j54 = j47 - l32;
                long l33 = z0.l(l28, 17, j54);
                long j55 = j54 - l33;
                long l34 = z0.l(l32, 49, j51);
                long j56 = j51 - l34;
                long l35 = z0.l(l31, 36, j52);
                long j57 = j52 - l35;
                long l36 = z0.l(l29, 39, j53);
                long j58 = j53 - l36;
                long l37 = z0.l(l33, 33, j58);
                long j59 = j58 - l37;
                long l38 = z0.l(l36, 27, j55);
                long j61 = j55 - l38;
                long l39 = z0.l(l35, 14, j56);
                long j62 = j56 - l39;
                long[] jArr6 = jArr4;
                long l41 = z0.l(l34, 42, j57);
                long j63 = j57 - l41;
                long l42 = z0.l(l37, 46, j63);
                long j64 = j63 - l42;
                j14 = z0.l(l41, 36, j59);
                long l43 = z0.l(l39, 19, j61);
                j15 = j61 - l43;
                j18 = z0.l(l38, 37, j62);
                j17 = j62 - j18;
                j13 = j59 - j14;
                j12 = l42;
                j16 = l43;
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
        }

        @Override // l50.z0.d
        public void b(long[] jArr, long[] jArr2) {
            long[] jArr3 = this.f36994b;
            long[] jArr4 = this.f36993a;
            int[] iArr = z0.f36982h;
            int[] iArr2 = z0.f36985k;
            if (jArr3.length != 17) {
                throw new IllegalArgumentException();
            }
            if (jArr4.length != 5) {
                throw new IllegalArgumentException();
            }
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
                long h11 = z0.h(j21, 46, j31);
                long j32 = j22 + j27;
                long h12 = z0.h(j27, 36, j32);
                long[] jArr5 = jArr3;
                int[] iArr3 = iArr;
                long j33 = j28;
                long j34 = j24 + j33;
                long h13 = z0.h(j33, 19, j34);
                int i14 = i11;
                long j35 = j29;
                long j36 = j26 + j35;
                long h14 = z0.h(j35, 37, j36);
                long j37 = j32 + h11;
                long h15 = z0.h(h11, 33, j37);
                long j38 = j34 + h14;
                long h16 = z0.h(h14, 27, j38);
                long j39 = j36 + h13;
                long h17 = z0.h(h13, 14, j39);
                long j41 = j31 + h12;
                long h18 = z0.h(h12, 42, j41);
                long j42 = j38 + h15;
                long h19 = z0.h(h15, 17, j42);
                long j43 = j39 + h18;
                long h21 = z0.h(h18, 49, j43);
                long j44 = j41 + h17;
                long h22 = z0.h(h17, 36, j44);
                long j45 = j37 + h16;
                long h23 = z0.h(h16, 39, j45);
                long j46 = j43 + h19;
                long h24 = z0.h(h19, 44, j46);
                long j47 = j44 + h23;
                long h25 = z0.h(h23, 9, j47);
                long j48 = j45 + h22;
                long h26 = z0.h(h22, 54, j48);
                long j49 = j42 + h21;
                long h27 = z0.h(h21, 56, j49);
                long j51 = j47 + jArr5[i12];
                int i15 = i12 + 1;
                long j52 = h24 + jArr5[i15];
                int i16 = i12 + 2;
                long j53 = j48 + jArr5[i16];
                int i17 = i12 + 3;
                long j54 = h27 + jArr5[i17];
                int i18 = i12 + 4;
                long j55 = j49 + jArr5[i18];
                int i19 = i12 + 5;
                long j56 = h26 + jArr5[i19] + jArr4[i13];
                int i21 = i12 + 6;
                int i22 = i13 + 1;
                long j57 = j46 + jArr5[i21] + jArr4[i22];
                int i23 = i12 + 7;
                long j58 = i14;
                long j59 = h25 + jArr5[i23] + j58;
                long j61 = j51 + j52;
                long h28 = z0.h(j52, 39, j61);
                long j62 = j53 + j54;
                long h29 = z0.h(j54, 30, j62);
                long j63 = j55 + j56;
                long h31 = z0.h(j56, 34, j63);
                long j64 = j57 + j59;
                long h32 = z0.h(j59, 24, j64);
                long j65 = j62 + h28;
                long h33 = z0.h(h28, 13, j65);
                long j66 = j63 + h32;
                long h34 = z0.h(h32, 50, j66);
                long j67 = j64 + h31;
                long h35 = z0.h(h31, 10, j67);
                long j68 = j61 + h29;
                long h36 = z0.h(h29, 17, j68);
                long j69 = j66 + h33;
                long h37 = z0.h(h33, 25, j69);
                long j71 = j67 + h36;
                long h38 = z0.h(h36, 29, j71);
                long j72 = j68 + h35;
                long h39 = z0.h(h35, 39, j72);
                long j73 = j65 + h34;
                long h41 = z0.h(h34, 43, j73);
                long j74 = j71 + h37;
                long h42 = z0.h(h37, 8, j74);
                long j75 = j72 + h41;
                long h43 = z0.h(h41, 35, j75);
                long j76 = j73 + h39;
                long h44 = z0.h(h39, 56, j76);
                long j77 = j69 + h38;
                long h45 = z0.h(h38, 22, j77);
                long j78 = j75 + jArr5[i15];
                j21 = h42 + jArr5[i16];
                long j79 = j76 + jArr5[i17];
                long j81 = h45 + jArr5[i18];
                long j82 = j77 + jArr5[i19];
                long j83 = h44 + jArr5[i21] + jArr4[i22];
                j26 = j74 + jArr5[i23] + jArr4[i13 + 2];
                j29 = h43 + jArr5[i12 + 8] + j58 + 1;
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
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static abstract class d {

        /* renamed from: a  reason: collision with root package name */
        protected final long[] f36993a;

        /* renamed from: b  reason: collision with root package name */
        protected final long[] f36994b;

        protected d(long[] jArr, long[] jArr2) {
            this.f36994b = jArr;
            this.f36993a = jArr2;
        }

        abstract void a(long[] jArr, long[] jArr2);

        abstract void b(long[] jArr, long[] jArr2);
    }

    static {
        int[] iArr = new int[80];
        f36982h = iArr;
        f36983i = new int[iArr.length];
        f36984j = new int[iArr.length];
        f36985k = new int[iArr.length];
        int i11 = 0;
        while (true) {
            int[] iArr2 = f36982h;
            if (i11 >= iArr2.length) {
                return;
            }
            f36983i[i11] = i11 % 17;
            iArr2[i11] = i11 % 9;
            f36984j[i11] = i11 % 5;
            f36985k[i11] = i11 % 3;
            i11++;
        }
    }

    public z0(int i11) {
        d bVar;
        long[] jArr = new long[5];
        this.f36989d = jArr;
        int i12 = i11 / 8;
        this.f36986a = i12;
        int i13 = i12 / 8;
        this.f36987b = i13;
        this.f36988c = new long[i13];
        long[] jArr2 = new long[(i13 * 2) + 1];
        this.f36990e = jArr2;
        if (i11 == 256) {
            bVar = new b(jArr2, jArr);
        } else if (i11 == 512) {
            bVar = new c(jArr2, jArr);
        } else if (i11 != 1024) {
            throw new IllegalArgumentException("Invalid blocksize - Threefish is defined with block size of 256, 512, or 1024 bits");
        } else {
            bVar = new a(jArr2, jArr);
        }
        this.f36991f = bVar;
    }

    public static long e(byte[] bArr, int i11) {
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

    static long h(long j11, int i11, long j12) {
        return ((j11 >>> (-i11)) | (j11 << i11)) ^ j12;
    }

    private void i(long[] jArr) {
        if (jArr.length != this.f36987b) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.f36987b + " words)");
        }
        long j11 = 2004413935125273122L;
        int i11 = 0;
        while (true) {
            int i12 = this.f36987b;
            if (i11 >= i12) {
                long[] jArr2 = this.f36990e;
                jArr2[i12] = j11;
                System.arraycopy(jArr2, 0, jArr2, i12 + 1, i12);
                return;
            }
            long[] jArr3 = this.f36990e;
            jArr3[i11] = jArr[i11];
            j11 ^= jArr3[i11];
            i11++;
        }
    }

    private void j(long[] jArr) {
        if (jArr.length != 2) {
            throw new IllegalArgumentException("Tweak must be 2 words.");
        }
        long[] jArr2 = this.f36989d;
        jArr2[0] = jArr[0];
        jArr2[1] = jArr[1];
        jArr2[2] = jArr2[0] ^ jArr2[1];
        jArr2[3] = jArr2[0];
        jArr2[4] = jArr2[1];
    }

    public static void k(long j11, byte[] bArr, int i11) {
        if (i11 + 8 > bArr.length) {
            throw new IllegalArgumentException();
        }
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
    }

    static long l(long j11, int i11, long j12) {
        long j13 = j11 ^ j12;
        return (j13 << (-i11)) | (j13 >>> i11);
    }

    public void f(boolean z11, long[] jArr, long[] jArr2) {
        this.f36992g = z11;
        if (jArr != null) {
            i(jArr);
        }
        if (jArr2 != null) {
            j(jArr2);
        }
    }

    public int g(long[] jArr, long[] jArr2) {
        long[] jArr3 = this.f36990e;
        int i11 = this.f36987b;
        if (jArr3[i11] != 0) {
            if (jArr.length == i11) {
                if (jArr2.length == i11) {
                    if (this.f36992g) {
                        this.f36991f.b(jArr, jArr2);
                    } else {
                        this.f36991f.a(jArr, jArr2);
                    }
                    return this.f36987b;
                }
                throw new OutputLengthException("Output buffer too short");
            }
            throw new DataLengthException("Input buffer too short");
        }
        throw new IllegalStateException("Threefish engine not initialised");
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        return "Threefish-" + (this.f36986a * 8);
    }

    @Override // org.bouncycastle.crypto.e
    public int getBlockSize() {
        return this.f36986a;
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        byte[] a11;
        byte[] bArr;
        long[] jArr;
        long[] jArr2 = null;
        if (iVar instanceof q1) {
            q1 q1Var = (q1) iVar;
            a11 = q1Var.a().a();
            bArr = q1Var.b();
        } else if (!(iVar instanceof u50.b1)) {
            throw new IllegalArgumentException("Invalid parameter passed to Threefish init - " + iVar.getClass().getName());
        } else {
            a11 = ((u50.b1) iVar).a();
            bArr = null;
        }
        if (a11 == null) {
            jArr = null;
        } else if (a11.length != this.f36986a) {
            throw new IllegalArgumentException("Threefish key must be same size as block (" + this.f36986a + " bytes)");
        } else {
            int i11 = this.f36987b;
            jArr = new long[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                jArr[i12] = e(a11, i12 * 8);
            }
        }
        if (bArr != null) {
            if (bArr.length != 16) {
                throw new IllegalArgumentException("Threefish tweak must be 16 bytes");
            }
            jArr2 = new long[]{e(bArr, 0), e(bArr, 8)};
        }
        f(z11, jArr, jArr2);
    }

    @Override // org.bouncycastle.crypto.e
    public int processBlock(byte[] bArr, int i11, byte[] bArr2, int i12) {
        int i13 = this.f36986a;
        if (i11 + i13 > bArr.length) {
            throw new DataLengthException("Input buffer too short");
        }
        if (i13 + i12 > bArr2.length) {
            throw new OutputLengthException("Output buffer too short");
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f36986a; i15 += 8) {
            this.f36988c[i15 >> 3] = e(bArr, i11 + i15);
        }
        long[] jArr = this.f36988c;
        g(jArr, jArr);
        while (true) {
            int i16 = this.f36986a;
            if (i14 >= i16) {
                return i16;
            }
            k(this.f36988c[i14 >> 3], bArr2, i12 + i14);
            i14 += 8;
        }
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
    }
}