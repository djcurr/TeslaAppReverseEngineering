package i50;

/* loaded from: classes5.dex */
public class o extends h {

    /* renamed from: d  reason: collision with root package name */
    private int f30093d;

    /* renamed from: e  reason: collision with root package name */
    private int f30094e;

    /* renamed from: f  reason: collision with root package name */
    private int f30095f;

    /* renamed from: g  reason: collision with root package name */
    private int f30096g;

    /* renamed from: h  reason: collision with root package name */
    private int[] f30097h;

    /* renamed from: i  reason: collision with root package name */
    private int f30098i;

    public o() {
        this.f30097h = new int[16];
        reset();
    }

    public o(o oVar) {
        super(oVar);
        this.f30097h = new int[16];
        j(oVar);
    }

    private int g(int i11, int i12, int i13) {
        return ((~i11) & i13) | (i12 & i11);
    }

    private int h(int i11, int i12, int i13) {
        return (i11 & i13) | (i11 & i12) | (i12 & i13);
    }

    private int i(int i11, int i12, int i13) {
        return (i11 ^ i12) ^ i13;
    }

    private void j(o oVar) {
        super.b(oVar);
        this.f30093d = oVar.f30093d;
        this.f30094e = oVar.f30094e;
        this.f30095f = oVar.f30095f;
        this.f30096g = oVar.f30096g;
        int[] iArr = oVar.f30097h;
        System.arraycopy(iArr, 0, this.f30097h, 0, iArr.length);
        this.f30098i = oVar.f30098i;
    }

    private int k(int i11, int i12) {
        return (i11 >>> (32 - i12)) | (i11 << i12);
    }

    private void l(int i11, byte[] bArr, int i12) {
        bArr[i12] = (byte) i11;
        bArr[i12 + 1] = (byte) (i11 >>> 8);
        bArr[i12 + 2] = (byte) (i11 >>> 16);
        bArr[i12 + 3] = (byte) (i11 >>> 24);
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        j((o) hVar);
    }

    @Override // r70.h
    public r70.h copy() {
        return new o(this);
    }

