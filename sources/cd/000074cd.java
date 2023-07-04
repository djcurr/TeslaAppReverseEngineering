package i50;

/* loaded from: classes5.dex */
public class s extends h {

    /* renamed from: d  reason: collision with root package name */
    private int f30112d;

    /* renamed from: e  reason: collision with root package name */
    private int f30113e;

    /* renamed from: f  reason: collision with root package name */
    private int f30114f;

    /* renamed from: g  reason: collision with root package name */
    private int f30115g;

    /* renamed from: h  reason: collision with root package name */
    private int f30116h;

    /* renamed from: i  reason: collision with root package name */
    private int[] f30117i;

    /* renamed from: j  reason: collision with root package name */
    private int f30118j;

    public s() {
        this.f30117i = new int[16];
        reset();
    }

    public s(s sVar) {
        super(sVar);
        this.f30117i = new int[16];
        h(sVar);
    }

    private int g(int i11, int i12) {
        return (i11 >>> (32 - i12)) | (i11 << i12);
    }

    private void h(s sVar) {
        super.b(sVar);
        this.f30112d = sVar.f30112d;
        this.f30113e = sVar.f30113e;
        this.f30114f = sVar.f30114f;
        this.f30115g = sVar.f30115g;
        this.f30116h = sVar.f30116h;
        int[] iArr = sVar.f30117i;
        System.arraycopy(iArr, 0, this.f30117i, 0, iArr.length);
        this.f30118j = sVar.f30118j;
    }

    private int i(int i11, int i12, int i13) {
        return (i11 ^ i12) ^ i13;
    }

    private int j(int i11, int i12, int i13) {
        return ((~i11) & i13) | (i12 & i11);
    }

    private int k(int i11, int i12, int i13) {
        return (i11 | (~i12)) ^ i13;
    }

    private int l(int i11, int i12, int i13) {
        return (i11 & i13) | (i12 & (~i13));
    }

    private int m(int i11, int i12, int i13) {
        return i11 ^ (i12 | (~i13));
    }

