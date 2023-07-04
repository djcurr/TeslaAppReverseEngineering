package j$.time.format;

import j$.time.temporal.x;

/* loaded from: classes7.dex */
class p implements j$.time.temporal.k {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.b f32924a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ j$.time.temporal.k f32925b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.f f32926c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ j$.time.k f32927d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(j$.time.chrono.b bVar, j$.time.temporal.k kVar, j$.time.chrono.f fVar, j$.time.k kVar2) {
        this.f32924a = bVar;
        this.f32925b = kVar;
        this.f32926c = fVar;
        this.f32927d = kVar2;
    }

    @Override // j$.time.temporal.k
    public boolean c(j$.time.temporal.l lVar) {
        return (this.f32924a == null || !lVar.e()) ? this.f32925b.c(lVar) : ((j$.time.f) this.f32924a).c(lVar);
    }

    @Override // j$.time.temporal.k
    public Object d(j$.time.temporal.u uVar) {
        int i11 = j$.time.temporal.t.f32969a;
        return uVar == j$.time.temporal.n.f32963a ? this.f32926c : uVar == j$.time.temporal.m.f32962a ? this.f32927d : uVar == j$.time.temporal.o.f32964a ? this.f32925b.d(uVar) : uVar.a(this);
    }

    @Override // j$.time.temporal.k
    public long e(j$.time.temporal.l lVar) {
        return (this.f32924a == null || !lVar.e()) ? this.f32925b.e(lVar) : ((j$.time.f) this.f32924a).e(lVar);
    }

    @Override // j$.time.temporal.k
    public x g(j$.time.temporal.l lVar) {
        return (this.f32924a == null || !lVar.e()) ? this.f32925b.g(lVar) : ((j$.time.f) this.f32924a).g(lVar);
    }
}