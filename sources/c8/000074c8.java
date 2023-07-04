package i50;

/* loaded from: classes5.dex */
public class p extends h {

    /* renamed from: d  reason: collision with root package name */
    private int f30099d;

    /* renamed from: e  reason: collision with root package name */
    private int f30100e;

    /* renamed from: f  reason: collision with root package name */
    private int f30101f;

    /* renamed from: g  reason: collision with root package name */
    private int f30102g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f30103h;

    /* renamed from: i  reason: collision with root package name */
    private int f30104i;

    public p() {
        this.f30103h = new int[16];
        reset();
    }

    public p(p pVar) {
        super(pVar);
        this.f30103h = new int[16];
        k(pVar);
    }

    private int g(int i11, int i12, int i13) {
        return ((~i11) & i13) | (i12 & i11);
    }

    private int h(int i11, int i12, int i13) {
        return (i11 & i13) | (i12 & (~i13));
    }

    private int i(int i11, int i12, int i13) {
        return (i11 ^ i12) ^ i13;
    }

    private int j(int i11, int i12, int i13) {
        return (i11 | (~i13)) ^ i12;
    }

    private void k(p pVar) {
        super.b(pVar);
        this.f30099d = pVar.f30099d;
        this.f30100e = pVar.f30100e;
        this.f30101f = pVar.f30101f;
        this.f30102g = pVar.f30102g;
        int[] iArr = pVar.f30103h;
        System.arraycopy(iArr, 0, this.f30103h, 0, iArr.length);
        this.f30104i = pVar.f30104i;
    }

    private int l(int i11, int i12) {
        return (i11 >>> (32 - i12)) | (i11 << i12);
    }

