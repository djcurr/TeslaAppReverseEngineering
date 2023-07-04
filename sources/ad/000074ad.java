package i50;

/* loaded from: classes5.dex */
public class a implements org.bouncycastle.crypto.r {

    /* renamed from: m  reason: collision with root package name */
    private static final long[] f29906m = {7640891576956012808L, -4942790177534073029L, 4354685564936845355L, -6534734903238641935L, 5840696475078001361L, -7276294671716946913L, 2270897969802886507L, 6620516959819538809L};

    /* renamed from: n  reason: collision with root package name */
    private static final byte[][] f29907n = {new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}, new byte[]{11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4}, new byte[]{7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8}, new byte[]{9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13}, new byte[]{2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9}, new byte[]{12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11}, new byte[]{13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10}, new byte[]{6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5}, new byte[]{10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0}, new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, new byte[]{14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3}};

    /* renamed from: o  reason: collision with root package name */
    private static int f29908o = 12;

    /* renamed from: a  reason: collision with root package name */
    private int f29909a;

    /* renamed from: b  reason: collision with root package name */
    private int f29910b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f29911c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f29912d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f29913e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f29914f;

    /* renamed from: g  reason: collision with root package name */
    private int f29915g;

    /* renamed from: h  reason: collision with root package name */
    private long[] f29916h;

    /* renamed from: i  reason: collision with root package name */
    private long[] f29917i;

    /* renamed from: j  reason: collision with root package name */
    private long f29918j;

    /* renamed from: k  reason: collision with root package name */
    private long f29919k;

    /* renamed from: l  reason: collision with root package name */
    private long f29920l;

    public a() {
        this(512);
    }

    public a(int i11) {
        this.f29909a = 64;
        this.f29910b = 0;
        this.f29911c = null;
        this.f29912d = null;
        this.f29913e = null;
        this.f29914f = null;
        this.f29915g = 0;
        this.f29916h = new long[16];
        this.f29917i = null;
        this.f29918j = 0L;
        this.f29919k = 0L;
        this.f29920l = 0L;
        if (i11 < 8 || i11 > 512 || i11 % 8 != 0) {
            throw new IllegalArgumentException("BLAKE2b digest bit length must be a multiple of 8 and not greater than 512");
        }
        this.f29914f = new byte[128];
        this.f29910b = 0;
        this.f29909a = i11 / 8;
        c();
    }

    public a(a aVar) {
        this.f29909a = 64;
        this.f29910b = 0;
        this.f29911c = null;
        this.f29912d = null;
        this.f29913e = null;
        this.f29914f = null;
        this.f29915g = 0;
        this.f29916h = new long[16];
        this.f29917i = null;
        this.f29918j = 0L;
        this.f29919k = 0L;
        this.f29920l = 0L;
        this.f29915g = aVar.f29915g;
        this.f29914f = org.bouncycastle.util.a.h(aVar.f29914f);
        this.f29910b = aVar.f29910b;
        this.f29913e = org.bouncycastle.util.a.h(aVar.f29913e);
        this.f29909a = aVar.f29909a;
        this.f29917i = org.bouncycastle.util.a.l(aVar.f29917i);
        this.f29912d = org.bouncycastle.util.a.h(aVar.f29912d);
        this.f29911c = org.bouncycastle.util.a.h(aVar.f29911c);
        this.f29918j = aVar.f29918j;
        this.f29919k = aVar.f29919k;
        this.f29920l = aVar.f29920l;
    }

    private void a(long j11, long j12, int i11, int i12, int i13, int i14) {
        long[] jArr = this.f29916h;
        jArr[i11] = jArr[i11] + jArr[i12] + j11;
        jArr[i14] = r70.g.b(jArr[i14] ^ jArr[i11], 32);
        long[] jArr2 = this.f29916h;
        jArr2[i13] = jArr2[i13] + jArr2[i14];
        jArr2[i12] = r70.g.b(jArr2[i12] ^ jArr2[i13], 24);
        long[] jArr3 = this.f29916h;
        jArr3[i11] = jArr3[i11] + jArr3[i12] + j12;
        jArr3[i14] = r70.g.b(jArr3[i14] ^ jArr3[i11], 16);
        long[] jArr4 = this.f29916h;
        jArr4[i13] = jArr4[i13] + jArr4[i14];
        jArr4[i12] = r70.g.b(jArr4[i12] ^ jArr4[i13], 63);
    }

    private void b(byte[] bArr, int i11) {
        d();
        long[] jArr = new long[16];
        int i12 = 0;
        for (int i13 = 0; i13 < 16; i13++) {
            jArr[i13] = r70.i.p(bArr, (i13 * 8) + i11);
        }
        for (int i14 = 0; i14 < f29908o; i14++) {
            byte[][] bArr2 = f29907n;
            a(jArr[bArr2[i14][0]], jArr[bArr2[i14][1]], 0, 4, 8, 12);
            a(jArr[bArr2[i14][2]], jArr[bArr2[i14][3]], 1, 5, 9, 13);
            a(jArr[bArr2[i14][4]], jArr[bArr2[i14][5]], 2, 6, 10, 14);
            a(jArr[bArr2[i14][6]], jArr[bArr2[i14][7]], 3, 7, 11, 15);
            a(jArr[bArr2[i14][8]], jArr[bArr2[i14][9]], 0, 5, 10, 15);
            a(jArr[bArr2[i14][10]], jArr[bArr2[i14][11]], 1, 6, 11, 12);
            a(jArr[bArr2[i14][12]], jArr[bArr2[i14][13]], 2, 7, 8, 13);
            a(jArr[bArr2[i14][14]], jArr[bArr2[i14][15]], 3, 4, 9, 14);
        }
        while (true) {
            long[] jArr2 = this.f29917i;
            if (i12 >= jArr2.length) {
                return;
            }
            long j11 = jArr2[i12];
            long[] jArr3 = this.f29916h;
            jArr2[i12] = (j11 ^ jArr3[i12]) ^ jArr3[i12 + 8];
            i12++;
        }
    }

    private void c() {
        if (this.f29917i == null) {
            this.f29917i = r1;
            long[] jArr = f29906m;
            long[] jArr2 = {jArr[0] ^ ((this.f29909a | (this.f29910b << 8)) | 16842752), jArr[1], jArr[2], jArr[3], jArr[4], jArr[5]};
            byte[] bArr = this.f29911c;
            if (bArr != null) {
                jArr2[4] = jArr2[4] ^ r70.i.p(bArr, 0);
                long[] jArr3 = this.f29917i;
                jArr3[5] = jArr3[5] ^ r70.i.p(this.f29911c, 8);
            }
            long[] jArr4 = this.f29917i;
            jArr4[6] = jArr[6];
            jArr4[7] = jArr[7];
            byte[] bArr2 = this.f29912d;
            if (bArr2 != null) {
                jArr4[6] = r70.i.p(bArr2, 0) ^ jArr4[6];
                long[] jArr5 = this.f29917i;
                jArr5[7] = jArr5[7] ^ r70.i.p(this.f29912d, 8);
            }
        }
    }

    private void d() {
        long[] jArr = this.f29917i;
        System.arraycopy(jArr, 0, this.f29916h, 0, jArr.length);
        long[] jArr2 = f29906m;
        System.arraycopy(jArr2, 0, this.f29916h, this.f29917i.length, 4);
        long[] jArr3 = this.f29916h;
        jArr3[12] = this.f29918j ^ jArr2[4];
        jArr3[13] = this.f29919k ^ jArr2[5];
        jArr3[14] = this.f29920l ^ jArr2[6];
        jArr3[15] = jArr2[7];
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        long[] jArr;
        int i12;
        this.f29920l = -1L;
        long j11 = this.f29918j;
        int i13 = this.f29915g;
        long j12 = j11 + i13;
        this.f29918j = j12;
        if (i13 > 0 && j12 == 0) {
            this.f29919k++;
        }
        b(this.f29914f, 0);
        org.bouncycastle.util.a.y(this.f29914f, (byte) 0);
        org.bouncycastle.util.a.C(this.f29916h, 0L);
        int i14 = 0;
        while (true) {
            jArr = this.f29917i;
            if (i14 >= jArr.length || (i12 = i14 * 8) >= this.f29909a) {
                break;
            }
            byte[] y11 = r70.i.y(jArr[i14]);
            int i15 = this.f29909a;
            if (i12 < i15 - 8) {
                System.arraycopy(y11, 0, bArr, i12 + i11, 8);
            } else {
                System.arraycopy(y11, 0, bArr, i11 + i12, i15 - i12);
            }
            i14++;
        }
        org.bouncycastle.util.a.C(jArr, 0L);
        reset();
        return this.f29909a;
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "BLAKE2b";
    }

    @Override // org.bouncycastle.crypto.r
    public int getByteLength() {
        return 128;
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return this.f29909a;
    }

    @Override // org.bouncycastle.crypto.p
    public void reset() {
        this.f29915g = 0;
        this.f29920l = 0L;
        this.f29918j = 0L;
        this.f29919k = 0L;
        this.f29917i = null;
        org.bouncycastle.util.a.y(this.f29914f, (byte) 0);
        byte[] bArr = this.f29913e;
        if (bArr != null) {
            System.arraycopy(bArr, 0, this.f29914f, 0, bArr.length);
            this.f29915g = 128;
        }
        c();
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte b11) {
        int i11 = this.f29915g;
        if (128 - i11 != 0) {
            this.f29914f[i11] = b11;
            this.f29915g = i11 + 1;
            return;
        }
        long j11 = this.f29918j + 128;
        this.f29918j = j11;
        if (j11 == 0) {
            this.f29919k++;
        }
        b(this.f29914f, 0);
        org.bouncycastle.util.a.y(this.f29914f, (byte) 0);
        this.f29914f[0] = b11;
        this.f29915g = 1;
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte[] bArr, int i11, int i12) {
        int i13;
        if (bArr == null || i12 == 0) {
            return;
        }
        int i14 = this.f29915g;
        if (i14 != 0) {
            i13 = 128 - i14;
            if (i13 >= i12) {
                System.arraycopy(bArr, i11, this.f29914f, i14, i12);
                this.f29915g += i12;
            }
            System.arraycopy(bArr, i11, this.f29914f, i14, i13);
            long j11 = this.f29918j + 128;
            this.f29918j = j11;
            if (j11 == 0) {
                this.f29919k++;
            }
            b(this.f29914f, 0);
            this.f29915g = 0;
            org.bouncycastle.util.a.y(this.f29914f, (byte) 0);
        } else {
            i13 = 0;
        }
        int i15 = i12 + i11;
        int i16 = i15 - 128;
        int i17 = i11 + i13;
        while (i17 < i16) {
            long j12 = this.f29918j + 128;
            this.f29918j = j12;
            if (j12 == 0) {
                this.f29919k++;
            }
            b(bArr, i17);
            i17 += 128;
        }
        i12 = i15 - i17;
        System.arraycopy(bArr, i17, this.f29914f, 0, i12);
        this.f29915g += i12;
    }
}