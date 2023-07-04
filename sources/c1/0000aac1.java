package pi;

import ak.k0;
import ak.p;
import ji.v;
import ji.w;

/* loaded from: classes3.dex */
final class b implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f46538a;

    /* renamed from: b  reason: collision with root package name */
    private final p f46539b;

    /* renamed from: c  reason: collision with root package name */
    private final p f46540c;

    /* renamed from: d  reason: collision with root package name */
    private long f46541d;

    public b(long j11, long j12, long j13) {
        this.f46541d = j11;
        this.f46538a = j13;
        p pVar = new p();
        this.f46539b = pVar;
        p pVar2 = new p();
        this.f46540c = pVar2;
        pVar.a(0L);
        pVar2.a(j12);
    }

    public boolean a(long j11) {
        p pVar = this.f46539b;
        return j11 - pVar.b(pVar.c() - 1) < 100000;
    }

    public void b(long j11, long j12) {
        if (a(j11)) {
            return;
        }
        this.f46539b.a(j11);
        this.f46540c.a(j12);
    }

    @Override // pi.g
    public long c(long j11) {
        return this.f46539b.b(k0.f(this.f46540c, j11, true, true));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(long j11) {
        this.f46541d = j11;
    }

    @Override // ji.v
    public v.a f(long j11) {
        int f11 = k0.f(this.f46539b, j11, true, true);
        w wVar = new w(this.f46539b.b(f11), this.f46540c.b(f11));
        if (wVar.f33776a != j11 && f11 != this.f46539b.c() - 1) {
            int i11 = f11 + 1;
            return new v.a(wVar, new w(this.f46539b.b(i11), this.f46540c.b(i11)));
        }
        return new v.a(wVar);
    }

    @Override // pi.g
    public long g() {
        return this.f46538a;
    }

    @Override // ji.v
    public boolean h() {
        return true;
    }

    @Override // ji.v
    public long i() {
        return this.f46541d;
    }
}