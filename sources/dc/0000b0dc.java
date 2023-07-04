package ri;

import ak.k0;
import ji.u;
import ji.v;
import ji.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class i {

    /* renamed from: b  reason: collision with root package name */
    private x f49604b;

    /* renamed from: c  reason: collision with root package name */
    private ji.j f49605c;

    /* renamed from: d  reason: collision with root package name */
    private g f49606d;

    /* renamed from: e  reason: collision with root package name */
    private long f49607e;

    /* renamed from: f  reason: collision with root package name */
    private long f49608f;

    /* renamed from: g  reason: collision with root package name */
    private long f49609g;

    /* renamed from: h  reason: collision with root package name */
    private int f49610h;

    /* renamed from: i  reason: collision with root package name */
    private int f49611i;

    /* renamed from: k  reason: collision with root package name */
    private long f49613k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f49614l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f49615m;

    /* renamed from: a  reason: collision with root package name */
    private final e f49603a = new e();

    /* renamed from: j  reason: collision with root package name */
    private b f49612j = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        ci.i f49616a;

        /* renamed from: b  reason: collision with root package name */
        g f49617b;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class c implements g {
        private c() {
        }

        @Override // ri.g
        public long a(ji.i iVar) {
            return -1L;
        }

        @Override // ri.g
        public v b() {
            return new v.b(-9223372036854775807L);
        }

        @Override // ri.g
        public void c(long j11) {
        }
    }

    private void a() {
        ak.a.h(this.f49604b);
        k0.j(this.f49605c);
    }

    private boolean i(ji.i iVar) {
        while (this.f49603a.d(iVar)) {
            this.f49613k = iVar.getPosition() - this.f49608f;
            if (!h(this.f49603a.c(), this.f49608f, this.f49612j)) {
                return true;
            }
            this.f49608f = iVar.getPosition();
        }
        this.f49610h = 3;
        return false;
    }

    private int j(ji.i iVar) {
        if (i(iVar)) {
            ci.i iVar2 = this.f49612j.f49616a;
            this.f49611i = iVar2.E;
            if (!this.f49615m) {
                this.f49604b.d(iVar2);
                this.f49615m = true;
            }
            g gVar = this.f49612j.f49617b;
            if (gVar != null) {
                this.f49606d = gVar;
            } else if (iVar.getLength() == -1) {
                this.f49606d = new c();
            } else {
                f b11 = this.f49603a.b();
                this.f49606d = new ri.a(this, this.f49608f, iVar.getLength(), b11.f49597e + b11.f49598f, b11.f49595c, (b11.f49594b & 4) != 0);
            }
            this.f49610h = 2;
            this.f49603a.f();
            return 0;
        }
        return -1;
    }

    private int k(ji.i iVar, u uVar) {
        long a11 = this.f49606d.a(iVar);
        if (a11 >= 0) {
            uVar.f33770a = a11;
            return 1;
        }
        if (a11 < -1) {
            e(-(a11 + 2));
        }
        if (!this.f49614l) {
            this.f49605c.p((v) ak.a.h(this.f49606d.b()));
            this.f49614l = true;
        }
        if (this.f49613k <= 0 && !this.f49603a.d(iVar)) {
            this.f49610h = 3;
            return -1;
        }
        this.f49613k = 0L;
        ak.v c11 = this.f49603a.c();
        long f11 = f(c11);
        if (f11 >= 0) {
            long j11 = this.f49609g;
            if (j11 + f11 >= this.f49607e) {
                long b11 = b(j11);
                this.f49604b.e(c11, c11.f());
                this.f49604b.f(b11, 1, c11.f(), 0, null);
                this.f49607e = -1L;
            }
        }
        this.f49609g += f11;
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long b(long j11) {
        return (j11 * 1000000) / this.f49611i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public long c(long j11) {
        return (this.f49611i * j11) / 1000000;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(ji.j jVar, x xVar) {
        this.f49605c = jVar;
        this.f49604b = xVar;
        l(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void e(long j11) {
        this.f49609g = j11;
    }

    protected abstract long f(ak.v vVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int g(ji.i iVar, u uVar) {
        a();
        int i11 = this.f49610h;
        if (i11 != 0) {
            if (i11 == 1) {
                iVar.k((int) this.f49608f);
                this.f49610h = 2;
                return 0;
            } else if (i11 == 2) {
                k0.j(this.f49606d);
                return k(iVar, uVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return j(iVar);
    }

    protected abstract boolean h(ak.v vVar, long j11, b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(boolean z11) {
        if (z11) {
            this.f49612j = new b();
            this.f49608f = 0L;
            this.f49610h = 0;
        } else {
            this.f49610h = 1;
        }
        this.f49607e = -1L;
        this.f49609g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m(long j11, long j12) {
        this.f49603a.e();
        if (j11 == 0) {
            l(!this.f49614l);
        } else if (this.f49610h != 0) {
            this.f49607e = c(j12);
            ((g) k0.j(this.f49606d)).c(this.f49607e);
            this.f49610h = 2;
        }
    }
}