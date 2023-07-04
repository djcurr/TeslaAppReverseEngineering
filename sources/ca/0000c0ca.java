package y0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class n0 extends e1<o0> {

    /* renamed from: r  reason: collision with root package name */
    public static final a f58483r = new a(null);

    /* renamed from: q  reason: collision with root package name */
    private final c2.a f58484q;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: y0.n0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C1333a extends kotlin.jvm.internal.u implements h00.p<l1.k, n0, o0> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1333a f58485a = new C1333a();

            C1333a() {
                super(2);
            }

            @Override // h00.p
            /* renamed from: a */
            public final o0 invoke(l1.k Saver, n0 it2) {
                kotlin.jvm.internal.s.g(Saver, "$this$Saver");
                kotlin.jvm.internal.s.g(it2, "it");
                return it2.o();
            }
        }

        /* loaded from: classes.dex */
        static final class b extends kotlin.jvm.internal.u implements h00.l<o0, n0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ l0.i<Float> f58486a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ h00.l<o0, Boolean> f58487b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(l0.i<Float> iVar, h00.l<? super o0, Boolean> lVar) {
                super(1);
                this.f58486a = iVar;
                this.f58487b = lVar;
            }

            @Override // h00.l
            /* renamed from: a */
            public final n0 invoke(o0 it2) {
                kotlin.jvm.internal.s.g(it2, "it");
                return new n0(it2, this.f58486a, this.f58487b);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l1.i<n0, ?> a(l0.i<Float> animationSpec, h00.l<? super o0, Boolean> confirmStateChange) {
            kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
            kotlin.jvm.internal.s.g(confirmStateChange, "confirmStateChange");
            return l1.j.a(C1333a.f58485a, new b(animationSpec, confirmStateChange));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(o0 initialValue, l0.i<Float> animationSpec, h00.l<? super o0, Boolean> confirmStateChange) {
        super(initialValue, animationSpec, confirmStateChange);
        kotlin.jvm.internal.s.g(initialValue, "initialValue");
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        kotlin.jvm.internal.s.g(confirmStateChange, "confirmStateChange");
        this.f58484q = d1.f(this);
    }

    public final Object K(zz.d<? super vz.b0> dVar) {
        Object d11;
        Object j11 = e1.j(this, o0.Expanded, null, dVar, 2, null);
        d11 = a00.d.d();
        return j11 == d11 ? j11 : vz.b0.f54756a;
    }

    public final c2.a L() {
        return this.f58484q;
    }

    public final Object M(zz.d<? super vz.b0> dVar) {
        Object d11;
        if (!O()) {
            return vz.b0.f54756a;
        }
        Object j11 = e1.j(this, o0.HalfExpanded, null, dVar, 2, null);
        d11 = a00.d.d();
        return j11 == d11 ? j11 : vz.b0.f54756a;
    }

    public final Object N(zz.d<? super vz.b0> dVar) {
        Object d11;
        Object j11 = e1.j(this, o0.Hidden, null, dVar, 2, null);
        d11 = a00.d.d();
        return j11 == d11 ? j11 : vz.b0.f54756a;
    }

    public final boolean O() {
        return l().values().contains(o0.HalfExpanded);
    }

    public final boolean P() {
        return o() != o0.Hidden;
    }

    public final Object Q(zz.d<? super vz.b0> dVar) {
        Object d11;
        Object j11 = e1.j(this, O() ? o0.HalfExpanded : o0.Expanded, null, dVar, 2, null);
        d11 = a00.d.d();
        return j11 == d11 ? j11 : vz.b0.f54756a;
    }
}