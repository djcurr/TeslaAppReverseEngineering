package c1;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class p1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$1", f = "ProduceState.kt", l = {86}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f8644a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f8645b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<u0<T>, zz.d<? super vz.b0>, Object> f8646c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o0<T> f8647d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(h00.p<? super u0<T>, ? super zz.d<? super vz.b0>, ? extends Object> pVar, o0<T> o0Var, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f8646c = pVar;
            this.f8647d = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f8646c, this.f8647d, dVar);
            aVar.f8645b = obj;
            return aVar;
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f8644a;
            if (i11 == 0) {
                vz.r.b(obj);
                h00.p<u0<T>, zz.d<? super vz.b0>, Object> pVar = this.f8646c;
                v0 v0Var = new v0(this.f8647d, ((v20.o0) this.f8645b).J());
                this.f8644a = 1;
                if (pVar.invoke(v0Var, this) == d11) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$3", f = "ProduceState.kt", l = {153}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f8648a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f8649b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<u0<T>, zz.d<? super vz.b0>, Object> f8650c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ o0<T> f8651d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(h00.p<? super u0<T>, ? super zz.d<? super vz.b0>, ? extends Object> pVar, o0<T> o0Var, zz.d<? super b> dVar) {
            super(2, dVar);
            this.f8650c = pVar;
            this.f8651d = o0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(this.f8650c, this.f8651d, dVar);
            bVar.f8649b = obj;
            return bVar;
        }

        @Override // h00.p
        public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f8648a;
            if (i11 == 0) {
                vz.r.b(obj);
                h00.p<u0<T>, zz.d<? super vz.b0>, Object> pVar = this.f8650c;
                v0 v0Var = new v0(this.f8651d, ((v20.o0) this.f8649b).J());
                this.f8648a = 1;
                if (pVar.invoke(v0Var, this) == d11) {
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

    public static final <T> v1<T> a(T t11, h00.p<? super u0<T>, ? super zz.d<? super vz.b0>, ? extends Object> producer, i iVar, int i11) {
        kotlin.jvm.internal.s.g(producer, "producer");
        iVar.x(-1870533674);
        iVar.x(-3687241);
        Object y11 = iVar.y();
        if (y11 == i.f8486a.a()) {
            y11 = s1.d(t11, null, 2, null);
            iVar.p(y11);
        }
        iVar.N();
        o0 o0Var = (o0) y11;
        b0.d(vz.b0.f54756a, new a(producer, o0Var, null), iVar, 0);
        iVar.N();
        return o0Var;
    }

    public static final <T> v1<T> b(T t11, Object obj, Object obj2, h00.p<? super u0<T>, ? super zz.d<? super vz.b0>, ? extends Object> producer, i iVar, int i11) {
        kotlin.jvm.internal.s.g(producer, "producer");
        iVar.x(-1870531010);
        iVar.x(-3687241);
        Object y11 = iVar.y();
        if (y11 == i.f8486a.a()) {
            y11 = s1.d(t11, null, 2, null);
            iVar.p(y11);
        }
        iVar.N();
        o0 o0Var = (o0) y11;
        b0.e(obj, obj2, new b(producer, o0Var, null), iVar, 72);
        iVar.N();
        return o0Var;
    }
}