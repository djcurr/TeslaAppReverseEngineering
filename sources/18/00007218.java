package h2;

/* loaded from: classes.dex */
public final class k0 extends b<f2.i0> {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            k0.this.a2().o(k0.this.y0());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o wrapped, f2.i0 modifier) {
        super(wrapped, modifier);
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(modifier, "modifier");
    }

    @Override // h2.b, f2.y
    public f2.m0 X(long j11) {
        h0 snapshotObserver;
        f2.m0 X = super.X(j11);
        a aVar = new a();
        f0 d02 = n1().d0();
        vz.b0 b0Var = null;
        if (d02 != null && (snapshotObserver = d02.getSnapshotObserver()) != null) {
            snapshotObserver.h(aVar);
            b0Var = vz.b0.f54756a;
        }
        if (b0Var == null) {
            aVar.mo11invoke();
        }
        return X;
    }
}