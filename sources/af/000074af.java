package i50;

/* loaded from: classes5.dex */
public class b implements org.bouncycastle.crypto.r {

    /* renamed from: s  reason: collision with root package name */
    private static final int[] f29921s = {1779033703, -1150833019, 1013904242, -1521486534, 1359893119, -1694144372, 528734635, 1541459225};

    /* renamed from: t  reason: collision with root package name */
    private static final byte[][] f29922t = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}};

    /* renamed from: a  reason: collision with root package name */
    private int f29923a;

    /* renamed from: b  reason: collision with root package name */
    private int f29924b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f29925c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f29926d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f29927e;

    /* renamed from: f  reason: collision with root package name */
    private int f29928f;

    /* renamed from: g  reason: collision with root package name */
    private int f29929g;

    /* renamed from: h  reason: collision with root package name */
    private int f29930h;

    /* renamed from: i  reason: collision with root package name */
    private long f29931i;

    /* renamed from: j  reason: collision with root package name */
    private int f29932j;

    /* renamed from: k  reason: collision with root package name */
    private int f29933k;

    /* renamed from: l  reason: collision with root package name */
    private byte[] f29934l;

    /* renamed from: m  reason: collision with root package name */
    private int f29935m;

    /* renamed from: n  reason: collision with root package name */
    private int[] f29936n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f29937o;

    /* renamed from: p  reason: collision with root package name */
    private int f29938p;

    /* renamed from: q  reason: collision with root package name */
    private int f29939q;

    /* renamed from: r  reason: collision with root package name */
    private int f29940r;

    public b() {
        this(256);
    }

    public b(int i11) {
        this.f29923a = 32;
        this.f29924b = 0;
        this.f29925c = null;
        this.f29926d = null;
        this.f29927e = null;
        this.f29928f = 1;
        this.f29929g = 1;
        this.f29930h = 0;
        this.f29931i = 0L;
        this.f29932j = 0;
        this.f29933k = 0;
        this.f29934l = null;
        this.f29935m = 0;
        this.f29936n = new int[16];
        this.f29937o = null;
        this.f29938p = 0;
        this.f29939q = 0;
        this.f29940r = 0;
        if (i11 < 8 || i11 > 256 || i11 % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2s digest bit length must be a multiple of 8 and not greater than 256");
        }
        this.f29923a = i11 / 8;
        c(null, null, null);
    }

    public b(b bVar) {
        this.f29923a = 32;
        this.f29924b = 0;
        this.f29925c = null;
        this.f29926d = null;
        this.f29927e = null;
        this.f29928f = 1;
        this.f29929g = 1;
        this.f29930h = 0;
        this.f29931i = 0L;
        this.f29932j = 0;
        this.f29933k = 0;
        this.f29934l = null;
        this.f29935m = 0;
        this.f29936n = new int[16];
        this.f29937o = null;
        this.f29938p = 0;
        this.f29939q = 0;
        this.f29940r = 0;
        this.f29935m = bVar.f29935m;
        this.f29934l = org.bouncycastle.util.a.h(bVar.f29934l);
        this.f29924b = bVar.f29924b;
        this.f29927e = org.bouncycastle.util.a.h(bVar.f29927e);
        this.f29923a = bVar.f29923a;
        this.f29936n = org.bouncycastle.util.a.k(this.f29936n);
        this.f29937o = org.bouncycastle.util.a.k(bVar.f29937o);
        this.f29938p = bVar.f29938p;
        this.f29939q = bVar.f29939q;
        this.f29940r = bVar.f29940r;
        this.f29925c = org.bouncycastle.util.a.h(bVar.f29925c);
        this.f29926d = org.bouncycastle.util.a.h(bVar.f29926d);
        this.f29928f = bVar.f29928f;
        this.f29929g = bVar.f29929g;
        this.f29930h = bVar.f29930h;
        this.f29931i = bVar.f29931i;
        this.f29932j = bVar.f29932j;
        this.f29933k = bVar.f29933k;
    }

    private void a(int i11, int i12, int i13, int i14, int i15, int i16) {
        int[] iArr = this.f29936n;
        iArr[i13] = iArr[i13] + iArr[i14] + i11;
        iArr[i16] = e(iArr[i16] ^ iArr[i13], 16);
        int[] iArr2 = this.f29936n;
        iArr2[i15] = iArr2[i15] + iArr2[i16];
        iArr2[i14] = e(iArr2[i14] ^ iArr2[i15], 12);
        int[] iArr3 = this.f29936n;
        iArr3[i13] = iArr3[i13] + iArr3[i14] + i12;
        iArr3[i16] = e(iArr3[i16] ^ iArr3[i13], 8);
        int[] iArr4 = this.f29936n;
        iArr4[i15] = iArr4[i15] + iArr4[i16];
        iArr4[i14] = e(iArr4[i14] ^ iArr4[i15], 7);
    }

    private void b(byte[] bArr, int i11) {
        d();
        int[] iArr = new int[16];
        int i12 = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            iArr[i13] = r70.i.l(bArr, (i13 * 4) + i11);
        }
        for (int i14 = 0; i14 < 10; i14++) {
            byte[][] bArr2 = f29922t;
            a(iArr[bArr2[i14][0]], iArr[bArr2[i14][1]], 0, 4, 8, 12);
            a(iArr[bArr2[i14][2]], iArr[bArr2[i14][3]], 1, 5, 9, 13);
            a(iArr[bArr2[i14][4]], iArr[bArr2[i14][5]], 2, 6, 10, 14);
            a(iArr[bArr2[i14][6]], iArr[bArr2[i14][7]], 3, 7, 11, 15);
            a(iArr[bArr2[i14][8]], iArr[bArr2[i14][9]], 0, 5, 10, 15);
            a(iArr[bArr2[i14][10]], iArr[bArr2[i14][11]], 1, 6, 11, 12);
            a(iArr[bArr2[i14][12]], iArr[bArr2[i14][13]], 2, 7, 8, 13);
            a(iArr[bArr2[i14][14]], iArr[bArr2[i14][15]], 3, 4, 9, 14);
        }
        while (true) {
            int[] iArr2 = this.f29937o;
            if (i12 >= iArr2.length) {
                return;
            }
            int i15 = iArr2[i12];
            int[] iArr3 = this.f29936n;
            iArr2[i12] = (i15 ^ iArr3[i12]) ^ iArr3[i12 + 8];
            i12++;
        }
    }

    private void c(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f29934l = new byte[64];
        if (bArr3 != null && bArr3.length > 0) {
            if (bArr3.length > 32) {
                throw new IllegalArgumentException("Keys > 32 bytes are not supported");
            }
            byte[] bArr4 = new byte[bArr3.length];
            this.f29927e = bArr4;
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            this.f29924b = bArr3.length;
            System.arraycopy(bArr3, 0, this.f29934l, 0, bArr3.length);
            this.f29935m = 64;
        }
        if (this.f29937o == null) {
            this.f29937o = r0;
            int[] iArr = f29921s;
            long j11 = this.f29931i;
            int[] iArr2 = {iArr[0] ^ ((this.f29923a | (this.f29924b << 8)) | ((this.f29928f << 16) | (this.f29929g << 24))), iArr[1] ^ this.f29930h, ((int) j11) ^ iArr[2], ((((int) (j11 >> 32)) | (this.f29932j << 16)) | (this.f29933k << 24)) ^ iArr[3], iArr[4], iArr[5]};
            if (bArr != null) {
                if (bArr.length != 8) {
                    throw new IllegalArgumentException("Salt length must be exactly 8 bytes");
                }
                byte[] bArr5 = new byte[8];
                this.f29925c = bArr5;
                System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
                int[] iArr3 = this.f29937o;
                iArr3[4] = iArr3[4] ^ r70.i.l(bArr, 0);
                int[] iArr4 = this.f29937o;
                iArr4[5] = r70.i.l(bArr, 4) ^ iArr4[5];
            }
            int[] iArr5 = this.f29937o;
            iArr5[6] = iArr[6];
            iArr5[7] = iArr[7];
            if (bArr2 != null) {
                if (bArr2.length != 8) {
                    throw new IllegalArgumentException("Personalization length must be exactly 8 bytes");
                }
                byte[] bArr6 = new byte[8];
                this.f29926d = bArr6;
                System.arraycopy(bArr2, 0, bArr6, 0, bArr2.length);
                int[] iArr6 = this.f29937o;
                iArr6[6] = iArr6[6] ^ r70.i.l(bArr2, 0);
                int[] iArr7 = this.f29937o;
                iArr7[7] = r70.i.l(bArr2, 4) ^ iArr7[7];
            }
        }
    }

    private void d() {
        int[] iArr = this.f29937o;
        System.arraycopy(iArr, 0, this.f29936n, 0, iArr.length);
        int[] iArr2 = f29921s;
        System.arraycopy(iArr2, 0, this.f29936n, this.f29937o.length, 4);
        int[] iArr3 = this.f29936n;
        iArr3[12] = this.f29938p ^ iArr2[4];
        iArr3[13] = this.f29939q ^ iArr2[5];
        iArr3[14] = this.f29940r ^ iArr2[6];
        iArr3[15] = iArr2[7];
    }

    private int e(int i11, int i12) {
        return (i11 << (32 - i12)) | (i11 >>> i12);
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        int[] iArr;
        int i12;
        this.f29940r = -1;
        int i13 = this.f29938p;
        int i14 = this.f29935m;
        int i15 = i13 + i14;
        this.f29938p = i15;
        if (i15 < 0 && i14 > (-i15)) {
            this.f29939q++;
        }
        b(this.f29934l, 0);
        org.bouncycastle.util.a.y(this.f29934l, (byte) 0);
        org.bouncycastle.util.a.B(this.f29936n, 0);
        int i16 = 0;
        while (true) {
            iArr = this.f29937o;
            if (i16 >= iArr.length || (i12 = i16 * 4) >= this.f29923a) {
                break;
            }
            byte[] k11 = r70.i.k(iArr[i16]);
            int i17 = this.f29923a;
            if (i12 < i17 - 4) {
                System.arraycopy(k11, 0, bArr, i12 + i11, 4);
            } else {
                System.arraycopy(k11, 0, bArr, i11 + i12, i17 - i12);
            }
            i16++;
        }
        org.bouncycastle.util.a.B(iArr, 0);
        reset();
        return this.f29923a;
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "BLAKE2s";
    }

    @Override // org.bouncycastle.crypto.r
    public int getByteLength() {
        return 64;
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return this.f29923a;
    }

    @Override // org.bouncycastle.crypto.p
    public void reset() {
        this.f29935m = 0;
        this.f29940r = 0;
        this.f29938p = 0;
        this.f29939q = 0;
        this.f29937o = null;
        org.bouncycastle.util.a.y(this.f29934l, (byte) 0);
        byte[] bArr = this.f29927e;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f29934l, 0, bArr.length);
            this.f29935m = 64;
        }
        c(this.f29925c, this.f29926d, this.f29927e);
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte b11) {
        int i11 = this.f29935m;
        if (64 - i11 != 0) {
            this.f29934l[i11] = b11;
            this.f29935m = i11 + 1;
            return;
        }
        int i12 = this.f29938p + 64;
        this.f29938p = i12;
        if (i12 == 0) {
            this.f29939q++;
        }
        b(this.f29934l, 0);
        org.bouncycastle.util.a.y(this.f29934l, (byte) 0);
        this.f29934l[0] = b11;
        this.f29935m = 1;
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte[] bArr, int i11, int i12) {
        int i13;
        if (bArr == null || i12 == 0) {
            return;
        }
        int i14 = this.f29935m;
        if (i14 != 0) {
            i13 = 64 - i14;
            if (i13 >= i12) {
                System.arraycopy(bArr, i11, this.f29934l, i14, i12);
                this.f29935m += i12;
            }
            System.arraycopy(bArr, i11, this.f29934l, i14, i13);
            int i15 = this.f29938p + 64;
            this.f29938p = i15;
            if (i15 == 0) {
                this.f29939q++;
            }
            b(this.f29934l, 0);
            this.f29935m = 0;
            org.bouncycastle.util.a.y(this.f29934l, (byte) 0);
        } else {
            i13 = 0;
        }
        int i16 = i12 + i11;
        int i17 = i16 - 64;
        int i18 = i11 + i13;
        while (i18 < i17) {
            int i19 = this.f29938p + 64;
            this.f29938p = i19;
            if (i19 == 0) {
                this.f29939q++;
            }
            b(bArr, i18);
            i18 += 64;
        }
        i12 = i16 - i18;
        System.arraycopy(bArr, i18, this.f29934l, 0, i12);
        this.f29935m += i12;
    }
}