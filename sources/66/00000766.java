package androidx.lifecycle;

/* loaded from: classes.dex */
public final class l {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {98, 102, 103}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class a<T> extends kotlin.coroutines.jvm.internal.l implements h00.p<kotlinx.coroutines.flow.f<? super T>, zz.d<? super vz.b0>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f5161a;

        /* renamed from: b  reason: collision with root package name */
        Object f5162b;

        /* renamed from: c  reason: collision with root package name */
        int f5163c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f5164d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ LiveData<T> f5165e;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0087a extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f5166a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LiveData<T> f5167b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ g0<T> f5168c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0087a(LiveData<T> liveData, g0<T> g0Var, zz.d<? super C0087a> dVar) {
                super(2, dVar);
                this.f5167b = liveData;
                this.f5168c = g0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new C0087a(this.f5167b, this.f5168c, dVar);
            }

            @Override // h00.p
            public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((C0087a) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.f5166a == 0) {
                    vz.r.b(obj);
                    this.f5167b.observeForever(this.f5168c);
                    return vz.b0.f54756a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f5169a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ LiveData<T> f5170b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ g0<T> f5171c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(LiveData<T> liveData, g0<T> g0Var, zz.d<? super b> dVar) {
                super(2, dVar);
                this.f5170b = liveData;
                this.f5171c = g0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
                return new b(this.f5170b, this.f5171c, dVar);
            }

            @Override // h00.p
            public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
                return ((b) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                a00.d.d();
                if (this.f5169a == 0) {
                    vz.r.b(obj);
                    this.f5170b.removeObserver(this.f5171c);
                    return vz.b0.f54756a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class c<T> implements g0 {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ x20.e<T> f5172a;

            c(x20.e<T> eVar) {
                this.f5172a = eVar;
            }

            @Override // androidx.lifecycle.g0
            public final void onChanged(T t11) {
                this.f5172a.d(t11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(LiveData<T> liveData, zz.d<? super a> dVar) {
            super(2, dVar);
            this.f5165e = liveData;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            a aVar = new a(this.f5165e, dVar);
            aVar.f5164d = obj;
            return aVar;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, zz.d<? super vz.b0> dVar) {
            return invoke((kotlinx.coroutines.flow.f) ((kotlinx.coroutines.flow.f) obj), dVar);
        }

        public final Object invoke(kotlinx.coroutines.flow.f<? super T> fVar, zz.d<? super vz.b0> dVar) {
            return ((a) create(fVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(7:1|(4:(1:(2:35|(1:(7:38|39|40|8|9|10|(1:12)(4:14|15|16|(2:18|(1:20)(4:21|9|10|(0)(0)))(2:22|23)))(2:41|42))(6:43|44|45|15|16|(0)(0)))(1:4))(2:47|(1:49)(1:50))|9|10|(0)(0))|5|6|7|8|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00dd, code lost:
            r15 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x00de, code lost:
            r4 = r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0099 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a7 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #0 {all -> 0x00d8, blocks: (B:29:0x009f, B:31:0x00a7), top: B:45:0x009f }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v12 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4, types: [androidx.lifecycle.g0] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ba -> B:47:0x008b). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 249
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.l.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> kotlinx.coroutines.flow.e<T> a(LiveData<T> liveData) {
        kotlin.jvm.internal.s.g(liveData, "<this>");
        return kotlinx.coroutines.flow.g.v(new a(liveData, null));
    }
}