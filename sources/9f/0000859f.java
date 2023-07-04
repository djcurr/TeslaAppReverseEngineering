package m1;

import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public final class e extends h {

    /* renamed from: e  reason: collision with root package name */
    private final h f38177e;

    /* renamed from: f  reason: collision with root package name */
    private final h00.l<Object, vz.b0> f38178f;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<Object, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.l<Object, vz.b0> f38179a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.l<Object, vz.b0> f38180b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h00.l<Object, vz.b0> lVar, h00.l<Object, vz.b0> lVar2) {
            super(1);
            this.f38179a = lVar;
            this.f38180b = lVar2;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Object obj) {
            invoke2(obj);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(Object state) {
            kotlin.jvm.internal.s.g(state, "state");
            this.f38179a.invoke(state);
            this.f38180b.invoke(state);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(int i11, j invalid, h00.l<Object, vz.b0> lVar, h parent) {
        super(i11, invalid, null);
        kotlin.jvm.internal.s.g(invalid, "invalid");
        kotlin.jvm.internal.s.g(parent, "parent");
        h00.l<Object, vz.b0> lVar2 = null;
        this.f38177e = parent;
        parent.j(this);
        if (lVar != null) {
            h00.l<Object, vz.b0> f11 = t().f();
            lVar2 = f11 != null ? new a(lVar, f11) : lVar;
        }
        this.f38178f = lVar2 == null ? parent.f() : lVar2;
    }

    @Override // m1.h
    public void b() {
        if (c()) {
            return;
        }
        if (d() != this.f38177e.d()) {
            a();
        }
        this.f38177e.k(this);
        super.b();
    }

    @Override // m1.h
    public h00.l<Object, vz.b0> f() {
        return this.f38178f;
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
    public void l() {
    }

    public final h t() {
        return this.f38177e;
    }

    @Override // m1.h
    /* renamed from: u */
    public Void j(h snapshot) {
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // m1.h
    /* renamed from: v */
    public Void k(h snapshot) {
        kotlin.jvm.internal.s.g(snapshot, "snapshot");
        u.b();
        throw new KotlinNothingValueException();
    }

    @Override // m1.h
    /* renamed from: w */
    public Void m(b0 state) {
        kotlin.jvm.internal.s.g(state, "state");
        l.M();
        throw new KotlinNothingValueException();
    }

    @Override // m1.h
    /* renamed from: x */
    public e r(h00.l<Object, vz.b0> lVar) {
        return new e(d(), e(), lVar, this.f38177e);
    }
}