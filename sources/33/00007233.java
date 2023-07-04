package h2;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class y extends h2.b<g2.b> implements g2.e {
    private static final h00.l<y, vz.b0> K;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<y, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f28770a = new a();

        a() {
            super(1);
        }

        public final void a(y node) {
            kotlin.jvm.internal.s.g(node, "node");
            node.k2();
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(y yVar) {
            a(yVar);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.a<vz.b0> {
        c() {
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
            y.this.a2().n0(y.this);
        }
    }

    static {
        new b(null);
        K = a.f28770a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(o wrapped, g2.b modifier) {
        super(wrapped, modifier);
        kotlin.jvm.internal.s.g(wrapped, "wrapped");
        kotlin.jvm.internal.s.g(modifier, "modifier");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k2() {
        if (h()) {
            n.a(n1()).getSnapshotObserver().e(this, K, new c());
        }
    }

    @Override // h2.o
    public void J1() {
        super.J1();
        k2();
    }

    @Override // h2.o
    public void N0() {
        super.N0();
        k2();
    }

    @Override // g2.e
    public <T> T g0(g2.a<T> aVar) {
        kotlin.jvm.internal.s.g(aVar, "<this>");
        return (T) K1(aVar);
    }
}