package i50;

/* loaded from: classes5.dex */
public abstract class m implements org.bouncycastle.crypto.r, r70.h {

    /* renamed from: o  reason: collision with root package name */
    static final long[] f30071o = {4794697086780616226L, 8158064640168781261L, -5349999486874862801L, -1606136188198331460L, 4131703408338449720L, 6480981068601479193L, -7908458776815382629L, -6116909921290321640L, -2880145864133508542L, 1334009975649890238L, 2608012711638119052L, 6128411473006802146L, 8268148722764581231L, -9160688886553864527L, -7215885187991268811L, -4495734319001033068L, -1973867731355612462L, -1171420211273849373L, 1135362057144423861L, 2597628984639134821L, 3308224258029322869L, 5365058923640841347L, 6679025012923562964L, 8573033837759648693L, -7476448914759557205L, -6327057829258317296L, -5763719355590565569L, -4658551843659510044L, -4116276920077217854L, -3051310485924567259L, 489312712824947311L, 1452737877330783856L, 2861767655752347644L, 3322285676063803686L, 5560940570517711597L, 5996557281743188959L, 7280758554555802590L, 8532644243296465576L, -9096487096722542874L, -7894198246740708037L, -6719396339535248540L, -6333637450476146687L, -4446306890439682159L, -4076793802049405392L, -3345356375505022440L, -2983346525034927856L, -860691631967231958L, 1182934255886127544L, 1847814050463011016L, 2177327727835720531L, 2830643537854262169L, 3796741975233480872L, 4115178125766777443L, 5681478168544905931L, 6601373596472566643L, 7507060721942968483L, 8399075790359081724L, 8693463985226723168L, -8878714635349349518L, -8302665154208450068L, -8016688836872298968L, -6606660893046293015L, -4685533653050689259L, -4147400797238176981L, -3880063495543823972L, -3348786107499101689L, -1523767162380948706L, -757361751448694408L, 500013540394364858L, 748580250866718886L, 1242879168328830382L, 1977374033974150939L, 2944078676154940804L, 3659926193048069267L, 4368137639120453308L, 4836135668995329356L, 5532061633213252278L, 6448918945643986474L, 6902733635092675308L, 7801388544844847127L};

    /* renamed from: a  reason: collision with root package name */
    private byte[] f30072a;

    /* renamed from: b  reason: collision with root package name */
    private int f30073b;

    /* renamed from: c  reason: collision with root package name */
    private long f30074c;

    /* renamed from: d  reason: collision with root package name */
    private long f30075d;

    /* renamed from: e  reason: collision with root package name */
    protected long f30076e;

    /* renamed from: f  reason: collision with root package name */
    protected long f30077f;

    /* renamed from: g  reason: collision with root package name */
    protected long f30078g;

    /* renamed from: h  reason: collision with root package name */
    protected long f30079h;

    /* renamed from: i  reason: collision with root package name */
    protected long f30080i;

    /* renamed from: j  reason: collision with root package name */
    protected long f30081j;

    /* renamed from: k  reason: collision with root package name */
    protected long f30082k;

    /* renamed from: l  reason: collision with root package name */
    protected long f30083l;

    /* renamed from: m  reason: collision with root package name */
    private long[] f30084m;

    /* renamed from: n  reason: collision with root package name */
    private int f30085n;