    private void n(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 3] = (byte) (i11 >>> 24);
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        h((s) hVar);
    }

    @Override // r70.h
    public r70.h copy() {
        return new s(this);
    }

    @Override // i50.h
    protected void d() {
        int i11 = this.f30112d;
        int i12 = this.f30113e;
        int i13 = this.f30114f;
        int i14 = this.f30115g;
        int i15 = this.f30116h;
        int g11 = g(i(i12, i13, i14) + i11 + this.f30117i[0], 11) + i15;
        int g12 = g(i13, 10);
        int g13 = g(i(g11, i12, g12) + i15 + this.f30117i[1], 14) + i14;
        int g14 = g(i12, 10);
        int g15 = g(i(g13, g11, g14) + i14 + this.f30117i[2], 15) + g12;
        int g16 = g(g11, 10);
        int g17 = g(g12 + i(g15, g13, g16) + this.f30117i[3], 12) + g14;
        int g18 = g(g13, 10);
        int g19 = g(g14 + i(g17, g15, g18) + this.f30117i[4], 5) + g16;
        int g21 = g(g15, 10);
        int g22 = g(g16 + i(g19, g17, g21) + this.f30117i[5], 8) + g18;
        int g23 = g(g17, 10);
        int g24 = g(g18 + i(g22, g19, g23) + this.f30117i[6], 7) + g21;
        int g25 = g(g19, 10);
        int g26 = g(g21 + i(g24, g22, g25) + this.f30117i[7], 9) + g23;
        int g27 = g(g22, 10);
        int g28 = g(g23 + i(g26, g24, g27) + this.f30117i[8], 11) + g25;
        int g29 = g(g24, 10);
        int g31 = g(g25 + i(g28, g26, g29) + this.f30117i[9], 13) + g27;
        int g32 = g(g26, 10);
        int g33 = g(g27 + i(g31, g28, g32) + this.f30117i[10], 14) + g29;
        int g34 = g(g28, 10);
        int g35 = g(g29 + i(g33, g31, g34) + this.f30117i[11], 15) + g32;
        int g36 = g(g31, 10);
        int g37 = g(g32 + i(g35, g33, g36) + this.f30117i[12], 6) + g34;
        int g38 = g(g33, 10);
        int g39 = g(g34 + i(g37, g35, g38) + this.f30117i[13], 7) + g36;
        int g41 = g(g35, 10);
        int g42 = g(g36 + i(g39, g37, g41) + this.f30117i[14], 9) + g38;
        int g43 = g(g37, 10);
        int g44 = g(g38 + i(g42, g39, g43) + this.f30117i[15], 8) + g41;
        int g45 = g(g39, 10);
        int g46 = g(i11 + m(i12, i13, i14) + this.f30117i[5] + 1352829926, 8) + i15;
        int g47 = g(i13, 10);
        int g48 = g(i15 + m(g46, i12, g47) + this.f30117i[14] + 1352829926, 9) + i14;
        int g49 = g(i12, 10);
        int g51 = g(i14 + m(g48, g46, g49) + this.f30117i[7] + 1352829926, 9) + g47;
        int g52 = g(g46, 10);
        int g53 = g(g47 + m(g51, g48, g52) + this.f30117i[0] + 1352829926, 11) + g49;
        int g54 = g(g48, 10);
        int g55 = g(g49 + m(g53, g51, g54) + this.f30117i[9] + 1352829926, 13) + g52;
        int g56 = g(g51, 10);
        int g57 = g(g52 + m(g55, g53, g56) + this.f30117i[2] + 1352829926, 15) + g54;
        int g58 = g(g53, 10);
        int g59 = g(g54 + m(g57, g55, g58) + this.f30117i[11] + 1352829926, 15) + g56;
        int g61 = g(g55, 10);
        int g62 = g(g56 + m(g59, g57, g61) + this.f30117i[4] + 1352829926, 5) + g58;
        int g63 = g(g57, 10);
        int g64 = g(g58 + m(g62, g59, g63) + this.f30117i[13] + 1352829926, 7) + g61;
        int g65 = g(g59, 10);
        int g66 = g(g61 + m(g64, g62, g65) + this.f30117i[6] + 1352829926, 7) + g63;
        int g67 = g(g62, 10);
        int g68 = g(g63 + m(g66, g64, g67) + this.f30117i[15] + 1352829926, 8) + g65;
        int g69 = g(g64, 10);
        int g71 = g(g65 + m(g68, g66, g69) + this.f30117i[8] + 1352829926, 11) + g67;
        int g72 = g(g66, 10);
        int g73 = g(g67 + m(g71, g68, g72) + this.f30117i[1] + 1352829926, 14) + g69;
        int g74 = g(g68, 10);
        int g75 = g(g69 + m(g73, g71, g74) + this.f30117i[10] + 1352829926, 14) + g72;
        int g76 = g(g71, 10);
        int g77 = g(g72 + m(g75, g73, g76) + this.f30117i[3] + 1352829926, 12) + g74;
        int g78 = g(g73, 10);
        int g79 = g(g74 + m(g77, g75, g78) + this.f30117i[12] + 1352829926, 6) + g76;
        int g81 = g(g75, 10);
        int g82 = g(g41 + j(g44, g42, g45) + this.f30117i[7] + 1518500249, 7) + g43;
        int g83 = g(g42, 10);
        int g84 = g(g43 + j(g82, g44, g83) + this.f30117i[4] + 1518500249, 6) + g45;
        int g85 = g(g44, 10);
        int g86 = g(g45 + j(g84, g82, g85) + this.f30117i[13] + 1518500249, 8) + g83;
        int g87 = g(g82, 10);
        int g88 = g(g83 + j(g86, g84, g87) + this.f30117i[1] + 1518500249, 13) + g85;
        int g89 = g(g84, 10);
        int g90 = g(g85 + j(g88, g86, g89) + this.f30117i[10] + 1518500249, 11) + g87;
        int g91 = g(g86, 10);
        int g92 = g(g87 + j(g90, g88, g91) + this.f30117i[6] + 1518500249, 9) + g89;
        int g93 = g(g88, 10);
        int g94 = g(g89 + j(g92, g90, g93) + this.f30117i[15] + 1518500249, 7) + g91;
        int g95 = g(g90, 10);
        int g96 = g(g91 + j(g94, g92, g95) + this.f30117i[3] + 1518500249, 15) + g93;
        int g97 = g(g92, 10);
        int g98 = g(g93 + j(g96, g94, g97) + this.f30117i[12] + 1518500249, 7) + g95;
        int g99 = g(g94, 10);
        int g100 = g(g95 + j(g98, g96, g99) + this.f30117i[0] + 1518500249, 12) + g97;
        int g101 = g(g96, 10);
        int g102 = g(g97 + j(g100, g98, g101) + this.f30117i[9] + 1518500249, 15) + g99;
        int g103 = g(g98, 10);
        int g104 = g(g99 + j(g102, g100, g103) + this.f30117i[5] + 1518500249, 9) + g101;
        int g105 = g(g100, 10);
        int g106 = g(g101 + j(g104, g102, g105) + this.f30117i[2] + 1518500249, 11) + g103;
        int g107 = g(g102, 10);
        int g108 = g(g103 + j(g106, g104, g107) + this.f30117i[14] + 1518500249, 7) + g105;
        int g109 = g(g104, 10);
        int g110 = g(g105 + j(g108, g106, g109) + this.f30117i[11] + 1518500249, 13) + g107;
        int g111 = g(g106, 10);
        int g112 = g(g107 + j(g110, g108, g111) + this.f30117i[8] + 1518500249, 12) + g109;
        int g113 = g(g108, 10);
        int g114 = g(g76 + l(g79, g77, g81) + this.f30117i[6] + 1548603684, 9) + g78;
        int g115 = g(g77, 10);
        int g116 = g(g78 + l(g114, g79, g115) + this.f30117i[11] + 1548603684, 13) + g81;
        int g117 = g(g79, 10);
        int g118 = g(g81 + l(g116, g114, g117) + this.f30117i[3] + 1548603684, 15) + g115;
        int g119 = g(g114, 10);
        int g120 = g(g115 + l(g118, g116, g119) + this.f30117i[7] + 1548603684, 7) + g117;
        int g121 = g(g116, 10);
        int g122 = g(g117 + l(g120, g118, g121) + this.f30117i[0] + 1548603684, 12) + g119;
        int g123 = g(g118, 10);
        int g124 = g(g119 + l(g122, g120, g123) + this.f30117i[13] + 1548603684, 8) + g121;
        int g125 = g(g120, 10);
        int g126 = g(g121 + l(g124, g122, g125) + this.f30117i[5] + 1548603684, 9) + g123;
        int g127 = g(g122, 10);
        int g128 = g(g123 + l(g126, g124, g127) + this.f30117i[10] + 1548603684, 11) + g125;
        int g129 = g(g124, 10);
        int g130 = g(g125 + l(g128, g126, g129) + this.f30117i[14] + 1548603684, 7) + g127;
        int g131 = g(g126, 10);
        int g132 = g(g127 + l(g130, g128, g131) + this.f30117i[15] + 1548603684, 7) + g129;
        int g133 = g(g128, 10);
        int g134 = g(g129 + l(g132, g130, g133) + this.f30117i[8] + 1548603684, 12) + g131;
        int g135 = g(g130, 10);
        int g136 = g(g131 + l(g134, g132, g135) + this.f30117i[12] + 1548603684, 7) + g133;
        int g137 = g(g132, 10);
        int g138 = g(g133 + l(g136, g134, g137) + this.f30117i[4] + 1548603684, 6) + g135;
        int g139 = g(g134, 10);
        int g140 = g(g135 + l(g138, g136, g139) + this.f30117i[9] + 1548603684, 15) + g137;
        int g141 = g(g136, 10);
        int g142 = g(g137 + l(g140, g138, g141) + this.f30117i[1] + 1548603684, 13) + g139;
        int g143 = g(g138, 10);
        int g144 = g(g139 + l(g142, g140, g143) + this.f30117i[2] + 1548603684, 11) + g141;
        int g145 = g(g140, 10);
        int g146 = g(g109 + k(g112, g110, g113) + this.f30117i[3] + 1859775393, 11) + g111;
        int g147 = g(g110, 10);
        int g148 = g(g111 + k(g146, g112, g147) + this.f30117i[10] + 1859775393, 13) + g113;
        int g149 = g(g112, 10);
        int g150 = g(g113 + k(g148, g146, g149) + this.f30117i[14] + 1859775393, 6) + g147;
        int g151 = g(g146, 10);
        int g152 = g(g147 + k(g150, g148, g151) + this.f30117i[4] + 1859775393, 7) + g149;
        int g153 = g(g148, 10);
        int g154 = g(g149 + k(g152, g150, g153) + this.f30117i[9] + 1859775393, 14) + g151;
        int g155 = g(g150, 10);
        int g156 = g(g151 + k(g154, g152, g155) + this.f30117i[15] + 1859775393, 9) + g153;
        int g157 = g(g152, 10);
        int g158 = g(g153 + k(g156, g154, g157) + this.f30117i[8] + 1859775393, 13) + g155;
        int g159 = g(g154, 10);
        int g160 = g(g155 + k(g158, g156, g159) + this.f30117i[1] + 1859775393, 15) + g157;
        int g161 = g(g156, 10);
        int g162 = g(g157 + k(g160, g158, g161) + this.f30117i[2] + 1859775393, 14) + g159;
        int g163 = g(g158, 10);
        int g164 = g(g159 + k(g162, g160, g163) + this.f30117i[7] + 1859775393, 8) + g161;
        int g165 = g(g160, 10);
        int g166 = g(g161 + k(g164, g162, g165) + this.f30117i[0] + 1859775393, 13) + g163;
        int g167 = g(g162, 10);
        int g168 = g(g163 + k(g166, g164, g167) + this.f30117i[6] + 1859775393, 6) + g165;
        int g169 = g(g164, 10);
        int g170 = g(g165 + k(g168, g166, g169) + this.f30117i[13] + 1859775393, 5) + g167;
        int g171 = g(g166, 10);
        int g172 = g(g167 + k(g170, g168, g171) + this.f30117i[11] + 1859775393, 12) + g169;
        int g173 = g(g168, 10);
        int g174 = g(g169 + k(g172, g170, g173) + this.f30117i[5] + 1859775393, 7) + g171;
        int g175 = g(g170, 10);
        int g176 = g(g171 + k(g174, g172, g175) + this.f30117i[12] + 1859775393, 5) + g173;
        int g177 = g(g172, 10);
        int g178 = g(g141 + k(g144, g142, g145) + this.f30117i[15] + 1836072691, 9) + g143;
        int g179 = g(g142, 10);
        int g180 = g(g143 + k(g178, g144, g179) + this.f30117i[5] + 1836072691, 7) + g145;
        int g181 = g(g144, 10);
        int g182 = g(g145 + k(g180, g178, g181) + this.f30117i[1] + 1836072691, 15) + g179;
        int g183 = g(g178, 10);
        int g184 = g(g179 + k(g182, g180, g183) + this.f30117i[3] + 1836072691, 11) + g181;
        int g185 = g(g180, 10);
        int g186 = g(g181 + k(g184, g182, g185) + this.f30117i[7] + 1836072691, 8) + g183;
        int g187 = g(g182, 10);
        int g188 = g(g183 + k(g186, g184, g187) + this.f30117i[14] + 1836072691, 6) + g185;
        int g189 = g(g184, 10);
        int g190 = g(g185 + k(g188, g186, g189) + this.f30117i[6] + 1836072691, 6) + g187;
        int g191 = g(g186, 10);
        int g192 = g(g187 + k(g190, g188, g191) + this.f30117i[9] + 1836072691, 14) + g189;
        int g193 = g(g188, 10);
        int g194 = g(g189 + k(g192, g190, g193) + this.f30117i[11] + 1836072691, 12) + g191;
        int g195 = g(g190, 10);
        int g196 = g(g191 + k(g194, g192, g195) + this.f30117i[8] + 1836072691, 13) + g193;
        int g197 = g(g192, 10);
        int g198 = g(g193 + k(g196, g194, g197) + this.f30117i[12] + 1836072691, 5) + g195;
        int g199 = g(g194, 10);
        int g200 = g(g195 + k(g198, g196, g199) + this.f30117i[2] + 1836072691, 14) + g197;
        int g201 = g(g196, 10);
        int g202 = g(g197 + k(g200, g198, g201) + this.f30117i[10] + 1836072691, 13) + g199;
        int g203 = g(g198, 10);
        int g204 = g(g199 + k(g202, g200, g203) + this.f30117i[0] + 1836072691, 13) + g201;
        int g205 = g(g200, 10);
        int g206 = g(g201 + k(g204, g202, g205) + this.f30117i[4] + 1836072691, 7) + g203;
        int g207 = g(g202, 10);
        int g208 = g(g203 + k(g206, g204, g207) + this.f30117i[13] + 1836072691, 5) + g205;
        int g209 = g(g204, 10);
        int g210 = g(((g173 + l(g176, g174, g177)) + this.f30117i[1]) - 1894007588, 11) + g175;
        int g211 = g(g174, 10);
        int g212 = g(((g175 + l(g210, g176, g211)) + this.f30117i[9]) - 1894007588, 12) + g177;
        int g213 = g(g176, 10);
        int g214 = g(((g177 + l(g212, g210, g213)) + this.f30117i[11]) - 1894007588, 14) + g211;
        int g215 = g(g210, 10);
        int g216 = g(((g211 + l(g214, g212, g215)) + this.f30117i[10]) - 1894007588, 15) + g213;
        int g217 = g(g212, 10);
        int g218 = g(((g213 + l(g216, g214, g217)) + this.f30117i[0]) - 1894007588, 14) + g215;
        int g219 = g(g214, 10);
        int g220 = g(((g215 + l(g218, g216, g219)) + this.f30117i[8]) - 1894007588, 15) + g217;
        int g221 = g(g216, 10);
        int g222 = g(((g217 + l(g220, g218, g221)) + this.f30117i[12]) - 1894007588, 9) + g219;
        int g223 = g(g218, 10);
        int g224 = g(((g219 + l(g222, g220, g223)) + this.f30117i[4]) - 1894007588, 8) + g221;
        int g225 = g(g220, 10);
        int g226 = g(((g221 + l(g224, g222, g225)) + this.f30117i[13]) - 1894007588, 9) + g223;
        int g227 = g(g222, 10);
        int g228 = g(((g223 + l(g226, g224, g227)) + this.f30117i[3]) - 1894007588, 14) + g225;
        int g229 = g(g224, 10);
        int g230 = g(((g225 + l(g228, g226, g229)) + this.f30117i[7]) - 1894007588, 5) + g227;
        int g231 = g(g226, 10);
        int g232 = g(((g227 + l(g230, g228, g231)) + this.f30117i[15]) - 1894007588, 6) + g229;
        int g233 = g(g228, 10);
        int g234 = g(((g229 + l(g232, g230, g233)) + this.f30117i[14]) - 1894007588, 8) + g231;
        int g235 = g(g230, 10);
        int g236 = g(((g231 + l(g234, g232, g235)) + this.f30117i[5]) - 1894007588, 6) + g233;
        int g237 = g(g232, 10);
        int g238 = g(((g233 + l(g236, g234, g237)) + this.f30117i[6]) - 1894007588, 5) + g235;
        int g239 = g(g234, 10);
        int g240 = g(((g235 + l(g238, g236, g239)) + this.f30117i[2]) - 1894007588, 12) + g237;
        int g241 = g(g236, 10);
        int g242 = g(g205 + j(g208, g206, g209) + this.f30117i[8] + 2053994217, 15) + g207;
        int g243 = g(g206, 10);
        int g244 = g(g207 + j(g242, g208, g243) + this.f30117i[6] + 2053994217, 5) + g209;
        int g245 = g(g208, 10);
        int g246 = g(g209 + j(g244, g242, g245) + this.f30117i[4] + 2053994217, 8) + g243;
        int g247 = g(g242, 10);
        int g248 = g(g243 + j(g246, g244, g247) + this.f30117i[1] + 2053994217, 11) + g245;
        int g249 = g(g244, 10);
        int g250 = g(g245 + j(g248, g246, g249) + this.f30117i[3] + 2053994217, 14) + g247;
        int g251 = g(g246, 10);
        int g252 = g(g247 + j(g250, g248, g251) + this.f30117i[11] + 2053994217, 14) + g249;
        int g253 = g(g248, 10);
        int g254 = g(g249 + j(g252, g250, g253) + this.f30117i[15] + 2053994217, 6) + g251;
        int g255 = g(g250, 10);
        int g256 = g(g251 + j(g254, g252, g255) + this.f30117i[0] + 2053994217, 14) + g253;
        int g257 = g(g252, 10);
        int g258 = g(g253 + j(g256, g254, g257) + this.f30117i[5] + 2053994217, 6) + g255;
        int g259 = g(g254, 10);
        int g260 = g(g255 + j(g258, g256, g259) + this.f30117i[12] + 2053994217, 9) + g257;
        int g261 = g(g256, 10);
        int g262 = g(g257 + j(g260, g258, g261) + this.f30117i[2] + 2053994217, 12) + g259;
        int g263 = g(g258, 10);
        int g264 = g(g259 + j(g262, g260, g263) + this.f30117i[13] + 2053994217, 9) + g261;
        int g265 = g(g260, 10);
        int g266 = g(g261 + j(g264, g262, g265) + this.f30117i[9] + 2053994217, 12) + g263;
        int g267 = g(g262, 10);
        int g268 = g(g263 + j(g266, g264, g267) + this.f30117i[7] + 2053994217, 5) + g265;
        int g269 = g(g264, 10);
        int g270 = g(g265 + j(g268, g266, g269) + this.f30117i[10] + 2053994217, 15) + g267;
        int g271 = g(g266, 10);
        int g272 = g(g267 + j(g270, g268, g271) + this.f30117i[14] + 2053994217, 8) + g269;
        int g273 = g(g268, 10);
        int g274 = g(((g237 + m(g240, g238, g241)) + this.f30117i[4]) - 1454113458, 9) + g239;
        int g275 = g(g238, 10);
        int g276 = g(((g239 + m(g274, g240, g275)) + this.f30117i[0]) - 1454113458, 15) + g241;
        int g277 = g(g240, 10);
        int g278 = g(((g241 + m(g276, g274, g277)) + this.f30117i[5]) - 1454113458, 5) + g275;
        int g279 = g(g274, 10);
        int g280 = g(((g275 + m(g278, g276, g279)) + this.f30117i[9]) - 1454113458, 11) + g277;
        int g281 = g(g276, 10);
        int g282 = g(((g277 + m(g280, g278, g281)) + this.f30117i[7]) - 1454113458, 6) + g279;
        int g283 = g(g278, 10);
        int g284 = g(((g279 + m(g282, g280, g283)) + this.f30117i[12]) - 1454113458, 8) + g281;
        int g285 = g(g280, 10);
        int g286 = g(((g281 + m(g284, g282, g285)) + this.f30117i[2]) - 1454113458, 13) + g283;
        int g287 = g(g282, 10);
        int g288 = g(((g283 + m(g286, g284, g287)) + this.f30117i[10]) - 1454113458, 12) + g285;
        int g289 = g(g284, 10);
        int g290 = g(((g285 + m(g288, g286, g289)) + this.f30117i[14]) - 1454113458, 5) + g287;
        int g291 = g(g286, 10);
        int g292 = g(((g287 + m(g290, g288, g291)) + this.f30117i[1]) - 1454113458, 12) + g289;
        int g293 = g(g288, 10);
        int g294 = g(((g289 + m(g292, g290, g293)) + this.f30117i[3]) - 1454113458, 13) + g291;
        int g295 = g(g290, 10);
        int g296 = g(((g291 + m(g294, g292, g295)) + this.f30117i[8]) - 1454113458, 14) + g293;
        int g297 = g(g292, 10);
        int g298 = g(((g293 + m(g296, g294, g297)) + this.f30117i[11]) - 1454113458, 11) + g295;
        int g299 = g(g294, 10);
        int g300 = g(((g295 + m(g298, g296, g299)) + this.f30117i[6]) - 1454113458, 8) + g297;
        int g301 = g(g296, 10);
        int g302 = g(((g297 + m(g300, g298, g301)) + this.f30117i[15]) - 1454113458, 5) + g299;
        int g303 = g(g298, 10);
        int g304 = g(g300, 10);
        int g305 = g(g269 + i(g272, g270, g273) + this.f30117i[12], 8) + g271;
        int g306 = g(g270, 10);
        int g307 = g(g271 + i(g305, g272, g306) + this.f30117i[15], 5) + g273;
        int g308 = g(g272, 10);
        int g309 = g(g273 + i(g307, g305, g308) + this.f30117i[10], 12) + g306;
        int g310 = g(g305, 10);
        int g311 = g(g306 + i(g309, g307, g310) + this.f30117i[4], 9) + g308;
        int g312 = g(g307, 10);
        int g313 = g(g308 + i(g311, g309, g312) + this.f30117i[1], 12) + g310;
        int g314 = g(g309, 10);
        int g315 = g(g310 + i(g313, g311, g314) + this.f30117i[5], 5) + g312;
        int g316 = g(g311, 10);
        int g317 = g(g312 + i(g315, g313, g316) + this.f30117i[8], 14) + g314;
        int g318 = g(g313, 10);
        int g319 = g(g314 + i(g317, g315, g318) + this.f30117i[7], 6) + g316;
        int g320 = g(g315, 10);
        int g321 = g(g316 + i(g319, g317, g320) + this.f30117i[6], 8) + g318;
        int g322 = g(g317, 10);
        int g323 = g(g318 + i(g321, g319, g322) + this.f30117i[2], 13) + g320;
        int g324 = g(g319, 10);
        int g325 = g(g320 + i(g323, g321, g324) + this.f30117i[13], 6) + g322;
        int g326 = g(g321, 10);
        int g327 = g(g322 + i(g325, g323, g326) + this.f30117i[14], 5) + g324;
        int g328 = g(g323, 10);
        int g329 = g(g324 + i(g327, g325, g328) + this.f30117i[0], 15) + g326;
        int g330 = g(g325, 10);
        int g331 = g(g326 + i(g329, g327, g330) + this.f30117i[3], 13) + g328;
        int g332 = g(g327, 10);
        int g333 = g(g328 + i(g331, g329, g332) + this.f30117i[9], 11) + g330;
        int g334 = g(g329, 10);
        int g335 = g(g330 + i(g333, g331, g334) + this.f30117i[11], 11) + g332;
        this.f30113e = this.f30114f + g304 + g334;
        this.f30114f = this.f30115g + g303 + g332;
        this.f30115g = this.f30116h + g301 + g335;
        this.f30116h = this.f30112d + g(((g299 + m(g302, g300, g303)) + this.f30117i[13]) - 1454113458, 6) + g301 + g333;
        this.f30112d = g(g331, 10) + g302 + this.f30113e;
        this.f30118j = 0;
        int i16 = 0;
        while (true) {
            int[] iArr = this.f30117i;
            if (i16 == iArr.length) {
                return;
            }
            iArr[i16] = 0;
            i16++;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        c();
        n(this.f30112d, bArr, i11);
        n(this.f30113e, bArr, i11 + 4);
        n(this.f30114f, bArr, i11 + 8);
        n(this.f30115g, bArr, i11 + 12);
        n(this.f30116h, bArr, i11 + 16);
        reset();
        return 20;
    }

    @Override // i50.h
    protected void e(long j11) {
        if (this.f30118j > 14) {
            d();
        }
        int[] iArr = this.f30117i;
        iArr[14] = (int) ((-1) & j11);
        iArr[15] = (int) (j11 >>> 32);
    }

    @Override // i50.h
    protected void f(byte[] bArr, int i11) {
        int[] iArr = this.f30117i;
        int i12 = this.f30118j;
        int i13 = i12 + 1;
        this.f30118j = i13;
        iArr[i12] = ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        if (i13 == 16) {
            d();
        }
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "RIPEMD160";
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 20;
    }

    @Override // i50.h, org.bouncycastle.crypto.p
    public void reset() {
        super.reset();
        this.f30112d = 1732584193;
        this.f30113e = -271733879;
        this.f30114f = -1732584194;
        this.f30115g = 271733878;
        this.f30116h = -1009589776;
        this.f30118j = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f30117i;
            if (i11 == iArr.length) {
                return;
            }
            iArr[i11] = 0;
            i11++;
        }
    }
}