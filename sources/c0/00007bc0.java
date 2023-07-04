package ji;

import ak.k0;
import ji.v;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final C0616a f33686a;

    /* renamed from: b  reason: collision with root package name */
    protected final f f33687b;

    /* renamed from: c  reason: collision with root package name */
    protected c f33688c;

    /* renamed from: d  reason: collision with root package name */
    private final int f33689d;

    /* renamed from: ji.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0616a implements v {

        /* renamed from: a  reason: collision with root package name */
        private final d f33690a;

        /* renamed from: b  reason: collision with root package name */
        private final long f33691b;

        /* renamed from: c  reason: collision with root package name */
        private final long f33692c;

        /* renamed from: d  reason: collision with root package name */
        private final long f33693d;

        /* renamed from: e  reason: collision with root package name */
        private final long f33694e;

        /* renamed from: f  reason: collision with root package name */
        private final long f33695f;

        /* renamed from: g  reason: collision with root package name */
        private final long f33696g;

        public C0616a(d dVar, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f33690a = dVar;
            this.f33691b = j11;
            this.f33692c = j12;
            this.f33693d = j13;
            this.f33694e = j14;
            this.f33695f = j15;
            this.f33696g = j16;
        }

        @Override // ji.v
        public v.a f(long j11) {
            return new v.a(new w(j11, c.h(this.f33690a.a(j11), this.f33692c, this.f33693d, this.f33694e, this.f33695f, this.f33696g)));
        }

        @Override // ji.v
        public boolean h() {
            return true;
        }

        @Override // ji.v
        public long i() {
            return this.f33691b;
        }

        public long k(long j11) {
            return this.f33690a.a(j11);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements d {
        @Override // ji.a.d
        public long a(long j11) {
            return j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final long f33697a;

        /* renamed from: b  reason: collision with root package name */
        private final long f33698b;

        /* renamed from: c  reason: collision with root package name */
        private final long f33699c;

        /* renamed from: d  reason: collision with root package name */
        private long f33700d;

        /* renamed from: e  reason: collision with root package name */
        private long f33701e;

        /* renamed from: f  reason: collision with root package name */
        private long f33702f;

        /* renamed from: g  reason: collision with root package name */
        private long f33703g;

        /* renamed from: h  reason: collision with root package name */
        private long f33704h;

        protected c(long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
            this.f33697a = j11;
            this.f33698b = j12;
            this.f33700d = j13;
            this.f33701e = j14;
            this.f33702f = j15;
            this.f33703g = j16;
            this.f33699c = j17;
            this.f33704h = h(j12, j13, j14, j15, j16, j17);
        }

        protected static long h(long j11, long j12, long j13, long j14, long j15, long j16) {
            if (j14 + 1 >= j15 || j12 + 1 >= j13) {
                return j14;
            }
            long j17 = ((float) (j11 - j12)) * (((float) (j15 - j14)) / ((float) (j13 - j12)));
            return k0.s(((j17 + j14) - j16) - (j17 / 20), j14, j15 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f33703g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f33702f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f33704h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f33697a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f33698b;
        }

        private void n() {
            this.f33704h = h(this.f33698b, this.f33700d, this.f33701e, this.f33702f, this.f33703g, this.f33699c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j11, long j12) {
            this.f33701e = j11;
            this.f33703g = j12;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j11, long j12) {
            this.f33700d = j11;
            this.f33702f = j12;
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public interface d {
        long a(long j11);
    }

    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: d  reason: collision with root package name */
        public static final e f33705d = new e(-3, -9223372036854775807L, -1);

        /* renamed from: a  reason: collision with root package name */
        private final int f33706a;

        /* renamed from: b  reason: collision with root package name */
        private final long f33707b;

        /* renamed from: c  reason: collision with root package name */
        private final long f33708c;

        private e(int i11, long j11, long j12) {
            this.f33706a = i11;
            this.f33707b = j11;
            this.f33708c = j12;
        }

        public static e d(long j11, long j12) {
            return new e(-1, j11, j12);
        }

        public static e e(long j11) {
            return new e(0, -9223372036854775807L, j11);
        }

        public static e f(long j11, long j12) {
            return new e(-2, j11, j12);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public interface f {
        default void a() {
        }

        e b(i iVar, long j11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(d dVar, f fVar, long j11, long j12, long j13, long j14, long j15, long j16, int i11) {
        this.f33687b = fVar;
        this.f33689d = i11;
        this.f33686a = new C0616a(dVar, j11, j12, j13, j14, j15, j16);
    }

    protected c a(long j11) {
        return new c(j11, this.f33686a.k(j11), this.f33686a.f33692c, this.f33686a.f33693d, this.f33686a.f33694e, this.f33686a.f33695f, this.f33686a.f33696g);
    }

    public final v b() {
        return this.f33686a;
    }

    public int c(i iVar, u uVar) {
        while (true) {
            c cVar = (c) ak.a.h(this.f33688c);
            long j11 = cVar.j();
            long i11 = cVar.i();
            long k11 = cVar.k();
            if (i11 - j11 <= this.f33689d) {
                e(false, j11);
                return g(iVar, j11, uVar);
            } else if (!i(iVar, k11)) {
                return g(iVar, k11, uVar);
            } else {
                iVar.d();
                e b11 = this.f33687b.b(iVar, cVar.m());
                int i12 = b11.f33706a;
                if (i12 == -3) {
                    e(false, k11);
                    return g(iVar, k11, uVar);
                } else if (i12 == -2) {
                    cVar.p(b11.f33707b, b11.f33708c);
                } else if (i12 != -1) {
                    if (i12 == 0) {
                        i(iVar, b11.f33708c);
                        e(true, b11.f33708c);
                        return g(iVar, b11.f33708c, uVar);
                    }
                    throw new IllegalStateException("Invalid case");
                } else {
                    cVar.o(b11.f33707b, b11.f33708c);
                }
            }
        }
    }

    public final boolean d() {
        return this.f33688c != null;
    }

    protected final void e(boolean z11, long j11) {
        this.f33688c = null;
        this.f33687b.a();
        f(z11, j11);
    }

    protected void f(boolean z11, long j11) {
    }

    protected final int g(i iVar, long j11, u uVar) {
        if (j11 == iVar.getPosition()) {
            return 0;
        }
        uVar.f33770a = j11;
        return 1;
    }

    public final void h(long j11) {
        c cVar = this.f33688c;
        if (cVar == null || cVar.l() != j11) {
            this.f33688c = a(j11);
        }
    }

    protected final boolean i(i iVar, long j11) {
        long position = j11 - iVar.getPosition();
        if (position < 0 || position > 262144) {
            return false;
        }
        iVar.k((int) position);
        return true;
    }
}