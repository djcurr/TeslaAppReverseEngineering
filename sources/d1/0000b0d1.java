package ri;

import ak.k0;
import java.io.EOFException;
import java.io.IOException;
import ji.v;
import ji.w;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a implements g {

    /* renamed from: a  reason: collision with root package name */
    private final f f49565a;

    /* renamed from: b  reason: collision with root package name */
    private final long f49566b;

    /* renamed from: c  reason: collision with root package name */
    private final long f49567c;

    /* renamed from: d  reason: collision with root package name */
    private final i f49568d;

    /* renamed from: e  reason: collision with root package name */
    private int f49569e;

    /* renamed from: f  reason: collision with root package name */
    private long f49570f;

    /* renamed from: g  reason: collision with root package name */
    private long f49571g;

    /* renamed from: h  reason: collision with root package name */
    private long f49572h;

    /* renamed from: i  reason: collision with root package name */
    private long f49573i;

    /* renamed from: j  reason: collision with root package name */
    private long f49574j;

    /* renamed from: k  reason: collision with root package name */
    private long f49575k;

    /* renamed from: l  reason: collision with root package name */
    private long f49576l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class b implements v {
        private b() {
        }

        @Override // ji.v
        public v.a f(long j11) {
            return new v.a(new w(j11, k0.s((a.this.f49566b + ((a.this.f49568d.c(j11) * (a.this.f49567c - a.this.f49566b)) / a.this.f49570f)) - 30000, a.this.f49566b, a.this.f49567c - 1)));
        }

        @Override // ji.v
        public boolean h() {
            return true;
        }

        @Override // ji.v
        public long i() {
            return a.this.f49568d.b(a.this.f49570f);
        }
    }

    public a(i iVar, long j11, long j12, long j13, long j14, boolean z11) {
        ak.a.a(j11 >= 0 && j12 > j11);
        this.f49568d = iVar;
        this.f49566b = j11;
        this.f49567c = j12;
        if (j13 != j12 - j11 && !z11) {
            this.f49569e = 0;
        } else {
            this.f49570f = j14;
            this.f49569e = 4;
        }
        this.f49565a = new f();
    }

    private long i(ji.i iVar) {
        if (this.f49573i == this.f49574j) {
            return -1L;
        }
        long position = iVar.getPosition();
        if (!this.f49565a.e(iVar, this.f49574j)) {
            long j11 = this.f49573i;
            if (j11 != position) {
                return j11;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f49565a.b(iVar, false);
        iVar.d();
        long j12 = this.f49572h;
        f fVar = this.f49565a;
        long j13 = fVar.f49595c;
        long j14 = j12 - j13;
        int i11 = fVar.f49597e + fVar.f49598f;
        if (0 > j14 || j14 >= 72000) {
            int i12 = (j14 > 0L ? 1 : (j14 == 0L ? 0 : -1));
            if (i12 < 0) {
                this.f49574j = position;
                this.f49576l = j13;
            } else {
                this.f49573i = iVar.getPosition() + i11;
                this.f49575k = this.f49565a.f49595c;
            }
            long j15 = this.f49574j;
            long j16 = this.f49573i;
            if (j15 - j16 < 100000) {
                this.f49574j = j16;
                return j16;
            }
            long position2 = iVar.getPosition() - (i11 * (i12 <= 0 ? 2L : 1L));
            long j17 = this.f49574j;
            long j18 = this.f49573i;
            return k0.s(position2 + ((j14 * (j17 - j18)) / (this.f49576l - this.f49575k)), j18, j17 - 1);
        }
        return -1L;
    }

    private void k(ji.i iVar) {
        while (true) {
            this.f49565a.d(iVar);
            this.f49565a.b(iVar, false);
            f fVar = this.f49565a;
            if (fVar.f49595c > this.f49572h) {
                iVar.d();
                return;
            }
            iVar.k(fVar.f49597e + fVar.f49598f);
            this.f49573i = iVar.getPosition();
            this.f49575k = this.f49565a.f49595c;
        }
    }

    @Override // ri.g
    public long a(ji.i iVar) {
        int i11 = this.f49569e;
        if (i11 == 0) {
            long position = iVar.getPosition();
            this.f49571g = position;
            this.f49569e = 1;
            long j11 = this.f49567c - 65307;
            if (j11 > position) {
                return j11;
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
                long i12 = i(iVar);
                if (i12 != -1) {
                    return i12;
                }
                this.f49569e = 3;
            } else if (i11 != 3) {
                if (i11 == 4) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            k(iVar);
            this.f49569e = 4;
            return -(this.f49575k + 2);
        }
        this.f49570f = j(iVar);
        this.f49569e = 4;
        return this.f49571g;
    }

    @Override // ri.g
    public void c(long j11) {
        this.f49572h = k0.s(j11, 0L, this.f49570f - 1);
        this.f49569e = 2;
        this.f49573i = this.f49566b;
        this.f49574j = this.f49567c;
        this.f49575k = 0L;
        this.f49576l = this.f49570f;
    }

    @Override // ri.g
    /* renamed from: h */
    public b b() {
        if (this.f49570f != 0) {
            return new b();
        }
        return null;
    }

    long j(ji.i iVar) {
        this.f49565a.c();
        if (this.f49565a.d(iVar)) {
            do {
                this.f49565a.b(iVar, false);
                f fVar = this.f49565a;
                iVar.k(fVar.f49597e + fVar.f49598f);
                f fVar2 = this.f49565a;
                if ((fVar2.f49594b & 4) == 4 || !fVar2.d(iVar)) {
                    break;
                }
            } while (iVar.getPosition() < this.f49567c);
            return this.f49565a.f49595c;
        }
        throw new EOFException();
    }
}