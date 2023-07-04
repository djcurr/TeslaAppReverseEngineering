package n0;

import c1.v1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a0 implements x, w {

    /* renamed from: a  reason: collision with root package name */
    private final v1<h0> f39683a;

    /* renamed from: b  reason: collision with root package name */
    private c0 f39684b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollDraggableState$drag$2", f = "Scrollable.kt", l = {350}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f39685a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f39686b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<w, zz.d<? super vz.b0>, Object> f39688d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.p<? super w, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f39688d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f39688d, dVar);
            aVar.f39686b = obj;
            return aVar;
        }

        @Override // h00.p
        public final Object invoke(c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f39685a;
            if (i11 == 0) {
                vz.r.b(obj);
                a0.this.e((c0) this.f39686b);
                h00.p<w, zz.d<? super vz.b0>, Object> pVar = this.f39688d;
                a0 a0Var = a0.this;
                this.f39685a = 1;
                if (pVar.invoke(a0Var, this) == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return vz.b0.f54756a;
        }
    }

    public a0(v1<h0> scrollLogic) {
        c0 c0Var;
        kotlin.jvm.internal.s.g(scrollLogic, "scrollLogic");
        this.f39683a = scrollLogic;
        c0Var = e0.f39723a;
        this.f39684b = c0Var;
    }

    @Override // n0.x
    public Object a(m0.v vVar, h00.p<? super w, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object a11 = d().getValue().f().a(vVar, new a(pVar, null), dVar);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : vz.b0.f54756a;
    }

    @Override // n0.w
    public void b(float f11, long j11) {
        this.f39683a.getValue().a(c(), f11, s1.f.d(j11), c2.g.f8750a.a());
    }

    public final c0 c() {
        return this.f39684b;
    }

    public final v1<h0> d() {
        return this.f39683a;
    }

    public final void e(c0 c0Var) {
        kotlin.jvm.internal.s.g(c0Var, "<set-?>");
        this.f39684b = c0Var;
    }
}