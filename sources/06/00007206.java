package h2;

/* loaded from: classes.dex */
public final class i0 extends b<d2.b0> {

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<Boolean, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f28680b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f<d2.a0> f28681c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f28682d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, f<d2.a0> fVar, boolean z11) {
            super(1);
            this.f28680b = j11;
            this.f28681c = fVar;
            this.f28682d = z11;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return vz.b0.f54756a;
        }

        public final void invoke(boolean z11) {
            i0.this.k2(this.f28680b, this.f28681c, this.f28682d, z11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(o wrapped, d2.b0 modifier) {
        super(wrapped, modifier);
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(modifier, "modifier");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2(long j11, f<d2.a0> fVar, boolean z11, boolean z12) {
        v1().y1(v1().g1(j11), fVar, z11, z12);
    }

    @Override // h2.b, h2.o
    public void G1() {
        super.G1();
        a2().Y().y0(this);
    }

    @Override // h2.b, h2.o
    public boolean V1() {
        return a2().Y().u0() || v1().V1();
    }

    @Override // h2.b, h2.o
    public void y1(long j11, f<d2.a0> hitTestResult, boolean z11, boolean z12) {
        kotlin.jvm.internal.s.g(hitTestResult, "hitTestResult");
        c2(j11, hitTestResult, a2().Y().a(), z11, z12, a2().Y(), new a(j11, hitTestResult, z11));
    }
}