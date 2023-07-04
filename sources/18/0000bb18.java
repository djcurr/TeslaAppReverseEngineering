package w0;

/* loaded from: classes.dex */
public final class i0 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$longPressDragGestureFilter$1", f = "TextFieldGestureModifiers.kt", l = {35}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f55066a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f55067b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e0 f55068c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e0 e0Var, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f55068c = e0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f55068c, dVar);
            aVar.f55067b = obj;
            return aVar;
        }

        @Override // h00.p
        public final Object invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f55066a;
            if (i11 == 0) {
                vz.r.b(obj);
                e0 e0Var = this.f55068c;
                this.f55066a = 1;
                if (w.a((d2.c0) this.f55067b, e0Var, this) == d11) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.TextFieldGestureModifiersKt$mouseDragGestureDetector$1", f = "TextFieldGestureModifiers.kt", l = {56}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<d2.c0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f55069a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f55070b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x0.g f55071c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(x0.g gVar, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f55071c = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f55071c, dVar);
            bVar.f55070b = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(d2.c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f55069a;
            if (i11 == 0) {
                vz.r.b(obj);
                x0.g gVar = this.f55071c;
                this.f55069a = 1;
                if (x0.a0.c((d2.c0) this.f55070b, gVar, this) == d11) {
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

    public static final o1.f a(o1.f fVar, e0 observer, boolean z11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(observer, "observer");
        return z11 ? d2.i0.b(fVar, observer, new a(observer, null)) : fVar;
    }

    public static final o1.f b(o1.f fVar, x0.g observer, boolean z11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(observer, "observer");
        return z11 ? d2.i0.b(o1.f.f42062f1, observer, new b(observer, null)) : fVar;
    }

    public static final o1.f c(o1.f fVar, boolean z11, r1.s focusRequester, o0.m mVar, h00.l<? super r1.w, vz.b0> onFocusChanged) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        kotlin.jvm.internal.s.g(focusRequester, "focusRequester");
        kotlin.jvm.internal.s.g(onFocusChanged, "onFocusChanged");
        return m0.m.a(r1.b.a(r1.v.a(fVar, focusRequester), onFocusChanged), z11, mVar);
    }
}