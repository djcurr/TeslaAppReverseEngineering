package ti;

/* loaded from: classes3.dex */
final class y {

    /* renamed from: c  reason: collision with root package name */
    private boolean f52308c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f52309d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f52310e;

    /* renamed from: a  reason: collision with root package name */
    private final ak.g0 f52306a = new ak.g0(0);

    /* renamed from: f  reason: collision with root package name */
    private long f52311f = -9223372036854775807L;

    /* renamed from: g  reason: collision with root package name */
    private long f52312g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f52313h = -9223372036854775807L;

    /* renamed from: b  reason: collision with root package name */
    private final ak.v f52307b = new ak.v();

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(ji.i iVar) {
        this.f52307b.L(ak.k0.f482f);
        this.f52308c = true;
        iVar.d();
        return 0;
    }

    private int f(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 255) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11 + 2] & 255) << 8);
    }

    private int h(ji.i iVar, ji.u uVar) {
        int min = (int) Math.min(20000L, iVar.getLength());
        long j11 = 0;
        if (iVar.getPosition() != j11) {
            uVar.f33770a = j11;
            return 1;
        }
        this.f52307b.K(min);
        iVar.d();
        iVar.n(this.f52307b.d(), 0, min);
        this.f52311f = i(this.f52307b);
        this.f52309d = true;
        return 0;
    }

    private long i(ak.v vVar) {
        int f11 = vVar.f();
        for (int e11 = vVar.e(); e11 < f11 - 3; e11++) {
            if (f(vVar.d(), e11) == 442) {
                vVar.O(e11 + 4);
                long l11 = l(vVar);
                if (l11 != -9223372036854775807L) {
                    return l11;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int j(ji.i iVar, ji.u uVar) {
        long length = iVar.getLength();
        int min = (int) Math.min(20000L, length);
        long j11 = length - min;
        if (iVar.getPosition() != j11) {
            uVar.f33770a = j11;
            return 1;
        }
        this.f52307b.K(min);
        iVar.d();
        iVar.n(this.f52307b.d(), 0, min);
        this.f52312g = k(this.f52307b);
        this.f52310e = true;
        return 0;
    }

    private long k(ak.v vVar) {
        int e11 = vVar.e();
        for (int f11 = vVar.f() - 4; f11 >= e11; f11--) {
            if (f(vVar.d(), f11) == 442) {
                vVar.O(f11 + 4);
                long l11 = l(vVar);
                if (l11 != -9223372036854775807L) {
                    return l11;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long l(ak.v vVar) {
        int e11 = vVar.e();
        if (vVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        vVar.j(bArr, 0, 9);
        vVar.O(e11);
        if (a(bArr)) {
            return m(bArr);
        }
        return -9223372036854775807L;
    }

    private static long m(byte[] bArr) {
        return (((bArr[0] & 56) >> 3) << 30) | ((bArr[0] & 3) << 28) | ((bArr[1] & 255) << 20) | (((bArr[2] & 248) >> 3) << 15) | ((bArr[2] & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    public long c() {
        return this.f52313h;
    }

    public ak.g0 d() {
        return this.f52306a;
    }

    public boolean e() {
        return this.f52308c;
    }

    public int g(ji.i iVar, ji.u uVar) {
        if (!this.f52310e) {
            return j(iVar, uVar);
        }
        if (this.f52312g == -9223372036854775807L) {
            return b(iVar);
        }
        if (!this.f52309d) {
            return h(iVar, uVar);
        }
        long j11 = this.f52311f;
        if (j11 == -9223372036854775807L) {
            return b(iVar);
        }
        this.f52313h = this.f52306a.b(this.f52312g) - this.f52306a.b(j11);
        return b(iVar);
    }
}