package n0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r implements x, w {

    /* renamed from: a  reason: collision with root package name */
    private final n f40114a;

    /* renamed from: b  reason: collision with root package name */
    private l f40115b;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.IgnorePointerDraggableState$drag$2", f = "Draggable.kt", l = {472}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<l, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f40116a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f40117b;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<w, zz.d<? super vz.b0>, Object> f40119d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.p<? super w, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f40119d = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f40119d, dVar);
            aVar.f40117b = obj;
            return aVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object invoke(l lVar, zz.d<? super vz.b0> dVar) {
            return ((a) create(lVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f40116a;
            if (i11 == 0) {
                vz.r.b(obj);
                r.this.d((l) this.f40117b);
                h00.p<w, zz.d<? super vz.b0>, Object> pVar = this.f40119d;
                r rVar = r.this;
                this.f40116a = 1;
                if (pVar.invoke(rVar, this) == d11) {
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

    public r(n origin) {
        kotlin.jvm.internal.s.g(origin, "origin");
        this.f40114a = origin;
    }

    @Override // n0.x
    public Object a(m0.v vVar, h00.p<? super w, ? super zz.d<? super vz.b0>, ? extends Object> pVar, zz.d<? super vz.b0> dVar) {
        Object d11;
        Object a11 = c().a(vVar, new a(pVar, null), dVar);
        d11 = a00.d.d();
        return a11 == d11 ? a11 : vz.b0.f54756a;
    }

    @Override // n0.w
    public void b(float f11, long j11) {
        l lVar = this.f40115b;
        if (lVar == null) {
            return;
        }
        lVar.a(f11);
    }

    public final n c() {
        return this.f40114a;
    }

    public final void d(l lVar) {
        this.f40115b = lVar;
    }
}