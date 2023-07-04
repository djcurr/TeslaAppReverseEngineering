package ti;

/* loaded from: classes3.dex */
final class f0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f52018a;

    /* renamed from: d  reason: collision with root package name */
    private boolean f52021d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f52022e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f52023f;

    /* renamed from: b  reason: collision with root package name */
    private final ak.g0 f52019b = new ak.g0(0);

    /* renamed from: g  reason: collision with root package name */
    private long f52024g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f52025h = -9223372036854775807L;

    /* renamed from: i  reason: collision with root package name */
    private long f52026i = -9223372036854775807L;

    /* renamed from: c  reason: collision with root package name */
    private final ak.v f52020c = new ak.v();

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(int i11) {
        this.f52018a = i11;
    }

    private int a(ji.i iVar) {
        this.f52020c.L(ak.k0.f482f);
        this.f52021d = true;
        iVar.d();
        return 0;
    }

    private int f(ji.i iVar, ji.u uVar, int i11) {
        int min = (int) Math.min(this.f52018a, iVar.getLength());
        long j11 = 0;
        if (iVar.getPosition() != j11) {
            uVar.f33770a = j11;
            return 1;
        }
        this.f52020c.K(min);
        iVar.d();
        iVar.n(this.f52020c.d(), 0, min);
        this.f52024g = g(this.f52020c, i11);
        this.f52022e = true;
        return 0;
    }

    private long g(ak.v vVar, int i11) {
        int f11 = vVar.f();
        for (int e11 = vVar.e(); e11 < f11; e11++) {
            if (vVar.d()[e11] == 71) {
                long b11 = j0.b(vVar, e11, i11);
                if (b11 != -9223372036854775807L) {
                    return b11;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int h(ji.i iVar, ji.u uVar, int i11) {
        long length = iVar.getLength();
        int min = (int) Math.min(this.f52018a, length);
        long j11 = length - min;
        if (iVar.getPosition() != j11) {
            uVar.f33770a = j11;
            return 1;
        }
        this.f52020c.K(min);
        iVar.d();
        iVar.n(this.f52020c.d(), 0, min);
        this.f52025h = i(this.f52020c, i11);
        this.f52023f = true;
        return 0;
    }

    private long i(ak.v vVar, int i11) {
        int e11 = vVar.e();
        int f11 = vVar.f();
        while (true) {
            f11--;
            if (f11 < e11) {
                return -9223372036854775807L;
            }
            if (vVar.d()[f11] == 71) {
                long b11 = j0.b(vVar, f11, i11);
                if (b11 != -9223372036854775807L) {
                    return b11;
                }
            }
        }
    }

    public long b() {
        return this.f52026i;
    }

    public ak.g0 c() {
        return this.f52019b;
    }

    public boolean d() {
        return this.f52021d;
    }

    public int e(ji.i iVar, ji.u uVar, int i11) {
        if (i11 <= 0) {
            return a(iVar);
        }
        if (!this.f52023f) {
            return h(iVar, uVar, i11);
        }
        if (this.f52025h == -9223372036854775807L) {
            return a(iVar);
        }
        if (!this.f52022e) {
            return f(iVar, uVar, i11);
        }
        long j11 = this.f52024g;
        if (j11 == -9223372036854775807L) {
            return a(iVar);
        }
        this.f52026i = this.f52019b.b(this.f52025h) - this.f52019b.b(j11);
        return a(iVar);
    }
}