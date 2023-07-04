package ak;

/* loaded from: classes3.dex */
public final class c0 implements q {

    /* renamed from: a  reason: collision with root package name */
    private final b f448a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f449b;

    /* renamed from: c  reason: collision with root package name */
    private long f450c;

    /* renamed from: d  reason: collision with root package name */
    private long f451d;

    /* renamed from: e  reason: collision with root package name */
    private ci.l f452e = ci.l.f9244d;

    public c0(b bVar) {
        this.f448a = bVar;
    }

    public void a(long j11) {
        this.f450c = j11;
        if (this.f449b) {
            this.f451d = this.f448a.elapsedRealtime();
        }
    }

    @Override // ak.q
    public ci.l b() {
        return this.f452e;
    }

    public void c() {
        if (this.f449b) {
            return;
        }
        this.f451d = this.f448a.elapsedRealtime();
        this.f449b = true;
    }

    public void d() {
        if (this.f449b) {
            a(s());
            this.f449b = false;
        }
    }

    @Override // ak.q
    public void e(ci.l lVar) {
        if (this.f449b) {
            a(s());
        }
        this.f452e = lVar;
    }

    @Override // ak.q
    public long s() {
        long a11;
        long j11 = this.f450c;
        if (this.f449b) {
            long elapsedRealtime = this.f448a.elapsedRealtime() - this.f451d;
            ci.l lVar = this.f452e;
            if (lVar.f9245a == 1.0f) {
                a11 = ci.b.c(elapsedRealtime);
            } else {
                a11 = lVar.a(elapsedRealtime);
            }
            return j11 + a11;
        }
        return j11;
    }
}