    @Override // i50.h
    protected void d() {
        int i11 = this.f30093d;
        int i12 = this.f30094e;
        int i13 = this.f30095f;
        int i14 = this.f30096g;
        int k11 = k(i11 + g(i12, i13, i14) + this.f30097h[0], 3);
        int k12 = k(i14 + g(k11, i12, i13) + this.f30097h[1], 7);
        int k13 = k(i13 + g(k12, k11, i12) + this.f30097h[2], 11);
        int k14 = k(i12 + g(k13, k12, k11) + this.f30097h[3], 19);
        int k15 = k(k11 + g(k14, k13, k12) + this.f30097h[4], 3);
        int k16 = k(k12 + g(k15, k14, k13) + this.f30097h[5], 7);
        int k17 = k(k13 + g(k16, k15, k14) + this.f30097h[6], 11);
        int k18 = k(k14 + g(k17, k16, k15) + this.f30097h[7], 19);
        int k19 = k(k15 + g(k18, k17, k16) + this.f30097h[8], 3);
        int k21 = k(k16 + g(k19, k18, k17) + this.f30097h[9], 7);
        int k22 = k(k17 + g(k21, k19, k18) + this.f30097h[10], 11);
        int k23 = k(k18 + g(k22, k21, k19) + this.f30097h[11], 19);
        int k24 = k(k19 + g(k23, k22, k21) + this.f30097h[12], 3);
        int k25 = k(k21 + g(k24, k23, k22) + this.f30097h[13], 7);
        int k26 = k(k22 + g(k25, k24, k23) + this.f30097h[14], 11);
        int k27 = k(k23 + g(k26, k25, k24) + this.f30097h[15], 19);
        int k28 = k(k24 + h(k27, k26, k25) + this.f30097h[0] + 1518500249, 3);
        int k29 = k(k25 + h(k28, k27, k26) + this.f30097h[4] + 1518500249, 5);
        int k31 = k(k26 + h(k29, k28, k27) + this.f30097h[8] + 1518500249, 9);
        int k32 = k(k27 + h(k31, k29, k28) + this.f30097h[12] + 1518500249, 13);
        int k33 = k(k28 + h(k32, k31, k29) + this.f30097h[1] + 1518500249, 3);
        int k34 = k(k29 + h(k33, k32, k31) + this.f30097h[5] + 1518500249, 5);
        int k35 = k(k31 + h(k34, k33, k32) + this.f30097h[9] + 1518500249, 9);
        int k36 = k(k32 + h(k35, k34, k33) + this.f30097h[13] + 1518500249, 13);
        int k37 = k(k33 + h(k36, k35, k34) + this.f30097h[2] + 1518500249, 3);
        int k38 = k(k34 + h(k37, k36, k35) + this.f30097h[6] + 1518500249, 5);
        int k39 = k(k35 + h(k38, k37, k36) + this.f30097h[10] + 1518500249, 9);
        int k41 = k(k36 + h(k39, k38, k37) + this.f30097h[14] + 1518500249, 13);
        int k42 = k(k37 + h(k41, k39, k38) + this.f30097h[3] + 1518500249, 3);
        int k43 = k(k38 + h(k42, k41, k39) + this.f30097h[7] + 1518500249, 5);
        int k44 = k(k39 + h(k43, k42, k41) + this.f30097h[11] + 1518500249, 9);
        int k45 = k(k41 + h(k44, k43, k42) + this.f30097h[15] + 1518500249, 13);
        int k46 = k(k42 + i(k45, k44, k43) + this.f30097h[0] + 1859775393, 3);
        int k47 = k(k43 + i(k46, k45, k44) + this.f30097h[8] + 1859775393, 9);
        int k48 = k(k44 + i(k47, k46, k45) + this.f30097h[4] + 1859775393, 11);
        int k49 = k(k45 + i(k48, k47, k46) + this.f30097h[12] + 1859775393, 15);
        int k51 = k(k46 + i(k49, k48, k47) + this.f30097h[2] + 1859775393, 3);
        int k52 = k(k47 + i(k51, k49, k48) + this.f30097h[10] + 1859775393, 9);
        int k53 = k(k48 + i(k52, k51, k49) + this.f30097h[6] + 1859775393, 11);
        int k54 = k(k49 + i(k53, k52, k51) + this.f30097h[14] + 1859775393, 15);
        int k55 = k(k51 + i(k54, k53, k52) + this.f30097h[1] + 1859775393, 3);
        int k56 = k(k52 + i(k55, k54, k53) + this.f30097h[9] + 1859775393, 9);
        int k57 = k(k53 + i(k56, k55, k54) + this.f30097h[5] + 1859775393, 11);
        int k58 = k(k54 + i(k57, k56, k55) + this.f30097h[13] + 1859775393, 15);
        int k59 = k(k55 + i(k58, k57, k56) + this.f30097h[3] + 1859775393, 3);
        int k61 = k(k56 + i(k59, k58, k57) + this.f30097h[11] + 1859775393, 9);
        int k62 = k(k57 + i(k61, k59, k58) + this.f30097h[7] + 1859775393, 11);
        int k63 = k(k58 + i(k62, k61, k59) + this.f30097h[15] + 1859775393, 15);
        this.f30093d += k59;
        this.f30094e += k63;
        this.f30095f += k62;
        this.f30096g += k61;
        this.f30098i = 0;
        int i15 = 0;
        while (true) {
            int[] iArr = this.f30097h;
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
        l(this.f30093d, bArr, i11);
        l(this.f30094e, bArr, i11 + 4);
        l(this.f30095f, bArr, i11 + 8);
        l(this.f30096g, bArr, i11 + 12);
        reset();
        return 16;
    }

    @Override // i50.h
    protected void e(long j11) {
        if (this.f30098i > 14) {
            d();
        }
        int[] iArr = this.f30097h;
        iArr[14] = (int) ((-1) & j11);
        iArr[15] = (int) (j11 >>> 32);
    }

    @Override // i50.h
    protected void f(byte[] bArr, int i11) {
        int[] iArr = this.f30097h;
        int i12 = this.f30098i;
        int i13 = i12 + 1;
        this.f30098i = i13;
        iArr[i12] = ((bArr[i11 + 3] & 255) << 24) | (bArr[i11] & 255) | ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11 + 2] & 255) << 16);
        if (i13 == 16) {
            d();
        }
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "MD4";
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return 16;
    }

    @Override // i50.h, org.bouncycastle.crypto.p
    public void reset() {
        super.reset();
        this.f30093d = 1732584193;
        this.f30094e = -271733879;
        this.f30095f = -1732584194;
        this.f30096g = 271733878;
        this.f30098i = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f30097h;
            if (i11 == iArr.length) {
                return;
            }
            iArr[i11] = 0;
            i11++;
        }
    }
}