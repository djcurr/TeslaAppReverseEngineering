package nj;

import java.util.List;

/* loaded from: classes3.dex */
public abstract class j extends fi.f implements f {

    /* renamed from: c  reason: collision with root package name */
    private f f41728c;

    /* renamed from: d  reason: collision with root package name */
    private long f41729d;

    @Override // nj.f
    public int a(long j11) {
        return ((f) ak.a.e(this.f41728c)).a(j11 - this.f41729d);
    }

    @Override // nj.f
    public List<b> b(long j11) {
        return ((f) ak.a.e(this.f41728c)).b(j11 - this.f41729d);
    }

    @Override // nj.f
    public long c(int i11) {
        return ((f) ak.a.e(this.f41728c)).c(i11) + this.f41729d;
    }

    @Override // nj.f
    public int d() {
        return ((f) ak.a.e(this.f41728c)).d();
    }

    @Override // fi.a
    public void f() {
        super.f();
        this.f41728c = null;
    }

    public void r(long j11, f fVar, long j12) {
        this.f26274b = j11;
        this.f41728c = fVar;
        if (j12 != Long.MAX_VALUE) {
            j11 = j12;
        }
        this.f41729d = j11;
    }
}