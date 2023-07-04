package m1;

import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: e  reason: collision with root package name */
    private final h00.l<Object, vz.b0> f38184e;

    /* renamed from: f  reason: collision with root package name */
    private int f38185f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i11, j invalid, h00.l<Object, vz.b0> lVar) {
        super(i11, invalid, null);
        kotlin.jvm.internal.s.g(invalid, "invalid");
        this.f38184e = lVar;
        this.f38185f = 1;
    }

    @Override // m1.h
    public void b() {
        if (c()) {
            return;
        }
        k(this);
        super.b();
    }

    @Override // m1.h
    public h00.l<Object, vz.b0> f() {
        return this.f38184e;
    }

    @Override // m1.h
    public boolean g() {
        return true;
    }

    @Override // m1.h
    public h00.l<Object, vz.b0> h() {
        return null;
    }

    @Override // m1.h
    public void j(h snapshot) {
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        this.f38185f++;
    }

    @Override // m1.h
    public void k(h snapshot) {
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        int i11 = this.f38185f - 1;
        this.f38185f = i11;
        if (i11 == 0) {
            a();
        }
    }

    @Override // m1.h
    public void l() {
    }

    @Override // m1.h
    public void m(b0 state) {
        kotlin.jvm.internal.s.g(state, "state");
        l.M();
        throw new KotlinNothingValueException();
    }

    @Override // m1.h
    public h r(h00.l<Object, vz.b0> lVar) {
        l.S(this);
        return new e(d(), e(), lVar, this);
    }
}