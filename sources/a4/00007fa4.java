package kotlinx.coroutines.flow;

import com.google.android.vending.expansion.downloader.impl.DownloaderService;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class i0<T> extends y20.a<k0> implements u<T>, y20.n<T>, y20.n {
    private volatile /* synthetic */ Object _state;

    /* renamed from: e  reason: collision with root package name */
    private int f35272e;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {386, 398, DownloaderService.STATUS_FORBIDDEN}, m = "collect")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f35273a;

        /* renamed from: b  reason: collision with root package name */
        Object f35274b;

        /* renamed from: c  reason: collision with root package name */
        Object f35275c;

        /* renamed from: d  reason: collision with root package name */
        Object f35276d;

        /* renamed from: e  reason: collision with root package name */
        Object f35277e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f35278f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ i0<T> f35279g;

        /* renamed from: h  reason: collision with root package name */
        int f35280h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(i0<T> i0Var, zz.d<? super a> dVar) {
            super(dVar);
            this.f35279g = i0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35278f = obj;
            this.f35280h |= Integer.MIN_VALUE;
            return this.f35279g.collect(null, this);
        }
    }

    public i0(Object obj) {
        this._state = obj;
    }

    private final boolean o(Object obj, Object obj2) {
        int i11;
        k0[] l11;
        l();
        synchronized (this) {
            Object obj3 = this._state;
            if (obj != null && !kotlin.jvm.internal.s.c(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.s.c(obj3, obj2)) {
                return true;
            }
            this._state = obj2;
            int i12 = this.f35272e;
            if ((i12 & 1) == 0) {
                int i13 = i12 + 1;
                this.f35272e = i13;
                k0[] l12 = l();
                vz.b0 b0Var = vz.b0.f54756a;
                while (true) {
                    k0[] k0VarArr = l12;
                    if (k0VarArr != null) {
                        int length = k0VarArr.length;
                        int i14 = 0;
                        while (i14 < length) {
                            k0 k0Var = k0VarArr[i14];
                            i14++;
                            if (k0Var != null) {
                                k0Var.f();
                            }
                        }
                    }
                    synchronized (this) {
                        i11 = this.f35272e;
                        if (i11 == i13) {
                            this.f35272e = i13 + 1;
                            return true;
                        }
                        l11 = l();
                        vz.b0 b0Var2 = vz.b0.f54756a;
                    }
                    l12 = l11;
                    i13 = i11;
                }
            } else {
                this.f35272e = i12 + 2;
                return true;
            }
        }
    }

    @Override // y20.n
    public e<T> a(zz.g gVar, int i11, kotlinx.coroutines.channels.a aVar) {
        return j0.d(this, gVar, i11, aVar);
    }

    @Override // kotlinx.coroutines.flow.t
    public boolean b(T t11) {
        setValue(t11);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
        if (kotlin.jvm.internal.s.c(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d7 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x003e, B:34:0x00a6, B:39:0x00b0, B:49:0x00d1, B:51:0x00d7, B:41:0x00b6, B:45:0x00bd, B:37:0x00ab, B:19:0x005c, B:22:0x006f, B:33:0x0097), top: B:58:0x0024 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2, types: [y20.c] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00d5 -> B:34:0x00a6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00e7 -> B:34:0x00a6). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.y, kotlinx.coroutines.flow.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.f<? super T> r11, zz.d<?> r12) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.i0.collect(kotlinx.coroutines.flow.f, zz.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.u
    public boolean compareAndSet(T t11, T t12) {
        if (t11 == null) {
            t11 = (T) y20.q.f59054a;
        }
        if (t12 == null) {
            t12 = (T) y20.q.f59054a;
        }
        return o(t11, t12);
    }

    @Override // kotlinx.coroutines.flow.t
    public void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.t, kotlinx.coroutines.flow.f
    public Object emit(T t11, zz.d<? super vz.b0> dVar) {
        setValue(t11);
        return vz.b0.f54756a;
    }

    @Override // kotlinx.coroutines.flow.u, kotlinx.coroutines.flow.h0
    public T getValue() {
        kotlinx.coroutines.internal.f0 f0Var = y20.q.f59054a;
        T t11 = (T) this._state;
        if (t11 == f0Var) {
            return null;
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y20.a
    /* renamed from: m */
    public k0 h() {
        return new k0();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y20.a
    /* renamed from: n */
    public k0[] i(int i11) {
        return new k0[i11];
    }

    @Override // kotlinx.coroutines.flow.u
    public void setValue(T t11) {
        if (t11 == null) {
            t11 = (T) y20.q.f59054a;
        }
        o(null, t11);
    }
}