    /* JADX INFO: Access modifiers changed from: protected */
    public m() {
        this.f30072a = new byte[8];
        this.f30084m = new long[80];
        this.f30073b = 0;
        reset();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public m(m mVar) {
        this.f30072a = new byte[8];
        this.f30084m = new long[80];
        i(mVar);
    }

    private long b(long j11, long j12, long j13) {
        return ((~j11) & j13) ^ (j12 & j11);
    }

    private long c(long j11, long j12, long j13) {
        return ((j11 & j13) ^ (j11 & j12)) ^ (j12 & j13);
    }

    private long d(long j11) {
        return (j11 >>> 7) ^ (((j11 << 63) | (j11 >>> 1)) ^ ((j11 << 56) | (j11 >>> 8)));
    }

    private long e(long j11) {
        return (j11 >>> 6) ^ (((j11 << 45) | (j11 >>> 19)) ^ ((j11 << 3) | (j11 >>> 61)));
    }

    private long f(long j11) {
        return ((j11 >>> 39) | (j11 << 25)) ^ (((j11 << 36) | (j11 >>> 28)) ^ ((j11 << 30) | (j11 >>> 34)));
    }

    private long g(long j11) {
        return ((j11 >>> 41) | (j11 << 23)) ^ (((j11 << 50) | (j11 >>> 14)) ^ ((j11 << 46) | (j11 >>> 18)));
    }

    private void h() {
        long j11 = this.f30074c;
        if (j11 > 2305843009213693951L) {
            this.f30075d += j11 >>> 61;
            this.f30074c = j11 & 2305843009213693951L;
        }
    }

    @Override // org.bouncycastle.crypto.r
    public int getByteLength() {
        return 128;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(m mVar) {
        byte[] bArr = mVar.f30072a;
        System.arraycopy(bArr, 0, this.f30072a, 0, bArr.length);
        this.f30073b = mVar.f30073b;
        this.f30074c = mVar.f30074c;
        this.f30075d = mVar.f30075d;
        this.f30076e = mVar.f30076e;
        this.f30077f = mVar.f30077f;
        this.f30078g = mVar.f30078g;
        this.f30079h = mVar.f30079h;
        this.f30080i = mVar.f30080i;
        this.f30081j = mVar.f30081j;
        this.f30082k = mVar.f30082k;
        this.f30083l = mVar.f30083l;
        long[] jArr = mVar.f30084m;
        System.arraycopy(jArr, 0, this.f30084m, 0, jArr.length);
        this.f30085n = mVar.f30085n;
    }

    public void j() {
        h();
        long j11 = this.f30074c << 3;
        long j12 = this.f30075d;
        byte b11 = Byte.MIN_VALUE;
        while (true) {
            update(b11);
            if (this.f30073b == 0) {
                l(j11, j12);
                k();
                return;
            }
            b11 = 0;
        }
    }

    protected void k() {
        h();
        for (int i11 = 16; i11 <= 79; i11++) {
            long[] jArr = this.f30084m;
            long e11 = e(jArr[i11 - 2]);
            long[] jArr2 = this.f30084m;
            jArr[i11] = e11 + jArr2[i11 - 7] + d(jArr2[i11 - 15]) + this.f30084m[i11 - 16];
        }
        long j11 = this.f30076e;
        long j12 = this.f30077f;
        long j13 = this.f30078g;
        long j14 = this.f30079h;
        long j15 = this.f30080i;
        long j16 = this.f30081j;
        long j17 = this.f30082k;
        long j18 = j16;
        long j19 = j14;
        int i12 = 0;
        long j21 = j12;
        long j22 = j13;
        long j23 = j15;
        int i13 = 0;
        long j24 = this.f30083l;
        long j25 = j11;
        long j26 = j17;
        while (i13 < 10) {
            long j27 = j23;
            long[] jArr3 = f30071o;
            int i14 = i12 + 1;
            long g11 = j24 + g(j23) + b(j23, j18, j26) + jArr3[i12] + this.f30084m[i12];
            long j28 = j19 + g11;
            long f11 = g11 + f(j25) + c(j25, j21, j22);
            int i15 = i14 + 1;
            long g12 = j26 + g(j28) + b(j28, j27, j18) + jArr3[i14] + this.f30084m[i14];
            long j29 = j22 + g12;
            long f12 = g12 + f(f11) + c(f11, j25, j21);
            int i16 = i15 + 1;
            long g13 = j18 + g(j29) + b(j29, j28, j27) + jArr3[i15] + this.f30084m[i15];
            long j31 = j21 + g13;
            long f13 = g13 + f(f12) + c(f12, f11, j25);
            int i17 = i16 + 1;
            long g14 = j27 + g(j31) + b(j31, j29, j28) + jArr3[i16] + this.f30084m[i16];
            long j32 = j25 + g14;
            long f14 = g14 + f(f13) + c(f13, f12, f11);
            int i18 = i17 + 1;
            long g15 = j28 + g(j32) + b(j32, j31, j29) + jArr3[i17] + this.f30084m[i17];
            long j33 = f11 + g15;
            long f15 = g15 + f(f14) + c(f14, f13, f12);
            int i19 = i18 + 1;
            long g16 = j29 + g(j33) + b(j33, j32, j31) + jArr3[i18] + this.f30084m[i18];
            long j34 = f12 + g16;
            long f16 = g16 + f(f15) + c(f15, f14, f13);
            j26 = j34;
            int i21 = i19 + 1;
            long g17 = j31 + g(j34) + b(j34, j33, j32) + jArr3[i19] + this.f30084m[i19];
            long j35 = f13 + g17;
            j18 = j35;
            j21 = g17 + f(f16) + c(f16, f15, f14);
            long g18 = j32 + g(j35) + b(j35, j26, j33) + jArr3[i21] + this.f30084m[i21];
            long f17 = g18 + f(j21) + c(j21, f16, f15);
            i13++;
            j23 = f14 + g18;
            j22 = f16;
            j24 = j33;
            j19 = f15;
            i12 = i21 + 1;
            j25 = f17;
        }
        this.f30076e += j25;
        this.f30077f += j21;
        this.f30078g += j22;
        this.f30079h += j19;
        this.f30080i += j23;
        this.f30081j += j18;
        this.f30082k += j26;
        this.f30083l += j24;
        this.f30085n = 0;
        for (int i22 = 0; i22 < 16; i22++) {
            this.f30084m[i22] = 0;
        }
    }

    protected void l(long j11, long j12) {
        if (this.f30085n > 14) {
            k();
        }
        long[] jArr = this.f30084m;
        jArr[14] = j12;
        jArr[15] = j11;
    }

    protected void m(byte[] bArr, int i11) {
        this.f30084m[this.f30085n] = r70.i.c(bArr, i11);
        int i12 = this.f30085n + 1;
        this.f30085n = i12;
        if (i12 == 16) {
            k();
        }
    }

    @Override // org.bouncycastle.crypto.p
    public void reset() {
        this.f30074c = 0L;
        this.f30075d = 0L;
        int i11 = 0;
        this.f30073b = 0;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.f30072a;
            if (i12 >= bArr.length) {
                break;
            }
            bArr[i12] = 0;
            i12++;
        }
        this.f30085n = 0;
        while (true) {
            long[] jArr = this.f30084m;
            if (i11 == jArr.length) {
                return;
            }
            jArr[i11] = 0;
            i11++;
        }
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte b11) {
        byte[] bArr = this.f30072a;
        int i11 = this.f30073b;
        int i12 = i11 + 1;
        this.f30073b = i12;
        bArr[i11] = b11;
        if (i12 == bArr.length) {
            m(bArr, 0);
            this.f30073b = 0;
        }
        this.f30074c++;
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte[] bArr, int i11, int i12) {
        while (this.f30073b != 0 && i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
        while (i12 > this.f30072a.length) {
            m(bArr, i11);
            byte[] bArr2 = this.f30072a;
            i11 += bArr2.length;
            i12 -= bArr2.length;
            this.f30074c += bArr2.length;
        }
        while (i12 > 0) {
            update(bArr[i11]);
            i11++;
            i12--;
        }
    }
}