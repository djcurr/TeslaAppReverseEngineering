package ni;

import ji.j;
import ji.v;
import ji.w;
import ji.x;

/* loaded from: classes3.dex */
public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    private final long f41679a;

    /* renamed from: b  reason: collision with root package name */
    private final j f41680b;

    /* loaded from: classes3.dex */
    class a implements v {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f41681a;

        a(v vVar) {
            this.f41681a = vVar;
        }

        @Override // ji.v
        public v.a f(long j11) {
            v.a f11 = this.f41681a.f(j11);
            w wVar = f11.f33771a;
            w wVar2 = new w(wVar.f33776a, wVar.f33777b + d.this.f41679a);
            w wVar3 = f11.f33772b;
            return new v.a(wVar2, new w(wVar3.f33776a, wVar3.f33777b + d.this.f41679a));
        }

        @Override // ji.v
        public boolean h() {
            return this.f41681a.h();
        }

        @Override // ji.v
        public long i() {
            return this.f41681a.i();
        }
    }

    public d(long j11, j jVar) {
        this.f41679a = j11;
        this.f41680b = jVar;
    }

    @Override // ji.j
    public x f(int i11, int i12) {
        return this.f41680b.f(i11, i12);
    }

    @Override // ji.j
    public void p(v vVar) {
        this.f41680b.p(new a(vVar));
    }

    @Override // ji.j
    public void s() {
        this.f41680b.s();
    }
}