    private void m(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 3] = (byte) (i11 >>> 24);
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        k((p) hVar);
    }

    @Override // r70.h
    public r70.h copy() {
        return new p(this);
    }

    @Override // i50.h
    protected void d() {
        int i11 = this.f30099d;
        int i12 = this.f30100e;
        int i13 = this.f30101f;
        int i14 = this.f30102g;
        int l11 = l(((i11 + g(i12, i13, i14)) + this.f30103h[0]) - 680876936, 7) + i12;
        int l12 = l(((i14 + g(l11, i12, i13)) + this.f30103h[1]) - 389564586, 12) + l11;
        int l13 = l(i13 + g(l12, l11, i12) + this.f30103h[2] + 606105819, 17) + l12;
        int l14 = l(((i12 + g(l13, l12, l11)) + this.f30103h[3]) - 1044525330, 22) + l13;
        int l15 = l(((l11 + g(l14, l13, l12)) + this.f30103h[4]) - 176418897, 7) + l14;
        int l16 = l(l12 + g(l15, l14, l13) + this.f30103h[5] + 1200080426, 12) + l15;
        int l17 = l(((l13 + g(l16, l15, l14)) + this.f30103h[6]) - 1473231341, 17) + l16;
        int l18 = l(((l14 + g(l17, l16, l15)) + this.f30103h[7]) - 45705983, 22) + l17;
        int l19 = l(l15 + g(l18, l17, l16) + this.f30103h[8] + 1770035416, 7) + l18;
        int l21 = l(((l16 + g(l19, l18, l17)) + this.f30103h[9]) - 1958414417, 12) + l19;
        int l22 = l(((l17 + g(l21, l19, l18)) + this.f30103h[10]) - 42063, 17) + l21;
        int l23 = l(((l18 + g(l22, l21, l19)) + this.f30103h[11]) - 1990404162, 22) + l22;
        int l24 = l(l19 + g(l23, l22, l21) + this.f30103h[12] + 1804603682, 7) + l23;
        int l25 = l(((l21 + g(l24, l23, l22)) + this.f30103h[13]) - 40341101, 12) + l24;
        int l26 = l(((l22 + g(l25, l24, l23)) + this.f30103h[14]) - 1502002290, 17) + l25;
        int l27 = l(l23 + g(l26, l25, l24) + this.f30103h[15] + 1236535329, 22) + l26;
        int l28 = l(((l24 + h(l27, l26, l25)) + this.f30103h[1]) - 165796510, 5) + l27;
        int l29 = l(((l25 + h(l28, l27, l26)) + this.f30103h[6]) - 1069501632, 9) + l28;
        int l31 = l(l26 + h(l29, l28, l27) + this.f30103h[11] + 643717713, 14) + l29;
        int l32 = l(((l27 + h(l31, l29, l28)) + this.f30103h[0]) - 373897302, 20) + l31;
        int l33 = l(((l28 + h(l32, l31, l29)) + this.f30103h[5]) - 701558691, 5) + l32;
        int l34 = l(l29 + h(l33, l32, l31) + this.f30103h[10] + 38016083, 9) + l33;
        int l35 = l(((l31 + h(l34, l33, l32)) + this.f30103h[15]) - 660478335, 14) + l34;
        int l36 = l(((l32 + h(l35, l34, l33)) + this.f30103h[4]) - 405537848, 20) + l35;
        int l37 = l(l33 + h(l36, l35, l34) + this.f30103h[9] + 568446438, 5) + l36;
        int l38 = l(((l34 + h(l37, l36, l35)) + this.f30103h[14]) - 1019803690, 9) + l37;
        int l39 = l(((l35 + h(l38, l37, l36)) + this.f30103h[3]) - 187363961, 14) + l38;
        int l41 = l(l36 + h(l39, l38, l37) + this.f30103h[8] + 1163531501, 20) + l39;
        int l42 = l(((l37 + h(l41, l39, l38)) + this.f30103h[13]) - 1444681467, 5) + l41;
        int l43 = l(((l38 + h(l42, l41, l39)) + this.f30103h[2]) - 51403784, 9) + l42;
        int l44 = l(l39 + h(l43, l42, l41) + this.f30103h[7] + 1735328473, 14) + l43;
        int l45 = l(((l41 + h(l44, l43, l42)) + this.f30103h[12]) - 1926607734, 20) + l44;
        int l46 = l(((l42 + i(l45, l44, l43)) + this.f30103h[5]) - 378558, 4) + l45;
        int l47 = l(((l43 + i(l46, l45, l44)) + this.f30103h[8]) - 2022574463, 11) + l46;
        int l48 = l(l44 + i(l47, l46, l45) + this.f30103h[11] + 1839030562, 16) + l47;
        int l49 = l(((l45 + i(l48, l47, l46)) + this.f30103h[14]) - 35309556, 23) + l48;
        int l51 = l(((l46 + i(l49, l48, l47)) + this.f30103h[1]) - 1530992060, 4) + l49;
        int l52 = l(l47 + i(l51, l49, l48) + this.f30103h[4] + 1272893353, 11) + l51;
        int l53 = l(((l48 + i(l52, l51, l49)) + this.f30103h[7]) - 155497632, 16) + l52;
        int l54 = l(((l49 + i(l53, l52, l51)) + this.f30103h[10]) - 1094730640, 23) + l53;
        int l55 = l(l51 + i(l54, l53, l52) + this.f30103h[13] + 681279174, 4) + l54;
        int l56 = l(((l52 + i(l55, l54, l53)) + this.f30103h[0]) - 358537222, 11) + l55;
        int l57 = l(((l53 + i(l56, l55, l54)) + this.f30103h[3]) - 722521979, 16) + l56;
        int l58 = l(l54 + i(l57, l56, l55) + this.f30103h[6] + 76029189, 23) + l57;
        int l59 = l(((l55 + i(l58, l57, l56)) + this.f30103h[9]) - 640364487, 4) + l58;
        int l61 = l(((l56 + i(l59, l58, l57)) + this.f30103h[12]) - 421815835, 11) + l59;
        int l62 = l(l57 + i(l61, l59, l58) + this.f30103h[15] + 530742520, 16) + l61;
        int l63 = l(((l58 + i(l62, l61, l59)) + this.f30103h[2]) - 995338651, 23) + l62;
        int l64 = l(((l59 + j(l63, l62, l61)) + this.f30103h[0]) - 198630844, 6) + l63;
        int l65 = l(l61 + j(l64, l63, l62) + this.f30103h[7] + 1126891415, 10) + l64;
        int l66 = l(((l62 + j(l65, l64, l63)) + this.f30103h[14]) - 1416354905, 15) + l65;
        int l67 = l(((l63 + j(l66, l65, l64)) + this.f30103h[5]) - 57434055, 21) + l66;
        int l68 = l(l64 + j(l67, l66, l65) + this.f30103h[12] + 1700485571, 6) + l67;
        int l69 = l(((l65 + j(l68, l67, l66)) + this.f30103h[3]) - 1894986606, 10) + l68;
        int l71 = l(((l66 + j(l69, l68, l67)) + this.f30103h[10]) - 1051523, 15) + l69;
        int l72 = l(((l67 + j(l71, l69, l68)) + this.f30103h[1]) - 2054922799, 21) + l71;
        int l73 = l(l68 + j(l72, l71, l69) + this.f30103h[8] + 1873313359, 6) + l72;
        int l74 = l(((l69 + j(l73, l72, l71)) + this.f30103h[15]) - 30611744, 10) + l73;
        int l75 = l(((l71 + j(l74, l73, l72)) + this.f30103h[6]) - 1560198380, 15) + l74;
        int l76 = l(l72 + j(l75, l74, l73) + this.f30103h[13] + 1309151649, 21) + l75;
        int l77 = l(((l73 + j(l76, l75, l74)) + this.f30103h[4]) - 145523070, 6) + l76;
        int l78 = l(((l74 + j(l77, l76, l75)) + this.f30103h[11]) - 1120210379, 10) + l77;
        int l79 = l(l75 + j(l78, l77, l76) + this.f30103h[2] + 718787259, 15) + l78;
        this.f30099d += l77;
        this.f30100e += l(((l76 + j(l79, l78, l77)) + this.f30103h[9]) - 343485551, 21) + l79;
        this.f30101f += l79;
        this.f30102g += l78;
        this.f30104i = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f30103h;
            if (i15 == iArr.length) {
                return;
            }
            iArr[i15] = 0;
            i15++;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        c();
        m(this.f30099d, bArr, i11);
        m(this.f30100e, bArr, i11 + 4);
        m(this.f30101f, bArr, i11 + 8);
        m(this.f30102g, bArr, i11 + 12);
        reset();
        return 16;
    }

    @Override // i50.h
    protected void e(long j11) {
        if (this.f30104i > 14) {
            d();
        }
        int[] iArr = this.f30103h;
        iArr[14] = (int) ((-1) & j11);
        iArr[15] = (int) (j11 >>> 32);
    }

    @Override // i50.h
    protected void f(byte[] bArr, int i11) {
        int[] iArr = this.f30103h;
        int i12 = this.f30104i;
        int i13 = i12 + 1;
        this.f30104i = i13;
        iArr[i12] = ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        if (i13 == 16) {
            d();
        }
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "MD5";
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 16;
    }

    @Override // i50.h, org.bouncycastle.crypto.p
    public void reset() {
        super.reset();
        this.f30099d = 1732584193;
        this.f30100e = -271733879;
        this.f30101f = -1732584194;
        this.f30102g = 271733878;
        this.f30104i = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f30103h;
            if (i11 == iArr.length) {
                return;
            }
            iArr[i11] = 0;
            i11++;
        }
    }
}