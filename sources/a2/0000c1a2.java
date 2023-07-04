package y20;

import v20.d2;
import vz.b0;
import zz.g;

/* loaded from: classes5.dex */
public final class r<T> extends kotlin.coroutines.jvm.internal.d implements kotlinx.coroutines.flow.f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final kotlinx.coroutines.flow.f<T> f59056a;

    /* renamed from: b  reason: collision with root package name */
    public final zz.g f59057b;

    /* renamed from: c  reason: collision with root package name */
    public final int f59058c;

    /* renamed from: d  reason: collision with root package name */
    private zz.g f59059d;

    /* renamed from: e  reason: collision with root package name */
    private zz.d<? super b0> f59060e;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<Integer, g.b, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f59061a = new a();

        a() {
            super(2);
        }

        public final Integer a(int i11, g.b bVar) {
            return Integer.valueOf(i11 + 1);
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public r(kotlinx.coroutines.flow.f<? super T> fVar, zz.g gVar) {
        super(o.f59051a, zz.h.f61280a);
        this.f59056a = fVar;
        this.f59057b = gVar;
        this.f59058c = ((Number) gVar.fold(0, a.f59061a)).intValue();
    }

    private final void e(zz.g gVar, zz.g gVar2, T t11) {
        if (gVar2 instanceof j) {
            g((j) gVar2, t11);
        }
        t.a(this, gVar);
    }

    private final Object f(zz.d<? super b0> dVar, T t11) {
        Object d11;
        zz.g context = dVar.getContext();
        d2.m(context);
        zz.g gVar = this.f59059d;
        if (gVar != context) {
            e(context, gVar, t11);
            this.f59059d = context;
        }
        this.f59060e = dVar;
        Object invoke = s.a().invoke(this.f59056a, t11, this);
        d11 = a00.d.d();
        if (!kotlin.jvm.internal.s.c(invoke, d11)) {
            this.f59060e = null;
        }
        return invoke;
    }

    private final void g(j jVar, Object obj) {
        String f11;
        f11 = kotlin.text.o.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + jVar.f59049a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(f11.toString());
    }

    @Override // kotlinx.coroutines.flow.f
    public Object emit(T t11, zz.d<? super b0> dVar) {
        Object d11;
        Object d12;
        try {
            Object f11 = f(dVar, t11);
            d11 = a00.d.d();
            if (f11 == d11) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            d12 = a00.d.d();
            return f11 == d12 ? f11 : b0.f54756a;
        } catch (Throwable th2) {
            this.f59059d = new j(th2, dVar.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        zz.d<? super b0> dVar = this.f59060e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, zz.d
    public zz.g getContext() {
        zz.g gVar = this.f59059d;
        return gVar == null ? zz.h.f61280a : gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public Object invokeSuspend(Object obj) {
        Object d11;
        Throwable e11 = vz.q.e(obj);
        if (e11 != null) {
            this.f59059d = new j(e11, getContext());
        }
        zz.d<? super b0> dVar = this.f59060e;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        d11 = a00.d.d();
        return d11;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}